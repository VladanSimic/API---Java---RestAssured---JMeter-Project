@US49625 @TC103726 @US @KY @ExcessLiability @EX @PCRegression @2025 @Jun @Rating @P1 @PCTeam2Regression
Feature: US49625: [Continued] KY - Excess - Base Rates & UM Rates

  @NB @NewBusiness
  Scenario: KY - Excess - Base Rates & UM Rates - New Business

    Given I use "KY_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                      | coverage                                       | factor                               | factorValue | method |
      |                                                    | Base Rate Calculation                          | Base Rate EX                         | 569         | +      |
      | 567 Kentucky Street - , Bowling Green , KY , 42101 | Additional Home Premium                        | Additional Home Multi-Family charge  | 57          | +      |
      | 59 INDIANA DR - , BARBOURVILLE , KY , 40906        | Additional Home Premium                        | Additional Home Single Family charge | 57          | +      |
      | 59 INDIANA DR - , BARBOURVILLE , KY , 40906        | Additional Pool Premium                        | Additional Pool charge               | 19          | +      |
      | 59 INDIANA DR - , BARBOURVILLE , KY , 40906        | Additional Pool Premium                        | B Pool Rate                          | 19          | +      |
      | Mr. Operator T Youth Jr.                           | Young driver Premium                           | Young driver charge                  | 470         | +      |
      | Mr. Operator T Mature Sr.                          | Mature driver Premium                          | Adult Operator Rate                  | 156         | +      |
      | TROY HAGG                                          | Mature driver Premium                          | Adult Operator Rate                  | 156         | +      |
      | Watercraft 1 , Jet Ski                             | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                            | Watercraft Premium                             | Watercraft charge                    | 315         | +      |
      | Watercraft 3 , Spark                               | Watercraft Premium                             | Watercraft charge                    | 421         | +      |
      | Watercraft 4 , Trixx                               | Watercraft Premium                             | Watercraft charge                    | 876         | +      |
      | Watercraft 5 , GTI SE                              | Watercraft Premium                             | Watercraft charge                    | 1,228       | +      |
      |                                                    | Domestic Ee Premium                            | Dom. Ee rate                         | 50          | +      |
      |                                                    | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities