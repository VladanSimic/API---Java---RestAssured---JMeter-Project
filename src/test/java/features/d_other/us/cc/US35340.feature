@CourseOfConstruction @US35340
Feature: US35340 - New Business Rewrite Workflow

  As a developer I need to clone the functionality of the HS new business rewrite
  workflow for COC so users are able to issue cancel rewrites.

  Scenario Outline: "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
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
    * I complete rewrite transaction

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | ME_001 |
      | MD_001 |
      | MT_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | FL_001 |
      | MA_001 |
      | NY_001 |