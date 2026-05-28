@GeneralRegression @FloodSurplus
Feature: Flood Surplus

  Scenario Outline: Flood Surplus (HO Optional Page) New Business + NB Endorsement - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHOFS" sheet
    Then I load random user data
    * I set Effective Date to Today
    * I set all optional coverages to no

    When I am logged in to Pure as "<user>"
    And I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate an FS quote
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    And I rate and bind an FS quote
    When I override subjectivities
    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes FS
    * I rate an FS quote
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    @PerformanceNEW
    Examples:
      | TC_ID  | user |
      | CA_001 | P100 |
      | FL_001 | P101 |
      | LA_001 | P102 |
      | NC_001 | P103 |
      | MO_001 | P104 |
      | AL_001 | P105 |
      | KY_001 | P106 |
      | MS_001 | P107 |
      | AR_001 | P108 |

  Scenario Outline: Flood Surplus (HO Flood Page) New Business + NB Endorsement - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHOFS" sheet
    Then I load random user data
    * I set Effective Date to Today

    When I am logged in to Pure as "<user>"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    Then I create a new "PF" quote
    * I rate an FS quote
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    And I rate and bind an FS quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    Examples:
      | TC_ID  | user |
      | MA_001 | P127 |
      | GA_001 | P128 |
      | CT_001 | P129 |
      | NJ_001 | P130 |
      | IL_001 | P131 |
      | CO_001 | P132 |

  Scenario Outline: Flood Surplus (HS Location Page) New Business + NB Endorsement - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHSFS" sheet
    Then I load random user data
    * I set Effective Date to Today
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

    Then I create a new "PF" quote
    * I rate an FS quote
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    And I rate and bind an FS quote

    When I override subjectivities
    Then I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes FS
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "equal" for "New Business" and "Endorsement"

    @PerformanceNEW
    Examples:
      | TC_ID  | user |
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

  Scenario Outline: Flood Surplus (HO Optional Page Endorsement) Quote - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHOFS" sheet
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
    * I rate an FS quote

    Examples:
      | TC_ID  | user |
      | CA_001 | P190 |
      | FL_001 | P191 |
      | LA_001 | P192 |
      | NC_001 | P193 |
      | MO_001 | P194 |
      | AL_001 | P195 |
      | KY_001 | P196 |
      | MS_001 | P197 |
      | AR_001 | P198 |

  Scenario Outline: Flood Surplus (HO Flood Page Endorsement) New Business - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set Effective Date to Today
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
    * I rate an FS quote
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    And I rate and bind an FS quote

    Examples:
      | TC_ID  | user |
      | IL_001 | P212 |
      | CO_001 | P213 |

  Scenario Outline: Flood Surplus (HO Flood Page Endorsement) Quote - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set Effective Date to Today
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "No"

    When I am logged in to Pure as "<user>"
    * I create a new "HO" quote for a new customer
    * I rate, bind and initiate new endorsement
    * I set "Would_You_Like_To_Quote_Non_Admitted_PF" to "Yes"
    * I navigate to "Flood Coverage" page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines

    * I rate an FS quote

    Examples:
      | TC_ID  | user |
      | MA_001 | P208 |
      | GA_001 | P209 |
      | CT_001 | P210 |
      | NJ_001 | P211 |

  Scenario Outline: Flood Surplus (HS Endorsement) New Business - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHSFS" sheet
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
    * I rate an FS quote
    Then I navigate to underwriting referrals page
    * I think for 3 to 5 seconds
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I navigate to quotes detail page
    And I rate and bind an FS quote

    Examples:
      | TC_ID  | user |
      | FL_001 | P232 |

  Scenario Outline: Flood Surplus (HS Endorsement) Quote - <TC_ID>
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHSFS" sheet
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

    * I rate an FS quote

    Examples:
      | TC_ID  | user |
      | CA_001 | P220 |
      | LA_001 | P222 |
      | NC_001 | P223 |
      | AL_001 | P224 |
      | MS_001 | P225 |
      | MA_001 | P226 |
      | GA_001 | P227 |
      | CT_001 | P228 |
      | NJ_001 | P229 |
      | CO_001 | P230 |