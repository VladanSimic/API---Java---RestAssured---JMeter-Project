Feature: Collections line of business
  As a user I should be able to create collections line of business quotes and policies.

  @Collections @ExtendedSmoke @TX
  Scenario: Collections Texas
  As a user I should be able to create and rate collections line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_101" smoke test data from "QuoteCreatorCO" sheet

    When I am logged in to Pure as "P73" unless is PROD then "A1"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "COTX"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote

    And I rate a quote

    * I upload and sign required forms
    * I navigate to quote
    * I navigate to quotes detail page
    And I rate a quote

    When I navigate to underwriting referrals page
    * I verify if OFAC returned "negative"
    * I verify if there is no PURE Analytics Grade
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Collection Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    Then I verify that "CO" insurance score is pulled

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Collections Package" and check if it's not null


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement
    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Collections Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I review and accept referrals on renewal if any

  @Collections @ExtendedSmoke @NY
  Scenario: Collections New York
  As a user I should be able to create and rate collections line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_101" smoke test data from "QuoteCreatorCO" sheet

    When I am logged in to Pure as "P74" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "CONY"
    And I navigate to quotes page
    * I initiate a new quote

    And I fill out CO quote cover page
    When I fill out CO quote coverage by class page
    Then I convert to Collection large schedule

    When I navigate to "Coverage Schedule" page through the Tree
    * I think for 10 to 12 seconds
    Then I upload and import Large Schedule collection file "30items_coll_large_schedule.xls"
    * I think for 10 to 12 seconds
    * I verify that collection is converted to large schedule
    * I think for 5 to 10 seconds
    * I navigate to "Previous Claims/Loss History" page through the Tree
    * I fill out CO quote previous claims loss history page
    * I fill out CO quote additional binding information page

    And I rate a quote

    * I upload and sign required forms
    * I navigate to quote
    * I navigate to quotes detail page
    And I rate a quote

    When I navigate to underwriting referrals page
    * I verify if OFAC returned "negative"
    * I verify if there is no PURE Analytics Grade
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Collection Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    Then I verify that "CO" insurance score is pulled

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Collections Package" and check if it's not null

    And I navigate to transactions or endorsements
    When I initiate new endorsement
    Then I verify that collection is converted to large schedule
    *   I export and verify large schedule file

    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Collections Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
