Feature: Excess liability regression

  @ExcessLiability @Regression @NewBusiness
  Scenario Outline: Excess liability new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P26  |
      | AR_001 | P27  |
      | AZ_001 | P28  |
      | CO_001 | P29  |
      | DC_001 | P30  |
      | IA_001 | P31  |
      | IL_001 | P32  |
      | IN_001 | P33  |
      | KS_001 | P34  |
      | KY_001 | P35  |
      | MN_001 | P36  |
      | MO_001 | P37  |
      | MT_001 | P38  |
      | ND_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |
      | NV_001 | P43  |
      | OH_001 | P44  |
      | OK_001 | P45  |
      | OR_001 | P46  |
      | PA_001 | P47  |
      | RI_001 | P48  |
      | SD_001 | P49  |
      | TN_001 | P50  |
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

  @ExcessLiability @Regression @Endorsement
  Scenario Outline: Excess liability endorsement - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I have created a new "EX" NB policy
    * I issue an endorsement for "EX" policy

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

  @ExcessLiability @GeneralRegression @Jenkins
  Scenario Outline: Excess liability New Business + Endorsement + RN - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I navigate to Excess Policy Page
    And I expand node tree if needed

    Then I navigate to Property Information page
    And I add new location on property information page
      | AddressLine1 | City | State | ZipCode | SwimmingPool | Usage     | DwellingType  |
      | Copy         | Copy | Copy  | Copy    | Yes          | Primary   | Multi-Family  |
      | Copy         | Copy | Copy  | Copy    | No           | Secondary | Single Family |

    Then I navigate to Watercraft Information Page
    And I add watercraft on watercraft information page
      | Make    | Model        | HullValue | Length | HorsePower | MaxDesignSpeed |
      | Triton  | 21XP Patriot | 84499     | 28     | 300        | < 65 mph       |
      | Porsche | Boat         | 139450    | 25     | 219        | >= 65 mph      |

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "not equal" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    Then I fill KY Tax Report with dummy data for "EX" LOB
    * I click save changes button
    * I think for 5 to 10 seconds
    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | TC_ID  | user |
      | AK_001 | P26  |
      | AR_001 | P27  |
      | AZ_001 | P28  |
      | CO_001 | P29  |
      | DC_001 | P30  |
      | IA_001 | P31  |
      | IL_001 | P32  |
      | IN_001 | P33  |
      | KS_001 | P34  |
      | KY_001 | P35  |
      | MN_001 | P36  |
      | MO_001 | P37  |
      | MT_001 | P38  |
      | ND_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |
      | NV_001 | P43  |
      | OH_001 | P44  |
      | OK_001 | P45  |
      | OR_001 | P46  |
      | PA_001 | P47  |
      | RI_001 | P48  |
      | SD_001 | P49  |
      | TN_001 | P50  |
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
  Scenario Outline: Excess liability new business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  |
      | FL_001 |
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
      | TX_001 |
      | GA_001 |
      | MI_001 |
      | ID_001 |
