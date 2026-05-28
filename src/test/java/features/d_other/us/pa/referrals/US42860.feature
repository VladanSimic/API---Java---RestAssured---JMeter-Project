@PersonalAuto @US42860
Feature: US42860 - Carfax - Amend UW Referral Logic for vehicle Value lower than Original Agreed Value

  As an Underwriting Manager, I would want certain underwriting referrals logic
  to be amended for all states when Agreed Value is lower than Original Agreed value.

  @NewBusiness @Endorsement @Renewal @OOS
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42860" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"
    * I accept underwriting referrals
    * I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"
    * I accept underwriting referrals
    Then I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @PAR18 @PrivatePassenger
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId |
      | PAR18  | Field         | triggered | can be approved | AK_001         |
      | PAR18  | Field         | triggered | can be approved | AR_001         |
      | PAR18  | Field         | triggered | can be approved | AZ_001         |
      | PAR18  | Field         | triggered | can be approved | CO_001         |
      | PAR18  | Field         | triggered | can be approved | DC_001         |
      | PAR18  | Field         | triggered | can be approved | IA_001         |
      | PAR18  | Field         | triggered | can be approved | IL_001         |
      | PAR18  | Field         | triggered | can be approved | IN_001         |
      | PAR18  | Field         | triggered | can be approved | KS_001         |
      | PAR18  | Field         | triggered | can be approved | KY_001         |
      | PAR18  | Field         | triggered | can be approved | MN_001         |
      | PAR18  | Field         | triggered | can be approved | MO_001         |
      | PAR18  | Field         | triggered | can be approved | MT_001         |
      | PAR18  | Field         | triggered | can be approved | ND_001         |
      | PAR18  | Field         | triggered | can be approved | NE_001         |
      | PAR18  | Field         | triggered | can be approved | NH_001         |
      | PAR18  | Field         | triggered | can be approved | NM_001         |
      | PAR18  | Field         | triggered | can be approved | NV_001         |
      | PAR18  | Field         | triggered | can be approved | OH_001         |
      | PAR18  | Field         | triggered | can be approved | OK_001         |
      | PAR18  | Field         | triggered | can be approved | OR_001         |
      | PAR18  | Field         | triggered | can be approved | PA_001         |
      | PAR18  | Field         | triggered | can be approved | RI_001         |
      | PAR18  | Field         | triggered | can be approved | SD_001         |
      | PAR18  | Field         | triggered | can be approved | TN_001         |
      | PAR18  | Field         | triggered | can be approved | UT_001         |
      | PAR18  | Field         | triggered | can be approved | VT_001         |
      | PAR18  | Field         | triggered | can be approved | WA_001         |
      | PAR18  | Field         | triggered | can be approved | WI_001         |
      | PAR18  | Field         | triggered | can be approved | WV_001         |
      | PAR18  | Field         | triggered | can be approved | WY_001         |
      | PAR18  | Field         | triggered | can be approved | AL_001         |
      | PAR18  | Field         | triggered | can be approved | CA_001         |
      | PAR18  | Field         | triggered | can be approved | CT_001         |
      | PAR18  | Field         | triggered | can be approved | DE_001         |
      | PAR18  | Field         | triggered | can be approved | HI_001         |
      | PAR18  | Field         | triggered | can be approved | LA_001         |
      | PAR18  | Field         | triggered | can be approved | MA_001         |
      | PAR18  | Field         | triggered | can be approved | MD_001         |
      | PAR18  | Field         | triggered | can be approved | ME_001         |
      | PAR18  | Field         | triggered | can be approved | MS_001         |
      | PAR18  | Field         | triggered | can be approved | NC_001         |
      | PAR18  | Field         | triggered | can be approved | NJ_001         |
      | PAR18  | Field         | triggered | can be approved | NY_001         |
      | PAR18  | Field         | triggered | can be approved | SC_001         |
      | PAR18  | Field         | triggered | can be approved | VA_001         |
      | PAR18  | Field         | triggered | can be approved | FL_001         |
      | PAR18  | Field         | triggered | can be approved | TX_001         |
      | PAR18  | Field         | triggered | can be approved | GA_001         |
      | PAR18  | Field         | triggered | can be approved | MI_001         |
      | PAR18  | Field         | triggered | can be approved | ID_001         |

    @PAR18 @ClassicCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId |
      | PAR18  | Field         | triggered | can be approved | AK_002         |
      | PAR18  | Field         | triggered | can be approved | AR_002         |
      | PAR18  | Field         | triggered | can be approved | AZ_002         |
      | PAR18  | Field         | triggered | can be approved | CO_002         |
      | PAR18  | Field         | triggered | can be approved | DC_002         |
      | PAR18  | Field         | triggered | can be approved | IA_002         |
      | PAR18  | Field         | triggered | can be approved | IL_002         |
      | PAR18  | Field         | triggered | can be approved | IN_002         |
      | PAR18  | Field         | triggered | can be approved | KS_002         |
      | PAR18  | Field         | triggered | can be approved | KY_002         |
      | PAR18  | Field         | triggered | can be approved | MN_002         |
      | PAR18  | Field         | triggered | can be approved | MO_002         |
      | PAR18  | Field         | triggered | can be approved | MT_002         |
      | PAR18  | Field         | triggered | can be approved | ND_002         |
      | PAR18  | Field         | triggered | can be approved | NE_002         |
      | PAR18  | Field         | triggered | can be approved | NH_002         |
      | PAR18  | Field         | triggered | can be approved | NM_002         |
      | PAR18  | Field         | triggered | can be approved | NV_002         |
      | PAR18  | Field         | triggered | can be approved | OH_002         |
      | PAR18  | Field         | triggered | can be approved | OK_002         |
      | PAR18  | Field         | triggered | can be approved | OR_002         |
      | PAR18  | Field         | triggered | can be approved | PA_002         |
      | PAR18  | Field         | triggered | can be approved | RI_002         |
      | PAR18  | Field         | triggered | can be approved | SD_002         |
      | PAR18  | Field         | triggered | can be approved | TN_002         |
      | PAR18  | Field         | triggered | can be approved | UT_002         |
      | PAR18  | Field         | triggered | can be approved | VT_002         |
      | PAR18  | Field         | triggered | can be approved | WA_002         |
      | PAR18  | Field         | triggered | can be approved | WI_002         |
      | PAR18  | Field         | triggered | can be approved | WV_002         |
      | PAR18  | Field         | triggered | can be approved | WY_002         |
      | PAR18  | Field         | triggered | can be approved | AL_002         |
      | PAR18  | Field         | triggered | can be approved | CA_002         |
      | PAR18  | Field         | triggered | can be approved | CT_002         |
      | PAR18  | Field         | triggered | can be approved | DE_002         |
      | PAR18  | Field         | triggered | can be approved | HI_002         |
      | PAR18  | Field         | triggered | can be approved | LA_002         |
      | PAR18  | Field         | triggered | can be approved | MA_002         |
      | PAR18  | Field         | triggered | can be approved | MD_002         |
      | PAR18  | Field         | triggered | can be approved | ME_002         |
      | PAR18  | Field         | triggered | can be approved | MS_002         |
      | PAR18  | Field         | triggered | can be approved | NC_002         |
      | PAR18  | Field         | triggered | can be approved | NJ_002         |
      | PAR18  | Field         | triggered | can be approved | NY_002         |
      | PAR18  | Field         | triggered | can be approved | SC_002         |
      | PAR18  | Field         | triggered | can be approved | VA_002         |
      | PAR18  | Field         | triggered | can be approved | FL_002         |
      | PAR18  | Field         | triggered | can be approved | TX_002         |
      | PAR18  | Field         | triggered | can be approved | GA_002         |
      | PAR18  | Field         | triggered | can be approved | MI_002         |
      | PAR18  | Field         | triggered | can be approved | ID_002         |

    @PAR18 @AntiqueCollectorsCa
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId |
      | PAR18  | Field         | triggered | can be approved | AK_003         |
      | PAR18  | Field         | triggered | can be approved | AR_003         |
      | PAR18  | Field         | triggered | can be approved | AZ_003         |
      | PAR18  | Field         | triggered | can be approved | CO_003         |
      | PAR18  | Field         | triggered | can be approved | DC_003         |
      | PAR18  | Field         | triggered | can be approved | IA_003         |
      | PAR18  | Field         | triggered | can be approved | IL_003         |
      | PAR18  | Field         | triggered | can be approved | IN_003         |
      | PAR18  | Field         | triggered | can be approved | KS_003         |
      | PAR18  | Field         | triggered | can be approved | KY_003         |
      | PAR18  | Field         | triggered | can be approved | MN_003         |
      | PAR18  | Field         | triggered | can be approved | MO_003         |
      | PAR18  | Field         | triggered | can be approved | MT_003         |
      | PAR18  | Field         | triggered | can be approved | ND_003         |
      | PAR18  | Field         | triggered | can be approved | NE_003         |
      | PAR18  | Field         | triggered | can be approved | NH_003         |
      | PAR18  | Field         | triggered | can be approved | NM_003         |
      | PAR18  | Field         | triggered | can be approved | NV_003         |
      | PAR18  | Field         | triggered | can be approved | OH_003         |
      | PAR18  | Field         | triggered | can be approved | OK_003         |
      | PAR18  | Field         | triggered | can be approved | OR_003         |
      | PAR18  | Field         | triggered | can be approved | PA_003         |
      | PAR18  | Field         | triggered | can be approved | RI_003         |
      | PAR18  | Field         | triggered | can be approved | SD_003         |
      | PAR18  | Field         | triggered | can be approved | TN_003         |
      | PAR18  | Field         | triggered | can be approved | UT_003         |
      | PAR18  | Field         | triggered | can be approved | VT_003         |
      | PAR18  | Field         | triggered | can be approved | WA_003         |
      | PAR18  | Field         | triggered | can be approved | WI_003         |
      | PAR18  | Field         | triggered | can be approved | WV_003         |
      | PAR18  | Field         | triggered | can be approved | WY_003         |
      | PAR18  | Field         | triggered | can be approved | AL_003         |
      | PAR18  | Field         | triggered | can be approved | CA_003         |
      | PAR18  | Field         | triggered | can be approved | CT_003         |
      | PAR18  | Field         | triggered | can be approved | DE_003         |
      | PAR18  | Field         | triggered | can be approved | HI_003         |
      | PAR18  | Field         | triggered | can be approved | LA_003         |
      | PAR18  | Field         | triggered | can be approved | MA_003         |
      | PAR18  | Field         | triggered | can be approved | MD_003         |
      | PAR18  | Field         | triggered | can be approved | ME_003         |
      | PAR18  | Field         | triggered | can be approved | MS_003         |
      | PAR18  | Field         | triggered | can be approved | NC_003         |
      | PAR18  | Field         | triggered | can be approved | NJ_003         |
      | PAR18  | Field         | triggered | can be approved | NY_003         |
      | PAR18  | Field         | triggered | can be approved | SC_003         |
      | PAR18  | Field         | triggered | can be approved | VA_003         |
      | PAR18  | Field         | triggered | can be approved | FL_003         |
      | PAR18  | Field         | triggered | can be approved | TX_003         |
      | PAR18  | Field         | triggered | can be approved | GA_003         |
      | PAR18  | Field         | triggered | can be approved | MI_003         |
      | PAR18  | Field         | triggered | can be approved | ID_003         |

    @PAR18 @ExoticCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId |
      | PAR18  | Field         | triggered | can be approved | AK_004         |
      | PAR18  | Field         | triggered | can be approved | AR_004         |
      | PAR18  | Field         | triggered | can be approved | AZ_004         |
      | PAR18  | Field         | triggered | can be approved | CO_004         |
      | PAR18  | Field         | triggered | can be approved | DC_004         |
      | PAR18  | Field         | triggered | can be approved | IA_004         |
      | PAR18  | Field         | triggered | can be approved | IL_004         |
      | PAR18  | Field         | triggered | can be approved | IN_004         |
      | PAR18  | Field         | triggered | can be approved | KS_004         |
      | PAR18  | Field         | triggered | can be approved | KY_004         |
      | PAR18  | Field         | triggered | can be approved | MN_004         |
      | PAR18  | Field         | triggered | can be approved | MO_004         |
      | PAR18  | Field         | triggered | can be approved | MT_004         |
      | PAR18  | Field         | triggered | can be approved | ND_004         |
      | PAR18  | Field         | triggered | can be approved | NE_004         |
      | PAR18  | Field         | triggered | can be approved | NH_004         |
      | PAR18  | Field         | triggered | can be approved | NM_004         |
      | PAR18  | Field         | triggered | can be approved | NV_004         |
      | PAR18  | Field         | triggered | can be approved | OH_004         |
      | PAR18  | Field         | triggered | can be approved | OK_004         |
      | PAR18  | Field         | triggered | can be approved | OR_004         |
      | PAR18  | Field         | triggered | can be approved | PA_004         |
      | PAR18  | Field         | triggered | can be approved | RI_004         |
      | PAR18  | Field         | triggered | can be approved | SD_004         |
      | PAR18  | Field         | triggered | can be approved | TN_004         |
      | PAR18  | Field         | triggered | can be approved | UT_004         |
      | PAR18  | Field         | triggered | can be approved | VT_004         |
      | PAR18  | Field         | triggered | can be approved | WA_004         |
      | PAR18  | Field         | triggered | can be approved | WI_004         |
      | PAR18  | Field         | triggered | can be approved | WV_004         |
      | PAR18  | Field         | triggered | can be approved | WY_004         |
      | PAR18  | Field         | triggered | can be approved | AL_004         |
      | PAR18  | Field         | triggered | can be approved | CA_004         |
      | PAR18  | Field         | triggered | can be approved | CT_004         |
      | PAR18  | Field         | triggered | can be approved | DE_004         |
      | PAR18  | Field         | triggered | can be approved | HI_004         |
      | PAR18  | Field         | triggered | can be approved | LA_004         |
      | PAR18  | Field         | triggered | can be approved | MA_004         |
      | PAR18  | Field         | triggered | can be approved | MD_004         |
      | PAR18  | Field         | triggered | can be approved | ME_004         |
      | PAR18  | Field         | triggered | can be approved | MS_004         |
      | PAR18  | Field         | triggered | can be approved | NJ_004         |
      | PAR18  | Field         | triggered | can be approved | NY_004         |
      | PAR18  | Field         | triggered | can be approved | SC_004         |
      | PAR18  | Field         | triggered | can be approved | VA_004         |
      | PAR18  | Field         | triggered | can be approved | FL_004         |
      | PAR18  | Field         | triggered | can be approved | TX_004         |
      | PAR18  | Field         | triggered | can be approved | GA_004         |
      | PAR18  | Field         | triggered | can be approved | MI_004         |
      | PAR18  | Field         | triggered | can be approved | ID_004         |
