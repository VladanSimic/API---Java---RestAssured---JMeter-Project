@US45495 @US @GA @Homeowners @HO @BaseRate @PCRegression @2025 @January @Rating
Feature: US45495 - GA Home Base Rate Structural - Part I

  @Homeowner @NB @END @RN @NewBusiness @Endorsement @Renewal @1
  Scenario: GA Home Base Rate Structural Part I - Homeowner
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "1500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Year_Built" to "2008"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Homeowner     | 5000000 |           | 2,500  | 1%         |

    And I set "Year_Built" to "1996"
    * I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Previous_Loss_Details_Losses" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Homeowner     | 10000000 |           | 2,500  | 1%         |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                               | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                            | 3,260       | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 6.246       | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                            | 2,445       | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 13.866      | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Credit                   | 1.15        | +        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    When I review changes
    Then I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                               | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                            | 3,260       | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 6.246       | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                            | 2,445       | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 13.866      | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Credit                   | 1.15        | +        |

    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I minimize node tree except the first node
    * I expand node tree if needed

    * I set "City_Name_Txt" to "Saint Marys"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I navigate to Homeowner Policy Page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Atlanta"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I delete previous loss 1 on previous claim losses page
    * I click save changes button
    And I review changes
    * I click renewed premium
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                               | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 1.605       | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 1.607       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 1.605       | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                            | 3,260       | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 5.35        | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 6.775       | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 5.35        | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Credit                   | 1.04        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Credit                   | 1.04        | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                            | 2,445       | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 14.941      | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @Condo @Tenants @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: GA Home Base Rate Structural Part I - Home/Condo/Tenants
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Square_Footage" to "1000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    And I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |


    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    When I review changes
    Then I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I minimize node tree except the first node
    * I expand node tree if needed

    * I set "City_Name_Txt" to "Atlanta"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I click on the footer
    * I set "City_Name_Txt" to "Saint Marys"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I navigate to Homeowner Policy Page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Savannah"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I delete previous loss 1 on previous claim losses page
    * I click save changes button
    And I review changes
    * I click renewed premium
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.675       | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.932       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.675       | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.04        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.04        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @Condo @Tenants @NB @END @NewBusiness @Endorsement @DayBefore @DayBeforePD @PreProd
  Scenario: GA Home Base Rate Structural Part I - Day Before PD
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Square_Footage" to "1000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    And I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |


    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | Wind Factor                           | /           | *        |
      | 205 Salt Grass   | Base Premium                      | Tiering Factor - Capping v.2          | 0.05        | (1+:x:)* |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Base Premium                      | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Base Premium                      | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    When I review changes
    Then I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | Wind Factor                           | /           | *        |
      | 205 Salt Grass   | Base Premium                      | Tiering Factor - Capping v.2          | 0.05        | (1+:x:)* |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Base Premium                      | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Base Premium                      | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Condo @Tenants @NB @NewBusiness @RenewalConversion @RC
  Scenario: GA Home Base Rate Structural Part I - Renewal Conversion
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2024"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2023"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Square_Footage" to "1000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    And I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |


    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | Wind Factor                           | /           | *        |
      | 205 Salt Grass   | Base Premium                      | Tiering Factor - Capping v.2          | 0.05        | (1+:x:)* |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Base Premium                      | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Base Premium                      | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I minimize node tree except the first node
    * I expand node tree if needed

    * I set "City_Name_Txt" to "Atlanta"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Saint Marys"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I navigate to Homeowner Policy Page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Savannah"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I delete previous loss 1 on previous claim losses page
    * I click save changes button
    When I review changes
    Then I click renewed premium
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.7         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.675       | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.932       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.675       | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.9         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.04        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.04        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.04        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.1         | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 10.7        | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowner @Condo @Tenants @NB @NewBusiness @DayBefore @DayBeforeRC
  Scenario: GA Home Base Rate Structural Part I - Day Before Renewal Conversion
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/31/2024"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2024"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2023"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Square_Footage" to "1000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    And I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |


    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | Wind Factor                           | /           | *        |
      | 205 Salt Grass   | Base Premium                      | Tiering Factor - Capping v.2          | 0.05        | (1+:x:)* |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Base Premium                      | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Base Premium                      | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create a renewal
    And I navigate to policy image page
    * I navigate to Homeowner Policy Page
    And I minimize node tree except the first node
    * I expand node tree if needed

    * I set "City_Name_Txt" to "Atlanta"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Saint Marys"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I click add previous loss on previous claim losses page
    * I set the previous loss details 1 source to "PURE"
    * I set the previous loss details loss 1 date to "07/07/2024"
    * I set the previous loss details loss 1 type to "Water"
    * I set the previous loss details amount 1 paid to "10000"
    * I set the previous loss details claim 1 closed to "Yes"

    And I navigate to Homeowner Policy Page
    * I minimize node tree except the first node
    * I expand node tree if needed
    * I set "City_Name_Txt" to "Savannah"
    Then I navigate to Location Details Page
    * I navigate to Previous Claim Losses Page
    * I delete previous loss 1 on previous claim losses page
    * I click on the footer
    * I click save changes button
    When I review changes
    Then I click renewed premium
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.3         | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | Wind Factor                           | /           | *        |
      | 205 Salt Grass   | Base Premium                      | Tiering Factor - Capping v.2          | 0.25        | (1+:x:)* |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | !Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Base Premium                      | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Base Rate                            | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Base Premium                      | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowner @Condo @Tenants @NB @NewBusiness @Rewrite @PreProd
  Scenario: GA Home Base Rate Structural Part I - Rewrite
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Year_Built" to "2008"
    * I set "Square_Footage" to "1000"
    And I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    * I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    And I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 02/15/2025 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 02/16/2025 |
    And I review changes
    * I rate an endorsement
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Homeowner @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: GA Home Base Rate Structural Part I - Homeowner PreProd
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "1500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Year_Built" to "2008"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Homeowner     | 5000000 |           | 2,500  | 1%         |

    And I set "Year_Built" to "1996"
    * I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Previous_Loss_Details_Losses" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Homeowner     | 10000000 |           | 2,500  | 1%         |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                               | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                            | 3,260       | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 6.246       | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                            | 2,445       | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 13.866      | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Credit                   | 1.15        | +        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    When I review changes
    Then I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                               | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                            | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                            | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 1.503       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 1.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                   | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                   | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0.7         | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                            | 3,260       | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 6.246       | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 5           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Factor v2               | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Age of Home Credit                  | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2         | 0           | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                            | 2,445       | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated) | 13.866      | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated) | 10          | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                         | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | Age of Home Credit                   | 1.15        | +        |

    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Condo @Tenants @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: GA Home Base Rate Structural Part I - Home/Condo/Tenants PreProd
    Given I use "GA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Address_Line_1_Txt" to "205 Salt Grass Trl"
    * I set "City_Name_Txt" to "Saint Marys"
    * I set "Zip_Code" to "31558"
    * I set "Replacement_Cost" to "2500000"
    * I set "AOP_Ded" to "25,000"
    * I set "Wind_Or_Hail_Ded" to "5%"
    * I set "Year_Built" to "2025"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Wind_Mitigation_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Year_Plumbing_Updated" to ""
    * I set "Construction_Details_Year_Electric_Updated" to ""
    * I set "Construction_Details_Year_HVAC_Updated" to ""
    * I set "Year_Built_Renovated" to ""
    * I set "Construction_Details_Year_Roof_Replaced" to ""
    * I set "Construction_Details_Distance_To_Coast_Override" to "< 1000 ft"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Square_Footage" to "1000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city    | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    |
      | 2879 Salmon Ave | Atlanta | GA    | 30317 | Condo/Co-op   | 174000  |           | 2,500  | Not Available |

    And I set "Construction_Details_Distance_To_Coast_Override" to "> 5 miles, Wilmington"
    * I set "Previous_Loss_Details_Losses" to "001,002"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Source_2" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Date_2" to "07/07/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Fire"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Water"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10000"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "10000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 1019 Brittlewood Dr | Savannah | GA    | 31410 | Tenants       | 401000  |           | 2,500  | 1%         |


    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    When I review changes
    Then I rate an endorsement
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject    | coverage                          | factor                                | factorValue | method   |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Factor v2                | /           | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | !Age of Home Credit                   | /           | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Tiering Factor - Capping v.2          | 0.15        | (1+:x:)* |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Base Rate                             | 5,655       | +        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Base Rate                             | 2,461       | +        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Base Rate                             | 59          | +        |
      | 205 Salt Grass   | Base Premium - Hurricane Wind     | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | 2.683       | *        |
      | 205 Salt Grass   | Base Premium - Non Hurricane Wind | Increase Limit Factor (interpolated)  | 2.5         | *        |
      | 205 Salt Grass   | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Hurricane Wind Premium            | Age of Home Credit                    | 0.74        | +        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Factor v2                 | 0.74        | *        |
      | 205 Salt Grass   | Non Wind Premium                  | Age of Home Credit                    | 0.74        | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.45        | (1+:x:)* |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Base Rate                            | 0           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Base Rate                            | 1,041       | +        |
      | 2879 Salmon Ave  | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 2879 Salmon Ave  | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 2879 Salmon Ave  | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Hurricane Wind Premium            | !Age of Home Credit                   | 1.03        | +        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Factor v2                | 1.03        | *        |
      | 2879 Salmon Ave  | Non Wind Premium                  | !Age of Home Credit                   | 1.03        | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Tiering Factor - Capping v.2          | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Tiering Factor - Capping v.2         | 0.65        | (1+:x:)* |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Base Rate                            | 3,354       | +        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Base Rate                             | /           | +        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Base Rate                            | 59          | +        |
      | 1019 Brittlewood | Base Premium - Hurricane Wind     | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Wind           | Increase Limit Factor (interpolated)  | /           | *        |
      | 1019 Brittlewood | Base Premium - Non Hurricane Wind | !Increase Limit Factor (interpolated) | /           | *        |
      | 1019 Brittlewood | Wind Premium                      | !Wind Factor                          | /           | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Hurricane Wind Premium            | !Age of Home Credit                   | 1.15        | +        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Factor v2                | 1.15        | *        |
      | 1019 Brittlewood | Non Wind Premium                  | !Age of Home Credit                   | 1.15        | +        |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
