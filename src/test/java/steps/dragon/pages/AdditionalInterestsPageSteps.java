package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import pages.AdditionalInterestsPage;
import pages.blocks.AdditionalInterestsBlock;
import pages.blocks.HomeRatingCharacteristicsAvailableForPrefilBlock;
import pages.blocks.LlcTrustQuestionnaireBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdditionalInterestsPageSteps extends BaseTest {

    public AdditionalInterestsPageSteps() {
        super.driver = this.driver;
    }

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I fill out the additional interests page for CC line of business")
    public void iFillOutAdditionalInterestsPageCC() throws Throwable {
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageCC(data);
    }

    @And("I fill out the additional interests details for CC line of business")
    public void iFillAdditionalInterestsDetailsCC() throws Throwable {
        new AdditionalInterestsBlock(driver).fillAdditionalInterestsDetailsCC(data);
    }

    @And("I set the additional interests {int} type to {string}")
    public void setType(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setType(value, index);
    }

    @And("I set the additional interests {int} LLC trust to {string}")
    public void setLLCTrust(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setLLCTrust(value, index);
    }

    @And("I set the additional interests {int} name to {string}")
    public void setName(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setName(value, index);
    }

    @And("I set the additional interests {int} address Line1 to {string}")
    public void setAddressLine1(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setAddressLine1(value, index);
    }

    @And("I set the additional interests {int} address Line2 to {string}")
    public void setAddressLine2(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setAddressLine2(value, index);
    }

    @And("I set the additional interests {int} city to {string}")
    public void setCity(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setCity(value, index);
    }

    @And("I set the additional interests {int} state to {string}")
    public void setState(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setState(value, index);
    }

    @And("I set the additional interests {int} ZIP to {string}")
    public void setZIP(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setZIP(value, index);
    }

    @And("I set the additional interests {int} loan to {string}")
    public void setLoan(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setLoan(value, index);
    }

    @And("I set the additional interests {int} mortgage type to {string}")
    public void setMortgageType(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setMortgageType(value, index);
    }

    @And("I delete all additional interests")
    public void deleteAllInterests() throws InterruptedException {
        new AdditionalInterestsBlock(driver).deleteAllInterests();

    }

    @And("I verify if mortgagee is returned")
    public void verifyMortgageeReturned() throws Throwable {
        new HomeRatingCharacteristicsAvailableForPrefilBlock(driver).setAvailableForPrefill(data);
        new AdditionalInterestsBlock(driver).verifyIfDataReturned();
    }

    @And("I fill out the additional interests page for HO line of business")
    public void iFillOutAdditionalInterestsPageHO() throws Throwable {
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
    }

    @And("I enter data on LLC questioner block that will trigger OFAC referral")
    public void enterDataToTriggerOFACPositive() throws Throwable {
        LlcTrustQuestionnaireBlock llcBlock = new LlcTrustQuestionnaireBlock(driver);
        llcBlock.setFirstName("Marko");
        llcBlock.setLastName("Milosevic");
        llcBlock.setDob("01/01/1991");
        llcBlock.setType("Principal/Beneficial Owner");
        llcBlock.setRelationshipToNamedInsured("Named Insured");
        llcBlock.saveChanges();
    }

    @And("I click add additional interests")
    public void iClickAddButton() {
        new AdditionalInterestsBlock(driver).clickAdd();
    }

    @And("I set additional interest {int} type to {string}")
    public void iSetTypeTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setType(value, index);
    }

    @And("I set additional interest {int} llc trust to {string}")
    public void iSetLLCTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setLLCTrust(value, index);
    }

    @And("I set additional interest {int} name to {string}")
    public void iSetNameTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setName(value, index);
    }

    @And("I set additional interest {int} address line 1 to {string}")
    public void iSetAddressLine1To(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setAddressLine1(value, index);
    }

    @And("I set additional interest {int} city to {string}")
    public void iSetCityTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setCity(value, index);
    }

    @And("I set additional interest {int} state to {string}")
    public void iSetStateTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setState(value, index);
    }

    @And("I set additional interest {int} zip to {string}")
    public void iSetZIPTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setZIP(value, index);
    }

    @And("I set additional interest {int} address for liability coverage to {string}")
    public void iSetAddressForLiabilityCoverageTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setAddressForLiabilityCoverageForm(value, index);
    }

    @And("I set additional interest {int} property description to {string}")
    public void iSetPropertyDescriptionTo(int index, String value) throws InterruptedException {
        new AdditionalInterestsBlock(driver).setPropertyDescription(value, index);
    }

    @When("I navigate to Additional Interests page and fill additional interests details")
    public void iNavigateToAdditionalInterestsPageAndFillAdditionalInterestsDetails(DataTable table) throws Throwable {
        new CommonComponentsAndActions(driver).goToPage("Additional Interests");

        List<Map<String, String>> dataList = table.asMaps(String.class, String.class);
        Map<String, String> additionalInterests = new HashMap<>();

        for (int index = 0; index < dataList.size(); index++) {
            Map<String, String> data = dataList.get(index);
            additionalInterests.put("Additional_Interests_Type_" + (index + 1), data.get("Type"));
            additionalInterests.put("Additional_Interests_LLC_Trust_" + (index + 1), data.get("LLC_Trust"));
            additionalInterests.put("Additional_Interests_Name_" + (index + 1), data.get("Name"));
            additionalInterests.put("Additional_Interests_Address_Line_1_" + (index + 1), data.get("Address_Line_1"));
            additionalInterests.put("Additional_Interests_City_" + (index + 1), data.get("City"));
            additionalInterests.put("Additional_Interests_State_" + (index + 1), data.get("State"));
            additionalInterests.put("Additional_Interests_ZIP_" + (index + 1), data.get("ZIP"));
            additionalInterests.put("Additional_Interests_Loan_" + (index + 1), data.get("Loan"));
            additionalInterests.put("Additional_Interests_Mortgage_Type_" + (index + 1), data.get("Mortgage_Type"));
            System.out.println("Additional interest: " + additionalInterests);
        }
        new AdditionalInterestsBlock(driver).fillAdditionalInterestsDetailsDataTable(additionalInterests);

    }
}