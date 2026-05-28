package pages.utils;

import excel.DataManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.DriverManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static pages.DiaryPage.incrementYear;

public class CustomFileUtils extends CommonComponentsAndActions {
    public Map<String, String> data = DataManager.getInstance().getData();
    public CustomFileUtils(WebDriver driver) {
        super(driver);
    }

    public static File getFirstFileByPartialName(String directoryPath, String partialName) {
        File directory = new File(directoryPath);

        try {
            IOFileFilter fileFilter = new WildcardFileFilter("*" + partialName + "*");
            Collection<File> matchingFiles = FileUtils.listFiles(directory, fileFilter, null);

            if (!matchingFiles.isEmpty()) {
                return matchingFiles.iterator().next();
            } else {
                System.out.println("No matching files found in directory: " + directoryPath);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Invalid directory: " + directoryPath);
            return null;
        }
    }

    public static String getFirstFileName(String directoryPath, String partialName) {
        File directory = new File(System.getProperty("user.dir") + directoryPath);

        try {
            IOFileFilter fileFilter = new WildcardFileFilter("*" + partialName + "*");
            Collection<File> matchingFiles = FileUtils.listFiles(directory, fileFilter, null);

            if (!matchingFiles.isEmpty()) {
                File firstMatchingFile = matchingFiles.iterator().next();
                return firstMatchingFile.getName(); // This will return the full file name with extension
            } else {
                System.out.println("No matching files found in directory: " + directoryPath);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Invalid directory: " + directoryPath);
            return null;
        }
    }

    public static boolean isFileOverSize(File file, long maxSizeBytes) {
        return file != null && file.isFile() && FileUtils.sizeOf(file) > maxSizeBytes;
    }

    public static String getLatestDownloadedFileName(String directoryPath) {

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            throw new RuntimeException("Invalid directory path: " + directoryPath);
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files in the directory: " + directoryPath);
            return null;
        }

        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

        return files[0].getName();
    }

    public void downloadFileAndVerifyKeywords(String documentName, List<String> keywords) throws IOException, InterruptedException {
        String downloadLinkXPath = "//span[contains(text(),'" + documentName + "')] | //a[contains(text(),'PDF Link')]";
        WebElement downloadLink = driver.findElement(By.xpath(downloadLinkXPath));

        clickElement(downloadLink, documentName);
        pause(5000);

        if (driver.findElements(By.xpath("//div[contains(text(),'Please wait while your documents are being generated')]")).size() > 0) {
            pause(10000);
        }

        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        new File(downloadDirectory).mkdirs();

        String downloadedFileName = CustomFileUtils.getLatestDownloadedFileName(downloadDirectory);
        File downloadedFile = new File(downloadDirectory + downloadedFileName);

        if (!downloadedFile.exists() || downloadedFile.length() <= 1024) {
            infoLog("Download failed or file is too small (less than 1 KB).");
            failAssertion("Download failed or file is too small (less than 1 KB).");
            return;
        }

        String firstName = Optional.ofNullable(data.get("First Name")).orElse("");
        String lastName = Optional.ofNullable(data.get("Last_Name")).orElse("");
        String effectiveDate = incrementYear(data.get("Effective_Date"));

        List<String> trimmedKeywords;

        if (keywords.stream().anyMatch(k -> k.contains("{grandTotal") || k.contains("{Customer") || k.contains("{EffectiveDate"))) {
            Map<String, String> replacements = new HashMap<>(Map.of(
                    "{grandTotalNB}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_NB")).orElse("0"),
                    "{grandTotalEND}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_END")).orElse("0"),
                    "{grandTotalRN}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_RN")).orElse("0"),
                    "{Customer}", firstName + " " + lastName,
                    "{EffectiveDate}", effectiveDate

            ));

            if (DataManager.getInstance().getData().get("Admitted_Or_Surplus").equalsIgnoreCase("Admitted")) {
                replacements.replace("{grandTotalNB}", formatAndRoundGrandTotal(replacements.get("{grandTotalNB}")));
                replacements.replace("{grandTotalEND}", formatAndRoundGrandTotal(replacements.get("{grandTotalEND}")));
                replacements.replace("{grandTotalRN}", formatAndRoundGrandTotal(replacements.get("{grandTotalRN}")));
            }

            trimmedKeywords = keywords.stream()
                    .map(String::trim)
                    .map(keyword -> {
                        for (Map.Entry<String, String> entry : replacements.entrySet()) {
                            keyword = keyword.replace(entry.getKey(), entry.getValue()).trim();
                        }
                        return keyword;
                    })
                    .collect(Collectors.toList());
        } else {
            trimmedKeywords = keywords.stream()
                    .map(String::trim)
                    .collect(Collectors.toList());
        }
        boolean keywordsVerified = containsKeywordsInPDF(downloadedFile, trimmedKeywords);

        if (keywordsVerified) {
            successLog("All keywords verified in downloaded file: " + downloadedFileName);
        } else {
            failAssertion("Verification failed: Some keywords were not found in the document: " + documentName);
        }

        boolean fileDeleted = downloadedFile.delete();
        if (fileDeleted) {
            infoLog("File deleted successfully: " + downloadedFileName);
        } else {
            infoLog("Failed to delete the file: " + downloadedFileName);
        }
    }

    public void downloadFileAndVerifyKeywords(String documentName, int index, List<String> keywords) throws IOException, InterruptedException {
        String downloadLinkXPath = "//span[contains(text(),'" + documentName + "')]";
        List<WebElement> downloadLinks = driver.findElements(By.xpath(downloadLinkXPath));

        if (downloadLinks.isEmpty()) {
            failAssertion("No download links found for document: " + documentName);
            return;
        }

        WebElement downloadLink;
        if (index >= 0 && index < downloadLinks.size()) {
            downloadLink = downloadLinks.get(index);
            infoLog("Using download link at index: " + index);
        } else {
            downloadLink = downloadLinks.get(0); // fallback
            infoLog("Using first available download link (default).");
        }

        clickElement(downloadLink, documentName);
        pause(5000);


        if (driver.findElements(By.xpath("//div[contains(text(),'Please wait while your documents are being generated')]")).size() > 0) {
            pause(10000);
        }

        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        new File(downloadDirectory).mkdirs();

        String downloadedFileName = CustomFileUtils.getLatestDownloadedFileName(downloadDirectory);
        File downloadedFile = new File(downloadDirectory + downloadedFileName);

        if (!downloadedFile.exists() || downloadedFile.length() <= 1024) {
            infoLog("Download failed or file is too small (less than 1 KB).");
            failAssertion("Download failed or file is too small (less than 1 KB).");
            return;
        }

        List<String> trimmedKeywords;

        if (keywords.stream().anyMatch(k -> k.contains("{grandTotal"))) {
            Map<String, String> replacements = new HashMap<>(Map.of(
                    "{grandTotalNB}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_NB")).orElse("0"),
                    "{grandTotalEND}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_END")).orElse("0"),
                    "{grandTotalRN}", Optional.ofNullable(replaceDollarOrSetDefaultKeyValue("Grand_Total_RN")).orElse("0")
            ));

            if (DataManager.getInstance().getData().get("Admitted_Or_Surplus").equalsIgnoreCase("Admitted")) {
                replacements.replace("{grandTotalNB}", formatAndRoundGrandTotal(replacements.get("{grandTotalNB}")));
                replacements.replace("{grandTotalEND}", formatAndRoundGrandTotal(replacements.get("{grandTotalEND}")));
                replacements.replace("{grandTotalRN}", formatAndRoundGrandTotal(replacements.get("{grandTotalRN}")));
            }
            trimmedKeywords = keywords.stream()
                    .map(String::trim)
                    .map(keyword -> {
                        for (Map.Entry<String, String> entry : replacements.entrySet()) {
                            keyword = keyword.replace(entry.getKey(), entry.getValue()).trim();
                        }
                        return keyword;
                    })
                    .collect(Collectors.toList());
        } else {
            trimmedKeywords = keywords.stream()
                    .map(String::trim)
                    .collect(Collectors.toList());
        }
        boolean keywordsVerified = containsKeywordsInPDF(downloadedFile, trimmedKeywords);

        if (keywordsVerified) {
            successLog("All keywords verified in downloaded file: " + downloadedFileName);
        } else {
            failAssertion("Verification failed: Some keywords were not found in the document: " + documentName);
        }

        boolean fileDeleted = downloadedFile.delete();
        if (fileDeleted) {
            infoLog("File deleted successfully: " + downloadedFileName);
        } else {
            infoLog("Failed to delete the file: " + downloadedFileName);
        }
    }

    public void downloadFileAndVerifyKeywordsAndPresence(String documentName, List<List<String>> keywordTable) throws IOException, InterruptedException {
        String downloadLinkXPath = "//span[contains(text(),'" + documentName + "')]";
        WebElement downloadLink = driver.findElement(By.xpath(downloadLinkXPath));

        clickElement(downloadLink, documentName);
        pause(5000);

        if (driver.findElements(By.xpath("//div[contains(text(),'Please wait while your documents are being generated')]")).size() > 0) {
            pause(10000);
        }

        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        new File(downloadDirectory).mkdirs();

        String downloadedFileName = CustomFileUtils.getLatestDownloadedFileName(downloadDirectory);
        File downloadedFile = new File(downloadDirectory + downloadedFileName);

        if (!downloadedFile.exists() || downloadedFile.length() <= 1024) {
            infoLog("Download failed or file is too small (less than 1 KB).");
            failAssertion("Download failed or file is too small (less than 1 KB).");
            return;
        }

        List<String> keywords = keywordTable.stream().map(row -> row.get(0).trim()).collect(Collectors.toList());
        Map<String, Boolean> expectedPresenceMap = keywordTable.stream()
                .collect(Collectors.toMap(
                        row -> row.get(0).trim(),
                        row -> row.get(1).trim().equalsIgnoreCase("present")
                ));

        Map<Integer, String> textWithSorting;
        Map<Integer, String> textWithoutSorting;

        List<String> missingKeywords;

        try (PDDocument document = PDDocument.load(downloadedFile)) {
            textWithSorting = extractTextWithAlignmentFix(document, true);
            textWithoutSorting = extractTextWithAlignmentFix(document, false);

            // First attempt (with sorting)
            missingKeywords = findMissingKeywords(textWithSorting, keywords, downloadedFile);


            if (!missingKeywords.isEmpty()) {
                infoLog("Retrying keyword search without position sorting...");
                List<String> stillMissing = findMissingKeywords(textWithoutSorting, missingKeywords, downloadedFile);


                for (String keyword : keywords) {
                    boolean expectedToBePresent = expectedPresenceMap.get(keyword);
                    boolean actuallyPresent = !stillMissing.contains(keyword);

                    if (expectedToBePresent && actuallyPresent) {
                        successLog("Keyword found as expected: " + keyword);
                    } else if (!expectedToBePresent && !actuallyPresent) {
                        successLog("Keyword correctly not found: " + keyword);
                    } else if (expectedToBePresent && !actuallyPresent) {
                        failAssertion("Keyword expected to be present but not found: " + keyword);
                    } else {
                        failAssertion("Keyword expected to be absent but was found: " + keyword);
                    }
                }
            } else {
                for (String keyword : keywords) {
                    if (expectedPresenceMap.get(keyword)) {
                        successLog("Keyword found as expected: " + keyword);
                    } else {
                        failAssertion("Keyword expected to be absent but was found: " + keyword);
                    }
                }
            }
        }

        boolean fileDeleted = downloadedFile.delete();
        if (fileDeleted) {
            infoLog("File deleted successfully: " + downloadedFileName);
        } else {
            infoLog("Failed to delete the file: " + downloadedFileName);
        }
    }


    private Map<Integer, String> extractTextWithAlignmentFix(PDDocument document, boolean sortByPosition) throws IOException {
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setSortByPosition(sortByPosition);
        Map<Integer, String> pageTextMap = new LinkedHashMap<>();

        for (int pageNum = 0; pageNum < document.getNumberOfPages(); pageNum++) {
            stripper.setStartPage(pageNum + 1);
            stripper.setEndPage(pageNum + 1);

            String pageText = stripper.getText(document);
            pageTextMap.put(pageNum + 1, pageText);
        }
        return pageTextMap;
    }

    private List<String> findMissingKeywords(Map<Integer, String> pageTextMap, List<String> keywords, File pdfFile) throws IOException {
        List<String> missingKeywords = new ArrayList<>();
        Map<Integer, String> pageScreenshotMap = new HashMap<>();

        for (String keyword : keywords) {
            keyword = keyword.trim().replaceAll("\\s+", " ");

            boolean found = false;
            for (Map.Entry<Integer, String> entry : pageTextMap.entrySet()) {
                int pageNumber = entry.getKey();
                String pageText = entry.getValue()
                        .replaceAll("\\s+", " ")
                        .replaceAll("- ", "-").trim();

                if (pageText.contains(keyword)) {
                    found = true;
                    if (!pageScreenshotMap.containsKey(pageNumber)) {
                        capturePdfPageScreenshotAndAttach(pdfFile, pageNumber, keyword);
                        pageScreenshotMap.put(pageNumber, keyword);
                    }
                    break;
                }
            }
            if (!found) {
                missingKeywords.add(keyword);
            }
        }
        return missingKeywords;
    }

    public boolean containsKeywordsInPDF(File pdfFile, List<String> keywords) throws IOException {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            Map<Integer, String> textWithSorting = extractTextWithAlignmentFix(document, true);
            Map<Integer, String> textWithoutSorting = extractTextWithAlignmentFix(document, false);

//            saveTextToTxt(textWithSorting, "output_sorted.txt");
//            saveTextToTxt(textWithoutSorting, "output_unsorted.txt");

            List<String> missingKeywords = findMissingKeywords(textWithSorting, keywords, pdfFile);

            if (!missingKeywords.isEmpty()) {
                infoLog("Retrying keyword search without position sorting...");
                missingKeywords = findMissingKeywords(textWithoutSorting, missingKeywords, pdfFile);
            }

            if (!missingKeywords.isEmpty()) {
                reportTextAttachment("Missing keywords after both attempts: ", String.valueOf(missingKeywords));
                return false;
            }
            return true;
        }
    }

    public void capturePdfPageScreenshotAndAttach(File pdfFile, int pageNumber, String keyword) throws IOException {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDPage page = document.getPage(pageNumber - 1);
            PDFRenderer renderer = new PDFRenderer(document);

            BufferedImage image = renderer.renderImageWithDPI(pageNumber - 1, 300);

            String baseDirectory = "results/screenshots/";
            File directory = new File(baseDirectory);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            String sanitizedKeyword = keyword.replaceAll("[^a-zA-Z0-9]", "_");
            int maxLength = 20;
            if (sanitizedKeyword.length() > maxLength) {
                sanitizedKeyword = sanitizedKeyword.substring(0, maxLength);
            }
            File screenshotFile = new File(baseDirectory + pdfFile.getName() + "_" + sanitizedKeyword + "_Page_" + pageNumber + ".png");
            ImageIO.write(image, "PNG", screenshotFile);

            Path content = screenshotFile.toPath();
            InputStream is = Files.newInputStream(content);
            Allure.addAttachment("PDF Page Screenshot for " + pdfFile.getName() + " - " + sanitizedKeyword + "_Page_" + pageNumber + ")", is);
            is.close();
        }
    }

    public void saveJsonToFile(JSONObject jsonResponse, String state, String folder) {
        try {
            Files.createDirectories(Paths.get(folder).toAbsolutePath());
            File jsonFile = new File(folder, "API_Response_" + state + ".json");

            try (FileWriter fileWriter = new FileWriter(jsonFile)) {
                fileWriter.write(jsonResponse.toString(4));
            }

            System.out.println("JSON response saved at: " + jsonFile.getAbsolutePath());
            reportTextAttachment("API_Response_" + state + ".json", String.valueOf(jsonResponse));
        } catch (IOException e) {
            throw new RuntimeException("Error saving JSON file: " + e.getMessage(), e);
        }
    }

    public void compareJsonFiles(String actualFilePath, String expectedFilePath, Set<String> ignoredKeys, String state) {
        File actualFile = new File(actualFilePath);
        File expectedFile = new File(expectedFilePath);

        if (!actualFile.exists() || !expectedFile.exists()) {
            throw new RuntimeException("One or both files do not exist: " + actualFilePath + " | " + expectedFilePath);
        }

        StringBuilder mismatchLog = new StringBuilder();

        try (FileReader actualReader = new FileReader(actualFile);
             FileReader expectedReader = new FileReader(expectedFile)) {

            JSONObject jsonActual = new JSONObject(new JSONTokener(actualReader));
            JSONObject jsonExpected = new JSONObject(new JSONTokener(expectedReader));

            if (jsonActual.similar(jsonExpected)) {
                infoLog("JSON files match for state: " + state + ".");
            } else {
                findJsonDifferences(jsonActual, jsonExpected, "", ignoredKeys, mismatchLog);

                if (mismatchLog.length() > 0) {
                    reportTextAttachment("SON Differences for State: " + state, mismatchLog.toString());
                    failAssertion("JSON files do NOT match for State: " + state + "\n" + mismatchLog);
                } else {
                    infoLog("JSON files match for state: " + state + " after ignoring specified keys.");
                }
            }

        } catch (IOException | JSONException e) {
            throw new RuntimeException("⚠️ Error reading or parsing JSON files: " + e.getMessage());
        }
    }

    private void findJsonDifferences(JSONObject actual, JSONObject expected, String parentKey, Set<String> ignoredKeys, StringBuilder mismatchLog) {
        Iterator<String> keys = expected.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            String fullKey = parentKey.isEmpty() ? key : parentKey + "." + key;

            if (ignoredKeys.contains(fullKey) || key.equals("end_date")) {
                continue;
            }

            if (!actual.has(key)) {
                mismatchLog.append("Missing key in actual JSON: ").append(fullKey).append("\n");
            } else {
                Object expectedValue = expected.get(key);
                Object actualValue = actual.get(key);

                if (expectedValue instanceof String && ((String) expectedValue).startsWith("http")) {
                    continue;
                }

                if (expectedValue instanceof JSONObject && actualValue instanceof JSONObject) {
                    findJsonDifferences((JSONObject) actualValue, (JSONObject) expectedValue, fullKey, ignoredKeys, mismatchLog);
                } else if (expectedValue instanceof JSONArray && actualValue instanceof JSONArray) {
                    compareJsonArrays((JSONArray) actualValue, (JSONArray) expectedValue, fullKey, ignoredKeys, mismatchLog);
                } else if (!expectedValue.equals(actualValue)) {
                    mismatchLog.append("Mismatch at key: ").append(fullKey)
                            .append(" | Expected: ").append(expectedValue)
                            .append(", Actual: ").append(actualValue).append("\n");
                }
            }
        }
    }

    private void compareJsonArrays(JSONArray actualArray, JSONArray expectedArray, String parentKey, Set<String> ignoredKeys, StringBuilder mismatchLog) {
        if (actualArray.length() != expectedArray.length()) {
            mismatchLog.append("Array size mismatch at key: ").append(parentKey)
                    .append(" | Expected: ").append(expectedArray.length())
                    .append(", Actual: ").append(actualArray.length()).append("\n");
        }

        for (int i = 0; i < Math.min(actualArray.length(), expectedArray.length()); i++) {
            Object actualElement = actualArray.get(i);
            Object expectedElement = expectedArray.get(i);

            if (actualElement instanceof JSONObject && expectedElement instanceof JSONObject) {
                findJsonDifferences((JSONObject) actualElement, (JSONObject) expectedElement, parentKey + "[" + i + "]", ignoredKeys, mismatchLog);
            } else if (!actualElement.equals(expectedElement)) {
                mismatchLog.append("Mismatch at key: ").append(parentKey).append("[").append(i).append("]")
                        .append(" | Expected: ").append(expectedElement)
                        .append(", Actual: ").append(actualElement).append("\n");
            }
        }
    }

    public void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                infoLog("File deleted successfully: " + filePath);
            } else {
                errorLog("Failed to delete file: " + filePath);
            }
        } else {
            errorLog("File not found for deletion: " + filePath);
        }
    }

}
