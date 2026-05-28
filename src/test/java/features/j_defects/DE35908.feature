@PersonalAuto @Carfax @DE35908 @DE35911
Feature: Child Factor using Old Logic

  This same VIN (as in the picture below) when rated in NJ, it does not get
  the additive calc performed at all when it should since value is over 150,000.
  However in FL, this same VIN did not do the additive calc correctly either,
  but it was wrong in a different way, it added the initial symbol factor to the agreed value.

  @NewBusiness
  Scenario Outline: Create quote - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "de/DE35908" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "02/15/2025"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

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

  @NewBusiness @Renewal
  Scenario Outline: Create renewal - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "de/DE35908" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "05/01/2024"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal

    @PrivatePassenger
    Examples:
      | TC_ID  | user |
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