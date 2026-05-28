package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class PleaseProvideAdditionalDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public PleaseProvideAdditionalDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//div[text()='What is the intent or purpose of the Entity? ']/../../../..//textarea")
    WebElement intentOrPurposeOfTheEntity;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income or conduct business')]/../../../..//label[text()='Yes']/..//input")
    WebElement entityGenerateIncomeOrConductBusinessYes;
    @FindBy(xpath = "//div[contains(text(),'Entity generate income or conduct business')]/../../../..//label[text()='No']/..//input")
    WebElement entityGenerateIncomeOrConductBusinessNo;
    @FindBy(xpath = "(//div[text()='Please provide details:']/../../../..//textarea)[1]")
    WebElement entityGenerateIncomeOrConductBusiness;
    @FindBy(xpath = "//div[contains(text(),'generate income in any other ways')]/../../../..//label[text()='Yes']/..//input")
    WebElement entityGenerateIncomeInAnyOtherWaysYes;
    @FindBy(xpath = "//div[contains(text(),'generate income in any other ways')]/../../../..//label[text()='No']/..//input")
    WebElement entityGenerateIncomeInAnyOtherWaysNo;
    @FindBy(xpath = "(//div[text()='Please provide details:']/../../../..//textarea)[2]")
    WebElement entityGenerateIncomeInAnyOtherWays;
    @FindBy(xpath = "//div[contains(text(),'own any other real estate')]/../../../..//label[text()='Yes']/..//input")
    WebElement entityOwnAnyOtherYes;
    @FindBy(xpath = "//div[contains(text(),'own any other real estate')]/../../../..//label[text()='No']/..//input")
    WebElement entityOwnAnyOtherNo;
    @FindBy(xpath = "(//div[text()='Please provide details:']/../../../..//textarea)[3]")
    WebElement entityOwnAnyOther;

    public void fillPleaseProvideAdditionalDetailsBlockCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockCC_END(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHS(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_Please_Provide_Details"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Please_Provide_Details"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHS_END(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_Please_Provide_Details_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Please_Provide_Details_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHS_OOS_END(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_Please_Provide_Details_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Please_Provide_Details_OOS_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHS_RNW(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_Please_Provide_Details_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_RNW"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_RNW"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Please_Provide_Details_RNW"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsDetailsPA(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsDetailsPA_END(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_OOS_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Details_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Details_RNW"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_RNWEND"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Details_RNW"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_OOS_END"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_OOS_END"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_OOS_END"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_OOS_END"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_OOS_END"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_RNW"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_RNW"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_RNW"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_RNW"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_RNW"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_RNW"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockLLC(Map<String, String> data, int i) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_" + i));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockLLC_END(Map<String, String> data, int i) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_END_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_END_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_END_" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__END" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__END" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_END_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_END_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_END_" + i));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockLLC_OOS_END(Map<String, String> data, int i) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_OOS_END_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_OOS_END_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_OOS_END_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_OOS_END_" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__OOS_END" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__OOS_END" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_OOS_END_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_OOS_END_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_OOS_END_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_OOS_END_" + i));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockLLC_RNW(Map<String, String> data, int i) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity_RNW_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_RNW_" + i));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_RNW_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details_RNW_" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__RNW" + i));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways__RNW" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details_RNW_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_RNW_" + i));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_RNW_" + i), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details_RNW_" + i));
        saveChanges();
    }

    public void setWhatIsTheIntentOrPurposeOfTheEntity(String value) {
        typeText(intentOrPurposeOfTheEntity, value, "Intent Or Purpose Of The Entity");
    }

    public void setDoesTheEntityGenerateIncomeOrConductBusiness(String value) throws Throwable {
        choose(entityGenerateIncomeOrConductBusinessYes, entityGenerateIncomeOrConductBusinessNo, value, "Entity Generate Income Or Conduct Business");
    }

    public void setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(String condition, String value) throws InterruptedException {
        if (hasValue(condition) && condition.equalsIgnoreCase("Yes")) {
            pause(2000);
            typeText(entityGenerateIncomeOrConductBusiness, value, "Entity Generate Income Or Conduct Business");
        }
    }

    public void setDoesTheEntityGenerateIncomeInAnyOtherWays(String value) throws Throwable {
        choose(entityGenerateIncomeInAnyOtherWaysYes, entityGenerateIncomeInAnyOtherWaysNo, value, "Entity Generate Income In Any Other Ways");
    }

    public void setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(String condition, String value) throws InterruptedException {
        if (hasValue(condition) && condition.equalsIgnoreCase("Yes")) {
            pause(2000);
            typeText(entityGenerateIncomeInAnyOtherWays, value, "Entity Generate Income In Any Other Ways");
        }
    }

    public void setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(String value) throws Throwable {
        choose(entityOwnAnyOtherYes, entityOwnAnyOtherNo, value, "Entity Own Any Other");
    }

    public void setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(String condition, String value) throws InterruptedException {
        if (hasValue(condition) && condition.equalsIgnoreCase("Yes")) {
            pause(2000);
            typeTextEnter(entityOwnAnyOther, value, "Entity Own Any Other");
            pause(2000);
        }
    }

    public void fillPleaseProvideAdditionalDetailsBlockPF(Map<String, String> data) throws Throwable {
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_With_Regards_Please_Provide_Details"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Please_Provide_Details"));
        saveChanges();
    }

    public void fillPleaseProvideAdditionalDetailsBlockFS(Map<String, String> data) {

    }

    public void fillPleaseProvideAdditionalDetailsBlockES(Map<String, String> data) throws Throwable {
        verifyBlockExists("Please provide additional details");
        setWhatIsTheIntentOrPurposeOfTheEntity(data.get("Please_Provide_Additional_Details_What_Is_The_Intent_Or_Purpose_Of_The_Entity"));
        setDoesTheEntityGenerateIncomeOrConductBusiness(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"));
        setDoesTheEntityGenerateIncomeOrConductBusinessPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_Or_Conduct_Business_Please_Provide_Details"));
        setDoesTheEntityGenerateIncomeInAnyOtherWays(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"));
        setDoesTheEntityGenerateIncomeInAnyOtherWaysPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Generate_Income_In_Any_Other_Ways_Please_Provide_Details"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssets(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"));
        setDoesTheEntityOwnAnyOtherRealEstateVehiclesWatercraftOrOtherTangibleAssetsPleaseProvideDetails(data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets"), data.get("Please_Provide_Additional_Details_Does_The_Entity_Own_Any_Other_Real_Estate_Vehicles_Watercraft_Or_Other_Tangible_Assets_Please_Provide_Details"));
        saveChanges();
    }
}