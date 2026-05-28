@US50177 @Iteration4
Feature:As a NC Course of Construction policy document recipient, I want to see the required
  Flood Notice present in the policy package (Form code PURE-DSC-NC-005 (01/2025))

  @US50177
  Scenario: TC_1 - Course of Construction NC - Verify required Flood Notice present in the policy package PURE-DSC-NC-005 (01/2025) on NB and EN

    Given I use "NC_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverage_Earthquake_Extension" to "No"

    When I am logged in to Pure as "P85"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, EARTHQUAKES, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |

  @US50874
  Scenario: TC_2 - Course Of Construction NC - Verify Flood & Earth Movement Notice excludes "EARTHQUAKES" when the earthquake extension is selected as "Yes."
    Given I use "NC_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    When I am logged in to Pure as "P86"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    Then I navigate to transactions or endorsements

    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | PURE-DSC-NC-005 (01/2025)                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | Important Flood & Earth Movement Insurance Notice                                                                                                                                                                                                                                                                                                                                                                                                 |
      | WARNING: THIS PROPERTY INSURANCE POLICY DOES NOT PROTECT YOU AGAINST LOSSES FROM FLOODS, MUDSLIDES, MUDFLOWS, LANDSLIDES. YOU SHOULD CONTACT YOUR INSURANCE COMPANY OR AGENT TO DISCUSS YOUR OPTIONS FOR OBTAINING COVERAGE FOR THESE LOSSES. THIS IS NOT A COMPLETE LISTING OF ALL OF THE CAUSES OF LOSSES NOT COVERED UNDER YOUR POLICY. YOU SHOULD READ YOUR ENTIRE POLICY TO UNDERSTAND WHAT IS COVERED AND WHAT IS NOT COVERED. |
      | Further, your homeowners or dwelling policy does NOT provide coverage for loss caused by flood or mudslide, which is defined, in part, by the National Flood Insurance Program as:                                                                                                                                                                                                                                                                |
      | A general and temporary condition of partial or complete inundation of normally dry land areas from overflow of inland or tidal waters or from the unusual and rapid accumulation or runoff of surface waters from any source.                                                                                                                                                                                                                    |
      | If you are required by your mortgage lender to have flood insurance on your property, or if you feel that your property is susceptible to flood damage, insurance covering damage from flood is available on most buildings and contents in participating communities through the National Flood Insurance Program.                                                                                                                               |
      | Information about flood insurance and whether your community participates in the program can be obtained from your insurance company, from your insurance agent/broker, or directly from the National Flood Insurance Program by calling 1-888-379-9531 or by going to www.floodsmart.gov.                                                                                                                                                        |

