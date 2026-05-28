@Collections
Feature: Collections line of business
  As a user I should be able to create collections line of business quotes and policies.

  @Smoke @NY @NewBusiness @Endorsement @Renewal
  Scenario: Smoke Collections - NY_001
  As a user I should be able to create and rate collections line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I enter the effective date
    * I enter the date of birth
    * I select the risk state
    * I check admitted or surplus line
    * I check the line of business
    * I check has the customer lived at the same address more than six months
    * I check is the customer entertainer athlete or political figure
    * I check is disclosure required and made
    * I select licensed producer
    * I select advisor servicer
    * I enter customers prefix
    * I enter customers first name
    * I enter customers last name
    * I enter customers MI
    * I enter customers suffix
    * I enter member occupation
    * I enter member employer
    * I set Address, City, Zip and State
    * I check spouse or partner
    * I click the next button

    Then I click the create new customer button

    When I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I issue an endorsement
    * I create a renewal without process

  @Smoke @FL @NewBusiness @Endorsement @Renewal
  Scenario: Smoke Collections - FL_001
  As a user I should be able to create and rate collections line of business quote for FL state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "FL_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I login with OKTA user "A6"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I enter the effective date
    * I enter the date of birth
    * I select the risk state
    * I check admitted or surplus line
    * I check the line of business
    * I check has the customer lived at the same address more than six months
    * I check is the customer entertainer athlete or political figure
    * I check is disclosure required and made
    * I select licensed producer
    * I select advisor servicer
    * I enter customers prefix
    * I enter customers first name
    * I enter customers last name
    * I enter customers MI
    * I enter customers suffix
    * I enter member occupation
    * I enter member employer
    * I set Address, City, Zip and State
    * I check spouse or partner
    * I click the next button
    * I click the create new customer button

    When I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I issue an endorsement
    * I create a renewal without process

  @Smoke @TX @NewBusiness @Endorsement @Renewal
  Scenario: Smoke Collections - TX_001
  As a user I should be able to create and rate collections line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "TX_001" smoke test data from "QuoteCreatorCO" sheet
    * I load random user data

    When I login with OKTA user "A17"
    * I navigate to quotes page
    * I click new quote button
    * I search and select an agency
    * I enter the effective date
    * I enter the date of birth
    * I select the risk state
    * I check admitted or surplus line
    * I check the line of business
    * I check has the customer lived at the same address more than six months
    * I check is the customer entertainer athlete or political figure
    * I check is disclosure required and made
    * I select licensed producer
    * I select advisor servicer
    * I enter customers prefix
    * I enter customers first name
    * I enter customers last name
    * I enter customers MI
    * I enter customers suffix
    * I enter member occupation
    * I enter member employer
    * I set Address, City, Zip and State
    * I check spouse or partner
    * I click the next button
    * I click the create new customer button

    When I create a new "CO" quote
    * I get credit score results
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I override subjectivities
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I issue an endorsement
    * I create a renewal without process

  @TrueUpSmoke @NY @FL @TX @NewBusiness
  Scenario Outline: Smoke Collections - TrueUp - "<TC_ID>"
  As a user I should be able to create and rate collections line of business quote for TX state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I load random user data
    * I set "Underc0de" as Agency Name and "747290200" as Agency ID
    * I am logged in to Pure as "<user>"

    When I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  | user |
      | NY_001 | Q1   |
      | FL_001 | Q2   |
      | TX_001 | Q3   |