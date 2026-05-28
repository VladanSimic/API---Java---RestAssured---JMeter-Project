@US50902 @TC100713 @TC100504 @TC100714 @US @NC @PersonalAuto @Auto @PA @PCRegression @2025 @APR @Rating @P2 @PCTeam2Regression
Feature: US50902: [Continued] NC Auto - Base Rate, Factors, UI and Referral update

  @NB @NewBusiness
  Scenario:NC Auto : Base Rates/ILF and UM/UIM - NB

    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Operators" to ","
    * I set "Incidents_Acc_Or_Conviction_Date_3" to "02/03/2024"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NC"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "NC"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "10/18/2001"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_2" to "01/10/1984"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_1" to "2024"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_2" to "2024"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "NO"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_2" to "NO"
    * I set "Driver_Details_Full_Time_Student" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_1" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_3" to "No"
    * I set "Vehicle_Details_Driven_By_2" to "Jonny Bravo"
    * I set "Vehicle_Details_Driven_By_3" to "Jonny Bravo"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make         | year | mileage | comp  | coll  | option     |
      | Private Passenger           | No       | 1FMJK1K50AEA94152 | EXPEDITION | Ford         | 2010 | 12,463  | 250   | 250   | Full Glass |
      | Classic Collectors Car      | No       | 242076P3395191122 | Phantom    | Rolls Royace | 2000 | 9,800   | 1,000 | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha       | 2014 | 2,300   | 250   | 250   | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to Coverages Page
    Then  I click BI Limits dropdown
    Then I verify dropdown size is 10
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/100,000     |
      | 100,000/200,000     |
      | 100,000/300,000     |
      | 250,000/500,000     |
      | 300,000/300,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
      | 1,000,000/2,000,000 |

    * I click on the footer
    Then  I click UM UMI Limits dropdown
    Then I verify dropdown size is 9
    * I verify dropdown values
      | values                                |
      | - Select -                            |
      | $50,000/$100,000/$50,000 UM/UIM       |
      | $100,000/$200,000/$100,000 UM/UIM     |
      | $100,000/$300,000/$100,000 UM/UIM     |
      | $300,000/$300,000/$250,000 UM/UIM     |
      | $250,000/$500,000/$100,000 UM/UIM     |
      | $500,000/$500,000/$250,000 UM/UIM     |
      | $500,000/$1,000,000/$500,000 UM/UIM   |
      | $1,000,000/$1,000,000/$500,000 UM/UIM |


    * I click on the footer
    * I rate a quote
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "New Business" transaction
      | location             | coverage                                 | limit | deductible | premium |
      | 2010 Ford EXPEDITION | Combined Uninsured/Underinsured Motorist |       |            | $143.00 |

    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject             | coverage        | factor               | factorValue | method |
      | 2000 Rolls Royace Phantom | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2010 Ford EXPEDITION      | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2010 Ford EXPEDITION      | Property Damage | Territory Factor New | 292         | *      |
      | 2000 Rolls Royace Phantom | Property Damage | Territory Factor New | 292         | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage | Territory Factor New | 292         | *      |
      | 2000 Rolls Royace Phantom | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2010 Ford EXPEDITION      | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2010 Ford EXPEDITION      | Property Damage | Limits Factor        | 1.062       | *      |
      | 2000 Rolls Royace Phantom | Property Damage | Limits Factor        | 1.062       | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage | Limits Factor        | 1.062       | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                       | triggeredOrNot |
      | The user has selected state minimum limits which may be inadequate for the PURE Excess policy required minimum limits and result in a gap in cover. Please discuss this potential gap with the broker and document their confirmation of the potential gap prior to processing. | Triggered      |
      | This policy is renewing with state minimum limits and may be inadequate for the required minimum limits of an Excess policy resulting in a gap in cover. Please confirm and document that the broker is aware of the potential gap.                                             | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @REN @Renewal
  Scenario:NC Auto : Base Rates/ILF and UM/UIM - NB & REN

    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NC"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "10/18/2001"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_1" to "2024"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "NO"
    * I set "Driver_Details_Full_Time_Student" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_1" to "No"

    * I set "Additional_Vehicles" to "001"
    * I set additional vehicles for NB
      | type              | override | vin               | model      | make | year | mileage | comp | coll | option     |
      | Private Passenger | No       | 1FMJK1K50AEA94152 | EXPEDITION | Ford | 2010 | 12,463  | 250  | 250  | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                           | triggeredOrNot |
      | This policy is renewing with state minimum limits and may be inadequate for the required minimum limits of an Excess policy resulting in a gap in cover. Please confirm and document that the broker is aware of the potential gap. | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                           | triggeredOrNot |
      | This policy is renewing with state minimum limits and may be inadequate for the required minimum limits of an Excess policy resulting in a gap in cover. Please confirm and document that the broker is aware of the potential gap. | Triggered      |

    * I accept underwriting referrals
    * I process a renewal


  @NB @NewBusiness @RC @RenewalConversion
  Scenario:NC Auto : Base Rates/ILF and UM/UIM - RenewalConversion

    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Additional_Operators" to ","
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "NC"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "NC"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_1" to "10/18/2001"
    * I set "Additional_Operators_Additional_Driver_Date_Of_Birth_2" to "01/10/1984"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_1" to "2024"
    * I set "Additional_Operators_Additional_Driver_The_First_Year_You_Were_Licensed_In_The_US_Canada_Or_PuertoRico_2" to "2024"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "NO"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_2" to "NO"
    * I set "Driver_Details_Full_Time_Student" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_1" to "No"
    * I set "Does_Vehicle_Have_Mobile_Device_Control_3" to "No"
    * I set "Vehicle_Details_Driven_By_2" to "Jonny Bravo"
    * I set "Vehicle_Details_Driven_By_3" to "Jonny Bravo"

    * I set "Additional_Vehicles" to "001,002,003"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make         | year | mileage | comp  | coll  | option     |
      | Private Passenger           | No       | 1FMJK1K50AEA94152 | EXPEDITION | Ford         | 2010 | 12,463  | 250   | 250   | Full Glass |
      | Classic Collectors Car      | No       | 242076P3395191122 | Phantom    | Rolls Royace | 2000 | 9,800   | 1,000 | 1,000 | Full Glass |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha       | 2014 | 2,300   | 250   | 250   | Full Glass |

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
#    Then I navigate to Coverages Page
#    Then  I click BI Limits dropdown
#    Then I verify dropdown size is 11
#    * I verify dropdown values
#      | values              |
#      | - Select -          |
#      | 30,000/60,000       |
#      | 50,000/100,000      |
#      | 100,000/100,000     |
#      | 100,000/200,000     |
#      | 100,000/300,000     |
#      | 250,000/500,000     |
#      | 300,000/300,000     |
#      | 500,000/1,000,000   |
#      | 1,000,000/1,000,000 |
#      | 1,000,000/2,000,000 |
#
#    * I click on the footer
#    Then  I click UM UMI Limits dropdown
#    Then I verify dropdown size is 10
#    * I verify dropdown values
#      | values                                |
#      | - Select -                            |
#      | $30,000/$60,000/$25,000 UM/UIM        |
#      | $50,000/$100,000/$50,000 UM/UIM       |
#      | $100,000/$200,000/$100,000 UM/UIM     |
#      | $100,000/$300,000/$100,000 UM/UIM     |
#      | $300,000/$300,000/$250,000 UM/UIM     |
#      | $250,000/$500,000/$100,000 UM/UIM     |
#      | $500,000/$500,000/$250,000 UM/UIM     |
#      | $500,000/$1,000,000/$500,000 UM/UIM   |
#      | $1,000,000/$1,000,000/$500,000 UM/UIM |
#
#
#    * I click on the footer
    * I rate a quote
#    * I think for 5 to 6 seconds
#    Then I validate Premium Summary Table on "New Business" transaction
#      | location             | coverage                                 | limit | deductible | premium |
#      | 2010 Ford EXPEDITION | Combined Uninsured/Underinsured Motorist |       |            | $ 89.00 |
#
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject             | coverage        | factor               | factorValue | method |
#      | 2000 Rolls Royace Phantom | Bodily Injury   | Territory Factor New | 181         | *      |
#      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Territory Factor New | 181         | *      |
#      | 2010 Ford EXPEDITION      | Bodily Injury   | Territory Factor New | 181         | *      |
#      | 2010 Ford EXPEDITION      | Property Damage | Territory Factor New | 284         | *      |
#      | 2000 Rolls Royace Phantom | Property Damage | Territory Factor New | 284         | *      |
#      | 2014 Yamaha Yzf-R1c       | Property Damage | Territory Factor New | 284         | *      |
#      | 2000 Rolls Royace Phantom | Bodily Injury   | Limits Factor        | 1.830       | *      |
#      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Limits Factor        | 1.830       | *      |
#      | 2010 Ford EXPEDITION      | Bodily Injury   | Limits Factor        | 1.830       | *      |
#      | 2010 Ford EXPEDITION      | Property Damage | Limits Factor        | 1.048       | *      |
#      | 2000 Rolls Royace Phantom | Property Damage | Limits Factor        | 1.048       | *      |
#      | 2014 Yamaha Yzf-R1c       | Property Damage | Limits Factor        | 1.048       | *      |
#
#    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                       | triggeredOrNot |
      | The user has selected state minimum limits which may be inadequate for the PURE Excess policy required minimum limits and result in a gap in cover. Please discuss this potential gap with the broker and document their confirmation of the potential gap prior to processing. | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    Then I navigate to Coverages Page
    Then  I click BI Limits dropdown
    Then I verify dropdown size is 10
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/100,000     |
      | 100,000/200,000     |
      | 100,000/300,000     |
      | 250,000/500,000     |
      | 300,000/300,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
      | 1,000,000/2,000,000 |

    * I click on the footer
    Then  I click UM UMI Limits dropdown
    Then I verify dropdown size is 10
    * I verify dropdown values
      | values                                |
      | - Select -                            |
      | $50,000/$100,000/$50,000 UM/UIM       |
      | $100,000/$200,000/$100,000 UM/UIM     |
      | $100,000/$300,000/$100,000 UM/UIM     |
      | $300,000/$300,000/$250,000 UM/UIM     |
      | $250,000/$500,000/$100,000 UM/UIM     |
      | $500,000/$500,000/$250,000 UM/UIM     |
      | $500,000/$1,000,000/$500,000 UM/UIM   |
      | $1,000,000/$1,000,000/$500,000 UM/UIM |


    * I click on the footer
    Then I review changes
    And I click renewed premium
    * I think for 5 to 6 seconds
    Then I validate Premium Summary Table on "Renewal" transaction
      | location             | coverage                                 | limit | deductible | premium  |
      | 2010 Ford EXPEDITION | Combined Uninsured/Underinsured Motorist |       |            | $143.00 |

    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject             | coverage        | factor               | factorValue | method |
      | 2000 Rolls Royace Phantom | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2010 Ford EXPEDITION      | Bodily Injury   | Territory Factor New | 217         | *      |
      | 2010 Ford EXPEDITION      | Property Damage | Territory Factor New | 292         | *      |
      | 2000 Rolls Royace Phantom | Property Damage | Territory Factor New | 292         | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage | Territory Factor New | 292         | *      |
      | 2000 Rolls Royace Phantom | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2010 Ford EXPEDITION      | Bodily Injury   | Limits Factor        | 1.61        | *      |
      | 2010 Ford EXPEDITION      | Property Damage | Limits Factor        | 1.062       | *      |
      | 2000 Rolls Royace Phantom | Property Damage | Limits Factor        | 1.062       | *      |
      | 2014 Yamaha Yzf-R1c       | Property Damage | Limits Factor        | 1.062       | *      |

     * I click exit button
    When I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                       | triggeredOrNot |
      | This policy is renewing with state minimum limits and may be inadequate for the required minimum limits of an Excess policy resulting in a gap in cover. Please confirm and document that the broker is aware of the potential gap.                                             | Triggered      |

    * I accept underwriting referrals
    * I process a renewal

#  @ProcessRenewal
#  Scenario Outline: Create renewal for "<policyID>"
#    Given I use "NC_014" regression test data from "QuoteCreatorPA" sheet
#    * I am logged in to Pure as Field
#    * I navigate to policies
#    * I select a policy by ID "<policyID>"
#    * I navigate to transactions or endorsements
#    Then I create a renewal
#    And I navigate to policy image page
#    Then I navigate to Coverages Page
#    Then  I click BI Limits dropdown
#    Then I verify dropdown size is 10
#    * I verify dropdown values
#      | values              |
#      | - Select -          |
#      | 50,000/100,000      |
#      | 100,000/100,000     |
#      | 100,000/200,000     |
#      | 100,000/300,000     |
#      | 250,000/500,000     |
#      | 300,000/300,000     |
#      | 500,000/1,000,000   |
#      | 1,000,000/1,000,000 |
#      | 1,000,000/2,000,000 |
#
#    * I click on the footer
#    Then  I click UM UMI Limits dropdown
#    Then I verify dropdown size is 9
#    * I verify dropdown values
#      | values                                |
#      | - Select -                            |
#      | $50,000/$100,000/$50,000 UM/UIM       |
#      | $100,000/$200,000/$100,000 UM/UIM     |
#      | $100,000/$300,000/$100,000 UM/UIM     |
#      | $300,000/$300,000/$250,000 UM/UIM     |
#      | $250,000/$500,000/$100,000 UM/UIM     |
#      | $500,000/$500,000/$250,000 UM/UIM     |
#      | $500,000/$1,000,000/$500,000 UM/UIM   |
#      | $1,000,000/$1,000,000/$500,000 UM/UIM |
#
#
#    * I click on the footer
#    Then I review changes
#    And I click renewed premium
#    * I think for 5 to 6 seconds
#    Then I validate Premium Summary Table on "Renewal" transaction
#      | location             | coverage                                 | limit | deductible | premium  |
#      | 2010 Ford EXPEDITION | Combined Uninsured/Underinsured Motorist |       |            | $143.00 |
#
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject             | coverage        | factor               | factorValue | method |
#      | 2000 Rolls Royace Phantom | Bodily Injury   | Territory Factor New | 217         | *      |
#      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Territory Factor New | 217         | *      |
#      | 2010 Ford EXPEDITION      | Bodily Injury   | Territory Factor New | 217         | *      |
#      | 2010 Ford EXPEDITION      | Property Damage | Territory Factor New | 292         | *      |
#      | 2000 Rolls Royace Phantom | Property Damage | Territory Factor New | 292         | *      |
#      | 2014 Yamaha Yzf-R1c       | Property Damage | Territory Factor New | 292         | *      |
#      | 2000 Rolls Royace Phantom | Bodily Injury   | Limits Factor        | 1.61        | *      |
#      | 2014 Yamaha Yzf-R1c       | Bodily Injury   | Limits Factor        | 1.61        | *      |
#      | 2010 Ford EXPEDITION      | Bodily Injury   | Limits Factor        | 1.61        | *      |
#      | 2010 Ford EXPEDITION      | Property Damage | Limits Factor        | 1.062       | *      |
#      | 2000 Rolls Royace Phantom | Property Damage | Limits Factor        | 1.062       | *      |
#      | 2014 Yamaha Yzf-R1c       | Property Damage | Limits Factor        | 1.062       | *      |
#
#    * I click exit button
#    When I navigate to underwriting alerts tab
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                                                                                                                                       | triggeredOrNot |
#      | This policy is renewing with state minimum limits and may be inadequate for the required minimum limits of an Excess policy resulting in a gap in cover. Please confirm and document that the broker is aware of the potential gap.                                             | Triggered      |
#
#    * I accept underwriting referrals
#    * I process a renewal
#
#    Examples:
#      | policyID    |
#      | PA259878700 |