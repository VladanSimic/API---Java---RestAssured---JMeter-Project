@TF351
Feature: Homeowners ES Streamlined Referrals Cancellation

  @Homeowners @US408256 @TC83264
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
      | Cancellation      | Tomorrow                    | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    When I navigate to customer summary page

    Then I verify that Home policy is Cancelled
    * I verify that Refer to Home Surplus quote is created

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


    @FullRegression_Lions
    Examples:
      | TC_ID  |
      | MS_001 |
      | NC_001 |
      | NJ_001 |

  @Homeowners @US40826 @TC83265
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
      | Cancellation      | Tomorrow                    | Notes | Company                 | Pro-Rate           | Underwriting Reasons | No          | Other - Please explain | Test               |

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

    @FullRegression_Lions
    Examples:
      | TC_ID  |
      | MS_001 |
      | NC_001 |
      | NJ_001 |

  @Homeowners @US40801
  Scenario Outline: Homeowners Summary screen post transaction Cancellation refer to Pure - "<TC_ID>"

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
      | Cancellation      | Tomorrow                    | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    And I select a transaction "Cancellation"

    Then I verify that refer to Pure programs - Yes is display on summary policy transaction

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

  @Homeowners @US40801 @TC82865 @TC82866 @TC82867 @TC8288 @TC8289 @TC8290
  Scenario Outline: Homeowners Summary screen post transaction Cancellation not refer to Pure - "<TC_ID>"

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
@Full_Regression_LL
    Examples:
      | TC_ID  |
      | AZ_001 |
      | CO_001 |

  @Homeowners @US49007 @TC83346
  Scenario Outline: Homeowners Cancellation Refer to PURE Programs (Validation for more than one location) - "<TC_ID>"

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
      | AZ_001 |