@PrimaryFlood @Admitted @HOFormsPF
Feature: PF - Admitted -  Forms

  @HOFloodEndorsement
  Scenario Outline: Flood Endorsement - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "07/22/2025"
    * I set "Endorsement_Effective_Date_END" to "07/23/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I review changes
    * I review and accept referrals on renewal if any

    Then I process a renewal

    Examples:
      | state  |
      | IL_001 |
      | CO_001 |
#      | NJ_001 |

  @HOExcessFloodExtension
  Scenario Outline: Excess Flood Extension - "<state>"

    Given I use "<state>" smoke test data from "QuoteCreatorHO" sheet
    * I load random user data
    * I set "Effective_Date" to "07/22/2025"
    * I set "Endorsement_Effective_Date_END" to "07/23/2025"
    * I set all optional coverages to no
    * I set "Additional_Interests" to ""
    * I set "Manual_Subjectivities" to ""
    * I set "Do_You_Want_To_Add_Pure_PF_Endorsement" to "Yes"
    * I set "Excess_Flood_Do_You_Wish_To_Include_Excess_Flood_Coverage" to "Yes"
    * I set "Who_Is_Providing_Underlying_PF_Coverage" to "PURE Primary Flood Endorsement"

    When I am logged in to Pure as "Field"
    * I create a new "HO" quote for a new customer

    Then I rate, bind and initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on endorsement if any
    * I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I review changes
    * I review and accept referrals on renewal if any

    Then I process a renewal

    Examples:
      | state  |
      | IL_001 |
      | CO_001 |
#      | NJ_001 |