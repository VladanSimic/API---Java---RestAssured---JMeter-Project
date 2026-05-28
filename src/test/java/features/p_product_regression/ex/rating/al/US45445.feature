@US45445 @TC90472 @US @AL @ExcessLiability @EX @PCRegression @2024 @DEC @Rating @P1 @PCTeam2Regression
Feature: US45445: [Continued] AL Excess Base Rates, Factors & Structural

  @NB @NewBusiness
  Scenario: AL Excess Base Rates - NB

    Given I use "AL_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                 | coverage                                       | factor                               | factorValue | method |
      |                                               | Base Rate Calculation                          | Base Rate EX                         | 480         | +      |
      | 4005 Alabama 79 - , Guntersville , AL , 35976 | Additional Home Premium                        | Additional Home Single Family charge | 59          | +      |
      | 594 County Road 1518 - , Cullman , AL , 35058 | Additional Home Premium                        | Additional Home Multi-Family charge  | 59          | +      |
      | 594 County Road 1518 - , Cullman , AL , 35058 | Additional Pool Premium                        | Additional Pool charge               | 19          | +      |
      | Mr. Two M Operator Jr.                        | Young driver Premium                           | Young driver charge                  | 358         | +      |
      | Mr. Three M Operator Jr.                      | Mature driver Premium                          | Mature Operator Rate                 | 138         | +      |
      | LINDA PIERCE                                  | Mature driver Premium                          | Adult Operator Rate                  | 120         | +      |
      | Tata , Nexon                                  | Watercraft Premium                             | Watercraft charge                    | 309         | +      |
      | Yamaha , FZS                                  | Watercraft Premium                             | Watercraft charge                    | 388         | +      |
      | Bajaj , CT100                                 | Watercraft Premium                             | Watercraft charge                    | 485         | +      |
      | Ski Doo , GTRX                                | Watercraft Premium                             | Watercraft charge                    | 1,165       | +      |
      | Nissan , Sunny                                | Watercraft Premium                             | Watercraft charge                    | 1,165       | +      |
      |                                               | Domestic Ee Premium                            | Dom. Ee rate                         | 48          | +      |
      |                                               | Personal Excess Liability                      | Limit Factor                         | 1.15        | *      |
      |                                               | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

