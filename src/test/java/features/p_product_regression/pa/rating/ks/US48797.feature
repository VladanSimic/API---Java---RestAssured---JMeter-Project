@US48797 @TC96381 @TC96382 @TC96383 @TC96384 @US @KS @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48797: KS Auto - Base Rate, Factors, Structural Changes - Part 1

  @NB @END @REN @NewBusiness @Renewal @Endorsement
  Scenario: KS Auto - Base Rate, Factors, Structural Changes -  NB

    Given I use "KS_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Endorsement_Effective_Date_END" to "04/02/2025"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "85000"
    * I set "Vehicle_Details_Temporary_Override_2" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_2" to "85000"

    * I set additional vehicles for NB
      | type              | override | trim_level | vin               | model             | make   | year | mileage | comp  | coll  | option             |
      | Private Passenger | No       |            | 1NXAE04B1SZ335339 | COROLLA           | TOYOTA | 1995 | 8,000   | 1,000 | 1,000 | without Full Glass |
      | Private Passenger | No       |            | 5J8TC2H37KL011921 | RDX               | Acura  | 2019 | 8,000   | 1,000 | 1,000 | with Full Glass    |
      | Motor Home        | No       |            | 1FDWE3FS9HDC25412 | E-SERIES E-350 SD | Thor   | 2018 | 8,000   | 1,000 | 1,000 | with Full Glass    |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I navigate to vehicle 1 details page
    Then I verify private passenger carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueCurrentTerm | MarketValueCurrentTerm |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty               | NotEmpty               |

    * I verify that the UI change for the "Text" type with the specified "vehicle details" block "Vehicle Use" is "Not Displayed" on the UI

    * I navigate to vehicle 2 details page
    Then I verify private passenger carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueCurrentTerm | MarketValueCurrentTerm |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty               | NotEmpty               |

    * I verify that the UI change for the "Text" type with the specified "vehicle details" block "Vehicle Use" is "Not Displayed" on the UI

    * I navigate to vehicle 3 details page
    * I verify that the UI change for the "Text" type with the specified "vehicle details" block "Vehicle Use" is "Not Displayed" on the UI

    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                                                                                        | factor                               | factorValue | method |
      | 2019 Acura RDX      | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
      | 1995 Toyota COROLLA | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
      | 1995 Toyota COROLLA | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
      | 2019 Acura RDX      | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
      | 1995 Toyota COROLLA | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
      | 2019 Acura RDX      | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
      | 1995 Toyota COROLLA | Uninsured Motorists BI (CSL)                                                                    | Base Rate 3.1                        | 71          | +      |
      | 2019 Acura RDX      | Uninsured Motorists BI (CSL)                                                                    | Base Rate 3.1                        | 71          | +      |
      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Base Rate 3.1                        | 255         | +      |
      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Deductible with Full Glass           | 1.161       | *      |
      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Base Rate 3.1                        | 255         | +      |
      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Deductible Factor without Full Glass | 0.929       | *      |
      | 1995 Toyota COROLLA | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
      | 2019 Acura RDX      | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities



#    And I navigate to transactions or endorsements
#    Then I initiate new endorsement
#    * I review changes
#    * I rate an endorsement
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject       | coverage                                                                                        | factor                               | factorValue | method |
#      | 2019 Acura RDX      | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
#      | 1995 Toyota COROLLA | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
#      | 1995 Toyota COROLLA | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
#      | 2019 Acura RDX      | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
#      | 1995 Toyota COROLLA | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
#      | 2019 Acura RDX      | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
#      | 1995 Toyota COROLLA | Uninsured Motorists BI                                                                          | Base Rate 3.1                        | 71          | +      |
#      | 2019 Acura RDX      | Uninsured Motorists BI                                                                          | Base Rate 3.1                        | 71          | +      |
#      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Base Rate 3.1                        | 255         | +      |
#      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Deductible with Full Glass           | 1.161       | *      |
#      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Base Rate 3.1                        | 255         | +      |
#      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Deductible Factor without Full Glass | 0.929       | *      |
#      | 1995 Toyota COROLLA | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
#      | 2019 Acura RDX      | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
#    And I click exit button
#    * I review and accept referrals on renewal if any
#    * I think for 7 to 10 seconds
#    * I issue an endorsement
#    And I navigate to transactions or endorsements
#    When I create a renewal
#    And I navigate to policy image page
#    * I review changes
#    * I click renewed premium
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject       | coverage                                                                                        | factor                               | factorValue | method |
#      | 2019 Acura RDX      | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
#      | 1995 Toyota COROLLA | Bodily Injury                                                                                   | Base Rate 3.1                        | 500         | +      |
#      | 1995 Toyota COROLLA | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
#      | 2019 Acura RDX      | Property Damage                                                                                 | Base Rate 3.1                        | 300         | +      |
#      | 1995 Toyota COROLLA | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
#      | 2019 Acura RDX      | APIP/Medical Expense/Rehabilitation Expense/Funeral Expense/Work Loss/Essential Service Expense | Base Rate 3.1                        | 95          | +      |
#      | 1995 Toyota COROLLA | Uninsured Motorists BI                                                                          | Base Rate 3.1                        | 71          | +      |
#      | 2019 Acura RDX      | Uninsured Motorists BI                                                                          | Base Rate 3.1                        | 71          | +      |
#      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Base Rate 3.1                        | 255         | +      |
#      | 2019 Acura RDX      | Comprehensive With Full Glass                                                                   | Deductible with Full Glass           | 0.968       | *      |
#      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Base Rate 3.1                        | 255         | +      |
#      | 1995 Toyota COROLLA | Comprehensive Without Full Glass                                                                | Deductible Factor without Full Glass | 0.878       | *      |
#      | 1995 Toyota COROLLA | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
#      | 2019 Acura RDX      | Collision                                                                                       | Base Rate 3.1                        | 407         | +      |
#    And I click exit button
#    Then I review and accept referrals on renewal if any
#    * I process a renewal
#
