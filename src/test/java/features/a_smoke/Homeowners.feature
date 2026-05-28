Feature: Homeowners line of business
  As a user I should be able to create homeowners line of business quotes and policies.

  @Homeowners @Smoke @CA
  Scenario: Smoke Homeowners - "CA_001"
  As a user I should be able to create and rate homeowners line of business quote for CA state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "CA_001" smoke test data from "QuoteCreatorHO" sheet
    And I load random user data

    When I login with OKTA user "Automation1"
    And I navigate to quotes page
    And I click new quote button
    And I search and select an agency
    And I enter the effective date
    And I enter the date of birth
    And I select the risk state
    And I check admitted or surplus line
    And I check the line of business
    And I check has the customer lived at the same address more than six months
    And I check is the customer entertainer athlete or political figure
    And I check is disclosure required and made
    And I select licensed producer
    And I select advisor servicer
    And I enter customers prefix
    And I enter customers first name
    And I enter customers last name
    And I enter customers MI
    And I enter customers suffix
    And I enter member occupation
    And I enter member employer
    And I set Address, City, Zip and State
    And I check spouse or partner
    And I click the next button
    And I click the create new customer button

    And I create a new "HO" quote
    And I get credit score results
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    And I review changes
    And I rate an endorsement
    Then I issue an endorsement
    And I create a renewal without process

  @Homeowners @Smoke @NY
  Scenario: Smoke Homeowners - "NY_001"
  As a user I should be able to create and rate homeowners line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_001" smoke test data from "QuoteCreatorHO" sheet
    And I load random user data

    When I login with OKTA user "A6"
    And I navigate to quotes page
    And I click new quote button
    And I search and select an agency
    And I enter the effective date
    And I enter the date of birth
    And I select the risk state
    And I check admitted or surplus line
    And I check the line of business
    And I check has the customer lived at the same address more than six months
    And I check is the customer entertainer athlete or political figure
    And I check is disclosure required and made
    And I select licensed producer
    And I select advisor servicer
    And I enter customers prefix
    And I enter customers first name
    And I enter customers last name
    And I enter customers MI
    And I enter customers suffix
    And I enter member occupation
    And I enter member employer
#    And I enter primary address line 1
#    And I enter address city
#    And I enter address zip code
#    And I select address state
    And I set Address, City, Zip and State
    And I check spouse or partner
    And I click the next button
    And I click the create new customer button

    And I create a new "HO" quote
    And I get credit score results
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    And I review changes
    And I rate an endorsement
    Then I issue an endorsement
    And I create a renewal without process

  @Homeowners @Smoke @TX
  Scenario: Smoke Homeowners - "TX_001"
  As a user I should be able to create and rate homeowners line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_001" smoke test data from "QuoteCreatorHO" sheet
    And I load random user data

    When I login with OKTA user "A17"
    And I navigate to quotes page
    And I click new quote button
    And I search and select an agency
    And I enter the effective date
    And I enter the date of birth
    And I select the risk state
    And I check admitted or surplus line
    And I check the line of business
    And I check has the customer lived at the same address more than six months
    And I check is the customer entertainer athlete or political figure
    And I check is disclosure required and made
    And I select licensed producer
    And I select advisor servicer
    And I enter customers prefix
    And I enter customers first name
    And I enter customers last name
    And I enter customers MI
    And I enter customers suffix
    And I enter member occupation
    And I enter member employer
#    And I enter primary address line 1
#    And I enter address city
#    And I enter address zip code
#    And I select address state
    And I set Address, City, Zip and State
    And I check spouse or partner
    And I click the next button
    And I click the create new customer button

    And I create a new "HO" quote
    And I get credit score results
    And I rate a quote
    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    And I review changes
    And I rate an endorsement
    Then I issue an endorsement
    And I create a renewal without process

  @Homeowners @TrueUpSmoke @SingleLocation @NewBusiness
  Scenario Outline: TrueUp Homeowners single location new business

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I load random user data
    * I set "Underc0de" as Agency Name and "747290200" as Agency ID
    * I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    @HomeownersResidenceType
    Examples:
      | TC_ID  | user |
      | NY_001 | Q10  |
      | TX_001 | Q11  |
      | CA_001 | Q12  |