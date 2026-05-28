package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class CustomerDocumentsBlock extends CommonComponentsAndActions {
    public CustomerDocumentsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'upload')]")
    WebElement fileUpload;
    @FindBy(xpath = "//label[@class='dragndroplabel']//input")
    WebElement dragAndDropBtn;
    @FindBy(xpath = "//span[text()='next']")
    WebElement next;
    @FindBy(xpath = "//span[text()='Document']/../../../../../../../../../div//table//tr//td[2]/div")
    WebElement type;
    @FindBy(xpath = "//span[text()='Document']/../../../../../../../../../div//table//tr//td[3]/div")
    WebElement description;
    @FindBy(css = "#footer-panel-innerCt")
    WebElement footer;

    String filePath = System.getProperty("user.dir") + "/src/test/test_data/upload/";

    public void uploadFile(String file, String type, String description) throws Throwable {
        clickFileUpload();
        dragAndDropBtn.sendKeys(filePath + file);
        pause(5000);
        clickElement(next);
        setTypeAndDescription(type, description);
        clickElement(driver.findElement(By.xpath("//span[text()='save']")));
    }

    public void clickFileUpload() throws Throwable {
        clickElement(fileUpload, "File Upload");
        pause(3000);
    }

    public void setTypeAndDescription(String type, String description) throws Throwable {
        clickElement(footer);
        pause(2000);
        setType(type);
        clickElement(footer);
        pause(2000);
        setDescription(description);
        clickElement(footer);
        pause(1000);
    }

    public void setType(String value) {
        clickElement(type, "Type");
        typeTextEnter(driver.switchTo().activeElement(), value, "Type");
    }

    public void setDescription(String value) throws Throwable {
        clickElement(description, "Description");
        pause(2000);
        typeTextEnter(driver.switchTo().activeElement(), value, "Description");
    }

}
