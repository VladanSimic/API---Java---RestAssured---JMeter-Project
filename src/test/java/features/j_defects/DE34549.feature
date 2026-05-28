@DE34549 @DEFECT
Feature: [PROD SUPPORT] FW: PA1893244 - Premium Correction amount wrong on original trx

  One BV that is used in Personal AUTO - California
  LOB rating was not initialized in the renewal workflow,
  and that caused issue.

  @NewBusiness @Renewal @Endorsement
  Scenario Outline: Compare Renewal and Endorsement premiums for - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorPA" sheet
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2026"
    * I set "Vehicle_Details_VIN_Number_1" to "WDDSJ4GB9GN365476"
    * I set "Vehicle_Details_Year_1" to "2016"
    * I set "Vehicle_Details_Make_1" to "Mercedes Benz"
    * I set "Vehicle_Details_Model_1" to "CLA250"
    * I set "Vehicle_Details_Estimated_Annual_Mileage_1" to "30,000"
    * I set "Vehicle_Details_Mileage_Band_Year_1" to "20,001+"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "$ 30,000.00"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal nd
    * I auto process a renewal

    * I navigate to policy bread crumb

    When I initiate new endorsement
    * I add changes on "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Then I verify "Renewal" and "Endorsement" total after values match

    @PrivatePassenger
    Examples:
      | TC_ID  |
      | AK_001 |
      | AR_001 |
      | AZ_001 |
      | CO_001 |
      | DC_001 |
      | IA_001 |
      | IL_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MN_001 |
      | MO_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | NM_001 |
      | NV_001 |
      | OH_001 |
      | OK_001 |
      | OR_001 |
      | PA_001 |
      | RI_001 |
      | SD_001 |
      | TN_001 |
      | UT_001 |
      | VT_001 |
      | WA_001 |
      | WI_001 |
      | WV_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MD_001 |
      | ME_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | VA_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |
      | MI_001 |
      | ID_001 |