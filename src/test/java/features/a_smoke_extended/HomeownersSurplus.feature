Feature: Homeowners Surplus line of business
  As a user I should be able to create homeowners surplus line of business quotes and policies.

  @HomeSurplus @ExtendedSmoke @FL
  Scenario: HomeSurplus Florida AIR
  As a user I should be able to create and rate homeowners surplus line of business

    Given I use "FL_101_AIR" smoke test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HSFLAIR"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HS quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    And I navigate to Home Surplus Lines Policy Page
    Then I fill out HS quote basic location coverage details page

    When I navigate to "Optional Coverages" page through the Tree
    * I set Primary Flood Dec Page Received to "No"

    And I fill out HS quote previous losses coverages page

    And I fill out HS quote member information page

    #Leaving this until release to PROD 03/21
    When I navigate to "Risk Model Information" page through the Tree
    #New Page name for FL
    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "AIR"

    Then I fill out HS quote application page

    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Surplus Lines Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Surplus Lines Package" and check if it's not null

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

  @HomeSurplus @ExtendedSmoke @TX
  Scenario: HomeSurplus Texas RMS
  As a user I should be able to create and rate homeowners surplus line of business

    Given I use "TX_101" smoke test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HSRMS"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HS quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    And I navigate to Home Surplus Lines Policy Page
    Then I fill out HS quote basic location coverage details page
    And I set Barrier Island to "Yes"

    When I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
    * I set Primary Flood Dec Page Received to "No"
    Then I fill out HS quote elevation certificate details page
    And I fill out HS quote previous losses coverages page

    When I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests

    And I fill out HS quote member information page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS21"

    Then I fill out HS quote application page

    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Package" and check if it's not null

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

  @HomeSurplus @ExtendedSmoke @FL
  Scenario: HomeSurplus Florida RMS
  As a user I should be able to create and rate homeowners surplus line of business

    Given I use "FL_101_RMS" smoke test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HSFLRMS"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HS quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    And I navigate to Home Surplus Lines Policy Page
    Then I fill out HS quote basic location coverage details page
    And I set Barrier Island to "Yes"

    When I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
    * I set Primary Flood Dec Page Received to "No"
    Then I fill out HS quote elevation certificate details page
    And I fill out HS quote previous losses coverages page

    When I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests

    And I fill out HS quote member information page

    #Leaving this until release to PROD 03/21
    When I navigate to "Risk Model Information" page through the Tree
    #New Page name for FL
    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS21"

    Then I fill out HS quote application page

    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Package" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Package" and check if it's not null

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

  @HomeSurplus @ExtendedSmoke @CA
  Scenario: HomeSurplus California
  As a user I should be able to create and rate homeowners surplus line of business

    Given I use "CA_001" smoke test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HSCA"
    * I add random numbers in data at the end for key "Address_Line_1_Txt"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HS quote cover page

    When I navigate via action button next
    Then I verify that Geocoding is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    And I navigate to Home Surplus Lines Policy Page
    Then I fill out HS quote basic location coverage details page

    And I fill out HS quote optional coverages page

    When I navigate to "Earthquake" page through the Tree
    Then I verify Earthquake Report is pulled
    * I fill out HS quote earthquake details page

    When I navigate to "Wildfire" page through the Tree
    Then I verify Wildfire Report is pulled
    * I verify that Guy Carpenter WF is pulled
    * I fill out HS quote wildfire details page

    And I fill out HS quote previous losses coverages page

    When I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests

    * I fill out HS quote member information page
    Then I fill out HS quote application page

    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote

    Then I navigate to underwriting referrals page
    And I set all referrals to yes
    And I accept underwriting referrals

    Then I bind a quote

  @HomeSurplus @ExtendedSmoke @HI
  Scenario: HomeSurplus Hawaii
  As a user I should be able to create and rate homeowners surplus line of business

    Given I use "HI_001" smoke test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HSHI"
    Then I set "Address_Line_1_Txt" to "520 Lunalilo Home Road"
    * I set "City_Name_Txt" to "Honolulu"
    * I set "Zip_Code" to "96825"

    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HS quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    And I navigate to Home Surplus Lines Policy Page
    Then I fill out HS quote basic location coverage details page

    When I navigate to "Optional Coverages" page through the Tree
    And  I set Include Excess Flood Coverage to "No"
    * I set Primary Flood Dec Page Received to "No"
    Then I fill out HS quote elevation certificate details page
    * I navigate to "Additional Interests" page through the Tree
    * I delete all additional interests

    And I fill out HS quote previous losses coverages page
    * I fill out HS quote member information page

    When I navigate to "ROL and Premium Information" page through the Tree
    Then I verify that HS Risk Model used is "RMS21"

    Then I fill out HS quote application page

    And I rate a quote

    And I navigate to underwriting referrals page
    Then I verify if there is no PURE Analytics Grade
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "Quote Proposal"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    Then I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Package" and check if it's not null
