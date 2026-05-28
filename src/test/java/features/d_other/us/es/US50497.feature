@US50497 @Iteration5 @MarchPostPROD
Feature: PURE Programs - LA - ES - Add Acknowledgement Form to Application

  Scenario: ES LA - Verify that new form is attached for application document (PPHV-DSC-LA-003 (11/2018))

    * I have entered test data for test case "LA_001" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I set "Effective_Date" to "03/22/2025"

    * I load random user data
    * I am logged in to Pure as "P51"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    Then I click create application
    * I think for 15 to 20 seconds
    * I download the file "MGU Excess Application" and verify keywords
      | LOUISIANA DEPARTMENT OF INSURANCE LA. R.S. 22:438 FORM ACKNOWLEDGEMENT OF APPLICANT FOR PERSONAL LINES AND HEALTH AND ACCIDENT INSURANCE COVERAGE IN THE SURPLUS LINES MARKET                                                                                                     |
      | I am applying for personal lines or health and accident insurance coverage in the surplus lines market. By placing my initials on the four (4) statements below, and dating and signing this form, I hereby acknowledge the following in accordance with La. R.S. 22:438, to wit: |
      | The insurance may be placed with an approved unauthorized insurer or eligible unauthorized insurer.                                                                                                                                                                               |
      | In the event of insolvency of the insurer, losses shall not be paid by the Louisiana Insurance Guaranty Association or the Louisiana Life and Health Insurance Guaranty Association.                                                                                              |
      | I expressly authorize the procurement of surplus lines coverage                                                                                                                                                                                                                   |
      | Any surplus lines coverage shall be procured through a duly licensed surplus lines broker                                                                                                                                                                                         |
      | Name of Property & Casualty Producer:                                                                                                                                                                                                                                             |
      | This form shall be maintained by the surplus lines broker                                                                                                                                                                                                                         |
      | NOTICE:                                                                                                                                                                                                                                                                           |
      | The language and format of this Form shall not be altered                                                                                                                                                                                                                         |
      | PPHV-DSC-LA-003 (11/2018)                                                                                                                                                                                                                                                         |

