@PersonalAuto @US42629
Feature: US42629 - Carfax - Apply Depreciation Logic to Miscellaneous and vehicles with symbols of 98 and 99

  As a Product Manager I want to apply depreciation to more vehicles on
  our auto policies so that we are rating and underwriting risks effectively.

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on PA new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US42629" in sheet "QuoteCreatorPA" for "PA" LOB

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

    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId |
      | PAR1   | Field         | triggered | can be approved | AK_001         |
      | PAR1   | Field         | triggered | can be approved | AR_001         |
      | PAR1   | Field         | triggered | can be approved | AZ_001         |
      | PAR1   | Field         | triggered | can be approved | CO_001         |
      | PAR1   | Field         | triggered | can be approved | DC_001         |
      | PAR1   | Field         | triggered | can be approved | IA_001         |
      | PAR1   | Field         | triggered | can be approved | IL_001         |
      | PAR1   | Field         | triggered | can be approved | IN_001         |
      | PAR1   | Field         | triggered | can be approved | KS_001         |
      | PAR1   | Field         | triggered | can be approved | KY_001         |
      | PAR1   | Field         | triggered | can be approved | MN_001         |
      | PAR1   | Field         | triggered | can be approved | MO_001         |
      | PAR1   | Field         | triggered | can be approved | MT_001         |
      | PAR1   | Field         | triggered | can be approved | ND_001         |
      | PAR1   | Field         | triggered | can be approved | NE_001         |
      | PAR1   | Field         | triggered | can be approved | NH_001         |
      | PAR1   | Field         | triggered | can be approved | NM_001         |
      | PAR1   | Field         | triggered | can be approved | NV_001         |
      | PAR1   | Field         | triggered | can be approved | OH_001         |
      | PAR1   | Field         | triggered | can be approved | OK_001         |
      | PAR1   | Field         | triggered | can be approved | OR_001         |
      | PAR1   | Field         | triggered | can be approved | PA_001         |
      | PAR1   | Field         | triggered | can be approved | RI_001         |
      | PAR1   | Field         | triggered | can be approved | SD_001         |
      | PAR1   | Field         | triggered | can be approved | TN_001         |
      | PAR1   | Field         | triggered | can be approved | UT_001         |
      | PAR1   | Field         | triggered | can be approved | VT_001         |
      | PAR1   | Field         | triggered | can be approved | WA_001         |
      | PAR1   | Field         | triggered | can be approved | WI_001         |
      | PAR1   | Field         | triggered | can be approved | WV_001         |
      | PAR1   | Field         | triggered | can be approved | WY_001         |
      | PAR1   | Field         | triggered | can be approved | AL_001         |
      | PAR1   | Field         | triggered | can be approved | CA_001         |
      | PAR1   | Field         | triggered | can be approved | CT_001         |
      | PAR1   | Field         | triggered | can be approved | DE_001         |
      | PAR1   | Field         | triggered | can be approved | HI_001         |
      | PAR1   | Field         | triggered | can be approved | LA_001         |
      | PAR1   | Field         | triggered | can be approved | MA_001         |
      | PAR1   | Field         | triggered | can be approved | MD_001         |
      | PAR1   | Field         | triggered | can be approved | ME_001         |
      | PAR1   | Field         | triggered | can be approved | MS_001         |
      | PAR1   | Field         | triggered | can be approved | NC_001         |
      | PAR1   | Field         | triggered | can be approved | NJ_001         |
      | PAR1   | Field         | triggered | can be approved | NY_001         |
      | PAR1   | Field         | triggered | can be approved | SC_001         |
      | PAR1   | Field         | triggered | can be approved | VA_001         |
      | PAR1   | Field         | triggered | can be approved | FL_001         |
      | PAR1   | Field         | triggered | can be approved | TX_001         |
      | PAR1   | Field         | triggered | can be approved | GA_001         |
      | PAR1   | Field         | triggered | can be approved | MI_001         |
      | PAR1   | Field         | triggered | can be approved | ID_001         |