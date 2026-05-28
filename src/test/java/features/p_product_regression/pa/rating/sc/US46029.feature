@US46029 @TC90446 @TC90448 @US @SC @PersonalAuto @Auto @PA @PCRegression @2024 @DEC @Rating @P2 @PCTeam2Regression
Feature: US46029: SC Auto Base Rate

  @NB @NewBusiness
  Scenario: SC Auto - SC Auto Base Rate -  New Business

    Given I use "SC_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"

    * I set additional vehicles for NB
      | type              | override | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | Full Glass |
      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 500   | 1,000 | Full Glass |

    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
    * I set "Select_Coverage_BI_Limits" to "500,000/1,000,000"
    * I set "Select_Coverage_UM_Limit" to "500,000/1,000,000"
    * I set "Select_Coverage_UIM_Limit" to "500,000/1,000,000"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject               | coverage                    | factor           | factorValue | method |
      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury               | Base Rate - Misc | 388.94      | +      |
      | 1995 Toyota COROLLA         | Bodily Injury               | Base Rate        | 388.94      | +      |
      | 2022 AMERICAN LANDMASTER L5 | Property Damage             | Base Rate - Misc | 299.7       | +      |
      | 1995 Toyota COROLLA         | Property Damage             | Base Rate        | 299.7       | +      |
      | 1995 Toyota COROLLA         | Medical Payments            | Base Rate        | 39.78       | +      |
      | 1995 Toyota COROLLA         | Comprehensive               | Base Rate        | 184.68      | +      |
      | 1995 Toyota COROLLA         | Collision                   | Base Rate        | 393         | +      |
      | 1995 Toyota COROLLA         | Uninsured Motorist BI/PD    | Base Rate        | 54          | +      |
      | 1995 Toyota COROLLA         | Underinsured Motorist BI/PD | Base Rate        | 87          | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

#  @NB @NewBusiness @RC @RenewalConversion
#  Scenario: SC Auto - SC Auto Base Rate -  Renewal Conversion
#
#    Given I use "SC_013" regression test data from "QuoteCreatorPA" sheet
#    When I am logged in to Pure as "P81" unless is PROD then "A1"
#    * I set "Effective_Date" to "2/15/2024"
#    * I set "Additional_Operator_Incidents_" to ","
#    * I set "Additional_Operators" to ","
#
#    * I set "Additional_Vehicles" to "001,002"
#    * I set "Vehicle_Details_Current_Term_Override_1" to "Yes"
#    * I set "Vehicle_Details_Current_Term_Override_Value_1" to "17,840"
#
#    * I set additional vehicles for NB
#      | type              | override | vin               | model            | make                | year | mileage   | comp  | coll  | option     |
#      | Private Passenger | No       | 1NXAE04B1SZ335339 | COROLLA          | TOYOTA              | 1995 | 8,000     | 1,000 | 1,000 | Full Glass |
#      | Golf Carts        | No       | A4PUTVKD6NBA00322 | L5 - SIDE X SIDE | AMERICAN LANDMASTER | 2022 | 0 - 3,000 | 500   | 1,000 | Full Glass |
#
#    * I set "Select_Coverage_Combined_Or_Split_Limits" to "Split limits"
#    * I set "Select_Coverage_BI_Limits" to "500,000/1,000,000"
#    * I set "Select_Coverage_UM_Limit" to "500,000/1,000,000"
#    * I set "Select_Coverage_UIM_Limit" to "500,000/1,000,000"
#
#    And I navigate to quotes page
#    Then I initiate a new quote
#    And I create a new "PA" quote
#    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject               | coverage                    | factor           | factorValue | method |
#      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury               | Base Rate - Misc | 326.84      | +      |
#      | 1995 Toyota COROLLA         | Bodily Injury               | Base Rate        | 326.84      | +      |
#      | 1995 Toyota COROLLA         | Property Damage             | Base Rate        | 249.75      | +      |
#      | 2022 AMERICAN LANDMASTER L5 | Property Damage             | Base Rate - Misc | 249.75      | +      |
#      | 1995 Toyota COROLLA         | Medical Payments            | Base Rate        | 39.78       | +      |
#      | 1995 Toyota COROLLA         | Comprehensive               | Base Rate        | 168.5       | +      |
#      | 1995 Toyota COROLLA         | Collision                   | Base Rate        | 393         | +      |
#      | 1995 Toyota COROLLA         | Uninsured Motorist BI/PD    | Base Rate        | 54          | +      |
#      | 1995 Toyota COROLLA         | Underinsured Motorist BI/PD | Base Rate        | 87          | +      |
#
#    * I click return to premium summary page button
#    Then I navigate to underwriting referrals page
#    And I accept underwriting referrals
#    * I bind a quote
#    When I override subjectivities
#    When I navigate to transactions or endorsements
#    Then I create a renewal
#    And I navigate to policy image page
#    Then I review changes
#    And I click renewed premium
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject               | coverage                    | factor           | factorValue | method |
#      | 1995 Toyota COROLLA         | Bodily Injury               | Base Rate        | 388.94      | +      |
#      | 2022 AMERICAN LANDMASTER L5 | Bodily Injury               | Base Rate - Misc | 388.94      | +      |
#      | 2022 AMERICAN LANDMASTER L5 | Property Damage             | Base Rate - Misc | 299.7       | +      |
#      | 1995 Toyota COROLLA         | Property Damage             | Base Rate        | 299.7       | +      |
#      | 1995 Toyota COROLLA         | Medical Payments            | Base Rate        | 39.78       | +      |
#      | 1995 Toyota COROLLA         | Comprehensive               | Base Rate        | 184.68      | +      |
#      | 1995 Toyota COROLLA         | Collision                   | Base Rate        | 393         | +      |
#      | 1995 Toyota COROLLA         | Uninsured Motorist BI/PD    | Base Rate        | 54          | +      |
#      | 1995 Toyota COROLLA         | Underinsured Motorist BI/PD | Base Rate        | 87          | +      |
#
#    * I click exit button
#    When I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I process a renewal
