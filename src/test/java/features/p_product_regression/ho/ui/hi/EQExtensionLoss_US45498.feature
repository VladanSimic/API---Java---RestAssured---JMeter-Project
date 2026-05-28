@US45498 @US @HI @Homeowners @HO @PCRegression @2024 @December @UI @Rating
Feature: US45498 - HI Home Earthquake Loss Assessment

  @NB @END @RN @NewBusiness @Endorsement @Renewal @OOS @OOSEndorsement
  Scenario: HI Home Loss Assessment EQ - NB/END/RN/OOS END
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "25,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "10,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,000"

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1" in "STG/US45498" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement 3 months ahead

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 6 Kuhina Pl  | Makawao | HI    | 96768 | Condo/Co-op   | 4100000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I set earthquake loss assessment extension limit to "5,000"

    When I review changes
    And I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | 5,000.00   |            | $50.00    |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    And I click exit button
    * I click more changes button
    Then I set "City_Name_Txt" to "Kaneohe"
    * I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake loss assessment extension to "No"
    When I review changes
    And I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension  | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension  | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension  | 5,000.00   |            | $50.00    |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1" in "STG/US45498" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
    And I click exit button
    Then I review and accept referrals on renewal if any
    And I issue an endorsement

    When I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    Then I validate Premium Summary Table on "Renewal" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension  | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension  | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension  | 5,000.00   |            | $50.00    |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
    And I click exit button
    * I click more changes button

    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 200 Hokiokio Pl #10 | Lahaina | HI    | 96761 | Homeowner     | 6100000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "1,000"
    * I set "City_Name_Txt" to "Haleiwa"
    When I navigate to Location Details Page
    And I navigate via action button next
    Then I set earthquake loss assessment extension to "No"
    * I set "City_Name_Txt" to "Makawao"
    When I navigate to Location Details Page
    And I navigate via action button next
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "5,000"
    * I set "City_Name_Txt" to "Wailuku"
    When I navigate to Location Details Page
    And I navigate via action button next
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,000"
    And I review changes
    * I click renewed premium
    Then I validate Premium Summary Table on "Renewal" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | !Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension  | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension  | 5,000.00   |            | $50.00    |
      | 200 Hokiokio      | Earthquake Loss Assessment Extension  | 1,000.00   |            | $10.00    |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1" in "STG/US45498" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 200 Hokiokio      | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 1,000       | +      |
      | 200 Hokiokio      | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 200 Hokiokio      | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

    When I navigate to transactions or endorsements
    Then I initiate new oos endorsement 1 months ahead

    And I minimize node tree except the first node
    * I expand node tree if needed
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Wailuku"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Kaneohe"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

  @RenewalConversion @RC
  Scenario: HI Home Loss Assessment EQ - Renewal Conversion
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI
    Then I set earthquake loss assessment extension limit to "25,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | !Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | !Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45498" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    Then I validate Premium Summary Table on "Renewal" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | !Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | !Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45498" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |

    And I click exit button
    * I click more changes button
    * I think for 5 to 10 seconds
    Then I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

    * I set "City_Name_Txt" to "Kaneohe"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

    * I set "City_Name_Txt" to "Haleiwa"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "displayed" on the UI

  @DayPrior @PreProd
  Scenario: HI Home Loss Assessment EQ - Day Prior
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | !Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | !Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "DayPrior" in "STG/US45498" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    * I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I navigate to Homeowner Policy Page

    Then I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    * I set "City_Name_Txt" to "Kaneohe"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    * I set "City_Name_Txt" to "Haleiwa"
    And I navigate to Location Details Page
    * I navigate via action button next
    * I verify if element with message "Earthquake Loss Assessment Extension" is "not displayed" on the UI

    And I review changes
    * I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | !Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | !Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "DayPrior" in "STG/US45498" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |

    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @END @RN @NewBusiness @Endorsement @PreProdNew
  Scenario: HI Home Loss Assessment EQ - PreProd
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "25,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "10,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote

    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,000"

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1PP" in "STG/US45498" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement 3 months ahead

    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    * I set risk address 3 address line 1 to "6 Kuhina Pl"
    * I set risk address 3 city to "Makawao"
    * I set risk address 3 state to "HI"
    * I set risk address 3 zip to "96768"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "4100000"
    * I set risk address 3 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Makawao"
    * I set "Residence_Type" to "Condo/Co-op"
    * I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I set earthquake loss assessment extension limit to "5,000"

    When I review changes
    And I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | 5,000.00   |            | $50.00    |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    And I click exit button
    * I click more changes button
    Then I set "City_Name_Txt" to "Kaneohe"
    * I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake loss assessment extension to "No"
    When I review changes
    And I rate an endorsement
    Then I validate Premium Summary Table on "Endorsement" transaction
      | location          | coverage                              | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension  | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | !Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension  | 100,000.00 |            | $1,000.00 |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension  | 5,000.00   |            | $50.00    |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1PP" in "STG/US45498" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                        | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | !Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit    | 5,000       | +      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider  | 1,000       | /      |
      | 6 Kuhina Pl       | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate     | 10          | *      |
    And I click exit button
    Then I review and accept referrals on renewal if any
    And I issue an endorsement

  @NB  @NewBusiness @Rewrite @PreProd
  Scenario: HI Home Loss Assessment EQ - Rewrite
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "25,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "10,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,000"

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 01/01/2025 |
    And I navigate to Homeowner Policy Page
    * I set "City_Name_Txt" to "Haleiwa"
    * I navigate to Location Details Page
    * I navigate via action button next
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "99,000"
    * I set "City_Name_Txt" to "Kaneohe"
    * I navigate to Location Details Page
    * I navigate via action button next
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "1,000"
    * I set "City_Name_Txt" to "Wailuku"
    * I navigate to Location Details Page
    * I navigate via action button next
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "59,999"
    Then I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "Rewrite" transaction
      | location          | coverage                             | limit     | deductible | premium |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 99,000.00 |            | $990.00 |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 1,000.00  |            | $10.00  |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 59,999.00 |            | $599.99 |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 99,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 1,000       | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 59,999      | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @NB @RN @NewBusiness @Endorsement @Renewal
  Scenario: HI Home Loss Assessment EQ - RNWL Effective 02/15/2026
    Given I use "HI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "25,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 45-549 Kuu Home Pl | Kaneohe | HI    | 96744 | Condo/Co-op   | 7500000 |           | 10,000 |            |

    And I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "10,000"

    And I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 190 Hauoli St | Wailuku | HI    | 96793 | Tenants       | 2000000 |           | 10,000 |            |

    Then I navigate to Optional Coverages Page
    * I set earthquake loss assessment extension to "Yes"
    Then I rate a quote
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,000"

    And I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location          | coverage                             | limit      | deductible | premium   |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    When I navigate to premium details page
    And I save coverage factor and value for "Scenario1" in "STG/US45498" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 25,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 10,000      | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 100,000     | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    When I navigate to Homeowner Policy Page
    * I set "City_Name_Txt" to "Haleiwa"
    * I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I set earthquake loss assessment extension limit to "  "
    * I review changes
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "99,000"
    * I set "City_Name_Txt" to "Kaneohe"
    * I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I set earthquake loss assessment extension limit to "  "
    * I review changes
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "1,000"
    * I set "City_Name_Txt" to "Wailuku"
    * I navigate to Location Details Page
    * I navigate via action button next
    * I set earthquake extension radio button to "Yes"
    * I set earthquake extension deductible to "25%"
    * I set earthquake loss assessment extension limit to "  "
    * I review changes
    And I verify if element with message "Yellow fields are mandatory" is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "100,001"
    And I verify if element with message "Earthquake Coverage Loss Assessment Limit cannot exceed $100,000." is "displayed" on the UI
    Then I set earthquake loss assessment extension limit to "59,999"
    Then I review changes
    * I click renewed premium
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "Renewal" transaction
      | location          | coverage                             | limit     | deductible | premium |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 99,000.00 |            | $990.00 |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 1,000.00  |            | $10.00  |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 59,999.00 |            | $599.99 |
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject     | coverage                             | factor                                       | factorValue | method |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 99,000      | +      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 1,000       | +      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Limit   | 59,999      | +      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Divider | 1,000       | /      |
      | 190 Hauoli St     | Earthquake Loss Assessment Extension | Earthquake Loss Assessment Extention Rate    | 10          | *      |
    * I click exit button
    * I review and accept referrals on renewal if any

  @CompareBaseRates
  Scenario Outline: I compare Base Rates recorded on 12/02/2024 "<file1>" and new "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "STG/US45498/"

    Examples:
      | file1                       | file2                                  |
      | Base_DayPrior.xlsx          | Base_Rates_DayPrior_null.xlsx          |
      | Base_RenewalConversion.xlsx | Base_Rates_RenewalConversion_null.xlsx |
      | Base_Scenario1.xlsx         | Base_Rates_Scenario1_null.xlsx         |