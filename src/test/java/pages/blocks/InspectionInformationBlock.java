package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class InspectionInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public InspectionInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Name of Inspection Company']/../../../../div//..//input")
    WebElement nameOfInspectionCompany;
    @FindBy(xpath = "//div[text()='Inspection Date']/../../../../div//..//input")
    WebElement inspectionDate;

    public void fillOutInspectionInformation(String name, String date) throws Throwable {
        verifyBlockExists("inspection information");
        setInspectionCompanyName(name);
        setInspectionDate(date);
    }

    public void setInspectionCompanyName(String name) throws Throwable {
        typeText(nameOfInspectionCompany, name);
    }

    public void setInspectionDate(String date) throws Throwable {
        typeText(inspectionDate, date);
    }
}
