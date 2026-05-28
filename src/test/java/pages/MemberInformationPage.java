package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.AppraisalInformationBlock;
import pages.blocks.LexisNexisPriorCarrierInformationBlock;
import pages.blocks.MemberInformationBlock;
import pages.blocks.ProjectManagerContactInformationBlock;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class MemberInformationPage extends CommonComponentsAndActions {
    WebDriver driver;

    MemberInformationBlock memberInformationBlock;
    LexisNexisPriorCarrierInformationBlock lexisNexisPriorCarrierInformationBlock;
    AppraisalInformationBlock appraisalInformationBlock;
    ProjectManagerContactInformationBlock projectManagerContactInformationBlock;

    public MemberInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        memberInformationBlock = new MemberInformationBlock(driver);
        lexisNexisPriorCarrierInformationBlock = new LexisNexisPriorCarrierInformationBlock(driver);
        appraisalInformationBlock = new AppraisalInformationBlock(driver);
        projectManagerContactInformationBlock = new ProjectManagerContactInformationBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillMemberInformationPage(Map<String, String> data) throws Throwable {
        if (goToPage("Member Information")) {
            memberInformationBlock.fillOutMemberInformation(data);
            appraisalInformationBlock.fillOutAppraisalInformation(data);
        }
    }

    public void fillMemberInformationPage_END(Map<String, String> data) throws Throwable {
        if (goToPage("Member Information")) {
            memberInformationBlock.fillOutMemberInformation_END(data);
            appraisalInformationBlock.fillOutAppraisalInformation_END(data);
        }
    }

    public void fillMemberInformationPage_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Member Information")) {
            memberInformationBlock.fillOutMemberInformation_OOS_END(data);
            appraisalInformationBlock.fillOutAppraisalInformation_OOS_END(data);
        }
    }

    public void fillMemberInformationPage_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Member Information")) {
            memberInformationBlock.fillOutMemberInformation_RNW(data);
            appraisalInformationBlock.fillOutAppraisalInformation_RNW(data);
        }
    }

    public void fillMemberInformationPageES(Map<String, String> data) throws Throwable {
        if (goToPage("Member Information")) {
            memberInformationBlock.fillOutMemberInformation(data);
        }
    }

    public void fillMemberInformationPageCC(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailCC(data);
        appraisalInformationBlock.fillAppraisalInformationDetailCC(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsCC(data);
    }

    public void fillMemberInformationPageCC_END(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailCC_END(data);
        appraisalInformationBlock.fillAppraisalInformationDetailCC_END(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsCC_END(data);
    }

    public void fillMemberInformationPageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void fillMemberInformationPage(Map<String, String> data, int i) throws Throwable {
        goToPage("Member Information");
        pause(5000);
        memberInformationBlock.fillOutMemberInformation(data, i);
        appraisalInformationBlock.fillOutAppraisalInformation(data, i);
    }

    public void fillMemberInformationPagePA(Map<String, String> data) throws Throwable {
        goToPage("Member Information & Policy History");
        pause(5000);
        memberInformationBlock.fillOutMemberInformationDetailsPA(data);
        lexisNexisPriorCarrierInformationBlock.fillLexisNexisPriorCarrierInformationDetails_PA(data);
        saveChanges();
    }

    public void fillMemberInformationPagePA_END(Map<String, String> data) throws Throwable {
        goToPage("Member Information & Policy History");
        memberInformationBlock.fillOutMemberInformationDetailsPA_END(data);
        lexisNexisPriorCarrierInformationBlock.fillLexisNexisPriorCarrierInformationDetails_PA_END(data);
        saveChanges();
    }

    public void fillMemberInformationPagePA_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Member Information & Policy History");
        memberInformationBlock.fillOutMemberInformationDetailsPA_OOS_END(data);
        lexisNexisPriorCarrierInformationBlock.fillLexisNexisPriorCarrierInformationDetails_PA_OOS_END(data);
        saveChanges();
    }

    public void fillMemberInformationPagePA_RNW(Map<String, String> data) throws Throwable {
        goToPage("Member Information & Policy History");
        memberInformationBlock.fillOutMemberInformationDetailsPA_RNW(data);
        lexisNexisPriorCarrierInformationBlock.fillLexisNexisPriorCarrierInformationDetails_PA_RNW(data);
        saveChanges();
    }

    public void fillMemberInformationPageHS(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailHS(data);
        appraisalInformationBlock.fillAppraisalInformationDetailHS(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsHS(data);
    }

    public void verifyLC360() {
        reportScreenshot("LC360_" + System.currentTimeMillis(), "LC360");
        appraisalInformationBlock.checkTimestamp();
        appraisalInformationBlock.failIfLC360FailedMessageIsPresent();
    }


    public void fillMemberInformationPageHS_END(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailHS_END(data);
        appraisalInformationBlock.fillAppraisalInformationDetailHS_END(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsHS_END(data);
    }

    public void fillMemberInformationPageHS_OOS_END(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailHS_OOS_END(data);
        appraisalInformationBlock.fillAppraisalInformationDetailHS_OOS_END(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsHS_OOS_END(data);
    }

    public void fillMemberInformationPageHS_RNW(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailHS_RNW(data);
        appraisalInformationBlock.fillAppraisalInformationDetailHS_RNW(data);
        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsHS_RNW(data);
    }

    public void fillMemberInformationPageFS(Map<String, String> data) throws Throwable {
        goToPage("Member Information");
        memberInformationBlock.fillOutMemberInformationDetailFS(data);
//        appraisalInformationBlock.fillAppraisalInformationDetailFS(data);
//        projectManagerContactInformationBlock.fillProjectManagerConcatInformationDetailsFS(data);
    }


}