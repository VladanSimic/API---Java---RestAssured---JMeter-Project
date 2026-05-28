package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OptionalCoveragesExclusionsESBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public OptionalCoveragesExclusionsESBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement animalLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement animalLiabilityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement automobileLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Animal Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement automobileLiabilityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Coinsurance Clause')]/../../../..//label[text()='Yes']/..//input")
    WebElement coinsuranceClauseYes;
    @FindBy(xpath = "//div[contains(text(),'Coinsurance Clause')]/../../../..//label[text()='No']/..//input")
    WebElement coinsuranceClauseNo;
    @FindBy(xpath = "//div[contains(text(),'Coinsurance Clause')]/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement coinsuranceClauseLimit;
    @FindBy(xpath = "//div[contains(text(),'Sub-Limit for Permissive Use')]/../../../../../../../../../../..//div[text()='Limit']/../../../..//input")
    WebElement subLimitForPermissiveUseLimit;
    @FindBy(xpath = "//div[contains(text(),'Employers Liability Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement employersLiabilityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Employers Liability Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement employersLiabilityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Exclusion for Permissive Use')]/../../../..//label[text()='Yes']/..//input")
    WebElement exclusionForPermissiveUseYes;
    @FindBy(xpath = "//div[contains(text(),'Exclusion for Permissive Use')]/../../../..//label[text()='No']/..//input")
    WebElement exclusionForPermissiveUseNo;
    @FindBy(xpath = "//div[contains(text(),'Exclusion for Permissive Use')]/../../../..//label[text()='Yes']/..//input")
    WebElement extendedCoverageForRentedOrBorrowedAutosYes;
    @FindBy(xpath = "//div[contains(text(),'Exclusion for Permissive Use')]/../../../..//label[text()='No']/..//input")
    WebElement extendedCoverageForRentedOrBorrowedAutosNo;
    @FindBy(xpath = "//div[contains(text(),'Libel/Slander Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement libelSlanderExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Libel/Slander Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement libelSlanderExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement personalInjuryExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement personalInjuryExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='Yes']/..//input")
    WebElement politicalActivityExclusionYes;
    @FindBy(xpath = "//div[contains(text(),'Personal Injury Exclusion')]/../../../..//label[text()='No']/..//input")
    WebElement politicalActivityExclusionNo;
    @FindBy(xpath = "//div[contains(text(),'Premises Liability Limitation')]/../../../..//label[text()='Yes']/..//input")
    WebElement premisesLiabilityLimitationYes;
    @FindBy(xpath = "//div[contains(text(),'Premises Liability Limitation')]/../../../..//label[text()='No']/..//input")
    WebElement premisesLiabilityLimitationNo;
    @FindBy(xpath = "//div[contains(text(),'Sub-Limit for Permissive Use')]/../../../..//label[text()='Yes']/..//input")
    WebElement subLimitForPermissiveUseYes;
    @FindBy(xpath = "//div[contains(text(),'Sub-Limit for Permissive Use')]/../../../..//label[text()='No']/..//input")
    WebElement subLimitForPermissiveUseNo;
    @FindBy(xpath = "//div[contains(text(),'Sub-Limit for Named Operator')]/../../../..//label[text()='Yes']/..//input")
    WebElement subLimitForNamedOperatorYes;
    @FindBy(xpath = "//div[contains(text(),'Sub-Limit for Named Operator')]/../../../..//label[text()='No']/..//input")
    WebElement subLimitForNamedOperatorNo;

    public void setAnimalLiabilityExclusion(String value) throws Throwable {
        choose(animalLiabilityExclusionYes, animalLiabilityExclusionNo, value,"Animal Liability");
    }

    public void setAutomobileLiabilityExclusion(String value) throws Throwable {
        choose(automobileLiabilityExclusionYes, automobileLiabilityExclusionNo, value, "Automobile Liability");
    }

    public void setCoinsuranceClause(String value) throws Throwable {
        choose(coinsuranceClauseYes, coinsuranceClauseNo, value, "Coinsurance Clause");
    }

    public void setEmployersLiabilityExclusion(String value) throws Throwable {
        choose(employersLiabilityExclusionYes, employersLiabilityExclusionNo, value, "Employers Liability");
    }

    public void setExclusionForPermissiveUse(String value) throws Throwable {
        choose(exclusionForPermissiveUseYes, exclusionForPermissiveUseNo, value, "Exclusion For Permissive Use");
    }

    public void setLibelSlanderExclusion(String value) throws Throwable {
        choose(libelSlanderExclusionYes, libelSlanderExclusionNo, value, "Libel Slander Exclusion");
    }

    public void setPersonalInjuryExclusion(String value) throws Throwable {
        choose(personalInjuryExclusionYes, personalInjuryExclusionNo, value, "Personal Injury Exclusion");
    }

    public void setPoliticalActivityExclusion(String value) throws Throwable {
        choose(politicalActivityExclusionYes, politicalActivityExclusionNo, value, "Political Activity Exclusion");
    }

    public void setPremisesLiabilityLimitation(String value) throws Throwable {
        choose(premisesLiabilityLimitationYes, premisesLiabilityLimitationNo, value, "Premises Liability Limitation");
    }

    public void setSubLimitForPermissiveUse(String value) throws Throwable {
        choose(subLimitForPermissiveUseYes, subLimitForPermissiveUseNo, value, "Sub Limit For Permissive Use");
    }

    public void setSubLimitForNamedOperator(String value) throws Throwable {
        choose(subLimitForNamedOperatorYes, subLimitForNamedOperatorNo, value, "Sub Limit For Named Operator");
    }

    public void fillOptionalCoveragesExclusionsESBlock(Map<String, String> data) throws Throwable {
        verifyBlockExists("optional coverages/exclusions");
        setAnimalLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion"));
        setAutomobileLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Automobile_Liability_Exclusion"));
        setCoinsuranceClause(data.get("Optional_Coverages_Exclusions_Coinsurance_Clause"));
        if (data.get("Optional_Coverages_Exclusions_Coinsurance_Clause").equalsIgnoreCase("Yes")) {
            setCoinsuranceClauseLimit(data.get("Optional_Coverages_Exclusions_Coinsurance_Clause_Limit"));
        }
        setEmployersLiabilityExclusion(data.get("Optional_Coverages_Exclusions_Employers_Liability_Exclusion"));
        setExclusionForPermissiveUse(data.get("Optional_Coverages_Exclusions_Exclusion_For_Permissive_Use"));
        setExtendedCoverageForRentedOrBorrowedAutos(data.get("Optional_Coverages_Exclusions_Extended_Coverage_For_Rented_Or_Borrowed_Autos"));
        setLibelSlanderExclusion(data.get("Optional_Coverages_Exclusions_Libel_Slander_Exclusion"));
        setPersonalInjuryExclusion(data.get("Optional_Coverages_Exclusions_Personal_Injury_Exclusion"));
        setPoliticalActivityExclusion(data.get("Optional_Coverages_Exclusions_Political_Activity_Exclusion"));
        setPremisesLiabilityLimitation(data.get("Optional_Coverages_Exclusions_Premises_Liability_Limitation"));
        setSubLimitForPermissiveUse(data.get("Optional_Coverages_Exclusions_Sub-Limit_For_Permissive_Use"));
        if(data.get("Optional_Coverages_Exclusions_Sub-Limit_For_Permissive_Use").equalsIgnoreCase("Yes")){
            setSubLimitForPermissiveUseLimit(data.get("Optional_Coverages_Exclusions_Sub-Limit_For_Permissive_Use_Limit"));
        }
        setSubLimitForNamedOperator(data.get("Optional_Coverages_Exclusions_Sub-Limit_For_Named_Operator"));
        if(data.get("Optional_Coverages_Exclusions_Sub-Limit_For_Named_Operator").equalsIgnoreCase("Yes")){
      //      setLimitForNamedOperator(data);
        }
    }

    public void setSubLimitForPermissiveUseLimit(String value) throws Throwable {
        typeText(subLimitForPermissiveUseLimit, value);
    }

    public void setExtendedCoverageForRentedOrBorrowedAutos(String value) throws Throwable {
        choose(extendedCoverageForRentedOrBorrowedAutosYes, extendedCoverageForRentedOrBorrowedAutosNo, value);
    }

    public void setCoinsuranceClauseLimit(String value) throws Throwable {
        typeText(coinsuranceClauseLimit, value);
    }

}
