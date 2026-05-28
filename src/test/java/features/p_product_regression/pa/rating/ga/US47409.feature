@US47409 @US43057 @TC93216 @US @GA @PersonalAuto @Auto @PA @PCRegression @2025 @JAN @Rating @P3 @PCTeam2Regression
Feature: US47409: [Continued] GA Auto - Base Rates Revision

  @NB @NewBusiness
  Scenario: GA Auto - Base Rates Revision - Reduced by - New Business

    Given I use "GA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"

    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage | comp        | coll        | option      | UMPD  | towing      |
      | Private Passenger           | No       | JM1GL1VM5M1605414 | MAZDA6     | Mazda             | 2021 | 12,000  | 5,000       | 5,000       | Full Glass  |       | 350         |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000       | 1,000       | Full Glass  |       |             |

    * I set "Select_Coverage_UM_Coverages_Radio_Button" to "Reduced by At Fault Liability Limits"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject                | coverage                     | factor                 | factorValue | method |
#
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: GA Auto - Base Rates Revision - Added on - New Business

    Given I use "GA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "13200"

    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage | comp        | coll        | option      | UMPD  | towing      |
      | Private Passenger           | No       | JM1GL1VM5M1605414 | MAZDA6     | Mazda             | 2021 | 12,000  | 5,000       | 5,000       | Full Glass  |       | 350         |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 1,000       | 1,000       | Full Glass  |       |             |

    * I set "Select_Coverage_UM_Coverages_Radio_Button" to "Added on to At Fault Liability Limits"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject                | coverage                     | factor                 | factorValue | method |
#
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities