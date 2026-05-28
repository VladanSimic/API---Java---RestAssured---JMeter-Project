package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class AssociatedUnderwritingGroupsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AssociatedUnderwritingGroupsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//span[text()='delete']")
    WebElement delete;
    @FindBy(xpath = "//div[text()='Underwriting Group']/../../../..//input")
    WebElement underwritingGroup;

    public void add() throws Throwable {
        clickElement(add);
    }

    public void setDelete() throws Throwable {
        clickElement(delete);
    }

    public void setUnderwritingGroup(String underwritingGroupText) throws Throwable {
        typeText(underwritingGroup, underwritingGroupText);
    }
}