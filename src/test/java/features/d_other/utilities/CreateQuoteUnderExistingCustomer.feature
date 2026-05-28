Feature: Create quote under existing customer

  Scenario Outline: Create HO quote for existing customer - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "Homeowner"
    * I set "Quote_Line_And_Name_Block_State" to "<TC_ID>"
    * I set "Quote_Line_And_Name_Block_Name" to "Quote under existing HH"

    When I am logged in to Pure as "P72" unless is PROD then "A17"

    When I navigate to customers page
    * I select a customer
    * I click new quote button on customer summary page
    * I create a new quote on new quote information page

    Then I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  |
      | TC_ID  |
      | AK_001 |
      | AR_001 |
      | AZ_001 |
      | CO_001 |
      | DC_001 |
      | IA_001 |
      | IL_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MN_001 |
      | MO_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | NM_001 |
      | NV_001 |
      | OH_001 |
      | OK_001 |
      | OR_001 |
      | PA_001 |
      | RI_001 |
      | SD_001 |
      | TN_001 |
      | UT_001 |
      | VT_001 |
      | WA_001 |
      | WI_001 |
      | WV_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MD_001 |
      | ME_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | VA_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |
      | MI_001 |
      | ID_001 |
