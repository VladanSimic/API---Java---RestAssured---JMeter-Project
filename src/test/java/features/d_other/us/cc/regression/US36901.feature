@CourseOfConstruction @US36901 @RegressionUS
Feature: US36901 - Update Referral & Validation Message for Mandatory Forms

  As an Underwriting Manager I want to update the referral
  and validation messages for the COC Mandatory Forms outlined
  below so that we have adequate verbiage on the UI

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId1>" is "<trigger1>" and that "<ruleId2>" is "<trigger2>" on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US36901" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleId1>" is "<trigger1>"
    * I verify that referral "<ruleId2>" is "<trigger2>"

    When I accept underwriting referrals

    Then I should not be able to bind

    @CCR12 @CCR13
    Examples:
      | ruleId1 | ruleId2 | role/sub-role | trigger1  | trigger2  | testCaseDataId | scenario |
      | CCR12   | CCR13   | Field         | triggered | triggered | FL_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | AZ_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | CA_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | CO_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | CT_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | DE_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | HI_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | ID_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | IL_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | MA_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | MD_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | ME_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | MT_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | NC_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | NJ_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | NM_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | NV_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | NY_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | OR_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | RI_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | SC_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | UT_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | VA_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | WA_001         | s1       |
      | CCR12   | CCR13   | Field         | triggered | triggered | WY_001         | s1       |

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId1>" is "<trigger1>" and that "<ruleId2>" is "<trigger2>" on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US36901" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleId1>" is "<trigger1>"
    * I verify that referral "<ruleId2>" is "<trigger2>"

    When I accept underwriting referrals

    Then I bind a CC quote

    @CCR12 @CCR13
    Examples:
      | ruleId1 | ruleId2 | role/sub-role | trigger1      | trigger2      | testCaseDataId | scenario |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | FL_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | AZ_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | CA_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | CO_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | CT_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | DE_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | HI_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | ID_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | IL_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | MA_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | MD_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | ME_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | MT_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | NC_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | NJ_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | NM_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | NV_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | NY_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | OR_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | RI_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | SC_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | UT_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | VA_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | WA_002         | s2       |
      | CCR12   | CCR13   | Field         | not triggered | not triggered | WY_002         | s2       |