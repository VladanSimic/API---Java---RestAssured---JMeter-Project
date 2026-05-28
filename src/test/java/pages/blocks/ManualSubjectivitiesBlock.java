package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ManualSubjectivitiesBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public ManualSubjectivitiesBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()=\"manual subjectivities\"]/../../../../../..//table//td[1]")
    List<WebElement> conditionName;
    @FindBy(xpath = "//div[text()=\"manual subjectivities\"]/../../../../../..//table//td[2]")
    List<WebElement> notes;
    @FindBy(xpath = "//div[text()=\"manual subjectivities\"]/../../../../../..//table//td[3]")
    List<WebElement> pend;
    @FindBy(xpath = "//span[text()=\"add\"]")
    WebElement add;

    public void fillManualSubjectivitiesDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities"))) {
            int subjectivities = data.get("Manual_Subjectivities").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                clickFooter();
                if (subjectivities == 1) {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name"), i);
                    setNotes(data.get("Manual_Subjectivities_Notes"), i);
                    setPend(data.get("Manual_Subjectivities_Pend"), i);
                } else {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_" + (i + 1)), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_" + (i + 1)), i);
                    setPend(data.get("Manual_Subjectivities_Pend_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void fillManualSubjectivitiesDetailsCC_END(Map<String, String> data) throws Throwable {
        // todo count nb entries, enable removal CC
        if (hasValue(data.get("Manual_Subjectivities_END"))) {
            int subjectivities = data.get("Manual_Subjectivities_END").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                if (subjectivities == 1) {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_END"), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_END"), i);
                    setPend(data.get("Manual_Subjectivities_Pend_END"), i);
                } else {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_END_" + (i + 1)), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_END_" + (i + 1)), i);
                    setPend(data.get("Manual_Subjectivities_Pend_END_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void fillManualSubjectivitiesDetailsPA(Map<String, String> data) throws Throwable {
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities"))) {
            int subjectivities = data.get("Manual_Subjectivities").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_" + (i + 1)), i);
                setNotes(data.get("Manual_Subjectivities_Notes_" + (i + 1)), i);
                setPend(data.get("Manual_Subjectivities_Pend_" + (i + 1)), i);
            }
            saveChanges();
        }
    }

    public void fillManualSubjectivitiesDetailsPA_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manual_Subjectivities_END"))) {
            int subjectivities = data.get("Manual_Subjectivities_END").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_END_" + (i + 1)), i);
                setNotes(data.get("Manual_Subjectivities_Notes_END_" + (i + 1)), i);
                setPend(data.get("Manual_Subjectivities_Pend_END_" + (i + 1)), i);
            }
            saveChanges();
        }
        //TODO PA END - Manual subjectivities - Mid
    }

    public void fillManualSubjectivitiesDetailsPA_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manual_Subjectivities_OOS_END"))) {
            int subjectivities = data.get("Manual_Subjectivities_OOS_END").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_OOS_END_" + (i + 1)), i);
                setNotes(data.get("Manual_Subjectivities_Notes_OOS_END_" + (i + 1)), i);
                setPend(data.get("Manual_Subjectivities_Pend_OOS_END_" + (i + 1)), i);
            }
            saveChanges();
        }
        //TODO PA OOS - Manual subjectivities - Mid
    }

    public void fillManualSubjectivitiesDetailsPA_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Manual_Subjectivities_RNW"))) {
            int subjectivities = data.get("Manual_Subjectivities_RNW").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_RNW_" + (i + 1)), i);
                setNotes(data.get("Manual_Subjectivities_Notes_RNW_" + (i + 1)), i);
                setPend(data.get("Manual_Subjectivities_Pend_RNW_" + (i + 1)), i);
            }
            saveChanges();
        }
        //TODO PA RNW - Manual subjectivities - Mid
    }

    public void fillManualSubjectivitiesDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities"))) {
            int subjectivities = data.get("Manual_Subjectivities").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                if (subjectivities == 1) {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name"), i);
                    setNotes(data.get("Manual_Subjectivities_Notes"), i);
                    setPend(data.get("Manual_Subjectivities_Pend"), i);
                } else {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_" + (i + 1)), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_" + (i + 1)), i);
                    setPend(data.get("Manual_Subjectivities_Pend_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void clickAdd() {
        clickElement(add, "Add");
    }

    public void setPend(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(pend.get(i), "Pend_" + i);
            typeText(driver.switchTo().activeElement(), value, "Pend_" + i);
            clickFooter();
        }
    }

    public void setNotes(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(notes.get(i), "Notes_" + i);
            typeText(driver.switchTo().activeElement(), value, "Notes_" + i);
            clickFooter();
        }
    }

    public void setConditionName(String value, int i) {
        if (hasValue(value)) {
            clickElement(conditionName.get(i), "Condition name_" + i);
            typeText(driver.switchTo().activeElement(), value, "Condition name_" + i);
        }
    }

    public void fillManualSubjectivitiesDetailsHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities"))) {
            int subjectivities = data.get("Manual_Subjectivities").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                if (subjectivities == 1) {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_1"), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_1"), i);
                    setPend(data.get("Manual_Subjectivities_Pend_1"), i);
                } else {
                    setConditionName(data.get("Manual_Subjectivities_Condition_Name_" + (i + 1)), i);
                    setNotes(data.get("Manual_Subjectivities_Notes_" + (i + 1)), i);
                    setPend(data.get("Manual_Subjectivities_Pend_" + (i + 1)), i);
                }
            }
            saveChanges();
        }
    }

    public void fillManualSubjectivitiesDetailsFS(Map<String, String> data) {

    }

    public void fillManualSubjectivitiesDetailsCO(Map<String, String> data) throws Throwable {
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities"))) {
            int subjectivities = data.get("Manual_Subjectivities").split(",").length;

            for (int i = 0; i < subjectivities; i++) {
                clickAdd();
                pause(2000);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_" + (i + 1)), i);
                setNotes(data.get("Manual_Subjectivities_Notes_" + (i + 1)), i);
                setPend(data.get("Manual_Subjectivities_Pend_" + (i + 1)), i);
            }
            saveChanges();
        }
    }

}