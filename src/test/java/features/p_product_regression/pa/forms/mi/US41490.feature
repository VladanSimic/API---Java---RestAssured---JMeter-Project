@US41490 @US @MI @PersonalAuto @Auto @PA @PCRegression @2024 @Sept @Forms @PCTeam2_PA_P1Regression
Feature: US41490: [Continued] Change Request - MI Auto 3.1

  @NB @NewBusiness
  Scenario: MI Auto 3.1 - Forms - New Business

    Given I use "MI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Vehicle_Details_Mileage_Band_Year_4" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_5" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_6" to "8,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    When I navigate to premium details page
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote

#    When I override subjectivities
#    * I navigate to transactions or endorsements
#    When I navigate to New Business "1"
#    Then I navigate to documents tab
#    * I download documents and check if it's not null
#      | document                                     |
#      | Auto Package - Insured/Broker                |
#      | ID Cards Package                             |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |

  @DayPrior @NB @NewBusiness
  Scenario:MI Auto 3.1 - Forms - Day Prior New Business

    Given I use "MI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "06/30/2024"
    * I set "Vehicle_Details_Mileage_Band_Year_4" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_5" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_6" to "8,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    When I navigate to premium details page
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
#    When I override subjectivities
#    * I navigate to transactions or endorsements
#    When I navigate to New Business "1"
#    Then I navigate to documents tab
#    * I download documents and check if it's not null
#      | document                                     |
#      | Auto Package - Insured/Broker                |
#      | ID Cards Package                             |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |

  @PreBindForms
  Scenario: MI Auto 3.1 - Forms -  PreBindForms

    Given I use "MI_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
    * I set "Vehicle_Details_Mileage_Band_Year_4" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_5" to "8,000"
    * I set "Vehicle_Details_Mileage_Band_Year_6" to "8,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I get customer account ID and Quote Name
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote