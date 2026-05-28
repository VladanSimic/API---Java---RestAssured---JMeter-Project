package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.CustomerDocumentsBlock;
import pages.utils.CommonComponentsAndActions;
import java.util.List;

public class CustomerDocumentsPage extends CommonComponentsAndActions {
    WebDriver driver;
    CustomerDocumentsBlock customerDocumentsBlock;

    public CustomerDocumentsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        customerDocumentsBlock = new CustomerDocumentsBlock(driver);
        PageFactory.initElements(driver, this);
    }


    public void uploadDocument(String doc, String type, String description) throws Throwable {
        customerDocumentsBlock.uploadFile(doc, type, description);
    }

    public void verifyTasksContents(DataTable table) {
        List<List<String>> rows = table.asLists().subList(1, table.asLists().size());

        int index = 0;
        for (List<String> columns : rows) {
            String documentID = columns.get(0);
            String documentType = columns.get(1);
            String description = columns.get(2);
            String documentLink = columns.get(3);
            String documentGenerationStatus = columns.get(4);
            String documentDeliveryStatus = columns.get(5);
            String deliveryDateTime = columns.get(6);
            String internalView = columns.get(7);
            String block = columns.get(8);

            DocumentsPage page = new DocumentsPage(driver);

            if (hasValue(documentID))
                page.verifyColumnValue(index, documentID,block,"2");

            if (hasValue(documentType))
                page.verifyColumnValue(index, documentType,block,"3");

            if (hasValue(description))
                page.verifyColumnValue(index, description,block,"4");

            if (hasValue(documentLink))
                page.verifyColumnValue(index, documentLink,block,"5");

            if (hasValue(documentGenerationStatus))
                page.verifyColumnValue(index, documentGenerationStatus,block,"6");

            if (hasValue(documentDeliveryStatus))
                page.verifyColumnValue(index, documentDeliveryStatus,block,"7");

            if (hasValue(deliveryDateTime))
                page.verifyColumnValue(index, deliveryDateTime,block,"8");

            if (hasValue(internalView))
                page.verifyColumnValue(index, internalView,block,"9");

            index++;
        }
    }

}