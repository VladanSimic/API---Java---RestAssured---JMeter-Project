@CourseOfConstruction @US33585 @RegressionUS
Feature: US33585 - UW Rules & Referrals - Project Type

  As an Underwriting Manager I want underwriting referrals to fire
  when certain rules regarding project type are met so users are
  aware of COC guidelines

  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33585" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

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

    @CCR14 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR14  | Field         | triggered | can be approved | FL_001         | s1       |
      | CCR14  | Field         | triggered | can be approved | MD_001         | s1       |
      | CCR14  | Field         | triggered | can be approved | OR_001         | s1       |

    @CCR15 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR15  | Field         | triggered | can be approved | FL_002         | s1       |
      | CCR15  | Field         | triggered | can be approved | FL_003         | s1       |

    @CCR16 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR16  | Field         | triggered | can be approved | AZ_001         | s1       |
      | CCR16  | Field         | triggered | can be approved | IL_001         | s1       |
      | CCR16  | Field         | triggered | can be approved | ME_001         | s1       |
      | CCR16  | Field         | triggered | can be approved | MT_001         | s1       |
      | CCR16  | Field         | triggered | can be approved | FL_003         | s1       |
      | CCR16  | Field         | triggered | can be approved | FL_003         | s1       |

    @CCR17 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR17  | Field         | triggered | can be approved | CA_001         | s1       |
      | CCR17  | Field         | triggered | can be approved | MA_001         | s1       |

    @CCR18 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR18  | Field         | triggered | can be approved | CO_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | CT_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | DE_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | NC_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | NJ_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | NM_001         | s1       |
      | CCR18  | Field         | triggered | can be approved | VA_001         | s1       |

    @CCR19 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR19  | Field         | triggered | can be approved | HI_001         | s1       |
      | CCR19  | Field         | triggered | can be approved | ID_001         | s1       |

  Scenario Outline: Verify that rule: "<ruleId>" and "<ruleId1>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33585" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

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

    Then I verify that referral "<ruleId1>" is "<trigger>"
    * I verify that referral "<ruleId1>" "<approval>"

    @CCR18 @CCR19 @S1
    Examples:
      | ruleId | ruleId1 | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR18  | CCR19   | Field         | triggered | can be approved | NV_001         | s1       |
      | CCR18  | CCR19   | Field         | triggered | can be approved | NY_001         | s1       |
      | CCR18  | CCR19   | Field         | triggered | can be approved | RI_001         | s1       |
      | CCR18  | CCR19   | Field         | triggered | can be approved | VA_001         | s1       |

    @CCR16 @CCR17 @S1
    Examples:
      | ruleId | ruleId1 | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR16  | CCR17   | Field         | triggered | can be approved | SC_001         | s1       |
      | CCR16  | CCR17   | Field         | triggered | can be approved | UT_001         | s1       |
      | CCR16  | CCR17   | Field         | triggered | can be approved | WY_001         | s1       |