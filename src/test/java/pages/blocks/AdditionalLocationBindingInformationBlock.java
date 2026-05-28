package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class AdditionalLocationBindingInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AdditionalLocationBindingInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='No']/..//input")
    WebElement existingAgencyClientNo;
    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='Yes']/..//input")
    WebElement existingAgencyClientYes;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='No']/..//input")
    WebElement cancelledOrRefusedNo;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='Yes']/..//input")
    WebElement cancelledOrRefusedYes;
    @FindBy(xpath = "//div[contains(text(),'Has coverage been non-renewed or')]/../../../../div//label[text()='No']/..//input")
    WebElement coverageNonRenewedOrDeclinedNo;
    @FindBy(xpath = "//div[contains(text(),'Has coverage been non-renewed or')]/../../../../div//label[text()='Yes']/..//input")
    WebElement coverageNonRenewedOrDeclinedYes;

    public void fillOutAdditionalLocationBindingInformation(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line"));
        if (data.get("Existing_Agency_Client").equalsIgnoreCase("Yes")) {
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if (data.get("Any_Company_Refused_Or_Cancelled").equalsIgnoreCase("Yes")) {
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if (data.get("Non_Renewed_Or_Declined_Coverage").equalsIgnoreCase("Yes")) {
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void fillOutAdditionalLocationBindingInformation_END(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_END"));
        if (data.get("Existing_Agency_Client_END").equalsIgnoreCase("Yes")) {
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if (data.get("Any_Company_Refused_Or_Cancelled_END").equalsIgnoreCase("Yes")) {
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if (data.get("Non_Renewed_Or_Declined_Coverage_END").equalsIgnoreCase("Yes")) {
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void fillOutAdditionalLocationBindingInformation_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_OOS_END"));
        if (data.get("Existing_Agency_Client_OOS_END").equalsIgnoreCase("Yes")) {
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if (data.get("Any_Company_Refused_Or_Cancelled_OOS_END").equalsIgnoreCase("Yes")) {
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if (data.get("Non_Renewed_Or_Declined_Coverage_OOS_END").equalsIgnoreCase("Yes")) {
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void fillOutAdditionalLocationBindingInformation_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists(data.get("Admitted_Line_RNW"));
        if (data.get("Existing_Agency_Client_RNW").equalsIgnoreCase("Yes")) {
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if (data.get("Any_Company_Refused_Or_Cancelled_RNW").equalsIgnoreCase("Yes")) {
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if (data.get("Non_Renewed_Or_Declined_Coverage_RNW").equalsIgnoreCase("Yes")) {
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void fillOutAdditionalLocationBindingInformation(Map<String, String> data, int i) throws Throwable {
        if (data.get("Existing_Agency_Client_" + i).equalsIgnoreCase("Yes")) {
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if (data.get("Any_Company_Refused_Or_Cancelled_" + i).equalsIgnoreCase("Yes")) {
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if (data.get("Non_Renewed_Or_Declined_Coverage_" + i).equalsIgnoreCase("Yes")) {
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void setExistingAgencyClientNo() throws Throwable {
        clickElement(existingAgencyClientNo);
    }

    public void setExistingAgencyClientYes() throws Throwable {
        clickElement(existingAgencyClientYes);
    }

    public void setCancelledOrRefusedNo() throws Throwable {
        clickElement(cancelledOrRefusedNo);
    }

    public void setCancelledOrRefusedYes() throws Throwable {
        clickElement(cancelledOrRefusedYes);
    }

    public void setCoverageNonRenewedOrDeclinedNo() throws Throwable {
        clickElement(coverageNonRenewedOrDeclinedNo);
    }

    public void setCoverageNonRenewedOrDeclinedYes() throws Throwable {
        clickElement(coverageNonRenewedOrDeclinedYes);
    }

    @Override
    public void verifyBlockExists(String lob) throws Throwable {
        if (!lob.equalsIgnoreCase("Collection"))
            super.verifyBlockExists("additional location binding information");
    }


}