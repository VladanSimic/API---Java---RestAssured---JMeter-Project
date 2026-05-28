package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class LinesOfBusinessBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public LinesOfBusinessBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Risk State']/../../../..//input")
    List<WebElement> riskState;
    @FindBy(xpath = "//div[text()='Admitted or Surplus Lines:']/../../../..//input")
    WebElement admittedOrSurplus;
    @FindBy(xpath = "//div[contains(text(),'Ex-wind')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement exWindYes;
    @FindBy(xpath = "//div[contains(text(),'Ex-wind')]/../../../../div//label[text()='No']/../span/input")
    WebElement exWindNo;

    public void fillOutLinesOfBusinessDetails(Map<String, String> data) throws Throwable {
        setRiskState(data.get("State"));
        selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));
        clickFooter();
        selectAdmittedLine(data.get("Admitted_Line"));

        switch (data.get("State")) {
            case "FL":
            case "TX": {
                setExWind(data.get("Ex_Wind"));
            }
            break;
        }
    }

    public void setRiskState(String riskStateValue) throws Throwable {
        pause(2000);
        typeTextEnter(riskState.get(0), riskStateValue, "Risk state");
        clickFooter();
    }

    public void selectAdmittedOrSurplus(String admittedOrSurplusValue) throws Throwable {
        if (isElementDisplayed(admittedOrSurplus)) {
            typeTextEnter(admittedOrSurplus, admittedOrSurplusValue, "Admitted or Surplus");
            clickFooter();
        }
    }

    public void setExWind(String exWind) throws Throwable {
        choose(exWindYes, exWindNo, exWind);
    }

    public void selectAdmittedLine(String admittedLineValue) {
        if (admittedLineValue.contains(",")) {
            for (int i = 0; i < admittedLineValue.split(",").length; i++) {
                clickElement(driver.findElement(By.xpath("//div[text()='client information']")), "Client information");
                try {
                    clickElement(driver.findElements(By.xpath("//label[text()='" + admittedLineValue.split(",")[i] + "']/../span/input")).get(0), "Admitted line");
                } catch (Exception e) {
                    try {
                        clickElement(driver.findElements(By.xpath("//label[text()='" + admittedLineValue.split(",")[i] + "']/../span/input")).get(1), "Admitted line");
                    } catch (Exception ee) {
                        System.out.println("\033[31m" + getCurrentDateTime() + " - Exception: Admitted line " + admittedLineValue + "could not be selected" + "\033[0m");
                    }
                }
            }
        } else {
            clickElement(driver.findElement(By.xpath("//div[text()='client information']")), "Client information");
            try {
                clickElement(driver.findElements(By.xpath("//label[text()='" + admittedLineValue + "']/../span/input")).get(0), "Admitted line");
            } catch (Exception e) {
                try {
                    clickElement(driver.findElements(By.xpath("//label[text()='" + admittedLineValue + "']/../span/input")).get(1), "Admitted line");
                } catch (Exception ee) {
                    System.out.println("\033[31m" + getCurrentDateTime() + " - Exception: Admitted line " + admittedLineValue + "could not be selected" + "\033[0m");
                }
            }
        }
    }

    public void fillOutLinesOfBusinessDetailsPF(Map<String, String> data) throws Throwable {
        setRiskState(data.get("State"));
        selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        pause(3000);
    }

}