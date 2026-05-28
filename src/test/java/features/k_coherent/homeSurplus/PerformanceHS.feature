Feature: Homeowners Surplus Coherent

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - CA - "<TC_ID>" - Dragon - New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Earthquake" page
    * I verify EQ report and save changes
#    * I rate a quote
    Then I rate and save the Dragon rate duration in Excel "results/Rate_Dragon_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
 #   * I rate an endorsement
    * I rate and save the Dragon rate duration in Excel "results/Rate_Dragon_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Dragon rate duration in Excel "results/Rate_Dragon_Duration.xlsx" in sheet "RNW" for "<user>"
    * I process a renewal

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | CA_001 | 04/01/2024    | 04/01/2024      | P1   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P2   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P3   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P4   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P5   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P6   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P7   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P8   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P9   |
      | CA_001 | 04/01/2024    | 04/01/2024      | P10  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P11  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P12  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P13  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P14  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P15  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P16  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P17  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P18  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P19  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P20  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P21  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P22  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P23  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P24  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P25  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P26  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P27  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P28  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P29  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P30  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P31  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P32  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P33  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P34  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P35  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P36  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P37  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P38  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P39  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P40  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P41  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P42  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P43  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P44  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P45  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P46  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P47  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P48  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P49  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P50  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P51  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P52  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P53  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P54  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P55  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P56  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P57  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P58  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P59  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P60  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P61  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P62  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P63  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P64  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P65  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P66  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P67  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P68  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P69  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P70  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P71  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P72  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P73  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P74  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P75  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P76  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P77  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P78  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P79  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P80  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P81  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P82  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P83  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P84  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P85  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P86  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P87  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P88  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P89  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P90  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P91  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P92  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P93  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P94  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P95  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P96  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P97  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P98  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P99  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P100 |

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - CA - "<TC_ID>" - Coherent -  New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Earthquake" page
    * I verify EQ report and save changes
#    * I rate a quote
    Then I rate and save the Coherent rate duration in Excel "results/Rate_Coherent_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I review changes
#    * I rate an endorsement
    * I rate and save the Coherent rate duration in Excel "results/Rate_Coherent_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Coherent rate duration in Excel "results/Rate_Coherent_Duration.xlsx" in sheet "RNW" for "<user>"
    * I process a renewal

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | CA_001 | 05/01/2025    | 05/01/2025      | P1   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P2   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P3   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P4   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P5   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P6   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P7   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P8   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P9   |
      | CA_001 | 05/01/2025    | 05/01/2025      | P10  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P11  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P12  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P13  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P14  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P15  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P16  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P17  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P18  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P19  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P20  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P21  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P22  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P23  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P24  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P25  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P26  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P27  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P28  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P29  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P30  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P31  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P32  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P33  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P34  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P35  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P36  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P37  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P38  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P39  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P40  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P41  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P42  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P43  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P44  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P45  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P46  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P47  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P48  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P49  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P50  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P51  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P52  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P53  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P54  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P55  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P56  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P57  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P58  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P59  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P60  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P61  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P62  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P63  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P64  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P65  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P66  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P67  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P68  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P69  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P70  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P71  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P72  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P73  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P74  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P75  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P76  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P77  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P78  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P79  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P80  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P81  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P82  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P83  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P84  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P85  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P86  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P87  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P88  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P89  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P90  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P91  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P92  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P93  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P94  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P95  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P96  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P97  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P98  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P99  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P100 |


  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - FL - "<TC_ID>" - Dragon - New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
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
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | FL_001 | 08/01/2023    | 08/01/2023      | P1   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P2   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P3   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P4   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P5   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P6   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P7   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P8   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P9   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P10  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P11  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P12  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P13  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P14  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P15  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P16  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P17  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P18  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P19  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P20  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P21  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P22  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P23  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P24  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P25  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P26  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P27  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P28  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P29  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P30  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P31  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P32  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P33  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P34  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P35  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P36  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P37  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P38  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P39  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P40  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P41  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P42  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P43  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P44  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P45  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P46  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P47  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P48  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P49  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P50  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P51  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P52  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P53  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P54  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P55  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P56  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P57  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P58  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P59  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P60  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P61  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P62  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P63  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P64  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P65  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P66  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P67  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P68  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P69  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P70  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P71  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P72  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P73  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P74  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P75  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P76  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P77  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P78  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P79  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P80  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P81  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P82  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P83  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P84  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P85  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P86  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P87  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P88  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P89  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P90  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P91  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P92  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P93  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P94  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P95  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P96  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P97  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P98  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P99  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P100 |

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - FL -  "<TC_ID>" - Coherent - New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
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
    * I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | FL_001 | 03/01/2025    | 03/01/2025      | P1   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P2   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P3   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P4   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P5   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P6   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P7   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P8   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P9   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P10  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P11  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P12  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P13  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P14  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P15  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P16  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P17  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P18  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P19  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P20  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P21  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P22  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P23  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P24  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P25  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P26  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P27  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P28  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P29  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P30  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P31  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P32  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P33  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P34  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P35  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P36  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P37  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P38  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P39  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P40  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P41  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P42  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P43  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P44  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P45  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P46  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P47  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P48  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P49  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P50  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P51  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P52  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P53  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P54  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P55  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P56  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P57  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P58  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P59  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P60  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P61  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P62  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P63  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P64  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P65  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P66  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P67  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P68  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P69  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P70  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P71  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P72  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P73  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P74  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P75  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P76  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P77  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P78  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P79  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P80  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P81  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P82  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P83  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P84  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P85  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P86  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P87  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P88  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P89  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P90  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P91  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P92  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P93  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P94  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P95  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P96  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P97  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P98  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P99  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P100 |


  @HomeownersSurplus @NewBusiness @Endorsement @Renewal @PerformanceDragonRating
  Scenario Outline: - HS - Generic states - "<TC_ID>" - Dragon - New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
#    * I rate a quote
    Then I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
 #   * I rate an endorsement
    * I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I think for 60 to 62 seconds
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I navigate to "Application" page
    * I fill out HS RNW application page
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "RNW" for "<user>"

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | CA_001 | 04/01/2024    | 04/01/2024      | P1   |
      | FL_001 | 08/01/2023    | 08/01/2023      | P2   |
      | HI_001 | 06/01/2024    | 06/01/2024      | P3   |
      | CO_001 | 06/01/2024    | 06/01/2024      | P4   |
      | AL_001 | 06/01/2024    | 06/01/2024      | P5   |
      | TX_001 | 06/01/2024    | 06/01/2024      | P6   |
      | LA_001 | 06/01/2024    | 06/01/2024      | P7   |
      | UT_001 | 06/01/2024    | 06/01/2024      | P8   |
      | MT_001 | 06/01/2024    | 06/01/2024      | P9   |
      | GA_001 | 06/01/2024    | 06/01/2024      | P10  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P11  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P12  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P13  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P14  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P15  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P16  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P17  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P18  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P19  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P20  |
      | AL_001 | 06/01/2024    | 06/01/2024      | P21  |
      | TX_001 | 06/01/2024    | 06/01/2024      | P22  |
      | LA_001 | 06/01/2024    | 06/01/2024      | P23  |
      | UT_001 | 06/01/2024    | 06/01/2024      | P24  |
      | MT_001 | 06/01/2024    | 06/01/2024      | P25  |
      | GA_001 | 06/01/2024    | 06/01/2024      | P26  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P27  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P28  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P29  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P30  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P31  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P32  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P33  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P34  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P35  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P36  |
      | AL_001 | 06/01/2024    | 06/01/2024      | P37  |
      | TX_001 | 06/01/2024    | 06/01/2024      | P38  |
      | LA_001 | 06/01/2024    | 06/01/2024      | P39  |
      | UT_001 | 06/01/2024    | 06/01/2024      | P40  |
      | MT_001 | 06/01/2024    | 06/01/2024      | P41  |
      | GA_001 | 06/01/2024    | 06/01/2024      | P42  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P43  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P44  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P45  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P46  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P47  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P48  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P49  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P50  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P51  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P52  |
      | AL_001 | 06/01/2024    | 06/01/2024      | P53  |
      | TX_001 | 06/01/2024    | 06/01/2024      | P54  |
      | LA_001 | 06/01/2024    | 06/01/2024      | P55  |
      | UT_001 | 06/01/2024    | 06/01/2024      | P56  |
      | MT_001 | 06/01/2024    | 06/01/2024      | P57  |
      | GA_001 | 06/01/2024    | 06/01/2024      | P58  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P59  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P60  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P61  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P62  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P63  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P64  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P65  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P66  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P67  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P68  |
      | AL_001 | 06/01/2024    | 06/01/2024      | P69  |
      | TX_001 | 06/01/2024    | 06/01/2024      | P70  |
      | LA_001 | 06/01/2024    | 06/01/2024      | P71  |
      | UT_001 | 06/01/2024    | 06/01/2024      | P72  |
      | MT_001 | 06/01/2024    | 06/01/2024      | P73  |
      | GA_001 | 06/01/2024    | 06/01/2024      | P74  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P75  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P76  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P77  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P78  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P79  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P80  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P81  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P82  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P83  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P84  |
      | AL_001 | 06/01/2024    | 06/01/2024      | P85  |
      | TX_001 | 06/01/2024    | 06/01/2024      | P86  |
      | LA_001 | 06/01/2024    | 06/01/2024      | P87  |
      | UT_001 | 06/01/2024    | 06/01/2024      | P88  |
      | MT_001 | 06/01/2024    | 06/01/2024      | P89  |
      | GA_001 | 06/01/2024    | 06/01/2024      | P90  |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P91  |
      | MS_001 | 06/01/2024    | 06/01/2024      | P92  |
      | WY_001 | 06/01/2024    | 06/01/2024      | P93  |
      | MA_001 | 05/05/2024    | 05/05/2024      | P94  |
      | SC_001 | 05/05/2024    | 05/05/2024      | P95  |
      | NY_001 | 05/05/2024    | 05/05/2024      | P96  |
      | CA_001 | 04/01/2024    | 04/01/2024      | P97  |
      | FL_001 | 08/01/2023    | 08/01/2023      | P98  |
      | HI_001 | 06/01/2024    | 06/01/2024      | P99  |
      | CO_001 | 06/01/2024    | 06/01/2024      | P100 |
      | AL_001 | 06/01/2024    | 06/01/2024      | P101 |
      | TX_001 | 06/01/2024    | 06/01/2024      | P102 |
      | LA_001 | 06/01/2024    | 06/01/2024      | P103 |
      | UT_001 | 06/01/2024    | 06/01/2024      | P104 |
      | MT_001 | 06/01/2024    | 06/01/2024      | P105 |
      | GA_001 | 06/01/2024    | 06/01/2024      | P106 |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P107 |
      | MS_001 | 06/01/2024    | 06/01/2024      | P108 |
      | WY_001 | 06/01/2024    | 06/01/2024      | P109 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P110 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P111 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P112 |
      | CA_001 | 04/01/2024    | 04/01/2024      | P113 |
      | FL_001 | 08/01/2023    | 08/01/2023      | P114 |
      | HI_001 | 06/01/2024    | 06/01/2024      | P115 |
      | CO_001 | 06/01/2024    | 06/01/2024      | P116 |
      | AL_001 | 06/01/2024    | 06/01/2024      | P117 |
      | TX_001 | 06/01/2024    | 06/01/2024      | P118 |
      | LA_001 | 06/01/2024    | 06/01/2024      | P119 |
      | UT_001 | 06/01/2024    | 06/01/2024      | P120 |
      | MT_001 | 06/01/2024    | 06/01/2024      | P121 |
      | GA_001 | 06/01/2024    | 06/01/2024      | P122 |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P123 |
      | MS_001 | 06/01/2024    | 06/01/2024      | P124 |
      | WY_001 | 06/01/2024    | 06/01/2024      | P125 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P126 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P127 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P128 |
      | CA_001 | 04/01/2024    | 04/01/2024      | P129 |
      | FL_001 | 08/01/2023    | 08/01/2023      | P130 |
      | HI_001 | 06/01/2024    | 06/01/2024      | P131 |
      | CO_001 | 06/01/2024    | 06/01/2024      | P132 |
      | AL_001 | 06/01/2024    | 06/01/2024      | P133 |
      | TX_001 | 06/01/2024    | 06/01/2024      | P134 |
      | LA_001 | 06/01/2024    | 06/01/2024      | P135 |
      | UT_001 | 06/01/2024    | 06/01/2024      | P136 |
      | MT_001 | 06/01/2024    | 06/01/2024      | P137 |
      | GA_001 | 06/01/2024    | 06/01/2024      | P138 |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P139 |
      | MS_001 | 06/01/2024    | 06/01/2024      | P140 |
      | WY_001 | 06/01/2024    | 06/01/2024      | P141 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P142 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P143 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P144 |
      | CA_001 | 04/01/2024    | 04/01/2024      | P145 |
      | FL_001 | 08/01/2023    | 08/01/2023      | P146 |
      | HI_001 | 06/01/2024    | 06/01/2024      | P147 |
      | CO_001 | 06/01/2024    | 06/01/2024      | P148 |
      | AL_001 | 06/01/2024    | 06/01/2024      | P149 |
      | TX_001 | 06/01/2024    | 06/01/2024      | P150 |
      | LA_001 | 06/01/2024    | 06/01/2024      | P151 |
      | UT_001 | 06/01/2024    | 06/01/2024      | P152 |
      | MT_001 | 06/01/2024    | 06/01/2024      | P153 |
      | GA_001 | 06/01/2024    | 06/01/2024      | P154 |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P155 |
      | MS_001 | 06/01/2024    | 06/01/2024      | P156 |
      | WY_001 | 06/01/2024    | 06/01/2024      | P157 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P158 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P159 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P160 |
      | LA_001 | 06/01/2024    | 06/01/2024      | P161 |
      | UT_001 | 06/01/2024    | 06/01/2024      | P162 |
      | MT_001 | 06/01/2024    | 06/01/2024      | P163 |
      | GA_001 | 06/01/2024    | 06/01/2024      | P164 |
      | AZ_001 | 06/01/2024    | 06/01/2024      | P165 |
      | MS_001 | 06/01/2024    | 06/01/2024      | P166 |
      | WY_001 | 06/01/2024    | 06/01/2024      | P167 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P168 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P169 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P170 |

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal
  Scenario Outline: - HS - Generic states -"<TC_ID>" - Coherent -  New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
#    * I rate a quote
    Then I rate and save the Coherent rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
 #   * I rate an endorsement
    * I rate and save the Dragon rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I navigate to "Application" page
    * I fill out HS RNW application page
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Coherent rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "RNW" for "<user>"
    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | CA_001 | 05/01/2025    | 05/01/2025      | P1   |
      | FL_001 | 03/01/2025    | 03/01/2025      | P2   |
      | HI_001 | 07/01/2025    | 07/01/2025      | P3   |
      | CO_001 | 07/01/2025    | 07/01/2025      | P4   |
      | AL_001 | 07/01/2025    | 07/01/2025      | P5   |
      | TX_001 | 07/01/2025    | 07/01/2025      | P6   |
      | LA_001 | 07/01/2025    | 07/01/2025      | P7   |
      | UT_001 | 07/01/2025    | 07/01/2025      | P8   |
      | MT_001 | 07/01/2025    | 07/01/2025      | P9   |
      | GA_001 | 07/01/2025    | 07/01/2025      | P10  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P11  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P12  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P13  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P14  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P15  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P16  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P17  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P18  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P19  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P20  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P21  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P22  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P23  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P24  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P25  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P26  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P27  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P28  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P29  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P30  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P31  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P32  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P33  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P34  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P35  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P36  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P37  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P38  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P39  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P40  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P41  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P42  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P43  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P44  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P45  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P46  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P47  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P48  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P49  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P50  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P51  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P52  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P53  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P54  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P55  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P56  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P57  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P58  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P59  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P60  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P61  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P62  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P63  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P64  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P65  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P66  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P67  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P68  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P69  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P70  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P71  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P72  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P73  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P74  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P75  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P76  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P77  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P78  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P79  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P80  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P81  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P82  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P83  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P84  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P85  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P86  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P87  |
      | GA_001 | 07/01/2025    | 07/01/2025      | P88  |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P89  |
      | MS_001 | 07/01/2025    | 07/01/2025      | P90  |
      | WY_001 | 07/01/2025    | 07/01/2025      | P91  |
      | CA_001 | 05/01/2025    | 05/01/2025      | P92  |
      | FL_001 | 03/01/2025    | 03/01/2025      | P93  |
      | HI_001 | 07/01/2025    | 07/01/2025      | P94  |
      | CO_001 | 07/01/2025    | 07/01/2025      | P95  |
      | AL_001 | 07/01/2025    | 07/01/2025      | P96  |
      | TX_001 | 07/01/2025    | 07/01/2025      | P97  |
      | LA_001 | 07/01/2025    | 07/01/2025      | P98  |
      | UT_001 | 07/01/2025    | 07/01/2025      | P99  |
      | MT_001 | 07/01/2025    | 07/01/2025      | P100 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P101 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P102 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P103 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P104 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P105 |
      | FL_001 | 03/01/2025    | 03/01/2025      | P106 |
      | HI_001 | 07/01/2025    | 07/01/2025      | P107 |
      | CO_001 | 07/01/2025    | 07/01/2025      | P108 |
      | AL_001 | 07/01/2025    | 07/01/2025      | P109 |
      | TX_001 | 07/01/2025    | 07/01/2025      | P110 |
      | LA_001 | 07/01/2025    | 07/01/2025      | P111 |
      | UT_001 | 07/01/2025    | 07/01/2025      | P112 |
      | MT_001 | 07/01/2025    | 07/01/2025      | P113 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P114 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P115 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P116 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P117 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P118 |
      | FL_001 | 03/01/2025    | 03/01/2025      | P119 |
      | HI_001 | 07/01/2025    | 07/01/2025      | P120 |
      | CO_001 | 07/01/2025    | 07/01/2025      | P121 |
      | AL_001 | 07/01/2025    | 07/01/2025      | P122 |
      | TX_001 | 07/01/2025    | 07/01/2025      | P123 |
      | LA_001 | 07/01/2025    | 07/01/2025      | P124 |
      | UT_001 | 07/01/2025    | 07/01/2025      | P125 |
      | MT_001 | 07/01/2025    | 07/01/2025      | P126 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P127 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P128 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P129 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P130 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P131 |
      | FL_001 | 03/01/2025    | 03/01/2025      | P132 |
      | HI_001 | 07/01/2025    | 07/01/2025      | P133 |
      | CO_001 | 07/01/2025    | 07/01/2025      | P134 |
      | AL_001 | 07/01/2025    | 07/01/2025      | P135 |
      | TX_001 | 07/01/2025    | 07/01/2025      | P136 |
      | LA_001 | 07/01/2025    | 07/01/2025      | P137 |
      | UT_001 | 07/01/2025    | 07/01/2025      | P138 |
      | MT_001 | 07/01/2025    | 07/01/2025      | P139 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P140 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P141 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P142 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P143 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P144 |
      | FL_001 | 03/01/2025    | 03/01/2025      | P145 |
      | HI_001 | 07/01/2025    | 07/01/2025      | P146 |
      | CO_001 | 07/01/2025    | 07/01/2025      | P147 |
      | AL_001 | 07/01/2025    | 07/01/2025      | P148 |
      | TX_001 | 07/01/2025    | 07/01/2025      | P149 |
      | LA_001 | 07/01/2025    | 07/01/2025      | P150 |
      | UT_001 | 07/01/2025    | 07/01/2025      | P151 |
      | MT_001 | 07/01/2025    | 07/01/2025      | P152 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P153 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P154 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P155 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P156 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P157 |
      | FL_001 | 03/01/2025    | 03/01/2025      | P158 |
      | HI_001 | 07/01/2025    | 07/01/2025      | P159 |
      | CO_001 | 07/01/2025    | 07/01/2025      | P160 |
      | AL_001 | 07/01/2025    | 07/01/2025      | P161 |
      | TX_001 | 07/01/2025    | 07/01/2025      | P162 |
      | LA_001 | 07/01/2025    | 07/01/2025      | P163 |
      | UT_001 | 07/01/2025    | 07/01/2025      | P164 |
      | MT_001 | 07/01/2025    | 07/01/2025      | P165 |
      | GA_001 | 07/01/2025    | 07/01/2025      | P166 |
      | AZ_001 | 07/01/2025    | 07/01/2025      | P167 |
      | MS_001 | 07/01/2025    | 07/01/2025      | P168 |
      | WY_001 | 07/01/2025    | 07/01/2025      | P169 |
      | CA_001 | 05/01/2025    | 05/01/2025      | P170 |


  @HomeownersSurplus @NewBusiness
  Scenario Outline: - HS - RI/CT -"<TC_ID>" - Coherent - New Business - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
#    * I rate a quote
    Then I rate and save the Coherent rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | effectiveDate | user |
      | RI_001 | 07/01/2025    | P151 |
      | RI_001 | 07/01/2025    | P152 |
      | RI_001 | 07/01/2025    | P153 |
      | RI_001 | 07/01/2025    | P154 |
      | RI_001 | 07/01/2025    | P155 |
      | RI_001 | 07/01/2025    | P156 |
      | RI_001 | 07/01/2025    | P157 |
      | RI_001 | 07/01/2025    | P158 |
      | RI_001 | 07/01/2025    | P159 |
      | RI_001 | 07/01/2025    | P160 |
      | CT_001 | 07/01/2025    | P161 |
      | CT_001 | 07/01/2025    | P162 |
      | CT_001 | 07/01/2025    | P163 |
      | CT_001 | 07/01/2025    | P164 |
      | CT_001 | 07/01/2025    | P165 |
      | CT_001 | 07/01/2025    | P166 |
      | CT_001 | 07/01/2025    | P167 |
      | CT_001 | 07/01/2025    | P168 |
      | CT_001 | 07/01/2025    | P169 |
      | CT_001 | 07/01/2025    | P170 |


  @HomeownersSurplus @NewBusiness @Endorsement @Renewal @Before
  Scenario Outline: - HS - MA,SC,NY - "<TC_ID>" - Dragon - New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS_MA_SC_NY" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
#    * I rate a quote
    Then I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
 #   * I rate an endorsement
    * I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I navigate to "Application" page
    * I fill out HS RNW application page
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Dragon rate duration in Excel "results/Dragon_Rate_Duration.xlsx" in sheet "RNW" for "<user>"

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | MA_001 | 05/05/2024    | 05/05/2024      | P1   |
      | SC_001 | 05/05/2024    | 05/05/2024      | P2   |
      | NY_001 | 05/05/2024    | 05/05/2024      | P3   |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P4   |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P5   |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P6   |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P7   |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P8   |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P9   |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P10  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P11  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P12  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P13  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P14  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P15  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P16  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P17  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P18  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P19  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P20  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P21  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P22  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P23  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P24  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P25  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P26  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P27  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P28  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P29  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P30  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P31  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P32  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P33  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P34  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P35  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P36  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P37  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P38  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P39  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P40  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P41  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P42  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P43  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P44  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P45  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P46  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P47  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P48  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P49  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P50  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P51  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P52  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P53  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P54  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P55  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P56  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P57  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P58  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P59  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P60  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P61  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P62  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P63  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P64  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P65  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P66  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P67  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P68  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P69  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P70  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P71  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P72  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P73  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P74  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P75  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P76  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P77  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P78  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P79  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P80  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P81  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P82  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P83  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P84  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P85  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P86  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P87  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P88  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P89  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P90  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P91  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P92  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P93  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P94  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P95  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P96  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P97  |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P98  |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P99  |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P100 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P101 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P102 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P103 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P104 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P105 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P106 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P107 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P108 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P109 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P110 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P111 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P112 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P113 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P114 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P115 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P116 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P117 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P118 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P119 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P120 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P121 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P122 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P123 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P124 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P125 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P126 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P127 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P128 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P129 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P130 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P131 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P132 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P133 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P134 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P135 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P136 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P137 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P138 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P139 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P140 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P141 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P142 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P143 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P144 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P145 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P146 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P147 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P148 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P149 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P150 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P151 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P152 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P153 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P154 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P155 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P156 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P157 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P158 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P159 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P160 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P161 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P162 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P163 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P164 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P165 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P166 |
#      | SC_001 | 05/05/2024    | 05/05/2024      | P167 |
#      | NY_001 | 05/05/2024    | 05/05/2024      | P168 |
#      | MA_001 | 05/05/2024    | 05/05/2024      | P164 |
      | NY_001 | 05/05/2024    | 05/05/2024      | P169 |
      | SC_001 | 05/05/2024    | 05/05/2024      | P164 |
      | MA_001 | 05/05/2024    | 05/05/2024      | P170 |

  @HomeownersSurplus @NewBusiness @Endorsement @Renewal @After
  Scenario Outline: - HS - MA,SC,NY -"<TC_ID>" - Coherent -  New Business - Endorsement - Renewal - Performance

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/Performance_QuoteCreationHS_MA_SC_NY" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<endorsementDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
#    * I rate a quote
    Then I rate and save the Coherent rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "NB" for "<user>"

    Then I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
 #   * I rate an endorsement
    * I rate and save the Dragon rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "END" for "<user>"

    Then  I review and accept referrals on renewal if any
    * I issue an endorsement

    When I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I navigate to "Application" page
    * I fill out HS RNW application page
    * I review changes
 #   * I click renewed premium

    Then I rate and save the Coherent rate duration in Excel "results/Coherent_Rate_Duration.xlsx" in sheet "RNW" for "<user>"
    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "

    Examples:
      | TC_ID  | effectiveDate | endorsementDate | user |
      | MA_001 | 07/01/2025    | 07/01/2025      | P1   |
      | SC_001 | 07/01/2025    | 07/01/2025      | P2   |
      | NY_001 | 07/01/2025    | 07/01/2025      | P3   |
      | MA_001 | 07/01/2025    | 07/01/2025      | P4   |
      | SC_001 | 07/01/2025    | 07/01/2025      | P5   |
      | NY_001 | 07/01/2025    | 07/01/2025      | P6   |
      | MA_001 | 07/01/2025    | 07/01/2025      | P7   |
      | SC_001 | 07/01/2025    | 07/01/2025      | P8   |
      | NY_001 | 07/01/2025    | 07/01/2025      | P9   |
      | MA_001 | 07/01/2025    | 07/01/2025      | P10  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P11  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P12  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P13  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P14  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P15  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P16  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P17  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P18  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P19  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P20  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P21  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P22  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P23  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P24  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P25  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P26  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P27  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P28  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P29  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P30  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P31  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P32  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P33  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P34  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P35  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P36  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P37  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P38  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P39  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P40  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P41  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P42  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P43  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P44  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P45  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P46  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P47  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P48  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P49  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P50  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P51  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P52  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P53  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P54  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P55  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P56  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P57  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P58  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P59  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P60  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P61  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P62  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P63  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P64  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P65  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P66  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P67  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P68  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P69  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P70  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P71  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P72  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P73  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P74  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P75  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P76  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P77  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P78  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P79  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P80  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P81  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P82  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P83  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P84  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P85  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P86  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P87  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P88  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P89  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P90  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P91  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P92  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P93  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P94  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P95  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P96  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P97  |
      | SC_001 | 07/01/2025    | 07/01/2025      | P98  |
      | NY_001 | 07/01/2025    | 07/01/2025      | P99  |
      | MA_001 | 07/01/2025    | 07/01/2025      | P100 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P101 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P102 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P103 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P104 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P105 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P106 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P107 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P108 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P109 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P110 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P111 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P112 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P113 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P114 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P115 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P116 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P117 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P118 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P119 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P120 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P121 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P122 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P123 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P124 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P125 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P126 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P127 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P128 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P129 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P130 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P131 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P132 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P133 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P134 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P135 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P136 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P137 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P138 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P139 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P140 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P141 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P142 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P143 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P144 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P145 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P146 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P147 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P148 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P149 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P150 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P151 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P152 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P153 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P154 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P155 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P156 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P157 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P158 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P159 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P160 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P161 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P162 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P163 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P164 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P165 |
      | MA_001 | 07/01/2025    | 07/01/2025      | P166 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P167 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P168 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P164 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P169 |
      | SC_001 | 07/01/2025    | 07/01/2025      | P164 |
      | NY_001 | 07/01/2025    | 07/01/2025      | P170 |