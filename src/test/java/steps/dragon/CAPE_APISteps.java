package steps.dragon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.blocks.GeoLocationDetailsBlock;
import pages.utils.CustomFileUtils;
import selenium.DriverManager;
import steps.BaseTest;

import java.io.File;
import java.util.*;

public class CAPE_APISteps extends BaseTest {

    private static final ThreadLocal<List<Map<String, String>>> apiRequestsThreadLocal = ThreadLocal.withInitial(ArrayList::new);
    WebDriver driver = DriverManager.getInstance().getWebDriver();


    @Given("the API request is prepared with the following details:")
    public void givenTheApiDetails(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> threadApiRequests = new ArrayList<>();
        dataTable.asMaps(String.class, String.class).forEach(request -> threadApiRequests.add(new HashMap<>(request)));
        apiRequestsThreadLocal.set(Collections.synchronizedList(threadApiRequests));
    }

    @When("I send the request to the API and verify status {int} and save JSON response")
    public void whenISendTheRequest(int expectedStatus) throws InterruptedException {
        List<Map<String, String>> apiRequests = apiRequestsThreadLocal.get();
        GeoLocationDetailsBlock geoLocation = new GeoLocationDetailsBlock(driver);
        CustomFileUtils customFileUtils = new CustomFileUtils(driver);
        for (Map<String, String> request : apiRequests) {
            String baseUrl = request.get("baseUrl");
            String apiKey = request.get("api");

            String latlng = geoLocation.getLatLngFromUI();
            String address = geoLocation.getAddressFromUI();
            String state = geoLocation.getStateFromUI();


            System.out.println("Sending API Request: " + baseUrl + "address=" + address + "&latlng=" + latlng + "&api_key=" + apiKey);
            reportTextAttachment("API_Request", "Sending API Request: " + baseUrl + "address=" + address + "&latlng=" + latlng + "&api_key=" + apiKey);
            Response response = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .baseUri(baseUrl)
                    .queryParam("address", address)
                    .queryParam("latlng", latlng)
                    .queryParam("api_key", apiKey)
                    .get();

            Assert.assertEquals(response.statusCode(), expectedStatus);

            if (response.statusCode() == 200) {
                JSONObject jsonResponse = new JSONObject(new JSONTokener(response.getBody().asString()));

                customFileUtils.saveJsonToFile(jsonResponse, state, "src/test/test_data/dragon/cape/CAPE_Response/");
            }
        }
    }

    @Given("I compare the API response for state {string}")
    public void compareApiResponse(String state) {
        CustomFileUtils customFileUtils = new CustomFileUtils(driver);
        Set<String> ignoredKeys = new HashSet<>(List.of(
                "unique_id", "perfMeasure",
                "image_information.hail_event_count.date", "image_information.hail_max_size.date",
                "property_location.primary_structure_images[1].orientation",
                "property_location.primary_structure_images[2].orientation",
                "property_location.primary_structure_images[3].orientation",
                "property_location.primary_structure_images[4].orientation",
                "end_date"));

        String stateAbbreviation = state.substring(0, Math.min(state.length(), 2)).toUpperCase();

        String capeResponseFolder = "src/test/test_data/dragon/cape/CAPE_Response/";
        String dragonResponseFolder = "src/test/test_data/dragon/cape/Dragon_Response/";

        String capeFilePath = capeResponseFolder + "API_Response_" + stateAbbreviation + ".json";
        String dragonFilePath = dragonResponseFolder + "API_Response_" + stateAbbreviation + ".json";

        File capeFile = new File(capeFilePath);
        File dragonFile = new File(dragonFilePath);

        if (!capeFile.exists() || !dragonFile.exists()) {
            throw new RuntimeException("Missing JSON file for state: " + stateAbbreviation);
        }

        System.out.println("Comparing: " + capeFilePath + " WITH " + dragonFilePath);
        customFileUtils.compareJsonFiles(capeFilePath, dragonFilePath, ignoredKeys, stateAbbreviation);

        customFileUtils.deleteFile(capeFilePath);
        customFileUtils.deleteFile(dragonFilePath);
    }
}


