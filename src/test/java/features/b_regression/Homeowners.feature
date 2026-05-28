Feature: Homeowners regression

  @Homeowners @Regression @SingleLocation @NewBusiness
  Scenario Outline: Homeowners single location new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
#    * I set "Is_There_Mortgage" to "Yes"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

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
      | TC_ID  | user |
      | AK_002 | P76  |
      | AR_002 | P76  |
      | AZ_002 | P77  |
      | CO_002 | P78  |
      | DC_002 | P79  |
      | IA_002 | P80  |
      | IL_002 | P81  |
      | IN_002 | P82  |
      | KS_002 | P82  |
      | KY_002 | P83  |
      | MN_002 | P84  |
      | MO_002 | P85  |
      | MT_002 | P86  |
      | ND_002 | P87  |
      | NE_002 | P88  |
      | NH_002 | P89  |
      | NM_002 | P90  |
      | NV_002 | P91  |
      | OH_002 | P92  |
      | OK_002 | P93  |
      | OR_002 | P94  |
      | PA_002 | P95  |
      | RI_002 | P96  |
      | SD_002 | P97  |
      | TN_002 | P98  |
      | UT_002 | P99  |
      | VT_002 | P76  |
      | WA_002 | P77  |
      | WI_002 | P78  |
      | WV_002 | P79  |
      | WY_002 | P80  |
      | AL_002 | P81  |
      | CA_002 | P82  |
      | CT_002 | P82  |
      | DE_002 | P83  |
      | HI_002 | P84  |
      | LA_002 | P85  |
      | MA_002 | P86  |
      | MD_002 | P87  |
      | ME_002 | P88  |
      | MS_002 | P89  |
      | NC_002 | P90  |
      | NJ_002 | P91  |
      | NY_002 | P92  |
      | SC_002 | P93  |
      | VA_002 | P94  |
      | FL_002 | P95  |
      | TX_002 | P96  |
      | GA_002 | P97  |
      | MI_002 | P98  |
      | ID_002 | P99  |

    @TenantsResidenceType
    Examples:
      | TC_ID  | user |
      | AK_003 | P76  |
      | AR_003 | P76  |
      | AZ_003 | P77  |
      | CO_003 | P78  |
      | DC_003 | P79  |
      | IA_003 | P80  |
      | IL_003 | P81  |
      | IN_003 | P82  |
      | KS_003 | P82  |
      | KY_003 | P83  |
      | MN_003 | P84  |
      | MO_003 | P85  |
      | MT_003 | P86  |
      | ND_003 | P87  |
      | NE_003 | P88  |
      | NH_003 | P89  |
      | NM_003 | P90  |
      | NV_003 | P91  |
      | OH_003 | P92  |
      | OK_003 | P93  |
      | OR_003 | P94  |
      | PA_003 | P95  |
      | RI_003 | P96  |
      | SD_003 | P97  |
      | TN_003 | P98  |
      | UT_003 | P99  |
      | VT_003 | P76  |
      | WA_003 | P77  |
      | WI_003 | P78  |
      | WV_003 | P79  |
      | WY_003 | P80  |
      | AL_003 | P81  |
      | CA_003 | P82  |
      | CT_003 | P82  |
      | DE_003 | P83  |
      | HI_003 | P84  |
      | LA_003 | P85  |
      | MA_003 | P86  |
      | MD_003 | P87  |
      | ME_003 | P88  |
      | MS_003 | P89  |
      | NJ_003 | P90  |
      | NY_003 | P91  |
      | SC_003 | P92  |
      | VA_003 | P93  |
      | FL_003 | P94  |
      | TX_003 | P95  |
      | GA_003 | P96  |
      | MI_003 | P97  |
      | ID_003 | P98  |

  @Homeowners @Regression @MultipleLocations @NewBusiness
  Scenario Outline: Homeowners multiple locations new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I login with OKTA user "A1"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I add additional locations
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    @HomeownersResidenceType
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
      | NC_004 |
      | NJ_004 |
      | NY_004 |
      | SC_004 |
      | VA_004 |
      | FL_004 |
      | TX_004 |
      | GA_004 |
      | MI_004 |
      | ID_004 |

    @CondoResidenceType
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

    @TenantsResidenceType
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

  @Homeowners @GeneralRegression @Jenkins
  Scenario Outline: Homeowners Single Location New Business + Endorsement + RN - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    * I initiate new endorsement
    * I set "Additional_Locations" to "<LOCATION_END>"
    * I merge data for "QuoteCreationHO", where "Additional_Locations" key and "HO_AdditionalLocations" sheet

    Then I add additional locations

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "<VALUE>" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 5 to 10 seconds
    * I navigate to policy image page
    * I think for 2 to 5 seconds
    * I navigate to policy image page
    * I verify that inflation factor is applied
    * I navigate to Homeowner Policy Page
    Then I make general changes required on renewal for "HO" LOB
    And I review changes
    * I review and accept referrals on renewal if any
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | TC_ID  | LOCATION_END     | user | VALUE     |
      | AK_001 | Location_AK_005, | P76  | not equal |
      | AR_001 | Location_AR_005, | P77  | not equal |
      | AZ_001 | Location_AZ_005, | P78  | not equal |
      | CO_001 | Location_CO_005, | P79  | not equal |
      | DC_001 | Location_DC_005, | P80  | not equal |
      | IA_001 | Location_IA_005, | P81  | not equal |
      | IL_001 | Location_IL_005, | P82  | not equal |
      | IN_001 | Location_IN_005, | P82  | not equal |
      | KS_001 | Location_KS_005, | P83  | not equal |
      | KY_001 | Location_KY_005, | P84  | not equal |
      | MN_001 | Location_MN_005, | P85  | not equal |
      | MO_001 | Location_MO_005, | P86  | not equal |
      | MT_001 | Location_MT_005, | P87  | not equal |
      | ND_001 | Location_ND_005, | P88  | not equal |
      | NE_001 | Location_NE_005, | P89  | not equal |
      | NH_001 | Location_NH_005, | P90  | not equal |
      | NM_001 | Location_NM_005, | P91  | not equal |
      | NV_001 | Location_NV_005, | P92  | not equal |
      | OH_001 | Location_OH_005, | P93  | not equal |
      | OK_001 | Location_OK_005, | P94  | not equal |
      | OR_001 | Location_OR_005, | P95  | not equal |
      | PA_001 | Location_PA_005, | P96  | not equal |
      | RI_001 | Location_RI_005, | P97  | not equal |
      | SD_001 | Location_SD_005, | P98  | not equal |
      | TN_001 | Location_TN_005, | P99  | not equal |
      | UT_001 | Location_UT_005, | P76  | not equal |
      | VT_001 | Location_VT_005, | P77  | not equal |
      | WA_001 | Location_WA_005, | P78  | not equal |
      | WI_001 | Location_WI_005, | P79  | not equal |
      | WV_001 | Location_WV_005, | P80  | not equal |
      | WY_001 | Location_WY_005, | P81  | not equal |
      | AL_001 | Location_AL_005, | P82  | not equal |
      | CA_001 | Location_CA_005, | P82  | not equal |
      | CT_001 | Location_CT_005, | P83  | not equal |
      | DE_001 | Location_DE_005, | P84  | not equal |
      | HI_001 | Location_HI_005, | P85  | not equal |
      | LA_001 | Location_LA_005, | P86  | not equal |
      | MA_001 | Location_MA_005, | P87  | not equal |
      | MD_001 | Location_MD_005, | P88  | not equal |
      | ME_001 | Location_ME_005, | P89  | not equal |
      | MS_001 | Location_MS_005, | P90  | not equal |
      | NC_001 | ,                | P91  | equal     |
      | NJ_001 | Location_NJ_005, | P92  | not equal |
      | NY_001 | Location_NY_005, | P93  | not equal |
      | SC_001 | Location_SC_005, | P94  | not equal |
      | VA_001 | Location_VA_005, | P95  | not equal |
      | FL_001 | Location_FL_005, | P96  | not equal |
      | TX_001 | Location_TX_005, | P97  | not equal |
      | GA_001 | Location_GA_005, | P98  | not equal |
      | MI_001 | Location_MI_005, | P99  | not equal |
      | ID_001 | Location_ID_005, | P76  | not equal |

  @Homeowners @GeneralRegression @OrderPropertyDetails
  Scenario Outline: Homeowners Single Location Order Property Details on Transactions - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set Effective Date to Today
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    Then I navigate to Location Details Page
    And I verify that ISO Report is pulled
    And I click order property details button
    * I think for 10 to 15 seconds

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 1                |

    * I verify that ISO Report is pulled
    * I fill out the mortgagee information block for HO
    * I fill out the construction details block for HO
    * I fill out the risk characteristics block for HO
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I navigate to Location Details Page
    * I verify that ISO Report is pulled
    And I click order property details button
    * I think for 10 to 15 seconds

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 1                |

    * I verify that ISO Report is pulled
    * I fill out the mortgagee information block for HO
    * I fill out the construction details block for HO
    * I fill out the risk characteristics block for HO
    And I navigate to Homeowner Policy Page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 5 to 10 seconds
    * I navigate to policy image page
    * I think for 2 to 5 seconds
    * I navigate to policy image page
    * I verify that inflation factor is applied
    Then I navigate to Location Details Page
    And I verify that ISO Report is pulled
    And I click order property details button
    * I think for 10 to 15 seconds

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 1                |

    * I verify that ISO Report is pulled
    * I navigate to Homeowner Policy Page

    Examples:
      | TC_ID  | user |
      | FL_101 | P96  |
      | NY_101 | P97  |
      | CA_101 | P98  |