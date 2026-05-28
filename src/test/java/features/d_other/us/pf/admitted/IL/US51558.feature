@PrimaryFlood @Admitted @US51558
Feature: FS -Admitted - Update Rating to include Flood - Algorithm - All States - Contents

  @TC99056
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates. (NB/END)

    Given I use "IL_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"

    * I set "Replacement_Cost" to "2,500,000"
    * I set "Contents" to "700,000"

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "300,000"
    * I set "Primary_Flood_Coverage_Contents" to "350,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "150,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "20,000"
    * I set "Primary_Flood_Deductible" to "5,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1.1"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                    | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.047   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                          | 0.78    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.635   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.9     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                             | 1.1     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100                      | 7,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 329.48  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Limit                      | 350,000 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Basement Limit             | 20,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 3.765   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium              | 333.246 |

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC           | lossOfUse | aopDed | deductible | i |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 1,200,000;600,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Chicago IL" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "250,000"
    * I set "Primary_Flood_Coverage_Contents" to "200,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "150,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "30,000"
    * I set "Primary_Flood_Deductible" to "10,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"

    * I set "Elevated_Risk_Credit" to "0.8"
    * I set "High_PML_Load" to "1.1"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I rate an endorsement

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                    | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.047   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                          | 0.78    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.635   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.9     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                             | 1.1     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100                      | 7,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.026   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Deductible                          | 0.64    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.489   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.8     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | High PML Load                             | 1.1     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Coverage C limit/100                      | 6,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 158.481 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Limit                      | 200,000 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Basement Limit             | 30,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 4.754   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 329.48  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Limit                      | 350,000 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Basement Limit             | 20,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 3.765   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium              | 333.246 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Contents Premium      | Total Flood Contents Premium              | 163.235 |

  @TC99057
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates. (NB/RNW)

    Given I use "IL_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data

    * I set "Effective_Date" to "09/07/2025"

    * I set "Replacement_Cost" to "1,000,000"
    * I set "Contents" to "300,000"

    * I set "Residence_Have_Basement" to "No"
    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "No"

    * I set "Dwelling_Other_Structures_Limit" to "500,000"
    * I set "Primary_Flood_Coverage_Contents" to "170,000"
    * I set "Primary_Flood_Deductible" to "2,500"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"

    * I set "Elevated_Risk_Credit" to "0.8"
    * I set "High_PML_Load" to "1.2"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                             | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                | 0.053   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                    | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                   | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor | 0.688   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                    | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit               | 0.8     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                      | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100               | 3,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium       | 158.557 |

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC           | lossOfUse | aopDed | deductible | i |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 1,300,000;500,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Chicago IL" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "450,000"
    * I set "Primary_Flood_Coverage_Contents" to "220,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "80,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "60,000"
    * I set "Primary_Flood_Deductible" to "25,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "110,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,Loss_004,Loss_005,"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1.1"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I click renewed premium

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                    | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.051   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                          | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.659   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                           | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.8     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                             | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100                      | 3,210   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.029   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Deductible                          | 0.52    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.585   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.9     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | High PML Load                             | 1.1     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Coverage C limit/100                      | 5,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 144.51  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Limit                      | 220,000 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Basement Limit             | 60,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 7.882   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium              | 162.426 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Contents Premium      | Total Flood Contents Premium              | 152.392 |

  @TC99058
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates on the END for existing and newly added location on the Flood Node page

    Given I use "IL_501" smoke test data from "QuoteCreatorHO" sheet
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
    * I set replacement cost "1" to "800,000"
    * I set contents "1" to "200,000"
    * I click save changes button

    * I navigate to "Gurnee IL" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "250,000"
    * I set "Primary_Flood_Coverage_Contents" to "130,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "70,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "15,000"
    * I set "Primary_Flood_Deductible" to "1,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"

    * I set "Elevated_Risk_Credit" to "1"
    * I set "High_PML_Load" to "1.1"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location
    * I click save changes button

    * I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city    | state | zip   | residenceType | covAorC         | lossOfUse | aopDed | deductible | i |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 900,000;250,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Chicago IL" 1 page

    * I set "Residence_Have_Basement" to "No"
    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "No"

    * I set "Dwelling_Other_Structures_Limit" to "300,000"
    * I set "Primary_Flood_Coverage_Contents" to "100,000"
    * I set "Primary_Flood_Deductible" to "2,500"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "50,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,"

    * I set "Elevated_Risk_Credit" to "0.8"
    * I set "High_PML_Load" to "1.2"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location
    * I click save changes button

    * I review changes
    * I rate an endorsement

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                    | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.095   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                          | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.752   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                             | 1.1     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100                      | 2,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.042   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Deductible                          | 1       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.55    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Basement Factor                           | 1       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.8     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | High PML Load                             | 1.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Coverage C limit/100                      | 2,500   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 190.58  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Limit                      | 130,000 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Flood Contents Basement Limit             | 15,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 4.398   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Contents Premium      | Total Flood Contents Premium              | 105.59  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium              | 194.978 |

  @TC99061
  Scenario: Verify we're applying correct factors for the selection made by the user for the selected Flood limits after PD Filling dates on the RNW for existing and newly added location on the Flood Node page

    Given I use "IL_501" smoke test data from "QuoteCreatorHO" sheet
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
      | addressLine1        | city    | state | zip   | residenceType | covAorC           | lossOfUse | aopDed | deductible | i |
      | 2324 N LINCOLN PARK | Chicago | IL    | 60614 | Homeowner     | 1,800,000;600,000 |           | 10,000 | 5%         | 1 |
    * I navigate to "Chicago IL" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "440,000"
    * I set "Primary_Flood_Coverage_Contents" to "230,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "70,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "35,000"
    * I set "Primary_Flood_Deductible" to "5,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "150,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I navigate to Homeowner Policy Page
    * I set replacement cost "1" to "3,000,000"
    * I set contents "1" to "500,000"
    * I click save changes button

    * I navigate to "Gurnee IL" 1 page

    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"

    * I set "Is_Basement_Or_Any_Area_Dwelling_Below_Ground_Level" to "Yes"

    * I set "Dwelling_Other_Structures_Limit" to "330,000"
    * I set "Primary_Flood_Coverage_Contents" to "350,000"
    * I set "Primary_Flood_Coverage_Basement_Dwelling" to "150,000"
    * I set "Primary_Flood_Coverage_Basement_Contents" to "90,000"
    * I set "Primary_Flood_Deductible" to "10,000"
    * I set "Primary_Flood_Coverage_Loss_Of_Use" to "250,000"

    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003,Loss_004,"

    * I set "Elevated_Risk_Credit" to "0.9"
    * I set "High_PML_Load" to "1"

    * I fill out HO quote basic location coverage details page
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page for additional location

    * I review changes
    * I click renewed premium

    When I navigate to premium details page

    Then I verify coverage factor and factor value for location
      | location                                      | coverage                          | factor                                    | value   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.036   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Flood Deductible                          | 0.78    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.535   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Basement Factor                           | 1.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.9     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | High PML Load                             | 1       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Excluding Basement | Coverage C limit/100                      | 6,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Contents Rate                       | 0.036   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Base Rate                           | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Flood Deductible                          | 0.64    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Contents Insurance to Value Factor        | 0.789   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Basement Factor                           | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Elevated Risk Credit                      | 0.9     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | High PML Load                             | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Contents Excluding Basement | Coverage C limit/100                      | 5,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Excluding Basement Premium | 216.331 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Limit                      | 230,000 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Basement Factor -1                        | 0.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Flood Contents Basement Limit             | 35,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Contents Basement           | Total Flood Contents Basement Premium     | 6.584   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Contents Premium      | Total Flood Contents Premium              | 222.915 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Contents Premium      | Total Flood Contents Premium              | 181.804 |

  @TC99062
  Scenario: Verify that the new Flood factors are not applied in the rating algorithm before PD Filling dates, all transactions (NB/END/RNWL)
    Given I use "IL_501" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/06/2025"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to premium details page

    Then I verify coverage "Total Primary Flood Premium" factor "Total Primary Flood Premium" is not present

  @TC99063
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
