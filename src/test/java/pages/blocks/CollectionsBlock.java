package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CollectionsBlock extends CommonComponentsAndActions {
    WebDriver driver;
    WorldwideJewleryBlock worldwideJewleryBlock;
    BankVaultedJewelryBlock bankVaultedJewelryBlock;
    FineArtsBlock fineArtsBlock;

    public CollectionsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        worldwideJewleryBlock = new WorldwideJewleryBlock(driver);
        bankVaultedJewelryBlock = new BankVaultedJewelryBlock(driver);
        fineArtsBlock = new FineArtsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Collections Hurricane Deductible']/../../../../div//input")
    WebElement coHurricaneDeductible;
    @FindBy(xpath = "//div[contains(text(),'add Collection coverage to your home')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement addCOCoverageToHomePolicyYes;
    @FindBy(xpath = "//div[contains(text(),'add Collection coverage to your home')]/../../../../div//label[text()='No']/../span/input")
    WebElement addCOCoverageToHomePolicyNo;
    @FindBy(xpath = "//label[text()='Worldwide Jewelry']")
    WebElement worldWideJewelryCheckbox;
    @FindBy(xpath = "//label[text()='Bank Vaulted Jewlery']")
    WebElement bankVaultedJewelryCheckbox;
    @FindBy(xpath = "//label[text()='Fine Arts']")
    WebElement fineArtsCheckbox;
    @FindBy(xpath = "//label[text()='Collectibles']")
    WebElement collectiblesCheckbox;
    @FindBy(xpath = "//label[text()='Coins, silver, stamps, furs, musical instruments']")
    WebElement coinsSilverStampsFursMusicalInstrumentsCheckbox;
    @FindBy(xpath = "//label[text()='Wine']")
    WebElement wineCheckbox;
    @FindBy(xpath = "//label[text()='Miscellaneous valuable items']")
    WebElement miscellaneousValuableItemsCheckbox;


    public void fillCollectionsDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("collections");
        addCOCoverageToHomePolicy(data.get("Collections_Add_CO_To_Home_Policy"));
        pause(2000);
        if (hasValue(data.get("Collections_Add_CO_To_Home_Policy")) && data.get("Collections_Add_CO_To_Home_Policy").equalsIgnoreCase("Yes")) {
            checkWorldWideJewelryCheckbox(data.get("Collections_Worldwide_Jewelry"));
            checkBankVaultedJewleryCheckbox(data.get("Collections_Bank_Vaulted_Jewelry"));
            checkFineArtsCheckbox(data.get("Collections_Fine_Arts"));
            checkCollectiblesCheckbox(data.get("Collections_Collectibles"));
            checkCoinsSilverStampsFursMusicalInstrumentsCheckbox(data.get("Collections_CSSFMI"));
            checkWineCheckbox(data.get("Collections_Wine"));
            checkMiscellaneousValuableItemsCheckbox(data.get("Collections_Miscellaneous_Valuable_Items"));
        }
    }

    public void fillCollectionsDetailsHS_END(Map<String, String> data) throws Throwable {
        if (!data.get("Collections_Add_CO_To_Home_Policy").equalsIgnoreCase("Yes")) {
            addCOCoverageToHomePolicy(data.get("Collections_Add_CO_To_Home_Policy_END"));
        }
        pause(2000);
        if (!data.get("Collections_Worldwide_Jewelry").equalsIgnoreCase("Yes")) {
            checkWorldWideJewelryCheckbox(data.get("Collections_Worldwide_Jewelry_END"));
        }
        if (!data.get("Collections_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes")) {
            checkBankVaultedJewleryCheckbox(data.get("Collections_Bank_Vaulted_Jewelry_END"));
        }
        if (!data.get("Collections_Fine_Arts").equalsIgnoreCase("Yes")) {
            checkFineArtsCheckbox(data.get("Collections_Fine_Arts_END"));
        }
        if (!data.get("Collections_Collectibles").equalsIgnoreCase("Yes")) {
            checkCollectiblesCheckbox(data.get("Collections_Collectibles_END"));
        }
        if (!data.get("Collections_CSSFMI").equalsIgnoreCase("Yes")) {
            checkCoinsSilverStampsFursMusicalInstrumentsCheckbox(data.get("Collections_CSSFMI_END"));
        }
        if (!data.get("Collections_Wine").equalsIgnoreCase("Yes")) {
            checkWineCheckbox(data.get("Collections_Wine_END"));
        }
        if (!data.get("Collections_Miscellaneous_Valuable_Items").equalsIgnoreCase("Yes")) {
            checkMiscellaneousValuableItemsCheckbox(data.get("Collections_Miscellaneous_Valuable_Items_END"));
        }

    }

    public void fillCollectionsDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        if (!data.get("Collections_Add_CO_To_Home_Policy").equalsIgnoreCase("Yes")) {
            addCOCoverageToHomePolicy(data.get("Collections_Add_CO_To_Home_Policy_OOS_END"));
        }
        pause(2000);
        if (!data.get("Collections_Worldwide_Jewelry").equalsIgnoreCase("Yes")) {
            checkWorldWideJewelryCheckbox(data.get("Collections_Worldwide_Jewelry_OOS_END"));
        }
        if (!data.get("Collections_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes")) {
            checkBankVaultedJewleryCheckbox(data.get("Collections_Bank_Vaulted_Jewelry_OOS_END"));
        }
        if (!data.get("Collections_Fine_Arts").equalsIgnoreCase("Yes")) {
            checkFineArtsCheckbox(data.get("Collections_Fine_Arts_OOS_END"));
        }
        if (!data.get("Collections_Collectibles").equalsIgnoreCase("Yes")) {
            checkCollectiblesCheckbox(data.get("Collections_Collectibles_OOS_END"));
        }
        if (!data.get("Collections_CSSFMI").equalsIgnoreCase("Yes")) {
            checkCoinsSilverStampsFursMusicalInstrumentsCheckbox(data.get("Collections_CSSFMI_OOS_END"));
        }
        if (!data.get("Collections_Wine").equalsIgnoreCase("Yes")) {
            checkWineCheckbox(data.get("Collections_Wine_OOS_END"));
        }
        if (!data.get("Collections_Miscellaneous_Valuable_Items").equalsIgnoreCase("Yes")) {
            checkMiscellaneousValuableItemsCheckbox(data.get("Collections_Miscellaneous_Valuable_Items_OOS_END"));
        }

    }

    public void fillCollectionsDetailsHS_RNW(Map<String, String> data) throws Throwable {
        if (!data.get("Collections_Add_CO_To_Home_Policy").equalsIgnoreCase("Yes")) {
            addCOCoverageToHomePolicy(data.get("Collections_Add_CO_To_Home_Policy_RNW"));
        }
        pause(2000);
        if (!data.get("Collections_Worldwide_Jewelry").equalsIgnoreCase("Yes")) {
            checkWorldWideJewelryCheckbox(data.get("Collections_Worldwide_Jewelry_RNW"));
        }
        if (!data.get("Collections_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes")) {
            checkBankVaultedJewleryCheckbox(data.get("Collections_Bank_Vaulted_Jewelry_RNW"));
        }
        if (!data.get("Collections_Fine_Arts").equalsIgnoreCase("Yes")) {
            checkFineArtsCheckbox(data.get("Collections_Fine_Arts_RNW"));
        }
        if (!data.get("Collections_Collectibles").equalsIgnoreCase("Yes")) {
            checkCollectiblesCheckbox(data.get("Collections_Collectibles_RNW"));
        }
        if (!data.get("Collections_CSSFMI").equalsIgnoreCase("Yes")) {
            checkCoinsSilverStampsFursMusicalInstrumentsCheckbox(data.get("Collections_CSSFMI_RNW"));
        }
        if (!data.get("Collections_Wine").equalsIgnoreCase("Yes")) {
            checkWineCheckbox(data.get("Collections_Wine_RNW"));
        }
        if (!data.get("Collections_Miscellaneous_Valuable_Items").equalsIgnoreCase("Yes")) {
            checkMiscellaneousValuableItemsCheckbox(data.get("Collections_Miscellaneous_Valuable_Items_RNW"));
        }
    }

    public void checkMiscellaneousValuableItemsCheckbox(String value) throws Throwable {
        checkCheckbox(miscellaneousValuableItemsCheckbox, value, "Miscellaneous Valuable Items Checkbox");
    }

    public void checkWineCheckbox(String value) throws Throwable {
        checkCheckbox(wineCheckbox, value, "Wine");
    }

    public void checkCoinsSilverStampsFursMusicalInstrumentsCheckbox(String value) throws Throwable {
        checkCheckbox(coinsSilverStampsFursMusicalInstrumentsCheckbox, value, "Coins Silver Stamps Furs Musical Instruments");
    }

    public void checkCollectiblesCheckbox(String value) throws Throwable {
        checkCheckbox(collectiblesCheckbox, value, "Collectibles");
    }

    public void checkFineArtsCheckbox(String value) throws Throwable {
        checkCheckbox(fineArtsCheckbox, value, "Fine Arts");

    }

    public void checkBankVaultedJewleryCheckbox(String value) throws Throwable {
        checkCheckbox(bankVaultedJewelryCheckbox, value, "Bank Vaulted Jewlery");
    }

    public void checkWorldWideJewelryCheckbox(String value) throws Throwable {
        checkCheckbox(worldWideJewelryCheckbox, value, "World Wide Jewelry");
    }

    public void addCOCoverageToHomePolicy(String value) throws Throwable {
        choose(addCOCoverageToHomePolicyYes, addCOCoverageToHomePolicyNo, value, "Add CO Coverage To Home Policy");
    }

}