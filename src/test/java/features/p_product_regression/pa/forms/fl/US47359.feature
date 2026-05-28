@US47359 @US @FL @PersonalAuto @Auto @PA @PCRegression @2025 @Oct @Forms @PCTeam2_PA_P1Regression
Feature: US47359: [Continued] FL Auto 3.1 UI, UW Referral & Forms changes

  @NB @NewBusiness
  Scenario: FL Auto 3.1 Forms changes - Prior New Business

    Given I use "FL_Forms_011" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/14/2025"
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


  @RenewalConversion @RC
  Scenario: FL Auto 3.1 Forms changes - Renewal Conversion

    Given I use "FL_RC_Forms_011" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2024"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_2" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_3" to "No"
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
    When I override subjectivities
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
    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    *  I set driver "2" exclude checkbox to "Yes"
    Then I review changes
    And I click renewed premium
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal
#    * I navigate to transactions or endorsements
#    When I navigate to Renewal "1"
#    Then I navigate to documents tab
#    * I download documents and check if it's not null
#      | document                                     |
#      | Auto Package - Insured/Broker                |
#      | ID Cards Package                             |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |
#      | Auto Package - Additional Insured -Test Name |

  @PreBindForms
  Scenario: FL Auto 3.1 Forms changes - PreBindForms

    Given I use "FL_PRE_Forms_011" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/15/2025"
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
