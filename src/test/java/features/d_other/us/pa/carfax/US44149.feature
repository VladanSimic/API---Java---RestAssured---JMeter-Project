@PersonalAuto @US44149
Feature: Change Request - Carfax UI - Hide Short VIN Field

  As an Underwriting Manager I want to hide Short VIN field on the UI
  for Private Passenger Vehicles as we don't make calls using this field to obtain Carfax reports.
  Additionally, we would want to update the existing static message to guide the users
  to check VIN Override button if the user wants to get an indication without
  entering full 17-digit VIN.

  @NewBusiness @Endorsement @Renewal @OOS @S1
  Scenario Outline: New Business Effective Date - "<testCaseDataID>"

    Given I have entered test data for test case "<testCaseDataID>" in excel workbook "us/US44149" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "1" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is shown

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I initiate new endorsement
    * I add changes on "PA" endorsement

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "2" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is shown

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "3" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is shown

    When I navigate to "Coverages" page
    * I navigate to previous page
    * I navigate to previous page
    * I set vehicle details estimated annual mileage to "8000"
    * I navigate to previous page
    * I set vehicle details estimated annual mileage to "8000"

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal
    * I think for 60 to 70 seconds

    When I set "Endorsement_Effective_Date_END" to "<effectiveDateOOS>"
    * I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "4" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is shown

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Examples:
      | testCaseDataID | effectiveDate | effectiveDateEND | effectiveDateOOS |
      | AK_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | AR_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | AZ_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | CO_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | DC_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | IA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | IL_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | IN_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | KS_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | KY_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MN_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MO_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MT_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | ND_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NE_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NH_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NM_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NV_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | OH_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | OK_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | OR_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | PA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | RI_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | SD_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | TN_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | UT_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | VT_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | WA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | WI_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | WV_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | WY_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | AL_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | CA_001         | 12/16/2024    | 12/18/2024       | 12/17/2024       |
      | CT_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | DE_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | HI_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | LA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MD_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | ME_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MS_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NC_001         | 11/15/2024    | 11/17/2024       | 11/16/2024       |
      | NJ_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | NY_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | SC_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | VA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | FL_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | TX_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | GA_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | MI_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |
      | ID_001         | 10/01/2024    | 10/03/2024       | 10/02/2024       |

  @NewBusiness @Endorsement @Renewal @OOS @S2
  Scenario Outline: Renewal Business Effective Date - "<testCaseDataID>"

    Given I have entered test data for test case "<testCaseDataID>" in excel workbook "us/US44149" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "1" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is not shown

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I initiate new endorsement
    * I add changes on "PA" endorsement

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "2" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is not shown

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "3" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is shown

    When I navigate to "Coverages" page
    * I navigate to previous page
    * I navigate to previous page
    * I set vehicle details estimated annual mileage to "8000"
    * I navigate to previous page
    * I set vehicle details estimated annual mileage to "8000"

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal
    * I think for 60 to 70 seconds

    When I set "Endorsement_Effective_Date_END" to "<effectiveDateOOS>"
    * I initiate new oos endorsement
    * I add changes on OOS "PA" endorsement

    Then I navigate to "Operators & Vehicles" page
    * I verify that "Short VIN" input "4" is not visible
    * I verify message "For an estimate you may select VIN Override button and enter the year, make and model. To obtain a more accurate quote please enter the full VIN. The full VIN will be required to bind." is not shown

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Examples:
      | testCaseDataID | effectiveDate | effectiveDateEND | effectiveDateOOS |
      | AK_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | AR_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | AZ_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | CO_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | DC_001         | 11/18/2023    | 11/20/2023       | 11/19/2023       |
      | IA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | IL_001         | 11/26/2023    | 11/28/2023       | 11/27/2023       |
      | IN_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | KS_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | KY_001         | 12/06/2023    | 12/08/2023       | 12/07/2023       |
      | MN_001         | 11/26/2023    | 11/28/2023       | 11/27/2023       |
      | MO_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | MT_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | ND_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NE_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NH_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NM_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NV_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | OH_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | OK_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | OR_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | PA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | RI_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | SD_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | TN_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | UT_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | VT_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | WA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | WI_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | WV_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | WY_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | AL_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | CA_001         | 12/16/2023    | 12/18/2023       | 12/17/2023       |
      | CT_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | DE_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | HI_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | LA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | MA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | MD_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | ME_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | MS_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NC_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NJ_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | NY_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | SC_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | VA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | FL_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | TX_001         | 12/06/2023    | 12/08/2023       | 12/07/2023       |
      | GA_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | MI_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |
      | ID_001         | 11/15/2023    | 11/17/2023       | 11/16/2023       |