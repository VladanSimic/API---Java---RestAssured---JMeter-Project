@US48785 @TC95313 @US @AZ @ExcessLiability @EX @PCRegression @2025 @Mar @Rating @P1 @PCTeam2Regression
Feature: US48785: [Continued] AZ Excess - Base Rates & UM Rates

  @NB @NewBusiness
  Scenario: AZ Excess - Base Rates & UM Rates - NB

    Given I use "AZ_002" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "04/01/2025"
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
      | relatedObject                                | coverage                                       | factor                               | factorValue | method |
      |                                              | Base Rate Calculation                          | Base Rate EX                         | 536         | +      |
      | 91 Peterson St - , Sierra Vista , AZ , 85635 | Additional Home Premium                        | Additional Home Multi-Family charge  | 56          | +      |
      | 18018 N 63RD LN - , GLENDALE , AZ , 85308    | Additional Home Premium                        | Additional Home Single Family charge | 56          | +      |
      | 91 Peterson St - , Sierra Vista , AZ , 85635 | Additional Pool Premium                        | Additional Pool charge               | 17          | +      |
      | Mr. Youth Y Opeartor Jr.                     | Young driver Premium                           | Young driver charge                  | 433         | +      |
      | Mr. Mature M Opeartor Sr.                    | Mature driver Premium                          | Mature Operator Rate                 | 166         | +      |
      | NELLIE HOOD                                  | Mature driver Premium                          | Adult Operator Rate                  | 144         | +      |
      | Yamaha , FZS                                 | Watercraft Premium                             | Watercraft charge                    | 285         | +      |
      | SKi Doo , GTX100                             | Watercraft Premium                             | Watercraft charge                    | 356         | +      |
      | Hyundai , I20                                | Watercraft Premium                             | Watercraft charge                    | 445         | +      |
      | Cheverlet , Spark                            | Watercraft Premium                             | Watercraft charge                    | 1,068       | +      |
      | Nissan , Xtreme Pro                          | Watercraft Premium                             | Watercraft charge                    | 1,068       | +      |
      |                                              | Domestic Ee Premium                            | Dom. Ee rate                         | 44          | +      |
      |                                              | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate                            | 228         | +      |
      |                                              | Uninsured/Underinsured Motorists Bodily Injury | UMBI rate factor                     | 8.2         | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

