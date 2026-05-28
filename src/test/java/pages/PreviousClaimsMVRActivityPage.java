package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AutoIncidentsBlock;
import pages.utils.CommonComponentsAndActions;
import pages.blocks.WatercraftLossHistoryBlock;
import pages.blocks.WatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock;

import java.util.Map;


public class PreviousClaimsMVRActivityPage extends CommonComponentsAndActions {
    WebDriver driver;
    WatercraftLossHistoryBlock watercraftLossHistoryBlock;
    AutoIncidentsBlock autoIncidentsBlock;
    WatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock watercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock;

    public PreviousClaimsMVRActivityPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        watercraftLossHistoryBlock = new WatercraftLossHistoryBlock(driver);
        autoIncidentsBlock = new AutoIncidentsBlock(driver);
        watercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock = new WatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPreviousClaimsMVRActivityDetails(Map<String, String> data) throws Throwable {
        goToPage("Previous Claims/MVR Activity");
        pause(3000);
        watercraftLossHistoryBlock.fillWatercraftLossHistoryDetails(data);
        autoIncidentsBlock.fillAutoIncidentsComponent(data);
        watercraftLossHistoryForPriorVesselsNotListedOnTheQuoteBlock.fillWatercraftLossHistoryForPriorVesselsNotListedOnTheQuoteComponent(data);
    }
}