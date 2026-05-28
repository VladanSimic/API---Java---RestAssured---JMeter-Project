package pages.blocks;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ListOfOperatorsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ListOfOperatorsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='First Name']/../../../../../../../../..//tr/td[1]/div")
    List<WebElement> firstName;
    @FindBy(xpath = "//span[text()='First Name']/../../../../../../../../..//tr/td[2]/div")
    List<WebElement> lastName;
    @FindBy(xpath = "//span[text()='First Name']/../../../../../../../../..//tr/td[3]/div")
    List<WebElement> dob;
    @FindBy(xpath = "//span[text()='First Name']/../../../../../../../../..//tr/td[4]/div")
    List<WebElement> relationshipToInsured;
    @FindBy(xpath = "//div[contains(text(),'list of operators')]/../../../../../..//span[text()='add']")
    WebElement addBtn;
    @FindBy(xpath = "//div[contains(text(),'list of operators')]")
    WebElement block;

    public void fillListOfOperatorsDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("list of operators");
        String[] operators = data.get("List_Of_Operators").split(",");

        if (operators.length > 1) {
            for (int i = 1; i <= operators.length; i++) {
                clickAdd();
                clickBlock();
                setFirstName(data.get("List_Of_Operators_First_Name_" + i), i);
                setLastName(data.get("List_Of_Operators_Last_Name_" + i), i);
                setDOB(data.get("List_Of_Operators_DOB_" + i), i);
                setRelationshipToInsured(data.get("List_Of_Operators_First_Relationship_To_Insured_" + i), i);
            }
        }
    }

    public void clickBlock() {
        clickElement(block, "block");
    }

    public void setFirstName(String value, int i) {
        if (hasValue(value)) {
            clickElement(firstName.get(i), "First Name_" + i);
            typeText(driver.switchTo().activeElement(), value, "First Name_" + i);
        }
    }

    public void setLastName(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(lastName.get(i), "Last Name_" + i);
            typeText(driver.switchTo().activeElement(), value, "Last Name_" + i);
            clickFooter();
            pause(1000);
        }
    }

    public void setDOB(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(dob.get(i), "DOB_" + i);
            typeText(driver.switchTo().activeElement(), value, "DOB_" + i);
            clickFooter();
        }
    }

    public void setRelationshipToInsured(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(relationshipToInsured.get(i), "Relationship to Insured_" + i);
            typeText(driver.switchTo().activeElement(), value, "Relationship to Insured_" + i);
        }
    }

    public void clickAdd() throws InterruptedException {
        clickElement(addBtn, "add");
        pause(2000);
    }

}



