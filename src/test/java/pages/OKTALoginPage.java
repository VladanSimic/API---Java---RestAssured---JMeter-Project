package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.ArrayList;

public class OKTALoginPage extends CommonComponentsAndActions {
    WebDriver driver;

    public OKTALoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@autocomplete='username']")
    WebElement oktaUsername;
    @FindBy(xpath = "//input[@autocomplete='current-password']")
    WebElement oktaPassword;
    @FindBy(xpath = "//input[@value='Sign in']")
    WebElement oktaLogin;
    @FindBy(xpath = "//input[@value=\"Send Push\"]/..")
    WebElement oktaPush;
    @FindBy(css = "[aria-label='launch app Pure Online Staging']")
    WebElement QATile;
    @FindBy(css = "[aria-label='launch app Pure Online Staging']")
    WebElement STGTile;
    @FindBy(css = "[aria-label='launch app Pure Online (Prod)']")
    WebElement PRODTile;
    @FindBy(css = "[aria-label='launch app Dragon Dev AWS - Senior UM']")
    WebElement AWS_DEV;
    @FindBy(css = "[aria-label='launch app Pure Online QA']")
    WebElement AWS_QA;
    @FindBy(css = "[aria-label='launch app Dragon Staging AWS']")
    WebElement AWS_STG;
    @FindBy(css = "[aria-label='launch app Dragon Prod AWS (rehearse.purehnw.com)']")
    WebElement DR_PROD;
    @FindBy(css = "[aria-label='launch app Dragon PreProd AWS']")
    WebElement PRE_PROD;

    public void openOKTA(String username, String password) throws Throwable {
        driver.get("https://pure.okta.com/");
        typeText(oktaUsername, username);
        typeText(oktaPassword, password);
//        clickElement(oktaLogin);
    }

    public void openOKTA(String user) throws Throwable {
        driver.get("https://pure.okta.com/");
        switch (user) {
            case "AOT": {
                pause(5000);
                OKTATypeText(oktaUsername, "aotasevic@privilegeunderwriters.com");
                pause(5000);
                OKTATypeText(oktaPassword, "xxxxxxx");
            }
            break;
            case "A1": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation1@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "Automation1": {
                typeText(oktaUsername, "Pureonlineautomation1@pureinsurance.com", "OKTA Username");
                typeText(oktaPassword, "Pr0dt3sting", "OKTA Password");
            }
            break;
            case "A2": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation2@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A3": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation3@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A4": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation4@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A5": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation5@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A6": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation6@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A7": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation7@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A8": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation8@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A15": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation15@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A17": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation17@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A18": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation18@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            case "A19": {
                pause(5000);
                OKTATypeText(oktaUsername, "Pureonlineautomation19@pureinsurance.com");
                pause(5000);
                OKTATypeText(oktaPassword, "Pr0dt3sting");
            }
            break;
            //TODO Add all users, rename cases USER
            default:
                throw new Exception("No such OKTA user!");
        }

        clickElement(oktaLogin, "OKTA Login");

        while (driver.findElements(By.xpath("//p[text()='You exceeded the maximum number of requests. Try again in a while.']")).size() > 0) {
            pause(2000);
            clickElement(oktaLogin, "OKTA Login");
        }
    }

    public void selectOKTATile(String env) throws InterruptedException {
        if (env.equalsIgnoreCase("PROD")) {
            clickElement(PRODTile, "PROD Tile");
        } else if (env.equalsIgnoreCase("STG")) {
            clickElement(STGTile, "STG Tile");
        } else if (env.equalsIgnoreCase("QA")) {
            clickElement(QATile, "QA Tile");
        } else if (env.equalsIgnoreCase("AWS_DEV")) {
            clickElement(AWS_DEV, "AWS DEV Tile");
        } else if (env.equalsIgnoreCase("AWS_QA")) {
            clickElement(AWS_QA, "AWS QA Tile");
        } else if (env.equalsIgnoreCase("AWS_STG")) {
            clickElement(STGTile, "AWS STG Tile");
        } else if (env.equalsIgnoreCase("DR_PROD")) {
            clickElement(DR_PROD, "AWS PROD Tile");
        } else if (env.equalsIgnoreCase("PRE_PROD")) {
            clickElement(PRE_PROD, "PRE PROD Tile");
        }
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        pause(2500);
    }

}
