@US52279 @TC103348 @US @MO @ExcessLiability @EX @PCRegression @2025 @Jun @Rating @P1 @PCTeam2Regression
Feature: US52279: MO - Excess Base rate, UM rate changes

  @NB @NewBusiness
  Scenario: MO - Excess Base rate, UM rate changes - New Business

    Given I use "MO_002" regression test data from "QuoteCreatorEX" sheet
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
      |                                               | Base Rate Calculation                          | Base Rate EX                         | 520         | +      |
      | 4183 Whitehall Drive - , Arnold , MO , 63010  | Additional Home Premium                        | Additional Home Multi-Family charge  | 52          | +      |
      | 17805 Broken Arrow Ln - , Dexter , MO , 63841 | Additional Home Premium                        | Additional Home Single Family charge | 52          | +      |
      | 4183 Whitehall Drive - , Arnold , MO , 63010  | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | 4183 Whitehall Drive - , Arnold , MO , 63010  | Additional Pool Premium                        | B Pool Rate                          | 17          | +      |
      | Mr. Operator T Youth Jr.                      | Young driver Premium                           | Young driver charge                  | 432         | +      |
      | Mr. Operator T Mature Sr.                     | Mature driver Premium                          | Mature Operator Rate                 | 166         | +      |
      | Taylor Houck                                  | Mature driver Premium                          | Adult Operator Rate                  | 144         | +      |
      | Watercraft 1 , Jet Ski                        | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                       | Watercraft Premium                             | Watercraft charge                    | 289         | +      |
      | Watercraft 3 , Spark                          | Watercraft Premium                             | Watercraft charge                    | 384         | +      |
      | Watercraft 4 , Trixx                          | Watercraft Premium                             | Watercraft charge                    | 802         | +      |
      | Watercraft 5 , GTI SE                         | Watercraft Premium                             | Watercraft charge                    | 1,124       | +      |
      |                                               | Domestic Ee Premium                            | Dom. Ee rate                         | 47          | +      |
      |                                               | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities