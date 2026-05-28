@US44627 @TC88452 @US @TX @ExcessLiability @EX @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US44627: TX Excess Base Rates & Factors

  @NB @NewBusiness
  Scenario: TX Excess: Base Rates & Factors - New Business

    Given I use "TX_003" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                         | coverage                                       | factor                               | factorValue | method |
      |                                                       | Base Rate Calculation                          | Base Rate EX                         | 803         | +      |
      | 9451 Post Oak Cemetary Rd - , Montgomery , TX , 77356 | Additional Home Premium                        | Additional Home Single Family charge | 69          | +      |
      | 5121 De Milo Dr - , Houston , TX , 77092              | Additional Home Premium                        | Additional Home Multi-Family charge  | 69          | +      |
      | 5121 De Milo Dr - , Houston , TX , 77092              | Additional Pool Premium                        | Additional Pool charge               | 22          | +      |
      | 5121 De Milo Dr - , Houston , TX , 77092              | Additional Pool Premium                        | B Pool Rate                          | 22          | +      |
      | 9451 Post Oak Cemetary Rd - , Montgomery , TX , 77356 | Additional Pool Premium                        | Additional Pool charge               | 22          | +      |
      | 9451 Post Oak Cemetary Rd - , Montgomery , TX , 77356 | Additional Pool Premium                        | B Pool Rate                          | 22          | +      |
      | Mr. Operator T Youth Jr.                              | Young driver Premium                           | Young driver charge                  | 363         | +      |
      | Taylor Houck                                          | Mature driver Premium                          | Adult Operator Rate                  | 187         | +      |
      | Mr. Operator T Mature Sr.                             | Mature driver Premium                          | Mature Operator Rate                 | 215         | +      |
      | Watercraft 2 , TUG BOAT                               | Watercraft Premium                             | Watercraft charge                    | 455         | +      |
      | Watercraft 5 , GTI SE                                 | Watercraft Premium                             | Watercraft charge                    | 1,368       | +      |
      | Watercraft 4 , Trixx                                  | Watercraft Premium                             | Watercraft charge                    | 1,368       | +      |
      | Watercraft 3 , Spark                                  | Watercraft Premium                             | Watercraft charge                    | 571         | +      |
      | Watercraft 1 , Jet Ski                                | Watercraft Premium                             | Watercraft charge                    | 364         | +      |
      |                                                       | Domestic Ee Premium                            | Dom. Ee rate                         | 55          | +      |
      |                                                       | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities