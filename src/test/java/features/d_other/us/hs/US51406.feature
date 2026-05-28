@US51406 @HS @ES @AprilRelease_PrePROD1
Feature: Programs - Update Renewal Offer Subject Line


  Scenario Outline: Programs HS | "<TC_ID>" | - Update Renewal Offer Subject Line

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    Then I set Effective Date to Today
#    * I set Effective Date 290 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I click send renewal offer button
    Then I think for 25 to 30 seconds
    * I verify if element with message "Home Surplus Lines Package - Renewal Offer" is "Displayed" on the UI
    * I download the file "Renewal Offer" and verify keywords
      | Grand Total |


    Examples:
      | TC_ID  | user | yesOrNo |
      | AL_001 | P3   |         |
      | AZ_001 | P16  |         |
      | CA_001 | P4   |         |
      | CO_001 | P15  |         |
      | FL_001 | P12  | No      |
      | GA_001 | P5   |         |
      | HI_001 | P20  |         |
      | LA_001 | P6   |         |
      | MA_001 | P7   |         |
      | MS_001 | P2   |         |
      | MT_001 | P17  |         |
      | NJ_001 | P9   |         |
      | NY_001 | P97  |         |
      | SC_001 | P8   |         |
      | NC_001 | P10  |         |
      | TX_001 | P11  |         |
      | UT_001 | P18  |         |
      | WY_001 | P19  |         |

  @DinoRenewalOffer
  Scenario Outline: Programs ES | "<TC_ID>" | - Update Renewal Offer Subject Line

    Given I use "<TC_ID>" regression test data from "QuoteCreatorES" sheet

    * I load random user data
    Then I set Effective Date to Today
#    * I set Effective Date 290 days in the past
    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    * I set "Advisor_Servicer_AWS_QA" to "Mirjana Nikolic"
    * I set "Licensed_Producer_AWS_QA" to "Ivana Antonijevic"

    * I set "Licensed_Producer_AWS_STG" to "Ivana Antonijevic"
    * I set "Advisor_Servicer_AWS_STG" to "Mirjana Nikolic"

    * I set "Advisor_Servicer_PROD" to "Nemanja Pecic"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "ES" quote

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I select created policy


    And I navigate to transactions or endorsements
    * I think for 25 to 35 seconds

    When I select created policy

    * I navigate to transactions or endorsements

    * I create a renewal
    * I navigate to policy image page
    * I navigate to Excess Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I fill out ES quote application page
    When I review changes
    * I click renewed premium
    * I click send renewal offer button
    Then I think for 25 to 30 seconds
    * I verify if element with message "Renewal Offer" is "Displayed" on the UI
    * I download the file "Renewal Offer" and verify keywords
      | Grand Total |

    Examples:
      | TC_ID  | user |
      | AL_001 | P3   |
      | CA_001 | P16  |
      | CT_001 | P4   |
      | FL_001 | P15  |
      | GA_001 | P12  |
      | LA_001 | P5   |
      | MA_001 | P20  |
      | MS_001 | P6   |
      | NC_001 | P7   |
      | NJ_001 | P2   |
      | NY_001 | P17  |
      | SC_001 | P9   |
      | TX_001 | P97  |