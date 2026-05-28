@US50716 @TC99377 @US @PA @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US50716: [Continued] PA - Auto - Accident Surcharge Threshold Increase

  @NB @NewBusiness
  Scenario: PA Auto: Accident Surcharge Threshold Increase and Pennsylvania Surcharge Disclosure Plan - PFA-DSC-PA-002 - NB

    Given I use "PA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"

    * I set "Driver_Incidents" to "001,002,003,004"
    * I set "Incidents_Source_1" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_1" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_1" to "07/02/2025"
    * I set "Incidents_LossAmount_1" to "2,250"

    * I set "Incidents_Source_2" to "Broker/MVR"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_2" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_2" to "02/08/2022"
    * I set "Incidents_LossAmount_2" to "1,799"

    * I set "Incidents_Source_3" to "Insured/Applicant"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_3" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "06/10/2023"
    * I set "Incidents_LossAmount_3" to "1,899"

    * I set "Incidents_Source_4" to "Broker/CLUE"
    * I set "Incidents_Accident_Or_Violation_Within_Last_5_Years_4" to "At-fault accident"
    * I set "Incidents_Acc_Or_Conviction_Date_4" to "07/01/2024"
    * I set "Incidents_LossAmount_4" to "2,099"

    * I set "Additional_Vehicles" to "001,002"
    * I set additional vehicles for NB
      | type                   | vin               | model   | make        | year | mileage | OTC_DED | coll  | option             |
      | Private Passenger      | 1NXAE04B1SZ335339 | COROLLA | TOYOTA      | 1995 | 8,000   | 1,000   | 2,500 | without Full Glass |
      | Classic Collectors Car | 242076P3395191122 | R100    | Rolls Royce | 2000 | 2,300   | 1,000   | 5,000 | with Full Glass    |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject              | coverage                                      | factor                          | factorValue | method |
#
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities