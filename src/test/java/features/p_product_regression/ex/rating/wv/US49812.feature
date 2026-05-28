@US49812 @TC99021 @US @WV @ExcessLiability @EX @PCRegression @2025 @APR @Rating @P1 @PCTeam2Regression
Feature: US49812: [Continued] WV - Excess - Base Rates & UM Rates

  @NB @NewBusiness
  Scenario: WV Excess:  Base Rates & UM Rates - NewBusiness

    Given I use "WV_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "05/15/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
#    When I navigate to premium details page
#    Then I validate premium details page table
#      | relatedObject                                    | coverage                                       | factor                               | factorValue | method |
#
#          * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities