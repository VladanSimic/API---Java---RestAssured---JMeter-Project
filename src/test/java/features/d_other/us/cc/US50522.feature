@US50522 @Iteration4
Feature:US50510 - Programs - WI - COC - Application Update

  @US50522 @CC
  Scenario: TC_1 CC WI Homeowner - Verify paragraph is added to the "Applicant's statement" block on the bottom of page 4 of Application document

    Given I use "WI_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P83"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"


    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I rate a quote
    * I click create application
    * I think for 25 to 35 seconds
    * I download the file "Application" and verify keywords
      | PPBR-ABE-WI-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | I further acknowledge that this insurance is with an insurer which has not obtained a certificate of insurance to transact a regular insurance business in the state of Wisconsin, and will be issued and delivered as a surplus lines coverage pursuant to x. 618.41, Stats. The insurance is regulated by the Commissioner of Insurance only as provided in ss. 618.41 and 618.43, Stats. Section 618.43(1), Stats, requires payment by the policyholder of a 3% tax on gross premium. |


  @US50522 @CC
  Scenario: TC_2 CC WI Condo- Verify paragraph is added to the "Applicant's statement" block on the bottom of page 4 of Application document

    Given I use "WI_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P84"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "City_Name_Txt" to "Algoma"


    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I navigate to location page
    * I write text to "Residence Type" and value is "Condo/Co-op"
    * I rate a quote
    * I click create application
    * I think for 25 to 35 seconds
    * I download the file "Application" and verify keywords
      | PPBR-ABE-WI-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | I further acknowledge that this insurance is with an insurer which has not obtained a certificate of insurance to transact a regular insurance business in the state of Wisconsin, and will be issued and delivered as a surplus lines coverage pursuant to x. 618.41, Stats. The insurance is regulated by the Commissioner of Insurance only as provided in ss. 618.41 and 618.43, Stats. Section 618.43(1), Stats, requires payment by the policyholder of a 3% tax on gross premium. |