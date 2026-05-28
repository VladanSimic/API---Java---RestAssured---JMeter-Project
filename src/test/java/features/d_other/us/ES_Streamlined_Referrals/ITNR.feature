@TF351
Feature: Homeowners ES Streamlined Referrals ITNR
  @Homeowners @US40251 @TC83257 @TC82779 @US40776
  Scenario Outline: Homeowners ITNR Not Refer to PURE Programs - "<TC_ID>"

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

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring  | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Notice     | No          | Other - Please explain | Test1              | Test2                |

    When I navigate to customer summary page

    Then I verify that Home policy is Active
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
      | AZ_001 |
      | CO_001 |
      | TX_001 |

  @Homeowners @US40251 @TC83256
  Scenario Outline: Homeowners ITNR Refer to PURE Programs - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set Effective Date 350 days in the past

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

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test               | Test                 |

    When I navigate to customer summary page


    Then I verify that Home policy is Active
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
      | MT_001 |
      | UT_001 |
      | WY_001 |

  @Homeowners @TC82779 @US40776
  Scenario Outline: Homeowners Summary screen post transaction ITNR not refer to Pure "<TC_ID>"

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

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring  | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Notice     | No          | Other - Please explain | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"

    Then I verify that refer to Pure programs - No is display on summary policy transaction
    * I verify that reason for not referring is display on summary policy transaction
    * I verify that additional comments is display on summary policy transaction

    And I navigate to customer summary page
    * I verify that Home policy is Active
    * I verify that Home policy does not refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | WA_001 |
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

  @Homeowners @TC82779 @US40776
  Scenario Outline: Homeowners Summary screen post transaction ITNR not refer to Pure "<TC_ID>"

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

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring  | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Notice     | No          | Other - Please explain | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"

    Then I verify that refer to Pure programs - No is display on summary policy transaction
    * I verify that reason for not referring is display on summary policy transaction
    * I verify that additional comments is display on summary policy transaction

    And I navigate to customer summary page
    * I verify that Home policy is Active
    * I verify that Home policy does not refer to Home Surplus quote

    Examples:
      | TC_ID  |
      | WA_001 |
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

  @Homeowners @US41222 @TC83295
  Scenario Outline: Homeowners Summary screen post transaction ITNR refer to Pure "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I load random user data

    * I set "Last_Name" to "UAT"
    * I set Effective Date 336 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I get customer account ID

    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"
    * I verify that refer to Pure programs - Yes is display on summary policy transaction

    When I navigate to customer summary page
    * I verify that Home policy is Active
    * I verify that Home policy refer to Home Surplus quote

    Examples:
      | TC_ID   |
      | AZ_001  |
      | CO_0011 |
      | MT_001  |
      | UT_001  |
      | WY_001  |
      | AL_001  |
      | CA_001  |
      | HI_001  |
      | LA_001  |
      | MA_001  |
      | MS_001  |
      | NC_001  |
      | NJ_001  |
      | NY_001  |
      | SC_001  |
      | FL_001  |
      | TX_001  |
#      | GA_001 |

    @Homeowners @US41222 @TC83296
  Scenario Outline: Homeowners Summary screen post transaction ITNR refer to Pure "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I load random user data

    * I set Effective Date 352 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I get customer account ID

    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"
    * I verify that refer to Pure programs - Yes is display on summary policy transaction

    When I navigate to customer summary page
    * I verify that Home policy is Active
    * I verify that Home policy refer to Home Surplus quote

    Examples:
      | TC_ID   |
      | AZ_001  |
      | CO_001  |
      | MT_001  |
      | UT_001  |
      | WY_001  |
      | AL_001  |
      | CA_001  |
      | HI_001  |
      | LA_001  |
      | MA_001  |
      | MS_001  |
      | NC_001  |
      | NJ_001  |
      | NY_001  |
      | SC_0012 |
      | FL_0012 |
      | TX_0012 |
      | GA_001  |

  @Homeowners @US41222 @TC83296
  Scenario Outline: Homeowners Summary screen post transaction ITNR refer to Pure "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set Effective Date 350 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I get customer account ID

    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"
    * I verify that refer to Pure programs - Yes is display on summary policy transaction

    When I navigate to customer summary page
    * I verify that Home policy is Active
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

  @Homeowners @US41222 @TC83296
  Scenario Outline: Homeowners ITNR refer to Pure (policies with terms that will expire in 30 days)"<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    * I set Effective Date 350 days in the past

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

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

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

  @Homeowners @TC83347 @US40977
  Scenario Outline: Homeowners ITNR refer to Pure (Validation for more than one location) - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    * I set Effective Date 350 days in the past

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    And I add additional locations
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

    And I navigate to customer summary page
    And I navigate to HS quote
    And I navigate to quotes detail page
    And I navigate to Home Surplus Lines Policy Page
    And I verify error message is shown "Home Surplus cannot have more than 1 location."

    Examples:
      | TC_ID  |
      | CO_007 |
      | CO_008 |
      | CO_009 |