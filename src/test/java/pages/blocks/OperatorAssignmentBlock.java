package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OperatorAssignmentBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OperatorAssignmentBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assignOperator(Map<String, String> data) throws Throwable {
        clickElement(driver.findElement(By.xpath("//div[text()='" + data.get("First_Name") + " " + data.get("Last_Name") + "']/../../..//td[2]/div")));
        pause(3000);
        clickElement(driver.findElement(By.xpath("//li[text()='" + data.get("Operator_Type") + "']")));
    }
}



