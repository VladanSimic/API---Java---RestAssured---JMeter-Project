package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.DriverViolationsBlock;
import pages.blocks.TotalNumberAccidentsViolationsInPolicyBlock;
import pages.blocks.WatercraftInformationBlock;

import java.util.Map;

public class WatercraftInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    WatercraftInformationBlock watercraftInformationBlock;
    DriverViolationsBlock driverViolationsBlock;
    TotalNumberAccidentsViolationsInPolicyBlock totalNumberAccidentsViolationsInPolicyBlock;

    public WatercraftInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        watercraftInformationBlock = new WatercraftInformationBlock(driver);
        driverViolationsBlock = new DriverViolationsBlock(driver);
        totalNumberAccidentsViolationsInPolicyBlock = new TotalNumberAccidentsViolationsInPolicyBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillWatercraftInformationPage(Map<String, String> data) throws Throwable {
        goToPage("Watercraft Information");
        //Old method - try to replace
        watercraftInformationBlock.addWatercraftsDetails(data);
        //New method - 09/10/2025
        watercraftInformationBlock.addWatercraftEX(data);
        verifyBlockExists("xxx-driver Violations");
        verifyBlockExists("xxx-total number accident/violations in policy");
    }

    public void fillWatercraftInformationPage_END(Map<String, String> data) throws Throwable {
        goToPage("Watercraft Information");
        watercraftInformationBlock.addWatercraftsDetails_END(data);
    }

    public void fillWatercraftInformationPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Watercraft Information");
        watercraftInformationBlock.addWatercraftsDetails_OOS_END(data);
    }

    public void fillWatercraftInformationPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Watercraft Information");
        watercraftInformationBlock.addWatercraftsDetails_RNW(data);
    }

}
