@CourseOfConstruction @US33956
Feature: US33956 - UW Rules & Referrals - General Contractor Information

  As an Underwriting Manager I want underwriting referrals to fire
  when certain rules regarding general contractor information are met
  so users are aware of COC

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business.

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33956" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR1
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId |
      | CCR1   | Field                      | triggered     | can be approved     | FL_001         |
      | CCR1   | Field                      | not triggered | can not be approved | FL_002         |
      | CCR1   | Zonal                      | triggered     | can be approved     | FL_001         |
      | CCR1   | RUM                        | triggered     | can be approved     | FL_001         |
      | CCR1   | Specialist1                | triggered     | can be approved     | FL_001         |
      | CCR1   | Specialist2                | triggered     | can be approved     | FL_001         |
      | CCR1   | Senderwriter               | triggered     | can be approved     | FL_001         |
      | CCR1   | Underwriter1               | triggered     | can be approved     | FL_001         |
      | CCR1   | Underwriter2               | triggered     | can be approved     | FL_001         |
      | CCR1   | Analyst                    | triggered     | can be approved     | FL_001         |
      | CCR1   | UWSA1                      | triggered     | can be approved     | FL_001         |
      | CCR1   | UWSA2                      | triggered     | can be approved     | FL_001         |
      | CCR1   | UWSSA                      | triggered     | can be approved     | FL_001         |
      | CCR1   | UWSRM                      | triggered     | can be approved     | FL_001         |
      | CCR1   | SeniorUWManagementRole     | triggered     | can be approved     | FL_001         |
      | CCR1   | UWManagerRole              | triggered     | can be approved     | FL_001         |
      | CCR1   | UnderwriterRole            | triggered     | can be approved     | FL_001         |
      | CCR1   | UnderwritingTechnicianRole | triggered     | can not be approved | FL_001         |
      | CCR1   | SeniorUWTechnicianRole     | triggered     | can not be approved | FL_001         |

    @CCR2
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId |
      | CCR2   | Field                      | triggered     | can be approved     | FL_003         |
      | CCR2   | Field                      | not triggered | can not be approved | FL_004         |
      | CCR2   | Zonal                      | triggered     | can be approved     | FL_003         |
      | CCR2   | RUM                        | triggered     | can be approved     | FL_003         |
      | CCR2   | Specialist1                | triggered     | can be approved     | FL_003         |
      | CCR2   | Specialist2                | triggered     | can be approved     | FL_003         |
      | CCR2   | Senderwriter               | triggered     | can be approved     | FL_003         |
      | CCR2   | Underwriter1               | triggered     | can be approved     | FL_003         |
      | CCR2   | Underwriter2               | triggered     | can be approved     | FL_003         |
      | CCR2   | Analyst                    | triggered     | can be approved     | FL_003         |
      | CCR2   | UWSA1                      | triggered     | can not be approved | FL_003         |
      | CCR2   | UWSA2                      | triggered     | can not be approved | FL_003         |
      | CCR2   | UWSSA                      | triggered     | can not be approved | FL_003         |
      | CCR2   | UWSRM                      | triggered     | can not be approved | FL_003         |
      | CCR2   | SeniorUWManagementRole     | triggered     | can be approved     | FL_003         |
      | CCR2   | UWManagerRole              | triggered     | can be approved     | FL_003         |
      | CCR2   | UnderwriterRole            | triggered     | can be approved     | FL_003         |
      | CCR2   | UnderwritingTechnicianRole | triggered     | can not be approved | FL_003         |
      | CCR2   | SeniorUWTechnicianRole     | triggered     | can not be approved | FL_003         |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId |
      | CCR1   | Field                      | triggered     | can be approved     | FL_001         |
      | CCR1   | Field                      | not triggered | can not be approved | FL_002         |
      | CCR1   | SeniorUWManagementRole     | triggered     | can be approved     | FL_001         |
      | CCR1   | UWManagerRole              | triggered     | can be approved     | FL_001         |
      | CCR1   | UnderwriterRole            | triggered     | can be approved     | FL_001         |
      | CCR1   | UnderwritingTechnicianRole | triggered     | can not be approved | FL_001         |
      | CCR1   | SeniorUWTechnicianRole     | triggered     | can not be approved | FL_001         |
      | CCR2   | Field                      | triggered     | can be approved     | FL_003         |
      | CCR2   | Field                      | not triggered | can not be approved | FL_004         |
      | CCR2   | UWSA1                      | triggered     | can not be approved | FL_003         |
      | CCR2   | SeniorUWManagementRole     | triggered     | can be approved     | FL_003         |
      | CCR2   | UWManagerRole              | triggered     | can be approved     | FL_003         |
      | CCR2   | UnderwriterRole            | triggered     | can be approved     | FL_003         |
      | CCR2   | UnderwritingTechnicianRole | triggered     | can not be approved | FL_003         |
      | CCR2   | SeniorUWTechnicianRole     | triggered     | can not be approved | FL_003         |