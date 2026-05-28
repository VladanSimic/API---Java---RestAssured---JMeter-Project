@CourseOfConstruction @US33060
Feature: US33060 - Countrywide forms - Wildfire deductible

  As a Compliance Officer I want the Surplus Course of Construction
  contract to contain forms for Wildfire Deductible when endorsed on the policy
  so the insured is advised what their coverage entails

  Scenario Outline: Countrywide forms - Wildfire deductible form - "<description>" - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCC" sheet
    * I set "Project_Details_WF_Deductible" to "<wildfireDeductible>"
    * I set "Project_Details_WF_Deductible_END" to "<wildfireDeductible>"
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
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Examples:
      | TC_ID  | wildfireDeductible | description            |
      | CA_001 | 2%                 | should be attached     |
      | WY_001 | 2%                 | should be attached     |
      | WA_001 | 2%                 | should be attached     |
      | UT_001 | 2%                 | should be attached     |
      | SD_001 | 2%                 | should be attached     |
      | OR_001 | 2%                 | should be attached     |
      | NV_001 | 2%                 | should be attached     |
      | NM_001 | 2%                 | should be attached     |
      | MT_001 | 2%                 | should be attached     |
      | ID_001 | 2%                 | should be attached     |
      | CO_001 | 2%                 | should be attached     |
      | AZ_001 | 2%                 | should be attached     |
      | TX_001 | 2%                 | should be attached     |
      | CA_001 | N/A                | should not be attached |
      | WY_001 | N/A                | should not be attached |
      | WA_001 | N/A                | should not be attached |
      | UT_001 | N/A                | should not be attached |
      | SD_001 | N/A                | should not be attached |
      | OR_001 | N/A                | should not be attached |
      | NV_001 | N/A                | should not be attached |
      | NM_001 | N/A                | should not be attached |
      | MT_001 | N/A                | should not be attached |
      | ID_001 | N/A                | should not be attached |
      | CO_001 | N/A                | should not be attached |
      | AZ_001 | N/A                | should not be attached |
      | TX_001 | N/A                | should not be attached |