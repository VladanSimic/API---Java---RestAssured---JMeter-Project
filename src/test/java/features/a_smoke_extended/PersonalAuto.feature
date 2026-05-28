Feature: Personal auto line of business
  As a user I should be able to create personal auto line of business quotes and policies.

  @PersonalAuto @ExtendedSmoke @NY @LexisNexis
  Scenario: Auto Prefill LexisNexis
  As a user I should be able to create and check Auto Prefill for Personal Auto LOB

    Given I use "NY_101_LN" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P83" unless is PROD then "A17"
    Then I set Effective Date to Today
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out PA quote cover page
    * I navigate to "Operators & Vehicles" page through the Tree
    * I verify that LexisNexis returned data
    * I get customer account ID

  @PersonalAuto @ExtendedSmoke @NY
  Scenario: Personal Auto New York
  As a user I should be able to create and rate personal auto line of business quote for NY state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "NY_101" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P84" unless is PROD then "A19"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "MI" to ""
    * I set "Last_Name" to "PANY"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out PA quote cover page

    * I navigate to "Operators & Vehicles" page through the Tree
    * I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page

    * I visit vehicle detail page and verify NADA and CARFAX
    * I fill out PA quote vehicle details page

    * I navigate to "Operators & Vehicles" page through the Tree
    * I exclude obtained vehicles if any

    * I navigate to "Coverages" page through the Tree
    * I fill out PA quote coverages page

    * I navigate to "Member Information & Policy History" page through the Tree
    * I fill out PA quote member information page

    And I rate a quote
    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    When I navigate to customer page
    Then I verify that Auto CLUE is working

    Then I run auto MVR
    Then I verify auto MVR processing is complete

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null


    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes

  @PersonalAuto @ExtendedSmoke @CA
  Scenario: Personal Auto California
  As a user I should be able to create and rate personal auto line of business quote for CA state,
  process it into a policy

    Given I use "CA_101" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P85" unless is PROD then "A1"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "MI" to ""
    * I set "Last_Name" to "PACA"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out PA quote cover page

    * I navigate to "Operators & Vehicles" page through the Tree

    * I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page

    * I visit vehicle detail page and verify NADA and CARFAX
    * I fill out PA quote vehicle details page

    * I navigate to "Driver Assignment" page through the Tree
    * I fill out PA quote driver assignment page

    * I navigate to "Coverages" page through the Tree
    * I fill out PA quote coverages page

    * I navigate to "Member Information & Policy History" page through the Tree
    * I fill out PA quote member information page

    And I rate a quote
    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    When I navigate to customer page
    Then I verify that Auto CLUE is working

    Then I run auto MVR
    Then I verify auto MVR processing is complete

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I visit vehicle detail page on NB and change agreed value to "50000"
    * I review changes
    * I visit Subjectivity page and populate subjectivities with document "19mb.pdf"
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "not equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes

  @PersonalAuto @ExtendedSmoke @MI
  Scenario: Personal Auto Michigan
  As a user I should be able to create and rate personal auto line of business quote for MI state,
  process it into a policy

    Given I use "MI_101" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A17"
    Then I set Effective Date to Today
    And I navigate to quotes page
    Then I initiate a new quote
    * I verify that Census Tract is pulled
    * I fill out PA quote cover page

    * I navigate to "Operators & Vehicles" page through the Tree

    * I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page

    * I visit vehicle detail page and verify NADA and CARFAX
    * I fill out PA quote vehicle details page


    * I navigate to "Coverages" page through the Tree
    * I fill out PA quote coverages page

    * I navigate to "Member Information & Policy History" page through the Tree
    * I fill out PA quote member information page

    And I rate a quote
    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "positive"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    When I navigate to customer page
    Then I verify that Auto CLUE is working

    Then I run auto MVR
    Then I verify auto MVR processing is complete

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I verify that "PA" insurance score is pulled
    * I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement

    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    And I accept underwriting referrals

    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null
    * I download document "ID Card" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page

  @PersonalAuto @ExtendedSmoke @MA @PROD
  Scenario: Personal Auto Massachusetts - PROD ENV
  As a user I should be able to create and rate personal auto line of business quote for MA state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "MA_101" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "Additional_Operators_Driver_License_Number" to "S11111111"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out PA quote cover page

    * I navigate to "Operators & Vehicles" page through the Tree

    * I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page

    * I visit vehicle detail page and verify NADA and CARFAX
    * I fill out PA quote vehicle details page

    * I navigate to "Coverages" page through the Tree
    * I fill out PA quote coverages page

    * I navigate to "Member Information & Policy History" page through the Tree
    * I fill out PA quote member information page

    And I rate a quote
    * I navigate to quotes detail page

    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes

  @PersonalAuto @ExtendedSmoke @MA @LowerENV
  Scenario: Personal Auto Massachusetts - Lower ENV
  As a user I should be able to create and rate personal auto line of business quote for MA state,
  process it into a policy and add endorsement and renewal transactions to it.

    Given I use "MA_101" smoke test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P87" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "BrokerID_AWS_QA" to "800391600"
    * I set "BrokerID_AWS_STG" to "800391600"
    * I set "Agency_Name_AWS_QA" to "Underc0de"
    * I set "Agency_Name_AWS_STG" to "Underc0de"
    * I set "Licensed_Producer_AWS_QA" to "Ana Vasic"
    * I set "Advisor_Servicer_AWS_QA" to "Ana Vasic"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out PA quote cover page

    * I navigate to "Operators & Vehicles" page through the Tree

    * I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page

    * I visit vehicle detail page and verify NADA and CARFAX
    * I fill out PA quote vehicle details page

    * I navigate to "Coverages" page through the Tree
    * I fill out PA quote coverages page

    * I navigate to "Member Information & Policy History" page through the Tree
    * I fill out PA quote member information page

    And I rate a quote
    * I navigate to quotes detail page

    And I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to driver page and verify RMV
    * I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Auto Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes