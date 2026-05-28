@US45706 @US @WA @ExcessLiability @EX @PCRegression @2024 @July @Forms @P1 @PCTeam2Regression
Feature:US45706: WA Excess 3.0 - UI, UW Referrals & Forms

  @NB @NewBusiness
  Scenario: WA Excess 3.0 - Pre Bind Forms - NB

    Given I use "WA_Forms_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
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
