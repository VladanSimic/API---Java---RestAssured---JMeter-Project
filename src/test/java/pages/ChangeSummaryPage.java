package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;

public class ChangeSummaryPage extends CommonComponentsAndActions {

    WebDriver driver;

    public ChangeSummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void verifyChanges(String values) {
        String[] v = values.split(";");
        List<WebElement> elements = driver.findElements(By.xpath("//span[text()='New Value']/../../../../../../../../../div[2]//table//td[4]/div"));

        for (int i = 0; i < v.length; i++) {
            if (hasValue(elements.get(i).getText()) || hasValue(v[i])) {
                assertEquals(elements.get(i).getText(), v[i], "New value");
            }
        }
    }

}