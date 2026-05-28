@Flood @Performance @Moratorium
Feature: FS Performance

  Scenario Outline: Scenario 1 - HO Moratorium - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Additional_Interests" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"
    * I set "Address_Line_1_Txt" to "230 Kelly Drive"
    * I set "City_Name_Txt" to "Hamilton"
    * I set "Zip_Code" to "31811"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate a quote
    * I bind a quote

    Examples:
      | state  | user |
      | GA_001 | P100 |
      | GA_001 | P101 |
      | GA_001 | P102 |
      | GA_001 | P103 |
      | GA_001 | P104 |
      | GA_001 | P105 |
      | GA_001 | P106 |
      | GA_001 | P107 |
      | GA_001 | P108 |
      | GA_001 | P109 |
      | GA_001 | P110 |
      | GA_001 | P111 |
      | GA_001 | P112 |
      | GA_001 | P113 |
      | GA_001 | P114 |
      | GA_001 | P115 |
      | GA_001 | P116 |
      | GA_001 | P117 |
      | GA_001 | P118 |
      | GA_001 | P119 |
      | GA_001 | P120 |
      | GA_001 | P121 |
      | GA_001 | P122 |
      | GA_001 | P123 |
      | GA_001 | P124 |
      | GA_001 | P125 |
      | GA_001 | P126 |
      | GA_001 | P127 |
      | GA_001 | P128 |
      | GA_001 | P129 |
      | GA_001 | P130 |
      | GA_001 | P131 |