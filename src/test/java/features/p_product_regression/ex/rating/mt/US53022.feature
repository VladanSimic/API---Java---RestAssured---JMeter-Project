@US53022 @TC103096 @TC103102 @US @MT @ExcessLiability @EX @PCRegression @2025 @Jun @Rating @P1 @PCTeam2Regression
Feature: US53022: [Continued] MT - Excess - Base Rates & UM Rates

  @NB @NewBusiness
  Scenario: MT - Excess - Base Rates & UM Rates - NewBusiness

    Given I use "MT_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "07/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                | coverage                                         | factor                               | factorValue | method |
      |                                              | Base Rate Calculation                            | Base Rate EX                         | 482         | +      |
      | 25 Summit Ave UNIT B - , Somers , MT , 59932 | Additional Home Premium                          | Additional Home Multi-Family charge  | 48          | +      |
      | PO BOX 12 - , ARLEE , MT , 59821             | Additional Home Premium                          | Additional Home Single Family charge | 48          | +      |
      | PO BOX 12 - , ARLEE , MT , 59821             | Additional Pool Premium                          | Additional Pool charge               | 15          | +      |
      | PO BOX 12 - , ARLEE , MT , 59821             | Additional Pool Premium                          | B Pool Rate                          | 15          | +      |
      | Mr. Operator T Youth Jr.                     | Young driver Premium                             | Young driver charge                  | 398         | +      |
      | Mr. Operator T Mature Sr.                    | Mature driver Premium                            | Mature Operator Rate                 | 153         | +      |
      | STORMIE DUIVIS                               | Mature driver Premium                            | Adult Operator Rate                  | 133         | +      |
      | Watercraft 1 , Jet Ski                       | Watercraft Premium                               | Watercraft charge                    | 0           | +      |
      | Watercraft 2 , TUG BOAT                      | Watercraft Premium                               | Watercraft charge                    | 267         | +      |
      | Watercraft 3 , Spark                         | Watercraft Premium                               | Watercraft charge                    | 356         | +      |
      | Watercraft 4 , Trixx                         | Watercraft Premium                               | Watercraft charge                    | 742         | +      |
      | Watercraft 5 , GTI SE                        | Watercraft Premium                               | Watercraft charge                    | 1,041       | +      |
      |                                              | Domestic Ee Premium                              | Dom. Ee rate                         | 42          | +      |
      |                                              | Reporting - Personal Excess Liability Adjustment | Limit Factor                         | 1.29        | *      |
      |                                              | Personal Excess Liability                        | Limit Factor                         | 1.29        | *      |
      |                                              | Uninsured/Underinsured Motorists Bodily Injury   | UMBI rate                            | 175         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities