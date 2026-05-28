@PersonalAuto @US42508
Feature: US42508 - Carfax - Remove UW Agreed Value Referrals %

  As an Underwriting Manager, I do not want certain underwriting referrals
  to be triggered for specific Agreed vs Market Value% for Personal Auto quotes,
  since other referrals already exist to identify high-value vehicles.

  @NewBusiness @NewBusinessRewrite
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42508" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I visit vehicle detail page on NB and change agreed value to "1000"
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"
    * I accept underwriting referrals

    Then I bind a quote
    And I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @PAR12 @PrivatePassenger
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR12  | Field         | not triggered | can not be approved | AR_001         |
      | PAR12  | Field         | not triggered | can not be approved | AZ_001         |
      | PAR12  | Field         | not triggered | can not be approved | DC_001         |
      | PAR12  | Field         | not triggered | can not be approved | IA_001         |
      | PAR12  | Field         | not triggered | can not be approved | IL_001         |
      | PAR12  | Field         | not triggered | can not be approved | IN_001         |
      | PAR12  | Field         | not triggered | can not be approved | MO_001         |
      | PAR12  | Field         | not triggered | can not be approved | MT_001         |
      | PAR12  | Field         | not triggered | can not be approved | OH_001         |
      | PAR12  | Field         | not triggered | can not be approved | OK_001         |
      | PAR12  | Field         | not triggered | can not be approved | OR_001         |
      | PAR12  | Field         | not triggered | can not be approved | PA_001         |
      | PAR12  | Field         | not triggered | can not be approved | RI_001         |
      | PAR12  | Field         | not triggered | can not be approved | WI_001         |
      | PAR12  | Field         | not triggered | can not be approved | WY_001         |
      | PAR12  | Field         | not triggered | can not be approved | AL_001         |
      | PAR12  | Field         | not triggered | can not be approved | CT_001         |
      | PAR12  | Field         | not triggered | can not be approved | DE_001         |
      | PAR12  | Field         | not triggered | can not be approved | LA_001         |
      | PAR12  | Field         | not triggered | can not be approved | MD_001         |
      | PAR12  | Field         | not triggered | can not be approved | MS_001         |
      | PAR12  | Field         | not triggered | can not be approved | NC_001         |
      | PAR12  | Field         | not triggered | can not be approved | NJ_001         |
      | PAR12  | Field         | not triggered | can not be approved | NY_001         |
      | PAR12  | Field         | not triggered | can not be approved | SC_001         |
      | PAR12  | Field         | not triggered | can not be approved | FL_001         |
      | PAR12  | Field         | not triggered | can not be approved | TX_001         |
      | PAR12  | Field         | not triggered | can not be approved | GA_001         |
      | PAR12  | Field         | not triggered | can not be approved | MI_001         |
      | PAR12  | Field         | not triggered | can not be approved | ID_001         |

    @PAR12 @ClassicCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR12  | Field         | not triggered | can not be approved | AR_002         |
      | PAR12  | Field         | not triggered | can not be approved | AZ_002         |
      | PAR12  | Field         | not triggered | can not be approved | DC_002         |
      | PAR12  | Field         | not triggered | can not be approved | IA_002         |
      | PAR12  | Field         | not triggered | can not be approved | IL_002         |
      | PAR12  | Field         | not triggered | can not be approved | IN_002         |
      | PAR12  | Field         | not triggered | can not be approved | MO_002         |
      | PAR12  | Field         | not triggered | can not be approved | MT_002         |
      | PAR12  | Field         | not triggered | can not be approved | OH_002         |
      | PAR12  | Field         | not triggered | can not be approved | OK_002         |
      | PAR12  | Field         | not triggered | can not be approved | OR_002         |
      | PAR12  | Field         | not triggered | can not be approved | PA_002         |
      | PAR12  | Field         | not triggered | can not be approved | RI_002         |
      | PAR12  | Field         | not triggered | can not be approved | WI_002         |
      | PAR12  | Field         | not triggered | can not be approved | WY_002         |
      | PAR12  | Field         | not triggered | can not be approved | AL_002         |
      | PAR12  | Field         | not triggered | can not be approved | CT_002         |
      | PAR12  | Field         | not triggered | can not be approved | DE_002         |
      | PAR12  | Field         | not triggered | can not be approved | LA_002         |
      | PAR12  | Field         | not triggered | can not be approved | MD_002         |
      | PAR12  | Field         | not triggered | can not be approved | MS_002         |
      | PAR12  | Field         | not triggered | can not be approved | NC_002         |
      | PAR12  | Field         | not triggered | can not be approved | NJ_002         |
      | PAR12  | Field         | not triggered | can not be approved | NY_002         |
      | PAR12  | Field         | not triggered | can not be approved | SC_002         |
      | PAR12  | Field         | not triggered | can not be approved | FL_002         |
      | PAR12  | Field         | not triggered | can not be approved | TX_002         |
      | PAR12  | Field         | not triggered | can not be approved | GA_002         |
      | PAR12  | Field         | not triggered | can not be approved | MI_002         |
      | PAR12  | Field         | not triggered | can not be approved | ID_002         |


    @PAR12 @AntiqueCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR12  | Field         | not triggered | can not be approved | AR_003         |
      | PAR12  | Field         | not triggered | can not be approved | AZ_003         |
      | PAR12  | Field         | not triggered | can not be approved | DC_003         |
      | PAR12  | Field         | not triggered | can not be approved | IA_003         |
      | PAR12  | Field         | not triggered | can not be approved | IL_003         |
      | PAR12  | Field         | not triggered | can not be approved | IN_003         |
      | PAR12  | Field         | not triggered | can not be approved | MO_003         |
      | PAR12  | Field         | not triggered | can not be approved | MT_003         |
      | PAR12  | Field         | not triggered | can not be approved | OH_003         |
      | PAR12  | Field         | not triggered | can not be approved | OK_003         |
      | PAR12  | Field         | not triggered | can not be approved | OR_003         |
      | PAR12  | Field         | not triggered | can not be approved | PA_003         |
      | PAR12  | Field         | not triggered | can not be approved | RI_003         |
      | PAR12  | Field         | not triggered | can not be approved | WI_003         |
      | PAR12  | Field         | not triggered | can not be approved | WY_003         |
      | PAR12  | Field         | not triggered | can not be approved | AL_003         |
      | PAR12  | Field         | not triggered | can not be approved | CT_003         |
      | PAR12  | Field         | not triggered | can not be approved | DE_003         |
      | PAR12  | Field         | not triggered | can not be approved | LA_003         |
      | PAR12  | Field         | not triggered | can not be approved | MD_003         |
      | PAR12  | Field         | not triggered | can not be approved | MS_003         |
      | PAR12  | Field         | not triggered | can not be approved | NC_003         |
      | PAR12  | Field         | not triggered | can not be approved | NJ_003         |
      | PAR12  | Field         | not triggered | can not be approved | NY_003         |
      | PAR12  | Field         | not triggered | can not be approved | SC_003         |
      | PAR12  | Field         | not triggered | can not be approved | FL_003         |
      | PAR12  | Field         | not triggered | can not be approved | TX_003         |
      | PAR12  | Field         | not triggered | can not be approved | GA_003         |
      | PAR12  | Field         | not triggered | can not be approved | MI_003         |
      | PAR12  | Field         | not triggered | can not be approved | ID_003         |


    @PAR12 @ExoticCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR12  | Field         | not triggered | can not be approved | AR_004         |
      | PAR12  | Field         | not triggered | can not be approved | AZ_004         |
      | PAR12  | Field         | not triggered | can not be approved | DC_004         |
      | PAR12  | Field         | not triggered | can not be approved | IA_004         |
      | PAR12  | Field         | not triggered | can not be approved | IL_004         |
      | PAR12  | Field         | not triggered | can not be approved | IN_004         |
      | PAR12  | Field         | not triggered | can not be approved | MO_004         |
      | PAR12  | Field         | not triggered | can not be approved | MT_004         |
      | PAR12  | Field         | not triggered | can not be approved | OH_004         |
      | PAR12  | Field         | not triggered | can not be approved | OK_004         |
      | PAR12  | Field         | not triggered | can not be approved | OR_004         |
      | PAR12  | Field         | not triggered | can not be approved | PA_004         |
      | PAR12  | Field         | not triggered | can not be approved | RI_004         |
      | PAR12  | Field         | not triggered | can not be approved | WI_004         |
      | PAR12  | Field         | not triggered | can not be approved | WY_004         |
      | PAR12  | Field         | not triggered | can not be approved | AL_004         |
      | PAR12  | Field         | not triggered | can not be approved | CT_004         |
      | PAR12  | Field         | not triggered | can not be approved | DE_004         |
      | PAR12  | Field         | not triggered | can not be approved | LA_004         |
      | PAR12  | Field         | not triggered | can not be approved | MD_004         |
      | PAR12  | Field         | not triggered | can not be approved | MS_004         |
      | PAR12  | Field         | not triggered | can not be approved | NJ_004         |
      | PAR12  | Field         | not triggered | can not be approved | NY_004         |
      | PAR12  | Field         | not triggered | can not be approved | SC_004         |
      | PAR12  | Field         | not triggered | can not be approved | FL_004         |
      | PAR12  | Field         | not triggered | can not be approved | TX_004         |
      | PAR12  | Field         | not triggered | can not be approved | GA_004         |
      | PAR12  | Field         | not triggered | can not be approved | MI_004         |
      | PAR12  | Field         | not triggered | can not be approved | ID_004         |

  @NewBusiness @NewBusinessRewrite
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42508" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I visit vehicle detail page on NB and change agreed value to "1000"
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"
    * I accept underwriting referrals

    Then I bind a quote
    And I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @PAR13 @PrivatePassenger
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR13  | Field         | not triggered | can not be approved | AL_001         |
      | PAR13  | Field         | not triggered | can not be approved | AK_001         |
      | PAR13  | Field         | not triggered | can not be approved | AZ_001         |
      | PAR13  | Field         | not triggered | can not be approved | AR_001         |
      | PAR13  | Field         | not triggered | can not be approved | CA_001         |
      | PAR13  | Field         | not triggered | can not be approved | CO_001         |
      | PAR13  | Field         | not triggered | can not be approved | CT_001         |
      | PAR13  | Field         | not triggered | can not be approved | DE_001         |
      | PAR13  | Field         | not triggered | can not be approved | DC_001         |
      | PAR13  | Field         | not triggered | can not be approved | FL_001         |
      | PAR13  | Field         | not triggered | can not be approved | GA_001         |
      | PAR13  | Field         | not triggered | can not be approved | HI_001         |
      | PAR13  | Field         | not triggered | can not be approved | ID_001         |
      | PAR13  | Field         | not triggered | can not be approved | IL_001         |
      | PAR13  | Field         | not triggered | can not be approved | IN_001         |
      | PAR13  | Field         | not triggered | can not be approved | IA_001         |
      | PAR13  | Field         | not triggered | can not be approved | KS_001         |
      | PAR13  | Field         | not triggered | can not be approved | KY_001         |
      | PAR13  | Field         | not triggered | can not be approved | LA_001         |
      | PAR13  | Field         | not triggered | can not be approved | ME_001         |
      | PAR13  | Field         | not triggered | can not be approved | MD_001         |
      | PAR13  | Field         | not triggered | can not be approved | MI_001         |
      | PAR13  | Field         | not triggered | can not be approved | MN_001         |
      | PAR13  | Field         | not triggered | can not be approved | MS_001         |
      | PAR13  | Field         | not triggered | can not be approved | MO_001         |
      | PAR13  | Field         | not triggered | can not be approved | MT_001         |
      | PAR13  | Field         | not triggered | can not be approved | NE_001         |
      | PAR13  | Field         | not triggered | can not be approved | NV_001         |
      | PAR13  | Field         | not triggered | can not be approved | NH_001         |
      | PAR13  | Field         | not triggered | can not be approved | NJ_001         |
      | PAR13  | Field         | not triggered | can not be approved | NM_001         |
      | PAR13  | Field         | not triggered | can not be approved | NY_001         |
      | PAR13  | Field         | not triggered | can not be approved | ND_001         |
      | PAR13  | Field         | not triggered | can not be approved | OH_001         |
      | PAR13  | Field         | not triggered | can not be approved | OK_001         |
      | PAR13  | Field         | not triggered | can not be approved | OR_001         |
      | PAR13  | Field         | not triggered | can not be approved | PA_001         |
      | PAR13  | Field         | not triggered | can not be approved | RI_001         |
      | PAR13  | Field         | not triggered | can not be approved | SC_001         |
      | PAR13  | Field         | not triggered | can not be approved | SD_001         |
      | PAR13  | Field         | not triggered | can not be approved | TN_001         |
      | PAR13  | Field         | not triggered | can not be approved | TX_001         |
      | PAR13  | Field         | not triggered | can not be approved | UT_001         |
      | PAR13  | Field         | not triggered | can not be approved | VT_001         |
      | PAR13  | Field         | not triggered | can not be approved | VA_001         |
      | PAR13  | Field         | not triggered | can not be approved | WA_001         |
      | PAR13  | Field         | not triggered | can not be approved | WV_001         |
      | PAR13  | Field         | not triggered | can not be approved | WI_001         |
      | PAR13  | Field         | not triggered | can not be approved | WY_001         |

    @PAR13 @ClassicCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR13  | Field         | not triggered | can not be approved | AL_002         |
      | PAR13  | Field         | not triggered | can not be approved | AK_002         |
      | PAR13  | Field         | not triggered | can not be approved | AZ_002         |
      | PAR13  | Field         | not triggered | can not be approved | AR_002         |
      | PAR13  | Field         | not triggered | can not be approved | CA_002         |
      | PAR13  | Field         | not triggered | can not be approved | CO_002         |
      | PAR13  | Field         | not triggered | can not be approved | CT_002         |
      | PAR13  | Field         | not triggered | can not be approved | DE_002         |
      | PAR13  | Field         | not triggered | can not be approved | DC_002         |
      | PAR13  | Field         | not triggered | can not be approved | FL_002         |
      | PAR13  | Field         | not triggered | can not be approved | GA_002         |
      | PAR13  | Field         | not triggered | can not be approved | HI_002         |
      | PAR13  | Field         | not triggered | can not be approved | ID_002         |
      | PAR13  | Field         | not triggered | can not be approved | IL_002         |
      | PAR13  | Field         | not triggered | can not be approved | IN_002         |
      | PAR13  | Field         | not triggered | can not be approved | IA_002         |
      | PAR13  | Field         | not triggered | can not be approved | KS_002         |
      | PAR13  | Field         | not triggered | can not be approved | KY_002         |
      | PAR13  | Field         | not triggered | can not be approved | LA_002         |
      | PAR13  | Field         | not triggered | can not be approved | ME_002         |
      | PAR13  | Field         | not triggered | can not be approved | MD_002         |
      | PAR13  | Field         | not triggered | can not be approved | MI_002         |
      | PAR13  | Field         | not triggered | can not be approved | MN_002         |
      | PAR13  | Field         | not triggered | can not be approved | MS_002         |
      | PAR13  | Field         | not triggered | can not be approved | MO_002         |
      | PAR13  | Field         | not triggered | can not be approved | MT_002         |
      | PAR13  | Field         | not triggered | can not be approved | NE_002         |
      | PAR13  | Field         | not triggered | can not be approved | NV_002         |
      | PAR13  | Field         | not triggered | can not be approved | NH_002         |
      | PAR13  | Field         | not triggered | can not be approved | NJ_002         |
      | PAR13  | Field         | not triggered | can not be approved | NM_002         |
      | PAR13  | Field         | not triggered | can not be approved | NY_002         |
      | PAR13  | Field         | not triggered | can not be approved | ND_002         |
      | PAR13  | Field         | not triggered | can not be approved | OH_002         |
      | PAR13  | Field         | not triggered | can not be approved | OK_002         |
      | PAR13  | Field         | not triggered | can not be approved | OR_002         |
      | PAR13  | Field         | not triggered | can not be approved | PA_002         |
      | PAR13  | Field         | not triggered | can not be approved | RI_002         |
      | PAR13  | Field         | not triggered | can not be approved | SC_002         |
      | PAR13  | Field         | not triggered | can not be approved | SD_002         |
      | PAR13  | Field         | not triggered | can not be approved | TN_002         |
      | PAR13  | Field         | not triggered | can not be approved | TX_002         |
      | PAR13  | Field         | not triggered | can not be approved | UT_002         |
      | PAR13  | Field         | not triggered | can not be approved | VT_002         |
      | PAR13  | Field         | not triggered | can not be approved | VA_002         |
      | PAR13  | Field         | not triggered | can not be approved | WA_002         |
      | PAR13  | Field         | not triggered | can not be approved | WV_002         |
      | PAR13  | Field         | not triggered | can not be approved | WI_002         |
      | PAR13  | Field         | not triggered | can not be approved | WY_002         |

    @PAR13 @AntiqueCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR13  | Field         | not triggered | can not be approved | AL_003         |
      | PAR13  | Field         | not triggered | can not be approved | AK_003         |
      | PAR13  | Field         | not triggered | can not be approved | AZ_003         |
      | PAR13  | Field         | not triggered | can not be approved | AR_003         |
      | PAR13  | Field         | not triggered | can not be approved | CA_003         |
      | PAR13  | Field         | not triggered | can not be approved | CO_003         |
      | PAR13  | Field         | not triggered | can not be approved | CT_003         |
      | PAR13  | Field         | not triggered | can not be approved | DE_003         |
      | PAR13  | Field         | not triggered | can not be approved | DC_003         |
      | PAR13  | Field         | not triggered | can not be approved | FL_003         |
      | PAR13  | Field         | not triggered | can not be approved | GA_003         |
      | PAR13  | Field         | not triggered | can not be approved | HI_003         |
      | PAR13  | Field         | not triggered | can not be approved | ID_003         |
      | PAR13  | Field         | not triggered | can not be approved | IL_003         |
      | PAR13  | Field         | not triggered | can not be approved | IN_003         |
      | PAR13  | Field         | not triggered | can not be approved | IA_003         |
      | PAR13  | Field         | not triggered | can not be approved | KS_003         |
      | PAR13  | Field         | not triggered | can not be approved | KY_003         |
      | PAR13  | Field         | not triggered | can not be approved | LA_003         |
      | PAR13  | Field         | not triggered | can not be approved | ME_003         |
      | PAR13  | Field         | not triggered | can not be approved | MD_003         |
      | PAR13  | Field         | not triggered | can not be approved | MI_003         |
      | PAR13  | Field         | not triggered | can not be approved | MN_003         |
      | PAR13  | Field         | not triggered | can not be approved | MS_003         |
      | PAR13  | Field         | not triggered | can not be approved | MO_003         |
      | PAR13  | Field         | not triggered | can not be approved | MT_003         |
      | PAR13  | Field         | not triggered | can not be approved | NE_003         |
      | PAR13  | Field         | not triggered | can not be approved | NV_003         |
      | PAR13  | Field         | not triggered | can not be approved | NH_003         |
      | PAR13  | Field         | not triggered | can not be approved | NJ_003         |
      | PAR13  | Field         | not triggered | can not be approved | NM_003         |
      | PAR13  | Field         | not triggered | can not be approved | NY_003         |
      | PAR13  | Field         | not triggered | can not be approved | ND_003         |
      | PAR13  | Field         | not triggered | can not be approved | OH_003         |
      | PAR13  | Field         | not triggered | can not be approved | OK_003         |
      | PAR13  | Field         | not triggered | can not be approved | OR_003         |
      | PAR13  | Field         | not triggered | can not be approved | PA_003         |
      | PAR13  | Field         | not triggered | can not be approved | RI_003         |
      | PAR13  | Field         | not triggered | can not be approved | SC_003         |
      | PAR13  | Field         | not triggered | can not be approved | SD_003         |
      | PAR13  | Field         | not triggered | can not be approved | TN_003         |
      | PAR13  | Field         | not triggered | can not be approved | TX_003         |
      | PAR13  | Field         | not triggered | can not be approved | UT_003         |
      | PAR13  | Field         | not triggered | can not be approved | VT_003         |
      | PAR13  | Field         | not triggered | can not be approved | VA_003         |
      | PAR13  | Field         | not triggered | can not be approved | WA_003         |
      | PAR13  | Field         | not triggered | can not be approved | WV_003         |
      | PAR13  | Field         | not triggered | can not be approved | WI_003         |
      | PAR13  | Field         | not triggered | can not be approved | WY_003         |

    @PAR13 @ExoticCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR13  | Field         | not triggered | can not be approved | AL_004         |
      | PAR13  | Field         | not triggered | can not be approved | AK_004         |
      | PAR13  | Field         | not triggered | can not be approved | AZ_004         |
      | PAR13  | Field         | not triggered | can not be approved | AR_004         |
      | PAR13  | Field         | not triggered | can not be approved | CA_004         |
      | PAR13  | Field         | not triggered | can not be approved | CO_004         |
      | PAR13  | Field         | not triggered | can not be approved | CT_004         |
      | PAR13  | Field         | not triggered | can not be approved | DE_004         |
      | PAR13  | Field         | not triggered | can not be approved | DC_004         |
      | PAR13  | Field         | not triggered | can not be approved | FL_004         |
      | PAR13  | Field         | not triggered | can not be approved | GA_004         |
      | PAR13  | Field         | not triggered | can not be approved | HI_004         |
      | PAR13  | Field         | not triggered | can not be approved | ID_004         |
      | PAR13  | Field         | not triggered | can not be approved | IL_004         |
      | PAR13  | Field         | not triggered | can not be approved | IN_004         |
      | PAR13  | Field         | not triggered | can not be approved | IA_004         |
      | PAR13  | Field         | not triggered | can not be approved | KS_004         |
      | PAR13  | Field         | not triggered | can not be approved | KY_004         |
      | PAR13  | Field         | not triggered | can not be approved | LA_004         |
      | PAR13  | Field         | not triggered | can not be approved | ME_004         |
      | PAR13  | Field         | not triggered | can not be approved | MD_004         |
      | PAR13  | Field         | not triggered | can not be approved | MI_004         |
      | PAR13  | Field         | not triggered | can not be approved | MN_004         |
      | PAR13  | Field         | not triggered | can not be approved | MS_004         |
      | PAR13  | Field         | not triggered | can not be approved | MO_004         |
      | PAR13  | Field         | not triggered | can not be approved | MT_004         |
      | PAR13  | Field         | not triggered | can not be approved | NE_004         |
      | PAR13  | Field         | not triggered | can not be approved | NV_004         |
      | PAR13  | Field         | not triggered | can not be approved | NH_004         |
      | PAR13  | Field         | not triggered | can not be approved | NJ_004         |
      | PAR13  | Field         | not triggered | can not be approved | NM_004         |
      | PAR13  | Field         | not triggered | can not be approved | NY_004         |
      | PAR13  | Field         | not triggered | can not be approved | ND_004         |
      | PAR13  | Field         | not triggered | can not be approved | OH_004         |
      | PAR13  | Field         | not triggered | can not be approved | OK_004         |
      | PAR13  | Field         | not triggered | can not be approved | OR_004         |
      | PAR13  | Field         | not triggered | can not be approved | PA_004         |
      | PAR13  | Field         | not triggered | can not be approved | RI_004         |
      | PAR13  | Field         | not triggered | can not be approved | SC_004         |
      | PAR13  | Field         | not triggered | can not be approved | SD_004         |
      | PAR13  | Field         | not triggered | can not be approved | TN_004         |
      | PAR13  | Field         | not triggered | can not be approved | TX_004         |
      | PAR13  | Field         | not triggered | can not be approved | UT_004         |
      | PAR13  | Field         | not triggered | can not be approved | VT_004         |
      | PAR13  | Field         | not triggered | can not be approved | VA_004         |
      | PAR13  | Field         | not triggered | can not be approved | WA_004         |
      | PAR13  | Field         | not triggered | can not be approved | WV_004         |
      | PAR13  | Field         | not triggered | can not be approved | WI_004         |
      | PAR13  | Field         | not triggered | can not be approved | WY_004         |

  @NewBusiness @Renewal
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA renewal for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42855" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<role/sub-role>"
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
    And I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I visit vehicle detail page on renewal and change agreed value to "100000"
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @PAR14 @PrivatePassenger
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR14  | Field         | not triggered | can not be approved | AK_001         |
      | PAR14  | Field         | not triggered | can not be approved | AR_001         |
      | PAR14  | Field         | not triggered | can not be approved | AZ_001         |
      | PAR14  | Field         | not triggered | can not be approved | CO_001         |
      | PAR14  | Field         | not triggered | can not be approved | DC_001         |
      | PAR14  | Field         | not triggered | can not be approved | IA_001         |
      | PAR14  | Field         | not triggered | can not be approved | IL_001         |
      | PAR14  | Field         | not triggered | can not be approved | IN_001         |
      | PAR14  | Field         | not triggered | can not be approved | KS_001         |
      | PAR14  | Field         | not triggered | can not be approved | KY_001         |
      | PAR14  | Field         | not triggered | can not be approved | MN_001         |
      | PAR14  | Field         | not triggered | can not be approved | MO_001         |
      | PAR14  | Field         | not triggered | can not be approved | MT_001         |
      | PAR14  | Field         | not triggered | can not be approved | ND_001         |
      | PAR14  | Field         | not triggered | can not be approved | NE_001         |
      | PAR14  | Field         | not triggered | can not be approved | NH_001         |
      | PAR14  | Field         | not triggered | can not be approved | NM_001         |
      | PAR14  | Field         | not triggered | can not be approved | NV_001         |
      | PAR14  | Field         | not triggered | can not be approved | OH_001         |
      | PAR14  | Field         | not triggered | can not be approved | OK_001         |
      | PAR14  | Field         | not triggered | can not be approved | OR_001         |
      | PAR14  | Field         | not triggered | can not be approved | PA_001         |
      | PAR14  | Field         | not triggered | can not be approved | RI_001         |
      | PAR14  | Field         | not triggered | can not be approved | SD_001         |
      | PAR14  | Field         | not triggered | can not be approved | TN_001         |
      | PAR14  | Field         | not triggered | can not be approved | UT_001         |
      | PAR14  | Field         | not triggered | can not be approved | VT_001         |
      | PAR14  | Field         | not triggered | can not be approved | WA_001         |
      | PAR14  | Field         | not triggered | can not be approved | WI_001         |
      | PAR14  | Field         | not triggered | can not be approved | WV_001         |
      | PAR14  | Field         | not triggered | can not be approved | WY_001         |
      | PAR14  | Field         | not triggered | can not be approved | AL_001         |
      | PAR14  | Field         | not triggered | can not be approved | CA_001         |
      | PAR14  | Field         | not triggered | can not be approved | CT_001         |
      | PAR14  | Field         | not triggered | can not be approved | DE_001         |
      | PAR14  | Field         | not triggered | can not be approved | HI_001         |
      | PAR14  | Field         | not triggered | can not be approved | LA_001         |
      | PAR14  | Field         | not triggered | can not be approved | MA_001         |
      | PAR14  | Field         | not triggered | can not be approved | MD_001         |
      | PAR14  | Field         | not triggered | can not be approved | ME_001         |
      | PAR14  | Field         | not triggered | can not be approved | MS_001         |
      | PAR14  | Field         | not triggered | can not be approved | NC_001         |
      | PAR14  | Field         | not triggered | can not be approved | NJ_001         |
      | PAR14  | Field         | not triggered | can not be approved | NY_001         |
      | PAR14  | Field         | not triggered | can not be approved | SC_001         |
      | PAR14  | Field         | not triggered | can not be approved | VA_001         |
      | PAR14  | Field         | not triggered | can not be approved | FL_001         |
      | PAR14  | Field         | not triggered | can not be approved | TX_001         |
      | PAR14  | Field         | not triggered | can not be approved | GA_001         |
      | PAR14  | Field         | not triggered | can not be approved | MI_001         |
      | PAR14  | Field         | not triggered | can not be approved | ID_001         |

    @PAR14 @ClassicCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR14  | Field         | not triggered | can not be approved | AK_002         |
      | PAR14  | Field         | not triggered | can not be approved | AR_002         |
      | PAR14  | Field         | not triggered | can not be approved | AZ_002         |
      | PAR14  | Field         | not triggered | can not be approved | CO_002         |
      | PAR14  | Field         | not triggered | can not be approved | DC_002         |
      | PAR14  | Field         | not triggered | can not be approved | IA_002         |
      | PAR14  | Field         | not triggered | can not be approved | IL_002         |
      | PAR14  | Field         | not triggered | can not be approved | IN_002         |
      | PAR14  | Field         | not triggered | can not be approved | KS_002         |
      | PAR14  | Field         | not triggered | can not be approved | KY_002         |
      | PAR14  | Field         | not triggered | can not be approved | MN_002         |
      | PAR14  | Field         | not triggered | can not be approved | MO_002         |
      | PAR14  | Field         | not triggered | can not be approved | MT_002         |
      | PAR14  | Field         | not triggered | can not be approved | ND_002         |
      | PAR14  | Field         | not triggered | can not be approved | NE_002         |
      | PAR14  | Field         | not triggered | can not be approved | NH_002         |
      | PAR14  | Field         | not triggered | can not be approved | NM_002         |
      | PAR14  | Field         | not triggered | can not be approved | NV_002         |
      | PAR14  | Field         | not triggered | can not be approved | OH_002         |
      | PAR14  | Field         | not triggered | can not be approved | OK_002         |
      | PAR14  | Field         | not triggered | can not be approved | OR_002         |
      | PAR14  | Field         | not triggered | can not be approved | PA_002         |
      | PAR14  | Field         | not triggered | can not be approved | RI_002         |
      | PAR14  | Field         | not triggered | can not be approved | SD_002         |
      | PAR14  | Field         | not triggered | can not be approved | TN_002         |
      | PAR14  | Field         | not triggered | can not be approved | UT_002         |
      | PAR14  | Field         | not triggered | can not be approved | VT_002         |
      | PAR14  | Field         | not triggered | can not be approved | WA_002         |
      | PAR14  | Field         | not triggered | can not be approved | WI_002         |
      | PAR14  | Field         | not triggered | can not be approved | WV_002         |
      | PAR14  | Field         | not triggered | can not be approved | WY_002         |
      | PAR14  | Field         | not triggered | can not be approved | AL_002         |
      | PAR14  | Field         | not triggered | can not be approved | CA_002         |
      | PAR14  | Field         | not triggered | can not be approved | CT_002         |
      | PAR14  | Field         | not triggered | can not be approved | DE_002         |
      | PAR14  | Field         | not triggered | can not be approved | HI_002         |
      | PAR14  | Field         | not triggered | can not be approved | LA_002         |
      | PAR14  | Field         | not triggered | can not be approved | MA_002         |
      | PAR14  | Field         | not triggered | can not be approved | MD_002         |
      | PAR14  | Field         | not triggered | can not be approved | ME_002         |
      | PAR14  | Field         | not triggered | can not be approved | MS_002         |
      | PAR14  | Field         | not triggered | can not be approved | NC_002         |
      | PAR14  | Field         | not triggered | can not be approved | NJ_002         |
      | PAR14  | Field         | not triggered | can not be approved | NY_002         |
      | PAR14  | Field         | not triggered | can not be approved | SC_002         |
      | PAR14  | Field         | not triggered | can not be approved | VA_002         |
      | PAR14  | Field         | not triggered | can not be approved | FL_002         |
      | PAR14  | Field         | not triggered | can not be approved | TX_002         |
      | PAR14  | Field         | not triggered | can not be approved | GA_002         |
      | PAR14  | Field         | not triggered | can not be approved | MI_002         |
      | PAR14  | Field         | not triggered | can not be approved | ID_002         |

    @PAR14 @AntiqueCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR14  | Field         | not triggered | can not be approved | AK_003         |
      | PAR14  | Field         | not triggered | can not be approved | AR_003         |
      | PAR14  | Field         | not triggered | can not be approved | AZ_003         |
      | PAR14  | Field         | not triggered | can not be approved | CO_003         |
      | PAR14  | Field         | not triggered | can not be approved | DC_003         |
      | PAR14  | Field         | not triggered | can not be approved | IA_003         |
      | PAR14  | Field         | not triggered | can not be approved | IL_003         |
      | PAR14  | Field         | not triggered | can not be approved | IN_003         |
      | PAR14  | Field         | not triggered | can not be approved | KS_003         |
      | PAR14  | Field         | not triggered | can not be approved | KY_003         |
      | PAR14  | Field         | not triggered | can not be approved | MN_003         |
      | PAR14  | Field         | not triggered | can not be approved | MO_003         |
      | PAR14  | Field         | not triggered | can not be approved | MT_003         |
      | PAR14  | Field         | not triggered | can not be approved | ND_003         |
      | PAR14  | Field         | not triggered | can not be approved | NE_003         |
      | PAR14  | Field         | not triggered | can not be approved | NH_003         |
      | PAR14  | Field         | not triggered | can not be approved | NM_003         |
      | PAR14  | Field         | not triggered | can not be approved | NV_003         |
      | PAR14  | Field         | not triggered | can not be approved | OH_003         |
      | PAR14  | Field         | not triggered | can not be approved | OK_003         |
      | PAR14  | Field         | not triggered | can not be approved | OR_003         |
      | PAR14  | Field         | not triggered | can not be approved | PA_003         |
      | PAR14  | Field         | not triggered | can not be approved | RI_003         |
      | PAR14  | Field         | not triggered | can not be approved | SD_003         |
      | PAR14  | Field         | not triggered | can not be approved | TN_003         |
      | PAR14  | Field         | not triggered | can not be approved | UT_003         |
      | PAR14  | Field         | not triggered | can not be approved | VT_003         |
      | PAR14  | Field         | not triggered | can not be approved | WA_003         |
      | PAR14  | Field         | not triggered | can not be approved | WI_003         |
      | PAR14  | Field         | not triggered | can not be approved | WV_003         |
      | PAR14  | Field         | not triggered | can not be approved | WY_003         |
      | PAR14  | Field         | not triggered | can not be approved | AL_003         |
      | PAR14  | Field         | not triggered | can not be approved | CA_003         |
      | PAR14  | Field         | not triggered | can not be approved | CT_003         |
      | PAR14  | Field         | not triggered | can not be approved | DE_003         |
      | PAR14  | Field         | not triggered | can not be approved | HI_003         |
      | PAR14  | Field         | not triggered | can not be approved | LA_003         |
      | PAR14  | Field         | not triggered | can not be approved | MA_003         |
      | PAR14  | Field         | not triggered | can not be approved | MD_003         |
      | PAR14  | Field         | not triggered | can not be approved | ME_003         |
      | PAR14  | Field         | not triggered | can not be approved | MS_003         |
      | PAR14  | Field         | not triggered | can not be approved | NC_003         |
      | PAR14  | Field         | not triggered | can not be approved | NJ_003         |
      | PAR14  | Field         | not triggered | can not be approved | NY_003         |
      | PAR14  | Field         | not triggered | can not be approved | SC_003         |
      | PAR14  | Field         | not triggered | can not be approved | VA_003         |
      | PAR14  | Field         | not triggered | can not be approved | FL_003         |
      | PAR14  | Field         | not triggered | can not be approved | TX_003         |
      | PAR14  | Field         | not triggered | can not be approved | GA_003         |
      | PAR14  | Field         | not triggered | can not be approved | MI_003         |
      | PAR14  | Field         | not triggered | can not be approved | ID_003         |

    @PAR14 @ExoticCollectorsCar
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR14  | Field         | not triggered | can not be approved | AK_004         |
      | PAR14  | Field         | not triggered | can not be approved | AR_004         |
      | PAR14  | Field         | not triggered | can not be approved | AZ_004         |
      | PAR14  | Field         | not triggered | can not be approved | CO_004         |
      | PAR14  | Field         | not triggered | can not be approved | DC_004         |
      | PAR14  | Field         | not triggered | can not be approved | IA_004         |
      | PAR14  | Field         | not triggered | can not be approved | IL_004         |
      | PAR14  | Field         | not triggered | can not be approved | IN_004         |
      | PAR14  | Field         | not triggered | can not be approved | KS_004         |
      | PAR14  | Field         | not triggered | can not be approved | KY_004         |
      | PAR14  | Field         | not triggered | can not be approved | MN_004         |
      | PAR14  | Field         | not triggered | can not be approved | MO_004         |
      | PAR14  | Field         | not triggered | can not be approved | MT_004         |
      | PAR14  | Field         | not triggered | can not be approved | ND_004         |
      | PAR14  | Field         | not triggered | can not be approved | NE_004         |
      | PAR14  | Field         | not triggered | can not be approved | NH_004         |
      | PAR14  | Field         | not triggered | can not be approved | NM_004         |
      | PAR14  | Field         | not triggered | can not be approved | NV_004         |
      | PAR14  | Field         | not triggered | can not be approved | OH_004         |
      | PAR14  | Field         | not triggered | can not be approved | OK_004         |
      | PAR14  | Field         | not triggered | can not be approved | OR_004         |
      | PAR14  | Field         | not triggered | can not be approved | PA_004         |
      | PAR14  | Field         | not triggered | can not be approved | RI_004         |
      | PAR14  | Field         | not triggered | can not be approved | SD_004         |
      | PAR14  | Field         | not triggered | can not be approved | TN_004         |
      | PAR14  | Field         | not triggered | can not be approved | UT_004         |
      | PAR14  | Field         | not triggered | can not be approved | VT_004         |
      | PAR14  | Field         | not triggered | can not be approved | WA_004         |
      | PAR14  | Field         | not triggered | can not be approved | WI_004         |
      | PAR14  | Field         | not triggered | can not be approved | WV_004         |
      | PAR14  | Field         | not triggered | can not be approved | WY_004         |
      | PAR14  | Field         | not triggered | can not be approved | AL_004         |
      | PAR14  | Field         | not triggered | can not be approved | CA_004         |
      | PAR14  | Field         | not triggered | can not be approved | CT_004         |
      | PAR14  | Field         | not triggered | can not be approved | DE_004         |
      | PAR14  | Field         | not triggered | can not be approved | HI_004         |
      | PAR14  | Field         | not triggered | can not be approved | LA_004         |
      | PAR14  | Field         | not triggered | can not be approved | MA_004         |
      | PAR14  | Field         | not triggered | can not be approved | MD_004         |
      | PAR14  | Field         | not triggered | can not be approved | ME_004         |
      | PAR14  | Field         | not triggered | can not be approved | MS_004         |
      | PAR14  | Field         | not triggered | can not be approved | NJ_004         |
      | PAR14  | Field         | not triggered | can not be approved | NY_004         |
      | PAR14  | Field         | not triggered | can not be approved | SC_004         |
      | PAR14  | Field         | not triggered | can not be approved | VA_004         |
      | PAR14  | Field         | not triggered | can not be approved | FL_004         |
      | PAR14  | Field         | not triggered | can not be approved | TX_004         |
      | PAR14  | Field         | not triggered | can not be approved | GA_004         |
      | PAR14  | Field         | not triggered | can not be approved | MI_004         |
      | PAR14  | Field         | not triggered | can not be approved | ID_004         |
