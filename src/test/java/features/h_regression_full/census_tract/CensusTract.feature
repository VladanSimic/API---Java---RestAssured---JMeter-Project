@FullRegression @Integration @Census @CensusTract @PA @MI @PersonalAuto
Feature: MI Census Tract Suite
  As a user I should be able to verify census tract on PA LOB NB/END/RN


  @NB @NewBusiness
  Scenario: Census Tract - MI Personal Auto - New Business
  As a user I should be able to verify that Census Tract is returned on NB and bind the quote

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I navigate to quotes page
    Then I initiate a new quote
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"
    And I create a new "PA" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote

  @END @Endorsement
  Scenario: Census Tract - MI Personal Auto - New Business/Endorsement
  As a user I should be able to verify that Census Tract is returned on NB/END

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I navigate to quotes page
    Then I initiate a new quote
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"
    And I create a new "PA" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    And I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    When I navigate to Automobile Policy Page
    Then I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"

    And I review changes
    * I rate an endorsement
    Then I issue an endorsement

  @OOS
  Scenario: Census Tract - MI Personal Auto - New Business/OOS Endorsement
  As a user I should be able to verify that Census Tract is returned on NB/OOS END

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I navigate to quotes page
    Then I initiate a new quote
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"
    And I create a new "PA" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    And I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead

    When I navigate to Automobile Policy Page
    Then I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    Then I navigate to Automobile Policy Page
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"

  @RN @Renewal
  Scenario: Census Tract - MI Personal Auto - New Business/Renewal
  As a user I should be able to verify that Census Tract is returned on NB/RN

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I navigate to quotes page
    Then I initiate a new quote
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"
    And I create a new "PA" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    And I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page

    When I navigate to Automobile Policy Page
    Then I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"

    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    Then I process a renewal

  @NB @NewBusiness @Override
  Scenario: Census Tract Override - MI Personal Auto - New Business
  As a user I should be able to verify that Census Tract Override is working on NB

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I navigate to quotes page
    Then I initiate a new quote
    * I override Census Tract to "26045020302"
    * I verify that Census Tract is pulled
    * I verify that Territory is "68"
    And I create a new "PA" quote
    And I rate a quote

    And I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote

  @NB @NewBusiness @Agent
  Scenario: Census Tract Agent - MI Personal Auto - New Business
  As a user I should be able to verify that Census Tract Override is not displayed for Agent

    Given I use "MI_001" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "Agent1" unless is PROD then "A17"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "716 Berkshire Rd"
    * I set "City_Name_Txt" to "Grosse Pointe Park"
    * I set "State" to "MI"
    * I set "Zip_Code" to "48230"
    And I click new quote button
    Then I fill out the quote basic information page
    * I verify that Census Tract is pulled
    * I verify that Territory is "NotEmpty"
    * I verify that Manager Census Tract is "not displayed"