@HomeownersSurplus @US46553 @TF107 @TF1219 @TF1229
Feature: PSE & Accredited NY - Turn off - UW Referrals

  @NewBusiness @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate @TC91001
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | No      | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 02/15/25      | No      | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 02/15/25      | No      | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 02/15/25      | No      | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate @TC91000
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 11/04/24      | Yes     | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/04/24      | Yes     | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 11/04/24      | Yes     | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 11/04/24      | Yes     | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 11/04/24      | Yes     | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate @TC91006
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | No      | 1817133, 1816533,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | PURE Specialty Exchange |
      | NY_028 | 02/15/25      | No      | 1812933,                                     | PURE Specialty Exchange |
      | NY_023 | 02/15/25      | No      | 1817733,                                     | PURE Specialty Exchange |
      | NY_026 | 02/15/25      | No      | 1807533, 1808533                             | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |

  @NewBusiness @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business (With CLUE/MVR) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
    * I assign claims to location
    * I navigate to customer summary page
    * I open quote under customer
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_024 | 02/15/25      | No      | 1813733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_024 | 11/04/24      | Yes     | 1813733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                 |
      | NY_024 | 02/15/25      | No      | 1813733, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @TC91002 @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | 02/16/25          | No      | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | 02/16/25          | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 02/15/25      | 02/16/25          | No      | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 02/15/25      | 02/16/25          | No      | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 02/15/25      | 02/16/25          | No      | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | 11/05/24          | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 11/04/24      | 11/05/24          | Yes     | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/04/24      | 11/05/24          | Yes     | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 11/04/24      | 11/05/24          | Yes     | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 11/04/24      | 11/05/24          | Yes     | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 11/04/24      | 11/05/24          | Yes     | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | 11/05/24          | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | 02/16/25          | No      | 1817133, 1816533,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | 02/16/25          | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | PURE Specialty Exchange |
      | NY_028 | 02/15/25      | 02/16/25          | No      | 1812933,                                     | PURE Specialty Exchange |
      | NY_023 | 02/15/25      | 02/16/25          | No      | 1817733,                                     | PURE Specialty Exchange |
      | NY_026 | 02/15/25      | 02/16/25          | No      | 1807533, 1808533                             | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite (With CLUE/MVR) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
    * I assign claims to location
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
      | NY_024 | 02/15/25      | 02/16/25          | No      | 1813733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules    | Company                                |
      | NY_024 | 11/04/24      | 11/05/24          | Yes     | 1813733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules    | Company                 |
      | NY_024 | 02/15/25      | 02/16/25          | No      | 1813733, | PURE Specialty Exchange |

  @NewBusiness @Renewal @TC91003 @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Renewal - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_027 | 02/15/25      | No      | 1808433, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                 |
      | NY_027 | 02/15/25      | No      | 1808433, | PURE Specialty Exchange |

  @NewBusiness @Renewal @TC91005 @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Renewal - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules    | Company                                |
      | NY_027 | 02/04/24      | Yes     | 1808433, | Accredited Specialty Insurance Company |

  @NewBusiness @Renewal @STG
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on Renewal (ITNR) - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
    * I create ITNR transaction
      | SubType             | Notes | Instructions1 | Instructions2 |
      | Conditional Renewal | Test  | Test          | Test          |
    * I click auto create renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to "Application" page
    * I navigate to underwriting alerts tab

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules   | Company                                |
      | NY_025 | 02/15/25      | No      | 2045833 | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules   | Company                                |
      | NY_025 | 02/06/24      | Yes     | 2045833 | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules   | Company                 |
      | NY_025 | 02/15/25      | No      | 2045833 | PURE Specialty Exchange |

  #PRE PROD

  @NewBusiness @PreProd
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referrals are triggered "<Trigger>"

    @Accredited @AfterPDFDate @TC91001
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | No      | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 02/15/25      | No      | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 02/15/25      | No      | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 02/15/25      | No      | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate @TC91000
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 11/04/24      | Yes     | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/04/24      | Yes     | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 11/04/24      | Yes     | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 11/04/24      | Yes     | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 11/04/24      | Yes     | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate @TC91006
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | No      | 1817133, 1816533,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | PURE Specialty Exchange |
      | NY_028 | 02/15/25      | No      | 1812933,                                     | PURE Specialty Exchange |
      | NY_023 | 02/15/25      | No      | 1817733,                                     | PURE Specialty Exchange |
      | NY_026 | 02/15/25      | No      | 1807533, 1808533                             | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @PreProd @TC91002
  Scenario Outline: US46553 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in NY.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46553" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 02/15/25      | 02/16/25          | No      | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 02/15/25      | 02/16/25          | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 02/15/25      | 02/16/25          | No      | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 02/15/25      | 02/16/25          | No      | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 02/15/25      | 02/16/25          | No      | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | 11/05/24          | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |
      | NY_021 | 11/04/24      | 11/05/24          | Yes     | 1817133, 1816533,                            | Accredited Specialty Insurance Company |
      | NY_022 | 11/04/24      | 11/05/24          | Yes     | 1817233, 1813933, 1817433, 1817533, 1812933, | Accredited Specialty Insurance Company |
      | NY_028 | 11/04/24      | 11/05/24          | Yes     | 1812933,                                     | Accredited Specialty Insurance Company |
      | NY_023 | 11/04/24      | 11/05/24          | Yes     | 1817733,                                     | Accredited Specialty Insurance Company |
      | NY_026 | 11/04/24      | 11/05/24          | Yes     | 1807533, 1808533                             | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                                |
      | NY_020 | 11/04/24      | 11/05/24          | Yes     | 1813233, 1813333, 1806933, 1817033, 1809233, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | 02/16/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |
      | NY_021 | 02/15/25      | 02/16/25          | No      | 1817133, 1816533,                            | PURE Specialty Exchange |
      | NY_022 | 02/15/25      | 02/16/25          | No      | 1817233, 1813933, 1817433, 1817533, 1812933, | PURE Specialty Exchange |
      | NY_028 | 02/15/25      | 02/16/25          | No      | 1812933,                                     | PURE Specialty Exchange |
      | NY_023 | 02/15/25      | 02/16/25          | No      | 1817733,                                     | PURE Specialty Exchange |
      | NY_026 | 02/15/25      | 02/16/25          | No      | 1807533, 1808533                             | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                        | Company                 |
      | NY_020 | 02/15/25      | 01/02/25          | No      | 1813233, 1813333, 1806933, 1817033, 1809233, | PURE Specialty Exchange |
