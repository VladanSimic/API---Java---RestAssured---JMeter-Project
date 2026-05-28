Feature: Personal Watercraft line of business
  As a user I should be able to create PW line of business quotes and policies.

  @PersonalWatercraft @ExtendedSmoke @NY
  Scenario: Personal Watercraft New York
  As a user I should be able to create and rate excess personal watercraft line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_101" smoke test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P89" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "PW NY"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote

    * I verify that NADA PW is working
    * I verify that PW Prefill is working
    Then I verify that Geocoding is pulled

    And I rate a quote

    When I navigate to underwriting referrals page
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    Then I verify that "PW" insurance score is pulled

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Watercraft Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Watercraft Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
