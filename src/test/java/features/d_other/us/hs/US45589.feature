@HomeownersSurplus @US45589 @TF107 @TF1154
Feature: PSE
  As a Product Owner I want to update rating for PSE NY policies
  to include Surplus Contribution so that we are able to collect capital and remove surplus line broker fee.

  @TC89384 @TC89385 @TC89386 @TC89387
  Scenario Outline:NY Verify that Surplus Contribution fee, with the amount of 10% of the total policy premium,
  has been added to all NY PSE Home Surplus and Condo Coop policies

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/30/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then  I verify Surplus Contribution is displayed
    * I verify that Surplus Lines Broker Fee is not displayed
    * I verify surplus contribution fee value "<ExpectedValueNB>"

    When I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate a quote

    Then  I verify Surplus Contribution is displayed
    * I verify that Surplus Lines Broker Fee is not displayed
    * I verify surplus contribution fee value "<ExpectedValueEND>"

    When I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    Then  I verify Surplus Contribution is displayed
    * I verify that Surplus Lines Broker Fee is not displayed
    * I verify surplus contribution fee value "<ExpectedValueRNW>"

    Examples:
      | TC_ID  | Company                 | ExpectedValueNB | ExpectedValueEND | ExpectedValueRNW |
      | NY_001 | PURE Specialty Exchange | $70.20          | $70.20           | $74.70           |
      | NY_002 | PURE Specialty Exchange | $54.40          | $54.40           | $57.40           |

  @TC89388
  Scenario Outline: Verify that Surplus Contribution Fee is for PSE policies only and is not applicable for other carrier partners

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

    Then  I verify Surplus Contribution is not displayed

    Examples:
      | TC_ID  | Company                                      |
      | NY_001 | Safety Specialty Ins.                        |
      | NY_001 | Accredited Specialty Insurance Company       |
      | NY_001 | Palomar Excess and Surplus Insurance Company |
      | NY_002 | Safety Specialty Ins.                        |
      | NY_002 | Accredited Specialty Insurance Company       |
      | NY_002 | Palomar Excess and Surplus Insurance Company |


  @TC89389
  Scenario Outline: Verify that PD filing dates for Surplus Contribution Fee are NB 02/15/2025 and REN 04/01/2025

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/24"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then  I verify Surplus Contribution is not displayed

    When I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    Then  I verify Surplus Contribution is not displayed

    Examples:
      | TC_ID  |
      | NY_001 |
      | NY_002 |
