package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ProjectDetailsAndDeductiblesBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ProjectDetailsAndDeductiblesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Residence Type']/../../../..//input")
    WebElement residenceType;
    @FindBy(xpath = "//div[text()='Additions & Alterations']/../../../..//input[@aria-hidden='false']")
    WebElement additionsAlterations;
    @FindBy(xpath = "//div[text()='Dwelling Project Budget']/../../../..//input")
    WebElement dwellingProjectBudget;
    @FindBy(xpath = "//div[text()='Estimated Final Dwelling']/../../../..//input")
    WebElement estimatedFinalDwelling;
    @FindBy(xpath = "//div[text()='Other Structures Project Budget']/../../../..//input")
    WebElement otherStructuresProjectBudget;
    @FindBy(xpath = "//div[text()='Estimated Final Other Structures']/../../../..//input")
    WebElement estimatedFinalOtherStructures;
    @FindBy(xpath = "//div[text()='Additions & Alterations Project Budget']/../../../..//input")
    WebElement additionsAlterationsProjectBudget;
    @FindBy(xpath = "//div[text()='Estimated Final Additions & Alterations']/../../../..//input")
    WebElement estimatedFinalAdditionsAlterations;
    @FindBy(xpath = "//div[text()='AOP Ded']/../../../../div/..//input")
    WebElement aopDed;
    @FindBy(xpath = "(//div[text()='Dwelling']/../../../../div/..//input)[2]")
    WebElement dwelling;
    @FindBy(xpath = "(//div[text()='Other Structures']/../../../../div/..//input)[2]")
    WebElement otherStructures;
    @FindBy(xpath = "//div[text()='TIV']/../../../../div/..//input")
    WebElement tiv;
    @FindBy(xpath = "//div[text()='Loss of Use']/../../../../div/..//input")
    WebElement lossOfUse;
    @FindBy(xpath = "//div[text()='Contents']/../../../../div/..//input")
    WebElement contents;
    @FindBy(xpath = "//div[text()='Named Storm Deductible']/../../../../div/..//input")
    WebElement namedStormDeductible;
    @FindBy(xpath = "//div[text()='Hurricane Deductible']/../../../../div/..//input")
    WebElement hurricaneDeductible;
    @FindBy(xpath = "//div[text()='Hurricane']/../../../../div/..//input")
    WebElement hurricane;
    @FindBy(xpath = "//div[text()='Tornado or Hailstorm Deductible']/../../../../div/..//input")
    WebElement tornadoOrHailstormDeductible;
    @FindBy(xpath = "//div[text()='Hurricane or Named Storm Deductible']/../../../../div/..//input")
    WebElement hurricaneOrNamedStormDeductible;
    @FindBy(xpath = "//div[text()='Windstorm or Hail Deductible']/../../../../div/..//input")
    WebElement windstormOrHail;
    @FindBy(xpath = "//div[text()='Windstorm or Hail']/../../../../div/..//input")
    WebElement windstormOrHailOnly;
    @FindBy(xpath = "//div[text()='Hail']/../../../../div/..//input")
    WebElement hail;
    @FindBy(xpath = "//div[text()='Hail Deductible']/../../../../div/..//input")
    WebElement hailDeductible;
    @FindBy(xpath = "//div[text()='WF Deductible']/../../../../div/..//input")
    WebElement wfDeductible;

    public void fillProjectDetailsAndDeductiblesCC(Map<String, String> data) throws Throwable {
        String state = data.get("State");
        String projectType = data.get("Project_Type_Project_Type");
        String residenceType = data.get("Project_Details_Residence_Type");
        verifyBlockExists("project details and deductibles");
        setResidenceType(residenceType);
        saveChanges();

        if (hasValue(projectType)) {
            switch (projectType) {
                case "Ground Up Construction": {
                    if (hasValue(residenceType) && residenceType.equalsIgnoreCase("Homeowner")) {
                        setDwelling(data.get("Project_Details_Dwelling"));
                    }
                    setAOPDed(data.get("Project_Details_AOP_Ded"));
                    setOtherStructures(data.get("Project_Details_Other_Structures"));
                    setContents(data.get("Project_Details_Contents"));
                    setLossOfUse(data.get("Project_Details_Loss_Of_Use"));
                    if (hasValue(residenceType) && !residenceType.equalsIgnoreCase("Homeowner")) {
                        try {
                            setAdditionsAlterations(data.get("Project_Details_Additions_Alterations"));
                        } catch (Exception e) {
                            setDwelling(data.get("Project_Details_Additions_Alterations"));
                            //TODO remove - temp issue with the additions and alterations field
                        }
                    }
                }
                break;
                case "Major Renovation/Remodel":
                case "Vacant Pending Reno":
                case "Vacant Pending Renovation": {
                    if (hasValue(residenceType) && residenceType.equalsIgnoreCase("Homeowner")) {
                        setDwellingProjectBudget(data.get("Project_Details_Dwelling_Project_Budget"));
                        setEstimatedFinalDwelling(data.get("Project_Details_Estimated_Final_Dwelling"));
                    } else {
                        setAdditionsAlterationsProjectBudget(data.get("Project_Details_Additions_Alterations_Project_Budget"));
                        setEstimatedFinalAdditionsAlterations(data.get("Project_Details_Estimated_Final_Additions_Alterations"));
                    }
                    setAOPDed(data.get("Project_Details_AOP_Ded"));
                    setOtherStructuresProjectBudget(data.get("Project_Details_Other_Structures_Project_Budget"));
                    setEstimatedFinalOtherStructures(data.get("Project_Details_Estimated_Final_Other_Structures"));
                    setContents(data.get("Project_Details_Contents"));
                    setLossOfUse(data.get("Project_Details_Loss_Of_Use"));
                }
                break;
            }
        }

        if (state.equals("FL")) {
            setHurricaneDeductible(data.get("Project_Details_Hurricane_Deductible"));
        }

        if (state.equalsIgnoreCase("CO")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible"));
        }

        if (state.equalsIgnoreCase("HI")) {
            setHurricane(data.get("Project_Details_Hurricane"));
        }

        if (state.equalsIgnoreCase("CA") ||
                state.equalsIgnoreCase("ID") ||
                state.equalsIgnoreCase("NM") ||
                state.equalsIgnoreCase("NV") ||
                state.equalsIgnoreCase("OR") ||
                state.equalsIgnoreCase("UT") ||
                state.equalsIgnoreCase("WA") ||
                state.equalsIgnoreCase("AZ")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
        }

        if (state.equalsIgnoreCase("ME") ||
                state.equalsIgnoreCase("OH") ||
                state.equalsIgnoreCase("KY") ||
                state.equalsIgnoreCase("PA") ||
                state.equalsIgnoreCase("NH") ||
                state.equalsIgnoreCase("KS") ||
                state.equalsIgnoreCase("OK") ||
                state.equalsIgnoreCase("WI") ||
                state.equalsIgnoreCase("DC") ||
                state.equalsIgnoreCase("MN") ||
                state.equalsIgnoreCase("MO") ||
                state.equalsIgnoreCase("MI") ||
                state.equalsIgnoreCase("VT") ||
                state.equalsIgnoreCase("ND") ||
                state.equalsIgnoreCase("IN") ||
                state.equalsIgnoreCase("WV") ||
                state.equalsIgnoreCase("IA") ||
                state.equalsIgnoreCase("AR") ||
                state.equalsIgnoreCase("MS") ||
                state.equalsIgnoreCase("NE")) {
            setWindstormOrHailDeductible(data.get("Project_Details_Windstorm_Or_Hail_Deductible"));
        }

        if (state.equalsIgnoreCase("MD")) {
            setWindstormOrHail(data.get("Project_Details_Windstorm_Or_Hail"));
        }

        if (state.equalsIgnoreCase("IL")) {
            setHailDeductible(data.get("Project_Details_Hail_Deductible"));
        }

        if (state.equalsIgnoreCase("MT") ||
                state.equalsIgnoreCase("WY")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
            setWindstormOrHailDeductible(data.get("Project_Details_Windstorm_Or_Hail_Deductible"));
        }

        if (state.equalsIgnoreCase("SD")) {
            setWindstormOrHailDeductible(data.get("Project_Details_Windstorm_Or_Hail_Deductible"));
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
        }

        if (state.equalsIgnoreCase("MA") ||
                state.equalsIgnoreCase("DE") ||
                state.equalsIgnoreCase("NY") ||
                state.equalsIgnoreCase("SC") ||
                state.equalsIgnoreCase("RI") ||
                state.equalsIgnoreCase("NJ") ||
                state.equalsIgnoreCase("NC") ||
                state.equalsIgnoreCase("VA") ||
                state.equalsIgnoreCase("CT")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible"));
        }

        if (state.equalsIgnoreCase("AL") ||
                state.equalsIgnoreCase("LA") || state.equalsIgnoreCase("GA")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible"));
        }

        if (state.equalsIgnoreCase("TN")) {
            setTornadoOrHailDeductible(data.get("Project_Details_Tornado_Or_Hailstorm_Deductible"));
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
        }

        if (state.equalsIgnoreCase("TX")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible"));
            setWFDeductible(data.get("Project_Details_WF_Deductible"));
        }

        verifyTIV(data.get("Project_Details_TIV"));
        saveChanges();
    }

    private void setTornadoOrHailDeductible(String value) throws Throwable {
        typeTextEnter(tornadoOrHailstormDeductible, value, "Tornado or Hailstorm Deductible");
        saveChanges();
        pause(3000);
    }

    private void setHurricane(String value) throws Throwable {
        typeTextEnter(hurricane, value, "Hurricane");
        saveChanges();
        pause(3000);
    }

    private void setWindstormOrHail(String value) throws Throwable {
        typeTextEnter(windstormOrHailOnly, value, "Windstorm Or Hail");
        saveChanges();
        pause(3000);
    }

    private void setHail(String value) throws Throwable {
        typeTextEnter(hail, value, "Hail");
        saveChanges();
        pause(3000);
    }

    public void fillProjectDetailsAndDeductiblesCC_END(Map<String, String> data) throws Throwable {
        String state = data.get("State");
        String projectType = hasValue(data.get("Project_Type_Project_Type_END")) ? data.get("Project_Type_Project_Type_END") : data.get("Project_Type_Project_Type");
        String residenceType = hasValue(data.get("Project_Details_Residence_Type_END")) ? data.get("Project_Details_Residence_Type_END") : data.get("Project_Details_Residence_Type");

        setResidenceType(data.get("Project_Details_Residence_Type_END"));

        switch (projectType) {
            case "Ground Up Construction": {
                setDwelling(data.get("Project_Details_Dwelling_END"));
                setAOPDed(data.get("Project_Details_AOP_Ded_END"));
                setOtherStructures(data.get("Project_Details_Other_Structures_END"));
                setContents(data.get("Project_Details_Contents_END"));
                setLossOfUse(data.get("Project_Details_Loss_Of_Use_END"));
                if (!residenceType.equalsIgnoreCase("Homeowner")) {
                    setAdditionsAlterations(data.get("Project_Details_Additions_Alterations_END"));
                }
            }
            break;
            case "Major Renovation/Remodel":
            case "Vacant Pending Reno":
            case "Vacant Pending Renovation": {
                if (residenceType.equalsIgnoreCase("Homeowner")) {
                    setDwellingProjectBudget(data.get("Project_Details_Dwelling_Project_Budget_END"));
                    setEstimatedFinalDwelling(data.get("Project_Details_Estimated_Final_Dwelling_END"));
                } else {
                    setAdditionsAlterationsProjectBudget(data.get("Project_Details_Additions_Alterations_Project_Budget_END"));
                    setEstimatedFinalAdditionsAlterations(data.get("Project_Details_Estimated_Final_Additions_Alterations_END"));
                }
                setAOPDed(data.get("Project_Details_AOP_Ded_END"));
                setOtherStructuresProjectBudget(data.get("Project_Details_Other_Structures_Project_Budget_END"));
                setEstimatedFinalOtherStructures(data.get("Project_Details_Estimated_Final_Other_Structures_END"));
                setContents(data.get("Project_Details_Contents_END"));
                setLossOfUse(data.get("Project_Details_Loss_Of_Use_END"));
            }
            break;
        }

        if (state.equals("FL")) {
            setHurricaneDeductible(data.get("Project_Details_Hurricane_Deductible_END"));
        }

        if (state.equalsIgnoreCase("CO")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible_END"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible_END"));
        }

        if (state.equalsIgnoreCase("HI")) {
            setHurricane(data.get("Project_Details_Hurricane_END"));
        }

        if (state.equalsIgnoreCase("CA") ||
                state.equalsIgnoreCase("ID") ||
                state.equalsIgnoreCase("NM") ||
                state.equalsIgnoreCase("NV") ||
                state.equalsIgnoreCase("OR") ||
                state.equalsIgnoreCase("UT") ||
                state.equalsIgnoreCase("WA") ||
                state.equalsIgnoreCase("AZ")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible_END"));
        }

        if (state.equalsIgnoreCase("ME") ||
                state.equalsIgnoreCase("OH") ||
                state.equalsIgnoreCase("KY") ||
                state.equalsIgnoreCase("PA") ||
                state.equalsIgnoreCase("NH") ||
                state.equalsIgnoreCase("KS") ||
                state.equalsIgnoreCase("OK") ||
                state.equalsIgnoreCase("WI") ||
                state.equalsIgnoreCase("DC") ||
                state.equalsIgnoreCase("MN") ||
                state.equalsIgnoreCase("MO") ||
                state.equalsIgnoreCase("MI") ||
                state.equalsIgnoreCase("SD") ||
                state.equalsIgnoreCase("VT") ||
                state.equalsIgnoreCase("ND") ||
                state.equalsIgnoreCase("IN") ||
                state.equalsIgnoreCase("WV") ||
                state.equalsIgnoreCase("IA") ||
                state.equalsIgnoreCase("AR") ||
                state.equalsIgnoreCase("MS") ||
                state.equalsIgnoreCase("NE")) {
            setWindstormOrHailDeductible(data.get("Project_Details_Windstorm_Or_Hail_Deductible_END"));
        }

        if (state.equalsIgnoreCase("MD")) {
            setWindstormOrHail(data.get("Project_Details_Windstorm_Or_Hail_END"));
        }

        if (state.equalsIgnoreCase("IL")) {
            setHailDeductible(data.get("Project_Details_Hail_Deductible_END"));
        }

        if (state.equalsIgnoreCase("MT") ||
                state.equalsIgnoreCase("WY")) {
            setWFDeductible(data.get("Project_Details_WF_Deductible_END"));
            setWindstormOrHailDeductible(data.get("Project_Details_Windstorm_Or_Hail_Deductible_END"));
        }

        if (state.equalsIgnoreCase("MA") ||
                state.equalsIgnoreCase("DE") ||
                state.equalsIgnoreCase("NY") ||
                state.equalsIgnoreCase("SC") ||
                state.equalsIgnoreCase("RI") ||
                state.equalsIgnoreCase("NJ") ||
                state.equalsIgnoreCase("NC") ||
                state.equalsIgnoreCase("VA") ||
                state.equalsIgnoreCase("CT")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible_END"));
        }

        if (state.equalsIgnoreCase("AL") ||
                state.equalsIgnoreCase("LA") ||
                state.equalsIgnoreCase("GA")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible_END"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible_END"));
        }

        if (state.equalsIgnoreCase("TN")) {
            setTornadoOrHailDeductible(data.get("Project_Details_Tornado_Or_Hailstorm_Deductible_END"));
            setWFDeductible(data.get("Project_Details_WF_Deductible_END"));
        }

        if (state.equalsIgnoreCase("TX")) {
            setHurricaneOrNamedStormDeductible(data.get("Project_Details_Hurricane_Or_Named_Storm_Deductible_END"));
            setHailDeductible(data.get("Project_Details_Hail_Deductible_END"));
            setWFDeductible(data.get("Project_Details_WF_Deductible_END"));
        }

        verifyTIV(data.get("Project_Details_TIV_END"));
        saveChanges();
    }

    public void verifyTIV(String value) {
        assertCellValue(tiv, value, "TIV");
    }

    public void setResidenceType(String value) throws InterruptedException {
        typeTextEnter(residenceType, value, "Residence Type");
        pause(3000);
    }

    public void setAdditionsAlterations(String value) throws Throwable {
        typeText(additionsAlterations, value, "Additions & Alterations");
    }

    public void setDwellingProjectBudget(String value) throws Throwable {
        typeText(dwellingProjectBudget, value, "Dwelling Project Budget");
    }

    public void setEstimatedFinalDwelling(String value) throws Throwable {
        typeText(estimatedFinalDwelling, value, "Estimated Final Dwelling");
    }

    public void setOtherStructuresProjectBudget(String value) throws Throwable {
        typeText(otherStructuresProjectBudget, value, "Other Structures Project Budget");
    }

    public void setEstimatedFinalOtherStructures(String value) throws Throwable {
        typeText(estimatedFinalOtherStructures, value, "Estimated Final Other Structures");
    }

    public void setAdditionsAlterationsProjectBudget(String value) throws Throwable {
        typeText(additionsAlterationsProjectBudget, value, "Additions Alterations Project Budget");
    }

    public void setEstimatedFinalAdditionsAlterations(String value) throws Throwable {
        typeText(estimatedFinalAdditionsAlterations, value, "Estimated Final Additions Alterations");
    }

    public void setDwelling(String value) throws Throwable {
        pause(3000);
        typeText(dwelling, value, "Dwelling");
        clickFooter();
    }

    public void setAOPDed(String value) throws InterruptedException {
        typeTextEnter(aopDed, value, "AOP Ded");
        pause(3000);
    }

    public void setOtherStructures(String value) {
        typeText(otherStructures, value, "Other structures");
    }

    public void setLossOfUse(String value) {
        typeText(lossOfUse, value, "Loss of use");
    }

    public void setContents(String value) {
        typeText(contents, value, "Contents");
    }

    public void setNamedStormDeductible(String value) throws InterruptedException {
        typeTextEnter(namedStormDeductible, value, "Named storm deductible");
        pause(3000);
    }

    public void setHurricaneDeductible(String value) throws Throwable {
        typeTextEnter(hurricaneDeductible, value, "Hurricane Deductible");
        saveChanges();
        pause(3000);
    }

    public void setHurricaneOrNamedStormDeductible(String value) throws Throwable {
        typeTextEnter(hurricaneOrNamedStormDeductible, value, "Hurricane or Named Storm Deductible");
        saveChanges();
        pause(3000);
    }

    public void setWindstormOrHailDeductible(String value) throws Throwable {
        typeTextEnter(windstormOrHail, value, "Windstorm or Hail Deductible");
        saveChanges();
        pause(3000);
    }

    public void setHailDeductible(String value) {
        typeTextEnter(hailDeductible, value, "Hail Deductible");
    }

    public void setWFDeductible(String value) throws Throwable {
        typeTextEnter(wfDeductible, value, "WF Deductible");
        clickFooter();
    }

}