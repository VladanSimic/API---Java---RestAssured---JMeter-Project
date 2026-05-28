@US45504 @US @MN @Homeowners @HO @BaseRate @PCRegression @2024 @December @Rating
Feature: US45504 - MN Home Base Rate + Factors + Validations

  @Homeowner @Export
  Scenario: MN Base Rate and Factors - Homeowner - NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29384 Hidden Forest Blvd"
    * I set "City_Name_Txt" to "Chisago City"
    * I set "Zip_Code" to "55013"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    * I set "Year_Built" to "1960"
    * I set "Roof_Covering" to "Slate"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2000"
    * I set "Roof_Characteristics_Home_Fortification" to "Gold"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 263         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 105         | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Asphalt Shingle"
    * I set "Square_Footage" to "2699"
    * I set "Roof_Characteristics_Home_Fortification" to "Bronze"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to ""
    * I set "Roof_Shape" to "Flat"

    Then I navigate to Homeowner Policy Page
    And I set personal liability limit to "300,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 32420 59th Ave | Cannon Falls | MN    | 55009 | Homeowner     | 3000000 |           | 10,000 | 5%         |

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 225         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 90          | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.87        | +        |
      | 32420 59th Ave           | Base Premium                           | Base Rate                                     | 2,092       | +        |
      | 32420 59th Ave           | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,579       | +        |
      | 32420 59th Ave           | Liability Premium                      | Liability Premium                             | 225         | +        |
      | 32420 59th Ave           | Liability Extension                    | Liability Extension Rate                      | 90          | +        |
      | 32420 59th Ave           | Wind Premium                           | Wind/Hail Deductible Credit v.2               | 0.7         | *        |
      | 32420 59th Ave           | Wind Premium                           | Home Fortification Credit                     | -0.066      | (1+:x:)* |
      | 32420 59th Ave           | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.82        | *        |
      | 32420 59th Ave           | Wind Premium                           | Wind Protection Factor                        | 0.265       | (1+:x:)* |
      | 32420 59th Ave           | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.97        | *        |
    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "Year_Built" to "1998"
    * I set "Roof_Covering" to "Wood Shake"
    * I set "Square_Footage" to "3799"
    * I set "Roof_Characteristics_Home_Fortification" to "Silver"
    * I set "Personal_Liability_Limit" to "1,000,000"
    * I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Roof_Covering_Credit" to "Class 3"
    * I set "Roof_Shape" to "Other"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page
    And I set personal liability limit to "1,000,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4872 State Highway 23 | Brook Park | MN    | 55007 | Homeowner     | 5500000 |           | 25,000 | 2%         |

    And I set "City_Name_Txt" to "Cannon Falls"
    Then I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set Low Temperature monitoring system to "No"
    * I set Permanently Installed Generator to "No"
    * I set Gas Leak Detector to "No"
    * I set 24 Hour Signal Continuity to "No"
    * I set Sprinkler System with Waterflow to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Water Leak Detection System with Master Shut Off to "None"
    * I set Lightning Protection System to "No"
    * I set External Perimeter Gate to "No"
    * I set Full Time Live In Caretaker to "No"
    * I set Perimeter Security Protection to "None"

    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45504" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.461  | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942  | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465  | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 315    | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 120    | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.681  | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093 | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.24   | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.276  | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98   | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88   | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98   | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9    | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98   | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95   | *        |
      | 32420 59th Ave           | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.872  | +        |
      | 32420 59th Ave           | Base Premium                           | Base Rate                                     | 2,092  | +        |
      | 32420 59th Ave           | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,579  | +        |
      | 32420 59th Ave           | Liability Premium                      | Liability Premium                             | 315    | +        |
      | 32420 59th Ave           | Liability Extension                    | Liability Extension Rate                      | 120    | +        |
      | 32420 59th Ave           | Wind Premium                           | Wind/Hail Deductible Credit v.2               | 0.7    | *        |
      | 32420 59th Ave           | Wind Premium                           | Home Fortification Credit                     | -0.066 | (1+:x:)* |
      | 32420 59th Ave           | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.83   | *        |
      | 32420 59th Ave           | Wind Premium                           | Wind Protection Factor                        | 0.265  | (1+:x:)* |
      | 32420 59th Ave           | Non Wind Premium                       | External Perimeter Security Protection Factor | 1      | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Full time Live In Caretaker Factor            | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Back Up Generator Factor                      | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Gas Leak Detector Factor                      | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Lightning Protection System Factor            | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88   | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Burglar Alarm Factor                          | 1      | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Fire Alarm Factor                             | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Guard Gated Community Factor                  | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System Factor Home                  | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 1      | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 1      | *        |
      | 4872 State Highway       | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.764  | +        |
      | 4872 State Highway       | Base Premium                           | Base Rate                                     | 2,606  | +        |
      | 4872 State Highway       | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,065  | +        |
      | 4872 State Highway       | Liability Premium                      | Liability Premium                             | 315    | +        |
      | 4872 State Highway       | Liability Extension                    | Liability Extension Rate                      | 120    | +        |
      | 4872 State Highway       | Wind Premium                           | Wind/Hail Deductible Credit v.2               | 0.85   | *        |
      | 4872 State Highway       | Wind Premium                           | Home Fortification Credit                     | -0.081 | (1+:x:)* |
      | 4872 State Highway       | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.84   | *        |
      | 4872 State Highway       | Wind Premium                           | Wind Protection Factor                        | 0.968  | (1+:x:)* |
      | 4872 State Highway       | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98   | +        |
      | 4872 State Highway       | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98   | *        |
      | 4872 State Highway       | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Back Up Generator Factor                      | 0.98   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Lightning Protection System Factor            | 0.98   | *        |
      | 4872 State Highway       | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88   | +        |
      | 4872 State Highway       | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98   | +        |
      | 4872 State Highway       | Non Wind Premium                       | Fire Alarm Factor                             | 0.98   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9    | *        |
      | 4872 State Highway       | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98   | *        |
      | 4872 State Highway       | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95   | *        |

  @Condo @Coop @Export
  Scenario: MN Base Rate and Factors - Condo -  NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "MN_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29455 Sunset Trl"
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Contents" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Condo" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"
    Then I navigate to Homeowner Policy Page
    And I set personal liability limit to "300,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1     | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4401 Lakeside Dr | Eveleth | MN    | 55734 | Condo/Co-op   | 7500000 |           | 25,000 | 2%         |

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Condo" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.78        | +        |
      | 4401 Lakeside    | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 4401 Lakeside    | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 4401 Lakeside    | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 4401 Lakeside    | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 4401 Lakeside    | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 4401 Lakeside    | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.97        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    Then I navigate to Homeowner Policy Page
    And I set personal liability limit to "1,000,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC  | lossOfUse | aopDed    | deductible            |
      | 438 Highway 60 | Zumbro Falls | MN    | 55991 | Condo/Co-op   | 25000000 |           | 1,000,000 | N/A - AOP Ded Applies |

    And I set "City_Name_Txt" to "Eveleth"
    Then I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set 24 Hour Door Man to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Water Leak Detection System with Master Shut Off to "No"
    * I set Full Time Live In Caretaker to "No"

    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    And I save coverage factor and value for "Condo" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.461       | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.784       | +        |
      | 4401 Lakeside    | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 4401 Lakeside    | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 4401 Lakeside    | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 4401 Lakeside    | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 4401 Lakeside    | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 4401 Lakeside    | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Burglar Alarm Factor                           | 1           | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Fire Alarm Factor                              | 1           | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Guard Gated Community Factor                   | 1           | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Sprinkler System Factor Condo                  | 1           | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 4401 Lakeside    | Non Wind Premium                       | 24 Hour Door Man Factor                        | 1           | +        |
      | 4401 Lakeside    | Non Wind Premium                       | !Locked  Elevator Factor                       | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.5         | +        |
      | 438 Highway 60   | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 438 Highway 60   | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 438 Highway 60   | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 438 Highway 60   | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 438 Highway 60   | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 438 Highway 60   | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 438 Highway 60   | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 438 Highway 60   | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 438 Highway 60   | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 438 Highway 60   | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 438 Highway 60   | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 438 Highway 60   | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 438 Highway 60   | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 438 Highway 60   | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 438 Highway 60   | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 438 Highway 60   | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 438 Highway 60   | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 438 Highway 60   | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 438 Highway 60   | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    Then I click exit button

  @Tenants @Export
  Scenario: MN Base Rate and Factors - Tenants -  NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "MN_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "40543 Ryans Bay Rd"
    * I set "City_Name_Txt" to "Zumbro Falls"
    * I set "Zip_Code" to "55991"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Contents" to "7500000"
    * I set "AOP_Ded" to "50,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Tenants" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    When I navigate to Homeowner Policy Page
    And I set personal liability limit to "300,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1         | city          | state | zip   | residenceType | covAorC  | lossOfUse | aopDed    | deductible            |
      | 38978 N Shoreland Rd | Sturgeon Lake | MN    | 55783 | Tenants       | 10000000 |           | 1,000,000 | N/A - AOP Ded Applies |

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Tenants" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.47        | +        |
      | 38978 N Shoreland  | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 38978 N Shoreland  | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 38978 N Shoreland  | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 38978 N Shoreland  | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 38978 N Shoreland  | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    When I navigate to Homeowner Policy Page
    And I set personal liability limit to "1,000,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city    | state | zip   | residenceType | covAorC  | lossOfUse | aopDed    | deductible            |
      | 201 White St S | Comfrey | MN    | 56019 | Tenants       | 25000000 |           | 1,000,000 | N/A - AOP Ded Applies |

    And I set "City_Name_Txt" to "Sturgeon Lake"
    Then I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set 24 Hour Door Man to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Full Time Live In Caretaker to "No"

    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    And I save coverage factor and value for "Tenants" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.664       | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.471       | +        |
      | 38978 N Shoreland  | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 38978 N Shoreland  | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 38978 N Shoreland  | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 38978 N Shoreland  | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 38978 N Shoreland  | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Burglar Alarm Factor                           | 1           | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Fire Alarm Factor                              | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Guard Gated Community Factor                   | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Sprinkler System Factor Condo                  | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | 24 Hour Door Man Factor                        | 1           | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Locked  Elevator Factor                       | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.5         | +        |
      | 201 White          | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 201 White          | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 201 White          | Liability Premium                      | Liability Premium                              | 315         | +        |
      | 201 White          | Liability Extension                    | Liability Extension Rate                       | 120         | +        |
      | 201 White          | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 201 White          | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 201 White          | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 201 White          | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 201 White          | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 201 White          | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 201 White          | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 201 White          | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 201 White          | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 201 White          | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 201 White          | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 201 White          | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 201 White          | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 201 White          | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 201 White          | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 201 White          | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 201 White          | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

  @Homeowner @Condo @Coop @Tenants @RC @RenewalConversion @Export
  Scenario: MN Base Rate and Factors - Renewal Conversion

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "Traven Rd"
    * I set "City_Name_Txt" to "Eveleth"
    * I set "Zip_Code" to "55734"
    * I set "Effective_Date" to "03/07/2024"
    * I set "Replacement_Cost" to "4000000"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "2%"
    * I set "Year_Built" to "1970"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    * I set "Roof_Characteristics_Home_Fortification" to ""
    * I set "Square_Footage" to "50,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Year_Built" to "2005"
    * I set "Square_Footage" to "30,000"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2020"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible            |
      | 335 Archibald Ln | Dundas | MN    | 55019 | Condo/Co-op   | 2000000 |           | 25,000 | N/A - AOP Ded Applies |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1515 3rd Ave | Newport | MN    | 55055 | Tenants       | 4000000 |           | 1,000  | 0.25%      |

    And I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method |
      | Traven Rd        | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.16        | +      |
      | Traven Rd        | Base Premium                           | Base Rate                                      | 3,855       | +      |
      | Traven Rd        | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +      |
      | Traven Rd        | Liability Premium                      | Liability Premium                              | 175         | +      |
      | Traven Rd        | Liability Extension                    | Liability Extension Rate                       | 70          | +      |
      | Traven Rd        | Non Wind Premium                       | Wind/Hail Deductible Credit                    | 0.94        | *      |
      | Traven Rd        | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor  | 0           | *      |
      | Traven Rd        | Non Wind Premium                       | Wind Protection Factor                         | 0.235       | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Security Protection Factor  | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Full time Live In Caretaker Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | 24 Hour Signal Continuity Factor               | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor  | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Back Up Generator Factor                       | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Gas Leak Detector Factor                       | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Lightning Protection System Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Gate Factor                 | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | Traven Rd        | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System Factor Home                   | 0.1         | -      |
      | Traven Rd        | Non Wind Premium                       | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.73        | +      |
      | 335 Archibald Ln | Base Premium                           | Base Rate                                      | 1,496       | +      |
      | 335 Archibald Ln | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 335 Archibald Ln | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 335 Archibald Ln | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.47        | +      |
      | 1515 3rd Ave     | Base Premium                           | Base Rate                                      | 1,524       | +      |
      | 1515 3rd Ave     | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 1515 3rd Ave     | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page

    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45504" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | Traven Rd        | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.25        | +        |
      | Traven Rd        | Base Premium                           | Base Rate                                      | 2,937       | +        |
      | Traven Rd        | Base Premium Wind                      | Wind/Hail Base Rate                            | 734         | +        |
      | Traven Rd        | Liability Premium                      | Liability Premium                              | 263         | +        |
      | Traven Rd        | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | Traven Rd        | Wind Premium                           | Wind/Hail Deductible Credit v.2                | 0.85        | *        |
      | Traven Rd        | Wind Premium                           | Home Fortification Credit                      | 0           | (1+:x:)* |
      | Traven Rd        | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor  | 0           | *        |
      | Traven Rd        | Wind Premium                           | Wind Protection Factor                         | 0.235       | (1+:x:)* |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Security Protection Factor  | 0.98        | +        |
      | Traven Rd        | Non Wind Premium                       | Full time Live In Caretaker Factor             | 0.98        | *        |
      | Traven Rd        | Non Wind Premium                       | 24 Hour Signal Continuity Factor               | 0.99        | *        |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor  | 0.99        | *        |
      | Traven Rd        | Non Wind Premium                       | Back Up Generator Factor                       | 0.98        | *        |
      | Traven Rd        | Non Wind Premium                       | Gas Leak Detector Factor                       | 0.99        | *        |
      | Traven Rd        | Non Wind Premium                       | Lightning Protection System Factor             | 0.98        | *        |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Gate Factor                 | 0.99        | *        |
      | Traven Rd        | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | Traven Rd        | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | Traven Rd        | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | Traven Rd        | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System Factor Home                   | 0.9         | *        |
      | Traven Rd        | Non Wind Premium                       | Low Temperature Monitoring Device Factor       | 0.98        | *        |
      | Traven Rd        | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.703       | +        |
      | 335 Archibald Ln | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 335 Archibald Ln | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 335 Archibald Ln | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 335 Archibald Ln | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 335 Archibald Ln | Wind Premium                           | !Wind/Hail Deductible Credit v.2               | 0.68        | *        |
      | 335 Archibald Ln | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 335 Archibald Ln | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 335 Archibald Ln | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 335 Archibald Ln | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 335 Archibald Ln | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 335 Archibald Ln | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 335 Archibald Ln | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 335 Archibald Ln | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.467       | +        |
      | 1515 3rd Ave     | Base Premium                           | Base Rate                                      | 1,460       | +        |
      | 1515 3rd Ave     | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 1515 3rd Ave     | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 1515 3rd Ave     | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 1515 3rd Ave     | Wind Premium                           | !Wind/Hail Deductible Credit v.2               | 0.68        | *        |
      | 1515 3rd Ave     | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 1515 3rd Ave     | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 1515 3rd Ave     | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 1515 3rd Ave     | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 1515 3rd Ave     | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 1515 3rd Ave     | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 1515 3rd Ave     | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

  @Homeowner @Condo @Coop @Tenants @DayPrior @PreProd
  Scenario: MN Base Rate and Factors - DayPrior

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "Traven Rd"
    * I set "City_Name_Txt" to "Eveleth"
    * I set "Zip_Code" to "55734"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "4000000"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "2%"
    * I set "Year_Built" to "1970"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Gable"
    * I set "Roof_Characteristics_Home_Fortification" to "Bronze"
    * I set "Square_Footage" to "50,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Year_Built" to "2005"
    * I set "Square_Footage" to "30,000"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2020"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1     | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible            |
      | 335 Archibald Ln | Dundas | MN    | 55019 | Condo/Co-op   | 2000000 |           | 25,000 | N/A - AOP Ded Applies |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1515 3rd Ave | Newport | MN    | 55055 | Tenants       | 4000000 |           | 1,000  | 0.25%      |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method |
      | Traven Rd        | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.16        | +      |
      | Traven Rd        | Base Premium                           | Base Rate                                      | 3,855       | +      |
      | Traven Rd        | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +      |
      | Traven Rd        | Liability Premium                      | Liability Premium                              | 175         | +      |
      | Traven Rd        | Liability Extension                    | Liability Extension Rate                       | 70          | +      |
      | Traven Rd        | Non Wind Premium                       | Wind/Hail Deductible Credit                    | 0.94        | *      |
      | Traven Rd        | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor  | 0           | *      |
      | Traven Rd        | Non Wind Premium                       | Wind Protection Factor                         | 0.235       | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Security Protection Factor  | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Full time Live In Caretaker Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | 24 Hour Signal Continuity Factor               | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor  | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Back Up Generator Factor                       | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Gas Leak Detector Factor                       | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Lightning Protection System Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Gate Factor                 | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | Traven Rd        | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System Factor Home                   | 0.1         | -      |
      | Traven Rd        | Non Wind Premium                       | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.73        | +      |
      | 335 Archibald Ln | Base Premium                           | Base Rate                                      | 1,496       | +      |
      | 335 Archibald Ln | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 335 Archibald Ln | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 335 Archibald Ln | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.47        | +      |
      | 1515 3rd Ave     | Base Premium                           | Base Rate                                      | 1,524       | +      |
      | 1515 3rd Ave     | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 1515 3rd Ave     | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    * I initiate new endorsement

    * I review changes
    And I rate an endorsement
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method |
      | Traven Rd        | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.16        | +      |
      | Traven Rd        | Base Premium                           | Base Rate                                      | 3,855       | +      |
      | Traven Rd        | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +      |
      | Traven Rd        | Liability Premium                      | Liability Premium                              | 175         | +      |
      | Traven Rd        | Liability Extension                    | Liability Extension Rate                       | 70          | +      |
      | Traven Rd        | Non Wind Premium                       | Wind/Hail Deductible Credit                    | 0.94        | *      |
      | Traven Rd        | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor  | 0           | *      |
      | Traven Rd        | Non Wind Premium                       | Wind Protection Factor                         | 0.235       | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Security Protection Factor  | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Full time Live In Caretaker Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | 24 Hour Signal Continuity Factor               | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor  | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Back Up Generator Factor                       | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | Gas Leak Detector Factor                       | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Lightning Protection System Factor             | 0.02        | +      |
      | Traven Rd        | Non Wind Premium                       | External Perimeter Gate Factor                 | 0.01        | +      |
      | Traven Rd        | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | Traven Rd        | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | Traven Rd        | Non Wind Premium                       | Sprinkler System Factor Home                   | 0.1         | -      |
      | Traven Rd        | Non Wind Premium                       | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | Traven Rd        | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.73        | +      |
      | 335 Archibald Ln | Base Premium                           | Base Rate                                      | 1,496       | +      |
      | 335 Archibald Ln | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 335 Archibald Ln | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 335 Archibald Ln | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.05        | -      |
      | 335 Archibald Ln | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 335 Archibald Ln | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 335 Archibald Ln | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 1.47        | +      |
      | 1515 3rd Ave     | Base Premium                           | Base Rate                                      | 1,524       | +      |
      | 1515 3rd Ave     | Base Premium                           | !Wind/Hail Base Rate                           | !1,655      | +      |
      | 1515 3rd Ave     | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Wind Protection Factor                        | 0.235       | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Locked  Elevator Factor                        | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Surveillance Camera Factor                     | 0.01        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | Burglar Alarm Factor                           | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Fire Alarm Factor                              | 0.02        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Guard Gated Community Factor                   | 0.03        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *      |
      | 1515 3rd Ave     | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *      |

  @Homeowner @Validation
  Scenario: MN Validation Rule 1

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "1%"
    * I set "Year_Built" to "2021"
    * I set "Roof_Shape" to "Flat"
    * I set "Roof_Covering" to "Wood Shake"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "2%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "1%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "2%"

    And I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Wood Shake"
    * I set "Roof_Shape" to "Flat"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 32420 59th Ave | Cannon Falls | MN    | 55009 | Homeowner     | 3000000 |           | 10,000 | 1%         |

    And I review changes
    * I rate an endorsement
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    * I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "2%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "Roof_Covering" to "Wood Shake"
    * I set "Roof_Shape" to "Flat"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 4872 State Highway 23 | Brook Park | MN    | 55007 | Homeowner     | 3000000 |           | 25,000 | 1%         |

    And I review changes
    * I click renewed premium
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI

  @Homeowner @Validation
  Scenario: MN Validation Rule 2

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "3000000"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "0.50%"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "1%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "0.50%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "1%"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "2999999"
    * I set risk address 1 AOP Ded to "2,500"
    * I set risk address 1 windstorm or hail deductible to "0.25%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Metal"
    * I set "Roof_Shape" to "Hip"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "1%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "3000000"
    * I set risk address 2 AOP Ded to "5,000"
    * I set risk address 2 windstorm or hail deductible to "0.50%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
    * I set "Zip_Code" to "55007"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I click renewed premium
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI

  @Homeowner @Validation
  Scenario: MN Validation Rule 3

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "3000001"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "0.25%"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "0.5%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "0.25%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "0.5%"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000000"
    * I set risk address 1 AOP Ded to "2,500"
    * I set risk address 1 windstorm or hail deductible to "0.25%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Other"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "0.50%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "3000001"
    * I set risk address 2 AOP Ded to "2,500"
    * I set risk address 2 windstorm or hail deductible to "0.25%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
    * I set "Zip_Code" to "55007"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I click renewed premium
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI

  @Homeowner @Validation
  Scenario: MN Validation Rule 4

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000001"
    * I set "AOP_Ded" to "10,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 AOP Ded to "25,000"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 AOP Ded to "10,000"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 AOP Ded to "25,000"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Other"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    * I navigate to Homeowner Policy Page
    * I set risk address 1 AOP Ded to "25,000"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "5000001"
    * I set risk address 2 AOP Ded to "10,000"
    * I set risk address 2 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
    * I set "Zip_Code" to "55007"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I click renewed premium
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI

  @Homeowner @UW @UWReferral
  Scenario: MN - UW Referrals

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "2%"
    * I set "Year_Built" to "1974"
    * I set "Roof_Shape" to "Flat"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Metal"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "not displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Slate"
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1971"
    * I set "Roof_Shape" to "Hip"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    And I approve uw referrals if visible
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 2 address line 1 to "4872 State Highway 23"
    * I set risk address 2 city to "Brook Park"
    * I set risk address 2 state to "MN"
    * I set risk address 2 zip to "55007"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "3000000"
    * I set risk address 2 AOP Ded to "25,000"
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Brook Park"
    * I set "Zip_Code" to "55007"
    * I set "Roof_Covering" to "Slate"
    * I set "Roof_Shape" to "Flat"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "not displayed" on the UI
    And I approve uw referrals if visible
    Then I process a renewal

  @Homeowner @UW @UWReferral
  Scenario: MN - UW Referral 2 and 3

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "2%"
    * I set "Year_Built" to "1974"
    * I set "Roof_Shape" to "Flat"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2002"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "years old, please review Roof Covering Full Reconstruction Cost Eligibility." is "displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Metal"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "years old, please review Roof Covering Full Reconstruction Cost Eligibility." is "not displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Slate"
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I verify if element with message "years old, please review Roof Covering Full Reconstruction Cost Eligibility." is "displayed" on the UI
    * I accept underwriting referrals
    Then I bind a quote

  @Homeowner @Export @NewBusiness @NB @END @Endorsement @PreProdNew
  Scenario: MN Base Rate and Factors - Homeowner - PreProd
  Location 1 on NB, Location 2 on END

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29384 Hidden Forest Blvd"
    * I set "City_Name_Txt" to "Chisago City"
    * I set "Zip_Code" to "55013"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    * I set "Year_Built" to "1960"
    * I set "Roof_Covering" to "Slate"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2000"
    * I set "Roof_Characteristics_Home_Fortification" to "Gold"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "HomeownerPP" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 263         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 105         | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "5%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Water_Leak_Detection" to "Yes - without alarm"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Asphalt Shingle"
    * I set "Square_Footage" to "2699"
    * I set "Roof_Characteristics_Home_Fortification" to "Bronze"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to ""
    * I set "Roof_Shape" to "Flat"
    * I set personal liability limit to "300,000"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "HomeownerPP" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 225         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 90          | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.87        | +        |
      | 32420 59th Ave           | Base Premium                           | Base Rate                                     | 2,092       | +        |
      | 32420 59th Ave           | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,579       | +        |
      | 32420 59th Ave           | Liability Premium                      | Liability Premium                             | 225         | +        |
      | 32420 59th Ave           | Liability Extension                    | Liability Extension Rate                      | 90          | +        |
      | 32420 59th Ave           | Wind Premium                           | Wind/Hail Deductible Credit v.2               | 0.7         | *        |
      | 32420 59th Ave           | Wind Premium                           | Home Fortification Credit                     | -0.066      | (1+:x:)* |
      | 32420 59th Ave           | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.82        | *        |
      | 32420 59th Ave           | Wind Premium                           | Wind Protection Factor                        | 0.265       | (1+:x:)* |
      | 32420 59th Ave           | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 32420 59th Ave           | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 32420 59th Ave           | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.97        | *        |
    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Condo @Coop @Export @NewBusiness @NB @END @Endorsement @PreProdNew
  Scenario: MN Base Rate and Factors - Condo -  PreProd
  Location 1 on NB, Location 2 on END

    Given I use "MN_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29455 Sunset Trl"
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Contents" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "CondoPP" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "4401 Lakeside Dr"
    * I set risk address 1 city to "Eveleth"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55734"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "7500000"
    * I set risk address 1 AOP Ded to "25,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Eveleth"
    * I set "Zip_Code" to "55734"
    * I set "Water_Leak_Detection" to "Yes - without alarm"
    * I set personal liability limit to "300,000"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "CondoPP" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.78        | +        |
      | 4401 Lakeside    | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 4401 Lakeside    | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 4401 Lakeside    | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 4401 Lakeside    | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 4401 Lakeside    | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 4401 Lakeside    | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 4401 Lakeside    | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.97        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 4401 Lakeside    | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 4401 Lakeside    | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

  @Tenants @Export @NewBusiness @NB @END @Endorsement @PreProdNew
  Scenario: MN Base Rate and Factors - Tenants -  PreProd
  Location 1 on NB, Location 2 on END

    Given I use "MN_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "40543 Ryans Bay Rd"
    * I set "City_Name_Txt" to "Zumbro Falls"
    * I set "Zip_Code" to "55991"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Contents" to "7500000"
    * I set "AOP_Ded" to "50,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "TenantsPP" in "STG/US45504" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "38978 N Shoreland Rd"
    * I set risk address 1 city to "Sturgeon Lake"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55783"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "10000000"
    * I set risk address 1 AOP Ded to "1,000,000"
    * I set risk address 1 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Sturgeon Lake"
    * I set "Zip_Code" to "55783"
    * I set personal liability limit to "300,000"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "TenantsPP" in "STG/US45504" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.47        | +        |
      | 38978 N Shoreland  | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 38978 N Shoreland  | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 38978 N Shoreland  | Liability Premium                      | Liability Premium                              | 225         | +        |
      | 38978 N Shoreland  | Liability Extension                    | Liability Extension Rate                       | 90          | +        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 38978 N Shoreland  | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 38978 N Shoreland  | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 38978 N Shoreland  | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 38978 N Shoreland  | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

  @Homeowner @Validation @PreProdNew
  Scenario: MN Validation Rule 1 - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "1%"
    * I set "Year_Built" to "2021"
    * I set "Roof_Shape" to "Flat"
    * I set "Roof_Covering" to "Wood Shake"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "2%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "1%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "2%"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "1%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Wood Shake"
    * I set "Roof_Shape" to "Flat"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to flat roofs. Please amend deductible." is "displayed" on the UI
    * I verify if element with message "A minimum Windstorm or Hail deductible of 2% applies to wood shake roofs. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    * I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "2%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Validation @PreProdNew
  Scenario: MN Validation Rule 2 - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "3000000"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "0.50%"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "1%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "0.50%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "1%"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "2999999"
    * I set risk address 1 AOP Ded to "2,500"
    * I set risk address 1 windstorm or hail deductible to "0.25%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Metal"
    * I set "Roof_Shape" to "Hip"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 1% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "1%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Validation @PreProdNew
  Scenario: MN Validation Rule 3 - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "3000001"
    * I set "AOP_Ded" to "2,500"
    * I set "Wind_Or_Hail_Ded" to "0.25%"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I set risk address 0 windstorm or hail deductible to "0.5%"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 windstorm or hail deductible to "0.25%"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 windstorm or hail deductible to "0.5%"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000000"
    * I set risk address 1 AOP Ded to "2,500"
    * I set risk address 1 windstorm or hail deductible to "0.25%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Other"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.5% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 1 windstorm or hail deductible to "0.50%"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Validation @PreProdNew
  Scenario: MN Validation Rule 4 - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000001"
    * I set "AOP_Ded" to "10,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    * I set "Year_Built" to "2021"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    * I navigate to Homeowner Policy Page
    * I set risk address 0 AOP Ded to "25,000"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 AOP Ded to "10,000"
    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    And I navigate to Homeowner Policy Page
    * I set risk address 0 AOP Ded to "25,000"
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "5000001"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "N/A - AOP Ded Applies"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1991"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Shape" to "Other"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I verify if element with message "The greater of $5,000 or a 0.25% windstorm or hail deductible is required. Please amend deductible." is "displayed" on the UI
    Then I click more changes button
    * I navigate to Homeowner Policy Page
    * I set risk address 1 AOP Ded to "25,000"
    And I review changes
    * I rate an endorsement
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @UW @UWReferral @PreProdNew
  Scenario: MN - UW Referrals - PreProd

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "2%"
    * I set "Year_Built" to "1974"
    * I set "Roof_Shape" to "Flat"
    * I set "Roof_Covering" to "Concrete/Clay Tile"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Metal"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "not displayed" on the UI
    Then I navigate to quotes detail page
    When I navigate to Location Details Page
    And I set the roof covering material to "Slate"
    Then I rate a quote
    And I navigate to underwriting referrals page
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I click add additional risk addresses
    Then I set risk address 1 address line 1 to "32420 59th Ave"
    * I set risk address 1 city to "Cannon Falls"
    * I set risk address 1 state to "MN"
    * I set risk address 1 zip to "55009"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "3000000"
    * I set risk address 1 AOP Ded to "10,000"
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Year_Built" to "1971"
    * I set "Roof_Shape" to "Hip"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify if element with message "You have indicated that the risk has a clay tile/slate roof that is older than 50 years and may be ineligible for coverage. Please confirm the Age of Roof and/or the year the roof was replaced." is "displayed" on the UI
    And I approve uw referrals if visible
    * I issue an endorsement

  @Homeowner @Export @Rewrite @PreProd
  Scenario: MN Base Rate and Factors - Homeowner - Rewrite

    Given I use "MN_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29384 Hidden Forest Blvd"
    * I set "City_Name_Txt" to "Chisago City"
    * I set "Zip_Code" to "55013"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Replacement_Cost" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    * I set "Year_Built" to "1960"
    * I set "Roof_Covering" to "Slate"
    * I set "Roof_Characteristics_Year_Roof_Replaced" to "2000"
    * I set "Roof_Characteristics_Home_Fortification" to "Gold"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 263         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 105         | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject            | coverage                               | factor                                        | factorValue | method   |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | AOP Deductible Factor 2.0                     | 0.46        | +        |
      | 29384 Hidden Forest Blvd | Base Premium                           | Base Rate                                     | 1,942       | +        |
      | 29384 Hidden Forest Blvd | Base Premium Wind                      | Wind/Hail Base Rate                           | 1,465       | +        |
      | 29384 Hidden Forest Blvd | Liability Premium                      | Liability Premium                             | 263         | +        |
      | 29384 Hidden Forest Blvd | Liability Extension                    | Liability Extension Rate                      | 105         | +        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Roof Covering Full Reconstruction Cost | Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29384 Hidden Forest Blvd | Wind Premium                           | Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Security Protection Factor | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | 24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Back Up Generator Factor                      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Gas Leak Detector Factor                      | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Lightning Protection System Factor            | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | External Perimeter Gate Factor                | 0.99        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Superior Risk Credits Maximum                 | 0.88        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Burglar Alarm Factor                          | 0.98        | +        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Fire Alarm Factor                             | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Guard Gated Community Factor                  | 0.97        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Sprinkler System Factor Home                  | 0.9         | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29384 Hidden Forest Blvd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor   | 0.95        | *        |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Condo @Coop @Export @Rewrite @PreProd
  Scenario: MN Base Rate and Factors - Condo -  Rewrite

    Given I use "MN_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "29455 Sunset Trl"
    * I set "City_Name_Txt" to "Cannon Falls"
    * I set "Zip_Code" to "55009"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "01/02/2025"
    * I set "Contents" to "5000000"
    * I set "AOP_Ded" to "500,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                               | factor                                         | factorValue | method   |
      | 29455 Sunset Trl | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.46        | +        |
      | 29455 Sunset Trl | Base Premium                           | Base Rate                                      | 1,425       | +        |
      | 29455 Sunset Trl | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 29455 Sunset Trl | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 29455 Sunset Trl | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 29455 Sunset Trl | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 29455 Sunset Trl | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 0.95        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 29455 Sunset Trl | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 29455 Sunset Trl | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Tenants @Export @NewBusiness @NB @Rewrite @PreProd
  Scenario: MN Base Rate and Factors - Tenants -  Rewrite

    Given I use "MN_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "40543 Ryans Bay Rd"
    * I set "City_Name_Txt" to "Zumbro Falls"
    * I set "Zip_Code" to "55991"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Contents" to "7500000"
    * I set "AOP_Ded" to "50,000"
    * I set "Wind_Or_Hail_Ded" to "N/A - AOP Ded Applies"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 01/01/2025 |
    Then I review changes
    * I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject      | coverage                               | factor                                         | factorValue | method   |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | AOP Deductible Factor 2.0                      | 0.66        | +        |
      | 40543 Ryans Bay Rd | Base Premium                           | Base Rate                                      | 1,451       | +        |
      | 40543 Ryans Bay Rd | Base Premium Wind                      | !Wind/Hail Base Rate                           | 1,465       | +        |
      | 40543 Ryans Bay Rd | Liability Premium                      | Liability Premium                              | 263         | +        |
      | 40543 Ryans Bay Rd | Liability Extension                    | Liability Extension Rate                       | 105         | +        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind/Hail Deductible Credit v.2 (AOP applies) | 0.68        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Home Fortification Credit                     | -0.093      | (1+:x:)* |
      | 40543 Ryans Bay Rd | Roof Covering Full Reconstruction Cost | !Roof Covering Full Reconstruction Cost Factor | 0.23        | *        |
      | 40543 Ryans Bay Rd | Wind Premium                           | !Wind Protection Factor                        | 0.256       | (1+:x:)* |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Security Protection Factor | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Full time Live In Caretaker Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !24 Hour Signal Continuity Factor              | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Back Up Generator Factor                      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Gas Leak Detector Factor                      | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Lightning Protection System Factor            | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !External Perimeter Gate Factor                | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | !Low Temperature Monitoring Device Factor      | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Superior Risk Credits Maximum                  | 0.88        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Burglar Alarm Factor                           | 0.98        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Fire Alarm Factor                              | 0.98        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Guard Gated Community Factor                   | 0.97        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Sprinkler System Factor Condo                  | 0.95        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Water Leak Detection/Shut-off Device Factor    | 1           | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | 24 Hour Door Man Factor                        | 0.97        | +        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Locked  Elevator Factor                        | 0.99        | *        |
      | 40543 Ryans Bay Rd | Non Wind Premium                       | Surveillance Camera Factor                     | 0.99        | *        |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @CompareBaseRates
  Scenario Outline: I compare Base Rates "<file1>" and new "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "STG/US45504/"

    Examples:
      | file1                       | file2                                  |
      | Base_Condo.xlsx             | Base_Rates_Condo_null.xlsx             |
      | Base_Homeowner.xlsx         | Base_Rates_Homeowner_null.xlsx         |
      | Base_RenewalConversion.xlsx | Base_Rates_RenewalConversion_null.xlsx |
      | Base_Tenants.xlsx           | Base_Rates_Tenants_null.xlsx           |