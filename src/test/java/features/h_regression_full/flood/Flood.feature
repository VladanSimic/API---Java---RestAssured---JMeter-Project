@FullRegression @Flood @Integration
Feature: Flood Suite - Homeowners and Home Surplus
  As a user I should be able to verify Flood integration on both Admitted and Surplus lines for Home

  @Homeowners @Homeowner @FL
  Scenario: Homeowners - FL Homeowner Residence Type - New Business

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "1250 S 5th Street"
    * I set risk address 1 city to "Macclenny"
    * I set risk address 1 state to "FL"
    * I set risk address 1 zip to "32063"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote inspection details page
    * I fill out HO quote binding information page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "Zip_Code" to "33034"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

  @Homeowners @Condo @Coop @CA
  Scenario: Homeowners - CA Condo/Co-op Residence Type - New Business

    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "4 Ontare Rd"
    * I set risk address 1 city to "Arcadia"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "91006"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote earthquake details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "Zip_Code" to "93723"
    * I set "State" to "CA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

  @Homeowners @Tenants @WA
  Scenario: Homeowners - WA Tenants Residence Type - New Business

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "State" to "WA"
    * I set "Zip_Code" to "99101"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "410 NE 70th St"
    * I set risk address 1 city to "Seattle"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98115"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "Zip_Code" to "99101"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

  @Homeowners @Homeowner @FL @Endorsement
  Scenario: Homeowners - FL Homeowner Residence Type - Endorsement

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "1250 S 5th Street"
    * I set risk address 1 city to "Macclenny"
    * I set risk address 1 state to "FL"
    * I set risk address 1 zip to "32063"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote inspection details page
    * I fill out HO quote binding information page
    * I fill out HO quote member information page

    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

  @Homeowners @Condo @Coop @CA @Endorsement
  Scenario: Homeowners - CA Condo/Co-op Residence Type - Endorsement

    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "4 Ontare Rd"
    * I set risk address 1 city to "Arcadia"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "91006"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote earthquake details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

  @Homeowners @Tenants @WA @Endorsement
  Scenario: Homeowners - WA Tenants Residence Type - Endorsement

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "State" to "WA"
    * I set "Zip_Code" to "99101"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "410 NE 70th St"
    * I set risk address 1 city to "Seattle"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98115"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

  @Homeowners @Homeowner @FL @OOS
  Scenario: Homeowners - FL Homeowner Residence Type - OOS Endorsement

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "1250 S 5th Street"
    * I set risk address 1 city to "Macclenny"
    * I set risk address 1 state to "FL"
    * I set risk address 1 zip to "32063"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote inspection details page
    * I fill out HO quote binding information page
    * I fill out HO quote member information page

    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    * I expand node tree if needed
    Then I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

  @Homeowners @Condo @Coop @CA @OOS
  Scenario: Homeowners - CA Condo/Co-op Residence Type - OOS Endorsement

    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "4 Ontare Rd"
    * I set risk address 1 city to "Arcadia"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "91006"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote earthquake details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    * I expand node tree if needed
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

  @Homeowners @Tenants @WA @OOS
  Scenario: Homeowners - WA Tenants Residence Type - OOS Endorsement

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "State" to "WA"
    * I set "Zip_Code" to "99101"
    * I set "Residence_Type" to "Tenants"
    * I set "Earthquake_Coverage_Options_Earth_Coverage_Option" to ""
    * I set "Year_Built" to "2008"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "410 NE 70th St"
    * I set risk address 1 city to "Seattle"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98115"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    * I expand node tree if needed
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "State" to "WA"
    * I set "Zip_Code" to "99101"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

  @Homeowners @Homeowner @FL @Renewal
  Scenario: Homeowners - FL Homeowner Residence Type - Renewal

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "State" to "FL"
    * I set "Zip_Code" to "33034"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "1250 S 5th Street"
    * I set risk address 1 city to "Macclenny"
    * I set risk address 1 state to "FL"
    * I set risk address 1 zip to "32063"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote inspection details page
    * I fill out HO quote binding information page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "Zip_Code" to "33034"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "1250 S 5th Street"
    * I set "City_Name_Txt" to "Macclenny"
    * I set "Zip_Code" to "32063"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "1215 Northwest 7th Avenue"
    * I set "City_Name_Txt" to "Florida City"
    * I set "Zip_Code" to "33034"
    * I set "State" to "FL"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowners @Condo @Coop @CA @Renewal
  Scenario: Homeowners - CA Condo/Co-op Residence Type - Renewal

    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Manual_Subjectivities" to ""
    * I set "Wildfire_Hazard_Reports_Wildfire_Hazard_Severity_Override" to "Low"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "4 Ontare Rd"
    * I set risk address 1 city to "Arcadia"
    * I set risk address 1 state to "CA"
    * I set risk address 1 zip to "91006"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "3000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote earthquake details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "Zip_Code" to "93723"
    * I set "State" to "CA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "4 Ontare Rd"
    * I set "City_Name_Txt" to "Arcadia"
    * I set "Zip_Code" to "91006"
    * I set "State" to "CA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "Zip_Code" to "93723"
    * I set "State" to "CA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @Homeowners @Tenants @WA @Renewal
  Scenario: Homeowners - WA Tenants Residence Type - Renewal

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "State" to "WA"
    * I set "Zip_Code" to "99101"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "410 NE 70th St"
    * I set risk address 1 city to "Seattle"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98115"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "3000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    * I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page

    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "Zip_Code" to "99101"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "410 NE 70th St"
    * I set "City_Name_Txt" to "Seattle"
    * I set "Zip_Code" to "98115"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I set "Address_Line_1_Txt" to "2718 Clark Lake Rd"
    * I set "City_Name_Txt" to "Addy"
    * I set "Zip_Code" to "99101"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I process a renewal

  @Homeowners @Homeowner @WA @ElevationCertificate
  Scenario: Homeowners - AE/A1-A30/A - NB-END-RN

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "18824 SE 42nd St"
    * I set "City_Name_Txt" to "Issaquah"
    * I set "State" to "WA"
    * I set "Zip_Code" to "98027"
    * I set "Optional_Coverages_Flood_Advantage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "2619 Lummi View Dr"
    * I set risk address 1 city to "Bellingham"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98226"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "2619 Lummi View Dr"
    * I set "City_Name_Txt" to "Bellingham"
    * I set "Zip_Code" to "98226"
    * I set "State" to "WA"
    * I set "Residence_Type" to "Condo/Co-op"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "4665 Surfcrest Dr"
    * I set risk address 2 city to "Oak Harbor"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "98277"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I set risk address 2 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4665 Surfcrest Dr"
    * I set "City_Name_Txt" to "Oak Harbor"
    * I set "Zip_Code" to "98277"
    * I set "State" to "WA"
    * I set "Residence_Type" to "Tenants"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "2619 Lummi View Dr"
    * I set "City_Name_Txt" to "Bellingham"
    * I set "Zip_Code" to "98226"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "18824 SE 42nd St"
    * I set "City_Name_Txt" to "Issaquah"
    * I set "State" to "WA"
    * I set "Zip_Code" to "98027"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

  @Homeowners @Homeowner @WA @ElevationCertificate @OOS
  Scenario: Homeowners - AE/A1-A30/A - NB-OOS END-RN

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "18824 SE 42nd St"
    * I set "City_Name_Txt" to "Issaquah"
    * I set "State" to "WA"
    * I set "Zip_Code" to "98027"
    * I set "Optional_Coverages_Flood_Advantage" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "2619 Lummi View Dr"
    * I set risk address 1 city to "Bellingham"
    * I set risk address 1 state to "WA"
    * I set risk address 1 zip to "98226"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I set risk address 1 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "2619 Lummi View Dr"
    * I set "City_Name_Txt" to "Bellingham"
    * I set "Zip_Code" to "98226"
    * I set "State" to "WA"
    * I set "Residence_Type" to "Condo/Co-op"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "2619 Lummi View Dr"
    * I set "City_Name_Txt" to "Bellingham"
    * I set "Zip_Code" to "98226"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "18824 SE 42nd St"
    * I set "City_Name_Txt" to "Issaquah"
    * I set "State" to "WA"
    * I set "Zip_Code" to "98027"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "4665 Surfcrest Dr"
    * I set risk address 2 city to "Oak Harbor"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "98277"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I set risk address 2 number of family units to "1"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "4665 Surfcrest Dr"
    * I set "City_Name_Txt" to "Oak Harbor"
    * I set "Zip_Code" to "98277"
    * I set "State" to "WA"
    * I set "Residence_Type" to "Tenants"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote wildfire details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    * I expand node tree if needed

    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "2619 Lummi View Dr"
    * I set "City_Name_Txt" to "Bellingham"
    * I set "Zip_Code" to "98226"
    * I set "State" to "WA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

    * I set "Address_Line_1_Txt" to "18824 SE 42nd St"
    * I set "City_Name_Txt" to "Issaquah"
    * I set "State" to "WA"
    * I set "Zip_Code" to "98027"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A"

  @Homeowners @Homeowner @LA @ElevationCertificate
  Scenario: Homeowners - V1-V30/VE - NB-END-RN

    Given I use "LA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "6461 Grand Caillou Rd"
    * I set risk address 1 city to "Houma"
    * I set risk address 1 state to "LA"
    * I set risk address 1 zip to "70363"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6461 Grand Caillou Rd"
    * I set "City_Name_Txt" to "Houma"
    * I set "Zip_Code" to "70363"
    * I set "State" to "LA"
    * I set "Residence_Type" to "Condo/Co-op"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "1095/1096 Four Point Rd"
    * I set risk address 2 city to "Dulac"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "70353"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1095/1096 Four Point Rd"
    * I set "City_Name_Txt" to "Dulac"
    * I set "Zip_Code" to "70353"
    * I set "State" to "LA"
    * I set "Residence_Type" to "Tenants"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I set "Address_Line_1_Txt" to "6461 Grand Caillou Rd"
    * I set "City_Name_Txt" to "Houma"
    * I set "Zip_Code" to "70363"
    * I set "State" to "LA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

  @Homeowners @Homeowner @LA @ElevationCertificate @OOS
  Scenario: Homeowners - V1-V30/VE - NB-OOS END-RN

    Given I use "LA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HO" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "6461 Grand Caillou Rd"
    * I set risk address 1 city to "Houma"
    * I set risk address 1 state to "LA"
    * I set risk address 1 zip to "70363"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "6461 Grand Caillou Rd"
    * I set "City_Name_Txt" to "Houma"
    * I set "Zip_Code" to "70363"
    * I set "State" to "LA"
    * I set "Residence_Type" to "Condo/Co-op"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    And I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "1095/1096 Four Point Rd"
    * I set risk address 2 city to "Dulac"
    * I set risk address 2 state to "WA"
    * I set risk address 2 zip to "70353"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I click on the footer
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1095/1096 Four Point Rd"
    * I set "City_Name_Txt" to "Dulac"
    * I set "Zip_Code" to "70353"
    * I set "State" to "LA"
    * I set "Residence_Type" to "Tenants"

    Then I switch to new created node
    * I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I select a transaction "Renewal"
    * I navigate to policy image page
    * I expand node tree if needed

    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I set "Address_Line_1_Txt" to "6461 Grand Caillou Rd"
    * I set "City_Name_Txt" to "Houma"
    * I set "Zip_Code" to "70363"
    * I set "State" to "LA"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

  @HS @HomeownersSurplus @LA @ElevationCertificate @Homeowner @Test
  Scenario: Homeowners Surplus - Homeowner Residence Type - V1-V30/VE

    Given I use "LA_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "21541 Highway 23"
    * I set "City_Name_Txt" to "Port Sulphur"
    * I set "State" to "LA"
    * I set "Zip_Code" to "70083"
    * I set "Collections_Add_CO_To_Home_Policy" to "No"
    * I set "Collections_Worldwide_Jewelry" to "No"
    * I set "Collections_Bank_Vaulted_Jewelry" to "No"
    * I set "Collections_Fine_Arts" to "No"
    * I set "Collections_Collectibles" to "No"
    * I set "Collections_CSSFMI" to "No"
    * I set "Collections_Wine" to "No"
    * I set "Collections_Miscellaneous_Valuable_Items" to "No"
    * I set "Residence_Type" to "Homeowner"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "V1-V30/VE"

    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @HS @HomeownersSurplus @CA @Condo @Coop
  Scenario: Homeowners Surplus - Condo/Co-op Residence Type - PRP - B/C/X

    Given I use "CA_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "7109 W Poe Ave"
    * I set "City_Name_Txt" to "Fresno"
    * I set "State" to "CA"
    * I set "Zip_Code" to "93723"
    * I set "Collections_Add_CO_To_Home_Policy" to "No"
    * I set "Collections_Worldwide_Jewelry" to "No"
    * I set "Collections_Bank_Vaulted_Jewelry" to "No"
    * I set "Collections_Fine_Arts" to "No"
    * I set "Collections_Collectibles" to "No"
    * I set "Collections_CSSFMI" to "No"
    * I set "Collections_Wine" to "No"
    * I set "Collections_Miscellaneous_Valuable_Items" to "No"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "PRP - B/C/X"

    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal

  @HS @HomeownersSurplus @FL @ElevationCertificate @Homeowner
  Scenario: Homeowners Surplus - Homeowner Residence Type - AE/A1-A30/A Unnumbered

    Given I use "FL_001" regression test data from "QuoteCreatorHS" sheet
    When I am logged in to Pure as "P80" unless is PROD then "A1"
    Then I load random user data
    * I set "Address_Line_1_Txt" to "8250 Sanderling Rd"
    * I set "City_Name_Txt" to "Sarasota"
    * I set "State" to "FL"
    * I set "Zip_Code" to "34242"
    * I set "Collections_Add_CO_To_Home_Policy" to "No"
    * I set "Collections_Worldwide_Jewelry" to "No"
    * I set "Collections_Bank_Vaulted_Jewelry" to "No"
    * I set "Collections_Fine_Arts" to "No"
    * I set "Collections_Collectibles" to "No"
    * I set "Collections_CSSFMI" to "No"
    * I set "Collections_Wine" to "No"
    * I set "Collections_Miscellaneous_Valuable_Items" to "No"
    * I set "Residence_Type" to "Homeowner"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "HS" quote
    And I navigate to Location Details Page
    * I set the distance to coast override to "< 1000 ft"
    Then I navigate to Optional Coverages Page
    And I set Include Excess Flood Coverage to "No"

    Then I navigate to Location Details Page
    * I verify flood integration based on flood zone "AE/A1-A30/A Unnumbered"

    * I rate a quote
    * I navigate to underwriting referrals page
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A Unnumbered"

    And I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    Then I create a renewal
    * I navigate to policy image page
    And I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    And I navigate to Location Details Page
    Then I verify flood integration based on flood zone "AE/A1-A30/A Unnumbered"
    And I fill out HS quote application page

    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal
