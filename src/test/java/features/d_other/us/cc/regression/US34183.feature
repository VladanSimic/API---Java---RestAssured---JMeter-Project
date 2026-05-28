@CourseOfConstruction @US34183
Feature: US34183 - UW Rules & Referrals - Additional Interest

  As an Underwriting Manager I want a referral to fire when the additional
  interest type is other than mortgagee for COC so that we can confirm the
  party's interest in the policy

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>" - "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US34183" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR9 @Positive
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR9   | Field         | triggered | can be approved | FL_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | AZ_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | CA_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | CO_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | CT_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | DE_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | HI_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | ID_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | IL_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | MA_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | MD_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | ME_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | MT_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | NC_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | NJ_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | NM_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | NV_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | NY_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | OR_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | RI_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | SC_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | UT_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | VA_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | WA_002         | Positive |
      | CCR9   | Field         | triggered | can be approved | WY_002         | Positive |

    @CCR9 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR9   | UWManagerRole              | triggered | can be approved     | FL_002         | Roles&subroles |
      | CCR9   | UnderwriterRole            | triggered | can be approved     | FL_002         | Roles&subroles |
      | CCR9   | UnderwritingTechnicianRole | triggered | can not be approved | FL_002         | Roles&subroles |

    @CCR9 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR9   | Field         | not triggered | can not be approved | FL_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | AZ_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CO_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | DE_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | HI_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ID_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | IL_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MD_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ME_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NC_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NJ_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NM_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NV_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NY_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | OR_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | RI_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | SC_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | UT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | VA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WY_001         | Negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario |
      | CCR9   | Field                      | triggered | can be approved     | FL_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | AZ_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CA_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CO_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CT_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | DE_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | HI_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | ID_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | IL_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MA_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MD_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | ME_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MT_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NC_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NJ_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NM_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NV_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NY_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | OR_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | RI_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | SC_002         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | UT_002         | Positive |
      | CCR9   | UWManagerRole              | triggered | can be approved     | VA_002         | Positive |
      | CCR9   | UnderwriterRole            | triggered | can be approved     | WA_002         | Positive |
      | CCR9   | UnderwritingTechnicianRole | triggered | can not be approved | WY_002         | Positive |

  @NewBusinessRewrite
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business rewrite for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US34183" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    When I add changes on "CC" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @CCR9 @Positive
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR9   | Field         | triggered | can not be approved | FL_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | AZ_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CO_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | DE_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | HI_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | ID_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | IL_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MD_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | ME_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NC_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NJ_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NM_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NV_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NY_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | OR_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | RI_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | SC_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | UT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | VA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | WA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | WY_002         | Positive |

    @CCR9 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR9   | Field         | not triggered | can not be approved | FL_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | AZ_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CO_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | DE_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | HI_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ID_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | IL_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MD_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ME_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NC_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NJ_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NM_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NV_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NY_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | OR_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | RI_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | SC_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | UT_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | VA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WA_001         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WY_001         | Negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR9   | Field         | triggered | can not be approved | FL_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | AZ_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CO_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | CT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | DE_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | HI_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | ID_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | IL_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MD_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | ME_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | MT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NC_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NJ_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NM_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NV_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | NY_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | OR_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | RI_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | SC_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | UT_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | VA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | WA_002         | Positive |
      | CCR9   | Field         | triggered | can not be approved | WY_002         | Positive |

  @Endorsement
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC endorsement for "<testCaseDataId>" - "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US34183" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I am logged in to Pure as "<role/sub-role>"
    * I navigate to policies
    * I select a policy by ID
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @CCR9 @Positive
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR9   | Field         | triggered | can be approved | FL_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | AZ_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | CA_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | CO_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | CT_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | DE_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | HI_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | ID_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | IL_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | MA_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | MD_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | ME_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | MT_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | NC_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | NJ_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | NM_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | NV_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | NY_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | OR_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | RI_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | SC_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | UT_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | VA_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | WA_004         | Positive |
      | CCR9   | Field         | triggered | can be approved | WY_004         | Positive |

    @CCR9 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR9   | UWManagerRole              | triggered | can be approved     | NY_004         | Roles&subroles |
      | CCR9   | UnderwriterRole            | triggered | can be approved     | NY_004         | Roles&subroles |
      | CCR9   | UnderwritingTechnicianRole | triggered | can not be approved | NY_004         | Roles&subroles |

    @CCR9 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR9   | Field         | not triggered | can not be approved | FL_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | AZ_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CA_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CO_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | CT_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | DE_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | HI_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ID_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | IL_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MA_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MD_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | ME_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | MT_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NC_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NJ_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NM_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NV_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | NY_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | OR_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | RI_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | SC_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | UT_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | VA_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WA_003         | Negative |
      | CCR9   | Field         | not triggered | can not be approved | WY_003         | Negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario |
      | CCR9   | Field                      | triggered | can be approved     | FL_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | AZ_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CA_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CO_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | CT_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | DE_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | HI_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | ID_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | IL_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MA_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MD_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | ME_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | MT_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NC_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NJ_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NM_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NV_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | NY_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | OR_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | RI_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | SC_004         | Positive |
      | CCR9   | Field                      | triggered | can be approved     | UT_004         | Positive |
      | CCR9   | UWManagerRole              | triggered | can be approved     | VA_004         | Positive |
      | CCR9   | UnderwriterRole            | triggered | can be approved     | WA_004         | Positive |
      | CCR9   | UnderwritingTechnicianRole | triggered | can not be approved | WY_004         | Positive |