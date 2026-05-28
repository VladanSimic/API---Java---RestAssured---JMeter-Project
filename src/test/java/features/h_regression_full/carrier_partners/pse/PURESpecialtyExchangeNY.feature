@PSE @HomeSurplus
Feature: PURE Specialty Exchange NY
  As a user I should be able to verify PURE Specialty Exchange defaulting on all transactions

  @US48344 @PSE @HomeSurplus
  Scenario: TC_1: HS NY - Residence Type: Homeowner - After PD TIV >= $10M - Verify carrier defaults to PURE Specialty Exchange for NB
#
    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Replacement_Cost" to "10000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"

    When I am logged in to Pure as "P76" unless is PROD then "A6"

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
      | PPHV-OTH-GEN-007 (02/2022) |


  @US48344 @PSE @HomeSurplus
  Scenario: TC_2: HS NY - Residence Type: Homeowner - Verify PSE defaults  after cancel/rewrite (TIV >= $10M, eff. 03/01)

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/28/2025"

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"


    When I am logged in to Pure as "P77" unless is PROD then "A6"

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
    * I verify carrier partner "PURE Specialty Exchange"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction


  @US48344 @PSE @HomeSurplus
  Scenario: TC_3: HS NY - Residence Type: Homeowner - Verify Primary Home optional coverages default for PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P78" unless is PROD then "A19"

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
    Then I bind a quote for surplus

  @US48344 @PSE @HomeSurplus
  Scenario: TC_4: HS NY - Residence Type: Homeowner - Verify Seasonal Home optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P79" unless is PROD then "A19"

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

  @US48344 @PSE @HomeSurplus
  Scenario: TC_5: HS NY - Residence Type: Homeowner - Verify Rented to Others optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P80" unless is PROD then "A19"

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

  @US48344 @PSE @HomeSurplus
  Scenario: TC_6: HS NY - Residence Type: Homeowner - Verify Vacant Residence optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Optional_Coverages_Exclusions_Minimum_Earned_Premium" to "Yes"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"



    When I am logged in to Pure as "P81" unless is PROD then "A19"

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

  @FullRegression_DreamTeam @PSE @US48344
  Scenario: TC_7: HS NY - Residence Type: Homeowner - Verify PSE defaults for TIV >= $10M on NB/RN

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set Effective Date to Today

    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"

    When I am logged in to Pure as "P85" unless is PROD then "A6"

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
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-007 (02/2022) |

    * I navigate to transactions or endorsements
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

    * I think for 25 to 35 seconds
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PPHV-OTH-GEN-007 (02/2022) |

  @FullRegression_DreamTeam @PSE @US48344 @RerunCarrier13
  Scenario: TC_8: HS NY - Residence Type: Homeowner - Verify carrier partner stays PSE on RN when TIV decreased from < $10M to ≥ $10M on EN

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "8700000"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "1000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

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

#    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Replacement Cost" and value is "6000000"
    * I click save changes button
    * I verify carrier partner "PURE Specialty Exchange"
    * I write text to "AOP Ded" and value is "10,000"
    * I write text to "Hurricane Deductible" and value is "10%"
    * I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "Risk requires facultative reinsurance, refer to manager for approval" is "Not Displayed" on the UI
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner "PURE Specialty Exchange"

    * I write text to "AOP Ded" and value is "10,000"
    * I write text to "Hurricane Deductible" and value is "10%"

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "Risk requires facultative reinsurance, refer to manager for approval" is "Not Displayed" on the UI
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I accept underwriter referrals on endorsement and renewal temp
    * I navigate to underwriting alerts tab
    * I override and accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal


  @US48901 @PSE @HomeSurplus
  Scenario: TC_9: HS NY - Residence Type: Condo/Co-op - Verify that "PSE" defaults for NY HS quotes, TIV >= $10M, eff. date ≥ 03/01/25)
#
    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P76" unless is PROD then "A6"

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
      | PPHV-OTH-GEN-007 (02/2022) |

  @US48901 @PSE @HomeSurplus
  Scenario: TC_10: HS NY - Residence Type: Condo/Co-op - Verify PSE defaults  after cancel/rewrite (TIV >= $10M, eff. 03/01)

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "02/28/2025"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Underwriting_Company_Manager_Override" to "No"

    * I set "Risk_Addresses_Hurricane_Deductible" to "10%"


    When I am logged in to Pure as "P77" unless is PROD then "A6"

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
    * I verify carrier partner "PURE Specialty Exchange"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction

  @US48901 @PSE @HomeSurplus
  Scenario: TC_11: HS NY - Residence Type: Condo/Co-op - Verify Seasonal Home optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_This_A_Primary_Residence" to "No"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P79" unless is PROD then "A19"

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

  @US48901 @PSE @HomeSurplus
  Scenario: TC_12: HS NY - Residence Type: Condo/Co-op - Verify Rented to Others optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Part_Of_The_Residence_Rented" to "Yes"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    When I am logged in to Pure as "P80" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
      | Elimination of Waiver of Deductible | Yes     |
      | Loss of Use - Fair Rental Value     | Yes     |
      | Premises Liability Limitation       | Yes     |
      | Tenant Animal Liability Exclusion   | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @US48901 @PSE @HomeSurplus
  Scenario: TC_13: HS NY - Residence Type: Condo/Co-op - Verify Vacant Residence optional coverages default to PURE Specialty Exchange, TIV >= $10M

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/01/2025"
    * I set "Usage_Is_The_Residence_Vacant" to "Yes"
    * I set "Optional_Coverages_Exclusions_Minimum_Earned_Premium" to "Yes"

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"



    When I am logged in to Pure as "P81" unless is PROD then "A19"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    * I navigate to Optional Coverages Page
    * I verify that the options for fields are selected
      | CoverageType                        | YesOrNo |
      | Elimination of Waiver of Deductible | Yes     |
      | Premises Liability Limitation       | Yes     |
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I override and accept underwriting referrals
    Then I bind a quote for surplus

  @FullRegression_DreamTeam @ReRun @PSE @US48901
  Scenario: TC_14: HS NY - Residence Type: Condo/Co-op - Verify PSE defaults for TIV >= $10M on NB/RN

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set Effective Date to Today


    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"

    When I am logged in to Pure as "P85" unless is PROD then "A6"

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

  @FullRegression_DreamTeam @ReRun @PSE @US48901
  Scenario: TC_15: HS NY - Residence Type: Condo/Co-op - Verify carrier partner stays PSE on RN when TIV decreased from < $10M to ≥ $10M on EN

    Given I use "NY_002" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    * I set "Risk_Addresses_Contents" to "10000000"
    * I set "Risk_Addresses_Loss_Of_Use" to "300000"

    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set Effective Date to Today

    * I set "Address_Line_1_Txt" to "53 Evans St"
    * I set "City_Name_Txt" to "Staten Island"
    * I set "Zip_Code" to "10314"

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

#    * I set "Endorsement_Effective_Date_END" to "03/02/2025"
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I write text to "Contents" and value is "6000000"
    * I verify carrier partner "PURE Specialty Exchange"
    * I write text to "Hurricane Deductible" and value is "10%"
    * I review changes
    * I think for 15 to 20 seconds
    * I verify if element with message "TIV Ineligible for current carrier." is "Not Displayed" on the UI
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "Risk requires facultative reinsurance, refer to manager for approval" is "Not Displayed" on the UI
    * I verify if element with message "TIV ineligible for current carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner "PURE Specialty Exchange"

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I verify if element with message "TIV Ineligible for expiring carrier." is "Not Displayed" on the UI
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "Risk requires facultative reinsurance, refer to manager for approval" is "Not Displayed" on the UI
    * I verify if element with message "TIV ineligible for expiring carrier, refer to management for consideration." is "Not Displayed" on the UI
    * I override and accept underwriting referrals
#    * I go to summary and click update renewal
#    When I review changes
#    * I click renewed premium
    * I process renewal or navigate to policy image and review changes and process renewal