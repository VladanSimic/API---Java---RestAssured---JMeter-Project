Feature: Homeowners ES Streamlined Referrals End Submission Quote

  @Homeowners
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(Other - Please explain) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring  | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons | No                 | Other - Please explain | Test               | Other         | Test                  |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(Unacceptable KYC ) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons | No                 | Unacceptable KYC      |                    |               |                       |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(Unacceptable risk characteristics) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring             | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons | No                 | Unacceptable risk characteristics |                    |               |                       |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(E&F UW indicated ineligible) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring       | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons | No                 | E&S UW indicated ineligible |                    |               |                       |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(EBroker Indicated other admitted option) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring                  | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons | No                 | Broker Indicated other admitted option |                    |               |                       |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Not Refer to Home Surplus - Reason For Not Referring(No other lines submitted or eligible) -"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding                                               | ReferToHomeSurplus | ReasonForNotReferring                | AdditionalComments | GeneralReason | GeneralReasonComments |
      | Declined for UW Reasons with Consideration of Insurance Score | No                 | No other lines submitted or eligible |                    |               |                       |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote does not refer to Home Surplus quote
    * I get customer account ID

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
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Refer to Home Surplus - Same future effective date as the admitted Home quote - Validation for more than one location -  "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    And I set Effective Date 10 days in the future

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I add additional locations
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote refer to Home Surplus quote
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I verify that the quote has the same future effective date as the admitted Home quote
    * I navigate to Home Surplus Lines Policy Page
    * I verify error message is shown "Home Surplus cannot have more than 1 location."

    * I get customer account ID

    Examples:
      | TC_ID  |
      | FL_007 |
      | FL_008 |
      | FL_009 |

  @Homeowners
  Scenario Outline:End Submission E2E - Admitted Home quote is Declined - Quote Refer to Home Surplus - HS quote has the system current date as effective date - Validation for more than one location -  "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    * I set Effective Date 30 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I add additional locations
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote refer to Home Surplus quote
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I verify that the quote has the system current date as effective date
    * I navigate to Home Surplus Lines Policy Page
    * I verify error message is shown "Home Surplus cannot have more than 1 location."

    * I get customer account ID

    Examples:
      | TC_ID  |
      | NY_007 |
      | NY_008 |
      | NY_009 |
