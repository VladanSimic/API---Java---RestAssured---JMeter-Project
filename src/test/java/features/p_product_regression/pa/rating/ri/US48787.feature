@US48787 @TC96677 @US @RI @PersonalAuto @Auto @PA @PCRegression @2025 @MAR @Rating @P1 @PCTeam2Regression
Feature: US48787: RI Auto - Base Rate, Factor and Dec changes

  @NB @NewBusiness
  Scenario: RI Auto - Base Rate, Factor and Dec changes_NB Transaction - NB

    Given I use "RI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "4/1/2025"
    * I set "Additional_Operators_Additional_Driver_License_State_1" to "RI"
    * I set "Additional_Operators_Additional_Driver_License_State_2" to "RI"
    * I set "Additional_Operator_Incidents_1" to ","
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_Driver_Assigned_To_Another_Vehicle_Insured_Under_A_Separate_PURE_Policy_In_A_Different_State_2" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_1" to "No"
    * I set "Driver_Details_Additional_Driver_Is_The_Members_Primary_Home_Located_In_2" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I verify policy summary discounts "3 Years Clean record" is "Displayed"
    * I verify policy summary discounts "5 Years Clean record" is "Not Displayed"
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage                      | factor                            | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury                 | Base Rate 3.1                     | 1,063       | +      |
      | 2016 Tiffin Motorhomes | Bodily Injury                 | Base Rate - Misc                  | 1,063       | +      |
      | 2019 Acura RDX         | Property Damage               | Base Rate 3.1                     | 583         | +      |
      | 2016 Tiffin Motorhomes | Property Damage               | Base Rate - Misc                  | 583         | +      |
      | 2019 Acura RDX         | Medical Payments              | Base Rate 3.1                     | 68          | +      |
      | 2016 Tiffin Motorhomes | Medical Payments              | Base Rate - Misc                  | 68          | +      |
      | 2019 Acura RDX         | Uninsured Motorists BI        | Base Rate 3.1                     | 205         | +      |
      | 2016 Tiffin Motorhomes | Comprehensive                 | Base Rate - Misc                  | 342         | +      |
      | 2019 Acura RDX         | Comprehensive With Full Glass | Base Rate 3.1                     | 342         | +      |
      | 2019 Acura RDX         | Collision                     | Base Rate 3.1                     | 982         | +      |
      | 2016 Tiffin Motorhomes | Collision                     | Base Rate - Misc                  | 982         | +      |
      |                        | Medical Payments (Collection) | Base Rate - Collector             | 68          | +      |
      | 2019 Acura RDX         | Bodily Injury                 | Years Clean Discount - (Auto 3.1) | 0.8         | *      |
      | 2019 Acura RDX         | Property Damage               | Years Clean Discount - (Auto 3.1) | 0.8         | *      |
      | 2019 Acura RDX         | Medical Payments              | Years Clean Discount - (Auto 3.1) | 0.8         | *      |
      | 2019 Acura RDX         | Collision                     | Years Clean Discount - (Auto 3.1) | 0.8         | *      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities