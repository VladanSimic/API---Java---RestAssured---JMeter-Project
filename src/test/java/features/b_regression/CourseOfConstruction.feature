@CourseOfConstruction @Regression
Feature: Home course of construction

  @NewBusiness @Cancellation @Reinstatement
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - Reinstatement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "P1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason               | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

    @GeneralRegression @Performance
    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |

  @NewBusiness @Cancellation @NewBusinessRewrite
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "P2"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    * I add changes on "CC" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

    @GeneralRegression @Performance
    Examples:
      | TC_ID  |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |

  @GeneralRegression @NewBusiness @Endorsement @PolicyExtension @Jenkins
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Endorsement - Policy Extension

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "P3"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process policy extension

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

    @Performance
    Examples:
      | TC_ID  |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - Reinstatement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason               | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

    @GeneralRegression @Performance
    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                |
      | Notes | DayAfterNewBusiness |

    * I add changes on "CC" new business rewrite
    * I review changes
    * I rate a quote
    * I complete rewrite transaction
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Endorsement - Policy Extension

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data


    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today
    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    And I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals

    Then I click process policy extension
    * I exit policy
    * I logout

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |
      | ID_001 |
      | IL_001 |
      | MA_001 |
      | MT_001 |
      | ME_001 |
      | MD_001 |
      | NC_001 |
      | NJ_001 |
      | NM_001 |
      | NV_001 |
      | NY_001 |
      | RI_001 |
      | SC_001 |
      | OR_001 |
      | UT_001 |
      | VA_001 |
      | WA_001 |
      | WY_001 |
      | AR_001 |
      | DC_001 |
      | IA_001 |
      | IN_001 |
      | KS_001 |
      | KY_001 |
      | MI_001 |
      | MN_001 |
      | MO_001 |
      | MS_001 |
      | ND_001 |
      | NE_001 |
      | NH_001 |
      | OH_001 |
      | OK_001 |
      | PA_001 |
      | SD_001 |
      | VT_001 |
      | AL_001 |
      | GA_001 |
      | LA_001 |
      | TN_001 |
      | TX_001 |
      | WI_001 |
      | WV_001 |

  @NewBusiness @Endorsement @PolicyExtension @OrderPropertyDetails @GeneralRegression
  Scenario Outline: CC - Order Property Details - <TC_ID>
    Given I use "<TC_ID>" regression test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Project_Address_Risk_Address_1" to ""
    * I set "Project_Address_Risk_Address_2" to ""
    * I set "Project_Address_City" to ""
    * I set "Project_Address_ZIP" to ""
    * I set Effective Date to Today
    When I am logged in to Pure as "<USER>"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "CC" quote
    Then I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 10 seconds
    * I navigate via action button next

    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 1                |

    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    Then I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 10 seconds
    * I navigate via action button next

    And I click order property details button
    * I think for 10 to 15 seconds
    * I click save changes button
    * I set the protection class to ""
    * I click save changes button
    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 2                |

    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    Then I navigate to Home Surplus Lines Policy Page
    * I think for 5 to 10 seconds
    * I navigate via action button next

    And I click order property details button
    * I think for 10 to 15 seconds
    * I click save changes button
    * I set the protection class to ""
    * I click save changes button
    * I execute the query and verify job status
      | query     | column      | status | expectedRequests |
      | riskmeter | STATUS_TEXT |        | 3                |

    * I review changes
    * I click renewed premium
    * I click review referrals
    * I accept underwriting referrals
    Then I click process policy extension

    Examples:
      | TC_ID  | USER |
      | WA_101 | P84  |
      | CA_001 | P85  |