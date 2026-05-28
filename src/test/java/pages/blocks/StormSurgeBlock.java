package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class StormSurgeBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public StormSurgeBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[text()='Surge Score']/../../../../..//input")
    WebElement surgeScore;

    public void verifySurgeScore(String value) {
        assertCellValue(surgeScore, value, "Surge Score");
    }

}