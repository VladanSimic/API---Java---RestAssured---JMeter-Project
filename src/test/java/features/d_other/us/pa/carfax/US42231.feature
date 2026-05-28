@PersonalAuto @US42231 @TF958 @TF107 @TF880
Feature: Carfax UI - Private & High Value Passenger Vehicles

  As an underwriter I would like to see Vehicle Characteristics for
  Private & High Value Passenger Vehicles so that better business insights
  to the vehicles we're adding into our books.

  @NewBusiness @S1 @TC84913 @TC84914 @TC84917 @TC84916
  Scenario Outline: Carfax UI US42231 - S1 - New Business - "<TC_ID>" - "<effectiveDate>" on PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
    Examples:
      | TC_ID  | user | effectiveDate |
      | AK_001 | P126 | TODAY         |
      | AR_001 | P127 | TODAY         |
      | AZ_001 | P128 | TODAY         |
      | CO_001 | P129 | TODAY         |
      | DC_001 | P130 | TODAY         |
      | IA_001 | P131 | TODAY         |
      | IL_001 | P132 | TODAY         |
      | IN_001 | P133 | TODAY         |
      | KS_001 | P134 | TODAY         |
      | KY_001 | P135 | TODAY         |
      | MN_001 | P136 | TODAY         |
      | MO_001 | P137 | TODAY         |
      | MT_001 | P138 | TODAY         |
      | ND_001 | P139 | TODAY         |
      | NE_001 | P140 | TODAY         |
      | NH_001 | P141 | TODAY         |
      | NM_001 | P142 | TODAY         |
      | NV_001 | P143 | TODAY         |
      | OH_001 | P144 | TODAY         |
      | OK_001 | P145 | TODAY         |
      | OR_001 | P146 | TODAY         |
      | PA_001 | P147 | TODAY         |
      | RI_001 | P148 | TODAY         |
      | SD_001 | P149 | TODAY         |
      | TN_001 | P150 | TODAY         |
      | UT_001 | P126 | TODAY         |
      | VT_001 | P127 | TODAY         |
      | WA_001 | P128 | TODAY         |
      | WI_001 | P129 | TODAY         |
      | WV_001 | P130 | TODAY         |
      | WY_001 | P131 | TODAY         |
      | AL_001 | P132 | TODAY         |
      | CA_001 | P133 | TODAY         |
      | CT_001 | P134 | TODAY         |
      | DE_001 | P135 | TODAY         |
      | HI_001 | P136 | TODAY         |
      | LA_001 | P137 | TODAY         |
      | MA_001 | P138 | TODAY         |
      | MD_001 | P139 | TODAY         |
      | ME_001 | P140 | TODAY         |
      | MS_001 | P141 | TODAY         |
      | NC_001 | P142 | TODAY         |
      | NJ_001 | P143 | TODAY         |
      | NY_001 | P144 | TODAY         |
      | SC_001 | P145 | TODAY         |
      | VA_001 | P146 | TODAY         |
      | FL_001 | P147 | TODAY         |
      | TX_001 | P148 | TODAY         |
      | GA_001 | P149 | TODAY         |
      | MI_001 | P150 | TODAY         |
      | ID_001 | P126 | TODAY         |

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate |
      | AR_001 | P126 | 10/01/2024    |
      | IL_001 | P127 | 10/01/2024    |
      | MN_001 | P128 | 10/01/2024    |
      | KY_001 | P129 | 10/01/2024    |
      | DC_001 | P130 | 10/01/2024    |
      | TX_001 | P131 | 10/01/2024    |
      | NC_001 | P132 | 11/15/2024    |
      | CA_001 | P133 | 12/16/2024    |

  @NewBusiness @S1a
  Scenario Outline: Carfax UI US42231 - S1a - New Business - "<TC_ID>" - "<effectiveDate>" on day before PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate |
      | AZ_001 | P126 | 09/30/2024    |
      | IL_001 | P127 | 09/30/2024    |
      | MN_001 | P128 | 09/30/2024    |
      | KY_001 | P129 | 09/30/2024    |
      | DC_001 | P130 | 09/30/2024    |
      | TX_001 | P131 | 09/30/2024    |
      | NC_001 | P132 | 11/14/2024    |
      | CA_001 | P133 | 12/15/2024    |

  @NewBusiness @Endorsement @S2 @TC84914 @TC84917
  Scenario Outline: Carfax UI US42231 - S2 - New Business - Endorsement - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
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

  @NewBusiness @Renewal @S3 @TC84917 @TC84916
  Scenario Outline: Carfax UI US42231 - S3 - New Business - Renewal - "<TC_ID>" - "<effectiveDate>" on PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
    Examples:
      | TC_ID  | user | effectiveDate |
      | AK_003 | P126 | TODAY         |
      | AR_003 | P127 | TODAY         |
      | AZ_003 | P128 | TODAY         |
      | CO_003 | P129 | TODAY         |
      | DC_003 | P130 | TODAY         |
      | IA_003 | P131 | TODAY         |
      | IL_003 | P132 | TODAY         |
      | IN_003 | P133 | TODAY         |
      | KS_003 | P134 | TODAY         |
      | KY_003 | P135 | TODAY         |
      | MN_003 | P136 | TODAY         |
      | MO_003 | P137 | TODAY         |
      | MT_003 | P138 | TODAY         |
      | ND_003 | P139 | TODAY         |
      | NE_003 | P140 | TODAY         |
      | NH_003 | P141 | TODAY         |
      | NM_003 | P142 | TODAY         |
      | NV_003 | P143 | TODAY         |
      | OH_003 | P144 | TODAY         |
      | OK_003 | P145 | TODAY         |
      | OR_003 | P146 | TODAY         |
      | PA_003 | P147 | TODAY         |
      | RI_003 | P148 | TODAY         |
      | SD_003 | P149 | TODAY         |
      | TN_003 | P150 | TODAY         |
      | UT_003 | P126 | TODAY         |
      | VT_003 | P127 | TODAY         |
      | WA_003 | P128 | TODAY         |
      | WI_003 | P129 | TODAY         |
      | WV_003 | P130 | TODAY         |
      | WY_003 | P131 | TODAY         |
      | AL_003 | P132 | TODAY         |
      | CA_003 | P133 | TODAY         |
      | CT_003 | P134 | TODAY         |
      | DE_003 | P135 | TODAY         |
      | HI_003 | P136 | TODAY         |
      | LA_003 | P137 | TODAY         |
      | MA_003 | P138 | TODAY         |
      | MD_003 | P139 | TODAY         |
      | ME_003 | P140 | TODAY         |
      | MS_003 | P141 | TODAY         |
      | NC_003 | P142 | TODAY         |
      | NJ_003 | P143 | TODAY         |
      | NY_003 | P144 | TODAY         |
      | SC_003 | P145 | TODAY         |
      | VA_003 | P146 | TODAY         |
      | FL_003 | P147 | TODAY         |
      | TX_003 | P148 | TODAY         |
      | GA_003 | P149 | TODAY         |
      | MI_003 | P150 | TODAY         |
      | ID_003 | P126 | TODAY         |

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate |
      | CO_003 | P126 | 11/15/2023    |
      | IL_003 | P127 | 11/26/2023    |
      | MN_003 | P128 | 11/26/2023    |
      | KY_003 | P129 | 12/06/2023    |
      | DC_003 | P130 | 11/18/2023    |
      | TX_003 | P131 | 12/06/2023    |
      | NC_003 | P132 | 11/15/2023    |
      | CA_003 | P133 | 12/16/2023    |

  @NewBusiness @Renewal @S3a
  Scenario Outline: Carfax UI US42231 - S3a - New Business - Renewal - "<TC_ID>" - "<effectiveDate>" on day before PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate |
      | IA_003 | P126 | 11/14/2023    |
      | IL_003 | P127 | 11/25/2023    |
      | MN_003 | P128 | 11/25/2023    |
      | KY_003 | P129 | 12/05/2023    |
      | DC_003 | P130 | 11/17/2023    |
      | TX_003 | P131 | 12/05/2023    |
      | NC_003 | P132 | 11/14/2023    |
      | CA_003 | P133 | 12/15/2023    |

  @NewBusiness @Endorsement @OOS @S4 @TC84917 @TC84916
  Scenario Outline: Carfax UI US42231 - S4 - New Business - Endorsement - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
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
      | NC_004 | P142 |
      | NJ_004 | P143 |
      | NY_004 | P144 |
      | SC_004 | P145 |
      | VA_004 | P146 |
      | FL_004 | P147 |
      | TX_004 | P148 |
      | GA_004 | P149 |
      | MI_004 | P150 |
      | ID_004 | P126 |

  @NewBusiness @Renewal @OOS @S5 @TC84917 @TC84916
  Scenario Outline: Carfax UI US42231 - S5 - New Business - Renewal - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
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

  @NewBusiness @Endorsement @Renewal @OOS @S6 @TC84917 @TC84916
  Scenario Outline: Carfax UI US42231 - S6 - New Business - Endorsement - Renewal - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type | Torque |
      | Empty                | Empty       | Empty      | Empty       | Empty       | Empty  |

    @PrivatePassenger
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
      | NC_006 | P142 |
      | NJ_006 | P143 |
      | NY_006 | P144 |
      | SC_006 | P145 |
      | VA_006 | P146 |
      | FL_006 | P147 |
      | TX_006 | P148 |
      | GA_006 | P149 |
      | MI_006 | P150 |
      | ID_006 | P126 |

  @NewBusiness @S7 @TC84920
  Scenario Outline: Carfax UI US42231 - S7 - Negative - New Business -  "<TC_ID>" - "<effectiveDate>" on PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Additional_Vehicles" to "<vehicle>"
    * I reload "us/US42231" vehicle data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    Examples:
      | TC_ID  | user | effectiveDate | vehicle             |
      | AK_001 | P126 | TODAY         | AK_005_Vehicle_005, |
      | AR_001 | P127 | TODAY         | AK_006_Vehicle_006, |
      | AZ_001 | P128 | TODAY         | AK_007_Vehicle_007, |
      | CO_001 | P129 | TODAY         | AK_008_Vehicle_008, |
      | DC_001 | P130 | TODAY         | AK_009_Vehicle_009, |
      | IA_001 | P131 | TODAY         | AK_010_Vehicle_010, |
      | IL_001 | P132 | TODAY         | AK_011_Vehicle_011, |
      | IN_001 | P133 | TODAY         | AK_012_Vehicle_012, |
      | KS_001 | P134 | TODAY         | AK_005_Vehicle_005, |
      | KY_001 | P135 | TODAY         | AK_006_Vehicle_006, |
      | MN_001 | P136 | TODAY         | AK_007_Vehicle_007, |
      | MO_001 | P137 | TODAY         | AK_008_Vehicle_008, |
      | MT_001 | P138 | TODAY         | AK_008_Vehicle_008, |
      | ND_001 | P139 | TODAY         | ND_013_Vehicle_013, |
      | NE_001 | P140 | TODAY         | AK_011_Vehicle_011, |
      | NH_001 | P141 | TODAY         | AK_012_Vehicle_012, |
      | NM_001 | P142 | TODAY         | AK_005_Vehicle_005, |
      | NV_001 | P143 | TODAY         | AK_006_Vehicle_006, |
      | OH_001 | P144 | TODAY         | AK_007_Vehicle_007, |
      | OK_001 | P145 | TODAY         | AK_008_Vehicle_008, |
      | OR_001 | P146 | TODAY         | AK_008_Vehicle_008, |
      | PA_001 | P147 | TODAY         | AK_010_Vehicle_010, |
      | RI_001 | P148 | TODAY         | AK_011_Vehicle_011, |
      | SD_001 | P149 | TODAY         | AK_012_Vehicle_012, |
      | TN_001 | P150 | TODAY         | AK_005_Vehicle_005, |
      | UT_001 | P126 | TODAY         | AK_006_Vehicle_006, |
      | VT_001 | P127 | TODAY         | AK_006_Vehicle_006, |
      | WA_001 | P128 | TODAY         | AK_008_Vehicle_008, |
      | WI_001 | P129 | TODAY         | AK_008_Vehicle_008, |
      | WV_001 | P130 | TODAY         | AK_008_Vehicle_008, |
      | WY_001 | P131 | TODAY         | AK_011_Vehicle_011, |
      | AL_001 | P132 | TODAY         | AK_012_Vehicle_012, |
      | CA_001 | P133 | TODAY         | AK_005_Vehicle_005, |
      | CT_001 | P134 | TODAY         | AK_006_Vehicle_006, |
      | DE_001 | P135 | TODAY         | ND_013_Vehicle_013, |
      | HI_001 | P136 | TODAY         | AK_008_Vehicle_008, |
      | LA_001 | P137 | TODAY         | AK_008_Vehicle_008, |
      | MA_001 | P138 | TODAY         | AK_010_Vehicle_010, |
      | MD_001 | P139 | TODAY         | AK_011_Vehicle_011, |
      | ME_001 | P140 | TODAY         | AK_012_Vehicle_012, |
      | MS_001 | P141 | TODAY         | AK_005_Vehicle_005, |
      | NC_001 | P142 | TODAY         | AK_005_Vehicle_005, |
      | NJ_001 | P143 | TODAY         | AK_007_Vehicle_007, |
      | NY_001 | P144 | TODAY         | AK_008_Vehicle_008, |
      | SC_001 | P145 | TODAY         | AK_008_Vehicle_008, |
      | VA_001 | P146 | TODAY         | AK_010_Vehicle_010, |
      | FL_001 | P147 | TODAY         | AK_007_Vehicle_007, |
      | TX_001 | P148 | TODAY         | AK_012_Vehicle_012, |
      | GA_001 | P149 | TODAY         | AK_010_Vehicle_010, |
      | MI_001 | P150 | TODAY         | AK_011_Vehicle_011, |
      | ID_001 | P126 | TODAY         | AK_012_Vehicle_012, |

    @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate | vehicle             |
      | AR_001 | P126 | 10/01/2024    | AK_005_Vehicle_005, |
      | IL_001 | P127 | 10/01/2024    | AK_006_Vehicle_006, |
      | MN_001 | P128 | 10/01/2024    | AK_007_Vehicle_007, |
      | KY_001 | P129 | 10/01/2024    | AK_008_Vehicle_008, |
      | DC_001 | P130 | 10/01/2024    | AK_009_Vehicle_009, |
      | TX_001 | P131 | 10/01/2024    | AK_010_Vehicle_010, |
      | NC_001 | P132 | 11/15/2024    | AK_011_Vehicle_011, |
      | CA_001 | P133 | 12/16/2024    | AK_012_Vehicle_012, |

  @NewBusiness @Endorsement @S8 @TC84920
  Scenario Outline: Carfax UI US42231 - S8 - Negative - New Business - Endorsement - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Additional_Vehicles" to "<vehicle>"
    * I set "Additional_Vehicles_END" to "<vehicleEND>"
    * I reload "us/US42231" vehicle data

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
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    Examples:
      | TC_ID  | user | vehicle             | vehicleEND              |
      | AK_002 | P126 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | AR_002 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AZ_002 | P128 | AK_007_Vehicle_007, | AK_007_Vehicle_007_ADD, |
      | CO_002 | P129 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | DC_002 | P130 | AK_009_Vehicle_009, | AK_009_Vehicle_009_ADD, |
      | IA_002 | P131 | AK_010_Vehicle_010, | AK_010_Vehicle_010_ADD, |
      | IL_002 | P132 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | IN_002 | P133 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | KS_002 | P134 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | KY_002 | P135 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_002 | P136 | AK_007_Vehicle_007, | AK_007_Vehicle_007_ADD, |
      | MO_002 | P137 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | MT_002 | P138 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | ND_002 | P139 | ND_013_Vehicle_013, | ND_013_Vehicle_013_ADD, |
      | NE_002 | P140 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | NH_002 | P141 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | NM_002 | P142 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | NV_002 | P143 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | OH_002 | P144 | AK_007_Vehicle_007, | AK_007_Vehicle_007_ADD, |
      | OK_002 | P145 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | OR_002 | P146 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | PA_002 | P147 | AK_010_Vehicle_010, | AK_010_Vehicle_010_ADD, |
      | RI_002 | P148 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | SD_002 | P149 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | TN_002 | P150 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | UT_002 | P126 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | VT_002 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | WA_002 | P128 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | WI_002 | P129 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | WV_002 | P130 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | WY_002 | P131 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | AL_002 | P132 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | CA_002 | P133 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | CT_002 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | DE_002 | P135 | ND_013_Vehicle_013, | ND_013_Vehicle_013_ADD, |
      | HI_002 | P136 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | LA_002 | P137 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | MA_002 | P138 | AK_010_Vehicle_010, | AK_010_Vehicle_010_ADD, |
      | MD_002 | P139 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | ME_002 | P140 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | MS_002 | P141 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | NC_002 | P142 | AK_005_Vehicle_005, | AK_005_Vehicle_005_ADD, |
      | NJ_002 | P143 | AK_007_Vehicle_007, | AK_007_Vehicle_007_ADD, |
      | NY_002 | P144 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | SC_002 | P145 | AK_008_Vehicle_008, | AK_008_Vehicle_008_ADD, |
      | VA_002 | P146 | AK_010_Vehicle_010, | AK_010_Vehicle_010_ADD, |
      | FL_002 | P147 | AK_007_Vehicle_007, | AK_007_Vehicle_007_ADD, |
      | TX_002 | P148 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |
      | GA_002 | P149 | AK_010_Vehicle_010, | AK_010_Vehicle_010_ADD, |
      | MI_002 | P150 | AK_011_Vehicle_011, | AK_011_Vehicle_011_ADD, |
      | ID_002 | P126 | AK_012_Vehicle_012, | AK_012_Vehicle_012_ADD, |

  @NewBusiness @Renewal @S9 @TC84920
  Scenario Outline: Carfax UI US42231 - S9 - Negative - New Business - Renewal - "<TC_ID>" - "<effectiveDate>" on PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Additional_Vehicles" to "<vehicle>"
    * I set "Additional_Vehicles_RNW" to "<vehicleRNW>"
    * I reload "us/US42231" vehicle data

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
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed


    Examples:
      | TC_ID  | user | effectiveDate | vehicle             | vehicleRNW              |
      | AK_003 | P126 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AR_003 | P127 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AZ_003 | P128 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | CO_003 | P129 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | DC_003 | P130 | TODAY         | AK_006_Vehicle_006, | AK_009_Vehicle_009_ADD, |
      | IA_003 | P131 | TODAY         | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | IL_003 | P132 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | IN_003 | P133 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | KS_003 | P134 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | KY_003 | P135 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_003 | P136 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | MO_003 | P137 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MT_003 | P138 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | ND_003 | P139 | TODAY         | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | NE_003 | P140 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | NH_003 | P141 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | NM_003 | P142 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NV_003 | P143 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | OH_003 | P144 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | OK_003 | P145 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | OR_003 | P146 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | PA_003 | P147 | TODAY         | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | RI_003 | P148 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | SD_003 | P149 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | TN_003 | P150 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | UT_003 | P126 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | VT_003 | P127 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | WA_003 | P128 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WI_003 | P129 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WV_003 | P130 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WY_003 | P131 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | AL_003 | P132 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | CA_003 | P133 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | CT_003 | P134 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | DE_003 | P135 | TODAY         | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | HI_003 | P136 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | LA_003 | P137 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MA_003 | P138 | TODAY         | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MD_003 | P139 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ME_003 | P140 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | MS_003 | P141 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NC_003 | P142 | TODAY         | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NJ_003 | P143 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | NY_003 | P144 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | SC_003 | P145 | TODAY         | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | VA_003 | P146 | TODAY         | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | FL_003 | P147 | TODAY         | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | TX_003 | P148 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | GA_003 | P149 | TODAY         | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MI_003 | P150 | TODAY         | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ID_003 | P126 | TODAY         | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |

    @CarfaxUI
    Examples:
      | TC_ID  | user | effectiveDate | vehicle             | vehicleRNW              |
      | CO_003 | P126 | 11/15/2023    | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | IL_003 | P127 | 11/26/2023    | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_003 | P128 | 11/26/2023    | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | KY_003 | P129 | 12/06/2023    | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | DC_003 | P130 | 11/18/2023    | AK_006_Vehicle_006, | AK_009_Vehicle_009_ADD, |
      | TX_003 | P131 | 12/06/2023    | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | NC_003 | P132 | 11/15/2023    | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | CA_003 | P133 | 12/16/2023    | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |

  @NewBusiness @Endorsement @OOS @S10 @TC84920
  Scenario Outline: Carfax UI US42231 - S10 - Negative - New Business - Endorsement - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Additional_Vehicles" to "<vehicle>"
    * I set "Additional_Vehicles_OOS_END" to "<vehicleOOS>"
    * I reload "us/US42231" vehicle data

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
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed

    Examples:
      | TC_ID  | user | vehicle             | vehicleOOS              |
      | AK_004 | P126 | AK_006_Vehicle_006  | AK_005_Vehicle_005_ADD, |
      | AR_004 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AZ_004 | P128 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | CO_004 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | DC_004 | P130 | AK_006_Vehicle_006, | AK_009_Vehicle_009_ADD, |
      | IA_004 | P131 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | IL_004 | P132 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | IN_004 | P133 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | KS_004 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | KY_004 | P135 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_004 | P136 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | MO_004 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MT_004 | P138 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | ND_004 | P139 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | NE_004 | P140 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | NH_004 | P141 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | NM_004 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NV_004 | P143 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | OH_004 | P144 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | OK_004 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | OR_004 | P146 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | PA_004 | P147 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | RI_004 | P148 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | SD_004 | P149 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | TN_004 | P150 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | UT_004 | P126 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | VT_004 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | WA_004 | P128 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WI_004 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WV_004 | P130 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WY_004 | P131 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | AL_004 | P132 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | CA_004 | P133 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | CT_004 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | DE_004 | P135 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | HI_004 | P136 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | LA_004 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MA_004 | P138 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MD_004 | P139 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ME_004 | P140 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | MS_004 | P141 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NC_004 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NJ_004 | P143 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | NY_004 | P144 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | SC_004 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | VA_004 | P146 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | FL_004 | P147 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | TX_004 | P148 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | GA_004 | P149 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MI_004 | P150 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ID_004 | P126 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |

  @NewBusiness @Renewal @OOS @S11 @TC84920
  Scenario Outline: Carfax UI US42231 - S11 - Negative - New Business - Renewal - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Additional_Vehicles" to "<vehicle>"
    * I set "Additional_Vehicles_OOS_END" to "<vehicleOOS>"
    * I reload "us/US42231" vehicle data

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
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I review changes
    * I click renewed premium

    Then I click process renewal


    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed


    Examples:
      | TC_ID  | user | vehicle             | vehicleOOS              |
      | AK_005 | P126 | AK_006_Vehicle_006  | AK_005_Vehicle_005_ADD, |
      | AR_005 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AZ_005 | P128 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | CO_005 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | DC_005 | P130 | AK_006_Vehicle_006, | AK_009_Vehicle_009_ADD, |
      | IA_005 | P131 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | IL_005 | P132 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | IN_005 | P133 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | KS_005 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | KY_005 | P135 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_005 | P136 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | MO_005 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MT_005 | P138 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | ND_005 | P139 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | NE_005 | P140 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | NH_005 | P141 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | NM_005 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NV_005 | P143 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | OH_005 | P144 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | OK_005 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | OR_005 | P146 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | PA_005 | P147 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | RI_005 | P148 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | SD_005 | P149 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | TN_005 | P150 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | UT_005 | P126 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | VT_005 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | WA_005 | P128 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WI_005 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WV_005 | P130 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WY_005 | P131 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | AL_005 | P132 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | CA_005 | P133 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | CT_005 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | DE_005 | P135 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | HI_005 | P136 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | LA_005 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MA_005 | P138 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MD_005 | P139 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ME_005 | P140 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | MS_005 | P141 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NC_005 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NJ_005 | P143 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | NY_005 | P144 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | SC_005 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | VA_005 | P146 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | FL_005 | P147 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | TX_005 | P148 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | GA_005 | P149 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MI_005 | P150 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ID_005 | P126 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |

  @NewBusiness @Endorsement @Renewal @OOS @S12 @TC84920
  Scenario Outline: Carfax UI US42231 - S12 - Negative - New Business - Endorsement - Renewal - OOS - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42231" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Additional_Vehicles" to "<vehicle>"
    * I set "Additional_Vehicles_OOS_END" to "<vehicleOOS>"
    * I reload "us/US42231" vehicle data

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
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I review changes
    * I click renewed premium

    Then I click process renewal

    When I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement
    * I navigate to "Coverages" page
    * I click prev button

    Then I verify "Market Value" field is not displayed
    * I verify vehicle characteristics block is not displayed


    Examples:
      | TC_ID  | user | vehicle             | vehicleOOS              |
      | AK_006 | P126 | AK_006_Vehicle_006  | AK_005_Vehicle_005_ADD, |
      | AR_006 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | AZ_006 | P128 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | CO_006 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | DC_006 | P130 | AK_006_Vehicle_006, | AK_009_Vehicle_009_ADD, |
      | IA_006 | P131 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | IL_006 | P132 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | IN_006 | P133 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | KS_006 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | KY_006 | P135 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | MN_006 | P136 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | MO_006 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MT_006 | P138 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | ND_006 | P139 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | NE_006 | P140 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | NH_006 | P141 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | NM_006 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NV_006 | P143 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | OH_006 | P144 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | OK_006 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | OR_006 | P146 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | PA_006 | P147 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | RI_006 | P148 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | SD_006 | P149 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | TN_006 | P150 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | UT_006 | P126 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | VT_006 | P127 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | WA_006 | P128 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WI_006 | P129 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WV_006 | P130 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | WY_006 | P131 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | AL_006 | P132 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | CA_006 | P133 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | CT_006 | P134 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | DE_006 | P135 | AK_006_Vehicle_006, | ND_013_Vehicle_013_ADD, |
      | HI_006 | P136 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | LA_006 | P137 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | MA_006 | P138 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MD_006 | P139 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ME_006 | P140 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | MS_006 | P141 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NC_006 | P142 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |
      | NJ_006 | P143 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | NY_006 | P144 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | SC_006 | P145 | AK_006_Vehicle_006, | AK_008_Vehicle_008_ADD, |
      | VA_006 | P146 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | FL_006 | P147 | AK_006_Vehicle_006, | AK_007_Vehicle_007_ADD, |
      | TX_006 | P148 | AK_006_Vehicle_006, | AK_012_Vehicle_012_ADD, |
      | GA_006 | P149 | AK_006_Vehicle_006, | AK_010_Vehicle_010_ADD, |
      | MI_006 | P150 | AK_006_Vehicle_006, | AK_011_Vehicle_011_ADD, |
      | ID_006 | P126 | AK_006_Vehicle_006, | AK_005_Vehicle_005_ADD, |