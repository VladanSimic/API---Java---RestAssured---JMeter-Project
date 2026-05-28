package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import java.util.List;

public class eSignPackagesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public eSignPackagesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyDocuSignHistoryBlock(int index, String expected, String columnNumber) {
        List<WebElement> column = driver.findElements(By.xpath("//*[contains(text(),'history')]/../../../../../..//tr/td["+columnNumber+"]"));

        if (index < 0 || index >= column.size()) {
            failAssertion("Invalid index: " + index);
        }

        WebElement columnHistory = column.get(index);
        String elementText = columnHistory.getText().trim();

        if (!elementText.contains(expected)) {
            scrollToWebElement(columnHistory);
            reportScreenshot("Screenshot", "Column History mismatch. Expected: " + expected + " | Actual: " + elementText);
            failAssertion("Column History mismatch. Expected: " + expected + " | Actual: " + elementText);
        }  else {
            scrollToWebElement(columnHistory);
            reportScreenshot("Screenshot", "Column History match. Column Product': " + elementText);
            successLog("Column History match. Column History: " + elementText);
        }
    }

}