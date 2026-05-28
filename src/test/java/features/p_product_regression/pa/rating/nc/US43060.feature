@US43060 @TC86136 @US @NC @PersonalAuto @Auto @PA @PCRegression @2024 @SEPT @Rating @P3 @PCTeam2Regression
Feature: US43060: NC Auto Base Rate, Factors

  @NB @NewBusiness
  Scenario:NC Auto : NC Auto Base Rate, Factors - NB

    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "12/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NC"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "10/18/2001"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_1" to "2024"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "NO"
    * I set "Driver_Details_Full_Time_Student" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_1" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_3" to "No"
    * I set "Vehicle_Details_Driven_By_2" to "Jonny Bravo"
    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make         | year | mileage | comp  | coll  | option     |
      | Private Passenger           | No       | 1FMJK1K50AEA94152 | EXPEDITION | Ford         | 2010 | 12,463  | 250   | 250   | Full Glass |
      | Classic Collectors Car      | No       | 242076P3395191122 | Phantom    | Rolls Royace | 2000 | 9,800   | 1,000 | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha       | 2014 | 2,300   | 250   | 250   | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I think for 5 to 6 seconds

#    Then I validate Premium Summary Table on "New Business" transaction
#      | location             | coverage                                 | limit | deductible | premium |
#      | 2010 Ford EXPEDITION | Combined Uninsured/Underinsured Motorist |       |            | $143.00 |

    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject             | coverage                                 | factor                      | factorValue | method |
      | 2000 Rolls Royace Phantom | Bodily Injury                            | Territory Factor New        | 181         | *      |
      | 2010 Ford EXPEDITION      | Bodily Injury                            | Territory Factor New        | 181         | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury                            | Territory Factor New        | 181         | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage                          | Territory Factor New        | 284         | *      |
      | 2000 Rolls Royace Phantom | Property Damage                          | Territory Factor New        | 284         | *      |
      | 2010 Ford EXPEDITION      | Property Damage                          | Territory Factor New        | 284         | *      |
      | 2014 Yamaha Yzf-R1c       | Medical Payments                         | Territory Factor New        | 15          | *      |
      | 2010 Ford EXPEDITION      | Medical Payments                         | Territory Factor New        | 15          | *      |
      | 2000 Rolls Royace Phantom | Medical Payments                         | Territory Factor New        | 15          | *      |
      | 2000 Rolls Royace Phantom | Comprehensive                            | Territory Factor New        | 105         | *      |
      | 2014 Yamaha Yzf-R1c       | Comprehensive                            | Territory Factor New        | 105         | *      |
      | 2010 Ford EXPEDITION      | Comprehensive                            | Territory Factor New        | 105         | *      |
      | 2010 Ford EXPEDITION      | Collision                                | Territory Factor New        | 621         | *      |
      | 2000 Rolls Royace Phantom | Collision                                | Territory Factor New        | 621         | *      |
      | 2014 Yamaha Yzf-R1c       | Collision                                | Territory Factor New        | 621         | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury                            | Motorcycles Liab Adjustment | 0.1         | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage                          | Motorcycles Liab Adjustment | 0.1         | *      |
      | 2014 Yamaha Yzf-R1c       | Medical Payments                         | Motorcycles Liab Adjustment | 0.35        | *      |
      | 2014 Yamaha Yzf-R1c       | Combined Uninsured/Underinsured Motorist | Motorcycles Liab Adjustment | 2           | *      |


    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

