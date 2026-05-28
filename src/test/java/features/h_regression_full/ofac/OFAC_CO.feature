@FullRegression @OFAC @Integration @Collection @CO
Feature: OFAC Suite - Collection
  As a user I should be able to verify OFAC positive and negative on all transactions for Collection

  @NamedInsured
  Scenario Outline: <TC_ID> OFAC - Collection Named Insured

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P78" unless is PROD then "A1"
    Then I set "First_Name" to "<FIRST_NAME>"
    Then I set "Last_Name" to "<LAST_NAME>"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if OFAC returned "<OPTION>"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I navigate to policy image page
    * I think for 2 to 4 seconds
    * I click the add named insured button
    * I click on the footer
    * I set the named insured 1 to "New Person"
    * I think for 1 to 3 seconds
    * I set the additional named insured 1 first name to "Vladimir"
    * I set the additional named insured 1 last name to "Putin"
    * I click on the footer
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
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I review referrals
    * I verify if there are <NUM_OF_REFERRALS_ON_RENEWAL> OFAC referrals

    #If option is Negative, put 1 as expected on Renewal because we add OFAC positive on END
    Examples:
      | TC_ID  | FIRST_NAME | LAST_NAME | OPTION   | NUM_OF_REFERRALS_ON_RENEWAL |
      | CA_001 | Marko      | Milosevic | Positive | 2                           |
      | FL_001 | Garry      | Swen      | Negative | 1                           |


  @OtherEntity
  Scenario Outline: <TC_ID> OFAC - Collection Other Entity

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P78" unless is PROD then "A1"

    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CO" quote
    * I navigate to Collections Page
    * I set the named insured type to "Other Legal Entity"
    * I click Create new Entity
    * I think for 3 to 5 seconds
    * I navigate via action button next
    * I think for 3 to 5 seconds
    * I set the LLC trust questionnaire legal entity name to "TestCO"
    * I set the LLC trust questionnaire block legal entity type to "Other"
    * I set the LLC trust questionnaire block other legal entity type to "Partnership"
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

    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I accept underwriting referrals

    Then I navigate to quotes detail page
    * I navigate to Collections Page
    * I think for 3 to 5 seconds
    * I navigate via action button next

    * I think for 3 to 5 seconds
    * I set the LLC trust questionnaire legal entity name to "Empresa Cubana De Aviacion"
    * I set the LLC trust questionnaire block other legal entity type to "General Partnership"
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
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I accept underwriting referrals

    Then I click more changes button
    * I think for 3 to 5 seconds
    * I navigate to Collections Page
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
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I review referrals
    Then I verify if there are 3 OFAC referrals

    Examples:
      | TC_ID  |
      | TX_001 |
      | NY_001 |


  @AdditionalInsured
  Scenario Outline: <TC_ID> OFAC - Collection Additional Insured

    Given I use "<TC_ID>" regression test data from "QuoteCreatorCO" sheet
    When I am logged in to Pure as "P71" unless is PROD then "A1"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CO" quote

    Then I navigate to Additional Insured and Interest Page
    * I click add additional insured
    * I set the additional insured 0 type to "Additional Insured"
    * I set the additional insured 0 name to "Edin Gacanin"
    * I set the additional insured 0 address Line1 to "64 Bellview Terrace"
    * I set the additional insured 0 city to "Rensselaer"
    * I set the additional insured 0 state to "NY"
    * I set the additional insured 0 ZIP to "12144"
    * I set the additional insured or interest 0 Applicable Class to "Worldwide Jewelry"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify if OFAC returned "Positive"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    When I navigate to underwriting referrals page
    * I verify if OFAC returned "Negative"
    And I navigate to policy image page
    * I think for 2 to 4 seconds

    Then I navigate to Additional Insured and Interest Page
    And I click add additional insured
    * I set the additional insured 1 type to "Additional Insured"
    * I set the additional insured 1 name to "Aleksandar Vulin"
    * I set the additional insured 1 address Line1 to "68 Bellview Terrace"
    * I set the additional insured 1 city to "Rensselaer"
    * I set the additional insured 1 state to "NY"
    * I set the additional insured 1 ZIP to "12144"
    * I set the additional insured or interest 1 Applicable Class to "Worldwide Jewelry"
    * I click save changes button

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
    * I think for 5 to 7 seconds
    * I click renewed premium
    * I think for 5 to 7 seconds
    * I review referrals
    * I verify if there are 2 OFAC referrals

    Examples:
      | TC_ID  |
      | CA_001 |
