@US45508 @US @NJ @Homeowners @HO @BaseRate @PCRegression @2025 @January @Rating
Feature: US45508 - NJ Home Base Rate + Factors + Structural

  @Homeowner @Export @NewBusiness @Endorsement @Renewal @NB @END @RN @1
  Scenario: NJ Base Rate and Factors - Homeowner - NB/END/RN
  Zone 21, 22 and 31 on New Business
  Zone 32, 71
  Renewal 72

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Replacement_Cost" to "1000000"
    * I set "AOP_Ded" to "500"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Homeowner     | 4000000 |           | 5,000  |            |

    And I set "Water_Leak_Detection" to "None"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Homeowner     | 10000000 |           | 10,000 |            |

    * I rate a quote
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45508" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                        | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                         | 1.193       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                         | 0.94        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 310 Franklin  | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.776       | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 125 Osborne   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement

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

    When I set "Water_Leak_Detection" to "Yes - with alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 32 Park Dr   | Livingston | NJ    | 07039 | Homeowner     | 5000000 |           | 25,000 |            |

    And I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city          | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 2415 Park Pl | Scotch Plains | NJ    | 07076 | Homeowner     | 10000000 |           | 50,000 |            |

    And I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45508" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                        | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                         | 1.193       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                         | 0.94        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 310 Franklin  | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.776       | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Back Up Generator Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Lightning Protection System Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                             | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0           | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                         | 0.554       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,409       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                         | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2415 Park     | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2415 Park     | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    Then I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I navigate to Homeowner Policy Page
    * I set risk address 1 AOP Ded to "500,000"
    And I navigate to Location Details Page
    Then I set Central Reporting Burglar Alarm to "No"
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

    * I set "City_Name_Txt" to "Newark"
    When I navigate to Location Details Page
    Then I set Central Reporting Burglar Alarm to "Yes"
    * I set Central Reporting Fire Alarm to "Yes"
    * I set Low Temperature monitoring system to "Yes"
    * I set Permanently Installed Generator to "Yes"
    * I set Gas Leak Detector to "Yes"
    * I set 24 Hour Signal Continuity to "Yes"
    * I set Sprinkler System with Waterflow to "Yes"
    * I set Guard Gated Community to "Yes"
    * I set Residential Sprinkler System to "Yes"
    * I set Water Leak Detection System with Master Shut Off to "Yes - with alarm"
    * I set Lightning Protection System to "Yes"
    * I set External Perimeter Gate to "Yes"
    * I set Full Time Live In Caretaker to "Yes"
    * I set Perimeter Security Protection to "Both"

    And I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""
    * I set "Is_There_Mortgage" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city             | state | zip   | residenceType | covAorC | lossOfUse | aopDed    | deductible |
      | 2 Castle Dr  | Berkeley Heights | NJ    | 07922 | Homeowner     | 4000000 |           | 1,000,000 |            |

    And I review changes
    Then I click renewed premium
    And I navigate to premium details page
    * I save coverage factor and value for "Homeowner" in "STG/US45508" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                        | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                         | 1.193       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                         | 0.324       | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 310 Franklin  | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.776       | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 125 Osborne   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                         | 0.557       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,409       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                         | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Back Up Generator Factor                      | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Lightning Protection System Factor            | 0           | +      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                          | 0           | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                             | 0           | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                  | 0           | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0           | -      |
      | 2415 Park     | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0           | -      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0           | -      |
      | 2 Castle Dr   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,921       | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.307       | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowner @NewBusiness @Condo @Coop @NB @PreProd
  Scenario: NJ Base Rate and Factors - Homeowner/Condo - Companion Credits + new AOP values Quote level
  Companion Credits and new AOP + $100M value

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Replacement_Cost" to "100000001"
    * I set "AOP_Ded" to "1,000,000"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC   | lossOfUse | aopDed    | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 100000001 |           | 1,000,000 |            |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                              | factor                                  | factorValue | method |
      | 2446 3rd St   | Non Hurricane Premium                 | Deductible Factor v.2                   | 0.389       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium                 | Deductible Factor v.2                   | 0.389       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |
    And I return to premium summary page
    Then I navigate to quotes detail page
    And I navigate to Homeowner Policy Page
    Then I set risk address 0 AOP Ded to "500,000"
    * I set risk address 1 AOP Ded to "500,000"
    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                              | factor                                  | factorValue | method |
      | 2446 3rd St   | Non Hurricane Premium                 | Deductible Factor v.2                   | 0.397       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium                 | Deductible Factor v.2                   | 0.397       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |

  @Homeowner @NewBusiness @Condo @Coop @NB @RC @RenewalConversion
  Scenario: NJ Base Rate and Factors - Homeowner/Condo - Companion Credits Renewal Conversion

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "04/01/2024"
    * I set "Replacement_Cost" to "10000000"
    * I set "AOP_Ded" to "25,000"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 4000000 |           | 1,000  |            |

    And I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                              | factor                                  | factorValue | method |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.1         | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.05        | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.1         | +      |
    And I return to premium summary page
    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    When I override subjectivities
    Then I navigate to transactions or endorsements

    And I create a renewal
    Then I navigate to policy image page
    * I navigate to Homeowner Policy Page
    * I set policy information does the member have pure jewelry to "Yes"
    * I set policy information does the member have pure personal excess to "Yes"
    * I set policy information does the member have pure fleet auto insurance policy to "Yes"
    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                              | factor                                  | factorValue | method |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 2446 3rd St   | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Jewelry & Art Credit Factor             | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Personal Excess Liability Credit Factor | 0.025       | +      |
      | 310 Franklin  | Non Hurricane/Hurricane Final Premium | Auto Policy Companion Credit Factor     | 0.05        | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    Then I process a renewal

  @Condo @Coop @Tenants @Export @NewBusiness @Endorsement @Renewal @NB @END @RN
  Scenario: NJ Base Rate and Factors - C/C/T Tenants - NB/END/RN
  Zone 21, 22 and 31 on New Business
  Zone 32, 71
  Renewal 72

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Contents" to "3000000"
    * I set "AOP_Ded" to "500"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 2000000 |           | 5,000  |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Tenants       | 3000000 |           | 10,000 |            |

    And I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "CondoTenants" in "STG/US45508" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 1.196       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.661       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set 24 Hour Door Man to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Full Time Live In Caretaker to "No"

    When I set "Water_Leak_Detection" to "Yes - with alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city       | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 32 Park Dr   | Livingston | NJ    | 07039 | Condo/Co-op   | 4000000 |           | 25,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city          | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 2415 Park Pl | Scotch Plains | NJ    | 07076 | Tenants       | 10000000 |           | 50,000 |            |

    And I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    And I save coverage factor and value for "CondoTenants" in "STG/US45508" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 1.196       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.661       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                          | 0.518       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                          | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2415 Park     | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    Then I issue an endorsement

    When I create a renewal
    Then I navigate to policy image page
    * I navigate to Homeowner Policy Page
    * I set risk address 1 AOP Ded to "1,000,000"
    * I set "City_Name_Txt" to "Ridgewood"
    And I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set 24 Hour Door Man to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Full Time Live In Caretaker to "No"
    * I set Water Leak Detection System with Master Shut Off to "None"

    When I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city             | state | zip   | residenceType | covAorC  | lossOfUse | aopDed    | deductible |
      | 2 Castle Dr  | Berkeley Heights | NJ    | 07922 | Condo/Co-op   | 10000000 |           | 1,000,000 |            |

    And I review changes
    Then I click renewed premium
    And I navigate to premium details page
    * I save coverage factor and value for "CondoTenants" in "STG/US45508" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 1.196       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.27        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0           | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0           | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0           | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0           | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0           | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0           | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0           | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.669       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                          | 0.528       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                          | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2415 Park     | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
      | 2 Castle Dr   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.389       | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2 Castle Dr   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2 Castle Dr   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowner @Export @NewBusiness @Renewal @NB @RN @RenewalConversion @RC
  Scenario: NJ Base Rate and Factors - Home/Condo/Tenants - Renewal Conversion
    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "04/01/2024"
    * I set "Replacement_Cost" to "1000000"
    * I set "AOP_Ded" to "5,000"
    * I set "Hurr_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 4000000 |           | 10,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Tenants       | 10000000 |           | 25,000 |            |

    And I rate a quote
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45508" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 3,997       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.809       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor  | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor               | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor  | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                 | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                   | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.68        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.583       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page
    And I navigate to Homeowner Policy Page
    Then I click risk address 0 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I click on the footer
    Then I click risk address 1 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I click on the footer
    Then I click risk address 2 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
      | 500,000    |
      | 1,000,000  |
    * I click on the footer
    And I review changes
    * I click renewed premium
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45508" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor  | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor               | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor  | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                 | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                   | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor       | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.705       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.597       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    And I click exit button
    * I review and accept referrals on renewal if any
    Then I process a renewal

  @Homeowner @NewBusiness @NB @END @Endorsement @PreProd
  Scenario: NJ Base Rate and Factors - Home/Condo/Tenants - Day Prior PD Filling + Endorsement
  Check if $500K and $1M AOP are not displayed along with proper factors + base rates

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/14/2025"
    * I set "Endorsement_Effective_Date_END" to "02/15/2025"
    * I set "Replacement_Cost" to "1000000"
    * I set "AOP_Ded" to "5,000"
    * I set "Hurr_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 4000000 |           | 10,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Tenants       | 10000000 |           | 25,000 |            |

    And I navigate to Homeowner Policy Page
    Then I click risk address 0 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    Then I click risk address 1 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    Then I click risk address 2 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    * I rate a quote
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 3,997       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.809       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor  | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor               | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor  | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                 | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                   | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.68        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.583       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    And I navigate to Homeowner Policy Page
    Then I click risk address 0 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    Then I click risk address 1 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    Then I click risk address 2 AOP Ded cell
    * I verify dropdown values
      | values     |
      | - Select - |
      | 500        |
      | 1,000      |
      | 2,500      |
      | 5,000      |
      | 10,000     |
      | 25,000     |
      | 50,000     |
      | 100,000    |
      | 250,000    |
    * I click on the footer
    Then I review changes
    * I rate an endorsement
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 3,997       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.809       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor  | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor               | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor  | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                 | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                   | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.68        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,373       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.583       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    * I click exit button
    And I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Homeowner @NewBusiness @NB @Rewrite @PreProd
  Scenario: NJ Base Rate and Factors - Home/Condo/Tenants - Rewrite
    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/14/2025"
    * I set "Replacement_Cost" to "1000000"
    * I set "AOP_Ded" to "5,000"
    * I set "Hurr_Ded" to "Not Available"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Condo/Co-op   | 4000000 |           | 10,000 |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Tenants       | 10000000 |           | 25,000 |            |

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 02/14/2025 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 02/15/2025 |
    Then I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor  | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor               | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor  | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                       | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor             | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                 | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                   | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor       | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.697       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.597       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    * I click exit button
    And I complete rewrite transaction

  @Homeowner @NewBusiness @Endorsement @NB @END @PreProdNew
  Scenario: NJ Base Rate and Factors - Homeowner - PreProd
    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Replacement_Cost" to "1000000"
    * I set "AOP_Ded" to "500"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 310 Franklin Tpke | Ridgewood | NJ    | 07450 | Homeowner     | 4000000 |           | 5,000  |            |

    And I set "Water_Leak_Detection" to "None"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1    | city   | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 125 Osborne Ter | Newark | NJ    | 07108 | Homeowner     | 10000000 |           | 10,000 |            |

    * I rate a quote
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                        | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                         | 1.193       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                         | 0.94        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 310 Franklin  | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.776       | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 125 Osborne   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement

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

    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 3 address line 1 to "32 Park Dr"
    * I set risk address 3 city to "Livingston"
    * I set risk address 3 state to "NJ"
    * I set risk address 3 zip to "07039"
    * I set risk address 3 residence type to "Homeowner"
    * I set risk address 3 replacement cost to "5000000"
    * I set risk address 3 AOP Ded to "25,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Livingston"
    * I set "Water_Leak_Detection" to "Yes - with alarm"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 4 address line 1 to "2415 Park Pl"
    * I set risk address 4 city to "Scotch Plains"
    * I set risk address 4 state to "NJ"
    * I set risk address 4 zip to "07076"
    * I set risk address 4 residence type to "Homeowner"
    * I set risk address 4 replacement cost to "10000000"
    * I set risk address 4 AOP Ded to "50,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Scotch Plains"
    * I set "Water_Leak_Detection" to "Yes - without alarm"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                        | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                         | 1.193       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,197       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                         | 0.94        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 310 Franklin  | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                         | 0.776       | +      |
      | 125 Osborne   | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Back Up Generator Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Lightning Protection System Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                          | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                             | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0           | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 3,864       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                         | 0.554       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                       | 4,409       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                         | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | External Perimeter Security Protection Factor | 0.05        | +      |
      | 2415 Park     | Non Hurricane Premium      | Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Back Up Generator Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Gas Leak Detector Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Lightning Protection System Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | External Perimeter Gate Factor                | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                 | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                          | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                             | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                  | 0.03        | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Home                  | 0.1         | -      |
      | 2415 Park     | Non Hurricane Premium      | Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor   | 0.08        | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Condo @Coop @Tenants @NewBusiness @Endorsement @NB @END @PreProdNew
  Scenario: NJ Base Rate and Factors - C/C/T Tenants - PreProd
    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2446 3rd St"
    * I set "City_Name_Txt" to "Fort Lee"
    * I set "Zip_Code" to "07024"
    * I set "Effective_Date" to "02/15/2025"
    * I set "Endorsement_Effective_Date_END" to "02/16/2025"
    * I set "Contents" to "3000000"
    * I set "AOP_Ded" to "500"
    * I set "Hurr_Ded" to "Not Available"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Policy_Information_Member_Have_Excess_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Collections_Policy" to "Yes"
    * I set "Policy_Information_Member_Have_Auto_Policy" to "Yes"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 1 address line 1 to "310 Franklin Tpke"
    * I set risk address 1 city to "Ridgewood"
    * I set risk address 1 state to "NJ"
    * I set risk address 1 zip to "07450"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "2000000"
    * I set risk address 1 AOP Ded to "5,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Ridgewood"
    * I set "Water_Leak_Detection" to "Yes - without alarm"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 2 address line 1 to "125 Osborne Ter"
    * I set risk address 2 city to "Newark"
    * I set risk address 2 state to "NJ"
    * I set risk address 2 zip to "07108"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "3000000"
    * I set risk address 2 AOP Ded to "10,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Newark"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 1.196       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.661       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I navigate to Location Details Page
    And I set Central Reporting Burglar Alarm to "No"
    * I set Central Reporting Fire Alarm to "No"
    * I set 24 Hour Door Man to "No"
    * I set Guard Gated Community to "No"
    * I set Residential Sprinkler System to "No"
    * I set Full Time Live In Caretaker to "No"

    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 3 address line 1 to "32 Park Dr"
    * I set risk address 3 city to "Livingston"
    * I set risk address 3 state to "NJ"
    * I set risk address 3 zip to "07039"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "4000000"
    * I set risk address 3 AOP Ded to "25,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Livingston"
    * I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Residence_Type" to "Condo/Co-op"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    Then I navigate to Homeowner Policy Page
    And I click add additional risk addresses
    Then I set risk address 4 address line 1 to "2415 Park Pl"
    * I set risk address 4 city to "Scotch Plains"
    * I set risk address 4 state to "NJ"
    * I set risk address 4 zip to "07076"
    * I set risk address 4 residence type to "Tenants"
    * I set risk address 4 contents to "10000000"
    * I set risk address 4 AOP Ded to "50,000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "City_Name_Txt" to "Scotch Plains"
    * I set "Residence_Type" to "Tenants"
    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I review changes
    * I rate an endorsement
    * I think for 5 to 6 seconds
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                   | factor                                         | factorValue | method |
      | 2446 3rd St   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Deductible Factor v.2                          | 1.196       | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2446 3rd St   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2446 3rd St   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 310 Franklin  | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 310 Franklin  | Non Hurricane Premium      | Deductible Factor v.2                          | 0.845       | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 310 Franklin  | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 310 Franklin  | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 310 Franklin  | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 310 Franklin  | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 125 Osborne   | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 125 Osborne   | Non Hurricane Premium      | Deductible Factor v.2                          | 0.661       | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Back Up Generator Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Lightning Protection System Factor            | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 125 Osborne   | Non Hurricane Premium      | Burglar Alarm Factor                           | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Fire Alarm Factor                              | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Guard Gated Community Factor                   | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0           | -      |
      | 125 Osborne   | Non Hurricane Premium      | Surveillance Camera Factor                     | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Locked  Elevator Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0           | +      |
      | 125 Osborne   | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
      | 32 Park Dr    | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Deductible Factor v.2                          | 0.518       | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 32 Park Dr    | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 32 Park Dr    | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 2415 Park     | Base Premium Non-Hurricane | Base Rate Non-Hurricane                        | 6,692       | +      |
      | 2415 Park     | Non Hurricane Premium      | Deductible Factor v.2                          | 0.55        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Security Protection Factor | 0.05        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Full time Live In Caretaker Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !24 Hour Signal Continuity Factor              | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Sprinkler System with Water Flow Alarm Factor | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Back Up Generator Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Gas Leak Detector Factor                      | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Lightning Protection System Factor            | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !External Perimeter Gate Factor                | 0.02        | +      |
      | 2415 Park     | Non Hurricane Premium      | !Low Temperature Monitoring Device Factor      | 0.01        | -      |
      | 2415 Park     | Non Hurricane Premium      | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 2415 Park     | Non Hurricane Premium      | Burglar Alarm Factor                           | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Fire Alarm Factor                              | 0.02        | -      |
      | 2415 Park     | Non Hurricane Premium      | Guard Gated Community Factor                   | 0.03        | -      |
      | 2415 Park     | Non Hurricane Premium      | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 2415 Park     | Non Hurricane Premium      | Surveillance Camera Factor                     | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | Locked  Elevator Factor                        | 0.01        | +      |
      | 2415 Park     | Non Hurricane Premium      | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 2415 Park     | Non Hurricane Premium      | Water Leak Detection/Shut-off Device Factor    | 0           | -      |
    Then I click exit button
    And I review and accept referrals on renewal if any
    Then I issue an endorsement
