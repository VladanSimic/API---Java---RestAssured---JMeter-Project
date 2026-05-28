Feature: Excess liability line of business
  As a user I should be able to create excess liability surplus line of business quotes and policies.

  @ExcessLiability @ExtendedSmoke @FL
  Scenario: Excess Liability Florida
  As a user I should be able to create and rate excess liability line of business quote for FL state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_101" smoke test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P72" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "MI" to ""
    * I set "Last_Name" to "EXFL"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if Excess grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    When I navigate to customer page
    Then I verify that Auto CLUE is working

    Then I run auto MVR
    Then I verify auto MVR processing is complete

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Excess  Package" and check if it's not null


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Excess  Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes