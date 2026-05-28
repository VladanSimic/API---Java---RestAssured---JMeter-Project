package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ManualSubjectivitiesBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class SubjectivitiesPage extends CommonComponentsAndActions {
    WebDriver driver;
    ManualSubjectivitiesBlock manualSubjectivitiesBlock;

    public SubjectivitiesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        manualSubjectivitiesBlock = new ManualSubjectivitiesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Subjectivity']/../../../../../../../../..//table")
    List<WebElement> subjectivities;

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;

    @FindBy(xpath = "//div[text()='manual subjectivities']")
    WebElement manualSubjectivitiesBlockElement;

    public void fillSubjectivitiesPage(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        verifyBlockExists("manual subjectivities");
        if (hasValue(data.get("Manual_Subjectivities_Num"))) {
            int num = Integer.parseInt(data.get("Manual_Subjectivities_Num"));
            for (int i = 1; i <= num; i++) {
                clickElement(add);
                pause(2000);
                clickElement(manualSubjectivitiesBlockElement);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name").split(",")[i - 1], i);
                setNotes(data.get("Manual_Subjectivities_Notes").split(",")[i - 1], i);
                setPend(data.get("Manual_Subjectivities_Pend").split(",")[i - 1], i);
            }
        }
    }

    public void fillSubjectivitiesPage_END(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        if (hasValue(data.get("Manual_Subjectivities_Num_END"))) {
            int num = Integer.parseInt(data.get("Manual_Subjectivities_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalManuscripts = i + Integer.parseInt(data.get("Manual_Subjectivities_Num"));
                clickElement(add);
                pause(2000);
                clickElement(manualSubjectivitiesBlockElement);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_END").split(",")[i - 1], totalManuscripts);
                setNotes(data.get("Manual_Subjectivities_Notes_END").split(",")[i - 1], totalManuscripts);
                setPend(data.get("Manual_Subjectivities_Pend_END").split(",")[i - 1], totalManuscripts);
            }
        }
    }

    public void fillSubjectivitiesPage_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        if (hasValue(data.get("Manual_Subjectivities_Num_OOS_END"))) {
            int num = Integer.parseInt(data.get("Manual_Subjectivities_Num_OOS_END"));
            for (int i = 1; i <= num; i++) {
                int totalManuscripts = i + Integer.parseInt(data.get("Manual_Subjectivities_Num"));
                clickElement(add);
                pause(2000);
                clickElement(manualSubjectivitiesBlockElement);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_OOS_END").split(",")[i - 1], totalManuscripts);
                setNotes(data.get("Manual_Subjectivities_Notes_OOS_END").split(",")[i - 1], totalManuscripts);
                setPend(data.get("Manual_Subjectivities_Pend_OOS_END").split(",")[i - 1], totalManuscripts);
            }
        }
    }

    public void fillSubjectivitiesPage_RNW(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        if (hasValue(data.get("Manual_Subjectivities_Num_RNW"))) {
            int totalManuscripts = 0;
            int endorsementTotalManuscripts = Integer.parseInt(data.get("Manual_Subjectivities_Num_END"));
            int num = Integer.parseInt(data.get("Manual_Subjectivities_Num_RNW"));
            for (int i = 1; i <= num; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalManuscripts = i + Integer.parseInt(data.get("Manual_Subjectivities_Num")) + endorsementTotalManuscripts;
                } else {
                    totalManuscripts = i + Integer.parseInt(data.get("Manual_Subjectivities_Num"));
                }
                clickElement(add);
                pause(2000);
                clickElement(manualSubjectivitiesBlockElement);
                setConditionName(data.get("Manual_Subjectivities_Condition_Name_RNW").split(",")[i - 1], totalManuscripts);
                setNotes(data.get("Manual_Subjectivities_Notes_RNW").split(",")[i - 1], totalManuscripts);
                setPend(data.get("Manual_Subjectivities_Pend_RNW").split(",")[i - 1], totalManuscripts);
            }
        }
    }

    public void fillSubjectivitiesPageCC(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsCC(data);
    }

    public void fillSubjectivitiesPageCC_END(Map<String, String> data) throws Throwable {
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsCC_END(data);
    }

    private void setConditionName(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Condition Name']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setNotes(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Notes']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    private void setPend(String value, int i) throws Throwable {
        if (!value.equals("") && !value.equals(" ")) {
            clickElement(driver.findElement(By.xpath("//span[text()='Pend?']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void overrideSubjectivities() throws Throwable {
        for (int i = 1; i <= subjectivities.size(); i++) {
            clickElement(driver.findElement(By.xpath("//span[text()='Subjectivity']/../../../../../../../../..//table[" + i + "]//tr//td[6]")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys("Yes");
        }
    }

    public void fillSubjectivitiesPagePW(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        verifyBlockExists("manual subjectivities");
    }

    public void fillSubjectivitiesPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillSubjectivitiesPageHS(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsHS(data);
    }

    public void fillSubjectivitiesPagePA(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsPA(data);
    }

    public void fillSubjectivitiesPageHO(Map<String, String> data) throws Throwable {
        if (goToPage("Subjectivities"))
            manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsHO(data);
    }

    public void fillSubjectivitiesPageFS(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsFS(data);
    }

    public void fillSubjectivitiesPageCO(Map<String, String> data) throws Throwable {
        goToPage("Subjectivities");
        manualSubjectivitiesBlock.fillManualSubjectivitiesDetailsCO(data);
    }
}