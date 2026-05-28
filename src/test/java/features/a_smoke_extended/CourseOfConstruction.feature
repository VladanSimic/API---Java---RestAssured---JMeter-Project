@CourseOfConstruction @SmokeCC
Feature: Home course of construction

  @ExtendedSmoke @COC @WA
  Scenario: Course of Construction Washington

    Given I use "WA_101" smoke test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P72" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "COCWA"
    And I navigate to quotes page
    * I initiate a new quote

    And I fill out the policy page for CC line of business
    Then I click save changes button

    When I fill out the basic location page for CC line of business
    Then I verify that Geocoding is pulled
    * I verify if RiskMeter is pulled
    * I verify that ISO returned only PPC value "8"
    * I verify that the distance to coast report is pulled

    * I click order property details button
    * I click save changes button
    * I navigate to previous page

    Then I verify that the credit score report is pulled

    And I fill out the general contractor page for CC line of business

    When I navigate to "Earthquake" page through the Tree
    * I think for 3 to 5 seconds
    * I navigate to "Earthquake" page through the Tree
    Then I verify earthquake reports are pulled
    * I fill out the earthquake details page for CC line of business

    When I navigate to "Wildfire" page through the Tree
    Then I verify wildfire hazard reports are pulled
    And I fill out the wildfire details page for CC line of business

    And I fill out the previous losses coverages page for CC line of business
    Then I fill out HO quote member information page

    And I fill out the member in formation Page for CC line of business
    And I fill out the mandatory forms page for CC line of business

    And I rate a quote

    When I navigate to underwriting referrals page
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    When I navigate to customer page
    Then I verify that Home CLUE is working

    When I navigate to customer page
    * I navigate to documents tab
    Then I upload 19mb document on customer documents tab

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote

    Then I bind a CC quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Broker" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Broker" and check if it's not null

    And I navigate to transactions or endorsements
    And I check premiums if they are equal for "New Business" and "Endorsement"
    Then I initiate a policy extension

  @FL @NC @NY @NewBusiness @Cancellation @Reinstatement
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Cancellation - Reinstatement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason               | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    * I exit policy
    * I logout

    Examples:
      | TC_ID  | user |
      | FL_001 | P1   |
      | NC_001 | P2   |
      | NY_001 | P3   |

  @FL @NC @NY @NewBusiness @Cancellation @NewBusinessRewrite
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    When I add changes on "CC" new business rewrite
    * I review changes
    * I rate a quote

    Then I complete rewrite transaction
    * I exit policy
    * I logout

    Examples:
      | TC_ID  | user |
      | FL_001 | P4   |
      | NC_001 | P5   |
      | NY_001 | P6   |

  @FL @NC @NY @NewBusiness @Endorsement @PolicyExtension
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Endorsement - Policy Extension

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process renewal
    * I exit policy
    * I logout

    Examples:
      | TC_ID  | user |
      | FL_001 | P7   |
      | NC_001 | P8   |
      | NY_001 | P9   |