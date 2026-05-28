package steps.dragon.pages;

import excel.DataManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CustomerDocumentsPage;
import pages.RequiredFormsPage;
import pages.blocks.SignaturePreferenceBlock;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.List;
import java.util.Map;

public class RequiredFormsPageSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @And("I populate and send DocuSign documents to email {string} and broker email {string}")
    public void iPopulateAndSendDocuSignDocuments(String email, String brokerEmail) throws Throwable {

        new SignaturePreferenceBlock(driver).fillSignaturePreferenceNoReminder(email, brokerEmail);
//        List<WebElement> uncheckedBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and not(@checked)]"));
//        if (uncheckedBoxes.size() > 0){
//            for (int i = 0; i < uncheckedBoxes.size(); i++){
//                uncheckedBoxes.get(0).click();
//            }
//        }
        new RequiredFormsPage(driver).generateDocuments();
        new CommonComponentsAndActions(driver).clickSendEmailSignature();
        pause(5);
    }

}
