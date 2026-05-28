package pages.utils;

import excel.DataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;
import java.util.Map;

public class QuoteCreator extends CommonComponentsAndActions {
    WebDriver driver;

    public QuoteCreator(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void createQuote(String LOB, Map<String, String> data) throws Throwable {
        switch (LOB) {
            case "HO":
                createQuoteHO(data);
                break;
            case "EX":
                createQuoteEX(data);
                break;
            case "PA":
                createQuotePA(data);
                break;
            case "PW":
                createQuotePW(data);
                break;
            case "CO":
                createQuoteCO(data);
                break;
            case "HS":
                createQuoteHS(data);
                break;
            case "ES":
                createQuoteES(data);
                break;
            case "CC":
                createQuoteCC(data);
                break;
            case "PF":
                createQuotePF(data);
                break;
        }
    }

    public void createEndorsement(String LOB, Map<String, String> data) throws Throwable {
        switch (LOB) {
            case "HO":
                createEndorsementHO(data);
                break;
            case "EX":
                createEndorsementEX(data);
                break;
            case "PA":
                createEndorsementPA(data);
                break;
            case "PW":
                createEndorsementPW(data);
                break;
            case "CO":
                createEndorsementCO(data);
                break;
            case "HS":
                createEndorsementHS(data);
                break;
            case "ES":
                createEndorsementES(data);
                break;
            case "CC":
                createEndorsementCC(data);
                break;
            case "PF":
                createEndorsementFS(data);
                break;
        }
    }

    public void createOOSEndorsement(String LOB, Map<String, String> data) throws Throwable {
        switch (LOB) {
            case "HO":
                createOOSEndorsementHO(data);
                break;
            case "EX":
                createOOSEndorsementEX(data);
                break;
            case "PA":
                createOOSEndorsementPA(data);
                break;
            case "PW":
                createOOSEndorsementPW(data);
                break;
            case "CO":
                createOOSEndorsementCO(data);
                break;
            case "HS":
                createOOSEndorsementHS(data);
                break;
            case "ES":
                createOOSEndorsementES(data);
                break;
            case "CC":
                createOOSEndorsementCC(data);
                break;
            case "PF":
                createOOSEndorsementFS(data);
                break;
        }
    }

    public void createRenewal(String LOB, Map<String, String> data) throws Throwable {
        switch (LOB) {
            case "HO":
                createRenewalHO(data);
                break;
            case "EX":
                createRenewalEX(data);
                break;
            case "PA":
                createRenewalPA(data);
                break;
            case "PW":
                createRenewalPW(data);
                break;
            case "CO":
                createRenewalCO(data);
                break;
            case "HS":
                createRenewalHS(data);
                break;
            case "ES":
                createRenewalES(data);
                break;
            case "PF":
                createRenewalFS(data);
                break;
        }
    }

    //HOMEOWNER
    public void createQuoteHO(Map<String, String> data) throws Throwable {
        new HomeownersPolicyCoverPage(driver).fillOutHomeownersPolicyCoverPage(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHO(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data);
        new FloodCoveragePage(driver).fillFloodCoveragePageHO(data);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
        new WildfirePage(driver).fillWildfireDetailsPageHO(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data);
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
        new InspectionPage(driver).fillOutInspectionDetailsHO(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
        new BindingInformationPage(driver).fillOutBindingInformationHO(data);
        new MemberInformationPage(driver).fillMemberInformationPage(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO(data);

        //Add additional locations if there are any
        if (hasValue(data.get("Additional_Locations")) && !data.get("Additional_Locations").equalsIgnoreCase(",")) {
            new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");
            new HomeownersPolicyCoverPage(driver).addAdditionalLocations(data);
            new CommonComponentsAndActions(driver).orderPropertyDetails();
            for (int i = 1; i < data.get("Additional_Locations").split(",").length + 1; i++) {
                addAdditionalLocationsHO_NB(data, i);
            }
        }

        new ApplicationPage(driver).fillApplicationPageHO(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPageHO(data);
    }

    public void createEndorsementHO(Map<String, String> data) throws Throwable {
        new HomeownersPolicyCoverPage(driver).fillOutHomeownersPolicyCoverPage_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHO_END(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage_END(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO_END(data);
        new FloodCoveragePage(driver).fillFloodCoveragePageHO_END(data);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage_END(data);
        new WildfirePage(driver).fillWildfireDetailsPageHO_END(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO_END(data);
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails_END(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO_END(data);
        new InspectionPage(driver).fillOutInspectionDetailsHO_END(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage_END(data);
        new BindingInformationPage(driver).fillOutBindingInformationHO_END(data);
        new MemberInformationPage(driver).fillMemberInformationPage_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO_END(data);

        //Add additional locations if there are any
        if (hasValue(data.get("Additional_Locations_END")) && !data.get("Additional_Locations_END").equalsIgnoreCase(",")) {
            new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");
            new HomeownersPolicyCoverPage(driver).addAdditionalLocations_END(data);
            new CommonComponentsAndActions(driver).orderPropertyDetails();
            for (int i = 1; i < data.get("Additional_Locations_END").split(",").length + 1; i++) {
                addAdditionalLocationsHO_END(data, i);
            }
        }

        new ApplicationPage(driver).fillApplicationPageHO_END(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPageHO_END(data);
    }

    public void createOOSEndorsementHO(Map<String, String> data) throws Throwable {
        new HomeownersPolicyCoverPage(driver).fillOutHomeownersPolicyCoverPage_OOS_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHO_OOS_END(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage_OOS_END(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO_OOS_END(data);
        new FloodCoveragePage(driver).fillFloodCoveragePageHO_OOS_END(data);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage_OOS_END(data);
        new WildfirePage(driver).fillWildfireDetailsPageHO_OOS_END(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO_OOS_END(data);
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails_OOS_END(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO_OOS_END(data);
        new InspectionPage(driver).fillOutInspectionDetailsHO_OOS_END(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage_OOS_END(data);
        new BindingInformationPage(driver).fillOutBindingInformationHO_OOS_END(data);
        new MemberInformationPage(driver).fillMemberInformationPage_OOS_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO_OOS_END(data);

        //Add additional locations if there are any
        if (hasValue(data.get("Additional_Locations_OOS_END")) && !data.get("Additional_Locations_OOS_END").equalsIgnoreCase(",")) {
            new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");
            new HomeownersPolicyCoverPage(driver).addAdditionalLocations_OOS_END(data);
            new CommonComponentsAndActions(driver).orderPropertyDetails();
            for (int i = 1; i < data.get("Additional_Locations_OOS_END").split(",").length + 1; i++) {
                addAdditionalLocationsHO_OOS_END(data, i);
            }
        }

        new ApplicationPage(driver).fillApplicationPageHO_OOS_END(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPageHO_OOS_END(data);
    }

    public void createRenewalHO(Map<String, String> data) throws Throwable {
        new HomeownersPolicyCoverPage(driver).fillOutHomeownersPolicyCoverPage_RNW(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHO_RNW(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage_RNW(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO_RNW(data);
        new FloodCoveragePage(driver).fillFloodCoveragePageHO_RNW(data);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage_RNW(data);
        new WildfirePage(driver).fillWildfireDetailsPageHO_RNW(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO_RNW(data);
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails_RNW(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO_RNW(data);
        new InspectionPage(driver).fillOutInspectionDetailsHO_RNW(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage_RNW(data);
        new BindingInformationPage(driver).fillOutBindingInformationHO_RNW(data);
        new MemberInformationPage(driver).fillMemberInformationPage_RNW(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO_RNW(data);

        //Add additional locations if there are any
        if (hasValue(data.get("Additional_Locations_RNW")) && !data.get("Additional_Locations_RNW").equalsIgnoreCase(",")) {
            new CommonComponentsAndActions(driver).goToPage("Homeowners Policy");
            new HomeownersPolicyCoverPage(driver).addAdditionalLocations_RNW(data);
            new CommonComponentsAndActions(driver).orderPropertyDetails();
            for (int i = 1; i < data.get("Additional_Locations_RNW").split(",").length + 1; i++) {
                addAdditionalLocationsHO_RNW(data, i);
            }
        }

        new ApplicationPage(driver).fillApplicationPageHO_RNW(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPageHO_RNW(data);
    }

    public void addAdditionalLocationsHO_NB(Map<String, String> data, int i) throws Throwable {
        goToPage(data.get("City_Name_Txt_" + i) + " " + data.get("State_" + i), -1);
//        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPage(data, i);
        new FloodCoveragePage(driver).fillFloodCoveragePageHO(data);
//        new FloodCoveragePage(driver).fillFloodCoveragePageHO(data, i);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesHO(data, i);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data);
//        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPage(data, i);
        new WildfirePage(driver).fillWildfireDetailsPageHO(data, i);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHO(data, i);
        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails(data);
//        new ResidenceEmployeePage(driver).fillResidenceEmployeeDetails(data, i);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data);
//        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHO(data, i);
        new InspectionPage(driver).fillOutInspectionDetailsHO(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data);
//        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPage(data, i);
        new BindingInformationPage(driver).fillOutBindingInformationHO(data);
        new MemberInformationPage(driver).fillMemberInformationPage(data);
//        new MemberInformationPage(driver).fillMemberInformationPage(data, i);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO(data);
//        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHO(data, i);
    }

    public void addAdditionalLocationsHO_END(Map<String, String> data, int i) throws Throwable {
        //TODO
    }

    public void addAdditionalLocationsHO_OOS_END(Map<String, String> data, int i) throws Throwable {
        //TODO
    }

    public void addAdditionalLocationsHO_RNW(Map<String, String> data, int i) throws Throwable {
        //TODO
    }

    //EXCESS LIABILITY
    public void createQuoteEX(Map<String, String> data) throws Throwable {
        new ExcessLiabilityCoverPage(driver).fillExcessLiabilityCoverPage(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPage(data);
        new OperatorInformationPage(driver).fillOperatorInformationPage(data);
        new AdditionalInsuredPage(driver).fillAdditionalInsuredPageEX(data);
        new PropertyInformationPage(driver).fillPropertyInformationPage(data);
        new WatercraftInformationPage(driver).fillWatercraftInformationPage(data);
        new SelectCoveragesPage(driver).fillSelectCoveragesPage(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesEX(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPage(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPage(data);
    }

    public void createEndorsementEX(Map<String, String> data) throws Throwable {
        switch (data.get("State")) {
            case "AK":
            case "AR":
            case "AL":
            case "CT":
            case "DC":
            case "IA":
            case "IL":
            case "IN":
            case "OK":
            case "KS":
            case "MN":
            case "MO":
            case "ND":
            case "NE":
            case "NH":
            case "OH":
            case "PA":
            case "RI":
            case "SD":
            case "TN":
            case "WI":
            case "WV":
            case "DE":
            case "HI":
            case "ME":
            case "MS":
            case "NJ":
            case "NY":
            case "VA":
            case "KY":
            case "MD":
            case "VT":
            case "MA":
            case "TX":
            case "GA":
            case "MI":
            case "LA":
            case "NC":
            case "AZ":
            case "CO":
            case "NM":
            case "OR":
            case "UT":
            case "WY":
            case "MT":
            case "NV":
            case "WA":
            case "SC":
            case "FL":
            case "CA":
            case "ID": {
                ExcessLiabilityCoverPage excessLiabilityCoverPage = new ExcessLiabilityCoverPage(driver);
                OperatorInformationPage operatorInformationPage = new OperatorInformationPage(driver);
                AdditionalInsuredPage additionalInsuredPage = new AdditionalInsuredPage(driver);
                PropertyInformationPage propertyInformationPage = new PropertyInformationPage(driver);
                WatercraftInformationPage watercraftInformationPage = new WatercraftInformationPage(driver);
                SelectCoveragesPage selectCoveragesPage = new SelectCoveragesPage(driver);
                OptionalCoveragesPage optionalCoveragesPage = new OptionalCoveragesPage(driver);
                ManuscriptEndorsementsPage manuscriptEndorsementsPage = new ManuscriptEndorsementsPage(driver);
                SubjectivitiesPage subjectivitiesPage = new SubjectivitiesPage(driver);

                excessLiabilityCoverPage.fillExcessLiabilityCoverPage_END(data);
                actionButtonNext();

                operatorInformationPage.fillOperatorInformationPage_END(data);
                actionButtonNext();

                additionalInsuredPage.fillAdditionalInsuredPage_END(data);
                actionButtonNext();

                propertyInformationPage.fillPropertyInformationPage_END(data);
                actionButtonNext();

                watercraftInformationPage.fillWatercraftInformationPage_END(data);
                actionButtonNext();

                selectCoveragesPage.fillSelectCoveragesPage_END(data);
                actionButtonNext();

                optionalCoveragesPage.fillOptionalCoverages_EX_END(data);
                actionButtonNext();

                manuscriptEndorsementsPage.fillManuscriptEndorsementPage_END(data);
                actionButtonNext();

                subjectivitiesPage.fillSubjectivitiesPage_END(data);
                actionButtonNext();
            }
        }
    }

    public void createOOSEndorsementEX(Map<String, String> data) throws Throwable {
        switch (data.get("State")) {
            case "AK":
            case "AR":
            case "AL":
            case "CT":
            case "DC":
            case "IA":
            case "IL":
            case "IN":
            case "OK":
            case "KS":
            case "MN":
            case "MO":
            case "ND":
            case "NE":
            case "NH":
            case "OH":
            case "PA":
            case "RI":
            case "SD":
            case "TN":
            case "WI":
            case "WV":
            case "DE":
            case "HI":
            case "ME":
            case "MS":
            case "NJ":
            case "NY":
            case "VA":
            case "KY":
            case "MD":
            case "VT":
            case "MA":
            case "TX":
            case "GA":
            case "MI":
            case "LA":
            case "NC":
            case "AZ":
            case "CO":
            case "NM":
            case "OR":
            case "UT":
            case "WY":
            case "MT":
            case "NV":
            case "WA":
            case "SC":
            case "FL":
            case "CA":
            case "ID": {
                ExcessLiabilityCoverPage excessLiabilityCoverPage = new ExcessLiabilityCoverPage(driver);
                OperatorInformationPage operatorInformationPage = new OperatorInformationPage(driver);
                AdditionalInsuredPage additionalInsuredPage = new AdditionalInsuredPage(driver);
                PropertyInformationPage propertyInformationPage = new PropertyInformationPage(driver);
                WatercraftInformationPage watercraftInformationPage = new WatercraftInformationPage(driver);
                SelectCoveragesPage selectCoveragesPage = new SelectCoveragesPage(driver);
                OptionalCoveragesPage optionalCoveragesPage = new OptionalCoveragesPage(driver);
                ManuscriptEndorsementsPage manuscriptEndorsementsPage = new ManuscriptEndorsementsPage(driver);
                SubjectivitiesPage subjectivitiesPage = new SubjectivitiesPage(driver);

                excessLiabilityCoverPage.fillExcessLiabilityCoverPage_OOS_END(data);
                actionButtonNext();

                operatorInformationPage.fillOperatorInformationPage_OOS_END(data);
                actionButtonNext();

                additionalInsuredPage.fillAdditionalInsuredPage_OOS_END(data);
                actionButtonNext();

                propertyInformationPage.fillPropertyInformationPage_OOS_END(data);
                actionButtonNext();

                watercraftInformationPage.fillWatercraftInformationPage_OOS_END(data);
                actionButtonNext();

                selectCoveragesPage.fillSelectCoveragesPage_OOS_END(data);
                actionButtonNext();

                optionalCoveragesPage.fillOptionalCoverages_EX_OOS_END(data);
                actionButtonNext();

                manuscriptEndorsementsPage.fillManuscriptEndorsementPage_OOS_END(data);
                actionButtonNext();

                subjectivitiesPage.fillSubjectivitiesPage_OOS_END(data);
                actionButtonNext();
            }
        }
    }

    public void createRenewalEX(Map<String, String> data) throws Throwable {
        switch (data.get("State")) {
            case "AK":
            case "AR":
            case "AL":
            case "CT":
            case "DC":
            case "IA":
            case "IL":
            case "IN":
            case "OK":
            case "KS":
            case "MN":
            case "MO":
            case "ND":
            case "NE":
            case "NH":
            case "OH":
            case "PA":
            case "RI":
            case "SD":
            case "TN":
            case "WI":
            case "WV":
            case "DE":
            case "HI":
            case "ME":
            case "MS":
            case "NJ":
            case "NY":
            case "VA":
            case "KY":
            case "MD":
            case "VT":
            case "MA":
            case "TX":
            case "GA":
            case "MI":
            case "LA":
            case "NC":
            case "AZ":
            case "CO":
            case "NM":
            case "OR":
            case "UT":
            case "WY":
            case "MT":
            case "NV":
            case "WA":
            case "SC":
            case "FL":
            case "CA":
            case "ID": {
                ExcessLiabilityCoverPage excessLiabilityCoverPage = new ExcessLiabilityCoverPage(driver);
                OperatorInformationPage operatorInformationPage = new OperatorInformationPage(driver);
                AdditionalInsuredPage additionalInsuredPage = new AdditionalInsuredPage(driver);
                PropertyInformationPage propertyInformationPage = new PropertyInformationPage(driver);
                WatercraftInformationPage watercraftInformationPage = new WatercraftInformationPage(driver);
                SelectCoveragesPage selectCoveragesPage = new SelectCoveragesPage(driver);
                OptionalCoveragesPage optionalCoveragesPage = new OptionalCoveragesPage(driver);
                ManuscriptEndorsementsPage manuscriptEndorsementsPage = new ManuscriptEndorsementsPage(driver);
                SubjectivitiesPage subjectivitiesPage = new SubjectivitiesPage(driver);

                excessLiabilityCoverPage.fillExcessLiabilityCoverPage_RNW(data);
                actionButtonNext();

                operatorInformationPage.fillOperatorInformationPage_RNW(data);
                actionButtonNext();

                additionalInsuredPage.fillAdditionalInsuredPage_RNW(data);
                actionButtonNext();

                propertyInformationPage.fillPropertyInformationPage_RNW(data);
                actionButtonNext();

                watercraftInformationPage.fillWatercraftInformationPage_RNW(data);
                actionButtonNext();

                selectCoveragesPage.fillSelectCoveragesPage_RNW(data);
                actionButtonNext();

                optionalCoveragesPage.fillOptionalCoverages_EX_RNW(data);
                actionButtonNext();

                manuscriptEndorsementsPage.fillManuscriptEndorsementPage_RNW(data);
                actionButtonNext();

                subjectivitiesPage.fillSubjectivitiesPage_RNW(data);
                actionButtonNext();
            }
        }
    }

    //COLLECTIONS
    public void createQuoteCO(Map<String, String> data) throws Throwable {
        new CollectionsPolicyPage(driver).fillCollectionsPolicyPage(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPage(data);
        new CoverageByClassPage(driver).fillCoverageByClassPage(data);
        new CoverageSchedulePage(driver).fillCoverageSchedulePage(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesCO(data);
        new ReportsPage(driver).fillReportsPage(data);
        new BindingInformationPage(driver).fillOutBindingInformationCO(data);
        new AdditionalInsuredPage(driver).fillAdditionalInsuredPageCO(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageCO(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageCO(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPageCO(data);
    }

    public void createEndorsementCO(Map<String, String> data) {
        //TODO IMPLEMENT METHOD CO
    }

    public void createOOSEndorsementCO(Map<String, String> data) {
        //TODO IMPLEMENT METHOD CO
    }

    public void createRenewalCO(Map<String, String> data) {
        //TODO IMPLEMENT METHOD CO
    }

    //PERSONAL AUTO
    public void createQuotePA(Map<String, String> data) throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA(data);
        data = new OperatorsAndVehiclePage(driver).fillOperatorsAndVehiclesPagePA(data);
        new DriverDetailsPage(driver).fillDriverDetailsPagePA(data);
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA(data);
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA(data);
        new CoveragesPage(driver).fillCoveragesPagePA(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA(data);
//        new PolicySummaryPage(driver).fillPolicySummaryPagePA(data);
//        new AccountSummaryPage(driver).fillAccountSummaryPagePA(data);
        new MemberInformationPage(driver).fillMemberInformationPagePA(data);
        new ApplicationPage(driver).fillApplicationPagePA(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPagePA(data);
    }

    public void createEndorsementPA(Map<String, String> data) throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA_END(data);
        new OperatorsAndVehiclePage(driver).fillOperatorsAndVehiclePagePA_END(data);
        new DriverDetailsPage(driver).fillDriverDetailsPagePA_END(data);
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_END(data);
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA_END(data);
        new CoveragesPage(driver).fillCoveragesPagePA_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA_END(data);
//        new PolicySummaryPage(driver).fillPolicySummaryPagePA_END(data);
//        new AccountSummaryPage(driver).fillAccountSummaryPagePA_END(data);
        new MemberInformationPage(driver).fillMemberInformationPagePA_END(data);
        new ApplicationPage(driver).fillApplicationPagePA_END(data);
        new SubjectivityPage(driver).fillSubjectivityPagePA_END(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPagePA_END(data);
    }

    public void createOOSEndorsementPA(Map<String, String> data) throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA_OOS_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA_OOS_END(data);
        new OperatorsAndVehiclePage(driver).fillOperatorsAndVehiclePagePA_OOS_END(data);
        new DriverDetailsPage(driver).fillDriverDetailsPagePA_OOS_END(data);
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_OOS_END(data);
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA_OOS_END(data);
        new CoveragesPage(driver).fillCoveragesPagePA_OOS_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA_OOS_END(data);
//        new PolicySummaryPage(driver).fillPolicySummaryPagePA_OOS_END(data);
//        new AccountSummaryPage(driver).fillAccountSummaryPagePA_OOS_END(data);
        new MemberInformationPage(driver).fillMemberInformationPagePA_OOS_END(data);
        new ApplicationPage(driver).fillApplicationPagePA_OOS_END(data);
        new SubjectivityPage(driver).fillSubjectivityPagePA_OOS_END(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPagePA_OOS_END(data);
    }

    public void createRenewalPA(Map<String, String> data) throws Throwable {
        new AutomobilePolicyPage(driver).fillAutomobilePolicyPagePA_RNW(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPagePA_RNW(data);
        new OperatorsAndVehiclePage(driver).fillOperatorsAndVehiclePagePA_RNW(data);
        new DriverDetailsPage(driver).fillDriverDetailsPagePA_RNW(data);
        new VehiclesDetailsPage(driver).fillVehiclesDetailsPagePA_RNW(data);
        new DriverAssignmentPage(driver).fillDriverAssignmentPagePA_RNW(data);
        new CoveragesPage(driver).fillCoveragesPagePA_RNW(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPagePA_RNW(data);
//        new PolicySummaryPage(driver).fillPolicySummaryPagePA_RNW(data);
//        new AccountSummaryPage(driver).fillAccountSummaryPagePA_RNW(data);
        new MemberInformationPage(driver).fillMemberInformationPagePA_RNW(data);
        new ApplicationPage(driver).fillApplicationPagePA_RNW(data);
        new SubjectivityPage(driver).fillSubjectivityPagePA_RNW(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPagePA_RNW(data);
    }

    //HOME SURPLUS
    public void createQuoteHS(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageHS(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHS(data);
        new LocationCoveragePage(driver).fillLocationCoveragePageHS(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageHS(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHS(data);
        new WildfirePage(driver).fillWildfireDetailsPageHS(data);
        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPageHS(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageHS(data);
        new MemberInformationPage(driver).fillMemberInformationPageHS(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageHS(data);
        new RolAndPremiumInformationPage(driver).RolAndPremiumInformationHS(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHS(data);
        new CollectionsPage(driver).fillCollectionsPageHS(data);
        new CoverageSchedulePage(driver).fillCollectionSchedulePageHS(data);
        new PreviousClaimsLossHistoryPage(driver).fillPreviousClaimsLossHistoryPageHS(data);
        new ApplicationPage(driver).fillApplicationPageHS(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPageHS(data);
        saveChanges();
    }

    public void createEndorsementHS(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageHS_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHS_END(data);
        new LocationCoveragePage(driver).fillLocationCoveragePageHS_END(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageHS_END(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHS_END(data);
        new WildfirePage(driver).fillWildfireDetailsPageHS_END(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS_END(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageHS_END(data);
        new MemberInformationPage(driver).fillMemberInformationPageHS_END(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageHS_END(data);
        new RolAndPremiumInformationPage(driver).RolAndPremiumInformationHS_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHS_END(data);
        new CollectionsPage(driver).fillCollectionsPageHS_END(data);
        new CoverageSchedulePage(driver).fillCollectionSchedulePageHS_END(data);
        new PreviousClaimsLossHistoryPage(driver).fillPreviousClaimsLossHistoryPageHS_END(data);
        new ApplicationPage(driver).fillApplicationPageHS_END(data);
        saveChanges();
        //TODO Policy/Bill Delivery Page HS_END^^
    }

    public void createOOSEndorsementHS(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageHS_OOS_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHS_OOS_END(data);
        new LocationCoveragePage(driver).fillLocationCoveragePageHS_OOS_END(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageHS_OOS_END(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHS_OOS_END(data);
        new WildfirePage(driver).fillWildfireDetailsPageHS_OOS_END(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS_OOS_END(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageHS_OOS_END(data);
        new MemberInformationPage(driver).fillMemberInformationPageHS_OOS_END(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageHS_OOS_END(data);
        new RolAndPremiumInformationPage(driver).RolAndPremiumInformationHS_OOS_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHS_OOS_END(data);
        new CollectionsPage(driver).fillCollectionsPageHS_OOS_END(data);
        new CoverageSchedulePage(driver).fillCollectionSchedulePageHS_OOS_END(data);
        new PreviousClaimsLossHistoryPage(driver).fillPreviousClaimsLossHistoryPageHS_OOS_END(data);
        new ApplicationPage(driver).fillApplicationPageHS_OOS_END(data);
        saveChanges();
    }

    public void createRenewalHS(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageHS_RNW(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageHS_RNW(data);
        new LocationCoveragePage(driver).fillLocationCoveragePageHS_RNW(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageHS_RNW(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageHS_RNW(data);
        new WildfirePage(driver).fillWildfireDetailsPageHS_RNW(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageHS_RNW(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageHS_RNW(data);
        new MemberInformationPage(driver).fillMemberInformationPageHS_RNW(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageHS_RNW(data);
        new RolAndPremiumInformationPage(driver).RolAndPremiumInformationHS_RNW(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageHS_RNW(data);
        new CollectionsPage(driver).fillCollectionsPageHS_RNW(data);
        new CoverageSchedulePage(driver).fillCollectionSchedulePageHS_RNW(data);
        new PreviousClaimsLossHistoryPage(driver).fillPreviousClaimsLossHistoryPageHS_RNW(data);
        new ApplicationPage(driver).fillApplicationPageHS_RNW(data);
        saveChanges();
    }

    //PERSONAL WATERCRAFT
    public void createQuotePW(Map<String, String> data) throws Throwable {
        WatercraftPolicyCoverPage watercraftPolicyCoverPage = new WatercraftPolicyCoverPage(driver);
        WatercraftVehiclePage watercraftVehiclePage = new WatercraftVehiclePage(driver);
        OperatorDetailsPage operatorDetailsPagePW = new OperatorDetailsPage(driver);
        ManuscriptEndorsementsPage manuscriptEndorsementsPage = new ManuscriptEndorsementsPage(driver);
        PreviousClaimsMVRActivityPage previousClaimsMVRActivityPage = new PreviousClaimsMVRActivityPage(driver);
        SubjectivitiesPage subjectivitiesPage = new SubjectivitiesPage(driver);
        VesselUnderwritingPage vesselUnderwritingPage = new VesselUnderwritingPage(driver);
        VesselCoveragePage vesselCoveragePage = new VesselCoveragePage(driver);

        boolean gte27 = data.get("Vehicle_GTE_27_Feet").equalsIgnoreCase("Yes") && Integer.parseInt(data.get("Length")) > 27;

        if (gte27) {
            watercraftPolicyCoverPage.fillOutWatercraftPolicyCoverPage(data);
            new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPage(data);
            goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
            watercraftVehiclePage.fillWatercraftVehiclePageDetails(data);

            goToPage("Vessel Underwriting");
            vesselUnderwritingPage.fillVesselUnderwritingDetails(data);

            goToPage("Manuscript Endorsements");
            manuscriptEndorsementsPage.fillManuscriptEndorsementPagePW(data);

            goToPage("Previous Claims/MVR Activity");
            previousClaimsMVRActivityPage.fillPreviousClaimsMVRActivityDetails(data);

            goToPage("Subjectivities");
            subjectivitiesPage.fillSubjectivitiesPagePW(data);

        } else {
            if (!data.get("State").equalsIgnoreCase("CA") && !data.get("State").equalsIgnoreCase("WA")) {
                watercraftPolicyCoverPage.fillOutWatercraftPolicyCoverPage(data);
                new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPage(data);
                goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
                watercraftVehiclePage.fillWatercraftVehiclePageDetails(data);

                goToPage("Manuscript Endorsements");
                manuscriptEndorsementsPage.fillManuscriptEndorsementPagePW(data);

                goToPage("Previous Claims/MVR Activity");
                previousClaimsMVRActivityPage.fillPreviousClaimsMVRActivityDetails(data);

                goToPage("Subjectivities");
                subjectivitiesPage.fillSubjectivitiesPagePW(data);

            } else {
                watercraftPolicyCoverPage.fillOutWatercraftPolicyCoverPage(data);
                new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPage(data);
                goToPage(data.get("First_Name") + " " + data.get("Last_Name"));
                operatorDetailsPagePW.fillOperatorDetails(data);

                goToPage(data.get("Year") + " " + data.get("Manufacturer") + " " + data.get("Model"));
                watercraftVehiclePage.fillWatercraftVehiclePageDetails(data);

                goToPage("Vessel Underwriting");
                vesselUnderwritingPage.fillVesselUnderwritingDetails(data);

                goToPage("Vessel Coverage");
                vesselCoveragePage.fillVesselCoverageDetails(data);

                goToPage("Manuscript Endorsements");
                manuscriptEndorsementsPage.fillManuscriptEndorsementPagePW(data);

                goToPage("Subjectivities");
                subjectivitiesPage.fillSubjectivitiesPagePW(data);
            }
        }

    }

    public void createEndorsementPW(Map<String, String> data) {
        //TODO IMPLEMENT METHOD PW
    }

    public void createOOSEndorsementPW(Map<String, String> data) {
        //TODO IMPLEMENT METHOD PW
    }

    public void createRenewalPW(Map<String, String> data) {
        //TODO IMPLEMENT METHOD PW
    }

    //EXCESS SURPLUS
    public void createQuoteES(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageES(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageES(data);
        new OperatorInformationPage(driver).fillOperatorInformationPageES(data);
        new AdditionalInsuredPage(driver).fillAdditionalInsuredPageES(data);
        new PropertyInformationPage(driver).fillPropertyInformationPageES(data);
        new VehiclesAndWatercraftPage(driver).fillVehicleAndWatercraftPageES(data);
        new MemberInformationPage(driver).fillMemberInformationPageES(data);
        new SelectCoveragesPage(driver).fillSelectCoveragesPage(data);
        new CoverageInformationPage(driver).fillOutCoverageInformationPage(data);
        new ApplicationPage(driver).fillApplicationPageES(data);
    }

    public void createEndorsementES(Map<String, String> data) throws Throwable {
        //TODO IMPLEMENT METHOD ES
    }

    public void createOOSEndorsementES(Map<String, String> data) throws Throwable {
        //TODO IMPLEMENT METHOD ES
    }

    public void createRenewalES(Map<String, String> data) throws Throwable {
        //TODO IMPLEMENT METHOD ES
    }

    //HOME COURSE OF CONSTRUCTION
    public void createQuoteCC(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageCC(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageCC(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageCC(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageCC(data);
        new GeneralContractorPage(driver).fillGeneralContractorPageCC(data);
        new ElevationCertificatePage(driver).fillElevationCertificatePageCC(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageCC(data);
        new WildfirePage(driver).fillWildfireDetailsPageCC(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageCC(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageCC(data);
        new MemberInformationPage(driver).fillMemberInformationPageCC(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageCC(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageCC(data);
        new MandatoryFormsPage(driver).fillMandatoryFormsPageCC(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPageCC(data);
        saveChanges();
    }

    public void createEndorsementCC(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageCC_END(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageCC_END(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageCC_END(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageCC_END(data);
        new GeneralContractorPage(driver).fillGeneralContractorPageCC_END(data);
        new ElevationCertificatePage(driver).fillElevationCertificatePageCC_END(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageCC_END(data);
        new WildfirePage(driver).fillWildfireDetailsPageCC_END(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageCC_END(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageCC_END(data);
        new MemberInformationPage(driver).fillMemberInformationPageCC_END(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageCC_END(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageCC_END(data);
        new MandatoryFormsPage(driver).fillMandatoryFormsPageCC_END(data);
        new PolicyBillDeliveryPage(driver).fillPolicyBillDeliveryPageCC_END(data);
        saveChanges();
    }

    public void createOOSEndorsementCC(Map<String, String> data) {
        //TODO CC
    }

    public void createPolicyExtension(Map<String, String> data) throws Throwable {
        new PolicyPage(driver).fillPolicyPageCC_EXT(data);
        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageCC_EXT(data);
        new LocationCoveragePage(driver).fillBasicLocationCoverageDetailsPageCC_EXT(data);
        new OptionalCoveragesPage(driver).fillOptionalCoveragesPageCC_EXT(data);
        new GeneralContractorPage(driver).fillGeneralContractorPageCC_EXT(data);
        new ElevationCertificatePage(driver).fillElevationCertificatePageCC_EXT(data);
        new EarthquakePage(driver).fillEarthquakeDetailsPageCC_EXT(data);
        new WildfirePage(driver).fillWildfireDetailsPageCC_EXT(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageCC_EXT(data);
        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageCC_EXT(data);
        new MemberInformationPage(driver).fillMemberInformationPageCC_EXT(data);
        new RiskModelInformationPage(driver).fillRiskModelInformationPageCC_EXT(data);
        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageCC_EXT(data);
        new MandatoryFormsPage(driver).fillMandatoryFormsPageCC_EXT(data);
        new SubjectivitiesPage(driver).fillSubjectivitiesPageCC_EXT(data);
        saveChanges();
    }

    //FLOOD SURPLUS
    public void createQuotePF(Map<String, String> data) throws Throwable {
        DataManager.getInstance().getData().put("QUOTE_ID", getCurrentObjectId());
        navigateToQuoteDetailsPage();
        iExpandNodeTreeIfNeeded();
        new PolicyPage(driver).fillPolicyPageFS(data);
//        new TrustLlcOtherLegalEntityPage(driver).fillTrustLlcOtherLegalEntityPageFS(data);
//        new LocationCoveragePage(driver).fillLocationCoveragePageFS(data);
//        new ElevationCertificatePage(driver).fillElevationCertificateDetailsPageFS(data);
        new PreviousClaimLossesPage(driver).fillOutPreviousLossesCoveragesPageFS(data);
//        new AdditionalInterestsPage(driver).fillOutAdditionalInterestsPageFS(data);
        new MemberInformationPage(driver).fillMemberInformationPageFS(data);
//        new ManuscriptEndorsementsPage(driver).fillManuscriptEndorsementPageFS(data);
        new MandatoryFormsPage(driver).fillMandatoryFormsPageFS(data);
//        new SubjectivitiesPage(driver).fillSubjectivitiesPageFS(data);
//        saveChanges();
    }

    public void createEndorsementFS(Map<String, String> data) throws Throwable {
        //TODO
    }

    public void createOOSEndorsementFS(Map<String, String> data) throws Throwable {
        //TODO
    }

    public void createRenewalFS(Map<String, String> data) throws Throwable {
        //TODO
    }
}