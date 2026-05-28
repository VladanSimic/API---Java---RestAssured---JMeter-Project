package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OptionalCoverageUWOnlyBlock extends CommonComponentsAndActions {
    WebDriver driver;
    CanineInformationBlock canineInformationBlock;

    NamedAutoAndOperatorExclusionUWOnlyBlock namedAutoAndOperatorExclusionUWOnlyBlock;
    NamedPersonExclusionBlock namedPersonExclusionBlock;
    NamedAutoLiabilityExclusionBlock namedAutoLiabilityExclusionBlock;

    public OptionalCoverageUWOnlyBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.canineInformationBlock = new CanineInformationBlock(driver);
        this.namedAutoAndOperatorExclusionUWOnlyBlock = new NamedAutoAndOperatorExclusionUWOnlyBlock(driver);
        this.namedPersonExclusionBlock = new NamedPersonExclusionBlock(driver);
        this.namedAutoLiabilityExclusionBlock = new NamedAutoLiabilityExclusionBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Profile Level')]/../../../..//input")
    WebElement profileLevel;
    @FindBy(xpath = "//div[text()='Canine Liability Exclusion']/../../../..//input")
    WebElement selectCanineLiabilityExclusion;
    @FindBy(xpath = "//div[text()='Designated Ongoing Operation Exclusion']/../../../..//input")
    WebElement selectDesignatedOngoingOperationExclusion;

    @FindBy(xpath = "//div[text()='Designated Ongoing Operation Exclusion']/../../../../../../../../../../..//textarea")
    WebElement designatedOngoingOperationExclusionDetails;
    @FindBy(xpath = "//div[text()='Named Person Exclusion']/../../../..//input")
    WebElement selectNamedPersonExclusion;

    @FindBy(xpath = "//div[text()='Named Auto Liability Exclusion']/../../../..//input")
    WebElement selectNamedAutoLiabilityExclusion;

    public void setProfileLevel(String value) throws Throwable {
        typeText(profileLevel, value);
    }

    public void setCanineLiabilityExclusion(String value) {
        if (hasValue(value)) {
            if (isElementDisplayed(selectCanineLiabilityExclusion)) {
                typeTextEnter(selectCanineLiabilityExclusion, value, "Canine Liability Exclusion:" + value);
            }
        }
    }

    public void setDesignatedOngoingOperationExclusion(String value) {
        if (hasValue(value)) {
            if (isElementDisplayed(selectDesignatedOngoingOperationExclusion)) {
                typeTextEnter(selectDesignatedOngoingOperationExclusion, value, "Designated Ongoing Operation Exclusion:" + value);
            }

        }
    }

    public void setDesignatedOngoingOperationExclusionDetails(String value) throws Throwable {
        saveChanges();
        if (hasValue(value)) {
            if (isElementDisplayed(designatedOngoingOperationExclusionDetails, 15)) {
                typeText(designatedOngoingOperationExclusionDetails, value);
            }
        }
    }

    public void setNamedPersonExclusion(String value) {
        if (hasValue(value)) {
            if (isElementDisplayed(selectNamedPersonExclusion)) {
                typeTextEnter(selectNamedPersonExclusion, value, "Named Person Exclusion :" + value);
            }
        }
    }


    public void setNamedAutoLiabilityExclusion(String value) {
        if (hasValue(value)) {
            if (isElementDisplayed(selectCanineLiabilityExclusion)) {
                typeTextEnter(selectNamedAutoLiabilityExclusion, value, "Named Auto Liability Exclusion :" + value);
            }
        }
    }

    public void fillOptionalCoverageUWOnly(Map<String, String> data) throws Throwable {
        setProfileLevel(data.get("Profile_Level"));
        setCanineLiabilityExclusion(data.get("Optional_Coverages_Canine_Liability_Exclusion"));
        setDesignatedOngoingOperationExclusion(data.get("Optional_Coverages_Designated_Ongoing_Operation_Exclusion"));
        saveChanges();
        setDesignatedOngoingOperationExclusionDetails(data.get("Designated_Ongoing_Operation_Exclusion_Details"));
        setNamedPersonExclusion(data.get("Optional_Coverages_NamedPersonExclusion"));
        setNamedAutoLiabilityExclusion(data.get("Optional_Coverages_NamedAutoLiabilityExclusion"));
        canineInformationBlock.addCanineLiabilityExclusion(data);
        namedPersonExclusionBlock.addNamedPersonExclusion(data);
        namedAutoLiabilityExclusionBlock.addNamedAutoLiabilityExclusion(data);


    }

    public void fillOptionalCoverageUWOnly_END(Map<String, String> data) throws Throwable {
        setProfileLevel(data.get("Profile_Level_END"));
        setCanineLiabilityExclusion(data.get("Optional_Coverages_Canine_Liability_Exclusion_END"));
        setDesignatedOngoingOperationExclusion(data.get("Optional_Coverages_Designated_Ongoing_Operation_Exclusion_END"));
        pause(5000);
        setDesignatedOngoingOperationExclusionDetails(data.get("Designated_Ongoing_Operation_Exclusion_Details_END"));
        setNamedPersonExclusion(data.get("Optional_Coverages_NamedPersonExclusion_END"));
        setNamedAutoLiabilityExclusion(data.get("Optional_Coverages_NamedAutoLiabilityExclusion_END"));
        canineInformationBlock.addCanineLiabilityExclusion_END(data);
        namedPersonExclusionBlock.addNamedPersonExclusion_END(data);
        namedAutoLiabilityExclusionBlock.addNamedAutoLiabilityExclusion_END(data);


    }

    public void fillOptionalCoverageUWOnly_RNW(Map<String, String> data) throws Throwable {
        setProfileLevel(data.get("Profile_Level_RNW"));
        setCanineLiabilityExclusion(data.get("Optional_Coverages_Canine_Liability_Exclusion_RNW"));
        setDesignatedOngoingOperationExclusion(data.get("Optional_Coverages_Designated_Ongoing_Operation_Exclusion_RNW"));
        saveChanges();
        reviewPolicyImage();
        setDesignatedOngoingOperationExclusionDetails(data.get("Designated_Ongoing_Operation_Exclusion_Details_RNW"));
        setNamedPersonExclusion(data.get("Optional_Coverages_NamedPersonExclusion_RNW"));
        setNamedAutoLiabilityExclusion(data.get("Optional_Coverages_NamedAutoLiabilityExclusion_RNW"));
        canineInformationBlock.addCanineLiabilityExclusion_RNW(data);
        namedPersonExclusionBlock.addNamedPersonExclusion_RNW(data);
        namedAutoLiabilityExclusionBlock.addNamedAutoLiabilityExclusion_RNW(data);

    }


}