@US44157 @TC87543 @US @MS @ExcessLiability @EX @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US44157: MS Excess Base Rates & Factors

  @NB @NewBusiness
  Scenario: MS Excess:  Base Rates & Factors - New Business

    Given I use "MS_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                | coverage                                       | factor                               | factorValue | method |
      |                                              | Base Rate Calculation                          | Base Rate EX                         | 453         | +      |
      | 456 Mississippi 309 - , Byhalia , MS , 38611 | Additional Home Premium                        | Additional Home Multi-Family charge  | 45          | +      |
      | 22206 Berry Rd - , Pheba , MS , 39755        | Additional Home Premium                        | Additional Home Single Family charge | 45          | +      |
      | 22206 Berry Rd - , Pheba , MS , 39755        | Additional Pool Premium                        | Additional Pool charge               | 15          | +      |
      | 22206 Berry Rd - , Pheba , MS , 39755        | Additional Pool Premium                        | B Pool Rate                          | 15          | +      |
      | 456 Mississippi 309 - , Byhalia , MS , 38611 | Additional Pool Premium                        | Additional Pool charge               | 15          | +      |
      | 456 Mississippi 309 - , Byhalia , MS , 38611 | Additional Pool Premium                        | B Pool Rate                          | 15          | +      |
      | Mr. Operator Y Two Jr.                       | Young driver Premium                           | Young driver charge                  | 377         | +      |
      | Taylor Houck                                 | Mature driver Premium                          | Adult Operator Rate                  | 126         | +      |
      | Watercraft 5 , GTI SE                        | Watercraft Premium                             | Watercraft charge                    | 978         | +      |
      | Watercraft 1 , Jet Ski                       | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                      | Watercraft Premium                             | Watercraft charge                    | 250         | +      |
      | Watercraft 3 , Spark                         | Watercraft Premium                             | Watercraft charge                    | 336         | +      |
      | Watercraft 4 , Trixx                         | Watercraft Premium                             | Watercraft charge                    | 698         | +      |
      |                                              | Domestic Ee Premium                            | Dom. Ee rate                         | 39          | +      |
      |                                              | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities