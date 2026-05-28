package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class AllPoliciesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AllPoliciesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPolicyID() throws Throwable {
        Thread.sleep(10000);
        if (isVisibleOnly(By.xpath("//div[@osviewid='PAI_118101_OT_24_OI_1_BI_1817833_CI_18728633']"))) {
            return driver.findElement(By.xpath("//div[@osviewid='PAI_118101_OT_24_OI_1_BI_1817833_CI_18728633']")).getText();
        } else {
            if (ENV.equalsIgnoreCase("DEV2") || ENV.equalsIgnoreCase("QA2") || ENV.equalsIgnoreCase("AWS_QA")) {
                pause(45000);
            }
            return driver.findElement(By.xpath("//div[@osviewid='PAI_118101_OT_24_OI_1_BI_1817833_CI_18728633']/span")).getText();
        }
    }

    public String getFSPolicyID() throws Throwable {
        Thread.sleep(5000);
        if (isVisibleOnly(By.xpath("//div[text()='all policies']/../../../../../..//table//tr[@role='row']//span[contains(text(),'FS')]"))) {
            return driver.findElement(By.xpath("//div[text()='all policies']/../../../../../..//table//tr[@role='row']//span[contains(text(),'FS')]")).getText();
        } else {
            if (ENV.equalsIgnoreCase("DEV2") || ENV.equalsIgnoreCase("QA2") || ENV.equalsIgnoreCase("AWS_QA")) {
                pause(20000);
            }
            return driver.findElement(By.xpath("//div[text()='all policies']/../../../../../..//table//tr[@role='row']//span[contains(text(),'FS')]")).getText();
        }
    }
}