package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ManuscriptEndorsementBlock;
import pages.blocks.ManuscriptEndorsementsDetailsSubPage;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ManuscriptEndorsementsPage extends CommonComponentsAndActions {
    WebDriver driver;
    ManuscriptEndorsementBlock manuscriptEndorsementBlock;
    ManuscriptEndorsementsDetailsSubPage manuscriptEndorsementDetailsSubPage;

    public ManuscriptEndorsementsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        manuscriptEndorsementBlock = new ManuscriptEndorsementBlock(driver);
        manuscriptEndorsementDetailsSubPage = new ManuscriptEndorsementsDetailsSubPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='manuscript endorsements']")
    WebElement manuscriptEndorsementBlockElement;
    @FindBy(xpath = "//div[contains(text(),'Endorsement Text')]/../../../..//textarea")
    WebElement endorsementText;

    public void fillManuscriptEndorsementPageCC(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsCC(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageCC(data);
    }

    public void fillManuscriptEndorsementPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsCC_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageCC_END(data);
    }

    public void fillManuscriptEndorsementPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillManuscriptEndorsementPage(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsement_Num"))) {
            int num = Integer.parseInt(data.get("Manuscript_Endorsement_Num"));
            for (int i = 1; i <= num; i++) {
                clickElement(add);
                pause(2000);
                clickElement(manuscriptEndorsementBlockElement);
                setType(data.get("Manuscript_Endorsement_Type").split(",")[i - 1], i);
                setTitle(data.get("Manuscript_Endorsement_Title").split(",")[i - 1], i);
                setManualPremium(data.get("Manuscript_Endorsement_Manual_Premium").split(",")[i - 1], i);
            }
            for (int i = 1; i <= num; i++) {
                clickElement(driver.findElement(By.xpath("//a[text()='" + data.get("Manuscript_Endorsement_Title").split(",")[i - 1] + "']")));
                pause(1000);
                typeText(endorsementText, data.get("Manuscript_Endorsement_Text").split(",")[i - 1]);
            }
        }
    }

    public void fillManuscriptEndorsementPage_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        if (hasValue(data.get("Manuscript_Endorsement_Num_END"))) {
            int num = Integer.parseInt(data.get("Manuscript_Endorsement_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalManuscripts = i + Integer.parseInt(data.get("Manuscript_Endorsement_Num"));
                clickElement(add);
                pause(2000);
                clickElement(manuscriptEndorsementBlockElement);
                setType(data.get("Manuscript_Endorsement_Type_END").split(",")[i - 1], totalManuscripts);
                setTitle(data.get("Manuscript_Endorsement_Title_END").split(",")[i - 1], totalManuscripts);
                setManualPremium(data.get("Manuscript_Endorsement_Manual_Premium_END").split(",")[i - 1], totalManuscripts);
            }

            for (int i = 1; i <= num; i++) {
                clickElement(driver.findElement(By.xpath("//a[text()='" + data.get("Manuscript_Endorsement_Title_END").split(",")[i - 1] + "']")));
                pause(1000);
                typeText(endorsementText, data.get("Manuscript_Endorsement_Text_END").split(",")[i - 1]);
            }
        }
    }

    public void fillManuscriptEndorsementPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        if (hasValue(data.get("Manuscript_Endorsement_Num_OOS_END"))) {
            int num = Integer.parseInt(data.get("Manuscript_Endorsement_Num_OOS_END"));
            for (int i = 1; i <= num; i++) {
                int totalManuscripts = i + Integer.parseInt(data.get("Manuscript_Endorsement_Num"));
                clickElement(add);
                pause(2000);
                clickElement(manuscriptEndorsementBlockElement);
                setType(data.get("Manuscript_Endorsement_Type_OOS_END").split(",")[i - 1], totalManuscripts);
                setTitle(data.get("Manuscript_Endorsement_Title_OOS_END").split(",")[i - 1], totalManuscripts);
                setManualPremium(data.get("Manuscript_Endorsement_Manual_Premium_OOS_END").split(",")[i - 1], totalManuscripts);
            }

            for (int i = 1; i <= num; i++) {
                clickElement(driver.findElement(By.xpath("//a[text()='" + data.get("Manuscript_Endorsement_Title_OOS_END").split(",")[i - 1] + "']")));
                pause(1000);
                typeText(endorsementText, data.get("Manuscript_Endorsement_Text_OOS_END").split(",")[i - 1]);
            }
        }
    }

    public void fillManuscriptEndorsementPage_RNW(Map<String, String> data) throws Throwable {
        reviewPolicyImage();
        goToPage("Manuscript Endorsements");
        if (hasValue(data.get("Manuscript_Endorsement_Num_RNW"))) {
            int totalManuscripts = 0;
            int endorsementTotalManuscripts = Integer.parseInt(data.get("Manuscript_Endorsement_Num_END"));
            int num = Integer.parseInt(data.get("Manuscript_Endorsement_Num_RNW"));
            for (int i = 1; i <= num; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalManuscripts = i + Integer.parseInt(data.get("Manuscript_Endorsement_Num")) + endorsementTotalManuscripts;
                } else {
                    totalManuscripts = i + Integer.parseInt(data.get("Manuscript_Endorsement_Num"));
                }
                pause(5000);
                clickElement(add);
                pause(2000);
                clickElement(manuscriptEndorsementBlockElement);
                setType(data.get("Manuscript_Endorsement_Type_RNW").split(",")[i - 1], totalManuscripts);
                setTitle(data.get("Manuscript_Endorsement_Title_RNW").split(",")[i - 1], totalManuscripts);
                setManualPremium(data.get("Manuscript_Endorsement_Manual_Premium_RNW").split(",")[i - 1], totalManuscripts);
                saveChanges();
            }

            for (int i = 1; i <= num; i++) {
                clickElement(driver.findElement(By.xpath("//a[text()='" + data.get("Manuscript_Endorsement_Title_RNW").split(",")[i - 1] + "']")));
                pause(1000);
                typeText(endorsementText, data.get("Manuscript_Endorsement_Text_RNW").split(",")[i - 1]);
            }
        }
    }

    public void fillManuscriptEndorsementPagePA(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements_1");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsPA(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPagePA(data);
    }

    public void fillManuscriptEndorsementPagePA_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements_1");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsPA_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPagePA_END(data);
    }

    public void fillManuscriptEndorsementPagePA_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements_1");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsPA_OOS_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPagePA_OOS_END(data);
    }

    public void fillManuscriptEndorsementPagePA_RNW(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements_1");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsPA_RNW(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPagePA_RNW(data);
    }

    public void setType(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Type']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setTitle(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Title']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setManualPremium(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Manual Premium']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void fillManuscriptEndorsementPagePW(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        verifyBlockExists("manuscript endorsements");
    }

    public void fillManuscriptEndorsementPageHS(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHS(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHS(data);
    }

    public void fillManuscriptEndorsementPageHS_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHS_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHS_END(data);
    }

    public void fillManuscriptEndorsementPageHS_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHS_OOS_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHS_OOS_END(data);
    }

    public void fillManuscriptEndorsementPageHS_RNW(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHS_RNW(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHS_RNW(data);
    }

    public void fillManuscriptEndorsementPageHO(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHO(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHO(data);
    }

    public void fillManuscriptEndorsementPageHO_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHO_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHO_END(data);
    }

    public void fillManuscriptEndorsementPageHO_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHO_OOS_END(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHO_OOS_END(data);
    }

    public void fillManuscriptEndorsementPageHO_RNW(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHO_RNW(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHO_RNW(data);
    }

    public void fillManuscriptEndorsementPageHO(Map<String, String> data, int i) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsHO(data, i);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageHO(data, i);
    }

    public void fillManuscriptEndorsementPageFS(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsFS(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageFS(data);
    }


    public void fillManuscriptEndorsementPageCO(Map<String, String> data) throws Throwable {
        goToPage("Manuscript Endorsements");
        manuscriptEndorsementBlock.fillManuscriptEndorsementsDetailsCO(data);
        manuscriptEndorsementDetailsSubPage.fillManuscriptEndorsementDetailsSubPageCO(data);
    }
}