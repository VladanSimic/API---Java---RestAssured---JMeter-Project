Feature: Homeowners ES Streamlined Referrals Cancellation

  @Homeowners
  Scenario Outline: Homeowners Cancellation Refer to PURE Programs - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring | AdditionalComments |
      | Cancellation      | 06/30/2024                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    When I navigate to customer summary page

    Then I verify that Home policy is Cancelled
    * I verify that Home policy refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CO_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |

  @Homeowners
  Scenario Outline: Homeowners Cancellation Not Refer to PURE Programs - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring  | AdditionalComments |
      | Cancellation      | 06/30/2024                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | No          | Other - Please explain | Test               |

    When I navigate to customer summary page

    Then I verify that Home policy is Cancelled
    * I verify that Home policy does not refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CO_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |

  @Homeowners
  Scenario Outline: Summary screen post transaction Cancellation refer to Pure - Home policy is Cancelled - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring | AdditionalComments |
      | Cancellation      | 06/30/2024                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    And I select a transaction "Cancellation"
    * I verify that refer to Pure programs - Yes is display on summary policy transaction

    Then I navigate to customer summary page
    * I verify that Home policy is Cancelled
    * I verify that Home policy refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CO_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |

  @Homeowners
  Scenario Outline:  Summary screen post transaction Cancellation not refer to Pure - Home policy is Cancelled - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring  | AdditionalComments |
      | Cancellation      | 06/30/2024                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | No          | Other - Please explain | Test1              |

    And I select a transaction "Cancellation"

    Then I verify that refer to Pure programs - No is display on summary policy transaction
    * I verify that reason for not referring is display on summary policy transaction
    * I verify that additional comments is display on summary policy transaction

    And  I navigate to customer summary page
    * I verify that Home policy is Cancelled
    * I verify that Home policy does not refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | AZ_001 |
      | CO_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | AL_001 |
      | CA_001 |
      | HI_001 |
      | LA_001 |
      | MA_001 |
      | MS_001 |
      | NC_001 |
      | NJ_001 |
      | NY_001 |
      | SC_001 |
      | FL_001 |
      | TX_001 |
      | GA_001 |

  @Homeowners
  Scenario Outline: Cancellation Refer to PURE Programs (Validation for more than one location) - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I add additional locations
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring | AdditionalComments |
      | Cancellation      | 06/30/2024                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    And I navigate to customer summary page
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I navigate to Home Surplus Lines Policy Page
    * I verify error message is shown "Home Surplus cannot have more than 1 location."

    Examples:
      | TC_ID  |
      | TX_007 |
      | TX_008 |
      | TX_009 |
