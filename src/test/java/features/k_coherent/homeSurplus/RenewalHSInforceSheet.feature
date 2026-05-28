Feature: Homeowners Surplus Coherent InforceSheet -Renewal


  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline:  HS - "<TC_ID>" - New Business - Renewal
  As a user I want to be able to create a renewal on existing policy and compare premium

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I get customer account ID
    * I select a policy by ID "<policyID>" from policies list

    Then I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    When I issue an endorsement
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I review changes
    * I click renewed premium

#   Then I save the premium in Excel "src/test/test_data/dragon/coherent/InforceSheet_Renewal.xlsx" in sheet "Results" for "<TC_ID>" "<state>" and policy number "<policyID>" with expected premium "<expectedPremium>"
    Then I process a renewal
    Examples:
      | TC_ID  | policyID    | expectedPremium | endorsementDate |
      | HI_017 | HS245476700 |                 | 06/06/2025      |
      | HI_013 | HS245476600 |                 | 06/06/2025      |
      | HI_012 | HS245476500 |                 | 06/06/2025      |
      | HI_011 | HS245476400 |                 | 06/06/2025      |
      | HI_009 | HS245476200 |                 | 06/06/2025      |
      | HI_004 | HS245476100 |                 | 06/06/2025      |
      | HI_008 | HS245476000 |                 | 06/06/2025      |
      | HI_007 | HS245475900 |                 | 06/06/2025      |
      | HI_010 | HS245475800 |                 | 06/06/2025      |