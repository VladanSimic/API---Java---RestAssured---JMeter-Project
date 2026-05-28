@HO @Referrals
Feature: Homeowner referrals

  Scenario Outline: Verify that "<referralID>" referral is triggering for "<subrole>" and can be cleared by "<subrole>" for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "HO" LOB
    * I am logged in to Pure as "<subrole>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I verify that referral "<referralID>" is "<triggered>"
    * I verify that referral "<referralID>" "<approvable>"
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I get customer account ID

    @US17275
    Examples:
      | subrole           | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field             | ReferralsHO | FL-US17275 | TC_001 | 5          | Yes       | Yes        |
      | Zonal             | ReferralsHO | FL-US17275 | TC_002 | 5          | Yes       | Yes        |
      | RUM               | ReferralsHO | FL-US17275 | TC_003 | 5          | Yes       | Yes        |
      | Specialist1       | ReferralsHO | FL-US17275 | TC_004 | 5          | Yes       | No         |
      | Specialist2       | ReferralsHO | FL-US17275 | TC_005 | 5          | Yes       | No         |
      | SeniorUnderwriter | ReferralsHO | FL-US17275 | TC_006 | 5          | Yes       | No         |
      | Underwriter1      | ReferralsHO | FL-US17275 | TC_007 | 5          | Yes       | No         |
      | Underwriter2      | ReferralsHO | FL-US17275 | TC_008 | 5          | Yes       | No         |
      | Analyst           | ReferralsHO | FL-US17275 | TC_009 | 5          | Yes       | No         |
      | UWSA1             | ReferralsHO | FL-US17275 | TC_010 | 5          | Yes       | No         |
      | UWSA2             | ReferralsHO | FL-US17275 | TC_011 | 5          | Yes       | No         |
      | UWSSA             | ReferralsHO | FL-US17275 | TC_012 | 5          | Yes       | No         |
      | UWSRM             | ReferralsHO | FL-US17275 | TC_013 | 5          | Yes       | No         |

    @US17297
    Examples:
      | subrole           | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field             | ReferralsHO | CA-US17297 | TC_001 | 3          | Yes       | Yes        |
      | Zonal             | ReferralsHO | CA-US17297 | TC_002 | 3          | Yes       | Yes        |
      | RUM               | ReferralsHO | CA-US17297 | TC_003 | 3          | Yes       | Yes        |
      | Specialist1       | ReferralsHO | CA-US17297 | TC_004 | 3          | Yes       | No         |
      | Specialist2       | ReferralsHO | CA-US17297 | TC_005 | 3          | Yes       | No         |
      | SeniorUnderwriter | ReferralsHO | CA-US17297 | TC_006 | 3          | Yes       | No         |
      | Underwriter1      | ReferralsHO | CA-US17297 | TC_007 | 3          | Yes       | No         |
      | Underwriter2      | ReferralsHO | CA-US17297 | TC_008 | 3          | Yes       | No         |
      | Analyst           | ReferralsHO | CA-US17297 | TC_009 | 3          | Yes       | No         |
      | UWSA1             | ReferralsHO | CA-US17297 | TC_010 | 3          | Yes       | No         |
      | UWSA2             | ReferralsHO | CA-US17297 | TC_011 | 3          | Yes       | No         |
      | UWSSA             | ReferralsHO | CA-US17297 | TC_012 | 3          | Yes       | No         |
      | UWSRM             | ReferralsHO | CA-US17297 | TC_013 | 3          | Yes       | No         |
      | Field             | ReferralsHO | CA-US17297 | TC_014 | 3          | No        | No         |
      | Field             | ReferralsHO | CA-US17297 | TC_015 | 3          | No        | No         |
      | Field             | ReferralsHO | CA-US17297 | TC_016 | 4          | Yes       | Yes        |
      | Zonal             | ReferralsHO | CA-US17297 | TC_017 | 4          | Yes       | Yes        |
      | RUM               | ReferralsHO | CA-US17297 | TC_018 | 4          | Yes       | Yes        |
      | Specialist1       | ReferralsHO | CA-US17297 | TC_019 | 4          | Yes       | No         |
      | Specialist2       | ReferralsHO | CA-US17297 | TC_020 | 4          | Yes       | No         |
      | SeniorUnderwriter | ReferralsHO | CA-US17297 | TC_021 | 4          | Yes       | No         |
      | Underwriter1      | ReferralsHO | CA-US17297 | TC_022 | 4          | Yes       | No         |
      | Underwriter2      | ReferralsHO | CA-US17297 | TC_023 | 4          | Yes       | No         |
      | Analyst           | ReferralsHO | CA-US17297 | TC_024 | 4          | Yes       | No         |
      | UWSA1             | ReferralsHO | CA-US17297 | TC_025 | 4          | Yes       | No         |
      | UWSA2             | ReferralsHO | CA-US17297 | TC_026 | 4          | Yes       | No         |
      | UWSSA             | ReferralsHO | CA-US17297 | TC_027 | 4          | Yes       | No         |
      | UWSRM             | ReferralsHO | CA-US17297 | TC_028 | 4          | Yes       | No         |
      | Field             | ReferralsHO | CA-US17297 | TC_029 | 4          | No        | No         |
      | Field             | ReferralsHO | CA-US17297 | TC_030 | 4          | No        | No         |

    @US17285
    Examples:
      | subrole           | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field             | ReferralsHO | CA-US17285 | TC_001 | 1          | Yes       | Yes        |
      | Zonal             | ReferralsHO | CA-US17285 | TC_002 | 1          | Yes       | Yes        |
      | RUM               | ReferralsHO | CA-US17285 | TC_003 | 1          | Yes       | Yes        |
      | Specialist1       | ReferralsHO | CA-US17285 | TC_004 | 1          | Yes       | No         |
      | Specialist2       | ReferralsHO | CA-US17285 | TC_005 | 1          | Yes       | No         |
      | SeniorUnderwriter | ReferralsHO | CA-US17285 | TC_006 | 1          | Yes       | No         |
      | Underwriter1      | ReferralsHO | CA-US17285 | TC_007 | 1          | Yes       | No         |
      | Underwriter2      | ReferralsHO | CA-US17285 | TC_008 | 1          | Yes       | No         |
      | Analyst           | ReferralsHO | CA-US17285 | TC_009 | 1          | Yes       | No         |
      | UWSA1             | ReferralsHO | CA-US17285 | TC_010 | 1          | Yes       | No         |
      | UWSA2             | ReferralsHO | CA-US17285 | TC_011 | 1          | Yes       | No         |
      | UWSSA             | ReferralsHO | CA-US17285 | TC_012 | 1          | Yes       | No         |
      | UWSRM             | ReferralsHO | CA-US17285 | TC_013 | 1          | Yes       | No         |
      | Field             | ReferralsHO | CA-US17285 | TC_014 | 1          | No        | No         |
      | Field             | ReferralsHO | CA-US17285 | TC_015 | 1          | No        | No         |
      | Field             | ReferralsHO | CA-US17285 | TC_016 | 2          | Yes       | Yes        |
      | Zonal             | ReferralsHO | CA-US17285 | TC_017 | 2          | Yes       | Yes        |
      | RUM               | ReferralsHO | CA-US17285 | TC_018 | 2          | Yes       | Yes        |
      | Specialist1       | ReferralsHO | CA-US17285 | TC_019 | 2          | Yes       | No         |
      | Specialist2       | ReferralsHO | CA-US17285 | TC_020 | 2          | Yes       | No         |
      | SeniorUnderwriter | ReferralsHO | CA-US17285 | TC_021 | 2          | Yes       | No         |
      | Underwriter1      | ReferralsHO | CA-US17285 | TC_022 | 2          | Yes       | No         |
      | Underwriter2      | ReferralsHO | CA-US17285 | TC_023 | 2          | Yes       | No         |
      | Analyst           | ReferralsHO | CA-US17285 | TC_024 | 2          | Yes       | No         |
      | UWSA1             | ReferralsHO | CA-US17285 | TC_025 | 2          | Yes       | No         |
      | UWSA2             | ReferralsHO | CA-US17285 | TC_026 | 2          | Yes       | No         |
      | UWSSA             | ReferralsHO | CA-US17285 | TC_027 | 2          | Yes       | No         |
      | UWSRM             | ReferralsHO | CA-US17285 | TC_028 | 2          | Yes       | No         |
      | Field             | ReferralsHO | CA-US17285 | TC_029 | 2          | No        | No         |
      | Field             | ReferralsHO | CA-US17285 | TC_030 | 2          | No        | No         |

    @US16151
    Examples:
      | subrole | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field   | ReferralsHO | FL-US16151 | TC_001 | 2382133    | Yes       | Yes        |
      | Field   | ReferralsHO | FL-US16151 | TC_002 | 2382133    | Yes       | Yes        |
      | Field   | ReferralsHO | FL-US16151 | TC_003 | 2382133    | Yes       | Yes        |
      | Field   | ReferralsHO | FL-US16151 | TC_004 | 2382133    | No        | No         |
      | Field   | ReferralsHO | FL-US16151 | TC_005 | 2382133    | No        | No         |
      | Field   | ReferralsHO | FL-US16151 | TC_006 | 2382733    | Yes       | Yes        |
      | Field   | ReferralsHO | FL-US16151 | TC_007 | 2382733    | Yes       | Yes        |
      | Field   | ReferralsHO | FL-US16151 | TC_008 | 2382733    | No        | No         |
      | Field   | ReferralsHO | FL-US16151 | TC_009 | 2382733    | No        | No         |

    @US16134
    Examples:
      | subrole           | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field             | ReferralsHO | FL-US16134 | TC_001 | 1981233    | Yes       | Yes        |
      | Zonal             | ReferralsHO | FL-US16134 | TC_002 | 1981233    | Yes       | Yes        |
      | RUM               | ReferralsHO | FL-US16134 | TC_003 | 1981233    | Yes       | Yes        |
      | Specialist1       | ReferralsHO | FL-US16134 | TC_004 | 1981233    | Yes       | Yes        |
      | Specialist2       | ReferralsHO | FL-US16134 | TC_005 | 1981233    | Yes       | Yes        |
      | SeniorUnderwriter | ReferralsHO | FL-US16134 | TC_006 | 1981233    | Yes       | Yes        |
      | Underwriter1      | ReferralsHO | FL-US16134 | TC_007 | 1981233    | Yes       | Yes        |
      | Underwriter2      | ReferralsHO | FL-US16134 | TC_008 | 1981233    | Yes       | Yes        |
      | Analyst           | ReferralsHO | FL-US16134 | TC_009 | 1981233    | Yes       | Yes        |
      | UWSA1             | ReferralsHO | FL-US16134 | TC_010 | 1981233    | Yes       | Yes        |
      | UWSA2             | ReferralsHO | FL-US16134 | TC_011 | 1981233    | Yes       | Yes        |
      | UWSSA             | ReferralsHO | FL-US16134 | TC_012 | 1981233    | Yes       | Yes        |
      | UWSRM             | ReferralsHO | FL-US16134 | TC_013 | 1981233    | Yes       | Yes        |
      | Field             | ReferralsHO | FL-US16134 | TC_014 | 1981233    | Yes       | Yes        |
      | Field             | ReferralsHO | FL-US16134 | TC_015 | 1981233    | No        | No         |

    @US16136
    Examples:
      | subrole           | workbook    | sheet      | TC_ID  | referralID | triggered | approvable |
      | Field             | ReferralsHO | FL-US16136 | TC_001 | 2382933    | Yes       | Yes        |
      | Zonal             | ReferralsHO | FL-US16136 | TC_002 | 2382933    | Yes       | Yes        |
      | RUM               | ReferralsHO | FL-US16136 | TC_003 | 2382933    | Yes       | Yes        |
      | Specialist1       | ReferralsHO | FL-US16136 | TC_004 | 2382933    | Yes       | Yes        |
      | Specialist2       | ReferralsHO | FL-US16136 | TC_005 | 2382933    | Yes       | Yes        |
      | SeniorUnderwriter | ReferralsHO | FL-US16136 | TC_006 | 2382933    | Yes       | Yes        |
      | Underwriter1      | ReferralsHO | FL-US16136 | TC_007 | 2382933    | Yes       | Yes        |
      | Underwriter2      | ReferralsHO | FL-US16136 | TC_008 | 2382933    | Yes       | Yes        |
      | Analyst           | ReferralsHO | FL-US16136 | TC_009 | 2382933    | Yes       | Yes        |
      | UWSA1             | ReferralsHO | FL-US16136 | TC_010 | 2382933    | Yes       | Yes        |
      | UWSA2             | ReferralsHO | FL-US16136 | TC_011 | 2382933    | Yes       | Yes        |
      | UWSSA             | ReferralsHO | FL-US16136 | TC_012 | 2382933    | Yes       | Yes        |
      | UWSRM             | ReferralsHO | FL-US16136 | TC_013 | 2382933    | Yes       | Yes        |
      | Field             | ReferralsHO | FL-US16136 | TC_014 | 2382933    | No        | No         |
      | Field             | ReferralsHO | FL-US16136 | TC_015 | 2382933    | Yes       | Yes        |