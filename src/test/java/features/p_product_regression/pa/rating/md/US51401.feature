@US51401 @TC102622 @US @MD @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature: US51401: [Continued] MD - Auto - Base Rate changes

  @NB @NewBusiness
  Scenario: MD - Auto - Base Rate changes - Standard Coverage -  New Business

    Given I use "MD_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage                   | factor           | factorValue | method |
      | 2016 Tiffin Motorhomes | Bodily Injury              | Base Rate - Misc | 670         | +      |
      | 2019 Acura RDX         | Bodily Injury              | Base Rate        | 670         | +      |
      | 2016 Tiffin Motorhomes | Property Damage            | Base Rate - Misc | 826         | +      |
      | 2019 Acura RDX         | Property Damage            | Base Rate        | 826         | +      |
      | 2019 Acura RDX         | Medical Payments           | Base Rate        | 10          | +      |
      | 2016 Tiffin Motorhomes | Medical Payments           | Base Rate - Misc | 10          | +      |
      | 2016 Tiffin Motorhomes | Personal Injury Protection | Base Rate - Misc | 132         | +      |
      | 2019 Acura RDX         | Personal Injury Protection | Base Rate        | 132         | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists (CSL)  | Base Rate - Misc | 47          | +      |
      | 2019 Acura RDX         | Uninsured Motorists (CSL)  | Base Rate        | 47          | +      |
      | 2016 Tiffin Motorhomes | Comprehensive              | Base Rate - Misc | 228         | +      |
      | 2019 Acura RDX         | Comprehensive              | Base Rate        | 228         | +      |
      | 2019 Acura RDX         | Collision                  | Base Rate        | 846         | +      |
      | 2016 Tiffin Motorhomes | Collision                  | Base Rate - Misc | 846         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: MD - Auto - Base Rate changes - Enhanced Coverage -  New Business

    Given I use "MD_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","
    * I set "Select_Coverage_UM_Coverages" to "Enhanced Coverage"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage                   | factor                         | factorValue | method |
      | 2016 Tiffin Motorhomes | Bodily Injury              | Base Rate - Misc               | 670         | +      |
      | 2019 Acura RDX         | Bodily Injury              | Base Rate                      | 670         | +      |
      | 2019 Acura RDX         | Property Damage            | Base Rate                      | 826         | +      |
      | 2016 Tiffin Motorhomes | Property Damage            | Base Rate - Misc               | 826         | +      |
      | 2019 Acura RDX         | Medical Payments           | Base Rate                      | 10          | +      |
      | 2016 Tiffin Motorhomes | Medical Payments           | Base Rate - Misc               | 10          | +      |
      | 2016 Tiffin Motorhomes | Personal Injury Protection | Base Rate - Misc               | 132         | +      |
      | 2019 Acura RDX         | Personal Injury Protection | Base Rate                      | 132         | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists (CSL)  | Base Rate - Enhanced UM - Misc | 53          | +      |
      | 2019 Acura RDX         | Uninsured Motorists (CSL)  | Base Rate - Enhanced UM        | 53          | +      |
      | 2019 Acura RDX         | Comprehensive              | Base Rate                      | 228         | +      |
      | 2016 Tiffin Motorhomes | Comprehensive              | Base Rate - Misc               | 228         | +      |
      | 2016 Tiffin Motorhomes | Collision                  | Base Rate - Misc               | 846         | +      |
      | 2019 Acura RDX         | Collision                  | Base Rate                      | 846         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities