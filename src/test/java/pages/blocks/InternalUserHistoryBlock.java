package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class InternalUserHistoryBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public InternalUserHistoryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = " //div[text()='Click to show user history']/../../../../div//input")
    WebElement clickToShowUserHistory;

    public void setClickToShowUserHistory(String checked) throws Throwable {
        checkCheckbox(clickToShowUserHistory, checked);
    }
}
