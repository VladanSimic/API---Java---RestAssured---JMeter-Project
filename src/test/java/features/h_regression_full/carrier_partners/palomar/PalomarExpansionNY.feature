@HomeSurplus @PalomarExpansion
Feature: Palomar Excess and Surplus Company NY
  As a user I should be able to verify Palomar Excess and Surplus Company defaulting on all transactions

  @FullRegression_DreamTeam @Palomar @US47512
  Scenario: TC_1: HS NY - Removal of hard stop for Palomar Excess and Surplus Company NB
#
    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"
    * I set Effective Date to Today

    When I am logged in to Pure as "P76" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "COC should be selected with this carrier partner. Please include COC to enable binding" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @FullRegression_DreamTeam @Palomar @US47511
  Scenario: TC_2: HS NY - After PD with TIV < $10M, override to Palomar, increase TIV to ≥$10M on EN, and verify validations are trigger on EN and RN.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"

    * I set Effective Date to Today

    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P77" unless is PROD then "A6"

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
    * I write text to "AOP Ded" and value is "10,000"
    * I write text to "Hurricane Deductible" and value is "10%"
    * I verify carrier partner on "Endorsement"
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
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

  @US47511
  Scenario: TC_3: HS NY - After PD with TIV < $10M, override to Palomar, increase TIV to ≥$10M on EN, verify validations trigger and override to PSE on RN.


    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P78" unless is PROD then "A6"

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
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    * I set "Endorsement_Effective_Date_END" to "02/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "10000000"
    * I write text to "Hurricane Deductible" and value is "5%"
    * I verify carrier partner on "Endorsement"
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
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"

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
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-007 (02/2022) |

  @FullRegression_DreamTeam @Palomar @US47511
  Scenario: TC_4: HS NY - After PD with TIV > $10M, override to Palomar, verify validations trigger on NB, RN.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "9000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "100000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P78" unless is PROD then "A6"

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


  @FullRegression_DreamTeam @Palomar @US47511
  Scenario: TC_5: HS NY - After PD with TIV < $10M, override to Palomar, verify validations trigger due to inflation on RN

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "7939000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P79" unless is PROD then "A6"

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
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"


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

  @NY @HS @US47511
  Scenario: TC_6: HS NY - Before PD with TIV < $10M, verify carrier stays on Accredited on RN.


    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "01/31/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    When I am logged in to Pure as "P81" unless is PROD then "A6"

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

  @US47511
  Scenario: TC_7: HS NY - After PD with TIV < $10M, verify carrier stays Accredited on RN, OOS EN, and RN roll forward.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "100000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"



    When I am logged in to Pure as "P82" unless is PROD then "A6"

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
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    * I initiate new oos endorsement 4 months ahead
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"

    * I review changes
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

  @US47511
  Scenario: TC_8: HS NY - After PD with TIV > $10M, override to Palomar, verify validations trigger on RN, OOS EN, and RN roll forward.

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "9000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "100000"
    * I set "Risk_Addresses_AOP_Ded" to "5000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P84" unless is PROD then "A6"

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

  @HS @US47512
  Scenario: TC_9: HS NY - After PD filing date TIV > 10M - NB, override to Palomar verify that validations are triggered

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "5000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P80" unless is PROD then "A6"

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
    * I navigate to quotes detail page
    * I rate a quote
    * I think for 10 to 15 seconds
    * I rate a quote
    Then I bind a quote for surplus

  @US46667 @US47512
  Scenario: TC_10: HS NY - After PD filing Validate if optional coverages for Primary Home default on Palomar

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

    When I am logged in to Pure as "P76" unless is PROD then "A6"

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

  @US46667 @US47512
  Scenario: TC_11: HS NY - After PD filing Validate if optional coverages for Seasonal Home / Secondary default on Palomar

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"


    When I am logged in to Pure as "P77" unless is PROD then "A6"

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

  @US47512
  Scenario: TC_12: HS NY - After PD filing Validate if optional coverages for Rented To Others default on Palomar

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"



    When I am logged in to Pure as "P78" unless is PROD then "A6"

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

  @US47512
  Scenario: TC_13: HS NY - After PD filing Validate if optional coverages for Vacant default on Palomar

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/01/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Optional_Coverages_Exclusions_Minimum_Earned_Premium" to "Yes"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

    When I am logged in to Pure as "P79" unless is PROD then "A6"

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


  @US48344
  Scenario Outline: TC_1: HS NY - After PD filing date TIV < 10M - NB, verify Palomar defaults for Nassau & Suffolk counties

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "1000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "200000"
    * I set "Risk_Addresses_Loss_Of_Use" to "100000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    * I select created policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P76  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P77  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P78  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P79  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P80  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P81  | 135 E Dean Street    | Freeport    | 11520 |

  @Palomar @US48344
  Scenario Outline: TC_2: HS NY - After PD filing date TIV >= 10M - NB, verify validations are triggered for Palomar,  (Suffolk/Nassau)

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Palomar Excess and Surplus Insurance Company"

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for current carrier." is "Displayed" on the UI
    * I rate a quote
    * I verify if element with message "quote proposal" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P82  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P83  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P84  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P85  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P86  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P87  | 135 E Dean Street    | Freeport    | 11520 |

    @FullRegression_DreamTeam @ReRun2
    Examples:
      | user | AddressLine       | City      | Zip   |
      | P80  | 410 Fishel Avenue | Riverhead | 11901 |

  @US48344
  Scenario Outline:: TC_3: HS NY - Verify Palomar defaults for Suffolk/Nassau counties after cancel/rewrite (TIV < $10M, eff. 03/01)

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/28/2025"

    * I set "Risk_Addresses_Replacement_Cost" to "2000000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "100000"
    * I set "Risk_Addresses_Loss_Of_Use" to "50000"

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to location page
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

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P88  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P89  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P90  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P91  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P92  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P93  | 135 E Dean Street    | Freeport    | 11520 |

  @US48344
  Scenario Outline: TC_4: HS NY - Verify Primary Home optional coverages default for Palomar, TIV <$10M (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "2000000"
    * I set "Risk_Addresses_Other_Structures" to "100000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
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
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus


    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P94  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P95  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P96  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P97  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P98  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P99  | 135 E Dean Street    | Freeport    | 11520 |

  @US48344
  Scenario Outline: TC_5: HS NY - Verify Seasonal Home optional coverages default to Palomar, TIV <$10M (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "2000000"
    * I set "Risk_Addresses_Other_Structures" to "100000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                  | YesOrNo |
      | Premises Liability Limitation | Yes     |

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P76  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P77  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P78  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P79  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P80  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P81  | 135 E Dean Street    | Freeport    | 11520 |

  @US48344
  Scenario Outline: TC_6: HS NY - Verify Rented to Others optional coverages default to Palomar, TIV <$10M (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "2000000"
    * I set "Risk_Addresses_Other_Structures" to "100000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
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

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P82  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P83  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P84  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P85  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P86  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P87  | 135 E Dean Street    | Freeport    | 11520 |

  @US48344
  Scenario Outline: TC_7: HS NY - Verify Vacant Residence optional coverages default to Palomar, TIV <$10M (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Optional_Coverages_Exclusions_Minimum_Earned_Premium" to "Yes"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "2000000"
    * I set "Risk_Addresses_Other_Structures" to "100000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"



    When I am logged in to Pure as "<user>" unless is PROD then "A6"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
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

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P90  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P91  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P92  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P93  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P94  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P95  | 135 E Dean Street    | Freeport    | 11520 |

  @Palomar @US48344
  Scenario Outline: TC_8: HS NY - Verify validations are triggered when  TIV
  is increased from < $10M to ≥ $10M on EN, and carrier is defaulted to -Select-, override to Palomar

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

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

#    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "10000000"
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I think for 5 to 7 seconds
    * I write text to "AOP Ded" and value is "10,000"
    * I click save changes button
    * I write text to "Hurricane Deductible" and value is "N/A - AOP Ded. Applies"
    * I click save changes button
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
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I think for 10 to 15 seconds
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P96  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P97  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P98  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P99  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P76  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P77  | 135 E Dean Street    | Freeport    | 11520 |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | user | AddressLine       | City       | Zip   |
      | P82  | 15 Alyssum Avenue | Huntington | 11743 |

  @Palomar @US48344
  Scenario Outline: TC_9: HS NY - Verify carrier defaults to -Select- for TIV < $9.9M due to inflation on RN (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "7939000"
    * I set "Risk_Addresses_Other_Structures" to "1000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500000"

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today


    When I am logged in to Pure as "<user>" unless is PROD then "A6"

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
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Displayed" on the UI
    * I think for 10 to 15 seconds
    When I review changes
    * I click renewed premium
    * I think for 10 to 15 seconds
    * I verify if element with message "Send renewal Offer" is "Not Displayed" on the UI
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P78  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P79  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P80  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P81  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P82  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P83  | 135 E Dean Street    | Freeport    | 11520 |

    @FullRegression_DreamTeam
    Examples:
      | user | AddressLine        | City        | Zip   |
      | P84  | 139 N Magee Street | Southampton | 11968 |

  @Palomar @US48344
  Scenario Outline: TC_10: HS NY - Verify Palomar defaults for TIV < $10M on NB/RN (Suffolk/Nassau).

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set Effective Date to Today

    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"

    When I am logged in to Pure as "<user>" unless is PROD then "A6"

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

    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Renewal"

    * I fill out HS quote application page
    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal
    * I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-005 (05/2021) |

    Examples:
      | user | AddressLine          | City        | Zip   |
#    Suffolk N.E.
      | P84  | 410 Fishel Avenue    | Riverhead   | 11901 |
#  Suffolk N.W.
      | P85  | 15 Alyssum Avenue    | Huntington  | 11743 |
#  Suffolk S.W.
      | P86  | 189 Siegel Boulevard | Babylon     | 11702 |
#  Suffolk S.E.
      | P87  | 139 N Magee Street   | Southampton | 11968 |
#  Nassau N
      | P88  | 0 Welwyn Road #1D    | Great Neck  | 11021 |
#    Nassau S
      | P89  | 135 E Dean Street    | Freeport    | 11520 |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | user | AddressLine       | City       | Zip   |
      | P88  | 0 Welwyn Road #1D | Great Neck | 11021 |

