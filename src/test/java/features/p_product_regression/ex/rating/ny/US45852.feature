@US45852 @TC91210 @US @NY @ExcessLiability @EX @PCRegression @2024 @DEC @Rating @P2 @PCTeam2Regression
Feature: US45852: [Continued] NY Excess Base Rate, Factors

  @NB @NewBusiness
  Scenario: NY Excess:  Base Rates & Factors Territory1 - New Business

    Given I use "NY_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                              | coverage                                       | factor                               | factorValue | method |
      |                                            | Base Rate Calculation                          | Base Rate NY                         | 790         | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Home Premium                        | Additional Home Single Family charge | 69          | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Home Premium                        | Additional Home Multi-Family charge  | 69          | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Pool Premium                        | Additional Pool charge               | 22          | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Pool Premium                        | B Pool Rate                          | 22          | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Pool Premium                        | Additional Pool charge               | 22          | +      |
      | 94 OLD BROOK RD - , DIX HILLS , NY , 11746 | Additional Pool Premium                        | B Pool Rate                          | 22          | +      |
      | Mr. Operator T Youth Jr.                   | Young driver Premium                           | Young driver charge                  | 559         | +      |
      | Mr. Operator T Mature Sr.                  | Mature driver Premium                          | Mature Operator Rate                 | 214         | +      |
      | A BROWN                                    | Mature driver Premium                          | Adult Operator Rate                  | 186         | +      |
      | Watercraft 1 , Jet Ski                     | Watercraft Premium                             | Watercraft charge                    | 292         | +      |
      | Watercraft 2 , TUG BOAT                    | Watercraft Premium                             | Watercraft charge                    | 366         | +      |
      | Watercraft 3 , Spark                       | Watercraft Premium                             | Watercraft charge                    | 459         | +      |
      | Watercraft 4 , Trixx                       | Watercraft Premium                             | Watercraft charge                    | 1,099       | +      |
      | Watercraft 5 , GTI SE                      | Watercraft Premium                             | Watercraft charge                    | 1,099       | +      |
      |                                            | Domestic Ee Premium                            | Dom. Ee rate                         | 57          | +      |
      |                                            | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 245         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: NY Excess:  Base Rates & Factors Territory2 - New Business

    Given I use "NY_003" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                           | coverage                                       | factor                               | factorValue | method |
      |                                                         | Base Rate Calculation                          | Base Rate NY                         | 593         | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Home Premium                        | Additional Home Multi-Family charge  | 51          | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Home Premium                        | Additional Home Single Family charge | 51          | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Pool Premium                        | B Pool Rate                          | 17          | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | 7559 Otter Creek Truck Trail - , Glenfield , NY , 13343 | Additional Pool Premium                        | B Pool Rate                          | 17          | +      |
      | Mr. Operator T Youth Jr.                                | Young driver Premium                           | Young driver charge                  | 417         | +      |
      | A BROWN                                                 | Mature driver Premium                          | Adult Operator Rate                  | 140         | +      |
      | Mr. Operator T Mature Sr.                               | Mature driver Premium                          | Mature Operator Rate                 | 161         | +      |
      | Watercraft 1 , Jet Ski                                  | Watercraft Premium                             | Watercraft charge                    | 292         | +      |
      | Watercraft 2 , TUG BOAT                                 | Watercraft Premium                             | Watercraft charge                    | 366         | +      |
      | Watercraft 3 , Spark                                    | Watercraft Premium                             | Watercraft charge                    | 459         | +      |
      | Watercraft 4 , Trixx                                    | Watercraft Premium                             | Watercraft charge                    | 1,099       | +      |
      | Watercraft 5 , GTI SE                                   | Watercraft Premium                             | Watercraft charge                    | 1,099       | +      |
      |                                                         | Domestic Ee Premium                            | Dom. Ee rate                         | 41          | +      |
      |                                                         | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 245         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities