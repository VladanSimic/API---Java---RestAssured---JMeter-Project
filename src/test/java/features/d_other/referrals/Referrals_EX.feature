@EX @Referrals
Feature: Excess Referrals

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX New Business for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I am logged in to Pure as "<subrole>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify that referral "<ruleID>" is "<triggered>"
    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I get customer account ID

    @DT2
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | DT2_1  | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UWSA1                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UWSA2                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UWSSA                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UWSRM                      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | UnderwritingTechnicianRole | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |
      | DT2_1  | SeniorUWTechnicianRole     | Yes       | Yes        | TC_001 | ReferralsEX | DT2_1 |

    @R5
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R5     | Field   | No        | No         | TC_001 | ReferralsEX | R5    |
      | R5     | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R5    |

    @R8
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R8     | Field   | No        | No         | TC_001 | ReferralsEX | R8    |
      | R8     | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R8    |

    @R16
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R16    | Field   | No        | No         | TC_001 | ReferralsEX | R16   |
      | R16    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R16   |

    @R17
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R17    | Field   | No        | No         | TC_001 | ReferralsEX | R17   |
      | R17    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R17   |

    @R18
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R18    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R18   |
      | R18    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R18   |
      | R18    | RUM                        | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Specialist1                | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Specialist2                | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | SeniorUnderwriter          | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Underwriter1               | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Underwriter2               | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Analyst                    | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R18   |
      | R18    | UWManagerRole              | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UnderwriterRole            | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R18   |
      | R18    | Field                      | No        | No         | TC_002 | ReferralsEX | R18   |
      | R18    | Field                      | No        | No         | TC_003 | ReferralsEX | R18   |

    @R21
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R21    | Field   | No        | No         | TC_001 | ReferralsEX | R21   |
      | R21    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R21   |

    @R22
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R22    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R22   |
      | R22    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_002 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_003 | ReferralsEX | R22   |

    @R24
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R24    | Field   | No        | No         | TC_004 | ReferralsEX | R24   |

    @R31
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R31    | Field   | No        | No         | TC_001 | ReferralsEX | R31   |
      | R31    | Field   | No        | No         | TC_002 | ReferralsEX | R31   |

    @R32
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R32    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | Field                      | No        | No         | TC_002 | ReferralsEX | R32   |
      | R32    | Field                      | No        | No         | TC_003 | ReferralsEX | R32   |

    @R51
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R51    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | Field                      | No        | No         | TC_002 | ReferralsEX | R51   |
      | R51    | Field                      | No        | No         | TC_003 | ReferralsEX | R51   |

    @R54
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R54    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R54   |
      | R54    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R54   |
      | R54    | Field                      | No        | No         | TC_002 | ReferralsEX | R54   |
      | R54    | Field                      | No        | No         | TC_003 | ReferralsEX | R54   |

    @R57
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R57    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | Field                      | No        | No         | TC_002 | ReferralsEX | R57   |
      | R57    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R57   |

    @R58
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R58    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R58   |
      | R58    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R58   |
      | R58    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R58   |
      | R58    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R58   |
      | R58    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R58   |
      | R58    | SeniorUWTechnicianRole     | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R58   |

    @R62
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R62    | Field   | No        | No         | TC_001 | ReferralsEX | R62   |
      | R62    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R62   |

    @R71
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R71    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R71   |
      | R71    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_002 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_003 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_004 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_005 | ReferralsEX | R71   |

    @R73
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R73    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_003 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_004 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_005 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_006 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_007 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_008 | ReferralsEX | R73   |

    @R74
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R74    | Field   | No        | No         | TC_001 | ReferralsEX | R74   |
      | R74    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R74   |

    @R75
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R75    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R75   |

    @R86
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R86    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | SeniorUnderwriter          | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | Underwriter1               | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | Underwriter2               | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | Analyst                    | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | SeniorUWManagmentRole      | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UWManagerRole              | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UnderwriterRole            | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R86   |
      | R86    | Field                      | No        | No         | TC_002 | ReferralsEX | R86   |

  @Endorsement
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX Endorsement for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I have created a new "EX" NB policy
    * I am logged in to Pure as "<subrole>"
    * I navigate to policies
    * I select a policy by ID
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "EX" endorsement
    * I review changes
    * I rate a quote
    * I navigate to Underwriting alerts tab
    * I verify that referral "<ruleID>" is triggered "<triggered>"
    * I verify that referral "<ruleID>" can be approved "<approvable>"
    * I accept underwriting referrals
    * I issue an endorsement

    @R16
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R16    | Field   | No        | No         | TC_001 | ReferralsEX | R16   |
      | R16    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R16   |

    @R18
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R18    | Field                      | Yes       | Yes        | TC_004 | ReferralsEX | R18   |
      | R18    | Field                      | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Zonal                      | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | RUM                        | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Specialist1                | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Specialist2                | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | SeniorUnderwriter          | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Underwriter1               | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Underwriter2               | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | Analyst                    | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | UWSA1                      | Yes       | No         | TC_006 | ReferralsEX | R18   |
      | R18    | UWSA2                      | Yes       | No         | TC_006 | ReferralsEX | R18   |
      | R18    | UWSSA                      | Yes       | No         | TC_006 | ReferralsEX | R18   |
      | R18    | UWSRM                      | Yes       | No         | TC_006 | ReferralsEX | R18   |
      | R18    | SeniorUWManagmentRole      | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | UWManagerRole              | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | UnderwriterRole            | Yes       | Yes        | TC_006 | ReferralsEX | R18   |
      | R18    | UnderwritingTechnicianRole | Yes       | No         | TC_006 | ReferralsEX | R18   |
      | R18    | SeniorUWTechnicianRole     | Yes       | No         | TC_006 | ReferralsEX | R18   |

    @R22
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R22    | Field                      | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Zonal                      | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | RUM                        | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Specialist1                | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Specialist2                | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | SeniorUnderwriter          | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Underwriter1               | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Underwriter2               | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | Analyst                    | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | UWSA1                      | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | UWSA2                      | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | UWSSA                      | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | UWSRM                      | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | SeniorUWManagmentRole      | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | UWManagerRole              | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | UnderwriterRole            | Yes       | Yes        | TC_004 | ReferralsEX | R22   |
      | R22    | UnderwritingTechnicianRole | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | SeniorUWTechnicianRole     | Yes       | No         | TC_004 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_005 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_006 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_007 | ReferralsEX | R22   |

    @R24
    Examples:
      | ruleID | subrole               | triggered | approvable | TC_ID  | workbook    | sheet |
      | R24    | Field                 | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_003 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Zonal                 | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | RUM                   | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Specialist1           | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Specialist2           | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | SeniorUnderwriter     | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Underwriter1          | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Underwriter2          | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Analyst               | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | UWSA1                 | Yes       | No         | TC_003 | ReferralsEX | R24   |
      | R24    | UWSA2                 | Yes       | No         | TC_003 | ReferralsEX | R24   |
      | R24    | UWSSA                 | Yes       | No         | TC_003 | ReferralsEX | R24   |
      | R24    | UWSRM                 | Yes       | No         | TC_003 | ReferralsEX | R24   |
      | R24    | SeniorUWManagmentRole | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | UWManagerRole         | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | UnderwriterRole       | Yes       | Yes        | TC_003 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_005 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_007 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_013 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_014 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_015 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_016 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_017 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_018 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_020 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_022 | ReferralsEX | R24   |

    @R31
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R31    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Zonal                      | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | RUM                        | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Specialist1                | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Specialist2                | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | SeniorUnderwriter          | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Underwriter1               | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Underwriter2               | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | Analyst                    | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | UWSA1                      | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | UWSA2                      | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | UWSSA                      | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | UWSRM                      | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | SeniorUWManagmentRole      | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | UWManagerRole              | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | UnderwriterRole            | Yes       | Yes        | TC_003 | ReferralsEX | R31   |
      | R31    | UnderwritingTechnicianRole | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | SeniorUWTechnicianRole     | Yes       | No         | TC_003 | ReferralsEX | R31   |
      | R31    | Field                      | Yes       | Yes        | TC_004 | ReferralsEX | R31   |
      | R31    | Field                      | No        | No         | TC_005 | ReferralsEX | R31   |
      | R31    | Field                      | No        | No         | TC_006 | ReferralsEX | R31   |

    @R32
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R32    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R32   |
      | R32    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R32   |
      | R32    | Field                      | No        | No         | TC_002 | ReferralsEX | R32   |

    @R51
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R51    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R51   |
      | R51    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R51   |
      | R51    | Field                      | No        | No         | TC_002 | ReferralsEX | R51   |

    @R54
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R54    | Field   | No        | No         | TC_004 | ReferralsEX | R54   |

    @R57
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R57    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R57   |
      | R57    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R57   |
      | R57    | Field                      | No        | No         | TC_002 | ReferralsEX | R57   |

    @R58
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R58    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R58   |
      | R58    | Field   | Yes       | Yes        | TC_003 | ReferralsEX | R58   |

    @R62
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R62    | Field   | No        | No         | TC_001 | ReferralsEX | R62   |
      | R62    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R62   |

    @R71
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R71    | Field                      | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Zonal                      | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | RUM                        | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Specialist1                | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Specialist2                | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | SeniorUnderwriter          | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Underwriter1               | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Underwriter2               | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | Analyst                    | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | UWSA1                      | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | UWSA2                      | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | UWSSA                      | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | UWSRM                      | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | SeniorUWManagmentRole      | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | UWManagerRole              | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | UnderwriterRole            | Yes       | Yes        | TC_006 | ReferralsEX | R71   |
      | R71    | UnderwritingTechnicianRole | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | SeniorUWTechnicianRole     | Yes       | No         | TC_006 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_007 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_008 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_009 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_010 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_011 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_012 | ReferralsEX | R71   |

    @R73
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R73    | Field                      | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Zonal                      | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | RUM                        | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Specialist1                | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Specialist2                | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | SeniorUnderwriter          | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Underwriter1               | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Underwriter2               | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | Analyst                    | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | UWSA1                      | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | UWSA2                      | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | UWSSA                      | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | UWSRM                      | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | SeniorUWManagmentRole      | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | UWManagerRole              | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | UnderwriterRole            | Yes       | Yes        | TC_001 | ReferralsEX | R73   |
      | R73    | UnderwritingTechnicianRole | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | SeniorUWTechnicianRole     | Yes       | No         | TC_001 | ReferralsEX | R73   |
      | R73    | Field                      | Yes       | Yes        | TC_002 | ReferralsEX | R73   |
      | R73    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R73   |
      | R73    | Field                      | Yes       | Yes        | TC_004 | ReferralsEX | R73   |
      | R73    | Field                      | No        | No         | TC_014 | ReferralsEX | R73   |
      | R73    | Field                      | No        | No         | TC_015 | ReferralsEX | R73   |
      | R73    | Field                      | No        | No         | TC_016 | ReferralsEX | R73   |
      | R73    | Field                      | No        | No         | TC_017 | ReferralsEX | R73   |

    @R74
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R74    | Field   | No        | No         | TC_001 | ReferralsEX | R74   |
      | R74    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R74   |

    @R75
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R75    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R75   |

    @R76
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R76    | Field   | No        | No         | TC_001 | ReferralsEX | R76   |
      | R76    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R76   |

    @R86
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R86    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | Field   | No        | No         | TC_003 | ReferralsEX | R86   |

  @Renewal
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX Renewal for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I have created a new "EX" NB policy
    * I am logged in to Pure as "<subrole>"
    * I navigate to policies
    * I select a policy by ID
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I add changes on "EX" renewal
    * I review changes
    * I check renewed premium
    * I navigate to Underwriting alerts tab
    * I verify that referral "<ruleID>" is triggered "<triggered>"
    * I verify that referral "<ruleID>" can be approved "<approvable>"
    * I accept underwriting referrals

    @R18
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R18    | Field   | No        | No         | TC_005 | ReferralsEX | R18   |

    @R22
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R22    | Field   | No        | No         | TC_010 | ReferralsEX | R22   |

    @R24
    Examples:
      | ruleID | subrole               | triggered | approvable | TC_ID  | workbook    | sheet |
      | R24    | Field                 | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_002 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Zonal                 | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | RUM                   | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Specialist1           | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Specialist2           | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | SeniorUnderwriter     | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Underwriter1          | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Underwriter2          | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Analyst               | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | UWSA1                 | Yes       | No         | TC_002 | ReferralsEX | R24   |
      | R24    | UWSA2                 | Yes       | No         | TC_002 | ReferralsEX | R24   |
      | R24    | UWSSA                 | Yes       | No         | TC_002 | ReferralsEX | R24   |
      | R24    | UWSRM                 | Yes       | No         | TC_002 | ReferralsEX | R24   |
      | R24    | SeniorUWManagmentRole | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | UWManagerRole         | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | UnderwriterRole       | Yes       | Yes        | TC_002 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_001 | ReferralsEX | R24   |
      | R24    | Field                 | Yes       | Yes        | TC_006 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_008 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_009 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_010 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_011 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_012 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_019 | ReferralsEX | R24   |
      | R24    | Field                 | No        | No         | TC_021 | ReferralsEX | R24   |

    @R31
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R31    | Field   | No        | No         | TC_009 | ReferralsEX | R31   |

    @R47
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R47    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R47   |
      | R47    | Field                      | No        | No         | TC_004 | ReferralsEX | R47   |
      | R47    | Field                      | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Zonal                      | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | RUM                        | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Specialist1                | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Specialist2                | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | SeniorUnderwriter          | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Underwriter1               | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Underwriter2               | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | Analyst                    | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | UWSA1                      | Yes       | No         | TC_005 | ReferralsEX | R47   |
      | R47    | UWSA2                      | Yes       | No         | TC_005 | ReferralsEX | R47   |
      | R47    | UWSSA                      | Yes       | No         | TC_005 | ReferralsEX | R47   |
      | R47    | UWSRM                      | Yes       | No         | TC_005 | ReferralsEX | R47   |
      | R47    | SeniorUWManagmentRole      | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | UWManagerRole              | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | UnderwriterRole            | Yes       | Yes        | TC_005 | ReferralsEX | R47   |
      | R47    | UnderwritingTechnicianRole | Yes       | No         | TC_005 | ReferralsEX | R47   |
      | R47    | SeniorUWTechnicianRole     | Yes       | No         | TC_005 | ReferralsEX | R47   |

    @R48
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R48    | Field                      | Yes       | Yes        | TC_003 | ReferralsEX | R48   |
      | R48    | Field                      | No        | No         | TC_004 | ReferralsEX | R48   |
      | R48    | Field                      | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Zonal                      | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | RUM                        | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Specialist1                | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Specialist2                | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | SeniorUnderwriter          | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Underwriter1               | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Underwriter2               | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | Analyst                    | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | UWSA1                      | Yes       | No         | TC_005 | ReferralsEX | R48   |
      | R48    | UWSA2                      | Yes       | No         | TC_005 | ReferralsEX | R48   |
      | R48    | UWSSA                      | Yes       | No         | TC_005 | ReferralsEX | R48   |
      | R48    | UWSRM                      | Yes       | No         | TC_005 | ReferralsEX | R48   |
      | R48    | SeniorUWManagmentRole      | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | UWManagerRole              | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | UnderwriterRole            | Yes       | Yes        | TC_005 | ReferralsEX | R48   |
      | R48    | UnderwritingTechnicianRole | Yes       | No         | TC_005 | ReferralsEX | R48   |
      | R48    | SeniorUWTechnicianRole     | Yes       | No         | TC_005 | ReferralsEX | R48   |

    @R52
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R52    | Field   | No        | No         | TC_001 | ReferralsEX | R52   |
      | R52    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R52   |

    @R58
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R58    | Field   | No        | No         | TC_002 | ReferralsEX | R58   |

    @R62
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R62    | Field   | No        | No         | TC_001 | ReferralsEX | R62   |
      | R62    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R62   |

    @R71
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R71    | Field   | No        | No         | TC_019 | ReferralsEX | R71   |

    @R73
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R73    | Field   | No        | No         | TC_010 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_011 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_012 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_013 | ReferralsEX | R73   |

    @R74
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R74    | Field   | No        | No         | TC_001 | ReferralsEX | R74   |
      | R74    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R74   |

    @R86
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R86    | Field   | Yes       | Yes        | TC_001 | ReferralsEX | R86   |
      | R86    | Field   | No        | No         | TC_004 | ReferralsEX | R86   |

  @OOSEndorsement
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX OOS Endorsement for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I have created a new "EX" NB policy
    * I have issued an Endorsement for "EX" Policy
    * I am logged in to Pure as "<subrole>"
    * I navigate to policies
    * I select a policy by ID
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I modify OOS
    * I add changes on OOS "EX" endorsement
    * I review changes
    * I rate a quote
    * I navigate to Underwriting alerts tab
    * I verify that referral "<ruleID>" is triggered "<triggered>"
    * I verify that referral "<ruleID>" can be approved "<approvable>"
    * I accept underwriting referrals

    @R22
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R22    | Field                      | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Zonal                      | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | RUM                        | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Specialist1                | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Specialist2                | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | SeniorUnderwriter          | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Underwriter1               | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Underwriter2               | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | Analyst                    | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | UWSA1                      | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | UWSA2                      | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | UWSSA                      | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | UWSRM                      | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | SeniorUWManagmentRole      | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | UWManagerRole              | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | UnderwriterRole            | Yes       | Yes        | TC_008 | ReferralsEX | R22   |
      | R22    | UnderwritingTechnicianRole | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | SeniorUWTechnicianRole     | Yes       | No         | TC_008 | ReferralsEX | R22   |
      | R22    | Field                      | No        | No         | TC_009 | ReferralsEX | R22   |

    @R24
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R24    | Field   | Yes       | Yes        | TC_023 | ReferralsEX | R24   |

    @R31
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R31    | Field                      | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Zonal                      | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | RUM                        | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Specialist1                | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Specialist2                | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | SeniorUnderwriter          | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Underwriter1               | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Underwriter2               | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | Analyst                    | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | UWSA1                      | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | UWSA2                      | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | UWSSA                      | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | UWSRM                      | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | SeniorUWManagmentRole      | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | UWManagerRole              | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | UnderwriterRole            | Yes       | Yes        | TC_007 | ReferralsEX | R31   |
      | R31    | UnderwritingTechnicianRole | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | SeniorUWTechnicianRole     | Yes       | No         | TC_007 | ReferralsEX | R31   |
      | R31    | Field                      | Yes       | Yes        | TC_008 | ReferralsEX | R31   |

    @R47
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R47    | Field   | No        | No         | TC_001 | ReferralsEX | R47   |

    @R48
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R48    | Field   | No        | No         | TC_001 | ReferralsEX | R48   |

    @R71
    Examples:
      | ruleID | subrole                    | triggered | approvable | TC_ID  | workbook    | sheet |
      | R71    | Field                      | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Zonal                      | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | RUM                        | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Specialist1                | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Specialist2                | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | SeniorUnderwriter          | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Underwriter1               | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Underwriter2               | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | Analyst                    | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | UWSA1                      | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | UWSA2                      | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | UWSSA                      | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | UWSRM                      | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | SeniorUWManagmentRole      | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | UWManagerRole              | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | UnderwriterRole            | Yes       | Yes        | TC_013 | ReferralsEX | R71   |
      | R71    | UnderwritingTechnicianRole | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | SeniorUWTechnicianRole     | Yes       | No         | TC_013 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_014 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_015 | ReferralsEX | R71   |
      | R71    | Field                      | No        | No         | TC_016 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_017 | ReferralsEX | R71   |
      | R71    | Field                      | Yes       | Yes        | TC_018 | ReferralsEX | R71   |

    @R73
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R73    | Field   | Yes       | Yes        | TC_018 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_019 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_020 | ReferralsEX | R73   |
      | R73    | Field   | Yes       | Yes        | TC_021 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_022 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_023 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_024 | ReferralsEX | R73   |
      | R73    | Field   | No        | No         | TC_025 | ReferralsEX | R73   |

  @NB_END_RNW
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX New Business Endorsement and Renewal for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I have created a new "EX" NB policy
    * I have issued an Endorsement for "EX" Policy
    * I am logged in to Pure as "<subrole>"
    * I navigate to policies
    * I select a policy by ID
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I add changes on "EX" renewal
    * I review changes
    * I check renewed premium
    * I navigate to Underwriting alerts tab
    * I verify that referral "<ruleID>" is triggered "<triggered>"
    * I verify that referral "<ruleID>" can be approved "<approvable>"
    * I accept underwriting referrals

    @R47
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R47    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R47   |

    @R48
    Examples:
      | ruleID | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R48    | Field   | Yes       | Yes        | TC_002 | ReferralsEX | R48   |