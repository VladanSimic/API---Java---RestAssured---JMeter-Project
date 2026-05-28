@VIN_Override
Feature: Personal auto - Vin Override Changes

  @US49564
  Scenario Outline: VIN Override - PA - "<TC_ID>" - New Business with 3 vehicles, verify Trim Level field is not visible for 3 vehicles

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today
    * I set "Additional_Vehicles" to "Vehicle_001,Vehicle_002,Vehicle_003,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"


    * I set "Vehicle_Details_VIN_Override_1" to "Yes"
    * I set "Vehicle_Details_VIN_Override_2" to "Yes"
    * I set "Vehicle_Details_VIN_Override_3" to "Yes"

    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"

    * I set "Vehicle_Details_Model_3" to "RAIDER"

    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_1" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_2" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_3" to "No"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID


    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 0 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
    * I verify that the hidden field "Trim Level" for "31105933" BV has 0 values
    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |



  @US49564 @RerunDE36537
  Scenario Outline: VIN Override - PA - "<TC_ID>" - New Business with 3 vehicles, verify Trim Level field is not visible for one vehicle

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today

    * I set "Additional_Vehicles" to "Vehicle_001,Vehicle_002,Vehicle_003,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"


    * I set "Vehicle_Details_VIN_Override_1" to "No"
    * I set "Vehicle_Details_VIN_Override_2" to "No"
    * I set "Vehicle_Details_VIN_Override_3" to "Yes"

    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"

    * I set "Vehicle_Details_Model_3" to "RAIDER"

    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_1" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_2" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_3" to "No"


    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID


    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 2 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 2 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |

    @FullRegression_DreamTeam
    Examples:
    |TC_ID|user|
    |CA_001|P77|
    |TX_001|P78|


  @US49564 @Disabled
  Scenario Outline: VIN Override - PA - "<TC_ID>" - New Business with 5 vehicles, verify Trim Level field is not visible for 4 vehicles

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today

    * I set "Additional_Vehicles" to "Vehicle_001,Vehicle_002,Vehicle_003,Vehicle_004,Vehicle_005"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"


    * I set "Vehicle_Details_VIN_Override_1" to "Yes"
    * I set "Vehicle_Details_VIN_Override_2" to "Yes"
    * I set "Vehicle_Details_VIN_Override_3" to "Yes"
    * I set "Vehicle_Details_VIN_Override_4" to "Yes"
    * I set "Vehicle_Details_VIN_Override_5" to "No"


    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"

    * I set "Vehicle_Details_Model_3" to "RAIDER"
    * I set "Vehicle_Details_Model_5" to "ELANTRA"

    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_1" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_2" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_3" to "No"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID


    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 4 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 5 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |



  @US49564
  Scenario Outline: VIN Override - PA - "<TC_ID>" - New Business with 3 vehicles - 2 VIN override, verify Trim Level field is not visible for 2 vehicles on EN and RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today

    * I set "Additional_Vehicles" to "Vehicle_001,Vehicle_002,Vehicle_003,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"


    * I set "Vehicle_Details_VIN_Override_1" to "Yes"
    * I set "Vehicle_Details_VIN_Override_2" to "Yes"
    * I set "Vehicle_Details_VIN_Override_3" to "No"

    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"
    * I set "Vehicle_Details_Model_3" to "RAIDER"

  * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_1" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_2" to "No"
    * I set "Vehicle_Details_Agree_To_Use_PURE_Direct_Repair_Program_10_Physical_Damage_Discount_3" to "No"

    * I set "Vehicles_Options_1" to "with Full Glass"
    * I set "Vehicles_Options_2" to "with Full Glass"
    * I set "Vehicles_Options_3" to "with Full Glass"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I override subjectivities

    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 3 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"


    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |
    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user |
      | TX_001 | P126 |
      | SC_001 | P145 |

  @US49564 @Disabled
  Scenario Outline: VIN Override - PA - "<TC_ID>" - New Business with 1 vehicles, on EN add 2 vehicles - 2 overridden, verify Trim Level field is not visible for 2 vehicles

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today

    * I set "Additional_Vehicles" to "Vehicle_001,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"

    * I set "Vehicle_Details_VIN_Override_1" to "Yes"

    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"


    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID


    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 0 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 0 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I set "Additional_Vehicles_END" to "Vehicle_001_ADD,Vehicle_002_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles_END" key and "PA_AdditionalVehicles_END" sheet
    * I merge additional data for "Additional_Vehicles_END", where "Vehicle_Details_Loss_Payee_END" key and sheet "PA_LossPayee_END" for file "QuoteCreationPA"

    * I set "Vehicle_Details_VIN_Override_END_1" to "No"
    * I set "Vehicle_Details_VIN_Override_END_2" to "Yes"

    * I set "Vehicle_Details_Model_END_2" to "RAIDER"

    When I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 1 details from "Endorsement"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "Endorsement"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 1 details from "Endorsement"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "Endorsement"
    * I should see exactly 0 visible input fields for "Trim Level"


    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |

  @US49564 @RerunDE36537
  Scenario Outline: VIN Override - PA - "<TC_ID>" - NB with 1 vehicles, on RN add 2 vehicles - 2 overridden, verify Trim Level field is not visible for 2 vehicles

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today

    * I set "Additional_Vehicles" to "Vehicle_001,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles" key and "PA_AdditionalVehicles" sheet
    * I merge additional data for "Additional_Vehicles", where "Vehicle_Details_Loss_Payee" key and sheet "PA_LossPayee" for file "QuoteCreationPA"

    * I set "Vehicle_Details_VIN_Override_1" to "No"

    * I set "Vehicle_Details_Model_1" to "RAV4"
    * I set "Vehicle_Details_Make_1" to "Toyota"


    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID


    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements

    * I navigate to transactions or endorsements

    * I set "Additional_Vehicles_RNW" to "Vehicle_001_ADD,Vehicle_002_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles_RNW" key and "PA_AdditionalVehicles_RNW" sheet
    * I merge additional data for "Additional_Vehicles_RNW", where "Vehicle_Details_Loss_Payee_RNW" key and sheet "PA_LossPayee_RNW" for file "QuoteCreationPA"

    * I set "Vehicle_Details_VIN_Override_RNW_1" to "Yes"
    * I set "Vehicle_Details_VIN_Override_RNW_2" to "Yes"


    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to Operators and Vehicles Page
    * I should see exactly 1 visible input fields for "Trim Level"
    * I verify that the hidden field "Trim Level" for "31109833" BV has no values
#    * I verify that the hidden field "Trim Level" for "31102133" BV has no values
#    * I verify that the hidden field "Trim Level" for "31105933" BV has 1 values

    * I navigate to vehicle 1 details from "New Business"
    * I should see exactly 1 visible input fields for "Trim Level"
    * I navigate to vehicle 1 details from "Renewal"
    * I should see exactly 0 visible input fields for "Trim Level"
    * I navigate to vehicle 2 details from "Renewal"
    * I should see exactly 0 visible input fields for "Trim Level"

    Examples:
      | TC_ID  | user |
      | AK_001 | P126 |
      | AR_001 | P127 |
      | AZ_001 | P128 |
      | CO_001 | P129 |
      | DC_001 | P130 |
      | IA_001 | P131 |
      | IL_001 | P132 |
      | IN_001 | P133 |
      | KS_001 | P134 |
      | KY_001 | P135 |
      | MN_001 | P136 |
      | MO_001 | P137 |
      | MT_001 | P138 |
      | ND_001 | P139 |
      | NE_001 | P140 |
      | NH_001 | P141 |
      | NM_001 | P142 |
      | NV_001 | P143 |
      | OH_001 | P144 |
      | OK_001 | P145 |
      | OR_001 | P146 |
      | PA_001 | P147 |
      | RI_001 | P148 |
      | SD_001 | P149 |
      | TN_001 | P150 |
      | UT_001 | P126 |
      | VT_001 | P127 |
      | WA_001 | P128 |
      | WI_001 | P129 |
      | WV_001 | P130 |
      | WY_001 | P131 |
      | AL_001 | P132 |
      | CA_001 | P133 |
      | CT_001 | P134 |
      | DE_001 | P135 |
      | HI_001 | P136 |
      | LA_001 | P137 |
      | MA_001 | P138 |
      | MD_001 | P139 |
      | ME_001 | P140 |
      | MS_001 | P141 |
      | NC_001 | P142 |
      | NJ_001 | P143 |
      | NY_001 | P144 |
      | SC_001 | P145 |
      | VA_001 | P146 |
      | FL_001 | P147 |
      | TX_001 | P148 |
      | GA_001 | P149 |
      | MI_001 | P150 |
      | ID_001 | P126 |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | TC_ID  | user |
      | NY_001 | P126 |
      | NC_001 | P128 |