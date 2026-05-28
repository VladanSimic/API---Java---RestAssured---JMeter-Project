@US47359 @TC94466 @TC94468 @US @FL @PersonalAuto @Auto @PA @PCRegression @2025 @JAN @UI @P1 @PCTeam2Regression
Feature: US47359: [Continued] FL Auto 3.1 UI, UW Referral & Forms changes

  @NB @NewBusiness
  Scenario: FL Auto 3.1 UI, UW Referral - New Business

    Given I use "FL_010" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "2/15/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to Operators and Vehicles Page
    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Displayed" on the UI
    * I rate a quote
    When I navigate to premium details page
    * I verify that "Aoperator Two" factor should not rated
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                               | triggeredOrNot |
      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Triggered      |

    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities

  @NB @NewBusiness @DayPrior
  Scenario: FL Auto 3.1 UI, UW Referral - Day Prior

    Given I use "FL_010" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "2/14/2025"
    * I set "Additional_Operators_Driver_Exclude" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "No"
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
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                               | triggeredOrNot |
      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Not Triggered  |

    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities

  @NB @NewBusiness @PreBind
  Scenario: FL Auto 3.1 UI, UW Referral - Pre-Bind Forms

    Given I use "FL_010" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "2/15/2025"
    * I set "Additional_Operators_Driver_Exclude" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to Operators and Vehicles Page
    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Displayed" on the UI
    * I rate a quote


#  @RenewalConversion @RC
#  Scenario: FL Auto 3.1 UI, UW Referral - Renewal Conversion
#
#    Given I use "FL_RC_010" regression test data from "QuoteCreatorPA" sheet
#    When I am logged in to Pure as "P81" unless is PROD then "A1"
#    * I set "Effective_Date" to "04/01/2024"
#    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "No"
#    * I set "Additional_Operators_Additional_Driver_Exclude_2" to "No"
#    And I navigate to quotes page
#    Then I initiate a new quote
#    And I create a new "PA" quote
#    Then I navigate to customer page
#    * I navigate to insurance score management tab
#    * I override insurance score to "850"
#    * I navigate to customer page
#    * I navigate to quote
#    * I navigate to quotes detail page
#    * I navigate to Operators and Vehicles Page
#    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Not Displayed" on the UI
#    * I rate a quote
#    When I navigate to premium details page
#    * I click return to premium summary page button
#    Then I navigate to underwriting referrals page
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                               | triggeredOrNot |
#      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Not Triggered  |
#    And I accept underwriting referrals
#    And I bind a quote
#    When I override subjectivities
#    When I navigate to transactions or endorsements
#    Then I create a renewal
#    And I navigate to policy image page
#    * I navigate to Operators and Vehicles Page
#    *  I set driver "1" exclude checkbox to "Yes"
#    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Displayed" on the UI
#    Then I review changes
#    And I click renewed premium
#    When I navigate to underwriting alerts tab
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                               | triggeredOrNot |
#      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Triggered      |
#
#    * I accept underwriting referrals
#    * I process a renewal

