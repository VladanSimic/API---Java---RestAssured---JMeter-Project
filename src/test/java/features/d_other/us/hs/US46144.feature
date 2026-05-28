@HomeownersSurplus @US46144 @TF107 @TF1219 @TF1222
Feature: PSE & Accredited TX - Turn on - UW Referrals

  @NewBusiness @TC90879 @TC90878 @STG
  Scenario Outline: US46144 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46144" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/04/24      | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 02/15/25      | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 02/15/25      | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 02/15/25      | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 02/15/25      | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 02/15/25      | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 02/15/25      | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                 | Company                                |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate @TC90876
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/07/24      | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 11/07/24      | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 11/07/24      | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 11/07/24      | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 11/07/24      | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 11/07/24      | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 11/07/24      | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |
      | TX_002 | 02/15/25      | Yes     | 2011033, 2012833,                                              | PURE Specialty Exchange |
      | TX_008 | 02/15/25      | Yes     | 2013133,                                                       | PURE Specialty Exchange |
      | TX_009 | 02/15/25      | Yes     | 2462535,                                                       | PURE Specialty Exchange |
      | TX_017 | 02/15/25      | Yes     | 2008833,                                                       | PURE Specialty Exchange |
      | TX_018 | 02/15/25      | Yes     | 2472835, 2561937,                                              | PURE Specialty Exchange |
      | TX_019 | 02/15/25      | Yes     | 2475035,                                                       | PURE Specialty Exchange |
      | TX_021 | 02/15/25      | Yes     | 2495235,                                                       | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2012233, 2014133, 1966133, 2006933, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @TC90877 @STG
  Scenario Outline: US46144 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46144" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 01/01/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/04/24      | 11/05/24          | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 02/15/25      | 02/16/25          | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 02/15/25      | 02/16/25          | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 02/15/25      | 02/16/25          | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 02/15/25      | 02/16/25          | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 02/15/25      | 02/16/25          | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 02/15/25      | 02/16/25          | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 02/15/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | 11/08/24          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/07/24      | 11/08/24          | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 11/07/24      | 11/08/24          | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 11/07/24      | 11/08/24          | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 11/07/24      | 11/08/24          | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 11/07/24      | 11/08/24          | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 11/07/24      | 11/08/24          | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 11/07/24      | 11/08/24          | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | 11/08/24          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |
      | TX_002 | 02/15/25      | 02/16/25          | Yes     | 2011033, 2012833,                                              | PURE Specialty Exchange |
      | TX_008 | 02/15/25      | 02/16/25          | Yes     | 2013133,                                                       | PURE Specialty Exchange |
      | TX_009 | 02/15/25      | 02/16/25          | Yes     | 2462535,                                                       | PURE Specialty Exchange |
      | TX_017 | 02/15/25      | 02/16/25          | Yes     | 2008833,                                                       | PURE Specialty Exchange |
      | TX_018 | 02/15/25      | 02/16/25          | Yes     | 2472835, 2561937,                                              | PURE Specialty Exchange |
      | TX_019 | 02/15/25      | 02/16/25          | Yes     | 2475035,                                                       | PURE Specialty Exchange |
      | TX_021 | 02/15/25      | 02/16/25          | Yes     | 2495235,                                                       | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |

  #PRE PROD

  @NewBusiness @TC90879 @TC90878 @PreProd
  Scenario Outline: US46144 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46144" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/04/24      | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 02/15/25      | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 02/15/25      | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 02/15/25      | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 02/15/25      | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 02/15/25      | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 02/15/25      | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                 | Company                                |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate @TC90876
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/07/24      | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 11/07/24      | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 11/07/24      | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 11/07/24      | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 11/07/24      | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 11/07/24      | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 11/07/24      | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate @TC90875
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                                |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2012233, 2014133, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |
      | TX_002 | 02/15/25      | Yes     | 2011033, 2012833,                                              | PURE Specialty Exchange |
      | TX_008 | 02/15/25      | Yes     | 2013133,                                                       | PURE Specialty Exchange |
      | TX_009 | 02/15/25      | Yes     | 2462535,                                                       | PURE Specialty Exchange |
      | TX_017 | 02/15/25      | Yes     | 2008833,                                                       | PURE Specialty Exchange |
      | TX_018 | 02/15/25      | Yes     | 2472835, 2561937,                                              | PURE Specialty Exchange |
      | TX_019 | 02/15/25      | Yes     | 2475035,                                                       | PURE Specialty Exchange |
      | TX_021 | 02/15/25      | Yes     | 2495235,                                                       | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | Trigger | Rules                                        | Company                 |
      | TX_001 | 02/15/25      | Yes     | 2484835, 2012233, 2014133, 1966133, 2006933, | PURE Specialty Exchange |

  @NewBusiness @NewBusinessRewrite @PreProd @TC90877
  Scenario Outline: US46144 - Verify that referrals are triggered "<Trigger>" for - "<TCID>" - "<Company>" - on New Business Rewrite - "<EffectiveDate>"
  As an Underwriting manager I would like the referrals listed in the document
  to be turned on/fire as per the trigger rule for the UW companies PSE & Accredited in TX.

    Given I have entered test data for test case "<TCID>" in excel workbook "us/US46144" in sheet "QuoteCreatorHS" for "HS" LOB
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
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 01/01/25      | 01/02/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/04/24      | 11/05/24          | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 02/15/25      | 01/02/25          | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 02/15/25      | 01/02/25          | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 02/15/25      | 01/02/25          | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 02/15/25      | 01/02/25          | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 02/15/25      | 01/02/25          | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 02/15/25      | 01/02/25          | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 02/15/25      | 01/02/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @Accredited @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | 11/08/24          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |
      | TX_002 | 11/07/24      | 11/08/24          | Yes     | 2011033, 2012833,                                              | Accredited Specialty Insurance Company |
      | TX_008 | 11/07/24      | 11/08/24          | Yes     | 2013133,                                                       | Accredited Specialty Insurance Company |
      | TX_009 | 11/07/24      | 11/08/24          | Yes     | 2462535,                                                       | Accredited Specialty Insurance Company |
      | TX_017 | 11/07/24      | 11/08/24          | Yes     | 2008833,                                                       | Accredited Specialty Insurance Company |
      | TX_018 | 11/07/24      | 11/08/24          | Yes     | 2472835, 2561937,                                              | Accredited Specialty Insurance Company |
      | TX_019 | 11/07/24      | 11/08/24          | Yes     | 2475035,                                                       | Accredited Specialty Insurance Company |
      | TX_021 | 11/07/24      | 11/08/24          | Yes     | 2495235,                                                       | Accredited Specialty Insurance Company |

    @E2E_PSE @BeforePDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                                |
      | TX_001 | 11/07/24      | 11/08/24          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | Accredited Specialty Insurance Company |

    @PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |
      | TX_002 | 02/15/25      | 02/16/25          | Yes     | 2011033, 2012833,                                              | PURE Specialty Exchange |
      | TX_008 | 02/15/25      | 02/16/25          | Yes     | 2013133,                                                       | PURE Specialty Exchange |
      | TX_009 | 02/15/25      | 02/16/25          | Yes     | 2462535,                                                       | PURE Specialty Exchange |
      | TX_017 | 02/15/25      | 02/16/25          | Yes     | 2008833,                                                       | PURE Specialty Exchange |
      | TX_018 | 02/15/25      | 02/16/25          | Yes     | 2472835, 2561937,                                              | PURE Specialty Exchange |
      | TX_019 | 02/15/25      | 02/16/25          | Yes     | 2475035,                                                       | PURE Specialty Exchange |
      | TX_021 | 02/15/25      | 02/16/25          | Yes     | 2495235,                                                       | PURE Specialty Exchange |

    @E2E_PSE @AfterPDFDate
    Examples:
      | TCID   | EffectiveDate | NBRWEffectiveDate | Trigger | Rules                                                          | Company                 |
      | TX_001 | 02/15/25      | 02/16/25          | Yes     | 2484835, 2471335, 2012233, 2014133, 2003733, 1966133, 2006933, | PURE Specialty Exchange |
