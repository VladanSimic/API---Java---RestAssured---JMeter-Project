package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class MortgageeInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public MortgageeInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'mortgage on this location?')]/../../../../div//label[text()='No']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationNo;
    @FindBy(xpath = "//div[contains(text(),'mortgage on this location?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationYes;
    @FindBy(xpath = "//font[text()='Is there, or will there be a mortgage on this location? (Excluding lines of credit)']/../../../../../../div//label[text()='No']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationFontNo;
    @FindBy(xpath = "//font[text()='Is there, or will there be a mortgage on this location? (Excluding lines of credit)']/../../../../../../div//label[text()='Yes']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationFontYes;

    public void setIsThereOrWillBeMortgageOnThisLocation(String choose) throws Throwable {
        verifyBlockExists("mortgagee information");
        try {
            choose(isThereOrWillBeMortgageOnThisLocationYes, isThereOrWillBeMortgageOnThisLocationNo, choose);
        } catch (Exception e){}
        pause(6000);
        saveChanges();
    }

    public void setIsThereOrWillBeMortgageOnThisLocationFont(String choose) throws Throwable {
        verifyBlockExists("mortgagee information");
        choose(isThereOrWillBeMortgageOnThisLocationFontYes, isThereOrWillBeMortgageOnThisLocationFontNo, choose);
        pause(6000);
    }
}