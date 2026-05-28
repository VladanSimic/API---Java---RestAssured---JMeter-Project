Feature: Mapping Test

  @Coherent @Mapping_WYMT
  Scenario Outline: Various test cases to verify mapping of all possible inputs for rating "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMapping" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I am logged in to Pure as Zonal
    * I set "First_Name" to "MappingTest"
    * I set "Last_Name" to "Automation<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Rated"

    Examples:
      | TC_ID  | effectiveDate |
      | WY_001 | 07/06/2025    |
      | WY_002 | 07/06/2025    |
      | WY_003 | 07/06/2025    |
      | WY_004 | 07/06/2025    |
      | WY_005 | 07/06/2025    |
      | WY_006 | 07/06/2025    |
      | WY_007 | 07/06/2025    |
      | WY_008 | 07/06/2025    |
      | WY_009 | 07/06/2025    |
      | WY_010 | 07/06/2025    |
      | WY_011 | 07/06/2025    |
      | WY_012 | 07/06/2025    |
      | WY_013 | 07/06/2025    |
      | WY_014 | 07/06/2025    |
      | WY_015 | 07/06/2025    |
      | WY_016 | 07/06/2025    |
      | WY_017 | 07/06/2025    |
      | WY_018 | 07/06/2025    |
      | WY_019 | 07/06/2025    |
      | WY_020 | 07/06/2025    |
      | MT_001 | 07/06/2025    |
      | MT_002 | 07/06/2025    |
      | MT_003 | 07/06/2025    |
      | MT_004 | 07/06/2025    |
      | MT_005 | 07/06/2025    |
      | MT_006 | 07/06/2025    |
      | MT_007 | 07/06/2025    |
      | MT_008 | 07/06/2025    |
      | MT_009 | 07/06/2025    |
      | MT_010 | 07/06/2025    |
      | MT_011 | 07/06/2025    |
      | MT_012 | 07/06/2025    |
      | MT_013 | 07/06/2025    |
      | MT_014 | 07/06/2025    |
      | MT_015 | 07/06/2025    |
      | MT_016 | 07/06/2025    |
      | MT_017 | 07/06/2025    |
      | MT_018 | 07/06/2025    |
      | MT_019 | 07/06/2025    |
      | MT_020 | 07/06/2025    |

  @Coherent @MappingHS_CA
  Scenario Outline: Various test cases to verify mapping of all possible inputs for rating "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "coherent/QuoteCreationMapping" in sheet "QuoteCreatorHS" for "HS" LOB

    When I load random user data
    * I set "First_Name" to "MappingHS"
    * I set "Last_Name" to "DoNotTouch<TC_ID>"
    * I set "Effective_Date" to "<effectiveDate>"
    * I am logged in to Pure as "P198" unless is PROD then "A6"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote

    Then I verify error message is not shown "Rating failed. Please re-rate or contact underwriter for review. "
    * I navigate to premium details page

    Then I verify that the new Coherent rating is used "Scenario1"


#    Examples:
#      | TC_ID  | effectiveDate |
#      | CA_001 | 05/05/2025    |
#      | CA_002 | 05/05/2025    |
#      | CA_003 | 05/05/2025    |
#      | CA_004 | 05/05/2025    |
#      | CA_005 | 05/05/2025    |
#      | CA_006 | 05/05/2025    |
#      | CA_007 | 05/05/2025    |
#      | CA_008 | 05/05/2025    |
#      | CA_009 | 05/05/2025    |
#      | CA_010 | 05/05/2025    |
#      | CA_011 | 05/05/2025    |
#      | CA_012 | 05/05/2025    |
#      | CA_013 | 05/05/2025    |
#      | CA_014 | 05/05/2025    |
#      | CA_015 | 05/05/2025    |
#      | CA_016 | 05/05/2025    |
#      | CA_017 | 05/05/2025    |
#      | CA_018 | 05/05/2025    |
#      | CA_019 | 05/05/2025    |
#      | CA_020 | 05/05/2025    |

    Examples:
      | TC_ID  | effectiveDate |
      | HI_001 | 06/05/2025    |
      | HI_002 | 06/05/2025    |
      | HI_003 | 06/05/2025    |
      | HI_004 | 06/05/2025    |
      | HI_005 | 06/05/2025    |
      | HI_006 | 06/05/2025    |
      | HI_007 | 06/05/2025    |
      | HI_008 | 06/05/2025    |
      | HI_009 | 06/05/2025    |
      | HI_010 | 06/05/2025    |
      | HI_011 | 06/05/2025    |
      | HI_012 | 06/05/2025    |
      | HI_013 | 06/05/2025    |
      | HI_014 | 06/05/2025    |
      | HI_015 | 06/05/2025    |
      | HI_016 | 06/05/2025    |
      | HI_017 | 06/05/2025    |
      | HI_018 | 06/05/2025    |
      | HI_019 | 06/05/2025    |
      | HI_020 | 06/05/2025    |