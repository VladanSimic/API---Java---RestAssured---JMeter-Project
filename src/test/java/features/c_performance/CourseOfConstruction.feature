Feature: Home course of construction

  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - Reinstatement

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
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



    @Appendix @Performance @Scenario1 @USAppendix
    Examples:
      | TC_ID  | user |
      | FL_001 | P600 |
      | AZ_001 | P601 |
      | CA_001 | P602 |
      | CO_001 | P603 |
      | CT_001 | P604 |
      | DE_001 | P605 |
      | HI_001 | P606 |
      | ID_001 | P607 |
      | IL_001 | P608 |
      | MA_001 | P609 |
      | MT_001 | P610 |
      | ME_001 | P611 |
      | MD_001 | P612 |
      | NC_001 | P613 |
      | FL_001 | P614 |
      | OK_001 | P615 |
      | PA_001 | P616 |
      | SD_001 | P617 |

  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Cancellation - New Business Rewrite

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
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
    * I rate an endorsement
    * I complete rewrite transaction
    * I exit policy
    * I logout

    @Appendix @Performance @Scenario2 @USAppendix
    Examples:
      | TC_ID  | user |
      | NM_001 | P615 |
      | NV_001 | P616 |
      | NY_001 | P617 |
      | RI_001 | P618 |
      | SC_001 | P619 |
      | OR_001 | P620 |
      | UT_001 | P621 |
      | VA_001 | P622 |
      | WA_001 | P623 |
      | WY_001 | P624 |
      | AR_001 | P625 |
      | DC_001 | P626 |
      | IA_001 | P627 |
      | IN_001 | P628 |
      | KS_001 | P629 |
      | NM_001 | P630 |
      | NE_001 | P631 |
      | NH_001 | P632 |
      | OH_001 | P633 |

  Scenario Outline: Regression - CC - "<TC_ID>" - New Business - Endorsement - Policy Extension

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as "<user>"
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

    @Appendix @Performance @Scenario3 @USAppendix
    Examples:
      | TC_ID  | user |
      | KY_001 | P631 |
      | MI_001 | P632 |
      | MN_001 | P633 |
      | MO_001 | P634 |
      | MS_001 | P635 |
      | ND_001 | P636 |
      | VT_001 | P643 |
      | AL_001 | P644 |
      | GA_001 | P645 |
      | LA_001 | P646 |
      | TN_001 | P647 |
      | TX_001 | P648 |
      | WI_001 | P649 |
      | WV_001 | P650 |
      | KY_001 | P651 |