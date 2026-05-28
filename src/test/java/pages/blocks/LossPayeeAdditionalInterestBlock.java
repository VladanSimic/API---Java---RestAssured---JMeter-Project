package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LossPayeeAdditionalInterestBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public LossPayeeAdditionalInterestBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='loss payee/additional interest']")
    WebElement block;
    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='loss payee/ additional insured/ additional owners']/../../../../../..//span[text()='add']")
    WebElement addPW;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[1]")
    List<WebElement> interestType;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[2]")
    List<WebElement> llcTrust;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[3]")
    List<WebElement> lossPayee;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[4]")
    List<WebElement> streetAddress;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[5]")
    List<WebElement> city;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[6]")
    List<WebElement> state;
    @FindBy(xpath = "//span[text()='Interest Type']/../../../../../../../../..//table//tr//td[7]")
    List<WebElement> zip;
    @FindBy(xpath = "//div[contains(text(),'loss payee')]/../../../../../../div[2]//span[text()='add']")
    WebElement addPayeeOrInterest;
    @FindBy(xpath = "//div[contains(text(),'loss payee')]/../../../../../..//span[contains(text(),'Name')]/../../../../../../../../..//td[3]//div")
    List<WebElement> name;
    @FindBy(xpath = "//span[text()='Create new Entity']")
    List<WebElement> createNewEntity;

    public void fillLossPayeeAdditionalInterestDetailsPA(Map<String, String> data, int index) throws Throwable {
        int numOfLossPayee = data.get("Vehicle_Details_Loss_Payee_" + index).split(",").length;

        for (int i = 1; i <= numOfLossPayee; i++) {
            if (i > 1) {
                clickAdd();
            }
            if (!data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_" + index).equalsIgnoreCase("Yes")) {
                setInterestTypePA(data.get("Loss_Payee_Additional_Interest_Interest_Type_" + index + "_" + i), i - 1);
            }
            saveChanges();
            pause(3000);
            setLLCTrust(data.get("Loss_Payee_Additional_Interest_LLC_Trust_" + index + "_" + i), i - 1);
            pause(3000);
            setLossPayee(data.get("Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_" + index + "_" + i), i - 1);
            setStreetAddress(data.get("Loss_Payee_Additional_Interest_Street_Address_" + index + "_" + i), i - 1);
            setCity(data.get("Loss_Payee_Additional_Interest_City_" + index + "_" + i), i - 1);
            setState(data.get("Loss_Payee_Additional_Interest_State_" + index + "_" + i), i - 1);
            setZIP(data.get("Loss_Payee_Additional_Interest_ZIP_" + index + "_" + i), i - 1);
            saveChanges();
        }
    }

    public void fillLossPayeeAdditionalInterestDetailsPA_END(Map<String, String> data, int index) throws Throwable {
        int numOfLossPayee = data.get("Vehicle_Details_Loss_Payee_END_" + index).split(",").length;

        for (int i = 1; i <= numOfLossPayee; i++) {
            if (i > 1) {
                clickAdd();
            }
            if (!data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_END_" + index).equalsIgnoreCase("Yes")) {
                setInterestType(data.get("Loss_Payee_Additional_Interest_Interest_Type_END_" + index + "_" + i), i - 1);
            }
            setLLCTrust(data.get("Loss_Payee_Additional_Interest_LLC_Trust_END_" + index + "_" + i), i - 1);
            setLossPayee(data.get("Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_END_" + index + "_" + i), i - 1);
            setStreetAddress(data.get("Loss_Payee_Additional_Interest_Street_Address_END_" + index + "_" + i), i - 1);
            setCity(data.get("Loss_Payee_Additional_Interest_City_END_" + index + "_" + i), i - 1);
            setState(data.get("Loss_Payee_Additional_Interest_State_END_" + index + "_" + i), i - 1);
            setZIP(data.get("Loss_Payee_Additional_Interest_ZIP_END_" + index + "_" + i), i - 1);
            saveChanges();
        }
        //TODO PA END - Loss payee - Mid
    }

    public void fillLossPayeeAdditionalInterestDetailsPA_OOS_END(Map<String, String> data, int index) throws Throwable {
        int numOfLossPayee = data.get("Vehicle_Details_Loss_Payee_OOS_END_" + index).split(",").length;

        for (int i = 1; i <= numOfLossPayee; i++) {
            if (i > 1) {
                clickAdd();
            }
            if (!data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_END_" + index).equalsIgnoreCase("Yes")) {
                setInterestType(data.get("Loss_Payee_Additional_Interest_Interest_Type_OOS_END_" + index + "_" + i), i - 1);
            }
            setLLCTrust(data.get("Loss_Payee_Additional_Interest_LLC_Trust_OOS_END_" + index + "_" + i), i - 1);
            setLossPayee(data.get("Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_OOS_END_" + index + "_" + i), i - 1);
            setStreetAddress(data.get("Loss_Payee_Additional_Interest_Street_Address_OOS_END_" + index + "_" + i), i - 1);
            setCity(data.get("Loss_Payee_Additional_Interest_City_OOS_END_" + index + "_" + i), i - 1);
            setState(data.get("Loss_Payee_Additional_Interest_State_OOS_END_" + index + "_" + i), i - 1);
            setZIP(data.get("Loss_Payee_Additional_Interest_ZIP_OOS_END_" + index + "_" + i), i - 1);
            saveChanges();
        }
        //TODO PA OOS - Loss payee - Mid
    }

    public void fillLossPayeeAdditionalInterestDetailsPA_RNW(Map<String, String> data, int index) throws Throwable {
        int numOfLossPayee = data.get("Vehicle_Details_Loss_Payee_RNW_" + index).split(",").length;

        for (int i = 1; i <= numOfLossPayee; i++) {
            if (i > 1) {
                clickAdd();
            }
            if (!data.get("Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_RNW_" + index).equalsIgnoreCase("Yes")) {
                setInterestType(data.get("Loss_Payee_Additional_Interest_Interest_Type_RNW_" + index + "_" + i), i - 1);
            }
            setLLCTrust(data.get("Loss_Payee_Additional_Interest_LLC_Trust_RNW_" + index + "_" + i), i - 1);
            setLossPayee(data.get("Loss_Payee_Additional_Interest_Loss_Payee_Additional_Interest_Name_RNW_" + index + "_" + i), i - 1);
            setStreetAddress(data.get("Loss_Payee_Additional_Interest_Street_Address_RNW_" + index + "_" + i), i - 1);
            setCity(data.get("Loss_Payee_Additional_Interest_City_RNW_" + index + "_" + i), i - 1);
            setState(data.get("Loss_Payee_Additional_Interest_State_RNW_" + index + "_" + i), i - 1);
            setZIP(data.get("Loss_Payee_Additional_Interest_ZIP_RNW_" + index + "_" + i), i - 1);
            saveChanges();
        }
        //TODO PA RNW - Loss payee - Mid
    }

    public void fillLossPayeeAdditionalInsuredAdditionalOwnerPW(Map<String, String> data) throws Throwable {
        //TODO rework needed if we add multiple vessels in future
        int numOfLossPayee = data.get("Loss_Payee").split(",").length;

        for (int i = 1; i <= numOfLossPayee; i++) {
            clickAddPW();
            setInterestType(data.get("Loss_Payee_Additional_Insured_Interest_Type_" + i), i - 1);
            setLLCTrust(data.get("Loss_Payee_Additional_Insured_LLC_Trust_" + i), i - 1);
            setLossPayee(data.get("Loss_Payee_Additional_Insured_Name_" + i), i - 1);
            setStreetAddress(data.get("Loss_Payee_Additional_Insured_Street_Address_" + i), i - 1);
            setCity(data.get("Loss_Payee_Additional_Insured_City_" + i), i - 1);
            setState(data.get("Loss_Payee_Additional_Insured_State_" + i), i - 1);
            setZIP(data.get("Loss_Payee_Additional_Insured_ZIP_" + i), i - 1);
            if (data.get("Loss_Payee_Additional_Insured_Interest_Type_" + i).equalsIgnoreCase("LLC") || data.get("Loss_Payee_Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase("Yes") || data.get("Loss_Payee_Additional_Insured_LLC_Trust_" + i).equalsIgnoreCase(""))
                clickCreateNewEntity();
        }
        saveChanges();
    }

    public void clickBlock() {
        clickElement(block, "Block");
    }

    public void clickAdd() throws InterruptedException {
        clickElement(add, "Add");
        pause(2000);
    }

    public void clickAddPW() throws InterruptedException {
        clickElement(addPW, "Add");
        pause(3000);
    }

    public void setInterestType(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(interestType.get(i), "Interest Type_" + (i + 1));
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
            clickFooter();
        }
    }

    public void setInterestTypePA(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(interestType.get(i), "Interest Type_" + (i + 1));
            pause(500);
            driver.switchTo().activeElement().clear();
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
            clickElement(interestType.get(i), "Interest Type_" + (i + 1));
            typeTextEnter(driver.switchTo().activeElement(), value, "Interest Type");
            clickFooter();
        }
    }

    public void setLLCTrust(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(llcTrust.get(i), "LLC Trust_" + (i + 1));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            clickFooter();
            clickFooter();
        }
    }

    public void setLossPayee(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossPayee.get(i), "Loss Payee_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Loss Payee_" + (i + 1));
        }
    }

    public void setStreetAddress(String value, int i) {
        if (hasValue(value)) {
            clickElement(streetAddress.get(i), "Street Address_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Street Address_" + (i + 1));
        }
    }

    public void setCity(String value, int i) {
        if (hasValue(value)) {
            clickElement(city.get(i), "City_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "City_" + (i + 1));
        }
    }

    public void setState(String value, int i) {
        if (hasValue(value)) {
            clickElement(state.get(i), "State_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "State_" + (i + 1));
        }
    }

    public void setZIP(String value, int i) {
        if (hasValue(value)) {
            clickElement(zip.get(i), "ZIP_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "ZIP_" + (i + 1));
        }
    }

    public void clickAddPayee() throws Throwable {
        clickElement(addPayeeOrInterest, "Add Payee/Additional Interest");
        pause(3500);
        clickFooter();
    }

    public void setLLCOrTrust(String value, int i) throws Throwable {
        clickFooter();
        pause(500);
        clickElement(llcTrust.get(i), "LLC/Trust");
        pause(3500);
        driver.switchTo().activeElement().sendKeys(value);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        pause(2000);
        clickFooter();
    }

    public void setName(String value, int i) throws Throwable {
        clickFooter();
        pause(3500);
        clickElement(name.get(i), "Loss Payee/Additional Interest Name");
        pause(2000);
        typeText(driver.switchTo().activeElement(), value, "Loss Payee/Additional Interest Name");
    }

    public void clickCreateNewEntity() {
        clickElement(createNewEntity.get(createNewEntity.size() - 1), "Create New Entity");
    }

}