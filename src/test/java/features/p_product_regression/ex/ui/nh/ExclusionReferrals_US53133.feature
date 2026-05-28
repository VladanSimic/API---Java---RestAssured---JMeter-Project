@US53133 @US @NH @ExcessLiability @EX @PCRegression @2025 @JUNE @UI @P1 @PCTeam2Regression
Feature: US53133: NH - Excess 3.0 changes for UI, UW Referrals and Forms

  @NB @RN @NewBusiness @Renewal @Existing
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Existing - NB/REN

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Endorsement_Effective_Date_END" to "07/02/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I verify that the documentation upload date and time pulled
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
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
 #   * I add changes on "EX" renewal
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I verify that the documentation upload date and time pulled
    * I review changes
    * I click renewed premium
    Then I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | This policy is renewing with the Specific Premises Liability Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                      | Triggered      |
      | This policy is renewing with the Designated Ongoing Operations Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                    | Triggered      |
      | This policy is renewing with the Named Person Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                                     | Triggered      |
      | This policy is renewing with the Canine Liability Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                                 | Triggered      |
      | This policy is renewing with the Named Auto Liability Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                                 | Triggered      |
      | This policy is renewing with the Additional Excess Liability Coverage applied to the policy. Please contact the broker, confirm the member still carries a separate primary Excess liability policy, and upload the most current declaration page to the Documents tab of the account. Update the information on the Optional Coverages page. Clearly document acceptability prior to approving and processing the renewal. | Triggered      |
      | This policy is renewing with the Named Auto and Operator Exclusion applied. Please review the policy and the account and clearly document if this exclusion should remain on the policy and why. If the exclusion is no longer relevant or necessary, please enter a note in the Diary and remove prior to processing the renewal.                                                                                          | Triggered      |

    * I accept underwriting referrals
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @New
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - New - NB/END

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Endorsement_Effective_Date_END" to "07/02/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Additional_Operator_Exclude" to "No,"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Additional_Operators_Num" to "1"
    * I set "Additional_Insured_Num" to "0"
    * I set "Additional_Insured" to ","
    * I set "Additional_Properties_Num" to "0"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Optional_Coverages_Designated_Ongoing_Operation_Exclusion" to "No"
    * I set "Optional_Coverages_NamedPersonExclusion" to "No"
    * I set "Optional_Coverages_NamedAutoLiabilityExclusion" to "No"
    * I set "Excess_Policies_As_Primary_Coverage" to "No"
    * I set "Excess_Liability_Coverages_Num" to "0"
    * I set "Exclude_An_Operator_For_A_Specific_Auto" to "No"
    * I set "Named_Auto_And_Operator_Exclusion" to "0"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    * I set "Additional_Operator_Exclude" to "Yes,"
    * I set "Additional_Operators_Num_END" to "1"
    * I set "Additional_Insured_Num_END" to "5"
    * I set "Additional_Properties_Num_END" to "1"
    * I set "Optional_Coverages_Canine_Liability_Exclusion_END" to "Yes"
    * I set "Optional_Coverages_Designated_Ongoing_Operation_Exclusion_END" to "Yes"
    * I set "Optional_Coverages_NamedPersonExclusion_END" to "Yes"
    * I set "Optional_Coverages_NamedAutoLiabilityExclusion_END" to "Yes"
    * I set "Excess_Policies_As_Primary_Coverage_END" to "Yes"
    * I set "Excess_Liability_Coverages_Num_END" to "1"
    * I set "Exclude_An_Operator_For_A_Specific_Auto_END" to "Yes"
    * I set "Named_Auto_And_Operator_Exclusion_END" to "1"
    Then I initiate new endorsement
    * I add changes on "EX" endorsement
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I verify that the documentation upload date and time pulled
    * I visit Subjectivity page and populate subjectivities with document "dummyUpload.pdf"
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Person Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                                  | Triggered      |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Canine Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                          | Triggered      |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                  | Triggered      |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto and Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                            | Triggered      |
    * I accept underwriting referrals
    * I issue an endorsement

  @NB @RN @NewBusiness @Renewal @New
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - New - NB/REN

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Endorsement_Effective_Date_END" to "07/02/2025"
    * I set "Additional_Operator_Exclude" to "No,"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Additional_Operators_Num" to "1"
    * I set "Additional_Insured_Num" to "0"
    * I set "Additional_Insured" to ","
    * I set "Additional_Properties_Num" to "0"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Optional_Coverages_Designated_Ongoing_Operation_Exclusion" to "No"
    * I set "Optional_Coverages_NamedPersonExclusion" to "No"
    * I set "Optional_Coverages_NamedAutoLiabilityExclusion" to "No"
    * I set "Excess_Policies_As_Primary_Coverage" to "No"
    * I set "Excess_Liability_Coverages_Num" to "0"
    * I set "Exclude_An_Operator_For_A_Specific_Auto" to "No"
    * I set "Named_Auto_And_Operator_Exclusion" to "0"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    * I set "Additional_Operators_Num_RNW" to "1"
    * I set "Additional_Operator_Exclude" to "Yes,"
    * I set "Additional_Insured_Num_RNW" to "5"
    * I set "Additional_Properties_Num_RNW" to "1"
    * I set "Optional_Coverages_Canine_Liability_Exclusion_RNW" to "Yes"
    * I set "Optional_Coverages_Designated_Ongoing_Operation_Exclusion_RNW" to "Yes"
    * I set "Optional_Coverages_NamedPersonExclusion_RNW" to "Yes"
    * I set "Optional_Coverages_NamedAutoLiabilityExclusion_RNW" to "Yes"
    * I set "Excess_Policies_As_Primary_Coverage_RNW" to "Yes"
    * I set "Excess_Liability_Coverages_Num_RNW" to "1"
    * I set "Exclude_An_Operator_For_A_Specific_Auto_RNW" to "Yes"
    * I set "Named_Auto_And_Operator_Exclusion_RNW" to "1"
    When I create a renewal
    And I navigate to policy image page
    * I add changes on "EX" renewal
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I verify that the documentation upload date and time pulled
    * I review changes
    * I click renewed premium
    Then I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Person Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                                  | Triggered      |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Canine Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                          | Triggered      |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                  | Triggered      |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto and Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                            | Triggered      |
      | The Named Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                              | Triggered      |

    * I accept underwriting referrals
    * I process a renewal

  @NB @RN @NewBusiness @Renewal @RenewalConversion @RC
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Renewal Conversion

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "08/15/2024"
    * I set "Additional_Operator_Exclude" to "No,"
    * I set "Additional_Insured" to ","
    * I set "Additional_Insured_Num" to "0"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Excess_Policies_As_Primary_Coverage" to "No"
    * I set "Excess_Liability_Coverages_Num" to "0"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
      * I rate a quote
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
#    * I navigate to policies
#    * I select a policy by ID "EX260452100"
    And I navigate to transactions or endorsements
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Additional_Operator_Exclude_RNW" to "Yes,"
    When I create a renewal
    And I navigate to policy image page
    * I add changes on "EX" renewal
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Displayed" on the UI
    * I verify that the documentation upload date and time pulled
    * I review changes
    * I click renewed premium
    Then I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Triggered      |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Triggered      |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Person Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                                  | Triggered      |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Canine Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                          | Triggered      |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                  | Triggered      |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Triggered      |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto and Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                            | Triggered      |
      | The Named Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                              | Triggered      |

    * I accept underwriting referrals
    * I process a renewal

  @NB @END @NewBusiness @Endorsement @DayBefore @DayBeforePD
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Day Before END

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "06/30/2025"
    * I set "Endorsement_Effective_Date_END" to "06/30/2025"
    * I set "Additional_Insured_Num" to "0"
    * I set "Additional_Insured" to ","
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Not Triggered  |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Not Triggered  |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Not Triggered  |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    * I set "Additional_Insured_Num_END" to "0"
    * I set "Additional_Insured_Type_END" to ","
    Then I initiate new endorsement
    * I add changes on "EX" endorsement
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
    * I visit Subjectivity page and populate subjectivities with document "dummyUpload.pdf"
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Person Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                                  | Not Triggered  |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Canine Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                          | Not Triggered  |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                  | Not Triggered  |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto and Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                            | Not Triggered  |
    * I accept underwriting referrals
    * I issue an endorsement

  @NB @NewBusiness @DayBefore @DayBeforeRB
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Day Before RB

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "08/14/2024"
    * I set "Additional_Insured_Num" to "0"
    * I set "Additional_Insured" to ","
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Not Triggered  |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Not Triggered  |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Not Triggered  |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    When I create a renewal
    And I navigate to policy image page
    * I set "Additional_Insured_Num_RNW" to "0"
    * I set "Additional_Insured_Type_RNW" to ","
    * I add changes on "EX" renewal
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
    * I review changes
    * I click renewed premium
    Then I navigate to underwriting alerts tab
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Person Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                                  | Not Triggered  |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Canine Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                          | Not Triggered  |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto Liability Exclusion form and upload to the Documents tab of the member's account prior to processing.                                                  | Not Triggered  |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Auto and Operator Exclusion form and upload to the Documents tab of the member's account prior to processing.                                            | Not Triggered  |
      | The Named Operator Exclusion has been selected. Please provide details on why this exclusion has been applied. Please secure a completed and signed Named Operator Exclusion form and upload to the Documents tab the member's account prior to processing.                                                                 | Not Triggered  |
    * I accept underwriting referrals
    * I process a renewal


  @NB @NewBusiness @Rewrite
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Rewrite

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "06/30/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Additional_Insured_Num" to "0"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Not Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Person Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Named Auto Liability Exclusion" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Excess Over Excess Liability Coverage (underwriters only)" block "Excess Over Excess Liability Coverage (underwriters only)" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Primary Excess Insurance Information" block "Primary Excess Insurance Information" is "Not Displayed" on the UI
    * I verify that the UI change for the "Block" type with the specified "Named Auto and Operator Exclusion (underwriters only)" block "Named Auto and Operator Exclusion (underwriters only)" is "Not Displayed" on the UI
    * I rate a quote
    Then I navigate to underwriting referrals page
    Then I verify that referral is triggered
      | referrals                                                                                                                                                                                                                                                                                                                   | triggeredOrNot |
      | The Specific Premises Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                 | Not Triggered  |
      | The Designated Ongoing Operations Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                               | Not Triggered  |
      | The Named Person Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                                | Not Triggered  |
      | The Canine Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                            | Not Triggered  |
      | The Named Auto Liability Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                        | Not Triggered  |
      | Additional Excess Liability Coverage has been selected. This coverage makes the PURE Excess policy secondary over an underlying policy. Please upload a copy of the primary Excess liability policy to the Optional Coverage page and document that the Excess over Excess offering meets PURE's Excess Liability strategy. | Not Triggered  |
      | The Named Auto and Operator Exclusion has been selected. Please provide details on why this exclusion has been applied.                                                                                                                                                                                                     | Not Triggered  |
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 07/01/2025 |
    Then I review changes
    * I rate an endorsement
    * I complete rewrite transaction

  @NB @NewBusiness @Reinstatement
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Reinstatement

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I navigate to Property Information page
    * I verify that the UI change for the "Checkbox" type with the specified "property information" block "Exclude" is "Displayed" on the UI
    * I navigate to Optional Coverages Page
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Canine Liability Exclusion" is "Displayed" on the UI
    * I verify that the UI change for the "Text" type with the specified "optional coverages/exclusions (underwriters only)" block "Designated Ongoing Operation Exclusion" is "Displayed" on the UI
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
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

  @NB @NewBusiness @PreBind
  Scenario: NH Excess 3.0 - UI, UW Referrals & Forms - Pre-Bind Forms

    Given I use "NH_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    * I set "Reject_UIM_Coverage" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
     * I rate a quote