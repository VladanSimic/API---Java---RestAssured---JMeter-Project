Feature: Policy Creation CO
  As a user I want to create CO policies using data from excel workbook

  @CO @NewBusiness @US25289
  Scenario Outline: Policy Creation CO - NB - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "US25289_Collection_SAL_UAT" in sheet "QuoteCreatorCO" for "CO" LOB
    * I am logged in to Pure as Field
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote

    Examples:
      | TC_ID  |
      | NY_001 |
      | NY_002 |
      | NY_003 |
      | NY_004 |
      | NY_005 |
      | NY_006 |
      | NY_007 |
      | NY_008 |
      | NY_009 |
      | NY_010 |
      | NY_011 |
      | NY_012 |
      | NY_013 |
      | NY_014 |
      | NY_015 |
      | NY_016 |
      | TX_001 |
      | TX_002 |
      | TX_003 |
      | TX_004 |
      | TX_005 |
      | TX_006 |
      | TX_007 |
      | TX_008 |
      | VA_001 |
      | VA_002 |
      | VA_001 |
      | VA_002 |
      | NJ_001 |
      | NJ_002 |
      | NJ_003 |
      | NJ_004 |
      | NJ_005 |
      | NJ_006 |
      | NJ_007 |
      | NJ_008 |
      | MA_001 |
      | MA_002 |
      | MA_003 |
      | MA_004 |
      | CA_001 |
      | CA_002 |
      | CA_003 |
      | CA_004 |
      | CA_005 |
      | CA_006 |
      | CA_007 |
      | CA_008 |
      | CT_001 |
      | CT_002 |
      | CT_003 |
      | CT_004 |
      | CT_005 |
      | CT_006 |
      | FL_001 |
      | FL_002 |
      | FL_003 |
      | FL_004 |
      | FL_005 |
      | FL_006 |
      | FL_007 |
      | FL_008 |
      | FL_009 |
      | FL_010 |
      | GA_001 |
      | GA_002 |
      | GA_003 |
      | IL_001 |
      | IL_001 |
      | HI_001 |
