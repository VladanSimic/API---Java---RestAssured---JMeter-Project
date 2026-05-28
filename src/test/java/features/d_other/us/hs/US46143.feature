@HomeownersSurplus @US46143 @TF107 @TF1219 @TF1223 @TC90905 @TC90903
Feature: PSE & Accredited NY - Turn on - UW Referrals

  @NewBusiness @TC90902 @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |
      | NY_002 | 11/04/24      | Yes     | 1808133,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_008 | 02/15/25      | Yes     | 1856833,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_009 | 02/15/25      | Yes     | 2462335,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_017 | 02/15/25      | Yes     | 1862633,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_018 | 02/15/25      | Yes     | 2476035,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_019 | 02/15/25      | Yes     | 2475735,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | Yes     | 2494635,                                                                                                                      | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 11/07/24      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |
      | NY_002 | 11/07/24      | Yes     | 1808133,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_008 | 11/07/24      | Yes     | 1856833,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_009 | 11/07/24      | Yes     | 2462335,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_017 | 11/07/24      | Yes     | 1862633,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_018 | 11/07/24      | Yes     | 2476035,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_019 | 11/07/24      | Yes     | 2475735,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_021 | 11/07/24      | Yes     | 2494635,                                                                                                                      | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                              | Company                                |
      | NY_001 | 11/07/24      | Yes     | 1816633, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | PURE Specialty Exchange |
      | NY_008 | 02/15/25      | Yes     | 1856833,                                                                                                                      | PURE Specialty Exchange |
      | NY_010 | 02/15/25      | Yes     | 2463335,                                                                                                                      | PURE Specialty Exchange |
      | NY_017 | 02/15/25      | Yes     | 1862633,                                                                                                                      | PURE Specialty Exchange |
      | NY_018 | 02/15/25      | Yes     | 2476035,                                                                                                                      | PURE Specialty Exchange |
      | NY_019 | 02/15/25      | Yes     | 2475735,                                                                                                                      | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | Yes     | 2494635,                                                                                                                      | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | PURE Specialty Exchange |

  @NewBusiness @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business (Inspection) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to "Application" page
    * I select dropdown value "Yes" for "Surplus Lines Homeowners Application"
    * I select dropdown value "Yes" for "Older Home Questionnaire"
    * I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_001 | 02/15/25      | Yes     | 1808033, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_001 | 11/07/24      | Yes     | 1808033, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                 |
      | NY_001 | 02/15/25      | Yes     | 1808033, | PURE Specialty Exchange |

  @NewBusiness @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business (With CLUE/MVR) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to customer page
    * I navigate to CLUE-MVR tab
    * I run home CLUE
    * I do not include claim "Unknown claim"
    * I navigate to customer summary page
    * I open quote under customer
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_006 | 02/15/25      | Yes     | 1812833, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_006 | 11/07/24      | Yes     | 1812833, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                 |
      | NY_006 | 02/15/25      | Yes     | 1812833, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | <NBRWEffectiveDate> |

    When I add changes on "HS" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to underwriting alerts tab

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                                |
      | NY_002 | 11/04/24      | 11/05/24          | Yes     | 1808133,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2484235,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |
      | NY_009 | 02/15/25      | 02/16/25          | Yes     | 2462335,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_017 | 02/15/25      | 02/16/25          | Yes     | 1862633,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_018 | 02/15/25      | 02/16/25          | Yes     | 2476035,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_019 | 02/15/25      | 02/16/25          | Yes     | 2475735,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | 02/16/25          | Yes     | 2494635,                                                                                                                               | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_003 | 02/15/25      | 01/02/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                                |
      | NY_002 | 11/07/24      | 11/08/24          | Yes     | 1808133,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 2484235,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |
      | NY_009 | 11/07/24      | 11/08/24          | Yes     | 2462335,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_017 | 11/07/24      | 11/08/24          | Yes     | 1862633,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_018 | 11/07/24      | 11/08/24          | Yes     | 2476035,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_019 | 11/07/24      | 11/08/24          | Yes     | 2475735,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | 11/08/24          | Yes     | 2494635,                                                                                                                               | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                | Company                                |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                 |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2484235,                                                                                                                               | PURE Specialty Exchange |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | PURE Specialty Exchange |
      | NY_010 | 02/15/25      | 02/16/25          | Yes     | 2463335,                                                                                                                               | PURE Specialty Exchange |
      | NY_017 | 02/15/25      | 02/16/25          | Yes     | 1862633,                                                                                                                               | PURE Specialty Exchange |
      | NY_018 | 02/15/25      | 02/16/25          | Yes     | 2476035,                                                                                                                               | PURE Specialty Exchange |
      | NY_019 | 02/15/25      | 02/16/25          | Yes     | 2475735,                                                                                                                               | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | 02/16/25          | Yes     | 2494635,                                                                                                                               | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite (With CLUE/MVR) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to customer page
    * I navigate to CLUE-MVR tab
    * I run home CLUE
    * I do not include claim "Unknown claim"
    * I navigate to customer summary page
    * I open quote under customer
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | <NBRWEffectiveDate> |

    When I add changes on "HS" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to underwriting alerts tab

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules    | Company                                |
      | NY_006 | 02/15/25      | 02/16/25          | Yes     | 1812833, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules    | Company                                |
      | NY_006 | 11/07/24      | 11/08/24          | Yes     | 1812833, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules    | Company                 |
      | NY_006 | 02/15/25      | 02/16/25          | Yes     | 1812833, | PURE Specialty Exchange |

  @NewBusiness @Endorsement @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Endorsement - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<EndEffectiveDate>"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |
      | NY_015 | 02/15/25      | 02/16/25         | Yes     | 1856833,                            | Accredited Specialty Insurance Company |
      | NY_011 | 02/15/25      | 02/16/25         | Yes     | 2463435,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | 02/16/25         | Yes     | 2494635,                            | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 11/11/24      | 11/12/24         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |
      | NY_008 | 11/11/24      | 11/12/24         | Yes     | 1856833,                            | Accredited Specialty Insurance Company |
      | NY_011 | 11/11/24      | 11/12/24         | Yes     | 2463435,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/11/24      | 11/12/24         | Yes     | 2494635,                            | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 11/11/24      | 11/12/24         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                 |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | PURE Specialty Exchange |
      | NY_008 | 02/15/25      | 02/16/25         | Yes     | 1856833,                            | PURE Specialty Exchange |
      | NY_012 | 02/15/25      | 02/16/25         | Yes     | 2464235,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | 02/16/25         | Yes     | 2494635,                            | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                 |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | PURE Specialty Exchange |

  @NewBusiness @Endorsement @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Endorsement (UW Concerns) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<EndEffectiveDate>"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I initiate new endorsement
    * I add changes on "HS" endorsement
    * I navigate to customer page
    * I navigate to member flag tab
    * I check checkbox "UW Concerns - PURE Programs"
    * I type to textarea "Notes"
    * I click save changes button
    * I navigate to customer summary page
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    * I navigate to policy image page
    * I review changes
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules    | Company                                |
      | NY_007 | 02/15/25      | 02/16/25         | Yes     | 2626337, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules    | Company                                |
      | NY_007 | 11/11/24      | 11/12/24         | Yes     | 2626337, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules    | Company                 |
      | NY_007 | 02/15/25      | 02/16/25         | Yes     | 2626337, | PURE Specialty Exchange |

  @NewBusiness @Renewal @TC90904 @STG
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Renewal - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | NY_004 | 02/15/25      | Yes     | 1816933, 1815133           | Accredited Specialty Insurance Company |
      | NY_005 | 02/15/25      | Yes     | 2476235, 2476335, 2475735, | Accredited Specialty Insurance Company |
      | NY_013 | 02/15/25      | Yes     | 2465335,                   | Accredited Specialty Insurance Company |
      | NY_016 | 02/15/25      | Yes     | 2060733,                   | Accredited Specialty Insurance Company |
      | NY_020 | 02/15/25      | Yes     | 1808333,                   | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | Yes     | 2494635,                   | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | NY_005 | 02/15/25      | Yes     | 2476235, 2476335, 2475735, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | NY_004 | 02/06/24      | Yes     | 1816933, 1815133           | Accredited Specialty Insurance Company |
      | NY_005 | 02/06/24      | Yes     | 2476235, 2476335, 2475735, | Accredited Specialty Insurance Company |
      | NY_013 | 02/06/24      | Yes     | 2465335,                   | Accredited Specialty Insurance Company |
      | NY_016 | 02/06/24      | Yes     | 2060733,                   | Accredited Specialty Insurance Company |
      | NY_020 | 02/06/24      | Yes     | 1808333,                   | Accredited Specialty Insurance Company |
      | NY_022 | 02/06/24      | Yes     | 2494635,                   | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | NY_005 | 02/06/24      | Yes     | 2476235, 2476335, 2475735, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | NY_004 | 02/15/25      | Yes     | 1816933, 1815133           | PURE Specialty Exchange |
      | NY_005 | 02/15/25      | Yes     | 2476235, 2476335, 2475735, | PURE Specialty Exchange |
      | NY_013 | 02/15/25      | Yes     | 2465435,                   | PURE Specialty Exchange |
      | NY_016 | 02/15/25      | Yes     | 2060733,                   | PURE Specialty Exchange |
      | NY_020 | 02/15/25      | Yes     | 1808333,                   | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | Yes     | 2494635,                   | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | NY_005 | 02/15/25      | Yes     | 2476235, 2476335, 2475735, | PURE Specialty Exchange |

  #PRE PROD

  @NewBusiness @TC90902 @PreProd
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I login with OKTA user "A1"

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |
      | NY_002 | 11/04/24      | Yes     | 1808133,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_008 | 02/15/25      | Yes     | 1856833,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_009 | 02/15/25      | Yes     | 2462335,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_017 | 02/15/25      | Yes     | 1862633,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_018 | 02/15/25      | Yes     | 2476035,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_019 | 02/15/25      | Yes     | 2475735,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | Yes     | 2494635,                                                                                                                      | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_001 | 11/07/24      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |
      | NY_002 | 11/07/24      | Yes     | 1808133,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_008 | 11/07/24      | Yes     | 1856833,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_009 | 11/07/24      | Yes     | 2462335,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_017 | 11/07/24      | Yes     | 1862633,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_018 | 11/07/24      | Yes     | 2476035,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_019 | 11/07/24      | Yes     | 2475735,                                                                                                                      | Accredited Specialty Insurance Company |
      | NY_021 | 11/07/24      | Yes     | 2494635,                                                                                                                      | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                              | Company                                |
      | NY_001 | 11/07/24      | Yes     | 1816633, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | PURE Specialty Exchange |
      | NY_008 | 02/15/25      | Yes     | 1856833,                                                                                                                      | PURE Specialty Exchange |
      | NY_010 | 02/15/25      | Yes     | 2463335,                                                                                                                      | PURE Specialty Exchange |
      | NY_017 | 02/15/25      | Yes     | 1862633,                                                                                                                      | PURE Specialty Exchange |
      | NY_018 | 02/15/25      | Yes     | 2476035,                                                                                                                      | PURE Specialty Exchange |
      | NY_019 | 02/15/25      | Yes     | 2475735,                                                                                                                      | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | Yes     | 2494635,                                                                                                                      | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_001 | 02/15/25      | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @PreProd
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I login with OKTA user "A1"

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | <NBRWEffectiveDate> |

    When I add changes on "HS" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    * I navigate to underwriting alerts tab

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                                |
      | NY_002 | 11/04/24      | 11/05/24          | Yes     | 1808133,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 02/15/25      | 01/02/25          | Yes     | 2484235,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 02/15/25      | 01/02/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |
      | NY_009 | 02/15/25      | 01/02/25          | Yes     | 2462335,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_017 | 02/15/25      | 01/02/25          | Yes     | 1862633,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_018 | 02/15/25      | 01/02/25          | Yes     | 2476035,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_019 | 02/15/25      | 01/02/25          | Yes     | 2475735,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | 01/02/25          | Yes     | 2494635,                                                                                                                               | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                         | Company                                |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                                |
      | NY_002 | 11/07/24      | 11/08/24          | Yes     | 1808133,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 2484235,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |
      | NY_009 | 11/07/24      | 11/08/24          | Yes     | 2462335,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_017 | 11/07/24      | 11/08/24          | Yes     | 1862633,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_018 | 11/07/24      | 11/08/24          | Yes     | 2476035,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_019 | 11/07/24      | 11/08/24          | Yes     | 2475735,                                                                                                                               | Accredited Specialty Insurance Company |
      | NY_021 | 11/07/24      | 11/08/24          | Yes     | 2494635,                                                                                                                               | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                | Company                                |
      | NY_003 | 11/07/24      | 11/08/24          | Yes     | 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                                  | Company                 |
      | NY_003 | 02/15/25      | 01/02/25          | Yes     | 2484235,                                                                                                                               | PURE Specialty Exchange |
      | NY_003 | 02/15/25      | 01/02/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 2484235, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | PURE Specialty Exchange |
      | NY_010 | 02/15/25      | 01/02/25          | Yes     | 2463335,                                                                                                                               | PURE Specialty Exchange |
      | NY_017 | 02/15/25      | 01/02/25          | Yes     | 1862633,                                                                                                                               | PURE Specialty Exchange |
      | NY_018 | 02/15/25      | 01/02/25          | Yes     | 2476035,                                                                                                                               | PURE Specialty Exchange |
      | NY_019 | 02/15/25      | 01/02/25          | Yes     | 2475735,                                                                                                                               | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | 01/02/25          | Yes     | 2494635,                                                                                                                               | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                                                                                         | Company                 |
      | NY_003 | 02/15/25      | 02/16/25          | Yes     | 2476135, 1807433, 1816633, 1809733, 1817633, 1807033, 1807133, 1807333, 1813433, 1812533, 1812633, 1813633, 1808833, 1808033, | PURE Specialty Exchange |

  @NewBusiness @Endorsement @PreProd
  Scenario Outline: Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Endorsement - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46143" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "<EffectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<EndEffectiveDate>"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Rule_IDs" to "<Rules>"

    When I login with OKTA user "A1"

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 02/15/25      | 01/02/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |
      | NY_015 | 02/15/25      | 01/02/25         | Yes     | 1856833,                            | Accredited Specialty Insurance Company |
      | NY_011 | 02/15/25      | 01/02/25         | Yes     | 2463435,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | 01/02/25         | Yes     | 2494635,                            | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 11/11/24      | 11/12/24         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |
      | NY_008 | 11/11/24      | 11/12/24         | Yes     | 1856833,                            | Accredited Specialty Insurance Company |
      | NY_011 | 11/11/24      | 11/12/24         | Yes     | 2463435,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/11/24      | 11/12/24         | Yes     | 2494635,                            | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                                |
      | NY_005 | 11/11/24      | 11/12/24         | Yes     | 2029233, 2475735, 2476235, 2476335, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                 |
      | NY_005 | 02/15/25      | 02/16/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | PURE Specialty Exchange |
      | NY_008 | 02/15/25      | 02/16/25         | Yes     | 1856833,                            | PURE Specialty Exchange |
      | NY_012 | 02/15/25      | 02/16/25         | Yes     | 2464235,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | 02/16/25         | Yes     | 2494635,                            | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | EndEffectiveDate | Trigger | Rules                               | Company                 |
      | NY_005 | 02/15/25      | 02/15/25         | Yes     | 2029233, 2475735, 2476235, 2476335, | PURE Specialty Exchange |
