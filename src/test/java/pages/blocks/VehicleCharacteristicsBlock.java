package pages.blocks;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class VehicleCharacteristicsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public VehicleCharacteristicsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Acceleration 0 to 60']/../../../..//input")
    WebElement acceleration;
    @FindBy(xpath = "//div[text()='Engine Name']/../../../..//input")
    WebElement engineName;
    @FindBy(xpath = "//div[text()='Horsepower']/../../../..//input")
    WebElement horsepower;
    @FindBy(xpath = "//div[text()='Curb Weight']/../../../..//input")
    WebElement curbWeight;
    @FindBy(xpath = "//div[text()='Engine Type']/../../../..//input")
    WebElement engineType;
    @FindBy(xpath = "//div[text()='Torque']/../../../..//input")
    WebElement torque;

    public void verifyVehicleCharacteristicsBlock(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());
        for (List<String> columns : rows) {
            String accelerationVal = columns.get(0);
            String engineNameVal = columns.get(1);
            String horsepowerVal = columns.get(2);
            String curbWeightVal = columns.get(3);
            String engineTypeVal = columns.get(4);
            String torqueVal = columns.get(5);

            assertCellValue(acceleration, accelerationVal, "Acceleration");
            assertCellValue(engineName, engineNameVal, "Engine Name");
            assertCellValue(horsepower, horsepowerVal, "Horsepower");
            assertCellValue(curbWeight, curbWeightVal, "Curb Weight");
            assertCellValue(engineType, engineTypeVal, "Engine Type");
            assertCellValue(torque, torqueVal, "Torque");
        }
        reportScreenshot("VehicleCharacteristics" + System.currentTimeMillis(), "VehicleCharacteristics");
    }

    public void verifyPositionAfterLossPayeeBlock() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='loss payee/additional interest']/../../../../../../../../../../tr[7]//div[text()='vehicle characteristics']")).isDisplayed());
        reportScreenshot("VehicleCharacteristics" + System.currentTimeMillis(), "VehicleCharacteristics");
    }

}