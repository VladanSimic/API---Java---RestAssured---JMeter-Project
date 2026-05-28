@FullRegression @OFAC @Integration @ExcessLiability @EX
Feature: OFAC Suite - Excess Liability
  As a user I should be able to verify OFAC positive and negative on all transactions for Excess Liability

  @NamedInsured
  Scenario Outline: <TC_ID> OFAC - Excess Liability Named Insured

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P74" unless is PROD then "A1"
    Then I set "First_Name" to "<FIRST_NAME>"
    Then I set "Last_Name" to "<LAST_NAME>"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if OFAC returned "<OPTION>"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I expand node tree if needed
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I navigate to policy image page
    * I think for 2 to 4 seconds
    * I navigate to "Operator Information" page through the Tree
    * I click add operator
    * I think for 2 to 3 seconds

    * I set operator first name to "Vladimir" for operator 1
    * I set operator last name to "Putin" for operator 1
    * I set operator DOB to "01/01/1991" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator license number to "5320001" for operator 1
    * I set operator resided at risk location for more than 6 months to "Yes" for operator 1
    * I set operator relationship to named insured to "Named Insured" for operator 1
    Then I click save changes button
    * I think for 5 to 7 seconds

    And I review changes
    * I rate an endorsement
    * I click review referrals
    Then I verify if OFAC returned "Positive"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting referrals page
    * I verify if there are <NUM_OF_REFERRALS_ON_RENEWAL> OFAC referrals

    #If option is Negative, put 1 as expected on Renewal because we add OFAC positive on END
    Examples:
      | TC_ID  | FIRST_NAME | LAST_NAME | OPTION   | NUM_OF_REFERRALS_ON_RENEWAL |
      | NY_001 | Marko      | Milosevic | Positive | 2                           |
      | CA_001 | Joe        | Green     | Negative | 1                           |

  @OtherEntity
  Scenario Outline: <TC_ID> OFAC - Excess Liability Other Entity

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P74" unless is PROD then "A1"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "EX" quote

    And I navigate to Excess Policy Page
    * I set the named insured type to "Other Legal Entity"
    * I click Create new Entity
    * I think for 3 to 5 seconds

    And I navigate via action button next
    * I think for 3 to 5 seconds
    * I set the LLC trust questionnaire legal entity name to "TestCO"
    * I set the LLC trust questionnaire block legal entity type to "Other"
    * I set the LLC trust questionnaire block other legal entity type to "Sole Trader"
    * I set the LLC trust questionnaire tax ID or FEIN to "12-3123123"
    * I set the LLC trust questionnaire address line 1 to "1815 E West Pkwy"
    * I set the LLC trust questionnaire city to "Fleming Island"
    * I set the LLC trust questionnaire state to "FL"
    * I set the LLC trust questionnaire ZIP to "32003"

    * I set the what is the address of location legal entity owns 0 address line 1 to "1815 E West Pkwy"
    * I set the what is the address of location legal entity owns 0 city to "Fleming Island"
    * I set the what is the address of location legal entity owns 0 state to "FL"
    * I set the what is the address of location legal entity owns 0 ZIP to "32003"

    * I set the please provide additional details what is the intent or purpose of the entity to "Test Entity"
    * I set the please provide additional details does the entity generate income or conduct business to "No"
    * I set the please provide additional details does the entity generate income in any other ways to "No"
    * I set the please provide additional details does the entity own any other real estate vehicles watercraft or other tangible assets to "No"
    * I set the policy information does the entity maintain any other insurance policies to "No"

    And I rate a quote
    * I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I accept underwriting referrals
    Then I navigate to quotes detail page

    And I navigate to Excess Policy Page
    * I think for 3 to 5 seconds
    * I navigate via action button next

    * I think for 3 to 5 seconds
    * I set the LLC trust questionnaire legal entity name to "Empresa Cubana De Aviacion"
    * I set the LLC trust questionnaire block other legal entity type to "Partnership"
    * I set the please provide the principal beneficial owners name or employees 0 first name to "Marko"
    * I set the please provide the principal beneficial owners name or employees 0 last name to "Milosevic"
    * I set the please provide the principal beneficial owners name or employees 0 DOB to "01/01/1991"
    * I set the please provide the principal beneficial owners name or employees 0 type to "Principal/Beneficial Owner"
    * I set the please provide the principal beneficial owners relationship to 0 named insured to "Named Insured"

    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify if there are 2 OFAC referrals
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I expand node tree if needed
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    Then I verify if OFAC returned "Negative"
    And I accept underwriting referrals

    Then I click more changes button
    * I think for 3 to 5 seconds
    * I navigate to Excess Policy Page
    * I think for 3 to 5 seconds
    * I navigate via action button next
    * I click update LLC button

    * I click add another legal entity inside legal entity beneficial owner block
    * I set legal entity 0 name to "ANSAR BANK" inside legal entity beneficial owner block
    * I set legal entity 0 address line 1 to "1816 E West Pkwy" inside legal entity beneficial owner block
    * I set legal entity 0 city to "Fleming Island" inside legal entity beneficial owner block
    * I set legal entity 0 state to "FL" inside legal entity beneficial owner block
    * I set legal entity 0 zip to "32003" inside legal entity beneficial owner block

    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Positive"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting referrals page
    Then I verify if there are 3 OFAC referrals

    Examples:
      | TC_ID  |
      | FL_001 |
      | TX_001 |

  @AdditionalInsured
  Scenario Outline: <TC_ID> OFAC - Excess Liability Additional Insured

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P74" unless is PROD then "A1"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "EX" quote

    And I navigate to Additional Insured Page
    * I click add additional insured
    * I set the additional insured 0 type to "Additional Insured"
    * I set the additional insured 0 name to "Petro TestCo"
    * I set the additional insured 0 address Line1 to "64 Bellview Terrace"
    * I set the additional insured 0 city to "Rensselaer"
    * I set the additional insured 0 state to "NY"
    * I set the additional insured 0 ZIP to "12144"

    Then I rate a quote
    And I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    When I accept underwriting referrals

    Then I navigate to quotes detail page
    And I navigate to Additional Insured Page
    * I delete all additional insured on a page

    * I click add additional insured
    * I set the additional insured 0 type to "Additional Insured"
    * I set the additional insured 0 name to "Edin Gacanin"
    * I set the additional insured 0 address Line1 to "64 Bellview Terrace"
    * I set the additional insured 0 city to "Rensselaer"
    * I set the additional insured 0 state to "NY"
    * I set the additional insured 0 ZIP to "12144"

    Then I rate a quote
    And I navigate to underwriting referrals page
    * I verify if OFAC returned "Positive"
    When I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I expand node tree if needed
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I navigate to policy image page

    Then I navigate to Additional Insured Page
    * I click add additional insured
    * I set the additional insured 1 type to "Additional Insured"
    * I set the additional insured 1 name to "Aleksandar Vulin"
    * I set the additional insured 1 LLC trust to "No"
    * I set the additional insured 1 address Line1 to "64 Bellview Terrace"
    * I set the additional insured 1 city to "Rensselaer"
    * I set the additional insured 1 state to "NY"
    * I set the additional insured 1 ZIP to "12144"

    And I review changes
    * I rate an endorsement
    * I click review referrals
    Then I verify if OFAC returned "Positive"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting referrals page
    * I verify if there are 2 OFAC referrals
    Examples:
      | TC_ID  |
      | FL_001 |
