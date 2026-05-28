package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ProducerInformationBlock;
import pages.blocks.QuoteLineAndNameBlock;
import pages.blocks.UnderwritingReportAuthorizationBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class NewQuoteInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    QuoteLineAndNameBlock quoteLineAndNameBlock;
    UnderwritingReportAuthorizationBlock underwritingReportAuthorizationBlock;
    ProducerInformationBlock producerInformationBlock;

    public NewQuoteInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        quoteLineAndNameBlock = new QuoteLineAndNameBlock(driver);
        underwritingReportAuthorizationBlock = new UnderwritingReportAuthorizationBlock(driver);
        producerInformationBlock = new ProducerInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void createNewQuote(Map<String, String> data, String ENV) throws Throwable {
        quoteLineAndNameBlock.fillOutQuoteLineAndNameBlock(data);
        underwritingReportAuthorizationBlock.fillOutUnderwritingReportAuthorizationDetails(data);
        producerInformationBlock.fillOutProducerInformationDetails(data, ENV);
        clickCreateQuote();
    }

}