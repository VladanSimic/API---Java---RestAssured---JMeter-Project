@PrimaryFlood @Admitted @US49696
Feature: FS -Admitted - Update Rating to include Flood - Algorithm - All States - Dwelling & IL Roll up

  @TC98971
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
      | location                                      | coverage                          | factor                                          | value    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.018    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.78     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.24     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 25,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 445.349  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 445.349  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 300,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 150,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 44.535   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 489.884  |

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
      | location                                      | coverage                          | factor                                          | value    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.019    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.64     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.357    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 12,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 231.451  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.018    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.78     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.24     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 25,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 445.349  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 445.349  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 300,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 150,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 44.535   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 231.451  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 250,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 150,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 27.774   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 489.884  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 259.225  |

  @TC98972
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
      | location                                      | coverage                          | factor                                          | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.049   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.635   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 10,000  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 487.631 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 487.631 |


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
      | location                                      | coverage                          | factor                                          | value   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.047   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.608   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 10,700  |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 499.546 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.025   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.52    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.501   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 13,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 321.69  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 321.69  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 450,000 |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 80,000  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 11.438  |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 333.128 |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 499.546 |

  @TC98973
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
      | location                                      | coverage                          | factor                                          | value     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.059     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 1.2       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.468     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 1         |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.1       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 8,000     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 474.751   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.038     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Deductible                                | 1         |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.489     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1         |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.8       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | High PML Load                                   | 1.2       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 9,000     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 337.671   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 474.751   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 250,000   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 70,000    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 26.586    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 501.337   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 337.671   |

  @TC98974
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
      | location                                      | coverage                          | factor                                          | value     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.027     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.78      |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.398     |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1.2       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | High PML Load                                   | 1         |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 18,000    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 482.474   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Dwelling Rate                             | 0.01      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Base Rate                                 | 0.08      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Flood Deductible                                | 0.64      |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Dwelling Insurance to Value Factor              | 0.225     |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Basement Factor                                 | 1         |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Elevated Risk Credit                            | 0.9       |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | High PML Load                                   | 1         |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Coverage A limit/100                            | 30,000    |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Flood Dwelling Excluding Basement | Total Flood Dwelling Excluding Basement Premium | 311.152   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Excluding Basement Premium       | 482.474   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Limit                            | 440,000   |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Basement Factor -1                              | 0.2       |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Flood Dwelling Basement Limit                   | 70,000    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Flood Dwelling Basement           | Total Flood Dwelling Basement Premium           | 15.351    |
      | 2324 N LINCOLN PARK, Chicago, Illinois  60614 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 497.825   |
      | 1820 N Delany Rd 510, Gurnee, Illinois  60031 | Total Flood Dwelling Premium      | Total Flood Dwelling Premium                    | 311.152   |

  @TC98975
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

  @TC98976
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