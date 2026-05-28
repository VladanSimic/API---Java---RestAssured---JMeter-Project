@HomeownersSurplus @US45590 @TF107 @TF1154
Feature: PSE
  As a Product Owner I want to update rating for PSE TX policies
  to include Surplus Contribution so that we are able to collect capital and remove surplus line broker fees.

  @TC89433 @TC89436
  Scenario Outline:TX Surplus Contribution Fee for PSE Home Surplus (NB/END/RNWL),
  Surplus Contribution for PSE Condo Coop (NB/END/RNWL)

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
    * I review changes
    * I click renewed premium

    Then  I verify Surplus Contribution is displayed
    * I verify that Surplus Lines Broker Fee is not displayed
    * I verify surplus contribution fee value "<ExpectedValueRNW>"

    Examples:
      | TC_ID  | Company                 | ExpectedValueNB | ExpectedValueEND | ExpectedValueRNW |
      | TX_001 | PURE Specialty Exchange | $99.50          | $99.50           | $105.80          |
      | TX_002 | PURE Specialty Exchange | $70.20          | $70.20           | $74.20           |

  @TC89434 @TC89435
  Scenario Outline:TX Surplus Contribution Fee for PSE Home Surplus (Endorsement with Premium Increase),
  Surplus Contribution Fee for PSE Home Surplus (RNWL with Premium Decrease)

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/30/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Risk_Addresses_Replacement_Cost_END" to "200000"
    * I set "Risk_Addresses_Replacement_Cost_RNW" to "100000"
    * I set "Risk_Addresses_Contents_END" to "70000"
    * I set "Risk_Addresses_Contents_RNW" to "50000"
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
    * I add changes on "HS" endorsement
    * I review changes
    * I review referrals
    * I accept underwriting referrals
    * I rate a quote

    Then I verify surplus contribution fee value "<ExpectedValueEND>"

    When I issue an endorsement
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    Then I verify surplus contribution fee value "<ExpectedValueRNW>"


    Examples:
      | TC_ID  | Company                 | ExpectedValueNB | ExpectedValueEND | ExpectedValueRNW |
      | TX_001 | PURE Specialty Exchange | $99.50          | $144.80          | $102.30          |
      | TX_002 | PURE Specialty Exchange | $70.20          | $91.00           | $70.60           |
