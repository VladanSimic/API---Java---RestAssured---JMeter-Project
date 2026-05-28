@US43120 @TC89754 @TC89756 @US @VA @PersonalAuto @Auto @PA @PCRegression @2024 @OCT @Rating @P2 @PCTeam2Regression
Feature: US43120: [Continued] VA Auto UI, Factors & Forms

  @NB @NewBusiness
  Scenario: VA Auto UI, Factors & Forms - New Business

    Given I use "VA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2025"
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set "Vehicle_Details_Cost_New_5" to "5000"
    * I set "Vehicle_Details_Engine_Size_5" to "100"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage   | comp  | coll  | option             |
      | Private Passenger           | No       | WBAGV8C02NCH01929 | M850       | BMW               | 2022 | 11,000    | 1,000 | 1,000 | without Full Glass |
      | Private Passenger           | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000    | 5,000 | 5,000 | with Full Glass    |
      | Antique Collectors Car      | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000    | 500   | 500   | with Full Glass    |
      | Classic Collectors Car      | No       | 242076P3395191122 | R100       | Rolls-Royce       | 2000 | 11,000    | 5,000 | 5,000 | with Full Glass    |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha            | 1924 | 0 - 3,000 | 1,000 | 1,000 | with Full Glass    |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000    | 1,000 | 1,000 | with Full Glass    |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to Coverages Page
    Then  I click BI Limits dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/200,000     |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    * I click UMBI Limits dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/200,000     |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    *  I click UMPD Limits dropdown
    Then I verify dropdown size is 6
    * I verify dropdown values
      | values     |
      | - Select - |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |

    * I click on the footer

    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                            | factor                   | factorValue | method |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 1924 Yamaha Yzf-R1c          | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2023 Acura INTEGRA           | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2022 BMW 8                   | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2022 BMW 8                   | Property Damage                     | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 1924 Yamaha Yzf-R1c          | Property Damage                     | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                     | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2023 Acura INTEGRA           | Property Damage                     | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2023 Acura INTEGRA           | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2022 BMW 8                   | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 1924 Yamaha Yzf-R1c          | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2022 BMW 8                   | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2022 BMW 8                   | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.95        | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.95        | *      |
      |                              | Bodily Injury (Collection)          | Liability Premium(Split) | 28          | +      |
      |                              | Property Damage (Collection)        | Liability Premium(Split) | 26          | +      |
      |                              | Uninsured Motorists PD (Collection) | Liability Premium(Split) | 24          | +      |
      |                              | Uninsured Motorists BI (Collection) | Liability Premium(Split) | 30          | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities


  @NB @NewBusiness @RC @RenewalConversion
  Scenario: VA Auto UI, Factors & Forms - Renewal Conversion

    Given I use "VA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2024"
    * I set "Additional_Operators" to ","

    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set "Vehicle_Details_Cost_New_5" to "5000"
    * I set "Vehicle_Details_Engine_Size_5" to "100"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage   | comp  | coll  | option             |
      | Private Passenger           | No       | WBAGV8C02NCH01929 | M850       | BMW               | 2022 | 11,000    | 1,000 | 1,000 | without Full Glass |
      | Private Passenger           | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000    | 5,000 | 5,000 | with Full Glass    |
      | Antique Collectors Car      | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000    | 500   | 500   | with Full Glass    |
      | Classic Collectors Car      | No       | 242076P3395191122 | R100       | Rolls-Royce       | 2000 | 11,000    | 5,000 | 5,000 | with Full Glass    |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha            | 1924 | 0 - 3,000 | 1,000 | 1,000 | with Full Glass    |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000    | 1,000 | 1,000 | with Full Glass    |

    * I set "Select_Coverage_BI_Limits" to "30,000/60,000"
    * I set "Select_Coverage_UMBI_Limit" to "30,000/60,000"
    * I set "Select_Coverage_UM_PD_Limit" to "20,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to Coverages Page
    Then  I click BI Limits dropdown
    Then I verify dropdown size is 6
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 30,000/60,000       |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    * I click UMBI Limits dropdown
    Then I verify dropdown size is 6
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 30,000/60,000       |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    *  I click UMPD Limits dropdown
    Then I verify dropdown size is 5
    * I verify dropdown values
      | values     |
      | - Select - |
      | 20,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
    * I click on the footer

    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                            | factor                   | factorValue | method |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 1924 Yamaha Yzf-R1c          | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2023 Acura INTEGRA           | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2022 BMW M850                | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2023 Acura INTEGRA           | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2022 BMW M850                | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 1924 Yamaha Yzf-R1c          | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2023 Acura INTEGRA           | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 1924 Yamaha Yzf-R1c          | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2022 BMW M850                | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2022 BMW M850                | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 2022 BMW M850                | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      |                              | Bodily Injury (Collection)          | Liability Premium(Split) | 22          | +      |
      |                              | Property Damage (Collection)        | Liability Premium(Split) | 21          | +      |
      |                              | Uninsured Motorists PD (Collection) | Liability Premium(Split) | 20          | +      |
      |                              | Uninsured Motorists BI (Collection) | Liability Premium(Split) | 0           | +      |

    * I click return to premium summary page button
    Then I navigate to underwriting referrals page
    And I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    When I navigate to transactions or endorsements
    Then I create a renewal
    * I set "Select_Coverage_BI_Limits_RNW" to "30,000/60,000"
    * I set "Select_Coverage_UMBI_Limit_RNW" to "30,000/60,000"
    * I set "Select_Coverage_UM_PD_Limit_RNW" to "20,000"
    And I navigate to policy image page
 #   * I add changes on "PA" renewal
    Then I navigate to Coverages Page
    Then  I click BI Limits dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/200,000     |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    * I click UMBI Limits dropdown
    Then I verify dropdown size is 7
    * I verify dropdown values
      | values              |
      | - Select -          |
      | 50,000/100,000      |
      | 100,000/200,000     |
      | 250,000/500,000     |
      | 500,000/500,000     |
      | 500,000/1,000,000   |
      | 1,000,000/1,000,000 |
    * I click on the footer

    *  I click UMPD Limits dropdown
    Then I verify dropdown size is 6
    * I verify dropdown values
      | values     |
      | - Select - |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
    * I click on the footer
    Then I review changes
    And I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject                | coverage                            | factor                   | factorValue | method |
      | 2016 Tiffin Motorhomes Motor | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2023 Acura INTEGRA           | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 1924 Yamaha Yzf-R1c          | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2022 BMW 8                   | Bodily Injury                       | Limits Factor - Auto 3.1 | 0.8         | *      |
      | 2016 Tiffin Motorhomes Motor | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2023 Acura INTEGRA           | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 1924 Yamaha Yzf-R1c          | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2022 BMW 8                   | Property Damage                     | Limits Factor - Auto 3.1 | 0.9         | *      |
      | 2016 Tiffin Motorhomes Motor | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2022 BMW 8                   | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 1924 Yamaha Yzf-R1c          | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2023 Acura INTEGRA           | Medical Expense                     | Limits Factor - Auto 3.1 | 1.26        | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2022 BMW 8                   | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists BI              | Limits Factor - Auto 3.1 | 0.5         | *      |
      | 2016 Tiffin Motorhomes Motor | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 1924 Yamaha Yzf-R1c          | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 2022 BMW 8                   | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | 2023 Acura INTEGRA           | Uninsured Motorists PD              | Limits Factor - Auto 3.1 | 0.56        | *      |
      | Jonny Bravo                  | Bodily Injury (Collection)          | Liability Premium(Split) | 22          | +      |
      | Jonny Bravo                  | Property Damage (Collection)        | Liability Premium(Split) | 21          | +      |
      | Jonny Bravo                  | Uninsured Motorists PD (Collection) | Liability Premium(Split) | 20          | +      |
      | Jonny Bravo                  | Uninsured Motorists BI (Collection) | Liability Premium(Split) | 24          | +      |

    And I click exit button
    When I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process a renewal

  @NB @NewBusiness @PreBind
  Scenario: VA Auto UI, Factors & Forms - Pre-Bind

    Given I use "VA_013" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I set "Effective_Date" to "1/1/2025"
    * I set "Additional_Operators" to ","
    * I set "Additional_Vehicles" to "001,002,003,004,005,006"
    * I set "Vehicle_Details_Cost_New_5" to "5000"
    * I set "Vehicle_Details_Engine_Size_5" to "100"
    * I set additional vehicles for NB
      | type                        | override | vin               | model      | make              | year | mileage   | comp  | coll  | option             |
      | Private Passenger           | No       | WBAGV8C02NCH01929 | M850       | BMW               | 2022 | 11,000    | 1,000 | 1,000 | without Full Glass |
      | Private Passenger           | No       | 19UDE4H69PA027805 | INTEGRA    | ACURA             | 2023 | 12,000    | 5,000 | 5,000 | with Full Glass    |
      | Antique Collectors Car      | No       | 242076P339510     | GTO        | Ponatic           | 1966 | 11,000    | 500   | 500   | with Full Glass    |
      | Classic Collectors Car      | No       | 242076P3395191122 | R100       | Rolls-Royce       | 2000 | 11,000    | 5,000 | 5,000 | with Full Glass    |
      | Motorcycles/Mopeds/Scooters | No       | JYARN23Y1EA004111 | Yzf-R1c    | Yamaha            | 1924 | 0 - 3,000 | 1,000 | 1,000 | with Full Glass    |
      | Motor Home                  | No       | 5VBBA37A8GA116483 | Motor Home | Tiffin Motorhomes | 2016 | 13,000    | 1,000 | 1,000 | with Full Glass    |
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote


#  @ProcessRenewal
#  Scenario Outline: Create renewal for "<policyID>"
#    Given I use "VA_013" regression test data from "QuoteCreatorPA" sheet
#    When I am logged in to Pure as "P81" unless is PROD then "A1"
#    * I navigate to policies
#    * I select a policy by ID "<policyID>"
#    * I navigate to transactions or endorsements
#    Then I create a renewal
#    And I navigate to policy image page
#    * I add changes on "PA" renewal
#    Then I review changes
#    And I click renewed premium
##    When I navigate to premium details page
##    Then I validate premium details page table
##      | relatedObject              | coverage                                      | factor                          | factorValue | method |
##
##
##    And I click exit button
#    When I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I process a renewal
#
#
#    Examples:
#      | policyID    |
#      | PA260230000 |