@CourseOfConstruction @DE36533
Feature: [PROD SUPPORT] COC - Debug Error When Clicking 'Order Property Details' (Endorsement and Extensions)

  @DE36533 @CC
  Scenario Outline: TC_01 "<TC_ID>"| Programs - COC - Verify 'Order Property Details' is not triggering Debug Error when clicked (All States) NB/END

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I navigate to Location Details Page
    * I click order property details button
    * I think for 30 to 35 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI
    Then I set the protection class to ""
    * I take screenshot

    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    * I initiate new endorsement
    Then I navigate to Location Details Page
    * I click order property details button
    * I think for 40 to 45 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI
    Then I set the protection class to ""
    * I take screenshot


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

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user |
      | FL_001 | P96  |
      | TX_001 | P97  |

  @DE36533 @CC
  Scenario Outline: TC_02 "<TC_ID>"| Programs - COC - Verify 'Order Property Details' is not triggering Debug Error when clicked (All States) NB/PE

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I navigate to Location Details Page
    * I click order property details button
    * I think for 30 to 35 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI
    Then I set the protection class to ""

    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    When I initiate a policy extension
    Then I navigate to Location Details Page
    * I think for 15 to 20 seconds
    * I click order property details button
    * I think for 40 to 45 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI
    Then I set the protection class to ""
    * I take screenshot

#

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

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user |
      | FL_001 | P96  |
      | TX_001 | P97  |

  @DE36533
  Scenario Outline: TC_03 "<TC_ID>"| Programs - COC - Verify 'Order Property Details' is not triggering Debug Error when clicked (All States) NB RWT

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

       #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |
    Then I navigate to Location Details Page
    * I click order property details button
    * I think for 15 to 20 seconds
    * I verify if element with message "Debug Error Page" is "Not Displayed" on the UI

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