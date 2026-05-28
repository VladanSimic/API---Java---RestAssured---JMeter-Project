@FullRegression @PredictiveAnalysis @Integration
Feature: Predictive Analysis Model Home Suite - Homeowners
  As a user I should be able to verify Predictive Analysis on all transactions and residence types for Homeowners LOB

  @Homeowners @HO @Homeowner @A @Grade @OOS
  Scenario: Predictive Home Model - New York Homeowner - A Grade

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis HO"
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "5 Hillandale Drive"
    * I set risk address 1 city to "Ballston Lake"
    * I set risk address 1 state to "NY"
    * I set risk address 1 zip to "12019"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "5 Hillandale Drive"
    * I set "City_Name_Txt" to "Ballston Lake"
    * I set "Zip_Code" to "12019"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "46 Glenville Street"
    * I set risk address 2 city to "Schenectady"
    * I set risk address 2 state to "NY"
    * I set risk address 2 zip to "12306"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "46 Glenville Street"
    * I set "City_Name_Txt" to "Schenectady"
    * I set "Zip_Code" to "12306"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Homeowners @HO @Homeowner @A @Grade @Conversion
  Scenario: Predictive Home Model - California Homeowner - A Grade Conversion

    Given I use "CA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis Conversion"
    * I set "Effective_Date" to "06/01/2023"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Risk_Characteristics_BCEG" to ""
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "A+"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"

  @Condo @CondoCoop @A @Grade
  Scenario: Predictive Home Model - New York Condo/Co-op - A Grade

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis Condo"
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "67-87 Booth Street"
    * I set risk address 1 city to "Forest Hills"
    * I set risk address 1 state to "NY"
    * I set risk address 1 zip to "11375"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "67-87 Booth Street"
    * I set "City_Name_Txt" to "Forest Hills"
    * I set "Zip_Code" to "11375"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "126 Windy Hill Road"
    * I set risk address 2 city to "Moriah"
    * I set risk address 2 state to "NY"
    * I set risk address 2 zip to "12960"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "126 Windy Hill Road"
    * I set "City_Name_Txt" to "Moriah"
    * I set "Zip_Code" to "12960"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Condo @CondoCoop @A @Grade @Conversion
  Scenario: Predictive Home Model - Missouri Condo/Co-op - A Grade Conversion

    Given I use "MO_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis Conversion"
    * I set "Effective_Date" to "06/01/2023"
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Risk_Characteristics_BCEG" to ""
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "A+"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"

  @Tenants @A @Grade
  Scenario: Predictive Home Model - New York Tenants - A Grade

    Given I use "NY_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis HO"
    * I set "Address_Line_1_Txt" to "123 6th St 1B"
    * I set "City_Name_Txt" to "Pelham"
    * I set "State" to "NY"
    * I set "Zip_Code" to "10803"
    * I set "Residence_Type" to "Tenants"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "67-87 Booth Street"
    * I set risk address 1 city to "Forest Hills"
    * I set risk address 1 state to "NY"
    * I set risk address 1 zip to "11375"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "67-87 Booth Street"
    * I set "City_Name_Txt" to "Forest Hills"
    * I set "Zip_Code" to "11375"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "126 Windy Hill Road"
    * I set risk address 2 city to "Moriah"
    * I set risk address 2 state to "NY"
    * I set risk address 2 zip to "12960"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I click on the footer
    * I click order property details button
    * I set "Address_Line_1_Txt" to "126 Windy Hill Road"
    * I set "City_Name_Txt" to "Moriah"
    * I set "Zip_Code" to "12960"
    * I set "State" to "NY"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    * I accept underwriting referrals
    Then I issue an endorsement

  @Tenants @A @Grade @Conversion
  Scenario: Predictive Home Model - New Jersey Tenants - A Grade Conversion

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis Conversion"
    * I set "Effective_Date" to "06/01/2023"
    * I set "Residence_Type" to "Tenants"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Additional_Interests" to ""
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "850"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "A+"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"

  @Homeowners @HO @Homeowner @F @Grade @OOS
  Scenario: Predictive Home Model - Texas Homeowner - F Grade

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"

    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis HO F"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001,Loss_002"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"

    * I set "Previous_Loss_Details_Source_2" to "Broker/CLUE"
    * I set "Previous_Loss_Details_Loss_Date_2" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_2" to "Flood Loss"
    * I set "Previous_Loss_Details_CAT_Loss_2" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_2" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_2" to "Yes"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "7823 Belgard St"
    * I set risk address 1 city to "Houston"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "77033"
    * I set risk address 1 residence type to "Homeowner"
    * I set risk address 1 replacement cost to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "7823 Belgard St"
    * I set "City_Name_Txt" to "Houston"
    * I set "Zip_Code" to "77033"
    * I set "State" to "TX"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "15347 Daystar Pass"
    * I set risk address 2 city to "San Antonio"
    * I set risk address 2 state to "TX"
    * I set risk address 2 zip to "78253"
    * I set risk address 2 residence type to "Homeowner"
    * I set risk address 2 replacement cost to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "15347 Daystar Pass"
    * I set "City_Name_Txt" to "San Antonio"
    * I set "Zip_Code" to "78253"
    * I set "State" to "TX"
    * I set "Year_Built" to "1960"
    * I set "Year_Built_Renovated" to ""
    * I set "Flood_Extension" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Homeowners @HO @Homeowner @F @Grade @Conversion
  Scenario: Predictive Home Model - Florida Homeowner - F Grade Conversion

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis Conversion F"
    * I set "Effective_Date" to "06/01/2023"
    * I set "Year_Built" to "1960"
    * I set "Year_Built_Renovated" to ""
    * I set "Additional_Interests" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"

    Then I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "A-"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"

  @Condo @CondoCoop @F @Grade @OOS @NEW
  Scenario: Predictive Home Model - Texas Condo/Co-op - F Grade

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"

    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis HO F"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""
    * I set "Additional_Interests" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Residence_Type" to "Condo/Co-op"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I rate a quote
    * I navigate to quotes detail page
    * I verify that LC360 Rules are pulled
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "5218 Shady Gardens Dr"
    * I set risk address 1 city to "Humble"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "77339"
    * I set risk address 1 residence type to "Condo/Co-op"
    * I set risk address 1 contents to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "5218 Shady Gardens Dr"
    * I set "City_Name_Txt" to "Humble"
    * I set "Zip_Code" to "77339"
    * I set "State" to "TX"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "137 Westridge Trl"
    * I set risk address 2 city to "Weatherford"
    * I set risk address 2 state to "TX"
    * I set risk address 2 zip to "76087"
    * I set risk address 2 residence type to "Condo/Co-op"
    * I set risk address 2 contents to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "137 Westridge Trl"
    * I set "City_Name_Txt" to "Weatherford"
    * I set "Zip_Code" to "76087"
    * I set "State" to "TX"
    * I set "Year_Built" to "1960"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I navigate to policy image page
    * I verify that LC360 Rules are pulled
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

  @Condo @CondoCoop @F @Grade @Conversion
  Scenario: Predictive Home Model - New Jersey Condo/Co-op - F Grade Conversion

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis HO F"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""
    * I set "Additional_Interests" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Residence_Type" to "Condo/Co-op"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"

  @Tenants @F @Grade @OOS
  Scenario: Predictive Home Model - Texas Tenants - F Grade

    Given I use "TX_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"

    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis HO F"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Residence_Type" to "Tenants"

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I initiate new endorsement 3 months ahead

    Then I click add additional risk addresses
    And I set risk address 1 address line 1 to "1921 19th Ave N"
    * I set risk address 1 city to "Texas City"
    * I set risk address 1 state to "TX"
    * I set risk address 1 zip to "77590"
    * I set risk address 1 residence type to "Tenants"
    * I set risk address 1 contents to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 1 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "1921 19th Ave N"
    * I set "City_Name_Txt" to "Texas City"
    * I set "Zip_Code" to "77590"
    * I set "State" to "TX"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead
    Then I click add additional risk addresses
    And I set risk address 2 address line 1 to "15207 Bratten Ln"
    * I set risk address 2 city to "Webster"
    * I set risk address 2 state to "TX"
    * I set risk address 2 zip to "77598"
    * I set risk address 2 residence type to "Tenants"
    * I set risk address 2 contents to "6000000"
    * I click save changes button
    * I click on the footer
    * I set risk address 2 windstorm or hail deductible to "2%"
    * I click save changes button
    * I click order property details button
    * I set "Address_Line_1_Txt" to "15207 Bratten Ln"
    * I set "City_Name_Txt" to "Webster"
    * I set "Zip_Code" to "77598"
    * I set "State" to "TX"
    * I set "Year_Built" to "1960"
    * I set "Year_Built_Renovated" to ""

    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    And I fill out HO quote optional coverages page
    * I fill out HO quote elevation certificate details page
    Then I fill out HO previous claim losses page
    * I fill out the additional interests page for HO line of business
    * I fill out HO quote member information page
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement

  @Tenants @F @Grade @Conversion
  Scenario: Predictive Home Model - New Jersey Tenants - F Grade Conversion

    Given I use "NJ_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    * I set "Last_Name" to "Analysis HO F"
    * I set "Year_Built" to "1952"
    * I set "Year_Built_Renovated" to ""
    * I set "Additional_Interests" to ""
    * I set "Loss_Claim_History_Any_Prior_Losses" to "Yes"
    * I set "Previous_Loss_Details_Losses" to "Loss_001"
    * I set "Previous_Loss_Details_Source_1" to "PURE"
    * I set "Previous_Loss_Details_Loss_Date_1" to "01/01/2024"
    * I set "Previous_Loss_Details_Loss_Type_1" to "Water Damage"
    * I set "Previous_Loss_Details_CAT_Loss_1" to "No"
    * I set "Previous_Loss_Details_Amount_Paid_1" to "85000"
    * I set "Previous_Loss_Details_Claim_Closed_1" to "Yes"
    * I set "Residence_Type" to "Tenants"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    Then I navigate to customer page
    * I navigate to insurance score management tab
    * I override insurance score to "250"
    * I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Old Home Predictive Analysis for all locations if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    When I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Home Predictive Analysis for all locations if grade returned is "F"

  @Homeowners @HO @Homeowner @A @Grade @Summary @AccountSummary
  Scenario: Predictive Home Model - Washington Homeowner - A Grade Account Summary

    Given I use "WA_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis Summary"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"
    * I set "Year_Built" to "2021"
    * I set "Year_Built_Renovated" to ""
    * I set "Additional_Interests" to ""

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Home Predictive Analysis for all locations if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to customer page
    Then I navigate to account summary tab
    And I verify on account summary if home model v3 risk grade is "A"

