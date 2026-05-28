package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CoverageScheduleSummaryBlock extends CommonComponentsAndActions {

    WebDriver driver;
    WorldwideJewleryBlock worldwideJewleryBlock;
    BankVaultedJewelryBlock bankVaultedJewelryBlock;
    FineArtsBlock fineArtsBlock;
    CollectiblesBlock collectiblesBlock;
    WineCollectionsBlock wineCollectionsBlock;
    MiscellaneousValuableItemsBlock miscellaneousValuableItemsBlock;
    CoinsSilverStampsFursMIBlock coinsSilverStampsFursMIBlock;

    public CoverageScheduleSummaryBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        worldwideJewleryBlock = new WorldwideJewleryBlock(driver);
        bankVaultedJewelryBlock = new BankVaultedJewelryBlock(driver);
        fineArtsBlock = new FineArtsBlock(driver);
        collectiblesBlock = new CollectiblesBlock(driver);
        wineCollectionsBlock = new WineCollectionsBlock(driver);
        miscellaneousValuableItemsBlock = new MiscellaneousValuableItemsBlock(driver);
        coinsSilverStampsFursMIBlock = new CoinsSilverStampsFursMIBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label//div[text()='Collection Class to be added']/../../../..//input")
    WebElement collClassToBeAdded;
    @FindBy(xpath = "//label//div[text()='Number of items to be added']/../../../..//input")
    WebElement noOfItemsToBeAdded;
    @FindBy(xpath = "//span[@osviewid='PAI_490206_OT_2289906_OI_1_BI_1477914_CI_15975514']")
    WebElement addButton;
    @FindBy(xpath = "//span[text()='add']")
    WebElement addButtonHS;
    @FindBy(xpath = "//div[@osviewid='PAI_490206_OT_2290006_OI_1_BI_1847433_CI_19164533']")
    WebElement WWJDescription;
    @FindBy(xpath = "//div[@osviewid='PAI_490206_OT_2290006_OI_1_BI_1847433_CI_19164633']")
    WebElement WWJLimitOfItems;
    @FindBy(xpath = "//div[text()='bank vaulted jewelry']")
    WebElement block;
    @FindBy(xpath = "//div[contains(text(),'summary')]")
    WebElement blockSummary;

    ///// HS Collections//////
    public void addCollectionClassesWWJHS() throws Throwable {
        typeText(collClassToBeAdded, "Worldwide Jewelry");
        typeText(noOfItemsToBeAdded, "1");
        clickElement(addButtonHS);
        pause(3000);
    }

    public void fillWorldwideJewelryHS(Map<String, String> data) throws Throwable {
        addCollectionClassesWWJHS();
        pause(3000);
        typeText(driver.switchTo().activeElement(), data.get("Schedule_Worldwide_WWJ_Description"));
//        clickElement(WWJDescription);
        pause(1000);
//        clickElement(WWJLimitOfItems);
        pause(1000);
        typeText(driver.switchTo().activeElement(), data.get("Schedule_Worldwide_WWJ_Limit_Of_Items"));
//        typeText(WWJLimitOfItems, data.get("WWJ_Limit_Of_Items"));
        pause(1000);
    }

    public void fillSummaryDetailsHS(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Collections_Schedule_Collection_Items"))) {
            int totalItemNum = data.get("Collections_Schedule_Collection_Items").split(",").length;

            int worldWideJewelryNum = 0;
            int bankVaultedJewelryNum = 0;
            int fineArtsNum = 0;
            int collectiblesNum = 0;
            int wineNum = 0;
            int miscellaneousValuableItemsNum = 0;
            int coinsSilverStampsFursMusicalInstrumentsNum = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsNum++;
                }
            }

            if (worldWideJewelryNum > 0) {
                addCollectionClass("Worldwide Jewelry");
                setNumberOfItems(String.valueOf(worldWideJewelryNum));
                clickAdd();
            }

            if (bankVaultedJewelryNum > 0) {
                addCollectionClass("Bank Vaulted Jewelry");
                setNumberOfItems(String.valueOf(bankVaultedJewelryNum));
                clickAdd();
            }

            if (fineArtsNum > 0) {
                addCollectionClass("Fine Arts");
                setNumberOfItems(String.valueOf(fineArtsNum));
                clickAdd();
            }

            if (collectiblesNum > 0) {
                addCollectionClass("Collectibles");
                setNumberOfItems(String.valueOf(collectiblesNum));
                clickAdd();
            }

            if (wineNum > 0) {
                addCollectionClass("Wine");
                setNumberOfItems(String.valueOf(wineNum));
                clickAdd();
            }

            if (miscellaneousValuableItemsNum > 0) {
                addCollectionClass("Miscellaneous Valuable Items");
                setNumberOfItems(String.valueOf(miscellaneousValuableItemsNum));
                clickAdd();
            }

            if (coinsSilverStampsFursMusicalInstrumentsNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs, Musical Instruments");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursMusicalInstrumentsNum));
                clickAdd();
            }

            int worldWideJewelryOccurrence = 0;
            int bankVaultedJewelryOccurrence = 0;
            int fineArtsOccurrence = 0;
            int collectiblesOccurrence = 0;
            int wineOccurrence = 0;
            int miscellaneousValuableItemsOccurrence = 0;
            int coinsSilverStampsFursMusicalInstrumentsOccurrence = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    new WorldwideJewleryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), worldWideJewelryOccurrence);
                    new WorldwideJewleryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), worldWideJewelryOccurrence);
                    worldWideJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    new BankVaultedJewelryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), bankVaultedJewelryOccurrence);
                    new BankVaultedJewelryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), bankVaultedJewelryOccurrence);
                    bankVaultedJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    new FineArtsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), fineArtsOccurrence);
                    new FineArtsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), fineArtsOccurrence);
                    fineArtsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    new CollectiblesBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), collectiblesOccurrence);
                    new CollectiblesBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), collectiblesOccurrence);
                    collectiblesOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    new WineCollectionsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), wineOccurrence);
                    new WineCollectionsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), wineOccurrence);
                    wineOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    new MiscellaneousValuableItemsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    new MiscellaneousValuableItemsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    miscellaneousValuableItemsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    new CoinsSilverStampsFursMIBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    new CoinsSilverStampsFursMIBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    coinsSilverStampsFursMusicalInstrumentsOccurrence++;
                }
            }
        }
    }

    public void fillSummaryDetailsHS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Collections_Schedule_Collection_Items_END"))) {
            int totalItemNum = data.get("Collections_Schedule_Collection_Items").split(",").length;
            int totalItemNumEnd = data.get("Collections_Schedule_Collection_Items_END").split(",").length;

            int worldWideJewelryNum = 0;
            int bankVaultedJewelryNum = 0;
            int fineArtsNum = 0;
            int collectiblesNum = 0;
            int wineNum = 0;
            int miscellaneousValuableItemsNum = 0;
            int coinsSilverStampsFursMusicalInstrumentsNum = 0;

            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsNum++;
                }
            }

            if (worldWideJewelryNum > 0) {
                addCollectionClass("Worldwide Jewelry");
                setNumberOfItems(String.valueOf(worldWideJewelryNum));
                clickAdd();
            }

            if (bankVaultedJewelryNum > 0) {
                addCollectionClass("Bank Vaulted Jewelry");
                setNumberOfItems(String.valueOf(bankVaultedJewelryNum));
                clickAdd();
            }

            if (fineArtsNum > 0) {
                addCollectionClass("Fine Arts");
                setNumberOfItems(String.valueOf(fineArtsNum));
                clickAdd();
            }

            if (collectiblesNum > 0) {
                addCollectionClass("Collectibles");
                setNumberOfItems(String.valueOf(collectiblesNum));
                clickAdd();
            }

            if (wineNum > 0) {
                addCollectionClass("Wine");
                setNumberOfItems(String.valueOf(wineNum));
                clickAdd();
            }

            if (miscellaneousValuableItemsNum > 0) {
                addCollectionClass("Miscellaneous Valuable Items");
                setNumberOfItems(String.valueOf(miscellaneousValuableItemsNum));
                clickAdd();
            }

            if (coinsSilverStampsFursMusicalInstrumentsNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs, Musical Instruments");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursMusicalInstrumentsNum));
                clickAdd();
            }

            int worldWideJewelryOccurrence = 0;
            int bankVaultedJewelryOccurrence = 0;
            int fineArtsOccurrence = 0;
            int collectiblesOccurrence = 0;
            int wineOccurrence = 0;
            int miscellaneousValuableItemsOccurrence = 0;
            int coinsSilverStampsFursMusicalInstrumentsOccurrence = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsOccurrence++;
                }
            }

            int worldWideJewelryOccurrenceEND = worldWideJewelryOccurrence;
            int bankVaultedJewelryOccurrenceEND = bankVaultedJewelryOccurrence;
            int fineArtsOccurrenceEND = fineArtsOccurrence;
            int collectiblesOccurrenceEND = collectiblesOccurrence;
            int wineOccurrenceEND = wineOccurrence;
            int miscellaneousValuableItemsOccurrenceEND = miscellaneousValuableItemsOccurrence;
            int coinsSilverStampsFursMusicalInstrumentsOccurrenceEND = coinsSilverStampsFursMusicalInstrumentsOccurrence;

            // TODO Currently works only if adding items on END and NB (no other transactions occurred)
            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    new WorldwideJewleryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), worldWideJewelryOccurrenceEND);
                    new WorldwideJewleryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), worldWideJewelryOccurrenceEND);
                    worldWideJewelryOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    new BankVaultedJewelryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), bankVaultedJewelryOccurrenceEND);
                    new BankVaultedJewelryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), bankVaultedJewelryOccurrenceEND);
                    bankVaultedJewelryOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    new FineArtsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), fineArtsOccurrenceEND);
                    new FineArtsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), fineArtsOccurrenceEND);
                    fineArtsOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    new CollectiblesBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), collectiblesOccurrenceEND);
                    new CollectiblesBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), collectiblesOccurrenceEND);
                    collectiblesOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    new WineCollectionsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), wineOccurrenceEND);
                    new WineCollectionsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), wineOccurrenceEND);
                    wineOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    new MiscellaneousValuableItemsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), miscellaneousValuableItemsOccurrenceEND);
                    new MiscellaneousValuableItemsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), miscellaneousValuableItemsOccurrenceEND);
                    miscellaneousValuableItemsOccurrenceEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_END_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    new CoinsSilverStampsFursMIBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_END_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceEND);
                    new CoinsSilverStampsFursMIBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_END_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceEND);
                    coinsSilverStampsFursMusicalInstrumentsOccurrenceEND++;
                }
            }
        }
    }

    public void fillSummaryDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Collections_Schedule_Collection_Items_OOS_END"))) {
            int totalItemNum = data.get("Collections_Schedule_Collection_Items").split(",").length;
            int totalItemNumEnd = data.get("Collections_Schedule_Collection_Items_OOS_END").split(",").length;

            int worldWideJewelryNum = 0;
            int bankVaultedJewelryNum = 0;
            int fineArtsNum = 0;
            int collectiblesNum = 0;
            int wineNum = 0;
            int miscellaneousValuableItemsNum = 0;
            int coinsSilverStampsFursMusicalInstrumentsNum = 0;

            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsNum++;
                }
            }

            if (worldWideJewelryNum > 0) {
                addCollectionClass("Worldwide Jewelry");
                setNumberOfItems(String.valueOf(worldWideJewelryNum));
                clickAdd();
            }

            if (bankVaultedJewelryNum > 0) {
                addCollectionClass("Bank Vaulted Jewelry");
                setNumberOfItems(String.valueOf(bankVaultedJewelryNum));
                clickAdd();
            }

            if (fineArtsNum > 0) {
                addCollectionClass("Fine Arts");
                setNumberOfItems(String.valueOf(fineArtsNum));
                clickAdd();
            }

            if (collectiblesNum > 0) {
                addCollectionClass("Collectibles");
                setNumberOfItems(String.valueOf(collectiblesNum));
                clickAdd();
            }

            if (wineNum > 0) {
                addCollectionClass("Wine");
                setNumberOfItems(String.valueOf(wineNum));
                clickAdd();
            }

            if (miscellaneousValuableItemsNum > 0) {
                addCollectionClass("Miscellaneous Valuable Items");
                setNumberOfItems(String.valueOf(miscellaneousValuableItemsNum));
                clickAdd();
            }

            if (coinsSilverStampsFursMusicalInstrumentsNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs, Musical Instruments");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursMusicalInstrumentsNum));
                clickAdd();
            }

            int worldWideJewelryOccurrence = 0;
            int bankVaultedJewelryOccurrence = 0;
            int fineArtsOccurrence = 0;
            int collectiblesOccurrence = 0;
            int wineOccurrence = 0;
            int miscellaneousValuableItemsOccurrence = 0;
            int coinsSilverStampsFursMusicalInstrumentsOccurrence = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsOccurrence++;
                }
            }

            int worldWideJewelryOccurrenceOOSEND = worldWideJewelryOccurrence;
            int bankVaultedJewelryOccurrenceOOSEND = bankVaultedJewelryOccurrence;
            int fineArtsOccurrenceOOSEND = fineArtsOccurrence;
            int collectiblesOccurrenceOOSEND = collectiblesOccurrence;
            int wineOccurrenceOOSEND = wineOccurrence;
            int miscellaneousValuableItemsOccurrenceOOSEND = miscellaneousValuableItemsOccurrence;
            int coinsSilverStampsFursMusicalInstrumentsOccurrenceOOSEND = coinsSilverStampsFursMusicalInstrumentsOccurrence;

            // TODO Currently works only if adding items on OOS END and NB (no other transactions occurred)
            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    new WorldwideJewleryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), worldWideJewelryOccurrenceOOSEND);
                    new WorldwideJewleryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), worldWideJewelryOccurrenceOOSEND);
                    worldWideJewelryOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    new BankVaultedJewelryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), bankVaultedJewelryOccurrenceOOSEND);
                    new BankVaultedJewelryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), bankVaultedJewelryOccurrenceOOSEND);
                    bankVaultedJewelryOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    new FineArtsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), fineArtsOccurrenceOOSEND);
                    new FineArtsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), fineArtsOccurrenceOOSEND);
                    fineArtsOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    new CollectiblesBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), collectiblesOccurrenceOOSEND);
                    new CollectiblesBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), collectiblesOccurrenceOOSEND);
                    collectiblesOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    new WineCollectionsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), wineOccurrenceOOSEND);
                    new WineCollectionsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), wineOccurrenceOOSEND);
                    wineOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    new MiscellaneousValuableItemsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), miscellaneousValuableItemsOccurrenceOOSEND);
                    new MiscellaneousValuableItemsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), miscellaneousValuableItemsOccurrenceOOSEND);
                    miscellaneousValuableItemsOccurrenceOOSEND++;
                } else if (data.get("Collection_Schedule_Collection_Class_OOS_END_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    new CoinsSilverStampsFursMIBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_OOS_END_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceOOSEND);
                    new CoinsSilverStampsFursMIBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_OOS_END_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceOOSEND);
                    coinsSilverStampsFursMusicalInstrumentsOccurrenceOOSEND++;
                }
            }
        }
    }

    public void fillSummaryDetailsHS_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Collections_Schedule_Collection_Items_RNW"))) {
            int totalItemNum = data.get("Collections_Schedule_Collection_Items").split(",").length;
            int totalItemNumEnd = data.get("Collections_Schedule_Collection_Items_RNW").split(",").length;

            int worldWideJewelryNum = 0;
            int bankVaultedJewelryNum = 0;
            int fineArtsNum = 0;
            int collectiblesNum = 0;
            int wineNum = 0;
            int miscellaneousValuableItemsNum = 0;
            int coinsSilverStampsFursMusicalInstrumentsNum = 0;

            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsNum++;
                }
            }

            if (worldWideJewelryNum > 0) {
                addCollectionClass("Worldwide Jewelry");
                setNumberOfItems(String.valueOf(worldWideJewelryNum));
                clickAdd();
            }

            if (bankVaultedJewelryNum > 0) {
                addCollectionClass("Bank Vaulted Jewelry");
                setNumberOfItems(String.valueOf(bankVaultedJewelryNum));
                clickAdd();
            }

            if (fineArtsNum > 0) {
                addCollectionClass("Fine Arts");
                setNumberOfItems(String.valueOf(fineArtsNum));
                clickAdd();
            }

            if (collectiblesNum > 0) {
                addCollectionClass("Collectibles");
                setNumberOfItems(String.valueOf(collectiblesNum));
                clickAdd();
            }

            if (wineNum > 0) {
                addCollectionClass("Wine");
                setNumberOfItems(String.valueOf(wineNum));
                clickAdd();
            }

            if (miscellaneousValuableItemsNum > 0) {
                addCollectionClass("Miscellaneous Valuable Items");
                setNumberOfItems(String.valueOf(miscellaneousValuableItemsNum));
                clickAdd();
            }

            if (coinsSilverStampsFursMusicalInstrumentsNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs, Musical Instruments");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursMusicalInstrumentsNum));
                clickAdd();
            }

            int worldWideJewelryOccurrence = 0;
            int bankVaultedJewelryOccurrence = 0;
            int fineArtsOccurrence = 0;
            int collectiblesOccurrence = 0;
            int wineOccurrence = 0;
            int miscellaneousValuableItemsOccurrence = 0;
            int coinsSilverStampsFursMusicalInstrumentsOccurrence = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    worldWideJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    bankVaultedJewelryOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    fineArtsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    collectiblesOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    wineOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    miscellaneousValuableItemsOccurrence++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    coinsSilverStampsFursMusicalInstrumentsOccurrence++;
                }
            }

            int worldWideJewelryOccurrenceRNW = worldWideJewelryOccurrence;
            int bankVaultedJewelryOccurrenceRNW = bankVaultedJewelryOccurrence;
            int fineArtsOccurrenceRNW = fineArtsOccurrence;
            int collectiblesOccurrenceRNW = collectiblesOccurrence;
            int wineOccurrenceRNW = wineOccurrence;
            int miscellaneousValuableItemsOccurrenceRNW = miscellaneousValuableItemsOccurrence;
            int coinsSilverStampsFursMusicalInstrumentsOccurrenceRNW = coinsSilverStampsFursMusicalInstrumentsOccurrence;

            // TODO Currently works only if adding items on RNW and NB (no other transactions occurred)
            for (int i = 0; i < totalItemNumEnd; i++) {
                if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry")) {
                    new WorldwideJewleryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), worldWideJewelryOccurrenceRNW);
                    new WorldwideJewleryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), worldWideJewelryOccurrenceRNW);
                    worldWideJewelryOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry")) {
                    new BankVaultedJewelryBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), bankVaultedJewelryOccurrenceRNW);
                    new BankVaultedJewelryBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), bankVaultedJewelryOccurrenceRNW);
                    bankVaultedJewelryOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Fine Arts")) {
                    new FineArtsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), fineArtsOccurrenceRNW);
                    new FineArtsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), fineArtsOccurrenceRNW);
                    fineArtsOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Collectibles")) {
                    new CollectiblesBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), collectiblesOccurrenceRNW);
                    new CollectiblesBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), collectiblesOccurrenceRNW);
                    collectiblesOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Wine")) {
                    new WineCollectionsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), wineOccurrenceRNW);
                    new WineCollectionsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), wineOccurrenceRNW);
                    wineOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items")) {
                    new MiscellaneousValuableItemsBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), miscellaneousValuableItemsOccurrenceRNW);
                    new MiscellaneousValuableItemsBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), miscellaneousValuableItemsOccurrenceRNW);
                    miscellaneousValuableItemsOccurrenceRNW++;
                } else if (data.get("Collection_Schedule_Collection_Class_RNW_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments")) {
                    new CoinsSilverStampsFursMIBlock(driver).setDescriptionOfItem(data.get("Collection_Schedule_Description_RNW_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceRNW);
                    new CoinsSilverStampsFursMIBlock(driver).setLimitOfItem(data.get("Collection_Schedule_Limit_RNW_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrenceRNW);
                    coinsSilverStampsFursMusicalInstrumentsOccurrenceRNW++;
                }
            }
        }
    }

    public void clickAdd() throws InterruptedException {
        clickElement(addButtonHS, "Add button");
        pause(3000);
        clickBlock();
    }

    public void addCollectionClass(String value) throws InterruptedException {
        typeTextEnter(collClassToBeAdded, value, "Collection class to be added");
        pause(3000);
    }

    public void setNumberOfItems(String value) throws InterruptedException {
        typeTextEnter(noOfItemsToBeAdded, value, "Number of items");
        pause(3000);
    }

    public void clickBlock() {
        clickElement(blockSummary, "Block");
    }


    public void fillSummaryDetailsCO(Map<String, String> data) throws Throwable {

        if (hasValue(data.get("Collections_Schedule_Collection_Items"))) {
            int totalItemNum = data.get("Collections_Schedule_Collection_Items").split(",").length;

            int worldWideJewelryNum = 0;
            int bankVaultedJewelryNum = 0;
            int fineArtsCollectiblesNum = 0;
            int fineArtsNum = 0;
            int collectiblesNum = 0;
            int wineNum = 0;
            int miscellaneousValuableItemsNum = 0;
            int coinsSilverStampsFursMusicalInstrumentsNum = 0;
            int coinsSilverStampsFursNum = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry") && (data.get("Add_Worldwide_Jewelry").equalsIgnoreCase("Yes"))) {
                    worldWideJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry") && (data.get("Add_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes"))) {
                    bankVaultedJewelryNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Art") && (data.get("Add_Fine_Arts_Collectibles").equalsIgnoreCase("Yes"))) {
                    fineArtsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Art/Collectibles") && (data.get("Add_Fine_Arts_Collectibles").equalsIgnoreCase("Yes"))) {
                    fineArtsCollectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles") && (data.get("Add_Collectibles").equalsIgnoreCase("Yes"))) {
                    collectiblesNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine") && (data.get("Add_Wine").equalsIgnoreCase("Yes"))) {
                    wineNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items") && (data.get("Add_Misc_Valuable_Items").equalsIgnoreCase("Yes"))) {
                    miscellaneousValuableItemsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments") && (data.get("Add_Coins_Silver_Stamps_Furs").equalsIgnoreCase("Yes"))) {
                    coinsSilverStampsFursMusicalInstrumentsNum++;
                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs") && (data.get("Add_Coins_Silver_Stamps_Furs").equalsIgnoreCase("Yes"))) {
                    coinsSilverStampsFursNum++;
                }
            }

            if (worldWideJewelryNum > 0) {
                addCollectionClass("Worldwide Jewelry");
                setNumberOfItems(String.valueOf(worldWideJewelryNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (bankVaultedJewelryNum > 0) {
                addCollectionClass("Bank Vaulted Jewelry");
                setNumberOfItems(String.valueOf(bankVaultedJewelryNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (fineArtsCollectiblesNum > 0) {
                addCollectionClass("Fine Art/Collectibles");
                setNumberOfItems(String.valueOf(fineArtsCollectiblesNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (collectiblesNum > 0) {
                addCollectionClass("Collectibles");
                setNumberOfItems(String.valueOf(collectiblesNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (fineArtsNum > 0) {
                addCollectionClass("Fine Art");
                setNumberOfItems(String.valueOf(fineArtsNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (wineNum > 0) {
                addCollectionClass("Wine");
                setNumberOfItems(String.valueOf(wineNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (miscellaneousValuableItemsNum > 0) {
                addCollectionClass("Miscellaneous Valuable Items");
                setNumberOfItems(String.valueOf(miscellaneousValuableItemsNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (coinsSilverStampsFursMusicalInstrumentsNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs, Musical Instruments");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursMusicalInstrumentsNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            if (coinsSilverStampsFursNum > 0) {
                addCollectionClass("Coins, Silver, Stamps, Furs");
                setNumberOfItems(String.valueOf(coinsSilverStampsFursNum));
                clickElement(addButton);
                pause(3000);
                clickBlock();
            }

            int worldWideJewelryOccurrence = 0;
            int bankVaultedJewelryOccurrence = 0;
            int fineArtsCollectiblesOccurrence = 0;
            int fineArtsOccurrence = 0;
            int collectiblesOccurrence = 0;
            int wineOccurrence = 0;
            int miscellaneousValuableItemsOccurrence = 0;
            int coinsSilverStampsFursMusicalInstrumentsOccurrence = 0;
            int coinsSilverStampsFursOccurrence = 0;

            for (int i = 0; i < totalItemNum; i++) {
                if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Worldwide Jewelry") && (data.get("Add_Worldwide_Jewelry").equalsIgnoreCase("Yes"))) {
                    worldwideJewleryBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), worldWideJewelryOccurrence);
                    worldwideJewleryBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), worldWideJewelryOccurrence);
                    worldwideJewleryBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), worldWideJewelryOccurrence);
                    worldwideJewleryBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), worldWideJewelryOccurrence);
                    worldWideJewelryOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Bank Vaulted Jewelry") && (data.get("Add_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes"))) {
                    bankVaultedJewelryBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), bankVaultedJewelryOccurrence);
                    bankVaultedJewelryBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), bankVaultedJewelryOccurrence);
                    bankVaultedJewelryBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), bankVaultedJewelryOccurrence);
                    bankVaultedJewelryBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), bankVaultedJewelryOccurrence);
                    bankVaultedJewelryOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Art/Collectibles") && (data.get("Add_Fine_Arts_Collectibles").equalsIgnoreCase("Yes"))) {
                    fineArtsBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), fineArtsCollectiblesOccurrence);
                    fineArtsBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), fineArtsCollectiblesOccurrence);
                    fineArtsBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), fineArtsCollectiblesOccurrence);
                    fineArtsBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), fineArtsCollectiblesOccurrence);
                    fineArtsCollectiblesOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Fine Art") && (data.get("Add_Fine_Arts_Collectibles").equalsIgnoreCase("Yes"))) {
                    fineArtsBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), fineArtsOccurrence);
                    fineArtsBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), fineArtsOccurrence);
                    fineArtsBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), fineArtsOccurrence);
                    fineArtsBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), fineArtsOccurrence);
                    fineArtsOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Collectibles") && (data.get("Add_Collectibles").equalsIgnoreCase("Yes"))) {
                    collectiblesBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), collectiblesOccurrence);
                    collectiblesBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), collectiblesOccurrence);
                    collectiblesBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), collectiblesOccurrence);
                    collectiblesBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), collectiblesOccurrence);
                    collectiblesOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Wine") && (data.get("Add_Wine").equalsIgnoreCase("Yes"))) {
                    wineCollectionsBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), wineOccurrence);
                    wineCollectionsBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), wineOccurrence);
                    wineCollectionsBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), wineOccurrence);
                    wineCollectionsBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), wineOccurrence);
                    wineOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Miscellaneous Valuable Items") && (data.get("Add_Misc_Valuable_Items").equalsIgnoreCase("Yes"))) {
                    miscellaneousValuableItemsBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    miscellaneousValuableItemsBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    miscellaneousValuableItemsBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    miscellaneousValuableItemsBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), miscellaneousValuableItemsOccurrence);
                    miscellaneousValuableItemsOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs, Musical Instruments") && (data.get("Add_Coins_Silver_Stamps_Furs").equalsIgnoreCase("Yes"))) {
                    coinsSilverStampsFursMIBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    coinsSilverStampsFursMIBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    coinsSilverStampsFursMIBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    coinsSilverStampsFursMIBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), coinsSilverStampsFursMusicalInstrumentsOccurrence);
                    coinsSilverStampsFursMusicalInstrumentsOccurrence++;

                } else if (data.get("Collection_Schedule_Collection_Class_" + (i + 1)).equalsIgnoreCase("Coins, Silver, Stamps, Furs") && (data.get("Add_Coins_Silver_Stamps_Furs").equalsIgnoreCase("Yes"))) {
                    coinsSilverStampsFursMIBlock.setDescriptionOfItem(data.get("Collection_Schedule_Description_" + (i + 1)), coinsSilverStampsFursOccurrence);
                    coinsSilverStampsFursMIBlock.setLimitOfItemCO(data.get("Collection_Schedule_Limit_" + (i + 1)), coinsSilverStampsFursOccurrence);
                    coinsSilverStampsFursMIBlock.setAgreedValueCO(data.get("Collection_Schedule_Agreed_Value_" + (i + 1)), coinsSilverStampsFursOccurrence);
                    coinsSilverStampsFursMIBlock.setAppraisalDateCO(data.get("Collection_Schedule_Appraisal_Date_" + (i + 1)), coinsSilverStampsFursOccurrence);
                    coinsSilverStampsFursOccurrence++;
                }
            }
        }
    }

}