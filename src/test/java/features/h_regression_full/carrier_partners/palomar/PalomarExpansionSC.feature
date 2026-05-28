@HomeSurplus @PalomarExpansion @SC
Feature: Palomar Excess and Surplus Company SC
  As a user I should be able to verify Palomar Excess and Surplus Company defaulting on all transactions

  @FullRegression_DreamTeam @PalomarExpansion @HS @US46564
  Scenario: TC_1: HS SC - Removal of hard stop for Palomar Excess and Surplus Company NB

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I set Effective Date to Today

    When I am logged in to Pure as "P76" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

#  before pushing, remove the commented lines
    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "COC should be selected with this carrier partner. Please include COC to enable binding" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

  @US46630
  Scenario: TC_2: HS SC - Before PD: Verifying carrier details for NB and Renewal RN transactions with manual renewal, TIV under $10M

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "01/31/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P77" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal
    * I think for 20 to 25 seconds


  @US46630
  Scenario: TC_3: HS SC - Before PD: Verifying carrier details for NB and Renewal RN transactions with auto renewal, TIV under $10M

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "01/31/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    When I am logged in to Pure as "P78" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    * I click auto create renewal nd
    * I think for 20 to 30 seconds
    * I select a transaction "Renewal"
    * I go to summary and click update renewal
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals

    Then I click process renewal


  @US46630
  Scenario: TC_4: HS SC - Verify that for TIV < $10M, the default carrier is Palomar, and for TIV ≥ $10M on Renewals, it defaults to "Select" and is overridden to "PURE Specialty Exchange.


    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P79" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote for surplus
    * I select created policy

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I write text to "Replacement Cost" and value is "10000000"
    * I write text to "Hurricane and Named Storm Deductible" and value is "10%"
    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"
    * I override underwriting company to "PURE Specialty Exchange"

    * I upload and sign required forms
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I click process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-007 (02/2022) |


  @US46630
  Scenario: TC_5: HS SC - After PD - Verify that for TIV < $10M, the default carrier is Palomar, and for TIV ≥ $10M on Renewals, it defaults to "Select" and is overridden to "Palomar".


    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P80" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I write text to "Replacement Cost" and value is "10000000"
    * I write text to "Hurricane and Named Storm Deductible" and value is "10%"

    Then I click save changes button

    * I verify carrier partner "- Select -"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

    * I override underwriting company to "Palomar Excess and Surplus Insurance Company"
    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal


  @FullRegression_DreamTeam @Palomar @HS @US46630
  Scenario: TC_6: HS SC - After PD filing date with TIV < $10M, verify the carrier partner defaults to 'Select' due to Inflation on RN transactions.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "7939000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"


    When I am logged in to Pure as "P81" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I override underwriting company to "Palomar Excess and Surplus Insurance Company"

    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal


  @FullRegression_DreamTeam @ReRun @Palomar @HS @US46630
  Scenario: TC_7: HS SC - After PD Filing, verify that changes from EN are reflected in RN.
  Update TIV from < $10M to ≥ $10M on EN and confirm underwriting company defaults to "Select" on RN.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P82" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "10000000"
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I write text to "AOP Ded" and value is "10,000"
    * I write text to "Hurricane and Named Storm Deductible" and value is "10%"
    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner "- Select -"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I override underwriting company to "Palomar Excess and Surplus Insurance Company"

    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

  @US46630
  Scenario: TC_8: HS SC - After PD filing date with TIV > $10M, update TIV to < $10M during EN and verify it defaults to PSE.
  On RN, ensure it remains PSE and validations are not triggered.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"


    When I am logged in to Pure as "P83" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy


    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "5000000"
    * I write text to "Hurricane and Named Storm Deductible" and value is "10%"
    * I verify carrier partner "PURE Specialty Exchange"
    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "PURE Specialty Exchange"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal


  @US46630
  Scenario: TC_9: HS SC - After PD with TIV < $10M, override to PSE, verify validations do not trigger on RN, OOS EN, and RN roll forward.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "50000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"


    When I am logged in to Pure as "P84" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I initiate new oos endorsement 4 months ahead
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"

    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    * I click roll forward
    * I think for 10 to 15 seconds

    And I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"


  @US46630
  Scenario: TC_10: HS SC - After PD with TIV > $10M, override to Palomar, verify validations trigger on RN, OOS EN, and RN roll forward.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"


    When I am logged in to Pure as "P85" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"
    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal
    Then I click process renewal

    * I initiate new oos endorsement 4 months ahead
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"

    * I review changes
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    * I click roll forward
    * I think for 10 to 15 seconds

    And I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"


  @US46630
  Scenario: TC_11: HS SC - Before PD filing date TIV < 10M, cancel the policy and make NB rwt effective 01/18 TIV < 10M - verify its Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "01/31/2025"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"


    When I am logged in to Pure as "P87" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

#     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I click save changes button
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction

  @Palomar @HS @US46627
  Scenario: TC_12: HS SC - After PD filing date TIV < 10M, verify when condo is selected, carrier is defaulting to PSE

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "300000"
    * I set "Risk_Addresses_Loss_Of_Use" to "10000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "10%"
    * I set "Risk_Addresses_AOP_Ded" to "5000"



    When I am logged in to Pure as "P88" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I write text to "Residence Type" and value is "Condo/Co-op"
    * I click save changes button
    * I verify carrier partner "PURE Specialty Exchange"
    * I navigate to location page
    * I write text to "The floor on which the risk is located" and value is "1"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @HS @US46627
  Scenario: TC_13: HS SC - After PD filing date TIV < 10M, verify carrier defaults to Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"

    When I am logged in to Pure as "P99" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @US46627
  Scenario: TC_14: HS SC - After PD filing date with TIV > $10M, verify it defaults to PSE.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Hurricane_And_Named_Storm_Deductible" to "N/A - AOP Ded Applies"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"


    When I am logged in to Pure as "P76" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  Scenario: TC_15: HS SC - After PD filing Validate if optional coverages for Primary Home default on Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"

    When I am logged in to Pure as "P76" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
      | Dwelling Replacement Cost Coverage  | No      |
      | Elimination of Waiver of Deductible | No      |
      | Loss of Use - Fair Rental Value     | No      |
      | Premises Liability Limitation       | No      |
      | Tenant Animal Liability Exclusion   | No      |
      | Special Water Damage Deductible     | No      |
      | Primary Flood Dec Page Received?    | No      |
      | Roof Exclusion                      | No      |
      | Roof Reconstruction Cost Schedule   | No      |

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  Scenario: TC_16: HS SC - After PD filing Validate if optional coverages for Seasonal Home / Secondary default on Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"


    When I am logged in to Pure as "P77" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                  | YesOrNo |
      | Premises Liability Limitation | Yes     |

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


  Scenario: TC_17: HS SC - After PD filing Validate if optional coverages for Rented To Others default on Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"

    When I am logged in to Pure as "P78" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
      | Dwelling Replacement Cost Coverage  | Yes     |
      | Elimination of Waiver of Deductible | Yes     |
      | Loss of Use - Fair Rental Value     | Yes     |
      | Premises Liability Limitation       | Yes     |
      | Tenant Animal Liability Exclusion   | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  Scenario: TC_18: HS SC - After PD filing Validate if optional coverages for Vacant Residence default on Palomar

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Optional_Coverages_Exclusions_Minimum_Earned_Premium" to "Yes"



    When I am logged in to Pure as "P79" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
      | Dwelling Replacement Cost Coverage  | Yes     |
      | Elimination of Waiver of Deductible | Yes     |
      | Premises Liability Limitation       | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @FullRegression_DreamTeam @Palomar @HS @US48118 @ReRun2
  Scenario: TC_19: HS SC - After PD filing date TIV > 10M - NB, override to Palomar verify that validations are triggered

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "5000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P80" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @FullRegression_DreamTeam @ReRun @Palomar @HS @US46630
  Scenario: TC_20: HS SC - After PD filing date with TIV < $10M, verify the carrier partner defaults to Palomar for NB and RN transactions.

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "400000"
    * I set "Risk_Addresses_Loss_Of_Use" to "40000"


    When I am logged in to Pure as "P81" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus
    * I select created policy

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

