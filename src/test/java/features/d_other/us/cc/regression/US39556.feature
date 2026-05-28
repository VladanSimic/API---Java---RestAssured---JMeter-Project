@CourseOfConstruction @US39556 @RegressionUS
Feature: US39556 - Update Base Rates and Taxes

  As a Product Owner I want to Test rating for the
  Surplus Course of Construction line for Phase 2

  Scenario Outline: Base rates - "<TC_ID>" - "<territory>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US39556" in sheet "QuoteCreatorCC" for "CC" LOB
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
    * I verify base rate "<wind base rate>"

    @NonWindBaseRate @WindBaseRate
    Examples:
      | TC_ID  | non-wind base rate       | wind base rate       | territory |
      | FL_001 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.232 | FL-4-B    |
      | FL_002 | Non-Wind Base Rate/1.652 | Wind Base Rate/1.947 | FL-4-C    |
      | FL_003 | Non-Wind Base Rate/1.71  | Wind Base Rate/1.66  | FL-4-D    |
      | FL_004 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.498 | FL-4-E    |
      | FL_005 | Non-Wind Base Rate/1.911 | Wind Base Rate/1.989 | FL-14-B   |
      | FL_006 | Non-Wind Base Rate/1.748 | Wind Base Rate/1.808 | FL-14-C   |
      | FL_007 | Non-Wind Base Rate/1.704 | Wind Base Rate/1.642 | FL-14-D   |
      | FL_008 | Non-Wind Base Rate/1.804 | Wind Base Rate/1.42  | FL-14-E   |
      | FL_009 | Non-Wind Base Rate/1.197 | Wind Base Rate/1.709 | FL-17-B   |
      | FL_010 | Non-Wind Base Rate/1.15  | Wind Base Rate/1.64  | FL-17-C   |
      | FL_011 | Non-Wind Base Rate/1.007 | Wind Base Rate/1.513 | FL-17-D   |
      | FL_012 | Non-Wind Base Rate/0.953 | Wind Base Rate/1.48  | FL-17-E   |
      | FL_013 | Non-Wind Base Rate/1.279 | Wind Base Rate/1.827 | FL-35-B   |
      | FL_014 | Non-Wind Base Rate/1.182 | Wind Base Rate/1.963 | FL-35-C   |
      | FL_015 | Non-Wind Base Rate/1.24  | Wind Base Rate/1.573 | FL-35-D   |
      | FL_016 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.342 | FL-35-E   |
      | FL_017 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.232 | FL-4-B    |
      | FL_018 | Non-Wind Base Rate/1.652 | Wind Base Rate/1.947 | FL-4-C    |
      | FL_019 | Non-Wind Base Rate/1.71  | Wind Base Rate/1.66  | FL-4-D    |
      | FL_020 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.498 | FL-4-E    |
      | FL_021 | Non-Wind Base Rate/1.911 | Wind Base Rate/1.989 | FL-14-B   |
      | FL_022 | Non-Wind Base Rate/1.748 | Wind Base Rate/1.808 | FL-14-C   |
      | FL_023 | Non-Wind Base Rate/1.704 | Wind Base Rate/1.642 | FL-14-D   |
      | FL_024 | Non-Wind Base Rate/1.804 | Wind Base Rate/1.42  | FL-14-E   |
      | FL_025 | Non-Wind Base Rate/1.197 | Wind Base Rate/1.709 | FL-17-B   |
      | FL_026 | Non-Wind Base Rate/1.15  | Wind Base Rate/1.64  | FL-17-C   |
      | FL_027 | Non-Wind Base Rate/1.007 | Wind Base Rate/1.513 | FL-17-D   |
      | FL_028 | Non-Wind Base Rate/0.953 | Wind Base Rate/1.48  | FL-17-E   |
      | FL_029 | Non-Wind Base Rate/1.279 | Wind Base Rate/1.827 | FL-35-B   |
      | FL_030 | Non-Wind Base Rate/1.182 | Wind Base Rate/1.963 | FL-35-C   |
      | FL_031 | Non-Wind Base Rate/1.24  | Wind Base Rate/1.573 | FL-35-D   |
      | FL_032 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.342 | FL-35-E   |

      | FL_033 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.976 | FL-4-B    |
      | FL_034 | Non-Wind Base Rate/1.652 | Wind Base Rate/2.597 | FL-4-C    |
      | FL_035 | Non-Wind Base Rate/1.71  | Wind Base Rate/2.213 | FL-4-D    |
      | FL_036 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.998 | FL-4-E    |
      | FL_037 | Non-Wind Base Rate/1.911 | Wind Base Rate/2.652 | FL-14-B   |
      | FL_038 | Non-Wind Base Rate/1.748 | Wind Base Rate/2.411 | FL-14-C   |
      | FL_039 | Non-Wind Base Rate/1.704 | Wind Base Rate/2.189 | FL-14-D   |
      | FL_040 | Non-Wind Base Rate/1.804 | Wind Base Rate/1.894 | FL-14-E   |
      | FL_041 | Non-Wind Base Rate/1.197 | Wind Base Rate/2.279 | FL-17-B   |
      | FL_042 | Non-Wind Base Rate/1.15  | Wind Base Rate/2.187 | FL-17-C   |
      | FL_043 | Non-Wind Base Rate/1.007 | Wind Base Rate/2.017 | FL-17-D   |
      | FL_044 | Non-Wind Base Rate/0.953 | Wind Base Rate/1.973 | FL-17-E   |
      | FL_045 | Non-Wind Base Rate/1.279 | Wind Base Rate/2.436 | FL-35-B   |
      | FL_046 | Non-Wind Base Rate/1.182 | Wind Base Rate/2.618 | FL-35-C   |
      | FL_047 | Non-Wind Base Rate/1.24  | Wind Base Rate/2.097 | FL-35-D   |
      | FL_048 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.789 | FL-35-E   |
      | FL_049 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.976 | FL-4-B    |
      | FL_050 | Non-Wind Base Rate/1.652 | Wind Base Rate/2.597 | FL-4-C    |
      | FL_051 | Non-Wind Base Rate/1.71  | Wind Base Rate/2.213 | FL-4-D    |
      | FL_052 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.998 | FL-4-E    |
      | FL_053 | Non-Wind Base Rate/1.911 | Wind Base Rate/2.652 | FL-14-B   |
      | FL_054 | Non-Wind Base Rate/1.748 | Wind Base Rate/2.411 | FL-14-C   |
      | FL_055 | Non-Wind Base Rate/1.704 | Wind Base Rate/2.189 | FL-14-D   |
      | FL_056 | Non-Wind Base Rate/1.804 | Wind Base Rate/1.894 | FL-14-E   |
      | FL_057 | Non-Wind Base Rate/1.197 | Wind Base Rate/2.279 | FL-17-B   |
      | FL_058 | Non-Wind Base Rate/1.15  | Wind Base Rate/2.187 | FL-17-C   |
      | FL_059 | Non-Wind Base Rate/1.007 | Wind Base Rate/2.017 | FL-17-D   |
      | FL_060 | Non-Wind Base Rate/0.953 | Wind Base Rate/1.973 | FL-17-E   |
      | FL_061 | Non-Wind Base Rate/1.279 | Wind Base Rate/2.436 | FL-35-B   |
      | FL_062 | Non-Wind Base Rate/1.182 | Wind Base Rate/2.618 | FL-35-C   |
      | FL_063 | Non-Wind Base Rate/1.24  | Wind Base Rate/2.097 | FL-35-D   |
      | FL_064 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.789 | FL-35-E   |

    @RegressionUS
    Examples:
      | TC_ID  | non-wind base rate       | wind base rate       | territory |
      | FL_001 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.232 | FL-4-B    |
      | FL_002 | Non-Wind Base Rate/1.652 | Wind Base Rate/1.947 | FL-4-C    |
      | FL_003 | Non-Wind Base Rate/1.71  | Wind Base Rate/1.66  | FL-4-D    |
      | FL_004 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.498 | FL-4-E    |
      | FL_029 | Non-Wind Base Rate/1.279 | Wind Base Rate/1.827 | FL-35-B   |
      | FL_030 | Non-Wind Base Rate/1.182 | Wind Base Rate/1.963 | FL-35-C   |
      | FL_031 | Non-Wind Base Rate/1.24  | Wind Base Rate/1.573 | FL-35-D   |
      | FL_032 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.342 | FL-35-E   |
      | FL_033 | Non-Wind Base Rate/2.048 | Wind Base Rate/2.976 | FL-4-B    |
      | FL_034 | Non-Wind Base Rate/1.652 | Wind Base Rate/2.597 | FL-4-C    |
      | FL_035 | Non-Wind Base Rate/1.71  | Wind Base Rate/2.213 | FL-4-D    |
      | FL_036 | Non-Wind Base Rate/1.701 | Wind Base Rate/1.998 | FL-4-E    |
      | FL_061 | Non-Wind Base Rate/1.279 | Wind Base Rate/2.436 | FL-35-B   |
      | FL_062 | Non-Wind Base Rate/1.182 | Wind Base Rate/2.618 | FL-35-C   |
      | FL_063 | Non-Wind Base Rate/1.24  | Wind Base Rate/2.097 | FL-35-D   |
      | FL_064 | Non-Wind Base Rate/1.398 | Wind Base Rate/1.789 | FL-35-E   |
