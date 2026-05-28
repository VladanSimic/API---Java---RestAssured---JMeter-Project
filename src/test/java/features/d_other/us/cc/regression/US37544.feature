@CourseOfConstruction @US37544
Feature: US37544 - Update Base Rates and Taxes

  As a Product Owner I want to Test rating for the
  Surplus Course of Construction line for Phase 2

  Scenario Outline: Base rates - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US37544" in sheet "QuoteCreatorCC" for "CC" LOB
    * I load random user data

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify base rate "<non-wind base rate>"
    * I verify base rate "<wildfire base rate>"
    * I verify base rate "<wind base rate>"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    @AZ @NonWindBaseRate @WildfireBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate   |
      | AZ_001 | Non-Wind Base Rate/0.36  | Wildfire Base Rate Non-CA/0.216 | Wind Base Rate/0 |
      | AZ_002 | Non-Wind Base Rate/0.374 | Wildfire Base Rate Non-CA/0.225 | Wind Base Rate/0 |
      | AZ_003 | Non-Wind Base Rate/0.384 | Wildfire Base Rate Non-CA/0.23  | Wind Base Rate/0 |
      | AZ_004 | Non-Wind Base Rate/0.481 | Wildfire Base Rate Non-CA/0.289 | Wind Base Rate/0 |
      | AZ_005 | Non-Wind Base Rate/0.34  | Wildfire Base Rate Non-CA/0.204 | Wind Base Rate/0 |
      | AZ_006 | Non-Wind Base Rate/0.311 | Wildfire Base Rate Non-CA/0.186 | Wind Base Rate/0 |
      | AZ_007 | Non-Wind Base Rate/0.528 | Wildfire Base Rate Non-CA/0.317 | Wind Base Rate/0 |
      | AZ_008 | Non-Wind Base Rate/0.485 | Wildfire Base Rate Non-CA/0.291 | Wind Base Rate/0 |
      | AZ_009 | Non-Wind Base Rate/0.446 | Wildfire Base Rate Non-CA/0.268 | Wind Base Rate/0 |
      | AZ_010 | Non-Wind Base Rate/0.36  | Wildfire Base Rate Non-CA/0.216 | Wind Base Rate/0 |
      | AZ_011 | Non-Wind Base Rate/0.374 | Wildfire Base Rate Non-CA/0.225 | Wind Base Rate/0 |
      | AZ_012 | Non-Wind Base Rate/0.384 | Wildfire Base Rate Non-CA/0.23  | Wind Base Rate/0 |
      | AZ_013 | Non-Wind Base Rate/0.481 | Wildfire Base Rate Non-CA/0.289 | Wind Base Rate/0 |
      | AZ_014 | Non-Wind Base Rate/0.34  | Wildfire Base Rate Non-CA/0.204 | Wind Base Rate/0 |
      | AZ_015 | Non-Wind Base Rate/0.311 | Wildfire Base Rate Non-CA/0.186 | Wind Base Rate/0 |
      | AZ_016 | Non-Wind Base Rate/0.528 | Wildfire Base Rate Non-CA/0.317 | Wind Base Rate/0 |
      | AZ_017 | Non-Wind Base Rate/0.485 | Wildfire Base Rate Non-CA/0.291 | Wind Base Rate/0 |
      | AZ_018 | Non-Wind Base Rate/0.446 | Wildfire Base Rate Non-CA/0.268 | Wind Base Rate/0 |

    @CA @NonWindBaseRate @WildfireBaseRate
    Examples:
      | TC_ID  | non-wind base rate      | wildfire base rate | wind base rate |
      | CA_001 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_002 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_003 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_004 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_005 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_006 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_007 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_008 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_009 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_010 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_011 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_012 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_013 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_014 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_015 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_016 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_017 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_018 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_019 | Non-Wind Base Rate CA/0 | /                  | /              |
      | CA_020 | Non-Wind Base Rate CA/0 | /                  | /              |

    @CO @NonWindBaseRate @WildfireBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate |
      | CO_001 | Non-Wind Base Rate/0.365 | Wildfire Base Rate Non-CA/0.26  | /              |
      | CO_002 | Non-Wind Base Rate/0.365 | Wildfire Base Rate Non-CA/0.26  | /              |
      | CO_003 | Non-Wind Base Rate/0.446 | Wildfire Base Rate Non-CA/0.317 | /              |
      | CO_004 | Non-Wind Base Rate/0.446 | Wildfire Base Rate Non-CA/0.317 | /              |
      | CO_005 | Non-Wind Base Rate/0.405 | Wildfire Base Rate Non-CA/0.288 | /              |
      | CO_006 | Non-Wind Base Rate/0.405 | Wildfire Base Rate Non-CA/0.288 | /              |
      | CO_007 | Non-Wind Base Rate/0.308 | Wildfire Base Rate Non-CA/0.219 | /              |
      | CO_008 | Non-Wind Base Rate/0.308 | Wildfire Base Rate Non-CA/0.219 | /              |
      | CO_009 | Non-Wind Base Rate/0.302 | Wildfire Base Rate Non-CA/0.214 | /              |
      | CO_010 | Non-Wind Base Rate/0.302 | Wildfire Base Rate Non-CA/0.214 | /              |
      | CO_011 | Non-Wind Base Rate/0.302 | Wildfire Base Rate Non-CA/0.214 | /              |
      | CO_012 | Non-Wind Base Rate/0.302 | Wildfire Base Rate Non-CA/0.214 | /              |
      | CO_013 | Non-Wind Base Rate/0.47  | Wildfire Base Rate Non-CA/0.334 | /              |
      | CO_014 | Non-Wind Base Rate/0.47  | Wildfire Base Rate Non-CA/0.334 | /              |
      | CO_015 | Non-Wind Base Rate/0.496 | Wildfire Base Rate Non-CA/0.353 | /              |
      | CO_016 | Non-Wind Base Rate/0.496 | Wildfire Base Rate Non-CA/0.353 | /              |
      | CO_017 | Non-Wind Base Rate/0.393 | Wildfire Base Rate Non-CA/0.279 | /              |
      | CO_018 | Non-Wind Base Rate/0.393 | Wildfire Base Rate Non-CA/0.279 | /              |
      | CO_019 | Non-Wind Base Rate/0.422 | Wildfire Base Rate Non-CA/0.3   | /              |
      | CO_020 | Non-Wind Base Rate/0.422 | Wildfire Base Rate Non-CA/0.3   | /              |

    @CT @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | CT_001 | Non-Wind Base Rate/0.497 | /                  | Wind Base Rate/0     |
      | CT_002 | Non-Wind Base Rate/0.497 | /                  | Wind Base Rate/0     |
      | CT_003 | Non-Wind Base Rate/0.538 | /                  | Wind Base Rate/0     |
      | CT_004 | Non-Wind Base Rate/0.538 | /                  | Wind Base Rate/0     |
      | CT_005 | Non-Wind Base Rate/0.538 | /                  | Wind Base Rate/0     |
      | CT_006 | Non-Wind Base Rate/0.538 | /                  | Wind Base Rate/0     |
      | CT_007 | Non-Wind Base Rate/0.424 | /                  | Wind Base Rate/0     |
      | CT_008 | Non-Wind Base Rate/0.424 | /                  | Wind Base Rate/0     |
      | CT_009 | Non-Wind Base Rate/0.525 | /                  | Wind Base Rate/0     |
      | CT_010 | Non-Wind Base Rate/0.525 | /                  | Wind Base Rate/0     |
      | CT_011 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.054 |
      | CT_012 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.054 |
      | CT_013 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.054 |
      | CT_014 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.054 |
      | CT_015 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.032 |
      | CT_016 | Non-Wind Base Rate/0.484 | /                  | Wind Base Rate/0.032 |
      | CT_017 | Non-Wind Base Rate/0.472 | /                  | Wind Base Rate/0     |
      | CT_018 | Non-Wind Base Rate/0.472 | /                  | Wind Base Rate/0     |
      | CT_019 | Non-Wind Base Rate/0.507 | /                  | Wind Base Rate/0.079 |
      | CT_020 | Non-Wind Base Rate/0.507 | /                  | Wind Base Rate/0.079 |
      | CT_021 | Non-Wind Base Rate/0.443 | /                  | Wind Base Rate/0.206 |
      | CT_022 | Non-Wind Base Rate/0.443 | /                  | Wind Base Rate/0.206 |
      | CT_023 | Non-Wind Base Rate/0.444 | /                  | Wind Base Rate/0.274 |
      | CT_024 | Non-Wind Base Rate/0.444 | /                  | Wind Base Rate/0.274 |
      | CT_025 | Non-Wind Base Rate/0.486 | /                  | Wind Base Rate/0     |
      | CT_026 | Non-Wind Base Rate/0.486 | /                  | Wind Base Rate/0     |
      | CT_027 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.058 |
      | CT_028 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.058 |
      | CT_029 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.113 |
      | CT_030 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.113 |
      | CT_031 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.058 |
      | CT_032 | Non-Wind Base Rate/0.447 | /                  | Wind Base Rate/0.058 |
      | CT_033 | Non-Wind Base Rate/0.486 | /                  | Wind Base Rate/0     |
      | CT_034 | Non-Wind Base Rate/0.486 | /                  | Wind Base Rate/0     |
      | CT_035 | Non-Wind Base Rate/0.48  | /                  | Wind Base Rate/0     |
      | CT_036 | Non-Wind Base Rate/0.48  | /                  | Wind Base Rate/0     |
      | CT_037 | Non-Wind Base Rate/0.422 | /                  | Wind Base Rate/0.33  |
      | CT_038 | Non-Wind Base Rate/0.422 | /                  | Wind Base Rate/0.33  |
      | CT_039 | Non-Wind Base Rate/0.422 | /                  | Wind Base Rate/0.33  |
      | CT_040 | Non-Wind Base Rate/0.422 | /                  | Wind Base Rate/0.33  |
      | CT_041 | Non-Wind Base Rate/0.48  | /                  | Wind Base Rate/0     |
      | CT_042 | Non-Wind Base Rate/0.48  | /                  | Wind Base Rate/0     |

    @DE @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | DE_001 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_002 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_003 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_004 | Non-Wind Base Rate/0.52  | /                  | Wind Base Rate/0.334 |
      | DE_005 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_006 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_007 | Non-Wind Base Rate/0.52  | /                  | Wind Base Rate/0.334 |
      | DE_008 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_009 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_010 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_011 | Non-Wind Base Rate/0.52  | /                  | Wind Base Rate/0.334 |
      | DE_012 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_013 | Non-Wind Base Rate/0.577 | /                  | Wind Base Rate/0     |
      | DE_014 | Non-Wind Base Rate/0.52  | /                  | Wind Base Rate/0.334 |

    @HI @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | HI_001 | Non-Wind Base Rate/0.583 | /                  | Wind Base Rate/0.439 |
      | HI_002 | Non-Wind Base Rate/0.583 | /                  | Wind Base Rate/0.439 |

    @ID @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate   |
      | ID_001 | Non-Wind Base Rate/0.978 | /                  | Wind Base Rate/0 |
      | ID_002 | Non-Wind Base Rate/0.978 | /                  | Wind Base Rate/0 |

    @IL @NonWindBaseRate @WildfireBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate   |
      | IL_001 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_002 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_003 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_004 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |
      | IL_005 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_006 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_007 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_008 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |
      | IL_009 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_010 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_011 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_012 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |
      | IL_013 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_014 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_015 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_016 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |
      | IL_017 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_018 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_019 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_020 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |
      | IL_021 | Non-Wind Base Rate/0.684 | /                  | Wind Base Rate/0 |
      | IL_022 | Non-Wind Base Rate/0.856 | /                  | Wind Base Rate/0 |
      | IL_023 | Non-Wind Base Rate/0.799 | /                  | Wind Base Rate/0 |
      | IL_024 | Non-Wind Base Rate/0.763 | /                  | Wind Base Rate/0 |

    @RegressionUS
    Examples:
      | TC_ID  | non-wind base rate          | wildfire base rate              | wind base rate       |
      | AZ_001 | Non-Wind Base Rate/0.36     | Wildfire Base Rate Non-CA/0.216 | Wind Base Rate/0     |
      | AZ_002 | Non-Wind Base Rate/0.374    | Wildfire Base Rate Non-CA/0.225 | Wind Base Rate/0     |
      | AZ_003 | Non-Wind Base Rate/0.384    | Wildfire Base Rate Non-CA/0.23  | Wind Base Rate/0     |
      | AZ_004 | Non-Wind Base Rate/0.481    | Wildfire Base Rate Non-CA/0.289 | Wind Base Rate/0     |
      | AZ_005 | Non-Wind Base Rate/0.34     | Wildfire Base Rate Non-CA/0.204 | Wind Base Rate/0     |
      | CA_001 | Non-Wind Base Rate CA/0.41  | /                               | /                    |
      | CA_002 | Non-Wind Base Rate CA/0.41  | /                               | /                    |
      | CA_003 | Non-Wind Base Rate CA/0.508 | /                               | /                    |
      | CA_004 | Non-Wind Base Rate CA/0.41  | /                               | /                    |
      | CA_005 | Non-Wind Base Rate CA/0.376 | /                               | /                    |
      | CO_001 | Non-Wind Base Rate/0.365    | Wildfire Base Rate Non-CA/0.26  | /                    |
      | CO_002 | Non-Wind Base Rate/0.365    | Wildfire Base Rate Non-CA/0.26  | /                    |
      | CO_003 | Non-Wind Base Rate/0.446    | Wildfire Base Rate Non-CA/0.317 | /                    |
      | CO_004 | Non-Wind Base Rate/0.446    | Wildfire Base Rate Non-CA/0.317 | /                    |
      | CO_005 | Non-Wind Base Rate/0.405    | Wildfire Base Rate Non-CA/0.288 | /                    |
      | CT_001 | Non-Wind Base Rate/0.497    | /                               | Wind Base Rate/0     |
      | CT_002 | Non-Wind Base Rate/0.497    | /                               | Wind Base Rate/0     |
      | CT_003 | Non-Wind Base Rate/0.538    | /                               | Wind Base Rate/0     |
      | CT_004 | Non-Wind Base Rate/0.538    | /                               | Wind Base Rate/0     |
      | CT_005 | Non-Wind Base Rate/0.538    | /                               | Wind Base Rate/0     |
      | DE_001 | Non-Wind Base Rate/0.577    | /                               | Wind Base Rate/0     |
      | DE_002 | Non-Wind Base Rate/0.577    | /                               | Wind Base Rate/0     |
      | DE_003 | Non-Wind Base Rate/0.577    | /                               | Wind Base Rate/0     |
      | DE_004 | Non-Wind Base Rate/0.52     | /                               | Wind Base Rate/0.334 |
      | DE_005 | Non-Wind Base Rate/0.577    | /                               | Wind Base Rate/0     |
      | HI_001 | Non-Wind Base Rate/0.583    | /                               | Wind Base Rate/0.439 |
      | HI_002 | Non-Wind Base Rate/0.583    | /                               | Wind Base Rate/0.439 |
      | ID_001 | Non-Wind Base Rate/0.978    | /                               | Wind Base Rate/0     |
      | ID_002 | Non-Wind Base Rate/0.978    | /                               | Wind Base Rate/0     |
      | IL_001 | Non-Wind Base Rate/0.684    | /                               | Wind Base Rate/0     |
      | IL_002 | Non-Wind Base Rate/0.856    | /                               | Wind Base Rate/0     |
      | IL_003 | Non-Wind Base Rate/0.799    | /                               | Wind Base Rate/0     |
      | IL_004 | Non-Wind Base Rate/0.763    | /                               | Wind Base Rate/0     |
      | IL_005 | Non-Wind Base Rate/0.684    | /                               | Wind Base Rate/0     |