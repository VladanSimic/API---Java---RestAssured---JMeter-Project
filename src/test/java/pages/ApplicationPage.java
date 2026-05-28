package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.*;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ApplicationPage extends CommonComponentsAndActions {
    WebDriver driver;
    ApplicationMandatoryFormsBlock applicationMandatoryFormsBlock;
    ApplicationBlock applicationBlock;
    FormsBlock formsBlock;
    SubmitFormsBlock submitFormsBlock;
    ReceivedFormsBlock receivedFormsBlock;
    ApplicationsBlock applicationsBlock;
    DocumentsBlock documentsBlock;
    SubmitApplicationBlock submitApplicationBlock;

    public ApplicationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        applicationMandatoryFormsBlock = new ApplicationMandatoryFormsBlock(driver);
        applicationBlock = new ApplicationBlock(driver);
        formsBlock = new FormsBlock(driver);
        submitFormsBlock = new SubmitFormsBlock(driver);
        receivedFormsBlock = new ReceivedFormsBlock(driver);
        applicationsBlock = new ApplicationsBlock(driver);
        documentsBlock = new DocumentsBlock(driver);
        submitApplicationBlock = new SubmitApplicationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='docusign documents']")
    WebElement docusignDocuments;
    @FindBy(xpath = "//div[text()='application and mandatory forms']")
    WebElement appAndMandatoryForms;

    public void fillApplicationPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            if (!isElementDisplayed(appAndMandatoryForms)) {
                return; // Will be for all HS states soon, FL only at the moment
            }
            applicationMandatoryFormsBlock.fillApplicationDetailsHS(data);
            documentsBlock.fillDocumentDetailsHS(data);
        }
    }

    public void fillApplicationPageHS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            if (!isElementDisplayed(appAndMandatoryForms)) {
                return; // Will be for all HS states soon, FL only at the moment
            }
            applicationMandatoryFormsBlock.fillApplicationDetailsHS_END(data);
            documentsBlock.fillDocumentDetailsHS_END(data);
        }
    }

    public void fillApplicationPageHS_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            if (!isElementDisplayed(appAndMandatoryForms)) {
                return; // Will be for all HS states soon, FL only at the moment
            }
            applicationMandatoryFormsBlock.fillApplicationDetailsHS_RNW(data);
            documentsBlock.fillDocumentDetailsHS_RNW(data);
        }
    }

    public void fillApplicationPageHS_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            applicationMandatoryFormsBlock.fillApplicationDetailsHS_OOS_END(data);
            documentsBlock.fillDocumentDetailsHS_OOS_END(data);
        }
    }

    public void fillApplicationPageES(Map<String, String> data) throws Throwable {
        goToPage("Application");
        verifyBlockExists("application and mandatory forms");
        verifyBlockExists("documents");
        applicationMandatoryFormsBlock.acceptSurplusLinesESApplication(data);
    }

    public void fillApplicationPagePA(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            applicationBlock.fillApplicationDetailsPA(data);
            submitApplicationBlock.fillSubmitApplicationDetailsPA(data);
            applicationsBlock.fillApplicationsDetailsPA(data);
        } else if (goToPage("Forms")) {
            formsBlock.fillFormsDetailsPA(data);
            submitFormsBlock.fillSubmitFormsDetailsPA(data);
            receivedFormsBlock.fillReceivedFormsDetailsPA(data);
        }
    }

    public void fillApplicationPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            applicationBlock.fillApplicationDetailsPA_END(data);
            submitApplicationBlock.fillSubmitApplicationDetailsPA_END(data);
            applicationsBlock.fillApplicationsDetailsPA_END(data);
        } else if (goToPage("Forms")) {
            formsBlock.fillFormsDetailsPA_END(data);
            submitFormsBlock.fillSubmitFormsDetailsPA_END(data);
            receivedFormsBlock.fillReceivedFormsDetailsPA_END(data);
        }
    }

    public void fillApplicationPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            applicationBlock.fillApplicationDetailsPA_OOS_END(data);
            submitApplicationBlock.fillSubmitApplicationDetailsPA_OOS_END(data);
            applicationsBlock.fillApplicationsDetailsPA_OOS_END(data);
        } else if (goToPage("Forms")) {
            formsBlock.fillFormsDetailsPA_OOS_END(data);
            submitFormsBlock.fillSubmitFormsDetailsPA_OOS_END(data);
            receivedFormsBlock.fillReceivedFormsDetailsPA_OOS_END(data);
        }
    }

    public void fillApplicationPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            applicationBlock.fillApplicationDetailsPA_RNW(data);
            submitApplicationBlock.fillSubmitApplicationDetailsPA_RNW(data);
            applicationsBlock.fillApplicationsDetailsPA_RNW(data);
        } else if (goToPage("Forms")) {
            formsBlock.fillFormsDetailsPA_RNW(data);
            submitFormsBlock.fillSubmitFormsDetailsPA_RNW(data);
            receivedFormsBlock.fillReceivedFormsDetailsPA_RNW(data);
        }
    }

    public void fillApplicationPageHO(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            //TODO
        }
    }

    public void fillApplicationPageHO_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            //TODO
        }
    }

    public void fillApplicationPageHO_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            //TODO
        }
    }

    public void fillApplicationPageHO_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Application")) {
            //TODO
        }
    }

    public void verifyDocuSignDocumentApplication(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());

        int index = 0;

        DocumentsPage docPage = new DocumentsPage(driver);
        for (List<String> columns : rows) {

            String documentType = columns.get(0);
            String documentLink = columns.get(1);
            String reviewedAndAccepted = columns.get(2);
            String block = columns.get(3);

            if (hasValue(documentType))
                docPage.verifyColumnValue(index, documentType, block, "1");

            if (hasValue(documentLink))
                docPage.verifyColumnValue(index, documentLink, block, "2");

            if (hasValue(reviewedAndAccepted)) {
                docPage.verifyColumnValue(index, reviewedAndAccepted, block, "3");
            }
            index++;
        }
    }

}