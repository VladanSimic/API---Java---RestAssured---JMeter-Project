@CourseOfConstruction @US33953
Feature: US33953 - UW Rules & Referrals - Optional Coverages

  As an Underwriting Manager I want underwriting referrals to fire
  when certain rules regarding optional coverage endorsements are met
  so users are aware of COC guidelines

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33953_Referrals" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR10 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR10  | Field         | triggered | can be approved | FL_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | AZ_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | CA_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | CO_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | CT_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | DE_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | HI_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | ID_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | IL_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | MA_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | MD_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | ME_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | MT_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | NC_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | NJ_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | NM_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | NV_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | NY_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | OR_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | RI_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | SC_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | UT_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | VA_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | WA_001         | s1       |
      | CCR10  | Field         | triggered | can be approved | WY_001         | s1       |

    @CCR10 @S2
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR10  | Field         | triggered | can be approved | FL_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | AZ_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | CA_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | CO_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | CT_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | DE_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | HI_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | ID_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | IL_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | MA_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | MD_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | ME_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | MT_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | NC_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | NJ_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | NM_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | NV_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | NY_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | OR_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | RI_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | SC_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | UT_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | VA_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | WA_005         | s2       |
      | CCR10  | Field         | triggered | can be approved | WY_005         | s2       |

    @CCR10 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR10  | UWManagerRole              | triggered | can be approved     | FL_001         | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered | can be approved     | AZ_001         | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered | can not be approved | CA_001         | roles&subroles s1 |

    @CCR10 @S2 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR10  | UWManagerRole              | triggered | can be approved     | FL_001         | roles&subroles s2 |
      | CCR10  | UnderwriterRole            | triggered | can be approved     | AZ_001         | roles&subroles s2 |
      | CCR10  | UnderwritingTechnicianRole | triggered | can not be approved | CA_001         | roles&subroles s2 |

    @CCR10 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR10  | Field         | not triggered | can not be approved | ID_002         | negative |
      | CCR10  | Field         | not triggered | can not be approved | IL_003         | negative |
      | CCR10  | Field         | not triggered | can not be approved | MA_004         | negative |
      | CCR10  | Field         | not triggered | can not be approved | MD_006         | negative |

    @CCR11 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR11  | Field         | triggered | can be approved | FL_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | AZ_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | CA_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | CO_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | CT_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | DE_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | HI_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | ID_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | IL_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | MA_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | MD_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | ME_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | MT_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | NC_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | NJ_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | NM_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | NV_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | NY_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | OR_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | RI_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | SC_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | UT_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | VA_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | WA_002         | s1       |
      | CCR11  | Field         | triggered | can be approved | WY_002         | s1       |

    @CCR11 @S2
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR11  | Field         | triggered | can be approved | FL_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | AZ_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | CA_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | CO_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | CT_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | DE_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | HI_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | ID_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | IL_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | MA_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | MD_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | ME_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | MT_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | NC_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | NJ_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | NM_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | NV_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | NY_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | OR_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | RI_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | SC_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | UT_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | VA_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | WA_006         | s2       |
      | CCR11  | Field         | triggered | can be approved | WY_006         | s2       |

    @CCR11 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR11  | UWManagerRole              | triggered | can be approved     | FL_002         | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered | can be approved     | AZ_002         | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered | can not be approved | CA_002         | roles&subroles s1 |

    @CCR11 @S2 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR11  | UWManagerRole              | triggered | can be approved     | FL_006         | roles&subroles s2 |
      | CCR11  | UnderwriterRole            | triggered | can be approved     | AZ_006         | roles&subroles s2 |
      | CCR11  | UnderwritingTechnicianRole | triggered | can not be approved | CA_006         | roles&subroles s2 |

    @CCR11 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR11  | Field         | not triggered | can not be approved | ID_001         | negative |
      | CCR11  | Field         | not triggered | can not be approved | IL_003         | negative |
      | CCR11  | Field         | not triggered | can not be approved | MA_004         | negative |
      | CCR11  | Field         | not triggered | can not be approved | MD_005         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId | scenario          |
      | CCR10  | Field                      | triggered     | can be approved     | FL_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | AZ_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | CA_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | CO_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | CT_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | DE_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | HI_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | ID_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | IL_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | MA_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | MD_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | ME_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | MT_001         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NC_005         | s2                |
      | CCR10  | Field                      | triggered     | can be approved     | NJ_005         | s2                |
      | CCR10  | Field                      | triggered     | can be approved     | NM_005         | s2                |
      | CCR10  | Field                      | triggered     | can be approved     | NV_005         | s2                |
      | CCR10  | Field                      | triggered     | can be approved     | NY_005         | s2                |
      | CCR10  | Field                      | triggered     | can be approved     | OR_005         | s2                |
      | CCR10  | UWManagerRole              | triggered     | can be approved     | RI_001         | roles&subroles s2 |
      | CCR10  | UnderwriterRole            | triggered     | can be approved     | SC_001         | roles&subroles s2 |
      | CCR10  | UnderwritingTechnicianRole | triggered     | can not be approved | UT_001         | roles&subroles s2 |
      | CCR10  | UWManagerRole              | triggered     | can be approved     | VA_005         | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered     | can be approved     | WA_005         | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_005         | roles&subroles s1 |
      | CCR10  | Field                      | not triggered | can not be approved | ID_002         | negative          |
      | CCR10  | Field                      | not triggered | can not be approved | IL_003         | negative          |
      | CCR10  | Field                      | not triggered | can not be approved | MA_004         | negative          |
      | CCR10  | Field                      | not triggered | can not be approved | MD_006         | negative          |
      | CCR11  | Field                      | triggered     | can be approved     | FL_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | AZ_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CA_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CO_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CT_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | DE_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | HI_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | ID_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | IL_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | MA_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | MD_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | ME_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | MT_002         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | NC_006         | s2                |
      | CCR11  | Field                      | triggered     | can be approved     | NJ_006         | s2                |
      | CCR11  | Field                      | triggered     | can be approved     | NM_006         | s2                |
      | CCR11  | Field                      | triggered     | can be approved     | NV_006         | s2                |
      | CCR11  | Field                      | triggered     | can be approved     | NY_006         | s2                |
      | CCR11  | Field                      | triggered     | can be approved     | OR_006         | s2                |
      | CCR11  | UWManagerRole              | triggered     | can be approved     | RI_002         | roles&subroles s2 |
      | CCR11  | UnderwriterRole            | triggered     | can be approved     | SC_002         | roles&subroles s2 |
      | CCR11  | UnderwritingTechnicianRole | triggered     | can not be approved | UT_002         | roles&subroles s2 |
      | CCR11  | UWManagerRole              | triggered     | can be approved     | VA_006         | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered     | can be approved     | WA_006         | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_006         | roles&subroles s1 |
      | CCR11  | Field                      | not triggered | can not be approved | ID_001         | negative          |
      | CCR11  | Field                      | not triggered | can not be approved | IL_003         | negative          |
      | CCR11  | Field                      | not triggered | can not be approved | MA_004         | negative          |
      | CCR11  | Field                      | not triggered | can not be approved | MD_005         | negative          |

  @Endorsement
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC endorsement for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33953_Referrals" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR10 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR10  | Field         | triggered | can be approved | FL_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | AZ_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | CA_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | CO_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | CT_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | DE_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | HI_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | ID_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | IL_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | MA_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | MD_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | ME_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | MT_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | NC_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | NJ_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | NM_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | NV_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | NY_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | OR_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | RI_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | SC_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | UT_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | VA_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | WA_003         | s1       |
      | CCR10  | Field         | triggered | can be approved | WY_003         | s1       |

    @CCR10 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR10  | UWManagerRole              | triggered | can be approved     | FL_003         | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered | can be approved     | AZ_003         | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered | can not be approved | CA_003         | roles&subroles s1 |

    @CCR10 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR10  | Field         | not triggered | can not be approved | ID_001         | negative |
      | CCR10  | Field         | not triggered | can not be approved | IL_002         | negative |
      | CCR10  | Field         | not triggered | can not be approved | MA_004         | negative |

    @CCR11 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | scenario |
      | CCR11  | Field         | triggered | can be approved | FL_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | AZ_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | CA_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | CO_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | CT_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | DE_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | HI_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | ID_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | IL_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | MA_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | MD_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | ME_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | MT_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | NC_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | NJ_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | NM_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | NV_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | NY_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | OR_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | RI_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | SC_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | UT_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | VA_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | WA_004         | s1       |
      | CCR11  | Field         | triggered | can be approved | WY_004         | s1       |

    @CCR11 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | scenario          |
      | CCR11  | UWManagerRole              | triggered | can be approved     | FL_004         | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered | can be approved     | AZ_004         | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered | can not be approved | CA_004         | roles&subroles s1 |

    @CCR11 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR11  | Field         | not triggered | can not be approved | ID_001         | negative |
      | CCR11  | Field         | not triggered | can not be approved | IL_003         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId | scenario          |
      | CCR10  | Field                      | triggered     | can be approved     | NC_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NJ_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NM_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NV_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NY_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | OR_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | RI_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | SC_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | UT_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | VA_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | WA_003         | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | WY_003         | s1                |
      | CCR10  | UWManagerRole              | triggered     | can be approved     | VA_003         | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered     | can be approved     | WA_003         | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_003         | roles&subroles s1 |
      | CCR10  | Field                      | not triggered | can not be approved | ID_001         | negative          |
      | CCR10  | Field                      | not triggered | can not be approved | IL_002         | negative          |
      | CCR10  | Field                      | not triggered | can not be approved | MA_004         | negative          |
      | CCR11  | Field                      | triggered     | can be approved     | FL_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | AZ_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CA_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CO_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CT_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | DE_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | HI_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | ID_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | IL_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | MA_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | MD_004         | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | ME_004         | s1                |
      | CCR11  | UWManagerRole              | triggered     | can be approved     | VA_004         | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered     | can be approved     | WA_004         | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_004         | roles&subroles s1 |
      | CCR11  | Field                      | not triggered | can not be approved | ID_001         | negative          |
      | CCR11  | Field                      | not triggered | can not be approved | IL_003         | negative          |

  @NewBusinessRewrite
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC new business rewrite for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33953_Referrals" in sheet "QuoteCreatorCC" for "CC" LOB

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

    @CCR10 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR10  | Field         | triggered | can not be approved | FL_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | AZ_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | CA_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | CO_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | CT_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | DE_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | HI_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | ID_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | IL_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | MA_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | MD_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | ME_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | MT_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | NC_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | NJ_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | NM_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | NV_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | NY_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | OR_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | RI_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | SC_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | UT_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | VA_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | WA_005         | s1       |
      | CCR10  | Field         | triggered | can not be approved | WY_005         | s1       |

    @CCR10 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR10  | Field         | not triggered | can not be approved | ID_006         | negative |

    @CCR11 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval            | testCaseDataId | scenario |
      | CCR11  | Field         | triggered | can not be approved | FL_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | AZ_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | CA_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | CO_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | CT_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | DE_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | HI_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | ID_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | IL_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | MA_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | MD_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | ME_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | MT_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | NC_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | NJ_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | NM_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | NV_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | NY_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | OR_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | RI_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | SC_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | UT_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | VA_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | WA_006         | s1       |
      | CCR11  | Field         | triggered | can not be approved | WY_006         | s1       |

    @CCR11 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR11  | Field         | not triggered | can not be approved | ID_005         | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | scenario |
      | CCR10  | Field         | triggered     | can not be approved | FL_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | AZ_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | CA_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | CO_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | CT_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | DE_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | HI_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | ID_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | IL_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | MA_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | MD_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | ME_005         | s1       |
      | CCR10  | Field         | triggered     | can not be approved | MT_005         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | NC_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | NJ_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | NM_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | NV_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | NY_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | OR_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | RI_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | SC_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | UT_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | VA_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | WA_006         | s1       |
      | CCR11  | Field         | triggered     | can not be approved | WY_006         | s1       |
      | CCR11  | Field         | not triggered | can not be approved | ID_005         | negative |

  @NewBusiness @PolicyExtension
  Scenario Outline: Verify that rule: "<ruleId>" is "<trigger>" and that it "<approval>" by "<role/sub-role>" role/sub-role on CC policy extension for "<testCaseDataId>" "<scenario>"

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33953_Referrals" in sheet "QuoteCreatorCC" for "CC" LOB

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

    When I initiate a policy extension
    * I add changes on policy extension

    * I navigate to "Optional Coverages" page
    * I set the broadened liability coverage to "<blc>"
    * I set the broadened liability coverage libel slander excluded to "<blcls>"

    * I review changes
    * I click renewed premium
    * I click review referrals

    Then I verify that referral "<ruleId>" is "<trigger>"
    * I verify that referral "<ruleId>" "<approval>"

    @CCR10 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | blc | blcls | scenario |
      | CCR10  | Field         | triggered | can be approved | FL_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | AZ_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | CA_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | CO_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | CT_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | DE_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | HI_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | ID_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | IL_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | MA_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | MD_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | ME_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | MT_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | NC_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | NJ_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | NM_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | NV_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | NY_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | OR_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | RI_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | SC_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | UT_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | VA_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | WA_002         | Yes | No    | s1       |
      | CCR10  | Field         | triggered | can be approved | WY_002         | Yes | No    | s1       |

    @CCR10 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | blc | blcls | scenario          |
      | CCR10  | UWManagerRole              | triggered | can be approved     | FL_002         | Yes | No    | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered | can be approved     | AZ_002         | Yes | No    | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered | can not be approved | CA_002         | Yes | No    | roles&subroles s1 |

    @CCR10 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | blc | blcls | scenario |
      | CCR10  | Field         | not triggered | can not be approved | ID_001         | No  | Yes   | negative |

    @CCR11 @S1
    Examples:
      | ruleId | role/sub-role | trigger   | approval        | testCaseDataId | blc | blcls | scenario |
      | CCR11  | Field         | triggered | can be approved | FL_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | AZ_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | CA_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | CO_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | CT_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | DE_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | HI_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | ID_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | IL_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | MA_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | MD_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | ME_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | MT_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | NC_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | NJ_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | NM_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | NV_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | NY_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | OR_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | RI_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | SC_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | UT_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | VA_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | WA_001         | No  | Yes   | s1       |
      | CCR11  | Field         | triggered | can be approved | WY_001         | No  | Yes   | s1       |

    @CCR11 @S1 @Roles&SubRoles
    Examples:
      | ruleId | role/sub-role              | trigger   | approval            | testCaseDataId | blc | blcls | scenario          |
      | CCR11  | UWManagerRole              | triggered | can be approved     | FL_001         | No  | Yes   | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered | can be approved     | AZ_001         | No  | Yes   | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered | can not be approved | CA_001         | No  | Yes   | roles&subroles s1 |

    @CCR11 @Negative
    Examples:
      | ruleId | role/sub-role | trigger       | approval            | testCaseDataId | blc | blcls | scenario |
      | CCR11  | Field         | not triggered | can not be approved | ID_002         | Yes | No    | negative |

    @RegressionUS
    Examples:
      | ruleId | role/sub-role              | trigger       | approval            | testCaseDataId | blc | blcls | scenario          |
      | CCR10  | Field                      | triggered     | can be approved     | NC_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NJ_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NM_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NV_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | NY_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | OR_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | RI_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | SC_002         | Yes | No    | s1                |
      | CCR10  | Field                      | triggered     | can be approved     | UT_002         | Yes | No    | s1                |
      | CCR10  | UWManagerRole              | triggered     | can be approved     | VA_002         | Yes | No    | roles&subroles s1 |
      | CCR10  | UnderwriterRole            | triggered     | can be approved     | WA_002         | Yes | No    | roles&subroles s1 |
      | CCR10  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_002         | Yes | No    | roles&subroles s1 |
      | CCR10  | Field                      | not triggered | can not be approved | ID_001         | No  | Yes   | negative          |
      | CCR11  | Field                      | triggered     | can be approved     | FL_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | AZ_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CA_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CO_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | CT_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | DE_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | HI_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | ID_001         | No  | Yes   | s1                |
      | CCR11  | Field                      | triggered     | can be approved     | IL_001         | No  | Yes   | s1                |
      | CCR11  | UWManagerRole              | triggered     | can be approved     | VA_001         | No  | Yes   | roles&subroles s1 |
      | CCR11  | UnderwriterRole            | triggered     | can be approved     | WA_001         | No  | Yes   | roles&subroles s1 |
      | CCR11  | UnderwritingTechnicianRole | triggered     | can not be approved | WY_001         | No  | Yes   | roles&subroles s1 |
      | CCR11  | Field                      | not triggered | can not be approved | ID_002         | Yes | No    | negative          |

  @NewBusiness @Endorsement @NewBusinessRewrite @PolicyExtension
  Scenario Outline: Verify validation rules are triggering on optional coverages page

    Given I have entered test data for test case "<testCaseDataId>" in excel workbook "us/US33953_Validations" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I navigate to "Optional Coverages" page
    * I set the broadened liability coverage to "Yes"
    * I set the broadened liability coverage libel slander excluded to "Yes"
    * I click save changes button

    Then I verify validation messages are displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |

    When I set the broadened liability coverage to "No"
    * I set the broadened liability coverage libel slander excluded to "No"
    * I set the roof reconstruction cost schedule to "Yes" and override to "Yes"
    * I rate a quote

    Then I verify validation messages are displayed
      | validationMessage                                                                 |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction |

    When I set the roof reconstruction cost schedule to "No" and override to "No"
    * I click save changes button

    Then I verify validation messages are not displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction                                         |

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    Then I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    When I navigate to "Optional Coverages" page
    * I set the broadened liability coverage to "Yes"
    * I set the broadened liability coverage libel slander excluded to "Yes"
    * I click save changes button

    Then I verify validation messages are displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |

    When I set the broadened liability coverage to "No"
    * I set the broadened liability coverage libel slander excluded to "No"
    * I set the roof reconstruction cost schedule to "Yes" and override to "Yes"
    * I review changes
    * I rate a quote

    Then I verify validation messages are displayed
      | validationMessage                                                                 |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction |

    When I click more changes button
    * I set the roof reconstruction cost schedule to "No" and override to "No"
    * I review changes
    * I rate a quote

    Then I verify validation messages are not displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction                                         |

    * I complete rewrite transaction
    * I navigate to transactions or endorsements

    When I initiate new endorsement
    * I navigate to "Optional Coverages" page
    * I set the broadened liability coverage to "Yes"
    * I set the broadened liability coverage libel slander excluded to "Yes"
    * I review changes

    Then I verify validation messages are displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |

    When I set the broadened liability coverage to "No"
    * I set the broadened liability coverage libel slander excluded to "No"
    * I set the roof reconstruction cost schedule to "Yes" and override to "Yes"
    * I review changes
    * I rate an endorsement

    Then I verify validation messages are displayed
      | validationMessage                                                                 |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction |
    * I click more changes button

    When I set the roof reconstruction cost schedule to "No" and override to "No"
    * I click save changes button

    Then I verify validation messages are not displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction                                         |

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I navigate to "Optional Coverages" page
    * I set the broadened liability coverage to "Yes"
    * I set the broadened liability coverage libel slander excluded to "Yes"
    * I click save changes button

    Then I verify validation messages are displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |

    When I set the broadened liability coverage to "No"
    * I set the broadened liability coverage libel slander excluded to "No"
    * I set the roof reconstruction cost schedule to "Yes" and override to "Yes"
    * I click save changes button

    Then I verify validation messages are displayed
      | validationMessage                                                                 |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction |

    When I set the roof reconstruction cost schedule to "No" and override to "No"
    * I click save changes button

    Then I verify validation messages are not displayed
      | validationMessage                                                                                                         |
      | Broadened Liability Coverage and Broadened Liability Coverage Libel Slander Excluded can not be selected at the same time |
      | Limited Roof Reconstruction Endorsement does not apply for ground up construction                                         |

    When I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process policy extension

    Examples:
      | testCaseDataId |
      | FL_010         |
      | AZ_010         |
      | CA_010         |
      | CO_010         |
      | CT_010         |
      | DE_010         |
      | HI_010         |
      | ID_010         |
      | IL_010         |
      | MA_010         |
      | MD_010         |
      | ME_010         |
      | MT_010         |
      | NC_010         |
      | NJ_010         |
      | NM_010         |
      | NV_010         |
      | NY_010         |
      | OR_010         |
      | RI_010         |
      | SC_010         |
      | UT_010         |
      | VA_010         |
      | WA_010         |
      | WY_010         |
      | FL_020         |
      | AZ_020         |
      | CA_020         |
      | CO_020         |
      | CT_020         |
      | DE_020         |
      | HI_020         |
      | ID_020         |
      | IL_020         |
      | MA_020         |
      | MD_020         |
      | ME_020         |
      | MT_020         |
      | NC_020         |
      | NJ_020         |
      | NM_020         |
      | NV_020         |
      | NY_020         |
      | OR_020         |
      | RI_020         |
      | SC_020         |
      | UT_020         |
      | VA_020         |
      | WA_020         |
      | WY_020         |

    @RegressionUS
    Examples:
      | testCaseDataId |
      | FL_010         |
      | CA_010         |
      | CT_010         |
      | HI_010         |
      | IL_010         |
      | MD_010         |
      | MT_010         |
      | NJ_010         |
      | NV_010         |
      | OR_010         |
      | SC_010         |
      | VA_010         |
      | WY_010         |
      | AZ_020         |
      | CO_020         |
      | DE_020         |
      | ID_020         |
      | MA_020         |
      | ME_020         |
      | NC_020         |
      | NM_020         |
      | NY_020         |
      | RI_020         |
      | UT_020         |
      | WA_020         |