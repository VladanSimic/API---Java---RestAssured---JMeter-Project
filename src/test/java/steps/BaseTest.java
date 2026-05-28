package steps;

import excel.DataManager;
import excel.ExcelManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Reporter;
import selenium.DriverManager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {

    public WebDriver driver;

    public String QUIT = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("QUIT");
    public String SCREENSHOTS = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SCREENSHOTS");
    public String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");
    public String PGActions = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PGActions");
    public String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");
    public String WAIT_TIME = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("WAIT_TIME");
    public String DBStore = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("DBStore");
    public String EXECUTION_ID = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("EXECUTION_ID");
    public String RAMP_UP = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("RAMP_UP");
    private int IMPLICIT_WAIT = 20;
    public String SOFT_ASSERT = (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SOFT_ASSERT") != null)
            ? Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("SOFT_ASSERT") : "No";
    public String testDataPath = "src/test/test_data/dragon/";
    private static final ThreadLocal<String> scenarioName = new ThreadLocal<>();


    public void init(String browser, String wait_time) throws Exception {
        DriverManager.getInstance().createWebDriver(browser);
        driver = DriverManager.getInstance().getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));

        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        System.out.println("\n/---------------------INITIALIZING--------------------/");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        SessionId s;

        if (BROWSER.equalsIgnoreCase("CHROME")) {
            s = ((ChromeDriver) driver).getSessionId();
        } else if (BROWSER.equalsIgnoreCase("FIREFOX")) {
            s = ((FirefoxDriver) driver).getSessionId();
        } else {
            s = ((RemoteWebDriver) driver).getSessionId();
        }

        System.out.println("Driver ID: " + s);
        System.out.println("/-----------------------------------------------------/\n");
    }

    public void quit() {
        if (!hasValue(QUIT) || !QUIT.equalsIgnoreCase("NO")) {
            try {
                DriverManager.getInstance().quitWebDriver();
            } catch (Exception e) {
                System.out.println("Driver was already null or quited.");
            }
        }
    }

    public void takeScreenshot(String fileName) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("results/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportScreenshot(String screenshotName, String screenshotDesc) {
        if (hasValue(SCREENSHOTS) && SCREENSHOTS.equalsIgnoreCase("Yes")) {
            takeScreenshot(screenshotName);
            Path content = Paths.get("results/screenshots/" + screenshotName + ".png");
            try (InputStream is = Files.newInputStream(content)) {
                Allure.addAttachment(screenshotDesc, is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void reportTextAttachment(String name, String text) {
        if (hasValue(name) && hasValue(text))
            Allure.addAttachment(name, text);
    }

    public String getNextWeekDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        return dateFormat.format(cal.getTime());
    }

    public String getTomorrowsDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        return dateFormat.format(cal.getTime());
    }

    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        return now.format(formatter);
    }
    public String getDateAfterEffective(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        return parsedDate.plusDays(1).format(formatter);
    }

    public void pause(int seconds) throws InterruptedException {
        System.out.println("\033[33m" + getCurrentDateTime() + " - Pausing for " + seconds + " sec" + "\033[0m");
        Thread.sleep(seconds * 1000L);
    }

    public boolean hasValue(String data) {
        try {
            return !data.equals("") && !data.equals(" ");
        } catch (Exception e) {
            return false;
        }
    }

    public Map<String, String> getRandomData() throws IOException {
        return new ExcelManager().getRandomRowData("src/test/test_data/dragon/RandomData.xlsx", "Data");
    }

    public void iThinkForToSeconds(int min, int max) throws InterruptedException {
        Random r = new Random();
        int seconds = r.nextInt((max - min) + 1) + min;
        Thread.sleep(seconds * 1000L);
    }

    public void createFileToStoreData(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
        } else { // if file exists, it clears the content
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
        }
    }

    public void logPGActions() throws Exception {
        if (hasValue(PGActions) && PGActions.equalsIgnoreCase("Yes")) {
            createFileToStoreData("results/PageActionsLog.txt");
        }
    }

    public int getImplicitWait() {
        return this.IMPLICIT_WAIT;
    }

    public static void setScenarioName(String name) {
        scenarioName.set(name);
    }

    public static String getScenarioName() {
        return scenarioName.get();
    }

}