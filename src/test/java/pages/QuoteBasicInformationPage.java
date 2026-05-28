package pages;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class QuoteBasicInformationPage extends CommonComponentsAndActions {
    WebDriver driver;
    LicenseWarningBlock licenseWarningBlock;
    ClientInformationBlock clientInformationBlock;
    LinesOfBusinessBlock linesOfBusinessBlock;
    UnderwritingReportAuthorizationBlock underwritingReportAuthorizationBlock;
    ProducerInformationBlock producerInformationBlock;

    public QuoteBasicInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        licenseWarningBlock = new LicenseWarningBlock(driver);
        clientInformationBlock = new ClientInformationBlock(driver);
        linesOfBusinessBlock = new LinesOfBusinessBlock(driver);
        underwritingReportAuthorizationBlock = new UnderwritingReportAuthorizationBlock(driver);
        producerInformationBlock = new ProducerInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillOutQuoteBasicInformationPage(Map<String, String> data, String ENV) throws Throwable {
        licenseWarningBlock.verifyLicenseWarningMessages();
        clientInformationBlock.fillOutClientInformationDetails(data);
        linesOfBusinessBlock.fillOutLinesOfBusinessDetails(data);
        underwritingReportAuthorizationBlock.fillOutUnderwritingReportAuthorizationDetails(data);
        producerInformationBlock.fillOutProducerInformationDetails(data, ENV);
        clickNext();
        pause(15000);
        clickCreateNewCustomer();
        if (ENV.equalsIgnoreCase("AWS_QA") || ENV.equalsIgnoreCase("QA2") || ENV.equalsIgnoreCase("DEV2")) {
            pause(20000);
        } else {
            pause(15000);
        }
        clickElement(customerSummary);
        DataManager.getInstance().getData().put("QUOTE_ID", getCurrentObjectId());
        navigateToQuoteDetailsPage();
    }

    public void fillOutQuoteBasicInformationPagePF(Map<String, String> data) throws Throwable {
        licenseWarningBlock.verifyLicenseWarningMessages();
        clientInformationBlock.fillOutClientInformationDetails(data);
        linesOfBusinessBlock.fillOutLinesOfBusinessDetailsPF(data);
    }
}