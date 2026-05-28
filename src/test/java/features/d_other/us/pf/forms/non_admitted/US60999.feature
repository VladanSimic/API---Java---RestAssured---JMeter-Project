@PrimaryFlood @NonAdmitted @US60999
Feature: Change Request - FS - NonAdmitted Include Dec Page with NB-Rewrite Transactions - Dragon

  Scenario Outline: US60999 - Verify that the Declaration Page is attached - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines
    * I create a new "PF" quote

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |

    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    When I review changes FS
    * I click ">>> rate" button
    * I click ">>> complete rewrite transaction"
    * I navigate to transactions or endorsements

    Then I select a transaction "New Business Rewrite"

    When I navigate to documents tab
    * I think for 35 to 45 seconds

    Then I download the file "Flood Surplus Lines Package - Insured/Broker" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Additional Insured - Test1" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Additional Interest - Test2" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Loss Payee - Test3" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Mortgagee - Test4" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Mortgagee - Test5" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Loss Payee - Mortgagee - Test5" and verify keywords
      | <formCode> |

    @TC115328 @TC115329 @TC115330 @TC115331 @TC115332 @TC115333
    Examples:
      | state  | formCode        |
      | CA_001 | PPFL-DEC-CA-001 |

    @TC115334 @TC115335 @TC115336 @TC115337 @TC115338 @TC115339
    Examples:
      | state  | formCode        |
      | FL_001 | PPFL-DEC-FL-001 |

    @TC115340 @TC115341 @TC115342 @TC115343 @TC115344 @TC115345
    Examples:
      | state  | formCode        |
      | LA_001 | PPFL-DEC-LA-001 |

    @TC115346 @TC115347 @TC115348 @TC115349 @TC115350 @TC115351
    Examples:
      | state  | formCode        |
      | NC_001 | PPFL-DEC-NC-001 |

    @TC115352 @TC115353 @TC115354 @TC115355 @TC115356 @TC115357
    Examples:
      | state  | formCode        |
      | MO_001 | PPFL-DEC-MO-001 |

    @TC115358 @TC115359 @TC115360 @TC115361 @TC115362 @TC115363
    Examples:
      | state  | formCode        |
      | AL_001 | PPFL-DEC-AL-001 |

    @TC115364 @TC115365 @TC115366 @TC115367 @TC115368 @TC115369
    Examples:
      | state  | formCode        |
      | KY_001 | PPFL-DEC-KY-001 |

    @TC115370 @TC115371 @TC115372 @TC115373 @TC115374 @TC115375
    Examples:
      | state  | formCode        |
      | MS_001 | PPFL-DEC-MS-001 |

    @TC115376 @TC115377 @TC115378 @TC115379 @TC115380 @TC115381
    Examples:
      | state  | formCode        |
      | AR_001 | PPFL-DEC-AR-001 |

  Scenario Outline: US60999 - Verify that the Declaration Page is attached - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines
    * I create a new "PF" quote

    Then I navigate to Additional Interests page and fill additional interests details
      | Type                | LLC_Trust | Name  | Address_Line_1  | City  | State | ZIP   | Loan  | Mortgage_Type  |
      | Additional Insured  | No        | Test1 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Additional Interest | No        | Test2 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Loss Payee          | No        | Test3 | 101 Main Street | Olean | NY    | 14760 |       |                |
      | Mortgagee           | No        | Test4 | 101 Main Street | Olean | NY    | 14760 | 10000 | First Mortgage |
      | Mortgagee           | No        | Test5 | 101 Main Street | Olean | NY    | 14760 | 20000 | Third Mortgage |
      | Others              | No        | Test6 | 101 Main Street | Olean | NY    | 14760 |       |                |
    * I rate and bind an FS quote

    * I navigate to policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    When I review changes FS
    * I click ">>> rate" button
    * I click ">>> complete rewrite transaction"
    * I navigate to transactions or endorsements

    Then I select a transaction "New Business Rewrite"

    When I navigate to documents tab
    * I think for 35 to 45 seconds

    Then I download the file "Flood Surplus Lines Package - Insured/Broker" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Additional Insured - Test1" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Additional Interest - Test2" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Loss Payee - Test3" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Mortgagee - Test4" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Mortgagee - Test5" and verify keywords
      | <formCode> |
    * I download the file "Home Owners Package - Loss Payee - Mortgagee - Test5" and verify keywords
      | <formCode> |

    @TC115134 @TC115135 @TC115136 @TC115137 @TC115138 @TC115139
    Examples:
      | state  | formCode        |
      | MA_001 | PPFL-DEC-MA-001 |

    @TC115297 @TC115298 @TC115299 @TC115300 @TC115301 @TC115302
    Examples:
      | state  | formCode        |
      | GA_001 | PPFL-DEC-GA-001 |

    @TC115304 @TC115305 @TC115306 @TC115307 @TC115308 @TC115309
    Examples:
      | state  | formCode        |
      | CT_001 | PPFL-DEC-CT-001 |

    @TC115310 @TC115311 @TC115312 @TC115313 @TC115314 @TC115315
    Examples:
      | state  | formCode        |
      | NJ_001 | PPFL-DEC-NJ-001 |

    @TC115316 @TC115317 @TC115318 @TC115319 @TC115320 @TC115321
    Examples:
      | state  | formCode        |
      | IL_001 | PPFL-DEC-IL-001 |

    @TC115322 @TC115323 @TC115324 @TC115325 @TC115326 @TC115327
    Examples:
      | state  | formCode        |
      | CO_001 | PPFL-DEC-CO-001 |