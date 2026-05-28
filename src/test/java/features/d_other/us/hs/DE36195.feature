@Iteration5 @DE36195 @MarchPostPROD
Feature: [PROD SUPPORT] Western States Ensuing Fungi issue in Production Dec page
  and Quote Proposal does not show Fungi fee correctly.

  Scenario Outline: TC_01 - "<TC_ID>" Verify Fungi is showing correct increase in Home Surplus Package. 25k

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
      | Ensuing Fungi or Bacteria $25,000 |

    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Ensuing Fungi or Bacteria $25,000

#    And I navigate to transactions or endorsements
#    * I create a renewal
#    * I navigate to policy image page
#    * I fill out HS quote application page
#    * I review changes
#    * I click renewed premium
#    * I click send renewal offer button
#    * I think for 15 to 20 seconds
#    * I download the file "Renewal Offer" and verify keywords
#      | Ensuing Fungi or Bacteria $25,000 |
#    Then I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I process renewal or navigate to policy image and review changes and process renewal
#
#    Then I navigate to transactions or endorsements
#    * I select a transaction "Renewal"
#    Then I navigate to documents tab
#    * I think for 40 to 45 seconds
#    * I download the file "Broker" and verify keywords
#      | Ensuing Fungi or Bacteria $25,000 |


    Examples:
      | TC_ID  | user |
      | AZ_001 | P1   |
      | CO_001 | P2   |
      | HI_001 | P3   |
      | MT_001 | P4   |
      | UT_001 | P7   |
      | WY_001 | P8   |
#      | NY_001 | P5   |
#      | TX_001 | P6   |

  @DE36195
  Scenario Outline: TC_02 - "<TC_ID>" Verify Fungi is showing correct increase in Home Surplus Package. 50k

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
      | Ensuing Fungi or Bacteria $50,000 |

    Then I bind a quote
    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 40 to 45 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | Ensuing Fungi or Bacteria $50,000 |

#    And I navigate to transactions or endorsements
#    * I create a renewal
#    * I navigate to policy image page
#    * I fill out HS quote application page
#    * I review changes
#    * I click renewed premium
#    * I click send renewal offer button
#    * I think for 15 to 20 seconds
#    * I download the file "Renewal Offer" and verify keywords
#      | Ensuing Fungi or Bacteria $50,000 |
#    Then I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I process renewal or navigate to policy image and review changes and process renewal
#
#    Then I navigate to transactions or endorsements
#    * I select a transaction "Renewal"
#    Then I navigate to documents tab
#    * I think for 40 to 45 seconds
#    * I download the file "Broker" and verify keywords
#      | Ensuing Fungi or Bacteria $50,000 |



    Examples:
      | TC_ID  | user |
      | AZ_001 | P1   |
      | CO_001 | P2   |
      | HI_001 | P3   |
      | MT_001 | P4   |
      | UT_001 | P7   |
      | WY_001 | P8   |
#      | NY_001 | P5   |
#      | TX_001 | P6   |

