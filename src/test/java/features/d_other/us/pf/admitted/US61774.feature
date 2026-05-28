@PrimaryFlood @Admitted @US61774
Feature: PF - Admitted - HO Basement question on Flood node needs to be set as Mandatory for Primary Flood Endorsement

  @TC116826
  Scenario Outline: US61774 - Verify the basement question is mandatory when PURE Flood Endorsement is Yes (NB Home/END Condo) - "<state>"

    Given I use "<TC>" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/06/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "<addressLine1>"
    * I set "City_Name_Txt" to "<city>"
    * I set "Zip_Code" to "<zip>"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"
    * I set "Wind_Or_Hail_Ded" to "<windHail>"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement

    When I navigate to "<cityState>" page
    * I click order property details button
    * I think for 20 to 30 seconds
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" element

    Then I verify "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" question is "mandatory"
    * I take screenshot "Basement question - mandatory"

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page for "<state>"
      | addressLine1          | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 1820 N Delany Rd 510  | Gurnee      | IL    | 60031 | Condo/Co-op   | 7500000 |           | 10,000 |               | 1 |
      | 1437 Columbine Street | Denver      | CO    | 80206 | Condo/Co-op   | 7500000 |           | 10,000 | 2%            | 1 |
      | 45 McKinley Avenue    | Norwich     | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 163 Shawn Ln          | Chatsworth  | GA    | 30705 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 7 Manor Ln            | Oxford      | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 378 Stanford St       | Perth Amboy | NJ    | 08861 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |

    * I click order property details button
    * I think for 20 to 30 seconds
    * I navigate to the newly added location page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" element

    Then I verify "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" question is "mandatory"
    * I take screenshot "Basement question - mandatory"

    Examples:
      | TC     | addressLine1         | city        | state | zip   | cityState      | windHail      |
      | IL_001 | 101 Main Street      | Evanston    | IL    | 60202 | Evanston IL    |               |
      | CO_001 | 101 Main Street      | Platteville | CO    | 80651 | Platteville CO |               |
      | CT_001 | 904 Howard Ave 8L    | New Haven   | CT    | 06519 | New Haven CT   |               |
      | GA_001 | 178 Springfield Blvd | Macon       | GA    | 31210 | Macon GA       | Not Available |
      | MA_001 | 25 Allied Dr         | Dedham      | MA    | 02026 | Dedham MA      |               |
      | NJ_001 | 38 Brookwood Dr      | Maplewood   | NJ    | 07040 | Maplewood NJ   |               |

  @TC116827
  Scenario Outline: US61774 - Verify the basement question is mandatory when PURE Flood Endorsement is Yes (NB Home/RNW Condo) - "<state>"

    Given I use "<TC>" smoke test data from "QuoteCreatorHO" sheet
    * I turn off optional data
    * I load random user data
    * I set "Effective_Date" to "09/07/2024"
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Address_Line_1_Txt" to "<addressLine1>"
    * I set "City_Name_Txt" to "<city>"
    * I set "Zip_Code" to "<zip>"
    * I set "Residence_Have_Basement" to "Yes"
    * I set "Basement_Finish_Is" to "Unfinished"
    * I set "Basement_Finish_Quality" to "Lower than the rest of the home"
    * I set "Basement_Total_SQF" to "100"
    * I set "Wind_Or_Hail_Ded" to "<windHail>"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new renewal

    When I navigate to "<cityState>" page
    * I click order property details button
    * I think for 20 to 30 seconds
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" element

    Then I verify "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?" question is "mandatory"
    * I take screenshot "Basement question - mandatory"

    When I navigate to Homeowner Policy Page and add new risk location with basic details except Flood Page for "<state>"
      | addressLine1          | city        | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible    | i |
      | 1820 N Delany Rd 510  | Gurnee      | IL    | 60031 | Condo/Co-op   | 7500000 |           | 10,000 |               | 1 |
      | 1437 Columbine Street | Denver      | CO    | 80206 | Condo/Co-op   | 7500000 |           | 10,000 | 2%            | 1 |
      | 45 McKinley Avenue    | Norwich     | CT    | 06360 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 163 Shawn Ln          | Chatsworth  | GA    | 30705 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 7 Manor Ln            | Oxford      | MA    | 01540 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |
      | 378 Stanford St       | Perth Amboy | NJ    | 08861 | Condo/Co-op   | 7500000 |           | 10,000 | Not Available | 1 |

    * I click order property details button
    * I think for 20 to 30 seconds
    * I navigate to the newly added location page
    * I navigate to "Flood Coverage" page
    * I click "Yes" radio button for distant label "Do you want to add the PURE Primary Flood Endorsement?"
    * I click save changes button
    * I scroll to "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" element

    Then I verify "Do you have a basement, or any area of the unit, including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides, OR, do you have any personal contents stored in a subgrade area in the building?" question is "mandatory"
    * I take screenshot "Basement question - mandatory"

    Examples:
      | TC     | addressLine1         | city        | state | zip   | cityState      | windHail      |
      | IL_001 | 101 Main Street      | Evanston    | IL    | 60202 | Evanston IL    |               |
      | CO_001 | 101 Main Street      | Platteville | CO    | 80651 | Platteville CO |               |
      | CT_001 | 904 Howard Ave 8L    | New Haven   | CT    | 06519 | New Haven CT   |               |
      | GA_001 | 178 Springfield Blvd | Macon       | GA    | 31210 | Macon GA       | Not Available |
      | MA_001 | 25 Allied Dr         | Dedham      | MA    | 02026 | Dedham MA      |               |
      | NJ_001 | 38 Brookwood Dr      | Maplewood   | NJ    | 07040 | Maplewood NJ   |               |