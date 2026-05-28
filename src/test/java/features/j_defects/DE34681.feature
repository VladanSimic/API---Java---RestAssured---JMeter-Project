@DE34681 @DEFECT
Feature:  [PROD SUPPORT] PA247737501 - Premium Correction amount wrong on original trx

  One BV that is used in Personal AUTO
  - AL, AR, HI, KY, NY and UT LOB rating
  were not initialized in the automated renewal workflow,
  and that caused issue.

  @NewBusiness @Renewal @PrivatePassenger
  Scenario Outline: Compare Renewal and Endorsement premiums for - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "de/DE34681" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "01/01/2025"
    * I set "Endorsement_Effective_Date_END" to "02/01/2026"
    #Override vehicle 1 details
    * I set "Vehicle_Details_VIN_Number_1" to "WDDSJ4GB9GN365476"
    * I set "Vehicle_Details_Year_1" to "2016"
    * I set "Vehicle_Details_Make_1" to "Mercedes Benz"
    * I set "Vehicle_Details_Model_1" to "CLA250"
    * I set "Vehicle_Details_Estimated_Annual_Mileage_1" to "30,000"
    * I set "Vehicle_Details_Mileage_Band_Year_1" to "20,001+"
    * I set "Vehicle_Details_Temporary_Override_1" to "Yes"
    * I set "Vehicle_Details_Agreed_Value_Current_Term_1" to "$ 30,000.00"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    * I click auto create renewal nd
    * I auto process a renewal

    * I navigate to policy bread crumb

    When I initiate new endorsement
    * I add changes on "PA" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Then I verify "Renewal" and "Endorsement" total after values match

    Examples:
      | TC_ID  |
      | HI_001 |
      | AR_001 |
      | KY_001 |
      | UT_001 |
      | AL_001 |
      | NY_001 |