@US50510 @Iteration4
Feature:US50510 - Programs - OH - COC - Application Update

  @US50510 @CC
  Scenario: TC_1 CC OH Homeowner- Verify paragraph is added to the "Applicant's statement" block on the bottom of page 4 of Application document

    Given I use "OH_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P81"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"


    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I rate a quote
    * I click create application
    * I think for 25 to 35 seconds
    * I download the file "Application" and verify keywords
      | PPBR-ABE-OH-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | I further acknowledge that this insurance is to be placed with an insurance company not authorized to do business in Ohio. I understand that the insurance company is not a member of the Ohio Insurance Guaranty Association and that Chapter 3955 of the Ohio Revised Code is not applicable to claimants or insureds of said insurance company. The surplus line broker shall collect the Ohio tax of five percent of the amount of the premium for the insurance policy at the time the insurance policy is delivered to the insured. |


  @US50510 @CC
  Scenario: TC_2 CC OH Condo- Verify paragraph is added to the "Applicant's statement" block on the bottom of page 4 of Application document

    Given I use "OH_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P82"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "City_Name_Txt" to "Akron"



    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I navigate to location page
    * I write text to "Residence Type" and value is "Condo/Co-op"
    * I rate a quote
    * I click create application
    * I think for 25 to 35 seconds
    * I download the file "Application" and verify keywords
      | PPBR-ABE-OH-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | I further acknowledge that this insurance is to be placed with an insurance company not authorized to do business in Ohio. I understand that the insurance company is not a member of the Ohio Insurance Guaranty Association and that Chapter 3955 of the Ohio Revised Code is not applicable to claimants or insureds of said insurance company. The surplus line broker shall collect the Ohio tax of five percent of the amount of the premium for the insurance policy at the time the insurance policy is delivered to the insured. |