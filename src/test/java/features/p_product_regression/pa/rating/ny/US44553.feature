@US44553 @TC88017 @TC88019 @US @NY @PersonalAuto @Auto @PA @PCRegression @2024 @OCT @Rating @P1 @PCTeam2Regression
Feature: US47410 - NY Auto - Base Rate, Factors, Structural

  @NB @NewBusiness
  Scenario: NY Auto - Base Rate_Factors_Structural - New Business

    Given I use "NY_102" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/15/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage                                          | factor                      | factorValue | method |
      | 2016 Tiffin Motorhomes | Bodily Injury                                     | Base Rate - Misc - Auto 3.1 | 371         | +      |
      | 2019 Acura RDX         | Bodily Injury                                     | Base Rate Auto 3.1          | 576         | *      |
      | 2016 Tiffin Motorhomes | Property Damage                                   | Base Rate - Misc - Auto 3.1 | 211         | +      |
      | 2019 Acura RDX         | Property Damage                                   | Base Rate Auto 3.1          | 702         | *      |
      | 2016 Tiffin Motorhomes | Medical Payments                                  | Base Rate - Misc - Auto 3.1 | 9           | +      |
      | 2019 Acura RDX         | Medical Payments                                  | Base Rate Auto 3.1          | 14          | *      |
      | 2016 Tiffin Motorhomes | Personal Injury Protection                        | Base Rate - Misc - Auto 3.1 | 239         | +      |
      | 2019 Acura RDX         | Personal Injury Protection                        | Base Rate Auto 3.1          | 380         | *      |
      | 2016 Tiffin Motorhomes | Optional Basic Economic Loss                      | Base Rate - Misc - Auto 3.1 | 15          | +      |
      | 2019 Acura RDX         | Optional Basic Economic Loss                      | Base Rate Auto 3.1          | 18          | *      |
      | 2016 Tiffin Motorhomes | Uninsured Motorists/Supplementary Uninsured (CSL) | Base Rate - Misc - Auto 3.1 | 42          | +      |
      | 2019 Acura RDX         | Uninsured Motorists/Supplementary Uninsured (CSL) | Base Rate Auto 3.1          | 45          | +      |
      | 2016 Tiffin Motorhomes | Comprehensive                                     | Base Rate - Misc - Auto 3.1 | 185         | +      |
      | 2019 Acura RDX         | Comprehensive                                     | Base Rate Auto 3.1          | 266         | *      |
      | 2019 Acura RDX         | Collision                                         | Base Rate Auto 3.1          | 1,025       | *      |
      | 2016 Tiffin Motorhomes | Collision                                         | Base Rate - Misc - Auto 3.1 | 632         | +      |
      | 2019 Acura RDX         | Bodily Injury                                     | Territory Factor            | 0.774       | *      |
      | 2019 Acura RDX         | Property Damage                                   | Territory Factor            | 1.071       | *      |
      | 2019 Acura RDX         | Personal Injury Protection                        | Territory Factor            | 1.084       | *      |
      | 2019 Acura RDX         | Optional Basic Economic Loss                      | Territory Factor            | 1.052       | *      |
      | 2019 Acura RDX         | Uninsured Motorists/Supplementary Uninsured (CSL) | Territory Factor            | 1.074       | *      |
      | 2019 Acura RDX         | Comprehensive                                     | Territory Factor            | 1.177       | *      |
      | 2019 Acura RDX         | Collision                                         | Territory Factor            | 1.174       | *      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements


  @NB @NewBusiness @DayPrior
  Scenario: NY Auto - Base Rate_Factors_Structural - Day Prior

    Given I use "NY_103" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "11/14/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                                          | factor                      | factorValue | method |
      | 2019 Acura RDX      | Bodily Injury                                     | Base Rate Auto 3.1          | 486         | *      |
      | 2014 Yamaha Yzf-R1c | Bodily Injury                                     | Base Rate - Misc - Auto 3.1 | 314.64      | +      |
      | 2019 Acura RDX      | Property Damage                                   | Base Rate Auto 3.1          | 571         | *      |
      | 2014 Yamaha Yzf-R1c | Property Damage                                   | Base Rate - Misc - Auto 3.1 | 172.96      | +      |
      | 2014 Yamaha Yzf-R1c | Medical Payments                                  | Base Rate - Misc - Auto 3.1 | 9.08        | +      |
      | 2019 Acura RDX      | Medical Payments                                  | Base Rate Auto 3.1          | 14          | *      |
      | 2019 Acura RDX      | Personal Injury Protection                        | Base Rate Auto 3.1          | 362         | *      |
      | 2014 Yamaha Yzf-R1c | Personal Injury Protection                        | Base Rate - Misc - Auto 3.1 | 228.78      | +      |
      | 2019 Acura RDX      | Optional Basic Economic Loss                      | Base Rate Auto 3.1          | 18          | *      |
      | 2014 Yamaha Yzf-R1c | Optional Basic Economic Loss                      | Base Rate - Misc - Auto 3.1 | 14.61       | +      |
      | 2019 Acura RDX      | Uninsured Motorists/Supplementary Uninsured (CSL) | Base Rate Auto 3.1          | 37          | +      |
      | 2014 Yamaha Yzf-R1c | Uninsured Motorists/Supplementary Uninsured (CSL) | Base Rate - Misc - Auto 3.1 | 34.27       | +      |
      | 2019 Acura RDX      | Comprehensive                                     | Base Rate Auto 3.1          | 202         | *      |
      | 2014 Yamaha Yzf-R1c | Comprehensive                                     | Base Rate - Misc - Auto 3.1 | 141.31      | +      |
      | 2019 Acura RDX      | Collision                                         | Base Rate Auto 3.1          | 879         | *      |
      | 2014 Yamaha Yzf-R1c | Collision                                         | Base Rate - Misc - Auto 3.1 | 544.8       | +      |
    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
