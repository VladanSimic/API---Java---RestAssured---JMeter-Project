@FullRegression @PredictiveAnalysis @Integration @Auto @Automobile @PA
Feature: Predictive Analysis Model Home Suite - Homeowners
  As a user I should be able to verify Predictive Analysis on all transactions for Homeowners LOB

  @A @Grade
  Scenario Outline: Predictive Auto Model - <TC_ID> - A Grade

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis PA"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I initiate new endorsement

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | TC_ID  | USER_ID |
      | TX_001 | P81     |

  @A @Grade @Summary @AccountSummary
  Scenario Outline: Predictive Auto Model - <TC_ID> - A Grade - Account Summary

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis Summary"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to customer page
    Then I navigate to account summary tab
    And I verify on account summary if risk grade is "A"

    Examples:
      | TC_ID  | USER_ID |
      | TX_001 | P81     |

  @F @Grade
  Scenario Outline: Predictive Auto Model - <TC_ID> - F Grade

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis PA"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote

    Then I navigate to driver details page
    * I click add incident on driver details page
    * I set incident 0 source to "PURE" on driver details page
    * I set incident 0 accident or violation to "Driving under suspension" on driver details page
    * I set incident 0 conviction date to "01/01/2024" on driver details page
    * I fill out PA quote driver assignment page if visible

    And I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I initiate new endorsement

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | TC_ID  | USER_ID |
      | CA_001 | P81     |

  @F @Grade
  Scenario Outline: Predictive Auto Model - <TC_ID> incident on endorsement - F Grade

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis PA"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    And I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I initiate new endorsement

    Then I navigate to driver details page
    * I click add incident on driver details page
    * I set incident 0 source to "Broker/MVR" on driver details page
    * I set incident 0 accident or violation to "Driving under suspension" on driver details page
    * I set incident 0 conviction date to "01/01/2024" on driver details page
    * I fill out PA quote driver assignment page if visible

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement

    Examples:
      | TC_ID  | USER_ID |
      | FL_001 | P81     |

  @F @Grade
  Scenario Outline: Predictive Auto Model - <TC_ID> incident on endorsement/renewal check - F Grade

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis PA"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    And I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I initiate new endorsement

    Then I navigate to driver details page
    * I click add incident on driver details page
    * I set incident 0 source to "Broker/CLUE" on driver details page
    * I set incident 0 accident or violation to "Driving under suspension" on driver details page
    * I set incident 0 conviction date to "01/01/2024" on driver details page
    * I fill out PA quote driver assignment page if visible


    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    * I accept underwriting referrals
    * I process a renewal

    Examples:
      | TC_ID  | USER_ID |
      | MI_001 | P81     |

  @F @Grade @OOS
  Scenario Outline: Predictive Auto Model - <TC_ID> - F Grade on OOS transaction

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<USER_ID>" unless is PROD then "A1"
    Then I set "First_Name" to "Predictive"
    Then I set "Last_Name" to "Analysis PA"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    And I accept underwriting referrals
    Then I bind a quote
    * I override subjectivities

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "A"
    * I accept underwriting referrals
    * I process a renewal

    And I navigate to transactions or endorsements
    Then I initiate new oos endorsement 4 months ahead

    Then I navigate to driver details page
    * I click add incident on driver details page
    * I set incident 0 source to "Broker/MVR" on driver details page
    * I set incident 0 accident or violation to "Driving under suspension" on driver details page
    * I set incident 0 conviction date to "01/01/2024" on driver details page
    * I fill out PA quote driver assignment page if visible

    And I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    Then I verify Auto Predictive Analysis for all if grade returned is "F"
    And I accept underwriting referrals
    Then I issue an endorsement


    Examples:
      | TC_ID  | USER_ID |
      | FL_001 | P81     |