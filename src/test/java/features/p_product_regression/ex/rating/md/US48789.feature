@US48789 @TC99352 @US @MD @ExcessLiability @EX @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US48789: MD Excess - Base Rates & Factor Changes

  @NB @NewBusiness
  Scenario: MD Excess - Base Rates & Factor Changes - NewBusiness

    Given I use "MD_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                           | coverage                                       | factor                               | factorValue | method |
      |                                         | Base Rate Calculation                          | Base Rate EX                         | 713         | +      |
      | 6243 Davis Rd - , Woodbine , MD , 21797 | Additional Home Premium                        | Additional Home Single Family charge | 73          | +      |
      | 1359 Cedar Ln - , Oakland , MD , 21550  | Additional Home Premium                        | Additional Home Multi-Family charge  | 73          | +      |
      | 1359 Cedar Ln - , Oakland , MD , 21550  | Additional Pool Premium                        | Additional Pool charge               | 22          | +      |
      | 1359 Cedar Ln - , Oakland , MD , 21550  | Additional Pool Premium                        | B Pool Rate                          | 22          | +      |
      | Mr. Mature M Opeartor Sr.               | Young driver Premium                           | Young driver charge                  | 583         | +      |
      | Taylor Houck                            | Mature driver Premium                          | Mature Operator Rate                 | 225         | +      |
      | Mr. Youth Y Opeartor Jr.                | Mature driver Premium                          | Adult Operator Rate                  | 196         | +      |
      | Watercraft 1 , Jet Ski                  | Watercraft Premium                             | Watercraft charge                    | 356         | +      |
      | Watercraft 2 , TUG BOAT                 | Watercraft Premium                             | Watercraft charge                    | 446         | +      |
      | Watercraft 3 , Spark                    | Watercraft Premium                             | Watercraft charge                    | 557         | +      |
      | Watercraft 4 , Trixx                    | Watercraft Premium                             | Watercraft charge                    | 1,335       | +      |
      | Watercraft 5 , GTI SE                   | Watercraft Premium                             | Watercraft charge                    | 1,335       | +      |
      |                                         | Domestic Ee Premium                            | Dom. Ee rate                         | 60          | +      |
      |                                         | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |


    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities