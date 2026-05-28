@US48788 @TC99356 @US @VA @ExcessLiability @EX @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US48788: VA Excess - Base Rates & Factor Changes

  @NB @NewBusiness
  Scenario: VA Excess - Base Rates & Factor Changes - NewBusiness

    Given I use "VA_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Insured" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                                    | coverage                                       | factor                               | factorValue | method |
      |                                                  | Base Rate Calculation                          | Base Rate EX                         | 622         | +      |
      | 10809 King William Rd 8D - , Aylett , VA , 23009 | Additional Home Premium                        | Additional Home Single Family charge | 62          | +      |
      | 1704 Woodgrove St - , Chesapeake , VA , 23320    | Additional Home Premium                        | Additional Home Multi-Family charge  | 62          | +      |
      | 1704 Woodgrove St - , Chesapeake , VA , 23320    | Additional Pool Premium                        | Additional Pool charge               | 20          | +      |
      | Mr. Mature M Opeartor Sr.                        | Young driver Premium                           | Young driver charge                  | 515         | +      |
      | Mr. Youth Y Opeartor Jr.                         | Mature driver Premium                          | Adult Operator Rate                  | 171         | +      |
      | Taylor Houck                                     | Mature driver Premium                          | Mature Operator Rate                 | 196         | +      |
      | BMW , Trixx                                      | Watercraft Premium                             | Watercraft charge                    | 956         | +      |
      | Audi , GTI SE                                    | Watercraft Premium                             | Watercraft charge                    | 1,343       | +      |
      | KAWASAKI , Jet Ski                               | Watercraft Premium                             | Watercraft charge                    | 0           | +      |
      | YAMAHA , TUG BOAT                                | Watercraft Premium                             | Watercraft charge                    | 345         | +      |
      | Seadoo , Spark                                   | Watercraft Premium                             | Watercraft charge                    | 460         | +      |
      |                                                  | Domestic Ee Premium                            | Dom. Ee rate                         | 55          | +      |
      |                                                  | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities