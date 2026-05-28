package pages.flows;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.UnderwritingReferralsPage;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

public class HomeownersFlow extends CommonComponentsAndActions {
    WebDriver driver;
    ConstructionDetailsBlock constructionDetailsBlock;
    MunicipalityTaxReportBlock municipalityTaxReportBlock;
    By locator;

    public HomeownersFlow(WebDriver driver) {
        super(driver);
        this.driver = driver;
        constructionDetailsBlock = new ConstructionDetailsBlock(driver);
        municipalityTaxReportBlock = new MunicipalityTaxReportBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillMissingDataOnRenewal(String state) throws Throwable {
        switch (state) {
            case "WA": {
                fillLocationPageWA();
            }
            break;
            case "KY": {
                fillKYTaxReport();
            }
            break;
        }
    }

    // Fill method for WA - Due to recent Protection Class changes on RNWL (default to - Select - )
    public void fillLocationPageWA() throws Throwable {
        locator = By.xpath(genericAhref.replace("$$", "WA"));
        UnderwritingReferralsPage page = new UnderwritingReferralsPage(driver);

        forEachNodePerformAction(locator, loc -> {
            try { constructionDetailsBlock.setProtectionClass("1"); } catch (Throwable e) {
                try {
                    page.approveReferralsIfDisplayedAndNavigateBackToPolicy(5, DataManager.getInstance().getData());
                    constructionDetailsBlock.setProtectionClass("1");
                } catch (Throwable ex) {
                    //
                }
            }
        });
    }

    // KY Tax Report is not being pulled 1 year in advance
    public void fillKYTaxReport() throws Throwable {
        locator = By.xpath(genericAhref.replace("$$", "KY"));
        forEachNodePerformAction(locator, loc -> {
            try {
                municipalityTaxReportBlock.fillKYTaxReportDummyData("HO");
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }

}
