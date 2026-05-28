@US46928  @TC91968  @US @CT @ExcessLiability @EX @PCRegression @2024 @DEC @Forms @P1 @PCTeam2Regression
Feature: US46928: Change Request - CT Excess 3.0 - PreBind Form

  @NB @NewBusiness
  Scenario: CT Excess 3.0 - Pre Bind Forms - Pre-Bind Forms

    Given I use "CT_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    * I get customer account ID and Quote Name
    * I navigate to quote
    * I navigate to quotes detail page
    And I create a new "EX" quote
    * I rate a quote