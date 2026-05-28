package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class PreviousLossDetailsBlock extends CommonComponentsAndActions {

    WebDriver driver;

    public PreviousLossDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[1]/div")
    List<WebElement> source;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[2]/div")
    List<WebElement> lossDate;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[3]/div")
    List<WebElement> lossType;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[4]/div)")
    List<WebElement> amountPaid;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[5]/div)")
    List<WebElement> amountPaidHO;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[5]/div)")
    List<WebElement> claimClosed;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[6]/div)")
    List<WebElement> claimClosedHO;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[6]//input[2])")
    List<WebElement> catLossYes;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[6]//input[1])")
    List<WebElement> catLossNo;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[4]//input[2])")
    List<WebElement> catLossYesHO;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[4]//input[1])")
    List<WebElement> catLossNoHO;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[4]//div)")
    List<WebElement> catLossInputHO;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[1]/div")
    List<WebElement> collectionClassHS;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[2]/div")
    List<WebElement> sourceHS;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[3]/div")
    List<WebElement> lossDateHS;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[4]/div")
    List<WebElement> lossTypeHS;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[5]/div)")
    List<WebElement> amountPaidHS;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[6]/div)")
    List<WebElement> claimClosedHS;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[7]//input[2])")
    List<WebElement> catLossYesHS;
    @FindBy(xpath = "(//div[text()='previous loss details']/../../../../../..//table//td[7]//input[1])")
    List<WebElement> catLossNoHS;
    @FindBy(xpath = "//div[text()='previous loss details']")
    WebElement previousLossDetailsBlock;
    @FindBy(xpath = "//div[text()='previous loss details']/../../../../../..//table//td[7]//button")
    List<WebElement> deleteLosses;

    public void fillPreviousLossDetailCC(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses");
        String lossHistory = data.get("Previous_Loss_Details_Losses");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();

                    if (losses == 1) {
                        if (hasValue(data.get("Previous_Loss_Details_Source"))) {
                            setSource(data.get("Previous_Loss_Details_Source"), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date"), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type"), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid"), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed"), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss"), i);
                        } else {
                            setSource(data.get("Previous_Loss_Details_Source_1"), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_1"), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_1"), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_1"), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_1"), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_1"), i);
                        }
                    } else {
                        setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                        setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                        setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailCC_END(Map<String, String> data) throws Throwable {
        //TODO include losses from NB, enable deleting losses on END
        String anyPriorLosses = data.get("Loss_Claim_History_Any_Prior_Losses_END");

        if (hasValue(anyPriorLosses) && anyPriorLosses.equalsIgnoreCase("Yes")) {

            String lossesDetails = data.get("Previous_Loss_Details_Losses_END");
            if (hasValue(lossesDetails) && !lossesDetails.equalsIgnoreCase(",")) {
                int losses = lossesDetails.split(",").length;

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();

                    if (losses == 1) {
                        setSource(data.get("Previous_Loss_Details_Source_END"), i);
                        setLossDate(data.get("Previous_Loss_Details_Loss_Date_END"), i);
                        setLossType(data.get("Previous_Loss_Details_Loss_Type_END"), i);
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_END"), i);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_END"), i);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_END"), i);
                    } else {
                        setSource(data.get("Previous_Loss_Details_Source_END_" + (i + 1)), i);
                        setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + (i + 1)), i);
                        setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + (i + 1)), i);
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_END_" + (i + 1)), i);
                    }
                }
            }
            saveChanges();
        }
    }

    public void clickPreviousLossDetailsBlock() {
        clickElement(previousLossDetailsBlock, "Previous loss details block");
    }

    public void clickAdd() throws Throwable {
        clickElement(add, "Add");
        pause(2000);
    }

    public void setSource(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(source.get(i), "Source_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Source_" + (i + 1));
            clickFooter();
        }
    }

    public void setLossDate(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(lossDate.get(i), "LossDate_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "LossDate_" + (i + 1));
            clickFooter();
        }
    }

    public void setLossType(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(lossType.get(i), "LossType_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "LossType_" + (i + 1));
            clickFooter();
        }
    }

    public void setAmountPaid(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(amountPaid.get(i), "Amount Paid_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Amount Paid_" + (i + 1));
            clickFooter();
        }
    }

    public void setAmountPaidHO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(amountPaidHO.get(i), "Amount Paid_" + (i + 1));
            pause(1000);
            typeText(driver.switchTo().activeElement(), value, "Amount Paid_" + (i + 1));
            clickFooter();
        }
    }

    public void setClaimClosed(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(claimClosed.get(i), "ClaimClosed_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "ClaimClosed_" + (i + 1));
            clickFooter();
        }
    }

    public void setClaimClosedHO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(claimClosedHO.get(i), "Claim Closed_" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Claim Closed_" + (i + 1));
            clickFooter();
        }
    }

    public void setCATLoss(String value, int i) throws Throwable {
        if (hasValue(value)) {
            choose(catLossYes.get(i), catLossNo.get(i), value, "Cat Loss_" + (i + 1));
        }
    }

    public void setCATLossHO(String value, int i) throws Throwable {
        choose(catLossYesHO.get(i), catLossNoHO.get(i), value, "Cat Loss_" + (i + 1));
    }

    public void setCATLossInputHO(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickFooter();
            clickElement(catLossInputHO.get(i), "CAT Loss");
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "CAT Loss");
            clickFooter();
        }
    }

    public void fillPreviousLossDetailsHS(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Collection_Losses");
        String lossHistory = data.get("Loss_Claim_History_Prior_Collection_Losses");
        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();

                    if (losses == 1) {
                        if (hasValue(data.get("Previous_Loss_Collection_Details_Class"))) {
                            setCollectionClassHS(data.get("Previous_Loss_Collection_Details_Class"), i);
                            setSourceHS(data.get("Previous_Loss_Collection_Details_Source"), i);
                            setLossDateHS(data.get("Previous_Loss_Collection_Details_Loss_Date"), i);
                            setLossTypeHS(data.get("Previous_Loss_Collection_Details_Loss_Type"), i);
                            setAmountPaidHS(data.get("Previous_Loss_Collection_Details_Amount_Paid"), i);
                            setClaimClosedHS(data.get("Previous_Loss_Collection_Details_Claim_Closed"), i);
                        } else {
                            setSource(data.get("Previous_Loss_Collection_Details_Source_1"), i);
                            setLossDate(data.get("Previous_Loss_Collection_Details_Loss_Date_1"), i);
                            setLossType(data.get("Previous_Loss_Collection_Details_Loss_Type_1"), i);
                            setAmountPaid(data.get("Previous_Loss_Collection_Details_Amount_Paid_1"), i);
                            setClaimClosed(data.get("Previous_Loss_Collection_Details_Claim_Closed_1"), i);
                        }
                    } else {
                        if (hasValue(data.get("Previous_Loss_Collection_Details_Class"))) {
                            setCollectionClassHS(data.get("Previous_Loss_Collection_Details_Class_" + (i + 1)), i);
                            setSourceHS(data.get("Previous_Loss_Collection_Details_Source_" + (i + 1)), i);
                            setLossDateHS(data.get("Previous_Loss_Collection_Details_Loss_Date_" + (i + 1)), i);
                            setLossTypeHS(data.get("Previous_Loss_Collection_Details_Loss_Type_" + (i + 1)), i);
                            setAmountPaidHS(data.get("Previous_Loss_Collection_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosedHS(data.get("Previous_Loss_Collection_Details_Claim_Closed_" + (i + 1)), i);
                        } else {
                            setSource(data.get("Previous_Loss_Collection_Details_Source_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Collection_Details_Loss_Date_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Collection_Details_Loss_Type_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Collection_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Collection_Details_Claim_Closed_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailsHS_END(Map<String, String> data) throws Throwable {

        boolean hasPreviousLosses = data.get("Loss_Claim_History_Any_Prior_Collection_Losses").equalsIgnoreCase("Yes") && !data.get("Loss_Claim_History_Any_Prior_Collection_Losses_END").equalsIgnoreCase("No");

        String[] lossHistoryNB = data.get("Loss_Claim_History_Prior_Collection_Losses").split(",");
        String[] lossHistoryEND = data.get("Loss_Claim_History_Prior_Collection_Losses_END").split(",");

        //Add losses
        if (hasPreviousLosses) {
            int totalLosses = lossHistoryNB.length;

            for (int i = 1; i <= lossHistoryEND.length; i++) {
                if (lossHistoryEND[i - 1].contains("_END_ADD")) {
                    totalLosses++;

                    clickAdd();
                    clickPreviousLossDetailsBlock();
                    pause(3000);
                    setCollectionClassHS(data.get("Previous_Loss_Collection_Details_Class_END_" + i), totalLosses - 1);
                    setSourceHS(data.get("Previous_Loss_Collection_Details_Source_END_" + i), totalLosses - 1);
                    setLossDateHS(data.get("Previous_Loss_Collection_Details_Loss_Date_END_" + i), totalLosses - 1);
                    setLossTypeHS(data.get("Previous_Loss_Collection_Details_Loss_Type_END_" + i), totalLosses - 1);
                    setAmountPaidHS(data.get("Previous_Loss_Collection_Details_Amount_Paid_END_" + i), totalLosses - 1);
                    setClaimClosedHS(data.get("Previous_Loss_Collection_Details_Claim_Closed_END_" + i), totalLosses - 1);
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryEND.length; i++) {
                if (lossHistoryEND[i].contains("_END_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryEND[i].split("_END_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailsHS_OOS_END(Map<String, String> data) throws Throwable {

        boolean hasPreviousLosses = (data.get("Loss_Claim_History_Any_Prior_Collection_Losses").equalsIgnoreCase("Yes") && data.get("Loss_Claim_History_Any_Prior_Collection_Losses_OOS_END").equalsIgnoreCase("Yes") || ("Loss_Claim_History_Any_Prior_Collection_Losses").equalsIgnoreCase("No") && data.get("Loss_Claim_History_Any_Prior_Collection_Losses_OOS_END").equalsIgnoreCase("Yes"));

        String[] lossHistoryNB = data.get("Loss_Claim_History_Prior_Collection_Losses").split(",");
        String[] lossHistoryOOS_END = data.get("Loss_Claim_History_Prior_Collection_Losses_OOS_END").split(",");

        //Add losses
        if (hasPreviousLosses) {
            int totalLosses = lossHistoryNB.length;

            for (int i = 1; i <= lossHistoryOOS_END.length; i++) {
                if (lossHistoryOOS_END[i - 1].contains("_OOS_END_ADD")) {
                    totalLosses++;

                    clickAdd();
                    clickPreviousLossDetailsBlock();
                    pause(3000);
                    setCollectionClassHS(data.get("Previous_Loss_Collection_Details_Class_OOS_END_" + i), totalLosses - 1);
                    setSourceHS(data.get("Previous_Loss_Collection_Details_Source_OOS_END_" + i), totalLosses - 1);
                    setLossDateHS(data.get("Previous_Loss_Collection_Details_Loss_Date_OOS_END_" + i), totalLosses - 1);
                    setLossTypeHS(data.get("Previous_Loss_Collection_Details_Loss_Type_OOS_END_" + i), totalLosses - 1);
                    setAmountPaidHS(data.get("Previous_Loss_Collection_Details_Amount_Paid_OOS_END_" + i), totalLosses - 1);
                    setClaimClosedHS(data.get("Previous_Loss_Collection_Details_Claim_Closed_OOS_END_" + i), totalLosses - 1);
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryOOS_END.length; i++) {
                if (lossHistoryOOS_END[i].contains("_OOS_END_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryOOS_END[i].split("_OOS_END_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailsHS_RNW(Map<String, String> data) throws Throwable {
        boolean hasPreviousLosses = (data.get("Loss_Claim_History_Any_Prior_Collection_Losses").equalsIgnoreCase("Yes") && data.get("Loss_Claim_History_Any_Prior_Collection_Losses_RNW").equalsIgnoreCase("Yes") || data.get("Loss_Claim_History_Any_Prior_Collection_Losses").equalsIgnoreCase("No") && data.get("Loss_Claim_History_Any_Prior_Collection_Losses_RNW").equalsIgnoreCase("Yes"));

        String[] lossHistoryNB = data.get("Loss_Claim_History_Prior_Collection_Losses").split(",");
        String[] lossHistoryRNW = data.get("Loss_Claim_History_Prior_Collection_Losses_RNW").split(",");

        //Add losses
        if (hasPreviousLosses) {
            int totalLosses = lossHistoryNB.length;

            for (int i = 1; i <= lossHistoryRNW.length; i++) {
                if (lossHistoryRNW[i - 1].contains("_RNW_ADD")) {
                    totalLosses++;

                    clickAdd();
                    clickPreviousLossDetailsBlock();
                    pause(3000);
                    setCollectionClassHS(data.get("Previous_Loss_Collection_Details_Class_RNW_" + i), totalLosses - 1);
                    setSourceHS(data.get("Previous_Loss_Collection_Details_Source_RNW_" + i), totalLosses - 1);
                    setLossDateHS(data.get("Previous_Loss_Collection_Details_Loss_Date_RNW_" + i), totalLosses - 1);
                    setLossTypeHS(data.get("Previous_Loss_Collection_Details_Loss_Type_RNW_" + i), totalLosses - 1);
                    setAmountPaidHS(data.get("Previous_Loss_Collection_Details_Amount_Paid_RNW_" + i), totalLosses - 1);
                    setClaimClosedHS(data.get("Previous_Loss_Collection_Details_Claim_Closed_RNW_" + i), totalLosses - 1);
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryRNW.length; i++) {
                if (lossHistoryRNW[i].contains("_RNW_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryRNW[i].split("_RNW_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void setCollectionClassHS(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickBlock();
            clickElement(collectionClassHS.get(i), "Collection Class" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Collection Class" + (i + 1));
        }
    }

    public void setCollectionClassCO(String value, int i) throws InterruptedException {
        if (hasValue(value)) {
            clickBlock();
            clickElement(collectionClassHS.get(i), "Collection Class" + (i + 1));
            pause(1000);
            typeTextEnter(driver.switchTo().activeElement(), value, "Collection Class" + (i + 1));
        }
    }

    public void clickBlock() {
        clickElement(previousLossDetailsBlock, "Block");
    }

    public void setSourceHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(sourceHS.get(i), "Source_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Source_" + (i + 1));
        }
    }

    public void setSourceCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(sourceHS.get(i), "Source_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Source_" + (i + 1));
        }
    }

    public void setLossDateHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossDateHS.get(i), "Loss Date_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Loss Date_" + (i + 1));
        }
    }

    public void setLossDateCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossDateHS.get(i), "Loss Date_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Loss Date_" + (i + 1));
        }
    }

    public void setLossTypeHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossTypeHS.get(i), "Loss Type_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Loss Type_" + (i + 1));
        }
    }

    public void setLossTypeCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(lossTypeHS.get(i), "Loss Type_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Loss Type_" + (i + 1));
        }
    }

    public void setAmountPaidHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(amountPaidHS.get(i), "Amount Paid_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Amount Paid_" + (i + 1));
        }
    }

    public void setAmountPaidCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(amountPaidHS.get(i), "Amount Paid_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Amount Paid_" + (i + 1));
        }
    }

    public void setClaimClosedHS(String value, int i) {
        if (hasValue(value)) {
            clickElement(claimClosedHS.get(i), "Claim Closed_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Claim Closed_" + (i + 1));
            clickElement(driver.findElement(By.xpath("//li[text()='" + value + "']")), "Claim closed " + value);
        }
    }

    public void setClaimClosedCO(String value, int i) {
        if (hasValue(value)) {
            clickElement(claimClosedHS.get(i), "Claim Closed_" + (i + 1));
            typeText(driver.switchTo().activeElement(), value, "Claim Closed_" + (i + 1));
            clickElement(driver.findElement(By.xpath("//li[text()='" + value + "']")), "Claim closed " + value);
        }
    }

    public void fillPreviousLossDetailHO(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses");
        String lossHistory = data.get("Previous_Loss_Details_Losses");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    switch (data.get("State")) {
                        case "CA":
                        case "AK":
                        case "MO": {
                            setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                            setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                        }
                        break;
                        case "DC":
                        case "MN":
                        case "TX": {
                            setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                            setCATLossInputHO(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                        }
                        break;
                        case "NV":
                        case "IA":
                        case "ND":
                        case "NH":
                        case "MT":
                        case "AZ":
                        case "NC":
                        case "NE":
                        case "MS":
                        case "KS":
                        case "AR":
                        case "KY":
                        case "IL":
                        case "IN":
                        case "NM":
                        case "OH":
                        case "OK":
                        case "OR":
                        case "WV":
                        case "WI":
                        case "WA":
                        case "VT":
                        case "UT":
                        case "TN":
                        case "WY":
                        case "SD":
                        case "PA":
                        case "MA":
                        case "CT":
                        case "HI":
                        case "DE":
                        case "LA":
                        case "MD":
                        case "AL":
                        case "ME":
                        case "VA":
                        case "MI":
                        case "NJ":
                        case "NY":
                        case "ID":
                        case "GA": {
                            setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                        }
                        break;
                        default: {
                            setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHO_END(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses_END");
        String lossHistory = data.get("Previous_Loss_Details_Losses_END");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    switch (data.get("State_END")) {
                        case "CA":
                        case "AK":
                        case "MO": {
                            setSource(data.get("Previous_Loss_Details_Source_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + (i + 1)), i);
                            setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_END_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                        }
                        break;
                        case "DC":
                        case "MN":
                        case "TX": {
                            setSource(data.get("Previous_Loss_Details_Source_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + (i + 1)), i);
                            setCATLossInputHO(data.get("Previous_Loss_Details_CAT_Loss_END_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                        }
                        break;
                        case "NV":
                        case "IA":
                        case "ND":
                        case "NH":
                        case "MT":
                        case "AZ":
                        case "NC":
                        case "NE":
                        case "MS":
                        case "KS":
                        case "AR":
                        case "KY":
                        case "IL":
                        case "IN":
                        case "NM":
                        case "OH":
                        case "OK":
                        case "OR":
                        case "WV":
                        case "WI":
                        case "WA":
                        case "VT":
                        case "UT":
                        case "TN":
                        case "WY":
                        case "SD":
                        case "PA":
                        case "MA":
                        case "CT":
                        case "HI":
                        case "DE":
                        case "LA":
                        case "MD":
                        case "AL":
                        case "ME":
                        case "VA":
                        case "MI":
                        case "NJ":
                        case "NY":
                        case "ID":
                        case "GA": {
                            setSource(data.get("Previous_Loss_Details_Source_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                        }
                        break;
                        default: {
                            setSource(data.get("Previous_Loss_Details_Source_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_END_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHO_OOS_END(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses_OOS_END");
        String lossHistory = data.get("Previous_Loss_Details_Losses_OOS_END");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    switch (data.get("State_OOS_END")) {
                        case "CA":
                        case "AK":
                        case "MO": {
                            setSource(data.get("Previous_Loss_Details_Source_OOS_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_OOS_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_OOS_END_" + (i + 1)), i);
                            setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_OOS_END_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + (i + 1)), i);
                        }
                        break;
                        case "DC":
                        case "MN":
                        case "TX": {
                            setSource(data.get("Previous_Loss_Details_Source_OOS_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_OOS_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_OOS_END_" + (i + 1)), i);
                            setCATLossInputHO(data.get("Previous_Loss_Details_CAT_Loss_OOS_END_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + (i + 1)), i);
                        }
                        break;
                        case "NV":
                        case "IA":
                        case "ND":
                        case "NH":
                        case "MT":
                        case "AZ":
                        case "NC":
                        case "NE":
                        case "MS":
                        case "KS":
                        case "AR":
                        case "KY":
                        case "IL":
                        case "IN":
                        case "NM":
                        case "OH":
                        case "OK":
                        case "OR":
                        case "WV":
                        case "WI":
                        case "WA":
                        case "VT":
                        case "UT":
                        case "TN":
                        case "WY":
                        case "SD":
                        case "PA":
                        case "MA":
                        case "CT":
                        case "HI":
                        case "DE":
                        case "LA":
                        case "MD":
                        case "AL":
                        case "ME":
                        case "VA":
                        case "MI":
                        case "NJ":
                        case "NY":
                        case "ID":
                        case "GA": {
                            setSource(data.get("Previous_Loss_Details_Source_OOS_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_OOS_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_OOS_END_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + (i + 1)), i);
                        }
                        break;
                        default: {
                            setSource(data.get("Previous_Loss_Details_Source_OOS_END_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_OOS_END_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_OOS_END_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + (i + 1)), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_OOS_END_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHO_RNW(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses_RNW");
        String lossHistory = data.get("Previous_Loss_Details_Losses_RNW");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    switch (data.get("State_RNW")) {
                        case "CA":
                        case "AK":
                        case "MO": {
                            setSource(data.get("Previous_Loss_Details_Source_RNW_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_RNW_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_RNW_" + (i + 1)), i);
                            setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_RNW_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + (i + 1)), i);
                        }
                        break;
                        case "DC":
                        case "MN":
                        case "TX": {
                            setSource(data.get("Previous_Loss_Details_Source_RNW_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_RNW_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_RNW_" + (i + 1)), i);
                            setCATLossInputHO(data.get("Previous_Loss_Details_CAT_Loss_RNW_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + (i + 1)), i);
                        }
                        break;
                        case "NV":
                        case "IA":
                        case "ND":
                        case "NH":
                        case "MT":
                        case "AZ":
                        case "NC":
                        case "NE":
                        case "MS":
                        case "KS":
                        case "AR":
                        case "KY":
                        case "IL":
                        case "IN":
                        case "NM":
                        case "OH":
                        case "OK":
                        case "OR":
                        case "WV":
                        case "WI":
                        case "WA":
                        case "VT":
                        case "UT":
                        case "TN":
                        case "WY":
                        case "SD":
                        case "PA":
                        case "MA":
                        case "CT":
                        case "HI":
                        case "DE":
                        case "LA":
                        case "MD":
                        case "AL":
                        case "ME":
                        case "VA":
                        case "MI":
                        case "NJ":
                        case "NY":
                        case "ID":
                        case "GA": {
                            setSource(data.get("Previous_Loss_Details_Source_RNW_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_RNW_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_RNW_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + (i + 1)), i);
                        }
                        break;
                        default: {
                            setSource(data.get("Previous_Loss_Details_Source_RNW_" + (i + 1)), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_RNW_" + (i + 1)), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_RNW_" + (i + 1)), i);
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + (i + 1)), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_RNW_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHS(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Losses");
        String lossHistory = data.get("Previous_Loss_Details_Losses");

        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    if (losses == 1) {
                        if (hasValue(data.get("Previous_Loss_Details_Source"))) {
                            setSource(data.get("Previous_Loss_Details_Source"), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date"), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type"), i);
                            if (data.get("State").equalsIgnoreCase("CA")) {
                                setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss"), i);
                                setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed"), i);
                                setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid"), i);
                            } else {
                                setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid"), i);
                                setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed"), i);
                                setCATLoss(data.get("Previous_Loss_Details_CAT_Loss"), i);
                            }
                        } else {
                            setSource(data.get("Previous_Loss_Details_Source_1"), i);
                            setLossDate(data.get("Previous_Loss_Details_Loss_Date_1"), i);
                            setLossType(data.get("Previous_Loss_Details_Loss_Type_1"), i);
                            if (data.get("State").equalsIgnoreCase("CA")) {
                                setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_1"), i);
                                setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_1"), i);
                                setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_1"), i);
                            } else {
                                setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_1"), i);
                                setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_1"), i);
                                setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_1"), i);
                            }
                        }
                    } else {
                        setSource(data.get("Previous_Loss_Details_Source_" + (i + 1)), i);
                        pause(10000);
                        setLossDate(data.get("Previous_Loss_Details_Loss_Date_" + (i + 1)), i);
                        setLossType(data.get("Previous_Loss_Details_Loss_Type_" + (i + 1)), i);
                        if (data.get("State").equalsIgnoreCase("CA")) {
                            setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                            setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                            setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                        } else {
                            setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_" + (i + 1)), i);
                            setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_" + (i + 1)), i);
                            setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_" + (i + 1)), i);
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHS_END(Map<String, String> data) throws Throwable {
        boolean hasPreviousLosses = (data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("Yes") && data.get("Loss_Claim_History_Any_Prior_Losses_END").equalsIgnoreCase("Yes") || data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("No") && data.get("Loss_Claim_History_Any_Prior_Losses_END").equalsIgnoreCase("Yes"));

        String[] lossHistoryNB = data.get("Previous_Loss_Details_Losses").split(",");
        String[] lossHistoryEND = data.get("Previous_Loss_Details_Losses_END").split(",");

        if (hasPreviousLosses) {

            int totalLosses = lossHistoryNB.length;

            //Add losses
            for (int i = 1; i <= lossHistoryEND.length; i++) {
                if (lossHistoryEND[i - 1].contains("_ADD")) {
                    totalLosses++;

                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    pause(3000);

                    setSource(data.get("Previous_Loss_Details_Source_END_" + i), totalLosses - 1);
                    setLossDate(data.get("Previous_Loss_Details_Loss_Date_END_" + i), totalLosses - 1);
                    setLossType(data.get("Previous_Loss_Details_Loss_Type_END_" + i), totalLosses - 1);
                    if (data.get("State").equalsIgnoreCase("CA")) {
                        setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_END_" + (i + 1)), i);
                        setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_END_" + (i + 1)), i);
                        setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_END_" + (i + 1)), i);
                    } else {
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_END_" + i), totalLosses - 1);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_END_" + i), totalLosses - 1);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_END_" + i), totalLosses - 1);
                    }
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryEND.length; i++) {
                if (lossHistoryEND[i].contains("_END_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryEND[i].split("_END_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHS_OOS_END(Map<String, String> data) throws Throwable {
        boolean hasPreviousLosses = (data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("Yes") && data.get("Loss_Claim_History_Any_Prior_Losses_OOS_END").equalsIgnoreCase("Yes")) || (data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("No") && data.get("Loss_Claim_History_Any_Prior_Losses_OOS_END").equalsIgnoreCase("Yes"));

        String[] lossHistoryNB = data.get("Previous_Loss_Details_Losses").split(",");
        String[] lossHistoryOOSEND = data.get("Previous_Loss_Details_Losses_OOS_END").split(",");

        if (hasPreviousLosses) {

            int totalLosses = lossHistoryNB.length;

            //Add losses
            for (int i = 1; i <= lossHistoryOOSEND.length; i++) {
                if (lossHistoryOOSEND[i - 1].contains("_ADD")) {

                    totalLosses++;

                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    pause(3000);

                    setSource(data.get("Previous_Loss_Details_Source_OOS_END_" + i), totalLosses - 1);
                    setLossDate(data.get("Previous_Loss_Details_Loss_Date_OOS_END_" + i), totalLosses - 1);
                    setLossType(data.get("Previous_Loss_Details_Loss_Type_OOS_END_" + i), totalLosses - 1);
                    if (data.get("State").equalsIgnoreCase("CA")) {
                        setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_OOS_END_" + (i + 1)), i);
                        setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + (i + 1)), i);
                        setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + (i + 1)), i);
                    } else {
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_OOS_END_" + i), totalLosses - 1);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_OOS_END_" + i), totalLosses - 1);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_OOS_END_" + i), totalLosses - 1);
                    }
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryOOSEND.length; i++) {
                if (lossHistoryOOSEND[i].contains("_OOS_END_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryOOSEND[i].split("_OOS_END_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void fillPreviousLossDetailHS_RNW(Map<String, String> data) throws Throwable {
        boolean hasPreviousLosses = (data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("Yes") && data.get("Loss_Claim_History_Any_Prior_Losses_RNW").equalsIgnoreCase("Yes")) || (data.get("Loss_Claim_History_Any_Prior_Losses").equalsIgnoreCase("No") && data.get("Loss_Claim_History_Any_Prior_Losses_RNW").equalsIgnoreCase("Yes"));

        String[] lossHistoryNB = data.get("Previous_Loss_Details_Losses").split(",");
        String[] lossHistoryRNW = data.get("Previous_Loss_Details_Losses_RNW").split(",");

        if (hasPreviousLosses) {

            int totalLosses = lossHistoryNB.length;

            //Add losses
            for (int i = 1; i <= lossHistoryRNW.length; i++) {
                if (lossHistoryRNW[i - 1].contains("_ADD")) {

                    totalLosses++;

                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();
                    pause(3000);

                    setSource(data.get("Previous_Loss_Details_Source_RNW_" + i), totalLosses - 1);
                    setLossDate(data.get("Previous_Loss_Details_Loss_Date_RNW_" + i), totalLosses - 1);
                    setLossType(data.get("Previous_Loss_Details_Loss_Type_RNW_" + i), totalLosses - 1);
                    if (data.get("State").equalsIgnoreCase("CA")) {
                        setCATLossHO(data.get("Previous_Loss_Details_CAT_Loss_RNW_" + (i + 1)), i);
                        setClaimClosedHO(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + (i + 1)), i);
                        setAmountPaidHO(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + (i + 1)), i);
                    } else {
                        setAmountPaid(data.get("Previous_Loss_Details_Amount_Paid_RNW_" + i), totalLosses - 1);
                        setClaimClosed(data.get("Previous_Loss_Details_Claim_Closed_RNW_" + i), totalLosses - 1);
                        setCATLoss(data.get("Previous_Loss_Details_CAT_Loss_RNW_" + i), totalLosses - 1);
                    }
                }
                saveChanges();
            }
            //Delete Losses
            for (int i = 0; i < lossHistoryRNW.length; i++) {
                if (lossHistoryRNW[i].contains("_RNW_DEL")) {
                    for (int j = 0; j < lossHistoryNB.length; j++) {
                        if (lossHistoryNB[j].equalsIgnoreCase(lossHistoryRNW[i].split("_RNW_DEL")[0])) {
                            clickElement(deleteLosses.get(j));
                        }
                    }
                }
            }
            saveChanges();
        }
    }

    public void deleteLoss(int index) throws Throwable {
        clickElement(deleteLosses.get(index), "delete loss");
        pause(2000);
    }

    public void fillPreviousLossDetailFS(Map<String, String> data) {

    }

    public void fillPreviousLossDetailHO(Map<String, String> data, int i) {
        //TODO
    }

    public void fillPreviousLossDetailsCO(Map<String, String> data) throws Throwable {
        String priorLossHistory = data.get("Loss_Claim_History_Any_Prior_Collection_Losses");
        String lossHistory = data.get("Loss_Claim_History_Prior_Collection_Losses");
        if (hasValue(priorLossHistory) && priorLossHistory.equalsIgnoreCase("Yes")) {
            if (hasValue(lossHistory)) {
                int losses = lossHistory.split(",").length;
                verifyBlockExists("previous loss details");

                for (int i = 0; i < losses; i++) {
                    clickAdd();
                    pause(3000);
                    clickPreviousLossDetailsBlock();

                    if (losses == 1) {
                        setCollectionClassCO(data.get("Previous_Loss_Collection_Details_Class_1"), i);
                        setSourceCO(data.get("Previous_Loss_Collection_Details_Source_1"), i);
                        setLossDateCO(data.get("Previous_Loss_Collection_Details_Loss_Date_1"), i);
                        setLossTypeCO(data.get("Previous_Loss_Collection_Details_Loss_Type_1"), i);
                        setAmountPaidCO(data.get("Previous_Loss_Collection_Details_Amount_Paid_1"), i);
                        setClaimClosedCO(data.get("Previous_Loss_Collection_Details_Claim_Closed_1"), i);
                    } else {
                        setCollectionClassCO(data.get("Previous_Loss_Collection_Details_Class_" + (i + 1)), i);
                        setSourceCO(data.get("Previous_Loss_Collection_Details_Source_" + (i + 1)), i);
                        setLossDateCO(data.get("Previous_Loss_Collection_Details_Loss_Date_" + (i + 1)), i);
                        setLossTypeCO(data.get("Previous_Loss_Collection_Details_Loss_Type_" + (i + 1)), i);
                        setAmountPaidCO(data.get("Previous_Loss_Collection_Details_Amount_Paid_" + (i + 1)), i);
                        setClaimClosedCO(data.get("Previous_Loss_Collection_Details_Claim_Closed_" + (i + 1)), i);
                    }
                }
            }
        }
        saveChanges();
    }
}



