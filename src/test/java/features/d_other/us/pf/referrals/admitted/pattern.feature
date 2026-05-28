@PrimaryFlood @Admitted @USNum
Feature: US name

  @EndIL
  Scenario Outline: US_Num - 1. IL - Verify referral is triggered (NB/END) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
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
      | ruleID | user  | triggered | approvable |
      | 6      | Field | Yes       | Yes        |

  @RenewalIL
  Scenario Outline: US_Num - 2. IL - Verify referral is triggered (NB/RNW) - 09/07/2025

    Given I use "IL_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
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
      | ruleID | user  | triggered | approvable |
      | 6      | Field | Yes       | Yes        |

  @EndCO
  Scenario Outline: US_Num - 3. CO - Verify referral is triggered (NB/END) - 09/07/2025

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
      | ruleID | user  | triggered | approvable |
      | 6      | Field | Yes       | Yes        |

  @RenewalCo
  Scenario Outline: US_Num - 4. CO - Verify referral is triggered (NB/RNW) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"
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
      | ruleID | user  | triggered | approvable |
      | 6      | Field | Yes       | Yes        |