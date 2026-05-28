@CourseOfConstruction @DE36532
Feature: [PROD SUPPORT] COC - User can update Risk Address and can rate policy.  Validation should force user to order property details.

  @DE36532 @CC @Disabled
  Scenario Outline: TC_01 "<TC_ID>"| Programs - COC - Verify validation is forcing user to order property details after changing project address. (All States) NB

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote
    * I rate a quote
    * I verify if element with message "Hard-stop message to be updated." is "Displayed" on the UI

    * I navigate to Location Details Page
    * I click order property details button
    * I think for 15 to 20 seconds
    Then I set the protection class to ""

    * I think for 10 to 15 seconds
    * I rate a quote
    * I think for 5 to 10 seconds
    * I verify if element with message "Hard-stop message to be updated." is "Not Displayed" on the UI

    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    Examples:
      | TC_ID  | user |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KY_001 | P84  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
      | OK_001 | P94  |
      | OR_001 | P95  |
      | PA_001 | P96  |
      | RI_001 | P97  |
      | TN_001 | P99  |
      | VT_001 | P77  |
      | WA_001 | P78  |
      | WI_001 | P79  |
      | WV_001 | P80  |
      | CA_001 | P82  |
      | CT_001 | P83  |
      | DE_001 | P84  |
      | LA_001 | P86  |
      | MA_001 | P87  |
      | MD_001 | P88  |
      | MS_001 | P90  |
      | NC_001 | P91  |
      | NJ_001 | P92  |
      | NY_001 | P93  |
      | SC_001 | P94  |
      | VA_001 | P95  |
      | FL_001 | P96  |
      | TX_001 | P97  |
      | GA_001 | P98  |
      | MI_001 | P99  |
      | ID_001 | P76  |
      | HI_001 | P85  |
      | WY_001 | P81  |
      | UT_001 | P76  |
      | SD_001 | P98  |
      | KS_001 | P83  |
      | MN_001 | P85  |
      | CO_001 | P79  |
      | AL_001 | P82  |
      | ME_001 | P83  |


  @DE36532 @CC
  Scenario Outline: TC_02 "<TC_ID>"| Programs - COC - Programs - COC - Verify validation is forcing user to order property details after changing project address. (All States) NB

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I navigate to Location Details Page

    * I think for 10 to 15 seconds

    Then I set primary address address line 1 to "<Address>"
    * I set primary address city to "<City>"
    * I set primary address ZIP code to "<Zip>"
    * I click save changes button
    Then I set the protection class to ""


    * I rate a quote
    * I think for 10 to 15 seconds
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Displayed" on the UI

    Then I click order property details button
    And I think for 15 to 20 seconds
    * I click save changes button
    Then I set the protection class to ""
    * I click save changes button
    * I rate a quote


    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | AR_001 | P77  | 1102 Walker             | Helena              | 72342 |
      | AZ_001 | P78  | 3647 Snead Dr           | Sierra Vista        | 85650 |
      | DC_001 | P80  | 5006 Lee St NE          | Washington          | 20019 |
      | IA_001 | P81  | 27490 450th St          | Moravia             | 52571 |
      | IL_001 | P82  | 306 W Ridge Ave         | Prospect Heights    | 60070 |
      | IN_001 | P82  | 7971 Clearwater Ct      | Indianapolis        | 46256 |
      | KY_001 | P84  | 460 Romans Rd           | London              | 40741 |
      | MO_001 | P86  | 1419 Remington Oaks Ter | Fenton              | 63026 |
      | MT_001 | P87  | 7906 Monad Rd           | Billings            | 59106 |
      | ND_001 | P88  | 4045 Prairie Ln         | Williston           | 58801 |
      | NE_001 | P89  | 16721 X St              | Omaha               | 68135 |
      | NH_001 | P90  | 134 Greenwood Avenue    | Keene               | 03431 |
      | NM_001 | P91  | 4304 Prairie Hill Pl NW | Albuquerque         | 87114 |
      | NV_001 | P92  | 6786 Grandola Dr        | Las Vegas           | 89103 |
      | OH_001 | P93  | 51 Winesap Ct           | Howard              | 43028 |
      | OK_001 | P94  | 15746 N 103rd West Ave  | Skiatook            | 74070 |
      | OR_001 | P95  | 230 Summit Dr           | Heppner             | 97836 |
      | PA_001 | P96  | 2912 Dixon Ave          | Bristol             | 19007 |
      | RI_001 | P97  | 25 Kimberly Ln          | West Warwick        | 02893 |
      | TN_001 | P99  | 1224 Hammett Rd         | Johnson City        | 37615 |
      | VT_001 | P77  | 43 Woodland Drive       | Barre               | 05641 |
      | WA_001 | P78  | 9208 N Oak St           | Spokane             | 99208 |
      | WI_001 | P79  | 8110 Fishman ROAD       | Burlington          | 53105 |
      | WV_001 | P80  | 3442 Reid Ridge Road    | Cameron             | 26033 |
      | CA_001 | P82  | 11110 Sandy Ln          | Apple Valley        | 92308 |
      | CT_001 | P83  | 85 Valley Dr            | Berlin              | 06037 |
      | DE_001 | P84  | 25297 Tannin Cir        | Milton              | 19968 |
      | LA_001 | P86  | 404 Robinhood Cir       | Lafayette           | 70508 |
      | MA_001 | P87  | 79 Wanda St             | Chicopee            | 01013 |
      | MD_001 | P88  | 3535 Smokethorn Ct      | Waldorf             | 20602 |
      | MS_001 | P90  | 107 Pine Ln             | Hattiesburg         | 39402 |
      | NC_001 | P91  | 1914 Mallard Road       | Greenville          | 27858 |
      | NJ_001 | P92  | 160 Ely Ave             | Franklinville       | 08322 |
      | NY_001 | P93  | 74 Cross Country Dr     | Baldwinsville       | 13027 |
      | SC_001 | P94  | 190 Merrimont Dr #55    | Blythewood          | 29016 |
      | VA_001 | P95  | 2695 Zachary Taylor Hwy | Mineral             | 23117 |
      | FL_001 | P96  | 529 Long Lake Dr        | Pensacola           | 32506 |
      | TX_001 | P97  | 16415 LEDGE ROCK ST     | San Antonio         | 78232 |
      | GA_001 | P98  | 20 Anna Pl              | Adairsville         | 30103 |
      | MI_001 | P99  | 5587 Gladecress Dr      | Saginaw             | 48603 |
      | ID_001 | P76  | 3124 Turning Leaf St    | Caldwell            | 83605 |
      | HI_001 | P85  | 1101 Kukulu St UNIT 50  | Kapolei             | 96707 |
      | WY_001 | P81  | 4766 Windmill Rd        | Cheyenne            | 82009 |
      | UT_001 | P76  | 455 Vickie Ln W         | Clearfield          | 84015 |
      | SD_001 | P98  | 217 E 26th St           | Sioux Falls         | 57105 |
      | KS_001 | P83  | 518 Lakewood Rd         | Bonner Springs      | 66012 |
      | MN_001 | P85  | 3992 77th St E          | Inver Grove Heights | 55076 |
      | CO_001 | P79  | 664 Ellen Dr            | Grand Junction      | 81507 |
      | AL_001 | P82  | 9610 Woolrich Ave       | Fairhope            | 36532 |
      | ME_001 | P83  | 17 Virgin Street        | Canton              | 04221 |

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | WA_001 | P78  | 9208 N Oak St           | Spokane             | 99208 |

  @DE36532 @CC
  Scenario Outline: TC_03 "<TC_ID>"| Programs - COC - Verify validation is forcing user to order property details after changing project address. (All States) NB/END

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote


    * I rate a quote
    * I think for 5 to 10 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    * I initiate new endorsement
    Then I navigate to Location Details Page

    Then I set primary address address line 1 to "<Address>"
    * I set primary address city to "<City>"
    * I set primary address ZIP code to "<Zip>"
    * I click save changes button
    Then I set the protection class to ""
    * I think for 5 to 10 seconds

    * I review changes
    * I think for 15 to 20 seconds
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Displayed" on the UI

    Then I click order property details button
    And I think for 15 to 20 seconds
    * I click save changes button
    Then I set the protection class to ""
    * I click save changes button

    * I review changes
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Not Displayed" on the UI
    * I think for 10 to 15 seconds
    * I rate a quote


    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | AR_001 | P77  | 1102 Walker             | Helena              | 72342 |
      | AZ_001 | P78  | 3647 Snead Dr           | Sierra Vista        | 85650 |
      | DC_001 | P80  | 5006 Lee St NE          | Washington          | 20019 |
      | IA_001 | P81  | 27490 450th St          | Moravia             | 52571 |
      | IL_001 | P82  | 306 W Ridge Ave         | Prospect Heights    | 60070 |
      | IN_001 | P82  | 7971 Clearwater Ct      | Indianapolis        | 46256 |
      | KY_001 | P84  | 460 Romans Rd           | London              | 40741 |
      | MO_001 | P86  | 1419 Remington Oaks Ter | Fenton              | 63026 |
      | MT_001 | P87  | 7906 Monad Rd           | Billings            | 59106 |
      | ND_001 | P88  | 4045 Prairie Ln         | Williston           | 58801 |
      | NE_001 | P89  | 16721 X St              | Omaha               | 68135 |
      | NH_001 | P90  | 134 Greenwood Avenue    | Keene               | 03431 |
      | NM_001 | P91  | 4304 Prairie Hill Pl NW | Albuquerque         | 87114 |
      | NV_001 | P92  | 6786 Grandola Dr        | Las Vegas           | 89103 |
      | OH_001 | P93  | 51 Winesap Ct           | Howard              | 43028 |
      | OK_001 | P94  | 15746 N 103rd West Ave  | Skiatook            | 74070 |
      | OR_001 | P95  | 230 Summit Dr           | Heppner             | 97836 |
      | PA_001 | P96  | 2912 Dixon Ave          | Bristol             | 19007 |
      | RI_001 | P97  | 25 Kimberly Ln          | West Warwick        | 02893 |
      | TN_001 | P99  | 1224 Hammett Rd         | Johnson City        | 37615 |
      | VT_001 | P77  | 43 Woodland Drive       | Barre               | 05641 |
      | WA_001 | P78  | 9208 N Oak St           | Spokane             | 99208 |
      | WI_001 | P79  | 8110 Fishman ROAD       | Burlington          | 53105 |
      | WV_001 | P80  | 3442 Reid Ridge Road    | Cameron             | 26033 |
      | CA_001 | P82  | 11110 Sandy Ln          | Apple Valley        | 92308 |
      | CT_001 | P83  | 85 Valley Dr            | Berlin              | 06037 |
      | DE_001 | P84  | 25297 Tannin Cir        | Milton              | 19968 |
      | LA_001 | P86  | 404 Robinhood Cir       | Lafayette           | 70508 |
      | MA_001 | P87  | 79 Wanda St             | Chicopee            | 01013 |
      | MD_001 | P88  | 3535 Smokethorn Ct      | Waldorf             | 20602 |
      | MS_001 | P90  | 107 Pine Ln             | Hattiesburg         | 39402 |
      | NC_001 | P91  | 1914 Mallard Road       | Greenville          | 27858 |
      | NJ_001 | P92  | 160 Ely Ave             | Franklinville       | 08322 |
      | NY_001 | P93  | 74 Cross Country Dr     | Baldwinsville       | 13027 |
      | SC_001 | P94  | 190 Merrimont Dr #55    | Blythewood          | 29016 |
      | VA_001 | P95  | 2695 Zachary Taylor Hwy | Mineral             | 23117 |
      | FL_001 | P96  | 529 Long Lake Dr        | Pensacola           | 32506 |
      | TX_001 | P97  | 16415 LEDGE ROCK ST     | San Antonio         | 78232 |
      | GA_001 | P98  | 20 Anna Pl              | Adairsville         | 30103 |
      | MI_001 | P99  | 5587 Gladecress Dr      | Saginaw             | 48603 |
      | ID_001 | P76  | 3124 Turning Leaf St    | Caldwell            | 83605 |
      | HI_001 | P85  | 1101 Kukulu St UNIT 50  | Kapolei             | 96707 |
      | WY_001 | P81  | 4766 Windmill Rd        | Cheyenne            | 82009 |
      | UT_001 | P76  | 455 Vickie Ln W         | Clearfield          | 84015 |
      | SD_001 | P98  | 217 E 26th St           | Sioux Falls         | 57105 |
      | KS_001 | P83  | 518 Lakewood Rd         | Bonner Springs      | 66012 |
      | MN_001 | P85  | 3992 77th St E          | Inver Grove Heights | 55076 |
      | CO_001 | P79  | 664 Ellen Dr            | Grand Junction      | 81507 |
      | AL_001 | P82  | 9610 Woolrich Ave       | Fairhope            | 36532 |
      | ME_001 | P83  | 17 Virgin Street        | Canton              | 04221 |

  @DE36532 @CC
  Scenario Outline: TC_04 "<TC_ID>"| Programs - COC - Verify validation is forcing user to order property details after changing project address. NB/PE

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I rate a quote
    * I think for 5 to 10 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    When I initiate a policy extension
    Then I navigate to Location Details Page

    Then I set primary address address line 1 to "<Address>"
    * I set primary address city to "<City>"
    * I set primary address ZIP code to "<Zip>"
    * I click save changes button
    Then I set the protection class to ""
    * I think for 5 to 10 seconds

    * I review changes
    * I think for 15 to 20 seconds
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Displayed" on the UI

    Then I click order property details button
    And I think for 15 to 20 seconds
    * I click save changes button
    Then I set the protection class to ""
    * I click save changes button

    Then I review changes
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Not Displayed" on the UI
#    * I click renewed premium

    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | AR_001 | P77  | 1102 Walker             | Helena              | 72342 |
      | AZ_001 | P78  | 3647 Snead Dr           | Sierra Vista        | 85650 |
      | DC_001 | P80  | 5006 Lee St NE          | Washington          | 20019 |
      | IA_001 | P81  | 27490 450th St          | Moravia             | 52571 |
      | IL_001 | P82  | 306 W Ridge Ave         | Prospect Heights    | 60070 |
      | IN_001 | P82  | 7971 Clearwater Ct      | Indianapolis        | 46256 |
      | KY_001 | P84  | 460 Romans Rd           | London              | 40741 |
      | MO_001 | P86  | 1419 Remington Oaks Ter | Fenton              | 63026 |
      | MT_001 | P87  | 7906 Monad Rd           | Billings            | 59106 |
      | ND_001 | P88  | 4045 Prairie Ln         | Williston           | 58801 |
      | NE_001 | P89  | 16721 X St              | Omaha               | 68135 |
      | NH_001 | P90  | 134 Greenwood Avenue    | Keene               | 03431 |
      | NM_001 | P91  | 4304 Prairie Hill Pl NW | Albuquerque         | 87114 |
      | NV_001 | P92  | 6786 Grandola Dr        | Las Vegas           | 89103 |
      | OH_001 | P93  | 51 Winesap Ct           | Howard              | 43028 |
      | OK_001 | P94  | 15746 N 103rd West Ave  | Skiatook            | 74070 |
      | OR_001 | P95  | 230 Summit Dr           | Heppner             | 97836 |
      | PA_001 | P96  | 2912 Dixon Ave          | Bristol             | 19007 |
      | RI_001 | P97  | 25 Kimberly Ln          | West Warwick        | 02893 |
      | TN_001 | P99  | 1224 Hammett Rd         | Johnson City        | 37615 |
      | VT_001 | P77  | 43 Woodland Drive       | Barre               | 05641 |
      | WA_001 | P78  | 9208 N Oak St           | Spokane             | 99208 |
      | WI_001 | P79  | 8110 Fishman ROAD       | Burlington          | 53105 |
      | WV_001 | P80  | 3442 Reid Ridge Road    | Cameron             | 26033 |
      | CA_001 | P82  | 11110 Sandy Ln          | Apple Valley        | 92308 |
      | CT_001 | P83  | 85 Valley Dr            | Berlin              | 06037 |
      | DE_001 | P84  | 25297 Tannin Cir        | Milton              | 19968 |
      | LA_001 | P86  | 404 Robinhood Cir       | Lafayette           | 70508 |
      | MA_001 | P87  | 79 Wanda St             | Chicopee            | 01013 |
      | MD_001 | P88  | 3535 Smokethorn Ct      | Waldorf             | 20602 |
      | MS_001 | P90  | 107 Pine Ln             | Hattiesburg         | 39402 |
      | NC_001 | P91  | 1914 Mallard Road       | Greenville          | 27858 |
      | NJ_001 | P92  | 160 Ely Ave             | Franklinville       | 08322 |
      | NY_001 | P93  | 74 Cross Country Dr     | Baldwinsville       | 13027 |
      | SC_001 | P94  | 190 Merrimont Dr #55    | Blythewood          | 29016 |
      | VA_001 | P95  | 2695 Zachary Taylor Hwy | Mineral             | 23117 |
      | FL_001 | P96  | 529 Long Lake Dr        | Pensacola           | 32506 |
      | TX_001 | P97  | 16415 LEDGE ROCK ST     | San Antonio         | 78232 |
      | GA_001 | P98  | 20 Anna Pl              | Adairsville         | 30103 |
      | MI_001 | P99  | 5587 Gladecress Dr      | Saginaw             | 48603 |
      | ID_001 | P76  | 3124 Turning Leaf St    | Caldwell            | 83605 |
      | HI_001 | P85  | 1101 Kukulu St UNIT 50  | Kapolei             | 96707 |
      | WY_001 | P81  | 4766 Windmill Rd        | Cheyenne            | 82009 |
      | UT_001 | P76  | 455 Vickie Ln W         | Clearfield          | 84015 |
      | SD_001 | P98  | 217 E 26th St           | Sioux Falls         | 57105 |
      | KS_001 | P83  | 518 Lakewood Rd         | Bonner Springs      | 66012 |
      | MN_001 | P85  | 3992 77th St E          | Inver Grove Heights | 55076 |
      | CO_001 | P79  | 664 Ellen Dr            | Grand Junction      | 81507 |
      | AL_001 | P82  | 9610 Woolrich Ave       | Fairhope            | 36532 |
      | ME_001 | P83  | 17 Virgin Street        | Canton              | 04221 |

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | TX_001 | P97  | 16415 LEDGE ROCK ST     | San Antonio         | 78232 |

  @DE36532 @CC @Disabled
  Scenario Outline: TC_05 "<TC_ID>"| Programs - COC - Verify 'Order Property Details' is not triggering Debug Error when clicked (All States) NB RWT

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    When I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    Then I create a new "CC" quote

    * I think for 10 to 15 seconds
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

       #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |
    Then I navigate to Location Details Page

    Then I set primary address address line 1 to "<Address>"
    * I set primary address city to "<City>"
    * I set primary address ZIP code to "<Zip>"
    * I click save changes button
    Then I set the protection class to ""
    * I think for 5 to 10 seconds

    * I review changes
    * I think for 15 to 20 seconds
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Displayed" on the UI

    Then I click order property details button
    And I think for 15 to 20 seconds
    * I click save changes button
    Then I set the protection class to ""
    * I click save changes button

    Then I review changes
    * I verify if element with message "Risk location address was changed without reordering property details. Please revisit the location coverage page and click the order property details button." is "Not Displayed" on the UI
    * I rate a quote



    Examples:
      | TC_ID  | user | Address                 | City                | Zip   |
      | AR_001 | P77  | 1102 Walker             | Helena              | 72342 |
      | AZ_001 | P78  | 3647 Snead Dr           | Sierra Vista        | 85650 |
      | DC_001 | P80  | 5006 Lee St NE          | Washington          | 20019 |
      | IA_001 | P81  | 27490 450th St          | Moravia             | 52571 |
      | IL_001 | P82  | 306 W Ridge Ave         | Prospect Heights    | 60070 |
      | IN_001 | P82  | 7971 Clearwater Ct      | Indianapolis        | 46256 |
      | KY_001 | P84  | 460 Romans Rd           | London              | 40741 |
      | MO_001 | P86  | 1419 Remington Oaks Ter | Fenton              | 63026 |
      | MT_001 | P87  | 7906 Monad Rd           | Billings            | 59106 |
      | ND_001 | P88  | 4045 Prairie Ln         | Williston           | 58801 |
      | NE_001 | P89  | 16721 X St              | Omaha               | 68135 |
      | NH_001 | P90  | 134 Greenwood Avenue    | Keene               | 03431 |
      | NM_001 | P91  | 4304 Prairie Hill Pl NW | Albuquerque         | 87114 |
      | NV_001 | P92  | 6786 Grandola Dr        | Las Vegas           | 89103 |
      | OH_001 | P93  | 51 Winesap Ct           | Howard              | 43028 |
      | OK_001 | P94  | 15746 N 103rd West Ave  | Skiatook            | 74070 |
      | OR_001 | P95  | 230 Summit Dr           | Heppner             | 97836 |
      | PA_001 | P96  | 2912 Dixon Ave          | Bristol             | 19007 |
      | RI_001 | P97  | 25 Kimberly Ln          | West Warwick        | 02893 |
      | TN_001 | P99  | 1224 Hammett Rd         | Johnson City        | 37615 |
      | VT_001 | P77  | 43 Woodland Drive       | Barre               | 05641 |
      | WA_001 | P78  | 9208 N Oak St           | Spokane             | 99208 |
      | WI_001 | P79  | 8110 Fishman ROAD       | Burlington          | 53105 |
      | WV_001 | P80  | 3442 Reid Ridge Road    | Cameron             | 26033 |
      | CA_001 | P82  | 11110 Sandy Ln          | Apple Valley        | 92308 |
      | CT_001 | P83  | 85 Valley Dr            | Berlin              | 06037 |
      | DE_001 | P84  | 25297 Tannin Cir        | Milton              | 19968 |
      | LA_001 | P86  | 404 Robinhood Cir       | Lafayette           | 70508 |
      | MA_001 | P87  | 79 Wanda St             | Chicopee            | 01013 |
      | MD_001 | P88  | 3535 Smokethorn Ct      | Waldorf             | 20602 |
      | MS_001 | P90  | 107 Pine Ln             | Hattiesburg         | 39402 |
      | NC_001 | P91  | 1914 Mallard Road       | Greenville          | 27858 |
      | NJ_001 | P92  | 160 Ely Ave             | Franklinville       | 08322 |
      | NY_001 | P93  | 74 Cross Country Dr     | Baldwinsville       | 13027 |
      | SC_001 | P94  | 190 Merrimont Dr #55    | Blythewood          | 29016 |
      | VA_001 | P95  | 2695 Zachary Taylor Hwy | Mineral             | 23117 |
      | FL_001 | P96  | 529 Long Lake Dr        | Pensacola           | 32506 |
      | TX_001 | P97  | 16415 LEDGE ROCK ST     | San Antonio         | 78232 |
      | GA_001 | P98  | 20 Anna Pl              | Adairsville         | 30103 |
      | MI_001 | P99  | 5587 Gladecress Dr      | Saginaw             | 48603 |
      | ID_001 | P76  | 3124 Turning Leaf St    | Caldwell            | 83605 |
      | HI_001 | P85  | 1101 Kukulu St UNIT 50  | Kapolei             | 96707 |
      | WY_001 | P81  | 4766 Windmill Rd        | Cheyenne            | 82009 |
      | UT_001 | P76  | 455 Vickie Ln W         | Clearfield          | 84015 |
      | SD_001 | P98  | 217 E 26th St           | Sioux Falls         | 57105 |
      | KS_001 | P83  | 518 Lakewood Rd         | Bonner Springs      | 66012 |
      | MN_001 | P85  | 3992 77th St E          | Inver Grove Heights | 55076 |
      | CO_001 | P79  | 664 Ellen Dr            | Grand Junction      | 81507 |
      | AL_001 | P82  | 9610 Woolrich Ave       | Fairhope            | 36532 |
      | ME_001 | P83  | 17 Virgin Street        | Canton              | 04221 |