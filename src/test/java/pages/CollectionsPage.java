package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CollectionsPage extends CommonComponentsAndActions {
    WebDriver driver;
    CollectionsBlock collectionsBlock;
    WorldwideJewleryBlock worldwideJewleryBlock;
    BankVaultedJewelryBlock bankVaultedJewelryBlock;
    FineArtsBlock fineArtsBlock;
    CollectiblesBlock collectiblesBlock;
    CoinsSilverStampsFursMIBlock coinsSilverStampsFursMusicalInstrumentsBlock;
    WineCollectionsBlock wineCollectionsBlock;
    MiscellaneousValuableItemsBlock miscellaneousValuableItemsBlock;

    public CollectionsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        collectionsBlock = new CollectionsBlock(driver);
        worldwideJewleryBlock = new WorldwideJewleryBlock(driver);
        bankVaultedJewelryBlock = new BankVaultedJewelryBlock(driver);
        fineArtsBlock = new FineArtsBlock(driver);
        collectiblesBlock = new CollectiblesBlock(driver);
        coinsSilverStampsFursMusicalInstrumentsBlock = new CoinsSilverStampsFursMIBlock(driver);
        wineCollectionsBlock = new WineCollectionsBlock(driver);
        miscellaneousValuableItemsBlock = new MiscellaneousValuableItemsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillCollectionsPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Collections Coverage by Class")) {
            collectionsBlock.fillCollectionsDetailsHS(data);
            worldwideJewleryBlock.fillWorldwideJewelryHS(data);
            bankVaultedJewelryBlock.fillBankVaultedJewelryHS(data);
            fineArtsBlock.fillFineArtsBlockHS(data);
            collectiblesBlock.fillCollectiblesBlockHS(data);
            coinsSilverStampsFursMusicalInstrumentsBlock.fillCoinsSilverStampsFursMIBlockHS(data);
            wineCollectionsBlock.fillWineBlockHS(data);
            miscellaneousValuableItemsBlock.fillMiscellaneousValuableItemsBlockHS(data);
        }
    }

    public void fillCollectionsPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Collections Coverage by Class")) {
            collectionsBlock.fillCollectionsDetailsHS_END(data);
            worldwideJewleryBlock.fillWorldwideJewelryHS_END(data);
            bankVaultedJewelryBlock.fillBankVaultedJewelryHS_END(data);
            fineArtsBlock.fillFineArtsBlockHS_END(data);
            collectiblesBlock.fillCollectiblesBlockHS_END(data);
            coinsSilverStampsFursMusicalInstrumentsBlock.fillCoinsSilverStampsFursMIBlockHS_END(data);
            wineCollectionsBlock.fillWineBlockHS_END(data);
            miscellaneousValuableItemsBlock.fillMiscellaneousValuableItemsBlockHS_END(data);
        }
    }

    public void fillCollectionsPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Collections Coverage by Class")) {
            collectionsBlock.fillCollectionsDetailsHS_OOS_END(data);
            worldwideJewleryBlock.fillWorldwideJewelryHS_OOS_END(data);
            bankVaultedJewelryBlock.fillBankVaultedJewelryHS_OOS_END(data);
            fineArtsBlock.fillFineArtsBlockHS_OOS_END(data);
            collectiblesBlock.fillCollectiblesBlockHS_OOS_END(data);
            coinsSilverStampsFursMusicalInstrumentsBlock.fillCoinsSilverStampsFursMIBlockHS_OOS_END(data);
            wineCollectionsBlock.fillWineBlockHS_OOS_END(data);
            miscellaneousValuableItemsBlock.fillMiscellaneousValuableItemsBlockHS_OOS_END(data);
        }
    }

    public void fillCollectionsPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Collections Coverage by Class")) {
            collectionsBlock.fillCollectionsDetailsHS_RNW(data);
            worldwideJewleryBlock.fillWorldwideJewelryHS_RNW(data);
            bankVaultedJewelryBlock.fillBankVaultedJewelryHS_RNW(data);
            fineArtsBlock.fillFineArtsBlockHS_RNW(data);
            collectiblesBlock.fillCollectiblesBlockHS_RNW(data);
            coinsSilverStampsFursMusicalInstrumentsBlock.fillCoinsSilverStampsFursMIBlockHS_RNW(data);
            wineCollectionsBlock.fillWineBlockHS_RNW(data);
            miscellaneousValuableItemsBlock.fillMiscellaneousValuableItemsBlockHS_RNW(data);
        }
    }
}
