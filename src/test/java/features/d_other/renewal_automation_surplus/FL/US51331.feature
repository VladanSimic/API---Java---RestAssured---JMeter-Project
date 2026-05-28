@HomeownersSurplus @US51331 @RenewalAutomation
Feature: Programs Renewal Automation - DocuSign UI - eSign Packages - Document Tracking

  @US51331 @FullRegression_DreamTeam @Disabled
  Scenario:TC_01 | Verify that when a FL PURE Programs policy is 75 days out from renewal, a renewal transaction is created using the existing batch.
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 5 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 15 to 20 seconds
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"


  @US51331 @FullRegression_DreamTeam @Disabled
  Scenario:TC_02 | Verify that, before rating, automated removal of premium adjustments from previous transactions existing on newly created Renewal image is performed.
    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date 290 days in the past

    * I set "Wind_Mitigation_Opening_Protection" to "Impact Glass Rated For Large Missiles"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Construction_Details_Year_Built" to "2010"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to "2020"
    * I set "Wind_Mitigation_Roof_Covering" to "Metal Sheathing With Concealed Fasteners"
    * I set "Risk_Addresses_Hurricane_Deductible" to "5%"
    * I set "Manuscript_Endorsements" to "Manuscript_Endorsement_002,Manuscript_Endorsement_003,Manuscript_Endorsement_006"

    Then I merge data for "QuoteCreationHS", where "Manuscript_Endorsements" key and "HS_Manuscript_Endorsements" sheet

    * I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    * I get customer account ID
    When I open quote under customer
    And I navigate to quotes detail page

    Then I create a new "HS" quote
    And I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    When I navigate to location page
    Then I select "No" for "Is this location listed on national, state, or local register of historic places?" on ""
    * I write text to "Foundation Type" and value is "Slab and Split-Level on Slab"

    When I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "National Fire & Marine Insurance Company"

    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    * I navigate to Home
    * I think for 10 to 10 seconds and i keep clicking home tab for 5 times
    And I navigate to user setup page
    * I think for 10 to 15 seconds
    * I click "backfill buttons page"
    * I think for 5 to 8 seconds
    * I click "Renewal Create/Process Daisy Chain"
    * I think for 10 to 15 seconds

    * I navigate to Home
    * I think for 15 to 20 seconds
    And I navigate to customers page
    * I think for 15 to 20 seconds
    * I select customer by ID
    * I think for 20 to 25 seconds
    And I navigate to policy
    * I navigate to transactions or endorsements

    * I verify if element with message "Renewal" is "Displayed" on the UI
    Then the status of "Renewal" transaction 1 should be "PolicyTransactionRated"

    And I select a transaction "Renewal"
    * I navigate to policy image page without save

    And I select a transaction "Renewal"
    * I navigate to policy image page without save
    * I think for 5 to 8 seconds

    * I navigate to "Manuscript Endorsements" page
    * I verify if element with message "Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Non-Wind Premium Adjustment" is "Not Displayed" on the UI
    * I verify if element with message "Collections Premium Adjustment" is "Not Displayed" on the UI