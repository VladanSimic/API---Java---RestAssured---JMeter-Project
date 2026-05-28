@HomeownersSurplus @US45371 @TF107 @TF1153 @TF1224
Feature: PSE
  As a Service Ops user I want to be able to track the receipt of the Membership Agreement on accounts that have PSE policies
  so we ensure that we have required documents signed prior to PSE policies being bound

  @TC90907 @TC90908 @TC90909
  Scenario Outline:Verify that users are able to generate the Membership Agreement on New Business Quotes where the Carrier Partner is equal to PSE and
  there is an entry for the PSE Membership Agreement. Users should be able to generate/download a copy of the agreement from this tab.
  Verify that users are able to manually upload a copy of the PSE Membership Agreement and mark it as signed under the Signed Document section

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to customer page
    * I navigate to required forms tab
    * I upload and sign required forms

    Then I verify PSE Membership Agreement is mark as Signed

    When I navigate to documents tab
    * I upload PSE 19mb document on customer documents tab


    Examples:
      | TC_ID  | Company                 |
      | NY_001 | PURE Specialty Exchange |
      | TX_001 | PURE Specialty Exchange |

  @TC90910
  Scenario Outline: Verify that users are not able to bind a PSE policy if there is no signed Membership Agreement on file.

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I click request bind
    * I click bind
    * I verify error message is shown "A signed PSE Membership Agreement is needed for this policy. Please collect and upload the signed agreement under the required forms tab"

    Examples:
      | TC_ID  | Company                 |
      | NY_001 | PURE Specialty Exchange |
      | TX_001 | PURE Specialty Exchange |

  @TC90911
  Scenario Outline: Verify that there is a hard stop to prevent the user from binding a quote for PSE if there is no signed Membership Agreement on record.

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"
    * I set "Underwriting_Company_Manager_Override_RNW" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company_RNW" to "PURE Specialty Exchange"
    * I set "Rule_IDs" to "<Rules>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I review referrals
    * I verify that referrals are triggered "<Trigger>"

    Examples:
      | TC_ID  |Trigger | Rules   |
      | NY_001 |Yes     | 2545138 |
      | TX_001 |Yes     | 2545138 |