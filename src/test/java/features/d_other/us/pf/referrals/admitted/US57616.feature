@PrimaryFlood @Admitted @US57616
Feature: PF - Admitted UW Rules & Referrals - If the answer to “Has the property been impacted by any flood event or experienced any external-to internal water damage in the last ten years” is ‘No’ but they have a flood loss applied to the location’s loss history

  Scenario Outline: US57616 - 1. IL - Verify referral is triggered (NB/END) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/19/2025"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Flood Loss"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10,000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
#   * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
#   * I set "Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage" to "Yes"
#   * I set "Who_Is_Providing_Underlying_PF_Coverage" to "PURE Primary Flood Endorsement"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleID>" is "<triggered>"
##    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
#
    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | West Chicago | IL    | 60185 | Condo/Co-op   | 7500000 |           | 10,000 |            | 1 |

    Then I navigate to "West Chicago IL" page
    * I click order property details button

    When I fill out HO Flood Coverage page for additional location

    * I review changes
    * I rate an endorsement
    * I review referrals
    * I verify that referral "<ruleID>" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriter referrals END
    * I issue an endorsement

    Examples:
      | ruleID  | user   | triggered | approvable |
      | US57616 | Field  | Yes       | Yes        |
      | US57616 | Agent2 | No        | No         |

  Scenario Outline: US57616 - 2. IL - Verify referral is triggered (NB/RNW) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/19/2025"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Flood Loss"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10,000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
#    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
#    * I set "Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage" to "Yes"
#    * I set "Who_Is_Providing_Underlying_PF_Coverage" to "PURE Primary Flood Endorsement"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleID>" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city         | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | West Chicago | IL    | 60185 | Tenants       | 7500000 |           | 10,000 |            | 1 |

    Then I navigate to "West Chicago IL" page
    * I click order property details button

    When I fill out HO Flood Coverage page for additional location

    Then I review changes
    * I click renewed premium
    * I review referrals
    * I verify that referral "7" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | ruleID  | user  | triggered | approvable |
      | US57616 | Field | Yes       | Yes        |

  Scenario Outline: US57616 - 3. CO - Verify referral is triggered (NB/END) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/19/2025"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Flood Loss"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10,000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
#    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
#    * I set "Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage" to "Yes"
#    * I set "Who_Is_Providing_Underlying_PF_Coverage" to "PURE Primary Flood Endorsement"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleID>" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
#
    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | Platteville | CO    | 80651 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         | 1 |

    Then I navigate to "Platteville CO" page
    * I click order property details button

    When I fill out HO Flood Coverage page for additional location

    * I review changes
    * I rate an endorsement
    * I review referrals
    * I verify that referral "<ruleID>" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriter referrals END
    * I issue an endorsement

    Examples:
      | ruleID  | user  | triggered | approvable |
      | US57616 | Field | Yes       | Yes        |

  Scenario Outline: US57616 - 4. CO - Verify referral is triggered (NB/RNW) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_003"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/19/2025"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Flood Loss"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "10,000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
#    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
#    * I set "Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage" to "Yes"
#    * I set "Who_Is_Providing_Underlying_PF_Coverage" to "PURE Primary Flood Endorsement"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral "<ruleID>" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | Platteville | CO    | 80651 | Tenants       | 7500000 |           | 10,000 | 2%         | 1 |

    Then I navigate to "Platteville CO" page
    * I click order property details button

    When I fill out HO Flood Coverage page for additional location

    Then I review changes
    * I click renewed premium
    * I review referrals
    * I verify that referral "7" is "<triggered>"
#    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | ruleID  | user  | triggered | approvable |
      | US57616 | Field | Yes       | Yes        |