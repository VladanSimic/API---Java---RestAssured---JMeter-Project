Feature: Collections regression

  @Collections @Regression @NewBusiness
  Scenario Outline: Collections new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P1   |
      | AR_001 | P2   |
      | AZ_001 | P3   |
      | CO_001 | P4   |
      | DC_001 | P5   |
      | IA_001 | P6   |
      | IL_001 | P7   |
      | IN_001 | P8   |
      | KS_001 | P9   |
      | KY_001 | P10  |
      | MN_001 | P11  |
      | MO_001 | P12  |
      | MT_001 | P13  |
      | ND_001 | P14  |
      | NE_001 | P15  |
      | NH_001 | P16  |
      | NM_001 | P17  |
      | NV_001 | P18  |
      | OH_001 | P19  |
      | OK_001 | P20  |
      | OR_001 | P21  |
      | PA_001 | P22  |
      | RI_001 | P23  |
      | SD_001 | P24  |
      | TN_001 | P25  |
      | UT_001 | P26  |
      | VT_001 | P27  |
      | WA_001 | P28  |
      | WI_001 | P29  |
      | WV_001 | P30  |
      | WY_001 | P31  |
      | AL_001 | P32  |
      | CA_001 | P33  |
      | CT_001 | P34  |
      | DE_001 | P35  |
      | HI_001 | P36  |
      | LA_001 | P37  |
      | MA_001 | P38  |
      | MD_001 | P39  |
      | ME_001 | P40  |
      | MS_001 | P41  |
      | NC_001 | P42  |
      | NJ_001 | P43  |
      | NY_001 | P44  |
      | SC_001 | P45  |
      | VA_001 | P46  |
      | FL_001 | P47  |
      | TX_001 | P48  |
      | GA_001 | P49  |
      | MI_001 | P50  |
      | ID_001 | P26  |

  @Collections @GeneralRegression @Jenkins
  Scenario Outline: Collections New Business + Endorsement + RN - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorCO" sheet
    * I load random user data
    * I set Effective Date to Today
    * I set "Add_Worldwide_Jewelry" to "No"
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I set "Add_Worldwide_Jewelry" to "Yes"
    * I set "Collections_Schedule_Collection_Items" to "Item_001,Item_002,"
    And I navigate to Coverage by Class and add worldwide jewelry class
    Then I fill out CO quote coverage schedule page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "not equal" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    Then I fill KY Tax Report with dummy data for "CO" LOB
    * I click save changes button
    * I think for 5 to 10 seconds
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | TC_ID  | user |
      | AK_001 | P1   |
      | AR_001 | P2   |
      | AZ_001 | P3   |
      | CO_001 | P4   |
      | DC_001 | P5   |
      | IA_001 | P6   |
      | IL_001 | P7   |
      | IN_001 | P8   |
      | KS_001 | P9   |
      | KY_001 | P10  |
      | MN_001 | P11  |
      | MO_001 | P12  |
      | MT_001 | P13  |
      | ND_001 | P14  |
      | NE_001 | P15  |
      | NH_001 | P16  |
      | NM_001 | P17  |
      | NV_001 | P18  |
      | OH_001 | P19  |
      | OK_001 | P20  |
      | OR_001 | P21  |
      | PA_001 | P22  |
      | RI_001 | P23  |
      | SD_001 | P24  |
      | TN_001 | P25  |
      | UT_001 | P26  |
      | VT_001 | P27  |
      | WA_001 | P28  |
      | WI_001 | P29  |
      | WV_001 | P30  |
      | WY_001 | P31  |
      | AL_001 | P32  |
      | CA_001 | P33  |
      | CT_001 | P34  |
      | DE_001 | P35  |
      | HI_001 | P36  |
      | LA_001 | P37  |
      | MA_001 | P38  |
      | MD_001 | P39  |
      | ME_001 | P40  |
      | MS_001 | P41  |
      | NC_001 | P42  |
      | NJ_001 | P43  |
      | NY_001 | P44  |
      | SC_001 | P45  |
      | VA_001 | P46  |
      | FL_001 | P47  |
      | TX_001 | P48  |
      | GA_001 | P49  |
      | MI_001 | P50  |
      | ID_001 | P26  |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Collections new business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I get customer account ID

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

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

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Collections New Business + NB Endorsement + RN - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I get customer account ID

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    And I think for 80 to 85 seconds
    * I check premiums if they are equal for "New Business" and "Endorsement"

    Then I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

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