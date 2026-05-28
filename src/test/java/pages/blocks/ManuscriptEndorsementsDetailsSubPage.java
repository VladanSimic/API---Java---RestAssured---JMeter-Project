package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ManuscriptEndorsementsDetailsSubPage extends CommonComponentsAndActions {
    WebDriver driver;

    public ManuscriptEndorsementsDetailsSubPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Type']/../../../..//input")
    WebElement type;
    @FindBy(xpath = "//div[text()='Title']/../../../..//input")
    WebElement title;
    @FindBy(xpath = "//div[text()='Manual Premium']/../../../..//input")
    WebElement manualPremium;
    @FindBy(xpath = "//div[text()='Annual Premium']/../../../..//input")
    WebElement annualPremium;
    @FindBy(xpath = "//div[text()='Annual ROL Override']/../../../..//input")
    WebElement annualROLOverride;
    @FindBy(xpath = "//div[text()='System Non-Wind Annual ROL']/../../../..//input")
    WebElement systemNonWindAnnualROL;
    @FindBy(xpath = "//div[text()='System Wind Annual ROL']/../../../..//input")
    WebElement systemWindAnnualROL;
    @FindBy(xpath = "//div[text()='System Wildfire Annual ROL']/../../../..//input")
    WebElement systemWildfireAnnualROL;
    @FindBy(xpath = "//textarea")
    WebElement endorsementTextPremiumAdjustmentRationale;
    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//tr//td[1]")
    List<WebElement> vehicle;
    @FindBy(xpath = "//span[text()='Class']/../../../../../../../../..//table//tr//td[1]")
    List<WebElement> addClass;
    @FindBy(xpath = "//span[text()='Scheduled']/../../../../../../../../..//table//tr//td[2]")
    List<WebElement> scheduled;
    @FindBy(xpath = "//span[text()='Blanket']/../../../../../../../../..//table//tr//td[3]")
    List<WebElement> blanket;
    @FindBy(xpath = "//span[text()='Vehicle']/../../../../../../../../..//table//tr//td[2]")
    List<WebElement> premium;
    @FindBy(xpath = "//textarea")
    WebElement textarea;
    @FindBy(xpath = "//div[contains(text(),'Rationale')]/../../../..//textarea")
    WebElement premiumAdjustmentRationale;
    @FindBy(xpath = "//div[contains(text(),'Text')]/../../../..//textarea")
    WebElement textArea;
    @FindBy(xpath = "//div[text()='Loss Limitation']/../../../..//input")
    WebElement lossLimitation;
    @FindBy(xpath = "//div[text()='Annual Manual Premium']/../../../..//input")
    WebElement annualManualPremium;
    @FindBy(xpath = "//div[text()='Temporary Adjustment/Current Term Only']/../../../..//input")
    WebElement temporaryAdjustmentCurrentTermOnly;

    public void fillManuscriptEndorsementDetailsSubPageCC(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements"))) {
            int endorsements = data.get("Manuscript_Endorsements").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type"));
                    setTitle(data.get("Manuscript_Endorsements_Title"));

                    if (hasValue(data.get("Manuscript_Endorsements_Type"))) {
                        switch (data.get("Manuscript_Endorsements_Type")) {
                            case "Manuscript Endorsement":
                            case "Optional Coverage Premium Adjustment": {
                                setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium"));
                            }
                            break;
                            case "Non-Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"));
                                verifySystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL"));
                            }
                            break;
                            case "Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"));
                                verifySystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL"));
                            }
                            break;
                            case "Wildfire Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override"));
                                verifySystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL"));
                            }
                            break;
                        }
                        setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale"));
                    }
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_" + (i + 1)));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_" + (i + 1))) {
                            case "Manuscript Endorsement":
                            case "Optional Coverage Premium Adjustment": {
                                setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_" + (i + 1)));
                            }
                            break;
                            case "Non-Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)));
                                verifySystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_" + (i + 1)));
                            }
                            break;
                            case "Wind Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)));
                                verifySystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_" + (i + 1)));
                            }
                            break;
                            case "Wildfire Premium Adjustment": {
                                setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_" + (i + 1)));
                                verifySystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_" + (i + 1)));
                            }
                            break;
                        }
                        setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_" + (i + 1)));
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHS(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements"))) {
            int endorsements = data.get("Manuscript_Endorsements").split(",").length;

            for (int i = 1; i <= endorsements; i++) {
                String titleKey = "Manuscript_Endorsements_Title_" + i;
                String typeKey = "Manuscript_Endorsements_Type_" + i;
                String premiumKey = "Manuscript_Endorsements_Annual_Premium_" + i;
                String rationaleKey = "Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_" + i;

                if (hasValue(data.get(titleKey))) {
                    goToPage(data.get(titleKey));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get(typeKey));
                    setTitle(data.get(titleKey));
                    setAnnualPremium(data.get(premiumKey));
                    setEndorsementTextPremiumAdjustmentRationale(data.get(rationaleKey));
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHS_END(Map<String, String> data) throws Throwable {

        String[] manuscriptEndorsementsEND = data.get("Manuscript_Endorsements_END").split(",");

        //ADD
        for (int i = 1; i <= manuscriptEndorsementsEND.length; i++) {
            if (manuscriptEndorsementsEND[i - 1].contains("_ADD")) {
                goToPage(data.get("Manuscript_Endorsements_Title_END_" + i));
                pause(3000);
//                verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_END_" + i));
                setTitle(data.get("Manuscript_Endorsements_Title_END_" + i));
                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_END_" + i));
                setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_END_" + i));
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementDetailsSubPageHS_OOS_END(Map<String, String> data) throws Throwable {

        String[] manuscriptEndorsementsOOSEND = data.get("Manuscript_Endorsements_OOS_END").split(",");

        //ADD
        for (int i = 1; i <= manuscriptEndorsementsOOSEND.length; i++) {
            if (manuscriptEndorsementsOOSEND[i - 1].contains("_ADD")) {
                goToPage(data.get("Manuscript_Endorsements_Title_OOS_END_" + i));
                pause(3000);
//                verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_OOS_END_" + i));
                setTitle(data.get("Manuscript_Endorsements_Title_OOS_END_" + i));
                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_OOS_END_" + i));
                setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_OOS_END_" + i));
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementDetailsSubPageHS_RNW(Map<String, String> data) throws Throwable {
        String[] manuscriptEndorsementsEND = data.get("Manuscript_Endorsements_RNW").split(",");

        //ADD
        for (int i = 1; i <= manuscriptEndorsementsEND.length; i++) {
            if (manuscriptEndorsementsEND[i - 1].contains("_ADD")) {
                goToPage(data.get("Manuscript_Endorsements_Title_RNW_" + i));
                pause(3000);
//                verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_RNW_" + i));
                setTitle(data.get("Manuscript_Endorsements_Title_RNW_" + i));
                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_RNW_" + i));
                setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_RNW_" + i));
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementDetailsSubPageHO(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements"))) {
            int endorsements = data.get("Manuscript_Endorsements").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title_1"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_1"));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_1"));
                    setTitle(data.get("Manuscript_Endorsements_Title_1"));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_1"))) {
                        switch (data.get("Manuscript_Endorsements_Type_1")) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_1"));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1"));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1"));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_1"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1"));
                            }
                            break;
                        }
                        clickFooter();
                    }
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_" + (i + 1)));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_" + (i + 1)));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_" + (i + 1))) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_" + (i + 1)));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_" + (i + 1)));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_" + (i + 1)));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_" + (i + 1)));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_" + (i + 1)));
                            }
                            break;
                        }
                        clickFooter();
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHO_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements_END"))) {
            int endorsements = data.get("Manuscript_Endorsements_END").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title_1_END"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_1_END"));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_1_END"));
                    setTitle(data.get("Manuscript_Endorsements_Title_1_END"));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_1_END"))) {
                        switch (data.get("Manuscript_Endorsements_Type_1_END")) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_END"));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_1_END"));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_END"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_END"));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_END"));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_1_END"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_END"));
                            }
                            break;
                        }
                        clickFooter();
                    }
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_END_" + (i + 1)));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_END_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_END_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_END_" + (i + 1))) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_END_" + (i + 1)));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_END_" + (i + 1)));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_END_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_END_" + (i + 1)));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_END_" + (i + 1)));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_END_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_END_" + (i + 1)));
                            }
                            break;
                        }
                        clickFooter();
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHO_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements_OOS_END"))) {
            int endorsements = data.get("Manuscript_Endorsements_OOS_END").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title_1_OOS_END"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_1_OOS_END"));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_1_OOS_END"));
                    setTitle(data.get("Manuscript_Endorsements_Title_1_OOS_END"));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_1_OOS_END"))) {
                        switch (data.get("Manuscript_Endorsements_Type_1_OOS_END")) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_OOS_END"));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_1_OOS_END"));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_OOS_END"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_OOS_END"));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_OOS_END"));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_1_OOS_END"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_OOS_END"));
                            }
                            break;
                        }
                        clickFooter();
                    }
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_OOS_END_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_OOS_END_" + (i + 1)));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_OOS_END_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_OOS_END_" + (i + 1)));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_OOS_END_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_OOS_END_" + (i + 1))) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_OOS_END_" + (i + 1)));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_OOS_END_" + (i + 1)));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_OOS_END_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_OOS_END_" + (i + 1)));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_OOS_END_" + (i + 1)));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_OOS_END_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_OOS_END_" + (i + 1)));
                            }
                            break;
                        }
                        clickFooter();
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHO_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manuscript_Endorsements_RNW"))) {
            int endorsements = data.get("Manuscript_Endorsements_RNW").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title_1_RNW"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_1_RNW"));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_1_RNW"));
                    setTitle(data.get("Manuscript_Endorsements_Title_1_RNW"));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_1_RNW"))) {
                        switch (data.get("Manuscript_Endorsements_Type_1_RNW")) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_RNW"));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_1_RNW"));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_RNW"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_RNW"));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_1_RNW"));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_1_RNW"));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_1_RNW"));
                            }
                            break;
                        }
                        clickFooter();
                    }
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_RNW_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_RNW_" + (i + 1)));
                    setTemporaryAdjustmentCurrentTermOnly(data.get("Manuscript_Endorsements_Current_Term_Only_RNW_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_RNW_" + (i + 1)));

                    if (hasValue(data.get("Manuscript_Endorsements_Type_RNW_" + (i + 1)))) {
                        switch (data.get("Manuscript_Endorsements_Type_RNW_" + (i + 1))) {
                            case "Premium Adjustment": {
                                setAnnualPremium(data.get("Manuscript_Endorsements_Annual_Premium_RNW_" + (i + 1)));
                                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Premium_Rationale_RNW_" + (i + 1)));
                            }
                            break;
                            case "Manuscript Endorsement":
                            case "Special Terms and Conditions": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_RNW_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_RNW_" + (i + 1)));
                            }
                            break;
                            case "Loss Limitation": {
                                setAnnualManualPremium(data.get("Manuscript_Endorsements_Annual_Manual_Premium_RNW_" + (i + 1)));
                                setLossLimitation(data.get("Manuscript_Endorsements_Loss_Limitation_RNW_" + (i + 1)));
                                setEndorsementText(data.get("Manuscript_Endorsements_Endorsement_Text_RNW_" + (i + 1)));
                            }
                            break;
                        }
                        clickFooter();
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPageHO(Map<String, String> data, int i) throws Throwable {
        //TODO
    }

    public void fillManuscriptEndorsementDetailsSubPageCC_END(Map<String, String> data) throws Throwable {
        //TODO account for nb entries, enable removal on end
        if (hasValue(data.get("Manuscript_Endorsements_END"))) {
            int endorsements = data.get("Manuscript_Endorsements_END").split(",").length;
            for (int i = 0; i < endorsements; i++) {
                if (endorsements == 1) {
                    goToPage(data.get("Manuscript_Endorsements_Title_END"));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_END"));
                    setTitle(data.get("Manuscript_Endorsements_Title_END"));
                    switch (data.get("Manuscript_Endorsements_Type_END")) {
                        case "Manuscript Endorsement":
                        case "Optional Coverage Premium Adjustment": {
                            setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_END"));
                        }
                        break;
                        case "Non-Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"));
                            verifySystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_END"));
                        }
                        break;
                        case "Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"));
                            verifySystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_END"));
                        }
                        break;
                        case "Wildfire Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END"));
                            verifySystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_END"));
                        }
                        break;
                    }
                    setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_END"));
                } else {
                    goToPage(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)));
                    pause(3000);
                    verifyManuscriptEndorsementType(data.get("Manuscript_Endorsements_Type_END_" + (i + 1)));
                    setTitle(data.get("Manuscript_Endorsements_Title_END_" + (i + 1)));
                    switch (data.get("Manuscript_Endorsements_Type_END_" + (i + 1))) {
                        case "Manuscript Endorsement":
                        case "Optional Coverage Premium Adjustment": {
                            setManualPremium(data.get("Manuscript_Endorsements_Manual_Premium_END_" + (i + 1)));
                        }
                        break;
                        case "Non-Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)));
                            verifySystemNonWindAnnualROL(data.get("Manuscript_Endorsements_System_Non_Wind_Annual_ROL_END_" + (i + 1)));
                        }
                        break;
                        case "Wind Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)));
                            verifySystemWindAnnualROL(data.get("Manuscript_Endorsements_System_Wind_Annual_ROL_END_" + (i + 1)));
                        }
                        break;
                        case "Wildfire Premium Adjustment": {
                            setAnnualROLOverride(data.get("Manuscript_Endorsements_Annual_ROL_Override_END_" + (i + 1)));
                            verifySystemWildfireAnnualROL(data.get("Manuscript_Endorsements_System_Wildfire_Annual_ROL_END_" + (i + 1)));
                        }
                        break;
                    }
                    setEndorsementTextPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Details_Endorsement_Text_Premium_Adjustment_Rationale_END_" + (i + 1)));
                }
            }
            saveChanges();
        }
    }

    public void fillManuscriptEndorsementDetailsSubPagePA(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements"))) {
            num = data.get("Manuscript_Endorsements").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            goToPage(data.get("Manuscript_Endorsements_Title_" + i));
            if (data.get("Manuscript_Endorsements_Type_" + i).equalsIgnoreCase("Premium Adjustment")) {
                addVehicle(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Vehicle_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_" + i));
                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_" + i));
            } else {
                setEndorsementText(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Endorsement_Text_" + i));
            }
        }
        saveChanges();
    }

    public void fillManuscriptEndorsementDetailsSubPagePA_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_END"))) {
            num = data.get("Manuscript_Endorsements_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            goToPage(data.get("Manuscript_Endorsements_Title_END_" + i));
            if (data.get("Manuscript_Endorsements_Type_END_" + i).equalsIgnoreCase("Premium Adjustment")) {
                addVehicle(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Vehicle_END_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_END_" + i));
                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_END_" + i));
            } else {
                setEndorsementText(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Endorsement_Text_END_" + i));
            }
        }
        saveChanges();
        //TODO PA END - Manuscript endorsement - Mid
    }

    public void fillManuscriptEndorsementDetailsSubPagePA_OOS_END(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_OOS_END"))) {
            num = data.get("Manuscript_Endorsements_OOS_END").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            goToPage(data.get("Manuscript_Endorsements_Title_OOS_END_" + i));
            if (data.get("Manuscript_Endorsements_Type_OOS_END_" + i).equalsIgnoreCase("Premium Adjustment")) {
                addVehicle(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Vehicle_OOS_END_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_OOS_END_" + i));
                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_OOS_END_" + i));
            } else {
                setEndorsementText(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Endorsement_Text_OOS_END_" + i));
            }
        }
        saveChanges();
        //TODO PA OOS - Manuscript endorsement - Mid
    }

    public void fillManuscriptEndorsementDetailsSubPagePA_RNW(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements_RNW"))) {
            num = data.get("Manuscript_Endorsements_RNW").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            goToPage(data.get("Manuscript_Endorsements_Title_RNW_" + i));
            if (data.get("Manuscript_Endorsements_Type_RNW_" + i).equalsIgnoreCase("Premium Adjustment")) {
                addVehicle(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Vehicle_RNW_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_RNW_" + i));
                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_RNW_" + i));
            } else {
                setEndorsementText(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Endorsement_Text_RNW_" + i));
            }
        }
        saveChanges();
        //TODO PA RNW - Manuscript endorsement - Mid
    }

    public void setPremiumAdjustmentRationale(String s) {
        typeText(textarea, s, "Premium Adjustment Rationale");
    }

    public void setEndorsementText(String s) {
        typeText(textarea, s, "Endorsement Text");
    }

    public void addVehicle(String vehicles, String premiums) throws Throwable {
        int numVehicles = 0;

        if (hasValue(vehicles)) {
            numVehicles = vehicles.split("/").length;
        }

        for (int i = 1; i <= numVehicles; i++) {
            clickAdd();
            setVehicle(vehicles.split("/")[i - 1], i);
            setPremium(premiums.split("/")[i - 1], i);
        }

        saveChanges();
    }

    public void setVehicle(String s, int i) {
        if (hasValue(s)) {
            clickType();
            clickElement(vehicle.get(i - 1), "Vehicle");
            typeText(driver.switchTo().activeElement(), s, "Vehicle");
            clickType();
        }
    }

    public void setPremium(String s, int i) {
        if (hasValue(s)) {
            clickType();
            clickElement(premium.get(i - 1), "Premium");
            typeText(driver.switchTo().activeElement(), s, "Premium");
            clickType();
        }
    }

    public void clickType() {
        clickElement(type, "Type");
    }

    public void clickAdd() {
        clickElement(add, "Add");
    }

    public void setEndorsementTextPremiumAdjustmentRationale(String value) {
        typeTextEnter(endorsementTextPremiumAdjustmentRationale, value, "Endorsement text premium adjustment rationale");
        clickElement(type, "Type");
    }

    public void setTitle(String value) {
        typeText(title, value, "Title");
    }

    public void setManualPremium(String value) {
        typeText(manualPremium, value, "Manual premium");
    }

    public void setAnnualPremium(String value) {
        typeText(annualPremium, value, "Annual premium");
    }

    public void setAnnualROLOverride(String value) {
        typeText(annualROLOverride, value, "Annual rol override");
    }

    public void verifySystemWildfireAnnualROL(String value) {
        assertCellValue(systemWildfireAnnualROL, value, "System wildfire annual rol");
    }

    public void verifySystemWindAnnualROL(String value) {
        assertCellValue(systemWindAnnualROL, value, "System wind annual rol");
    }

    public void verifySystemNonWindAnnualROL(String value) {
        assertCellValue(systemNonWindAnnualROL, value, "System non wind annual rol");
    }

    public void verifyManuscriptEndorsementType(String value) {
        assertCellValue(type, value, "Manuscript endorsement type");
    }

    public void setTemporaryAdjustmentCurrentTermOnly(String value) throws Throwable {
        checkCheckbox(temporaryAdjustmentCurrentTermOnly, value);
    }

    public void setAnnualManualPremium(String value) {
        typeText(annualManualPremium, value, "Annual Manual Premium");
    }

    public void setLossLimitation(String value) {
        typeText(lossLimitation, value, "Loss Limitation");
    }

    public void fillManuscriptEndorsementDetailsSubPageFS(Map<String, String> data) {

    }


    public void fillManuscriptEndorsementDetailsSubPageCO(Map<String, String> data) throws Throwable {
        int num = 0;

        if (hasValue(data.get("Manuscript_Endorsements"))) {
            num = data.get("Manuscript_Endorsements").split(",").length;
        }

        for (int i = 1; i <= num; i++) {
            goToPage(data.get("Manuscript_Endorsements_Title_" + i));
            if (data.get("Manuscript_Endorsements_Type_" + i).equalsIgnoreCase("Premium Adjustment")) {
                addClasses(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Classes_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Scheduled_" + i), data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Blanket_" + i));
                setPremiumAdjustmentRationale(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_" + i));
            } else {
                setEndorsementText(data.get("Manuscript_Endorsements_Manuscript_Endorsements_Edit_Endorsement_Text_" + i));
            }
        }
        saveChanges();
    }

    public void addClasses(String classes, String scheduled, String blanket) throws Throwable {
        int numClasses = 1;

        if (hasValue(classes)) {
            numClasses = classes.split("/").length;
        }

        for (int i = 1; i <= numClasses; i++) {

            if (i > 1) {
                clickAdd();
            }
            setClasses(classes.split("/")[i - 1], i);
            setScheduled(scheduled.split("/")[i - 1], i);
            setBlanket(blanket.split("/")[i - 1], i);
        }
        saveChanges();
    }

    public void setClasses(String s, int i) {
        if (hasValue(s)) {
            clickType();
            clickElement(addClass.get(i - 1), "Class");
            typeText(driver.switchTo().activeElement(), s, "Class");
            clickType();
        }
    }

    public void setScheduled(String s, int i) {
        if (hasValue(s)) {
            clickType();
            clickElement(scheduled.get(i - 1), "Scheduled");
            typeText(driver.switchTo().activeElement(), s, "Scheduled");
            clickType();
        }
    }

    public void setBlanket(String s, int i) {
        if (hasValue(s)) {
            clickType();
            clickElement(blanket.get(i - 1), "Blanket");
            typeText(driver.switchTo().activeElement(), s, "Blanket");
            clickType();
        }
    }

}