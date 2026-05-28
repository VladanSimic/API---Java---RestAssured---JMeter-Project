@HomeownersSurplus @US45368 @TF107 @TF1153
Feature: PSE
 As a product owner, I want the system to have aggregation zones for PSE compared to what is available for other carriers.
 when the policy renews it should take into account the new underwriting companies Agg Zone capacity plus the current inforce for
 the old underwriting company that will be rolling into the new company upon renewal.

  @TC89430
  Scenario Outline: Create NY/TX Home Surplus Quote (Pre-02/15/25)

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "01/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"
    * I set "Underwriting_Company_Manager_Override_RNW" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company_RNW" to "PURE Specialty Exchange"
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
    * I select a transaction "New Business"
    * I navigate to premium summary page

    Then  I verify "Accredited Specialty Insurance Company - TIV" block is exists
    *  I verify that Aggregation Zone Current TIV is displayed and has value

    When I exit transaction
    * I create a renewal
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I process a renewal
    * I select a transaction "Renewal"
    * I navigate to premium summary page

    Then  I verify "PURE Specialty Exchange - TIV" block is exists
    *  I verify that Aggregation Zone Current TIV is displayed and has value

    Examples:
      | TC_ID  |
      | NY_001 |


  @TC89431
  Scenario Outline: PSE New Business Effective Date

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"
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
    * I select a transaction "New Business"
    * I navigate to premium summary page

    Then  I verify "PURE Specialty Exchange - TIV" block is exists
    *  I verify that Aggregation Zone Current TIV is displayed and has value

    When I exit transaction
    * I create a renewal
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I process a renewal
    * I select a transaction "Renewal"
    * I navigate to premium summary page

    Then  I verify "PURE Specialty Exchange - TIV" block is exists
    *  I verify that Aggregation Zone Current TIV is displayed and has value

    Examples:
      | TC_ID  |
      | NY_001 |


  @TC89432
  Scenario Outline: PSE Renewal Effective Date  NY 04/01/25 - TX 04/19/25

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"
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
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I process a renewal
    * I select a transaction "Renewal"
    * I navigate to premium summary page

    Then  I verify "PURE Specialty Exchange - TIV" block is exists
    *  I verify that Aggregation Zone Current TIV is displayed and has value

    Examples:
      | TC_ID  |effectiveDate|
      | NY_001 |04/01/24     |
