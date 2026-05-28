@US39223 @US @IN @PersonalAuto @Auto @PA @PCRegression @2024 @APL @UI @UWReferrals @PCTeam2_PA_P1Regression
Feature: US39223: [Continued] IN Auto 3.1 - Forms

  @NB @NewBusiness
  Scenario: IN Auto 3.1 - UI/UW referrals- New Business

    Given I use "IN_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/15/2024"
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

  @DayPrior @NB @NewBusiness
  Scenario: IN Auto 3.1 - UI/UW referrals - Day Prior New Business

    Given I use "IN_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "5/14/2024"
    * I set "Additional_Operators_Additional_Driver_Exclude_1" to "No"
    * I set "Additional_Operators_Additional_Driver_Exclude_2" to "No"
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
    * I verify that the UI change for the "Checkbox" type with the specified "Operators manually added / added from active household quotes & policies" block "Exclude" is "Not Displayed" on the UI
    * I rate a quote
    When I navigate to premium details page
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                               | triggeredOrNot |
      | A driver is listed as an 'excluded operator'. Please refer to Underwriting. Note - a signed 'Driver Exclusion Notice' would be required if we agree to release a quote. | Not Triggered  |

    And I accept underwriting referrals
    And I bind a quote






























#  @Forms
#  Scenario Outline: Download Documents - "<policyID>"
#
#    * I am logged in to Pure as Field
#    * I navigate to policies
#    * I select a policy by ID "<policyID>"
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
#
#
#
#    Examples:
#      | policyID    |
#      | PA255638900 |



