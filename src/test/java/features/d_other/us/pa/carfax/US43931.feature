@PersonalAuto @US43931 @DE33746
Feature: Block Position Inconsistency - Auto

  We need to keep the blocks on the UI consistent across all the states.
  We need to keep the Loss Payee block with Ownership block like in most of the states
  and need to get Vehicle Characteristics block placed below that.
  I've included further details relative to this issue in the email attachment.

  @NewBusiness @S1
  Scenario Outline: Carfax UI US42231 - S1 - New Business - "<TC_ID>" - "<effectiveDate>" on PDF

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle" to "Yes"
    * I set "Ownership_Is_There_An_Additional_Insured_Or_Trust_That_Needs_To_Be_Listed_On_This_Vehicle_1" to "Yes"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote operators and vehicles page
    * I fill out PA quote vehicle details page

    Then I verify vehicle characteristics block is first block under lost payee block

    @PrivatePassenger
    Examples:
      | TC_ID  | effectiveDate |
      | AK_001 | 01/01/2025    |
      | AR_001 | 01/01/2025    |
      | AZ_001 | 01/01/2025    |
      | CO_001 | 01/01/2025    |
      | DC_001 | 01/01/2025    |
      | IA_001 | 01/01/2025    |
      | IL_001 | 01/01/2025    |
      | IN_001 | 01/01/2025    |
      | KS_001 | 01/01/2025    |
      | KY_001 | 01/01/2025    |
      | MN_001 | 01/01/2025    |
      | MO_001 | 01/01/2025    |
      | MT_001 | 01/01/2025    |
      | ND_001 | 01/01/2025    |
      | NE_001 | 01/01/2025    |
      | NH_001 | 01/01/2025    |
      | NM_001 | 01/01/2025    |
      | NV_001 | 01/01/2025    |
      | OH_001 | 01/01/2025    |
      | OK_001 | 01/01/2025    |
      | OR_001 | 01/01/2025    |
      | PA_001 | 01/01/2025    |
      | RI_001 | 01/01/2025    |
      | SD_001 | 01/01/2025    |
      | TN_001 | 01/01/2025    |
      | UT_001 | 01/01/2025    |
      | VT_001 | 01/01/2025    |
      | WA_001 | 01/01/2025    |
      | WI_001 | 01/01/2025    |
      | WV_001 | 01/01/2025    |
      | WY_001 | 01/01/2025    |
      | AL_001 | 01/01/2025    |
      | CA_001 | 01/01/2025    |
      | CT_001 | 01/01/2025    |
      | DE_001 | 01/01/2025    |
      | HI_001 | 01/01/2025    |
      | LA_001 | 01/01/2025    |
      | MA_001 | 01/01/2025    |
      | MD_001 | 01/01/2025    |
      | ME_001 | 01/01/2025    |
      | MS_001 | 01/01/2025    |
      | NC_001 | 01/01/2025    |
      | NJ_001 | 01/01/2025    |
      | NY_001 | 01/01/2025    |
      | SC_001 | 01/01/2025    |
      | VA_001 | 01/01/2025    |
      | FL_001 | 01/01/2025    |
      | TX_001 | 01/01/2025    |
      | GA_001 | 01/01/2025    |
      | MI_001 | 01/01/2025    |
      | ID_001 | 01/01/2025    |