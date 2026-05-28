@US50622 @Iteration5 @MarchPostPROD
Feature:When a PURE Programs Course of Construction premium is displayed, I want to see "Total Premium" displayed on the premium summary page,
          so that the word "annualized" is removed.
          These policies are not written on an annual basis necessarily, so the verbiage should reflect this.

  @US50622 @CC
  Scenario Outline: "<TC_ID>" Programs - CC - Premium Summary UI Update

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "P1"
    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "CC" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * The text "Total Premium" should be on the UI
    * I verify if element with message "Total Annualized Premium" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to premium summary page
    * I think for 10 to 15 seconds
    * The text "Total Premium" should be on the UI
    * I verify if element with message "Total Annualized Premium" is "Not Displayed" on the UI

    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate a quote
    * The text "Total Premium" should be on the UI
    * I verify if element with message "Total Annualized Premium" is "Not Displayed" on the UI

    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement
#
#    When I initiate a policy extension
#    * I add changes on policy extension
#    * I review changes
#    * I click renewed premium
#    * The text "Total Premium" should be on the UI
#    * I verify if element with message "Total Annualized Premium" is "Not Displayed" on the UI

    Examples:
      | TC_ID  | user |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KY_001 | P84  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
      | OK_001 | P94  |
      | OR_001 | P95  |
      | PA_001 | P96  |
      | RI_001 | P97  |
      | TN_001 | P99  |
      | VT_001 | P77  |
      | WA_001 | P78  |
      | WI_001 | P79  |
      | WV_001 | P80  |
      | CA_001 | P82  |
      | CT_001 | P83  |
      | DE_001 | P84  |
      | LA_001 | P86  |
      | MA_001 | P87  |
      | MD_001 | P88  |
      | MS_001 | P90  |
      | NC_001 | P91  |
      | NJ_001 | P92  |
      | NY_001 | P93  |
      | SC_001 | P94  |
      | VA_001 | P95  |
      | FL_001 | P96  |
      | TX_001 | P97  |
      | GA_001 | P98  |
      | MI_001 | P99  |
      | ID_001 | P76  |
      | HI_001 | P85  |
      | WY_001 | P81  |
      | UT_001 | P76  |
      | SD_001 | P98  |
      | KS_001 | P83  |
      | MN_001 | P85  |
      | CO_001 | P79  |
      | AL_001 | P82  |
      | ME_001 | P83  |