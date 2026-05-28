@US47408 @TC94610 @US @FL @PersonalAuto @Auto @PA @PCRegression @2025 @JAN @Forms @P3 @PCTeam2Regression
Feature: US47408: [Continued] FL Auto - Flood Deductible UI and Rate Changes

  @NB @NewBusiness
  Scenario: FL Auto - Flood Deductible UI and Rate Changes - New Business

    Given I use "FL_011" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/15/2025"
    * I set "Additional_Vehicles" to "001,002,003"

    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "30,000"

    * I set additional vehicles for NB
      | type                   | override | vin               | model | make       | year | mileage | OTC_DED | coll  | flood_Deductible | option     | towing      |
      | Private Passenger      | No       | 3VWC57BU4MM035678 | JETTA | VOLKSWAGEN | 2021 | 11,000  | 2,500   | 2,500 | N/A              | Full Glass | 350         |
      | Antique Collectors Car | No       | 242076P339510     | GTO   | Ponatic    | 1966 | 11,000  | 1,000   | 1,000 | 10%              | Full Glass | No Coverage |
      | Exotic Collectors Car  | No       | 242076P3395221122 | GTO   | FORD       | 1966 | 15,900  | 1,000   | 1,000 | 25%              | Full Glass | No Coverage |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject         | coverage                   | factor           | factorValue | method |
      | 2021 Volkswagen JETTA | Comprehensive              | Flood Deductible | 1           | *      |
      | 1966 Ponatic GTO      | Comprehensive (Collection) | Flood Deductible | 0.95        | *      |
      | 1966 FORD GTO         | Comprehensive (Collection) | Flood Deductible | 0.9         | *      |


    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities

  @NB @NewBusiness @RC @RenewalConversion
  Scenario: FL Auto - Flood Deductible UI and Rate Changes - Renewal Conversion

    Given I use "FL_011" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2024"
    * I set "Additional_Vehicles" to "001,002,003"

    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "30,000"

    * I set additional vehicles for NB
      | type                   | override | vin               | model | make       | year | mileage | OTC_DED | coll  | flood_Deductible | option     | towing      |
      | Private Passenger      | No       | 3VWC57BU4MM035678 | JETTA | VOLKSWAGEN | 2021 | 11,000  | 2,500   | 2,500 | N/A              | Full Glass | 350         |
      | Antique Collectors Car | No       | 242076P339510     | GTO   | Ponatic    | 1966 | 11,000  | 1,000   | 1,000 | 10%              | Full Glass | No Coverage |
      | Exotic Collectors Car  | No       | 242076P3395221122 | GTO   | FORD       | 1966 | 15,900  | 1,000   | 1,000 | 25%              | Full Glass | No Coverage |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
    * I navigate to Coverages Page
    * I pause for "2" seconds
    * I set vehicle 1 flood deductible to "N/A"
    * I pause for "1" seconds
    * I set vehicle 2 flood deductible to "10%"
    * I pause for "1" seconds
    * I set vehicle 3 flood deductible to "25%"
    * I pause for "1" seconds
    * I review changes
    * I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject         | coverage                   | factor           | factorValue | method |
      | 2021 Volkswagen JETTA | Comprehensive              | Flood Deductible | 1           | *      |
      | 1966 FORD GTO         | Comprehensive (Collection) | Flood Deductible | 0.9         | *      |
      | 1966 Ponatic GTO      | Comprehensive (Collection) | Flood Deductible | 0.95        | *      |

    And I click exit button
    Then I review and accept referrals on renewal if any
    * I process a renewal
