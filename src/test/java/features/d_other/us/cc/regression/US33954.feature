@CourseOfConstruction @US33954
Feature: US33954 - UW Rules & Referrals - Wildfire

  As an Underwriting Manager I want underwriting referrals
  to fire when certain rules regarding wildfire are met so
  users are aware of COC guidelines

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33954" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR6 @S2
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR6   | Field         | triggered | can be approved | AZ_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | CO_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | ID_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | MT_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | NM_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | NV_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | OR_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | UT_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | WA_002         | s2       |
      | CCR6   | Field         | triggered | can be approved | WY_002         | s2       |

    @CCR6 @S5
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR6   | Field         | triggered | can be approved | AZ_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | CO_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | ID_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | MT_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | NM_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | NV_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | OR_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | UT_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | WA_005         | s5       |
      | CCR6   | Field         | triggered | can be approved | WY_005         | s5       |

    @CCR6 @S8
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR6   | Field         | triggered | can be approved | AZ_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | CO_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | ID_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | MT_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | NM_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | NV_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | OR_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | UT_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | WA_008         | s8       |
      | CCR6   | Field         | triggered | can be approved | WY_008         | s8       |

    @CCR6 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR6   | UWManagerRole              | triggered | can be approved     | CO_002         | roles&subroles |
      | CCR6   | UnderwriterRole            | triggered | can be approved     | CO_002         | roles&subroles |
      | CCR6   | UnderwritingTechnicianRole | triggered | can not be approved | CO_002         | roles&subroles |

    @CCR6 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR6   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR6   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR6   | Field         | not triggered | can not be approved | UT_007         | negative |

    @CCR7 @S2
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | CO_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | ID_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | MT_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | NM_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | NV_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | OR_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | UT_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | WA_002         | s2       |
      | CCR7   | Field         | triggered | can be approved | WY_002         | s2       |

    @CCR7 @S3
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | CO_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | ID_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | MT_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | NM_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | NV_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | OR_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | UT_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | WA_003         | s3       |
      | CCR7   | Field         | triggered | can be approved | WY_003         | s3       |

    @CCR7 @S5
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | CO_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | ID_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | MT_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | NM_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | NV_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | OR_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | UT_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | WA_005         | s5       |
      | CCR7   | Field         | triggered | can be approved | WY_005         | s5       |

    @CCR7 @S6
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | CO_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | ID_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | MT_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | NM_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | NV_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | OR_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | UT_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | WA_006         | s6       |
      | CCR7   | Field         | triggered | can be approved | WY_006         | s6       |

    @CCR7 @S8
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | CO_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | ID_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | MT_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | NM_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | NV_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | OR_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | UT_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | WA_008         | s8       |
      | CCR7   | Field         | triggered | can be approved | WY_008         | s8       |

    @CCR7 @S9
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | CO_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | ID_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | MT_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | NM_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | NV_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | OR_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | UT_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | WA_009         | s9       |
      | CCR7   | Field         | triggered | can be approved | WY_009         | s9       |

    @CCR7 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR7   | UWManagerRole              | triggered | can be approved     | MT_003         | roles&subroles |
      | CCR7   | UnderwriterRole            | triggered | can be approved     | MT_003         | roles&subroles |
      | CCR7   | UnderwritingTechnicianRole | triggered | can not be approved | MT_003         | roles&subroles |

    @CCR7 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR7   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR7   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR7   | Field         | not triggered | can not be approved | UT_007         | negative |

    @CCR8 @S3
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can be approved | AZ_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | CO_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | ID_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | MT_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | NM_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | NV_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | OR_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | UT_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | WA_003         | s3       |
      | CCR8   | Field         | triggered | can be approved | WY_003         | s3       |

    @CCR8 @S6
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can be approved | AZ_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | CO_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | ID_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | MT_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | NM_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | NV_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | OR_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | UT_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | WA_006         | s6       |
      | CCR8   | Field         | triggered | can be approved | WY_006         | s6       |

    @CCR8 @S9
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can be approved | AZ_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | CO_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | ID_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | MT_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | NM_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | NV_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | OR_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | UT_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | WA_009         | s9       |
      | CCR8   | Field         | triggered | can be approved | WY_009         | s9       |

    @CCR8 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR8   | UWManagerRole              | triggered | can be approved     | WA_006         | roles&subroles |
      | CCR8   | UnderwriterRole            | triggered | can be approved     | WA_006         | roles&subroles |
      | CCR8   | UnderwritingTechnicianRole | triggered | can not be approved | WA_006         | roles&subroles |

    @CCR8 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR8   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR8   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR8   | Field         | not triggered | can not be approved | UT_007         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR6   | Field                      | triggered | can be approved     | AZ_002         | s2             |
      | CCR6   | Field                      | triggered | can be approved     | CO_002         | s2             |
      | CCR6   | Field                      | triggered | can be approved     | ID_005         | s5             |
      | CCR6   | Field                      | triggered | can be approved     | MT_005         | s5             |
      | CCR6   | Field                      | triggered | can be approved     | NM_008         | s8             |
      | CCR6   | Field                      | triggered | can be approved     | NV_008         | s8             |
      | CCR6   | Field                      | triggered | can be approved     | OR_008         | s8             |
      | CCR6   | UWManagerRole              | triggered | can be approved     | UT_008         | roles&subroles |
      | CCR6   | UnderwriterRole            | triggered | can be approved     | WA_008         | roles&subroles |
      | CCR6   | UnderwritingTechnicianRole | triggered | can not be approved | WY_008         | roles&subroles |
      | CCR7   | Field                      | triggered | can be approved     | AZ_002         | s2             |
      | CCR7   | Field                      | triggered | can be approved     | CO_002         | s2             |
      | CCR7   | Field                      | triggered | can be approved     | ID_003         | s3             |
      | CCR7   | Field                      | triggered | can be approved     | MT_003         | s3             |
      | CCR7   | Field                      | triggered | can be approved     | NM_005         | s5             |
      | CCR7   | Field                      | triggered | can be approved     | NV_005         | s5             |
      | CCR7   | Field                      | triggered | can be approved     | OR_006         | s6             |
      | CCR7   | Field                      | triggered | can be approved     | UT_006         | s6             |
      | CCR7   | Field                      | triggered | can be approved     | WA_008         | s8             |
      | CCR7   | Field                      | triggered | can be approved     | WY_008         | s8             |
      | CCR7   | Field                      | triggered | can be approved     | CO_009         | s9             |
      | CCR7   | Field                      | triggered | can be approved     | ID_009         | s9             |
      | CCR7   | UWManagerRole              | triggered | can be approved     | MT_003         | roles&subroles |
      | CCR7   | UnderwriterRole            | triggered | can be approved     | MT_003         | roles&subroles |
      | CCR7   | UnderwritingTechnicianRole | triggered | can not be approved | MT_003         | roles&subroles |
      | CCR8   | Field                      | triggered | can be approved     | AZ_003         | s3             |
      | CCR8   | Field                      | triggered | can be approved     | CO_003         | s3             |
      | CCR8   | Field                      | triggered | can be approved     | ID_006         | s6             |
      | CCR8   | Field                      | triggered | can be approved     | MT_006         | s6             |
      | CCR8   | Field                      | triggered | can be approved     | NM_009         | s9             |
      | CCR8   | Field                      | triggered | can be approved     | NV_009         | s9             |
      | CCR8   | Field                      | triggered | can be approved     | OR_009         | s9             |
      | CCR8   | UWManagerRole              | triggered | can be approved     | OR_009         | roles&subroles |
      | CCR8   | UnderwriterRole            | triggered | can be approved     | UT_009         | roles&subroles |
      | CCR8   | UnderwritingTechnicianRole | triggered | can not be approved | WA_009         | roles&subroles |

  @Endorsement
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC endorsement for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33954" in sheet "QuoteCreatorCC" for "CC" LOB

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
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @CCR6 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR6   | Field         | not triggered | can not be approved | AZ_006         | negative |

    @CCR7 @S4
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can be approved | AZ_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | CO_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | ID_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | MT_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | NM_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | NV_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | OR_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | UT_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | WA_004         | s4       |
      | CCR7   | Field         | triggered | can be approved | WY_004         | s4       |

    @CCR7 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR7   | UWManagerRole              | triggered | can be approved     | AZ_004         | roles&subroles |
      | CCR7   | UnderwriterRole            | triggered | can be approved     | AZ_004         | roles&subroles |
      | CCR7   | UnderwritingTechnicianRole | triggered | can not be approved | AZ_004         | roles&subroles |

    @CCR7 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR7   | Field         | not triggered | can not be approved | AZ_006         | negative |

    @CCR8 @S4
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can be approved | AZ_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | CO_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | ID_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | MT_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | NM_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | NV_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | OR_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | UT_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | WA_004         | s4       |
      | CCR8   | Field         | triggered | can be approved | WY_004         | s4       |

    @CCR8 @S5
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can be approved | AZ_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | CO_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | ID_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | MT_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | NM_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | NV_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | OR_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | UT_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | WA_005         | s5       |
      | CCR8   | Field         | triggered | can be approved | WY_005         | s5       |

    @CCR8 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR8   | UWManagerRole              | triggered | can be approved     | NM_005         | roles&subroles |
      | CCR8   | UnderwriterRole            | triggered | can be approved     | NM_005         | roles&subroles |
      | CCR8   | UnderwritingTechnicianRole | triggered | can not be approved | NM_005         | roles&subroles |

    @CCR8 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR8   | Field         | not triggered | can not be approved | AZ_006         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario       |
      | CCR7   | Field                      | triggered | can be approved     | AZ_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | CO_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | ID_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | MT_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | NM_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | NV_004         | s4             |
      | CCR7   | Field                      | triggered | can be approved     | OR_004         | s4             |
      | CCR7   | UWManagerRole              | triggered | can be approved     | UT_004         | roles&subroles |
      | CCR7   | UnderwriterRole            | triggered | can be approved     | WA_004         | roles&subroles |
      | CCR7   | UnderwritingTechnicianRole | triggered | can not be approved | WY_004         | roles&subroles |
      | CCR8   | Field                      | triggered | can be approved     | AZ_004         | s4             |
      | CCR8   | Field                      | triggered | can be approved     | CO_004         | s4             |
      | CCR8   | Field                      | triggered | can be approved     | ID_004         | s4             |
      | CCR8   | Field                      | triggered | can be approved     | MT_004         | s4             |
      | CCR8   | Field                      | triggered | can be approved     | NM_004         | s4             |
      | CCR8   | Field                      | triggered | can be approved     | NV_005         | s5             |
      | CCR8   | Field                      | triggered | can be approved     | OR_005         | s5             |
      | CCR8   | UWManagerRole              | triggered | can be approved     | UT_005         | roles&subroles |
      | CCR8   | UnderwriterRole            | triggered | can be approved     | WA_005         | roles&subroles |
      | CCR8   | UnderwritingTechnicianRole | triggered | can not be approved | WY_005         | roles&subroles |

  @NewBusinessRewrite
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business rewrite for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33954" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR6 @S8
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR6   | Field         | triggered | can not be approved | AZ_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | CO_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | ID_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | MT_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | NM_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | NV_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | OR_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | UT_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | WA_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | WY_008         | s8       |

    @CCR6 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR6   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR6   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR6   | Field         | not triggered | can not be approved | UT_007         | negative |

    @CCR7 @S8
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can not be approved | AZ_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | CO_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | ID_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | MT_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | NM_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | NV_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | OR_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | UT_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | WA_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | WY_008         | s8       |

    @CCR7 @S9
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR7   | Field         | triggered | can not be approved | AZ_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | CO_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | ID_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | MT_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | NM_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | NV_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | OR_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | UT_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | WA_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | WY_009         | s9       |

    @CCR7 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR7   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR7   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR7   | Field         | not triggered | can not be approved | UT_007         | negative |

    @CCR8 @S9
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR8   | Field         | triggered | can not be approved | AZ_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | CO_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | ID_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | MT_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | NM_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | NV_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | OR_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | UT_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | WA_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | WY_009         | s9       |

    @CCR8 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR8   | Field         | not triggered | can not be approved | AZ_001         | negative |
      | CCR8   | Field         | not triggered | can not be approved | NM_004         | negative |
      | CCR8   | Field         | not triggered | can not be approved | UT_007         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR6   | Field         | triggered | can not be approved | AZ_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | CO_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | ID_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | MT_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | NM_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | NV_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | OR_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | UT_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | WA_008         | s8       |
      | CCR6   | Field         | triggered | can not be approved | WY_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | AZ_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | CO_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | ID_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | MT_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | NM_008         | s8       |
      | CCR7   | Field         | triggered | can not be approved | NV_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | OR_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | UT_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | WA_009         | s9       |
      | CCR7   | Field         | triggered | can not be approved | WY_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | AZ_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | CO_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | ID_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | MT_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | NM_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | NV_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | OR_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | UT_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | WA_009         | s9       |
      | CCR8   | Field         | triggered | can not be approved | WY_009         | s9       |