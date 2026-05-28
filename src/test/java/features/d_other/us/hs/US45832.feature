@HomeownersSurplus @US45832 @TF107 @TF1154 @TF1166

Feature: PSE
  As a user, I should have new fields for Excess Flood that expand the selections that can be made for Excess Flood coverage.

  @TC89586 @TC89587 @TC89589 @TC89585 @TC89588
  Scenario Outline:TX Verify that the new functionality is applicable on NB
  Verify that the new section with fields is visible when "Yes" is selected for the field "Do you wish to include excess flood coverage?
  Verify that the new functionality is applicable for Accredited and PSE
  Verify new functionality according to the PD Filling dates

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "Yes"

    Then I verify error message is shown "Excess Flood Dwelling and Contents limit cannot both be $0"
    * I verify "Basement Property" is displayed
    * I verify "Basement Contents" is displayed
    * I verify "Excess Flood Loss of Use" is displayed
    * I verify "Excess Flood Rebuilding to Code" is displayed
    * I verify "Underlying Flood Limits" is displayed
    * I verify "Dwelling" is displayed
    * I verify "Contents" is displayed

    Examples:
      | TC_ID  | Company                                |
      | TX_001 | PURE Specialty Exchange                |
      | TX_002 | PURE Specialty Exchange                |
      | TX_001 | Accredited Specialty Insurance Company |
      | TX_002 | Accredited Specialty Insurance Company |

  @TC89587 @TC89589 @TC89588
  Scenario Outline:TX Verify that the new functionality is applicable on Endorsement
  Verify that the new section with fields is visible when "Yes" is selected for the field "Do you wish to include excess flood coverage?
  Verify that the new functionality is applicable for Accredited and PSE
  Verify new functionality according to the PD Filling dates

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "02/15/25"
    * I set "Effective_Date_END" to "02/20/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"

   When I am logged in to Pure as Zonal
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
    * I set Primary Flood Dec Page Received to "No"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "Yes"

    Then I verify error message is shown "Excess Flood Dwelling and Contents limit cannot both be $0"
    * I verify "Basement Property" is displayed
    * I verify "Excess Flood Loss of Use" is displayed
    * I verify "Excess Flood Rebuilding to Code" is displayed
    * I verify "Underlying Flood Limits" is displayed
    * I verify "Dwelling" is displayed
    * I verify "Contents" is displayed

    Examples:
      | TC_ID  | Company                                |
      | TX_001 | PURE Specialty Exchange                |
      | TX_002 | PURE Specialty Exchange                |
      | TX_001 | Accredited Specialty Insurance Company |
      | TX_002 | Accredited Specialty Insurance Company |

  @TC89587 @TC89589 @TC89588
  Scenario Outline:TX Verify that the new functionality is applicable on Renewal
  Verify that the new section with fields is visible when "Yes" is selected for the field "Do you wish to include excess flood coverage?
  Verify that the new functionality is applicable for Accredited and PSE
  Verify new functionality according to the PD Filling dates

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Field
    * I set "Effective_Date" to "04/19/24"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
    * I set Primary Flood Dec Page Received to "No"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "Yes"

    Then I verify error message is shown "Excess Flood Dwelling and Contents limit cannot both be $0"
    * I verify "Basement Property" is displayed
    * I verify "Basement Contents" is displayed
    * I verify "Excess Flood Loss of Use" is displayed
    * I verify "Excess Flood Rebuilding to Code" is displayed
    * I verify "Underlying Flood Limits" is displayed
    * I verify "Dwelling" is displayed
    * I verify "Contents" is displayed

    Examples:
      | TC_ID  |
      | TX_001 |
      | TX_002 |

  @TC89590 @TC89592
  Scenario Outline:TX User quotes Homeowner residence type and enters values of 10 million for Excess Flood Dwelling and 5 million for Excess Flood Contents.
  User quotes Homeowner residence type and enters values of 10 million for Excess Flood Dwelling and 0 for Excess Flood Contents.
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I set "Risk_Addresses_Replacement_Cost" to "20000000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "500,000"
    * I set "Excess_Flood_Include_Excess_Flood" to "Yes"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling" to "<Dwelling>"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents" to "<Contents>"
    * I set "Excess_Flood_Underlying_Flood_Limits_Dwelling" to "<UnderlyingDwelling>"
    * I set "Excess_Flood_Underlying_Flood_Limits_Contents" to "<UnderlyingContents>"
    * I set "Excess_Flood_Excess_Flood_Rebuilding_To_Code" to "<rebuildingToCode>"

    * I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to Optional Coverages Page

    Then I click dropdown "Excess Flood Loss of Use"
    * I verify dropdown values
      | values    |
      | $ 0,00    |
      | $ 25,000  |
      | $ 50,000  |
      | $ 75,000  |
      | $ 100,000 |

    Then I verify "Dwelling" input 1 has value "<Dwelling>"
    * I verify "Contents" input 1 has value "<Contents>"
    * I verify "Dwelling" input 2 has value "<UnderlyingDwelling>"
    * I verify "Contents" input 2 has value "<UnderlyingContents>"
    * I verify "Excess Flood Rebuilding to Code" input 1 has value "<rebuildingToCode>"

    @TC89593
    Examples:
      | TC_ID  | Company                 | Dwelling | Contents     | UnderlyingDwelling | UnderlyingContents | rebuildingToCode |
      | TX_001 | PURE Specialty Exchange | 25%      | Other Limits | $ 1,000,000.00     | $ 250,000.00       | $ 1,200.00       |
    @TC89591
    Examples:
      | TC_ID  | Company                 | Dwelling | Contents    | UnderlyingDwelling | UnderlyingContents | rebuildingToCode |
      | TX_001 | PURE Specialty Exchange | 50%      | Full Limits | $ 5,000,000.00     | $ 500,000.00       | $ 25,000.00      |

    Examples:
      | TC_ID  | Company                 | Dwelling    | Contents     | UnderlyingDwelling | UnderlyingContents | rebuildingToCode |
      | TX_001 | PURE Specialty Exchange | 10%         | 10%          | $ 250,000.00       | $ 50,000.00        | $ 500.00         |
      | TX_001 | PURE Specialty Exchange | Full Limits | Other Limits | $ 9,750,000.00     | $ 500,000.00       | $ 100,000.00     |

  @TC89594
  Scenario Outline: User quotes any residence type and enters 0 for Excess Flood Dwelling

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as Zonal
    * I set "Effective_Date" to "02/15/25"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<Company>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I navigate to Optional Coverages Page
    * I set Include Excess Flood Coverage to "Yes"

    Then I verify "Basement Property" input 1 has value "$ 0.00"
    * I verify "Basement Contents" input 1 has value "$ 0.00"
    * I verify "Excess Flood Rebuilding to Code" input 1 has value "$ 0.00"

    Examples:
      | TC_ID  | Company                 |
      | TX_001 | PURE Specialty Exchange |
      | TX_002 | PURE Specialty Exchange |