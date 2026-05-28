@FullRegression
Feature: Operator status on transaction
  As a user I want to make sure that additional tree node option is not visible for added operators when they're in the correct status on
  post NB transaction

  @OperatorStatusCheckV @Endorsement @FullRegression_IntegrationWizards
  Scenario: Personal Auto Operator Status on post NB transaction
    Given I use "AL_001" regression test data from "QuoteCreatorPA" sheet
    When  I am logged in to Pure as "P81"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PA" quote

    *     I rate a quote
    *     I navigate to underwriting referrals page
    *     I accept underwriting referrals
    *     I bind a quote
    *     I override subjectivities

    *     I set "Additional_Vehicles_END" to ","
    *     I set "Additional_Operators_END" to "Operator_003_ADD,"
    *     I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
    *     I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "Aoperator1"
    *     I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "test"
    *     I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "Not in Household"

    Then  I navigate to transactions or endorsements
    And   I initiate new endorsement
    And   I add changes on "PA" endorsement
    And   I verify that tree node with value "Aoperator1" is "Not Displayed"

