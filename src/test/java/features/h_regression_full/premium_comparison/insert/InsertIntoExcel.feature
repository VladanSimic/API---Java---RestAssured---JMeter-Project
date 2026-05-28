@FullRegression @Functional @NewBusiness @Insert
Feature: Premium Comparison - Insert into Excel

  @Collections
  Scenario Outline: Grand Total - Collections new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "CO" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "CO" sheet

    Examples:
      | TC_ID  | user |
      | AK_001 | P1   |
      | AR_001 | P2   |
      | AZ_001 | P3   |
      | CO_001 | P4   |
      | DC_001 | P5   |
      | IA_001 | P6   |
      | IL_001 | P7   |
      | IN_001 | P8   |
      | KS_001 | P9   |
      | KY_001 | P10  |
      | MN_001 | P11  |
      | MO_001 | P12  |
      | MT_001 | P13  |
      | ND_001 | P14  |
      | NE_001 | P15  |
      | NH_001 | P16  |
      | NM_001 | P17  |
      | NV_001 | P18  |
      | OH_001 | P19  |
      | OK_001 | P20  |
      | OR_001 | P21  |
      | PA_001 | P22  |
      | RI_001 | P23  |
      | SD_001 | P24  |
      | TN_001 | P25  |
      | UT_001 | P26  |
      | VT_001 | P27  |
      | WA_001 | P28  |
      | WI_001 | P29  |
      | WV_001 | P30  |
      | WY_001 | P31  |
      | AL_001 | P32  |
      | CA_001 | P33  |
      | CT_001 | P34  |
      | DE_001 | P35  |
      | HI_001 | P36  |
      | LA_001 | P37  |
      | MA_001 | P38  |
      | MD_001 | P39  |
      | ME_001 | P40  |
      | MS_001 | P41  |
      | NC_001 | P42  |
      | NJ_001 | P43  |
      | NY_001 | P44  |
      | SC_001 | P45  |
      | VA_001 | P46  |
      | FL_001 | P47  |
      | TX_001 | P48  |
      | GA_001 | P49  |
      | MI_001 | P50  |
      | ID_001 | P26  |

  @ExcessLiability
  Scenario Outline: Grand Total - Excess liability new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "EX" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "EX" sheet

    Examples:
      | TC_ID  | user |
      | AK_001 | P26  |
      | AR_001 | P27  |
      | AZ_001 | P28  |
      | CO_001 | P29  |
      | DC_001 | P30  |
      | IA_001 | P31  |
      | IL_001 | P32  |
      | IN_001 | P33  |
      | KS_001 | P34  |
      | KY_001 | P35  |
      | MN_001 | P36  |
      | MO_001 | P37  |
      | MT_001 | P38  |
      | ND_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |
      | NV_001 | P43  |
      | OH_001 | P44  |
      | OK_001 | P45  |
      | OR_001 | P46  |
      | PA_001 | P47  |
      | RI_001 | P48  |
      | SD_001 | P49  |
      | TN_001 | P50  |
      | UT_001 | P26  |
      | VT_001 | P27  |
      | WA_001 | P28  |
      | WI_001 | P29  |
      | WV_001 | P30  |
      | WY_001 | P31  |
      | AL_001 | P32  |
      | CA_001 | P33  |
      | CT_001 | P34  |
      | DE_001 | P35  |
      | HI_001 | P36  |
      | LA_001 | P37  |
      | MA_001 | P38  |
      | MD_001 | P39  |
      | ME_001 | P40  |
      | MS_001 | P41  |
      | NC_001 | P42  |
      | NJ_001 | P43  |
      | NY_001 | P44  |
      | SC_001 | P45  |
      | VA_001 | P46  |
      | FL_001 | P47  |
      | TX_001 | P48  |
      | GA_001 | P49  |
      | MI_001 | P50  |
      | ID_001 | P26  |

  @ExcessLiabilitySurplus
  Scenario Outline: Grand Total - Excess surplus new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "ES" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "ES" sheet

    Examples:
      | TC_ID  | user |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P57  |
      | CA_001 | P58  |
      | CT_001 | P59  |
      | MA_001 | P60  |
      | TX_001 | P61  |
      | FL_001 | P62  |
      | NY_001 | P63  |
      | CA_001 | P64  |
      | CT_001 | P65  |
      | MA_001 | P66  |
      | TX_001 | P67  |
      | FL_001 | P68  |
      | NY_001 | P69  |
      | CA_001 | P70  |
      | CT_001 | P71  |
      | MA_001 | P72  |
      | TX_001 | P73  |
      | FL_001 | P74  |
      | NY_001 | P75  |
      | CA_001 | P51  |
      | CT_001 | P52  |
      | MA_001 | P53  |
      | TX_001 | P54  |
      | FL_001 | P55  |
      | NY_001 | P56  |
      | CA_001 | P57  |
      | CT_001 | P58  |
      | MA_001 | P59  |
      | TX_001 | P60  |
      | FL_001 | P61  |
      | NY_001 | P62  |
      | CA_001 | P63  |
      | CT_001 | P64  |
      | MA_001 | P65  |
      | TX_001 | P66  |
      | FL_001 | P67  |
      | NY_001 | P68  |
      | CA_001 | P69  |
      | CT_001 | P70  |
      | MA_001 | P71  |
      | TX_001 | P72  |
      | FL_001 | P73  |

  @Homeowners
  Scenario Outline: Grand Total - Homeowners single location new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "HO" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "HO" sheet

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

  @HomeownersSurplus
  Scenario Outline: Grand Total - HS - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    Then I get customer account ID
    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "HS" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "HS" sheet


    Examples:
      | TC_ID  | user |
      | NY_001 | P84  |
      | AL_001 | P85  |
      | MS_001 | P86  |
      | CA_001 | P87  |
      | GA_001 | P88  |
      | LA_001 | P89  |
      | MA_001 | P90  |
      | SC_001 | P91  |
      | NJ_001 | P92  |
      | NC_001 | P93  |
      | TX_001 | P94  |
      | FL_001 | P95  |
      | CO_001 | P96  |
      | AZ_001 | P97  |
      | MT_001 | P98  |
      | UT_001 | P99  |
      | WY_001 | P84  |
      | HI_001 | P85  |

  @PersonalAuto
  Scenario Outline: Grand Total - Personal Auto - "<TC_ID>" - New Business - Private Passenger

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "PA" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "PA" sheet

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

  @PersonalWatercraft
  Scenario Outline: Grand Total - Personal watercraft new business - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPW" sheet
    * I load random user data
    * I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "PW" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I insert New Business Grand Total Premium into premium comparison file "PW" sheet

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

  @CourseOfConstruction
  Scenario Outline: Grand Total - CC - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    When I am logged in to Pure as "P3"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to premium details page
    * I save coverage factor and value for "<TC_ID>" in "CC" in "Expected_Results" excel file for "New Business"
    * I click return to premium summary page button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote
    * I insert New Business Grand Total Premium into premium comparison file "CC" sheet

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
