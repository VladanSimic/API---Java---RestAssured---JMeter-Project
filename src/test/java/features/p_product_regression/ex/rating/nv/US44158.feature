@US44158 @TC87477 @US @NV @ExcessLiability @EX @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US44158: NV Excess Base Rates & Factors

  @NB @NewBusiness
  Scenario: NV Excess:  Base Rates & Factors - New Business

    Given I use "NV_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                 | coverage                                       | factor                               | factorValue | method |
      |                                               | Base Rate Calculation                          | Base Rate EX                         | 515         | +      |
      | 887 Sagedell Rd - , Mesquite , NV , 89027     | Additional Home Premium                        | Additional Home Single Family charge | 51          | +      |
      | 885 Violet Hill St - , Las Vegas , NV , 89110 | Additional Home Premium                        | Additional Home Multi-Family charge  | 51          | +      |
      | 887 Sagedell Rd - , Mesquite , NV , 89027     | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | 885 Violet Hill St - , Las Vegas , NV , 89110 | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | Mr. Operator Y Two Jr.                        | Young driver Premium                           | Young driver charge                  | 426         | +      |
      | Taylor Houck                                  | Mature driver Premium                          | Adult Operator Rate                  | 142         | +      |
      | Watercraft 1 , Jet Ski                        | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                       | Watercraft Premium                             | Watercraft charge                    | 286         | +      |
      | Watercraft 3 , Spark                          | Watercraft Premium                             | Watercraft charge                    | 381         | +      |
      | Watercraft 4 , Trixx                          | Watercraft Premium                             | Watercraft charge                    | 793         | +      |
      | Watercraft 5 , GTI SE                         | Watercraft Premium                             | Watercraft charge                    | 1,111       | +      |
      |                                               | Domestic Ee Premium                            | Dom. Ee rate                         | 45          | +      |
      |                                               | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities