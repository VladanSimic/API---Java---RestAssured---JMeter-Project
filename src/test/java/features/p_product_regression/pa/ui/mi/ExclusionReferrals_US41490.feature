@US41490 @TC84575 @TC84580 @US @MI @PersonalAuto @Auto @PA @PCRegression @2024 @JUNE @UI @P1 @PCTeam2Regression
Feature: US41490: [Continued] Change Request - MI Auto 3.1

  @NB @NewBusiness
  Scenario: MI Auto 3.1 UI_UWReferrals - New Business

    Given I use "MI_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
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
  Scenario: MI Auto 3.1 UI_UWReferrals - Day Prior New Business

    Given I use "MI_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "06/30/2024"
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

  @NB @NewBusiness @PreBind
  Scenario: MI Auto 3.1 UI_UWReferrals - Pre-Bind Forms

    Given I use "MI_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2024"
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
    * I rate a quote











