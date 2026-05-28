Feature: Excess Surplus regression

  @ExcessLiabilitySurplus @Regression @NewBusiness
  Scenario Outline: Excess surplus new business - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
#    * I open OKTA and select tile with "A1"
    * I load random user data
    * I am logged in to Pure as "<user>"
#    * I set "Underc0de" as Agency Name and "800391600" as Agency ID
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P57  |
      | CA_001 | P58  |
      | CT_001 | P59  |
      | MA_001 | P60  |
      | TX_001 | P61  |
      | FL_001 | P62  |
      | NY_001 | P63  |
      | CA_001 | P64  |
      | CT_001 | P65  |
      | MA_001 | P66  |
      | TX_001 | P67  |
      | FL_001 | P68  |
      | NY_001 | P69  |
      | CA_001 | P70  |
      | CT_001 | P71  |
      | MA_001 | P72  |
      | TX_001 | P73  |
      | FL_001 | P74  |
      | NY_001 | P75  |
      | CA_001 | P51  |
      | CT_001 | P52  |
      | MA_001 | P53  |
      | TX_001 | P54  |
      | FL_001 | P55  |
      | NY_001 | P56  |
      | CA_001 | P57  |
      | CT_001 | P58  |
      | MA_001 | P59  |
      | TX_001 | P60  |
      | FL_001 | P61  |
      | NY_001 | P62  |
      | CA_001 | P63  |
      | CT_001 | P64  |
      | MA_001 | P65  |
      | TX_001 | P66  |
      | FL_001 | P67  |
      | NY_001 | P68  |
      | CA_001 | P69  |
      | CT_001 | P70  |
      | MA_001 | P71  |
      | TX_001 | P72  |
      | FL_001 | P73  |

  @ExcessLiabilitySurplus @GeneralRegression @Jenkins
  Scenario Outline: Excess surplus New Business + Endorsement + RN - "<TC_ID>"
    Given I use "<TC_ID>" regression test data from "QuoteCreatorES" sheet
    * I load random user data
    * I set Effective Date to Today
    * I set "BrokerID_AWS_QA" to "800391600"
    * I set "BrokerID_AWS_STG" to "800391600"
    * I set "Agency_Name_AWS_QA" to "Underc0de"
    * I set "Agency_Name_AWS_STG" to "Underc0de"
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify there are no generic failure uw referrals displayed on uw page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement
    Then I navigate to Excess Policy Page
    And I expand node tree if needed

    Then I navigate to Property Information page
    And I add new location on property information page
      | AddressLine1 | City | State | ZipCode | SwimmingPool | Usage     | DwellingType |
      | Copy         | Copy | Copy  | Copy    | Yes          | Primary   | Condo/Co-op  |
      | Copy         | Copy | Copy  | Copy    | No           | Secondary | Tenants      |

    Then I navigate to Vehicles and Watercraft Page
    And I add watercraft on vehicles and watercraft page
      | Make    | Model        | HullValue | Length | HorsePower |
      | Triton  | 21XP Patriot | 84499     | 28     | 300        |
      | Porsche | Boat         | 149450    | 25     | 219        |

    And I navigate to Excess Policy Page

    * I review changes
    * I rate an endorsement
    * I review and accept referrals on renewal if any
    Then I issue an endorsement

    And I think for 80 to 85 seconds
    And I check premiums if they are "not equal" for "New Business" and "Endorsement"

    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I expand node tree if needed
    * I fill out ES quote application page
    * I review changes
    * I review and accept referrals on renewal if any
#    * I process renewal or navigate to policy image and review changes and process renewal

    Examples:
      | TC_ID  | user |
      | NY_001 | P51  |
      | CA_001 | P52  |
      | CT_001 | P53  |
      | MA_001 | P54  |
      | TX_001 | P55  |
      | FL_001 | P56  |
      | NY_001 | P57  |
      | CA_001 | P58  |
      | CT_001 | P59  |
      | MA_001 | P60  |
      | TX_001 | P61  |
      | FL_001 | P62  |
      | NY_001 | P63  |
      | CA_001 | P64  |
      | CT_001 | P65  |
      | MA_001 | P66  |
      | TX_001 | P67  |
      | FL_001 | P68  |
      | NY_001 | P69  |
      | CA_001 | P70  |
      | CT_001 | P71  |
      | MA_001 | P72  |
      | TX_001 | P73  |
      | FL_001 | P74  |
      | NY_001 | P75  |
      | CA_001 | P51  |
      | CT_001 | P52  |
      | MA_001 | P53  |
      | TX_001 | P54  |
      | FL_001 | P55  |
      | NY_001 | P56  |
      | CA_001 | P57  |
      | CT_001 | P58  |
      | MA_001 | P59  |
      | TX_001 | P60  |
      | FL_001 | P61  |
      | NY_001 | P62  |
      | CA_001 | P63  |
      | CT_001 | P64  |
      | MA_001 | P65  |
      | TX_001 | P66  |
      | FL_001 | P67  |
      | LA_001 | P68  |
      | AL_001 | P69  |
      | NC_001 | P70  |
      | MS_001 | P71  |
      | GA_001 | P72  |
      | NJ_001 | P73  |

  @RegressionQA2 @RegressionDEV2
  Scenario Outline: Excess surplus new business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "Underwriter" to "Danijel Radoja"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    Examples:
      | TC_ID  |
      | FL_001 |
      | NY_001 |
      | CA_001 |
      | CT_001 |
      | MA_001 |
      | TX_001 |