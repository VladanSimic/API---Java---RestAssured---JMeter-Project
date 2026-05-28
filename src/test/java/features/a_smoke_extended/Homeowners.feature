Feature: Homeowners line of business
  As a user I should be able to create homeowners line of business quotes and policies.

  @Homeowners @ExtendedSmoke @CA
  Scenario: Homeowners California
  As a user I should be able to create and rate homeowners line of business quote for CA state.
  I want to check RiskMeter, EarthQuake, WildFire, GeoCoding, Standardized Address, PURE Analytics HOME,
  Quote Proposal, HO CLUE, Document Upload and Home Prefill as base check

    Given I use "CA_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P76" unless is PROD then "A1"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HOCA"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that the Standardized Address is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page

    When I navigate to "Earthquake" page through the Tree
    Then I verify Earthquake Report is pulled
    * I fill out HO quote earthquake details page

    When I navigate to "Wildfire" page through the Tree
    Then I verify Wildfire Report is pulled

    And I fill out HO quote previous losses coverages page

    When I navigate to "Additional Interests" page through the Tree
    Then I verify if mortgagee is returned
    And  I fill out the additional interests page for HO line of business

    Then I fill out HO quote member information page

    And I rate a quote

    When I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "CA Homeowner Quote Proposal"

    When I navigate to customer page
    Then I verify that Home CLUE is working

    When I navigate to customer page
    * I navigate to documents tab
    Then I upload 19mb document on customer documents tab

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Broker" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Broker" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page

    When I navigate to Location Details Page

    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled

    When I navigate to "Earthquake" page through the Tree
    Then I verify Earthquake Report is pulled

    When I navigate to "Wildfire" page through the Tree
    Then I verify Wildfire Report is pulled

    * I review changes
    * I navigate to customer page
    * I think for 10 to 10 seconds and i keep clicking customer summary tab for 55 times
    When I navigate to customer page
    Then I navigate to Risk Management tab
    And I verify that Skedulo Inspection Status is "Scheduled" on Risk Management Tab

  @Homeowners @ExtendedSmoke @NY
  Scenario: Homeowners New York
  As a user I should be able to create and rate homeowners line of business quote for NY state,
  do few assertions and bind it

    Given I use "NY_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P77" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HONY"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page

    And I fill out HO quote previous losses coverages page
    And I fill out the additional interests page for HO line of business
    * I enter data on LLC questioner block that will trigger OFAC referral
    And I fill out HO quote member information page
    And I rate a quote

    When I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if there are 2 OFAC referrals
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "NY Homeowner Quote Proposal"

    When I navigate to customer page
    Then I verify that Home CLUE is working

    When I navigate to customer page
    * I navigate to documents tab
    Then I upload 19mb document on customer documents tab

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I verify that "HO" insurance score is pulled
    * I rate a quote
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Home Owners" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I navigate to Homeowner Policy Page
    * I click add additional named insured
    * I set additional named insured 1 first name to "Marija"
    * I set additional named insured 1 last name to "Milosevic"
    * I click on the footer
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I think for 2 to 5 seconds
    * I verify if there are 1 OFAC referrals
    * I accept underwriting referrals
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Home Owners" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I verify that inflation factor is applied

    When I navigate to Location Details Page

    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled

    * I review changes

  @Homeowners @ExtendedSmoke @NY
  Scenario: DocuSign and Mini Diary
  As a user I should be able to create and rate homeowners line of business quote for NY state

    Given I use "NY_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P78" unless is PROD then "A17"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "Docusign"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote

    * I think for 5 to 7 seconds
    When I navigate to customer page
    * I navigate to documents tab
    Then I upload 19mb document on customer documents tab

    * I navigate to required forms tab
    * I populate and send DocuSign documents to email "jzlatkovic@pureinsurance.com" and broker email "avasic@pureinsurance.com"

#    And I open mini diary
#    Then I create a new email in mini diary email "dtrnavac@pureinsurance.com", cc "dtrnavac@pureinsurance.com"
    * I get customer account ID

  @Homeowners @ExtendedSmoke @KY
  Scenario: Homeowners Kentucky
  As a user I want to do a Weather Analytics, KY Tax Report in addition to base check.
  I should be able to create, modify and rate quote for KY state


    Given I use "KY_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P79" unless is PROD then "A19"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HOKY"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that KY Tax Report is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    Then I fill out HO quote basic location coverage details page
    * I verify that Weather Analytics is pulled
    And I fill out HO quote optional coverages page

    And I fill out HO quote previous losses coverages page
    And I fill out the additional interests page for HO line of business
    And I fill out HO quote member information page
    And I rate a quote

    When I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "KY Homeowner Quote Proposal"

    And I navigate to customer page
    Then I verify that Home CLUE is working

    When I navigate to customer page
    * I navigate to documents tab
    Then I upload 19mb document on customer documents tab

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I bind a quote

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
    * I download document "Home Owners" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I verify that inflation factor is applied

    When I navigate to Location Details Page

    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled

  @Homeowners @ExtendedSmoke @FL
  Scenario: Homeowners Florida
  As a user I want to do a Sinkhole, WindPool and Storm Surge assertions in addition to base check.
  I should be able to create, modify and rate quote for FL state

    Given I use "FL_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HOFL"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I verify that Geocoding is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    * I verify that Sinkhole is pulled
    * I verify that Storm Surge is pulled
    * I verify that WindPool is pulled

    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page

    And I verify that Flood Elevation Certificate is pulled
    And I fill out HO quote elevation certificate details

    And I fill out HO quote previous losses coverages page
    And I fill out HO quote inspection details page

    When I navigate to "Additional Interests" page through the Tree
    And  I fill out the additional interests page for HO line of business

    Then I fill out HO quote binding information page

    And I rate a quote

    When I navigate to underwriting referrals page
    Then I verify if location grade failed
    * I verify if OFAC returned "negative"
    And I accept underwriting referrals

    Then I generate and verify quote proposal document "FL Homeowner Quote Proposal"

    When I navigate to customer page
    Then I verify that Home CLUE is working

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I verify that "HO" insurance score is pulled
    * I rate a quote
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    When I navigate to New Business "1"
    Then I navigate to documents tab
    * I download document "Home Owners" and check if it's not null

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    Then I issue an endorsement

    Then I think for 15 to 16 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    When I navigate to Endorsement "1"
    Then I navigate to documents tab
    * I download document "Home Owners" and check if it's not null

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I verify that inflation factor is applied

    When I navigate to Location Details Page

    Then I verify that Geocoding is pulled
    * I verify that prefill is pulled
    * I verify that ISO Report is pulled
    * I verify if RiskMeter is pulled
    * I verify that Sinkhole is pulled
    * I verify that Storm Surge is pulled
    * I verify that WindPool is pulled
    And I verify that Flood Elevation Certificate is pulled

    * I review changes

  @Homeowners @ExtendedSmoke @NY @Tracking
  Scenario: Homeowners New York - Tracking 1
  As a user I should be able to create and rate homeowners line of business quote for NY state,
  and use the tracking email - John13Smith20001976+int3@gmail.com

    Given I use "NY_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P77" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HONY Tracking"
    * I set "Appraisal_Contact_Email" to "John13Smith20001976+int3@gmail.com"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page

    And I fill out HO quote previous losses coverages page
    And I fill out the additional interests page for HO line of business
    And I fill out HO quote member information page
    And I rate a quote

    When I navigate to underwriting referrals page
    And I accept underwriting referrals

    * I navigate to quotes detail page
    * I rate a quote
    * I bind a quote

  @Homeowners @ExtendedSmoke @NY @Tracking
  Scenario: Homeowners New York - Tracking 2
  As a user I should be able to create and rate homeowners line of business quote for NY state,
  and use the tracking email - John13Smith20001976+int4@gmail.com

    Given I use "NY_101" smoke test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P77" unless is PROD then "A6"
    Then I set Effective Date to Today
    * I set "First_Name" to "Smoke"
    * I set "Last_Name" to "HONY Tracking"
    * I set "Appraisal_Contact_Email" to "John13Smith20001976+int4@gmail.com"
    And I navigate to quotes page
    Then I initiate a new quote
    * I fill out HO quote cover page

    When I navigate to Location Details Page
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page

    And I fill out HO quote previous losses coverages page
    And I fill out the additional interests page for HO line of business
    And I fill out HO quote member information page
    And I rate a quote

    When I navigate to underwriting referrals page
    And I accept underwriting referrals

    * I navigate to quotes detail page
    * I rate a quote
    * I bind a quote
