package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountSummaryPage extends CommonComponentsAndActions {
    WebDriver driver;

    CreditScoreBlock creditScoreBlock;
    SummaryOfVehiclesBlock summaryOfVehiclesBlock;
    IncidentsBlock incidentsBlock;
    TotalNumberAccidentsViolationsInPolicyBlock totalNumberAccidentsViolationsInPolicyBlock;
    DiscountsAndSurchargesBlock discountsAndSurchargesBlock;

    public AccountSummaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        summaryOfVehiclesBlock = new SummaryOfVehiclesBlock(driver);
        creditScoreBlock = new CreditScoreBlock(driver);
        incidentsBlock = new IncidentsBlock(driver);
        totalNumberAccidentsViolationsInPolicyBlock = new TotalNumberAccidentsViolationsInPolicyBlock(driver);
        discountsAndSurchargesBlock = new DiscountsAndSurchargesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillAccountSummaryPagePA(Map<String, String> data) throws Throwable {
        if (goToPage("Account Summary")) {
            creditScoreBlock.fillCreditScoreDetailsPA(data);
            summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA(data);
            incidentsBlock.fillIncidentDetailsPA(data);
            totalNumberAccidentsViolationsInPolicyBlock.fillTotalNumberAccidentsViolationsInPolicyDetailsPA(data);
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA(data);
        }
    }

    public void fillAccountSummaryPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Account Summary")) {
            creditScoreBlock.fillCreditScoreDetailsPA_END(data);
            summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_END(data);
            incidentsBlock.fillIncidentDetailsPA_END(data);
            totalNumberAccidentsViolationsInPolicyBlock.fillTotalNumberAccidentsViolationsInPolicyDetailsPA_END(data);
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_END(data);
        }
    }

    public void fillAccountSummaryPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Account Summary")) {
            creditScoreBlock.fillCreditScoreDetailsPA_OOS_END(data);
            summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_OOS_END(data);
            incidentsBlock.fillIncidentDetailsPA_OOS_END(data);
            totalNumberAccidentsViolationsInPolicyBlock.fillTotalNumberAccidentsViolationsInPolicyDetailsPA_OOS_END(data);
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_OOS_END(data);
        }
    }

    public void fillAccountSummaryPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Account Summary")) {
            creditScoreBlock.fillCreditScoreDetailsPA_RNW(data);
            summaryOfVehiclesBlock.fillSummaryOfVehiclesDetailsPA_RNW(data);
            incidentsBlock.fillIncidentDetailsPA_RNW(data);
            totalNumberAccidentsViolationsInPolicyBlock.fillTotalNumberAccidentsViolationsInPolicyDetailsPA_RNW(data);
            discountsAndSurchargesBlock.fillDiscountsAndSurchargesDetailsPA_RNW(data);
        }
    }

    public boolean isTabBetween(String tabBefore, String targetTab, String tabAfter) {
        List<WebElement> tabs = driver.findElements(By.xpath("//a[contains(@class, 'tabAreaToolBtn')]"));

        List<String> tabTexts = new ArrayList<>();
        for (WebElement tab : tabs) {
            String text = tab.getText().trim();
            if (!text.isEmpty()) {
                tabTexts.add(text);
            }
        }

        int indexBefore = tabTexts.indexOf(tabBefore);
        int indexTarget = tabTexts.indexOf(targetTab);
        int indexAfter = tabTexts.indexOf(tabAfter);

        return (indexBefore != -1 && indexTarget != -1 && indexAfter != -1
                && indexBefore < indexTarget && indexTarget < indexAfter);
    }

}
