Feature: Personal watercraft regression

  @PersonalWatercraft @Regression @NewBusiness
  Scenario Outline: Personal watercraft new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | AK_001 | P151 |
      | AR_001 | P152 |
      | AZ_001 | P153 |
      | CO_001 | P154 |
      | DC_001 | P155 |
      | IA_001 | P156 |
      | IL_001 | P157 |
      | IN_001 | P158 |
      | KS_001 | P159 |
      | KY_001 | P160 |
      | MN_001 | P161 |
      | MO_001 | P162 |
      | MT_001 | P163 |
      | ND_001 | P164 |
      | NE_001 | P165 |
      | NH_001 | P166 |
      | NM_001 | P167 |
      | NV_001 | P168 |
      | NV_001 | P169 |
      | OH_001 | P170 |
      | OK_001 | P171 |
      | OR_001 | P172 |
      | PA_001 | P173 |
      | RI_001 | P174 |
      | SD_001 | P175 |
      | TN_001 | P151 |
      | UT_001 | P152 |
      | VT_001 | P153 |
      | WA_001 | P154 |
      | WI_001 | P155 |
      | WV_001 | P156 |
      | WY_001 | P157 |
      | AL_001 | P158 |
      | CA_001 | P159 |
      | CT_001 | P160 |
      | DE_001 | P161 |
      | HI_001 | P162 |
      | LA_001 | P163 |
      | MA_001 | P164 |
      | MD_001 | P165 |
      | ME_001 | P166 |
      | MS_001 | P167 |
      | NC_001 | P168 |
      | NJ_001 | P169 |
      | NY_001 | P170 |
      | SC_001 | P171 |
      | VA_001 | P172 |
      | FL_001 | P173 |
      | TX_001 | P174 |
      | GA_001 | P175 |
      | MI_001 | P151 |
      | ID_001 | P152 |

  @PersonalWatercraft @GeneralRegression @Jenkins
  Scenario Outline: Personal watercraft New Business + Endorsement + RN - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorPW" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I navigate to Watercraft Policy Page and add new watercraft with basic details
      | PolicyType         | Year | Manufacturer | Model | Length | HullAndMachineryLimit |
      | Hull and Liability | 2020 | Porsche      | BoatX | 24     | 89000                 |

    * I review changes
    * I rate an endorsement
    And I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "not equal" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    Then I fill KY Tax Report with dummy data for "PW" LOB
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | TC_ID  | user |
      | AK_001 | P151 |
      | AR_001 | P152 |
      | AZ_001 | P153 |
      | CO_001 | P154 |
      | DC_001 | P155 |
      | IA_001 | P156 |
      | IL_001 | P157 |
      | IN_001 | P158 |
      | KS_001 | P159 |
      | KY_001 | P160 |
      | MN_001 | P161 |
      | MO_001 | P162 |
      | MT_001 | P163 |
      | ND_001 | P164 |
      | NE_001 | P165 |
      | NH_001 | P166 |
      | NM_001 | P167 |
      | NV_001 | P168 |
      | NV_001 | P169 |
      | OH_001 | P170 |
      | OK_001 | P171 |
      | OR_001 | P172 |
      | PA_001 | P173 |
      | RI_001 | P174 |
      | SD_001 | P175 |
      | TN_001 | P151 |
      | UT_001 | P152 |
      | VT_001 | P153 |
      | WA_001 | P154 |
      | WI_001 | P155 |
      | WV_001 | P156 |
      | WY_001 | P157 |
      | AL_001 | P158 |
      | CA_001 | P159 |
      | CT_001 | P160 |
      | DE_001 | P161 |
      | HI_001 | P162 |
      | LA_001 | P163 |
      | MA_001 | P164 |
      | MD_001 | P165 |
      | ME_001 | P166 |
      | MS_001 | P167 |
      | NC_001 | P168 |
      | NJ_001 | P169 |
      | NY_001 | P170 |
      | SC_001 | P171 |
      | VA_001 | P172 |
      | FL_001 | P173 |
      | TX_001 | P174 |
      | GA_001 | P175 |
      | MI_001 | P151 |
      | ID_001 | P152 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Personal watercraft new business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

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
  Scenario Outline: Personal watercraft New Business + NB Endorsement + RN - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPW" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    * I override subjectivities

    When I navigate to transactions or endorsements
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