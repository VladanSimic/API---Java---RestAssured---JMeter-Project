@US47751 @TC93857 @US @IL @ExcessLiability @EX @PCRegression @2025 @JAN @UI @P2 @PCTeam2Regression
Feature: US47751: IL Excess - Pre-bind forms & UW Referral changes

  @NB @NewBusiness
  Scenario: IL Excess - Pre-bind forms & UW Referral changes - NB

    Given I use "IL_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "2/15/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                               | triggeredOrNot |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.            | Triggered      |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.        | Triggered      |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.    | Triggered      |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. | Triggered      |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness @PreBind
  Scenario: IL Excess - Pre-bind forms & UW Referral changes - Pre-Bind Forms

    Given I use "IL_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "2/15/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
