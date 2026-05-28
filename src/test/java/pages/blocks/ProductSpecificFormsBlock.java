package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSpecificFormsBlock {
    WebDriver driver;

    public ProductSpecificFormsBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='generate forms for manual sign']")
    WebElement generateManualSign;

    public void setGenerateManualSign() {
        generateManualSign.click();
    }
}