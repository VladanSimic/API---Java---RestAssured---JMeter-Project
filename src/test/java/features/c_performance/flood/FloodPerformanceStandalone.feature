@Flood @Performance @Standalone
Feature: FS Performance

  Scenario Outline: Scenario 1 - HO optional coverage node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set all optional coverages to no

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P100 |
      | FL_001 | P101 |
      | LA_001 | P102 |
      | NC_001 | P103 |
      | MO_001 | P104 |
      | AL_001 | P105 |
      | KY_001 | P106 |
      | MS_001 | P107 |
      | AR_001 | P108 |

      | CA_001 | P109 |
      | FL_001 | P110 |
      | LA_001 | P111 |
      | NC_001 | P112 |
      | MO_001 | P113 |
      | AL_001 | P114 |
      | KY_001 | P115 |
      | MS_001 | P116 |
      | AR_001 | P117 |

      | CA_001 | P118 |
      | FL_001 | P119 |
      | LA_001 | P120 |
      | NC_001 | P121 |
      | MO_001 | P122 |
      | AL_001 | P123 |
      | KY_001 | P124 |
      | MS_001 | P125 |
      | AR_001 | P126 |

  Scenario Outline: Scenario 2 - HO flood node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | MA_001 | P127 |
      | GA_001 | P128 |
      | CT_001 | P129 |
      | NJ_001 | P130 |
      | IL_001 | P131 |
      | CO_001 | P132 |

      | MA_001 | P133 |
      | GA_001 | P134 |
      | CT_001 | P135 |
      | NJ_001 | P136 |
      | IL_001 | P137 |
      | CO_001 | P138 |

      | MA_001 | P139 |
      | GA_001 | P140 |
      | CT_001 | P141 |
      | NJ_001 | P142 |
      | IL_001 | P143 |
      | CO_001 | P144 |

  Scenario Outline: Scenario 3 - HS location node to FS New Business - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HS quote cover page
    * I fill out HS quote basic location coverage details page
    * I fill out HS quote optional coverages page
    * I fill out HS previous claim losses page
    * I fill out HS quote earthquake details page
    * I fill out HS quote wildfire details page
    * I fill out HS quote member information page
    * I navigate to location page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P145 |
      | FL_001 | P146 |
      | LA_001 | P147 |
      | NC_001 | P148 |
      | AL_001 | P149 |
      | MS_001 | P150 |
      | MA_001 | P151 |
      | GA_001 | P152 |
      | CT_001 | P153 |
      | NJ_001 | P154 |
      | CO_001 | P155 |

      | CA_001 | P156 |
      | FL_001 | P157 |
      | LA_001 | P158 |
      | NC_001 | P159 |

      | CA_001 | P160 |
      | FL_001 | P161 |
      | LA_001 | P162 |
      | NC_001 | P163 |
      | AL_001 | P164 |
      | MS_001 | P165 |
      | MA_001 | P166 |
      | GA_001 | P167 |
      | CT_001 | P168 |
      | NJ_001 | P169 |
      | CO_001 | P170 |

      | CA_001 | P171 |
      | FL_001 | P172 |
      | LA_001 | P173 |
      | NC_001 | P174 |

      | CA_001 | P175 |
      | FL_001 | P176 |
      | LA_001 | P177 |
      | NC_001 | P178 |
      | AL_001 | P179 |
      | MS_001 | P180 |
      | MA_001 | P181 |
      | GA_001 | P182 |
      | CT_001 | P183 |
      | NJ_001 | P184 |
      | CO_001 | P185 |

      | CA_001 | P186 |
      | FL_001 | P187 |
      | LA_001 | P188 |
      | NC_001 | P189 |

  Scenario Outline: Scenario 4 - HO optional coverage node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Optional Coverages" page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P190 |
      | FL_001 | P191 |
      | LA_001 | P192 |
      | NC_001 | P193 |
      | MO_001 | P194 |
      | AL_001 | P195 |
      | KY_001 | P196 |
      | MS_001 | P197 |
      | AR_001 | P198 |

      | CA_001 | P199 |
      | FL_001 | P200 |
      | LA_001 | P201 |
      | NC_001 | P202 |
      | MO_001 | P203 |
      | AL_001 | P204 |
      | KY_001 | P205 |
      | MS_001 | P206 |
      | AR_001 | P207 |

  Scenario Outline: Scenario 5 - HO flood node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | MA_001 | P208 |
      | GA_001 | P209 |
      | CT_001 | P210 |
      | NJ_001 | P211 |
      | IL_001 | P212 |
      | CO_001 | P213 |

      | MA_001 | P214 |
      | GA_001 | P215 |
      | CT_001 | P216 |
      | NJ_001 | P217 |
      | IL_001 | P218 |
      | CO_001 | P219 |

  Scenario Outline: Scenario 6 - HS location node to FS Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set all optional coverages to no
    * I set "Manuscript_Endorsements" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Would_You_Like_Non_Admitted_PF_Quote" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HS" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I navigate to location page
    * I set would you like non admitted primary flood quote to "Yes"
    * I click "No" radio button for label "Is the basement, or any other area of the dwelling including a sunken room or sunken portion of a room, below ground level (subgrade) on all sides?"
    * I click save changes button
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate and bind an FS quote

    Examples:
      | state  | user |
      | CA_001 | P220 |
      | FL_001 | P221 |
      | LA_001 | P222 |
      | NC_001 | P223 |
      | AL_001 | P224 |
      | MS_001 | P225 |
      | MA_001 | P226 |
      | GA_001 | P227 |
      | CT_001 | P228 |
      | NJ_001 | P229 |
      | CO_001 | P230 |

      | CA_001 | P231 |
      | FL_001 | P232 |
      | LA_001 | P233 |
      | NC_001 | P234 |

      | CA_001 | P235 |
      | FL_001 | P236 |
      | LA_001 | P237 |
      | NC_001 | P238 |
      | AL_001 | P239 |
      | MS_001 | P240 |
      | MA_001 | P241 |
      | GA_001 | P242 |
      | CT_001 | P243 |
      | NJ_001 | P244 |
      | CO_001 | P245 |

      | CA_001 | P246 |
      | FL_001 | P247 |
      | LA_001 | P248 |
      | NC_001 | P249 |
