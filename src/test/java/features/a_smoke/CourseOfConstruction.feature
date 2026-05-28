@CourseOfConstruction @SmokeCC
Feature: Home course of construction

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