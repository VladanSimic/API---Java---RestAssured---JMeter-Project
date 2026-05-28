@CourseOfConstruction @US36866 @RegressionUS
Feature: US36866 - Roll up COC Total Location Premium

  As a Developer I need to calculate the COC Total Location Premium
  so that we can confirm if there are any discrepancies in the algorithm

  Scenario Outline: I create and rate a "<TC_ID>" quote

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total premium value "<totalPremium>"
    * I verify inspection fee value "<inspectionFee>"
    * I verify surplus lines broker fee value "<brokerFee>"
    * I verify state mandated assessments value "<sma>"
    * I verify grand total value "<grandTotal>"

    Examples:
      | TC_ID  | totalPremium | inspectionFee | brokerFee | sma     | grandTotal |
      | AZ_001 | $7,697.00    | $350.00       | $350.00   | $268.70 | $8,665.70  |
      | CA_001 | $5,922.00    | $350.00       | $350.00   | $210.58 | $6,832.58  |
      | CO_001 | $4,416.00    | $350.00       | $350.00   | $153.48 | $5,269.48  |
      | CT_001 | $4,805.00    | $350.00       | $250.00   | $204.20 | $5,609.20  |
      | DE_001 | $4,638.00    | $350.00       | $350.00   | $160.14 | $5,498.14  |
      | HI_001 | $7,259.00    | $350.00       | $350.00   | $339.72 | $8,298.72  |
      | ID_001 | $9,110.00    | $350.00       | $350.00   | $196.20 | $10,006.20 |
      | IL_001 | $5,486.00    | $350.00       | $350.00   | $216.14 | $6,402.14  |
      | ME_001 | $5,413.00    | $350.00       | $100.00   | $175.89 | $6,038.89  |
      | MD_001 | $4,876.00    | $350.00       | $200.00   | $156.78 | $5,582.78  |
      | MT_001 | $8,108.00    | $350.00       | $50.00    | $354.22 | $8,862.22  |
      | NC_001 | $5,774.00    | $350.00       | $350.00   | $306.02 | $6,780.02  |
      | NJ_001 | $3,972.00    | $350.00       | $50.00    | $198.60 | $4,570.60  |
      | NM_001 | $8,159.00    | $350.00       | $350.00   | $266.03 | $9,125.03  |
      | NV_001 | $8,213.00    | $350.00       | $350.00   | $347.61 | $9,260.61  |
      | RI_001 | $5,054.00    | $350.00       | $350.00   | $202.16 | $5,956.16  |
      | SC_001 | $5,454.00    | $350.00       | $350.00   | $369.24 | $6,523.24  |
      | OR_001 | $5,935.00    | $350.00       | $350.00   | $162.61 | $6,797.61  |
      | UT_001 | $7,116.00    | $350.00       | $350.00   | $346.26 | $8,162.26  |
      | VA_001 | $4,331.00    | $350.00       | $350.00   | $113.21 | $5,144.21  |
      | WA_001 | $8,264.00    | $350.00       | $350.00   | $188.24 | $9,152.24  |
      | WY_001 | $5,841.00    | $350.00       | $350.00   | $207.67 | $6,748.67  |
      | FL_001 | $7,871.00    | $350.00       | $350.00   | $430.55 | $9,001.55  |
      | MA_001 | $5,145.00    | $350.00       | $350.00   | $205.80 | $6,050.80  |
      | NY_001 | $4,323.00    | $350.00       | $350.00   | $175.24 | $5,198.24  |