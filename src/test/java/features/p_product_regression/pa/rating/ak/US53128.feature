@US53128 @TC103467 @TC103465 @US @AK @PersonalAuto @Auto @PA @PCRegression @2025 @JUNE @Rating @P1 @PCTeam2Regression
Feature:US53128: AK - Auto - Base Rate changes

  @NB @NewBusiness
  Scenario: AK - Auto - Base Rate changes -  New Business

    Given I use "AK_013" regression test data from "QuoteCreatorPA" sheet
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
      | relatedObject          | coverage                                       | factor                    | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury                                  | Base Rate                 | 497         | *      |
      | 2016 Tiffin Motorhomes | Bodily Injury                                  | Base Rate - Misc Auto 3.0 | 497         | +      |
      | 2016 Tiffin Motorhomes | Property Damage                                | Base Rate - Misc Auto 3.0 | 401         | +      |
      | 2019 Acura RDX         | Property Damage                                | Base Rate                 | 401         | *      |
      | 2019 Acura RDX         | Medical Payments                               | Base Rate                 | 79          | *      |
      | 2016 Tiffin Motorhomes | Medical Payments                               | Base Rate - Misc Auto 3.0 | 79          | +      |
      | 2019 Acura RDX         | Uninsured/Underinsured Motorists Bodily Injury | Base Rate                 | 117         | +      |
      | 2016 Tiffin Motorhomes | Uninsured/Underinsured Motorists Bodily Injury | Base Rate - Misc Auto 3.0 | 117         | +      |
      | 2019 Acura RDX         | Uninsured Motorist Propery Damage              | Base Rate                 | 32          | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorist Propery Damage              | Base Rate - Misc Auto 3.0 | 32          | +      |
      | 2019 Acura RDX         | Comprehensive                                  | Base Rate                 | 79          | *      |
      | 2016 Tiffin Motorhomes | Comprehensive                                  | Base Rate - Misc Auto 3.0 | 79          | +      |
      | 2019 Acura RDX         | Collision                                      | Base Rate                 | 574         | *      |
      | 2016 Tiffin Motorhomes | Collision                                      | Base Rate - Misc Auto 3.0 | 574         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities

  @NB @RC @NewBusiness @RenewalConversion
  Scenario: AK - Auto - Base Rate changes -  Renewal Conversion

    Given I use "AK_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "8/15/2024"
    * I set "Additional_Operator_Incidents_" to ","
    * I set "Additional_Operators" to ","
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject          | coverage                                       | factor                    | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury                                  | Base Rate                 | 468         | *      |
      | 2016 Tiffin Motorhomes | Bodily Injury                                  | Base Rate - Misc Auto 3.0 | 468         | +      |
      | 2016 Tiffin Motorhomes | Property Damage                                | Base Rate - Misc Auto 3.0 | 377         | +      |
      | 2019 Acura RDX         | Property Damage                                | Base Rate                 | 377         | *      |
      | 2019 Acura RDX         | Medical Payments                               | Base Rate                 | 74          | *      |
      | 2016 Tiffin Motorhomes | Medical Payments                               | Base Rate - Misc Auto 3.0 | 74          | +      |
      | 2019 Acura RDX         | Uninsured/Underinsured Motorists Bodily Injury | Base Rate                 | 110         | +      |
      | 2016 Tiffin Motorhomes | Uninsured/Underinsured Motorists Bodily Injury | Base Rate - Misc Auto 3.0 | 110         | +      |
      | 2019 Acura RDX         | Uninsured Motorist Propery Damage              | Base Rate                 | 30          | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorist Propery Damage              | Base Rate - Misc Auto 3.0 | 30          | +      |
      | 2019 Acura RDX         | Comprehensive                                  | Base Rate                 | 69          | *      |
      | 2016 Tiffin Motorhomes | Comprehensive                                  | Base Rate - Misc Auto 3.0 | 69          | +      |
      | 2019 Acura RDX         | Collision                                      | Base Rate                 | 501         | *      |
      | 2016 Tiffin Motorhomes | Collision                                      | Base Rate - Misc Auto 3.0 | 501         | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    Then I create a renewal
    And I navigate to policy image page
 #   * I add changes on "PA" renewal
    Then I review changes
    And I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                            | factor                   | factorValue | method |
      | 2019 Acura RDX         | Bodily Injury                                  | Base Rate                 | 497         | *      |
      | 2016 Tiffin Motorhomes | Bodily Injury                                  | Base Rate - Misc Auto 3.0 | 497         | +      |
      | 2016 Tiffin Motorhomes | Property Damage                                | Base Rate - Misc Auto 3.0 | 401         | +      |
      | 2019 Acura RDX         | Property Damage                                | Base Rate                 | 401         | *      |
      | 2019 Acura RDX         | Medical Payments                               | Base Rate                 | 79          | *      |
      | 2016 Tiffin Motorhomes | Medical Payments                               | Base Rate - Misc Auto 3.0 | 79          | +      |
      | 2019 Acura RDX         | Uninsured/Underinsured Motorists Bodily Injury | Base Rate                 | 117         | +      |
      | 2016 Tiffin Motorhomes | Uninsured/Underinsured Motorists Bodily Injury | Base Rate - Misc Auto 3.0 | 117         | +      |
      | 2019 Acura RDX         | Uninsured Motorist Propery Damage              | Base Rate                 | 32          | +      |
      | 2016 Tiffin Motorhomes | Uninsured Motorist Propery Damage              | Base Rate - Misc Auto 3.0 | 32          | +      |
      | 2019 Acura RDX         | Comprehensive                                  | Base Rate                 | 79          | *      |
      | 2016 Tiffin Motorhomes | Comprehensive                                  | Base Rate - Misc Auto 3.0 | 79          | +      |
      | 2019 Acura RDX         | Collision                                      | Base Rate                 | 574         | *      |
      | 2016 Tiffin Motorhomes | Collision                                      | Base Rate - Misc Auto 3.0 | 574         | +      |

    And I click exit button
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal
