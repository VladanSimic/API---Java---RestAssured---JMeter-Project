@HomeownersSurplus @US46554 @TF107 @TF1219 @TF1221
Feature: PSE & Accredited TX - Turn off - UW Referrals

  @NewBusiness @TC90872 @TC90873 @STG
  Scenario Outline: US46554 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46554" in sheet "QuoteCreatorHS" for "HS" LOB
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

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25     | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @TC90874 @STG
  Scenario Outline: US46554 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46554" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | 11/05/24          | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | 11/05/24          | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

  #PRE PROD

  @NewBusiness @PreProd @TC90872 @TC90873
  Scenario Outline: US46554 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46554" in sheet "QuoteCreatorHS" for "HS" LOB
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

    @Accredited @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25     | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @PreProd @TC90874
  Scenario Outline: US46554 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned off/not as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46554" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | 11/05/24          | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                                |
      | TX_020 | 11/04/24      | 11/05/24          | Yes     | 2017133, 2013533, 2013733, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                      | Company                 |
      | TX_020 | 02/15/25      | 02/16/25          | No      | 2017133, 2013533, 2013733, | PURE Specialty Exchange |
