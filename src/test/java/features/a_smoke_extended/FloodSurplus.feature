@FloodSurplus @ExtendedSmoke
Feature: Flood Surplus line of business
  As a user I should be able to create Flood Surplus line of business quotes and policies.

  @IL @Homeowners
  Scenario: Flood Surplus Illinois
  As a user I should be able to create and rate Flood Surplus line of business from HO
    Given I use "IL_001" smoke test data from "QuoteCreatorHOFS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "FSIL"
    * I set "Additional_Interests" to ","
    * I set "Is_There_Mortgage" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    When I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests

    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote

    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city   | state | zip   | residenceType | covAorC | lossOfUse           | aopDed | deductible            | i |
      | 17781 W Elsbury St | Gurnee | IL    | 60031 | Homeowner     | 2000000 | Reasonable Expenses | 10,000 | N/A - AOP Ded Applies | 2 |

    And I navigate to "Flood Coverage" page through the Tree
    * I verify Primary Flood Coverage Block Eligibility Response is "This home is eligible for admitted primary flood coverage."
    * I verify Primary Flood Coverage Block Limit Dwelling and Other Structures is "250,000"
    * I verify Primary Flood Coverage Block Limit Contents is "100,000"
    * I verify Primary Flood Coverage Block Loss of Use is "250,000"
    * I verify Primary Flood Coverage Block Limit Deductible is "5,000"
    * I verify Primary Flood Coverage Block Limit Basement Contents is "0"
    * I verify Primary Flood Coverage Block Limit Basement Improvements is "0"
    * I verify Primary Flood Coverage Block Limit Elevated Risk Credit is "1"
    * I verify Primary Flood Coverage Block Limit High PML Load is "1"

#    Navigate to first location
    Then I navigate to Location Details Page
    * I think for 3 to 5 seconds
    And I navigate to "Flood Coverage" page through the Tree
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    And I navigate to "Flood Surplus Lines Policy" page through the Tree
    * I think for 5 to 6 seconds
    * I click on the footer
    Then I verify Dwelling on Flood Surplus Lines Policy Page is "250,000"
    * I verify Contents on Flood Surplus Lines Policy Page is "100,000"
    * I verify Other Structures on Flood Surplus Lines Policy Page is "25,000"
    * I verify Primary Flood Coverage Block Loss of Use is "50,000"
    * I verify Primary Flood Coverage Block Limit Deductible is "5,000"
    * I verify that the underwriting company is "National Fire & Marine Insurance Company"
    * I verify year built is "2010"
    * I verify Foundation Type is "Slab and Split-Level on Slab"
    * I verify Square Footage is "3,500"
    * I verify Construction Type is "Frame"
    * I verify that the RiskMeterFloodZone is "X500"
    * I rate an FS quote
    * I think for 5 to 10 seconds
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify if there are 0 OFAC referrals
    * I verify if OFAC returned "Negative"
    And I accept underwriting referrals
#    Then I generate and verify quote proposal document "Quote Proposal"
    And I rate and bind an FS quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Flood Surplus Lines Package" and check if it's not null

    And I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Flood Surplus Lines Package" and check if it's not null

  @CA @HS @HomeSurplus
  Scenario: Flood Surplus California
  As a user I should be able to create and rate Flood Surplus line of business from HS
    Given I use "CA_001" smoke test data from "QuoteCreatorHSFS" sheet
    Then I load random user data
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "FSCA"
    * I set Effective Date to Today
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "P82" unless is PROD then "A6"
    * I initiate a new quote for a new customer
    * I fill out HS quote cover page
    * I fill out HS quote basic location coverage details page
    * I fill out HS quote optional coverages page
    * I fill out HS previous claim losses page
    * I fill out HS quote earthquake details page
    * I fill out HS quote wildfire details page
    * I fill out HS quote member information page
    When I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests
    * I navigate to location page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    And I navigate to "Flood Surplus Lines Policy" page through the Tree
    * I think for 5 to 6 seconds
    * I click on the footer
    Then I verify Dwelling on Flood Surplus Lines Policy Page is "250,000"
    * I verify Contents on Flood Surplus Lines Policy Page is "100,000"
    * I verify Other Structures on Flood Surplus Lines Policy Page is "25,000"
    * I verify Primary Flood Coverage Block Loss of Use is "50,000"
    * I verify Primary Flood Coverage Block Limit Deductible is "5,000"
    * I verify that the underwriting company is "National Fire & Marine Insurance Company"
    * I verify year built is "2010"
    * I verify Foundation Type is "Slab and Split-Level on Slab"
    * I verify Square Footage is "500"
    * I verify Construction Type is "Frame"
    * I verify that the RiskMeterFloodZone is "X"
    And I rate an FS quote
    * I think for 5 to 10 seconds
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify if there are 0 OFAC referrals
    * I verify if OFAC returned "Negative"
    And I accept underwriting referrals
    And I rate and bind an FS quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Flood Surplus Lines Package" and check if it's not null

    And I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Flood Surplus Lines Package" and check if it's not null
