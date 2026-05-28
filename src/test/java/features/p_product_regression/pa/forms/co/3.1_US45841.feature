@US45841 @TC95496 @US @CO @PersonalAuto @Auto @PA @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US45841: [Continued] CO Auto 3.1 UI, UW Referral & Forms changes

  @NB @NewBusiness
  Scenario: CO Auto 3.1 Forms changes - NB

    Given I use "CO_Forms_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "25000"
    * I set "Vehicle_Details_Temporary_Override_2" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "90000"
    * I set "Vehicle_Details_Temporary_Override_3" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "185000"

    * I set additional vehicles for NB
#      | type                   | override | trim_level | vin               | model   | make    | year | mileage | comp        | coll        | option             | towing      | UMPD      |
#     # | Private Passenger      | No       |            | JTJJM7FX0C5038645 | GX 460  | Lexus   | 2012 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage | Rejection |
#      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA  | 1995 | 8,000   | 1,000       | 1,000       | without Full Glass |             |           |
#      | Private Passenger      | No       |            | 5J8TC2H37KL011921 | RDX     | Acura   | 2019 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
#      | Antique Collectors Car | No       |            | 242076P339510     | GTO     | Pontiac | 1966 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |           |
#      | Exotic Collectors Car  | No       |            | 242076P3395221122 | GTO     | Ford    | 1996 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage |           |
      | type                   | override | vin               | model      | make              | year | mileage | comp        | coll        | UMPD      | option             | towing      |
      | Private Passenger      | No       | 3VWC57BU4MM035678 | JETTA      | VOLKSWAGEN        | 2021 | 11,000  | 2,500       | 2,500       | 150       | without Full Glass |             |
      | Private Passenger      | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000  | 1,000       | 1,000       | 150       | with Full Glass    |             |
      | Private Passenger      | No       | WAU92BF22RN025744 | A6         | AUDI              | 2024 | 13,000  | No Coverage | No Coverage | Rejection | No Coverage        | No Coverage |
      | Antique Collectors Car | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000  | 1,000       | 1,000       | 150       | without Full Glass | No Coverage |
      | Exotic Collectors Car  | No       | 242076P3395221122 | GTO        | FORD              | 1996 | 15,900  | No Coverage | No Coverage | 150       | No Coverage        | No Coverage |
      | Motor Home             | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000  | 500         | 500         | 150       | with Full Glass    | No Coverage |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
#    * I rate a quote
#    * I think for 5 to 6 seconds
#    Then I validate Premium Summary Table on "New Business" transaction
#      | location          | coverage                             | limit      | deductible | premium   |
#      | 66-011 Kamehameha | Earthquake Loss Assessment Extension | 25,000.00  |            | $250.00   |
#      | 45-549 Kuu Home   | Earthquake Loss Assessment Extension | 10,000.00  |            | $100.00   |
#      | 190 Hauoli St     | Earthquake Loss Assessment Extension | 100,000.00 |            | $1,000.00 |
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
