package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class CoverageByClassPage extends CommonComponentsAndActions {
    WebDriver driver;
    WorldwideJewleryBlock worldwideJewelryComponent;
    BankVaultedJewelryBlock bankVaultedJewelryBlock;
    FineArtsBlock fineArtsBlock;
    CollectiblesBlock collectiblesBlock;
    CoinsSilverStampsFursMIBlock coinsSilverStampFurComponent;
    WineCollectionsBlock wineCollectionComponent;
    MiscellaneousValuableItemsBlock miscValItemsComponent;

    public CoverageByClassPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        worldwideJewelryComponent = new WorldwideJewleryBlock(driver);
        bankVaultedJewelryBlock = new BankVaultedJewelryBlock(driver);
        fineArtsBlock = new FineArtsBlock(driver);
        collectiblesBlock = new CollectiblesBlock(driver);
        coinsSilverStampFurComponent = new CoinsSilverStampsFursMIBlock(driver);
        wineCollectionComponent = new WineCollectionsBlock(driver);
        miscValItemsComponent = new MiscellaneousValuableItemsBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='convert to large schedule']")
    WebElement convertToLargeScheduleBtn;

    public void fillCoverageByClassPage(Map<String, String> data) throws Throwable {
        goToPage("Coverage by Class");
        worldwideJewelryComponent.fillWorldwideJewelryCO(data);
        bankVaultedJewelryBlock.fillBankVaultedJewelry(data);
        fineArtsBlock.fillFineArtsCollectibles(data);
        collectiblesBlock.fillCollectibles(data);
        coinsSilverStampFurComponent.fillCoinsSilverStampsFursMI(data);
        wineCollectionComponent.fillWineBlock(data);
        miscValItemsComponent.fillMiscValuableItems(data);
        saveChanges();
        pause(2000);
    }

    public void convertToLargeSchedule() throws Throwable {
        goToPage("Coverage by Class");
        pause(3500);
        clickElement(convertToLargeScheduleBtn, "Convert to Large Schedule");
        pause(5000);
    }

}