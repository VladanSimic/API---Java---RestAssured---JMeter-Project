package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ManuscriptEndorsementBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ManuscriptEndorsementBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "(//div[text()='Type']/../../../..//input)|(//div[text()='manuscript endorsements']/../../../../../..//table//td[1]/div)")
    List<WebElement> type;
    @FindBy(xpath = "(//div[text()='Title']/../../../..//input)|(//div[text()='manuscript endorsements']/../../../../../..//table//td[2]/div)")
    List<WebElement> title;
    @FindBy(xpath = "(//div[text()='Manual Premium']/../../../..//input)|(//div[text()='manuscript endorsements']/../../../../../..//table//td[3]/div)")
    List<WebElement> manualPremium;
    @FindBy(xpath = "//div[text()='Annual ROL Override']/../../../..//input")
    List<WebElement> annualROLOverride;
    @FindBy(xpath = "//div[text()='System Non-Wind Annual ROL']/../../../..//input")
    List<WebElement> systemNonWindAnnualROL;
    @FindBy(xpath = "//div[text()='System Wind Annual ROL']/../../../..//input")
    List<WebElement> systemWindAnnualROL;
    @FindBy(xpath = "//div[text()='System Wildfire Annual ROL']/../../../..//input")
    List<WebElement> systemWildfireAnnualROL;
    @FindBy(xpath = "//div[contains(text(),'manuscript endorsements')]")
    WebElement block;
    @FindBy(xpath = "//div[text()='manuscript endorsements']/../../../../../..//table//td[3]/div")
    List<WebElement> annualManualPremium;
    @FindBy(xpath = "//div[text()='manuscript endorsements']/../../../../../..//table//td[4]//button")
    List<WebElement> deleteManuscriptEndorsement;

    public void fillManuscriptEndorsementsDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements"))) {

            int endorsements = data.get("Manuscript_Endorsements").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);

                if (endorsements == 1) {
                    setTypeCC(data.get("Manuscript_Endorsements_Type"), i);
                    setTitle(data.get("Manuscript_Endorsements_Title"), i);

                    if (hasValue(data.get("Manuscript_Endorsements_Type"))) {
                        switch (data.get("Manuscript_Endorsements_Type")) {
                            case "Manuscript Endorsement":
                            case "Optional Coverage Premium Adjustment": {
                                setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium"), i);
                            }
                            break;
                            case "Non-Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"), i);
                                setSystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL"), i);
                            }
                            break;
                            case "Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"), i);
                                setSystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL"), i);
                            }
                            break;
                            case "Wildfire Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"), i);
                                setSystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL"), i);
                            }
                            break;
                        }
                    }
                } else {
                    setTypeCC(data.get("Manuscript_Endorsements_Type_" + (i + 1)), i);
                    setTitle(data.get("Manuscript_Endorsements_Title_" + (i + 1)), i);

                    if (hasValue(data.get("Manuscript_Endorsements_Type_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_" + (i + 1))) {
                            case "Manuscript Endorsement":
                            case "Optional Coverage Premium Adjustment": {
                                setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_" + (i + 1)), i);
                            }
                            break;
                            case "Non-Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)), i);
                                setSystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_" + (i + 1)), i);
                            }
                            break;
                            case "Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)), i);
                                setSystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_" + (i + 1)), i);
                            }
                            break;
                            case "Wildfire Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)), i);
                                setSystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_" + (i + 1)), i);
                            }
                            break;
                        }
                    }
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsCC_END(Map<String, String> data) throws Throwable {
        //TODO account for NB entries, enable removing entries on end CC
        if (hasValue(data.get("Manuscript_Endorsements_END"))) {

            int endorsements = data.get("Manuscript_Endorsements_END").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);

                if (endorsements == 1) {
                    setTypeCC(data.get("Manuscript_Endorsements_Type_END"), i);
                    setTitle(data.get("Manuscript_Endorsements_Title_END"), i);

                    switch (data.get("Manuscript_Endorsements_Type_END")) {
                        case "Manuscript Endorsement":
                        case "Optional Coverage Premium Adjustment": {
                            setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_END"), i);
                        }
                        break;
                        case "Non-Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"), i);
                            setSystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_END"), i);
                        }
                        break;
                        case "Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"), i);
                            setSystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_END"), i);
                        }
                        break;
                        case "Wildfire Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"), i);
                            setSystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_END"), i);
                        }
                        break;
                    }
                } else {
                    setTypeCC(data.get("Manuscript_Endorsements_Type_END_" + (i + 1)), i);
                    setTitle(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)), i);

                    switch (data.get("Manuscript_Endorsements_Type_END_" + (i + 1))) {
                        case "Manuscript Endorsement":
                        case "Optional Coverage Premium Adjustment": {
                            setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_END_" + (i + 1)), i);
                        }
                        break;
                        case "Non-Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)), i);
                            setSystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_END_" + (i + 1)), i);
                        }
                        break;
                        case "Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)), i);
                            setSystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_END_" + (i + 1)), i);
                        }
                        break;
                        case "Wildfire Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)), i);
                            setSystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_END_" + (i + 1)), i);
                        }
                        break;
                    }
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements"))) {
            num = data.get("Manuscript_Endorsements").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickAdd();
            pause(120000);
            try {
                clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
            } catch (Exception e) {
                //TODO PA BUG - Check what data is being entered, ug happends on UI when text is added not a number - HIGH
                //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
            }
            setManuscriptEndorsementTypePA(data.get("Manuscript_Endorsements_Type_" + i), i);
            setManuscriptEndorsementTitlePA(data.get("Manuscript_Endorsements_Title_" + i), i);
            setManuscriptEndorsementAnnualManualPremiumPA(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + i), i);
        }
        saveChanges();
        try {
            clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
        } catch (Exception e) {
            //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
        }
    }

    public void fillManuscriptEndorsementsDetailsPA_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_END"))) {
            num = data.get("Manuscript_Endorsements_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickAdd();
            try {
                clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
            } catch (Exception e) {
                //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
            }
            setManuscriptEndorsementTypePA(data.get("Manuscript_Endorsements_Type_END_" + i), i);
            setManuscriptEndorsementTitlePA(data.get("Manuscript_Endorsements_Title_END_" + i), i);
            setManuscriptEndorsementAnnualManualPremiumPA(data.get("Manuscript_Endorsements_Annual_Manual_Premium_END_" + i), i);
        }
        saveChanges();
        try {
            clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
        } catch (Exception e) {
            //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
        }
        //TODO PA END - Manuscript endorsement - Mid
    }

    public void fillManuscriptEndorsementsDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_OOS_END"))) {
            num = data.get("Manuscript_Endorsements_OOS_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickAdd();
            try {
                clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
            } catch (Exception e) {
                //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
            }
            setManuscriptEndorsementTypePA(data.get("Manuscript_Endorsements_Type_OOS_END_" + i), i);
            setManuscriptEndorsementTitlePA(data.get("Manuscript_Endorsements_Title_OOS_END_" + i), i);
            setManuscriptEndorsementAnnualManualPremiumPA(data.get("Manuscript_Endorsements_Annual_Manual_Premium_OOS_END_" + i), i);
        }
        saveChanges();
        try {
            clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
        } catch (Exception e) {
            //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
        }
        //TODO PA OOS - Manuscript endorsement - Mid
    }

    public void fillManuscriptEndorsementsDetailsPA_RNW(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_RNW"))) {
            num = data.get("Manuscript_Endorsements_RNW").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            clickAdd();
            try {
                clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
            } catch (Exception e) {
                //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
            }
            setManuscriptEndorsementTypePA(data.get("Manuscript_Endorsements_Type_RNW_" + i), i);
            setManuscriptEndorsementTitlePA(data.get("Manuscript_Endorsements_Title_RNW_" + i), i);
            setManuscriptEndorsementAnnualManualPremiumPA(data.get("Manuscript_Endorsements_Annual_Manual_Premium_RNW_" + i), i);
        }
        saveChanges();
        try {
            clickElement(driver.findElement(By.xpath("//div[@data-qtip=\"Close dialog\"]")), "Exception window close");
        } catch (Exception e) {
            //TEMP REMOVE WHEN ERROR IS REMOVED FROM UI
        }
        //TODO PA RNW - Manuscript endorsement - Mid
    }

    public void fillManuscriptEndorsementsDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements"))) {

            int endorsements = data.get("Manuscript_Endorsements").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickBlock();

                if (endorsements == 1) {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_1"), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_1"), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"), i);
                } else {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_" + (i + 1)), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_" + (i + 1)), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsHS_END(Map<String, String> data) throws Throwable {
        boolean hasManuscriptEndorsements = (data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("Yes") && data.get("Manuscript_Endorsements_Yes_Or_No_END").equalsIgnoreCase("Yes") || data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("No") && data.get("Manuscript_Endorsements_Yes_Or_No_END").equalsIgnoreCase("Yes"));

        String[] manuscriptEndorsementsNB = data.get("Manuscript_Endorsements").split(",");
        String[] manuscriptEndorsementsEND = data.get("Manuscript_Endorsements_END").split(",");

        if (hasManuscriptEndorsements) {

            int totalmanuscriptEndorsements = manuscriptEndorsementsNB.length;

            //ADD
            for (int i = 1; i <= manuscriptEndorsementsEND.length; i++) {
                if (manuscriptEndorsementsEND[i - 1].contains("_ADD")) {
                    totalmanuscriptEndorsements++;

                    clickAdd();
                    pause(3000);
                    clickBlock();
                    pause(3000);

                    setTypeHS(data.get("Manuscript_Endorsements_Type_END_" + i), totalmanuscriptEndorsements - 1);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_END_" + i), totalmanuscriptEndorsements - 1);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_END_" + i), totalmanuscriptEndorsements - 1);
                }
                saveChanges();
            }
            for (int i = 0; i < manuscriptEndorsementsEND.length; i++) {
                if (manuscriptEndorsementsEND[i].contains("_END_DEL")) {
                    for (int j = 0; j < manuscriptEndorsementsNB.length; j++) {
                        if (manuscriptEndorsementsNB[j].equalsIgnoreCase(manuscriptEndorsementsEND[i].split("_END_DEL")[0])) {
                            clickElement(deleteManuscriptEndorsement.get(j), "Click delete");
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementsDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        boolean hasManuscriptEndorsements = (data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("Yes") && data.get("Manuscript_Endorsements_Yes_Or_No_OOS_END").equalsIgnoreCase("Yes") || data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("No") && data.get("Manuscript_Endorsements_Yes_Or_No_OOS_END").equalsIgnoreCase("Yes"));

        String[] manuscriptEndorsementsNB = data.get("Manuscript_Endorsements").split(",");
        String[] manuscriptEndorsementsOOSEND = data.get("Manuscript_Endorsements_OOS_END").split(",");

        if (hasManuscriptEndorsements) {

            int totalmanuscriptEndorsements = manuscriptEndorsementsNB.length;

            //ADD
            for (int i = 1; i <= manuscriptEndorsementsOOSEND.length; i++) {
                if (manuscriptEndorsementsOOSEND[i - 1].contains("_ADD")) {
                    totalmanuscriptEndorsements++;

                    clickAdd();
                    pause(3000);
                    clickBlock();
                    pause(3000);

                    setTypeHS(data.get("Manuscript_Endorsements_Type_OOS_END_" + i), totalmanuscriptEndorsements - 1);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_OOS_END_" + i), totalmanuscriptEndorsements - 1);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_OOS_END_" + i), totalmanuscriptEndorsements - 1);
                }
                saveChanges();
            }
            for (int i = 0; i < manuscriptEndorsementsOOSEND.length; i++) {
                if (manuscriptEndorsementsOOSEND[i].contains("_OOS_END_DEL")) {
                    for (int j = 0; j < manuscriptEndorsementsNB.length; j++) {
                        if (manuscriptEndorsementsNB[j].equalsIgnoreCase(manuscriptEndorsementsOOSEND[i].split("_OOS_END_DEL")[0])) {
                            clickElement(deleteManuscriptEndorsement.get(j), "Click delete");
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementsDetailsHS_RNW(Map<String, String> data) throws Throwable {
        boolean hasManuscriptEndorsements = (data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("Yes") && data.get("Manuscript_Endorsements_Yes_Or_No_RNW").equalsIgnoreCase("Yes") || data.get("Manuscript_Endorsements_Yes_Or_No").equalsIgnoreCase("No") && data.get("Manuscript_Endorsements_Yes_Or_No_RNW").equalsIgnoreCase("Yes"));

        String[] manuscriptEndorsementsNB = data.get("Manuscript_Endorsements").split(",");
        String[] manuscriptEndorsementsEND = data.get("Manuscript_Endorsements_RNW").split(",");

        if (hasManuscriptEndorsements) {

            int totalmanuscriptEndorsements = manuscriptEndorsementsNB.length;

            //ADD
            for (int i = 1; i <= manuscriptEndorsementsEND.length; i++) {
                if (manuscriptEndorsementsEND[i - 1].contains("_ADD")) {
                    totalmanuscriptEndorsements++;

                    clickAdd();
                    pause(3000);
                    clickBlock();
                    pause(3000);

                    setTypeHS(data.get("Manuscript_Endorsements_Type_RNW_" + i), totalmanuscriptEndorsements - 1);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_RNW_" + i), totalmanuscriptEndorsements - 1);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_RNW_" + i), totalmanuscriptEndorsements - 1);
                }
                saveChanges();
            }
            for (int i = 0; i < manuscriptEndorsementsEND.length; i++) {
                if (manuscriptEndorsementsEND[i].contains("_RNW_DEL")) {
                    for (int j = 0; j < manuscriptEndorsementsNB.length; j++) {
                        if (manuscriptEndorsementsNB[j].equalsIgnoreCase(manuscriptEndorsementsEND[i].split("_RNW_DEL")[0])) {
                            clickElement(deleteManuscriptEndorsement.get(j), "Click delete RNW");
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementsDetailsHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements"))) {
            int endorsements = data.get("Manuscript_Endorsements").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickBlock();

                if (endorsements == 1) {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_1"), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_1"), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"), i);
                } else {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_" + (i + 1)), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_" + (i + 1)), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements_END"))) {
            int endorsements = data.get("Manuscript_Endorsements_END").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickBlock();

                if (endorsements == 1) {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_1_END"), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_1_END"), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_END"), i);
                } else {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_END_" + (i + 1)), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_END_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements_RNW"))) {
            int endorsements = data.get("Manuscript_Endorsements_RNW").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickBlock();

                if (endorsements == 1) {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_1_RNW"), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_1_RNW"), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_RNW"), i);
                } else {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_RNW_" + (i + 1)), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_RNW_" + (i + 1)), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_RNW_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements_OOS_END"))) {
            int endorsements = data.get("Manuscript_Endorsements_OOS_END").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickBlock();

                if (endorsements == 1) {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_1_OOS_END"), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_1_OOS_END"), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_OOS_END"), i);
                } else {
                    setTypeHS(data.get("Manuscript_Endorsements_Type_OOS_END_" + (i + 1)), i);
                    setTitleHS(data.get("Manuscript_Endorsements_Title_OOS_END_" + (i + 1)), i);
                    setAnnualManualPremiumHS(data.get("Manuscript_Endorsements_Annual_Manual_Premium_OOS_END_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementsDetailsHO(Map<String, String> data, int i) throws Throwable {
        //TODO
    }

    public void fillManuscriptEndorsementsDetailsCO(Map<String, String> data) throws Throwable {
        verifyBlockExists("manuscript endorsements");
        if (hasValue(data.get("Manuscript_Endorsements"))) {

            int endorsements = data.get("Manuscript_Endorsements").split(",").length;

            for (int i = 0; i < endorsements; i++) {
                clickAdd();
                pause(2000);
                clickFooter();

                if (endorsements == 1) {
                    setTypeCO(data.get("Manuscript_Endorsements_Type_1"), i);
                    setTitleCO(data.get("Manuscript_Endorsements_Title_1"), i);
                    setAnnualManualPremiumCO(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"), i);
                } else {
                    setTypeCO(data.get("Manuscript_Endorsements_Type_" + (i + 1)), i);
                    setTitleCO(data.get("Manuscript_Endorsements_Title_" + (i + 1)), i);
                    setAnnualManualPremiumCO(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + (i + 1)), i);
                }
            }
        }
        saveChanges();
    }

    public void setTitleCO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(title.get(i), "Title" + i);
            typeText(driver.switchTo().activeElement(), value, "Title" + i);
        }
    }

    public void clickAdd() {
        clickElement(add, "Add button");
    }

    public void clickBlock() {
        clickElement(block, "Manuscript endorsements block");
    }

    public void setTypeCC(String value, int i) {
        typeTextEnter(type.get(i), value, "Type");
    }

    public void setTypeHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(type.get(i), "Type" + i);
            typeText(driver.switchTo().activeElement(), value, "Type" + i);
        }
    }

    public void setTypeCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(type.get(i), "Type" + i);
            typeText(driver.switchTo().activeElement(), value, "Type" + i);
        }
    }

    public void setManuscriptEndorsementTypePA(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(type.get(i - 1));
            typeText(driver.switchTo().activeElement(), value, "Manuscript Endorsement Type");
            clickBlock();
        }
    }

    public void setTitle(String value, int i) {
        typeText(title.get(i), value, "Title");
    }

    public void setTitleHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(title.get(i), "Title" + i);
            typeText(driver.switchTo().activeElement(), value, "Title" + i);
        }
    }

    public void setManuscriptEndorsementTitlePA(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(title.get(i - 1));
            typeText(driver.switchTo().activeElement(), value, "Manuscript Endorsement Title");
            clickBlock();
        }
    }

    public void setManuscriptEndorsementAnnualManualPremiumPA(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickBlock();
            clickElement(annualManualPremium.get(i - 1));
            typeText(driver.switchTo().activeElement(), value, "Annual Manual Premium");
            clickBlock();
        }
    }

    public void setAnnualManualPremiumHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(annualManualPremium.get(i), "Annual Manual premium" + i);
            typeText(driver.switchTo().activeElement(), value, " Annual Manual premium" + i);
        }
    }

    public void setAnnualManualPremiumCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(annualManualPremium.get(i), "Annual Manual premium" + i);
            typeText(driver.switchTo().activeElement(), value, " Annual Manual premium" + i);
        }
    }

    public void setManualPremium(String value, int i) {
        typeTextEnter(manualPremium.get(i), value, "Manual premium");
    }

    public void setAnnualROLOverride(String value, int i) {
        typeText(annualROLOverride.get(i), value, "Annual rol override");
    }

    public void setSystemNonWindAnnualROL(String value, int i) {
        typeText(systemNonWindAnnualROL.get(i), value, "System non wind annual rol");
    }

    public void setSystemWindAnnualROL(String value, int i) {
        typeText(systemWindAnnualROL.get(i), value, "System wind annual rol");
    }

    public void setSystemWildfireAnnualROL(String value, int i) {
        typeText(systemWildfireAnnualROL.get(i), value, "System wildfire annual rol");
    }

    public void fillManuscriptEndorsementsDetailsFS(Map<String, String> data) {

    }


}