Feature: Homeowners Surplus Coherent

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - Generic states "<TC_ID>" - New Business - Endorsement - Renewal

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Generic_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Last_Name" to "Automation<TC_ID>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
 #   * I review changes
 #   * I rate an endorsement
 #   * I navigate to underwriting alerts tab
 #   * I accept underwriting referrals
 #   Then I issue an endorsement
#
 #   When I navigate to transactions or endorsements
 #   * I create a renewal
 #   * I navigate to policy image page
 #   * I review and accept referrals on renewal if any
 #   * I navigate to policy image page
 #   * I add changes on "HS" renewal
 #   * I review changes
 #   * I click renewed premium
#
 #   Then I process a renewal

    Examples:
      | TC_ID  | effectiveDate | endorsementDate |
      | HI_001 | 07/01/2025    | 07/01/2025      |
      | HI_002 | 07/01/2025    | 07/01/2025      |
      | CO_001 | 07/01/2025    | 07/01/2025      |
      | CO_002 | 07/01/2025    | 07/01/2025      |
      | AL_001 | 07/01/2025    | 07/01/2025      |
      | AL_002 | 07/01/2025    | 07/01/2025      |
      | LA_001 | 07/01/2025    | 07/01/2025      |
      | LA_002 | 07/01/2025    | 07/01/2025      |
      | TX_001 | 07/01/2025    | 07/01/2025      |
      | TX_002 | 07/01/2025    | 07/01/2025      |
      | WY_001 | 07/01/2025    | 07/01/2025      |
      | WY_002 | 07/01/2025    | 07/01/2025      |
      | UT_001 | 07/01/2025    | 07/01/2025      |
      | UT_002 | 07/01/2025    | 07/01/2025      |
      | MT_001 | 07/01/2025    | 07/01/2025      |
      | MT_002 | 07/01/2025    | 07/01/2025      |
      | GA_001 | 07/01/2025    | 07/01/2025      |
      | GA_002 | 07/01/2025    | 07/01/2025      |
      | AZ_001 | 07/01/2025    | 07/01/2025      |
      | AZ_002 | 07/01/2025    | 07/01/2025      |
      | MS_001 | 07/01/2025    | 07/01/2025      |
      | MS_002 | 07/01/2025    | 07/01/2025      |

  @HomeownersSurplus @NewBusiness @Endorsement
  Scenario Outline: - HS - "<TC_ID>" - New Business - Endorsement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data
    When I am logged in to Pure as Zonal
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "National Fire & Marine Insurance Company"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"
    * I set "Effective_Date" to "<effectiveDate>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate | endorsementDate |
      | CA_001 | 12/25/2024    | 12/25/2024      |

  @HomeownersSurplus @NewBusiness
  Scenario Outline:  Rate Duration - HS - "<TC_ID>" - New Business

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/ExternalRateQuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "First_Name" to "Ray"
    * I set "Last_Name" to "Ting"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "Safety Specialty Ins."

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Optional Coverages" page through the Tree
    * I set Include Excess Flood Coverage to "No"
#    * I rate a quote
    * I rate a quote with duration "<TC_ID>" to file "ExternalRateDuration"
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I review and accept referrals on renewal if any
    * I review changes
    * I click renewed premium
    * I process a renewal
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    Then I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate |
      | FL_001 | 24/01/2025    |
      | FL_001 | 12/16/2024    |
      | FL_002 | 12/16/2024    |
      | FL_003 | 12/16/2024    |
      | FL_004 | 12/16/2024    |
      | FL_005 | 12/16/2024    |
      | FL_006 | 12/16/2024    |
      | FL_007 | 12/16/2024    |
      | FL_008 | 12/16/2024    |
      | FL_009 | 12/16/2024    |
      | FL_010 | 12/16/2024    |
      | FL_011 | 12/16/2024    |
      | FL_012 | 12/16/2024    |
      | FL_013 | 12/16/2024    |
      | FL_014 | 12/16/2024    |
      | FL_015 | 12/16/2024    |
      | FL_015 | 12/16/2024    |
      | FL_015 | 12/16/2024    |
      | FL_016 | 12/16/2024    |
      | FL_017 | 12/16/2024    |
      | FL_018 | 12/16/2024    |
      | FL_019 | 12/16/2024    |
      | FL_019 | 08/01/2024    |
      | FL_019 | 08/01/2024    |
      | FL_020 | 08/01/2024    |

  @HomeownersSurplus @NewBusiness
  Scenario Outline: External Rate Duration - HS - "<TC_ID>" - New Business

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/ExternalRateQuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    And I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID
    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I set Primary Flood Dec Page Received to "No"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes

    Examples:
      | TC_ID  |
      | FL_001 |
      | FL_002 |
      | FL_003 |
      | FL_004 |
      | FL_005 |
      | FL_006 |
      | FL_007 |
      | FL_008 |
      | FL_009 |
      | FL_010 |
      | FL_011 |
      | FL_012 |
      | FL_013 |
      | FL_014 |
      | FL_015 |
      | FL_016 |
      | FL_017 |
      | FL_018 |
      | FL_019 |
      | FL_020 |

  @HomeownersSurplus @NewBusiness
  Scenario Outline: - HS - "<TC_ID>" - New Business - Verify dropdown values do not contain trailing spaces

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationHS_Dropdown" in sheet "QuoteCreatorHS" for "HS" LOB

    When I am logged in to Pure as Zonal
    * I set "Last_Name" to "Automation"
    * I navigate to quotes page
    * I initiate a new quote

    When I get customer account ID

    Then I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to Optional Coverages Page
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I set Primary Flood Dec Page Received to "No"

    When I rate a quote

    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "

    When I navigate to quotes detail page
    * I navigate to Home Surplus Lines Policy Page

    Then I click dropdown "Current Homeowners Insurance Carrier"
    * I verify "Current Homeowners Insurance Carrier" dropdown values do not contain trailing spaces
    * I click dropdown "Named Insured Type"
    * I verify "Named Insured Type" dropdown values do not contain trailing spaces
    * I click dropdown "Residence Type"
    * I verify "Residence Type" dropdown values do not contain trailing spaces
    * I click dropdown "AOP Deductible"
    * I verify "AOP Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "AOP Ded"
    * I verify "AOP Ded" dropdown values do not contain trailing spaces
    * I click dropdown "Hurricane Deductible"
    * I verify "Hurricane Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Hail Deductible"
    * I verify "Hail Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "WF Deductible"
    * I verify "WF Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Fire Peril Sublimit"
    * I verify "Fire Peril Sublimit" dropdown values do not contain trailing spaces

    When I click the next page button

    Then I click dropdown "Standardized Address"
    * I verify "Standardized Address" dropdown values do not contain trailing spaces
    * I click dropdown "Construction Type"
    * I verify "Construction Type" dropdown values do not contain trailing spaces
    * I click dropdown "Protection Class"
    * I verify "Protection Class" dropdown values do not contain trailing spaces
    * I click dropdown "Distance to Coast override"
    * I verify "Distance to Coast override" dropdown values do not contain trailing spaces
    * I click dropdown "Roof Shape"
    * I verify "Roof Shape" dropdown values do not contain trailing spaces
    * I click dropdown "Roof Shape Font"
    * I verify "Roof Shape Font" dropdown values do not contain trailing spaces
    * I click dropdown "Roof Covering"
    * I verify "Roof Covering" dropdown values do not contain trailing spaces
    * I click dropdown "Secondary Water Resistance"
    * I verify "Secondary Water Resistance" dropdown values do not contain trailing spaces
    * I click dropdown "Water Leak Detection System"
    * I verify "Water Leak Detection System" dropdown values do not contain trailing spaces
    * I click dropdown "Water Leak Detection System"
    * I verify "Perimeter Security Protection" dropdown values do not contain trailing spaces
    * I click dropdown "Perimeter Security Protection"
    * I verify "Roof Wall Connection" dropdown values do not contain trailing spaces
    * I click dropdown "Opening Protection"
    * I verify "Opening Protection" dropdown values do not contain trailing spaces
    * I click dropdown "Roof Deck Attachment"
    * I verify "Roof Deck Attachment" dropdown values do not contain trailing spaces
    * I click dropdown "Flood Zone"
    * I verify "Flood Zone" dropdown values do not contain trailing spaces

    When I navigate to Optional Coverages Page

    Then I click dropdown "Excess Flood Dwelling"
    * I verify "Excess Flood Dwelling" dropdown values do not contain trailing spaces
    * I click dropdown "Excess Flood Contents"
    * I verify "Excess Flood Contents" dropdown values do not contain trailing spaces
    * I click dropdown "Earthquake Extension Deductible"
    * I verify "Earthquake Extension Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Ensuing Fungi Increase Limit"
    * I verify "Ensuing Fungi Increase Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Incidental Business Threshold Increase Income Type"
    * I verify "Incidental Business Threshold Increase Income Type" dropdown values do not contain trailing spaces
    * I click dropdown "Increase Sub-Limit for Screen Enclosures Limit"
    * I verify "Replacement Cost Coverage" dropdown values do not contain trailing spaces
    * I click dropdown "Replacement Cost Coverage"
    * I verify "Increase Sub-Limit for Screen Enclosures Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Landscaping Increase Limit per Tree/Shrub"
    * I verify "Landscaping Increase Limit per Tree/Shrub" dropdown values do not contain trailing spaces
    * I click dropdown "Backup of Sewer or Drain Increase Limit"
    * I verify "Backup of Sewer or Drain Increase Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Minimum Earned Premium Limit"
    * I verify "Minimum Earned Premium Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Special Water Damage Deductible Coverage Type"
    * I verify "Special Water Damage Deductible Coverage Type" dropdown values do not contain trailing spaces
    * I click dropdown "Special Water Damage Deductible Deductible"
    * I verify "Special Water Damage Deductible Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Water Damage Sublimit Limit"
    * I verify "Water Damage Sublimit Limit" dropdown values do not contain trailing spaces

    When I navigate to "Earthquake" page through the Tree

    Then I click dropdown "Earthquake Coverage  Option"
    * I verify "Earthquake Coverage  Option" dropdown values do not contain trailing spaces
    * I click dropdown "MMI override"
    * I verify "MMI override" dropdown values do not contain trailing spaces
    * I click dropdown "Soil Grade override"
    * I verify "Soil Grade override" dropdown values do not contain trailing spaces
    * I click dropdown "Basic Contents Limit"
    * I verify "Basic Contents Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Basic Loss of Use"
    * I verify "Basic Loss of Use" dropdown values do not contain trailing spaces
    * I click dropdown "EQ Loss Assessment Coverage"
    * I verify "EQ Loss Assessment Coverage" dropdown values do not contain trailing spaces
    * I click dropdown "EQ Loss Assessment Coverage Override"
    * I verify "EQ Loss Assessment Coverage Override" dropdown values do not contain trailing spaces
    * I click dropdown "Basic Loss Assessment Deductible"
    * I verify "Basic Loss Assessment Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Broad Earthquake Deductible"
    * I verify "Broad Earthquake Deductible" dropdown values do not contain trailing spaces
    * I click dropdown "Broad Loss Assessment Deductible Coverage"
    * I verify "Broad Loss Assessment Deductible Coverage" dropdown values do not contain trailing spaces

    When I navigate to "Wildfire" page through the Tree

    * I click dropdown "Wildfire Hazard Severity"
    * I verify "Wildfire Hazard Severity" dropdown values do not contain trailing spaces
    * I click dropdown "What is the big picture of the brush risk?"
    * I verify "What is the big picture of the brush risk?" dropdown values do not contain trailing spaces
    * I click dropdown "Fuel type and direction of fuel"
    * I verify "Fuel type and direction of fuel" dropdown values do not contain trailing spaces
    * I click dropdown "Fuel type and direction of fuel"
    * I verify "Fuel type and direction of fuel" dropdown values do not contain trailing spaces
    * I click dropdown "Slope & Topography?"
    * I verify "Slope & Topography?" dropdown values do not contain trailing spaces
    * I click dropdown "What size community is the home located in?"
    * I verify "What size community is the home located in?" dropdown values do not contain trailing spaces
    * I click dropdown "Home proximity to brush area?"
    * I verify "Home proximity to brush area?" dropdown values do not contain trailing spaces
    * I click dropdown "Is the home within an extreme mudflow zone?"
    * I verify "Is the home within an extreme mudflow zone?" dropdown values do not contain trailing spaces
    * I click dropdown "Wildfire Threat override"
    * I verify "Wildfire Threat override" dropdown values do not contain trailing spaces
    * I click dropdown "Is There Adequate Defensible Space Around The Home"
    * I verify "Is There Adequate Defensible Space Around The Home" dropdown values do not contain trailing spaces
    * I click dropdown "Eave Soffits And Attic Vents Fitted With Narrow Mesh Screens"
    * I verify "Eave Soffits And Attic Vents Fitted With Narrow Mesh Screens" dropdown values do not contain trailing spaces
    * I click dropdown "Chimneys Fitted With Spark Arrestors"
    * I verify "Chimneys Fitted With Spark Arrestors" dropdown values do not contain trailing spaces
    * I click dropdown "Firewood Or Other Combustible Materials Are Stored At Least 30 Feet From The Home"
    * I verify "Firewood Or Other Combustible Materials Are Stored At Least 30 Feet From The Home" dropdown values do not contain trailing spaces
    * I click dropdown "Combustible Structures Or Fuel Tanks Are At Least 30 Feet"
    * I verify "Combustible Structures Or Fuel Tanks Are At Least 30 Feet" dropdown values do not contain trailing spaces
    * I click dropdown "Openings In Tile Or Metal Roofs Bird Stopped"
    * I verify "Openings In Tile Or Metal Roofs Bird Stopped" dropdown values do not contain trailing spaces

    When I navigate to "Previous Claim/Losses" page through the Tree

    Then I click dropdown "Previous loss details Source"
    * I verify "Previous loss details Source" dropdown values do not contain trailing spaces
    * I click dropdown "Previous loss details Loss Type"
    * I verify "Previous loss details Loss Type" dropdown values do not contain trailing spaces
    * I click dropdown "Previous loss details Claim Closed?"
    * I verify "Previous loss details Claim Closed?" dropdown values do not contain trailing spaces

    When I navigate to "Manuscript Endorsements" page through the Tree

    Then I click dropdown "Manuscript Endorsements Type"
    * I verify "Manuscript Endorsements Type" dropdown values do not contain trailing spaces

    When I navigate to "Collections Coverage by Class" page through the Tree

    Then I click dropdown "Worldwide Jewelry Blanket Coverage Single Article Limit"
    * I verify "Worldwide Jewelry Blanket Coverage Single Article Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Fine Arts Blanket Coverage Single Article Limit"
    * I verify "Fine Arts Blanket Coverage Single Article Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Collectibles Blanket Coverage Single Article Limit"
    * I verify "Collectibles Blanket Coverage Single Article Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Coins, silver, stamps, furs, musical instrumentsBlanket Coverage Single Article Limit"
    * I verify "Coins, silver, stamps, furs, musical instrumentsBlanket Coverage Single Article Limit" dropdown values do not contain trailing spaces
    * I click dropdown "Wine Blanket Coverage Single Article Limit"
    * I verify "Wine Blanket Coverage Single Article Limit" dropdown values do not contain trailing spaces

    Examples:
      | TC_ID  |
      | CA_001 |
      | CA_002 |
      | CA_003 |
      | CA_004 |
      | CA_005 |
      | FL_001 |
      | FL_002 |
      | FL_003 |
      | FL_004 |
      | FL_005 |
      | HI_001 |
      | HI_002 |
      | CO_001 |
      | CO_002 |
