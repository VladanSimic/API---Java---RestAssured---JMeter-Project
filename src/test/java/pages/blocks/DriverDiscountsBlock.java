package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class DriverDiscountsBlock extends CommonComponentsAndActions {

    public DriverDiscountsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[1]/div")
    List<WebElement> driverCell;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[2]/div")
    List<WebElement> superiorDriver;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[3]/div")
    List<WebElement> excellentDriver;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[4]/div")
    List<WebElement> exceptionalDriver;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[5]/div")
    List<WebElement> purePreferredDriver;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[6]/div")
    List<WebElement> caGoodDriver;
    @FindBy(xpath = "//div[text()='driver discounts']/../../../../../../../..//table//td[7]/div")
    List<WebElement> superiorExcellentExceptional;

    public void fillDriverDiscountsDetailsPA(Map<String, String> data) {
        verifyDriverCell(data.get("Driver_Discounts_Driver"), 0);
        verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver"), 0);
        verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver"), 0);
        verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver"), 0);
        verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver"), 0);
        verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver"), 0);
        verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional"), 0);

        for (int i = 1; i < data.get("Additional_Operators").split(",").length; i++) {
            verifyDriverCell(data.get("Driver_Discounts_Driver_" + i), i);
            verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_" + i), i);
            verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_" + i), i);
            verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_" + i), i);
            verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_" + i), i);
            verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_" + i), i);
            verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_" + i), i);
        }
    }

    public void fillDriverDiscountsDetailsPA_END(Map<String, String> data) {
        verifyDriverCell(data.get("Driver_Discounts_Driver_END"), 0);
        verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_END"), 0);
        verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_END"), 0);
        verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_END"), 0);
        verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_END"), 0);
        verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_END"), 0);
        verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_END"), 0);

//        for(int i = 1; i < data.get("Additional_Operators_END").split(",").length; i++) {
//            verifyDriverCell(data.get("Driver_Discounts_Driver_END_" + i), i);
//            verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_END_" + i), i);
//            verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_END_" + i), i);
//            verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_END_" + i), i);
//            verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_END_" + i), i);
//            verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_END_" + i), i);
//            verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_END_" + i), i);
//        }
        //TODO PA END - Driver discounts - Low
    }

    public void fillDriverDiscountsDetailsPA_OOS_END(Map<String, String> data) {
        verifyDriverCell(data.get("Driver_Discounts_Driver_OOS_END"), 0);
        verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_OOS_END"), 0);
        verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_OOS_END"), 0);
        verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_OOS_END"), 0);
        verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_OOS_END"), 0);
        verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_OOS_END"), 0);
        verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_OOS_END"), 0);

        for (int i = 1; i < data.get("Additional_Operators_OOS_END").split(",").length; i++) {
            verifyDriverCell(data.get("Driver_Discounts_Driver_OOS_END_" + i), i);
            verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_OOS_END_" + i), i);
            verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_OOS_END_" + i), i);
            verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_OOS_END_" + i), i);
            verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_OOS_END_" + i), i);
            verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_OOS_END_" + i), i);
            verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_OOS_END_" + i), i);
        }
        //TODO PA OOS - Driver discounts - Low
    }

    public void fillDriverDiscountsDetailsPA_RNW(Map<String, String> data) {
        verifyDriverCell(data.get("Driver_Discounts_Driver_RNW"), 0);
        verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_RNW"), 0);
        verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_RNW"), 0);
        verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_RNW"), 0);
        verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_RNW"), 0);
        verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_RNW"), 0);
        verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_RNW"), 0);

        for (int i = 1; i < data.get("Additional_Operators_RNW").split(",").length; i++) {
            verifyDriverCell(data.get("Driver_Discounts_Driver_RNW_" + i), i);
            verifySuperiorDriver(data.get("Driver_Discounts_Superior_Driver_RNW_" + i), i);
            verifyExcellentDriver(data.get("Driver_Discounts_Excellent_Driver_RNW_" + i), i);
            verifyExceptionalDriver(data.get("Driver_Discounts_Exceptional_Driver_RNW_" + i), i);
            verifyPUREPreferredDriver(data.get("Driver_Discounts_PURE_Preferred_Driver_RNW_" + i), i);
            verifyCAGoodDriver(data.get("Driver_Discounts_CA_Good_Driver_RNW_" + i), i);
            verifySuperiorExcellentExceptional(data.get("Driver_Discounts_Superior_Excellent_Exceptional_RNW_" + i), i);
        }
        //TODO PA RNW - Driver discounts - Low
    }

    public void verifyDriverCell(String s, int i) {
        assertEquals(driverCell.get(i).getText(), s, "Driver");
    }

    public void verifySuperiorDriver(String s, int i) {
        assertEquals(superiorDriver.get(i).getText(), s, "Superior Driver");
    }

    public void verifyExcellentDriver(String s, int i) {
        assertEquals(excellentDriver.get(i).getText(), s, "Excellent Driver");
    }

    public void verifyExceptionalDriver(String s, int i) {
        assertEquals(exceptionalDriver.get(i).getText(), s, "Exceptional Driver");
    }

    public void verifyPUREPreferredDriver(String s, int i) {
        assertEquals(purePreferredDriver.get(i).getText(), s, "PURE Preferred Driver");
    }

    public void verifyCAGoodDriver(String s, int i) {
        assertEquals(caGoodDriver.get(i).getText(), s, "CA Good Driver");
    }

    public void verifySuperiorExcellentExceptional(String s, int i) {
        assertEquals(superiorExcellentExceptional.get(i).getText(), s, "Superior Excellent Exceptional");
    }

}