@CourseOfConstruction @US34182
Feature: US34182 - UW Rules & Referrals - Insurance Score

  As an Underwriting Manager I want a referral to fire when insurance
  score is low so users are aware of COC guidelines

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US34182" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @CCR5
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId |
      | CCR5   | Field                      | triggered     | can be approved     | FL_001         |
      | CCR5   | Field                      | not triggered | can not be approved | FL_002         |
      | CCR5   | Zonal                      | triggered     | can be approved     | FL_001         |
      | CCR5   | RUM                        | triggered     | can be approved     | FL_001         |
      | CCR5   | Specialist1                | triggered     | can be approved     | FL_001         |
      | CCR5   | Specialist2                | triggered     | can be approved     | FL_001         |
      | CCR5   | SeniorUnderwriter          | triggered     | can be approved     | FL_001         |
      | CCR5   | Underwriter1               | triggered     | can be approved     | FL_001         |
      | CCR5   | Underwriter2               | triggered     | can be approved     | FL_001         |
      | CCR5   | Analyst                    | triggered     | can be approved     | FL_001         |
      | CCR5   | UWSA1                      | triggered     | can be approved     | FL_001         |
      | CCR5   | UWSA2                      | triggered     | can be approved     | FL_001         |
      | CCR5   | UWSSA                      | triggered     | can be approved     | FL_001         |
      | CCR5   | UWSRM                      | triggered     | can be approved     | FL_001         |
      | CCR5   | SeniorUWManagementRole     | triggered     | can be approved     | FL_001         |
      | CCR5   | UWManagerRole              | triggered     | can be approved     | FL_001         |
      | CCR5   | UnderwriterRole            | triggered     | can be approved     | FL_001         |
      | CCR5   | UnderwritingTechnicianRole | triggered     | can not be approved | FL_001         |
      | CCR5   | SeniorUWTechnicianRole     | triggered     | can not be approved | FL_001         |
      | CCR5   | Field                      | triggered     | can be approved     | MA_001         |
      | CCR5   | Field                      | triggered     | can be approved     | NY_001         |
      | CCR5   | Field                      | triggered     | can be approved     | CT_001         |
      | CCR5   | Field                      | triggered     | can be approved     | DE_001         |
      | CCR5   | Field                      | triggered     | can be approved     | HI_001         |
      | CCR5   | Field                      | triggered     | can be approved     | MD_001         |
      | CCR5   | Field                      | triggered     | can be approved     | ME_001         |
      | CCR5   | Field                      | triggered     | can be approved     | NC_001         |
      | CCR5   | Field                      | triggered     | can be approved     | NJ_001         |
      | CCR5   | Field                      | triggered     | can be approved     | RI_001         |
      | CCR5   | Field                      | triggered     | can be approved     | SC_001         |
      | CCR5   | Field                      | triggered     | can be approved     | VA_001         |
      | CCR5   | Field                      | triggered     | can be approved     | AZ_001         |
      | CCR5   | Field                      | triggered     | can be approved     | CA_001         |
      | CCR5   | Field                      | triggered     | can be approved     | CO_001         |
      | CCR5   | Field                      | triggered     | can be approved     | ID_001         |
      | CCR5   | Field                      | triggered     | can be approved     | MT_001         |
      | CCR5   | Field                      | triggered     | can be approved     | NM_001         |
      | CCR5   | Field                      | triggered     | can be approved     | NV_001         |
      | CCR5   | Field                      | triggered     | can be approved     | OR_001         |
      | CCR5   | Field                      | triggered     | can be approved     | UT_001         |
      | CCR5   | Field                      | triggered     | can be approved     | WA_001         |
      | CCR5   | Field                      | triggered     | can be approved     | WY_001         |
      | CCR5   | Field                      | triggered     | can be approved     | IL_001         |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId |
      | CCR5   | Field         | triggered     | can be approved     | FL_001         |
      | CCR5   | Field         | triggered     | can be approved     | FL_002         |
      | CCR5   | Field         | triggered     | can be approved     | MA_001         |
      | CCR5   | Field         | triggered     | can be approved     | NY_001         |
      | CCR5   | Field         | triggered     | can be approved     | CT_001         |
      | CCR5   | Field         | triggered     | can be approved     | DE_001         |
      | CCR5   | Field         | not triggered | can not be approved | HI_001         |
      | CCR5   | Field         | triggered     | can be approved     | ME_001         |
      | CCR5   | Field         | triggered     | can be approved     | NC_001         |
      | CCR5   | Field         | triggered     | can be approved     | NJ_001         |
      | CCR5   | Field         | triggered     | can be approved     | RI_001         |
      | CCR5   | Field         | triggered     | can be approved     | SC_001         |
      | CCR5   | Field         | triggered     | can be approved     | VA_001         |
      | CCR5   | Field         | triggered     | can be approved     | AZ_001         |
      | CCR5   | Field         | not triggered | can not be approved | CA_001         |
      | CCR5   | Field         | triggered     | can be approved     | CO_001         |
      | CCR5   | Field         | triggered     | can be approved     | ID_001         |
      | CCR5   | Field         | triggered     | can be approved     | MT_001         |
      | CCR5   | Field         | triggered     | can be approved     | NM_001         |
      | CCR5   | Field         | triggered     | can be approved     | NV_001         |
      | CCR5   | Field         | triggered     | can be approved     | OR_001         |
      | CCR5   | Field         | triggered     | can be approved     | UT_001         |
      | CCR5   | Field         | triggered     | can be approved     | WA_001         |
      | CCR5   | Field         | triggered     | can be approved     | WY_001         |
      | CCR5   | Field         | triggered     | can be approved     | IL_001         |