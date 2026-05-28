@PrimaryFlood @NonAdmitted @US49746
Feature: [Continued] FS - NonAdmitted - UI - Elevation Certificate page

  @TC102133
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 for FS Home - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "1,2,3,4" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 1,2,3,4"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "No. of permanent flood openings in the attached garage or enclosure(s) within 1.0 foot above adjacent grade" is displayed
    * I verify input "Total area of all permanent openings (flood vents) in square inches?" is displayed
    * I take screenshot "Elevation Page - Bottom of the attached garage"

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC102134
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 for FS Condo - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "1,2,3,4" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 1,2,3,4"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "No. of permanent flood openings in the attached garage or enclosure(s) within 1.0 foot above adjacent grade" is displayed
    * I verify input "Total area of all permanent openings (flood vents) in square inches?" is displayed
    * I take screenshot "Elevation Page - Bottom of the attached garage"

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC102135
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (w/vented garage) for FS Home - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 1,2,3,4 (w/ vented garage)"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC102136
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 1,2,3,4 (w/vented garage) for FS Condo - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "1,2,3,4 (w/ vented garage)" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 1,2,3,4 (w/ vented garage)"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC102137
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 5 for FS Home - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "5" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 5"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC102138
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 5 for FS Condo - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "5" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 5"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC102139
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 6 for FS Home - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "6" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 6"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is displayed
    * I verify input "What is the total net area of flood openings in square inches" is displayed
    * I take screenshot "Elevation Page - Bottom of the attached garage"

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC102140
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 7 for FS Condo - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "7" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 7"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is displayed
    * I verify input "What is the total net area of flood openings in square inches" is displayed
    * I take screenshot "Elevation Page - Bottom of the attached garage"

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_002 |
      | MA_002 |
      | TX_002 |
      | GA_002 |
      | CT_002 |
      | NJ_002 |
      | VA_002 |
      | IL_002 |
      | CO_002 |
      | CA_002 |
      | FL_002 |
      | LA_002 |
      | NC_002 |
      | MO_002 |
      | AL_002 |
      | KY_002 |
      | MS_002 |
      | AR_002 |

  @TC102141
  Scenario Outline: US49746 - Verify that the new questions listed in the US are added to the section "What is the Elevation of the" for Building Diagram - 8 for FS Home - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I navigate to "Elevation Certificate" page
    * I type "100" to "Base Flood Elevation" input field
    * I type "8" to "What is the building diagram number?" input field
    * I click save changes button

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed
    * I take screenshot "Elevation Page - 8"

    When I type "1" to "d) Bottom of the attached garage (top of slab)?" input field
    * I click save changes button

    Then I verify input "No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade" is displayed
    * I verify input "What is the total net area of flood openings in square inches" is displayed
    * I take screenshot "Elevation Page - Bottom of the attached garage"

    Then I verify input "f) Lowest adjacent (finished) grade next to building (LAG)?" is displayed
    * I verify input "g) Highest adjacent (finished) grade next to building (HAG)?" is displayed
    * I verify input "h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?" is displayed

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | TX_001 |
      | GA_001 |
      | CT_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | CO_001 |
      | CA_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |