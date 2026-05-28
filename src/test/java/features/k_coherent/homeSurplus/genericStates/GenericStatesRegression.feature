Feature: Homeowners Surplus Coherent Generic States Regression - Generic States HI, CO, TX, LA, RI, CT, AL, UT, WY, MT, MS, GA

#  @Coherent @GenericStates @CoherentRegression
  Scenario Outline: "<TC_ID>" Regression Scenario 1 - Verify that UI is displaying everything correctly after Coherent feature date for Generic States Home Surplus Lines Homeowners/Condo residence type, Verify that when NB is created post pd filing date, Coherent is being used as rating vendor for Mississippi Home Surplus Lines Homeowners residence type
    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Regression"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID
    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Risk Model Information" page through the Tree
    * I verify block "Premium and ROL Summary" exists
    * I rate a quote

    Then I verify that the rating was successfully completed
    * I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "

    Then I navigate to premium details page
    * I verify that the new Coherent rating is used "CoherentRate"



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
      | RI_001 | 07/01/2025    |
      | CT_001 | 07/01/2025    |
      | AL_001 | 07/01/2025    |

#  @Coherent @GenericStates @CoherentRegression
  Scenario Outline: "<TC_ID>" Regression scenario 2 => Verify that when NB is created pre pd filing date, Dragon is being used for rating for Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Regression"
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

    Then I verify that the old Dragon rating is used "Dragon Rate"

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

  @Coherent @GenericStates @CoherentRegression
  Scenario Outline: "<TC_ID>" Scenario 3 => Verify that when on inforce policies using dragon rating Renewal is created post feature date, policies will convert to Coherent rating

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Regression"
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

    Then I verify that the old Dragon rating is used "DragonRate"

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

    Then I verify that the new Coherent rating is used "ConversionRate"

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

  @Coherent @GenericStates @CoherentRegression
  Scenario Outline: "<TC_ID>" Regression Scenario 4 => Verify that when premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Regression"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Liability_Coverages_Personal_Liability_Limit_END" to "500,000"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "New Rate"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I navigate to Home Surplus Lines Policy Page
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "New Rate"

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 07/01/2025    | 07/15/2025       |
      | GA_001 | 07/01/2025    | 07/15/2025       |
      | AZ_001 | 07/01/2025    | 07/15/2025       |
      | MT_001 | 07/01/2025    | 07/15/2025       |
      | WY_001 | 07/01/2025    | 07/15/2025       |
      | UT_001 | 07/01/2025    | 07/15/2025       |
      | HI_001 | 07/01/2025    | 07/15/2025       |
      | CO_001 | 07/01/2025    | 07/15/2025       |
      | TX_001 | 07/01/2025    | 07/15/2025       |
      | LA_001 | 07/01/2025    | 07/15/2025       |
      | AL_001 | 07/01/2025    | 07/15/2025       |
      # | RI_001 | 07/01/2025    | 07/15/2025       |
      # | CT_001 | 07/01/2025    | 07/15/2025       |

  @Coherent @GenericStates @CoherentRegression
  Scenario Outline: "<TC_ID>" Regression Scenario 5 => Verify OOS for non premium bearing endorsement is working as expected on Renewal roll forward for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Regression"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Earthquake" page
    * I verify EQ report and save changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "OldRate"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "NewRate"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "OldRate"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

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