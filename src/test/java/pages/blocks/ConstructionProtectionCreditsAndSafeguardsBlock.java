package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class ConstructionProtectionCreditsAndSafeguardsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ConstructionProtectionCreditsAndSafeguardsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Fire Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement fireAlarmYes;
    @FindBy(xpath = "//div[text()='Fire Alarm']/../../../..//label[text()='No']/..//input")
    WebElement fireAlarmNo;
    @FindBy(xpath = "//div[text()='Fire Alarm']/ancestor::tr[@role]/td[2]//input")
    WebElement fireAlarmRequired;

    @FindBy(xpath = "//div[text()='Burglar Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement burglarAlarmYes;
    @FindBy(xpath = "//div[text()='Burglar Alarm']/../../../..//label[text()='No']/..//input")
    WebElement burglarAlarmNo;
    @FindBy(xpath = "//div[text()='Burglar Alarm']/ancestor::tr[@role]/td[2]//input")
    WebElement burglarAlarmRequired;

    @FindBy(xpath = "//div[text()='Fire Extinguishers']/../../../..//label[text()='Yes']/..//input")
    WebElement fireExtinguishersYes;
    @FindBy(xpath = "//div[text()='Fire Extinguishers']/../../../..//label[text()='No']/..//input")
    WebElement fireExtinguishersNo;
    @FindBy(xpath = "//div[text()='Fire Extinguishers']/ancestor::tr[@role]/td[2]//input")
    WebElement fireExtinguishersRequired;

    @FindBy(xpath = "//div[text()='Fire Proof Storage Cabinet']/../../../..//label[text()='Yes']/..//input")
    WebElement fireProofStorageCabinetYes;
    @FindBy(xpath = "//div[text()='Fire Proof Storage Cabinet']/../../../..//label[text()='No']/..//input")
    WebElement fireProofStorageCabinetNo;
    @FindBy(xpath = "//div[text()='Fire Proof Storage Cabinet']/ancestor::tr[@role]/td[2]//input")
    WebElement fireProofStorageCabinetRequired;

    @FindBy(xpath = "//div[text()='Watchman/Security Guard']/../../../..//label[text()='Yes']/..//input")
    WebElement watchmanSecurityGuardYes;
    @FindBy(xpath = "//div[text()='Watchman/Security Guard']/../../../..//label[text()='No']/..//input")
    WebElement watchmanSecurityGuardNo;
    @FindBy(xpath = "//div[text()='Watchman/Security Guard']/ancestor::tr[@role]/td[2]//input")
    WebElement watchmanSecurityGuardRequired;

    @FindBy(xpath = "//div[text()='Video Surveillance']/../../../..//label[text()='Yes']/..//input")
    WebElement videoSurveillanceYes;
    @FindBy(xpath = "//div[text()='Video Surveillance']/../../../..//label[text()='No']/..//input")
    WebElement videoSurveillanceNo;
    @FindBy(xpath = "//div[text()='Video Surveillance']/ancestor::tr[@role]/td[2]//input")
    WebElement videoSurveillanceRequired;

    @FindBy(xpath = "//div[text()='Oily Rag Disposal']/../../../..//label[text()='Yes']/..//input")
    WebElement oilyRagDisposalYes;
    @FindBy(xpath = "//div[text()='Oily Rag Disposal']/../../../..//label[text()='No']/..//input")
    WebElement oilyRagDisposalNo;
    @FindBy(xpath = "//div[text()='Oily Rag Disposal']/ancestor::tr[@role]/td[2]//input")
    WebElement oilyRagDisposalRequired;

    @FindBy(xpath = "//div[text()='No Smoking Policy']/../../../..//label[text()='Yes']/..//input")
    WebElement noSmokingPolicyYes;
    @FindBy(xpath = "//div[text()='No Smoking Policy']/../../../..//label[text()='No']/..//input")
    WebElement noSmokingPolicyNo;
    @FindBy(xpath = "//div[text()='No Smoking Policy']/ancestor::tr[@role]/td[2]//input")
    WebElement noSmokingPolicyRequired;

    @FindBy(xpath = "//div[text()='Signage']/../../../..//label[text()='Yes']/..//input")
    WebElement signageYes;
    @FindBy(xpath = "//div[text()='Signage']/../../../..//label[text()='No']/..//input")
    WebElement signageNo;
    @FindBy(xpath = "//div[text()='Signage']/ancestor::tr[@role]/td[2]//input")
    WebElement signageRequired;

    @FindBy(xpath = "//div[text()='Exterior Lighting']/../../../..//label[text()='Yes']/..//input")
    WebElement exteriorLightingYes;
    @FindBy(xpath = "//div[text()='Exterior Lighting']/../../../..//label[text()='No']/..//input")
    WebElement exteriorLightingNo;
    @FindBy(xpath = "//div[text()='Exterior Lighting']/ancestor::tr[@role]/td[2]//input")
    WebElement exteriorLightingRequired;

    @FindBy(xpath = "//div[text()='Full Perimeter Fence']/../../../..//label[text()='Yes']/..//input")
    WebElement fullPerimeterFenceYes;
    @FindBy(xpath = "//div[text()='Full Perimeter Fence']/../../../..//label[text()='No']/..//input")
    WebElement fullPerimeterFenceNo;
    @FindBy(xpath = "//div[text()='Full Perimeter Fence']/ancestor::tr[@role]/td[2]//input")
    WebElement fullPerimeterFenceRequired;

    @FindBy(xpath = "//div[text()='Gated Driveway']/../../../..//label[text()='Yes']/..//input")
    WebElement gatedDrivewayYes;
    @FindBy(xpath = "//div[text()='Gated Driveway']/../../../..//label[text()='No']/..//input")
    WebElement gatedDrivewayNo;
    @FindBy(xpath = "//div[text()='Gated Driveway']/ancestor::tr[@role]/td[2]//input")
    WebElement gatedDrivewayRequired;

    public void fillConstructionProtectionCreditsAndSafeguardsBlockCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("construction protection credits and safeguards");
        setFireAlarm(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Alarm"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Alarm_Required"));
        setBurglarAlarm(data.get("Construction_Protection_Credits_And_Safeguards_Burglar_Alarm"), data.get("Construction_Protection_Credits_And_Safeguards_Burglar_Alarm_Required"));
        setFireExtinguishers(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Extinguishers"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Extinguishers_Required"));
        setFireProofStorageCabinet(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Proof_Storage_Cabinet"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Proof_Storage_Cabinet_Required"));
        setWatchmanSecurityGuard(data.get("Construction_Protection_Credits_And_Safeguards_Watchman_Security_Guard"), data.get("Construction_Protection_Credits_And_Safeguards_Watchman_Security_Guard_Required"));
        setVideoSurveillance(data.get("Construction_Protection_Credits_And_Safeguards_Video_Surveillance"), data.get("Construction_Protection_Credits_And_Safeguards_Video_Surveillance_Required"));
        setOilyRagDisposal(data.get("Construction_Protection_Credits_And_Safeguards_Oily_Rag_Disposal"), data.get("Construction_Protection_Credits_And_Safeguards_Oily_Rag_Disposal_Required"));
        setNoSmokingPolicy(data.get("Construction_Protection_Credits_And_Safeguards_No_Smoking_Policy"), data.get("Construction_Protection_Credits_And_Safeguards_No_Smoking_Policy_Required"));
        setSignage(data.get("Construction_Protection_Credits_And_Safeguards_Signage"), data.get("Construction_Protection_Credits_And_Safeguards_Signage_Required"));
        setExteriorLighting(data.get("Construction_Protection_Credits_And_Safeguards_Exterior_Lighting"), data.get("Construction_Protection_Credits_And_Safeguards_Exterior_Lighting_Required"));
        setFullPerimeterFence(data.get("Construction_Protection_Credits_And_Safeguards_Full_Perimeter_Fence"), data.get("Construction_Protection_Credits_And_Safeguards_Full_Perimeter_Fence_Required"));
        setGatedDriveway(data.get("Construction_Protection_Credits_And_Safeguards_Gated_Driveway"), data.get("Construction_Protection_Credits_And_Safeguards_Gated_Driveway_Required"));
        saveChanges();
    }

    public void fillConstructionProtectionCreditsAndSafeguardsBlockCC_END(Map<String, String> data) throws Throwable {
        setFireAlarm(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Alarm_END"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Alarm_Required_END"));
        setBurglarAlarm(data.get("Construction_Protection_Credits_And_Safeguards_Burglar_Alarm_END"), data.get("Construction_Protection_Credits_And_Safeguards_Burglar_Alarm_Required_END"));
        setFireExtinguishers(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Extinguishers_END"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Extinguishers_Required_END"));
        setFireProofStorageCabinet(data.get("Construction_Protection_Credits_And_Safeguards_Fire_Proof_Storage_Cabinet_END"), data.get("Construction_Protection_Credits_And_Safeguards_Fire_Proof_Storage_Cabinet_Required_END"));
        setWatchmanSecurityGuard(data.get("Construction_Protection_Credits_And_Safeguards_Watchman_Security_Guard_END"), data.get("Construction_Protection_Credits_And_Safeguards_Watchman_Security_Guard_Required_END"));
        setVideoSurveillance(data.get("Construction_Protection_Credits_And_Safeguards_Video_Surveillance_END"), data.get("Construction_Protection_Credits_And_Safeguards_Video_Surveillance_Required_END"));
        setOilyRagDisposal(data.get("Construction_Protection_Credits_And_Safeguards_Oily_Rag_Disposal_END"), data.get("Construction_Protection_Credits_And_Safeguards_Oily_Rag_Disposal_Required_END"));
        setNoSmokingPolicy(data.get("Construction_Protection_Credits_And_Safeguards_No_Smoking_Policy_END"), data.get("Construction_Protection_Credits_And_Safeguards_No_Smoking_Policy_Required_END"));
        setSignage(data.get("Construction_Protection_Credits_And_Safeguards_Signage_END"), data.get("Construction_Protection_Credits_And_Safeguards_Signage_Required_END"));
        setExteriorLighting(data.get("Construction_Protection_Credits_And_Safeguards_Exterior_Lighting_END"), data.get("Construction_Protection_Credits_And_Safeguards_Exterior_Lighting_Required_END"));
        setFullPerimeterFence(data.get("Construction_Protection_Credits_And_Safeguards_Full_Perimeter_Fence_END"), data.get("Construction_Protection_Credits_And_Safeguards_Full_Perimeter_Fence_Required_END"));
        setGatedDriveway(data.get("Construction_Protection_Credits_And_Safeguards_Gated_Driveway_END"), data.get("Construction_Protection_Credits_And_Safeguards_Gated_Driveway_Required_END"));
        saveChanges();
    }

    public void setGatedDriveway(String valueYesNo, String valueRequired) throws Throwable {
        choose(gatedDrivewayYes, gatedDrivewayNo, valueYesNo, "Gated Driveway");
        typeTextEnter(gatedDrivewayRequired, valueRequired, "Gated Driveway");
    }

    public void setFullPerimeterFence(String valueYesNo, String valueRequired) throws Throwable {
        choose(fullPerimeterFenceYes, fullPerimeterFenceNo, valueYesNo, "Full Perimeter Fence");
        typeTextEnter(fullPerimeterFenceRequired, valueRequired, "Full Perimeter Fence");
    }

    public void setExteriorLighting(String valueYesNo, String valueRequired) throws Throwable {
        choose(exteriorLightingYes, exteriorLightingNo, valueYesNo, "Exterior Lighting");
        typeTextEnter(exteriorLightingRequired, valueRequired, "Exterior Lighting");
    }

    public void setSignage(String valueYesNo, String valueRequired) throws Throwable {
        choose(signageYes, signageNo, valueYesNo, "Signage");
        typeTextEnter(signageRequired, valueRequired, "Signage");
    }

    public void setNoSmokingPolicy(String valueYesNo, String valueRequired) throws Throwable {
        choose(noSmokingPolicyYes, noSmokingPolicyNo, valueYesNo, "No Smoking Policy");
        typeTextEnter(noSmokingPolicyRequired, valueRequired, "No Smoking Policy");
    }

    public void setOilyRagDisposal(String valueYesNo, String valueRequired) throws Throwable {
        choose(oilyRagDisposalYes, oilyRagDisposalNo, valueYesNo, "Oily Rag Disposal");
        typeTextEnter(oilyRagDisposalRequired, valueRequired, "Oily Rag Disposal");
    }

    public void setVideoSurveillance(String valueYesNo, String valueRequired) throws Throwable {
        choose(videoSurveillanceYes, videoSurveillanceNo, valueYesNo, "Video Surveillance");
        typeTextEnter(videoSurveillanceRequired, valueRequired, "Video Surveillance");

    }

    public void setWatchmanSecurityGuard(String valueYesNo, String valueRequired) throws Throwable {
        choose(watchmanSecurityGuardYes, watchmanSecurityGuardNo, valueYesNo, "Watchman Security Guard");
        typeTextEnter(watchmanSecurityGuardRequired, valueRequired, "Watchman Security Guard");
    }

    public void setFireProofStorageCabinet(String valueYesNo, String valueRequired) throws Throwable {
        choose(fireProofStorageCabinetYes, fireProofStorageCabinetNo, valueYesNo, "Fire Proof Storage Cabinet");
        typeTextEnter(fireProofStorageCabinetRequired, valueRequired, "Fire Proof Storage Cabinet");
    }

    public void setFireExtinguishers(String valueYesNo, String valueRequired) throws Throwable {
        choose(fireExtinguishersYes, fireExtinguishersNo, valueYesNo, "Fire Extinguishers");
        typeTextEnter(fireExtinguishersRequired, valueRequired, "Fire Extinguishers");
    }

    public void setFireAlarm(String valueYesNo, String valueRequired) throws Throwable {
        choose(fireAlarmYes, fireAlarmNo, valueYesNo, "Fire Alarm");
        typeTextEnter(fireAlarmRequired, valueRequired, "Fire Alarm");
    }

    public void setBurglarAlarm(String valueYesNo, String valueRequired) throws Throwable {
        choose(burglarAlarmYes, burglarAlarmNo, valueYesNo, "Burglar Alarm");
        typeTextEnter(burglarAlarmRequired, valueRequired, "Burglar Alarm");
    }

}