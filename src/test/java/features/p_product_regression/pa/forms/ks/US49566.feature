@US49566 @TC96807 @TC100561 @US @KS @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Forms @P1 @PCTeam2Regression
Feature: US49566: Change Request - KS Auto - Dec page update to add Annual Mileage

  @NB @NewBusiness
  Scenario: KS Auto - Full Glass Coverage Changes - Forms - NB

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Endorsement_Effective_Date_END" to "04/02/2025"

    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "85000"
    * I set "Vehicle_Details_Temporary_Override_2" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "85000"

    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model   | make    | year | mileage | comp        | coll        | option             | towing      |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA  | 1995 | 8,000   | 1,000       | 1,000       | without Full Glass |             |
      | Private Passenger      | No       |            | 5J8TC2H37KL011921 | RDX     | Acura   | 2019 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |
      | Private Passenger      | No       |            | 3MVDMBCL7LM105089 | CX-30   | Mazda   | 2020 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO     | Pontiac | 1966 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |
      | Exotic Collectors Car  | No       |            | 242076P3395221122 | GTO     | Ford    | 1996 | 8,000   | No Coverage | No Coverage | No Coverage        |             |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities


  @NB @NewBusiness
  Scenario: KS Auto - Full Glass Coverage Changes - Forms - Pre-Bind

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Endorsement_Effective_Date_END" to "04/02/2025"

    * I set "Additional_Vehicles" to "001,002,003,004,005"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "85000"
    * I set "Vehicle_Details_Temporary_Override_2" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "85000"

    * I set additional vehicles for NB
      | type                   | override | trim_level | vin               | model   | make    | year | mileage | comp        | coll        | option             | towing      |
      | Private Passenger      | No       |            | 1NXAE04B1SZ335339 | COROLLA | TOYOTA  | 1995 | 8,000   | 1,000       | 1,000       | without Full Glass |             |
      | Private Passenger      | No       |            | 5J8TC2H37KL011921 | RDX     | Acura   | 2019 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |
      | Private Passenger      | No       |            | 3MVDMBCL7LM105089 | CX-30   | Mazda   | 2020 | 8,000   | No Coverage | No Coverage | No Coverage        | No Coverage |
      | Antique Collectors Car | No       |            | 242076P339510     | GTO     | Pontiac | 1966 | 8,000   | 1,000       | 1,000       | with Full Glass    |             |
      | Exotic Collectors Car  | No       |            | 242076P3395221122 | GTO     | Ford    | 1996 | 8,000   | No Coverage | No Coverage | No Coverage        |             |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote