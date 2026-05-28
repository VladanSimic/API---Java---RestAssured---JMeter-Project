Feature: Additional Interests Homeowners

  @Homeowners @AdditionalInterests @SingleLocation
  Scenario Outline: Additional Interests Homeowners single location - "<TC_ID>"

#    TODO - add new test data
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Is_There_Mortgage" to "Yes"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
#    TODO - Additional Interests page, cover all options
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
#    * I bind a quote
#    * I override subjectivities

    @HomeownersResidenceType
    Examples:
      | TC_ID  | user |
      | AK_001 | P76  |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | CO_001 | P79  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KS_001 | P83  |
      | KY_001 | P84  |
      | MN_001 | P85  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
      | OK_001 | P94  |
      | OR_001 | P95  |
      | PA_001 | P96  |
      | RI_001 | P97  |
      | SD_001 | P98  |
      | TN_001 | P99  |
      | UT_001 | P76  |
      | VT_001 | P77  |
      | WA_001 | P78  |
      | WI_001 | P79  |
      | WV_001 | P80  |
      | WY_001 | P81  |
      | AL_001 | P82  |
      | CA_001 | P82  |
      | CT_001 | P83  |
      | DE_001 | P84  |
      | HI_001 | P85  |
      | LA_001 | P86  |
      | MA_001 | P87  |
      | MD_001 | P88  |
      | ME_001 | P89  |
      | MS_001 | P90  |
      | NC_001 | P91  |
      | NJ_001 | P92  |
      | NY_001 | P93  |
      | SC_001 | P94  |
      | VA_001 | P95  |
      | FL_001 | P96  |
      | TX_001 | P97  |
      | GA_001 | P98  |
      | MI_001 | P99  |
      | ID_001 | P76  |

    @CondoResidenceType
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

    @TenantsResidenceType
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
      | NJ_003 |
      | NY_003 |
      | SC_003 |
      | VA_003 |
      | FL_003 |
      | TX_003 |
      | GA_003 |
      | MI_003 |
      | ID_003 |