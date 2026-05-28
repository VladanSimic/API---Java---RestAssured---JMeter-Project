@CourseOfConstruction @US37545
Feature: US37545 - Update Base Rates and Taxes

  As a Product Owner I want to Test rating for the Surplus
  Course of Construction line for Phase 2

  Scenario Outline: Base rates - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US37545" in sheet "QuoteCreatorCC" for "CC" LOB
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

    @OR @NonWindBaseRate @WildfireBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate   |
      | OR_001 | Non-Wind Base Rate/0.465 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | OR_002 | Non-Wind Base Rate/0.465 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |

    @UT @NonWindBaseRate @WildfireBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate   |
      | UT_001 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | UT_002 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |

    @WY @NonWindBaseRate @WildfireBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate     | wildfire base rate              | wind base rate   |
      | WY_001 | Non-Wind Base Rate/0.5 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WY_002 | Non-Wind Base Rate/0.5 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |

    @RI @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | RI_001 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_002 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_003 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_004 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_005 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.199 |
      | RI_006 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.199 |
      | RI_007 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_008 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_009 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.19  |
      | RI_010 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.19  |
      | RI_011 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_012 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_013 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.199 |
      | RI_014 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.199 |
      | RI_015 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_016 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_017 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.19  |
      | RI_018 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.19  |
      | RI_019 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_020 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_021 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_022 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_023 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_024 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_025 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_026 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_027 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_028 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_029 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_030 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_031 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_032 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_033 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.223 |
      | RI_034 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.223 |
      | RI_035 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_036 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_037 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.25  |
      | RI_038 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.25  |
      | RI_039 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.189 |
      | RI_040 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.189 |
      | RI_041 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_042 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_043 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_044 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_045 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_046 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_047 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_048 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_049 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_050 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_051 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_052 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_053 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_054 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_055 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_056 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_057 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.25  |
      | RI_058 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.25  |
      | RI_059 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.223 |
      | RI_060 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.223 |
      | RI_061 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_062 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.194 |
      | RI_063 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.189 |
      | RI_064 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.189 |
      | RI_065 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_066 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0     |
      | RI_067 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_068 | Non-Wind Base Rate/0.607 | /                  | Wind Base Rate/0     |
      | RI_069 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_070 | Non-Wind Base Rate/0.621 | /                  | Wind Base Rate/0     |
      | RI_071 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_072 | Non-Wind Base Rate/0.636 | /                  | Wind Base Rate/0     |
      | RI_073 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.437 |
      | RI_074 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.437 |
      | RI_075 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_076 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_077 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_078 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_079 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_080 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_081 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |
      | RI_082 | Non-Wind Base Rate/0.385 | /                  | Wind Base Rate/0.224 |

    @VA @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | VA_001 | Non-Wind Base Rate/0.474 | /                  | Wind Base Rate/0     |
      | VA_002 | Non-Wind Base Rate/0.474 | /                  | Wind Base Rate/0     |
      | VA_003 | Non-Wind Base Rate/0.546 | /                  | Wind Base Rate/0     |
      | VA_004 | Non-Wind Base Rate/0.546 | /                  | Wind Base Rate/0     |
      | VA_005 | Non-Wind Base Rate/0.512 | /                  | Wind Base Rate/0     |
      | VA_006 | Non-Wind Base Rate/0.512 | /                  | Wind Base Rate/0     |
      | VA_007 | Non-Wind Base Rate/0.494 | /                  | Wind Base Rate/0     |
      | VA_008 | Non-Wind Base Rate/0.494 | /                  | Wind Base Rate/0     |
      | VA_009 | Non-Wind Base Rate/0.389 | /                  | Wind Base Rate/0.295 |
      | VA_010 | Non-Wind Base Rate/0.389 | /                  | Wind Base Rate/0.295 |
      | VA_011 | Non-Wind Base Rate/0.398 | /                  | Wind Base Rate/0.279 |
      | VA_012 | Non-Wind Base Rate/0.398 | /                  | Wind Base Rate/0.279 |
      | VA_013 | Non-Wind Base Rate/0.392 | /                  | Wind Base Rate/0.24  |
      | VA_014 | Non-Wind Base Rate/0.392 | /                  | Wind Base Rate/0.24  |
      | VA_015 | Non-Wind Base Rate/0.4   | /                  | Wind Base Rate/0.148 |
      | VA_016 | Non-Wind Base Rate/0.4   | /                  | Wind Base Rate/0.148 |
      | VA_017 | Non-Wind Base Rate/0.591 | /                  | Wind Base Rate/0     |
      | VA_018 | Non-Wind Base Rate/0.591 | /                  | Wind Base Rate/0     |
      | VA_019 | Non-Wind Base Rate/0.437 | /                  | Wind Base Rate/0.154 |
      | VA_020 | Non-Wind Base Rate/0.437 | /                  | Wind Base Rate/0.154 |
      | VA_021 | Non-Wind Base Rate/0.436 | /                  | Wind Base Rate/0.141 |
      | VA_022 | Non-Wind Base Rate/0.436 | /                  | Wind Base Rate/0.141 |
      | VA_023 | Non-Wind Base Rate/0.411 | /                  | Wind Base Rate/0.094 |
      | VA_024 | Non-Wind Base Rate/0.411 | /                  | Wind Base Rate/0.094 |
      | VA_025 | Non-Wind Base Rate/0.432 | /                  | Wind Base Rate/0.074 |
      | VA_026 | Non-Wind Base Rate/0.432 | /                  | Wind Base Rate/0.074 |
      | VA_027 | Non-Wind Base Rate/0.428 | /                  | Wind Base Rate/0     |
      | VA_028 | Non-Wind Base Rate/0.428 | /                  | Wind Base Rate/0     |
      | VA_029 | Non-Wind Base Rate/0.58  | /                  | Wind Base Rate/0     |
      | VA_030 | Non-Wind Base Rate/0.58  | /                  | Wind Base Rate/0     |
      | VA_031 | Non-Wind Base Rate/0.483 | /                  | Wind Base Rate/0     |
      | VA_032 | Non-Wind Base Rate/0.483 | /                  | Wind Base Rate/0     |
      | VA_033 | Non-Wind Base Rate/0.494 | /                  | Wind Base Rate/0     |
      | VA_034 | Non-Wind Base Rate/0.494 | /                  | Wind Base Rate/0     |

    @WA @NonWindBaseRate @WildfireBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate   |
      | WA_001 | Non-Wind Base Rate/0.413 | Wildfire Base Rate Non-CA/0.273 | Wind Base Rate/0 |
      | WA_002 | Non-Wind Base Rate/0.413 | Wildfire Base Rate Non-CA/0.273 | Wind Base Rate/0 |
      | WA_003 | Non-Wind Base Rate/0.533 | Wildfire Base Rate Non-CA/0.353 | Wind Base Rate/0 |
      | WA_004 | Non-Wind Base Rate/0.533 | Wildfire Base Rate Non-CA/0.353 | Wind Base Rate/0 |
      | WA_005 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_006 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_007 | Non-Wind Base Rate/0.434 | Wildfire Base Rate Non-CA/0.287 | Wind Base Rate/0 |
      | WA_008 | Non-Wind Base Rate/0.434 | Wildfire Base Rate Non-CA/0.287 | Wind Base Rate/0 |
      | WA_009 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_010 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_011 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_012 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_013 | Non-Wind Base Rate/0.423 | Wildfire Base Rate Non-CA/0.28  | Wind Base Rate/0 |
      | WA_014 | Non-Wind Base Rate/0.423 | Wildfire Base Rate Non-CA/0.28  | Wind Base Rate/0 |
      | WA_015 | Non-Wind Base Rate/0.423 | Wildfire Base Rate Non-CA/0.28  | Wind Base Rate/0 |
      | WA_016 | Non-Wind Base Rate/0.423 | Wildfire Base Rate Non-CA/0.28  | Wind Base Rate/0 |
      | WA_017 | Non-Wind Base Rate/0.428 | Wildfire Base Rate Non-CA/0.283 | Wind Base Rate/0 |
      | WA_018 | Non-Wind Base Rate/0.428 | Wildfire Base Rate Non-CA/0.283 | Wind Base Rate/0 |
      | WA_019 | Non-Wind Base Rate/0.559 | Wildfire Base Rate Non-CA/0.37  | Wind Base Rate/0 |
      | WA_020 | Non-Wind Base Rate/0.559 | Wildfire Base Rate Non-CA/0.37  | Wind Base Rate/0 |
      | WA_021 | Non-Wind Base Rate/0.596 | Wildfire Base Rate Non-CA/0.394 | Wind Base Rate/0 |
      | WA_022 | Non-Wind Base Rate/0.596 | Wildfire Base Rate Non-CA/0.394 | Wind Base Rate/0 |
      | WA_023 | Non-Wind Base Rate/0.613 | Wildfire Base Rate Non-CA/0.406 | Wind Base Rate/0 |
      | WA_024 | Non-Wind Base Rate/0.613 | Wildfire Base Rate Non-CA/0.406 | Wind Base Rate/0 |
      | WA_025 | Non-Wind Base Rate/0.558 | Wildfire Base Rate Non-CA/0.369 | Wind Base Rate/0 |
      | WA_026 | Non-Wind Base Rate/0.558 | Wildfire Base Rate Non-CA/0.369 | Wind Base Rate/0 |
      | WA_027 | Non-Wind Base Rate/0.568 | Wildfire Base Rate Non-CA/0.376 | Wind Base Rate/0 |
      | WA_028 | Non-Wind Base Rate/0.568 | Wildfire Base Rate Non-CA/0.376 | Wind Base Rate/0 |
      | WA_029 | Non-Wind Base Rate/0.564 | Wildfire Base Rate Non-CA/0.373 | Wind Base Rate/0 |
      | WA_030 | Non-Wind Base Rate/0.564 | Wildfire Base Rate Non-CA/0.373 | Wind Base Rate/0 |
      | WA_031 | Non-Wind Base Rate/0.553 | Wildfire Base Rate Non-CA/0.366 | Wind Base Rate/0 |
      | WA_032 | Non-Wind Base Rate/0.553 | Wildfire Base Rate Non-CA/0.366 | Wind Base Rate/0 |
      | WA_033 | Non-Wind Base Rate/0.403 | Wildfire Base Rate Non-CA/0.267 | Wind Base Rate/0 |
      | WA_034 | Non-Wind Base Rate/0.403 | Wildfire Base Rate Non-CA/0.267 | Wind Base Rate/0 |
      | WA_035 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_036 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_037 | Non-Wind Base Rate/0.378 | Wildfire Base Rate Non-CA/0.25  | Wind Base Rate/0 |
      | WA_038 | Non-Wind Base Rate/0.378 | Wildfire Base Rate Non-CA/0.25  | Wind Base Rate/0 |
      | WA_039 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_040 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_041 | Non-Wind Base Rate/0.517 | Wildfire Base Rate Non-CA/0.342 | Wind Base Rate/0 |
      | WA_042 | Non-Wind Base Rate/0.517 | Wildfire Base Rate Non-CA/0.342 | Wind Base Rate/0 |
      | WA_043 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_044 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_045 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_046 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_047 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_048 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_049 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.328 | Wind Base Rate/0 |
      | WA_050 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.328 | Wind Base Rate/0 |
      | WA_051 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_052 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_053 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_054 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_055 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_056 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_057 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_058 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_059 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_060 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_061 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_062 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_063 | Non-Wind Base Rate/0.55  | Wildfire Base Rate Non-CA/0.364 | Wind Base Rate/0 |
      | WA_064 | Non-Wind Base Rate/0.55  | Wildfire Base Rate Non-CA/0.364 | Wind Base Rate/0 |
      | WA_065 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_066 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_067 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_068 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_069 | Non-Wind Base Rate/0.405 | Wildfire Base Rate Non-CA/0.268 | Wind Base Rate/0 |
      | WA_070 | Non-Wind Base Rate/0.405 | Wildfire Base Rate Non-CA/0.268 | Wind Base Rate/0 |
      | WA_071 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_072 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_073 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_074 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_075 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_076 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_077 | Non-Wind Base Rate/0.494 | Wildfire Base Rate Non-CA/0.327 | Wind Base Rate/0 |
      | WA_078 | Non-Wind Base Rate/0.494 | Wildfire Base Rate Non-CA/0.327 | Wind Base Rate/0 |
      | WA_079 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_080 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_081 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_082 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_083 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_084 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_085 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_086 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_087 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_088 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0 |
      | WA_089 | Non-Wind Base Rate/0.419 | Wildfire Base Rate Non-CA/0.277 | Wind Base Rate/0 |
      | WA_090 | Non-Wind Base Rate/0.419 | Wildfire Base Rate Non-CA/0.277 | Wind Base Rate/0 |
      | WA_091 | Non-Wind Base Rate/0.403 | Wildfire Base Rate Non-CA/0.267 | Wind Base Rate/0 |
      | WA_092 | Non-Wind Base Rate/0.403 | Wildfire Base Rate Non-CA/0.267 | Wind Base Rate/0 |
      | WA_093 | Non-Wind Base Rate/0.424 | Wildfire Base Rate Non-CA/0.281 | Wind Base Rate/0 |
      | WA_094 | Non-Wind Base Rate/0.424 | Wildfire Base Rate Non-CA/0.281 | Wind Base Rate/0 |
      | WA_095 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_096 | Non-Wind Base Rate/0.341 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0 |
      | WA_097 | Non-Wind Base Rate/0.443 | Wildfire Base Rate Non-CA/0.293 | Wind Base Rate/0 |
      | WA_098 | Non-Wind Base Rate/0.443 | Wildfire Base Rate Non-CA/0.293 | Wind Base Rate/0 |
      | WA_099 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_100 | Non-Wind Base Rate/0.506 | Wildfire Base Rate Non-CA/0.335 | Wind Base Rate/0 |
      | WA_101 | Non-Wind Base Rate/0.391 | Wildfire Base Rate Non-CA/0.259 | Wind Base Rate/0 |
      | WA_102 | Non-Wind Base Rate/0.391 | Wildfire Base Rate Non-CA/0.259 | Wind Base Rate/0 |
      | WA_103 | Non-Wind Base Rate/0.537 | Wildfire Base Rate Non-CA/0.356 | Wind Base Rate/0 |
      | WA_104 | Non-Wind Base Rate/0.537 | Wildfire Base Rate Non-CA/0.356 | Wind Base Rate/0 |

    @SC @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate | wind base rate       |
      | SC_001 | Non-Wind Base Rate/0.585 | /                  | Wind Base Rate/0.735 |
      | SC_002 | Non-Wind Base Rate/0.585 | /                  | Wind Base Rate/0.735 |
      | SC_003 | Non-Wind Base Rate/0.61  | /                  | Wind Base Rate/0.729 |
      | SC_004 | Non-Wind Base Rate/0.61  | /                  | Wind Base Rate/0.729 |
      | SC_005 | Non-Wind Base Rate/0.61  | /                  | Wind Base Rate/0.729 |
      | SC_006 | Non-Wind Base Rate/0.61  | /                  | Wind Base Rate/0.729 |
      | SC_007 | Non-Wind Base Rate/0.583 | /                  | Wind Base Rate/0.652 |
      | SC_008 | Non-Wind Base Rate/0.583 | /                  | Wind Base Rate/0.652 |
      | SC_009 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/0.172 |
      | SC_010 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/0.172 |
      | SC_011 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.527 |
      | SC_012 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.53  |
      | SC_013 | Non-Wind Base Rate/0.63  | /                  | Wind Base Rate/0.626 |
      | SC_014 | Non-Wind Base Rate/0.63  | /                  | Wind Base Rate/0.626 |
      | SC_015 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.605 |
      | SC_016 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.605 |
      | SC_017 | Non-Wind Base Rate/0.625 | /                  | Wind Base Rate/0.366 |
      | SC_018 | Non-Wind Base Rate/0.625 | /                  | Wind Base Rate/0.366 |
      | SC_019 | Non-Wind Base Rate/0.593 | /                  | Wind Base Rate/0.553 |
      | SC_020 | Non-Wind Base Rate/0.593 | /                  | Wind Base Rate/0.553 |
      | SC_021 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0.336 |
      | SC_022 | Non-Wind Base Rate/0.592 | /                  | Wind Base Rate/0.336 |
      | SC_023 | Non-Wind Base Rate/0.599 | /                  | Wind Base Rate/0.546 |
      | SC_024 | Non-Wind Base Rate/0.599 | /                  | Wind Base Rate/0.546 |
      | SC_025 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/0.486 |
      | SC_026 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/0.486 |
      | SC_027 | Non-Wind Base Rate/0.588 | /                  | Wind Base Rate/0.375 |
      | SC_028 | Non-Wind Base Rate/0.588 | /                  | Wind Base Rate/0.375 |
      | SC_029 | Non-Wind Base Rate/0.588 | /                  | Wind Base Rate/0.237 |
      | SC_030 | Non-Wind Base Rate/0.588 | /                  | Wind Base Rate/0.237 |
      | SC_031 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.921 |
      | SC_032 | Non-Wind Base Rate/0.624 | /                  | Wind Base Rate/0.921 |
      | SC_033 | Non-Wind Base Rate/0.593 | /                  | Wind Base Rate/0.612 |
      | SC_034 | Non-Wind Base Rate/0.593 | /                  | Wind Base Rate/0.612 |
      | SC_035 | Non-Wind Base Rate/0.595 | /                  | Wind Base Rate/0.781 |
      | SC_036 | Non-Wind Base Rate/0.595 | /                  | Wind Base Rate/0.781 |
      | SC_037 | Non-Wind Base Rate/0.584 | /                  | Wind Base Rate/0.609 |
      | SC_038 | Non-Wind Base Rate/0.584 | /                  | Wind Base Rate/0.609 |
      | SC_039 | Non-Wind Base Rate/0.596 | /                  | Wind Base Rate/0.251 |
      | SC_040 | Non-Wind Base Rate/0.596 | /                  | Wind Base Rate/0.251 |
      | SC_041 | Non-Wind Base Rate/0.6   | /                  | Wind Base Rate/0.782 |
      | SC_042 | Non-Wind Base Rate/0.6   | /                  | Wind Base Rate/0.782 |
      | SC_043 | Non-Wind Base Rate/0.585 | /                  | Wind Base Rate/0.777 |
      | SC_044 | Non-Wind Base Rate/0.585 | /                  | Wind Base Rate/0.777 |
      | SC_045 | Non-Wind Base Rate/0.59  | /                  | Wind Base Rate/0.75  |
      | SC_046 | Non-Wind Base Rate/0.59  | /                  | Wind Base Rate/0.75  |
      | SC_047 | Non-Wind Base Rate/0.59  | /                  | Wind Base Rate/0.166 |
      | SC_048 | Non-Wind Base Rate/0.59  | /                  | Wind Base Rate/0.166 |
      | SC_049 | Non-Wind Base Rate/0.586 | /                  | Wind Base Rate/0.976 |
      | SC_050 | Non-Wind Base Rate/0.586 | /                  | Wind Base Rate/0.976 |
      | SC_051 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/1.1   |
      | SC_052 | Non-Wind Base Rate/0.587 | /                  | Wind Base Rate/1.1   |
      | SC_053 | Non-Wind Base Rate/0.595 | /                  | Wind Base Rate/1.015 |
      | SC_054 | Non-Wind Base Rate/0.595 | /                  | Wind Base Rate/1.015 |
      | SC_055 | Non-Wind Base Rate/0.589 | /                  | Wind Base Rate/0.458 |
      | SC_056 | Non-Wind Base Rate/0.589 | /                  | Wind Base Rate/0.458 |

    @RegressionUS
    Examples:
      | TC_ID  | non-wind base rate       | wildfire base rate              | wind base rate       |
      | OR_001 | Non-Wind Base Rate/0.465 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | OR_002 | Non-Wind Base Rate/0.465 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | UT_001 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | UT_002 | Non-Wind Base Rate/0.495 | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | WY_001 | Non-Wind Base Rate/0.5   | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | WY_002 | Non-Wind Base Rate/0.5   | Wildfire Base Rate Non-CA/0.226 | Wind Base Rate/0     |
      | RI_001 | Non-Wind Base Rate/0.385 | /                               | Wind Base Rate/0.19  |
      | RI_002 | Non-Wind Base Rate/0.385 | /                               | Wind Base Rate/0.193 |
      | RI_003 | Non-Wind Base Rate/0.636 | /                               | Wind Base Rate/0     |
      | RI_004 | Non-Wind Base Rate/0.636 | /                               | Wind Base Rate/0     |
      | RI_005 | Non-Wind Base Rate/0.385 | /                               | Wind Base Rate/0.19  |
      | VA_001 | Non-Wind Base Rate/0.474 | /                               | Wind Base Rate/0     |
      | VA_002 | Non-Wind Base Rate/0.474 | /                               | Wind Base Rate/0     |
      | VA_003 | Non-Wind Base Rate/0.546 | /                               | Wind Base Rate/0     |
      | VA_004 | Non-Wind Base Rate/0.546 | /                               | Wind Base Rate/0     |
      | VA_005 | Non-Wind Base Rate/0.512 | /                               | Wind Base Rate/0     |
      | WA_001 | Non-Wind Base Rate/0.413 | Wildfire Base Rate Non-CA/0.273 | Wind Base Rate/0     |
      | WA_002 | Non-Wind Base Rate/0.413 | Wildfire Base Rate Non-CA/0.273 | Wind Base Rate/0     |
      | WA_003 | Non-Wind Base Rate/0.533 | Wildfire Base Rate Non-CA/0.353 | Wind Base Rate/0     |
      | WA_004 | Non-Wind Base Rate/0.533 | Wildfire Base Rate Non-CA/0.353 | Wind Base Rate/0     |
      | WA_005 | Non-Wind Base Rate/0.484 | Wildfire Base Rate Non-CA/0.32  | Wind Base Rate/0     |
      | SC_001 | Non-Wind Base Rate/0.585 | /                               | Wind Base Rate/0.278 |
      | SC_002 | Non-Wind Base Rate/0.585 | /                               | Wind Base Rate/0.278 |
      | SC_003 | Non-Wind Base Rate/0.585 | /                               | Wind Base Rate/0.278 |
      | SC_004 | Non-Wind Base Rate/0.585 | /                               | Wind Base Rate/0.278 |
      | SC_005 | Non-Wind Base Rate/0.511 | /                               | Wind Base Rate/0.169 |