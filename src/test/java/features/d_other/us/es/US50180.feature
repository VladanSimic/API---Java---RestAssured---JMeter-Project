@US50180 @Iteration4
Feature: As a South Carolina Excess Surplus application recipient, I want to see the South Carolina specific language
  present below the surplus lines broker block and the applicant's information block.

  Scenario Outline: ES SC - Verify that new form is attached for application document

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I set "Effective_Date" to "03/08/2025"

    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    Then I click create application
    * I download the file "MGU Excess Application" and verify keywords
      | PPEX-ABE-SC-001 (01/2025)                                                                                                                                                                                                                 |
      | THE INSURER CAN CANCEL THIS POLICY FOR WHICH YOU ARE APPLYING WITHOUT CAUSE DURING THE FIRST 120 DAYS. THAT IS THE INSURER'S CHOICE. AFTER THE FIRST 120 DAYS, THE INSURER CAN ONLY CANCEL THIS POLICY FOR REASONS STATED IN THE POLICY. |
      | AM                                                                                                                                                                                                                                        |
      | Any person who knowingly presents a false or fraudulent claim for payment of a loss or benefit or knowingly presents false information in an application for insurance is guilty of a crime and may be subject to fines and confinement in prison.  |
    Examples:
      | TC_ID  | user |
      | SC_001 | P51  |