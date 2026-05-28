Feature: Homeowners surplus regression

  @HomeownersSurplus @NewBusiness @Cancellation @NewBusinessRewrite
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @NewBusiness @Renewal
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Renewal

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Then I select created policy
    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I add changes on "HS" renewal
    When I review changes
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @NewBusiness @Endorsement
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Endorsement - OOS Endorsement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement 1 months ahead
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @NewBusiness @Endorsement
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Endorsement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @NewBusiness
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    Examples:
      | TC_ID  |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | FL_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @Regression @NewBusiness
  Scenario Outline: Homeowners surplus new business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | CO_001 | P81  |
      | AZ_001 | P82  |
      | MT_001 | P83  |
      | UT_001 | P84  |
      | WY_001 | P85  |
      | HI_001 | P86  |
      | MS_001 | P87  |
      | AL_001 | P107 |
      | AL_001 | P108 |
      | AL_001 | P109 |
      | GA_001 | P110 |
      | GA_001 | P111 |
      | GA_001 | P112 |
      | GA_001 | P113 |
      | LA_001 | P114 |
      | LA_001 | P115 |
      | LA_001 | P116 |
      | LA_001 | P117 |
      | LA_001 | P118 |
      | LA_001 | P119 |
      | CA_001 | P120 |
      | MA_001 | P121 |
      | SC_001 | P122 |
      | NJ_001 | P123 |
      | NC_001 | P124 |
      | TX_001 | P125 |
      | FL_001 | P100 |
      | MS_001 | P101 |
      | AL_001 | P102 |
      | GA_001 | P103 |
      | LA_001 | P104 |
      | CA_001 | P105 |
      | MA_001 | P106 |
      | SC_001 | P107 |
      | NJ_001 | P108 |
      | NC_001 | P109 |
      | TX_001 | P110 |
      | FL_001 | P111 |
      | MS_001 | P112 |
      | AL_001 | P113 |
      | GA_001 | P114 |
      | LA_001 | P115 |
      | CA_001 | P116 |
      | MA_001 | P117 |
      | SC_001 | P118 |
      | NJ_001 | P119 |
      | NC_001 | P120 |
      | TX_001 | P121 |
      | FL_001 | P122 |
      | MS_001 | P123 |
      | AL_001 | P124 |
      | GA_001 | P125 |
      | LA_001 | P100 |
      | CA_001 | P101 |
      | MA_001 | P102 |
      | SC_001 | P103 |
      | NJ_001 | P104 |
      | NC_001 | P105 |
      | TX_001 | P106 |

  @HomeownersSurplus @GeneralRegression @Jenkins
  Scenario Outline: Homeowners surplus New Business + NB Endorsement + RN - "<TC_ID>"

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are equal for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    * I create a renewal
    * I think for 5 to 10 seconds
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I fill out HS quote application page
    * I review changes
    * I review and accept referrals on renewal if any
    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | TC_ID  | user |
      | CO_001 | P81  |
      | AZ_001 | P82  |
      | MT_001 | P83  |
      | UT_001 | P84  |
      | WY_001 | P85  |
      | HI_001 | P86  |
      | MS_001 | P87  |
      | AL_001 | P107 |
      | AL_001 | P108 |
      | AL_001 | P109 |
      | GA_001 | P110 |
      | GA_001 | P111 |
      | GA_001 | P112 |
      | GA_001 | P113 |
      | LA_001 | P114 |
      | LA_001 | P115 |
      | LA_001 | P116 |
      | LA_001 | P117 |
      | LA_001 | P118 |
      | LA_001 | P119 |
      | CA_001 | P120 |
      | MA_001 | P121 |
      | SC_001 | P122 |
      | NJ_001 | P123 |
      | NC_001 | P124 |
      | TX_001 | P125 |
      | FL_001 | P100 |
      | MS_001 | P101 |
      | AL_001 | P102 |
      | GA_001 | P103 |
      | LA_001 | P104 |
      | CA_001 | P105 |
      | MA_001 | P106 |
      | SC_001 | P107 |
      | NJ_001 | P108 |
      | NC_001 | P109 |
      | TX_001 | P110 |
      | FL_001 | P111 |
      | MS_001 | P112 |
      | AL_001 | P113 |
      | GA_001 | P114 |
      | LA_001 | P115 |
      | CA_001 | P116 |
      | MA_001 | P117 |
      | SC_001 | P118 |
      | NJ_001 | P119 |
      | NC_001 | P120 |
      | TX_001 | P121 |
      | FL_001 | P122 |
      | MS_001 | P123 |
      | AL_001 | P124 |
      | GA_001 | P125 |
      | LA_001 | P100 |
      | CA_001 | P101 |
      | MA_001 | P102 |
      | SC_001 | P103 |
      | NJ_001 | P104 |
      | NC_001 | P105 |
      | TX_001 | P106 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Cancellation

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    And I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    Then I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Renewal

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    And I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I click process renewal

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Endorsement - OOS Endorsement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement 1 months ahead
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement


    Then I select created policy
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business - Endorsement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    And I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    Then I add changes on "HS" endorsement
    * I review changes
    * I rate an endorsement
    * I review referrals
    * I accept underwriting referrals
    * I issue an endorsement

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - HS - "<TC_ID>" - New Business

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorHS" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | AL_001 |
      | MS_001 |
      | CA_001 |
      | GA_001 |
      | LA_001 |
      | MA_001 |
      | SC_001 |
      | NJ_001 |
      | NC_001 |
      | TX_001 |
      | CO_001 |
      | AZ_001 |
      | MT_001 |
      | UT_001 |
      | WY_001 |
      | HI_001 |

  @HomeownersSurplus @GeneralRegression @OrderPropertyDetails
  Scenario Outline: Homeowners Surplus - Order Property Details on Transactions - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet
    * I load random user data
    * I set Effective Date to Today
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    And I navigate to Location Details Page
    * I verify that ISO Report is pulled

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 2                |

    * I verify that ISO Report is pulled
    * I fill out Basic Construction Details HS
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I navigate to Location Details Page
    * I verify that ISO Report is pulled
    And I click order property details button
    * I think for 10 to 15 seconds

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 3                |

    * I verify that ISO Report is pulled
    * I fill out Basic Construction Details HS
    And I navigate to Home Surplus Lines Policy Page
    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I navigate to transactions or endorsements
    * I create a renewal
    * I think for 5 to 10 seconds
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    Then I navigate to Location Details Page
    * I verify that ISO Report is pulled
    And I click order property details button
    * I think for 10 to 15 seconds

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 4                |

    * I verify that ISO Report is pulled
    Then I navigate to Home Surplus Lines Policy Page

    Examples:
      | TC_ID      | user |
      | CA_001     | P85  |
      | TX_101     | P125 |
      | FL_101_AIR | P100 |
