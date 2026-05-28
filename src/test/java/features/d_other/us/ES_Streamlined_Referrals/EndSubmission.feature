@TF351
Feature: Homeowners ES Streamlined Referrals End Submission Quote

  @Homeowners @US40520 @TF351 @TC83252
  Scenario Outline: Homeowners End Submission Quote Not Refer to Home Surplus - "<TC_ID>"

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

    @FullRegression_Lions
    Examples:
      | TC_ID  |
      | HI_001 |
      | LA_001 |
      | MA_001 |

  @Homeowners @US40520 @TF351 @TC83251
  Scenario Outline: Homeowners End Submission Quote Refer to Home Surplus - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Refer to Home Surplus quote is created

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

    @FullRegression_Lions
    Examples:
      | TC_ID  |
      | WY_001 |
      | AL_001 |
      | CA_001 |

    @Homeowners @US41132 @TF351 @TC83938
  Scenario Outline:HS Quote Effective Date after End Submission (HS quota has the same future effective date as the admitted Home quota) - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    And I set Effective Date 10 days in the future

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    And I navigate to customer summary page
    And I navigate to HS quote
    And I navigate to quotes detail page

    And I verify that the quote has the same future effective date as the admitted Home quote

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

  @Homeowners @US41132 @TF351 @TC83937
  Scenario Outline:HS Quote Effective Date after End Submission (HS quota has the system current date as effective date) - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    * I set Effective Date 30 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    And I navigate to customer summary page
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I verify that the quote has the system current date as effective date
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

  @Homeowners @US40977 @TF351 @TC83343
  Scenario Outline:Homeowners End Submission Quote Refer to Home Surplus (Validation for more than one location) - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

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

    And I navigate to customer summary page
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I navigate to Home Surplus Lines Policy Page

    And I verify error message is shown "Home Surplus cannot have more than 1 location."
    * I get customer account ID

    Examples:
      | TC_ID  |
      | NC_009 |
      | NC_007 |
      | NC_008 |

