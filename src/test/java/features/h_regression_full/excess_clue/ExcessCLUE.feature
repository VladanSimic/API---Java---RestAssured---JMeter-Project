@FullRegression @CLUE @ExcessClue @ExcessCLUE @Integration @ExcessLiability @ExcessSurplus
Feature: Excess CLUE
  As a user I should be able to verify Excess CLUE on all transactions

  @Losses @EX
  Scenario: Excess CLUE - With Losses on quote level

    Given I use "FL_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with losses"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses @EX
  Scenario Outline: Excess CLUE - No Losses on quote level

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | FL_001 | P82  |

  @DifferentAddress @Override @EX
  Scenario Outline: Excess CLUE - Address Override

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I think for 5 to 10 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    Then I verify that newest Auto CLUE returned status "clean"

    And I add and verify different Auto CLUE Address response status
      | addressLine1    | city          | state | zip   | responseStatus |
      | 41 Ashdown Road | Ballston Lake | NY    | 12019 | clean          |

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy | responseStatus |
      | 0     | primary driver |           | clean          |
      | 1     | primary driver |           | clean          |

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  | user |
      | TX_001 | P83  |

  @AutoPull @Endorsement @NewDriver @EX
  Scenario Outline: Excess CLUE - Auto pull on new driver - Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to operator information page
    Then I click add operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator license number to "873652" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I set operator resided at risk location for more than 6 months to "Yes" for operator 1
    * I click save changes button
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I review changes
    * I think for 3 to 5 seconds
    * I rate an endorsement

    When I navigate to customer page
    Then I navigate to CLUE-MVR tab

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    And I navigate to customer page
    Then I navigate to policy
    * I navigate to transactions or endorsements
    * I navigate to Endorsement "1"
    * I navigate to policy image page
    Then I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | FL_001 | P82  |

  @AutoPull @Endorsement @ExcludedDriver @EX
  Scenario Outline: Excess CLUE - Repull on Excluded Driver that is included on Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote

    Then I navigate to operator information page
    And I click add operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator license number to "873652" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I set operator excluded "Yes" for operator 1
    * I click save changes button
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to operator information page
    Then I set operator excluded "No" for operator 1
    * I set operator resided at risk location for more than 6 months to "Yes" for operator 1
    * I click save changes button
    * I think for 4 to 5 seconds
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I review changes
    * I think for 3 to 5 seconds
    * I rate an endorsement

    When I navigate to customer page
    Then I navigate to CLUE-MVR tab

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    And I navigate to customer page
    Then I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    And I navigate to policy image page

    Then I review changes
    And I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | FL_001 | P82  |

  @Losses @EX
  Scenario: Excess CLUE - Clue losses visible on operator information page

    Given I use "FL_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "not clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    * I navigate to operator information page
    Then I verify if Clue Data is "returned" on operator information page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses @EX
  Scenario: Excess CLUE - Not visible quote <= 30 days

    Given I use "NY_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date 26 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses @EX
  Scenario: Excess CLUE - Visible quote >30 days

    Given I use "NY_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date 34 days in the future
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I think for 5 to 10 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Agent @EX
  Scenario: Excess CLUE - Agent can't see CLUE/MVR Tab

    Given I use "NY_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "Agent1" unless is PROD then "A17"
    Then I load random user data
    And I click new quote button
    Then I fill out the quote basic information page

    Then I navigate to customer page
    And I verify that Clue MVR Tab is "not displayed"

  @NoLosses @Document @Upload @EX
  Scenario: Excess CLUE - Manually Upload And Verify Document

    Given I use "NY_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    Then I upload and verify "Auto CLUE" report document on clue mvr page
    Then I upload and verify "NCF" report document on clue mvr page

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses @EX
  Scenario: Excess CLUE - Verify that all drivers are visible

    Given I use "NY_001" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote
    * I think for 5 to 8 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    Then I navigate to operator information page
    And I click add operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator license number to "873652" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I set operator excluded "Yes" for operator 1
    * I click save changes button
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"


    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I set Household Members Auto Clue to primary driver
    * I click run auto clue
    * I assign claims to driver
    Then I verify that newest Auto CLUE returned status "not clean"


    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

  @AutoPull @Endorsement @ExcludedDriver @EX
  Scenario Outline: Excess CLUE - Manual repull on Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote

    Then I navigate to operator information page
    And I click add operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator license number to "873652" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I set operator excluded "Yes" for operator 1
    * I click save changes button
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to operator information page
    Then I set operator excluded "No" for operator 1
    * I set operator resided at risk location for more than 6 months to "Yes" for operator 1
    * I click save changes button
    * I think for 4 to 5 seconds
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I review changes
    * I think for 3 to 5 seconds
    * I rate an endorsement

    When I navigate to customer page
    Then I navigate to CLUE-MVR tab

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    Then I run auto CLUE

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    And I navigate to customer page
    Then I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    And I navigate to policy image page

    Then I review changes
    And I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | TX_001 | P82  |

  @Losses @EX @Unassigned
  Scenario: Excess CLUE - Assign unassigned claims

    Given I use "FL_101" regression test data from "QuoteCreatorEX" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "EX" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Do not Include - Unknown claim"
    Then I verify that newest Auto CLUE returned status "with losses"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to operator information page
    Then I verify if Clue Data is "Not returned" on operator information page

    And I navigate to customer page
    Then I navigate to CLUE-MVR tab
    * I click assign CLUE claims on clue mvr page
    * I set Auto CLUE Claims status to "Include"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to operator information page
    Then I verify if Clue Data is "Returned" on operator information page


    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Losses @ES
  Scenario: Excess Surplus CLUE - Assign claims from operator page

    Given I use "FL_001" regression test data from "QuoteCreatorES" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "ES" quote

    * I navigate to operator information page
    * I click add additional operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set additional operator 1 additional driver gender to "Male"
    * I set operator license number to "873652" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I click save changes button
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I set Household Members Auto Clue to primary driver on operator information page
    And I click run auto clue
    * I set Auto CLUE Claims status to "Include" on operator information page
    * I verify if Clue Data is "returned" on operator information page
    * I verify that newest Auto CLUE returned status "not clean"

    Then I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Losses @ES @Endorsement
  Scenario: Excess Surplus CLUE - Assign claims on customer level

    Given I use "FL_001" regression test data from "QuoteCreatorES" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "ES" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I expand node tree if needed


    * I navigate to operator information page
    * I click add additional operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set additional operator 1 additional driver gender to "Male"
    * I set operator license number to "873652" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
#    * I set operator resided at risk location for more than 6 months to "Yes" for operator 1
    * I click save changes button
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I review changes
    And I rate an endorsement

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "with claims"

    And I navigate to customer page
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    * I navigate to policy image page

    Then I review changes
    And I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @Losses @ES @Repull @Endorsement
  Scenario: Excess Surplus CLUE - Manual repull and address override on Endorsement

    Given I use "FL_001" regression test data from "QuoteCreatorES" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data

    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I expand node tree if needed


    * I navigate to operator information page
    * I click add additional operator
    * I set operator first name to "CRAIG" for operator 1
    * I set operator last name to "BLANKINSHIP" for operator 1
    * I set operator mi name to "M" for operator 1
    * I set operator DOB to "04/21/1963" for operator 1
    * I set additional operator 1 additional driver gender to "Male"
    * I set operator license number to "873652" for operator 1
    * I set operator license state to "FL" for operator 1
    * I set operator relationship to named insured to "Assistant" for operator 1
    * I click save changes button
    * I set "First_Name" to "CRAIG"
    * I set "MI" to "M"
    * I set "Last_Name" to "BLANKINSHIP"

    Then I review changes
    And I rate an endorsement

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab

    And I add and verify different Auto CLUE Address response status
      | addressLine1    | city          | state | zip   | responseStatus |
      | 41 Ashdown Road | Ballston Lake | NY    | 12019 | with claims    |


    And I navigate to customer page
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    * I navigate to policy image page

    Then I review changes
    And I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement
