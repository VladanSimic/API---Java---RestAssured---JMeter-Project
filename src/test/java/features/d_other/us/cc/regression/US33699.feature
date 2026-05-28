@CourseOfConstruction @US33699 @RegressionUS
Feature: US33699 - Inspection fee calculation

  As a Product Owner I want Inspection Fee to apply to COC algorithm
  so we can calculate adequate premium when an inspection is ordered

  Scenario Outline: Inspection fee - "<description>" - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US33699" in sheet "QuoteCreatorCC" for "CC" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify inspection fee value "<inspectionFee>"

    Examples:
      | TC_ID  | inspectionFee |
      | AZ_001 | $350.00       |
      | AZ_002 | $0.00         |
      | CA_001 | $350.00       |
      | CA_002 | $0.00         |
      | CO_001 | $350.00       |
      | CO_002 | $0.00         |
      | CT_001 | $350.00       |
      | CT_002 | $0.00         |
      | DE_001 | $350.00       |
      | DE_002 | $0.00         |
      | HI_001 | $350.00       |
      | HI_002 | $0.00         |
      | ID_001 | $350.00       |
      | ID_002 | $0.00         |
      | IL_001 | $0.00         |
      | IL_002 | $350.00       |
      | ME_001 | $0.00         |
      | ME_002 | $350.00       |
      | MD_001 | $0.00         |
      | MD_002 | $350.00       |
      | MT_001 | $0.00         |
      | MT_002 | $350.00       |
      | NC_001 | $0.00         |
      | NC_002 | $350.00       |
      | NJ_001 | $0.00         |
      | NJ_002 | $350.00       |
      | NM_001 | $0.00         |
      | NM_002 | $350.00       |
      | NV_001 | $0.00         |
      | NV_002 | $350.00       |
      | RI_001 | $0.00         |
      | RI_002 | $350.00       |
      | SC_001 | $0.00         |
      | SC_002 | $350.00       |
      | OR_001 | $0.00         |
      | OR_002 | $350.00       |
      | UT_001 | $0.00         |
      | UT_002 | $350.00       |
      | VA_001 | $0.00         |
      | VA_002 | $350.00       |
      | WA_001 | $0.00         |
      | WA_002 | $350.00       |
      | WY_001 | $0.00         |
      | WY_002 | $350.00       |