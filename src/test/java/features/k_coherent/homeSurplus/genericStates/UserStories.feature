Feature:User Stories Automation for Generic Home Surplus States

  @Coherent @MultipleLocation @CoherentStories
  Scenario Outline: More than one location validation

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "MultipleLocation"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Home Surplus Lines Policy" page
    * I click add additional risk addresses

    And I verify error message is shown "Home Surplus cannot have more than 1 location."

    @Mississi
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      # | GA_001 | 07/01/2025    |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 07/01/2025    |
      | MT_001 | 07/01/2025    |
      | WY_001 | 07/01/2025    |
      | UT_001 | 07/01/2025    |

  @Coherent @MultipleLocation @CoherentStories
  Scenario Outline: More than one location validation

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "Generic<TC_ID>"
    * I set "Last_Name" to "MultipleLocation"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Rating"

    Then I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 07/15/2025 |

    When I add changes on "HS" new business rewrite
    * I navigate to "Home Surplus Lines Policy" page
    * I click add additional risk addresses

    And I verify error message is shown "Home Surplus cannot have more than 1 location."

    @Mississi
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 06/01/2025    |
      # | GA_001 | 06/01/2025    |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 06/01/2025    |
      | MT_001 | 06/01/2025    |
      | WY_001 | 06/01/2025    |
      | UT_001 | 06/01/2025    |


  @Coherent @OOSReferral @CoherentStories
  Scenario Outline: Verify that referral is triggered when OOS transaction is created in the previous term

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "ReferralOOS"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "NewBusinessRate"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "RenewalRate"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "EndorsementRate"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I navigate to underwriting referrals page

    Then I verify that referral "2649639" is "triggered"

    @Mississi
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 07/01/2025    | 07/11/2025       |
      # | GA_001 | 07/01/2025    | 07/11/2025       |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 07/01/2025    | 07/11/2025       |
      | MT_001 | 07/01/2025    | 07/11/2025       |
      | WY_001 | 07/01/2025    | 07/11/2025       |
      | UT_001 | 07/01/2025    | 07/11/2025       |

  @Coherent @AggregationConcern @CoherentStories @CoherentStoriesRegression
  Scenario Outline: Verify that Aggregation Concern field is displayed

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "AggregationConcern"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "ROL and Premium Information" page

    Then I verify if element with message "Aggregation Concern" is "Displayed" on the UI

    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      | GA_001 | 07/01/2025    |
      | AZ_001 | 07/01/2025    |
      | MT_001 | 07/01/2025    |
      | WY_001 | 07/01/2025    |
      | UT_001 | 07/01/2025    |
      | HI_001 | 07/01/2025    |
      | CO_001 | 07/01/2025    |
      | TX_001 | 07/01/2025    |
      | LA_001 | 07/01/2025    |
      | AL_001 | 07/01/2025    |
#      | RI_001 | 07/01/2025    |
#      | CT_001 | 07/01/2025    |

  @Coherent @AggregationConcern @CoherentStories
  Scenario Outline: Verify that Aggregation Concern field is not displayed prior to feature date

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "AggregationConcern"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "ROL and Premium Information" page

    Then I verify if element with message "Aggregation Concern" is "Not Displayed" on the UI

    @Mississi
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 05/01/2025    |
      # | GA_001 | 05/01/2025    |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 06/01/2025    |
      | MT_001 | 06/01/2025    |
      | WY_001 | 06/01/2025    |
      | UT_001 | 06/01/2025    |

  @Coherent @ExtremePPC @CoherentStories
  Scenario Outline: Verify that Extreme 10 PPC Value is added to the PPC Dropdown

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "ExtremePPC"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Construction_Details_Extreme_10_Protection_Class" to "Yes"
    * I set "Construction_Details_Protection_Class_Override" to "Yes"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to location page
    * I click dropdown "Protection Class Override"

    * I verify dropdown values
      | values     |
      | - Select - |
      | 1          |
      | 2          |
      | 3          |
      | 4          |
      | 5          |
      | 6          |
      | 7          |
      | 8          |
      | 9          |
      | 10         |
      | Extreme 10 |

    @Mississi
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      # | GA_001 | 07/01/2025    |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 07/01/2025    |
      | MT_001 | 07/01/2025    |
      | WY_001 | 07/01/2025    |
      | UT_001 | 07/01/2025    |

  @Coherent @ExtremePPC @CoherentStories
  Scenario Outline: Verify that Extreme 10 PPC Value is added to the PPC Dropdown

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "Generic<TC_ID>"
    * I set "Last_Name" to "ExtremePPC"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Construction_Details_Extreme_10_Protection_Class" to "Yes"
    * I set "Construction_Details_Protection_Class_Override" to "Yes"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Rate"

    Then I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date       |
      | Notes | 07/15/2025 |

    When I add changes on "HS" new business rewrite
    * I navigate to "Home Surplus Lines Policy" page
    * I navigate to location page
    * I click dropdown "Protection Class Override"

    * I verify dropdown values
      | values     |
      | - Select - |
      | 1          |
      | 2          |
      | 3          |
      | 4          |
      | 5          |
      | 6          |
      | 7          |
      | 8          |
      | 9          |
      | 10         |
      | Extreme 10 |

    @Mississi
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      # | GA_001 | 07/01/2025    |
    @WYUTMTAZ
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 07/01/2025    |
      | MT_001 | 07/01/2025    |
      | WY_001 | 07/01/2025    |
      | UT_001 | 07/01/2025    |

  @HomeownersSurplus @DeductibleScenarios @ExternalRateDetails @CoherentStories
  Scenario Outline: - Verify that Deductible Scenarios button is visible on the UI and verify that External Rate Details link is not displayed prior to feature date

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I set "Effective_Date" to "<effectiveDate>"
    * I navigate to quotes page
    * I initiate a new quote
    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then I verify if element with message "deductible scenarios" is "Displayed" on the UI
    * I navigate to premium details page

    Then I verify if element with message "External Rate Details" is "Not Displayed" on the UI
      
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 05/01/2025    |
      | GA_001 | 05/01/2025    |
      | AZ_001 | 05/01/2025    |
      | MT_001 | 05/01/2025    |
      | WY_001 | 05/01/2025    |
      | UT_001 | 05/01/2025    |
      | HI_001 | 05/01/2025    |
      | CO_001 | 05/01/2025    |
      | TX_001 | 05/01/2025    |
      | LA_001 | 05/01/2025    |
      | AL_001 | 05/01/2025    |
#      | RI_001 | 05/01/2025    |
#      | CT_001 | 05/01/2025    |
    
  @Coherent @DeductibleScenarios @ExternalRateDetails @CoherentStories @CoherentStoriesRegression
  Scenario Outline: Verify that Coherent rating is not failed, Deductible Scenarios button is not visible on the UI and verify that External Rate Details link is displayed

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I load random user data
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I set "Effective_Date" to "<effectiveDate>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then I verify if element with message "deductible scenarios" is "Not Displayed" on the UI
    * I navigate to premium details page
    Then I verify if element with message "External Rate Details" is "Displayed" on the UI
    * I return to premium summary page

    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      | GA_001 | 07/01/2025    |
      | AZ_001 | 07/01/2025    |
      | MT_001 | 07/01/2025    |
      | WY_001 | 07/01/2025    |
      | UT_001 | 07/01/2025    |
      | HI_001 | 07/01/2025    |
      | CO_001 | 07/01/2025    |
      | TX_001 | 07/01/2025    |
      | LA_001 | 07/01/2025    |
      | AL_001 | 07/01/2025    |
#      | RI_001 | 07/01/2025    |
#      | CT_001 | 07/01/2025    |