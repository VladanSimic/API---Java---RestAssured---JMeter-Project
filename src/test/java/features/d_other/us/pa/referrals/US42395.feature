@PersonalAuto @US42395
Feature: US42395 - Carfax- Remove UW Agreed Value Referrals

  As an Underwriting Manager, I do not want certain underwriting referrals
  to be triggered for specific Agreed Value for Personal Auto quotes,
  since other referrals already exist to identify high-value vehicles

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42395" in sheet "QuoteCreatorPA" for "PA" LOB

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

    @PAR1
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR1   | Field         | not triggered | can not be approved | AK_001         |
      | PAR1   | Field         | not triggered | can not be approved | AR_001         |
      | PAR1   | Field         | not triggered | can not be approved | AZ_001         |
      | PAR1   | Field         | not triggered | can not be approved | CO_001         |
      | PAR1   | Field         | not triggered | can not be approved | DC_001         |
      | PAR1   | Field         | not triggered | can not be approved | IA_001         |
      | PAR1   | Field         | not triggered | can not be approved | IL_001         |
      | PAR1   | Field         | not triggered | can not be approved | IN_001         |
      | PAR1   | Field         | not triggered | can not be approved | KS_001         |
      | PAR1   | Field         | not triggered | can not be approved | KY_001         |
      | PAR1   | Field         | not triggered | can not be approved | MN_001         |
      | PAR1   | Field         | not triggered | can not be approved | MO_001         |
      | PAR1   | Field         | not triggered | can not be approved | MT_001         |
      | PAR1   | Field         | not triggered | can not be approved | ND_001         |
      | PAR1   | Field         | not triggered | can not be approved | NE_001         |
      | PAR1   | Field         | not triggered | can not be approved | NH_001         |
      | PAR1   | Field         | not triggered | can not be approved | NM_001         |
      | PAR1   | Field         | not triggered | can not be approved | NV_001         |
      | PAR1   | Field         | not triggered | can not be approved | OH_001         |
      | PAR1   | Field         | not triggered | can not be approved | OK_001         |
      | PAR1   | Field         | not triggered | can not be approved | OR_001         |
      | PAR1   | Field         | not triggered | can not be approved | PA_001         |
      | PAR1   | Field         | not triggered | can not be approved | RI_001         |
      | PAR1   | Field         | not triggered | can not be approved | SD_001         |
      | PAR1   | Field         | not triggered | can not be approved | TN_001         |
      | PAR1   | Field         | not triggered | can not be approved | UT_001         |
      | PAR1   | Field         | not triggered | can not be approved | VT_001         |
      | PAR1   | Field         | not triggered | can not be approved | WA_001         |
      | PAR1   | Field         | not triggered | can not be approved | WI_001         |
      | PAR1   | Field         | not triggered | can not be approved | WV_001         |
      | PAR1   | Field         | not triggered | can not be approved | WY_001         |
      | PAR1   | Field         | not triggered | can not be approved | AL_001         |
      | PAR1   | Field         | not triggered | can not be approved | CA_001         |
      | PAR1   | Field         | not triggered | can not be approved | CT_001         |
      | PAR1   | Field         | not triggered | can not be approved | DE_001         |
      | PAR1   | Field         | not triggered | can not be approved | HI_001         |
      | PAR1   | Field         | not triggered | can not be approved | LA_001         |
      | PAR1   | Field         | not triggered | can not be approved | MA_001         |
      | PAR1   | Field         | not triggered | can not be approved | MD_001         |
      | PAR1   | Field         | not triggered | can not be approved | ME_001         |
      | PAR1   | Field         | not triggered | can not be approved | MS_001         |
      | PAR1   | Field         | not triggered | can not be approved | NC_001         |
      | PAR1   | Field         | not triggered | can not be approved | NJ_001         |
      | PAR1   | Field         | not triggered | can not be approved | NY_001         |
      | PAR1   | Field         | not triggered | can not be approved | SC_001         |
      | PAR1   | Field         | not triggered | can not be approved | VA_001         |
      | PAR1   | Field         | not triggered | can not be approved | FL_001         |
      | PAR1   | Field         | not triggered | can not be approved | TX_001         |
      | PAR1   | Field         | not triggered | can not be approved | GA_001         |
      | PAR1   | Field         | not triggered | can not be approved | MI_001         |
      | PAR1   | Field         | not triggered | can not be approved | ID_001         |

    @PAR2
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR2   | Field         | not triggered | can not be approved | AK_002         |
      | PAR2   | Field         | not triggered | can not be approved | AR_002         |
      | PAR2   | Field         | not triggered | can not be approved | AZ_002         |
      | PAR2   | Field         | not triggered | can not be approved | CO_002         |
      | PAR2   | Field         | not triggered | can not be approved | DC_002         |
      | PAR2   | Field         | not triggered | can not be approved | IA_002         |
      | PAR2   | Field         | not triggered | can not be approved | IL_002         |
      | PAR2   | Field         | not triggered | can not be approved | IN_002         |
      | PAR2   | Field         | not triggered | can not be approved | KS_002         |
      | PAR2   | Field         | not triggered | can not be approved | KY_002         |
      | PAR2   | Field         | not triggered | can not be approved | MN_002         |
      | PAR2   | Field         | not triggered | can not be approved | MO_002         |
      | PAR2   | Field         | not triggered | can not be approved | MT_002         |
      | PAR2   | Field         | not triggered | can not be approved | ND_002         |
      | PAR2   | Field         | not triggered | can not be approved | NE_002         |
      | PAR2   | Field         | not triggered | can not be approved | NH_002         |
      | PAR2   | Field         | not triggered | can not be approved | NM_002         |
      | PAR2   | Field         | not triggered | can not be approved | NV_002         |
      | PAR2   | Field         | not triggered | can not be approved | OH_002         |
      | PAR2   | Field         | not triggered | can not be approved | OK_002         |
      | PAR2   | Field         | not triggered | can not be approved | OR_002         |
      | PAR2   | Field         | not triggered | can not be approved | PA_002         |
      | PAR2   | Field         | not triggered | can not be approved | RI_002         |
      | PAR2   | Field         | not triggered | can not be approved | SD_002         |
      | PAR2   | Field         | not triggered | can not be approved | TN_002         |
      | PAR2   | Field         | not triggered | can not be approved | UT_002         |
      | PAR2   | Field         | not triggered | can not be approved | VT_002         |
      | PAR2   | Field         | not triggered | can not be approved | WA_002         |
      | PAR2   | Field         | not triggered | can not be approved | WI_002         |
      | PAR2   | Field         | not triggered | can not be approved | WV_002         |
      | PAR2   | Field         | not triggered | can not be approved | WY_002         |
      | PAR2   | Field         | not triggered | can not be approved | AL_002         |
      | PAR2   | Field         | not triggered | can not be approved | CA_002         |
      | PAR2   | Field         | not triggered | can not be approved | CT_002         |
      | PAR2   | Field         | not triggered | can not be approved | DE_002         |
      | PAR2   | Field         | not triggered | can not be approved | HI_002         |
      | PAR2   | Field         | not triggered | can not be approved | LA_002         |
      | PAR2   | Field         | not triggered | can not be approved | MA_002         |
      | PAR2   | Field         | not triggered | can not be approved | MD_002         |
      | PAR2   | Field         | not triggered | can not be approved | ME_002         |
      | PAR2   | Field         | not triggered | can not be approved | MS_002         |
      | PAR2   | Field         | not triggered | can not be approved | NC_002         |
      | PAR2   | Field         | not triggered | can not be approved | NJ_002         |
      | PAR2   | Field         | not triggered | can not be approved | NY_002         |
      | PAR2   | Field         | not triggered | can not be approved | SC_002         |
      | PAR2   | Field         | not triggered | can not be approved | VA_002         |
      | PAR2   | Field         | not triggered | can not be approved | FL_002         |
      | PAR2   | Field         | not triggered | can not be approved | TX_002         |
      | PAR2   | Field         | not triggered | can not be approved | GA_002         |
      | PAR2   | Field         | not triggered | can not be approved | MI_002         |
      | PAR2   | Field         | not triggered | can not be approved | ID_002         |

    @PAR3
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR3   | Field         | not triggered | can not be approved | AK_003         |
      | PAR3   | Field         | not triggered | can not be approved | AR_003         |
      | PAR3   | Field         | not triggered | can not be approved | AZ_003         |
      | PAR3   | Field         | not triggered | can not be approved | CO_003         |
      | PAR3   | Field         | not triggered | can not be approved | DC_003         |
      | PAR3   | Field         | not triggered | can not be approved | IA_003         |
      | PAR3   | Field         | not triggered | can not be approved | IL_003         |
      | PAR3   | Field         | not triggered | can not be approved | IN_003         |
      | PAR3   | Field         | not triggered | can not be approved | KS_003         |
      | PAR3   | Field         | not triggered | can not be approved | KY_003         |
      | PAR3   | Field         | not triggered | can not be approved | MN_003         |
      | PAR3   | Field         | not triggered | can not be approved | MO_003         |
      | PAR3   | Field         | not triggered | can not be approved | MT_003         |
      | PAR3   | Field         | not triggered | can not be approved | ND_003         |
      | PAR3   | Field         | not triggered | can not be approved | NE_003         |
      | PAR3   | Field         | not triggered | can not be approved | NH_003         |
      | PAR3   | Field         | not triggered | can not be approved | NM_003         |
      | PAR3   | Field         | not triggered | can not be approved | NV_003         |
      | PAR3   | Field         | not triggered | can not be approved | OH_003         |
      | PAR3   | Field         | not triggered | can not be approved | OK_003         |
      | PAR3   | Field         | not triggered | can not be approved | OR_003         |
      | PAR3   | Field         | not triggered | can not be approved | PA_003         |
      | PAR3   | Field         | not triggered | can not be approved | RI_003         |
      | PAR3   | Field         | not triggered | can not be approved | SD_003         |
      | PAR3   | Field         | not triggered | can not be approved | TN_003         |
      | PAR3   | Field         | not triggered | can not be approved | UT_003         |
      | PAR3   | Field         | not triggered | can not be approved | VT_003         |
      | PAR3   | Field         | not triggered | can not be approved | WA_003         |
      | PAR3   | Field         | not triggered | can not be approved | WI_003         |
      | PAR3   | Field         | not triggered | can not be approved | WV_003         |
      | PAR3   | Field         | not triggered | can not be approved | WY_003         |
      | PAR3   | Field         | not triggered | can not be approved | AL_003         |
      | PAR3   | Field         | not triggered | can not be approved | CA_003         |
      | PAR3   | Field         | not triggered | can not be approved | CT_003         |
      | PAR3   | Field         | not triggered | can not be approved | DE_003         |
      | PAR3   | Field         | not triggered | can not be approved | HI_003         |
      | PAR3   | Field         | not triggered | can not be approved | LA_003         |
      | PAR3   | Field         | not triggered | can not be approved | MA_003         |
      | PAR3   | Field         | not triggered | can not be approved | MD_003         |
      | PAR3   | Field         | not triggered | can not be approved | ME_003         |
      | PAR3   | Field         | not triggered | can not be approved | MS_003         |
      | PAR3   | Field         | not triggered | can not be approved | NC_003         |
      | PAR3   | Field         | not triggered | can not be approved | NJ_003         |
      | PAR3   | Field         | not triggered | can not be approved | NY_003         |
      | PAR3   | Field         | not triggered | can not be approved | SC_003         |
      | PAR3   | Field         | not triggered | can not be approved | VA_003         |
      | PAR3   | Field         | not triggered | can not be approved | FL_003         |
      | PAR3   | Field         | not triggered | can not be approved | TX_003         |
      | PAR3   | Field         | not triggered | can not be approved | GA_003         |
      | PAR3   | Field         | not triggered | can not be approved | MI_003         |
      | PAR3   | Field         | not triggered | can not be approved | ID_003         |

    @PAR4
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR4   | Field         | not triggered | can not be approved | AK_004         |
      | PAR4   | Field         | not triggered | can not be approved | AR_004         |
      | PAR4   | Field         | not triggered | can not be approved | AZ_004         |
      | PAR4   | Field         | not triggered | can not be approved | CO_004         |
      | PAR4   | Field         | not triggered | can not be approved | DC_004         |
      | PAR4   | Field         | not triggered | can not be approved | IA_004         |
      | PAR4   | Field         | not triggered | can not be approved | IL_004         |
      | PAR4   | Field         | not triggered | can not be approved | IN_004         |
      | PAR4   | Field         | not triggered | can not be approved | KS_004         |
      | PAR4   | Field         | not triggered | can not be approved | KY_004         |
      | PAR4   | Field         | not triggered | can not be approved | MN_004         |
      | PAR4   | Field         | not triggered | can not be approved | MO_004         |
      | PAR4   | Field         | not triggered | can not be approved | MT_004         |
      | PAR4   | Field         | not triggered | can not be approved | ND_004         |
      | PAR4   | Field         | not triggered | can not be approved | NE_004         |
      | PAR4   | Field         | not triggered | can not be approved | NH_004         |
      | PAR4   | Field         | not triggered | can not be approved | NM_004         |
      | PAR4   | Field         | not triggered | can not be approved | NV_004         |
      | PAR4   | Field         | not triggered | can not be approved | OH_004         |
      | PAR4   | Field         | not triggered | can not be approved | OK_004         |
      | PAR4   | Field         | not triggered | can not be approved | OR_004         |
      | PAR4   | Field         | not triggered | can not be approved | PA_004         |
      | PAR4   | Field         | not triggered | can not be approved | RI_004         |
      | PAR4   | Field         | not triggered | can not be approved | SD_004         |
      | PAR4   | Field         | not triggered | can not be approved | TN_004         |
      | PAR4   | Field         | not triggered | can not be approved | UT_004         |
      | PAR4   | Field         | not triggered | can not be approved | VT_004         |
      | PAR4   | Field         | not triggered | can not be approved | WA_004         |
      | PAR4   | Field         | not triggered | can not be approved | WI_004         |
      | PAR4   | Field         | not triggered | can not be approved | WV_004         |
      | PAR4   | Field         | not triggered | can not be approved | WY_004         |
      | PAR4   | Field         | not triggered | can not be approved | AL_004         |
      | PAR4   | Field         | not triggered | can not be approved | CA_004         |
      | PAR4   | Field         | not triggered | can not be approved | CT_004         |
      | PAR4   | Field         | not triggered | can not be approved | DE_004         |
      | PAR4   | Field         | not triggered | can not be approved | HI_004         |
      | PAR4   | Field         | not triggered | can not be approved | LA_004         |
      | PAR4   | Field         | not triggered | can not be approved | MA_004         |
      | PAR4   | Field         | not triggered | can not be approved | MD_004         |
      | PAR4   | Field         | not triggered | can not be approved | ME_004         |
      | PAR4   | Field         | not triggered | can not be approved | MS_004         |
      | PAR4   | Field         | not triggered | can not be approved | NC_004         |
      | PAR4   | Field         | not triggered | can not be approved | NJ_004         |
      | PAR4   | Field         | not triggered | can not be approved | NY_004         |
      | PAR4   | Field         | not triggered | can not be approved | SC_004         |
      | PAR4   | Field         | not triggered | can not be approved | VA_004         |
      | PAR4   | Field         | not triggered | can not be approved | FL_004         |
      | PAR4   | Field         | not triggered | can not be approved | TX_004         |
      | PAR4   | Field         | not triggered | can not be approved | GA_004         |
      | PAR4   | Field         | not triggered | can not be approved | MI_004         |
      | PAR4   | Field         | not triggered | can not be approved | ID_004         |

    @PAR5
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR5   | Field         | not triggered | can not be approved | AK_005         |
      | PAR5   | Field         | not triggered | can not be approved | AR_005         |
      | PAR5   | Field         | not triggered | can not be approved | AZ_005         |
      | PAR5   | Field         | not triggered | can not be approved | CO_005         |
      | PAR5   | Field         | not triggered | can not be approved | DC_005         |
      | PAR5   | Field         | not triggered | can not be approved | IA_005         |
      | PAR5   | Field         | not triggered | can not be approved | IL_005         |
      | PAR5   | Field         | not triggered | can not be approved | IN_005         |
      | PAR5   | Field         | not triggered | can not be approved | KS_005         |
      | PAR5   | Field         | not triggered | can not be approved | KY_005         |
      | PAR5   | Field         | not triggered | can not be approved | MN_005         |
      | PAR5   | Field         | not triggered | can not be approved | MO_005         |
      | PAR5   | Field         | not triggered | can not be approved | MT_005         |
      | PAR5   | Field         | not triggered | can not be approved | ND_005         |
      | PAR5   | Field         | not triggered | can not be approved | NE_005         |
      | PAR5   | Field         | not triggered | can not be approved | NH_005         |
      | PAR5   | Field         | not triggered | can not be approved | NM_005         |
      | PAR5   | Field         | not triggered | can not be approved | NV_005         |
      | PAR5   | Field         | not triggered | can not be approved | OH_005         |
      | PAR5   | Field         | not triggered | can not be approved | OK_005         |
      | PAR5   | Field         | not triggered | can not be approved | OR_005         |
      | PAR5   | Field         | not triggered | can not be approved | PA_005         |
      | PAR5   | Field         | not triggered | can not be approved | RI_005         |
      | PAR5   | Field         | not triggered | can not be approved | SD_005         |
      | PAR5   | Field         | not triggered | can not be approved | TN_005         |
      | PAR5   | Field         | not triggered | can not be approved | UT_005         |
      | PAR5   | Field         | not triggered | can not be approved | VT_005         |
      | PAR5   | Field         | not triggered | can not be approved | WA_005         |
      | PAR5   | Field         | not triggered | can not be approved | WI_005         |
      | PAR5   | Field         | not triggered | can not be approved | WV_005         |
      | PAR5   | Field         | not triggered | can not be approved | WY_005         |
      | PAR5   | Field         | not triggered | can not be approved | AL_005         |
      | PAR5   | Field         | not triggered | can not be approved | CA_005         |
      | PAR5   | Field         | not triggered | can not be approved | CT_005         |
      | PAR5   | Field         | not triggered | can not be approved | DE_005         |
      | PAR5   | Field         | not triggered | can not be approved | HI_005         |
      | PAR5   | Field         | not triggered | can not be approved | LA_005         |
      | PAR5   | Field         | not triggered | can not be approved | MA_005         |
      | PAR5   | Field         | not triggered | can not be approved | MD_005         |
      | PAR5   | Field         | not triggered | can not be approved | ME_005         |
      | PAR5   | Field         | not triggered | can not be approved | MS_005         |
      | PAR5   | Field         | not triggered | can not be approved | NC_005         |
      | PAR5   | Field         | not triggered | can not be approved | NJ_005         |
      | PAR5   | Field         | not triggered | can not be approved | NY_005         |
      | PAR5   | Field         | not triggered | can not be approved | SC_005         |
      | PAR5   | Field         | not triggered | can not be approved | VA_005         |
      | PAR5   | Field         | not triggered | can not be approved | FL_005         |
      | PAR5   | Field         | not triggered | can not be approved | TX_005         |
      | PAR5   | Field         | not triggered | can not be approved | GA_005         |
      | PAR5   | Field         | not triggered | can not be approved | MI_005         |
      | PAR5   | Field         | not triggered | can not be approved | ID_005         |

    @PAR6
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | PAR6   | Field         | not triggered | can not be approved | AK_006         |
      | PAR6   | Field         | not triggered | can not be approved | AR_006         |
      | PAR6   | Field         | not triggered | can not be approved | AZ_006         |
      | PAR6   | Field         | not triggered | can not be approved | CO_006         |
      | PAR6   | Field         | not triggered | can not be approved | DC_006         |
      | PAR6   | Field         | not triggered | can not be approved | IA_006         |
      | PAR6   | Field         | not triggered | can not be approved | IL_006         |
      | PAR6   | Field         | not triggered | can not be approved | IN_006         |
      | PAR6   | Field         | not triggered | can not be approved | KS_006         |
      | PAR6   | Field         | not triggered | can not be approved | KY_006         |
      | PAR6   | Field         | not triggered | can not be approved | MN_006         |
      | PAR6   | Field         | not triggered | can not be approved | MO_006         |
      | PAR6   | Field         | not triggered | can not be approved | MT_006         |
      | PAR6   | Field         | not triggered | can not be approved | ND_006         |
      | PAR6   | Field         | not triggered | can not be approved | NE_006         |
      | PAR6   | Field         | not triggered | can not be approved | NH_006         |
      | PAR6   | Field         | not triggered | can not be approved | NM_006         |
      | PAR6   | Field         | not triggered | can not be approved | NV_006         |
      | PAR6   | Field         | not triggered | can not be approved | OH_006         |
      | PAR6   | Field         | not triggered | can not be approved | OK_006         |
      | PAR6   | Field         | not triggered | can not be approved | OR_006         |
      | PAR6   | Field         | not triggered | can not be approved | PA_006         |
      | PAR6   | Field         | not triggered | can not be approved | RI_006         |
      | PAR6   | Field         | not triggered | can not be approved | SD_006         |
      | PAR6   | Field         | not triggered | can not be approved | TN_006         |
      | PAR6   | Field         | not triggered | can not be approved | UT_006         |
      | PAR6   | Field         | not triggered | can not be approved | VT_006         |
      | PAR6   | Field         | not triggered | can not be approved | WA_006         |
      | PAR6   | Field         | not triggered | can not be approved | WI_006         |
      | PAR6   | Field         | not triggered | can not be approved | WV_006         |
      | PAR6   | Field         | not triggered | can not be approved | WY_006         |
      | PAR6   | Field         | not triggered | can not be approved | AL_006         |
      | PAR6   | Field         | not triggered | can not be approved | CA_006         |
      | PAR6   | Field         | not triggered | can not be approved | CT_006         |
      | PAR6   | Field         | not triggered | can not be approved | DE_006         |
      | PAR6   | Field         | not triggered | can not be approved | HI_006         |
      | PAR6   | Field         | not triggered | can not be approved | LA_006         |
      | PAR6   | Field         | not triggered | can not be approved | MA_006         |
      | PAR6   | Field         | not triggered | can not be approved | MD_006         |
      | PAR6   | Field         | not triggered | can not be approved | ME_006         |
      | PAR6   | Field         | not triggered | can not be approved | MS_006         |
      | PAR6   | Field         | not triggered | can not be approved | NC_006         |
      | PAR6   | Field         | not triggered | can not be approved | NJ_006         |
      | PAR6   | Field         | not triggered | can not be approved | NY_006         |
      | PAR6   | Field         | not triggered | can not be approved | SC_006         |
      | PAR6   | Field         | not triggered | can not be approved | VA_006         |
      | PAR6   | Field         | not triggered | can not be approved | FL_006         |
      | PAR6   | Field         | not triggered | can not be approved | TX_006         |
      | PAR6   | Field         | not triggered | can not be approved | GA_006         |
      | PAR6   | Field         | not triggered | can not be approved | MI_006         |
      | PAR6   | Field         | not triggered | can not be approved | ID_006         |