@US47561 @TC94664  @US @SC @ExcessLiability @EX @PCRegression @2025 @JAN @Rating @P2 @PCTeam2Regression
Feature: US47561: [Continued] SC Excess - Base Rate, UM Rate changes

  @NB @NewBusiness
  Scenario: SC Excess:  Base Rates & Factors - New Business

    Given I use "SC_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                   | coverage                                       | factor                               | factorValue | method |
      |                                                 | Base Rate Calculation                          | Base Rate EX                         | 743         | +      |
      | 78th Avenue North - , Myrtle Beach , SC , 29572 | Additional Home Premium                        | Additional Home Multi-Family charge  | 64          | +      |
      | 116 Sorrento Dr - , Moore , SC , 29369          | Additional Home Premium                        | Additional Home Single Family charge | 64          | +      |
      | 78th Avenue North - , Myrtle Beach , SC , 29572 | Additional Pool Premium                        | Additional Pool charge               | 23          | +      |
      | 78th Avenue North - , Myrtle Beach , SC , 29572 | Additional Pool Premium                        | B Pool Rate                          | 23          | +      |
      | Mr. Operator T Youth Jr.                        | Young driver Premium                           | Young driver charge                  | 524         | +      |
      | Taylor Houck                                    | Mature driver Premium                          | Adult Operator Rate                  | 174         | +      |
      | Mr. Operator T Mature Sr.                       | Mature driver Premium                          | Mature Operator Rate                 | 200         | +      |
      | Watercraft 5 , GTI SE                           | Watercraft Premium                             | Watercraft charge                    | 1,498       | +      |
      | Watercraft 4 , Trixx                            | Watercraft Premium                             | Watercraft charge                    | 1,072       | +      |
      | Watercraft 3 , Spark                            | Watercraft Premium                             | Watercraft charge                    | 515         | +      |
      | Watercraft 2 , TUG BOAT                         | Watercraft Premium                             | Watercraft charge                    | 382         | +      |
      | Watercraft 1 , Jet Ski                          | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      |                                                 | Domestic Ee Premium                            | Dom. Ee rate                         | 54          | +      |
      |                                                 | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 153         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities