package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class AnimalInformationBlock extends CommonComponentsAndActions {
    public AnimalInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Pet name')]/../../../../../../../../..//tr//td[1]/div")
    List<WebElement> petName;
    @FindBy(xpath = "//*[contains(text(),'Breed')]/../../../../../../../../..//tr//td[2]/div")
    List<WebElement> breed;
    @FindBy(xpath = "//*[contains(text(),'Description')]/../../../../../../../../..//tr//td[3]/div")
    List<WebElement> description;
    @FindBy(xpath = "//div[text()='animal information']/../../../../../..//*[text()='add']")
    WebElement addBtn;
    @FindBy(xpath = "//div[text()='animal information']")
    WebElement animalInformationBlock;

    public void clickAdd() {
        clickElement(addBtn, "Add");
    }

    public void clickBlock() {
        clickElement(animalInformationBlock, "Property information block");
    }

    public void setBreed(String value, int index) throws Throwable {
        clickElement(breed.get(index), "Usage");
        typeText(driver.switchTo().activeElement(), value, "Breed");
    }

    public void setPetName(String value, int index) throws Throwable {
        clickElement(petName.get(index), "Usage");
        typeText(driver.switchTo().activeElement(), value, "Pet Name");

    }

    public void setDescription(String value, int index) throws Throwable {
        clickElement(description.get(index), "Usage");
        typeText(driver.switchTo().activeElement(), value, "Description");
    }

    public void fillAnimalInformationBlockHS(Map<String, String> data) throws Throwable {
        int properties = data.get("Optional_Coverages_Animal_Information").split(",").length;
        for (int i = 0; i < properties; i++) {
            clickAdd();
        }
        for (int i = 0; i < properties; i++) {
            clickBlock();
            setPetName(data.get("Animal_Information_Pet_Name" + (i + 1)), i);
            setBreed(data.get("Animal_Information_Breed" + (i + 1)), i);
            setDescription(data.get("Animal_Information_Description" + (i + 1)), i);
        }
        saveChanges();
    }
}