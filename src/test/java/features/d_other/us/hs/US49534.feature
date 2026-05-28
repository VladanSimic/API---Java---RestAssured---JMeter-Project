@US49534 @Iteration3
Feature:Removing COC characteristic from active HS policy

  @US49534
  Scenario: TC_1 - Removing COC characteristic from active HS policy FL

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Effective_Date" to "03/01/2025"

    * I am logged in to Pure as "P77"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I review changes
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner on "Renewal"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI

  @US49534
  Scenario: TC_2 - Removing COC characteristic from active HS policy MA

    Given I use "MA_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Effective_Date" to "02/15/2025"

    * I am logged in to Pure as "P78"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner on "Renewal"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI


  @US49534
  Scenario: TC_3 - Removing COC characteristic from active HS policy NC

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Effective_Date" to "02/15/2025"

    * I am logged in to Pure as "P79"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner on "Renewal"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI

  @US49534
  Scenario: TC_004 - Removing COC characteristic from active HS policy NY

    Given I use "NY_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Effective_Date" to "02/15/2025"

    * I am logged in to Pure as "P80"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner on "Renewal"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI

  @US49534
  Scenario: TC_5 - Removing COC characteristic from active HS policy SC

    Given I use "SC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Risk_Addresses_Other_Structures" to "500000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "400000"


    * I set "Usage_Under_Construction_Or_Major_Renovation" to "Yes"
    * I set "Effective_Date" to "02/15/2025"

    * I am logged in to Pure as "P81"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner "Palomar Excess and Surplus Insurance Company"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "Endorsement"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI
    * I select "Yes" for "Is the residence under construction or renovation?" on ""
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I verify carrier partner on "Renewal"
    * I select "No" for "Is the residence under construction or renovation?" on "Location"
    * I click save changes button
    * I think for 5 to 10 seconds
    * I verify if element with message "COC has been removed from the risk characteristics.  Please enable COC to proceed with this transaction or cancel/rewrite the policy." is "Displayed" on the UI

