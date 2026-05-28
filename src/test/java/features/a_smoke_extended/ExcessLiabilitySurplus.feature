Feature: Excess liability surplus line of business
  As a user I should be able to create excess liability surplus line of business quotes and policies.

  @ExcessLiabilitySurplus @ExtendedSmoke @NY
  Scenario: Excess Liability Surplus New York
  As a user I should be able to create and rate excess liability surplus line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_101" smoke test data from "QuoteCreatorES" sheet
    When I am logged in to Pure as "P75" unless is PROD then "A19"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "ESNY"
    * I set "Household_Members" to "Smoke ESNY"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote

    And I get ES auto CLUE results
    * I verify auto CLUE processing is complete
    * I verify that "ES" insurance score is pulled
#    And I get credit score results

    And I rate a quote

    * I upload and sign required forms
    * I navigate to quote
    * I navigate to quotes detail page
    And I rate a quote

    When I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Excess Liability Package" and check if it's not null


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Excess Liability Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page

    Then I navigate to "Application" page through the Tree
    * I fill out ES quote application page

    * I review changes
    * I click renewed premium