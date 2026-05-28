Feature: Consistent Losses/Operators


 @FullRegression_IntegrationWizards @IW
 Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PA END trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PA LOB
  on endorsement transaction

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


  And  I navigate to transactions or endorsements
  Then I initiate new endorsement
  And  I navigate to Operators and Vehicles Page
  Then  I verify block "Operators obtained from active household quotes and policies" exists with special tag


  Examples:
    | TC_ID  | user | LOB | SHEET_NAME     |
    | FL_001 | P81  | PA  | QuoteCreatorPA |

  @FullRegression_IntegrationWizards @IW
  Scenario: Verify visibility of the new block "Operators obtained from active households quotes and policies" for CX END trx Internal user
    As a User I want to verify that the new block Operators obtained from active households quotes and policies" is visible for CX LOB
    on endorsement transaction(TC97272)

    Given I am logged in to Pure as "P81"
    And   I navigate to policies
    Then  I select a policy by ID "CX258857500"
    And   I navigate to transactions or endorsements
    Then  I select the first endorsement transaction
    And   I navigate to policy image page
    *     I navigate to operator information page
    Then  I verify block "Operators obtained from active household quotes and policies" exists with special tag

  @FullRegression_IntegrationWizards @IW
  Scenario: Verify visibility of the new block "Operators obtained from active households quotes and policies" for CW END trx Internal user
    As a User I want to verify that the new block Operators obtained from active households quotes and policies" is visible for CW LOB
    on endorsement transaction

    Given I am logged in to Pure as "P87"
    And   I navigate to policies
    Then  I select a policy by ID "CW258859000"
    And   I navigate to transactions or endorsements
    Then  I select the first endorsement transaction
    And   I navigate to policy image page
    *     I navigate to Watercraft Policy Page
    Then  I verify block "Operators obtained from active household quotes and policies" exists with special tag

  @AdvisoryMessage
  Scenario: Verify visibility of the advisory message for CW on Pure Claims page for Internal user
    As a User I want to verify that the new static advisory message "If updates were made to a PURE claim that is mapped to other PURE policies.
    Please review and update the PURE claim details on the other PURE policies." is visible for CW LOB on Pure Claims page

    Given I am logged in to Pure as "P87"
    And   I navigate to policies
    Then  I select a policy by ID "CW258859000"
    And   I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I verify if element with message "If updates were made to a PURE claim that is mapped to other PURE policies, please review and update the PURE claim details on other PURE policies." is "Displayed" on the UI


  @AdvisoryMessage
  Scenario: Verify visibility of the advisory message for CX on Pure Claims page for Internal user
  As a User I want to verify that the new static advisory message "If updates were made to a PURE claim that is mapped to other PURE policies.
  Please review and update the PURE claim details on the other PURE policies." is visible for CX LOB on Pure Claims page

    Given I am logged in to Pure as "P87"
    And   I navigate to policies
    Then  I select a policy by ID "CX258857500"
    And   I navigate to transactions or endorsements
    Then  I navigate to Pure Claims tab
    And   I verify if element with message "If updates were made to a PURE claim that is mapped to other PURE policies, please review and update the PURE claim details on other PURE policies." is "Displayed" on the UI


  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for EX/ES END trx Internal user
    As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for ES/EX LOB
    on endorsement transaction

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


    And  I navigate to transactions or endorsements
    Then I initiate new endorsement
    And  I navigate to Excess Policy Page
    And  I navigate to operator information page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | AL_001 | P82  | EX  | QuoteCreatorEX |
      | FL_001 | P83  | ES  | QuoteCreatorES |


  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW END trx Internal user
    As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB
    on endorsement transaction

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


    And  I navigate to transactions or endorsements
    Then I initiate new endorsement
    And  I navigate to Watercraft Policy Page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | IL_001 | P84  | PW  | QuoteCreatorPW |

  @FullRegression_IntegrationWizards @IW
  Scenario: Verify visibility of the new block "Operators obtained from active households quotes and policies" for CW NB trx Internal user
    As a User I want to verify that the new block Operators obtained from active households quotes and policies" is visible for CW LOB
    on New Business transaction

    Given I am logged in to Pure as "P86"
    And   I navigate to policies
    Then  I select a policy by ID "CW258855700"
    Then  I navigate to customer summary page
    And   I click new quote button on customer summary page
    And   I set disclosure of consumer reports made to Yes
    Then  I write text to "Insurance Line" and value is "Personal Watercraft"
    Then  I write text to "Risk Province" and value is "ON"
    Then  I write text to "Producer" and value is "Ana Vasic"
    Then  I write text to "Advisor / Servicer" and value is "Ana Vasic"
    Then  I write text to "Quote Name" and value is "Automation Test"
    And   I click create quote button
    *     I navigate to Watercraft Policy Page
    Then  I verify block "Operators obtained from active household quotes and policies" exists with special tag


  Scenario: Verify visibility of the new block "Operators obtained from active households quotes and policies" for CX NB trx Internal user
  As a User I want to verify that the new block Operators obtained from active households quotes and policies" is visible for CX LOB
  on New Business transaction(TC97265)

    Given I am logged in to Pure as "P90"
    And   I navigate to policies
    Then  I select a policy by ID "CX257699300"
    Then  I navigate to customer summary page
    And   I click new quote button on customer summary page
    And   I set disclosure of consumer reports made to Yes
    Then  I write text to "Insurance Line" and value is "Excess Liability"
    Then  I write text to "Risk Province" and value is "ON"
    Then  I write text to "Producer" and value is "Ana Vasic"
    Then  I write text to "Advisor / Servicer" and value is "Ana Vasic"
    Then  I write text to "Quote Name" and value is "Automation Test"
    And   I click create quote button
    *     I navigate to operator information page
    Then  I verify block "Operators obtained from active household quotes and policies" exists with special tag


  Scenario: Verify that a new closed manual CW claim is copied over to the new CW quote
    As a User I want to verify that the new CW Manual Claim has been copied over to the new CW Quote(TC94363)

    Given I am logged in to Pure as "P89"
    And   I navigate to policies
    Then  I select a policy by ID "CW257789201"
    And   I navigate to Pure Claims tab
    Then  I Fill Out Multiple Manual Claims For "PW" and Save Them
      | lossDate  | lossType           | RelatedVessel | atFaultOrNot | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      | 3/17/2025 | Liability <$10,000 |               | No           | TestClaim   | Yes          | Yes         | 2300            | 300           | 2000        |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    Then  I write text to "Insurance Line" and value is "Personal Watercraft"
    Then  I write text to "Risk Province" and value is "ON"
    Then  I write text to "Producer" and value is "Ana Vasic"
    Then  I write text to "Advisor / Servicer" and value is "Ana Vasic"
    Then  I write text to "Quote Name" and value is "Automation Test"
    *     I click create quote button
    And   I navigate to Previous Claims-MVR Activity Page
    Then I verify copied watercraft claim details on WC
      | Source | lossType           | lossDate  | lossAmount |
      | PURE   | Liability <$10,000 | 3/17/2025 | 490        |



  Scenario: Verify that a new closed manual PA claim is copied over to the new PA quote
    As a User I want to verify that the new PA Manual Claim has been copied over to the new PA Quote

    And   I am logged in to Pure as "P92"
    And   I navigate to policies
    Then  I select a policy by ID "PA258086100"
    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "PA" and Save Them
      | accidentConvictionDate | ratedAccident            | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      | 03/25/2025             | At-fault accident < $500 | Smoke PANY  | Not          | Collision with other object | Smoke PANY    | test        | Yes          | No          | 2000            | 1500          | 500         |
      | 03/25/2025             | At-fault accident < $500 | Smoke PANY  | Not          | Collision with other object | Smoke PANY    | test1       | Yes          | No          | 3000            | 1500          | 1500        |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page

    Then  I write text to "Insurance Line" and value is "Personal Auto"
    And   I check is disclosure required "No" and made "Yes"
    Then  I write text to "Licensed Producer" and value is "Ana Vasic"
    Then  I write text to "Advisor / Servicer" and value is "Ana Vasic"
    Then  I write text to "Quote Name" and value is "Automation Test"
    And   I click create quote button

    And  I click on obtain operators and vehicles
    Then I navigate to Operators and Vehicles Page
    And  I write text to "Driver Status" and value is "Active"
    And  I write text to "Gender" and value is "Male"
    And  I write text to "Relationship to Insured" and value is "Named Insured"
    Then I click save changes button
    
    Then I navigate to "Smoke PANY" page through the Tree
    Then I verify copied claim information for "PA" is correct
      | ratedDriver | Source | ratedAccident            | accidentConvictionDate |
      | Smoke PANY  | PURE   | At-fault accident < $500 | 03/25/2025             |
      | Smoke PANY  | PURE   | At-fault accident < $500 | 03/25/2025             |


  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PA NB trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PA LOB
  on New Business transaction

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And  I click new quote button on customer summary page
    Then I create a new quote on new quote information page

    And  I click "obtain operators and vehicles" button on UI
    Then I think for 10 to 15 seconds

    And  I navigate to Operators and Vehicles Page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     | State | Insurance_Line| Quote_Name|
      | FL_001 | P81  | PA  | QuoteCreatorPA | NY    | Personal Auto | Personal Auto |

  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for EX/ES NB trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for ES/EX LOB
  on New Business transaction

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And  I click new quote button on customer summary page
    Then I create a new quote on new quote information page

    Then I navigate to Excess Policy Page
    And  I navigate to operator information page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     | State | Insurance_Line   | Quote_Name       |
      | AL_001 | P82  | EX  | QuoteCreatorEX | AL    | Excess Liability | Excess Liability |
      | FL_001 | P83  | ES  | QuoteCreatorES | AL    | Excess Surplus   | Excess Surplus   |

  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW NB trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB
  on New Business transaction

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And  I click new quote button on customer summary page
    Then I create a new quote on new quote information page

    And  I navigate to Watercraft Policy Page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     | State | Insurance_Line      | Quote_Name          |
      | IL_001 | P84  | PW  | QuoteCreatorPW | AL    | Personal Watercraft | Personal Watercraft |

  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PA NB Rewrite trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PA LOB
  on New Business Rewrite transaction

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


    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    And  I navigate to Operators and Vehicles Page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | FL_001 | P81  | PA  | QuoteCreatorPA |

  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for EX NB Rewrite trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for ES/EX LOB
  on New Business Rewrite transaction

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


    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    And  I navigate to operator information page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | AL_001 | P82  | EX  | QuoteCreatorEX |

  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for ES NB Rewrite trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for ES/EX LOB
  on New Business Rewrite transaction

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

    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    Then I navigate to Excess Policy Page
    And  I navigate to operator information page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | FL_001 | P83  | ES  | QuoteCreatorES |

  @FullRegression_IntegrationWizards @IW
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW NB Rewrite trx Internal user
  As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB
  on New Business Rewrite transaction

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

    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    And  I navigate to Watercraft Policy Page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | AL_001 | P84  | PW  | QuoteCreatorPW |




  Scenario Outline: Verify that a new closed manual PA claim is copied over to the new PA quote
    As a User I want to verify that the new PA Manual Claim has been copied over to the new PA Quote

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident            | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | At-fault accident < $500 |             | Not          | Collision with other object |               | test        | Yes          | No          | 2000            | 1500          | 500         |
      |                        | At-fault accident < $500 |             | Not          | Collision with other object |               | test1       | Yes          | No          | 3000            | 1500          | 1500        |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page


    And  I click "obtain operators and vehicles" button on UI
    Then I think for 10 to 15 seconds
    Then I navigate to Operators and Vehicles Page
    And  I write text to "Driver Status" and value is "Active"
    And  I write text to "Gender" and value is "Male"
    And  I write text to "Relationship to Insured" and value is "Named Insured"
    Then I click save changes button

    Then I click the next page button
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident            | accidentConvictionDate |
      |             | PURE   | At-fault accident < $500 |                        |
      |             | PURE   | At-fault accident < $500 |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line | Quote_Name    |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Auto  | Personal Auto |



  Scenario Outline: Verify that a new closed manual PA claim is copied over to the new LOB PA quote
    As a User I want to verify that the new PA Manual Claim has been copied over to the new PA Quote for multiple states and loss types

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    And  I click "obtain operators and vehicles" button on UI
    Then I think for 10 to 15 seconds
    Then I navigate to Operators and Vehicles Page
    And  I write text to "Driver Status" and value is "Active"
    And  I write text to "Gender" and value is "Male"
    And  I write text to "Relationship to Insured" and value is "Named Insured"
    Then I click save changes button

    Then I click the next page button
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line | Quote_Name    | original_claim_loss_type | copied_claim_loss_type   |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Auto  | Personal Auto | At-fault accident < $500 | At-fault accident < $500 |


    @OpAdd
    Scenario Outline: Verify that operator added on END trx is visible in the new Obtained Operators block and is able to be included
      As a User I want to verify that an operator added on an endorsement transaction is visible in the new block on a New Business(Quote) transaction
      and is able to be included

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

      * I set "Additional_Vehicles_END" to ","
      * I set "Additional_Operators_END" to "Operator_003_ADD,"
      * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
      * I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "<Operator_Name_On_END>"
      * I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "<Operator_Last_Name_On_END>"
      * I set "Additional_Operators_Additional_Driver_Prefix_END_1" to "<Operator_Prefix>"
      * I set "Additional_Operators_Additional_Driver_Suffix_END_1" to "<Operator_Suffix>"
      * I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "<Operator_Status>"


      * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
      * I set "Quote_Line_And_Name_Block_State" to "<State>"
      * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

      Then I navigate to transactions or endorsements
      And  I initiate new endorsement
      Then I navigate to Operators and Vehicles Page
      Then I fill out PA endorsement additional operators block

      Then I navigate to customer summary page
      And  I click new quote button on customer summary page
      And  I create a new quote on new quote information page

      And  I click "obtain operators and vehicles" button on UI
      Then I think for 10 to 15 seconds
      Then I navigate to Operators and Vehicles Page
      And  I write text to "Driver Status" and value is "Active"
      And  I write text to "Gender" and value is "Male"
      And  I write text to "Relationship to Insured" and value is "Named Insured"

      Then I verify operator added through END trx is present for "PA" in the obtained operators block
      Then I verify if element with message "include" is "Displayed" on the UI
      Then I mark 0 operator to be included and include them
      And  I click save changes button
      Then I verify that tree node with value "<Operator_Name_On_END> <Operator_Last_Name_On_END>" is "Displayed"

      Examples:
        | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line | Quote_Name    | Operator_Name_On_END | Operator_Last_Name_On_END | Operator_Prefix | Operator_Suffix | Operator_Status |
        | NY_001 | PA  | QuoteCreatorPA | P93  | NY    | Personal Auto  | Personal Auto | Test                 | Operator                  | Mr.             | Sr.             | Active          |

    @AdvisoryMessage @20thJunePostProd
    Scenario Outline: Verify visibility of static advisory message on Pure Claims page for manually updated claims
      As a User I want to verify that there is a static advisory message to advise users if they manually update claims on pure claims page
      that has the following text "If updates were made to a PURE claim that is mapped to other PURE policies.
      Please review and update the PURE claim details on the other PURE policies."

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

      And  I navigate to transactions or endorsements
      Then I navigate to Pure Claims tab
      And  I verify if element with message "If updates were made to a PURE claim that is mapped to other PURE policies, please review and update the PURE claim details on other PURE policies." is "Displayed" on the UI

      Examples:
        | TC_ID  | SHEET_NAME     | LOB | user |
        | AL_001 | QuoteCreatorPA | PA  | P85  |
        | FL_001 | QuoteCreatorES | ES  | P80  |
        | AL_001 | QuoteCreatorEX | EX  | P84  |
        | NY_001 | QuoteCreatorPW | PW  | P86  |


  @AdvisoryMessageHO @20thJunePostProd
  Scenario Outline: Verify there is no static advisory message on Pure Claims page for manually updated claims for HO/HS/CO LOBs
  As a User I want to verify that there isn't a static advisory message present to advise users if they manually update claims on pure claims page for HO/HS/CO LOBs
  that has the following text "If updates were made to a PURE claim that is mapped to other PURE policies.
  Please review and update the PURE claim details on the other PURE policies."

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

    And  I navigate to transactions or endorsements
    Then I navigate to Pure Claims tab
    And  I verify if element with message "If updates were made to a PURE claim that is mapped to other PURE policies, please review and update the PURE claim details on other PURE policies." is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P80  |
      | AL_001 | QuoteCreatorCO | CO  | P84  |

    @ConstOper @Endorsement
    Scenario Outline: Verify trigger of referral for claims with same date of loss under new operator on END trx for PA
      As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
      "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
       If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

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

      * I set "Additional_Vehicles_END" to ","
      * I set "Additional_Operators_END" to "Operator_003_ADD,"
      * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet


      Then I navigate to transactions or endorsements
      And  I initiate new endorsement
      Then I navigate to policy image page
      Then I navigate to Operators and Vehicles Page

      Then I fill out PA endorsement additional operators block
      * I set driver resided at policy location for more than 6 months to "Yes" for driver 1
      * I navigate to "Aoperator NewEnd" page
      * I fill out PA endorsement additional driver 1 details block
      * I write text to "Occupation" and value is "Driver"

      * I click add incident on driver details page
      * I set incident 0 source to "PURE" on driver details page
      * I set incident 0 accident or violation to "Not" on driver details page
      * I set incident 0 conviction date to "04/15/2025" on driver details page

      * I click add incident on driver details page
      * I set incident 1 source to "PURE" on driver details page
      * I set incident 1 accident or violation to "Not" on driver details page
      * I set incident 1 conviction date to "04/15/2025" on driver details page
      * I click save changes button

      And  I review changes
      And  I rate an endorsement
      Then I review referrals

      And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI


      Examples:
        | TC_ID  | SHEET_NAME     | LOB | user |
        | AL_001 | QuoteCreatorPA | PA  | P85  |

  @ConstOper @Endorsement
  Scenario Outline: Verify trigger of referral for claims with same date of loss under new operator on END trx for EX
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set "Additional_Insured" to ","
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    * I set "Additional_Operators_Num_END" to "1"
    * I merge data for "QuoteCreationEX", where "Additional_Operators_END" key and "QuoteCreatorEX" sheet

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    And  I navigate to policy image page
    And  I add changes on "EX" endorsement
    Then I navigate to operator information page

    * I click add incident on operator information page
    * I set incident 0 driver to "Aoperator" on operator information page
    * I set incident 0 source to "PURE" on operator information page
    * I set incident 0 accident or violation to "Not" on operator information page
    * I set incident 0 conviction date to "04/15/2025" on operator information page

    * I click add incident on operator information page
    * I set incident 1 driver to "Aoperator" on operator information page
    * I set incident 1 source to "PURE" on operator information page
    * I set incident 1 accident or violation to "Not" on operator information page
    * I set incident 1 conviction date to "04/15/2025" on operator information page
    * I click save changes button

    And  I review changes
    And  I rate an endorsement
    Then I review referrals

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI


    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | OR_003 | QuoteCreatorEX | EX  | P85  |


  @ConstOper @FullRegression_IntegrationWizards
  Scenario Outline: Verify trigger of referral for claims with same date of loss NB trx for PA
    As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
    "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
    If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote
    Then  I navigate to Operators and Vehicles Page
    And   I click the next page button

    * I click add incident on driver details page
    * I set incident 0 source to "PURE" on driver details page
    * I set incident 0 accident or violation to "Not" on driver details page
    * I set incident 0 conviction date to "04/15/2025" on driver details page

    * I click add incident on driver details page
    * I set incident 1 source to "PURE" on driver details page
    * I set incident 1 accident or violation to "Not" on driver details page
    * I set incident 1 conviction date to "04/15/2025" on driver details page
    * I click save changes button

    * I rate a quote
    * I navigate to underwriting referrals page

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPA | PA  | P85  |


  @ConstOper
  Scenario Outline: Verify trigger of referral for claims with same date of loss NB trx for EX/ES
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote
    Then I navigate to operator information page

    * I click add incident on operator information page
    * I set incident 0 source to "PURE" on operator information page
    * I set incident 0 accident or violation to "Not" on operator information page
    * I set incident 0 conviction date to "01/02/2018" on operator information page

    * I click add incident on operator information page
    * I set incident 1 source to "PURE" on operator information page
    * I set incident 1 accident or violation to "Not" on operator information page
    * I set incident 1 conviction date to "01/02/2018" on operator information page
    * I click save changes button

    * I rate a quote
    * I navigate to underwriting referrals page

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorEX | EX  | P85  |
      | NY_001 | QuoteCreatorES | ES  | P85  |

  @ConstOper
  Scenario Outline: Verify trigger of referral for claims with same date of loss on REN trx for PA
    As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
    "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
    If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote
    Then  I navigate to Operators and Vehicles Page
    And   I click the next page button

    * I click add incident on driver details page
    * I set incident 0 source to "PURE" on driver details page
    * I set incident 0 accident or violation to "Not" on driver details page
    * I set incident 0 conviction date to "09/10/2021" on driver details page
    * I click save changes button

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    * I navigate to transactions or endorsements
    * I create a renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I click the next page button
    * I click the next page button
    * I click add incident on driver details page

    * I set incident 1 source to "PURE" on driver details page
    * I set incident 1 accident or violation to "Not" on driver details page
    * I set incident 1 conviction date to "09/10/2021" on driver details page
    * I click save changes button

    * I review changes
    * I check renewed premium
    * I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPA | PA  | P85  |

  @ConstOperS
  Scenario Outline: Verify trigger of referral for claims with same date of loss REN trx for EX
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    Then  I navigate to quotes page
    And   I initiate a new quote
    And   I create a new "<LOB>" quote
    Then  I navigate to operator information page

    * I click add incident on operator information page
    * I set incident 0 source to "PURE" on operator information page
    * I set incident 0 accident or violation to "Not" on operator information page
    * I set incident 0 conviction date to "01/02/2018" on operator information page
    * I click save changes button

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    * I navigate to transactions or endorsements
    * I create a renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I navigate to operator information page

    * I click add incident on operator information page
    * I set incident 1 source to "PURE" on operator information page
    * I set incident 1 accident or violation to "Not" on operator information page
    * I set incident 1 conviction date to "01/02/2018" on operator information page
    * I click save changes button

    * I review changes
    * I check renewed premium
    * I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorEX | EX  | P85  |

  @ConstOper @Endorsement
  Scenario Outline: Verify trigger of referral for claims with same date of loss on END trx for ES
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

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

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    And  I navigate to policy image page
    And  I navigate to Excess Policy Page
    Then I navigate to "Application" page through the Tree
    And  I set Statement of Diligent Effort received to "Yes"
    Then I navigate to operator information page

    * I click add incident on operator information page
    * I set incident 0 driver to "Aoperator" on operator information page
    * I set incident 0 source to "PURE" on operator information page
    * I set incident 0 accident or violation to "Not" on operator information page
    * I set incident 0 conviction date to "04/15/2025" on operator information page

    * I click add incident on operator information page
    * I set incident 1 driver to "Aoperator" on operator information page
    * I set incident 1 source to "PURE" on operator information page
    * I set incident 1 accident or violation to "Not" on operator information page
    * I set incident 1 conviction date to "04/15/2025" on operator information page
    * I click save changes button

    And  I review changes
    And  I check renewed premium
    Then I review referrals

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI


    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorES | ES  | P86  |

  @ConstOper
  Scenario Outline: Verify trigger of referral for claims with same date of loss under new operator on END trx for ES
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

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


    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    And  I navigate to policy image page
    And  I navigate to Excess Policy Page
    Then I navigate to "Application" page through the Tree
    And  I set Statement of Diligent Effort received to "Yes"
    Then I navigate to operator information page

    * I click add additional operator
    * I set additional operator 1 additional driver first name to "Aoperator"
    * I set additional operator 1 additional driver last name to "Test"
    * I set additional operator 1 additional driver status to "Active" for "FL"
    * I set additional operator 1 additional driver DOB to "04/04/1995"
    * I set additional operator 1 additional driver gender to "Male"
    * I set additional operator 1 additional driver license state to "FL"
    * I set additional operator 1 additional driver license number to "39248324"
    * I set additional operator 1 additional driver relationship to insured to "Friend"
    * I set driver resided at policy location for more than 6 months to "Yes" for driver 1

    * I click add incident on operator information page
    * I set incident 0 driver to "Aoperator" on operator information page
    * I set incident 0 source to "PURE" on operator information page
    * I set incident 0 accident or violation to "Not" on operator information page
    * I set incident 0 conviction date to "04/15/2025" on operator information page

    * I click add incident on operator information page
    * I set incident 1 driver to "Aoperator" on operator information page
    * I set incident 1 source to "PURE" on operator information page
    * I set incident 1 accident or violation to "Not" on operator information page
    * I set incident 1 conviction date to "04/15/2025" on operator information page
    * I click save changes button

    And  I review changes
    And  I rate an endorsement
    Then I review referrals

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI


    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorES | ES  | P86  |


  @BrokerConstOper
  Scenario: Verify trigger of referral for claims with same date of loss under new operator on END trx for PA for Broker
  As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
  "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
  If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I am logged in to Pure as Broker
    And   I navigate to customers page
    Then  I select customer by ID "751032291086"
    Then  I select a Policy by ID "PA254088800" on customer summary page

    Then I navigate to transactions or endorsements
    And  I click ">>> new" button on UI
    
    * I write text to "Choose Transaction Type" and value is "Endorsement"
    * I think for 2 to 3 seconds
    * I write text to "Endorsement Type" and value is "Add/Change/Delete Driver"
    * I write text to "New Transaction Effective Date" and value is "04/16/2025"
    * I write text to "Notes" and value is "Automation Test"
    * I click ">>> next" button on UI

    Then I navigate to policy image page
    Then I navigate to Operators and Vehicles Page

    * I click add additional operator
    * I set additional operator 1 additional driver first name to "Aoperator"
    * I set additional operator 1 additional driver last name to "Test"
    * I set additional operator 1 additional driver DOB to "04/04/1995"
    * I set additional operator 1 additional driver status to "Active" for "FL"
    * I set additional operator 1 additional driver gender to "Male"
    * I set additional operator 1 additional driver license state to "FL"
    * I set additional operator 1 additional driver license number to "39248324"
    * I set additional operator 1 additional driver relationship to insured to "Friend"
    * I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    * I click save changes button

    Then I click the next page button
    Then I click the next page button
    Then I think for 2 to 3 seconds

    * I write text to "Marital Status" and value is "Single"
    * I think for 1 to 2 seconds
    * I write text to "License Status" and value is "Active License in U.S."

    * I click prev button
    * I click the next page button
    * I think for 1 to 2 seconds

    * I write text to "How long have you been licensed in the US?" and value is "3 or More Yrs"
    * I click "No" radio button for label "Have you been licensed in another state in the past 2 years?"
    * I write text to "Occupation" and value is "Driver"

    * I click add incident on driver details page
    * I set incident 0 source to "PURE" on driver details page
    * I set incident 0 accident or violation to "Not" on driver details page
    * I set incident 0 conviction date to "04/15/2025" on driver details page for "FL"

    * I click add incident on driver details page
    * I set incident 1 source to "PURE" on driver details page
    * I set incident 1 accident or violation to "Not" on driver details page
    * I set incident 1 conviction date to "04/15/2025" on driver details page for "FL"
    * I click save changes button

    And  I review changes
    Then I click "YES" button for backdated transaction with losses during time period
    And  I rate an endorsement
    And  I rate an endorsement
    Then I click "submit for review" button on UI

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If all claim information is correct, please refer to Underwriting for further review." is "Displayed" on the UI

    Then I navigate to policy bread crumb
    Then I delete first transaction after New Business

  @ConstOperRE
  Scenario Outline: Verify removal of triggered referral for claims with same date of loss after removing the duplicate claim on REN trx for PA
    As a User I want to verify that when a newly added operator has claims with the same date of loss a referral is triggered with the wording
    "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims.
    If multiple incidents with the same date of loss is correct, please document acceptability of loss history."

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote
    Then  I navigate to Operators and Vehicles Page
    And   I click the next page button

    * I click add incident on driver details page
    * I set incident 0 source to "PURE" on driver details page
    * I set incident 0 accident or violation to "Not" on driver details page
    * I set incident 0 conviction date to "09/10/2021" on driver details page
    * I click save changes button

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    * I navigate to transactions or endorsements
    * I create a renewal
    * I select a transaction "Renewal"
    * I navigate to policy image page
    * I click the next page button
    * I click the next page button
    * I click add incident on driver details page

    * I set incident 1 source to "PURE" on driver details page
    * I set incident 1 accident or violation to "Not" on driver details page
    * I set incident 1 conviction date to "09/10/2021" on driver details page
    * I click save changes button

    * I review changes
    * I check renewed premium
    * I review referrals
    
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Displayed" on the UI
    
    Then I navigate to policy image page
    And  I navigate to Operators and Vehicles Page

    * I click add additional operator
    * I set additional operator 1 additional driver first name to "Aoperator"
    * I set additional operator 1 additional driver last name to "Test"
    * I set additional operator 1 additional driver DOB to "04/04/1995"
    * I set additional operator 1 additional driver status to "Not in Household" for "FL"
    * I click save changes button

    Then I click the next page button
    And  I click "delete" button on UI

    * I click save changes button
    * I review changes
    * I check renewed premium
    * I review referrals

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all drivers and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history." is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPA | PA  | P85  |

  @FullRegression_IntegrationWizards @LPBREG @20thJunePostProd
  Scenario Outline: Verify that the "LPB Taken Up?" element is visible on Pure claims page
  As a User I want to verify that when I navigate to Pure claims page the LPB Taken Up? element is visible.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click Yes button for any Pure claims on Pure claims page
    Then I add a new manual claim on Pure Claims page
    Then I verify if element with message "LPB Taken Up?" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P85  |
#      | AK_001 | QuoteCreatorHO | HO  | P85  |
#      | AZ_001 | QuoteCreatorHO | HO  | P85  |
#      | AR_001 | QuoteCreatorHO | HO  | P85  |
#      | CA_001 | QuoteCreatorHO | HO  | P85  |
#      | CO_001 | QuoteCreatorHO | HO  | P85  |
#      | CT_001 | QuoteCreatorHO | HO  | P85  |
#      | DE_001 | QuoteCreatorHO | HO  | P85  |
#      | FL_001 | QuoteCreatorHO | HO  | P85  |
#      | GA_001 | QuoteCreatorHO | HO  | P85  |
#      | HI_001 | QuoteCreatorHO | HO  | P85  |
#      | ID_001 | QuoteCreatorHO | HO  | P85  |
#      | IL_001 | QuoteCreatorHO | HO  | P85  |
#      | IN_001 | QuoteCreatorHO | HO  | P85  |
#      | IA_001 | QuoteCreatorHO | HO  | P85  |
#      | KS_001 | QuoteCreatorHO | HO  | P85  |
#      | KY_001 | QuoteCreatorHO | HO  | P85  |
#      | LA_001 | QuoteCreatorHO | HO  | P85  |
#      | ME_001 | QuoteCreatorHO | HO  | P85  |
#      | MD_001 | QuoteCreatorHO | HO  | P85  |
#      | MA_001 | QuoteCreatorHO | HO  | P85  |
#      | MI_001 | QuoteCreatorHO | HO  | P85  |
#      | MN_001 | QuoteCreatorHO | HO  | P85  |
#      | MS_001 | QuoteCreatorHO | HO  | P85  |
#      | MO_001 | QuoteCreatorHO | HO  | P85  |
#      | MT_001 | QuoteCreatorHO | HO  | P85  |
#      | NE_001 | QuoteCreatorHO | HO  | P85  |
#      | NV_001 | QuoteCreatorHO | HO  | P85  |
#      | NH_001 | QuoteCreatorHO | HO  | P85  |
#      | NJ_001 | QuoteCreatorHO | HO  | P85  |
#      | NM_001 | QuoteCreatorHO | HO  | P85  |
#      | NY_001 | QuoteCreatorHO | HO  | P85  |
#      | NC_001 | QuoteCreatorHO | HO  | P85  |
#      | ND_001 | QuoteCreatorHO | HO  | P85  |
#      | OH_001 | QuoteCreatorHO | HO  | P85  |
#      | OK_001 | QuoteCreatorHO | HO  | P85  |
#      | OR_001 | QuoteCreatorHO | HO  | P85  |
#      | PA_001 | QuoteCreatorHO | HO  | P85  |
#      | RI_001 | QuoteCreatorHO | HO  | P85  |
#      | SC_001 | QuoteCreatorHO | HO  | P85  |
#      | SD_001 | QuoteCreatorHO | HO  | P85  |
#      | TN_001 | QuoteCreatorHO | HO  | P85  |
#      | TX_001 | QuoteCreatorHO | HO  | P85  |
#      | UT_001 | QuoteCreatorHO | HO  | P85  |
#      | VT_001 | QuoteCreatorHO | HO  | P85  |
#      | VA_001 | QuoteCreatorHO | HO  | P85  |
#      | WA_001 | QuoteCreatorHO | HO  | P85  |
#      | WV_001 | QuoteCreatorHO | HO  | P85  |
#      | WI_001 | QuoteCreatorHO | HO  | P85  |
#      | WY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
#      | MS_001 | QuoteCreatorHS | HS  | P85  |
#      | AL_001 | QuoteCreatorHS | HS  | P85  |
#      | CA_001 | QuoteCreatorHS | HS  | P85  |
#      | GA_001 | QuoteCreatorHS | HS  | P85  |
#      | LA_001 | QuoteCreatorHS | HS  | P85  |
#      | MA_001 | QuoteCreatorHS | HS  | P85  |
#      | SC_001 | QuoteCreatorHS | HS  | P85  |
#      | NJ_001 | QuoteCreatorHS | HS  | P85  |
#      | NC_001 | QuoteCreatorHS | HS  | P85  |
#      | TX_001 | QuoteCreatorHS | HS  | P85  |
#      | FL_001 | QuoteCreatorHS | HS  | P85  |
#      | CO_001 | QuoteCreatorHS | HS  | P85  |

  @LPBREG @20thJunePostProd
  Scenario Outline: Verify that the "LPB Devices Installed" element is visible on Pure claims page
    As a User I want to verify that when I navigate to Pure claims page the LPB Devices Installed element is visible.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click Yes button for any Pure claims on Pure claims page
    Then I add a new manual claim on Pure Claims page
    Then I click "Yes" radio button for label "LPB Taken Up?"
    Then I verify that textarea "LPB Devices Installed" with "31689437" bv is "Displayed"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P85  |
#      | AK_001 | QuoteCreatorHO | HO  | P85  |
#      | AZ_001 | QuoteCreatorHO | HO  | P85  |
#      | AR_001 | QuoteCreatorHO | HO  | P85  |
#      | CA_001 | QuoteCreatorHO | HO  | P85  |
#      | CO_001 | QuoteCreatorHO | HO  | P85  |
#      | CT_001 | QuoteCreatorHO | HO  | P85  |
#      | DE_001 | QuoteCreatorHO | HO  | P85  |
#      | FL_001 | QuoteCreatorHO | HO  | P85  |
#      | GA_001 | QuoteCreatorHO | HO  | P85  |
#      | HI_001 | QuoteCreatorHO | HO  | P85  |
#      | ID_001 | QuoteCreatorHO | HO  | P85  |
#      | IL_001 | QuoteCreatorHO | HO  | P85  |
#      | IN_001 | QuoteCreatorHO | HO  | P85  |
#      | IA_001 | QuoteCreatorHO | HO  | P85  |
#      | KS_001 | QuoteCreatorHO | HO  | P85  |
#      | KY_001 | QuoteCreatorHO | HO  | P85  |
#      | LA_001 | QuoteCreatorHO | HO  | P85  |
#      | ME_001 | QuoteCreatorHO | HO  | P85  |
#      | MD_001 | QuoteCreatorHO | HO  | P85  |
#      | MA_001 | QuoteCreatorHO | HO  | P85  |
#      | MI_001 | QuoteCreatorHO | HO  | P85  |
#      | MN_001 | QuoteCreatorHO | HO  | P85  |
#      | MS_001 | QuoteCreatorHO | HO  | P85  |
#      | MO_001 | QuoteCreatorHO | HO  | P85  |
#      | MT_001 | QuoteCreatorHO | HO  | P85  |
#      | NE_001 | QuoteCreatorHO | HO  | P85  |
#      | NV_001 | QuoteCreatorHO | HO  | P85  |
#      | NH_001 | QuoteCreatorHO | HO  | P85  |
#      | NJ_001 | QuoteCreatorHO | HO  | P85  |
#      | NM_001 | QuoteCreatorHO | HO  | P85  |
#      | NY_001 | QuoteCreatorHO | HO  | P85  |
#      | NC_001 | QuoteCreatorHO | HO  | P85  |
#      | ND_001 | QuoteCreatorHO | HO  | P85  |
#      | OH_001 | QuoteCreatorHO | HO  | P85  |
#      | OK_001 | QuoteCreatorHO | HO  | P85  |
#      | OR_001 | QuoteCreatorHO | HO  | P85  |
#      | PA_001 | QuoteCreatorHO | HO  | P85  |
#      | RI_001 | QuoteCreatorHO | HO  | P85  |
#      | SC_001 | QuoteCreatorHO | HO  | P85  |
#      | SD_001 | QuoteCreatorHO | HO  | P85  |
#      | TN_001 | QuoteCreatorHO | HO  | P85  |
#      | TX_001 | QuoteCreatorHO | HO  | P85  |
#      | UT_001 | QuoteCreatorHO | HO  | P85  |
#      | VT_001 | QuoteCreatorHO | HO  | P85  |
#      | VA_001 | QuoteCreatorHO | HO  | P85  |
#      | WA_001 | QuoteCreatorHO | HO  | P85  |
#      | WV_001 | QuoteCreatorHO | HO  | P85  |
#      | WI_001 | QuoteCreatorHO | HO  | P85  |
#      | WY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
#      | MS_001 | QuoteCreatorHS | HS  | P85  |
#      | AL_001 | QuoteCreatorHS | HS  | P85  |
#      | CA_001 | QuoteCreatorHS | HS  | P85  |
#      | GA_001 | QuoteCreatorHS | HS  | P85  |
#      | LA_001 | QuoteCreatorHS | HS  | P85  |
#      | MA_001 | QuoteCreatorHS | HS  | P85  |
#      | SC_001 | QuoteCreatorHS | HS  | P85  |
#      | NJ_001 | QuoteCreatorHS | HS  | P85  |
#      | NC_001 | QuoteCreatorHS | HS  | P85  |
#      | TX_001 | QuoteCreatorHS | HS  | P85  |
#      | FL_001 | QuoteCreatorHS | HS  | P85  |
#      | CO_001 | QuoteCreatorHS | HS  | P85  |

  @LPBREG @20thJunePostProd
  Scenario Outline: Verify that the "Reason LPB Declined" element is visible on Pure claims page when LPB Taken Up is set to Yes
    As a User I want to verify that when I navigate to Pure claims page the Reason LPB Declined element is visible.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click Yes button for any Pure claims on Pure claims page
    Then I add a new manual claim on Pure Claims page
    Then I click "No" radio button for label "LPB Taken Up?"
    Then I verify that textarea "Reason LPB Declined" with "31689537" bv is "Displayed"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHO | HO  | P85  |
#      | AK_001 | QuoteCreatorHO | HO  | P85  |
#      | AZ_001 | QuoteCreatorHO | HO  | P85  |
#      | AR_001 | QuoteCreatorHO | HO  | P85  |
#      | CA_001 | QuoteCreatorHO | HO  | P85  |
#      | CO_001 | QuoteCreatorHO | HO  | P85  |
#      | CT_001 | QuoteCreatorHO | HO  | P85  |
#      | DE_001 | QuoteCreatorHO | HO  | P85  |
#      | FL_001 | QuoteCreatorHO | HO  | P85  |
#      | GA_001 | QuoteCreatorHO | HO  | P85  |
#      | HI_001 | QuoteCreatorHO | HO  | P85  |
#      | ID_001 | QuoteCreatorHO | HO  | P85  |
#      | IL_001 | QuoteCreatorHO | HO  | P85  |
#      | IN_001 | QuoteCreatorHO | HO  | P85  |
#      | IA_001 | QuoteCreatorHO | HO  | P85  |
#      | KS_001 | QuoteCreatorHO | HO  | P85  |
#      | KY_001 | QuoteCreatorHO | HO  | P85  |
#      | LA_001 | QuoteCreatorHO | HO  | P85  |
#      | ME_001 | QuoteCreatorHO | HO  | P85  |
#      | MD_001 | QuoteCreatorHO | HO  | P85  |
#      | MA_001 | QuoteCreatorHO | HO  | P85  |
#      | MI_001 | QuoteCreatorHO | HO  | P85  |
#      | MN_001 | QuoteCreatorHO | HO  | P85  |
#      | MS_001 | QuoteCreatorHO | HO  | P85  |
#      | MO_001 | QuoteCreatorHO | HO  | P85  |
#      | MT_001 | QuoteCreatorHO | HO  | P85  |
#      | NE_001 | QuoteCreatorHO | HO  | P85  |
#      | NV_001 | QuoteCreatorHO | HO  | P85  |
#      | NH_001 | QuoteCreatorHO | HO  | P85  |
#      | NJ_001 | QuoteCreatorHO | HO  | P85  |
#      | NM_001 | QuoteCreatorHO | HO  | P85  |
#      | NY_001 | QuoteCreatorHO | HO  | P85  |
#      | NC_001 | QuoteCreatorHO | HO  | P85  |
#      | ND_001 | QuoteCreatorHO | HO  | P85  |
#      | OH_001 | QuoteCreatorHO | HO  | P85  |
#      | OK_001 | QuoteCreatorHO | HO  | P85  |
#      | OR_001 | QuoteCreatorHO | HO  | P85  |
#      | PA_001 | QuoteCreatorHO | HO  | P85  |
#      | RI_001 | QuoteCreatorHO | HO  | P85  |
#      | SC_001 | QuoteCreatorHO | HO  | P85  |
#      | SD_001 | QuoteCreatorHO | HO  | P85  |
#      | TN_001 | QuoteCreatorHO | HO  | P85  |
#      | TX_001 | QuoteCreatorHO | HO  | P85  |
#      | UT_001 | QuoteCreatorHO | HO  | P85  |
#      | VT_001 | QuoteCreatorHO | HO  | P85  |
#      | VA_001 | QuoteCreatorHO | HO  | P85  |
#      | WA_001 | QuoteCreatorHO | HO  | P85  |
#      | WV_001 | QuoteCreatorHO | HO  | P85  |
#      | WI_001 | QuoteCreatorHO | HO  | P85  |
#      | WY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
#      | MS_001 | QuoteCreatorHS | HS  | P85  |
#      | AL_001 | QuoteCreatorHS | HS  | P85  |
#      | CA_001 | QuoteCreatorHS | HS  | P85  |
#      | GA_001 | QuoteCreatorHS | HS  | P85  |
#      | LA_001 | QuoteCreatorHS | HS  | P85  |
#      | MA_001 | QuoteCreatorHS | HS  | P85  |
#      | SC_001 | QuoteCreatorHS | HS  | P85  |
#      | NJ_001 | QuoteCreatorHS | HS  | P85  |
#      | NC_001 | QuoteCreatorHS | HS  | P85  |
#      | TX_001 | QuoteCreatorHS | HS  | P85  |
#      | FL_001 | QuoteCreatorHS | HS  | P85  |
#      | CO_001 | QuoteCreatorHS | HS  | P85  |

  @20thJunePostProd
  Scenario Outline: Verify that the "Reason LPB Declined" element is visible on Pure claims page when LPB Taken Up is set to Yes
    As a User I want to verify that when I navigate to Pure claims page the Reason LPB Declined element is visible.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click Yes button for any Pure claims on Pure claims page
    Then I add a new manual claim on Pure Claims page
    Then I check that radio button for label "LPB Taken Up?" option "Yes" is "Not Mandatory"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |

  @20thJunePostProd
  Scenario Outline: Verify that the "Reason LPB Declined" & "LPB Devices installed" element is not mandatory on Pure claims page
    As a User I want to verify that when I navigate to Pure claims page the Reason LPB Declined & LPB Devices Installed element is not mandatory.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click Yes button for any Pure claims on Pure claims page
    Then I add a new manual claim on Pure Claims page
    Then I click "No" radio button for label "LPB Taken Up?"
    Then I check that text area with title "LPB Devices Installed" is "Not Mandatory"

    Then I click "Yes" radio button for label "LPB Taken Up?"
    And  I check that text area with title "Reason LPB Declined" is "Not Mandatory"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |

  @ConstOperH @20thJunePostProd
  Scenario Outline: Verify that the "Reason LPB Declined" textarea is limited to 500 characters
    As a User I want to verify that when I navigate to Pure claims page the Reason LPB Declined textarea is limited to 500 characters.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value                                    |
      | lossType               | Fire                                     |
      | description            | test                                     |
    Then I click "No" radio button for label "LPB Taken Up?"
    Then I type to textarea "500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 500 50"
    And  I click "save" button on UI
    Then I verify if element with message " is too long, the maximum length is 499" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |


  @20thJunePostProd
  Scenario Outline: Verify that the "LPB Devices Installed" textarea is limited to 500 characters
    As a User I want to verify that when I navigate to Pure claims page the LPB Devices Installed textarea is limited to 500 characters.

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
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value                                    |
      | lossType               | Fire                                     |
      | description            | test                                     |
    Then I click "Yes" radio button for label "LPB Taken Up?"
    Then I type to textarea "500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 Chars test500 500 50"
    And  I click "save" button on UI
    Then I verify if element with message "is too long, the maximum length is 499" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHO | HO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set less than the effective date of the policy
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is less than the effective date of the policy for all US admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | accidentConvictiondate | 04/23/2025 |
      | lossDate               | 04/23/2025 |
      | ratedAccident          | Not        |
      | lossType               | Fire       |
      | lossWCType             | Other      |
      | lossCOType             | Fire       |
      | classType              | Worldwide  |
      | description            | test       |

    Then I verify if element with message "Loss date cannot be less than Effective date of the policy" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P85  |
      | GA_001 | QuoteCreatorCO | CO  | P91  |
      | AK_001 | QuoteCreatorPW | PW  | P93  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set less than the effective date of the policy
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is less than the effective date of the policy for all US admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | accidentConvictiondate | 04/23/2025 |
      | lossDate               | 04/23/2025 |
      | ratedAccident          | Not        |
      | lossType               | Fire       |
      | lossWCType             | Other      |
      | lossCOType             | Fire       |
      | classType              | Worldwide  |
      | description            | test       |

    Then I verify if element with message "Incident date cannot be less than Effective date of the policy" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorPA | PA  | P90  |
      | TX_001 | QuoteCreatorEX | EX  | P92  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set less than the effective date of the policy
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is less than the effective date of the policy for all US non-admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | lossDate               | 04/23/2025 |
      | lossType               | Fire       |
      | description            | test       |

    Then I verify if element with message "Loss date cannot be less than Effective date of the policy" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
      | GA_001 | QuoteCreatorCC | CC  | P91  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set less than the effective date of the policy
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is less than the effective date of the policy for all US non-admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | accidentConvictiondate | 04/23/2025 |
      | ratedAccident          | Not        |
      | description            | test       |

    Then I verify if element with message "Incident date cannot be less than Effective date of the policy" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorES | ES  | P90  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new  manual claim that has loss date set in the future
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is set in the future from current day for all US admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | lossDate               | 04/23/2030 |
      | lossType               | Fire       |
      | lossWCType             | Other      |
      | lossCOType             | Fire       |
      | classType              | Worldwide  |
      | description            | test       |

    Then I verify if element with message "Loss date cannot be in the future" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P85  |
      | GA_001 | QuoteCreatorCO | CO  | P91  |
      | AK_001 | QuoteCreatorPW | PW  | P93  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set in the future Admitted LOBs
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is set in the future from current day for all US admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | accidentConvictiondate | 04/23/2030 |
      | ratedAccident          | Not        |
      | description            | test       |

    Then I verify if element with message "Incident date cannot be in the future" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P85  |
      | GA_001 | QuoteCreatorEX | EX  | P91  |

  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for a new manual claim that has loss date set in the future Non-Admitted LOBs
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date set in the future from current day for all US non-admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | lossDate               | 04/23/2030 |
      | lossType               | Fire       |
      | description            | test       |

    Then I verify if element with message "Loss date cannot be in the future" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
      | GA_001 | QuoteCreatorCC | CC  | P91  |


  @ConsistentLoss
  Scenario Outline: Verify the existence of advisory message for manual claim that has loss date set lin the future Non-Admitted LOBs
    As a User I expect to see an advisory message when trying to save a claim informing me that a claim on Pure claims page cannot have a
    loss date that is less than the effective date of the policy for all US non-admitted LOBs

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set "Effective_Date" to "04/24/2025"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I fill out "<LOB>" Claim Mandatory Fields and Save Claim
      | field                  | value      |
      | accidentConvictiondate | 04/23/2030 |
      | ratedAccident          | Not        |
      | description            | test       |

    Then I verify if element with message "Incident date cannot be in the future" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorES | ES  | P90  |

  @20thJunePostProd
  Scenario: Verify that the new auto claim details section has been added to Watercraft Pure Claims page
    As a User I expect to see new section on Pure Claims page titled auto loss details

    Given I use "AL_001" regression test data from "QuoteCreatorPW" sheet
    When  I am logged in to Pure as "P99"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PW" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    * I navigate to Pure Claims tab
    * I click previous losses Yes Button
    
    * I verify block "auto claim details" exists

  @Disabled
  Scenario: Verify that the new auto loss details section has been added to Watercraft Pure Claims page
    As a User I expect to see new section on Pure Claims page titled auto loss details

    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When  I am logged in to Pure as "P98"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "PW" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    * I navigate to Pure Claims tab
    * I click previous losses Yes Button
    * I add an auto claim on watercraft Pure Claims page

    * I Verify that Claim Loss Cause Field Is Visible
    * I Verify That Claim Operator Field Is Visible
    * I verify if element with message "Claim Number" is "Displayed" on the UI
    * I verify if element with message "Accident Conviction Dt" is "Displayed" on the UI
    * I verify if element with message "Rated Accident or Violation (within last 5 years)" is "Displayed" on the UI
    * I verify if element with message "Rated Driver" is "Displayed" on the UI
    * I verify if element with message "Vehicle Involved" is "Displayed" on the UI
    * I verify if element with message "Claim Operator Fault" is "Displayed" on the UI
    * I verify if element with message "Underwriter Alert" is "Displayed" on the UI
    * I verify if element with message "Vehicle Type" is "Displayed" on the UI
    * I verify if element with message "Indemnity Reserved" is "Displayed" on the UI
    * I verify if element with message "Total Amount Paid" is "Displayed" on the UI
    * I verify if element with message "Indemnity Paid" is "Displayed" on the UI
    * I verify if element with message "Expense Paid" is "Displayed" on the UI
    * I verify if element with message "CAT?" is "Displayed" on the UI
    * I verify if element with message "Claim Closed?" is "Displayed" on the UI

    * I check that field with name "Accident Conviction Dt" is "Mandatory"
    * I check that field with name "Rated Driver" is "Mandatory"
    * I check that radio button for label "Claim Closed?" option "No" is "Mandatory"
    * I check that radio button for label "Claim Closed?" option "Yes" is "Mandatory"
    * I check that text area with title "Description" is "Mandatory"
    * I check that field with name "Total Amount Paid" is "Not Mandatory"
    * I check that field with name "Indemnity Paid" is "Not Mandatory"
    * I check that field with name "Expense Paid" is "Not Mandatory"

    * I click "Yes" radio button for label "Claim Closed?"

    * I check that field with name "Total Amount Paid" is "Mandatory"
    * I check that radio button for label "Subro?" option "No" is "Mandatory"
    * I check that radio button for label "Subro?" option "Yes" is "Mandatory"

    * I check that field with name "Rated Accident or Violation (within last 5 years)" is "Not Mandatory"
    * I check that field with name "Claim Operator Fault" is "Not Mandatory"
    * I check that field with name "Claim Loss Cause" is "Not Mandatory"
    * I check that field with name "Claim Operator" is "Not Mandatory"

  @ConsistentLossPW @20thJunePostProd
  Scenario Outline: Verify that a new closed manual PA claim is copied over to the new PW quote
  As a User I want to verify that the new PA Manual Claim has been copied over to the new PW Quote for multiple states and loss types

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
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Previous Claims-MVR Activity Page
    Then I verify copied auto claim details on WC
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line      | Quote_Name          | original_claim_loss_type | copied_claim_loss_type           |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Watercraft | Personal Watercraft | At-fault accident < $500 | At-fault acc <$1000, no injuries |

  @ConsistentLossPW @20thJunePostProd
  Scenario Outline: Verify that a new closed manual PA claim from cancelled policy is copied over to the new PW quote
    As a User I want to verify that the new PA Manual Claim has been copied over to the new PW Quote for multiple states and loss types

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
    * I navigate to transactions or endorsements
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    * I navigate to transactions or endorsements
    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |


    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Previous Claims-MVR Activity Page
    Then I verify copied auto claim details on WC
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line      | Quote_Name          | original_claim_loss_type | copied_claim_loss_type   |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Watercraft | Personal Watercraft | At-fault accident < $500 | At-fault acc <$1000, no injuries |

  @20thJunePostProd
  Scenario Outline: Verify that operator included through obtained operators block with claim tied to them has claim carried over under their name on PW Quote
    As a User I expect to see a claim under Auto Incidents block on Previous claims/MVR page when an operator with a closed claim tied to them
    is included through Obtained operators block on PW Quote

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

    * I set "Additional_Vehicles_END" to ","
    * I set "Additional_Operators_END" to "Operator_003_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
    * I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "<Operator_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "<Operator_Last_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Prefix_END_1" to "<Operator_Prefix>"
    * I set "Additional_Operators_Additional_Driver_Suffix_END_1" to "<Operator_Suffix>"
    * I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "<Operator_Status>"


    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    * I set Effective Date of Endorsement to Today

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to Operators and Vehicles Page
    Then I click add additional operator
    Then I fill out PA endorsement additional operators block
    *    I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    *    I click the next page button
    *    I click the next page button
    And  I fill out PA endorsement additional driver 1 details block
    *    I write text to "Occupation" and value is "Driver"
    Then I click save changes button

    Then I review changes
    And  I rate an endorsement
    Then I review referrals
    Then I accept underwriting referrals
    And  I issue an endorsement
    And  I navigate to transactions or endorsements

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver                                                           | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> | <Operator_Prefix>. <Operator_Name_On_END> <Operator_Last_Name_On_END> | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Watercraft Policy Page
    And  I mark 0 operator to be included and include them
    Then I navigate to Previous Claims-MVR Activity Page
    Then I verify copied auto claim details on WC
      | ratedDriver                                        | Source | ratedAccident            | accidentConvictionDate |
      | <Operator_Name_On_END> <Operator_Last_Name_On_END> | PURE   | <copied_claim_loss_type> |                        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | original_claim_loss_type | copied_claim_loss_type           | State | Insurance_Line      | Quote_Name          | Operator_Name_On_END | Operator_Last_Name_On_END | Operator_Prefix | Operator_Suffix | Operator_Status |
      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident < $500 | At-fault acc <$1000, no injuries | NY    | Personal Watercraft | Personal Watercraft | Test                 | Operator                  | Mr              | Sr              | Active          |

  @ConsistentLossOp
  Scenario Outline: Verify that closed PW claims are mapped to newly created PW Quote
    As a User I expect to see a claim that is closed mapped under watercraft loss history for prior vessels not listed under quote(policy) with the correct details mapped.

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
    * I navigate to transactions or endorsements

    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"


    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | lossDate | lossType                   | RelatedVessel | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |          | <original_claim_loss_type> |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Watercraft Policy Page
    Then I navigate to Previous Claims-MVR Activity Page
    Then I verify copied watercraft claim details on WC
      | Source | lossType                 | lossDate | lossAmount |
      | PURE   | <copied_claim_loss_type> |          | 490        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | original_claim_loss_type | copied_claim_loss_type   | State | Insurance_Line      | Quote_Name          |
      | NY_001 | PW  | QuoteCreatorPW | P93  | Other                    | Other                    | NY    | Personal Watercraft | Personal Watercraft |
      | AL_001 | PW  | QuoteCreatorPW | P93  | Wind Loss                | Wind Loss                | MA    | Personal Watercraft | Personal Watercraft |
      | FL_001 | PW  | QuoteCreatorPW | P93  | Property Damage <$10,000 | Property Damage <$10,000 | AL    | Personal Watercraft | Personal Watercraft |
      | GA_001 | PW  | QuoteCreatorPW | P93  | Liability <$10,000       | Liability <$10,000       | FL    | Personal Watercraft | Personal Watercraft |


  @FullRegression_IntegrationWizards 
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW NB trx Internal user CA/WA states
    As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB CA/WA states on Operator
    tree node on New Business transaction

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

    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    Then I create a new quote on new quote information page

    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag


    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     | State | Insurance_Line      | Quote_Name          |
      | CA_001 | P84  | PW  | QuoteCreatorPW | CA    | Personal Watercraft | Personal Watercraft |
      | WA_001 | P84  | PW  | QuoteCreatorPW | WA    | Personal Watercraft | Personal Watercraft |

  @FullRegression_IntegrationWizards 
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW END trx Internal user CA/WA states
    As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB CA/WA states on Operator
    tree node on endorsement transaction

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


    And  I navigate to transactions or endorsements
    Then I initiate new endorsement
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  @FullRegression_IntegrationWizards @IW 
  Scenario Outline: Verify visibility of the new block "Operators obtained from active households quotes and policies" for PW NB Rewrite trx Internal user CA/WA
    As a User I want to verify that the new block "Operators obtained from active households quotes and policies" is visible for PW LOB CA/WA states on Operator
    tree node on New Business Rewrite transaction

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

    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  @ConstOpPW @FullRegression_IntegrationWizards
  Scenario Outline: Verify that operator added on END trx is visible in the new Obtained Operators block on PW and is able to be included
    As a User I want to verify that an operator added on an PA endorsement transaction is visible in the new block on a New Business(Quote) transaction

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

    * I set "Additional_Vehicles_END" to ","
    * I set "Additional_Operators_END" to "Operator_003_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
    * I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "<Operator_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "<Operator_Last_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Prefix_END_1" to "<Operator_Prefix>"
    * I set "Additional_Operators_Additional_Driver_Suffix_END_1" to "<Operator_Suffix>"
    * I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "<Operator_Status>"


    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to Operators and Vehicles Page
    Then I fill out PA endorsement additional operators block

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Watercraft Policy Page
    Then I verify operator added through END trx is present for "PW" in the obtained operators block
    Then I verify if element with message "include" is "Displayed" on the UI
    Then I mark 0 operator to be included and include them
    And  I click save changes button
    Then I verify that element "<Operator_Name_On_END>" within block "list of operators (including captain)" is "Displayed"
    Then I verify that element "<Operator_Last_Name_On_END>" within block "list of operators (including captain)" is "Displayed"


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line      | Quote_Name          | Operator_Name_On_END | Operator_Last_Name_On_END | Operator_Prefix | Operator_Suffix | Operator_Status |
      | NY_001 | PA  | QuoteCreatorPA | P93  | NY    | Personal Watercraft | Personal Watercraft | Test                 | Operator                  | Mr.             | Sr.             | Active          |
      | MA_001 | PA  | QuoteCreatorPA | P93  | AL    | Personal Watercraft | Personal Watercraft | Alex                 | Jones                     |                 |                 | Deployed        |
      | FL_001 | PA  | QuoteCreatorPA | P93  | IL    | Personal Watercraft | Personal Watercraft | Fred                 | Mercury                   | Fr.             | Jr.             | Away at School  |
      | GA_001 | PA  | QuoteCreatorPA | P93  | FL    | Personal Watercraft | Personal Watercraft | John                 | Smith                     | Dr.             | II.             | Active          |

  @NewPAfields @20thJunePostProd @18thJulyRelease
  Scenario Outline: Verify that there aren't 3 new fields added to PA Pure Claims page "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid"
    As a User I expect to not see 3 new fields "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid" on PA LOB Pure Claims page

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

    * I navigate to transactions or endorsements
    * I navigate to Pure Claims tab

    Then I add a new manual claim on Pure Claims page
    Then I verify that the "BI Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "PD Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "UM/UIM Indemnity Paid" element is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | NY_001 | QuoteCreatorPA | PA  | P85  |
      | AK_001 | QuoteCreatorPA | PA  | P85  |
      | AZ_001 | QuoteCreatorPA | PA  | P85  |
      | AR_001 | QuoteCreatorPA | PA  | P85  |
#      | CA_001 | QuoteCreatorPA | PA  | P85  |
#      | CO_001 | QuoteCreatorPA | PA  | P85  |
#      | CT_001 | QuoteCreatorPA | PA  | P85  |
#      | DE_001 | QuoteCreatorPA | PA  | P85  |
#      | FL_001 | QuoteCreatorPA | PA  | P85  |
#      | GA_001 | QuoteCreatorPA | PA  | P85  |
#      | HI_001 | QuoteCreatorPA | PA  | P85  |
#      | ID_001 | QuoteCreatorPA | PA  | P85  |
#      | IL_001 | QuoteCreatorPA | PA  | P85  |
#      | IN_001 | QuoteCreatorPA | PA  | P85  |
#      | IA_001 | QuoteCreatorPA | PA  | P85  |
#      | KS_001 | QuoteCreatorPA | PA  | P85  |
#      | KY_001 | QuoteCreatorPA | PA  | P85  |
#      | LA_001 | QuoteCreatorPA | PA  | P85  |
#      | ME_001 | QuoteCreatorPA | PA  | P85  |
#      | MD_001 | QuoteCreatorPA | PA  | P85  |
#      | MA_001 | QuoteCreatorPA | PA  | P85  |
#      | MI_001 | QuoteCreatorPA | PA  | P85  |
#      | MN_001 | QuoteCreatorPA | PA  | P85  |
#      | MS_001 | QuoteCreatorPA | PA  | P85  |
#      | MO_001 | QuoteCreatorPA | PA  | P85  |
#      | MT_001 | QuoteCreatorPA | PA  | P85  |
#      | NE_001 | QuoteCreatorPA | PA  | P85  |
#      | NV_001 | QuoteCreatorPA | PA  | P85  |
#      | NH_001 | QuoteCreatorPA | PA  | P85  |
#      | NJ_001 | QuoteCreatorPA | PA  | P85  |
#      | NM_001 | QuoteCreatorPA | PA  | P85  |
#      | NY_001 | QuoteCreatorPA | PA  | P85  |
#      | NC_001 | QuoteCreatorPA | PA  | P85  |
#      | ND_001 | QuoteCreatorPA | PA  | P85  |
#      | OH_001 | QuoteCreatorPA | PA  | P85  |
#      | OK_001 | QuoteCreatorPA | PA  | P85  |
#      | OR_001 | QuoteCreatorPA | PA  | P85  |
#      | PA_001 | QuoteCreatorPA | PA  | P85  |
#      | RI_001 | QuoteCreatorPA | PA  | P85  |
#      | SC_001 | QuoteCreatorPA | PA  | P85  |
#      | SD_001 | QuoteCreatorPA | PA  | P85  |
#      | TN_001 | QuoteCreatorPA | PA  | P85  |
#      | TX_001 | QuoteCreatorPA | PA  | P85  |
#      | UT_001 | QuoteCreatorPA | PA  | P85  |
#      | VT_001 | QuoteCreatorPA | PA  | P85  |
#      | VA_001 | QuoteCreatorPA | PA  | P85  |
#      | WA_001 | QuoteCreatorPA | PA  | P85  |
#      | WV_001 | QuoteCreatorPA | PA  | P85  |
#      | WI_001 | QuoteCreatorPA | PA  | P85  |
#      | WY_001 | QuoteCreatorPA | PA  | P85  |

  @NewPAfields @Disabled
  Scenario Outline: Verify that the 3 new fields added to PA Pure Claims page "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid" are non-mandatory
    As a User I expect to see the 3 new fields "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid" on PA LOB Pure Claims page be non-mandatory to
    fill out

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

    * I navigate to transactions or endorsements
    * I navigate to Pure Claims tab

    Then I add a new manual claim on Pure Claims page
    Then I check that field with name "BI Indemnity Paid" is "Not Mandatory"
    Then I check that field with name "PD Indemnity Paid" is "Not Mandatory"
    Then I check that field with name "UM/UIM Indemnity Paid" is "Not Mandatory"

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user |
#      | NY_001 | PA  | QuoteCreatorPA | P93  |
#      | MA_001 | PA  | QuoteCreatorPA | P93  |
#      | FL_001 | PA  | QuoteCreatorPA | P93  |
      | GA_001 | PA  | QuoteCreatorPA | P93  |

  @NewPAfields @Disabled
  Scenario Outline: Verify that the 3 new fields added to PA Pure Claims page "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid" are editable for manually added claims
    As a User I expect to see the 3 new fields "BI Indemnity Paid", "PD Indemnity Paid", "UM/UIM Indemnity Paid" on PA LOB Pure Claims page be editable to
    fill out on manually added claims

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

    * I navigate to transactions or endorsements
    * I navigate to Pure Claims tab

    Then I add a new manual claim on Pure Claims page
    Then I verify that field "BI Indemnity Paid" has readonly set to "False" for element index 1
    Then I verify that field "PD Indemnity Paid" has readonly set to "False" for element index 1
    Then I verify that field "UM/UIM Indemnity Paid" has readonly set to "False" for element index 1

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user |
      | NY_001 | PA  | QuoteCreatorPA | P93  |
#      | MA_001 | PA  | QuoteCreatorPA | P93  |
#      | FL_001 | PA  | QuoteCreatorPA | P93  |
#      | GA_001 | PA  | QuoteCreatorPA | P93  |

  @NewPAfields @20thJunePostProd @18thJulyRelease
  Scenario Outline: Verify that the 3 new fields are not applicable to other LOBs
    As a User I expect to not see the 3 new fields added to PA are not added to other LOBs

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

    * I navigate to transactions or endorsements
    * I navigate to Pure Claims tab

    Then I add a new manual claim on Pure Claims page
    Then I verify that the "BI Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "PD Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "UM/UIM Indemnity Paid" element is "Not Displayed" on the UI

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user |
      | MA_001 | EX  | QuoteCreatorEX | P93  |
      | NY_001 | ES  | QuoteCreatorES | P93  |

  @NewPAfields @20thJunePostProd @18thJulyRelease
  Scenario Outline: Verify that the 3 new fields are not applicable to PW
    As a User I expect to not see the 3 new fields added to PA are not added to PW

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

    * I navigate to transactions or endorsements
    * I navigate to Pure Claims tab
    * I click Yes button for any Pure claims on Pure claims page

    Then I add a new manual claim on Pure Claims page
    Then I verify that the "BI Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "PD Indemnity Paid" element is "Not Displayed" on the UI
    Then I verify that the "UM/UIM Indemnity Paid" element is "Not Displayed" on the UI

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user |
      | NY_001 | PW  | QuoteCreatorPW | P93  |

  @NewPAfieldsRen @Disabled
  Scenario Outline: Verify that a new closed manual PA is pulled under the renewal with new UI changes for 3 fields
    As a user I expect to see the newly created closed manual claim pulled under renewal under listed driver

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
    * I navigate to transactions or endorsements

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to transactions or endorsements
    And  I create a renewal
    Then I navigate to policy image page
    Then I navigate to Operators and Vehicles Page
    Then I click the next page button
    And  I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <original_claim_loss_type> |                        |


    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | original_claim_loss_type |
      | NY_001 | PA  | QuoteCreatorPA | P92  | At-fault accident < $500 |

  @ConsistentLossesPA
  Scenario Outline: Verify that a new closed manual PA claim from cancelled policy is copied over to the new PA quote
    As a User I want to verify that the new PA Manual Claim on a cancelled policy has been copied over to the new PA Quote for
    multiple states and loss types

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
    * I navigate to transactions or endorsements
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |
      |                        | <original_claim_loss_type> |             | Not          | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    * I navigate to transactions or endorsements
    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |


    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    And  I click "obtain operators and vehicles" button on UI
    Then I think for 10 to 15 seconds
    Then I navigate to Operators and Vehicles Page
    And  I write text to "Driver Status" and value is "Active"
    And  I write text to "Gender" and value is "Male"
    And  I write text to "Relationship to Insured" and value is "Named Insured"
    Then I click save changes button

    Then I click the next page button
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line | Quote_Name    | original_claim_loss_type | copied_claim_loss_type   |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Auto  | Personal Auto | At-fault accident < $500 | At-fault accident < $500 |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Auto  | Personal Auto | At-fault accident < $500 | At-fault accident < $500 |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Personal Auto  | Personal Auto | At-fault accident < $500 | At-fault accident < $500 |

  @ConstLossesOperatorInclude @FullRegression_IntegrationWizards @Full_Regression
  Scenario Outline: Verify that operator included through obtained operators block with claim tied to them has claim carried over under their name on PA Quote
    As a User I expect to see a claim under Incidents block for included operator tree page when an operator with a closed claim tied to them
    is included through Obtained operators block on PA Quote

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

    * I set "Additional_Vehicles_END" to ","
    * I set "Additional_Operators_END" to "Operator_003_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
    * I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "<Operator_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "<Operator_Last_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Prefix_END_1" to "<Operator_Prefix>"
    * I set "Additional_Operators_Additional_Driver_Suffix_END_1" to "<Operator_Suffix>"
    * I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "<Operator_Status>"


    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    * I set Effective Date of Endorsement to Today

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to Operators and Vehicles Page
    Then I click add additional operator
    Then I fill out PA endorsement additional operators block
    *    I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    *    I click the next page button
    *    I click the next page button
    And  I fill out PA endorsement additional driver 1 details block
    *    I write text to "Occupation" and value is "Driver"
    Then I click save changes button

    Then I review changes
    And  I rate an endorsement
    Then I review referrals
    Then I accept underwriting referrals
    And  I issue an endorsement
    And  I navigate to transactions or endorsements

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver                                        | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid   | indemnityPaid   | expensePaid   |
      |                        | <original_claim_loss_type> | <Operator_Name_On_END> <Operator_Last_Name_On_END> | At Fault     | Collision with other object |               | test        | Yes          | No          | <totalAmountPaid> | <indemnityPaid> | <expensePaid> |
#      |                        | <original_claim_loss_type> | <Operator_Name_On_END> <Operator_Last_Name_On_END> | At Fault     | Collision with other object |               | test        | Yes          | No          | <totalAmountPaid> | <indemnityPaid> | <expensePaid> |
#      |                        | <original_claim_loss_type> | <Operator_Name_On_END> <Operator_Last_Name_On_END> | At Fault     | Collision with other object |               | test        | Yes          | No          | <totalAmountPaid> | <indemnityPaid> | <expensePaid> |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    And  I click "obtain operators and vehicles" button on UI
    Then I think for 10 to 15 seconds
    Then I navigate to Operators and Vehicles Page
    Then I think for 1 to 2 seconds
    And  I write text to "Driver Status" and value is "Active"
    Then I write text to "VIN" and value is "JHMFL5G4XPX001471"
    Then I think for 1 to 2 seconds
    And  I mark 0 operator to be included and include them

    Then I navigate to "<Operator_Name_On_END> <Operator_Last_Name_On_END>" page through the Tree
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver                                        | Source | ratedAccident            | accidentConvictionDate |
      | <Operator_Name_On_END> <Operator_Last_Name_On_END> | PURE   | <copied_claim_loss_type> |                        |
#      | <Operator_Name_On_END> <Operator_Last_Name_On_END> | PURE   | <copied_claim_loss_type> |                        |
#      | <Operator_Name_On_END> <Operator_Last_Name_On_END> | PURE   | <copied_claim_loss_type> |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | original_claim_loss_type                  | copied_claim_loss_type                | State | Insurance_Line | Quote_Name    | Operator_Name_On_END | Operator_Last_Name_On_END | Operator_Prefix | Operator_Suffix | Operator_Status | totalAmountPaid | indemnityPaid | expensePaid |
      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident < $500                  | At-fault accident < $500              | NY    | Personal Auto  | Personal Auto | Test                 | Operator                  |                 |                 | Active          | 490             | 300           | 190         |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident >=$500 and <=$2,000     | At-fault accident >=$500 and <=$2,000 | NY    | Personal Auto  | Personal Auto | John                 | Smith                     |                 |                 | Active          | 590             | 400           | 190         |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident > $2000                 | At-fault accident > $2000             | NY    | Personal Auto  | Personal Auto | Freddy               | Joe                       |                 |                 | Active          | 2390            | 2200          | 190         |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident >=$500 and <=$2,000     | At-fault Accident with PD <= $1,000   | CA    | Personal Auto  | Personal Auto | Freddy               | Joe                       |                 |                 | Active          | 1000            | 500           | 500         |
      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident >=$500 and <=$2,000     | At-fault Accident with PD > $1,000    | CA    | Personal Auto  | Personal Auto | Freddy               | Joe                       |                 |                 | Active          | 1001            | 1000          | 1           |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | Comprehensive claim >= $1,000 (non-glass) | Comprehensive claim >$1000            | CA    | Personal Auto  | Personal Auto | Freddy               | Joe                       |                 |                 | Active          | 1000.01         | 1000          | 0.1         |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | Towing/ERS                                | Towing/ERS                            | CA    | Personal Auto  | Personal Auto | Freddy               | Joe                       |                 |                 | Active          | 2390            | 2200          | 190         |

  @ConstLossEX
  Scenario Outline: Verify that a new closed manual PA claim from cancelled policy is copied over to the new EX/ES quote
    As a User I want to verify that the new PA Manual Claim on a cancelled policy has been copied over to the new EX Quote for
    multiple states and loss types

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
    * I navigate to transactions or endorsements
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 1790            | 1600          | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 2290            | 2100          | 190         |

    *    I navigate to transactions or endorsements
    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |


    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to operator information page
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line   | Quote_Name       | original_claim_loss_type              | copied_claim_loss_type                |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Excess Liability | Excess Liability | At-fault accident < $500              | At-fault accident < $500              |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Excess Liability | Excess Liability | At-fault accident >=$500 and <=$2,000 | At-fault accident >=$500 and <=$2,000 |
      | NY_001 | PA  | QuoteCreatorPA | P92  | NY    | Excess Liability | Excess Liability | At-fault accident > $2000             | At-fault accident > $2000             |

  @LossSummaryNB @FullRegression_IntegrationWizards
  Scenario Outline: Verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW NB trx Internal user CA/WA states
    As a User I want to verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW LOB CA/WA states
    on Vessel tree node on New Business transaction

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I click the next page button
    Then I verify block "account loss summary" exists
    And  I verify that element "Select the loss date time period:" within block "account loss date controls" is "Displayed"
    And  I verify that input field for element "Select the loss date time period:" has a default value of "Everything"

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  Scenario Outline:Verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW END trx Internal user CA/WA states
    As a User I want to verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW LOB CA/WA states
    on Vessel tree node on Endorsement transactions

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
    * I set "Endorsement_Type_END" to "<END_Type>"


    And  I navigate to transactions or endorsements
    Then I initiate new endorsement
    Then I navigate to policy image page
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I click the next page button
    Then I verify block "account loss summary" exists
    And  I verify that element "Select the loss date time period:" within block "account loss date controls" is "Displayed"
    And  I verify that input field for element "Select the loss date time period:" has a default value of "Everything"

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     | END_Type                                                |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Add/Change/Delete Operator(s)                           |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Add/Change/Delete Operator(s)                           |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Add/Change/Delete Vessel                                |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Add/Change/Delete Vessel                                |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Add/Remove Companion Credits                            |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Add/Remove Companion Credits                            |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Add/Remove Manuscript Endorsement                       |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Add/Remove Manuscript Endorsement                       |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Change/Add/Delete Loss Payee/Add'l Interest Information |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Change/Add/Delete Loss Payee/Add'l Interest Information |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Change Vessel Assignment                                |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Change Vessel Assignment                                |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Update Coverages/Deductibles                            |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Update Coverages/Deductibles                            |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Update Optional Coverage                                |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Update Optional Coverage                                |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Update Operator Details                                 |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Update Operator Details                                 |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Update Mailing/Billing Address                          |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Update Mailing/Billing Address                          |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Update Vessel Details                                   |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Update Vessel Details                                   |
      | CA_001 | P84  | PW  | QuoteCreatorPW | Other                                                   |
      | WA_001 | P84  | PW  | QuoteCreatorPW | Other                                                   |

  Scenario Outline:Verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW REN trx Internal user CA/WA states
  As a User I want to verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW LOB CA/WA states
  on Vessel tree node on Renewal transactions

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

    And  I navigate to transactions or endorsements
    Then I click "create renewal" button on UI
    And  I click ok
    Then I select a transaction "Renewal"
    Then I navigate to policy image page
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I click the next page button
    Then I verify block "account loss summary" exists
    And  I verify that element "Select the loss date time period:" within block "account loss date controls" is "Displayed"
    And  I verify that input field for element "Select the loss date time period:" has a default value of "Everything"

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  Scenario Outline:Verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW REN trx Internal user CA/WA states
    As a User I want to verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW LOB CA/WA states
    on Vessel tree node on Renewal transactions

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

    And  I navigate to transactions or endorsements
    Then I click auto create renewal
    Then I select a transaction "Renewal"
    Then I navigate to policy image page
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I click the next page button
    Then I verify block "account loss summary" exists
    And  I verify that element "Select the loss date time period:" within block "account loss date controls" is "Displayed"
    And  I verify that input field for element "Select the loss date time period:" has a default value of "Everything"

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  Scenario Outline:Verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW REN trx Internal user CA/WA states
  As a User I want to verify visibility of the "account loss summary" block and filtering option "Select loss date time period" for PW LOB CA/WA states
  on Vessel tree node on Renewal transactions

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

    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    Then I select a transaction "Cancellation"
    Then I verify that the "account loss summary" element is "Not Displayed" on the UI
    And  I verify that element "Select the loss date time period:" within block "account loss date controls" is "Not Displayed"

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  @FullRegression_IntegrationWizards
  Scenario Outline:Verify visibility of the "Operators obtained from member quotes & policies"  for EX Auto REN trx Internal user
  As a User I want to verify visibility of the "Operators obtained from member quotes & policies" block
  on Operator Information tree node on Renewal transaction

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

    And  I navigate to transactions or endorsements
    Then I click auto create renewal
    Then I select a transaction "Renewal"
    Then I navigate to policy image page
    And  I navigate to Excess Policy Page
    Then I navigate to operator information page
    Then I verify block "Operators obtained from active household quotes and policies" exists with special tag

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | NY_001 | P84  | EX  | QuoteCreatorEX |


  Scenario Outline:Verify that the new section labeled Account Loss Summary has the following columns:LOB, Claims Status, Claims number, Policy number, Policy province, Source, Loss type, Loss date, Amount Paid
    As a User I want to verify Verify that the new section labeled Account Loss Summary has the following columns:LOB, Claims Status, Claims number, Policy number, Policy province, Source, Loss type, Loss date, Amount Paid
    for CA/WA states on Vessel tree node on Renewal transactions

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

    And  I navigate to transactions or endorsements
    Then I click "create renewal" button on UI
    And  I click ok
    Then I select a transaction "Renewal"
    Then I navigate to policy image page
    And  I navigate to Watercraft Policy Page
    Then I click the next page button
    Then I click the next page button
    Then I verify that the "Line of Business" element is "Displayed" on the UI
    Then I verify that the "Claim Status" element is "Displayed" on the UI
    Then I verify that the "Claim Number" element is "Displayed" on the UI
    Then I verify that the "Policy Number" element is "Displayed" on the UI
    Then I verify that the "Policy State" element is "Displayed" on the UI
    Then I verify that the "Source" element is "Displayed" on the UI
    Then I verify that the "Loss Type" element is "Displayed" on the UI
    Then I verify that the "Loss Date" element is "Displayed" on the UI
    Then I verify that the "Total Amount Paid" element is "Displayed" on the UI

    Examples:
      | TC_ID  | user | LOB | SHEET_NAME     |
      | CA_001 | P84  | PW  | QuoteCreatorPW |
      | WA_001 | P84  | PW  | QuoteCreatorPW |

  @DuplicateClaimsPWNB @FullRegression_IntegrationWizards @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on NB trx for PW and that Internal User can override it
    As a User I want to verify that when there are claims with the same date of loss under "Watercraft Loss History" block a referral is triggered with the
    wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
    duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability >$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_1" to "1000"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI
    Then I accept underwriting referrals
    And  I bind a quote

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWNB @FullRegression_IntegrationWizards @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on NB trx for PW
    As a User I want to verify that when there are claims with the same date of loss under "Auto Incidents" block a referral is triggered with the
    wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
    duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set "Operator_Prior_Incidents" to "Yes"
    *     I set "auto_incident_num" to "2"

    *     I set "auto_incident_source_0" to "PURE"
    *     I set "auto_incident_accident_type_0" to "At-fault accident"
    *     I set "auto_incident_loss_date_0" to "05/05/2025"

    *     I set "auto_incident_source_1" to "PURE"
    *     I set "auto_incident_accident_type_1" to "At-fault acc <$1000, no injuries"
    *     I set "auto_incident_loss_date_1" to "05/05/2025"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWNB @FullRegression_IntegrationWizards @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on NB trx for PW
    As a User I want to verify that when there are claims with the same date of loss under "watercraft loss history for prior vessels not listed on the quote (policy)"
    block a referral is triggered with the wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all
    operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of
    loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set "Watercraft_Prior_Losses_For_Not_Listed_Vessels" to "Yes"
    *     I set "watercraft_prior_vessel_incident_num" to "2"

    *     I set "watercraft_prior_vessel_incident_source_0" to "PURE"
    *     I set "watercraft_prior_vessel_incident_loss_type_0" to "Wind Loss"
    *     I set "watercraft_prior_vessel_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_prior_vessel_incident_amount_0" to "2500"

    *     I set "watercraft_prior_vessel_incident_source_1" to "PURE"
    *     I set "watercraft_prior_vessel_incident_loss_type_1" to "Other"
    *     I set "watercraft_prior_vessel_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_prior_vessel_incident_amount_1" to "5000"
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWEND @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on END trx for PW
  As a User I want to verify that when there are claims with the same date of loss under "Watercraft Loss History" block a referral is triggered with the
  wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
  duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"

    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability >$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_1" to "1000"
    Then  I navigate to quotes page

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I rate an endorsement
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWEND @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on END trx for PW
    As a User I want to verify that when there are claims with the same date of loss under "Auto Incidents" block a referral is triggered with the
    wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
    duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set Effective Date of Endorsement to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    *     I set "Operator_Prior_Incidents" to "Yes"
    *     I set "auto_incident_num" to "2"

    *     I set "auto_incident_source_0" to "PURE"
    *     I set "auto_incident_accident_type_0" to "At-fault accident"
    *     I set "auto_incident_loss_date_0" to "05/05/2025"

    *     I set "auto_incident_source_1" to "PURE"
    *     I set "auto_incident_accident_type_1" to "At-fault acc <$1000, no injuries"
    *     I set "auto_incident_loss_date_1" to "05/05/2025"

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I rate an endorsement
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWEND @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on END trx for PW
  As a User I want to verify that when there are claims with the same date of loss under "watercraft loss history for prior vessels not listed on the quote (policy)"
  block a referral is triggered with the wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all
  operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of
  loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set Effective Date of Endorsement to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    *    I set "Watercraft_Prior_Losses_For_Not_Listed_Vessels" to "Yes"
    *    I set "watercraft_prior_vessel_incident_num" to "2"

    *    I set "watercraft_prior_vessel_incident_source_0" to "PURE"
    *    I set "watercraft_prior_vessel_incident_loss_type_0" to "Wind Loss"
    *    I set "watercraft_prior_vessel_incident_loss_date_0" to "05/05/2025"
    *    I set "watercraft_prior_vessel_incident_amount_0" to "2500"

    *    I set "watercraft_prior_vessel_incident_source_1" to "PURE"
    *    I set "watercraft_prior_vessel_incident_loss_type_1" to "Other"
    *    I set "watercraft_prior_vessel_incident_loss_date_1" to "05/05/2025"
    *    I set "watercraft_prior_vessel_incident_amount_1" to "5000"

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I rate an endorsement
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |


  @DuplicateClaimsPWREN @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss REN trx for PW and that the referral type is Hard-Stop
   As a User I want to verify that when there are claims with the same date of loss under "Watercraft Loss History" block a referral is triggered with the
   wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
   duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

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

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"

    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability >$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_1" to "1000"

    Then I navigate to transactions or endorsements
    And  I create a renewal
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I check renewed premium
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI
    And  I verify that referral "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is a "Hard-Stop" type of referral

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWREN @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on REN trx for PW
  As a User I want to verify that when there are claims with the same date of loss under "Auto Incidents" block a referral is triggered with the
  wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any
  duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set Effective Date of Endorsement to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    *     I set "Operator_Prior_Incidents" to "Yes"
    *     I set "auto_incident_num" to "2"

    *     I set "auto_incident_source_0" to "PURE"
    *     I set "auto_incident_accident_type_0" to "At-fault accident"
    *     I set "auto_incident_loss_date_0" to "05/05/2025"

    *     I set "auto_incident_source_1" to "PURE"
    *     I set "auto_incident_accident_type_1" to "At-fault acc <$1000, no injuries"
    *     I set "auto_incident_loss_date_1" to "05/05/2025"

    Then I navigate to transactions or endorsements
    And  I create a renewal
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I check renewed premium
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWREN @20thJunePostProd
  Scenario Outline: Verify that a referral is triggered for claims with same date of loss on REN trx for PW
    As a User I want to verify that when there are claims with the same date of loss under "watercraft loss history for prior vessels not listed on the quote (policy)"
    block a referral is triggered with the wording "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all
    operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of
    loss history"

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today
    *     I set Effective Date of Endorsement to Today
    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    *    I set "Watercraft_Prior_Losses_For_Not_Listed_Vessels" to "Yes"
    *    I set "watercraft_prior_vessel_incident_num" to "2"

    *    I set "watercraft_prior_vessel_incident_source_0" to "PURE"
    *    I set "watercraft_prior_vessel_incident_loss_type_0" to "Wind Loss"
    *    I set "watercraft_prior_vessel_incident_loss_date_0" to "05/05/2025"
    *    I set "watercraft_prior_vessel_incident_amount_0" to "2500"

    *    I set "watercraft_prior_vessel_incident_source_1" to "PURE"
    *    I set "watercraft_prior_vessel_incident_loss_type_1" to "Other"
    *    I set "watercraft_prior_vessel_incident_loss_date_1" to "05/05/2025"
    *    I set "watercraft_prior_vessel_incident_amount_1" to "5000"

    Then I navigate to transactions or endorsements
    And  I create a renewal
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page

    Then I review changes
    Then I check renewed premium
    And  I review referrals
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @20thJunePostProd @DuplicateClaimsPW
  Scenario Outline: Verify that a triggered referral for claims with same date of loss after removing the duplicate claim on NB trx for PW is no longer visible
    As a User I want to verify that the referral is no longer visible when the duplicate claim is removed

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_1" to "500"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Then I navigate to quotes detail page
    And  I navigate to Previous Claims-MVR Activity Page
    Then I click "delete" button on UI

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPW | PW  | P85  |

  @20thJunePostProd @DuplicateClaimsPW
  Scenario Outline: Verify that the referral is not triggered when there are claims present under different blocks with same DOL
    As a User I expect to see the referral not trigger there are claims with the same DOL under different incident blocks on Previous Claims/MVR activity page

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "1"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "Watercraft_Prior_Losses_For_Not_Listed_Vessels" to "Yes"
    *     I set "watercraft_prior_vessel_incident_num_0" to "1"
    *     I set "watercraft_prior_vessel_incident_source_0" to "PURE"
    *     I set "watercraft_prior_vessel_incident_loss_type_0" to "Liability >$10,000"
    *     I set "watercraft_prior_vessel_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_prior_vessel_incident_amount_0" to "1000"

    *     I set "Operator_Prior_Incidents" to "Yes"
    *     I set "auto_incident_num" to "1"
    *     I set "auto_incident_source_0" to "PURE"
    *     I set "auto_incident_accident_type_0" to "At-fault accident"
    *     I set "auto_incident_loss_date_0" to "05/05/2025"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Not Displayed" on the UI


    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPW | PW  | P85  |

  @20thJunePostProd @DuplicateClaimsPW
  Scenario Outline: Verify that the referral is triggered when a claim is pulled on REN trx and has the same date of loss as an existing claim
    As a User I would like to see the trigger of the duplicate referral when a claim is pulled in under REN trx and has the same DOL as an already existing
    claim on REN

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "1"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    * I navigate to transactions or endorsements
    Then I navigate to Pure Claims tab
    Then I Fill Out Multiple Manual Claims For "PW" and Save Them
      | lossDate | lossType           | RelatedVessel | atFaultOrNot | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |          | Liability <$10,000 |               | No           | TestClaim   | Yes          | Yes         | 2300            | 300           | 2000        |

    Then I navigate to transactions or endorsements
    And  I create a renewal
    Then I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I click save changes button

    Then I review changes
    Then I check renewed premium
    And  I review referrals

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AK_001 | QuoteCreatorPW | PW  | P85  |

  @20thJunePostProd @DuplicateClaimsPW
  Scenario Outline: Verify that the referral is not triggered when there are claims present under same blocks with different DOL
    As a User I expect to see the referral not trigger there are claims with the same DOL under different incident blocks on Previous Claims/MVR activity page

    Given I use "<TC_ID>" regression test data from "<SHEET_NAME>" sheet
    When  I am logged in to Pure as "<user>"
    *     I set Effective Date to Today

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/06/2025"
    *     I set "watercraft_incident_loss_amount_1" to "500"

    Then  I navigate to quotes page
    And   I initiate a new quote
    Then  I create a new "<LOB>" quote

    * I rate a quote
    * I navigate to underwriting referrals page
    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Not Displayed" on the UI


    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | GA_001 | QuoteCreatorPW | PW  | P85  |

  @DuplicateClaimsPWNB @DuplicateClaimsOperatorInclusion
  Scenario Outline: Verify that referral is triggered when operator is included that has a claim tied to them with same DOL as existing claims
    As a User I expect to see a claim under Incidents block for included operator tree page when an operator with a closed claim tied to them
    is included through Obtained operators block on PA Quote

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

    * I set "Additional_Vehicles_END" to ","
    * I set "Additional_Operators_END" to "Operator_003_ADD,"
    * I merge data for "QuoteCreationPA", where "Additional_Operators_END" key and "PA_AdditionalOperators_END" sheet
    * I set "Additional_Operators_Additional_Driver_First_Name_END_1" to "<Operator_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Last_Name_END_1" to "<Operator_Last_Name_On_END>"
    * I set "Additional_Operators_Additional_Driver_Prefix_END_1" to "<Operator_Prefix>"
    * I set "Additional_Operators_Additional_Driver_Suffix_END_1" to "<Operator_Suffix>"
    * I set "Additional_Operators_Additional_Driver_Driver_Status_END_1" to "Active"


    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    * I set Effective Date of Endorsement to Today

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to Operators and Vehicles Page
    Then I click add additional operator
    Then I fill out PA endorsement additional operators block
    *    I set driver resided at policy location for more than 6 months to "Yes" for driver 1
    *    I click the next page button
    *    I click the next page button
    And  I fill out PA endorsement additional driver 1 details block
    *    I write text to "Occupation" and value is "Driver"
    Then I click save changes button

    Then I review changes
    And  I rate an endorsement
    Then I review referrals
    Then I accept underwriting referrals
    And  I issue an endorsement
    And  I navigate to transactions or endorsements

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver                                        | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> | <Operator_Name_On_END> <Operator_Last_Name_On_END> | At Fault     | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I clear data
    And  I use "<TC_ID>" regression test data from "QuoteCreatorPW" sheet
    And  I refresh DragonSteps data
    Then I set "Admitted_Line" to "Personal Watercraft"
    Then I think for 30 to 45 seconds

    *     I set "Operator_Prior_Incidents" to "Yes"
    *     I set "auto_incident_num" to "1"
    *     I set "auto_incident_source_0" to "PURE"
    *     I set "auto_incident_accident_type_0" to "At-fault accident"
    *     I set "auto_incident_loss_date_0" to "Today"

    Then I navigate to quotes detail page
    And  I create a new "PW" quote

    Then I navigate to Watercraft Policy Page
    And  I mark 0 operator to be included and include them
    And  I set operator 1 relationship to insured on Watercraft to "Friend"
    Then I click save changes button
    And  I rate a quote
    Then I navigate to underwriting referrals page

    And  I verify if element with message "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If multiple incidents with the same date of loss is correct, please document acceptability of loss history" is "Displayed" on the UI

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | original_claim_loss_type | State | Insurance_Line      | Quote_Name          | Operator_Name_On_END | Operator_Last_Name_On_END | Operator_Prefix | Operator_Suffix | Operator_Status |
      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident < $500 | NY    | Personal Watercraft | Personal Watercraft | Test                 | Operator                  |                 |                 | Active          |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident >=$500 and <=$2,000  | NY    | Personal Watercraft | Personal Auto | John                 | Smith                     |                 |                 | Active          |
#      | NY_001 | PA  | QuoteCreatorPA | P93  | At-fault accident > $2000              | NY    | Personal Watercraft | Personal Auto | Freddy               | Joe                       |                 |                 | Active          |

  @BrokerDuplicateClaims
  Scenario: Verify that wording of referral for external user is as follows: "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If all claim information is correct, please refer to Underwriting for further review."
    As a User I want to verify that the duplicate claims referral has the following wording: "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If all claim information is correct, please refer to Underwriting for further review."

    Given I am logged in to Pure as Broker
    And   I navigate to customers page
    Then  I select customer by ID "751067277979"
    Then  I select a Policy by ID "PW246368600" on customer summary page

    Then I navigate to transactions or endorsements
    Then I click "AUTO CREATE RNWL" button on UI
    Then I click ok
    And  I think for 2 to 5 seconds

    Then I select a transaction "Renewal"
    And  I navigate to policy image page
    Then I navigate to Previous Claims-MVR Activity Page
    And  I fill out PW quote previous claims mvr activity page
    *    I set "Operator_Prior_Incidents" to "No"
    *    I set "Watercraft_Prior_Losses_For_Not_Listed_Vessels" to "No"

    *     I set "Prior_Watercraft_Losses" to "Yes"
    *     I set "watercraft_incident_num" to "2"
    *     I set "watercraft_incident_source_0" to "PURE"
    *     I set "watercraft_incident_loss_type_0" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_0" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_0" to "500"

    *     I set "watercraft_incident_source_1" to "PURE"
    *     I set "watercraft_incident_loss_type_1" to "Liability <$10,000"
    *     I set "watercraft_incident_loss_date_1" to "05/05/2025"
    *     I set "watercraft_incident_loss_amount_1" to "500"

    Then  I review changes
    And   I check renewed premium
    Then  I review referrals
    And   I verify that the "This quote or policy contains multiple claims with the same date of loss. Please review incidents for all operators and vessels, and reconcile any duplicate claims. If all claim information is correct, please refer to Underwriting for further review." element is "Displayed" on the UI

    Then  I navigate to policy bread crumb
    And   I delete first transaction after New Business

  @PAManualClaimsAdvisoryMessage @FullRegression_IntegrationWizards @18thJulyRelease
  Scenario Outline: Verify that an advisory message is triggered on the UI when "At-fault Accident <= $2,000" loss cause is selected for a manually added claim and that user is able to proceed
  As a User I want to verify that when "At-fault Accident <= $2,000" loss cause is selected for a manually added claim an advisory message is triggered with
  the following wording: "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for
  further clarification." and that user is still able to navigate off page after selecting the option

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

    Then I navigate to transactions or endorsements
    And  I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident       | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <ratedAccidentType> |             | Not          | Collision with other object |               | test        | Yes          | No          | 2000            | 1500          | 500         |

    Then I verify if element with message "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for further clarification." is "Displayed" on the UI
    Then I navigate to transactions or endorsements

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user | ratedAccidentType           |
      | NY_001 | QuoteCreatorPA | PA  | P85  | At-fault Accident <= $2,000 |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | At-fault Accident           |

  @PAManualClaimsAdvisoryMessage @18thJulyRelease
  Scenario Outline: Verify that an advisory message is not triggered on the UI when other in use loss causes are selected for a manually added claim
  As a User I want to verify that when "At-fault Accident <= $2,000" loss cause is selected for a manually added claim an advisory message is not triggered with
  the following wording: "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for
  further clarification."

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

    Then I navigate to transactions or endorsements
    And  I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident       | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <ratedAccidentType> |             | Not          | Collision with other object |               | test        | Yes          | No          | 2000            | 1500          | 500         |

    Then I verify if element with message "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for further clarification." is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user | ratedAccidentType                                   |
      | NY_001 | QuoteCreatorPA | PA  | P85  | At-fault accident < $500                            |
      | NY_001 | QuoteCreatorPA | PA  | P85  | At-fault accident > $2,000                          |
      | NY_001 | QuoteCreatorPA | PA  | P85  | At-fault accident >=$500 and <=$2,000               |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Comprehensive claim < $500 (non-glass)              |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Comprehensive claim >= $1,000 (non-glass)           |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Comprehensive Claim >= $500 and < $1000 (non-glass) |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Glass-only comprehensive claim                      |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Towing/ERS                                          |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Not-at-fault accident < $500                        |
      | NY_001 | QuoteCreatorPA | PA  | P85  | Not-At-Fault Accident >=$500                        |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | At- Fault Accident >$1,000                          |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | At- Fault Accident <$1,000, no injuries             |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | At-Fault Accident - Bodily Injury or Death          |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | Comprehensive claim <$1000                          |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | Comprehensive claim >$1000                          |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | Not-at-fault accident                               |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | Towing/ERS                                          |
#      | HI_001 | QuoteCreatorPA | PA  | P85  | Glass Only                                          |



  @PAManualClaimsAdvisoryMessage @18thJulyRelease
  Scenario Outline: Verify that an advisory message is not triggered on the UI when any other loss cause is selected for a manually added claim and that user is able to proceed for other States
  As a User I want to verify that when any loss cause is selected for a manually added claim an advisory message is not triggered with
  the following wording: "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for
  further clarification." and that user is still able to navigate off page after selecting the option

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

    Then I navigate to transactions or endorsements
    And  I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident       | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <ratedAccidentType> |             | Not          | Collision with other object |               | test        | Yes          | No          | 2000            | 1500          | 500         |

    Then I verify if element with message "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for further clarification." is "Not Displayed" on the UI
    Then I navigate to transactions or endorsements

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user | ratedAccidentType                    |
      | FL_001 | QuoteCreatorPA | PA  | P85  | At-fault Accident <1,000, no injuries|
      | AL_001 | QuoteCreatorPA | PA  | P85  | At-fault Accident                    |


  @PAManualClaimsAdvisoryMessage @18thJulyRelease
  Scenario Outline: Verify that an advisory message is not triggered on the UI when any other loss cause is selected for a manually added claim and that user is able to proceed for other LOBs
  As a User I want to verify that when "At-fault Accident <= $2,000" loss cause is selected for a manually added claim an advisory message is not triggered with
  the following wording: "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for
  further clarification." and that user is still able to navigate off page after selecting the option

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

    Then I navigate to transactions or endorsements
    And  I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident       | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <ratedAccidentType> |             | Not          | Collision with other object |               | test        | Yes          | No          | 2000            | 1500          | 500         |

    Then I verify if element with message "The incident type selected is no longer in use and must be updated to proceed. Please review the rate and rule manuals for further clarification." is "Not Displayed" on the UI
    Then I navigate to transactions or endorsements

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user | ratedAccidentType                      |
      | NY_001 | QuoteCreatorEX | EX  | P85  | At-fault accident > $2,000             |
      | HI_001 | QuoteCreatorEX | EX  | P85  | At- fault Accident <1,000, no injuries |
      | NY_001 | QuoteCreatorES | ES  | P85  | At-fault Accident <$500                |
      | HI_001 | QuoteCreatorES | ES  | P85  | At-fault Accident                      |


  @US56560 @MappedToSection @FullRegression_IntegrationWizards @18thJulyRelease
  Scenario Outline: Verify existence of "Display list of policies claim(s) have been copied to" section with "Yes" and "No" radio buttons under US Personal Auto LOB for all states.
    As a User I expect to see a new section "Display list of policies" with radio button options "Yes" and "No" present on Pure Claims page on
    Pure Claims page for PA LOB

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

    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" exists
    Then I verify the "Display list of policies" label with "No" and "Yes" radio buttons is "Visible" in "List of policies claim(s) have been copied to" block

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P85  |
#      | AK_001 | QuoteCreatorPA | PA  | P85  |
#      | AZ_001 | QuoteCreatorPA | PA  | P85  |
#      | AR_001 | QuoteCreatorPA | PA  | P85  |
#      | CA_001 | QuoteCreatorPA | PA  | P85  |
#      | CO_001 | QuoteCreatorPA | PA  | P85  |
#      | CT_001 | QuoteCreatorPA | PA  | P85  |
#      | DE_001 | QuoteCreatorPA | PA  | P85  |
#      | FL_001 | QuoteCreatorPA | PA  | P85  |
#      | GA_001 | QuoteCreatorPA | PA  | P85  |
#      | HI_001 | QuoteCreatorPA | PA  | P85  |
#      | ID_001 | QuoteCreatorPA | PA  | P85  |
#      | IL_001 | QuoteCreatorPA | PA  | P85  |
#      | IN_001 | QuoteCreatorPA | PA  | P85  |
#      | IA_001 | QuoteCreatorPA | PA  | P85  |
#      | KS_001 | QuoteCreatorPA | PA  | P85  |
#      | KY_001 | QuoteCreatorPA | PA  | P85  |
#      | LA_001 | QuoteCreatorPA | PA  | P85  |
#      | ME_001 | QuoteCreatorPA | PA  | P85  |
#      | MD_001 | QuoteCreatorPA | PA  | P85  |
#      | MA_001 | QuoteCreatorPA | PA  | P85  |
#      | MI_001 | QuoteCreatorPA | PA  | P85  |
#      | MN_001 | QuoteCreatorPA | PA  | P85  |
#      | MS_001 | QuoteCreatorPA | PA  | P85  |
#      | MO_001 | QuoteCreatorPA | PA  | P85  |
#      | MT_001 | QuoteCreatorPA | PA  | P85  |
#      | NE_001 | QuoteCreatorPA | PA  | P85  |
#      | NV_001 | QuoteCreatorPA | PA  | P85  |
#      | NH_001 | QuoteCreatorPA | PA  | P85  |
#      | NJ_001 | QuoteCreatorPA | PA  | P85  |
#      | NM_001 | QuoteCreatorPA | PA  | P85  |
#      | NY_001 | QuoteCreatorPA | PA  | P85  |
#      | NC_001 | QuoteCreatorPA | PA  | P85  |
#      | ND_001 | QuoteCreatorPA | PA  | P85  |
#      | OH_001 | QuoteCreatorPA | PA  | P85  |
#      | OK_001 | QuoteCreatorPA | PA  | P85  |
#      | OR_001 | QuoteCreatorPA | PA  | P85  |
#      | PA_001 | QuoteCreatorPA | PA  | P85  |
#      | RI_001 | QuoteCreatorPA | PA  | P85  |
#      | SC_001 | QuoteCreatorPA | PA  | P85  |
#      | SD_001 | QuoteCreatorPA | PA  | P85  |
#      | TN_001 | QuoteCreatorPA | PA  | P85  |
#      | TX_001 | QuoteCreatorPA | PA  | P85  |
#      | UT_001 | QuoteCreatorPA | PA  | P85  |
#      | VT_001 | QuoteCreatorPA | PA  | P85  |
#      | VA_001 | QuoteCreatorPA | PA  | P85  |
#      | WA_001 | QuoteCreatorPA | PA  | P85  |
#      | WV_001 | QuoteCreatorPA | PA  | P85  |
#      | WI_001 | QuoteCreatorPA | PA  | P85  |
#      | WY_001 | QuoteCreatorPA | PA  | P85  |


  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify existence of "Display list of policies claim(s) have been copied to" section with "Yes" and "No" radio buttons under US Excess Liability LOB for all states.
  As a User I expect to see a new section "Display list of policies" with radio button options "Yes" and "No" present on Pure Claims page on
  Pure Claims page for EX LOB

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
    * I select created policy
    * I navigate to transactions or endorsements


    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" exists
    Then I verify the "Display list of policies" label with "No" and "Yes" radio buttons is "Visible" in "List of policies claim(s) have been copied to" block

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
#      | AL_001 | QuoteCreatorEX | EX  | P85  |
#      | AK_001 | QuoteCreatorEX | EX  | P85  |
#      | AZ_001 | QuoteCreatorEX | EX  | P85  |
#      | AR_001 | QuoteCreatorEX | EX  | P85  |
#      | CA_001 | QuoteCreatorEX | EX  | P85  |
#      | CO_001 | QuoteCreatorEX | EX  | P85  |
#      | CT_001 | QuoteCreatorEX | EX  | P85  |
#      | DE_001 | QuoteCreatorEX | EX  | P85  |
#      | FL_001 | QuoteCreatorEX | EX  | P85  |
#      | GA_001 | QuoteCreatorEX | EX  | P85  |
#      | HI_001 | QuoteCreatorEX | EX  | P85  |
#      | ID_001 | QuoteCreatorEX | EX  | P85  |
#      | IL_001 | QuoteCreatorEX | EX  | P85  |
#      | IN_001 | QuoteCreatorEX | EX  | P85  |
#      | IA_001 | QuoteCreatorEX | EX  | P85  |
#      | KS_001 | QuoteCreatorEX | EX  | P85  |
#      | KY_001 | QuoteCreatorEX | EX  | P85  |
#      | LA_001 | QuoteCreatorEX | EX  | P85  |
#      | ME_001 | QuoteCreatorEX | EX  | P85  |
#      | MD_001 | QuoteCreatorEX | EX  | P85  |
#      | MA_001 | QuoteCreatorEX | EX  | P85  |
#      | MI_001 | QuoteCreatorEX | EX  | P85  |
#      | MN_001 | QuoteCreatorEX | EX  | P85  |
#      | MS_001 | QuoteCreatorEX | EX  | P85  |
#      | MO_001 | QuoteCreatorEX | EX  | P85  |
#      | MT_001 | QuoteCreatorEX | EX  | P85  |
#      | NE_001 | QuoteCreatorEX | EX  | P85  |
#      | NV_001 | QuoteCreatorEX | EX  | P85  |
#      | NH_001 | QuoteCreatorEX | EX  | P85  |
#      | NJ_001 | QuoteCreatorEX | EX  | P85  |
#      | NM_001 | QuoteCreatorEX | EX  | P85  |
      | NY_001 | QuoteCreatorEX | EX  | P85  |
#      | NC_001 | QuoteCreatorEX | EX  | P85  |
#      | ND_001 | QuoteCreatorEX | EX  | P85  |
#      | OH_001 | QuoteCreatorEX | EX  | P85  |
#      | OK_001 | QuoteCreatorEX | EX  | P85  |
#      | OR_001 | QuoteCreatorEX | EX  | P85  |
#      | PA_001 | QuoteCreatorEX | EX  | P85  |
#      | RI_001 | QuoteCreatorEX | EX  | P85  |
#      | SC_001 | QuoteCreatorEX | EX  | P85  |
#      | SD_001 | QuoteCreatorEX | EX  | P85  |
#      | TN_001 | QuoteCreatorEX | EX  | P85  |
#      | TX_001 | QuoteCreatorEX | EX  | P85  |
#      | UT_001 | QuoteCreatorEX | EX  | P85  |
#      | VT_001 | QuoteCreatorEX | EX  | P85  |
#      | VA_001 | QuoteCreatorEX | EX  | P85  |
#      | WA_001 | QuoteCreatorEX | EX  | P85  |
#      | WV_001 | QuoteCreatorEX | EX  | P85  |
#      | WI_001 | QuoteCreatorEX | EX  | P85  |
#      | WY_001 | QuoteCreatorEX | EX  | P85  |


  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify existence of "Display list of policies claim(s) have been copied to" section with "Yes" and "No" radio buttons under US Excess Liability Surplus LOB for all states.
    As a User I expect to see a new section "Display list of policies" with radio button options "Yes" and "No" present on Pure Claims page on
    Pure Claims page for ES LOB

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
    * I select created policy
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" exists
    Then I verify the "Display list of policies" label with "No" and "Yes" radio buttons is "Visible" in "List of policies claim(s) have been copied to" block

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | FL_001 | QuoteCreatorES | ES  | P85  |
#      | CA_001 | QuoteCreatorES | ES  | P85  |
#      | NY_001 | QuoteCreatorES | ES  | P85  |
#      | CT_001 | QuoteCreatorES | ES  | P85  |
#      | MA_001 | QuoteCreatorES | ES  | P85  |
#      | TX_001 | QuoteCreatorES | ES  | P85  |
#      | AL_001 | QuoteCreatorES | ES  | P85  |
#      | GA_001 | QuoteCreatorES | ES  | P85  |
#      | LA_001 | QuoteCreatorES | ES  | P85  |
#      | MS_001 | QuoteCreatorES | ES  | P85  |
#      | NC_001 | QuoteCreatorES | ES  | P85  |
#      | NJ_001 | QuoteCreatorES | ES  | P85  |


  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify existence of "Display list of policies claim(s) have been copied to" section with "Yes" and "No" radio buttons under US Personal Watercraft LOB for all states.
    As a User I expect to see a new section "Display list of policies" with radio button options "Yes" and "No" present on Pure Claims page on
    Pure Claims page for PW LOB

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
    * I select created policy

    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" exists
    Then I verify the "Display list of policies" label with "No" and "Yes" radio buttons is "Visible" in "List of policies claim(s) have been copied to" block

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
#      | AL_001 | QuoteCreatorPW | PW  | P85  |
#      | AK_001 | QuoteCreatorPW | PW  | P85  |
#      | AZ_001 | QuoteCreatorPW | PW  | P85  |
#      | AR_001 | QuoteCreatorPW | PW  | P85  |
#      | CA_001 | QuoteCreatorPW | PW  | P85  |
#      | CO_001 | QuoteCreatorPW | PW  | P85  |
#      | CT_001 | QuoteCreatorPW | PW  | P85  |
#      | DE_001 | QuoteCreatorPW | PW  | P85  |
#      | FL_001 | QuoteCreatorPW | PW  | P85  |
      | GA_001 | QuoteCreatorPW | PW  | P85  |
#      | HI_001 | QuoteCreatorPW | PW  | P85  |
#      | ID_001 | QuoteCreatorPW | PW  | P85  |
#      | IL_001 | QuoteCreatorPW | PW  | P85  |
#      | IN_001 | QuoteCreatorPW | PW  | P85  |
#      | IA_001 | QuoteCreatorPW | PW  | P85  |
#      | KS_001 | QuoteCreatorPW | PW  | P85  |
#      | KY_001 | QuoteCreatorPW | PW  | P85  |
#      | LA_001 | QuoteCreatorPW | PW  | P85  |
#      | ME_001 | QuoteCreatorPW | PW  | P85  |
#      | MD_001 | QuoteCreatorPW | PW  | P85  |
#      | MA_001 | QuoteCreatorPW | PW  | P85  |
#      | MI_001 | QuoteCreatorPW | PW  | P85  |
#      | MN_001 | QuoteCreatorPW | PW  | P85  |
#      | MS_001 | QuoteCreatorPW | PW  | P85  |
#      | MO_001 | QuoteCreatorPW | PW  | P85  |
#      | MT_001 | QuoteCreatorPW | PW  | P85  |
#      | NE_001 | QuoteCreatorPW | PW  | P85  |
#      | NV_001 | QuoteCreatorPW | PW  | P85  |
#      | NH_001 | QuoteCreatorPW | PW  | P85  |
#      | NJ_001 | QuoteCreatorPW | PW  | P85  |
#      | NM_001 | QuoteCreatorPW | PW  | P85  |
#      | NY_001 | QuoteCreatorPW | PW  | P85  |
#      | NC_001 | QuoteCreatorPW | PW  | P85  |
#      | ND_001 | QuoteCreatorPW | PW  | P85  |
#      | OH_001 | QuoteCreatorPW | PW  | P85  |
#      | OK_001 | QuoteCreatorPW | PW  | P85  |
#      | OR_001 | QuoteCreatorPW | PW  | P85  |
#      | PA_001 | QuoteCreatorPW | PW  | P85  |
#      | RI_001 | QuoteCreatorPW | PW  | P85  |
#      | SC_001 | QuoteCreatorPW | PW  | P85  |
#      | SD_001 | QuoteCreatorPW | PW  | P85  |
#      | TN_001 | QuoteCreatorPW | PW  | P85  |
#      | TX_001 | QuoteCreatorPW | PW  | P85  |
#      | UT_001 | QuoteCreatorPW | PW  | P85  |
#      | VT_001 | QuoteCreatorPW | PW  | P85  |
#      | VA_001 | QuoteCreatorPW | PW  | P85  |
#      | WA_001 | QuoteCreatorPW | PW  | P85  |
#      | WV_001 | QuoteCreatorPW | PW  | P85  |
#      | WI_001 | QuoteCreatorPW | PW  | P85  |
#      | WY_001 | QuoteCreatorPW | PW  | P85  |

  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify that "Display list of policies" option does not exist on other LOBs.
    As a User I expect to not see the new section "Display list of policies" with radio button options "Yes" and "No" present on Pure Claims page on
    Pure Claims page for HO/HS/CO/CC

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
    * I select created policy
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" is "Not Visible" on page
    Then I verify the "Display list of policies" label with "No" and "Yes" radio buttons is "Not Visible" in "List of policies claim(s) have been copied to" block

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorHO | HO  | P85  |
      | AK_001 | QuoteCreatorCO | CO  | P85  |
      | NY_001 | QuoteCreatorHS | HS  | P85  |
      | FL_001 | QuoteCreatorCC | CC  | P85  |

  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify that no default value is selected for "Display list of policies" option checkbox.
    As a User I expect that no radio button be checked for Display list of policies label on Pure Claims UI for all LOBs where applicable

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
    * I select created policy
    * I navigate to transactions or endorsements


    Then I navigate to Pure Claims tab
    And  I verify block "List of policies claim(s) have been copied to" exists
    Then I verify that radio button "No" for label "Display list of policies" within block "List of policies claim(s) have been copied to" is "Not checked"
    Then I verify that radio button "Yes" for label "Display list of policies" within block "List of policies claim(s) have been copied to" is "Not checked"

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P85  |
      | GA_001 | QuoteCreatorEX | EX  | P85  |
      | NY_001 | QuoteCreatorES | ES  | P85  |
      | FL_001 | QuoteCreatorPW | PW  | P85  |

  @US56560 @MappedToSection @18thJulyRelease
  Scenario Outline: Verify that datamart block with new columns "Claim Number, Loss Date, Loss Type, Policy Number, Policy Effective Date, Policy Status." is visible when option yes is selected under new section
    As a User I expect to see a datamart block with new columns Claim Number, Loss Date, Loss Type, Policy Number, Policy Effective Date, Policy Status
    when option Yes is selected on under new section.

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
    * I select created policy
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click "Yes" radio button for label "Display list of policies"

    Then I verify that the "Claim Number" element is "Displayed" on the UI
    Then I verify that the "Loss Date" element is "Displayed" on the UI
    Then I verify that the "Loss Type" element is "Displayed" on the UI
    Then I verify that the "Policy Number" element is "Displayed" on the UI
    Then I verify that the "Policy Effective Date" element is "Displayed" on the UI
    Then I verify that the "Policy Status" element is "Displayed" on the UI

    Examples:
        | TC_ID  | SHEET_NAME     | LOB | user |
        | AL_001 | QuoteCreatorPA | PA  | P88  |
        | GA_001 | QuoteCreatorEX | EX  | P88  |
        | NY_001 | QuoteCreatorES | ES  | P88  |
        | FL_001 | QuoteCreatorPW | PW  | P88  |

  @US56560 @MappedToSection
  Scenario Outline: Verify that datamart with new columns "Claim Number, Loss Date, Loss Type, Policy Number, Policy Effective Date, Policy Status." is not visible when option no is selected under new section
    As a User I expect to not see a datamart with new columns Claim Number, Loss Date, Loss Type, Policy Number, Policy Effective Date, Policy Status
    when option No is selected on under new section.

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
    * I select created policy
    * I navigate to transactions or endorsements

    Then I navigate to Pure Claims tab
    Then I click "No" radio button for label "Display list of policies"

    Then I verify that the "Claim Number" element is "Not Displayed" on the UI
    Then I verify that the "Loss Date" element is "Not Displayed" on the UI
    Then I verify that the "Loss Type" element is "Not Displayed" on the UI
    Then I verify that the "Policy Number" element is "Not Displayed" on the UI
    Then I verify that the "Policy Effective Date" element is "Not Displayed" on the UI
    Then I verify that the "Policy Status" element is "Not Displayed" on the UI

    Examples:
      | TC_ID  | SHEET_NAME     | LOB | user |
      | AL_001 | QuoteCreatorPA | PA  | P88  |
      | GA_001 | QuoteCreatorEX | EX  | P88  |
      | NY_001 | QuoteCreatorES | ES  | P88  |
      | FL_001 | QuoteCreatorPW | PW  | P88  |


  @ConstLossEStoES @US47183
  Scenario Outline: Verify that a new closed manual ES claim from policy is copied over to the new ES quote
    As a User I want to verify that the new ES Manual Claim on policy has been copied over to the new ES Quote for
    multiple states and loss types

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
    * I navigate to transactions or endorsements
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 1790            | 1600          | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 2290            | 2100          | 190         |


    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Excess Policy Page
    Then I navigate to operator information page
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line       | Quote_Name       | original_claim_loss_type         | copied_claim_loss_type           |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault acc <$1000, no injuries | At-fault acc <$1000, no injuries |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                |

  @ConstLossEStoES @US47183
  Scenario Outline: Verify that a new closed manual ES claim from cancelled policy is copied over to the new ES quote
    As a User I want to verify that the new ES Manual Claim on a cancelled policy has been copied over to the new ES Quote for
    multiple states and loss types

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
    * I navigate to transactions or endorsements
    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 1790            | 1600          | 190         |
      |                        | <original_claim_loss_type> |             | At Fault     | Collision with other object |               | test        | Yes          | No          | 2290            | 2100          | 190         |

    *    I navigate to transactions or endorsements
    And  I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |


    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page

    Then I navigate to Excess Policy Page
    Then I navigate to operator information page
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver | Source | ratedAccident              | accidentConvictionDate |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |
      |             | PURE   | <copied_claim_loss_type>   |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line       | Quote_Name       | original_claim_loss_type         | copied_claim_loss_type           |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault acc <$1000, no injuries | At-fault acc <$1000, no injuries |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                |

  @ConstLossEStoES @US47183 @ConstLossES1
  Scenario Outline: Verify Claims mapping will follow operator addition process
    As a User I expect to see a claim mapped on the new ES quote when including an operator that has a closed claim tied to them.

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

    * I set "Quote_Line_And_Name_Block_Insurance_Line" to "<Insurance_Line>"
    * I set "Quote_Line_And_Name_Block_State" to "<State>"
    * I set "Quote_Line_And_Name_Block_Name" to "<Quote_Name>"
    * I set Effective Date of Endorsement to Today

    Then I navigate to customer summary page
    And  I click new quote button on customer summary page
    And  I create a new quote on new quote information page
    Then I think for 5 to 10 seconds

    Then I navigate to customer summary page
    Then I select created policy

    Then I navigate to transactions or endorsements
    And  I initiate new endorsement
    Then I navigate to Excess Policy Page
    Then I navigate to operator information page
    Then I click add additional operator
    * I set additional operator 1 additional driver first name to "<Operator_Name_On_END>"
    * I set additional operator 1 additional driver last name to "<Operator_Last_Name_On_END>"
    * I set additional operator 1 additional driver DOB to "04/04/1995"
    * I set additional operator 1 additional driver gender to "Male"
    * I set additional operator 1 additional driver license state to "NY"
    * I set additional operator 1 additional driver license number to "39248324"
    * I set additional operator 1 additional driver relationship to insured to "Friend"
    Then I click save changes button

    Then I review changes
    And  I rate an endorsement
    Then I review referrals
    Then I accept underwriting referrals
    And  I issue an endorsement
    And  I navigate to transactions or endorsements

    And   I navigate to Pure Claims tab
    And   I Fill Out Multiple Manual Claims For "<LOB>" and Save Them
      | accidentConvictionDate | ratedAccident              | ratedDriver                                        | atFaultOrNot | claimLossCause              | claimOperator | description | claimClosed? | subroYesNo? | totalAmountPaid | indemnityPaid | expensePaid |
      |                        | <original_claim_loss_type> | <Operator_Name_On_END> <Operator_Last_Name_On_END> | At Fault     | Collision with other object |               | test        | Yes          | No          | 490             | 300           | 190         |

    Then I navigate to customer summary page
    And  I click "Excess Surplus Lines - New York" button on UI
    Then I navigate to quotes detail page
    Then I navigate to Excess Policy Page
    Then I navigate to operator information page
    Then I mark 0 operator to be included and include them
    Then I verify copied claim information for "<LOB>" is correct
      | ratedDriver                                        | Source | ratedAccident            | accidentConvictionDate |
      | <Operator_Name_On_END> <Operator_Last_Name_On_END> | PURE   | <copied_claim_loss_type> |                        |

    Examples:
      | TC_ID  | LOB | SHEET_NAME     | user | State | Insurance_Line       | Quote_Name       | original_claim_loss_type         | copied_claim_loss_type           | Operator_Name_On_END | Operator_Last_Name_On_END |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault acc <$1000, no injuries | At-fault acc <$1000, no injuries | John                 | Smith                     |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                | Freddy               | Mercury                   |
      | NY_001 | ES  | QuoteCreatorES | P92  | NY    | Excess Surplus Lines | Excess Liability | At-fault accident                | At-fault accident                | John                 | Mcrae                     |
