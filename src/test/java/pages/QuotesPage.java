package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class QuotesPage extends CommonComponentsAndActions {
    WebDriver driver;

    public QuotesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='new quote']")
    List<WebElement> newQuote;
    @FindBy(xpath = "//span[text()='>>> select agency ']")
    WebElement selectAgency;
    @FindBy(xpath = "//span[text()='Broker #']")
    WebElement brokerColumnHeader;
    @FindBy(xpath = "//span[text()='Broker #']/../../../../div[2]")
    WebElement brokerColumnFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Number...']")
    List<WebElement> filterFields;
    @FindBy(xpath = "(//div[text()='Column']/../../../../../../../../../../..//input)[3]")
    WebElement searchQuoteField;
    @FindBy(xpath = "//div[text()='quotes (carrier)']/../../../../../..//table[@class='x-grid-item']//td[4]//span")
    WebElement searchedQuote1;
    @FindBy(xpath = "//div[text()='quotes (carrier)']/../../../../../..//table[@class='x-grid-item']//td[4]//div")
    WebElement searchedQuote2;
    @FindBy(xpath = "//div[text()='quotes (carrier)']/../../../../../..//table[@class='x-grid-item']//td[4]")
    WebElement searchedQuote3;

    public void newQuote() throws Throwable {
        clickElement(newQuote.get(0), "New quote");
    }

    public void searchAndSelectCustomAgency(String agencyName, String agencyId) throws Throwable {
        try {
            pause(3000);
            Actions action = new Actions(driver);
            action.moveToElement(brokerColumnHeader).click(brokerColumnFilterDropdown).build().perform();
            pause(2000);
            action.moveToElement(brokerColumnHeader).click(brokerColumnFilterDropdown).build().perform();
            pause(3000);
            clickElement(filters);
            pause(3000);
            action.moveToElement(filterFields.get(0)).sendKeys(agencyId).build().perform();
            pause(5000);
            clickFooter();
            clickElement(driver.findElement(By.xpath("//div[contains(text(),'" + agencyName + "')]/../../td[1]//span")));
            pause(3000);
            clickElement(selectAgency);

        } catch (Exception e) {
            pause(3000);
            Actions action = new Actions(driver);
            action.moveToElement(brokerColumnHeader).click(brokerColumnFilterDropdown).build().perform();
            pause(2000);
            action.moveToElement(brokerColumnHeader).click(brokerColumnFilterDropdown).build().perform();
            pause(3000);
            clickElement(filters);
            pause(3000);
            action.moveToElement(filterFields.get(0)).sendKeys(agencyId).build().perform();
            pause(5000);
            clickFooter();
            clickElement(driver.findElement(By.xpath("//div[contains(text(),'" + agencyName + "')]/../../td[1]//span")));
            pause(3000);
            clickElement(selectAgency);
        }
    }

    public void searchAndSelectAgencyAdvanced(String env, Map<String, String> data) throws Throwable {
        String brokerID = "";
        String agency = "";

        switch (env) {
            case "DEV": {
                brokerID = data.get("BrokerID_DEV");
                agency = data.get("Agency_Name_DEV");
            }
            break;
            case "DEV2": {
                brokerID = data.get("BrokerID_DEV2");
                agency = data.get("Agency_Name_DEV2");
            }
            break;
            case "AWS_DEV": {
                brokerID = data.get("BrokerID_AWS_DEV");
                agency = data.get("Agency_Name_AWS_DEV");
            }
            break;
            case "QA": {
                brokerID = data.get("BrokerID_QA");
                agency = data.get("Agency_Name_QA");
            }
            break;
            case "QA2": {
                brokerID = data.get("BrokerID_QA2");
                agency = data.get("Agency_Name_QA2");
            }
            break;
            case "AWS_QA": {
                brokerID = data.get("BrokerID_AWS_QA");
                agency = data.get("Agency_Name_AWS_QA");
            }
            break;
            case "STG": {
                brokerID = data.get("BrokerID_STG");
                agency = data.get("Agency_Name_STG");
            }
            break;
            case "AWS_STG": {
                brokerID = data.get("BrokerID_AWS_STG");
                agency = data.get("Agency_Name_AWS_STG");
            }
            break;
            case "DR_PROD":
            case "PRE_PROD":
            case "PROD": {
                brokerID = "14673900";
                agency = "System Validation Only LLC";
            }
            break;
            case "TRUEUP_DEV":
            case "TRUEUP_STG": {
                brokerID = "747290200";
                agency = "Underc0de";
            }
            break;
        }
        clickFooter();
        hoverElement(brokerColumnHeader, "Broker column header");
        pause(500);
        try {
            clickElement(brokerColumnFilterDropdown, "Filters dropdown");
        } catch (Exception e) {
            clickFooter();
            hoverElement(brokerColumnHeader, "Broker column header");
            pause(500);
            clickElement(brokerColumnFilterDropdown, "Filters dropdown");
        }
        pause(1000);
        hoverElement(filters, "Filters");
        pause(1000);
        hoverElement(filterFields.get(0), "Filter field");
        pause(1000);
        typeTextEnter(filterFields.get(0), brokerID, "Filter field");
        clickFooter();
        pause(3000);
        clickFooter();
        clickFooter();
        clickElement(driver.findElement(By.xpath("//div[contains(text(),'" + agency + "')]/../../td[1]//span")), "Agency: " + agency);
        clickElement(selectAgency, "Select agency");
    }

    public void tempSearchAndOpenQuote() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[text()='ID']/../../../.."))).click(driver.findElement(By.xpath("//span[text()='ID']/../../../../div[2]"))).perform();
        commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//a[@aria-label='Filters submenu']")));

        action.moveToElement(driver.findElements(By.xpath("//input[@placeholder='Enter Number...']")).get(0))
                .sendKeys(driver.findElements(By.xpath("//input[@placeholder='Enter Number...']")).get(0), "735478981879").perform();
        pause(3000);
        commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[contains(text(), \"Peganyee\")]")));
//        pause(3000);
        commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[contains(text(), 'quote details')]")));
//        pause(3000);
        commonComponentsAndActions.clickElement(driver.findElement(By.xpath("//span[contains(text(), 'rate')]")));
    }

    public void searchAndSelectAgency(Map<String, String> data, String ENV) throws Throwable {
        if (data.containsKey("AGENCY_NAME") && data.containsKey("AGENCY_ID")) {
            searchAndSelectCustomAgency(data.get("AGENCY_NAME"), data.get("AGENCY_ID"));
        } else {
            searchAndSelectAgencyAdvanced(ENV, data);
        }
    }

    public void searchAndSelectAQuote(String id) throws Throwable {
        typeTextEnter(searchQuoteField, id, "Search quote field");
        new CommonComponentsAndActions(driver).clickSearch();

        pause(3000);

        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Home Course of Construction')]/../..")))
                .moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Home Course of Construction')]/../..//td[4]")))
                .click(driver.findElement(By.xpath("//div[contains(text(),'Home Course of Construction')]/../..//td[4]//span")))
                .build()
                .perform();
    }

}