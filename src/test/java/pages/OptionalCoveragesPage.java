package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class OptionalCoveragesPage extends CommonComponentsAndActions {
    WebDriver driver;

    OptionalCoverageBlock optionalCoverageBlock;
    OptionalFloodCoverageBlock optionalFloodCoverageBlock;
    OptionalCoveragesExclusionsBlock optionalCoveragesExclusionsBlock;
    OptionalCoverageUWOnlyBlock optionalCoverageComponentUWOnly;
    AdditionalExcessLiabilityCoverageUWOnlyBlock additionalExcessLiabilityCoverageUWOnlyBlock;
    OptionalCoverageExcessFloodBlock optionalCoverageExcessFloodBlock;
    PropertyInformationBlock propertyInformationBlock;
    NamedAutoAndOperatorExclusionUWOnlyBlock namedAutoAndOperatorExclusionUWOnlyBlock;
    CanineInformationBlock canineInformationBlock;
    NamedPersonExclusionBlock namedPersonExclusionBlock;
    NamedAutoLiabilityExclusionBlock namedAutoLiabilityExclusionBlock;
    AnimalInformationBlock animalInformationBlock;

    @FindBy(css = ".mode3>span")
    WebElement validationMessage;
    //TODO move to page/block maybe common inf block

    public OptionalCoveragesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        optionalCoverageBlock = new OptionalCoverageBlock(driver);
        optionalFloodCoverageBlock = new OptionalFloodCoverageBlock(driver);
        optionalCoveragesExclusionsBlock = new OptionalCoveragesExclusionsBlock(driver);
        optionalCoverageComponentUWOnly = new OptionalCoverageUWOnlyBlock(driver);
        additionalExcessLiabilityCoverageUWOnlyBlock = new AdditionalExcessLiabilityCoverageUWOnlyBlock(driver);
        this.namedAutoAndOperatorExclusionUWOnlyBlock = new NamedAutoAndOperatorExclusionUWOnlyBlock(driver);
        optionalCoverageExcessFloodBlock = new OptionalCoverageExcessFloodBlock(driver);
        propertyInformationBlock = new PropertyInformationBlock(driver);
        this.canineInformationBlock = new CanineInformationBlock(driver);
        this.namedAutoAndOperatorExclusionUWOnlyBlock = new NamedAutoAndOperatorExclusionUWOnlyBlock(driver);
        this.namedPersonExclusionBlock = new NamedPersonExclusionBlock(driver);
        this.namedAutoLiabilityExclusionBlock = new NamedAutoLiabilityExclusionBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOptionalCoveragesPageCC(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageBlock.fillOptionalCoveragesDetailsCC(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsDetailsCC(data);
        verifyCoverageOverrideValidationMessage(data);
    }

    public void fillOptionalCoveragesPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageBlock.fillOptionalCoveragesDetailsCC_END(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsDetailsCC_END(data);
        verifyCoverageOverrideValidationMessage_END(data);
    }

    public void fillOptionalCoveragesPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void verifyCoverageOverrideValidationMessage_END(Map<String, String> data) throws InterruptedException {
        String value = data.get("Coverage_Override_Validation_ENV");
        String TIV = data.get("Project_Details_TIV_ENV");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            pause(2000);
            assertEquals(validationMessage.getText(), "Coverage Override should not be greater than TIV value of " + "$" + TIV.replace(",", ""), "Coverage Override Validation");
        }
    }

    public void verifyCoverageOverrideValidationMessage(Map<String, String> data) throws InterruptedException {
        String value = data.get("Coverage_Override_Validation");
        String TIV = data.get("Project_Details_TIV");
        if (hasValue(value) && value.equalsIgnoreCase("Yes")) {
            pause(2000);
            assertEquals(validationMessage.getText(), "Coverage Override should not be greater than TIV value of " + "$" + TIV.replace(",", ""), "Coverage Override Validation");
        }
    }

    public void fillOptionalCoveragesHO(Map<String, String> data, int i) throws Throwable {
        goToPage("Optional Coverages");

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Effective_Date"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalFloodCoverageBlock.fillOptionalFloodCoverages(data, i);
                    }
                } else {
                    optionalFloodCoverageBlock.fillOptionalFloodCoverages(data, i);
                }
            }
        } else {
            optionalFloodCoverageBlock.fillOptionalFloodCoverages(data, i);
        }

        optionalCoverageBlock.fillOptionalCoverages(data, i);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsHO(data, i);
    }

    public void fillOptionalCoveragesHO(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Effective_Date"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
                    }
                } else {
                    optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
                }
            }
        } else {
            optionalFloodCoverageBlock.fillOptionalFloodCoverages(data);
        }

        optionalCoverageBlock.fillOptionalCoverages(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsHO(data);
    }

    public void fillOptionalCoveragesHO_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");

        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Endorsement_Effective_Date_END"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalFloodCoverageBlock.fillOptionalFloodCoverages_END(data);
                    }
                } else {
                    optionalFloodCoverageBlock.fillOptionalFloodCoverages_END(data);
                }
            }
        } else {
            optionalFloodCoverageBlock.fillOptionalFloodCoverages_END(data);
        }

        optionalCoverageBlock.fillOptionalCoverages_END(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsHO_END(data);
    }

    public void fillOptionalCoveragesHO_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        if (isFloodDate1(data.get("Endorsement_Effective_Date_END"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Endorsement_Effective_Date_END"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalFloodCoverageBlock.fillOptionalFloodCoverages_OOS_END(data);
                    }
                } else {
                    optionalFloodCoverageBlock.fillOptionalFloodCoverages_OOS_END(data);
                }
            }
        } else {
            optionalFloodCoverageBlock.fillOptionalFloodCoverages_OOS_END(data);
        }

        optionalCoverageBlock.fillOptionalCoverages_OOS_END(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsHO_OOS_END(data);
    }

    public void fillOptionalCoveragesHO_RNW(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1a(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Effective_Date"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalFloodCoverageBlock.fillOptionalFloodCoverages_RNW(data);
                    }
                } else {
                    optionalFloodCoverageBlock.fillOptionalFloodCoverages_RNW(data);
                }
            }
        } else {
            optionalFloodCoverageBlock.fillOptionalFloodCoverages_RNW(data);
        }

        optionalCoverageBlock.fillOptionalCoverages_RNW(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsHO_RNW(data);
    }

    public void fillOptionalCoveragesEX(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        pause(3000);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusions(data);
        optionalCoverageComponentUWOnly.fillOptionalCoverageUWOnly(data);
        additionalExcessLiabilityCoverageUWOnlyBlock.addAdditionalCoverages(data);
        namedAutoAndOperatorExclusionUWOnlyBlock.fillNamedAutoAndOperatorExclusionUWOnly(data);
    }

    public void fillOptionalCoverages_EX_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusions_END(data);
        optionalCoverageComponentUWOnly.fillOptionalCoverageUWOnly_END(data);
        additionalExcessLiabilityCoverageUWOnlyBlock.addAdditionalCoverages_END(data);
        namedAutoAndOperatorExclusionUWOnlyBlock.fillNamedAutoAndOperatorExclusionUWOnly_END(data);
    }

    public void fillOptionalCoverages_EX_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusions_OOS_END(data);
        optionalCoverageComponentUWOnly.setProfileLevel(data.get("Profile_Level_OOS_END"));
        additionalExcessLiabilityCoverageUWOnlyBlock.addAdditionalCoverages_OOS_END(data);
    }

    public void fillOptionalCoverages_EX_RNW(Map<String, String> data) throws Throwable {
        reviewPolicyImage();
        goToPage("Optional Coverages");
        reviewPolicyImage();
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusions_RNW(data);
        optionalCoverageComponentUWOnly.fillOptionalCoverageUWOnly_RNW(data);
        additionalExcessLiabilityCoverageUWOnlyBlock.addAdditionalCoverages_RNW(data);
        namedAutoAndOperatorExclusionUWOnlyBlock.fillNamedAutoAndOperatorExclusionUWOnly_RNW(data);
    }

    public void verifyValidationMessage(String validationMessage, int messageOrder) {
        assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_" + messageOrder + "']")).getText(), validationMessage, "Optional coverages validation");
        try {
            assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_3_msg_" + messageOrder + "']")).getText(), validationMessage, "Optional coverages validation");
        } catch (NoSuchElementException e) {
            assertEquals(driver.findElement(By.xpath("//*[@osviewid='mode_2_msg_" + messageOrder + "']")).getText(), validationMessage, "Optional coverages validation");
        }
    }

    public void verifyValidationMessageNotDisplayed(String validationMessage, int messageOrder) {
        Assert.assertEquals(driver.findElements(By.xpath("//*[@osviewid='mode_3_msg_" + messageOrder + "']")).size(), 0);
    }

    public void fillOptionalCoveragesPageHS(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");

        if (isFloodDate1(data.get("Effective_Date"))) {
            if (isFloodState1(data.get("State"))) {
                //block is removed after 09/07/2025
            } else {
                if (isFloodState2(data.get("State"))) {
                    if(isFloodDate2(data.get("Effective_Date"))){
                        //block is removed after 10/20/2025
                    } else {
                        optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS(data);
                    }
                } else {
                    optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS(data);
                }
            }
        } else {
            optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS(data);
        }

        optionalCoverageBlock.fillOptionalCoveragesBlockHS(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsBlockHS(data);
        if (data.get("Optional_Coverages_Liability_Extension").equalsIgnoreCase("Yes")) {
            propertyInformationBlock.fillPropertyInformationBlockHS(data);
        }
        if (data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion").equalsIgnoreCase("Yes")) {
            animalInformationBlock.fillAnimalInformationBlockHS(data);
        }
    }

    public void fillOptionalCoveragesPageHS_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS_END(data);
        optionalCoverageBlock.fillOptionalCoveragesBlockHS_END(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsBlockHS_END(data);
        if (data.get("Optional_Coverages_Liability_Extension_END").equalsIgnoreCase("Yes")) {
            propertyInformationBlock.fillPropertyInformationBlockHS_END(data);
        }
        if (data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion").equalsIgnoreCase("Yes")) {
            animalInformationBlock.fillAnimalInformationBlockHS(data);
        }
    }

    public void fillOptionalCoveragesPageHS_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS_OOS_END(data);
        optionalCoverageBlock.fillOptionalCoveragesBlockHS_OOS_END(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsBlockHS_OOS_END(data);
        if (data.get("Optional_Coverages_Liability_Extension_OOS_END").equalsIgnoreCase("Yes")) {
            propertyInformationBlock.fillPropertyInformationBlockHS_OOS_END(data);
        }
        if (data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion").equalsIgnoreCase("Yes")) {
            animalInformationBlock.fillAnimalInformationBlockHS(data);
        }
    }

    public void fillOptionalCoveragesPageHS_RNW(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageExcessFloodBlock.fillCoverageExcessFloodBlockHS_RNW(data);
        optionalCoverageBlock.fillOptionalCoveragesBlockHS_RNW(data);
        optionalCoveragesExclusionsBlock.fillOptionalCoveragesExclusionsBlockHS_RNW(data);
        if (data.get("Optional_Coverages_Liability_Extension_RNW").equalsIgnoreCase("Yes")) {
            propertyInformationBlock.fillPropertyInformationBlockHS_RNW(data);
        }
        if (data.get("Optional_Coverages_Exclusions_Animal_Liability_Exclusion").equalsIgnoreCase("Yes")) {
            animalInformationBlock.fillAnimalInformationBlockHS(data);
        }
    }

    public void fillOptionalCoveragesPageCO(Map<String, String> data) throws Throwable {
        goToPage("Optional Coverages");
        optionalCoverageBlock.fillOptionalCoveragesBlockCO(data);
    }
}