@US45847 @TC91677  @US @LA @ExcessLiability @EX @PCRegression @2024 @DEC @Rating @P1 @PCTeam2Regression
Feature: US45847: [Continued] LA Excess Base Rate & Factor

  @NB @NewBusiness
  Scenario: LA Excess Base Rate & Factor - NB - BASE & UM Rate

    Given I use "LA_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                     | coverage                                       | factor                               | factorValue | method |
      |                                                   | Base Rate Calculation                          | Base Rate EX                         | 578         | +      |
      | 567 Louisiana Avenue - , New Orleans , LA , 70115 | Additional Home Premium                        | Additional Home Single Family charge | 59          | +      |
      | 567 Louisiana Avenue - , New Orleans , LA , 70115 | Additional Home Premium                        | Additional Home Single Family charge | 59          | +      |
      | 567 Louisiana Avenue - , New Orleans , LA , 70115 | Additional Home Premium                        | Additional Home Multi-Family charge  | 59          | +      |
      | 567 Louisiana Avenue - , New Orleans , LA , 70115 | Additional Pool Premium                        | Additional Pool charge               | 21          | +      |
      | 567 Louisiana Avenue - , New Orleans , LA , 70115 | Additional Pool Premium                        | Additional Pool charge               | 21          | +      |
      | RICHARD NEWTON                                    | Young driver Premium                           | Young driver charge                  | 476         | +      |
      | Mr. AOperator B Two Jr.                           | Mature driver Premium                          | Mature Operator Rate                 | 182         | +      |
      | Mr. AOperator B Two Jr.                           | Mature driver Premium                          | Adult Operator Rate                  | 158         | +      |
      | Azimuth , VDX 5586                                | Watercraft Premium                             | Watercraft charge                    | 1,247       | +      |
      | Azimuth , VDX 5588                                | Watercraft Premium                             | Watercraft charge                    | 1,247       | +      |
      | Azimuth , VDX 5585                                | Watercraft Premium                             | Watercraft charge                    | 891         | +      |
      | Azimuth , VDX 5583                                | Watercraft Premium                             | Watercraft charge                    | 320         | +      |
      | Azimuth , VDX 5581                                | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Azimuth , VDX 5582                                | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | Azimuth , VDX 5587                                | Watercraft Premium                             | Watercraft charge                    | 1,247       | +      |
      | Azimuth , VDX 5584                                | Watercraft Premium                             | Watercraft charge                    | 427         | +      |
      |                                                   | Domestic Ee Premium                            | Dom. Ee rate                         | 50          | +      |
      |                                                   | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 193         | +      |
      |                                                   | Grand Total Premium                            | Capital Charge Factor                | 1,281.68    | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities


  @NB @NewBusiness
  Scenario: LA Excess Base Rate & Factor - NB - Minimum Rate Per Million

    Given I use "LA_102" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                         | factor          | factorValue | method |
      |               | Reporting - Personal Excess Liability Adjustment | Minimum Premium | 6,750       | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities