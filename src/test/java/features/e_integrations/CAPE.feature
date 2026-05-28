@CAPE_Integration @AprilRelease_PrePROD
Feature: Send API request to CAPE with parameters

  @CAPE_HO_Single_Location @CAPE_HO
  Scenario Outline: TC_1 - "<TC_ID>" | Homeowners - Single Location

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Optional_Coverages_Earthquake_Loss_Assessment_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Prop_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Landscaping_Increased_Limits" to "No"
    * I set "Optional_Coverages_Loss_Assessment_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Threshold_Increase" to "No"
    * I set "Optional_Coverages_Liability_Extension" to "No"
    * I set "Optional_Coverages_Off_Premises_Other_Structures_Extension" to "No"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Additional_Interests" to ","
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    And I navigate to quotes page
    * I initiate a new quote

#    * I create a new "HO" quote
    * I fill out HO quote cover page
    * I think for 5 to 10 seconds

    * I navigate to Location Details Page

    * I think for 15 to 20 seconds
    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | AddressLine            | City            | Zip   |
      | AK_001 | P86  | 1720 W 104th Ave       | Anchorage       | 99515 |
      | AR_001 | P77  | 3912 SW Capstone Ave   | Bentonville     | 72712 |
      | AZ_001 | P78  | 3037 W Libby St        | Phoenix         | 85053 |
      | DC_001 | P80  | 2038 34th St SE        | Washington      | 20020 |
      | IA_001 | P81  | 613 S Green St         | Madrid          | 50156 |
      | IL_001 | P82  | 1781 Whitcomb Ave      | Des Plaines     | 60018 |
      | IN_001 | P82  | 2007 Sir Richard Rd    | Schererville    | 46375 |
      | KY_001 | P84  | 425 Cabernet Dr        | Vine Grove      | 40175 |
      | MO_001 | P86  | 4906 Mattis Rd         | Saint Louis     | 63128 |
      | MT_001 | P87  | 3905 6th Ave N         | Great Falls     | 59405 |
      | ND_001 | P88  | 3305 Kodiak St NW      | Minot           | 58703 |
      | NE_001 | P89  | 1480 N 9th St          | David City      | 68632 |
      | NH_001 | P90  | 286 Walnut Street      | Manchester      | 03104 |
      | NM_001 | P91  | 7205 Sacate Alto St NW | Albuquerque     | 87120 |
      | NV_001 | P92  | 815 Center St          | Henderson       | 89015 |
      | OH_001 | P93  | 722 Amity Rd           | Galloway        | 43119 |
      | OK_001 | P94  | 11423 E 176th St N     | Collinsville    | 74021 |
      | OR_001 | P95  | 1399 Shady Ln          | Grants Pass     | 97527 |
      | PA_001 | P96  | 15 Riverside Ave       | Lancaster       | 17602 |
      | RI_001 | P97  | 6 Short St             | East Providence | 02914 |
      | TN_001 | P99  | 402 Easley Dr          | Kingsport       | 37664 |
      | VT_001 | P77  | 36 Lavoie Drive        | Essex Junction  | 05452 |
      | WA_001 | P78  | 3212 Semilla Ct        | Pasco           | 99301 |
      | WI_001 | P79  | 4040 Lindstrom Ln      | Stevens Point   | 54482 |
      | WV_001 | P80  | 179 Ambrosia Ln        | Martinsburg     | 25405 |
      | CA_001 | P82  | 2246 Greely Dr         | Marysville      | 95901 |
      | CT_001 | P83  | 12 August Rd           | Simsbury        | 06070 |
      | DE_001 | P84  | 56 Brookview Ave       | Camden Wyoming  | 19934 |
      | LA_001 | P86  | 633 Camelia Ave        | Baton Rouge     | 70806 |
      | MA_001 | P87  | 195 Susan Dr           | Westfield       | 01085 |
      | MD_001 | P88  | 19523 Spring Valley Dr | Hagerstown      | 21742 |
      | MS_001 | P90  | 5366 Red Fox Rd        | Jackson         | 39211 |
      | NC_001 | P91  | 3333 Brucemont Drive   | Wilmington      | 28405 |
      | NJ_001 | P92  | 233 Roberts Ave        | Bellmawr        | 08031 |
      | NY_001 | P93  | 1054 Theodore Road     | Schenectady     | 12303 |
      | SC_001 | P94  | 202 Crestwood Dr       | Summerville     | 29483 |
      | VA_001 | P95  | 301 Archers Mead       | Williamsburg    | 23185 |
      | FL_001 | P96  | 4458 Goldenrain Ct     | Orlando         | 32808 |
      | TX_001 | P97  | 7019 Pinetex Dr        | Humble          | 77396 |
      | GA_001 | P98  | 4778 Pebble Trce       | Buford          | 30518 |
      | MI_001 | P99  | 21631 Cloverlawn St    | Oak Park        | 48237 |
      | ID_001 | P76  | 42 N Greenleaf St      | Nampa           | 83651 |

  @CAPE_HO_Single_Location @CAPE_HO
  Scenario Outline: TC_1 - "<TC_ID>" | Homeowners - Single Location

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Optional_Coverages_Earthquake_Loss_Assessment_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Prop_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Landscaping_Increased_Limits" to "No"
    * I set "Optional_Coverages_Loss_Assessment_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Threshold_Increase" to "No"
    * I set "Optional_Coverages_Liability_Extension" to "No"
    * I set "Optional_Coverages_Off_Premises_Other_Structures_Extension" to "No"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Additional_Interests" to ","

    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote

#    * I create a new "HO" quote
    * I fill out HO quote cover page
    * I think for 5 to 10 seconds

    * I navigate to Location Details Page

    * I think for 15 to 20 seconds
    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"
    Examples:
      | TC_ID  | user | AddressLine           | City           | Zip   |
      | HI_001 | P85  | 82 Upper Kimo Dr      | Kula           | 96790 |
      | WY_001 | P81  | 6480 Timberline Ct    | Casper         | 82604 |
      | UT_001 | P76  | 2041 E Granite Ln N   | Eagle Mountain | 84005 |
      | SD_001 | P98  | 1790 Lawnridge Ave SE | Huron          | 57350 |
      | KS_001 | P83  | 1312 Miller Ave       | Dodge City     | 67801 |
      | MN_001 | P85  | 1797 Hyacinth Ave E   | Saint Paul     | 55119 |
      | CO_001 | P85  | 180 N Holcomb St      | Castle Rock    | 80104 |
      | AL_001 | P82  | 229 Countrywood Ct    | Harvest        | 35749 |
      | ME_001 | P89  | 72 Brown Street       | Kennebunk      | 04043 |


  @CAPE_HO_Multiple_Locations @CAPE_HO
  Scenario Outline: TC_2 - "<TC_ID>" | Homeowners - Multiple Locations NB

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Optional_Coverages_Earthquake_Loss_Assessment_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Prop_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Landscaping_Increased_Limits" to "No"
    * I set "Optional_Coverages_Loss_Assessment_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Threshold_Increase" to "No"
    * I set "Optional_Coverages_Liability_Extension" to "No"
    * I set "Optional_Coverages_Off_Premises_Other_Structures_Extension" to "No"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Additional_Interests" to ","

    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote

#    * I create a new "HO" quote
    * I fill out HO quote cover page

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           |        | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city    | state   | zip    | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address1>   | <city1> | <state> | <zip1> | Homeowner     | 1000000 |           | <aop>  | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I navigate to location page
    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 3                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | aop  | ded                  | address                 | city             | zip   | state | address1                  | city1            | zip1  |
      | AR_001 | P77  | 2500 | 2%                   | 1102 Walker             | Helena           | 72342 | AR    | 4193 Cambridge Court      | Fort Smith       | 72901 |
      | AZ_001 | P78  | 2500 |                      | 3647 Snead Dr           | Sierra Vista     | 85650 | AZ    | 448 Martha Street         | Lechee           | 86515 |
      | DC_001 | P80  | 2500 |                      | 5006 Lee St NE          | Washington       | 20019 | DC    | 1173 Rhode Island Avenue  | Washington       | 20005 |
      | IA_001 | P81  | 2500 | 2%                   | 27490 450th St          | Moravia          | 52571 | IA    | 1886 Centennial Farm Road | Carroll          | 51401 |
      | IL_001 | P82  | 2500 | 2%                   | 306 W Ridge Ave         | Prospect Heights | 60070 | IL    | 785 Hickman Street        | Burr Ridge       | 60527 |
      | IN_001 | P82  | 2500 | 2%                   | 7971 Clearwater Ct      | Indianapolis     | 46256 | IN    | 17 Conaway Street         | Bloomington      | 47408 |
      | KY_001 | P84  | 2500 | 2%                   | 460 Romans Rd           | London           | 40741 | KY    | 4271 Zappia Drive         | Lexington        | 40507 |
      | MO_001 | P86  | 2500 | 2%                   | 1419 Remington Oaks Ter | Fenton           | 63026 | MO    | 1187 Blair Court          | La Belle         | 63447 |
      | MT_001 | P87  | 2500 | 2%                   | 7906 Monad Rd           | Billings         | 59106 | MT    | 108 Masonic Drive         | Lavina           | 59046 |
      | ND_001 | P88  | 2500 | 2%                   | 4045 Prairie Ln         | Williston        | 58801 | ND    | 3513 1st St N             | Fargo            | 58102 |
      | NE_001 | P89  | 2500 | 2%                   | 16721 X St              | Omaha            | 68135 | NE    | 4988 Kyle Street          | Grand Island     | 68801 |
      | NH_001 | P90  | 2500 | 2%                   | 134 Greenwood Avenue    | Keene            | 03431 | NH    | 4442 Grasselli Street     | Bedford          | 03102 |
      | NM_001 | P91  | 2500 | 2%                   | 4304 Prairie Hill Pl NW | Albuquerque      | 87114 | NM    | 1605 Bird Street          | Deming           | 88030 |
      | NV_001 | P92  | 2500 |                      | 6786 Grandola Dr        | Las Vegas        | 89103 | NV    | 481 Mesa Drive            | Las Vegas        | 89104 |
      | OH_001 | P93  | 2500 | 2%                   | 51 Winesap Ct           | Howard           | 43028 | OH    | 976 Ralph Drive           | Garfield Heights | 44125 |
      | OK_001 | P94  | 2500 | 2%                   | 15746 N 103rd West Ave  | Skiatook         | 74070 | OK    | 1833 Simpson Square       | Oklahoma City    | 73102 |
      | OR_001 | P95  | 2500 |                      | 230 Summit Dr           | Heppner          | 97836 | OR    | 2195 Seneca Drive         | Portland         | 97232 |
      | PA_001 | P96  | 2500 |                      | 2912 Dixon Ave          | Bristol          | 19007 | PA    | 863 Quincy Street         | Philadelphia     | 19103 |
      | RI_001 | P97  | 2500 | Not Available        | 25 Kimberly Ln          | West Warwick     | 02893 | RI    | 4624 Winding Way          | Woonsocket       | 02895 |
      | TN_001 | P99  | 2500 | 2%                   | 1224 Hammett Rd         | Johnson City     | 37615 | TN    | 3600 Burton Avenue        | Memphis          | 38117 |
      | VT_001 | P77  | 2500 |                      | 43 Woodland Drive       | Barre            | 05641 | VT    | 3290 Essex Court          | Brattleboro      | 05301 |
      | WA_001 | P78  | 2500 | 1                    | 9208 N Oak St           | Spokane          | 99208 | WA    | 4564 Mutton Town Road     | Coupeville       | 98239 |
      | WI_001 | P79  | 2500 | 2%                   | 8110 Fishman ROAD       | Burlington       | 53105 | WI    | 2545 Dark Hollow Road     | Hollandale       | 53544 |
      | WV_001 | P80  | 2500 |                      | 3442 Reid Ridge Road    | Cameron          | 26033 | WV    | 2443 Augusta Park         | Bluefield        | 24701 |
      | CA_001 | P82  | 2500 | 5000                 | 11110 Sandy Ln          | Apple Valley     | 92308 | CA    | 342 Chicago Avenue        | Fresno           | 93721 |
      | CT_001 | P83  | 2500 | 3%                   | 85 Valley Dr            | Berlin           | 06037 | CT    | 708 Maxwell Street        | Niantic          | 06357 |
      | DE_001 | P84  | 2500 | 2.0%                 | 25297 Tannin Cir        | Milton           | 19968 | DE    | 4996 Callison Lane        | New Castle       | 19720 |
      | LA_001 | P86  | 2500 | 5%                   | 404 Robinhood Cir       | Lafayette        | 70508 | LA    | 4154 Wood Street          | Luling           | 70070 |
      | MA_001 | P87  | 2500 | Not Available        | 79 Wanda St             | Chicopee         | 01013 | MA    | 4349 Trouser Leg Road     | Springfield      | 01103 |
      | MD_001 | P88  | 2500 | 2%                   | 3535 Smokethorn Ct      | Waldorf          | 20602 | MD    | 17706 Garden Spot Dr      | Hagerstown       | 21740 |
      | MS_001 | P90  | 2500 | 2%                   | 107 Pine Ln             | Hattiesburg      | 39402 | MS    | 66 Longstone Rd           | Hattiesburg      | 39402 |
##      | NC_001 | P91  |  | Not Available        | 1914 Mallard Road       | Greenville       | 27858 | NC    | 4247 Layman Avenue              | Dunn             | 28334 |
      | NJ_001 | P92  | 2500 | Not Available        | 160 Ely Ave             | Franklinville    | 08322 | NJ    | 2440 Walnut Avenue        | Rochelle Park    | 07662 |
      | NY_001 | P93  | 2500 | Not Available        | 74 Cross Country Dr     | Baldwinsville    | 13027 | NY    | 3747 Turkey Pen Road      | Huntington       | 11743 |
      | SC_001 | P94  | 2500 | 2500                 | 190 Merrimont Dr #55    | Blythewood       | 29016 | SC    | 3217 Mill Street          | Anderson         | 29621 |
      | VA_001 | P95  | 2500 | N/A - AOP Deductible | 2695 Zachary Taylor Hwy | Mineral          | 23117 | VA    | 4078 Douglas Dairy Road   | Martinsville     | 24112 |
      | FL_001 | P96  | 2500 | 2%                   | 529 Long Lake Dr        | Pensacola        | 32506 | FL    | 452 Everette Alley        | Sunrise          | 33351 |
      | TX_001 | P97  | 2500 | 2%                   | 16415 LEDGE ROCK ST     | San Antonio      | 78232 | TX    | 3828 Short Street         | Austin           | 78741 |
      | GA_001 | P98  | 2500 | 2%                   | 20 Anna Pl              | Adairsville      | 30103 | GA    | 2247 Edington Drive       | Atlanta          | 30303 |
      | MI_001 | P99  | 2500 | 2%                   | 5587 Gladecress Dr      | Saginaw          | 48603 | MI    | 3545 Tuna Street          | Flint            | 48505 |
      | ID_001 | P76  | 2500 |                      | 3124 Turning Leaf St    | Caldwell         | 83605 | ID    | 4850 Poplar Chase Lane    | Boise            | 83702 |
      | AK_001 | P86  | 2500 | 2%                   | 7310 E 17th Ave         | Anchorage        | 99504 | AK    | 10833 E Twin Peaks Ct     | Palmer           | 99645 |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | TC_ID  | user | aop  | ded           | address              | city          | zip   | state | address1             | city1      | zip1  |
      | SC_001 | P94  | 2500 | 1%            | 190 Merrimont Dr #55 | Blythewood    | 29016 | SC    | 3217 Mill Street     | Anderson   | 29621 |
      | NY_001 | P93  | 2500 | Not Available | 74 Cross Country Dr  | Baldwinsville | 13027 | NY    | 3747 Turkey Pen Road | Huntington | 11743 |


  @CAPE_HO_Multiple_Locations @CAPE_HO
  Scenario Outline: TC_2 - "<TC_ID>" | Homeowners - Multiple Locations NB

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote

    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city    | state   | zip    | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address1>   | <city1> | <state> | <zip1> | Homeowner     | 1000000 |           | 2,500  | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city    | state   | zip    | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address2>   | <city2> | <state> | <zip2> | Homeowner     | 1000000 |           | 2,500  | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 3                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | ded                  | AddressLine            | City                | Zip   | address1                   | city1       | zip1  | state | address2             | city2      | zip2  |
      | HI_001 | P85  | 10%                  | 1101 Kukulu St UNIT 50 | Kapolei             | 96707 | 75-123 Lunapule Rd APT 206 | Kailua Kona | 96740 | HI    | 120 Stratford Drive  | Kealakekua | 96750 |
      | WY_001 | P81  | 2%                   | 4766 Windmill Rd       | Cheyenne            | 82009 | 1675 Coughlin St           | Laramie     | 82072 | WY    | 829 Thorn Street     | Gillette   | 82716 |
      | UT_001 | P76  |                      | 455 Vickie Ln W        | Clearfield          | 84015 | 876 N 2500 E               | Ballard     | 84066 | UT    | 3463 Lang Avenue     | Logan      | 84321 |
      | SD_001 | P98  | 2%                   | 217 E 26th St          | Sioux Falls         | 57105 | 1126 N Division Ave        | Madison     | 57042 | SD    | 4636 Andy Street     | Tolstoy    | 57475 |
      | KS_001 | P83  | 2%                   | 518 Lakewood Rd        | Bonner Springs      | 66012 | 405 Pasadena Dr            | Lawrence    | 66049 | KS    | 1307 Hummingbird Way | Topeka     | 66607 |
      | MN_001 | P85  | 2%                   | 3992 77th St E         | Inver Grove Heights | 55076 | 3459 Bridgeview Dr SE      | Rochester   | 55904 | MN    | 3310 Sugar Camp Road | Owatonna   | 55060 |
      | CO_001 | P79  | 2%                   | 664 Ellen Dr           | Grand Junction      | 81507 | 7209 W 18th St             | Greeley     | 80634 | CO    | 4249 Shobe Lane      | Denver     | 80216 |
      | AL_001 | P82  | NA - AOP Ded Applies | 9610 Woolrich Ave      | Fairhope            | 36532 | 17163 Feder Dr             | Foley       | 36535 | AL    | 3080 Broad Street    | Hueytown   | 35023 |
      | ME_001 | P89  | 2%                   | 17 Virgin Street       | Canton              | 04221 | 142 Baxter Avenue          | Auburn      | 04210 | ME    | 3865 Victoria Court  | Woodland   | 04694 |


  @CAPE_HO_Multiple_Locations @Condo
  Scenario Outline: TC_3 - "<TC_ID>" | Homeowners - Condo/Co-op - Two Locations NB

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Optional_Coverages_Earthquake_Loss_Assessment_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Prop_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Landscaping_Increased_Limits" to "No"
    * I set "Optional_Coverages_Loss_Assessment_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Threshold_Increase" to "No"
    * I set "Optional_Coverages_Liability_Extension" to "No"
    * I set "Optional_Coverages_Off_Premises_Other_Structures_Extension" to "No"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Additional_Interests" to ","
    * I set "Residence_Type" to "Condo/Co-op"
    * I set "Loss_Of_Use" to "100000"
    * I set "Hurr_Ded" to "Not Available"


    * I set Effective Date to Today
    And I navigate to quotes page
    * I initiate a new quote

#    * I create a new "HO" quote
    * I fill out HO quote cover page

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Condo/Co-op   | 1000000 |           | 2,500  | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"


    Examples:
      | TC_ID  | user | ded           | address                 | city             | zip   | state |
      | AR_001 | P77  | 2%            | 1102 Walker             | Helena           | 72342 | AR    |
      | AZ_001 | P78  |               | 3647 Snead Dr           | Sierra Vista     | 85650 | AZ    |
      | DC_001 | P80  |               | 5006 Lee St NE          | Washington       | 20019 | DC    |
      | IA_001 | P81  | 2%            | 27490 450th St          | Moravia          | 52571 | IA    |
      | IL_001 | P82  | 2%            | 306 W Ridge Ave         | Prospect Heights | 60070 | IL    |
      | IN_001 | P82  | 2%            | 7971 Clearwater Ct      | Indianapolis     | 46256 | IN    |
      | KY_001 | P84  | 2%            | 460 Romans Rd           | London           | 40741 | KY    |
      | MO_001 | P86  | 2%            | 1419 Remington Oaks Ter | Fenton           | 63026 | MO    |
      | MT_001 | P87  | 2%            | 7906 Monad Rd           | Billings         | 59106 | MT    |
      | ND_001 | P88  | 2%            | 4045 Prairie Ln         | Williston        | 58801 | ND    |
      | NE_001 | P89  | 2%            | 16721 X St              | Omaha            | 68135 | NE    |
      | NH_001 | P90  | 2%            | 134 Greenwood Avenue    | Keene            | 03431 | NH    |
      | NM_001 | P91  | 2%            | 4304 Prairie Hill Pl NW | Albuquerque      | 87114 | NM    |
      | NV_001 | P92  |               | 6786 Grandola Dr        | Las Vegas        | 89103 | NV    |
      | OH_001 | P93  | 2%            | 51 Winesap Ct           | Howard           | 43028 | OH    |
      | OK_001 | P94  | 2%            | 15746 N 103rd West Ave  | Skiatook         | 74070 | OK    |
      | OR_001 | P95  |               | 230 Summit Dr           | Heppner          | 97836 | OR    |
      | PA_001 | P96  |               | 2912 Dixon Ave          | Bristol          | 19007 | PA    |
      | RI_001 | P97  | Not Available | 25 Kimberly Ln          | West Warwick     | 02893 | RI    |
      | TN_001 | P99  |               | 1224 Hammett Rd         | Johnson City     | 37615 | TN    |
      | VT_001 | P77  |               | 43 Woodland Drive       | Barre            | 05641 | VT    |
      | WA_001 | P78  | 1             | 9208 N Oak St           | Spokane          | 99208 | WA    |
      | WI_001 | P79  | 2%            | 8110 Fishman ROAD       | Burlington       | 53105 | WI    |
      | WV_001 | P80  |               | 3442 Reid Ridge Road    | Cameron          | 26033 | WV    |
      | CA_001 | P82  | 5000          | 11110 Sandy Ln          | Apple Valley     | 92308 | CA    |
      | CT_001 | P83  | Not Available | 85 Valley Dr            | Berlin           | 06037 | CT    |
      | DE_001 | P84  | 2.0%          | 25297 Tannin Cir        | Milton           | 19968 | DE    |
      | LA_001 | P86  | 5%            | 404 Robinhood Cir       | Lafayette        | 70508 | LA    |
      | MA_001 | P87  | Not Available | 79 Wanda St             | Chicopee         | 01013 | MA    |
      | MD_001 | P88  | 2%            | 3535 Smokethorn Ct      | Waldorf          | 20602 | MD    |
      | MS_001 | P90  | 2%            | 107 Pine Ln             | Hattiesburg      | 39402 | MS    |
#      | NC_001 | P91  | Not Available        | 1914 Mallard Road       | Greenville       | 27858 | NC    |
      | NJ_001 | P92  | Not Available | 160 Ely Ave             | Franklinville    | 08322 | NJ    |
      | NY_001 | P93  | Not Available | 74 Cross Country Dr     | Baldwinsville    | 13027 | NY    |
      | SC_001 | P94  | 2500          | 190 Merrimont Dr #55    | Blythewood       | 29016 | SC    |
      | VA_001 | P95  |               | 2695 Zachary Taylor Hwy | Mineral          | 23117 | VA    |
      | FL_001 | P96  | 2%            | 529 Long Lake Dr        | Pensacola        | 32506 | FL    |
      | TX_001 | P97  | 2%            | 16415 LEDGE ROCK ST     | San Antonio      | 78232 | TX    |
      | GA_001 | P98  | 2%            | 20 Anna Pl              | Adairsville      | 30103 | GA    |
      | MI_001 | P99  |               | 5587 Gladecress Dr      | Saginaw          | 48603 | MI    |
      | ID_001 | P76  |               | 3124 Turning Leaf St    | Caldwell         | 83605 | ID    |
      | AK_001 | P86  | 2%            | 7310 E 17th Ave         | Anchorage        | 99504 | AK    |

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | ded | address             | city        | zip   | state |
      | TX_001 | P97  | 2%  | 16415 LEDGE ROCK ST | San Antonio | 78232 | TX    |

  @CAPE_HO_Multiple_Locations @Condo
  Scenario Outline: TC_3 - "<TC_ID>" | Homeowners - Condo/Co-op - Two Locations NB

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data
    When I am logged in to Pure as "<user>"
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set Effective Date to Today
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Optional_Coverages_Earthquake_Loss_Assessment_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Extension" to "No"
    * I set "Optional_Coverages_Business_Property_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Prop_Increase" to "No"
    * I set "Optional_Coverages_Ensuing_Fungi_Increase" to "No"
    * I set "Optional_Coverages_Landscaping_Increased_Limits" to "No"
    * I set "Optional_Coverages_Loss_Assessment_Increase" to "No"
    * I set "Optional_Coverages_Incidental_Business_Threshold_Increase" to "No"
    * I set "Optional_Coverages_Liability_Extension" to "No"
    * I set "Optional_Coverages_Off_Premises_Other_Structures_Extension" to "No"
    * I set "Optional_Coverages_Canine_Liability_Exclusion" to "No"
    * I set "Additional_Interests" to ","
    * I set "Residence_Type" to "Condo/Co-op"

    And I navigate to quotes page
    * I initiate a new quote
#    * I create a new "HO" quote
    * I fill out HO quote cover page

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city    | state   | zip    | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address1>   | <city1> | <state> | <zip1> | Condo/Co-op   | 1000000 |           | 2,500  | <ded>      |


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I think for 25 to 30 seconds
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"


    Examples:
      | TC_ID  | user | ded                  | AddressLine            | City                | Zip   | address1                   | city1       | zip1  | state |
      | HI_001 | P85  | 10%                  | 1101 Kukulu St UNIT 50 | Kapolei             | 96707 | 75-123 Lunapule Rd APT 206 | Kailua Kona | 96740 | HI    |
      | WY_001 | P81  | 2%                   | 4766 Windmill Rd       | Cheyenne            | 82009 | 1675 Coughlin St           | Laramie     | 82072 | WY    |
      | UT_001 | P76  |                      | 455 Vickie Ln W        | Clearfield          | 84015 | 876 N 2500 E               | Ballard     | 84066 | UT    |
      | SD_001 | P98  | 2%                   | 217 E 26th St          | Sioux Falls         | 57105 | 1126 N Division Ave        | Madison     | 57042 | SD    |
      | KS_001 | P83  | 2%                   | 518 Lakewood Rd        | Bonner Springs      | 66012 | 405 Pasadena Dr            | Lawrence    | 66049 | KS    |
      | MN_001 | P85  | 2%                   | 3992 77th St E         | Inver Grove Heights | 55076 | 3459 Bridgeview Dr SE      | Rochester   | 55904 | MN    |
      | CO_001 | P79  | 2%                   | 664 Ellen Dr           | Grand Junction      | 81507 | 7209 W 18th St             | Greeley     | 80634 | CO    |
      | AL_001 | P82  | NA - AOP Ded Applies | 9610 Woolrich Ave      | Fairhope            | 36532 | 17163 Feder Dr             | Foley       | 36535 | AL    |
      | ME_001 | P89  | 2%                   | 17 Virgin Street       | Canton              | 04221 | 142 Baxter Avenue          | Auburn      | 04210 | ME    |


  @CAPE_HO @CAPE_HO_Multiple_Locations
  Scenario Outline: TC_4 "<TC_ID>" | Homeowners - adding a location on EN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response


    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           | 2,500  | <ded>      |

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | ded                  | address                 | city             | zip   | state |
      | AR_001 | P77  | 2%                   | 1102 Walker             | Helena           | 72342 | AR    |
      | AZ_001 | P78  |                      | 3647 Snead Dr           | Sierra Vista     | 85650 | AZ    |
      | DC_001 | P80  |                      | 5006 Lee St NE          | Washington       | 20019 | DC    |
      | IA_001 | P81  | 2%                   | 27490 450th St          | Moravia          | 52571 | IA    |
      | IL_001 | P82  | 2%                   | 306 W Ridge Ave         | Prospect Heights | 60070 | IL    |
      | IN_001 | P82  | 2%                   | 7971 Clearwater Ct      | Indianapolis     | 46256 | IN    |
      | KY_001 | P84  | 2%                   | 460 Romans Rd           | London           | 40741 | KY    |
      | MO_001 | P86  | 2%                   | 1419 Remington Oaks Ter | Fenton           | 63026 | MO    |
      | MT_001 | P87  | 2%                   | 7906 Monad Rd           | Billings         | 59106 | MT    |
      | ND_001 | P88  | 2%                   | 4045 Prairie Ln         | Williston        | 58801 | ND    |
      | NE_001 | P89  | 2%                   | 16721 X St              | Omaha            | 68135 | NE    |
      | NH_001 | P90  | 2%                   | 134 Greenwood Avenue    | Keene            | 03431 | NH    |
      | NM_001 | P91  | 2%                   | 4304 Prairie Hill Pl NW | Albuquerque      | 87114 | NM    |
      | NV_001 | P92  |                      | 6786 Grandola Dr        | Las Vegas        | 89103 | NV    |
      | OH_001 | P93  | 2%                   | 51 Winesap Ct           | Howard           | 43028 | OH    |
      | OK_001 | P94  | 2%                   | 15746 N 103rd West Ave  | Skiatook         | 74070 | OK    |
      | OR_001 | P95  |                      | 230 Summit Dr           | Heppner          | 97836 | OR    |
      | PA_001 | P96  |                      | 2912 Dixon Ave          | Bristol          | 19007 | PA    |
      | RI_001 | P97  | Not Available        | 357 Chapmans Ave        | Warwick          | 02886 | RI    |
      | TN_001 | P99  | 2%                   | 1224 Hammett Rd         | Johnson City     | 37615 | TN    |
      | VT_001 | P77  |                      | 43 Woodland Drive       | Barre            | 05641 | VT    |
      | WA_001 | P78  | 1                    | 9208 N Oak St           | Spokane          | 99208 | WA    |
      | WI_001 | P79  | 2%                   | 8110 Fishman ROAD       | Burlington       | 53105 | WI    |
      | WV_001 | P80  |                      | 3442 Reid Ridge Road    | Cameron          | 26033 | WV    |
      | CA_001 | P82  | 5000                 | 13715 Mesa View Dr      | Victorville      | 92392 | CA    |
      | CT_001 | P83  | 3%                   | 85 Valley Dr            | Berlin           | 06037 | CT    |
      | DE_001 | P84  | 2.0%                 | 25297 Tannin Cir        | Milton           | 19968 | DE    |
      | LA_001 | P86  | 5%                   | 404 Robinhood Cir       | Lafayette        | 70508 | LA    |
      | MA_001 | P87  | Not Available        | 79 Wanda St             | Chicopee         | 01013 | MA    |
      | MD_001 | P88  | 2%                   | 3535 Smokethorn Ct      | Waldorf          | 20602 | MD    |
      | MS_001 | P90  | 2%                   | 107 Pine Ln             | Hattiesburg      | 39402 | MS    |
      | NC_001 | P91  | Not Available        | 1914 Mallard Road       | Greenville       | 27858 | NC    |
      | NJ_001 | P92  | Not Available        | 160 Ely Ave             | Franklinville    | 08322 | NJ    |
      | NY_001 | P93  | Not Available        | 74 Cross Country Dr     | Baldwinsville    | 13027 | NY    |
      | SC_001 | P94  | 2%                   | 1708 Old Georgia Hwy    | Gaffney          | 29340 | SC    |
      | VA_001 | P95  | N/A - AOP Deductible | 2695 Zachary Taylor Hwy | Mineral          | 23117 | VA    |
      | FL_001 | P96  | 2%                   | 529 Long Lake Dr        | Pensacola        | 32506 | FL    |
      | TX_001 | P97  | 2%                   | 16415 LEDGE ROCK ST     | San Antonio      | 78232 | TX    |
      | GA_001 | P98  | 2%                   | 20 Anna Pl              | Adairsville      | 30103 | GA    |
      | MI_001 | P99  | 2%                   | 5587 Gladecress Dr      | Saginaw          | 48603 | MI    |
      | ID_001 | P76  |                      | 3124 Turning Leaf St    | Caldwell         | 83605 | ID    |
      | AK_001 | P86  | 2%                   | 7310 E 17th Ave         | Anchorage        | 99504 | AK    |

    @FUllRegression_DreamTeam
    Examples:
      | TC_ID  | user | ded | address          | city      | zip   | state |
      | FL_001 | P96  | 2%  | 529 Long Lake Dr | Pensacola | 32506 | FL    |
      | WA_001 | P78  | 1   | 9208 N Oak St    | Spokane   | 99208 | WA    |

  @CAPE_HO @CAPE_HO_Multiple_Locations
  Scenario Outline: TC_4 "<TC_ID>" | Homeowners - adding a location on EN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"

    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response


    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           | 2,500  | <ded>      |

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | ded                  | AddressLine            | City                | Zip   | address                    | city        | zip   | state |
      | HI_001 | P85  | 10%                  | 1101 Kukulu St UNIT 50 | Kapolei             | 96707 | 75-123 Lunapule Rd APT 206 | Kailua Kona | 96740 | HI    |
      | WY_001 | P81  | 2%                   | 4766 Windmill Rd       | Cheyenne            | 82009 | 1675 Coughlin St           | Laramie     | 82072 | WY    |
      | UT_001 | P76  |                      | 455 Vickie Ln W        | Clearfield          | 84015 | 876 N 2500 E               | Ballard     | 84066 | UT    |
      | SD_001 | P98  | 2%                   | 217 E 26th St          | Sioux Falls         | 57105 | 1126 N Division Ave        | Madison     | 57042 | SD    |
      | KS_001 | P83  | 2%                   | 518 Lakewood Rd        | Bonner Springs      | 66012 | 405 Pasadena Dr            | Lawrence    | 66049 | KS    |
      | MN_001 | P85  | 2%                   | 3992 77th St E         | Inver Grove Heights | 55076 | 3459 Bridgeview Dr SE      | Rochester   | 55904 | MN    |
      | CO_001 | P79  | 2%                   | 664 Ellen Dr           | Grand Junction      | 81507 | 7209 W 18th St             | Greeley     | 80634 | CO    |
      | AL_001 | P82  | NA - AOP Ded Applies | 9610 Woolrich Ave      | Fairhope            | 36532 | 17163 Feder Dr             | Foley       | 36535 | AL    |
      | ME_001 | P89  | 2%                   | 17 Virgin Street       | Canton              | 04221 | 142 Baxter Avenue          | Auburn      | 04210 | ME    |

  @CAPE_HO  @CAPE_HO_Multiple_Locations @AprilRelease_PrePROD
  Scenario Outline: TC_5 - "<TC_ID>" | Homeowners adding a location on RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response
    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 10 to 15 seconds
    * I navigate to policy image page

    * I think for 15 to 20 seconds
    * I navigate to Location Details Page
    * I think for 10 to 15 seconds
    * I click order property details button
    * I think for 25 to 35 seconds


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           |        | <ded>      |

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 3                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | ded                  | address                     | city                 | zip   | state |
      | AR_001 | P77  | 2%                   | 29 Leicester Dr             | Bella Vista          | 72714 | AR    |
      | AZ_001 | P78  |                      | 6414 E Sheridan St          | Scottsdale           | 85257 | AZ    |
      | DC_001 | P80  |                      | 6231 Piney Branch Rd NW     | Washington           | 20011 | DC    |
      | IA_001 | P81  | 2%                   | 2449 Highway 13             | Marion               | 52302 | IA    |
      | IL_001 | P82  | 2%                   | 306 W Ridge Ave             | Prospect Heights     | 60070 | IL    |
      | IN_001 | P82  | 2%                   | 269 Heritage Dr             | Danville             | 46122 | IN    |
      | KY_001 | P84  | 2%                   | 4230 Rudy Ln                | Saint Matthews       | 40207 | KY    |
      | MO_001 | P86  | 2%                   | 205 E Dauxville Dr          | Richmond             | 64085 | MO    |
      | MT_001 | P87  | 2%                   | 7906 Monad Rd 2844 Cline Rd | Billings             | 59105 | MT    |
      | ND_001 | P88  | 2%                   | 202 Cleveland St            | Enderlin             | 58027 | ND    |
      | NE_001 | P89  | 2%                   | 1502 1st Corso              | Nebraska City        | 68410 | NE    |
      | NH_001 | P90  | 2%                   | 51 E Derry Road             | Derry                | 03038 | NH    |
      | NM_001 | P91  | 2%                   | 679 Chaps Rd SE             | Rio Rancho           | 87124 | NM    |
      | NV_001 | P92  |                      | 2060 Hamilton Creek Trl     | Elko                 | 89801 | NV    |
      | OH_001 | P93  | 2%                   | 160 Kinsey Rd               | Xenia                | 45385 | OH    |
      | OK_001 | P94  | 2%                   | 2907 Blue Sage Ct           | Woodward             | 73801 | OK    |
      | OR_001 | P95  |                      | 7315 N Chautauqua Blvd      | Portland             | 97217 | OR    |
      | PA_001 | P96  |                      | 164 Browns Pond Rd          | Dushore              | 18614 | PA    |
      | RI_001 | P97  | Not Available        | 42 Nelson Rd                | Cranston             | 02921 | RI    |
      | TN_001 | P99  | 2%                   | 1050 Briar Ct               | Talbott              | 37877 | TN    |
      | VT_001 | P77  |                      | 104 Chimney Hill Drive      | Colchester           | 05446 | VT    |
      | WA_001 | P78  | 1                    | 116 N 31st Ave              | Yakima               | 98902 | WA    |
      | WI_001 | P79  | 2%                   | 9801 South Fox RUN          | Oak Creek            | 53154 | WI    |
      | WV_001 | P80  |                      | 933 Rio Hills Dr            | Delray               | 26714 | WV    |
      | CA_001 | P82  |                      | 18642 Pad Ct                | Santa Clarita        | 91321 | CA    |
      | CT_001 | P83  | 3%                   | 13 Denison Rd               | Somers               | 06071 | CT    |
      | DE_001 | P84  | 2.0%                 | 29957 Pine Run Cir          | Millsboro            | 19966 | DE    |
      | LA_001 | P86  | 5%                   | 2355 Poplarwood Dr          | Baton Rouge          | 70816 | LA    |
      | MA_001 | P87  | Not Available        | 30 Dresser Hill Rd          | Dudley               | 01571 | MA    |
      | MD_001 | P88  | 2%                   | 112 Springside Dr           | Lutherville Timonium | 21093 | MD    |
      | MS_001 | P90  | 2.0%                 | 7124 Smith Rd               | Long Beach           | 39560 | MS    |
      | NC_001 | P91  | Not Available        | 1914 Mallard Road           | Greenville           | 27858 | NC    |
      | NJ_001 | P92  | Not Available        | 226 Park Pl                 | Audubon              | 08106 | NJ    |
      | NY_001 | P93  | Not Available        | 204 Alton St                | Syracuse             | 13215 | NY    |
      | SC_001 | P94  | 2%                   | 2125 Nance St               | Newberry             | 29108 | SC    |
      | VA_001 | P95  | N/A - AOP Deductible | 1141 Arden Dr               | Charlottesville      | 22902 | VA    |
      | FL_001 | P96  | 2%                   | 61 Cypress Blvd W           | Homosassa            | 34446 | FL    |
      | TX_001 | P97  | 2%                   | 12710 Ashford Meadow Dr     | Houston              | 77082 | TX    |
      | GA_001 | P98  | 2%                   | 3999 Craggy Perch           | Douglasville         | 30135 | GA    |
      | MI_001 | P99  | 2%                   | 31430 Pierce St             | Garden City          | 48135 | MI    |
      | ID_001 | P76  |                      | 310 Linden Dr               | Idaho Falls          | 83401 | ID    |
      | AK_001 | P86  | 2%                   | 1720 W 104th Ave            | Anchorage            | 99515 | AK    |

    @FullRegression_DreamTeam @ReRun2
    Examples:
      | TC_ID  | user | ded  | address                 | city            | zip   | state |
      | TX_001 | P97  | 2%   | 12710 Ashford Meadow Dr | Houston         | 77082 | TX    |
      | CA_001 | P82  | 5000 | 1604 Monterey St        | San Luis Obispo | 93401 | CA    |

  @CAPE_HO @CAPE_HO_Multiple_Locations @AprilRelease_PrePROD
  Scenario Outline: TC_5 - "<TC_ID>" | Homeowners adding a location on RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"


    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 5 to 10 seconds
    * I navigate to policy image page

    * I navigate to Location Details Page
    * I think for 5 to 10 seconds
    * I click order property details button
    * I think for 15 to 20 seconds

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details only
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           | 2,500  | <ded>      |

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 3                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | ded                  | AddressLine            | City                | Zip   | address                 | city           | zip   | state |
      | HI_001 | P85  | 10%                  | 1101 Kukulu St UNIT 50 | Kapolei             | 96707 | 91-1065 Koanimakani St  | Kapolei        | 96707 | HI    |
      | WY_001 | P81  | 2%                   | 4766 Windmill Rd       | Cheyenne            | 82009 | 2392 Shattuck Ave       | Casper         | 82601 | WY    |
      | UT_001 | P76  |                      | 455 Vickie Ln W        | Clearfield          | 84015 | 2148 E Bendamere Cir    | Salt Lake City | 84109 | UT    |
      | SD_001 | P98  | 2%                   | 217 E 26th St          | Sioux Falls         | 57105 | 610 Maple St            | Yankton        | 57078 | SD    |
      | KS_001 | P83  | 2%                   | 518 Lakewood Rd        | Bonner Springs      | 66012 | 1704 Ranser Rd          | Manhattan      | 66502 | KS    |
      | MN_001 | P85  | 2%                   | 3992 77th St E         | Inver Grove Heights | 55076 | 5425 Weatherstone Dr NW | Rochester      | 55901 | MN    |
      | CO_001 | P79  | 2%                   | 664 Ellen Dr           | Grand Junction      | 81507 | 7209 W 18th St          | Greeley        | 80634 | CO    |
      | AL_001 | P82  | NA - AOP Ded Applies | 9610 Woolrich Ave      | Fairhope            | 36532 | 102 Gradic Ln           | Dothan         | 36305 | AL    |
      | ME_001 | P89  | 2%                   | 17 Virgin Street       | Canton              | 04221 | 83 Webster Avenue       | Bangor         | 04401 | ME    |


  @CAPE_HS @STG_CAPE @AprilRelease_PrePROD
  Scenario Outline: TC_6 "<TC_ID>" | Home Surplus Lines - Single Location - NB / EN / RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    And I navigate to transactions or endorsements
    And I initiate new endorsement

    * I navigate to Home Surplus Lines Policy Page

    * I navigate to Location Details Page

    * I click order property details button
    * I think for 15 to 20 seconds

    Then I fill out Basic Construction Details HS

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I think for 10 to 15 seconds
    * I review changes
    * I rate an endorsement
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    Then I issue an endorsement

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page

    * I navigate to Home Surplus Lines Policy Page

    * I think for 10 to 15 seconds
    * I navigate to Location Details Page
    * I think for 10 to 15 seconds

    * I click order property details button
    * I think for 10 to 15 seconds

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Examples:
      | TC_ID  | user | yesOrNo |
      | AL_001 | P3   |         |
      | AZ_001 | P16  |         |
      | CA_001 | P4   |         |
      | CO_001 | P15  |         |
      | FL_001 | P12  | No      |
      | GA_001 | P5   |         |
      | HI_001 | P20  |         |
      | LA_001 | P6   |         |
      | MA_001 | P7   |         |
      | MS_001 | P2   |         |
      | MT_001 | P17  |         |
      | NJ_001 | P9   |         |
      | NY_001 | P97  |         |
      | SC_001 | P8   |         |
      | NC_001 | P10  |         |
      | TX_001 | P11  |         |
      | UT_001 | P18  |         |
      | WY_001 | P19  |         |

    @FullRegression_DreamTeam @ReRun
    Examples:
      | TC_ID  | user | yesOrNo |
      | LA_001 | P6   |         |
      | FL_001 | P12  | No      |

  @CAPE_CC @SingleLocation @Endorsement @Renewal @AprilRelease_PrePROD
  Scenario Outline: TC_7 "<TC_ID>" | Course Of Construction  - CC Single Location NB / EN / PE

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "<user>"
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""
    Then I set "Project_Type_When_Did_It_Start" to "03/01/2025"
    Then I set "Project_Type_Expiration_Date" to "10/01/2025"
    Then I set "Construction_Details_Planned_Enclosure_Date" to "05/10/2025"
    Then I set "Construction_Details_Planned_Completion_Date" to "09/10/2025"


    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "CC" quote

    * I navigate to Location Details Page
    * I think for 10 to 15 seconds
    * I click order property details button
    * I think for 10 to 15 seconds
    Then I set the protection class to ""

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"


    * I rate a quote
    * I think for 10 to 15 seconds

    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

    * I navigate to transactions or endorsements
    * I initiate new endorsement

    * I navigate to Location Details Page
    * I think for 10 to 15 seconds
    * I click order property details button
    * I think for 10 to 15 seconds
    * I click save changes button
    * I think for 5 to 10 seconds
    Then I set the protection class to ""

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |

    * I review changes
    * I rate an endorsement

    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension

    * I navigate to Location Details Page
    * I think for 10 to 15 seconds
    * I click order property details button
    * I think for 5 to 10 seconds

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | 61a4f90f-e379-453d-b53b-26e4023c6a36 |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

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
      | ME_001 | P89  |

    Examples:
      | TC_ID  | user |
      | MA_001 | P87  |
      | LA_001 | P86  |

  @CAPE_CC @SingleLocation @NewBusiness @AprilRelease_PrePROD
  Scenario Outline: TC_8 "<TC_ID>" | Course Of Construction  - CC Location Changed NB

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set Effective Date to Today
    When I am logged in to Pure as "<user>"
    Then I set "Project_Address_Risk_Address_1" to ""
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to ""
    Then I set "Project_Address_ZIP" to ""

    Then I set "Project_Type_When_Did_It_Start" to "03/01/2025"
    Then I set "Project_Type_Expiration_Date" to "10/01/2025"
    Then I set "Construction_Details_Planned_Enclosure_Date" to "05/10/2025"
    Then I set "Construction_Details_Planned_Completion_Date" to "09/10/2025"


    * I navigate to quotes page
    * I initiate a new quote

    * I fill out the policy page for CC line of business
    * I fill out the basic location page for CC line of business

#    Then I navigate to Location Details Page
    * I click order property details button
    * I think for 5 to 10 seconds


    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I set "Project_Address_Risk_Address_1" to "<AddressLine>"
    Then I set "Project_Address_Risk_Address_2" to ""
    Then I set "Project_Address_City" to "<City>"
    Then I set "Project_Address_ZIP" to "<Zip>"

    * I think for 5 to 10 seconds
    * I navigate to Home Surplus Lines Policy Page
    * I think for 10 to 15 seconds
    * I fill out the basic location page for CC line of business
    * I click order property details button
    * I think for 10 to 15 seconds

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |

    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"


    Examples:
      | TC_ID  | user | AddressLine             | City                | Zip   |
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
      | ME_001 | P89  | 17 Virgin Street        | Canton              | 04221 |

    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | AddressLine    | City         | Zip   |
      | CA_001 | P82  | 11110 Sandy Ln | Apple Valley | 92308 |
      | WA_001 | P78  | 9208 N Oak St  | Spokane      | 99208 |

  @CAPE_HS @ReRunCape2 @RerunRegressionApril
  Scenario Outline: TC_9 "<TC_ID>" | Home Surplus Lines - Single Location

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"

    * I set Effective Date to Today
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"
    * I set "Risk_Addresses_Named_Storm_Ded" to "<namedStormDed>"
    * I set "Risk_Addresses_Hail_Deductible" to "<hailDed>"


    And I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    
#    * I fill out HS quote cover page

    * I navigate to Location Details Page
    * I write text to "Foundation Type" and value is "<FT>"
    * I write text to "Distance to Coast override" and value is "<DTC>"

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

#    * I select "<yesOrNo>" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
#    * I navigate to Location Details Page
#    * I select "<yesOrNo>" for "Is this location listed on national, state, or local register of historic places?" on ""
#    * I rate a quote
#    * I think for 10 to 15 seconds
#    * I navigate to underwriting referrals page
#    * I accept underwriting referrals
#    Then I bind a quote


    Examples:
      | TC_ID  | user | yesOrNo | AddressLine                | City       | Zip   | namedStormDed         | hailDed | DTC       | FT                           |
      | AL_001 | P3   |         | 2201 Irongate Ct           | Mobile     | 36695 | 5%                    | 5%      |           |                              |
      | AZ_001 | P16  |         | 6371 S Reed Bunting Dr     | Tucson     | 85757 | 5%                    | 5%      |           |                              |
      | CA_001 | P4   |         | 816 Alene Ave              | Ridgecrest | 93555 | 5%                    | 5%      |           |                              |
      | CO_001 | P15  |         | 3700 S Sherman Street      | Englewood  | 80113 | 5%                    | 5%      |           |                              |
      | FL_001 | P2   | No      | 1752 Annie Penton Rd       | Jay        | 32565 | 5%                    | 5%      | > 5 miles | Slab and Split-Level on Slab |
      | GA_001 | P5   |         | 70 Gibson Dr               | Carrollton | 30117 | N/A - AOP Ded Applies | 5%      |           |                              |
      | HI_001 | P20  |         | 2771 Kamehameha V Hwy      | Kaunakakai | 96748 | 5%                    | 5%      |           |                              |
      | LA_001 | P6   |         | 4265 Wilderness Run Dr     | Zachary    | 70791 | 5%                    | 5%      |           |                              |
      | MA_001 | P7   |         | 70 Pine St                 | Milford    | 01757 | 5%                    | 5%      |           |                              |
      | MS_001 | P2   |         | 537 Green Head Cir         | Brandon    | 39047 | N/A - AOP Ded Applies | 5%      |           |                              |
      | MT_001 | P17  |         | 619 W Galena St            | Butte      | 59701 | 5%                    | 5%      |           |                              |
      | NJ_001 | P9   |         | 119 Milford Avenue UNIT 55 | Whiting    | 08759 | 5%                    | 5%      |           |                              |
      | NY_001 | P97  |         | 96 A St                    | Depew      | 14043 | 5%                    | 5%      |           |                              |
      | SC_001 | P8   |         | 2899 Dbar Cir              | Sumter     | 29154 | 5%                    | 5%      |           |                              |
      | NC_001 | P10  |         | 316 Cambridge Drive        | Tarboro    | 27886 | 5%                    | 5%      |           |                              |
      | TX_001 | P11  |         | 5018 Glenhaven Dr          | Baytown    | 77521 | 5%                    | 5%      |           |                              |
      | UT_001 | P18  |         | 634 N 400 E                | Price      | 84501 | 5%                    | 5%      |           |                              |
      | WY_001 | P19  |         | 2703 Foothills Rd          | Cheyenne   | 82009 | 5%                    | 5%      |           |                              |
    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user | yesOrNo | AddressLine          | City | Zip   | namedStormDed | hailDed | DTC       | FT                           |
      | FL_001 | P2   | No      | 1752 Annie Penton Rd | Jay  | 32565 | 5%            | 5%      | > 5 miles | Slab and Split-Level on Slab |

  @CAPE_HO @CAPE_HO_Two_Locations @RerunRegressionApril @AprilRelease_PrePROD
  Scenario Outline: TC_10 - "<TC_ID>" | Homeowners New Business Two Location, verify 2 new calls on create RN button

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today

    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           | 2,500  | <ded>      |

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 20 to 25 seconds

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 4                |


    Examples:
      | TC_ID  | user | ded                  | address                     | city                 | zip   | state |
      | AR_001 | P77  | 2%                   | 29 Leicester Dr             | Bella Vista          | 72714 | AR    |
      | AZ_001 | P78  |                      | 6414 E Sheridan St          | Scottsdale           | 85257 | AZ    |
      | DC_001 | P80  |                      | 6231 Piney Branch Rd NW     | Washington           | 20011 | DC    |
      | IA_001 | P81  | 2%                   | 2449 Highway 13             | Marion               | 52302 | IA    |
      | IL_001 | P82  | 2%                   | 306 W Ridge Ave             | Prospect Heights     | 60070 | IL    |
      | IN_001 | P82  | 2%                   | 269 Heritage Dr             | Danville             | 46122 | IN    |
      | KY_001 | P84  | 2%                   | 4230 Rudy Ln                | Saint Matthews       | 40207 | KY    |
      | MO_001 | P86  | 2%                   | 205 E Dauxville Dr          | Richmond             | 64085 | MO    |
      | MT_001 | P87  | 2%                   | 7906 Monad Rd 2844 Cline Rd | Billings             | 59105 | MT    |
      | ND_001 | P88  | 2%                   | 202 Cleveland St            | Enderlin             | 58027 | ND    |
      | NE_001 | P89  | 2%                   | 1502 1st Corso              | Nebraska City        | 68410 | NE    |
      | NH_001 | P90  | 2%                   | 51 E Derry Road             | Derry                | 03038 | NH    |
      | NM_001 | P91  | 2%                   | 679 Chaps Rd SE             | Rio Rancho           | 87124 | NM    |
      | NV_001 | P92  |                      | 2060 Hamilton Creek Trl     | Elko                 | 89801 | NV    |
      | OH_001 | P93  | 2%                   | 160 Kinsey Rd               | Xenia                | 45385 | OH    |
      | OK_001 | P94  | 2%                   | 2907 Blue Sage Ct           | Woodward             | 73801 | OK    |
      | OR_001 | P95  |                      | 7315 N Chautauqua Blvd      | Portland             | 97217 | OR    |
      | PA_001 | P96  |                      | 164 Browns Pond Rd          | Dushore              | 18614 | PA    |
      | RI_001 | P97  | Not Available        | 42 Nelson Rd                | Cranston             | 02921 | RI    |
      | TN_001 | P99  | 2%                   | 1050 Briar Ct               | Talbott              | 37877 | TN    |
      | VT_001 | P77  |                      | 104 Chimney Hill Drive      | Colchester           | 05446 | VT    |
      | WA_001 | P78  | 1                    | 116 N 31st Ave              | Yakima               | 98902 | WA    |
      | WI_001 | P79  | 2%                   | 9801 South Fox RUN          | Oak Creek            | 53154 | WI    |
      | WV_001 | P80  |                      | 933 Rio Hills Dr            | Delray               | 26714 | WV    |
      | CA_001 | P82  | 5000                 | 18642 Pad Ct                | Santa Clarita        | 91321 | CA    |
      | CT_001 | P83  | 3%                   | 13 Denison Rd               | Somers               | 06071 | CT    |
      | DE_001 | P84  | 2.0%                 | 29957 Pine Run Cir          | Millsboro            | 19966 | DE    |
      | LA_001 | P86  | 5%                   | 2355 Poplarwood Dr          | Baton Rouge          | 70816 | LA    |
      | MA_001 | P87  | Not Available        | 30 Dresser Hill Rd          | Dudley               | 01571 | MA    |
      | MD_001 | P88  | 2%                   | 112 Springside Dr           | Lutherville Timonium | 21093 | MD    |
      | MS_001 | P90  | 2.0%                 | 7124 Smith Rd               | Long Beach           | 39560 | MS    |
      | NC_001 | P91  | Not Available        | 1914 Mallard Road           | Greenville           | 27858 | NC    |
      | NJ_001 | P92  | Not Available        | 226 Park Pl                 | Audubon              | 08106 | NJ    |
      | NY_001 | P93  | Not Available        | 204 Alton St                | Syracuse             | 13215 | NY    |
      | SC_001 | P94  | 2%                   | 2125 Nance St               | Newberry             | 29108 | SC    |
      | VA_001 | P95  | N/A - AOP Deductible | 1141 Arden Dr               | Charlottesville      | 22902 | VA    |
      | FL_001 | P96  | 2%                   | 61 Cypress Blvd W           | Homosassa            | 34446 | FL    |
      | TX_001 | P97  | 2%                   | 12710 Ashford Meadow Dr     | Houston              | 77082 | TX    |
      | GA_001 | P98  | 2%                   | 3999 Craggy Perch           | Douglasville         | 30135 | GA    |
      | MI_001 | P99  | 2%                   | 31430 Pierce St             | Garden City          | 48135 | MI    |
      | ID_001 | P76  |                      | 310 Linden Dr               | Idaho Falls          | 83401 | ID    |
      | AK_001 | P86  | 2%                   | 1720 W 104th Ave            | Anchorage            | 99515 | AK    |


  @CAPE_HO @CAPE_HO_Two_Locations @AprilRelease_PrePROD
  Scenario Outline: TC_10 - "<TC_ID>" | Homeowners New Business Two Location, verify 2 new calls on create RN button

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHO" sheet

    * I load random user data

    When I am logged in to Pure as "<user>"
    * I set Effective Date to Today
    * I set "Address_Line_1_Txt" to "<AddressLine>"
    * I set "City_Name_Txt" to "<City>"
    * I set "Zip_Code" to "<Zip>"


    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 1                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1 | city   | state   | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | <address>    | <city> | <state> | <zip> | Homeowner     | 1000000 |           | 2,500  | <ded>      |

    * I navigate to Location Details Page

    Given the API request is prepared with the following details:
      | baseUrl                                                  | api                                  |
      | https://flow.capeanalytics.com/api/v2/describe_location? | dc9d5dba-3d1e-4f54-91a6-7c94361508dd |

    When I send the request to the API and verify status 200 and save JSON response

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 2                |
##
    * I execute the query and save response
      | query | column                | state   |
      | cape  | MESSAGE_RESPONSE_TEXT | <TC_ID> |

    * I compare the API response for state "<TC_ID>"

    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    And I think for 30 to 45 seconds
    When I override subjectivities

    And I navigate to transactions or endorsements
    And I create a renewal
    * I think for 45 to 50 seconds

    * I execute the query and verify job status
      | query | column     | status | expectedRequests |
      | cape  | JOB_STATUS | 3      | 4                |
    * I set all referrals to yes

    Examples:
      | TC_ID  | user | ded                  | AddressLine            | City                | Zip   | address                 | city           | zip   | state |
      | HI_001 | P85  | 10%                  | 1101 Kukulu St UNIT 50 | Kapolei             | 96707 | 16-2072 Bamboo Dr       | Pahoa          | 96778 | HI    |
      | WY_001 | P81  | 2%                   | 4766 Windmill Rd       | Cheyenne            | 82009 | 2392 Shattuck Ave       | Casper         | 82601 | WY    |
      | UT_001 | P76  |                      | 455 Vickie Ln W        | Clearfield          | 84015 | 2148 E Bendamere Cir    | Salt Lake City | 84109 | UT    |
      | SD_001 | P98  | 2%                   | 217 E 26th St          | Sioux Falls         | 57105 | 610 Maple St            | Yankton        | 57078 | SD    |
      | KS_001 | P83  | 2%                   | 518 Lakewood Rd        | Bonner Springs      | 66012 | 1704 Ranser Rd          | Manhattan      | 66502 | KS    |
      | MN_001 | P85  | 2%                   | 3992 77th St E         | Inver Grove Heights | 55076 | 5425 Weatherstone Dr NW | Rochester      | 55901 | MN    |
      | CO_001 | P79  | 2%                   | 664 Ellen Dr           | Grand Junction      | 81507 | 7209 W 18th St          | Greeley        | 80634 | CO    |
      | AL_001 | P82  | NA - AOP Ded Applies | 9610 Woolrich Ave      | Fairhope            | 36532 | 102 Gradic Ln           | Dothan         | 36305 | AL    |
      | ME_001 | P89  | 2%                   | 17 Virgin Street       | Canton              | 04221 | 83 Webster Avenue       | Bangor         | 04401 | ME    |


