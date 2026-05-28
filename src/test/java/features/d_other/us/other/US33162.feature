Feature: Personal watercraft <27ft and >=27ft US33162

#    NB

#  @PersonalWatercraft @US33162 @<27ft @NewBusiness
#  Scenario Outline: Personal watercraft new business - less than 27ft
#
#    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "NBLess27" for "PW" LOB
#    And I load random user data
#    And I am logged in to Pure as "<user>"
#    And I navigate to quotes page
#    And I initiate a new quote
#    And I create a new "PW" quote
#    And I rate a quote
#    And I navigate to underwriting referrals page
#    And I accept underwriting referrals
#    Then I bind a quote
#
#    Examples:
#      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
#      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
#      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |
#
#  @PersonalWatercraft @US33162 @<27ft @NewBusiness
#  Scenario Outline: Personal watercraft new business - less than 27ft - Negative test
#
#    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "NBLess27Neg" for "PW" LOB
#    And I load random user data
#    And I am logged in to Pure as "<user>"
#    And I navigate to quotes page
#    And I initiate a new quote
#    And I create a new "PW" quote
#    And I rate a quote
#    And I navigate to underwriting referrals page
#    And I accept underwriting referrals
#    Then I bind a quote
#
#    Examples:
#      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
#      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
#      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |

  @PersonalWatercraft @US33162 @>27ft @NewBusiness
  Scenario Outline: Personal watercraft new business - greater than 27ft

    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "NBOver27" for "PW" LOB
    And I load random user data
    And I am logged in to Pure as "<user>"
    And I navigate to quotes page
    And I initiate a new quote
    And I create a new "PW" quote
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote

    Examples:
      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
      | VT_001 | P153 |
      | WA_001 | P154 |
      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
#      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |

#  @PersonalWatercraft @US33162 @>27ft @NewBusiness
#  Scenario Outline: Personal watercraft new business - greater than 27ft - Negative
#
#    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "NBOver27Neg" for "PW" LOB
#    And I load random user data
#    And I am logged in to Pure as "<user>"
#    And I navigate to quotes page
#    And I initiate a new quote
#    And I create a new "PW" quote
#    And I rate a quote
#    And I navigate to underwriting referrals page
#    And I accept underwriting referrals
#    Then I bind a quote
#
#    Examples:
#      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
#      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
#      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |

#    NB and RENEWALS

  @PersonalWatercraft @US33162 @<27ft @NewBusiness @Renewal
  Scenario Outline: Personal watercraft New Business and Renewal - less than 27ft

    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "RBLess27" for "PW" LOB
    And I load random user data
    And I am logged in to Pure as "<user>"
    And I navigate to quotes page
    And I initiate a new quote
    And I create a new "PW" quote
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I create a renewal without process
#    Then I process a renewal

    Examples:
      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |
#
  @PersonalWatercraft @US33162 @<27ft @NewBusiness @Renewal
  Scenario Outline: Personal watercraft New Business and Renewal - less than 27ft - Negative test

    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "RBLess27Neg" for "PW" LOB
    And I load random user data
    And I am logged in to Pure as "<user>"
    And I navigate to quotes page
    And I initiate a new quote
    And I create a new "PW" quote
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I create a renewal without process
#    Then I process a renewal

    Examples:
      | TC_ID  | user |
#      | AK_001 | P151 |
#      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
#      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
#      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
#      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
#      | LA_001 | P163 |
#      | MA_001 | P164 |
      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
#      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |
#
  @PersonalWatercraft @US33162 @>27ft @NewBusiness @Renewal
  Scenario Outline: Personal watercraft New Business and Renewal - greater than 27ft

    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "RBOver27" for "PW" LOB
    And I load random user data
    And I am logged in to Pure as "<user>"
    And I navigate to quotes page
    And I initiate a new quote
    And I create a new "PW" quote
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I create a renewal without process
#    Then I process a renewal

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
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
#      | HI_001 | P162 |
      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
      | SC_001 | P171 |
#      | VA_001 | P172 |
      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
#      | MI_001 | P151 |
#      | ID_001 | P152 |

  @PersonalWatercraft @US33162 @>27ft @NewBusiness @Renewal
  Scenario Outline: Personal watercraft New Business and Renewal - greater than 27ft - Negative

    When I have entered test data for test case "<TC_ID>" in excel workbook "US33162" in sheet "RBOver27Neg" for "PW" LOB
    And I load random user data
    And I am logged in to Pure as "<user>"
    And I navigate to quotes page
    And I initiate a new quote
    And I create a new "PW" quote
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    And I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I create a renewal without process
#    Then I process a renewal

    Examples:
      | TC_ID  | user |
#      | AK_001 | P151 |
      | AR_001 | P152 |
#      | AZ_001 | P153 |
#      | CO_001 | P154 |
#      | DC_001 | P155 |
#      | IA_001 | P156 |
#      | IL_001 | P157 |
#      | IN_001 | P158 |
#      | KS_001 | P159 |
#      | KY_001 | P160 |
#      | MN_001 | P161 |
#      | MO_001 | P162 |
#      | MT_001 | P163 |
      | ND_001 | P164 |
#      | NE_001 | P165 |
#      | NH_001 | P166 |
#      | NM_001 | P167 |
#      | NV_001 | P168 |
#      | NV_001 | P169 |
#      | OH_001 | P170 |
#      | OK_001 | P171 |
#      | OR_001 | P172 |
#      | PA_001 | P173 |
#      | RI_001 | P174 |
#      | SD_001 | P175 |
#      | TN_001 | P151 |
#      | UT_001 | P152 |
#      | VT_001 | P153 |
      | WA_001 | P154 |
#      | WI_001 | P155 |
#      | WV_001 | P156 |
#      | WY_001 | P157 |
#      | AL_001 | P158 |
      | CA_001 | P159 |
#      | CT_001 | P160 |
#      | DE_001 | P161 |
      | HI_001 | P162 |
      | LA_001 | P163 |
#      | MA_001 | P164 |
#      | MD_001 | P165 |
#      | ME_001 | P166 |
#      | MS_001 | P167 |
#      | NC_001 | P168 |
#      | NJ_001 | P169 |
#      | NY_001 | P170 |
#      | SC_001 | P171 |
#      | VA_001 | P172 |
      | FL_001 | P173 |
#      | TX_001 | P174 |
#      | GA_001 | P175 |
      | MI_001 | P151 |
#      | ID_001 | P152 |