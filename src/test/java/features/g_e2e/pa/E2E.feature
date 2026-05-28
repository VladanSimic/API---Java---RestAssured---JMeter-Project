@E2E_PA
Feature: E2E CARFAX Tests

  @TestCase1
  Scenario: Verify Carfax report returns UI values for manually added vehicle (Private Passenger, Antique, Exotic ,Classic) on NB and Endorsement Transactions

    Given I use "FL_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I navigate to "Operators & Vehicles" page
    * I fill out PA endorsement additional vehicles block carfax

    Then I verify "Year" input "2" has value "2012"
    * I verify "Make" input "2" has value "Mercedes Benz"
    * I verify "Model" input "2" has value "GL550"
    * I verify "Trim Level" input "2" has value "Empty"

    * I fill out PA endorsement vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "4,402"
    * I verify "Prefill Annual Mileage" input "1" has value "4402"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 17,080.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.4                  | Empty       | 382        | 5,388       | Internal Combustion | 391    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 300              | 480           | 61          | 65         |

    When I fill out PA endorsement coverages page
    * I fill out PA endorsement subjectivity page
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

  @TestCase2
  Scenario: Verify Carfax report returns UI values for vehicles obtained through online reports

    Given I use "AK_002" E2E test data from "QuoteCreatorPA" sheet

    * I set "Effective_Date" to "10/01/2024"
    * I set "Address_Line_1_Txt" to "AMBER BAY LOOP 3541"
    * I set "City_Name_Txt" to "ANCHORAGE"
    * I set "Zip_Code" to "99515"
    * I set "Date_Of_Birth" to "11/16/1958"
    * I set "First_Name" to "LORENE"
    * I set "Last_Name" to "DAVIS"
    * I set "Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_1" to "LORENE DAVIS"
    * I set "Optional_For_Quote_Required_To_Bind_Vehicle_Titled_In_The_Name_Of_2" to "LORENE DAVIS"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page

    Then I verify vehicles obtained through online reports
      | Include | Vehicle Type      | Year | Make   | Model    | VIN               | Trim Level                      |
      | Yes     | Private Passenger | 2022 | Toyota | COROLLA  | JTDEAMDEXNJ040426 | Sedan 4D LE 1.8L I4 Hybrid Auto |
      | Yes     | Private Passenger | 2022 | KIA    | SPORTAGE | KNDP63AC0N7995501 | Utility 4D Nightfall 2.4L I4    |

    When I fill out PA quote operators and vehicles page
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

  @TestCase3
  Scenario: Verify Carfax report returns UI values when Manually adding additional vehicles on Endorsement OOS

    Given I use "TX_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/03/2024"
    * I set "Endorsement_Effective_Date_END" to "10/04/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax
    * I fill out PA renewal additional operators block

    Then I verify "Year" input "2" has value "2012"
    * I verify "Make" input "2" has value "Mercedes Benz"
    * I verify "Model" input "2" has value "GL550"
    * I verify "Trim Level" input "2" has value "Empty"

    When I fill out PA renewal vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "4,402"
    * I verify "Prefill Annual Mileage" input "1" has value "4402"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 17,080.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.4                  | Empty       | 382        | 5,388       | Internal Combustion | 391    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 300              | 480           | 61          | 65         |

    When I fill out PA renewal coverages page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new oos endorsement
    * I navigate to "Operators & Vehicles" page
    * I fill out PA oos endorsement additional vehicles block carfax
    * I fill out PA oos endorsement additional operators block

    Then I verify "Year" input "2" has value "2011"
    * I verify "Make" input "2" has value "Mercedes Benz"
    * I verify "Model" input "2" has value "GL450"
    * I verify "Trim Level" input "2" has value "Empty"

    When I fill out PA oos endorsement vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "5,991"
    * I verify "Prefill Annual Mileage" input "1" has value "5991"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 8,980.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 335        | 5,346       | Internal Combustion | 339    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 300              | 480           | 57          | 58         |

    When I fill out PA oos endorsement coverages page
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

  @TestCase4
  Scenario: Verify Carfax repulls report for manually created renewal on every term

    Given I use "FL_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I get date pulled as "NB_Date"
    * I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I navigate to "2016 Mercedes Benz CLA250" page
    * I get date pulled as "RNW_Date"

    Then I should verify that "NB_Date" is older than "RNW_Date"

  @TestCase5
  Scenario: Verify Carfax repulls report for auto created and processed renewals on every term

    Given I use "FL_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I get date pulled as "NB_Date"
    * I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I click auto create renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I navigate to "2016 Mercedes Benz CLA250" page
    * I get date pulled as "RNW_Date"

    Then I should verify that "NB_Date" is older than "RNW_Date"

  @TestCase6
  Scenario: Verify Carfax report keeps manually edited mileage for existing vehicle/s in Endorsement as OOS

    Given I use "SC_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/03/2024"
    * I set "Endorsement_Effective_Date_END" to "10/04/2024"
    * I set "Vehicle_Details_Estimated_Annual_Mileage_1" to "20000"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new oos endorsement
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify "Estimated Annual Mileage" input "1" has value "20000"

    When I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

  @TestCase8
  Scenario: Verify that modifying VIN will trigger validation and re pull Carfax report for that vehicle

    Given I use "NY_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I set additional vehicle 0 VIN to "4JGBF8GE6CA775825"
    * I click save changes button

    Then I verify validation message "You have modified the VIN number and therefore a new request for mileage information will be made to the third party vendor" is displayed

  @TestCase9
  Scenario: Verify Carfax is not returning mileage but it returns agreed value, trim  and symbols for States: WV, SD, OR, MI, WI, KS, AK, PA

    Given I use "WV_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Vehicle_Details_Mileage_Band_Year_1" to ""

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Mileage Band/Year" input "1" has value "- Select -"
    * I verify "Prefill Annual Mileage" input is not displayed
    * I verify "Prefill Version" input is not displayed
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

  @TestCase12
  Scenario: Verify that Agent can create PA Quote with Carfax reports pulled for added vehicles

    Given I use "NC_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "11/15/2024"

    When I am logged in to Pure as Broker
    When I login with OKTA user "A1"
    * I initiate a new quote as broker

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Market Value" input "1" has value "$ 16,380.00"

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

  @TestCase13
  Scenario: Not re-running Agreed Value on endorsement if Garaging Zip Code changes

    Given I use "KY_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "2016 Mercedes Benz CLA250" page
    * I set vehicle details garaging code to "42788"
    * I click save changes button

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

  @TestCase14
  Scenario: Depreciation Logic

    Given I use "IL_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to ""

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Market Value Current Term" input "1" has value "$ 29,795.00"
    * I verify "Temporary override" 0 checkbox is "checked"

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "2024 Ford BRONCO" page

    Then I verify "Agreed Value Current Term" input "1" has value "$ 26,815.50"

  @TestCase15
  Scenario: Agreed Value Override logic

    Given I use "IL_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Vehicle_Details_Agreed_Value_Of_Vehicle_1" to ""

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Agreed Value Current Term" input "1" has value "$ 29,795.00"
    * I verify "Temporary override" 0 checkbox is "checked"

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "2024 Ford BRONCO" page

    Then I verify "Agreed Value Current Term" input "1" has value "$ 26,815.50"

  @TestCase16
  Scenario: Mileage

    Given I use "ME_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "11/15/2023"
    * I set "Vehicle_Details_Estimated_Annual_Mileage_1" to ""
    * I set "Vehicle_Details_Mileage_Band_Year_1" to ""

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"

    When I set vehicle details estimated annual mileage to "20,000"
    * I click save changes button

    Then I verify "Estimated Annual Mileage" input "1" has value "20,000"

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"

    When I set vehicle details estimated annual mileage to "20,000"
    * I click save changes button

    Then I verify "Estimated Annual Mileage" input "1" has value "20,000"

  @TestCase17
  Scenario: Add Vehicle Characteristics block (Acceleration 0-60, Engine Name, Engine Type, HP, Torque) and MV for Collectors

    Given I use "MN_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block

    Then I verify "Year" input "1" has value "2016"
    * I verify "Make" input "1" has value "Mercedes Benz"
    * I verify "Model" input "1" has value "CLA250"
    * I verify "Trim Level" input "1" has value "Empty"

    When I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Estimated Annual Mileage" input "1" has value "18,256"
    * I verify "Prefill Annual Mileage" input "1" has value "18256"
    * I verify "Prefill Version" input "1" has value "Last Owner Recent"
    * I verify "Market Value" input "1" has value "$ 16,400.00"

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

  @TestCase19
  Scenario: Manual Entry for Agreed Value and mileage (short vin, or no response)

    Given I use "AR_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Vehicle_Details_VIN_Number_1" to "WDDSJ4GB9GN3654"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"
    * I set "Vehicle_Details_VIN_Override_1" to "Yes"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page
    * I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote

  @TestCase21.1
  Scenario: Verify Permanent/Temporary override RNWL transaction 1

    Given I use "AK_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Market Value Current Term" input "1" has value "$ 29,795.00"
    * I verify "Temporary override" 0 checkbox is "checked"

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "2024 Ford BRONCO" page

    Then I verify "Agreed Value Current Term" input "1" has value "$ 26,815.50"

  @TestCase21.2
  Scenario: Verify Permanent/Temporary override RNWL transaction 2

    Given I use "DC_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify "Market Value Current Term" input "1" has value "$ 0.00"
    * I verify "Permanent Override" 0 checkbox is "checked"

    When I set "Agreed Value Current Term" to "20,000"
    * I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "1997 Chevrolet CAMARO" page

    Then I verify "Agreed Value Current Term" input "1" has value "$ 9,000.00"
    * I verify "Permanent Override" 0 checkbox is "checked"

  @TestCase23
  Scenario: Verify that CARFAX is returning Trim Level and Agreed value Current Term on Vehicle details page - Quote level

    Given I use "IN_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify "Trim Level" input "1" has value "Sedan 4 DR  2.0L I4    F DOHC 16V"
    * I verify "Agreed Value Current Term" input "1" has value "$ 16,400.00"

  @TestCase24
  Scenario: Verify that CARFAX is returning Symbols on Vehicle details page - All transactions

    Given I use "CA_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "12/06/2024"
    * I set "Endorsement_Effective_Date_END" to "12/07/2024"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"
    * I set "Vehicle_Details_Vehicle_Type_END_1" to "Private Passenger"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 295              | 505           | 59          | 50         |

    When I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax
    * I fill out PA renewal additional operators block
    * I fill out PA renewal vehicle details page

    Then I verify symbols block is displayed with
      | Liability Symbol | MP Symbol | COLL Symbol | COMP Symbol |
      | 300              | 480       | 57          | 58          |

    When I fill out PA renewal coverages page
    * I fill out PA renewal driver assignment page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    When I initiate new endorsement
    * I navigate to "Operators & Vehicles" page
    * I fill out PA endorsement additional vehicles block carfax
    * I fill out PA endorsement additional operators block
    * I fill out PA endorsement vehicle details page

    Then I verify symbols block is displayed with
      | Liability Symbol | PIP/MP Symbol | COLL Symbol | OTC Symbol |
      | 300              | 480           | 57          | 58         |

    When I fill out PA endorsement coverages page
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

  @TestCase25
  Scenario: Verify CARFAX is returning Trim level on Operators and vehicles page for added new vehicle/Endorsement

    Given I use "SD_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I navigate to "Operators & Vehicles" page
    * I fill out PA endorsement additional vehicles block carfax
    * I navigate to "2012 Mercedes Benz GL550" page

    Then I verify "Trim Level" input "1" has value "4 Door Wagon/Sport Utility 5.5L V8    F DOHC 32V"

  @TestCase26
  Scenario: Verify that CARFAX is returning  Agreed value Current Term, Agreed Value First Term and Agreed value Previous Transaction on Vehicle details page/Renewal

    Given I use "TN_002" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "10/01/2024"
    * I set "Endorsement_Effective_Date_END" to "10/02/2024"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify "Agreed Value First Term" input "1" has value "$ 10,000.00"
    * I verify "Agreed Value Previous Transaction" input "1" has value "$ 10,000.00"
    * I verify "Agreed Value Current Term" input "1" has value "$ 9,000.00"

  @TestCase28.1
  Scenario Outline: On new business PD filling

    Given I use "<state>" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "<effDate>"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Examples:
      | state  | effDate    |
      | CA_002 | 12/16/2024 |
      | NC_002 | 11/15/2024 |
      | KY_002 | 10/01/2024 |
      | DC_003 | 10/01/2024 |
      | TX_002 | 10/01/2024 |
      | IL_003 | 10/01/2024 |
      | MN_002 | 10/01/2024 |
      | AR_002 | 10/01/2024 |

  @TestCase28.2
  Scenario Outline: Before new business PD filling date

    Given I use "<state>" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "<effDate>"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I navigate to "2016 Mercedes Benz CLA250" page

    Then I verify vehicle characteristics block is not displayed

    Examples:
      | state  | effDate    |
      | CA_002 | 12/15/2024 |
      | NC_002 | 11/14/2024 |
      | KY_002 | 09/30/2024 |
      | DC_003 | 09/30/2024 |
      | TX_002 | 09/30/2024 |
      | IL_003 | 09/30/2024 |
      | MN_002 | 09/30/2024 |
      | AR_002 | 09/30/2024 |

  @TestCase28.3
  Scenario Outline: On renewal PD filling date

    Given I use "<state>" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "<effDate>"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I fill out PA quote cover page
    * I fill out PA quote trust llc other legal entity page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA additional vehicles block carfax
    * I fill out PA additional operators block
    * I fill out PA quote driver details page
    * I fill out PA quote vehicle details page
    * I fill out PA quote driver assignment page
    * I fill out PA quote coverages page
    * I fill out PA quote manuscript endorsements page
    * I fill out PA quote member information page
    * I fill out PA quote application page
    * I fill out PA quote subjectivities page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax
    * I fill out PA renewal vehicle details page

    Then I verify vehicle characteristics block is displayed with
      | Acceleration 0 to 60 | Engine Name | Horsepower | Curb Weight | Engine Type         | Torque |
      | 6.9                  | Empty       | 208        | 3,384       | Internal Combustion | 258    |

    Examples:
      | state  | effDate    |
      | CA_003 | 12/16/2023 |
      | NC_003 | 11/15/2023 |
      | KY_003 | 12/06/2023 |
      | DC_003 | 11/18/2023 |
      | TX_003 | 12/06/2023 |
      | IL_003 | 11/26/2023 |
      | MN_003 | 11/26/2023 |
      | AR_003 | 11/15/2023 |

  @TestCase28.4
  Scenario Outline: Before renewal PD filling date

    Given I use "<state>" E2E test data from "QuoteCreatorPA" sheet
    * I load random user data
    * I set "Effective_Date" to "<effDate>"
    * I set "Vehicle_Details_Vehicle_Type_1" to "Private Passenger"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to "Operators & Vehicles" page
    * I fill out PA renewal additional vehicles block carfax
    * I fill out PA renewal vehicle details page

    Then I verify vehicle characteristics block is not displayed

    Examples:
      | state  | effDate    |
      | CA_003 | 12/15/2023 |
      | NC_003 | 11/14/2023 |
      | KY_003 | 12/05/2023 |
      | DC_003 | 11/17/2023 |
      | TX_003 | 12/05/2023 |
      | IL_003 | 11/25/2023 |
      | MN_003 | 11/25/2023 |
      | AR_003 | 11/14/2023 |