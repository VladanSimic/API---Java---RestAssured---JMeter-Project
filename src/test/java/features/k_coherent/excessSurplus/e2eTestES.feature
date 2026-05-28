@CoherentExcessSurplus
Feature: End to End Test Suite for Excess Surplus Coherent Project

  Scenario Outline: "<TC_ID>" - Scenario 1,3 - Verify that prior to feature date Dragon rating is being used
  Verify that when on inforce policies that are rated using Dragon rating. When Renewal is created post feature date, policies will convert to Coherent rating for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario1"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario1_3a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    And I create a renewal
    * I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario1_3b"

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 10/01/2025    |
#      | CT_001 | 10/01/2025    |
#      | MA_001 | 10/01/2025    |
#      | TX_001 | 10/01/2025    |
#      | FL_001 | 10/01/2025    |
#      | SC_001 | 10/01/2025    |
#      | NC_001 | 10/01/2025    |
#      | NJ_001 | 10/01/2025    |
#      | MS_001 | 10/01/2025    |
#      | LA_001 | 10/01/2025    |
#      | AL_001 | 10/01/2025    |
#      | GA_001 | 10/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 2,4,5,26,27 - Verify that after the feature date Coherent rating is being used,
  Verify that External Rate Details link is visible on premium details page -
  Verify that premium elements on premium summary page are displayed correctly  (Grand Total, State Mandated Assessments, Total Premium, Surplus Contribution) for Excess Surplus
  Verify that when non-premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario2_27"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario2_27a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I verify that the new Coherent rating is used "Scenario2_27b"

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 12/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 6,11 - Verify that when premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating for Excess Surplus
  Verify OOS endorsement is working as expected for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario6_11"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario6_11a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement

    Then I verify that the new Coherent rating is used "Scenario6_11b"

    When I click exit button
    * I issue an endorsement

    When I initiate new oos endorsement
    * I add changes on OOS "ES" endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario6_11c"

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 12/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 7 - Verify NBRW (New Business pre feature date, Rewrite post feature date) for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario7"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario7a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 12/01/2025 |

#    When I add changes on "ES" new business rewrite
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario7b"

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 8 - Verify that Reinstatement transaction is using Dragon rating before feature date for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario8"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario8a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create reinstatement transaction

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 12/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 9 - Verify Flat Rate Cancellation functionality after Coherent feature date for Excess Surplus is working as expected

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario7"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario9a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    Then I verify "FlatRate" cancellation premium

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 12/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 10 - Verify Pro Rate Cancellation functionality after Coherent feature date for Excess Surplus is working as expected

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario7"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario10a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method   | reason         | MEP | reason |
      | Company | Today | Cancellation test | Pro-Rate | Cancel Rewrite |     |        |

    Then I verify "ProRate" cancellation premium

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 12 - Verify OOS for premium bearing endorsement is working as expected on Renewal roll forward for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario12"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario12a"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    * I create a renewal
    * I review changes
    * I click renewed premium
    * I review and accept referrals on renewal if any
    * I process a renewal
    * I navigate to transactions or endorsements

    And I initiate new oos endorsement
    * I review changes
    * I rate an endorsement
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario12b"
    * I click exit button
    * I issue an endorsement

    Then I click roll forward
    * the status of "Renewal" transaction 1 should be "PolicyTransactionProcessed"

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 13, 21, 22, 23, 24 - Verify all Manuscript Endorsement types after Coherent feature date for Excess Surplus
  Verify that rating is successful for all vehicle types and watercrafts for Excess Surplus
  Verify that rating is successful for all locations under Property Information  for Excess Surplus
  Verify that rating is working correctly for all Liability Limits for Excess Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario13_24"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario13_24"

    #update data
    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 28 - Verify Flat Rate Cancellation functionality before Coherent feature date for Excess Surplus is working as expected

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario28"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario28"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    Then I verify "FlatRate" cancellation premium

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10/01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |

  Scenario Outline:  "<TC_ID>" - Scenario 29 - Verify Pro Rate Cancellation functionality before Coherent feature date for Excess Surplus is working as expected

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I load random user data

    When I am logged in to Pure as Zonal
    * I set "First_Name" to "Scenario29"
    * I set "Last_Name" to "ES-E2E-<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"

    And I navigate to quotes page
    * I initiate a new quote

    Then I create a new "ES" quote
    * I rate a quote

    Then I verify that the rating was successfully completed
    #add other elements from premium summary
    * I verify that the premium is calculated and displayed on Premium Summary page
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario29"

    Then I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote

    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method   | reason         | MEP | reason |
      | Company | Today | Cancellation test | Pro-Rate | Cancel Rewrite |     |        |

    Then I verify "ProRate" cancellation premium

    Examples:
      | TC_ID  | effectiveDate |
      | NY_002 | 10 /01/2025    |
#      | CA_001 | 12/01/2025    |
#      | CT_001 | 12/01/2025    |
#      | MA_001 | 12/01/2025    |
#      | TX_001 | 12/01/2025    |
#      | FL_001 | 12/01/2025    |
#      | SC_001 | 12/01/2025    |
#      | NC_001 | 12/01/2025    |
#      | NJ_001 | 12/01/2025    |
#      | MS_001 | 12/01/2025    |
#      | LA_001 | 12/01/2025    |
#      | AL_001 | 12/01/2025    |
#      | GA_001 | 12/01/2025    |