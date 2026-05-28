@US45706 @TC92165 @US @WA @ExcessLiability @EX @PCRegression @2024 @DEC @UI @P1 @PCTeam2Regression
Feature: US45706: WA Excess 3.0 - UI, UW Referrals & Forms

  @NB @NewBusiness
  Scenario: WA Excess 3.0 - UI, UW Referrals & Forms - NB

    Given I use "WA_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
#    * I set "Additional_Insured_Num" to "0"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Triggered      |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Triggered      |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Triggered      |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Triggered      |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: WA Excess 3.0 - UI, UW Referrals & Forms - Pre-Bind Forms

    Given I use "WA_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
#    * I set "Additional_Insured_Num" to "0"
    And I navigate to quotes page
    Then I initiate a new quote
    * I get customer account ID and Quote Name
    * I navigate to quote
    * I navigate to quotes detail page
    And I create a new "EX" quote
    * I rate a quote

#  @NB @END @NewBusiness @Endorsement
#  Scenario: WA Excess 3.0  - UI and UW Referrals - END
#
#    Given I use "WA_103" regression test data from "QuoteCreatorEX" sheet
#    When I am logged in to Pure as "P81" unless is PROD then "A1"
#    Then I load random user data
#    * I set "Effective_Date" to "08/15/2024"
#    * I set "Endorsement_Effective_Date_END" to "08/16/2024"
#    And I navigate to quotes page
#    Then I initiate a new quote
#    And I create a new "EX" quote
#    * I rate a quote
#    Then I navigate to underwriting referrals page
#    And I accept underwriting referrals
#    * I bind a quote
#    When I override subjectivities
#    And I navigate to transactions or endorsements
#    Then I initiate new endorsement
##    * I set "Additional_Insured_Num_END" to "0"
#    * I add changes on "EX" endorsement
#    * I navigate to Property Information page
#    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
#    * I navigate to Optional Coverages Page
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
#    * I visit Subjectivity page and populate subjectivities with document "dummyUpload.pdf"
#    * I review changes
#    * I rate an endorsement
#    * I navigate to underwriting alerts tab
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
#      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
#      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
#      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Triggered      |
#      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Triggered      |
#      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Triggered      |
#      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
#      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Triggered      |
#    * I accept underwriting referrals
#    * I issue an endorsement


#  @NB @RC @NewBusiness @RenewalConversion
#  Scenario: WA Excess 3.0 - UI and UW Referrals - RC
#
#    Given I use "WA_103" regression test data from "QuoteCreatorEX" sheet
#    When I am logged in to Pure as "P81" unless is PROD then "A1"
#    Then I load random user data
#    * I set "Effective_Date" to "02/15/2024"
#    And I navigate to quotes page
#    Then I initiate a new quote
#    And I create a new "EX" quote
#    * I navigate to quotes detail page
#    * I navigate to Property Information page
#    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
#    * I navigate to Optional Coverages Page
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
#    * I rate a quote
#    Then I navigate to underwriting referrals page
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
#      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
#      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
#      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Not Triggered  |
#      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Not Triggered  |
#      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Not Triggered  |
#      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
#      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Not Triggered  |
#    And I accept underwriting referrals
#    * I bind a quote
#    When I override subjectivities
#    And I navigate to transactions or endorsements
#    When I create a renewal
#    And I navigate to policy image page
##    * I set "Additional_Insured_Num_RNW" to "0"
#    * I add changes on "EX" renewal
#    * I navigate to Property Information page
#    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
#    * I navigate to Optional Coverages Page
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
#    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
#    * I review changes
#    * I click renewed premium
#    Then I navigate to underwriting alerts tab
#    Then I verify that referral is triggered
#      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
#      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
#      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
#      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Triggered      |
#      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Triggered      |
#      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Triggered      |
#      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
#      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Triggered      |
#    * I accept underwriting referrals
#    * I process a renewal

