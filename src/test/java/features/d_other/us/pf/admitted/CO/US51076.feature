@PrimaryFlood @Admitted @US51076
Feature: [Continued] FS - Admitted - Roll up Flood Coverage - CO

  @TC102125
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates. (NB/END)

    Given I use "CO_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    * I set "Replacement_Cost" to "1,500,000"
    * I set "Contents" to "700,000"

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "280,000"
    * I set "Primary_Flood_Coverage_Contents" to "120,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "45,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "23,000"
    * I set "Primary_Flood_Deductible" to "10,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,"

    * I set "Elevated_Risk_Credit" to "0.8"
    * I set "High_PML_Load" to "1.2"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                     | coverage                          | factor                                          | value   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.019   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.331   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 15,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 292.471 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 292.471 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 280,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 45,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 9.401   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 301.872 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.018   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.311   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 7,000   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 128.563 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Limit                            | 120,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Basement Limit                   | 23,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Total Flood Contents Basement Premium           | 4.928   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 133.491 |

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC         | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Homeowner     | 800,000;400,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Denver CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "300,000"
    * I set "Primary_Flood_Coverage_Contents" to "130,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "65,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "31,000"
    * I set "Primary_Flood_Deductible" to "5,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,Loss_004,"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1.1"

    * I fill out HO quote basic location coverage details page for "Denver" "CO" 1
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I rate an endorsement

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                     | coverage                          | factor                                          | value   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.019   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.331   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 15,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 292.471 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.039   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.78    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.527   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 8,000   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 312.799 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 292.471 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 280,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 45,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 9.401   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 312.799 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Limit                            | 300,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 65,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 13.555  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 326.354 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 301.872 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.036   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Deductible                                | 0.78    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.481   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | High PML Load                                   | 1.1     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Coverage C limit/100                            | 4,000   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.018   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.311   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 7,000   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 142.481 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Limit                            | 130,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Basement Limit                   | 31,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Total Flood Contents Basement Premium           | 6.795   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 128.563 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Limit                            | 120,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Basement Limit                   | 23,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Total Flood Contents Basement Premium           | 4.928   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Contents Premium      | Total Flood Contents Premium                    | 149.277 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 133.491 |

  @TC102126
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates. (NB/RNWL)

    Given I use "CO_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/07/2025"

    * I set "Replacement_Cost" to "2,300,000"
    * I set "Contents" to "850,000"

    * I set "Residence_Have_Basement" to "No"
    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "No"

    * I set "Dwelling_Other_Structures_Limit" to "345,000"
    * I set "Primary_Flood_Coverage_Contents" to "275,000"
    * I set "Primary_Flood_Deductible" to "50,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "250,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,Loss_004,Loss_005,"

    * I set "Elevated_Risk_Credit" to "1"
    * I set "High_PML_Load" to "1.1"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                     | coverage                          | factor                                          | value   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.012   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.48    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.283   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 23,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 275.014 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 275.014 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.02    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 0.48    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.479   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1.1     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 8,500   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 172.009 |

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC     | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Homeowner     | 3,000,000;0 |           | 10,000 | 5%         | 1 |
    * I navigate to "Denver CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "400,000"
    * I set "Primary_Flood_Coverage_Contents" to "0"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "200,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "0"
    * I set "Primary_Flood_Deductible" to "25,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "250,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1.2"

    * I fill out HO quote basic location coverage details page for "Denver" "CO" 1
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I click renewed premium

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                     | coverage                          | factor                                          | value   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.011   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.48    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.27    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 24,610  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 280.17  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.014   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.52    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.26    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 30,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 420.141 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 420.141 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Limit                            | 400,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 200,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 42.014  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 462.155 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 280.17  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Contents Rate                             | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Deductible                                | 0.52    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | High PML Load                                   | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Coverage C limit/100                            | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.019   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 0.48    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.458   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1.1     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 9,095   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Limit                            | 100,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Basement Limit                   | 100,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Total Flood Contents Basement Premium           | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Contents Premium      | Total Flood Contents Premium                    | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 176.05  |

  @TC102127
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates on the END for existing and newly added location on the Flood Node page

    Given I use "CO_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I navigate to Homeowner Policy Page
    * I set replacement cost "1" to "2,700,000"
    * I set contents "1" to "1,350,000"
    * I click save changes button

    * I navigate to "Wheat Ridge CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "310,000"
    * I set "Primary_Flood_Coverage_Contents" to "220,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "85,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "72,000"
    * I set "Primary_Flood_Deductible" to "2,500"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,Loss_004,"

    * I set "Elevated_Risk_Credit" to "1"
    * I set "High_PML_Load" to "1.2"

    * I fill out HO quote basic location coverage details page for "Wheat Ridge" "CO" 1
#    * I navigate to "Flood Coverage" page
#    * I fill out HO Flood Coverage page for additional location
    * I click save changes button

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC         | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Homeowner     | 900,000;250,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Denver CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"
    * I set "Dwelling_Other_Structures_Limit" to "255,000"
    * I set "Primary_Flood_Coverage_Contents" to "111,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "75,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "60,000"
    * I set "Primary_Flood_Deductible" to "1,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1.2"

    * I fill out HO quote basic location coverage details page for "Denver" "CO" 1
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location
    * I click save changes button

    * I review changes
    * I rate an endorsement

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                          | value   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 27,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.055   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Deductible                                | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.439   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 9,000   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 491.55  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 491.55  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Limit                            | 255,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 75,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 28.915  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 0       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 520.465 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 13,500  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.073   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Deductible                                | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.588   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | High PML Load                                   | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Coverage C limit/100                            | 2,500   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 182.961 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Limit                            | 111,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Basement Limit                   | 60,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Total Flood Contents Basement Premium           | 19.78   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 0       |

  @TC102128
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates on the RNW for existing and newly added location on the Flood Node page

    Given I use "CO_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/06/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC             | lossOfUse | aopDed | deductible | i |
      | 4249 Shobe Lane | Denver | CO    | 80216 | Homeowner     | 4,000,000;1,850,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Denver CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "515,000"
    * I set "Primary_Flood_Coverage_Contents" to "385,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "250,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "95,000"
    * I set "Primary_Flood_Deductible" to "25,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,"

    * I set "Elevated_Risk_Credit" to "0.8"
    * I set "High_PML_Load" to "1"

    * I fill out HO quote basic location coverage details page for "Denver" "CO" 1
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I navigate to Homeowner Policy Page
    * I set replacement cost "1" to "1,391,000"
    * I set contents "1" to "695,500"
    * I click save changes button

    * I navigate to "Wheat Ridge CO" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "425,000"
    * I set "Primary_Flood_Coverage_Contents" to "330,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "215,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "15,000"
    * I set "Primary_Flood_Deductible" to "10,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"

    * I set "Elevated_Risk_Credit" to "1"
    * I set "High_PML_Load" to "1"

    * I fill out HO quote basic location coverage details page for "Wheat Ridge" "CO" 1
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I click renewed premium

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                     | coverage                          | factor                                          | value   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.01    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.52    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.253   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | High PML Load                                   | 1       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 40,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 404.432 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.028   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.461   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | High PML Load                                   | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 13,910  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 394.338 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 394.338 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 425,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 215,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 39.898  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 404.432 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Limit                            | 515,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 250,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 39.265  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 443.697 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 434.236 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.014   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Flood Deductible                                | 0.52    |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.356   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | High PML Load                                   | 1       |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Excluding Basement | Coverage C limit/100                            | 18,500  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Contents Rate                             | 0.038   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Flood Deductible                                | 0.64    |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Contents Insurance to Value Factor              | 0.614   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Basement Factor                                 | 1.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Elevated Risk Credit                            | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | High PML Load                                   | 1       |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Excluding Basement | Coverage C limit/100                            | 6,955   |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 262.327 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Limit                            | 330,000 |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Flood Contents Basement Limit                   | 15,000  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Flood Contents Basement           | Total Flood Contents Basement Premium           | 2.385   |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Excluding Basement Premium       | 263.363 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Limit                            | 385,000 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Basement Factor -1                              | 0.2     |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Flood Contents Basement Limit                   | 95,000  |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Flood Contents Basement           | Total Flood Contents Basement Premium           | 12.997  |
      | 3291 Garland St, Wheat Ridge, Colorado  80033 | Total Flood Contents Premium      | Total Flood Contents Premium                    | 264.712 |
      | 4249 Shobe Lane, Denver, Colorado  80216      | Total Flood Contents Premium      | Total Flood Contents Premium                    | 276.36  |

  @TC102129
  Scenario: Verify that the new Flood factors are not applied in the rating algorithm before PD Filling dates, all transactions (NB/END/RNWL)
    Given I use "CO_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to premium details page

    Then I verify coverage "Total Primary Flood Premium" factor "Total Primary Flood Premium" is not present

  @TC102130
  Scenario Outline: Verify that the new Flood factors are not applied in the rating algorithm after PD Filling dates for not in scope states, all transactions (NB/END/RNWL)
    Given I use "<tc_id>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to premium details page

    Then I verify coverage "Total Primary Flood Premium" factor "Total Primary Flood Premium" is not present

    Examples:
      | tc_id  |
      | AK_001 |
      | AZ_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | MN_001 |
      | MT_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | NM_001 |
      | NV_001 |
      | OH_001 |
      | OK_001 |
      | OR_001 |
      | PA_001 |
      | RI_001 |
      | SD_001 |
      | TN_001 |
      | UT_001 |
      | VT_001 |
      | WA_001 |
      | WI_001 |
      | WY_001 |
      | HI_001 |
      | MD_001 |
      | ME_001 |
      | SC_001 |
      | MI_001 |
      | ID_001 |
      | DE_001 |
      | WV_001 |
