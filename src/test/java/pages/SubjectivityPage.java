package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ManualSubjectivitiesBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SubjectivityPage extends CommonComponentsAndActions {
    WebDriver driver;

    public SubjectivityPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private String uploadedFileName;
    String filePath = System.getProperty("user.dir") + "/src/test/test_data/upload/";

    @FindBy(xpath = "//label[@class='dragndroplabel']//input")
    WebElement dragAndDropBtn;
    @FindBy(xpath = "//span[text()='save changes']")
    WebElement saveChanges;
    @FindBy(xpath = "((//div[text()='Bill of Sale/Appraisal - Auto']/../../../../../../..//table)//tr//td[3])")
    List<WebElement> selectedDocument;
    @FindBy(xpath = "((//div[text()='Bill of Sale/Appraisal - Auto']/../../../../../../..//table)//tr//td[4])")
    List<WebElement> notes;
    @FindBy(xpath = "((//div[contains(text(),'Subjectivity List')]/../../../../../../..//table)//tr//td[3])")
    List<WebElement> subjectivityListSelectedDocument;
    @FindBy(xpath = "((//div[contains(text(),'Subjectivity List')]/../../../../../../..//table)//tr//td[4])")
    List<WebElement> subjectivityListNotes;
    @FindBy(css = "#footer-panel-innerCt")
    WebElement footer;

    public void fillSubjectivityPagePA_END(Map<String, String> data) throws Throwable {
        if (goToPage("Subjectivity"))
            uploadDocAndPopulateSubjectivities("19mb.pdf");
    }

    public void fillSubjectivityPagePA_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Subjectivity"))
            uploadDocAndPopulateSubjectivities("19mb.pdf");
    }

    public void fillSubjectivityPagePA_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Subjectivity"))
            uploadDocAndPopulateSubjectivities("19mb.pdf");
    }

    public void uploadDocAndPopulateSubjectivities(String doc) throws Throwable {
        uploadDocument(doc);
        populateSubjectivities();
    }

    public void uploadDocument(String doc) throws Throwable {
        dragAndDropBtn.sendKeys(filePath + doc);
        this.uploadedFileName = doc;
        pause(5000);
        clickElement(saveChanges);
    }

    public void populateSubjectivities() throws Throwable {
        if (!selectedDocument.isEmpty()) {
            for (int i = 0; i < selectedDocument.size(); i++) {
                setSelectedDocument(this.uploadedFileName, i);
                clickElement(footer);
                setNotes("Test", i);
                clickElement(footer);
            }
            clickElement(saveChanges);
        }else if(!subjectivityListSelectedDocument.isEmpty()){
            for (int i = 0; i < subjectivityListSelectedDocument.size(); i++) {
                setSelectedDocument(this.uploadedFileName, i);
                clickElement(footer);
                setNotes("Test", i);
                clickElement(footer);
            }
            clickElement(saveChanges);
        }
    }



    public void setSelectedDocument(String doc, int i) throws Throwable {
        if(!selectedDocument.isEmpty()) {
            clickElement(selectedDocument.get(i));
            typeTextEnter(driver.switchTo().activeElement(), doc, "Selected Document");
        }else if(!subjectivityListSelectedDocument.isEmpty()){
            clickElement(subjectivityListSelectedDocument.get(i));
            typeTextEnter(driver.switchTo().activeElement(), doc, "Selected Document");
        }
    }

    public void setNotes(String text, int i) throws Throwable {
        if(!notes.isEmpty()) {
            clickElement(notes.get(i));
            typeTextEnter(driver.switchTo().activeElement(), text, "Notes");
        }else if(!subjectivityListNotes.isEmpty()){
            try {
                clickElement(subjectivityListNotes.get(i));
                typeTextEnter(driver.switchTo().activeElement(), text, "Notes");
            }catch (Exception e){
                //
            }
        }
    }

}