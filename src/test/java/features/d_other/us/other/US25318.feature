Feature: Quote Creation HO
  As a user I want to create HO policies using data from excel workbook

  @US25318 @FL @Referrals @HO
  Scenario Outline: Policy Creation HO - NB - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "ReferralsHO" in sheet "FL-US25318" for "HO" LOB
    * I am logged in to Pure as Field
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I get customer account ID

    @Homeowners
    Examples:
      | TC_ID  |
      | FL_001 |
      | FL_002 |
      | FL_003 |
      | FL_004 |
      | FL_005 |
      | FL_006 |
      | FL_007 |
      | FL_008 |
      | FL_009 |
      | FL_010 |
      | FL_011 |
      | FL_012 |
      | FL_013 |
      | FL_014 |
      | FL_015 |
      | FL_016 |
      | FL_017 |
      | FL_018 |
      | FL_019 |
      | FL_020 |
      | FL_021 |
      | FL_022 |
      | FL_023 |
      | FL_024 |
      | FL_025 |
      | FL_026 |
      | FL_027 |
      | FL_028 |
      | FL_029 |
      | FL_030 |
      | FL_031 |
      | FL_032 |
      | FL_033 |
      | FL_034 |
      | FL_035 |
      | FL_036 |
      | FL_037 |
      | FL_038 |
      | FL_039 |
      | FL_040 |
      | FL_041 |
      | FL_042 |
      | FL_043 |
      | FL_044 |
      | FL_045 |
      | FL_046 |
      | FL_047 |
      | FL_048 |
      | FL_049 |
      | FL_050 |
      | FL_051 |
      | FL_052 |
      | FL_053 |
      | FL_054 |
#
      | FL_055 |
      | FL_056 |
      | FL_057 |
      | FL_058 |
      | FL_059 |
      | FL_060 |
      | FL_061 |
      | FL_062 |
      | FL_063 |
      | FL_064 |
      | FL_065 |
      | FL_066 |
      | FL_067 |
      | FL_068 |
      | FL_069 |
      | FL_070 |
      | FL_071 |
      | FL_072 |
      | FL_073 |
      | FL_074 |
      | FL_075 |
      | FL_076 |
      | FL_077 |
      | FL_078 |
      | FL_079 |
      | FL_080 |
      | FL_081 |
      | FL_082 |
      | FL_083 |
      | FL_084 |
      | FL_085 |
      | FL_086 |
      | FL_087 |
      | FL_088 |
      | FL_089 |
      | FL_090 |
      | FL_091 |
      | FL_092 |
      | FL_093 |
      | FL_094 |
      | FL_095 |
      | FL_096 |
      | FL_097 |
      | FL_098 |
      | FL_099 |
      | FL_100 |
      | FL_101 |
      | FL_102 |
      | FL_103 |
      | FL_104 |
      | FL_105 |
      | FL_106 |
      | FL_107 |
      | FL_108 |
      | FL_109 |
      | FL_110 |
      | FL_111 |
      | FL_112 |