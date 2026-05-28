package steps.dragon;

import excel.DataManager;
import excel.ExcelWriter;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import pages.DocumentsPage;
import pages.utils.CommonComponentsAndActions;
import pages.utils.CustomFileUtils;
import selenium.DriverManager;
import sql.SQLManager;
import steps.BaseTest;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuerySteps extends BaseTest {

    public QuerySteps() {
        super.driver = this.driver;
    }


    WebDriver driver = DriverManager.getInstance().getWebDriver();
    Map<String, String> data = DataManager.getInstance().getData();

    @Given("I execute the query and verify results")
    public void executeQueryAndVerifyResults(DataTable dataTable) throws Throwable {
        SQLManager sqlManager = new SQLManager();
        CommonComponentsAndActions commonActions = new CommonComponentsAndActions(driver);
        DocumentsPage documentsPage = new DocumentsPage(driver);

        ExcelWriter excelWriter = new ExcelWriter("src/test/test_data/dragon/Nemandza.xlsx");

        List<String> documentNames = new ArrayList<>();
        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {
            documentNames.add(row.get("file"));
        }

        List<String> documentIDs_1 = documentsPage.getDocumentIDs(documentNames);
        String documentIDList_1 = String.join(",", documentIDs_1);

        List<String> results_1 = sqlManager.executeDatabaseQuery(
                dataTable.asMaps(String.class, String.class).get(0).get("query"),
                dataTable.asMaps(String.class, String.class).get(0).get("column"),
                ENV,
                documentIDList_1
        );

        documentsPage.regenerateDocumentAndNavigateBack(dataTable.asMaps(String.class, String.class).get(0).get("transaction"));

        List<String> documentIDs_2 = documentsPage.getDocumentIDs(documentNames);
        String documentIDList_2 = String.join(",", documentIDs_2);

        List<String> results_2 = sqlManager.executeDatabaseQuery(
                dataTable.asMaps(String.class, String.class).get(0).get("query"),
                dataTable.asMaps(String.class, String.class).get(0).get("column"),
                ENV,
                documentIDList_2
        );

        commonActions.assertEquals(String.valueOf(results_2.size()),String.valueOf(results_1.size()),
                "Count before regenerate: " + results_1.size() + " Count after regenerate: " + results_2.size());
        String[] headers = {"Document Name", "Document ID Before", "Document ID After", "OnBase ID Before", "OnBase ID After", "Value Before Regenerate", "Value After Regenerate"};

        if (results_1.size() == results_2.size() && !results_1.isEmpty()) {
            for (int i = 0; i <= results_1.size() - 1; i++) {
                String documentIDBefore = documentIDs_1.get(i);
                String documentIDAfter = documentIDs_2.get(i);
                String fileName = documentNames.get(i);

                String valueBefore = results_1.get(i);
                String valueAfter = results_2.get(i);

                String docIDBefore = commonActions.extractDocId(valueBefore);
                String docIDAfter = commonActions.extractDocId(valueAfter);

                String[] values = {fileName, documentIDBefore, documentIDAfter, docIDBefore, docIDAfter, valueBefore, valueAfter};
                excelWriter.writeData("Results", headers, values);

                reportTextAttachment(fileName,
                        "Comparing File: " + fileName + "\n" +
                                "Document ID Before: " + documentIDBefore + " |\n" +
                                "Document ID After: " + documentIDAfter + "\n" +
                                "Value Before Regenerate: " + valueBefore + " |\n" +
                                "Value After Regenerate: " + valueAfter
                );

                if (valueBefore.equalsIgnoreCase(valueAfter)) {
                    commonActions.failAssertion("Expected values not to be the same, but found same values");
                }
            }
        }
    }

    @Given("I execute the query and verify job status")
    public void executeQueryAndVerifyStatus(DataTable dataTable) {
        SQLManager sqlManager = new SQLManager();


        Map<String, String> queryData = dataTable.asMaps(String.class, String.class).get(0);

        String query = queryData.get("query");
        String column = queryData.get("column");
        String expectedStatus = queryData.get("status");
        String parameter = queryData.getOrDefault("parameter", "SESSION_ID");
        int expectedRequests = Integer.parseInt(queryData.get("expectedRequests"));

        List<String> results;
        if (parameter.equalsIgnoreCase("OBJECT_ID")) {
            results = sqlManager.executeDatabaseQuery(query, column, ENV, data.get("OBJECT_ID"));
        } else {
            results = sqlManager.executeDatabaseQuery(query, column, ENV, data.get("SESSION_ID"));
        }

        String result = results.get(0);

        if (expectedRequests != results.size()) {
            reportTextAttachment("Expected Request", "Expected number of requests: " + expectedRequests + " but found: " + results.size());
            throw new RuntimeException("Expected number of requests: " + expectedRequests + " but found: " + results.size());
        }
        if (hasValue(expectedStatus)) {
            if (!result.equalsIgnoreCase(expectedStatus)) {
                reportTextAttachment("Status", "Expected job status: " + expectedStatus + " but found: " + result);
                throw new RuntimeException("Expected job status: " + expectedStatus + " but found: " + result);
            }
        }
        reportTextAttachment("Status Check", "Job Status: " + result + " | Expected: " + expectedStatus);
    }

    @Given("I execute the query and save response")
    public void executeQueryAndSaveResponse(DataTable dataTable) {
        SQLManager sqlManager = new SQLManager();
        CustomFileUtils customFileUtils = new CustomFileUtils(driver);
        ExcelWriter excelWriter = new ExcelWriter("src/test/test_data/dragon/cape/PerformanceMetrics.xlsx");

        Map<String, String> queryData = dataTable.asMaps(String.class, String.class).get(0);
        String query = queryData.get("query");
        String column = queryData.get("column");
        String state = queryData.get("state");
        String stateAbbreviation = state.substring(0, Math.min(state.length(), 2)).toUpperCase();

        String jsonResult = sqlManager.executeDatabaseQuery(query, column, ENV, data.get("SESSION_ID")).get(0);

        if (jsonResult == null || jsonResult.isEmpty()) {
            customFileUtils.deleteFile("src/test/test_data/dragon/cape/CAPE_Response/" + "API_Response_" + stateAbbreviation + ".json");
            throw new RuntimeException("No results found for query: " + query + " | Column: " + column);
        }
        org.json.JSONObject jsonResponse = new JSONObject(jsonResult);

        String totalTime = jsonResponse.optJSONObject("perfMeasure") != null ?
                jsonResponse.getJSONObject("perfMeasure").optString("TotalTime", "").trim() : "Unknown";

        customFileUtils.saveJsonToFile(jsonResponse, stateAbbreviation, "src/test/test_data/dragon/cape/Dragon_Response/");

        excelWriter.writeData("PerformanceMetrics", new String[]{"State", "PerfMetric"}, new String[]{stateAbbreviation, totalTime});
    }

    @Given("I execute the query and compare xml result")
    public void executeQueryAndCompareXmlResult(DataTable dataTable) throws ParserConfigurationException, IOException, SAXException {
        SQLManager sqlManager = new SQLManager();
        CustomFileUtils customFileUtils = new CustomFileUtils(driver);

        Map<String, String> queryData = dataTable.asMaps(String.class, String.class).get(0);
        String query = queryData.get("query");
        String column = queryData.get("column");
        String attributeName = queryData.get("attributeName");
        String fieldName = queryData.get("fieldName");

        if (data.get("OBJECT_ID") == null) {
            data.put("OBJECT_ID", customFileUtils.getCurrentObjectId());
        }
        String xmlResult = sqlManager.executeDatabaseQuery(query, column, ENV, data.get("OBJECT_ID")).get(0);

        String extractedValue = "Not Found";

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xmlResult.getBytes(StandardCharsets.UTF_8));
        Document doc = builder.parse(is);
        doc.getDocumentElement().normalize();

        NodeList attributeNodes = doc.getElementsByTagName("CoverageAttribute");
        for (int i = 0; i < attributeNodes.getLength(); i++) {
            Node node = attributeNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String attributeName2 = element.getElementsByTagName("AttributeName").item(0).getTextContent().trim();

                if (attributeName.equals(attributeName2)) {
                    NodeList valueNodes = element.getElementsByTagName("AttributeValue");
                    if (valueNodes.getLength() > 0) {
                        extractedValue = valueNodes.item(0).getTextContent().trim();
                    }
                    break;
                }
            }
        }
        String valueUI = customFileUtils.iGetValueFromField(fieldName);
        if (!valueUI.equalsIgnoreCase(extractedValue)) {
            customFileUtils.failAssertion("Expected: " + extractedValue + " Actual: " + valueUI);
        }
        reportTextAttachment("Attachment", "Expected: " + extractedValue + " Actual: " + valueUI);
    }

    @Then("I get current object ID for sql query")
    public void iCurrentID() {
        data.put("OBJECT_ID", new CommonComponentsAndActions(driver).getCurrentObjectId());
    }


}