@ManualClaimsV @FullRegression
Feature: Manual Claims

  @FullRegression_IntegrationWizards
  Scenario: Personal Auto - Manual Claim Vehicle Type Visibility Verification (TC89944)
    Given I use "AL_001" regression test data from "QuoteCreatorPA" sheet
    When  I am logged in to Pure as "P81"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PA" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    Then I navigate to Pure Claims tab
    And  I add a new manual claim on Pure Claims page
    Then I verify that the "Vehicle Type" field is "Displayed" on Pure Claims Page

  @FullRegression_IntegrationWizards
  Scenario: PA - Vehicle Type Values - New Policy (TC89948)
  I as a user want to verify that Vehicle Type has the following values; Listed on policy; Newly acquired; Leased; Rented / hired; Temporary substitute vehicle; Vehicle in tow; Other owned; Other non-owned

    Given I use "AL_001" regression test data from "QuoteCreatorPA" sheet
    When  I am logged in to Pure as "P82"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PA" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then I navigate to transactions or endorsements
    Then I navigate to Pure Claims tab
    And  I add a new manual claim on Pure Claims page
    Then I Verify That The Vehicle Type Field Has The Following Options
    And  I verify dropdown values
      | values                       |
      | - Select -                   |
      | Listed on policy             |
      | Newly acquired               |
      | Leased                       |
      | Rented / hired               |
      | Temporary substitute vehicle |
      | Vehicle in tow               |
      | Other owned                  |
      | Other non-owned              |
      | None                         |

  @FullRegression_IntegrationWizards
  Scenario: PA - Vehicle Type - Broker view existing policy
  (TC89948)
  I as a user I expect not to be able to see the Pure Claims tab as well as its following options

    Given I am logged in to Pure as Broker
    And   I navigate to customers page
    Then  I select customer by ID "753072377186"
    Then  I select a Policy by ID "PA258587400" on customer summary page
    And   I Verify That The Pure Manual Claims Tab Is Not Visible


  @FullRegression_IntegrationWizards
  Scenario Outline: PA/EX/ES - Manual Claims field name changes
  (TC90072, TC90073, TC90074, TC90075)
  As a user I want to verify that the following fields have names that have been changed as follows:
  Verify that below labels are changed on PURE Claims UI for Auto, EX, ES LOB-'Driver' changed to 'Rated Driver'-
  'Incident' Type changed to 'Rated Accident or Violation (within last 5 years)'

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    And   I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I add a new manual claim on Pure Claims page
    Then  I Verify That Driver Is Changed To Rated Driver
    And   I Verify That Incident Is Changed To Rated Accident

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P94  |
      | GA_001 | QuoteCreatorEX | EX  | P95  |
      | FL_001 | QuoteCreatorES | ES  | P96  |


  @FullRegression_IntegrationWizards
  Scenario Outline: PA/EX/ES - Manual Claims field name changes - New policy
  (TC90072, TC90073, TC90074, TC90075, TC89947)
  As a user I want to verify that the following fields have names that have been changed as follows:
  Verify that below labels are changed on PURE Claims UI for Auto, EX, ES LOB-'Driver' changed to 'Rated Driver'-
  'Incident' Type changed to 'Rated Accident or Violation (within last 5 years)'

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then  I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I add a new manual claim on Pure Claims page
    Then  I Verify That Driver Is Changed To Rated Driver
    And   I Verify That Incident Is Changed To Rated Accident
    And   I Verify That Vehicle Type Field is "Not Mandatory"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P90  |

  @FullRegression_IntegrationWizards
  Scenario Outline: PA/EX/ES Manual Claims - Claim Operator  and Claim Loss Cause fields visible
  (TC90148, TC90143, TC90142)
  I as a User want to Verify that the new field 'Claim Operator' is visible on Pure Claims Page

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then  I navigate to transactions or endorsements
    And   I navigate to Pure Claims tab
    Then  I add a new manual claim on Pure Claims page
    And   I Verify That Claim Operator Field Is Visible
    And   I Verify that Claim Loss Cause Field Is Visible

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P83  |
      | GA_001 | QuoteCreatorEX | EX  | P84  |
      | FL_001 | QuoteCreatorES | ES  | P85  |


  @FullRegression_IntegrationWizards
  Scenario Outline: PA Manual Claims - Vehicle Involved Not Mandatory - New Policy
  (TC90231)
  I as a User want to verify that the field Vehicle Involved is not mandatory once a Manual Claim is added and saved.

    Given I use "AL_001" regression test data from "QuoteCreatorPA" sheet
    When  I am logged in to Pure as "P81"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PA" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then  I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    Then  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value                                    |
      | accidentConvictiondate | 12/17/2024                               |
      | ratedAccident          | Defective Equipment                      |
      | ratedDriver            | Emily Corrine                            |
      | description            | test                                     |
    And   I Verify That Vehicle Involved Field is "Not Mandatory"

    Examples:
      | LOB |
      | PA  |

  @FullRegression_IntegrationWizards
  Scenario Outline: Account Loss Summary - Claim Number Visibility on non-Admitted LOBs
  (TC88447)
  I as a User expect to see new column titled 'Claim Number' under account loss on customer summary page when a claim is created

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then  I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value                                    |
      | accidentConvictiondate | 12/17/2024                               |
      | ratedAccident          | Defective Equipment                      |
      | ratedDriver            | Emily Corrine                            |
      | description            | test                                     |
      | lossDate               | 12/17/2024                               |
      | lossType               | Fire                                     |
      | lossDWType             | Part One or Three - Workers Compensation |
    Then  I navigate to customer summary page
    And   I Verify That Column Claim Number Is Visible On Customer Summary Page

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorES | ES  | P86  |
      | AL_001 | QuoteCreatorCC | CC  | P87  |
      | AL_001 | QuoteCreatorHS | HS  | P88  |

  @FullRegression_IntegrationWizards
  Scenario Outline: Account Loss Summary - Claim Number Visibility on admitted LOBs
  (TC92348, TC92349)
  I as a User expect to see new column titled 'Claim Number' under account loss on customer summary page when a claim is created

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Then  I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value                                    |
      | accidentConvictiondate | 12/17/2024                               |
      | ratedAccident          | Defective Equipment                      |
      | ratedDriver            | Emily Corrine                            |
      | description            | test                                     |
      | lossDate               | 12/17/2024                               |
      | lossType               | Fire                                     |
      | lossDWType             | Part One or Three - Workers Compensation |
      | lossCOType             | Fire                                     |
      | classType              | Worldwide Jewelry                        |
    Then  I navigate to customer summary page
    And   I Verify That Column Claim Number Is Visible On Customer Summary Page

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P98  |
      | AL_001 | QuoteCreatorEX | EX  | P99  |
      | AL_001 | QuoteCreatorPA | PA  | P100 |
      | AK_001 | QuoteCreatorPW | PW  | P101 |
      | AL_001 | QuoteCreatorCO | CO  | P102 |

  @Disabled
  Scenario Outline: Multiple claims filled out.
  I as a user want to fill out multiple manual claims on Pure claims page for a PA policy

    Given I am logged in to Pure as "P103"
    And   I navigate to policies
    Then  I select a policy by ID "<POLICY_ID>"
    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them

      | accidentConvictionDate | ratedAccident       | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      | 01/07/2025             | Defective Equipment | Smoke PANY  | Not          | Collision with other object | Smoke PANY    | test        | Yes          | No          | 2000            | 1500          | 500         |
      | 01/08/2025             | Defective Equipment | Smoke PANY  | Not          | Collision with other object | Smoke PANY    | test1       | No           | No          | 3000            | 1500          | 1500        |


    Examples:
      | LOB | POLICY_ID   |
      | PA  | PA244252101 |

  @Disabled
  Scenario Outline: Multiple claims filled out.
  I as a user want to fill out multiple manual claims on Pure claims page for a HO/HS/CC/DW/CO policy

    Given I am logged in to Pure as "P104"
    And   I navigate to policies
    Then  I select a policy by ID "<POLICY_ID>"
    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them

      | lossDate   | lossType            | relatedLocation | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid | claimNumber | state | class |
      | 01/07/2025 | Defective Equipment | Smoke PANY      | test        | Yes          | No          | 2000            | 1500          | 500         | AL-001-501  | AL    |       |
      | 01/08/2025 | Defective Equipment | Smoke PANY      | test1       | No           | No          | 3000            | 1500          | 1500        | AL-001-502  | AL    |       |


    Examples:
      | LOB | POLICY_ID   |
      | HO  | HO244502901 |