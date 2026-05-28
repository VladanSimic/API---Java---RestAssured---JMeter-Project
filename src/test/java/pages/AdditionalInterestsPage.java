package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AdditionalInterestsBlock;
import pages.blocks.LlcTrustQuestionnaireBlock;
import pages.blocks.PleaseProvideThePrincipalBeneficialOwnersNameOrEmployeesBlock;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.HomeRatingCharacteristicsAvailableForPrefilBlock;

import java.util.List;
import java.util.Map;

public class AdditionalInterestsPage extends CommonComponentsAndActions {
    WebDriver driver;
    HomeRatingCharacteristicsAvailableForPrefilBlock homeRatingCharacteristicsAvailableForPrefilBlock;
    AdditionalInterestsBlock additionalInterestsBlock;
    TrustLlcOtherLegalEntityPage trustLlcOtherLegalEntityPage;


    public AdditionalInterestsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        homeRatingCharacteristicsAvailableForPrefilBlock = new HomeRatingCharacteristicsAvailableForPrefilBlock(driver);
        additionalInterestsBlock = new AdditionalInterestsBlock(driver);
        trustLlcOtherLegalEntityPage = new TrustLlcOtherLegalEntityPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Trust, LLC, Other Legal Entity - ')]")
    List<WebElement> llcNodes;

    public void fillOutAdditionalInterestsPage(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.deleteAllInterests();
        additionalInterestsBlock.fillAdditionalInterestsDetails(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest(data);
    }

    public void fillOutAdditionalInterestsPage_END(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.deleteAllInterests();
        additionalInterestsBlock.fillAdditionalInterestsDetails_END(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest_END(data);
    }

    public void fillOutAdditionalInterestsPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.deleteAllInterests();
        additionalInterestsBlock.fillAdditionalInterestsDetails_OOS_END(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest_OOS_END(data);
    }

    public void fillOutAdditionalInterestsPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.deleteAllInterests();
        additionalInterestsBlock.fillAdditionalInterestsDetails_RNW(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest_RNW(data);
    }

    public void fillOutAdditionalInterestsPage(Map<String, String> data, int i) throws Throwable {
        switch (data.get("State_" + i)) {
            case "DC": {
                homeRatingCharacteristicsAvailableForPrefilBlock.setAvailableForPrefill(data, i);
            }
            break;
        }
    }

    public void fillOutAdditionalInterestsPageCC(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsCC(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest(data);
    }

    public void fillOutAdditionalInterestsPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsCC_END(data);
    }

    public void fillOutAdditionalInterestsPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillOutAdditionalInterestsPageHS(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsHS(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterest(data);
    }

    public void fillOutAdditionalInterestsPageHS_END(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsHS_END(data);
    }

    public void fillOutAdditionalInterestsPageHS_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsHS_OOS_END(data);
    }

    public void fillOutAdditionalInterestsPageHS_RNW(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsHS_RNW(data);
    }

    public void fillOutAdditionalInterestsPageFS(Map<String, String> data) throws Throwable {
        goToPage("Additional Interests");
        additionalInterestsBlock.fillAdditionalInterestsDetailsFS(data);
        trustLlcOtherLegalEntityPage.fillTrustLlcOtherLegalEntityPageAdditionalInterestFS(data);
    }


}