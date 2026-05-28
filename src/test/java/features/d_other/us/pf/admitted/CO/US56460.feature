@PrimaryFlood @Admitted @US56460
Feature: Change Request: PF - PURE Flood Endorsement UW Questions - Display & Function - Il & CO
  As a product manager, I want to ensure newly added questions to the Flood
  Node are working as expected for Endorsements and Renewal transactions

  @TC109607
  Scenario: US56460 - 5. Verify HO CO flood history questions are mandatory when PURE Primary Flood Endorsement is Yes and optional when No (NB / END) - 09/07/2025

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
    * I set "Has_Property_Been_Impacted_By_Flood_Event" to ""
    * I set "Has_Property_Experienced_Sump_Pump_Failure" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory"

    When I fill out HO Flood Coverage page

    Then I rate a quote
    * I verify validation message "Yellow fields are mandatory" is displayed

    * I take screenshot "UW questions and validation message"

    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"

    Then I rate, bind and initiate new endorsement

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | Platteville | CO    | 80651 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         | 1 |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory"

    When I fill out HO Flood Coverage page for additional location
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    Then I take screenshot "Endorsement issued"

  @TC109608
  Scenario: US56460 - 6. Verify HO CO flood history questions are optional when PURE Primary Flood Endorsement is "No" and become mandatory when "Yes" is selected (NB/RNW) - 09/07/2025

    Given I use "CO_003" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to ""
    * I set "Has_Property_Been_Impacted_By_Flood_Event" to ""
    * I set "Has_Property_Experienced_Sump_Pump_Failure" to ""

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer
    * I navigate to "Flood Coverage" page
    * I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory"

    When I fill out HO Flood Coverage page

    Then I rate, bind and initiate new renewal

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible | i |
      | 101 Main Street | Platteville | CO    | 80651 | Homeowner     | 7500000 |           | 10,000 | 2%         | 1 |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory"

    When I review changes
    * I review and accept referrals on renewal if any

    Then I verify validation message "Yellow fields are mandatory" is displayed
    * I take screenshot "UW questions"
# removed since it is not possible to process rnw more than 90 days in the future
#    When I click "No" radio button for label "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?"
#    * I click "No" radio button for label "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?"
#
#    Then I fill out HO Flood Coverage page for additional location
#
#    When I review changes
#    * I review and accept referrals on renewal if any
#    * I process a renewal
#
#    Then I take screenshot "Renewal processed"

  @TC109630
  Scenario: US56460 - 7. Verify that after HO CO post-PD END, UW questions are optional if blank or "No" for existing locations, but mandatory if "Yes" for both existing and new locations - 09/06/2025

    Given I use "CO_002" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I navigate to "Denver CO" page
    * I click order property details button

    When I navigate to "Flood Coverage" page

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (NB location)"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory (NB location)"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Homeowner     | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (second location)"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory (second location)"

  @TC109643
  Scenario: US56460 - 8. Verify that on HO CO post-PD RNW, UW questions are optional for existing locations, but mandatory for newly added ones - 09/07/2024

    Given I use "CO_001" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "1437 Columbine Street"
    * I set "City_Name_Txt" to "Denver"
    * I set "Zip_Code" to "80206"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new renewal
    * I navigate to "Denver CO" page
    * I click order property details button

    When I navigate to "Flood Coverage" page

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (NB location)"

    When I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1    | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 101 Main Street | Platteville | CO    | 80651 | Condo/Co-op   | 7500000 |           | 10,000 | 2%         |

    Then I navigate to "Platteville CO" page
    * I click order property details button
    * I navigate to "Flood Coverage" page

    When I click "No" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "not mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "not mandatory"
    * I take screenshot "UW questions - not mandatory (second location)"

    When I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button

    Then I verify "Has the property been impacted by any flood event or experienced any external-to-internal water damage in the last ten years?" field is "mandatory"
    * I verify "Has the property experienced any sump pump failure or backup of sewer drains in the last ten years?" field is "mandatory"
    * I take screenshot "UW questions - mandatory (second location)"