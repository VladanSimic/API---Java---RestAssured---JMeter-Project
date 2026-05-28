@FullRegression @CLUE @AutoClue @AutoCLUE @Integration @PersonalAuto @PA
Feature: Auto CLUE
  As a user I should be able to verify Auto CLUE on all transactions

  @Losses
  Scenario: Auto CLUE - With Losses on quote level

    Given I use "NY_101" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I think for 5 to 7 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "not clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses
  Scenario Outline: Auto CLUE <TC_ID> - No Losses on quote level

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
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
      | CA_001 | P82  |

  @DifferentAddress @Override
  Scenario Outline: Auto CLUE <TC_ID> - Address Override

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    Then I verify that newest Auto CLUE returned status "clean"

    And I add and verify different Auto CLUE Address response status
      | addressLine1    | city          | state | zip   | responseStatus |
      | 41 Ashdown Road | Ballston Lake | NY    | 12019 | clean          |

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

  @AutoPull @Endorsement @NewDriver
  Scenario Outline: Auto CLUE <TC_ID> - Auto pull on new driver - Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
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

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I click add additional operator
    * I set driver first name to "Valerie" for driver 1
    * I set driver mi name to "E" for driver 1
    * I set driver last name to "Vernon" for driver 1
    * I set driver DOB to "06/01/1959" for driver 1
    * I set driver status to "Active" for driver 1
    * I click on the footer
    * I set driver license state to "NY" for driver 1
    * I set driver license number to "5656566" for driver 1
    * I set driver gender to "Male" for driver 1
    * I set driver relationship to named insured to "Assistant" for driver 1
    * I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    * I click save changes button
    * I set "First_Name" to "Valerie"
    * I set "MI" to "E"
    * I set "Last_Name" to "Vernon"

    And I fill out PA quote driver details page
    * I fill out PA quote driver assignment page if visible

    Then I review changes
    * I rate an endorsement

    When I navigate to customer page
    Then I navigate to CLUE-MVR tab

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    And I navigate to customer page
    Then I navigate to policy
    And I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    * I navigate to policy image page

    Then I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | CA_001 | P82  |

  @AutoPull @Endorsement @ExcludedDriver
  Scenario Outline: Auto CLUE <TC_ID> - Repull on Excluded Driver that is included on Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I click add additional operator
    * I set driver first name to "Valerie" for driver 1
    * I set driver mi name to "E" for driver 1
    * I set driver last name to "Vernon" for driver 1
    * I set driver DOB to "06/01/1959" for driver 1
    * I set driver excluded to yes for driver 1
    * I click on the footer
    * I click save changes button
    * I think for 2 to 5 seconds
    * I set driver license state to "NY" for driver 1
    * I set driver license number to "5656566" for driver 1
    * I set driver gender to "Male" for driver 1
    * I set driver relationship to named insured to "Assistant" for driver 1
    * I click on the footer
    * I click save changes button
    * I think for 2 to 5 seconds

    * I set "First_Name" to "Valerie"
    * I set "MI" to "E"
    * I set "Last_Name" to "Vernon"

    And I fill out PA quote driver details page
    * I fill out PA quote driver assignment page if visible
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
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

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I set driver excluded to yes for driver 1
    * I click save changes button
    * I think for 4 to 5 seconds
    * I set driver status to "Active" for driver 1
    * I click on the footer
    * I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    * I click save changes button

    * I fill out PA quote driver assignment page if visible

    Then I review changes
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
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | CA_001 | P82  |

  @AutoPull @Endorsement @ExcludedDriver
  Scenario Outline: Auto CLUE <TC_ID> - Not in Household - Repull on Endorsement

    Given I use "<TC_ID>" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "<user>" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I click add additional operator
    * I set driver first name to "Valerie" for driver 1
    * I set driver mi name to "E" for driver 1
    * I set driver last name to "Vernon" for driver 1
    * I set driver DOB to "06/01/1959" for driver 1
    * I set driver status to "Not in Household" for driver 1

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I navigate to transactions or endorsements
    Then I initiate new endorsement

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I set driver status to "Active" for driver 1
    * I click on the footer
    * I set driver license state to "NY" for driver 1
    * I set driver license number to "5656566" for driver 1
    * I set driver gender to "Male" for driver 1
    * I set driver relationship to named insured to "Assistant" for driver 1
    * I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    * I click save changes button
    * I think for 4 to 5 seconds
    * I set "First_Name" to "Valerie"
    * I set "MI" to "E"
    * I set "Last_Name" to "Vernon"


    And I fill out PA quote driver details page
    * I fill out PA quote driver assignment page if visible

    Then I review changes
    * I rate an endorsement

    When I navigate to customer page
    Then I navigate to CLUE-MVR tab

    And I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"

    Then I verify Auto Clue Table Results
      | index | memberStatus   | orderedBy  | responseStatus |
      | 0     | primary driver | Super User | not clean      |

    And I navigate to customer page
    Then I navigate to policy
    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    And I navigate to policy image page

    Then I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | user |
      | NY_001 | P82  |

  @Losses
  Scenario: Auto CLUE - Clue losses visible on driver details page

    Given I use "NY_101" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I think for 3 to 5 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Include"
    Then I verify that newest Auto CLUE returned status "not clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to driver details page
    Then I verify if Clue Data is "returned" on driver details page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses
  Scenario: Home CLUE - Visible <= 30 days

    Given I use "NY_001" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date 28 days in the past
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses
  Scenario: Home CLUE - Not visible > 30 days

    Given I use "NY_001" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set Effective Date 32 days in the future
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @Agent
  Scenario: Auto CLUE - Agent can't see CLUE/MVR Tab

    Given I use "NY_001" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "Agent1" unless is PROD then "A17"
    Then I load random user data
    And I click new quote button
    Then I fill out the quote basic information page

    Then I navigate to customer page
    And I verify that Clue MVR Tab is "not displayed"

  @NoLosses @Document @Upload
  Scenario: Auto CLUE - Manually Upload And Verify Document

    Given I use "NY_001" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    Then I upload and verify "Auto CLUE" report document on clue mvr page

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

  @NoLosses
  Scenario: Auto CLUE - Verify that all drivers are visible

    Given I use "NY_001" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P82" unless is PROD then "A1"
    Then I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote
    * I think for 5 to 8 seconds

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    Then I verify that newest Auto CLUE returned status "clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page

    And I navigate to "Operators & Vehicles" page through the Tree
    Then I click add additional operator
    * I set driver first name to "Valerie" for driver 1
    * I set driver mi name to "E" for driver 1
    * I set driver last name to "Vernon" for driver 1
    * I set driver DOB to "06/01/1959" for driver 1
    * I set driver status to "Active" for driver 1
    * I click on the footer
    * I set driver license state to "NY" for driver 1
    * I set driver license number to "5656566" for driver 1
    * I set driver gender to "Male" for driver 1
    * I set driver relationship to named insured to "Assistant" for driver 1
    * I click save changes button
    * I set "First_Name" to "Valerie"
    * I set "MI" to "E"
    * I set "Last_Name" to "Vernon"


    And I fill out PA quote driver details page
    * I click save changes button
    * I fill out PA quote driver assignment page if visible

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

  @Losses @Unassigned
  Scenario: Auto CLUE - Assign unassigned claims

    Given I use "NY_101" regression test data from "QuoteCreatorPA" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    * I load random user data
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PA" quote
    * I rate a quote

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I run auto CLUE
    * I set Auto CLUE Claims status to "Do not Include - Unknown claim"
    Then I verify that newest Auto CLUE returned status "not clean"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to driver details page
    * I verify if Clue Data is "not returned" on driver details page

    Then I navigate to customer page
    And I navigate to CLUE-MVR tab
    * I click assign CLUE claims on clue mvr page
    * I set Auto CLUE Claims status to "Include"

    And I navigate to customer page
    * I navigate to quote
    * I navigate to quotes detail page
    * I navigate to driver details page
    Then I verify if Clue Data is "returned" on driver details page

    And I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote