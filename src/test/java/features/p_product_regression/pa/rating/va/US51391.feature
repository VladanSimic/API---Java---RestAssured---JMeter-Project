@US51391 @TC103521 @US @VA @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature: US51391: VA - Auto - Base Rate changes

  @NB @NewBusiness
  Scenario: VA - Auto - Base Rate changes - Alternative Coverage -  New Business

    Given I use "VA_014" regression test data from "QuoteCreatorPA" sheet
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
      | relatedObject          | coverage               | factor                                  | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury          | Base Rate                               | 305         | +      |
      | 2016 Tiffin Motorhomes | Bodily Injury          | Base Rate - Misc (Auto 3.1)             | 305         | +      |
      | 2016 Tiffin Motorhomes | Property Damage        | Base Rate - Misc (Auto 3.1)             | 333         | +      |
      | 2019 Acura RDX         | Property Damage        | Base Rate                               | 333         | +      |
      | 2016 Tiffin Motorhomes | Medical Expense        | Base Rate - Misc (Auto 3.1)             | 85          | +      |
      | 2019 Acura RDX         | Medical Expense        | Base Rate                               | 85          | +      |
      | 2019 Acura RDX         | Uninsured Motorists BI | Alternative Base Rate                   | 120         | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists BI | Alternative Base Rate - Misc (Auto 3.1) | 120         | +      |
      | 2019 Acura RDX         | Uninsured Motorists PD | Alternative Base Rate                   | 27          | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists PD | Alternative Base Rate - Misc (Auto 3.1) | 27          | +      |
      | 2016 Tiffin Motorhomes | Comprehensive          | Base Rate - Misc (Auto 3.1)             | 95          | +      |
      | 2019 Acura RDX         | Comprehensive          | Base Rate                               | 95          | +      |
      | 2016 Tiffin Motorhomes | Collision              | Base Rate - Misc (Auto 3.1)             | 404         | +      |
      | 2019 Acura RDX         | Collision              | Base Rate                               | 404         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @NewBusiness
  Scenario: VA - Auto - Base Rate changes - Standard Coverage -  New Business

    Given I use "VA_014" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "7/1/2025"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","
    * I set "Select_Coverage_UM_Coverages" to "Standard Coverage"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage               | factor                      | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury          | Base Rate                   | 305         | +      |
      | 2016 Tiffin Motorhomes | Bodily Injury          | Base Rate - Misc (Auto 3.1) | 305         | +      |
      | 2016 Tiffin Motorhomes | Property Damage        | Base Rate - Misc (Auto 3.1) | 333         | +      |
      | 2019 Acura RDX         | Property Damage        | Base Rate                   | 333         | +      |
      | 2016 Tiffin Motorhomes | Medical Expense        | Base Rate - Misc (Auto 3.1) | 85          | +      |
      | 2019 Acura RDX         | Medical Expense        | Base Rate                   | 85          | +      |
      | 2019 Acura RDX         | Uninsured Motorists BI | Base Rate                   | 123         | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists BI | Base Rate - Misc (Auto 3.1) | 123         | +      |
      | 2019 Acura RDX         | Uninsured Motorists PD | Base Rate                   | 28          | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists PD | Base Rate - Misc (Auto 3.1) | 28          | +      |
      | 2016 Tiffin Motorhomes | Comprehensive          | Base Rate - Misc (Auto 3.1) | 95          | +      |
      | 2019 Acura RDX         | Comprehensive          | Base Rate                   | 95          | +      |
      | 2016 Tiffin Motorhomes | Collision              | Base Rate - Misc (Auto 3.1) | 404         | +      |
      | 2019 Acura RDX         | Collision              | Base Rate                   | 404         | +      |



    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities