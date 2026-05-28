@US48786 @TC95314 @US @CT @ExcessLiability @EX @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US48786: [Continued] CT Excess - UI, Base Rates & Factor Changes

  @NB @NewBusiness
  Scenario: CT Excess - UI, Base Rates & Factor Changes - NB

    Given I use "CT_004" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
    * I set "Additional_Insured" to ","
    * I set "Applications_Document_Name" to "Upload_Document"
    * I set "Applications_Internal_Use" to "Yes"
    * I set "Applications_Description" to "Description"
    * I set "Applications_File" to "dummyUpload.pdf"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                            | coverage                                       | factor                               | factorValue | method |
      |                                          | Base Rate Calculation                          | Base Rate EX                         | 762         | +      |
      | 38 David Street - , Enfield , CT , 06082 | Additional Home Premium                        | Additional Home Single Family charge | 67          | +      |
      | 41 Overlook Dr - , Windsor , CT , 06095  | Additional Home Premium                        | Additional Home Multi-Family charge  | 67          | +      |
      | 41 Overlook Dr - , Windsor , CT , 06095  | Additional Pool Premium                        | Additional Pool charge               | 19          | +      |
      | Mr. Two M Operator Jr.                   | Young driver Premium                           | Young driver charge                  | 542         | +      |
      | CAROL A GONZALES                         | Mature driver Premium                          | Adult Operator Rate                  | 181         | +      |
      | Mr. Three M Operator Jr.                 | Mature driver Premium                          | Mature Operator Rate                 | 208         | +      |
      | Yamaha , FZ-S                            | Watercraft Premium                             | Watercraft charge                    | 1,327       | +      |
      | Bajaj , CT100                            | Watercraft Premium                             | Watercraft charge                    | 1,327       | +      |
      | KIA , Seltos                             | Watercraft Premium                             | Watercraft charge                    | 555         | +      |
      | Maruti , Swift                           | Watercraft Premium                             | Watercraft charge                    | 353         | +      |
      | Nissan , Sunny                           | Watercraft Premium                             | Watercraft charge                    | 441         | +      |
      |                                          | Domestic Ee Premium                            | Domestic Ee charge                   | 220         | +      |
      |                                          | Domestic Ee Premium                            | Dom. Ee rate                         | 55          | +      |
      |                                          | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 175         | +      |
      |                                          | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate factor                     | 8.2         | *      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

