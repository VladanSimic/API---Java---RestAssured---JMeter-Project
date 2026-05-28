@CourseOfConstruction @US36219
Feature: US36219 - Inspection fee calculation

  As a Compliance Officer I want Phase 2 COC policies to have a declaration page
  so insureds and brokers are able to review the coverages provided

  Scenario Outline: Declaration page - "<description>" - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US36219STG" in sheet "QuoteCreatorCC" for "CC" LOB
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

    Then I issue a CC endorsement

    Examples:
      | TC_ID  | description                                                    |
      | AZ_001 | I should see AZ Home Major Renovation to Ground Up full policy |
      | AZ_002 | I should see AZ Condo Ground Up full policy                    |
      | AZ_003 | I should see AZ Home Vacant to Condo policy                    |
      | CA_001 | I should see CA Home Major Renovation to Ground Up full policy |
      | CA_002 | I should see CA Condo Ground Up full policy                    |
      | CA_003 | I should see CA Home Vacant to Condo policy                    |
      | CO_001 | I should see CO Home Major Renovation to Ground Up full policy |
      | CO_002 | I should see CO Condo Ground Up full policy                    |
      | CO_003 | I should see CO Home Vacant to Condo policy                    |
      | CT_001 | I should see CT Home Major Renovation to Ground Up full policy |
      | CT_002 | I should see CT Condo Ground Up full policy                    |
      | CT_003 | I should see CT Home Vacant to Condo policy                    |
      | DE_001 | I should see DE Home Major Renovation to Ground Up full policy |
      | DE_002 | I should see DE Condo Ground Up full policy                    |
      | DE_003 | I should see DE Home Vacant to Condo policy                    |
      | HI_001 | I should see HI Home Major Renovation to Ground Up full policy |
      | HI_002 | I should see HI Condo Ground Up full policy                    |
      | HI_003 | I should see HI Home Vacant to Condo policy                    |
      | ID_001 | I should see ID Home Major Renovation to Ground Up full policy |
      | ID_002 | I should see ID Condo Ground Up full policy                    |
      | ID_003 | I should see ID Home Vacant to Condo policy                    |
      | IL_001 | I should see IL Home Major Renovation to Ground Up full policy |
      | IL_002 | I should see IL Condo Ground Up full policy                    |
      | IL_003 | I should see IL Home Vacant to Condo policy                    |
      | ME_001 | I should see ME Home Major Renovation to Ground Up full policy |
      | ME_002 | I should see ME Condo Ground Up full policy                    |
      | ME_003 | I should see ME Home Vacant to Condo policy                    |
      | MT_001 | I should see MD Home Major Renovation to Ground Up full policy |
      | MT_002 | I should see MD Condo Ground Up full policy                    |
      | MT_003 | I should see MD Home Vacant to Condo policy                    |
      | MT_001 | I should see MT Home Major Renovation to Ground Up full policy |
      | MT_002 | I should see MT Condo Ground Up full policy                    |
      | MT_003 | I should see MT Home Vacant to Condo policy                    |
      | NC_001 | I should see NC Home Major Renovation to Ground Up full policy |
      | NC_002 | I should see NC Condo Ground Up full policy                    |
      | NC_003 | I should see NC Home Vacant to Condo policy                    |
      | NJ_001 | I should see NJ Home Major Renovation to Ground Up full policy |
      | NJ_002 | I should see NJ Condo Ground Up full policy                    |
      | NJ_003 | I should see NJ Home Vacant to Condo policy                    |
      | NM_001 | I should see NM Home Major Renovation to Ground Up full policy |
      | NM_002 | I should see NM Condo Ground Up full policy                    |
      | NM_003 | I should see NM Home Vacant to Condo policy                    |
      | NV_001 | I should see NV Home Major Renovation to Ground Up full policy |
      | NV_002 | I should see NV Condo Ground Up full policy                    |
      | NV_003 | I should see NV Home Vacant to Condo policy                    |
      | RI_001 | I should see RI Home Major Renovation to Ground Up full policy |
      | RI_002 | I should see RI Condo Ground Up full policy                    |
      | RI_003 | I should see RI Home Vacant to Condo policy                    |
      | SC_001 | I should see SC Home Major Renovation to Ground Up full policy |
      | SC_002 | I should see SC Condo Ground Up full policy                    |
      | SC_003 | I should see SC Home Vacant to Condo policy                    |
      | OR_001 | I should see OR Home Major Renovation to Ground Up full policy |
      | OR_002 | I should see OR Condo Ground Up full policy                    |
      | OR_003 | I should see OR Home Vacant to Condo policy                    |
      | UT_001 | I should see UT Home Major Renovation to Ground Up full policy |
      | UT_002 | I should see UT Condo Ground Up full policy                    |
      | UT_003 | I should see UT Home Vacant to Condo policy                    |
      | VA_001 | I should see VA Home Major Renovation to Ground Up full policy |
      | VA_002 | I should see VA Condo Ground Up full policy                    |
      | VA_003 | I should see VA Home Vacant to Condo policy                    |
      | WA_001 | I should see WA Home Major Renovation to Ground Up full policy |
      | WA_002 | I should see WA Condo Ground Up full policy                    |
      | WA_003 | I should see WA Home Vacant to Condo policy                    |
      | WY_001 | I should see WY Home Major Renovation to Ground Up full policy |
      | WY_002 | I should see WY Condo Ground Up full policy                    |
      | WY_003 | I should see WY Home Vacant to Condo policy                    |