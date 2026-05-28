@PersonalAuto @US44545
Feature: Carfax - Change Request - VIN Override Functionality for Brokers

  As a broker, I would like to have access to check VIN override box
  for Private Passenger vehicles to get an indication for vehicles without 17-digit VINs.
  Since, we're hiding Short VIN field on the UI as Carfax
  doesn't return values for the vehicles <17-digit VINs

  @NewBusiness @S1
  Scenario Outline: Carfax UI US44545 - S1 - New Business - "<TC_ID>" - "<effectiveDate>" on PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US44545" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"

    When I am logged in to Pure as Broker
    * I initiate a new quote as broker

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block
    * I fill out PA additional operators block

    Then I verify "VIN Override" 0 checkbox is "visible"

    When I set additional vehicle 0 VIN override to "Yes"
    * I click save changes button

    Then I verify "VIN Override" 0 checkbox is "checked"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page
    * I fill out PA quote coverages page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I rate a quote
    * I refer a quote to underwriter

    Then I click exit customer

    When I am logged in to Pure as Field
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I am logged in to Pure as Broker
    * I navigate to customers page
    * I select customer by ID
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "Operators & Vehicles" page
    * I fill out PA endorsement additional vehicles block carfax

    Then I verify "VIN Override" 1 checkbox is "visible"

    When I set additional vehicle 1 VIN override to "Yes"
    * I click save changes button

    Then I verify "VIN Override" 1 checkbox is "checked"

    When I fill out PA endorsement vehicle details page
    * I fill out PA endorsement coverages page
    * I review changes
    * I rate an endorsement

    Then I issue an endorsement

    When I click auto create renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax

    Then I verify "VIN Override" 2 checkbox is "visible"

    When I set additional vehicle 2 VIN override to "Yes"
    * I click save changes button

    Then I verify "VIN Override" 2 checkbox is "checked"

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AK_001 | 10/01/2024    | 10/02/2024       |
      | AR_001 | 10/01/2024    | 10/02/2024       |
      | AZ_001 | 10/01/2024    | 10/02/2024       |
      | CO_001 | 10/01/2024    | 10/02/2024       |
      | DC_001 | 10/01/2024    | 10/02/2024       |
      | IA_001 | 10/01/2024    | 10/02/2024       |
      | IL_001 | 10/01/2024    | 10/02/2024       |
      | IN_001 | 10/01/2024    | 10/02/2024       |
      | KS_001 | 10/01/2024    | 10/02/2024       |
      | KY_001 | 10/01/2024    | 10/02/2024       |
      | MN_001 | 10/01/2024    | 10/02/2024       |
      | MO_001 | 10/01/2024    | 10/02/2024       |
      | MT_001 | 10/01/2024    | 10/02/2024       |
      | ND_001 | 10/01/2024    | 10/02/2024       |
      | NE_001 | 10/01/2024    | 10/02/2024       |
      | NH_001 | 10/01/2024    | 10/02/2024       |
      | NM_001 | 10/01/2024    | 10/02/2024       |
      | NV_001 | 10/01/2024    | 10/02/2024       |
      | OH_001 | 10/01/2024    | 10/02/2024       |
      | OK_001 | 10/01/2024    | 10/02/2024       |
      | OR_001 | 10/01/2024    | 10/02/2024       |
      | PA_001 | 10/01/2024    | 10/02/2024       |
      | RI_001 | 10/01/2024    | 10/02/2024       |
      | SD_001 | 10/01/2024    | 10/02/2024       |
      | TN_001 | 10/01/2024    | 10/02/2024       |
      | UT_001 | 10/01/2024    | 10/02/2024       |
      | VT_001 | 10/01/2024    | 10/02/2024       |
      | WA_001 | 10/01/2024    | 10/02/2024       |
      | WI_001 | 10/01/2024    | 10/02/2024       |
      | WV_001 | 10/01/2024    | 10/02/2024       |
      | WY_001 | 10/01/2024    | 10/02/2024       |
      | AL_001 | 10/01/2024    | 10/02/2024       |
      | CA_001 | 12/16/2024    | 12/17/2024       |
      | CT_001 | 10/01/2024    | 10/02/2024       |
      | DE_001 | 10/01/2024    | 10/02/2024       |
      | HI_001 | 10/01/2024    | 10/02/2024       |
      | LA_001 | 10/01/2024    | 10/02/2024       |
      | MA_001 | 10/01/2024    | 10/02/2024       |
      | MD_001 | 10/01/2024    | 10/02/2024       |
      | ME_001 | 10/01/2024    | 10/02/2024       |
      | MS_001 | 10/01/2024    | 10/02/2024       |
      | NC_001 | 11/15/2024    | 11/16/2024       |
      | NJ_001 | 10/01/2024    | 10/02/2024       |
      | NY_001 | 10/01/2024    | 10/02/2024       |
      | SC_001 | 10/01/2024    | 10/02/2024       |
      | VA_001 | 10/01/2024    | 10/02/2024       |
      | FL_001 | 10/01/2024    | 10/02/2024       |
      | TX_001 | 10/01/2024    | 10/02/2024       |
      | GA_001 | 10/01/2024    | 10/02/2024       |
      | MI_001 | 10/01/2024    | 10/02/2024       |
      | ID_001 | 10/01/2024    | 10/02/2024       |

  @NewBusiness @S1a
  Scenario Outline: Carfax UI US44545 - S1a - New Business - "<TC_ID>" - "<effectiveDate>" on day before PDF

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US44545" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"

    When I am logged in to Pure as Broker
    * I initiate a new quote as broker

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block
    * I fill out PA additional operators block

    Then I verify "VIN Override" 0 checkbox is "not visible"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page
    * I fill out PA quote coverages page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I rate a quote
    * I refer a quote to underwriter

    Then I click exit customer

    When I am logged in to Pure as Field
    * I navigate to customers page
    * I select customer by ID
    * I open quote under customer
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I am logged in to Pure as Broker
    * I navigate to customers page
    * I select customer by ID
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "Operators & Vehicles" page
    * I fill out PA endorsement additional vehicles block carfax

    Then I verify "VIN Override" 1 checkbox is "not visible"

    When I fill out PA endorsement vehicle details page
    * I fill out PA endorsement coverages page
    * I review changes
    * I rate an endorsement

    Then I issue an endorsement

    When I click auto create renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax

    Then I verify "VIN Override" 2 checkbox is "not visible"

    @PrivatePassenger @CarfaxUI
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AK_001 | 11/13/2023    | 11/15/2023       |
      | AR_001 | 11/13/2023    | 11/15/2023       |
      | AZ_001 | 11/13/2023    | 11/15/2023       |
      | CO_001 | 11/13/2023    | 11/15/2023       |
      | DC_001 | 11/16/2023    | 11/17/2023       |
      | IA_001 | 11/13/2023    | 11/15/2023       |
      | IL_001 | 11/24/2023    | 11/25/2023       |
      | IN_001 | 11/13/2023    | 11/15/2023       |
      | KS_001 | 11/13/2023    | 11/15/2023       |
      | KY_001 | 12/04/2023    | 12/05/2023       |
      | MN_001 | 11/24/2023    | 11/25/2023       |
      | MO_001 | 11/13/2023    | 11/15/2023       |
      | MT_001 | 11/13/2023    | 11/15/2023       |
      | ND_001 | 11/13/2023    | 11/15/2023       |
      | NE_001 | 11/13/2023    | 11/15/2023       |
      | NH_001 | 11/13/2023    | 11/15/2023       |
      | NM_001 | 11/13/2023    | 11/15/2023       |
      | NV_001 | 11/13/2023    | 11/15/2023       |
      | OH_001 | 11/13/2023    | 11/15/2023       |
      | OK_001 | 11/13/2023    | 11/15/2023       |
      | OR_001 | 11/13/2023    | 11/15/2023       |
      | PA_001 | 11/13/2023    | 11/15/2023       |
      | RI_001 | 11/13/2023    | 11/15/2023       |
      | SD_001 | 11/13/2023    | 11/15/2023       |
      | TN_001 | 11/13/2023    | 11/15/2023       |
      | UT_001 | 11/13/2023    | 11/15/2023       |
      | VT_001 | 11/13/2023    | 11/15/2023       |
      | WA_001 | 11/13/2023    | 11/15/2023       |
      | WI_001 | 11/13/2023    | 11/15/2023       |
      | WV_001 | 11/13/2023    | 11/15/2023       |
      | WY_001 | 11/13/2023    | 11/15/2023       |
      | AL_001 | 11/13/2023    | 11/15/2023       |
      | CA_001 | 12/14/2023    | 12/15/2023       |
      | CT_001 | 11/13/2023    | 11/15/2023       |
      | DE_001 | 11/13/2023    | 11/15/2023       |
      | HI_001 | 11/13/2023    | 11/15/2023       |
      | LA_001 | 11/13/2023    | 11/15/2023       |
      | MA_001 | 11/13/2023    | 11/15/2023       |
      | MD_001 | 11/13/2023    | 11/15/2023       |
      | ME_001 | 11/13/2023    | 11/15/2023       |
      | MS_001 | 11/13/2023    | 11/15/2023       |
      | NC_001 | 11/13/2023    | 11/15/2023       |
      | NJ_001 | 11/13/2023    | 11/15/2023       |
      | NY_001 | 11/13/2023    | 11/15/2023       |
      | SC_001 | 11/13/2023    | 11/15/2023       |
      | VA_001 | 11/13/2023    | 11/15/2023       |
      | FL_001 | 11/13/2023    | 11/15/2023       |
      | TX_001 | 12/04/2023    | 12/05/2023       |
      | GA_001 | 11/13/2023    | 11/15/2023       |
      | MI_001 | 11/13/2023    | 11/15/2023       |
      | ID_001 | 11/13/2023    | 11/15/2023       |