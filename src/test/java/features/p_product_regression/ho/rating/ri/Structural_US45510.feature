@US45510 @US @RI @Homeowners @HO @BaseRate @PCRegression @2024 @December @Rating
Feature: US45510 - RI Home Base Rate/Structural

  @Homeowner
  Scenario: RI Base Rate - Homeowner NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "RI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Replacement_Cost" to "7500000"
    * I set "AOP_Ded" to "500,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Homeowner     | 50000000 |           | 50,000 | 1%         |

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Homeowner" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                         | 0.76        | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                     | 2,965       | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                           | 1,655       | +      |
      | 6 Acre Ave          | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.92        | *      |

    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    And I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed  | deductible    |
      | 75 Tallman Ave | Cranston | RI    | 02910 | Homeowner     | 3000000 |           | 250,000 | Not Available |

    And I set "City_Name_Txt" to "Barrington"
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
    And I save coverage factor and value for "Homeowner" in "STG/US45510" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.408       | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                         | 0.762       | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                     | 2,965       | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                           | 1,655       | +      |
      | 6 Acre Ave          | All Other Perils Premium     | External Perimeter Security Protection Factor | 1           | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Full time Live In Caretaker Factor            | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Back Up Generator Factor                      | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Gas Leak Detector Factor                      | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Lightning Protection System Factor            | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                          | 1           | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                             | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                  | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Home                  | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 1           | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Deductible Factor 2.0                         | 0.34        | +      |
      | 75 Tallman Ave      | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,833       | +      |
      | 75 Tallman Ave      | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |

  @Condo @Coop
  Scenario: RI Base Rate - Condo/Co-op NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "RI_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "1000000"
    * I set "AOP_Ded" to "10,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Condo" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Condo/Co-op   | 50000000 |           | 25,000 | Not Available |

    And I review changes
    * I rate an endorsement
    When I navigate to premium details page
    And I save coverage factor and value for "Condo" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                          | 0.89        | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.92        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    And I set "Water_Leak_Detection" to "Yes - with alarm"
    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed  | deductible    |
      | 75 Tallman Ave | Cranston | RI    | 02910 | Condo/Co-op   | 4000000 |           | 500,000 | Not Available |

    * I set "City_Name_Txt" to "Barrington"
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
    And I save coverage factor and value for "Condo" in "STG/US45510" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.731       | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                          | 0.892       | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Door Man Factor                        | 1           | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                           | 1           | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                              | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                   | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Condo                  | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Deductible Factor 2.0                          | 0.3         | +      |
      | 75 Tallman Ave      | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,833      | +      |
      | 75 Tallman Ave      | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave      | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
    And I click exit button

  @Tenants
  Scenario: RI Base Rate - Tenants NB/END/RN
  Location 1 on NB, Location 2 on END and Location 3 on RN

    Given I use "RI_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "291 Hill Street"
    * I set "City_Name_Txt" to "Coventry"
    * I set "Zip_Code" to "02816"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "2000000"
    * I set "AOP_Ded" to "5,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "Tenants" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city    | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 61 Ledge Rd APT H | Newport | RI    | 02840 | Tenants       | 10000000 |           | 1,000  | Not Available |

    And I review changes
    * I rate an endorsement
    When I navigate to premium details page
    And I save coverage factor and value for "Tenants" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Deductible Factor 2.0                          | 1.35        | +      |
      | 61 Ledge Rd   | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,889      | +      |
      | 61 Ledge Rd   | Base Premium Hurricane       | Base Rate Hurricane                            | !2,083      | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    Then I create a renewal
    And I navigate to policy image page

    * I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed    | deductible    |
      | 75 Tallman Ave | Cranston | RI    | 02910 | Tenants       | 5000000 |           | 1,000,000 | Not Available |

    And I set "City_Name_Txt" to "Newport"
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
    And I save coverage factor and value for "Tenants" in "STG/US45510" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject  | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St    | All Other Perils Premium     | Deductible Factor 2.0                          | 0.884       | +      |
      | 291 Hill St    | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St    | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St    | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St    | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St    | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St    | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St    | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St    | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St    | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St    | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St    | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St    | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St    | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St    | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St    | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St    | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St    | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St    | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St    | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St    | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Deductible Factor 2.0                          | 1.35        | +      |
      | 61 Ledge Rd    | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,889      | +      |
      | 61 Ledge Rd    | Base Premium Hurricane       | Base Rate Hurricane                            | !2,083      | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | 24 Hour Door Man Factor                        | 1           | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Locked  Elevator Factor                       | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Burglar Alarm Factor                           | 1           | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Fire Alarm Factor                              | 1           | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Guard Gated Community Factor                   | 1           | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Deductible Factor 2.0                          | 0.33        | +      |
      | 75 Tallman Ave | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,833      | +      |
      | 75 Tallman Ave | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 75 Tallman Ave | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
    And I click exit button
    Then I review and accept referrals on renewal if any
    And I process a renewal

  @Homeowner @Condo @Coop @Tenants @RC @RenewalConversion
  Scenario: RI Base Rate - Renewal Conversion

    Given I use "RI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "61 Ledge Rd APT H"
    * I set "City_Name_Txt" to "Newport"
    * I set "Zip_Code" to "02840"
    * I set "Effective_Date" to "02/15/2024"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Replacement_Cost" to "7500000"
    * I set "AOP_Ded" to "500,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Condo/Co-op   | 50000000 |           | 25,000 | Not Available |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed    | deductible    |
      | 75 Tallman Ave | Cranston | RI    | 02910 | Tenants       | 5000000 |           | 1,000,000 | Not Available |

    And I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "RenewalConversion" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject  | coverage                     | factor                                         | factorValue | method |
      | 61 Ledge Rd    | All Other Perils Premium     | Deductible Factor 2.0                          | 0.39        | +      |
      | 61 Ledge Rd    | Base Premium All Other Peril | Base Rate All Other Peril                      | 2,603       | +      |
      | 61 Ledge Rd    | Base Premium Hurricane       | Base Rate Hurricane                            | 1,876       | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Security Protection Factor  | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | 24 Hour Signal Continuity Factor               | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor  | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Back Up Generator Factor                       | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Gas Leak Detector Factor                       | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Lightning Protection System Factor             | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Gate Factor                 | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System Factor Home                   | 0.1         | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Deductible Factor 2.0                          | 0.827       | +      |
      | 6 Acre Ave     | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave     | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave     | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Locked  Elevator Factor                        | 0.01        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Surveillance Camera Factor                     | 0.01        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Deductible Factor 2.0                          | 0.31        | +      |
      | 75 Tallman Ave | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,833      | +      |
      | 75 Tallman Ave | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 75 Tallman Ave | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Locked  Elevator Factor                        | 0.01        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Surveillance Camera Factor                     | 0.01        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

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
    And I save coverage factor and value for "RenewalConversion" in "STG/US45510" in "Base_Rates" excel file for "Renewal"
    Then I validate premium details page table
      | relatedObject  | coverage                     | factor                                         | factorValue | method |
      | 61 Ledge Rd    | All Other Perils Premium     | Deductible Factor 2.0                          | 0.408       | +      |
      | 61 Ledge Rd    | Base Premium All Other Peril | Base Rate All Other Peril                      | 2,889       | +      |
      | 61 Ledge Rd    | Base Premium Hurricane       | Base Rate Hurricane                            | 2,083       | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Security Protection Factor  | 0.98        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Full time Live In Caretaker Factor             | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | 24 Hour Signal Continuity Factor               | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor  | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Back Up Generator Factor                       | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Gas Leak Detector Factor                       | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Lightning Protection System Factor             | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Gate Factor                 | 0.99        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System Factor Home                   | 0.9         | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Low Temperature Monitoring Device Factor       | 0.98        | *      |
      | 61 Ledge Rd    | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Deductible Factor 2.0                          | 0.892       | +      |
      | 6 Acre Ave     | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave     | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave     | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.92        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Deductible Factor 2.0                          | 0.334       | +      |
      | 75 Tallman Ave | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,833      | +      |
      | 75 Tallman Ave | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 75 Tallman Ave | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

  @Homeowner @Condo @Coop @Tenants @DayPrior @PreProd
  Scenario: RI Base Rate - Day Prior + NB Endorsement

    Given I use "RI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "61 Ledge Rd APT H"
    * I set "City_Name_Txt" to "Newport"
    * I set "Zip_Code" to "02840"
    * I set "Effective_Date" to "12/31/2024"
    * I set "Endorsement_Effective_Date_END" to "01/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Replacement_Cost" to "7500000"
    * I set "AOP_Ded" to "500,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    * I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Condo/Co-op   | 50000000 |           | 25,000 | Not Available |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1   | city     | state | zip   | residenceType | covAorC | lossOfUse | aopDed    | deductible    |
      | 75 Tallman Ave | Cranston | RI    | 02910 | Tenants       | 5000000 |           | 1,000,000 | Not Available |

    And I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "DayPrior" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject  | coverage                     | factor                                         | factorValue | method |
      | 61 Ledge Rd    | All Other Perils Premium     | Deductible Factor 2.0                          | 0.39        | +      |
      | 61 Ledge Rd    | Base Premium All Other Peril | Base Rate All Other Peril                      | 2,603       | +      |
      | 61 Ledge Rd    | Base Premium Hurricane       | Base Rate Hurricane                            | 1,876       | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Security Protection Factor  | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Full time Live In Caretaker Factor             | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | 24 Hour Signal Continuity Factor               | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor  | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Back Up Generator Factor                       | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Gas Leak Detector Factor                       | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Lightning Protection System Factor             | 0.02        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | External Perimeter Gate Factor                 | 0.01        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 61 Ledge Rd    | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Sprinkler System Factor Home                   | 0.1         | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Low Temperature Monitoring Device Factor       | 0.02        | -      |
      | 61 Ledge Rd    | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.12        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Deductible Factor 2.0                          | 0.827       | +      |
      | 6 Acre Ave     | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave     | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave     | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Locked  Elevator Factor                        | 0.01        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Surveillance Camera Factor                     | 0.01        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.08        | -      |
      | 6 Acre Ave     | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave     | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave     | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | Deductible Factor 2.0                          | 0.31        | +      |
      | 75 Tallman Ave | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,833      | +      |
      | 75 Tallman Ave | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 75 Tallman Ave | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.03        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Locked  Elevator Factor                        | 0.01        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Surveillance Camera Factor                     | 0.01        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.12        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | Burglar Alarm Factor                           | 0.02        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Fire Alarm Factor                              | 0.02        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Guard Gated Community Factor                   | 0.03        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.05        | -      |
      | 75 Tallman Ave | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 75 Tallman Ave | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 75 Tallman Ave | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I review changes
    * I rate an endorsement
    When I navigate to premium details page
    And I save coverage factor and value for "DayPrior" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    And I think for 30 to 50 seconds
    Then I check premiums if they are equal for "New Business" and "Endorsement"

  @Homeowner @PreProdNew @NewBusiness @NB @END @Endorsement
  Scenario: RI Base Rate - Homeowner PreProd

    Given I use "RI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Replacement_Cost" to "7500000"
    * I set "AOP_Ded" to "500,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "HomeownerPP" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Homeowner     | 50000000 |           | 50,000 | 1%         |

    And I review changes
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "HomeownerPP" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                         | 0.76        | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                     | 2,965       | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                           | 1,655       | +      |
      | 6 Acre Ave          | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.92        | *      |

    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Condo @Coop @PreProdNew @NewBusiness @NB @END @Endorsement
  Scenario: RI Base Rate - Condo/Co-op PreProd

    Given I use "RI_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "1000000"
    * I set "AOP_Ded" to "10,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "CondoPP" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I set "Water_Leak_Detection" to "Yes - without alarm"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city       | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 6 Acre Avenue | Barrington | RI    | 02806 | Condo/Co-op   | 50000000 |           | 25,000 | Not Available |

    And I review changes
    * I rate an endorsement
    When I navigate to premium details page
    And I save coverage factor and value for "CondoPP" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Deductible Factor 2.0                          | 0.89        | +      |
      | 6 Acre Ave          | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,965      | +      |
      | 6 Acre Ave          | Base Premium Hurricane       | Base Rate Hurricane                            | !1,655      | +      |
      | 6 Acre Ave          | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.92        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 6 Acre Ave          | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 6 Acre Ave          | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

    Then I click exit button
    And I navigate to underwriting alerts tab
    * I think for 5 to 10 seconds
    * I set all referrals to yes
    And I accept underwriting referrals
    * I issue an endorsement

  @Tenants @PreProdNew @NewBusiness @NB @END @Endorsement
  Scenario: RI Base Rate - Tenants PreProd

    Given I use "RI_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "291 Hill Street"
    * I set "City_Name_Txt" to "Coventry"
    * I set "Zip_Code" to "02816"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "2000000"
    * I set "AOP_Ded" to "5,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    And I save coverage factor and value for "TenantsPP" in "STG/US45510" in "Base_Rates" excel file for "New Business"
    Then I validate premium details page table
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1      | city    | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible    |
      | 61 Ledge Rd APT H | Newport | RI    | 02840 | Tenants       | 10000000 |           | 1,000  | Not Available |

    Then I review changes
    * I rate an endorsement
    When I navigate to premium details page
    And I save coverage factor and value for "TenantsPP" in "STG/US45510" in "Base_Rates" excel file for "Endorsement"
    Then I validate premium details page table
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Deductible Factor 2.0                          | 1.35        | +      |
      | 61 Ledge Rd   | Base Premium All Other Peril | Base Rate All Other Peril                      | !2,889      | +      |
      | 61 Ledge Rd   | Base Premium Hurricane       | Base Rate Hurricane                            | !2,083      | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 61 Ledge Rd   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |

    Then I click exit button
    And I review and accept referrals on renewal if any
    * I issue an endorsement

  @Homeowner @Rewrite @PreProd
  Scenario: RI Base Rate - Homeowner Rewrite

    Given I use "RI_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Replacement_Cost" to "7500000"
    * I set "AOP_Ded" to "500,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |

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
      | relatedObject       | coverage                     | factor                                        | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                         | 0.4         | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                     | 3,645       | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                           | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | External Perimeter Gate Factor                | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                 | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                          | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                             | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                  | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Home                  | 0.9         | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor   | 0.88        | *      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Condo @Coop @Rewrite @PreProd
  Scenario: RI Base Rate - Condo/Co-op Rewrite

    Given I use "RI_002" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "139 Arnolds Neck Dr"
    * I set "City_Name_Txt" to "Warwick"
    * I set "Zip_Code" to "02886"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "1000000"
    * I set "AOP_Ded" to "10,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


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
      | relatedObject       | coverage                     | factor                                         | factorValue | method |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Deductible Factor 2.0                          | 0.73        | +      |
      | 139 Arnolds Neck Dr | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 139 Arnolds Neck Dr | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 0.88        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 139 Arnolds Neck Dr | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @Tenants @Rewrite @PreProd
  Scenario: RI Base Rate - Tenants Rewrite

    Given I use "RI_003" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "291 Hill Street"
    * I set "City_Name_Txt" to "Coventry"
    * I set "Zip_Code" to "02816"
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2025"
    * I set "Calendar_Year_Hurricane_Ded" to "Not Available"
    * I set "Contents" to "2000000"
    * I set "AOP_Ded" to "5,000"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |


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
      | relatedObject | coverage                     | factor                                         | factorValue | method |
      | 291 Hill St   | All Other Perils Premium     | Deductible Factor 2.0                          | 0.88        | +      |
      | 291 Hill St   | Base Premium All Other Peril | Base Rate All Other Peril                      | !3,645      | +      |
      | 291 Hill St   | Base Premium Hurricane       | Base Rate Hurricane                            | 0           | +      |
      | 291 Hill St   | All Other Perils Premium     | 24 Hour Door Man Factor                        | 0.97        | +      |
      | 291 Hill St   | All Other Perils Premium     | Locked  Elevator Factor                        | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Surveillance Camera Factor                     | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | Superior Risk Credits Maximum                  | 0.88        | +      |
      | 291 Hill St   | All Other Perils Premium     | Burglar Alarm Factor                           | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | Fire Alarm Factor                              | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | Guard Gated Community Factor                   | 0.97        | *      |
      | 291 Hill St   | All Other Perils Premium     | Sprinkler System Factor Condo                  | 0.95        | *      |
      | 291 Hill St   | All Other Perils Premium     | Water Leak Detection/Shut-off Device Factor    | 1           | *      |
      | 291 Hill St   | All Other Perils Premium     | !Low Temperature Monitoring Device Factor      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Security Protection Factor | 0.98        | +      |
      | 291 Hill St   | All Other Perils Premium     | !Full time Live In Caretaker Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !24 Hour Signal Continuity Factor              | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Sprinkler System with Water Flow Alarm Factor | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Back Up Generator Factor                      | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Gas Leak Detector Factor                      | 0.99        | *      |
      | 291 Hill St   | All Other Perils Premium     | !Lightning Protection System Factor            | 0.98        | *      |
      | 291 Hill St   | All Other Perils Premium     | !External Perimeter Gate Factor                | 0.99        | *      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @CompareBaseRates
  Scenario Outline: I compare Base Rates recorded on 11/19/2024 "<file1>" and new "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "STG/US45510/"

    Examples:
      | file1                       | file2                                  |
      | Base_Homeowner.xlsx         | Base_Rates_Homeowner_null.xlsx         |
      | Base_Condo.xlsx             | Base_Rates_Condo_null.xlsx             |
      | Base_Tenants.xlsx           | Base_Rates_Tenants_null.xlsx           |
      | Base_RenewalConversion.xlsx | Base_Rates_RenewalConversion_null.xlsx |
      | Base_DayPrior.xlsx          | Base_Rates_DayPrior_null.xlsx          |