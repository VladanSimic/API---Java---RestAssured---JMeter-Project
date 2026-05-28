Feature: Home course of construction

  @SmokeQA2 @SmokeDEV2
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Cancellation - Reinstatement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    And I set Effective Date to Today
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
      | TC_ID  |
      | FL_001 |
      | NC_001 |
      | NY_001 |

  @SmokeQA2 @SmokeDEV2
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
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
      | TC_ID  |
      | FL_001 |
      | NC_001 |
      | NY_001 |
  @SmokeQA2 @SmokeDEV2
  Scenario Outline: Smoke Course of Construction - "<TC_ID>" - New Business - Endorsement - Policy Extension

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    And I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process policy extension
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | FL_001 |
      | NC_001 |
      | NY_001 |