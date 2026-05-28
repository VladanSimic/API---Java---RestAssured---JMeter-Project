@US44159 @TC87501 @US @ExcessLiability @EX @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US44159: PA Excess Base Rates & Factors

  @NB @NewBusiness
  Scenario: PA Excess:  Base Rates & Factors - New Business

    Given I use "PA_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                          | coverage                                       | factor                               | factorValue | method |
      |                                        | Base Rate Calculation                          | Base Rate EX                         | 596         | +      |
      | 1395 LARCH RD - , CLYMER , PA , 15728  | Additional Home Premium                        | Additional Home Single Family charge | 36          | +      |
      | 195 Resh Rd - , Reinholds , PA , 17569 | Additional Home Premium                        | Additional Home Multi-Family charge  | 36          | +      |
      | 195 Resh Rd - , Reinholds , PA , 17569 | Additional Pool Premium                        | Additional Pool charge               | 36          | +      |
      | 195 Resh Rd - , Reinholds , PA , 17569 | Additional Pool Premium                        | B Pool Rate                          | 36          | +      |
      | 1395 LARCH RD - , CLYMER , PA , 15728  | Additional Pool Premium                        | Additional Pool charge               | 36          | +      |
      | 1395 LARCH RD - , CLYMER , PA , 15728  | Additional Pool Premium                        | B Pool Rate                          | 36          | +      |
      | Mr. Operator o Two Jr.                 | Young driver Premium                           | Young driver charge                  | 685         | +      |
      | A WILLIAMS                             | Mature driver Premium                          | Adult Operator Rate                  | 229         | +      |
      | Watercraft 5 , GTI SE                  | Watercraft Premium                             | Watercraft charge                    | 1,084       | +      |
      | Watercraft 4 , Trixx                   | Watercraft Premium                             | Watercraft charge                    | 1,084       | +      |
      | Watercraft 3 , Spark                   | Watercraft Premium                             | Watercraft charge                    | 452         | +      |
      | Watercraft 2 , TUG BOAT                | Watercraft Premium                             | Watercraft charge                    | 361         | +      |
      | Watercraft 1 , Jet Ski                 | Watercraft Premium                             | Watercraft charge                    | 290         | +      |
      |                                        | Domestic Ee Premium                            | Dom. Ee rate                         | 85          | +      |
      |                                        | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities