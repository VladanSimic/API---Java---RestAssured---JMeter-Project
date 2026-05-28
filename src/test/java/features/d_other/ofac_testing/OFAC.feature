@OFAC
Feature: OFAC Testing

  @PersonalWatercraft @Watercraft
  Scenario Outline: Watercraft OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 7 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

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

  @Homeowners @HO
  Scenario Outline: Homeowners OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 11 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

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

  @Collection @CO
  Scenario Outline: Collection OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 9 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

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
      | TN_001 | P26  |

  @COC @CC @CourseOfConstruction
  Scenario Outline: COC OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationCC" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data
    * I am logged in to Pure as "P3"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 11 OFAC referrals
    * I accept underwriting referrals
    * I bind a CC quote

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
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

  @HomeownersSurplus @HomeSurplus @HS
  Scenario Outline: HS OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I am logged in to Pure as "P3"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 11 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @ExcessLiability @EX
  Scenario Outline: EX OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 7 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

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

  @ExcessLiabilitySurplus @ES
  Scenario Outline: ES OFAC - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 7 OFAC referrals
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |

  @PersonalAuto @PA
  Scenario Outline: PA OFAC  - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "us/ofac_testing/QuoteCreationPA" in sheet "QuoteCreatorPA" for "PA" LOB
    * I load random user data
    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote
    Then I get customer account ID
    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    And I navigate to "Operators & Vehicles" page through the Tree
    Then I click add additional operator
    * I set driver first name to "Khan" for driver 1
    * I set driver last name to "Madi" for driver 1
    * I set driver DOB to "06/01/1989" for driver 1
    * I set driver status to "Active" for driver 1
    * I click on the footer
    * I set driver license state to "NY" for driver 1
    * I set driver license number to "5656566" for driver 1
    * I set driver gender to "Male" for driver 1
    * I set driver relationship to named insured to "Assistant" for driver 1
    * I click save changes button
    * I set "First_Name" to "Khan"
    * I set "Last_Name" to "Madi"
    And I fill out PA quote driver details page
    * I fill out PA quote driver assignment page if visible
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if there are 4 OFAC referrals
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