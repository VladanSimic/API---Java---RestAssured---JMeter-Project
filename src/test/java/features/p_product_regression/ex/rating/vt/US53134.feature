@US53134 @TC103102 @US @VT @ExcessLiability @EX @PCRegression @2025 @Jun @Rating @P1 @PCTeam2Regression
Feature: US53134: [Continued] VT - Excess Base rate, UM rate changes

  @NB @NewBusiness
  Scenario: VT - Excess Base rate, UM rate changes - New Business

    Given I use "VT_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                 | coverage                                       | factor                               | factorValue | method |
      |                                               | Base Rate Calculation                          | Base Rate EX                         | 552         | +      |
      | 3008 Plot Road - , Johnson , VT , 05656       | Additional Home Premium                        | Additional Home Multi-Family charge  | 55          | +      |
      | 669 Riverside Ave - , Burlington , VT , 05401 | Additional Home Premium                        | Additional Home Single Family charge | 55          | +      |
      | 669 Riverside Ave - , Burlington , VT , 05401 | Additional Pool Premium                        | Additional Pool charge               | 18          | +      |
      | 669 Riverside Ave - , Burlington , VT , 05401 | Additional Pool Premium                        | B Pool Rate                          | 18          | +      |
      | Mr. Operator T Youth Jr.                      | Young driver Premium                           | Young driver charge                  | 456         | +      |
      | Taylor Houck                                  | Mature driver Premium                          | Adult Operator Rate                  | 152         | +      |
      | Mr. Operator T Mature Sr.                     | Mature driver Premium                          | Mature Operator Rate                 | 176         | +      |
      | Watercraft 1 , Jet Ski                        | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                       | Watercraft Premium                             | Watercraft charge                    | 306         | +      |
      | Watercraft 3 , Spark                          | Watercraft Premium                             | Watercraft charge                    | 410         | +      |
      | Watercraft 4 , Trixx                          | Watercraft Premium                             | Watercraft charge                    | 849         | +      |
      | Watercraft 5 , GTI SE                         | Watercraft Premium                             | Watercraft charge                    | 1,190       | +      |
      |                                               | Domestic Ee Premium                            | Dom. Ee rate                         | 49          | +      |
      |                                               | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities