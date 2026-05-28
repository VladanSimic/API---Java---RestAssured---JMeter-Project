Feature: Homeowners Surplus Coherent Generic Scenarios

  @Coherent @GenericHSBase
  Scenario Outline: Scenario1 => Verify that UI is displaying everything correctly after Coherent feature date

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario1"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote

    Then I verify that the rating was successfully completed

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_031 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario2 => Verify that the UI changes to ROL and Premium information page are as per requirements and matching state specifics

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario2"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I navigate to "Risk Model Information" page through the Tree
    * I verify block "Premium and ROL Summary" exists
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote

    Then I verify that the premium is calculated and displayed on Premium Summary page

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_031 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario5 => Verify that when NB is created pre feature date, Dragon is being used for rating

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario5"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario5"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_031 | 01/01/2025    | PURE Specialty Exchange                  |
      | FL_001 | 02/01/2025    | PURE Specialty Exchange                  |
      | FL_031 | 02/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 02/01/2025    | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario6 => Verify that when NB is created post pd filing date, Coherent is being used as rating vendor

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario6"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the new Coherent rating is used "Scenario6"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario7 => Verify that when non-premium bearing endorsement is created on inforce policies using dragon, endorsement will use dragon rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario7"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario7a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario7b"

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_001 | 03/01/2025    | 02/15/2025       | National Fire & Marine Insurance Company |
      | CA_003 | 02/01/2025    | 02/15/2025       | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario8 => Verify that when premium bearing endorsement is created on inforce policies using dragon, endorsement will use dragon rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario8"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario8a"

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

    Then I verify that the old Dragon rating is used "Scenario8b"

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_001 | 03/01/2025    | 03/15/2025       | National Fire & Marine Insurance Company |
      | CA_003 | 02/01/2025    | 03/01/2025       | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario9 => Verify that when non-premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario9"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the new Coherent rating is used "Scenario9a"

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

    Then I verify that the new Coherent rating is used "Scenario9b"


    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_031 | 03/01/2025    | 03/15/2025       | National Fire & Marine Insurance Company |
      | CA_003 | 05/01/2025    | 05/15/2025       | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario10 => Verify that when premium bearing endorsement is created on inforce policies using Coherent, endorsement will use Coherent rating.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario10"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the new Coherent rating is used "Scenario10a"

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

    Then I verify that the new Coherent rating is used "Scenario10b"



    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_031 | 03/01/2025    | 03/15/2025       | National Fire & Marine Insurance Company |
      | CA_003 | 05/01/2025    | 05/15/2025       | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario11 => Verify that when on inforce policies using dragon rating Renewal is created post feature date, policies will convert to Coherent rating

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario11"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario11a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario11b"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_031 | 02/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 02/01/2025    | PURE Specialty Exchange                  |


  @Coherent
  Scenario Outline: Scenario12 => Verify stats - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario12"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
    * I am logged in to Pure as Zonal
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario12a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I navigate to policy
    * I navigate to transactions or endorsements
    * I navigate to New Business summary page
    * I get current object ID

    Then I execute a query and validate "stats"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/01/2025    | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario14 => Verify OOS for non premium bearing endorsement is working as expected

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario10"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario14c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_001 | 03/01/2025    | 03/15/2025       | National Fire & Marine Insurance Company |
      | CA_003 | 03/01/2025    | 03/15/2025       | National Fire & Marine Insurance Company |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario15 => Verify OOS for premium bearing endorsement is working as expected (prior to feature date)

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario10"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario15a"
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

    Then I verify that the old Dragon rating is used "Scenario15b"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario15c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate | effectiveDateEND | underwritingCompany                      |
      | FL_001 | 02/01/2025    | 02/15/2025       | PURE Specialty Exchange                  |
      | CA_003 | 02/01/2025    | 02/15/2025       | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario16 => Verify OOS for non premium bearing endorsement is working as expected on Renewal roll forward

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario16"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario16a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario16b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario16c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 02/01/2025    | PURE Specialty Exchange                  |
      | CA_003 | 02/01/2025    | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario17 => Verify OOS for premium bearing endorsement is working as expected on Renewal roll forward (prior to feature date)

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario17"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario17a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario17b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the old Dragon rating is used "Scenario17c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_031 | 02/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 02/01/2025    | PURE Specialty Exchange                  |


  @Coherent @GenericHSBase
  Scenario Outline: Scenario19 => Verify reinstatement

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario19"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario19a"

    Then I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements

    Then I create cancellation transaction
      | by      | date  | notes             | method    | reason               | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 01/01/2025    | PURE Specialty Exchange                  |
      | CA_003 | 03/01/2025    | National Fire & Marine Insurance Company |

  @Coherent
  Scenario Outline: Scenario20 => Verify that when on inforce policies using dragon rating Renewal is created post feature date, policies will convert to Coherent rating

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario20"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the old Dragon rating is used "Scenario20a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario20b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario20c"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario20d"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 01/01/2025    | PURE Specialty Exchange                  |
      | CA_003 | 02/01/2025    | National Fire & Marine Insurance Company |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario22 => Verify that when FL HS quote is rated post feature date, underwriter is able to see link named "External Rate Details" on premium details page

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario22"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the new Coherent rating is used "Scenario22"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario23 => Verify that referral is triggered when user begins OOS transaction with an effective date that is prior to the current renewal term.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario10"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Endorsement_Effective_Date_END" to "<effectiveDateEND>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
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

    Then I verify that the new Coherent rating is used "Scenario23a"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities
    * I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page
    * I navigate to "Application" page through the Tree
    * I fill out HS quote application page
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario23b"

    When I click exit button
    * I process a renewal
    * I navigate to transactions or endorsements
    * I initiate new oos endorsement
    * I add changes on OOS "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario23c"

    When I click exit button
    * I review and accept referrals on renewal if any
    * I navigate to underwriting referrals page

    Then I verify that referral "2649639" is "triggered"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      | effectiveDateEND |
      | FL_001 | 03/01/2025    | National Fire & Marine Insurance Company | 03/02/2025       |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  | 05/10/2025       |

  @Coherent @GenericHSBase
  Scenario Outline: Scenario24 => Verify that when FL HS quote is rated post feature date, underwriter is not able to see Deductible Scenarios button on premium tab.

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMappingCA" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "GenericHS"
    * I set "Last_Name" to "Scenario24"
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Underwriting_Company" to "<underwritingCompany>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I select "No" for "Do you wish to include excess flood coverage?" on "Optional Coverages"
    * I rate a quote

    Then I verify that Deductible Scenarios button is not displayed
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario24"

    Examples:
      | TC_ID  | effectiveDate | underwritingCompany                      |
      | FL_001 | 03/01/2025    | National Fire & Marine Insurance Company |
      | CA_003 | 05/05/2025    | PURE Specialty Exchange                  |