package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.CoverageScheduleSummaryBlock;
import pages.utils.CustomFileUtils;
import selenium.DriverManager;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CoverageSchedulePage extends CommonComponentsAndActions {
    WebDriver driver;
    CoverageScheduleSummaryBlock coverageScheduleSummaryBlock;
    WorldwideJewleryBlock worldwideJewleryBlock;
    BankVaultedJewelryBlock bankVaultedJewelryBlock;
    FineArtsBlock fineArtsBlock;
    CollectiblesBlock collectiblesBlock;
    CoinsSilverStampsFursMIBlock coinsSilverStampsFursMIBlock;
    WineCollectionsBlock wineCollectionsBlock;
    MiscellaneousValuableItemsBlock miscellaneousValuableItemsBlock;
    AgreedValueBlock agreedValueBlock;

    public CoverageSchedulePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        coverageScheduleSummaryBlock = new CoverageScheduleSummaryBlock(driver);
        worldwideJewleryBlock = new WorldwideJewleryBlock(driver);
        bankVaultedJewelryBlock = new BankVaultedJewelryBlock(driver);
        fineArtsBlock = new FineArtsBlock(driver);
        collectiblesBlock = new CollectiblesBlock(driver);
        coinsSilverStampsFursMIBlock = new CoinsSilverStampsFursMIBlock(driver);
        wineCollectionsBlock = new WineCollectionsBlock(driver);
        miscellaneousValuableItemsBlock = new MiscellaneousValuableItemsBlock(driver);
        agreedValueBlock = new AgreedValueBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='scheduled items']")
    List<WebElement> scheduledItemsBlock;
    @FindBy(xpath = "//a//span[text()='File Upload']")
    WebElement fileUpload;
    @FindBy(xpath = "//input[@type='file']")
    WebElement browseFileBtn;
    @FindBy(xpath = "//span[text()='Upload']")
    WebElement uploadBtn;
    @FindBy(xpath = "//span[text()='export schedule']")
    WebElement exportScheduleBtn;
    @FindBy(xpath = "//div[text()='upload list']/../../../../../..//table//tr[@role='row']//td[3]//span")
    WebElement largeScheduleTxtDocument;

    public void fillCoverageSchedulePage(Map<String, String> data) throws Throwable {
        goToPage("Coverage Schedule");
        verifyBlockExists("summary");
        coverageScheduleSummaryBlock.fillSummaryDetailsCO(data);
        agreedValueBlock.fillAgreedValueBlock(data);
    }

    public void fillCollectionScheduleHS(Map<String, String> data) throws Throwable {
        coverageScheduleSummaryBlock.fillWorldwideJewelryHS(data);
    }

    public void uploadAndImportLargeSchedule(String doc) throws Throwable {
        String filePath = System.getProperty("user.dir") + "/src/test/test_data/upload/";

        clickElement(uploadSchedule, "upload schedule");
        clickElement(fileUpload, "file upload");
        pause(2000);
        browseFileBtn.sendKeys(filePath + doc);
        pause(1000);
        clickElement(uploadBtn, "upload");
        pause(5000);
        clickOK();
        clickElement(saveChanges, "save changes");
        pause(1500);
        clickElement(importItems, "import items");
        pause(10000);
    }

    public void verifyIfConvertedToLargeSchedule() throws Throwable {
        reportScreenshot("Large Schedule Collection_" + System.currentTimeMillis(), "Large Schedule Collection");

        if (scheduledItemsBlock.size() == 0)
            Assert.fail("Collection is not converted to Large Schedule");
        else
            successLog("Collection is converted to Large Schedule");
        saveChanges();
        pause(7000);
    }

    public void exportAndVerifyLargeScheduleSize() throws Throwable {
        String downloadDirectory = "results/downloads/" + DriverManager.getInstance() + "/";
        clickElement(exportScheduleBtn, "export schedule");
        pause(3000);
        fileDownload(largeScheduleTxtDocument);
        File downloadedFile = CustomFileUtils.getFirstFileByPartialName(downloadDirectory, "collections_schedule");

        try {
            if (CustomFileUtils.isFileOverSize(downloadedFile, 4 * 1024)) {
                FileUtils.forceDelete(downloadedFile);
                System.out.println("Document has been downloaded, verified and deleted");
            } else {
                Assert.fail("File is null");
            }
        } catch (Exception e) {
            //
        } finally {
            FileUtils.deleteDirectory(new File(downloadDirectory));
        }
    }

    public void fillCollectionSchedulePageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Collection Schedule")) {
            coverageScheduleSummaryBlock.fillSummaryDetailsHS(data);
        }
    }

    public void fillCollectionSchedulePageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Collection Schedule")) {
            coverageScheduleSummaryBlock.fillSummaryDetailsHS_END(data);
        }
    }

    public void fillCollectionSchedulePageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Collection Schedule")) {
            coverageScheduleSummaryBlock.fillSummaryDetailsHS_OOS_END(data);
        }
    }

    public void fillCollectionSchedulePageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Collection Schedule")) {
            coverageScheduleSummaryBlock.fillSummaryDetailsHS_RNW(data);
        }
    }
}