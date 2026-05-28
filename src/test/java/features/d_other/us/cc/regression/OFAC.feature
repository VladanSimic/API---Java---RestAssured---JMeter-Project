@CourseOfConstruction @OFAC
Feature: OFAC

  Scenario Outline: OFAC trigger for Customer "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I set "Prefix" to "<customerPrefix>"
    * I set "First_Name" to "<customerFirstName>"
    * I set "MI" to "<customerMI>"
    * I set "Last_Name" to "<customerLastName>"
    * I set "Suffix" to "<customerSuffix>"
    * I set "Date_Of_Birth" to "<customerDOB>"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral with "CCR35" is "triggered"

    Examples:
      | TC_ID  | customerPrefix | customerFirstName | customerMI | customerLastName | customerSuffix | customerDOB |
      | FL_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | AZ_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CO_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CT_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | DE_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | HI_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | ID_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | IL_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MT_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | ME_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MD_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NC_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NJ_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NM_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NV_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NY_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | RI_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | SC_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | OR_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | UT_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | VA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | WA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | WY_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | AR_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | DC_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | IA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | IN_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | KS_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | KY_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MI_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MN_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MO_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MS_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | ND_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NE_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | NH_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | OH_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | OK_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | PA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | SD_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | VT_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | AL_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | GA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | LA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | TN_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | TX_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | WI_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | WV_001 |                | Weihua            |            | WU               |                | 09/06/1956  |

    @RegressionUS
    Examples:
      | TC_ID  | customerPrefix | customerFirstName | customerMI | customerLastName | customerSuffix | customerDOB |
      | FL_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | AZ_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CO_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | CT_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | DE_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | HI_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | ID_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | IL_001 |                | Weihua            |            | WU               |                | 09/06/1956  |
      | MA_001 |                | Weihua            |            | WU               |                | 09/06/1956  |

  Scenario Outline: OFAC trigger additional named insured "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I navigate to "Home Surplus Lines Policy" page
    * I click the add named insured button
    * I think for 2 to 5 seconds
    * I set the additional named insured 1 prefix to "<namedInsuredPrefix>"
    * I set the additional named insured 1 first name to "<namedInsuredFirstName>"
    * I set the additional named insured 1 MI to "<namedInsuredMI>"
    * I set the additional named insured 1 last name to "<namedInsuredLastName>"
    * I set the additional named insured 1 suffix to "<namedInsuredSuffix>"
    * I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral with "CCR35" is "triggered"

    Examples:
      | TC_ID  | namedInsuredPrefix | namedInsuredFirstName | namedInsuredMI | namedInsuredLastName | namedInsuredSuffix |
      | FL_001 |                    | Weihua                |                | WU                   |                    |
      | AZ_001 |                    | Weihua                |                | WU                   |                    |
      | CA_001 |                    | Weihua                |                | WU                   |                    |
      | CO_001 |                    | Weihua                |                | WU                   |                    |
      | CT_001 |                    | Weihua                |                | WU                   |                    |
      | DE_001 |                    | Weihua                |                | WU                   |                    |
      | HI_001 |                    | Weihua                |                | WU                   |                    |
      | ID_001 |                    | Weihua                |                | WU                   |                    |
      | IL_001 |                    | Weihua                |                | WU                   |                    |
      | MA_001 |                    | Weihua                |                | WU                   |                    |
      | MT_001 |                    | Weihua                |                | WU                   |                    |
      | ME_001 |                    | Weihua                |                | WU                   |                    |
      | MD_001 |                    | Weihua                |                | WU                   |                    |
      | NC_001 |                    | Weihua                |                | WU                   |                    |
      | NJ_001 |                    | Weihua                |                | WU                   |                    |
      | NM_001 |                    | Weihua                |                | WU                   |                    |
      | NV_001 |                    | Weihua                |                | WU                   |                    |
      | NY_001 |                    | Weihua                |                | WU                   |                    |
      | RI_001 |                    | Weihua                |                | WU                   |                    |
      | SC_001 |                    | Weihua                |                | WU                   |                    |
      | OR_001 |                    | Weihua                |                | WU                   |                    |
      | UT_001 |                    | Weihua                |                | WU                   |                    |
      | VA_001 |                    | Weihua                |                | WU                   |                    |
      | WA_001 |                    | Weihua                |                | WU                   |                    |
      | WY_001 |                    | Weihua                |                | WU                   |                    |
      | AR_001 |                    | Weihua                |                | WU                   |                    |
      | DC_001 |                    | Weihua                |                | WU                   |                    |
      | IA_001 |                    | Weihua                |                | WU                   |                    |
      | IN_001 |                    | Weihua                |                | WU                   |                    |
      | KS_001 |                    | Weihua                |                | WU                   |                    |
      | KY_001 |                    | Weihua                |                | WU                   |                    |
      | MI_001 |                    | Weihua                |                | WU                   |                    |
      | MN_001 |                    | Weihua                |                | WU                   |                    |
      | MO_001 |                    | Weihua                |                | WU                   |                    |
      | MS_001 |                    | Weihua                |                | WU                   |                    |
      | ND_001 |                    | Weihua                |                | WU                   |                    |
      | NE_001 |                    | Weihua                |                | WU                   |                    |
      | NH_001 |                    | Weihua                |                | WU                   |                    |
      | OH_001 |                    | Weihua                |                | WU                   |                    |
      | OK_001 |                    | Weihua                |                | WU                   |                    |
      | PA_001 |                    | Weihua                |                | WU                   |                    |
      | SD_001 |                    | Weihua                |                | WU                   |                    |
      | VT_001 |                    | Weihua                |                | WU                   |                    |
      | AL_001 |                    | Weihua                |                | WU                   |                    |
      | GA_001 |                    | Weihua                |                | WU                   |                    |
      | LA_001 |                    | Weihua                |                | WU                   |                    |
      | TN_001 |                    | Weihua                |                | WU                   |                    |
      | TX_001 |                    | Weihua                |                | WU                   |                    |
      | WI_001 |                    | Weihua                |                | WU                   |                    |
      | WV_001 |                    | Weihua                |                | WU                   |                    |

    @RegressionUS
    Examples:
      | TC_ID  | namedInsuredPrefix | namedInsuredFirstName | namedInsuredMI | namedInsuredLastName | namedInsuredSuffix |
      | MT_001 |                    | Weihua                |                | WU                   |                    |
      | ME_001 |                    | Weihua                |                | WU                   |                    |
      | MD_001 |                    | Weihua                |                | WU                   |                    |
      | NC_001 |                    | Weihua                |                | WU                   |                    |
      | NJ_001 |                    | Weihua                |                | WU                   |                    |
      | NM_001 |                    | Weihua                |                | WU                   |                    |
      | NV_001 |                    | Weihua                |                | WU                   |                    |
      | NY_001 |                    | Weihua                |                | WU                   |                    |
      | RI_001 |                    | Weihua                |                | WU                   |                    |
      | SC_001 |                    | Weihua                |                | WU                   |                    |

  Scenario Outline: OFAC trigger for Other Legal Entity "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I navigate to "Home Surplus Lines Policy" page
    * I set "Policy_Information_Named_Insured_Type" to "Other Legal Entity"
    * I set the named insured type to "Other Legal Entity"
    * I click create new entity
    * I set the policy information trust llc or other legal entity to "<entityName>"
    * I click save changes button
    * I fill out the trust LLC other legal entity page for CC line of business
    * I rate a quote
    * I navigate to underwriting referrals page
    * I navigate to quotes detail page
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral with "CCR35" is "triggered"

    Examples:
      | TC_ID  | entityName |
      | FL_001 | Weihua WU  |
      | AZ_001 | Weihua WU  |
      | CA_001 | Weihua WU  |
      | CO_001 | Weihua WU  |
      | CT_001 | Weihua WU  |
      | DE_001 | Weihua WU  |
      | HI_001 | Weihua WU  |
      | ID_001 | Weihua WU  |
      | IL_001 | Weihua WU  |
      | MA_001 | Weihua WU  |
      | MT_001 | Weihua WU  |
      | ME_001 | Weihua WU  |
      | MD_001 | Weihua WU  |
      | NC_001 | Weihua WU  |
      | NJ_001 | Weihua WU  |
      | NM_001 | Weihua WU  |
      | NV_001 | Weihua WU  |
      | NY_001 | Weihua WU  |
      | RI_001 | Weihua WU  |
      | SC_001 | Weihua WU  |
      | OR_001 | Weihua WU  |
      | UT_001 | Weihua WU  |
      | VA_001 | Weihua WU  |
      | WA_001 | Weihua WU  |
      | WY_001 | Weihua WU  |
      | AR_001 | Weihua WU  |
      | DC_001 | Weihua WU  |
      | IA_001 | Weihua WU  |
      | IN_001 | Weihua WU  |
      | KS_001 | Weihua WU  |
      | KY_001 | Weihua WU  |
      | MI_001 | Weihua WU  |
      | MN_001 | Weihua WU  |
      | MO_001 | Weihua WU  |
      | MS_001 | Weihua WU  |
      | ND_001 | Weihua WU  |
      | NE_001 | Weihua WU  |
      | NH_001 | Weihua WU  |
      | OH_001 | Weihua WU  |
      | OK_001 | Weihua WU  |
      | PA_001 | Weihua WU  |
      | SD_001 | Weihua WU  |
      | VT_001 | Weihua WU  |
      | AL_001 | Weihua WU  |
      | GA_001 | Weihua WU  |
      | LA_001 | Weihua WU  |
      | TN_001 | Weihua WU  |
      | TX_001 | Weihua WU  |
      | WI_001 | Weihua WU  |
      | WV_001 | Weihua WU  |

    @RegressionUS
    Examples:
      | TC_ID  | entityName |
      | OR_001 | Weihua WU  |
      | UT_001 | Weihua WU  |
      | VA_001 | Weihua WU  |
      | WA_001 | Weihua WU  |
      | WY_001 | Weihua WU  |
      | AR_001 | Weihua WU  |
      | DC_001 | Weihua WU  |
      | IA_001 | Weihua WU  |
      | IN_001 | Weihua WU  |
      | KS_001 | Weihua WU  |

  Scenario Outline: OFAC trigger for Principal Beneficial Owner "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I navigate to "Home Surplus Lines Policy" page
    * I set "Policy_Information_Named_Insured_Type" to "Other Legal Entity"
    * I set the named insured type to "Other Legal Entity"
    * I click create new entity
    * I set the policy information trust llc or other legal entity to "<entityName>"
    * I click save changes button
    * I set "Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_First_Name_1" to "<beneficialOwnersFirstName>"
    * I set "Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_Last_Name_1" to "<beneficialOwnersLastName>"
    * I set "Please_Provide_The_Principal_Beneficial_Owners_Name_Or_Employees_DOB_1" to "<beneficialOwnersDOB>"
    * I fill out the trust LLC other legal entity page for CC line of business
    * I click save changes button
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral with "CCR35" is "triggered"

    Examples:
      | TC_ID  | entityName | beneficialOwnersFirstName | beneficialOwnersLastName | beneficialOwnersDOB |
      | FL_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | AZ_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | CA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | CO_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | CT_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | DE_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | HI_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | ID_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | IL_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MT_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | ME_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MD_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NC_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NJ_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NM_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NV_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NY_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | RI_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | SC_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | OR_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | UT_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | VA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | WA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | WY_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | AR_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | DC_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | IA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | IN_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | KS_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | KY_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MI_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MN_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MO_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MS_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | ND_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NE_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NH_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | OH_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | OK_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | PA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | SD_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | VT_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | AL_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | GA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | LA_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | TN_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | TX_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | WI_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | WV_001 | Test       | Weihua                    | WU                       | 09/06/1956          |

    @RegressionUS
    Examples:
      | TC_ID  | entityName | beneficialOwnersFirstName | beneficialOwnersLastName | beneficialOwnersDOB |
      | KY_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MI_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MN_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MO_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | MS_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | ND_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NE_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | NH_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | OH_001 | Test       | Weihua                    | WU                       | 09/06/1956          |
      | OK_001 | Test       | Weihua                    | WU                       | 09/06/1956          |

  Scenario Outline: OFAC trigger for Additional Interest "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I set "Additional_Interests" to "InterestOFAC_001,"
    * I set "Additional_Interests_Type_1" to "Additional Insured"
    * I set "Additional_Interests_LLC_Trust_1" to "No"
    * I set "Additional_Interests_Name_1" to "Weihua WU"
    * I set "Additional_Interests_Address_Line_1_1" to "1815 E West Pkwy"
    * I set "Additional_Interests_City_1" to "Fleming Island"
    * I set "Additional_Interests_State_1" to "FL"
    * I set "Additional_Interests_ZIP_1" to "32003"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page

    Then I verify that referral with "CCR35" is "triggered"

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

    @RegressionUS
    Examples:
      | TC_ID  |
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