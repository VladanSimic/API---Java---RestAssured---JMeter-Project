@US50176 @Iteration4
Feature:As a NC Home Surplus policy document recipient, I want to see the required Flood Notice present
  in the policy package (Form code PURE-DSC-NC-005 (01/2025))

  @US50176
  Scenario Outline:TC_001 - Home Surplus Lines NC - Verify required Flood Notice present in the policy package (PURE-DSC-NC-005 (01/2025) on NB, and RN for carrier partner -"<carrierPartner>"

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<carrierPartner>"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"


    * I am logged in to Pure as "<user>"

    Then I navigate to quotes page
    * I initiate a new quote

    When I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    Then I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy
    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, EARTHQUAKES, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriter referrals on endorsement and renewal temp

    * I navigate to underwriting alerts tab
    * I think for 10 to 15 seconds
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, EARTHQUAKES, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |


    Examples:
      | user | carrierPartner                               |
      | P77  | Palomar Excess and Surplus Insurance Company |
      | P78  | PURE Specialty Exchange                      |

  @US50176
  Scenario Outline:TC_2 - Home Surplus Lines NC - Verify required Flood Notice present in the policy package (PURE-DSC-NC-005 (01/2025) on NB RWT carrier partner - "<carrier>"

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |


    Then I navigate to Home Surplus Lines Policy Page
    And I override underwriting company to "<carrier>"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, EARTHQUAKES, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |

    Examples:
      | user | carrier                                      |
      | P80  | Palomar Excess and Surplus Insurance Company |
      | P81  | PURE Specialty Exchange                      |

  @US50874
  Scenario Outline: TC_3 - Home Surplus Lines NC - Verify Flood & Earth Movement Notice excludes "EARTHQUAKES" when the earthquake extension is selected as "Yes." NB/RN Carrier partner - "<carrierPartner>"

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Underwriting_Company_Manager_Override" to "Yes"
    * I set "Underwriting_Company_Underwriting_Company" to "<carrierPartner>"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"


    * I am logged in to Pure as "<user>"

    Then I navigate to quotes page
    * I initiate a new quote

    When I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify carrier partner on "New Business"
    Then I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy
    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |


    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriter referrals on endorsement and renewal temp

    * I navigate to underwriting alerts tab
    * I think for 10 to 15 seconds
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |


    Examples:
      | user | carrierPartner                               |
      | P82  | Palomar Excess and Surplus Insurance Company |
      | P83  | PURE Specialty Exchange                      |

  @US50874
  Scenario Outline:TC_4 - Home Surplus Lines NC  - Verify Flood & Earth Movement Notice excludes "EARTHQUAKES" when the earthquake extension is selected as "Yes." for all carrier partners on NB RWT - Carrier "<carrier>"

    Given I use "NC_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Risk_Addresses_Replacement_Cost" to "5000000"
    * I set "Usage_Under_Construction_Or_Major_Renovation" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Other_Structures" to "200000"
    * I set "Risk_Addresses_Contents" to "500000"
    * I set "Risk_Addresses_Loss_Of_Use" to "200000"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I navigate to Home Surplus Lines Policy Page
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    * I select created policy

    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |


    Then I navigate to Home Surplus Lines Policy Page
    And I override underwriting company to "<carrier>"
    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |

    Examples:
      | user | carrier                                      |
      | P84  | Palomar Excess and Surplus Insurance Company |
      | P85  | PURE Specialty Exchange                      |
