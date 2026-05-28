Feature: Homeowners Surplus Coherent Generic Scenarios - Generic States HI, CO, TX, LA, RI, CT, AL, UT, WY, MT, MS, GA

  Scenario Outline: "<TC_ID>" Scenario 1,2 - Verify that UI is displaying everything correctly after Coherent feature date for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario1,2"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then I verify that the rating was successfully completed

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |
    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |
    @RICT
    Examples:
      | TC_ID  | effectiveDate |
      | RI_001 | 07/01/2025    |
      | RI_002 | 07/01/2025    |
      | CT_001 | 07/01/2025    |
      | CT_002 | 07/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario 3,4  => Verify that the UI changes to ROL and Premium information page are as per requirements and matching state specifics for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario3,4"
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

    Then I verify that the premium is calculated and displayed on Premium Summary page

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |
    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |

    @RICT
    Examples:
      | TC_ID  | effectiveDate |
      | RI_001 | 07/01/2025    |
      | RI_002 | 07/01/2025    |
      | CT_001 | 07/01/2025    |
      | CT_002 | 07/01/2025    |

  Scenario Outline: "<TC_ID>" Scenario5-12 => Verify Quote Proposal, MGU Home Application, and Declaration pages for New Business, Endorsement, Renewal and Cancellation

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario10"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"

    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario14a"

    * I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario14b"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario20c"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements

    Examples:
      | TC_ID | effectiveDate | effectiveDateEND |
#      | MS_001 | 02/01/2025    | 02/15/2025       |
#      | MS_002 | 02/01/2025    | 02/15/2025       |
#      # | WY_001 | 02/01/2025    | 02/15/2025       |
#      # | WY_002 | 02/01/2025    | 02/15/2025       |
#
#    @AZUT
#    Examples:
#      | TC_ID  | effectiveDate | effectiveDateEND |
#      | AZ_001 | 02/01/2025    | 02/15/2025       |
#      | AZ_002 | 02/01/2025    | 02/15/2025       |
#      | UT_001 | 02/01/2025    | 02/15/2025       |
#      | UT_002 | 02/01/2025    | 02/15/2025       |
#
#    Examples:
#      | TC_ID  | effectiveDate | effectiveDateEND |
#      | RI_001 | 07/01/2025    | 07/15/2025       |
#      | RI_002 | 07/01/2025    | 07/15/2025       |
#      | CT_001 | 07/01/2025    | 07/15/2025       |
#      | CT_002 | 07/01/2025    | 07/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario15,16 => Verify that when NB is created pre pd filing date, Dragon is being used for rating for Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario15,16"
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

    Then I verify that the old Dragon rating is used "Scenario15_16"

    @MSMS  @MSMS2
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |
    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario17,18 => Verify that when NB is created pre pd filing date, Dragon is being used for rating for Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario17,18"
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

    Then I verify that the old Dragon rating is used "Scenario17_18"

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 03/01/2025    |
      | MS_002 | 03/01/2025    |
      # | WY_001 | 03/01/2025    |
      # | WY_002 | 03/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 03/01/2025    |
      | AZ_002 | 03/01/2025    |
      | UT_001 | 03/01/2025    |
      | UT_002 | 03/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario19,20 => Verify when non-premium bearing endorsement is created on inforce policies using Dragon, endorsement will use Dragon rating for Generic Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
#    * I set "First_Name" to "GenericHS<TC_ID>"
#    * I set "Last_Name" to "Scenario19,20"
    * I set "First_Name" to "DoNotTouch>"
    * I set "Last_Name" to "UAT"
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

#    Then I verify that the old Dragon rating is used "Scenario19,20a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
#    * I override subjectivities
#    * I select created policy
#    * I navigate to transactions or endorsements
#    * I initiate new endorsement
#    * I add changes on "HS" endorsement
#    * I review changes
#    * I rate a quote
#    * I navigate to premium details page
#
#    Then I verify that the old Dragon rating is used "Scenario19,20b"

    @MSMS @MSMS2 @YOU8EE
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 02/01/2025    | 02/15/2025       |
      | MS_002 | 02/01/2025    | 02/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 03/01/2025    | 03/15/2025       |
      | AZ_002 | 03/01/2025    | 03/15/2025       |
      | UT_001 | 03/01/2025    | 03/15/2025       |
      | UT_002 | 03/01/2025    | 03/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario20,21 => Verify that when non-premium bearing endorsement is created on inforce policies using dragon, endorsement will use dragon rating for Condo/Homeowners residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario20,21"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
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

    Then I verify that the old Dragon rating is used "Scenario20_21a"

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

    Then I verify that the old Dragon rating is used "Scenario20_21b"

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 02/01/2025    | 03/01/2025       |
      | MS_002 | 02/01/2025    | 03/01/2025       |
      # | WY_001 | 02/01/2025    | 02/15/2025       |
      # | WY_002 | 02/01/2025    | 02/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 03/01/2025    | 03/15/2025       |
      | AZ_002 | 03/01/2025    | 03/15/2025       |
      | UT_001 | 03/01/2025    | 03/15/2025       |
      | UT_002 | 03/01/2025    | 03/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario23,24 => Verify that when non-premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating for Generic States Home Surplus Lines Condo/Homeowners residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario23,24"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Earthquake" page
    * I verify EQ report and save changes
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario23_24a"

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

    Then I verify that the new Coherent rating is used "Scenario23_24b"

    @MSMS
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 07/01/2025    | 07/15/2025       |
      | MS_002 | 07/01/2025    | 07/15/2025       |
      # | WY_001 | 07/01/2025    | 07/15/2025       |
      # | WY_002 | 07/01/2025    | 07/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 06/01/2025    | 06/15/2025       |
      | AZ_002 | 06/01/2025    | 06/15/2025       |
      | UT_001 | 06/01/2025    | 06/15/2025       |
      | UT_002 | 06/01/2025    | 06/15/2025       |

    @RICT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | RI_001 | 07/01/2025    | 07/15/2025       |
      | RI_002 | 07/01/2025    | 07/15/2025       |
      | CT_001 | 07/01/2025    | 07/15/2025       |
      | CT_002 | 07/01/2025    | 07/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario25,26 => Verify that when premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario25,26"
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

    Then I verify that the new Coherent rating is used "Scenario25_26a"

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

    Then I verify that the new Coherent rating is used "Scenario25_26b"

    @MSMS
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 07/01/2025    | 07/15/2025       |
      | MS_002 | 07/01/2025    | 07/15/2025       |
      # | WY_001 | 07/01/2025    | 07/15/2025       |
      # | WY_002 | 07/01/2025    | 07/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 07/01/2025    | 07/15/2025       |
      | AZ_002 | 07/01/2025    | 07/15/2025       |
      | UT_001 | 07/01/2025    | 07/15/2025       |
      | UT_002 | 07/01/2025    | 07/15/2025       |

    @RICT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | RI_001 | 07/01/2025    | 07/15/2025       |
      | RI_002 | 07/01/2025    | 07/15/2025       |
      | CT_001 | 07/01/2025    | 07/15/2025       |
      | CT_002 | 07/01/2025    | 07/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario27,28 => Verify that when on inforce policies using dragon rating Renewal is created post feature date, policies will convert to Coherent rating

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
#    * I set "First_Name" to "GenericHS<TC_ID>"
#    * I set "Last_Name" to "Scenario27,28"
    * I set "First_Name" to "DoNotTouch>"
    * I set "Last_Name" to "UAT"
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

#    Then I verify that the old Dragon rating is used "Scenario27_28a"

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

#    Then I verify that the new Coherent rating is used "Scenario27_28b"

    @MSMS @YOU8EE
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 05/01/2024    |
      | MS_002 | 05/01/2024    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario33,34 => Verify OOS for non premium bearing endorsement is working as expected for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
#    * I set "First_Name" to "GenericHS<TC_ID>"
#    * I set "Last_Name" to "Scenario33,34"
    * I set "First_Name" to "DoNotTouch>"
    * I set "Last_Name" to "UAT"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
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

#    Then I verify that the old Dragon rating is used "Scenario33,34a"

    * I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

#    Then I verify that the old Dragon rating is used "Scenario33,34b"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

#    Then I verify that the old Dragon rating is used "Scenario33,34c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    @MSMS @MSMS2 @YOU8EE
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 07/01/2025    | 07/15/2025       |
      | MS_002 | 07/01/2025    | 07/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 02/01/2025    | 02/15/2025       |
      | AZ_002 | 02/01/2025    | 02/15/2025       |
      | UT_001 | 02/01/2025    | 02/15/2025       |
      | UT_002 | 02/01/2025    | 02/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario35,36 => Verify OOS for premium bearing endorsement is working as expected for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario35,36"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
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

    Then I verify that the old Dragon rating is used "Scenario35_36a"

    * I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario35_36b"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario35_36c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | MS_001 | 02/01/2025    | 02/15/2025       |
      | MS_002 | 02/01/2025    | 02/15/2025       |
      # | WY_001 | 02/01/2025    | 02/15/2025       |
      # | WY_002 | 02/01/2025    | 02/15/2025       |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND |
      | AZ_001 | 02/01/2025    | 03/01/2025       |
      | AZ_002 | 02/01/2025    | 03/01/2025       |
      | UT_001 | 02/01/2025    | 02/15/2025       |
      | UT_002 | 02/01/2025    | 02/15/2025       |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario37,38 => Verify OOS for non premium bearing endorsement is working as expected on Renewal roll forward for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario37,38"
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

    Then I verify that the old Dragon rating is used "Scenario37_38a"

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

    Then I verify that the new Coherent rating is used "Scenario37_38b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario37_38c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    @MSMS @MSMS2
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario39,40 => Verify OOS for premium bearing endorsement is working as expected on Renewal roll forward (prior to feature date) for Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario39,40"
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

    Then I verify that the old Dragon rating is used "Scenario39_40a"

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

    Then I verify that the new Coherent rating is used "Scenario39_40b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario39_40c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    @MSMS
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |


  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario41,42 => Verify NBRW (New Business pre pd filing date, Rewrite post pd filing date) for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
#    * I set "First_Name" to "Generic<TC_ID>"
#    * I set "Last_Name" to "Scenario41,42"
    * I set "First_Name" to "DoNotTouch>"
    * I set "Last_Name" to "UAT"
#    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

#    Then I verify that the old Dragon rating is used "Scenario41_42a"

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
      | Notes | 07/20/2025 |

    When I add changes on "HS" new business rewrite
    * I review changes
    * I rate a quote
    * I navigate to premium details page

#    Then I verify that the new Coherent rating is used "Scenario41_42b"

    @MSMS @YOU8EE
    Examples:
      | TC_ID  |
      | MS_001 |
      | MS_002 |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |


  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario43,44 => Verify that Reinstatement transaction is using Dragon rating before feature date for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
#    * I set "First_Name" to "GenericHS<TC_ID>"
#    * I set "Last_Name" to "Scenario43,44"
    * I set "First_Name" to "DoNotTouch>"
    * I set "Last_Name" to "UAT"
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
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote
    * I navigate to premium details page

#    Then I verify that the old Dragon rating is used "Scenario43_44a"

    Then I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason               | MEP | reason |
      | Company | 07/01/2025 | Cancellation test | Flat-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    @MSMS @YOU8EE
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      | MS_002 | 07/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |


  Scenario Outline: "<TC_ID>" Scenario45,46 => Verify that after multiple ongoing renewals using Coherent rating, everything is working as expected for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario45,46"
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

    Then I verify that the old Dragon rating is used "Scenario45_46a"

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

    Then I verify that the new Coherent rating is used "Scenario45_46b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario45_46c"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I review and accept referrals on renewal if any
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario45_46d"

    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 02/01/2025    |
      | MS_002 | 02/01/2025    |
      # | WY_001 | 02/01/2025    |
      # | WY_002 | 02/01/2025    |

    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 02/01/2025    |
      | AZ_002 | 02/01/2025    |
      | UT_001 | 02/01/2025    |
      | UT_002 | 02/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario51,52 => Verify Excess Flood optional coverage after Coherent feature date for Generic States Home Surplus Lines Homeowners/Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario51,52"
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

    Then I verify that the new Coherent rating is used "Scenario51_52a"

    @MSMS
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      | MS_002 | 07/01/2025    |
      # | WY_001 | 07/01/2025    |
      # | WY_002 | 07/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 07/01/2025    |
      | AZ_002 | 07/01/2025    |
      | UT_001 | 07/01/2025    |
      | UT_002 | 07/01/2025    |

    @RICT
    Examples:
      | TC_ID  | effectiveDate |
      | RI_001 | 07/01/2025    |
      | RI_002 | 07/01/2025    |
      | CT_001 | 07/01/2025    |
      | CT_002 | 07/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario 53-54 => Verify Manuscript Endorsements after Coherent feature date for Generic Home Surplus States Homeowners residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/home_surplus/GenericStates_QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario53-54"
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

    Then I verify that the new Coherent rating is used "Scenario53_54a"

    @MSMS
    Examples:
      | TC_ID  | effectiveDate |
      | MS_001 | 07/01/2025    |
      | MS_002 | 07/01/2025    |
      # | WY_001 | 07/01/2025    |
      # | WY_002 | 07/01/2025    |

    @AZUT
    Examples:
      | TC_ID  | effectiveDate |
      | AZ_001 | 07/01/2025    |
      | AZ_002 | 07/01/2025    |
      | UT_001 | 07/01/2025    |
      | UT_002 | 07/01/2025    |

    @RICT
    Examples:
      | TC_ID  | effectiveDate |
      | RI_001 | 07/01/2025    |
      | RI_002 | 07/01/2025    |
      | CT_001 | 07/01/2025    |
      | CT_002 | 07/01/2025    |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario55,56 => Verify End submission functionality after Coherent feature date for Generic States Home Surplus Lines Condo residence type

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB

    And I set Effective Date 10 days in the future
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario55,56"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I click on end submission button

    Then I refer quote to Pure programs
      | ReasonForEnding         | ReferToHomeSurplus | ReasonForNotReferring | AdditionalComments | GeneralReason | GeneralReasonComments   |
      | Declined for UW Reasons | Yes                |                       |                    | Other         | General Reason Comments |

    When I navigate to customer summary page

    Then I verify that Home quote is Declined
    * I verify that Home quote refer to Home Surplus quote
    * I navigate to HS quote
    * I navigate to quotes detail page
    * I verify that the quote has the same future effective date as the admitted Home quote
    * I navigate to Home Surplus Lines Policy Page
    * I get customer account ID

    @MSMS
    Examples:
      | TC_ID  |
      | MS_001 |
      | MS_002 |
      # | WY_001 |
      # | WY_002 |

    @AZUAT
    Examples:
      | TC_ID  |
      | AZ_001 |
      | AZ_002 |
      | UT_001 |
      | UT_002 |

    Examples:
      | TC_ID  |
      | RI_001 |
      | RI_002 |
      | CT_001 |
      | CT_002 |

    Examples:
      | TC_ID  |
      | AL_001 |
      | AL_002 |
      | GA_001 |
      | GA_002 |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario57,58 => Verify Intent to Non-Renew functionality after Coherent feature date for Generic States Admitted Homeowners/Condo residence type for referring to Home Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set Effective Date 350 days in the past
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario57,58"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I get customer account ID

    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer policy to Pure programs
      | ChooseTransaction   | Sub-Type            | Notes | OdenNotice | ReferToPURE | ReasonForNotReferring | AdditionalComments | Add Comments To Oden |
      | Intent to Non-Renew | Intent to Non-Renew | Notes | Test       | Yes         |                       | Test1              | Test2                |

    And I select a transaction "Intent to Non-Renew"
    * I verify that refer to Pure programs - Yes is display on summary policy transaction

    When I navigate to customer summary page
    * I verify that Home policy is Active
    * I verify that Home policy refer to Home Surplus quote

    @MSMS
    Examples:
      | TC_ID  |
      | MS_001 |
      | MS_002 |
      # | WY_001 |
      # | WY_002 |

    @AZUAT
    Examples:
      | TC_ID  |
      | AZ_001 |
      | AZ_002 |
      | UT_001 |
      | UT_002 |

    Examples:
      | TC_ID  |
      | RI_001 |
      | RI_002 |
      | CT_001 |
      | CT_002 |
    @UAT_Prep
    Examples:
      | TC_ID  |
      | AL_001 |
      | AL_002 |
      | GA_001 |
      | GA_002 |

  @Coherent @GenericStates
  Scenario Outline: "<TC_ID>" Scenario69,70 => Verify Cancellation functionality after Coherent feature date for Generic States Admitted Homeowners/Condo residence type for referring to Home Surplus

    Given I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set "First_Name" to "GenericHS<TC_ID>"
    * I set "Last_Name" to "Scenario59,60"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I refer cancelled policy to Pure programs
      | ChooseTransaction | NewTransactionEffectiveDate | Notes | CancellationRequestedBy | CancellationMethod | CancellationReason   | ReferToPURE | ReasonForNotReferring | AdditionalComments |
      | Cancellation      | 07/30/2025                  | Notes | Company                 | Pro-Rate           | Underwriting Reasons | Yes         |                       |                    |

    When I navigate to customer summary page

    Then I verify that Home policy is Cancelled
    * I verify that Cancelled Home policy refers to Home Surplus quote

    @MSMS
    Examples:
      | TC_ID  |
      | MS_001 |
      | MS_002 |
      # | WY_001 |
      # | WY_002 |

    @AZUAT
    Examples:
      | TC_ID  |
      | AZ_001 |
      | AZ_002 |
      | UT_001 |
      | UT_002 |

    Examples:
      | TC_ID  |
      | RI_001 |
      | RI_002 |
      | CT_001 |
      | CT_002 |

    Examples:
      | TC_ID  |
      | AL_001 |
      | AL_002 |
      | GA_001 |
      | GA_002 |