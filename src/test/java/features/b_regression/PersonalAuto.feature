@PersonalAuto
Feature: Personal auto regression

  @NewBusiness @Regression @GeneralRegression @Jenkins
  Scenario Outline: Regression - PA - "<TC_ID>" - New Business + Endorsement + RN - Private Passenger
    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set Effective Date to Today
    * I set "Additional_Vehicles_END" to "<VEHICLES>"
    * I merge data for "QuoteCreationPA", where "Additional_Vehicles_END" key and "PA_AdditionalVehicles_END" sheet
    * I merge additional data for "Additional_Vehicles_END", where "Vehicle_Details_Loss_Payee_END" key and sheet "PA_LossPayee_END" for file "QuoteCreationPA"
    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals

    Then I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
#    Then I add changes on "PA" endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    * I navigate to transactions or endorsements
    Then I check premiums if they are "equal" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    Then I fill KY Tax Report with dummy data for "PA" LOB
    And I navigate to Coverages Page
    * I click save changes button
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    Then I process renewal or navigate to policy image and review changes and process renewal


    @PrivatePassenger
    Examples:
      | TC_ID  | user | VEHICLES         |
      | AK_001 | P126 | Vehicle_001_ADD, |
      | AR_001 | P127 | Vehicle_001_ADD, |
      | AZ_001 | P128 | Vehicle_001_ADD, |
      | CO_001 | P129 | Vehicle_001_ADD, |
      | DC_001 | P130 | Vehicle_001_ADD, |
      | IA_001 | P131 | Vehicle_001_ADD, |
      | IL_001 | P132 | Vehicle_001_ADD, |
      | IN_001 | P133 | Vehicle_001_ADD, |
      | KS_001 | P134 | Vehicle_001_ADD, |
      | KY_001 | P135 | Vehicle_001_ADD, |
      | MN_001 | P136 | Vehicle_001_ADD, |
      | MO_001 | P137 | Vehicle_001_ADD, |
      | MT_001 | P138 | Vehicle_001_ADD, |
      | ND_001 | P139 | Vehicle_001_ADD, |
      | NE_001 | P140 | Vehicle_001_ADD, |
      | NH_001 | P141 | Vehicle_001_ADD, |
      | NM_001 | P142 | Vehicle_001_ADD, |
      | NV_001 | P143 | Vehicle_001_ADD, |
      | OH_001 | P144 | Vehicle_001_ADD, |
      | OK_001 | P145 | Vehicle_001_ADD, |
      | OR_001 | P146 | Vehicle_001_ADD, |
      | PA_001 | P147 | Vehicle_001_ADD, |
      | RI_001 | P148 | Vehicle_001_ADD, |
      | SD_001 | P149 | Vehicle_001_ADD, |
      | TN_001 | P150 | Vehicle_001_ADD, |
      | UT_001 | P126 | Vehicle_001_ADD, |
      | VT_001 | P127 | Vehicle_001_ADD, |
      | WA_001 | P128 | Vehicle_001_ADD, |
      | WI_001 | P129 | Vehicle_001_ADD, |
      | WV_001 | P130 | Vehicle_001_ADD, |
      | WY_001 | P131 | Vehicle_001_ADD, |
      | AL_001 | P132 | Vehicle_001_ADD, |
      | CA_001 | P133 | Vehicle_001_ADD, |
      | CT_001 | P134 | Vehicle_001_ADD, |
      | DE_001 | P135 | Vehicle_001_ADD, |
      | HI_001 | P136 | Vehicle_001_ADD, |
      | LA_001 | P137 | Vehicle_001_ADD, |
      | MA_001 | P138 | MA_001_ADD,      |
      | MD_001 | P139 | Vehicle_001_ADD, |
      | ME_001 | P140 | Vehicle_001_ADD, |
      | MS_001 | P141 | Vehicle_001_ADD, |
      | NC_001 | P142 | Vehicle_001_ADD, |
      | NJ_001 | P143 | Vehicle_001_ADD, |
      | NY_001 | P144 | Vehicle_001_ADD, |
      | SC_001 | P145 | Vehicle_001_ADD, |
      | VA_001 | P146 | Vehicle_001_ADD, |
      | FL_001 | P147 | Vehicle_001_ADD, |
      | TX_001 | P148 | Vehicle_001_ADD, |
      | GA_001 | P149 | Vehicle_001_ADD, |
      | MI_001 | P150 | Vehicle_001_ADD, |
      | ID_001 | P126 | Vehicle_001_ADD, |

  @NewBusiness @Endorsement @OOS @Renewal
  Scenario Outline: Regression - PA - "<TC_ID>" - New Business - Endorsement - Renewal - OOS Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    And I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement
    * I exit policy
    * I logout

    @PrivatePassenger
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

    @ClassicCollectorsCar
    Examples:
      | TC_ID  | user |
      | AK_002 | P126 |
      | AR_002 | P127 |
      | AZ_002 | P128 |
      | CO_002 | P129 |
      | DC_002 | P130 |
      | IA_002 | P131 |
      | IL_002 | P132 |
      | IN_002 | P133 |
      | KS_002 | P134 |
      | KY_002 | P135 |
      | MN_002 | P136 |
      | MO_002 | P137 |
      | MT_002 | P138 |
      | ND_002 | P139 |
      | NE_002 | P140 |
      | NH_002 | P141 |
      | NM_002 | P142 |
      | NV_002 | P143 |
      | OH_002 | P144 |
      | OK_002 | P145 |
      | OR_002 | P146 |
      | PA_002 | P147 |
      | RI_002 | P148 |
      | SD_002 | P149 |
      | TN_002 | P150 |
      | UT_002 | P126 |
      | VT_002 | P127 |
      | WA_002 | P128 |
      | WI_002 | P129 |
      | WV_002 | P130 |
      | WY_002 | P131 |
      | AL_002 | P132 |
      | CA_002 | P133 |
      | CT_002 | P134 |
      | DE_002 | P135 |
      | HI_002 | P136 |
      | LA_002 | P137 |
      | MA_002 | P138 |
      | MD_002 | P139 |
      | ME_002 | P140 |
      | MS_002 | P141 |
      | NC_002 | P142 |
      | NJ_002 | P143 |
      | NY_002 | P144 |
      | SC_002 | P145 |
      | VA_002 | P146 |
      | FL_002 | P147 |
      | TX_002 | P148 |
      | GA_002 | P149 |
      | MI_002 | P150 |
      | ID_002 | P126 |

    @AntiqueCollectorsCar
    Examples:
      | TC_ID  | user |
      | AK_003 | P126 |
      | AR_003 | P127 |
      | AZ_003 | P128 |
      | CO_003 | P129 |
      | DC_003 | P130 |
      | IA_003 | P131 |
      | IL_003 | P132 |
      | IN_003 | P133 |
      | KS_003 | P134 |
      | KY_003 | P135 |
      | MN_003 | P136 |
      | MO_003 | P137 |
      | MT_003 | P138 |
      | ND_003 | P139 |
      | NE_003 | P140 |
      | NH_003 | P141 |
      | NM_003 | P142 |
      | NV_003 | P143 |
      | OH_003 | P144 |
      | OK_003 | P145 |
      | OR_003 | P146 |
      | PA_003 | P147 |
      | RI_003 | P148 |
      | SD_003 | P149 |
      | TN_003 | P150 |
      | UT_003 | P126 |
      | VT_003 | P127 |
      | WA_003 | P128 |
      | WI_003 | P129 |
      | WV_003 | P130 |
      | WY_003 | P131 |
      | AL_003 | P132 |
      | CA_003 | P133 |
      | CT_003 | P134 |
      | DE_003 | P135 |
      | HI_003 | P136 |
      | LA_003 | P137 |
      | MA_003 | P138 |
      | MD_003 | P139 |
      | ME_003 | P140 |
      | MS_003 | P141 |
      | NC_003 | P142 |
      | NJ_003 | P143 |
      | NY_003 | P144 |
      | SC_003 | P145 |
      | VA_003 | P146 |
      | FL_003 | P147 |
      | TX_003 | P148 |
      | GA_003 | P149 |
      | MI_003 | P150 |
      | ID_003 | P126 |

    @ExoticCollectorsCar
    Examples:
      | TC_ID  | user |
      | AK_004 | P126 |
      | AR_004 | P127 |
      | AZ_004 | P128 |
      | CO_004 | P129 |
      | DC_004 | P130 |
      | IA_004 | P131 |
      | IL_004 | P132 |
      | IN_004 | P133 |
      | KS_004 | P134 |
      | KY_004 | P135 |
      | MN_004 | P136 |
      | MO_004 | P137 |
      | MT_004 | P138 |
      | ND_004 | P139 |
      | NE_004 | P140 |
      | NH_004 | P141 |
      | NM_004 | P142 |
      | NV_004 | P143 |
      | OH_004 | P144 |
      | OK_004 | P145 |
      | OR_004 | P146 |
      | PA_004 | P147 |
      | RI_004 | P148 |
      | SD_004 | P149 |
      | TN_004 | P150 |
      | UT_004 | P126 |
      | VT_004 | P127 |
      | WA_004 | P128 |
      | WI_004 | P129 |
      | WV_004 | P130 |
      | WY_004 | P131 |
      | AL_004 | P132 |
      | CA_004 | P133 |
      | CT_004 | P134 |
      | DE_004 | P135 |
      | HI_004 | P136 |
      | LA_004 | P137 |
      | MA_004 | P138 |
      | MD_004 | P139 |
      | ME_004 | P140 |
      | MS_004 | P141 |
      | NJ_004 | P142 |
      | NY_004 | P143 |
      | SC_004 | P144 |
      | VA_004 | P145 |
      | FL_004 | P146 |
      | TX_004 | P147 |
      | GA_004 | P148 |
      | MI_004 | P149 |
      | ID_004 | P150 |

    @GolfCarts
    Examples:
      | TC_ID  | user |
      | AK_005 | P126 |
      | AR_005 | P127 |
      | AZ_005 | P128 |
      | CO_005 | P129 |
      | DC_005 | P130 |
      | IA_005 | P131 |
      | IL_005 | P132 |
      | IN_005 | P133 |
      | KS_005 | P134 |
      | KY_005 | P135 |
      | MN_005 | P136 |
      | MO_005 | P137 |
      | MT_005 | P138 |
      | ND_005 | P139 |
      | NE_005 | P140 |
      | NH_005 | P141 |
      | NM_005 | P142 |
      | NV_005 | P143 |
      | OH_005 | P144 |
      | OK_005 | P145 |
      | OR_005 | P146 |
      | PA_005 | P147 |
      | RI_005 | P148 |
      | SD_005 | P149 |
      | TN_005 | P150 |
      | UT_005 | P126 |
      | VT_005 | P127 |
      | WA_005 | P128 |
      | WI_005 | P129 |
      | WV_005 | P130 |
      | WY_005 | P131 |
      | AL_005 | P132 |
      | CA_005 | P133 |
      | CT_005 | P134 |
      | DE_005 | P135 |
      | HI_005 | P136 |
      | LA_005 | P137 |
      | MA_005 | P138 |
      | MD_005 | P139 |
      | ME_005 | P140 |
      | MS_005 | P141 |
      | NC_005 | P142 |
      | NJ_005 | P143 |
      | NY_005 | P144 |
      | SC_005 | P145 |
      | VA_005 | P146 |
      | FL_005 | P147 |
      | TX_005 | P148 |
      | GA_005 | P149 |
      | MI_005 | P150 |
      | ID_005 | P126 |

    @MotorHome
    Examples:
      | TC_ID  | user |
      | AK_006 | P126 |
      | AR_006 | P127 |
      | AZ_006 | P128 |
      | CO_006 | P129 |
      | DC_006 | P130 |
      | IA_006 | P131 |
      | IL_006 | P132 |
      | IN_006 | P133 |
      | KS_006 | P134 |
      | KY_006 | P135 |
      | MN_006 | P136 |
      | MO_006 | P137 |
      | MT_006 | P138 |
      | ND_006 | P139 |
      | NE_006 | P140 |
      | NH_006 | P141 |
      | NM_006 | P142 |
      | NV_006 | P143 |
      | OH_006 | P144 |
      | OK_006 | P145 |
      | OR_006 | P146 |
      | PA_006 | P147 |
      | RI_006 | P148 |
      | SD_006 | P149 |
      | TN_006 | P150 |
      | UT_006 | P126 |
      | VT_006 | P127 |
      | WA_006 | P128 |
      | WI_006 | P129 |
      | WV_006 | P130 |
      | WY_006 | P131 |
      | AL_006 | P132 |
      | CA_006 | P133 |
      | CT_006 | P134 |
      | DE_006 | P135 |
      | HI_006 | P136 |
      | LA_006 | P137 |
      | MA_006 | P138 |
      | MD_006 | P139 |
      | ME_006 | P140 |
      | MS_006 | P141 |
      | NJ_006 | P142 |
      | NY_006 | P143 |
      | SC_006 | P144 |
      | VA_006 | P145 |
      | FL_006 | P146 |
      | TX_006 | P147 |
      | GA_006 | P148 |
      | MI_006 | P149 |
      | ID_006 | P150 |

    @RecreationalTrailer
    Examples:
      | TC_ID  | user |
      | AK_007 | P126 |
      | AR_007 | P127 |
      | AZ_007 | P128 |
      | CO_007 | P129 |
      | DC_007 | P130 |
      | IL_007 | P131 |
      | IN_007 | P132 |
      | KS_007 | P133 |
      | KY_007 | P134 |
      | MN_007 | P135 |
      | MO_007 | P136 |
      | NE_007 | P137 |
      | NM_007 | P138 |
      | NV_007 | P139 |
      | OH_007 | P140 |
      | OK_007 | P141 |
      | PA_007 | P143 |
      | RI_007 | P144 |
      | TN_007 | P145 |
      | UT_007 | P146 |
      | WI_007 | P147 |
      | WY_007 | P148 |
      | AL_007 | P149 |
      | CT_007 | P150 |
      | LA_007 | P126 |
      | MA_007 | P127 |
      | MD_007 | P128 |
      | NJ_007 | P129 |
      | NY_007 | P130 |
      | SC_007 | P131 |
      | VA_007 | P132 |
      | FL_007 | P133 |
      | TX_007 | P134 |
      | GA_007 | P135 |
      | MI_007 | P136 |

    @MotorcyclesMopedsScooters
    Examples:
      | TC_ID  | user |
      | AK_008 | P126 |
      | AR_008 | P127 |
      | AZ_008 | P128 |
      | CO_008 | P129 |
      | DC_008 | P130 |
      | IA_008 | P131 |
      | IL_008 | P132 |
      | IN_008 | P133 |
      | KS_008 | P134 |
      | KY_008 | P135 |
      | MN_008 | P136 |
      | MO_008 | P137 |
      | MT_008 | P138 |
      | ND_008 | P139 |
      | NE_008 | P140 |
      | NH_008 | P141 |
      | NM_008 | P142 |
      | NV_008 | P143 |
      | OH_008 | P144 |
      | OK_008 | P145 |
      | OR_008 | P146 |
      | PA_008 | P147 |
      | RI_008 | P148 |
      | SD_008 | P149 |
      | TN_008 | P150 |
      | UT_008 | P126 |
      | VT_008 | P127 |
      | WA_008 | P128 |
      | WI_008 | P129 |
      | WV_008 | P130 |
      | WY_008 | P131 |
      | AL_008 | P132 |
      | CA_008 | P133 |
      | CT_008 | P134 |
      | DE_008 | P135 |
      | HI_008 | P136 |
      | LA_008 | P137 |
      | MA_008 | P138 |
      | MD_008 | P139 |
      | ME_008 | P140 |
      | MS_008 | P141 |
      | NC_008 | P142 |
      | NJ_008 | P143 |
      | NY_008 | P144 |
      | SC_008 | P145 |
      | VA_008 | P146 |
      | FL_008 | P147 |
      | TX_008 | P148 |
      | GA_008 | P149 |
      | MI_008 | P150 |
      | ID_008 | P126 |

    @CollectorsTrailer
    Examples:
      | TC_ID  | user |
      | AK_009 | P126 |
      | CO_009 | P127 |
      | AL_009 | P128 |
      | CT_009 | P129 |
      | NJ_009 | P130 |
      | NY_009 | P131 |
      | FL_009 | P132 |
      | GA_009 | P133 |

    @Snowmobiles
    Examples:
      | TC_ID  | user |
      | AK_010 | P126 |
      | AR_010 | P127 |
      | AZ_010 | P128 |
      | CO_010 | P129 |
      | DC_010 | P130 |
      | IA_010 | P131 |
      | IL_010 | P132 |
      | IN_010 | P133 |
      | KS_010 | P134 |
      | KY_010 | P135 |
      | MN_010 | P136 |
      | MO_010 | P137 |
      | MT_010 | P138 |
      | NE_010 | P139 |
      | NH_010 | P140 |
      | NM_010 | P141 |
      | NV_010 | P142 |
      | OH_010 | P143 |
      | OK_010 | P144 |
      | PA_010 | P145 |
      | RI_010 | P146 |
      | SD_010 | P147 |
      | TN_010 | P148 |
      | UT_010 | P149 |
      | VT_010 | P150 |
      | WA_010 | P126 |
      | WI_010 | P127 |
      | WY_010 | P128 |
      | AL_010 | P129 |
      | CT_010 | P130 |
      | LA_010 | P131 |
      | MA_010 | P132 |
      | MD_010 | P133 |
      | ME_010 | P134 |
      | MS_010 | P135 |
      | NJ_010 | P136 |
      | NY_010 | P137 |
      | SC_010 | P138 |
      | VA_010 | P139 |
      | TX_010 | P140 |
      | GA_010 | P141 |
      | MI_010 | P142 |
      | ID_010 | P143 |

    @AllTerrainVehicles
    Examples:
      | TC_ID  | user |
      | AK_011 | P126 |
      | AR_011 | P127 |
      | AZ_011 | P128 |
      | CO_011 | P129 |
      | DC_011 | P130 |
      | IA_011 | P131 |
      | IL_011 | P132 |
      | IN_011 | P133 |
      | KS_011 | P134 |
      | KY_011 | P135 |
      | MN_011 | P136 |
      | MO_011 | P137 |
      | MT_011 | P138 |
      | NE_011 | P139 |
      | NH_011 | P140 |
      | NM_011 | P141 |
      | NV_011 | P142 |
      | OH_011 | P143 |
      | OK_011 | P144 |
      | PA_011 | P145 |
      | RI_011 | P146 |
      | SD_011 | P147 |
      | TN_011 | P148 |
      | UT_011 | P149 |
      | VT_011 | P150 |
      | WA_011 | P126 |
      | WI_011 | P127 |
      | WY_011 | P128 |
      | AL_011 | P129 |
      | CT_011 | P130 |
      | LA_011 | P131 |
      | MA_011 | P132 |
      | MD_011 | P133 |
      | ME_011 | P134 |
      | MS_011 | P135 |
      | NJ_011 | P136 |
      | NY_011 | P137 |
      | SC_011 | P138 |
      | VA_011 | P139 |
      | TX_011 | P140 |
      | GA_011 | P141 |
      | MI_011 | P142 |
      | ID_011 | P143 |

    @DuneBuggies
    Examples:
      | TC_ID  | user |
      | AK_012 | P126 |
      | AR_012 | P127 |
      | AZ_012 | P128 |
      | CO_012 | P129 |
      | DC_012 | P130 |
      | IA_012 | P131 |
      | IL_012 | P132 |
      | IN_012 | P133 |
      | KS_012 | P134 |
      | KY_012 | P135 |
      | MN_012 | P136 |
      | MO_012 | P137 |
      | MT_012 | P138 |
      | NE_012 | P139 |
      | NH_012 | P140 |
      | NM_012 | P141 |
      | NV_012 | P142 |
      | OH_012 | P143 |
      | OK_012 | P144 |
      | PA_012 | P145 |
      | RI_012 | P146 |
      | SD_012 | P147 |
      | TN_012 | P148 |
      | UT_012 | P149 |
      | VT_012 | P150 |
      | WA_012 | P126 |
      | WI_012 | P127 |
      | WY_012 | P128 |
      | AL_012 | P129 |
      | CT_012 | P130 |
      | LA_012 | P131 |
      | MA_012 | P132 |
      | MD_012 | P133 |
      | ME_012 | P134 |
      | MS_012 | P135 |
      | NJ_012 | P136 |
      | NY_012 | P137 |
      | SC_012 | P138 |
      | VA_012 | P139 |
      | TX_012 | P140 |
      | GA_012 | P141 |
      | MI_012 | P142 |
      | ID_012 | P143 |

    @TravelTrailer
    Examples:
      | TC_ID  | user |
      | IA_013 | P126 |
      | MT_013 | P127 |
      | ND_013 | P128 |
      | NH_013 | P129 |
      | SD_013 | P130 |
      | VT_013 | P131 |
      | WA_013 | P132 |
      | CA_013 | P133 |
      | DE_013 | P134 |
      | HI_013 | P135 |
      | ME_013 | P136 |
      | MS_013 | P137 |
      | NC_013 | P138 |
      | ID_013 | P139 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - PA - "<TC_ID>" - New Business + NB Endorsement + RN - Private Passenger

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals

    And I bind a quote

    When I think for 30 to 45 seconds
    * I override subjectivities

    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    And I think for 80 to 85 seconds
    * I check premiums if they are equal for "New Business" and "Endorsement"

    Then I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    @PrivatePassenger
    Examples:
      | TC_ID  |
      | AK_001 |
      | AR_001 |
      | AZ_001 |
      | CO_001 |
      | DC_001 |
      | IA_001 |
      | IL_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MN_001 |
      | MO_001 |
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
      | WV_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MD_001 |
      | ME_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | VA_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |
      | MI_001 |
      | ID_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - PA - "<TC_ID>" - New Business - Endorsement - Renewal - OOS Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    And I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    And I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Then I issue an endorsement
    * I exit policy
    * I logout

    @PrivatePassenger
    Examples:
      | TC_ID  |
      | AK_001 |
      | AR_001 |
      | AZ_001 |
      | CO_001 |
      | DC_001 |
      | IA_001 |
      | IL_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MN_001 |
      | MO_001 |
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
      | WV_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MD_001 |
      | ME_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | VA_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |
      | MI_001 |
      | ID_001 |

    @ClassicCollectorsCar
    Examples:
      | TC_ID  |
      | AK_002 |
      | AR_002 |
      | AZ_002 |
      | CO_002 |
      | DC_002 |
      | IA_002 |
      | IL_002 |
      | IN_002 |
      | KS_002 |
      | KY_002 |
      | MN_002 |
      | MO_002 |
      | MT_002 |
      | ND_002 |
      | NE_002 |
      | NH_002 |
      | NM_002 |
      | NV_002 |
      | OH_002 |
      | OK_002 |
      | OR_002 |
      | PA_002 |
      | RI_002 |
      | SD_002 |
      | TN_002 |
      | UT_002 |
      | VT_002 |
      | WA_002 |
      | WI_002 |
      | WV_002 |
      | WY_002 |
      | AL_002 |
      | CA_002 |
      | CT_002 |
      | DE_002 |
      | HI_002 |
      | LA_002 |
      | MA_002 |
      | MD_002 |
      | ME_002 |
      | MS_002 |
      | NC_002 |
      | NJ_002 |
      | NY_002 |
      | SC_002 |
      | VA_002 |
      | FL_002 |
      | TX_002 |
      | GA_002 |
      | MI_002 |
      | ID_002 |

    @AntiqueCollectorsCar
    Examples:
      | TC_ID  |
      | AK_003 |
      | AR_003 |
      | AZ_003 |
      | CO_003 |
      | DC_003 |
      | IA_003 |
      | IL_003 |
      | IN_003 |
      | KS_003 |
      | KY_003 |
      | MN_003 |
      | MO_003 |
      | MT_003 |
      | ND_003 |
      | NE_003 |
      | NH_003 |
      | NM_003 |
      | NV_003 |
      | OH_003 |
      | OK_003 |
      | OR_003 |
      | PA_003 |
      | RI_003 |
      | SD_003 |
      | TN_003 |
      | UT_003 |
      | VT_003 |
      | WA_003 |
      | WI_003 |
      | WV_003 |
      | WY_003 |
      | AL_003 |
      | CA_003 |
      | CT_003 |
      | DE_003 |
      | HI_003 |
      | LA_003 |
      | MA_003 |
      | MD_003 |
      | ME_003 |
      | MS_003 |
      | NC_003 |
      | NJ_003 |
      | NY_003 |
      | SC_003 |
      | VA_003 |
      | FL_003 |
      | TX_003 |
      | GA_003 |
      | MI_003 |
      | ID_003 |

    @ExoticCollectorsCar
    Examples:
      | TC_ID  |
      | AK_004 |
      | AR_004 |
      | AZ_004 |
      | CO_004 |
      | DC_004 |
      | IA_004 |
      | IL_004 |
      | IN_004 |
      | KS_004 |
      | KY_004 |
      | MN_004 |
      | MO_004 |
      | MT_004 |
      | ND_004 |
      | NE_004 |
      | NH_004 |
      | NM_004 |
      | NV_004 |
      | OH_004 |
      | OK_004 |
      | OR_004 |
      | PA_004 |
      | RI_004 |
      | SD_004 |
      | TN_004 |
      | UT_004 |
      | VT_004 |
      | WA_004 |
      | WI_004 |
      | WV_004 |
      | WY_004 |
      | AL_004 |
      | CA_004 |
      | CT_004 |
      | DE_004 |
      | HI_004 |
      | LA_004 |
      | MA_004 |
      | MD_004 |
      | ME_004 |
      | MS_004 |
      | NJ_004 |
      | NY_004 |
      | SC_004 |
      | VA_004 |
      | FL_004 |
      | TX_004 |
      | GA_004 |
      | MI_004 |
      | ID_004 |

    @GolfCarts
    Examples:
      | TC_ID  |
      | AK_005 |
      | AR_005 |
      | AZ_005 |
      | CO_005 |
      | DC_005 |
      | IA_005 |
      | IL_005 |
      | IN_005 |
      | KS_005 |
      | KY_005 |
      | MN_005 |
      | MO_005 |
      | MT_005 |
      | ND_005 |
      | NE_005 |
      | NH_005 |
      | NM_005 |
      | NV_005 |
      | OH_005 |
      | OK_005 |
      | OR_005 |
      | PA_005 |
      | RI_005 |
      | SD_005 |
      | TN_005 |
      | UT_005 |
      | VT_005 |
      | WA_005 |
      | WI_005 |
      | WV_005 |
      | WY_005 |
      | AL_005 |
      | CA_005 |
      | CT_005 |
      | DE_005 |
      | HI_005 |
      | LA_005 |
      | MA_005 |
      | MD_005 |
      | ME_005 |
      | MS_005 |
      | NC_005 |
      | NJ_005 |
      | NY_005 |
      | SC_005 |
      | VA_005 |
      | FL_005 |
      | TX_005 |
      | GA_005 |
      | MI_005 |
      | ID_005 |

    @MotorHome
    Examples:
      | TC_ID  |
      | AK_006 |
      | AR_006 |
      | AZ_006 |
      | CO_006 |
      | DC_006 |
      | IA_006 |
      | IL_006 |
      | IN_006 |
      | KS_006 |
      | KY_006 |
      | MN_006 |
      | MO_006 |
      | MT_006 |
      | ND_006 |
      | NE_006 |
      | NH_006 |
      | NM_006 |
      | NV_006 |
      | OH_006 |
      | OK_006 |
      | OR_006 |
      | PA_006 |
      | RI_006 |
      | SD_006 |
      | TN_006 |
      | UT_006 |
      | VT_006 |
      | WA_006 |
      | WI_006 |
      | WV_006 |
      | WY_006 |
      | AL_006 |
      | CA_006 |
      | CT_006 |
      | DE_006 |
      | HI_006 |
      | LA_006 |
      | MA_006 |
      | MD_006 |
      | ME_006 |
      | MS_006 |
      | NJ_006 |
      | NY_006 |
      | SC_006 |
      | VA_006 |
      | FL_006 |
      | TX_006 |
      | GA_006 |
      | MI_006 |
      | ID_006 |

    @RecreationalTrailer
    Examples:
      | TC_ID  |
      | AK_007 |
      | AR_007 |
      | AZ_007 |
      | CO_007 |
      | DC_007 |
      | IL_007 |
      | IN_007 |
      | KS_007 |
      | KY_007 |
      | MN_007 |
      | MO_007 |
      | NE_007 |
      | NM_007 |
      | NV_007 |
      | OH_007 |
      | OK_007 |
      | PA_007 |
      | RI_007 |
      | TN_007 |
      | UT_007 |
      | WI_007 |
      | WY_007 |
      | AL_007 |
      | CT_007 |
      | LA_007 |
      | MA_007 |
      | MD_007 |
      | NJ_007 |
      | NY_007 |
      | SC_007 |
      | VA_007 |
      | FL_007 |
      | TX_007 |
      | GA_007 |
      | MI_007 |

    @MotorcyclesMopedsScooters
    Examples:
      | TC_ID  |
      | AK_008 |
      | AR_008 |
      | AZ_008 |
      | CO_008 |
      | DC_008 |
      | IA_008 |
      | IL_008 |
      | IN_008 |
      | KS_008 |
      | KY_008 |
      | MN_008 |
      | MO_008 |
      | MT_008 |
      | ND_008 |
      | NE_008 |
      | NH_008 |
      | NM_008 |
      | NV_008 |
      | OH_008 |
      | OK_008 |
      | OR_008 |
      | PA_008 |
      | RI_008 |
      | SD_008 |
      | TN_008 |
      | UT_008 |
      | VT_008 |
      | WA_008 |
      | WI_008 |
      | WV_008 |
      | WY_008 |
      | AL_008 |
      | CA_008 |
      | CT_008 |
      | DE_008 |
      | HI_008 |
      | LA_008 |
      | MA_008 |
      | MD_008 |
      | ME_008 |
      | MS_008 |
      | NC_008 |
      | NJ_008 |
      | NY_008 |
      | SC_008 |
      | VA_008 |
      | FL_008 |
      | TX_008 |
      | GA_008 |
      | MI_008 |
      | ID_008 |

    @CollectorsTrailer
    Examples:
      | TC_ID  |
      | AK_009 |
      | CO_009 |
      | AL_009 |
      | CT_009 |
      | NJ_009 |
      | NY_009 |
      | FL_009 |
      | GA_009 |

    @Snowmobiles
    Examples:
      | TC_ID  |
      | AK_010 |
      | AR_010 |
      | AZ_010 |
      | CO_010 |
      | DC_010 |
      | IA_010 |
      | IL_010 |
      | IN_010 |
      | KS_010 |
      | KY_010 |
      | MN_010 |
      | MO_010 |
      | MT_010 |
      | NE_010 |
      | NH_010 |
      | NM_010 |
      | NV_010 |
      | OH_010 |
      | OK_010 |
      | PA_010 |
      | RI_010 |
      | SD_010 |
      | TN_010 |
      | UT_010 |
      | VT_010 |
      | WA_010 |
      | WI_010 |
      | WY_010 |
      | AL_010 |
      | CT_010 |
      | LA_010 |
      | MA_010 |
      | MD_010 |
      | ME_010 |
      | MS_010 |
      | NJ_010 |
      | NY_010 |
      | SC_010 |
      | VA_010 |
      | TX_010 |
      | GA_010 |
      | MI_010 |
      | ID_010 |

    @AllTerrainVehicles
    Examples:
      | TC_ID  |
      | AK_011 |
      | AR_011 |
      | AZ_011 |
      | CO_011 |
      | DC_011 |
      | IA_011 |
      | IL_011 |
      | IN_011 |
      | KS_011 |
      | KY_011 |
      | MN_011 |
      | MO_011 |
      | MT_011 |
      | NE_011 |
      | NH_011 |
      | NM_011 |
      | NV_011 |
      | OH_011 |
      | OK_011 |
      | PA_011 |
      | RI_011 |
      | SD_011 |
      | TN_011 |
      | UT_011 |
      | VT_011 |
      | WA_011 |
      | WI_011 |
      | WY_011 |
      | AL_011 |
      | CT_011 |
      | LA_011 |
      | MA_011 |
      | MD_011 |
      | ME_011 |
      | MS_011 |
      | NJ_011 |
      | NY_011 |
      | SC_011 |
      | VA_011 |
      | TX_011 |
      | GA_011 |
      | MI_011 |
      | ID_011 |

    @DuneBuggies
    Examples:
      | TC_ID  |
      | AK_012 |
      | AR_012 |
      | AZ_012 |
      | CO_012 |
      | DC_012 |
      | IA_012 |
      | IL_012 |
      | IN_012 |
      | KS_012 |
      | KY_012 |
      | MN_012 |
      | MO_012 |
      | MT_012 |
      | NE_012 |
      | NH_012 |
      | NM_012 |
      | NV_012 |
      | OH_012 |
      | OK_012 |
      | PA_012 |
      | RI_012 |
      | SD_012 |
      | TN_012 |
      | UT_012 |
      | VT_012 |
      | WA_012 |
      | WI_012 |
      | WY_012 |
      | AL_012 |
      | CT_012 |
      | LA_012 |
      | MA_012 |
      | MD_012 |
      | ME_012 |
      | MS_012 |
      | NJ_012 |
      | NY_012 |
      | SC_012 |
      | VA_012 |
      | TX_012 |
      | GA_012 |
      | MI_012 |
      | ID_012 |

    @TravelTrailer
    Examples:
      | TC_ID  |
      | IA_013 |
      | MT_013 |
      | ND_013 |
      | NH_013 |
      | SD_013 |
      | VT_013 |
      | WA_013 |
      | CA_013 |
      | DE_013 |
      | HI_013 |
      | ME_013 |
      | MS_013 |
      | NC_013 |
      | ID_013 |