@US44156 @TC87472 @US @MA @ExcessLiability @EX @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US44156: MA Excess Base Rates & Factors

  @NB @NewBusiness
  Scenario: MA Excess:  Base Rates & Factors - New Business

    Given I use "MA_002" regression test data from "QuoteCreatorEX" sheet
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
      |                                               | Base Rate Calculation                          | Base Rate EX                         | 604         | +      |
      | 617 PLYMOUTH ST - , ABINGTON , MA , 02351     | Additional Home Premium                        | Additional Home Single Family charge | 61          | +      |
      | 459 Fitchburg State Rd - , Ashby , MA , 01431 | Additional Home Premium                        | Additional Home Multi-Family charge  | 61          | +      |
      | 459 Fitchburg State Rd - , Ashby , MA , 01431 | Additional Pool Premium                        | Additional Pool charge               | 18          | +      |
      | 617 PLYMOUTH ST - , ABINGTON , MA , 02351     | Additional Pool Premium                        | Additional Pool charge               | 18          | +      |
      | JOSEPH MACLEOD                                | Driver Experience Premium                      | Driver Experience Charge             | 123         | +      |
      | Mr. Operator Y Two Jr.                        | Driver Experience Premium                      | Driver Experience Charge             | 218         | +      |
      | Watercraft 3 , Spark                          | Watercraft Premium                             | Watercraft charge                    | 501         | +      |
      | Watercraft 4 , Trixx                          | Watercraft Premium                             | Watercraft charge                    | 1,200       | +      |
      | Watercraft 5 , GTI SE                         | Watercraft Premium                             | Watercraft charge                    | 1,200       | +      |
      | Watercraft 2 , TUG BOAT                       | Watercraft Premium                             | Watercraft charge                    | 400         | +      |
      | Watercraft 1 , Jet Ski                        | Watercraft Premium                             | Watercraft charge                    | 320         | +      |
      |                                               | Domestic Ee Premium                            | Dom. Ee rate                         | 50          | +      |
      |                                               | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities