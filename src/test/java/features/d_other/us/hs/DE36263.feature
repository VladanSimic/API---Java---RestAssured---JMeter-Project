@Iteration5 @DE36195 @MarchPostPROD
Feature: [PROD SUPPORT] Western States Ensuing Fungi issue in Production Dec page
  and Quote Proposal does not show Fungi fee correctly.

  @DE36263
  Scenario Outline: TC_01 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 25K

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$25,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "$25,000"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase $25,000 |

    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-GEN-036 01/01/2017                                                                                                                                                                         |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                                     |
      | For a covered loss we will not pay more than $25,000 for each occurrence for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user |
      | LA_001 | P9   |
      | GA_001 | P10  |
      | MS_001 | P11  |
      | AL_001 | P12  |
      | SC_001 | P13  |
      | MA_001 | P14  |
      | NC_001 | P15  |
      | NJ_001 | P17  |

  @DE36263
  Scenario Outline: TC_02 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 50K

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$50,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "$50,000"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase $50,000 |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-GEN-036 01/01/2017                                                                                                                                                                         |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                                     |
      | For a covered loss we will not pay more than $50,000 for each occurrence for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user |
      | LA_001 | P9   |
      | GA_001 | P10  |
      | MS_001 | P11  |
      | AL_001 | P12  |
      | SC_001 | P13  |
      | MA_001 | P14  |
      | NC_001 | P15  |
      | NJ_001 | P17  |

  @DE36263
  Scenario Outline: TC_03 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 25K

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$25,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "$25,000"
#
    When I am logged in to Pure as "<user>"
#
    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase $25,000 |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-FL-011 02/01/2016                                                                                                                                                      |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                 |
      | For a covered loss we will not pay more than $25,000 for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user | YesOrNo |
      | FL_001 | P18  | No      |

  @DE36263
  Scenario Outline: TC_04 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 50K

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$50,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "$50,000"
#
    When I am logged in to Pure as "<user>"
#
    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I select "<YesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase $50,000 |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-FL-011 02/01/2016                                                                                                                                                      |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                 |
      | For a covered loss we will not pay more than $50,000 for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user | YesOrNo |
      | FL_001 | P18  | No      |

  @DE36263
  Scenario Outline: TC_05 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 10%

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$25,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "<limit>"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase 10% |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Owners" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-GEN-036 01/01/2017                                                                                                                                                                         |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                                     |
      | For a covered loss we will not pay more than $10,000 for each occurrence for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user | limit |
      | CA_001 | P16  | 10%   |

  @DE36263
  Scenario Outline: TC_06 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 25%

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$25,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "<limit>"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase 25% |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 35 to 40 seconds
    * I download the file "Home Owners" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-GEN-036 01/01/2017                                                                                                                                                                         |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                                     |
      | For a covered loss we will not pay more than $25,000 for each occurrence for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user | limit |
      | CA_001 | P16  | 25%   |

  @DE36263
  Scenario Outline: TC_07 - "<TC_ID>" Verify correct title on Forms and Endorsements Dec Page and correct Fungi increase - 100%

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Effective_Date" to "03/08/2025"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage" to "Yes"
    * I set "Optional_Coverages_Increased_Limit_Of_Ensuing_Fungi_Or_Bacteria_Coverage_Limit" to "$25,000"

    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "Yes"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase_Limit" to "<limit>"

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Quote Proposal" and verify keywords
      | Ensuing Fungi Increase 100% |
    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Owners" and verify keywords
      | Increased Limit for Ensuing Fungi or Bacteria Coverage PPHV-END-GEN-036 01/01/2017                                                                                                                                                                          |
      | Increased Limit for Ensuing Fungi or Bacteria Coverage                                                                                                                                                                                                      |
      | For a covered loss we will not pay more than $100,000 for each occurrence for all increased costs that are fungi or bacteria remediation expenses described below. This fungi or bacteria remediation expense limit does not increase your coverage amount. |


    Examples:
      | TC_ID  | user | limit |
      | CA_001 | P16  | 100%  |
