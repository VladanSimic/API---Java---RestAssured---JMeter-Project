@US48797 @TC96384 @US @KS @PersonalAuto @Auto @PA @PCRegression @2025 @Mar @UI @PCTeam2_PA_P1Regression
Feature: US48797: KS Auto - Base Rate, Factors, Structural Changes - Part 1

  @NB @END @REN @NewBusiness @Renewal @Endorsement @CompDed
  Scenario:KS Auto Verify Vehicle usage option in Vehicle details page - NB/END/REN

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Endorsement_Effective_Date_END" to "04/02/2025"

    * I set "Additional_Vehicles" to "001,002"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "85000"
    * I set "Vehicle_Details_Temporary_Override_2" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "85000"

    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model             | make   | year | mileage | comp  | coll  | option             |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA           | TOYOTA | 1995 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Motor Home        | No       |            | 1FDWE3FS9HDC25412 | E-SERIES E-350 SD | Thor   | 2018 | 8,000   | 1,000 | 1,000 | with Full Glass    |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I visit vehicle detail page and verify CARFAX
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I think for 7 to 10 seconds
    * I issue an endorsement
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    Then I review and accept referrals on renewal if any
    * I process a renewal

