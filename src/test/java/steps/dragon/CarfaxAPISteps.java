package steps.dragon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import steps.BaseTest;

import java.io.IOException;

public class CarfaxAPISteps extends BaseTest {

    Response response;

    @Given("I send get request to carfax {string}")
    public void iSendGetTo(String testCase) throws IOException {
        response = (Response) RestAssured
                .given()
                .when()
                .get(testCase)
                .then()
                .extract()
                .response();
    }

    @Then("I should get {int} response status code")
    public void iSendGetTo(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

}
