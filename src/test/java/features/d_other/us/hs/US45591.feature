@HomeownersSurplus @US45591 @TF107 @TF1154 @TF1158 @TC90246
Feature: PSE

  @Accredited @STG
  Scenario Outline: US45591 - Get Base Rates for Accredited NY - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE NY condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45591" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/20/25"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/Accredited" in "Base_Rates" excel file for "New Business"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/Accredited" in "Base_Rates" excel file for "Endorsement"

    When I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/Accredited" in "Base_Rates" excel file for "Renewal"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_001 | Homeowner     | Suffolk      |
      | NY_002 | Homeowner     | Suffolk      |
      | NY_003 | Homeowner     | Suffolk      |
      | NY_004 | Homeowner     | Suffolk      |
      | NY_005 | Homeowner     | Nassau       |
      | NY_006 | Homeowner     | Nassau       |
      | NY_007 | Homeowner     | Nassau       |
      | NY_008 | Homeowner     | Nassau       |
      | NY_009 | Homeowner     | New York     |
      | NY_010 | Homeowner     | New York     |
      | NY_011 | Homeowner     | New York     |
      | NY_012 | Homeowner     | New York     |
      | NY_013 | Homeowner     | Queens       |
      | NY_014 | Homeowner     | Queens       |
      | NY_015 | Homeowner     | Queens       |
      | NY_016 | Homeowner     | Queens       |
      | NY_017 | Homeowner     | Richmond     |
      | NY_018 | Homeowner     | Richmond     |
      | NY_019 | Homeowner     | Richmond     |
      | NY_020 | Homeowner     | Richmond     |
      | NY_021 | Homeowner     | Kings        |
      | NY_022 | Homeowner     | Kings        |
      | NY_023 | Homeowner     | Kings        |
      | NY_024 | Homeowner     | Kings        |
      | NY_025 | Homeowner     | Bronx        |
      | NY_026 | Homeowner     | Bronx        |
      | NY_027 | Homeowner     | Bronx        |
      | NY_028 | Homeowner     | Bronx        |
      | NY_029 | Homeowner     | Westchester  |
      | NY_030 | Homeowner     | Westchester  |
      | NY_031 | Homeowner     | Westchester  |
      | NY_032 | Homeowner     | Westchester  |
      | NY_033 | Homeowner     | Putnam       |
      | NY_034 | Homeowner     | Rockland     |
      | NY_035 | Homeowner     | Albany       |
      | NY_036 | Homeowner     | Allegany     |
      | NY_037 | Homeowner     | Broome       |
      | NY_038 | Homeowner     | Cattaraugus  |
      | NY_039 | Homeowner     | Cayuga       |
      | NY_040 | Homeowner     | Chautauqua   |
      | NY_041 | Homeowner     | Chemung      |
      | NY_042 | Homeowner     | Chenango     |
      | NY_043 | Homeowner     | Clinton      |
      | NY_044 | Homeowner     | Columbia     |
      | NY_045 | Homeowner     | Cortland     |
      | NY_046 | Homeowner     | Delaware     |
      | NY_047 | Homeowner     | Dutchess     |
      | NY_048 | Homeowner     | Erie         |
      | NY_049 | Homeowner     | Essex        |
      | NY_050 | Homeowner     | Franklin     |
      | NY_051 | Homeowner     | Fulton       |
      | NY_052 | Homeowner     | Genesee      |
      | NY_053 | Homeowner     | Greene       |
      | NY_054 | Homeowner     | Hamilton     |
      | NY_055 | Homeowner     | Herkimer     |
      | NY_056 | Homeowner     | Jefferson    |
      | NY_057 | Homeowner     | Lewis        |
      | NY_058 | Homeowner     | Livingston   |
      | NY_059 | Homeowner     | Madison      |
      | NY_060 | Homeowner     | Monroe       |
      | NY_061 | Homeowner     | Montgomery   |
      | NY_062 | Homeowner     | Niagara      |
      | NY_063 | Homeowner     | Oneida       |
      | NY_064 | Homeowner     | Onondaga     |
      | NY_065 | Homeowner     | Ontario      |
      | NY_066 | Homeowner     | Orange       |
      | NY_067 | Homeowner     | Orleans      |
      | NY_068 | Homeowner     | Oswego       |
      | NY_069 | Homeowner     | Otsego       |
      | NY_070 | Homeowner     | Rensselaer   |
      | NY_071 | Homeowner     | Saratoga     |
      | NY_072 | Homeowner     | Schenectady  |
      | NY_073 | Homeowner     | Schoharie    |
      | NY_074 | Homeowner     | Schuyler     |
      | NY_075 | Homeowner     | Seneca       |
      | NY_076 | Homeowner     | St. Lawrence |
      | NY_077 | Homeowner     | Steuben      |
      | NY_078 | Homeowner     | Sullivan     |
      | NY_079 | Homeowner     | Tioga        |
      | NY_080 | Homeowner     | Tompkins     |
      | NY_081 | Homeowner     | Ulster       |
      | NY_082 | Homeowner     | Warren       |
      | NY_083 | Homeowner     | Washington   |
      | NY_084 | Homeowner     | Wayne        |
      | NY_085 | Homeowner     | Wyoming      |
      | NY_086 | Homeowner     | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County      |
      | NY_004 | Homeowner     | Suffolk     |
      | NY_070 | Homeowner     | Rensselaer  |
      | NY_071 | Homeowner     | Saratoga    |
      | NY_072 | Homeowner     | Schenectady |
      | NY_074 | Homeowner     | Schuyler    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_101 | Condo/Co-op   | Suffolk      |
      | NY_102 | Condo/Co-op   | Suffolk      |
      | NY_103 | Condo/Co-op   | Suffolk      |
      | NY_104 | Condo/Co-op   | Suffolk      |
      | NY_105 | Condo/Co-op   | Nassau       |
      | NY_106 | Condo/Co-op   | Nassau       |
      | NY_107 | Condo/Co-op   | Nassau       |
      | NY_108 | Condo/Co-op   | Nassau       |
      | NY_109 | Condo/Co-op   | New York     |
      | NY_110 | Condo/Co-op   | New York     |
      | NY_111 | Condo/Co-op   | New York     |
      | NY_112 | Condo/Co-op   | New York     |
      | NY_113 | Condo/Co-op   | Queens       |
      | NY_114 | Condo/Co-op   | Queens       |
      | NY_115 | Condo/Co-op   | Queens       |
      | NY_116 | Condo/Co-op   | Queens       |
      | NY_117 | Condo/Co-op   | Richmond     |
      | NY_118 | Condo/Co-op   | Richmond     |
      | NY_119 | Condo/Co-op   | Richmond     |
      | NY_120 | Condo/Co-op   | Richmond     |
      | NY_121 | Condo/Co-op   | Kings        |
      | NY_122 | Condo/Co-op   | Kings        |
      | NY_123 | Condo/Co-op   | Kings        |
      | NY_124 | Condo/Co-op   | Kings        |
      | NY_125 | Condo/Co-op   | Bronx        |
      | NY_126 | Condo/Co-op   | Bronx        |
      | NY_127 | Condo/Co-op   | Bronx        |
      | NY_128 | Condo/Co-op   | Bronx        |
      | NY_129 | Condo/Co-op   | Westchester  |
      | NY_130 | Condo/Co-op   | Westchester  |
      | NY_131 | Condo/Co-op   | Westchester  |
      | NY_132 | Condo/Co-op   | Westchester  |
      | NY_133 | Condo/Co-op   | Putnam       |
      | NY_134 | Condo/Co-op   | Rockland     |
      | NY_135 | Condo/Co-op   | Albany       |
      | NY_136 | Condo/Co-op   | Allegany     |
      | NY_137 | Condo/Co-op   | Broome       |
      | NY_138 | Condo/Co-op   | Cattaraugus  |
      | NY_139 | Condo/Co-op   | Cayuga       |
      | NY_140 | Condo/Co-op   | Chautauqua   |
      | NY_141 | Condo/Co-op   | Chemung      |
      | NY_142 | Condo/Co-op   | Chenango     |
      | NY_143 | Condo/Co-op   | Clinton      |
      | NY_144 | Condo/Co-op   | Columbia     |
      | NY_145 | Condo/Co-op   | Cortland     |
      | NY_146 | Condo/Co-op   | Delaware     |
      | NY_147 | Condo/Co-op   | Dutchess     |
      | NY_148 | Condo/Co-op   | Erie         |
      | NY_149 | Condo/Co-op   | Essex        |
      | NY_150 | Condo/Co-op   | Franklin     |
      | NY_151 | Condo/Co-op   | Fulton       |
      | NY_152 | Condo/Co-op   | Genesee      |
      | NY_153 | Condo/Co-op   | Greene       |
      | NY_154 | Condo/Co-op   | Hamilton     |
      | NY_155 | Condo/Co-op   | Herkimer     |
      | NY_156 | Condo/Co-op   | Jefferson    |
      | NY_157 | Condo/Co-op   | Lewis        |
      | NY_158 | Condo/Co-op   | Livingston   |
      | NY_159 | Condo/Co-op   | Madison      |
      | NY_160 | Condo/Co-op   | Monroe       |
      | NY_161 | Condo/Co-op   | Montgomery   |
      | NY_162 | Condo/Co-op   | Niagara      |
      | NY_163 | Condo/Co-op   | Oneida       |
      | NY_164 | Condo/Co-op   | Onondaga     |
      | NY_165 | Condo/Co-op   | Ontario      |
      | NY_166 | Condo/Co-op   | Orange       |
      | NY_167 | Condo/Co-op   | Orleans      |
      | NY_168 | Condo/Co-op   | Oswego       |
      | NY_169 | Condo/Co-op   | Otsego       |
      | NY_170 | Condo/Co-op   | Rensselaer   |
      | NY_171 | Condo/Co-op   | Saratoga     |
      | NY_172 | Condo/Co-op   | Schenectady  |
      | NY_173 | Condo/Co-op   | Schoharie    |
      | NY_174 | Condo/Co-op   | Schuyler     |
      | NY_175 | Condo/Co-op   | Seneca       |
      | NY_176 | Condo/Co-op   | St. Lawrence |
      | NY_177 | Condo/Co-op   | Steuben      |
      | NY_178 | Condo/Co-op   | Sullivan     |
      | NY_179 | Condo/Co-op   | Tioga        |
      | NY_180 | Condo/Co-op   | Tompkins     |
      | NY_181 | Condo/Co-op   | Ulster       |
      | NY_182 | Condo/Co-op   | Warren       |
      | NY_183 | Condo/Co-op   | Washington   |
      | NY_184 | Condo/Co-op   | Wayne        |
      | NY_185 | Condo/Co-op   | Wyoming      |
      | NY_186 | Condo/Co-op   | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County     |
      | NY_112 | Condo/Co-op   | New York   |
      | NY_113 | Condo/Co-op   | Queens     |
      | NY_139 | Condo/Co-op   | Cayuga     |
      | NY_140 | Condo/Co-op   | Chautauqua |
      | NY_141 | Condo/Co-op   | Chemung    |

  @PSE @STG
  Scenario Outline: US45591 - Get Base Rates for PSE NY - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE NY condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45591" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/20/25"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/PSE" in "Base_Rates" excel file for "New Business"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/PSE" in "Base_Rates" excel file for "Endorsement"

    When I click exit button
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I issue an endorsement

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "HS" renewal
    * I review changes
    * I click renewed premium
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45591/PSE" in "Base_Rates" excel file for "Renewal"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_001 | Homeowner     | Suffolk      |
      | NY_002 | Homeowner     | Suffolk      |
      | NY_003 | Homeowner     | Suffolk      |
      | NY_004 | Homeowner     | Suffolk      |
      | NY_005 | Homeowner     | Nassau       |
      | NY_006 | Homeowner     | Nassau       |
      | NY_007 | Homeowner     | Nassau       |
      | NY_008 | Homeowner     | Nassau       |
      | NY_009 | Homeowner     | New York     |
      | NY_010 | Homeowner     | New York     |
      | NY_011 | Homeowner     | New York     |
      | NY_012 | Homeowner     | New York     |
      | NY_013 | Homeowner     | Queens       |
      | NY_014 | Homeowner     | Queens       |
      | NY_015 | Homeowner     | Queens       |
      | NY_016 | Homeowner     | Queens       |
      | NY_017 | Homeowner     | Richmond     |
      | NY_018 | Homeowner     | Richmond     |
      | NY_019 | Homeowner     | Richmond     |
      | NY_020 | Homeowner     | Richmond     |
      | NY_021 | Homeowner     | Kings        |
      | NY_022 | Homeowner     | Kings        |
      | NY_023 | Homeowner     | Kings        |
      | NY_024 | Homeowner     | Kings        |
      | NY_025 | Homeowner     | Bronx        |
      | NY_026 | Homeowner     | Bronx        |
      | NY_027 | Homeowner     | Bronx        |
      | NY_028 | Homeowner     | Bronx        |
      | NY_029 | Homeowner     | Westchester  |
      | NY_030 | Homeowner     | Westchester  |
      | NY_031 | Homeowner     | Westchester  |
      | NY_032 | Homeowner     | Westchester  |
      | NY_033 | Homeowner     | Putnam       |
      | NY_034 | Homeowner     | Rockland     |
      | NY_035 | Homeowner     | Albany       |
      | NY_036 | Homeowner     | Allegany     |
      | NY_037 | Homeowner     | Broome       |
      | NY_038 | Homeowner     | Cattaraugus  |
      | NY_039 | Homeowner     | Cayuga       |
      | NY_040 | Homeowner     | Chautauqua   |
      | NY_041 | Homeowner     | Chemung      |
      | NY_042 | Homeowner     | Chenango     |
      | NY_043 | Homeowner     | Clinton      |
      | NY_044 | Homeowner     | Columbia     |
      | NY_045 | Homeowner     | Cortland     |
      | NY_046 | Homeowner     | Delaware     |
      | NY_047 | Homeowner     | Dutchess     |
      | NY_048 | Homeowner     | Erie         |
      | NY_049 | Homeowner     | Essex        |
      | NY_050 | Homeowner     | Franklin     |
      | NY_051 | Homeowner     | Fulton       |
      | NY_052 | Homeowner     | Genesee      |
      | NY_053 | Homeowner     | Greene       |
      | NY_054 | Homeowner     | Hamilton     |
      | NY_055 | Homeowner     | Herkimer     |
      | NY_056 | Homeowner     | Jefferson    |
      | NY_057 | Homeowner     | Lewis        |
      | NY_058 | Homeowner     | Livingston   |
      | NY_059 | Homeowner     | Madison      |
      | NY_060 | Homeowner     | Monroe       |
      | NY_061 | Homeowner     | Montgomery   |
      | NY_062 | Homeowner     | Niagara      |
      | NY_063 | Homeowner     | Oneida       |
      | NY_064 | Homeowner     | Onondaga     |
      | NY_065 | Homeowner     | Ontario      |
      | NY_066 | Homeowner     | Orange       |
      | NY_067 | Homeowner     | Orleans      |
      | NY_068 | Homeowner     | Oswego       |
      | NY_069 | Homeowner     | Otsego       |
      | NY_070 | Homeowner     | Rensselaer   |
      | NY_071 | Homeowner     | Saratoga     |
      | NY_072 | Homeowner     | Schenectady  |
      | NY_073 | Homeowner     | Schoharie    |
      | NY_074 | Homeowner     | Schuyler     |
      | NY_075 | Homeowner     | Seneca       |
      | NY_076 | Homeowner     | St. Lawrence |
      | NY_077 | Homeowner     | Steuben      |
      | NY_078 | Homeowner     | Sullivan     |
      | NY_079 | Homeowner     | Tioga        |
      | NY_080 | Homeowner     | Tompkins     |
      | NY_081 | Homeowner     | Ulster       |
      | NY_082 | Homeowner     | Warren       |
      | NY_083 | Homeowner     | Washington   |
      | NY_084 | Homeowner     | Wayne        |
      | NY_085 | Homeowner     | Wyoming      |
      | NY_086 | Homeowner     | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County      |
      | NY_004 | Homeowner     | Suffolk     |
      | NY_070 | Homeowner     | Rensselaer  |
      | NY_071 | Homeowner     | Saratoga    |
      | NY_072 | Homeowner     | Schenectady |
      | NY_074 | Homeowner     | Schuyler    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_101 | Condo/Co-op   | Suffolk      |
      | NY_102 | Condo/Co-op   | Suffolk      |
      | NY_103 | Condo/Co-op   | Suffolk      |
      | NY_104 | Condo/Co-op   | Suffolk      |
      | NY_105 | Condo/Co-op   | Nassau       |
      | NY_106 | Condo/Co-op   | Nassau       |
      | NY_107 | Condo/Co-op   | Nassau       |
      | NY_108 | Condo/Co-op   | Nassau       |
      | NY_109 | Condo/Co-op   | New York     |
      | NY_110 | Condo/Co-op   | New York     |
      | NY_111 | Condo/Co-op   | New York     |
      | NY_112 | Condo/Co-op   | New York     |
      | NY_113 | Condo/Co-op   | Queens       |
      | NY_114 | Condo/Co-op   | Queens       |
      | NY_115 | Condo/Co-op   | Queens       |
      | NY_116 | Condo/Co-op   | Queens       |
      | NY_117 | Condo/Co-op   | Richmond     |
      | NY_118 | Condo/Co-op   | Richmond     |
      | NY_119 | Condo/Co-op   | Richmond     |
      | NY_120 | Condo/Co-op   | Richmond     |
      | NY_121 | Condo/Co-op   | Kings        |
      | NY_122 | Condo/Co-op   | Kings        |
      | NY_123 | Condo/Co-op   | Kings        |
      | NY_124 | Condo/Co-op   | Kings        |
      | NY_125 | Condo/Co-op   | Bronx        |
      | NY_126 | Condo/Co-op   | Bronx        |
      | NY_127 | Condo/Co-op   | Bronx        |
      | NY_128 | Condo/Co-op   | Bronx        |
      | NY_129 | Condo/Co-op   | Westchester  |
      | NY_130 | Condo/Co-op   | Westchester  |
      | NY_131 | Condo/Co-op   | Westchester  |
      | NY_132 | Condo/Co-op   | Westchester  |
      | NY_133 | Condo/Co-op   | Putnam       |
      | NY_134 | Condo/Co-op   | Rockland     |
      | NY_135 | Condo/Co-op   | Albany       |
      | NY_136 | Condo/Co-op   | Allegany     |
      | NY_137 | Condo/Co-op   | Broome       |
      | NY_138 | Condo/Co-op   | Cattaraugus  |
      | NY_139 | Condo/Co-op   | Cayuga       |
      | NY_140 | Condo/Co-op   | Chautauqua   |
      | NY_141 | Condo/Co-op   | Chemung      |
      | NY_142 | Condo/Co-op   | Chenango     |
      | NY_143 | Condo/Co-op   | Clinton      |
      | NY_144 | Condo/Co-op   | Columbia     |
      | NY_145 | Condo/Co-op   | Cortland     |
      | NY_146 | Condo/Co-op   | Delaware     |
      | NY_147 | Condo/Co-op   | Dutchess     |
      | NY_148 | Condo/Co-op   | Erie         |
      | NY_149 | Condo/Co-op   | Essex        |
      | NY_150 | Condo/Co-op   | Franklin     |
      | NY_151 | Condo/Co-op   | Fulton       |
      | NY_152 | Condo/Co-op   | Genesee      |
      | NY_153 | Condo/Co-op   | Greene       |
      | NY_154 | Condo/Co-op   | Hamilton     |
      | NY_155 | Condo/Co-op   | Herkimer     |
      | NY_156 | Condo/Co-op   | Jefferson    |
      | NY_157 | Condo/Co-op   | Lewis        |
      | NY_158 | Condo/Co-op   | Livingston   |
      | NY_159 | Condo/Co-op   | Madison      |
      | NY_160 | Condo/Co-op   | Monroe       |
      | NY_161 | Condo/Co-op   | Montgomery   |
      | NY_162 | Condo/Co-op   | Niagara      |
      | NY_163 | Condo/Co-op   | Oneida       |
      | NY_164 | Condo/Co-op   | Onondaga     |
      | NY_165 | Condo/Co-op   | Ontario      |
      | NY_166 | Condo/Co-op   | Orange       |
      | NY_167 | Condo/Co-op   | Orleans      |
      | NY_168 | Condo/Co-op   | Oswego       |
      | NY_169 | Condo/Co-op   | Otsego       |
      | NY_170 | Condo/Co-op   | Rensselaer   |
      | NY_171 | Condo/Co-op   | Saratoga     |
      | NY_172 | Condo/Co-op   | Schenectady  |
      | NY_173 | Condo/Co-op   | Schoharie    |
      | NY_174 | Condo/Co-op   | Schuyler     |
      | NY_175 | Condo/Co-op   | Seneca       |
      | NY_176 | Condo/Co-op   | St. Lawrence |
      | NY_177 | Condo/Co-op   | Steuben      |
      | NY_178 | Condo/Co-op   | Sullivan     |
      | NY_179 | Condo/Co-op   | Tioga        |
      | NY_180 | Condo/Co-op   | Tompkins     |
      | NY_181 | Condo/Co-op   | Ulster       |
      | NY_182 | Condo/Co-op   | Warren       |
      | NY_183 | Condo/Co-op   | Washington   |
      | NY_184 | Condo/Co-op   | Wayne        |
      | NY_185 | Condo/Co-op   | Wyoming      |
      | NY_186 | Condo/Co-op   | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County     |
      | NY_112 | Condo/Co-op   | New York   |
      | NY_113 | Condo/Co-op   | Queens     |
      | NY_139 | Condo/Co-op   | Cayuga     |
      | NY_140 | Condo/Co-op   | Chautauqua |
      | NY_141 | Condo/Co-op   | Chemung    |

  @CompareBaseRates @STG
  Scenario Outline: US45591 - I compare Accredited "<file1>" and PSE "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "PRE_PROD/US45591/"

    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_NY_001_750027940156.xlsx | PSE/Base_Rates_NY_001_750040031736.xlsx |
      | Accredited/Base_Rates_NY_002_750027944396.xlsx | PSE/Base_Rates_NY_002_750040024916.xlsx |
      | Accredited/Base_Rates_NY_003_750027950236.xlsx | PSE/Base_Rates_NY_003_750040020476.xlsx |
      | Accredited/Base_Rates_NY_004_750027942366.xlsx | PSE/Base_Rates_NY_004_750040021836.xlsx |
      | Accredited/Base_Rates_NY_005_750027947926.xlsx | PSE/Base_Rates_NY_005_750040021136.xlsx |
      | Accredited/Base_Rates_NY_006_750027949076.xlsx | PSE/Base_Rates_NY_006_750040028336.xlsx |
      | Accredited/Base_Rates_NY_007_750027945486.xlsx | PSE/Base_Rates_NY_007_750040579646.xlsx |
      | Accredited/Base_Rates_NY_008_750027938606.xlsx | PSE/Base_Rates_NY_008_750040022726.xlsx |
      | Accredited/Base_Rates_NY_009_750027940616.xlsx | PSE/Base_Rates_NY_009_750040032926.xlsx |
      | Accredited/Base_Rates_NY_010_750027947266.xlsx | PSE/Base_Rates_NY_010_750040086406.xlsx |
      | Accredited/Base_Rates_NY_011_750027945906.xlsx | PSE/Base_Rates_NY_011_750040023296.xlsx |
      | Accredited/Base_Rates_NY_012_750027941476.xlsx | PSE/Base_Rates_NY_012_750040087176.xlsx |
      | Accredited/Base_Rates_NY_013_750027941966.xlsx | PSE/Base_Rates_NY_013_750040024766.xlsx |
      | Accredited/Base_Rates_NY_014_750027942676.xlsx | PSE/Base_Rates_NY_014_750040030186.xlsx |
      | Accredited/Base_Rates_NY_015_750030090686.xlsx | PSE/Base_Rates_NY_015_750040025466.xlsx |
      | Accredited/Base_Rates_NY_016_750027977536.xlsx | PSE/Base_Rates_NY_016_750040100256.xlsx |
      | Accredited/Base_Rates_NY_017_750030086526.xlsx | PSE/Base_Rates_NY_017_750040589706.xlsx |
      | Accredited/Base_Rates_NY_018_750030090046.xlsx | PSE/Base_Rates_NY_018_750040313276.xlsx |
      | Accredited/Base_Rates_NY_019_750030085946.xlsx | PSE/Base_Rates_NY_019_750040314586.xlsx |
      | Accredited/Base_Rates_NY_020_750030099606.xlsx | PSE/Base_Rates_NY_020_750040315516.xlsx |
      | Accredited/Base_Rates_NY_021_750030099716.xlsx | PSE/Base_Rates_NY_021_750040577756.xlsx |
      | Accredited/Base_Rates_NY_022_750030086436.xlsx | PSE/Base_Rates_NY_022_750040318736.xlsx |
      | Accredited/Base_Rates_NY_023_750030091026.xlsx | PSE/Base_Rates_NY_023_750040320356.xlsx |
      | Accredited/Base_Rates_NY_024_750030085046.xlsx | PSE/Base_Rates_NY_024_750040319796.xlsx |
      | Accredited/Base_Rates_NY_025_750030084346.xlsx | PSE/Base_Rates_NY_025_750040320046.xlsx |
      | Accredited/Base_Rates_NY_026_750030100576.xlsx | PSE/Base_Rates_NY_026_750040323816.xlsx |
      | Accredited/Base_Rates_NY_027_750030085856.xlsx | PSE/Base_Rates_NY_027_750040324686.xlsx |
      | Accredited/Base_Rates_NY_028_750030090386.xlsx | PSE/Base_Rates_NY_028_750040324776.xlsx |
      | Accredited/Base_Rates_NY_029_750030096786.xlsx | PSE/Base_Rates_NY_029_750040326356.xlsx |
      | Accredited/Base_Rates_NY_030_750030090136.xlsx | PSE/Base_Rates_NY_030_750040327046.xlsx |
      | Accredited/Base_Rates_NY_031_750030799186.xlsx | PSE/Base_Rates_NY_031_750040332966.xlsx |
      | Accredited/Base_Rates_NY_032_750030801276.xlsx | PSE/Base_Rates_NY_032_750040588616.xlsx |
      | Accredited/Base_Rates_NY_033_750030815566.xlsx | PSE/Base_Rates_NY_033_750040575196.xlsx |
      | Accredited/Base_Rates_NY_034_750030820566.xlsx | PSE/Base_Rates_NY_034_750040577276.xlsx |
      | Accredited/Base_Rates_NY_035_750030818416.xlsx | PSE/Base_Rates_NY_035_750040583516.xlsx |
      | Accredited/Base_Rates_NY_036_750030822876.xlsx | PSE/Base_Rates_NY_036_750040576996.xlsx |
      | Accredited/Base_Rates_NY_037_750030824876.xlsx | PSE/Base_Rates_NY_037_750040588086.xlsx |
      | Accredited/Base_Rates_NY_038_750030825596.xlsx | PSE/Base_Rates_NY_038_750040575666.xlsx |
      | Accredited/Base_Rates_NY_039_750030827446.xlsx | PSE/Base_Rates_NY_039_750040579006.xlsx |
      | Accredited/Base_Rates_NY_040_750030828086.xlsx | PSE/Base_Rates_NY_040_750040576316.xlsx |
      | Accredited/Base_Rates_NY_041_750030838746.xlsx | PSE/Base_Rates_NY_041_750040580126.xlsx |
      | Accredited/Base_Rates_NY_042_750030839496.xlsx | PSE/Base_Rates_NY_042_750040587046.xlsx |
      | Accredited/Base_Rates_NY_043_750030841526.xlsx | PSE/Base_Rates_NY_043_750040581626.xlsx |
      | Accredited/Base_Rates_NY_044_750030840656.xlsx | PSE/Base_Rates_NY_044_750040852426.xlsx |
      | Accredited/Base_Rates_NY_045_750030854426.xlsx | PSE/Base_Rates_NY_045_750040852886.xlsx |
      | Accredited/Base_Rates_NY_046_750031599086.xlsx | PSE/Base_Rates_NY_046_750040855146.xlsx |
      | Accredited/Base_Rates_NY_047_750031616266.xlsx | PSE/Base_Rates_NY_047_750040856316.xlsx |
      | Accredited/Base_Rates_NY_048_750039752006.xlsx | PSE/Base_Rates_NY_048_750040858066.xlsx |
      | Accredited/Base_Rates_NY_049_750031633816.xlsx | PSE/Base_Rates_NY_049_750040859266.xlsx |
      | Accredited/Base_Rates_NY_050_750031640106.xlsx | PSE/Base_Rates_NY_050_750040863386.xlsx |
      | Accredited/Base_Rates_NY_051_750031638876.xlsx | PSE/Base_Rates_NY_051_750040863476.xlsx |
      | Accredited/Base_Rates_NY_052_750031639596.xlsx | PSE/Base_Rates_NY_052_750040866416.xlsx |
      | Accredited/Base_Rates_NY_053_750031642916.xlsx | PSE/Base_Rates_NY_053_750040862296.xlsx |
      | Accredited/Base_Rates_NY_054_750031644436.xlsx | PSE/Base_Rates_NY_054_750040865266.xlsx |
      | Accredited/Base_Rates_NY_055_750031651116.xlsx | PSE/Base_Rates_NY_055_750040860716.xlsx |
      | Accredited/Base_Rates_NY_056_750031651966.xlsx | PSE/Base_Rates_NY_056_750040867566.xlsx |
      | Accredited/Base_Rates_NY_057_750039748436.xlsx | PSE/Base_Rates_NY_057_750040862026.xlsx |
      | Accredited/Base_Rates_NY_058_750031653626.xlsx | PSE/Base_Rates_NY_058_750040860966.xlsx |
      | Accredited/Base_Rates_NY_059_750031662336.xlsx | PSE/Base_Rates_NY_059_750041096586.xlsx |
      | Accredited/Base_Rates_NY_060_750031666106.xlsx | PSE/Base_Rates_NY_060_750041099806.xlsx |
      | Accredited/Base_Rates_NY_061_750031804046.xlsx | PSE/Base_Rates_NY_061_750041102126.xlsx |
      | Accredited/Base_Rates_NY_062_750031846396.xlsx | PSE/Base_Rates_NY_062_750041102996.xlsx |
      | Accredited/Base_Rates_NY_063_750032324786.xlsx | PSE/Base_Rates_NY_063_750041105326.xlsx |
      | Accredited/Base_Rates_NY_064_750032336466.xlsx | PSE/Base_Rates_NY_064_750041106866.xlsx |
      | Accredited/Base_Rates_NY_065_750032354156.xlsx | PSE/Base_Rates_NY_065_750041108066.xlsx |
      | Accredited/Base_Rates_NY_066_750032359916.xlsx | PSE/Base_Rates_NY_066_750041109716.xlsx |
      | Accredited/Base_Rates_NY_067_750032363176.xlsx | PSE/Base_Rates_NY_067_750041110456.xlsx |
      | Accredited/Base_Rates_NY_068_750032369156.xlsx | PSE/Base_Rates_NY_068_750041112606.xlsx |
      | Accredited/Base_Rates_NY_069_750032373106.xlsx | PSE/Base_Rates_NY_069_750041113906.xlsx |
      | Accredited/Base_Rates_NY_070_750032373806.xlsx | PSE/Base_Rates_NY_070_750041114906.xlsx |
      | Accredited/Base_Rates_NY_071_750032383746.xlsx | PSE/Base_Rates_NY_071_750045482896.xlsx |
      | Accredited/Base_Rates_NY_072_750032390206.xlsx | PSE/Base_Rates_NY_072_750041168046.xlsx |
      | Accredited/Base_Rates_NY_073_750032445706.xlsx | PSE/Base_Rates_NY_073_750041171766.xlsx |
      | Accredited/Base_Rates_NY_074_750037985186.xlsx | PSE/Base_Rates_NY_074_750041315016.xlsx |
      | Accredited/Base_Rates_NY_075_750032452136.xlsx | PSE/Base_Rates_NY_075_750041386566.xlsx |
      | Accredited/Base_Rates_NY_076_750032454276.xlsx | PSE/Base_Rates_NY_076_750045592346.xlsx |
      | Accredited/Base_Rates_NY_077_750039748096.xlsx | PSE/Base_Rates_NY_077_750041392196.xlsx |
      | Accredited/Base_Rates_NY_078_750039750926.xlsx | PSE/Base_Rates_NY_078_750041393156.xlsx |
      | Accredited/Base_Rates_NY_079_750032770876.xlsx | PSE/Base_Rates_NY_079_750041394586.xlsx |
      | Accredited/Base_Rates_NY_080_750032779466.xlsx | PSE/Base_Rates_NY_080_750041396776.xlsx |
      | Accredited/Base_Rates_NY_081_750032986796.xlsx | PSE/Base_Rates_NY_081_750041399066.xlsx |
      | Accredited/Base_Rates_NY_082_750032991036.xlsx | PSE/Base_Rates_NY_082_750041397706.xlsx |
      | Accredited/Base_Rates_NY_083_750033011686.xlsx | PSE/Base_Rates_NY_083_750041398356.xlsx |
      | Accredited/Base_Rates_NY_084_750033018446.xlsx | PSE/Base_Rates_NY_084_750041402666.xlsx |
      | Accredited/Base_Rates_NY_085_750033019106.xlsx | PSE/Base_Rates_NY_085_750041404386.xlsx |
      | Accredited/Base_Rates_NY_086_750033024536.xlsx | PSE/Base_Rates_NY_086_750041405396.xlsx |
      | Accredited/Base_Rates_NY_101_750033037856.xlsx | PSE/Base_Rates_NY_101_750046351776.xlsx |
      | Accredited/Base_Rates_NY_102_750033042516.xlsx | PSE/Base_Rates_NY_102_750046359976.xlsx |
      | Accredited/Base_Rates_NY_103_750033050096.xlsx | PSE/Base_Rates_NY_103_750046349226.xlsx |
      | Accredited/Base_Rates_NY_104_750033058996.xlsx | PSE/Base_Rates_NY_104_750046350566.xlsx |
      | Accredited/Base_Rates_NY_105_750033064226.xlsx | PSE/Base_Rates_NY_105_750046349046.xlsx |
      | Accredited/Base_Rates_NY_106_750033065416.xlsx | PSE/Base_Rates_NY_106_750046354686.xlsx |
      | Accredited/Base_Rates_NY_107_750033075736.xlsx | PSE/Base_Rates_NY_107_750046354956.xlsx |
      | Accredited/Base_Rates_NY_108_750033355116.xlsx | PSE/Base_Rates_NY_108_750046351046.xlsx |
      | Accredited/Base_Rates_NY_109_750033358556.xlsx | PSE/Base_Rates_NY_109_750046349136.xlsx |
      | Accredited/Base_Rates_NY_110_750033572796.xlsx | PSE/Base_Rates_NY_110_750046353346.xlsx |
      | Accredited/Base_Rates_NY_111_750033594576.xlsx | PSE/Base_Rates_NY_111_750046953326.xlsx |
      | Accredited/Base_Rates_NY_112_750033595696.xlsx | PSE/Base_Rates_NY_112_750047650556.xlsx |
      | Accredited/Base_Rates_NY_113_750033606976.xlsx | PSE/Base_Rates_NY_113_750046958186.xlsx |
      | Accredited/Base_Rates_NY_114_750033609036.xlsx | PSE/Base_Rates_NY_114_750046963006.xlsx |
      | Accredited/Base_Rates_NY_115_750033616346.xlsx | PSE/Base_Rates_NY_115_750047649986.xlsx |
      | Accredited/Base_Rates_NY_116_750033617726.xlsx | PSE/Base_Rates_NY_116_750047023916.xlsx |
      | Accredited/Base_Rates_NY_117_750033625616.xlsx | PSE/Base_Rates_NY_117_750047024166.xlsx |
      | Accredited/Base_Rates_NY_118_750033633296.xlsx | PSE/Base_Rates_NY_118_750047025546.xlsx |
      | Accredited/Base_Rates_NY_119_750033634806.xlsx | PSE/Base_Rates_NY_119_750047030756.xlsx |
      | Accredited/Base_Rates_NY_120_750033636916.xlsx | PSE/Base_Rates_NY_120_750047654026.xlsx |
      | Accredited/Base_Rates_NY_121_750033645646.xlsx | PSE/Base_Rates_NY_121_750047035896.xlsx |
      | Accredited/Base_Rates_NY_122_750033646366.xlsx | PSE/Base_Rates_NY_122_750047042246.xlsx |
      | Accredited/Base_Rates_NY_123_750037987076.xlsx | PSE/Base_Rates_NY_123_750047653446.xlsx |
      | Accredited/Base_Rates_NY_124_750033870706.xlsx | PSE/Base_Rates_NY_124_750047649736.xlsx |
      | Accredited/Base_Rates_NY_125_750034007906.xlsx | PSE/Base_Rates_NY_125_750047659786.xlsx |
      | Accredited/Base_Rates_NY_126_750034017886.xlsx | PSE/Base_Rates_NY_126_750047655186.xlsx |
      | Accredited/Base_Rates_NY_127_750034026096.xlsx | PSE/Base_Rates_NY_127_750047659636.xlsx |
      | Accredited/Base_Rates_NY_128_750034031996.xlsx | PSE/Base_Rates_NY_128_750047656306.xlsx |
      | Accredited/Base_Rates_NY_129_750034033436.xlsx | PSE/Base_Rates_NY_129_750051017676.xlsx |
      | Accredited/Base_Rates_NY_130_750034036826.xlsx | PSE/Base_Rates_NY_130_750047647066.xlsx |
      | Accredited/Base_Rates_NY_131_750034043126.xlsx | PSE/Base_Rates_NY_131_750047653576.xlsx |
      | Accredited/Base_Rates_NY_132_750034051356.xlsx | PSE/Base_Rates_NY_132_750047655756.xlsx |
      | Accredited/Base_Rates_NY_133_750034053636.xlsx | PSE/Base_Rates_NY_133_750047646316.xlsx |
      | Accredited/Base_Rates_NY_134_750034057176.xlsx | PSE/Base_Rates_NY_134_750047651836.xlsx |
      | Accredited/Base_Rates_NY_135_750034059336.xlsx | PSE/Base_Rates_NY_135_750047667156.xlsx |
      | Accredited/Base_Rates_NY_136_750034059086.xlsx | PSE/Base_Rates_NY_136_750048324296.xlsx |
      | Accredited/Base_Rates_NY_137_750034065986.xlsx | PSE/Base_Rates_NY_137_750048326206.xlsx |
      | Accredited/Base_Rates_NY_138_750034095526.xlsx | PSE/Base_Rates_NY_138_750048379476.xlsx |
      | Accredited/Base_Rates_NY_139_750034253486.xlsx | PSE/Base_Rates_NY_139_750048383196.xlsx |
      | Accredited/Base_Rates_NY_140_750034377396.xlsx | PSE/Base_Rates_NY_140_750048446976.xlsx |
      | Accredited/Base_Rates_NY_141_750034383186.xlsx | PSE/Base_Rates_NY_141_750048445146.xlsx |
      | Accredited/Base_Rates_NY_142_750034393986.xlsx | PSE/Base_Rates_NY_142_750048450956.xlsx |
      | Accredited/Base_Rates_NY_143_750034399826.xlsx | PSE/Base_Rates_NY_143_750048390186.xlsx |
      | Accredited/Base_Rates_NY_144_750034402046.xlsx | PSE/Base_Rates_NY_144_750048450036.xlsx |
      | Accredited/Base_Rates_NY_145_750034406256.xlsx | PSE/Base_Rates_NY_145_750048443016.xlsx |
      | Accredited/Base_Rates_NY_146_750034408656.xlsx | PSE/Base_Rates_NY_146_750048443416.xlsx |
      | Accredited/Base_Rates_NY_147_750034409976.xlsx | PSE/Base_Rates_NY_147_750048442566.xlsx |
      | Accredited/Base_Rates_NY_148_750034415966.xlsx | PSE/Base_Rates_NY_148_750048458266.xlsx |
      | Accredited/Base_Rates_NY_149_750034421296.xlsx | PSE/Base_Rates_NY_149_750048463436.xlsx |
      | Accredited/Base_Rates_NY_150_750034422856.xlsx | PSE/Base_Rates_NY_150_750048518846.xlsx |
      | Accredited/Base_Rates_NY_151_750034429586.xlsx | PSE/Base_Rates_NY_151_750049091626.xlsx |
      | Accredited/Base_Rates_NY_152_750034432986.xlsx | PSE/Base_Rates_NY_152_750049096836.xlsx |
      | Accredited/Base_Rates_NY_153_750034447876.xlsx | PSE/Base_Rates_NY_153_750049105296.xlsx |
      | Accredited/Base_Rates_NY_154_750034613906.xlsx | PSE/Base_Rates_NY_154_750049104836.xlsx |
      | Accredited/Base_Rates_NY_155_750034723006.xlsx | PSE/Base_Rates_NY_155_750049107606.xlsx |
      | Accredited/Base_Rates_NY_156_750034733026.xlsx | PSE/Base_Rates_NY_156_750049112176.xlsx |
      | Accredited/Base_Rates_NY_157_750039747886.xlsx | PSE/Base_Rates_NY_157_750049112646.xlsx |
      | Accredited/Base_Rates_NY_158_750037984936.xlsx | PSE/Base_Rates_NY_158_750049114386.xlsx |
      | Accredited/Base_Rates_NY_159_750034746446.xlsx | PSE/Base_Rates_NY_159_750049115666.xlsx |
      | Accredited/Base_Rates_NY_160_750034749646.xlsx | PSE/Base_Rates_NY_160_750049122726.xlsx |
      | Accredited/Base_Rates_NY_161_750034751586.xlsx | PSE/Base_Rates_NY_161_750049126436.xlsx |
      | Accredited/Base_Rates_NY_162_750034806276.xlsx | PSE/Base_Rates_NY_162_750049129956.xlsx |
      | Accredited/Base_Rates_NY_163_750034809446.xlsx | PSE/Base_Rates_NY_163_750049131896.xlsx |
      | Accredited/Base_Rates_NY_164_750034816566.xlsx | PSE/Base_Rates_NY_164_750049131026.xlsx |
      | Accredited/Base_Rates_NY_165_750034817376.xlsx | PSE/Base_Rates_NY_165_750049190416.xlsx |
      | Accredited/Base_Rates_NY_166_750037986116.xlsx | PSE/Base_Rates_NY_166_750049809386.xlsx |
      | Accredited/Base_Rates_NY_167_750034859486.xlsx | PSE/Base_Rates_NY_167_750049818226.xlsx |
      | Accredited/Base_Rates_NY_168_750037984846.xlsx | PSE/Base_Rates_NY_168_750049832056.xlsx |
      | Accredited/Base_Rates_NY_169_750035388566.xlsx | PSE/Base_Rates_NY_169_750049839976.xlsx |
      | Accredited/Base_Rates_NY_170_750036096966.xlsx | PSE/Base_Rates_NY_170_750049842256.xlsx |
      | Accredited/Base_Rates_NY_171_750036252396.xlsx | PSE/Base_Rates_NY_171_750049844406.xlsx |
      | Accredited/Base_Rates_NY_172_750036252646.xlsx | PSE/Base_Rates_NY_172_750049847076.xlsx |
      | Accredited/Base_Rates_NY_173_750036255206.xlsx | PSE/Base_Rates_NY_173_750049851096.xlsx |
      | Accredited/Base_Rates_NY_174_750036269806.xlsx | PSE/Base_Rates_NY_174_750049846546.xlsx |
      | Accredited/Base_Rates_NY_175_750036277686.xlsx | PSE/Base_Rates_NY_175_750049860746.xlsx |
      | Accredited/Base_Rates_NY_176_750036281846.xlsx | PSE/Base_Rates_NY_176_750049860836.xlsx |
      | Accredited/Base_Rates_NY_177_750039748916.xlsx | PSE/Base_Rates_NY_177_750049866956.xlsx |
      | Accredited/Base_Rates_NY_178_750039748656.xlsx | PSE/Base_Rates_NY_178_750049867846.xlsx |
      | Accredited/Base_Rates_NY_179_750036289976.xlsx | PSE/Base_Rates_NY_179_750049873296.xlsx |
      | Accredited/Base_Rates_NY_180_750036292226.xlsx | PSE/Base_Rates_NY_180_750049924396.xlsx |
      | Accredited/Base_Rates_NY_181_750036294166.xlsx | PSE/Base_Rates_NY_181_750050463496.xlsx |
      | Accredited/Base_Rates_NY_182_750036301736.xlsx | PSE/Base_Rates_NY_182_750050467536.xlsx |
      | Accredited/Base_Rates_NY_183_750036322056.xlsx | PSE/Base_Rates_NY_183_750050468716.xlsx |
      | Accredited/Base_Rates_NY_184_750036472926.xlsx | PSE/Base_Rates_NY_184_750050472756.xlsx |
      | Accredited/Base_Rates_NY_185_750036479566.xlsx | PSE/Base_Rates_NY_185_750050474876.xlsx |
      | Accredited/Base_Rates_NY_186_750036480626.xlsx | PSE/Base_Rates_NY_186_750050476776.xlsx |

    @E2E_PSECompare
    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_NY_004_750591640816.xlsx | PSE/Base_Rates_NY_004_750590477246.xlsx |
      | Accredited/Base_Rates_NY_070_750591637376.xlsx | PSE/Base_Rates_NY_070_750590477616.xlsx |
      | Accredited/Base_Rates_NY_071_750591637466.xlsx | PSE/Base_Rates_NY_071_750590476976.xlsx |
      | Accredited/Base_Rates_NY_072_750591637286.xlsx | PSE/Base_Rates_NY_072_750590478416.xlsx |
      | Accredited/Base_Rates_NY_074_750591637716.xlsx | PSE/Base_Rates_NY_074_750590481126.xlsx |
      | Accredited/Base_Rates_NY_112_750588897266.xlsx | PSE/Base_Rates_NY_112_750590479586.xlsx |
      | Accredited/Base_Rates_NY_113_750588898306.xlsx | PSE/Base_Rates_NY_113_750590476296.xlsx |
      | Accredited/Base_Rates_NY_139_750589728136.xlsx | PSE/Base_Rates_NY_139_750590478166.xlsx |
      | Accredited/Base_Rates_NY_140_750589727676.xlsx | PSE/Base_Rates_NY_140_750591638396.xlsx |
      | Accredited/Base_Rates_NY_141_750589729006.xlsx | PSE/Base_Rates_NY_141_750591638056.xlsx |

  @Accredited @PreProd
  Scenario Outline: US45591 - Get Base Rates for Accredited NY - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE NY condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45591" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/20/25"
    * I set "Underwriting_Company_Underwriting_Company" to "Accredited Specialty Insurance Company"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45591/Accredited" in "Base_Rates" excel file for "New Business"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45591/Accredited" in "Base_Rates" excel file for "Endorsement"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_001 | Homeowner     | Suffolk      |
      | NY_002 | Homeowner     | Suffolk      |
      | NY_003 | Homeowner     | Suffolk      |
      | NY_004 | Homeowner     | Suffolk      |
      | NY_005 | Homeowner     | Nassau       |
      | NY_006 | Homeowner     | Nassau       |
      | NY_007 | Homeowner     | Nassau       |
      | NY_008 | Homeowner     | Nassau       |
      | NY_009 | Homeowner     | New York     |
      | NY_010 | Homeowner     | New York     |
      | NY_011 | Homeowner     | New York     |
      | NY_012 | Homeowner     | New York     |
      | NY_013 | Homeowner     | Queens       |
      | NY_014 | Homeowner     | Queens       |
      | NY_015 | Homeowner     | Queens       |
      | NY_016 | Homeowner     | Queens       |
      | NY_017 | Homeowner     | Richmond     |
      | NY_018 | Homeowner     | Richmond     |
      | NY_019 | Homeowner     | Richmond     |
      | NY_020 | Homeowner     | Richmond     |
      | NY_021 | Homeowner     | Kings        |
      | NY_022 | Homeowner     | Kings        |
      | NY_023 | Homeowner     | Kings        |
      | NY_024 | Homeowner     | Kings        |
      | NY_025 | Homeowner     | Bronx        |
      | NY_026 | Homeowner     | Bronx        |
      | NY_027 | Homeowner     | Bronx        |
      | NY_028 | Homeowner     | Bronx        |
      | NY_029 | Homeowner     | Westchester  |
      | NY_030 | Homeowner     | Westchester  |
      | NY_031 | Homeowner     | Westchester  |
      | NY_032 | Homeowner     | Westchester  |
      | NY_033 | Homeowner     | Putnam       |
      | NY_034 | Homeowner     | Rockland     |
      | NY_035 | Homeowner     | Albany       |
      | NY_036 | Homeowner     | Allegany     |
      | NY_037 | Homeowner     | Broome       |
      | NY_038 | Homeowner     | Cattaraugus  |
      | NY_039 | Homeowner     | Cayuga       |
      | NY_040 | Homeowner     | Chautauqua   |
      | NY_041 | Homeowner     | Chemung      |
      | NY_042 | Homeowner     | Chenango     |
      | NY_043 | Homeowner     | Clinton      |
      | NY_044 | Homeowner     | Columbia     |
      | NY_045 | Homeowner     | Cortland     |
      | NY_046 | Homeowner     | Delaware     |
      | NY_047 | Homeowner     | Dutchess     |
      | NY_048 | Homeowner     | Erie         |
      | NY_049 | Homeowner     | Essex        |
      | NY_050 | Homeowner     | Franklin     |
      | NY_051 | Homeowner     | Fulton       |
      | NY_052 | Homeowner     | Genesee      |
      | NY_053 | Homeowner     | Greene       |
      | NY_054 | Homeowner     | Hamilton     |
      | NY_055 | Homeowner     | Herkimer     |
      | NY_056 | Homeowner     | Jefferson    |
      | NY_057 | Homeowner     | Lewis        |
      | NY_058 | Homeowner     | Livingston   |
      | NY_059 | Homeowner     | Madison      |
      | NY_060 | Homeowner     | Monroe       |
      | NY_061 | Homeowner     | Montgomery   |
      | NY_062 | Homeowner     | Niagara      |
      | NY_063 | Homeowner     | Oneida       |
      | NY_064 | Homeowner     | Onondaga     |
      | NY_065 | Homeowner     | Ontario      |
      | NY_066 | Homeowner     | Orange       |
      | NY_067 | Homeowner     | Orleans      |
      | NY_068 | Homeowner     | Oswego       |
      | NY_069 | Homeowner     | Otsego       |
      | NY_070 | Homeowner     | Rensselaer   |
      | NY_071 | Homeowner     | Saratoga     |
      | NY_072 | Homeowner     | Schenectady  |
      | NY_073 | Homeowner     | Schoharie    |
      | NY_074 | Homeowner     | Schuyler     |
      | NY_075 | Homeowner     | Seneca       |
      | NY_076 | Homeowner     | St. Lawrence |
      | NY_077 | Homeowner     | Steuben      |
      | NY_078 | Homeowner     | Sullivan     |
      | NY_079 | Homeowner     | Tioga        |
      | NY_080 | Homeowner     | Tompkins     |
      | NY_081 | Homeowner     | Ulster       |
      | NY_082 | Homeowner     | Warren       |
      | NY_083 | Homeowner     | Washington   |
      | NY_084 | Homeowner     | Wayne        |
      | NY_085 | Homeowner     | Wyoming      |
      | NY_086 | Homeowner     | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County      |
      | NY_004 | Homeowner     | Suffolk     |
      | NY_070 | Homeowner     | Rensselaer  |
      | NY_071 | Homeowner     | Saratoga    |
      | NY_072 | Homeowner     | Schenectady |
      | NY_074 | Homeowner     | Schuyler    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_101 | Condo/Co-op   | Suffolk      |
      | NY_102 | Condo/Co-op   | Suffolk      |
      | NY_103 | Condo/Co-op   | Suffolk      |
      | NY_104 | Condo/Co-op   | Suffolk      |
      | NY_105 | Condo/Co-op   | Nassau       |
      | NY_106 | Condo/Co-op   | Nassau       |
      | NY_107 | Condo/Co-op   | Nassau       |
      | NY_108 | Condo/Co-op   | Nassau       |
      | NY_109 | Condo/Co-op   | New York     |
      | NY_110 | Condo/Co-op   | New York     |
      | NY_111 | Condo/Co-op   | New York     |
      | NY_112 | Condo/Co-op   | New York     |
      | NY_113 | Condo/Co-op   | Queens       |
      | NY_114 | Condo/Co-op   | Queens       |
      | NY_115 | Condo/Co-op   | Queens       |
      | NY_116 | Condo/Co-op   | Queens       |
      | NY_117 | Condo/Co-op   | Richmond     |
      | NY_118 | Condo/Co-op   | Richmond     |
      | NY_119 | Condo/Co-op   | Richmond     |
      | NY_120 | Condo/Co-op   | Richmond     |
      | NY_121 | Condo/Co-op   | Kings        |
      | NY_122 | Condo/Co-op   | Kings        |
      | NY_123 | Condo/Co-op   | Kings        |
      | NY_124 | Condo/Co-op   | Kings        |
      | NY_125 | Condo/Co-op   | Bronx        |
      | NY_126 | Condo/Co-op   | Bronx        |
      | NY_127 | Condo/Co-op   | Bronx        |
      | NY_128 | Condo/Co-op   | Bronx        |
      | NY_129 | Condo/Co-op   | Westchester  |
      | NY_130 | Condo/Co-op   | Westchester  |
      | NY_131 | Condo/Co-op   | Westchester  |
      | NY_132 | Condo/Co-op   | Westchester  |
      | NY_133 | Condo/Co-op   | Putnam       |
      | NY_134 | Condo/Co-op   | Rockland     |
      | NY_135 | Condo/Co-op   | Albany       |
      | NY_136 | Condo/Co-op   | Allegany     |
      | NY_137 | Condo/Co-op   | Broome       |
      | NY_138 | Condo/Co-op   | Cattaraugus  |
      | NY_139 | Condo/Co-op   | Cayuga       |
      | NY_140 | Condo/Co-op   | Chautauqua   |
      | NY_141 | Condo/Co-op   | Chemung      |
      | NY_142 | Condo/Co-op   | Chenango     |
      | NY_143 | Condo/Co-op   | Clinton      |
      | NY_144 | Condo/Co-op   | Columbia     |
      | NY_145 | Condo/Co-op   | Cortland     |
      | NY_146 | Condo/Co-op   | Delaware     |
      | NY_147 | Condo/Co-op   | Dutchess     |
      | NY_148 | Condo/Co-op   | Erie         |
      | NY_149 | Condo/Co-op   | Essex        |
      | NY_150 | Condo/Co-op   | Franklin     |
      | NY_151 | Condo/Co-op   | Fulton       |
      | NY_152 | Condo/Co-op   | Genesee      |
      | NY_153 | Condo/Co-op   | Greene       |
      | NY_154 | Condo/Co-op   | Hamilton     |
      | NY_155 | Condo/Co-op   | Herkimer     |
      | NY_156 | Condo/Co-op   | Jefferson    |
      | NY_157 | Condo/Co-op   | Lewis        |
      | NY_158 | Condo/Co-op   | Livingston   |
      | NY_159 | Condo/Co-op   | Madison      |
      | NY_160 | Condo/Co-op   | Monroe       |
      | NY_161 | Condo/Co-op   | Montgomery   |
      | NY_162 | Condo/Co-op   | Niagara      |
      | NY_163 | Condo/Co-op   | Oneida       |
      | NY_164 | Condo/Co-op   | Onondaga     |
      | NY_165 | Condo/Co-op   | Ontario      |
      | NY_166 | Condo/Co-op   | Orange       |
      | NY_167 | Condo/Co-op   | Orleans      |
      | NY_168 | Condo/Co-op   | Oswego       |
      | NY_169 | Condo/Co-op   | Otsego       |
      | NY_170 | Condo/Co-op   | Rensselaer   |
      | NY_171 | Condo/Co-op   | Saratoga     |
      | NY_172 | Condo/Co-op   | Schenectady  |
      | NY_173 | Condo/Co-op   | Schoharie    |
      | NY_174 | Condo/Co-op   | Schuyler     |
      | NY_175 | Condo/Co-op   | Seneca       |
      | NY_176 | Condo/Co-op   | St. Lawrence |
      | NY_177 | Condo/Co-op   | Steuben      |
      | NY_178 | Condo/Co-op   | Sullivan     |
      | NY_179 | Condo/Co-op   | Tioga        |
      | NY_180 | Condo/Co-op   | Tompkins     |
      | NY_181 | Condo/Co-op   | Ulster       |
      | NY_182 | Condo/Co-op   | Warren       |
      | NY_183 | Condo/Co-op   | Washington   |
      | NY_184 | Condo/Co-op   | Wayne        |
      | NY_185 | Condo/Co-op   | Wyoming      |
      | NY_186 | Condo/Co-op   | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County     |
      | NY_112 | Condo/Co-op   | New York   |
      | NY_113 | Condo/Co-op   | Queens     |
      | NY_139 | Condo/Co-op   | Cayuga     |
      | NY_140 | Condo/Co-op   | Chautauqua |
      | NY_141 | Condo/Co-op   | Chemung    |

  @PSE @PreProd
  Scenario Outline: US45591 - Get Base Rates for PSE NY - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE NY condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45591" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "Effective_Date" to "02/15/25"
    * I set "Endorsement_Effective_Date_END" to "02/20/25"
    * I set "Underwriting_Company_Underwriting_Company" to "PURE Specialty Exchange"

    When I login with OKTA user "A1"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45591/PSE" in "Base_Rates" excel file for "New Business"

    When I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "HS" endorsement
    * I review changes
    * I rate a quote
    * I navigate to premium details page

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45591/PSE" in "Base_Rates" excel file for "Endorsement"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_001 | Homeowner     | Suffolk      |
      | NY_002 | Homeowner     | Suffolk      |
      | NY_003 | Homeowner     | Suffolk      |
      | NY_004 | Homeowner     | Suffolk      |
      | NY_005 | Homeowner     | Nassau       |
      | NY_006 | Homeowner     | Nassau       |
      | NY_007 | Homeowner     | Nassau       |
      | NY_008 | Homeowner     | Nassau       |
      | NY_009 | Homeowner     | New York     |
      | NY_010 | Homeowner     | New York     |
      | NY_011 | Homeowner     | New York     |
      | NY_012 | Homeowner     | New York     |
      | NY_013 | Homeowner     | Queens       |
      | NY_014 | Homeowner     | Queens       |
      | NY_015 | Homeowner     | Queens       |
      | NY_016 | Homeowner     | Queens       |
      | NY_017 | Homeowner     | Richmond     |
      | NY_018 | Homeowner     | Richmond     |
      | NY_019 | Homeowner     | Richmond     |
      | NY_020 | Homeowner     | Richmond     |
      | NY_021 | Homeowner     | Kings        |
      | NY_022 | Homeowner     | Kings        |
      | NY_023 | Homeowner     | Kings        |
      | NY_024 | Homeowner     | Kings        |
      | NY_025 | Homeowner     | Bronx        |
      | NY_026 | Homeowner     | Bronx        |
      | NY_027 | Homeowner     | Bronx        |
      | NY_028 | Homeowner     | Bronx        |
      | NY_029 | Homeowner     | Westchester  |
      | NY_030 | Homeowner     | Westchester  |
      | NY_031 | Homeowner     | Westchester  |
      | NY_032 | Homeowner     | Westchester  |
      | NY_033 | Homeowner     | Putnam       |
      | NY_034 | Homeowner     | Rockland     |
      | NY_035 | Homeowner     | Albany       |
      | NY_036 | Homeowner     | Allegany     |
      | NY_037 | Homeowner     | Broome       |
      | NY_038 | Homeowner     | Cattaraugus  |
      | NY_039 | Homeowner     | Cayuga       |
      | NY_040 | Homeowner     | Chautauqua   |
      | NY_041 | Homeowner     | Chemung      |
      | NY_042 | Homeowner     | Chenango     |
      | NY_043 | Homeowner     | Clinton      |
      | NY_044 | Homeowner     | Columbia     |
      | NY_045 | Homeowner     | Cortland     |
      | NY_046 | Homeowner     | Delaware     |
      | NY_047 | Homeowner     | Dutchess     |
      | NY_048 | Homeowner     | Erie         |
      | NY_049 | Homeowner     | Essex        |
      | NY_050 | Homeowner     | Franklin     |
      | NY_051 | Homeowner     | Fulton       |
      | NY_052 | Homeowner     | Genesee      |
      | NY_053 | Homeowner     | Greene       |
      | NY_054 | Homeowner     | Hamilton     |
      | NY_055 | Homeowner     | Herkimer     |
      | NY_056 | Homeowner     | Jefferson    |
      | NY_057 | Homeowner     | Lewis        |
      | NY_058 | Homeowner     | Livingston   |
      | NY_059 | Homeowner     | Madison      |
      | NY_060 | Homeowner     | Monroe       |
      | NY_061 | Homeowner     | Montgomery   |
      | NY_062 | Homeowner     | Niagara      |
      | NY_063 | Homeowner     | Oneida       |
      | NY_064 | Homeowner     | Onondaga     |
      | NY_065 | Homeowner     | Ontario      |
      | NY_066 | Homeowner     | Orange       |
      | NY_067 | Homeowner     | Orleans      |
      | NY_068 | Homeowner     | Oswego       |
      | NY_069 | Homeowner     | Otsego       |
      | NY_070 | Homeowner     | Rensselaer   |
      | NY_071 | Homeowner     | Saratoga     |
      | NY_072 | Homeowner     | Schenectady  |
      | NY_073 | Homeowner     | Schoharie    |
      | NY_074 | Homeowner     | Schuyler     |
      | NY_075 | Homeowner     | Seneca       |
      | NY_076 | Homeowner     | St. Lawrence |
      | NY_077 | Homeowner     | Steuben      |
      | NY_078 | Homeowner     | Sullivan     |
      | NY_079 | Homeowner     | Tioga        |
      | NY_080 | Homeowner     | Tompkins     |
      | NY_081 | Homeowner     | Ulster       |
      | NY_082 | Homeowner     | Warren       |
      | NY_083 | Homeowner     | Washington   |
      | NY_084 | Homeowner     | Wayne        |
      | NY_085 | Homeowner     | Wyoming      |
      | NY_086 | Homeowner     | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County      |
      | NY_004 | Homeowner     | Suffolk     |
      | NY_070 | Homeowner     | Rensselaer  |
      | NY_071 | Homeowner     | Saratoga    |
      | NY_072 | Homeowner     | Schenectady |
      | NY_074 | Homeowner     | Schuyler    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County       |
      | NY_101 | Condo/Co-op   | Suffolk      |
      | NY_102 | Condo/Co-op   | Suffolk      |
      | NY_103 | Condo/Co-op   | Suffolk      |
      | NY_104 | Condo/Co-op   | Suffolk      |
      | NY_105 | Condo/Co-op   | Nassau       |
      | NY_106 | Condo/Co-op   | Nassau       |
      | NY_107 | Condo/Co-op   | Nassau       |
      | NY_108 | Condo/Co-op   | Nassau       |
      | NY_109 | Condo/Co-op   | New York     |
      | NY_110 | Condo/Co-op   | New York     |
      | NY_111 | Condo/Co-op   | New York     |
      | NY_112 | Condo/Co-op   | New York     |
      | NY_113 | Condo/Co-op   | Queens       |
      | NY_114 | Condo/Co-op   | Queens       |
      | NY_115 | Condo/Co-op   | Queens       |
      | NY_116 | Condo/Co-op   | Queens       |
      | NY_117 | Condo/Co-op   | Richmond     |
      | NY_118 | Condo/Co-op   | Richmond     |
      | NY_119 | Condo/Co-op   | Richmond     |
      | NY_120 | Condo/Co-op   | Richmond     |
      | NY_121 | Condo/Co-op   | Kings        |
      | NY_122 | Condo/Co-op   | Kings        |
      | NY_123 | Condo/Co-op   | Kings        |
      | NY_124 | Condo/Co-op   | Kings        |
      | NY_125 | Condo/Co-op   | Bronx        |
      | NY_126 | Condo/Co-op   | Bronx        |
      | NY_127 | Condo/Co-op   | Bronx        |
      | NY_128 | Condo/Co-op   | Bronx        |
      | NY_129 | Condo/Co-op   | Westchester  |
      | NY_130 | Condo/Co-op   | Westchester  |
      | NY_131 | Condo/Co-op   | Westchester  |
      | NY_132 | Condo/Co-op   | Westchester  |
      | NY_133 | Condo/Co-op   | Putnam       |
      | NY_134 | Condo/Co-op   | Rockland     |
      | NY_135 | Condo/Co-op   | Albany       |
      | NY_136 | Condo/Co-op   | Allegany     |
      | NY_137 | Condo/Co-op   | Broome       |
      | NY_138 | Condo/Co-op   | Cattaraugus  |
      | NY_139 | Condo/Co-op   | Cayuga       |
      | NY_140 | Condo/Co-op   | Chautauqua   |
      | NY_141 | Condo/Co-op   | Chemung      |
      | NY_142 | Condo/Co-op   | Chenango     |
      | NY_143 | Condo/Co-op   | Clinton      |
      | NY_144 | Condo/Co-op   | Columbia     |
      | NY_145 | Condo/Co-op   | Cortland     |
      | NY_146 | Condo/Co-op   | Delaware     |
      | NY_147 | Condo/Co-op   | Dutchess     |
      | NY_148 | Condo/Co-op   | Erie         |
      | NY_149 | Condo/Co-op   | Essex        |
      | NY_150 | Condo/Co-op   | Franklin     |
      | NY_151 | Condo/Co-op   | Fulton       |
      | NY_152 | Condo/Co-op   | Genesee      |
      | NY_153 | Condo/Co-op   | Greene       |
      | NY_154 | Condo/Co-op   | Hamilton     |
      | NY_155 | Condo/Co-op   | Herkimer     |
      | NY_156 | Condo/Co-op   | Jefferson    |
      | NY_157 | Condo/Co-op   | Lewis        |
      | NY_158 | Condo/Co-op   | Livingston   |
      | NY_159 | Condo/Co-op   | Madison      |
      | NY_160 | Condo/Co-op   | Monroe       |
      | NY_161 | Condo/Co-op   | Montgomery   |
      | NY_162 | Condo/Co-op   | Niagara      |
      | NY_163 | Condo/Co-op   | Oneida       |
      | NY_164 | Condo/Co-op   | Onondaga     |
      | NY_165 | Condo/Co-op   | Ontario      |
      | NY_166 | Condo/Co-op   | Orange       |
      | NY_167 | Condo/Co-op   | Orleans      |
      | NY_168 | Condo/Co-op   | Oswego       |
      | NY_169 | Condo/Co-op   | Otsego       |
      | NY_170 | Condo/Co-op   | Rensselaer   |
      | NY_171 | Condo/Co-op   | Saratoga     |
      | NY_172 | Condo/Co-op   | Schenectady  |
      | NY_173 | Condo/Co-op   | Schoharie    |
      | NY_174 | Condo/Co-op   | Schuyler     |
      | NY_175 | Condo/Co-op   | Seneca       |
      | NY_176 | Condo/Co-op   | St. Lawrence |
      | NY_177 | Condo/Co-op   | Steuben      |
      | NY_178 | Condo/Co-op   | Sullivan     |
      | NY_179 | Condo/Co-op   | Tioga        |
      | NY_180 | Condo/Co-op   | Tompkins     |
      | NY_181 | Condo/Co-op   | Ulster       |
      | NY_182 | Condo/Co-op   | Warren       |
      | NY_183 | Condo/Co-op   | Washington   |
      | NY_184 | Condo/Co-op   | Wayne        |
      | NY_185 | Condo/Co-op   | Wyoming      |
      | NY_186 | Condo/Co-op   | Yates        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County     |
      | NY_112 | Condo/Co-op   | New York   |
      | NY_113 | Condo/Co-op   | Queens     |
      | NY_139 | Condo/Co-op   | Cayuga     |
      | NY_140 | Condo/Co-op   | Chautauqua |
      | NY_141 | Condo/Co-op   | Chemung    |

  @CompareBaseRates @PreProd
  Scenario Outline: US45591 - I compare Accredited "<file1>" and PSE "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "PRE_PROD/US45591/"

    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_NY_001_750027940156.xlsx | PSE/Base_Rates_NY_001_750040031736.xlsx |
      | Accredited/Base_Rates_NY_002_750027944396.xlsx | PSE/Base_Rates_NY_002_750040024916.xlsx |
      | Accredited/Base_Rates_NY_003_750027950236.xlsx | PSE/Base_Rates_NY_003_750040020476.xlsx |
      | Accredited/Base_Rates_NY_004_750027942366.xlsx | PSE/Base_Rates_NY_004_750040021836.xlsx |
      | Accredited/Base_Rates_NY_005_750027947926.xlsx | PSE/Base_Rates_NY_005_750040021136.xlsx |
      | Accredited/Base_Rates_NY_006_750027949076.xlsx | PSE/Base_Rates_NY_006_750040028336.xlsx |
      | Accredited/Base_Rates_NY_007_750027945486.xlsx | PSE/Base_Rates_NY_007_750040579646.xlsx |
      | Accredited/Base_Rates_NY_008_750027938606.xlsx | PSE/Base_Rates_NY_008_750040022726.xlsx |
      | Accredited/Base_Rates_NY_009_750027940616.xlsx | PSE/Base_Rates_NY_009_750040032926.xlsx |
      | Accredited/Base_Rates_NY_010_750027947266.xlsx | PSE/Base_Rates_NY_010_750040086406.xlsx |
      | Accredited/Base_Rates_NY_011_750027945906.xlsx | PSE/Base_Rates_NY_011_750040023296.xlsx |
      | Accredited/Base_Rates_NY_012_750027941476.xlsx | PSE/Base_Rates_NY_012_750040087176.xlsx |
      | Accredited/Base_Rates_NY_013_750027941966.xlsx | PSE/Base_Rates_NY_013_750040024766.xlsx |
      | Accredited/Base_Rates_NY_014_750027942676.xlsx | PSE/Base_Rates_NY_014_750040030186.xlsx |
      | Accredited/Base_Rates_NY_015_750030090686.xlsx | PSE/Base_Rates_NY_015_750040025466.xlsx |
      | Accredited/Base_Rates_NY_016_750027977536.xlsx | PSE/Base_Rates_NY_016_750040100256.xlsx |
      | Accredited/Base_Rates_NY_017_750030086526.xlsx | PSE/Base_Rates_NY_017_750040589706.xlsx |
      | Accredited/Base_Rates_NY_018_750030090046.xlsx | PSE/Base_Rates_NY_018_750040313276.xlsx |
      | Accredited/Base_Rates_NY_019_750030085946.xlsx | PSE/Base_Rates_NY_019_750040314586.xlsx |
      | Accredited/Base_Rates_NY_020_750030099606.xlsx | PSE/Base_Rates_NY_020_750040315516.xlsx |
      | Accredited/Base_Rates_NY_021_750030099716.xlsx | PSE/Base_Rates_NY_021_750040577756.xlsx |
      | Accredited/Base_Rates_NY_022_750030086436.xlsx | PSE/Base_Rates_NY_022_750040318736.xlsx |
      | Accredited/Base_Rates_NY_023_750030091026.xlsx | PSE/Base_Rates_NY_023_750040320356.xlsx |
      | Accredited/Base_Rates_NY_024_750030085046.xlsx | PSE/Base_Rates_NY_024_750040319796.xlsx |
      | Accredited/Base_Rates_NY_025_750030084346.xlsx | PSE/Base_Rates_NY_025_750040320046.xlsx |
      | Accredited/Base_Rates_NY_026_750030100576.xlsx | PSE/Base_Rates_NY_026_750040323816.xlsx |
      | Accredited/Base_Rates_NY_027_750030085856.xlsx | PSE/Base_Rates_NY_027_750040324686.xlsx |
      | Accredited/Base_Rates_NY_028_750030090386.xlsx | PSE/Base_Rates_NY_028_750040324776.xlsx |
      | Accredited/Base_Rates_NY_029_750030096786.xlsx | PSE/Base_Rates_NY_029_750040326356.xlsx |
      | Accredited/Base_Rates_NY_030_750030090136.xlsx | PSE/Base_Rates_NY_030_750040327046.xlsx |
      | Accredited/Base_Rates_NY_031_750030799186.xlsx | PSE/Base_Rates_NY_031_750040332966.xlsx |
      | Accredited/Base_Rates_NY_032_750030801276.xlsx | PSE/Base_Rates_NY_032_750040588616.xlsx |
      | Accredited/Base_Rates_NY_033_750030815566.xlsx | PSE/Base_Rates_NY_033_750040575196.xlsx |
      | Accredited/Base_Rates_NY_034_750030820566.xlsx | PSE/Base_Rates_NY_034_750040577276.xlsx |
      | Accredited/Base_Rates_NY_035_750030818416.xlsx | PSE/Base_Rates_NY_035_750040583516.xlsx |
      | Accredited/Base_Rates_NY_036_750030822876.xlsx | PSE/Base_Rates_NY_036_750040576996.xlsx |
      | Accredited/Base_Rates_NY_037_750030824876.xlsx | PSE/Base_Rates_NY_037_750040588086.xlsx |
      | Accredited/Base_Rates_NY_038_750030825596.xlsx | PSE/Base_Rates_NY_038_750040575666.xlsx |
      | Accredited/Base_Rates_NY_039_750030827446.xlsx | PSE/Base_Rates_NY_039_750040579006.xlsx |
      | Accredited/Base_Rates_NY_040_750030828086.xlsx | PSE/Base_Rates_NY_040_750040576316.xlsx |
      | Accredited/Base_Rates_NY_041_750030838746.xlsx | PSE/Base_Rates_NY_041_750040580126.xlsx |
      | Accredited/Base_Rates_NY_042_750030839496.xlsx | PSE/Base_Rates_NY_042_750040587046.xlsx |
      | Accredited/Base_Rates_NY_043_750030841526.xlsx | PSE/Base_Rates_NY_043_750040581626.xlsx |
      | Accredited/Base_Rates_NY_044_750030840656.xlsx | PSE/Base_Rates_NY_044_750040852426.xlsx |
      | Accredited/Base_Rates_NY_045_750030854426.xlsx | PSE/Base_Rates_NY_045_750040852886.xlsx |
      | Accredited/Base_Rates_NY_046_750031599086.xlsx | PSE/Base_Rates_NY_046_750040855146.xlsx |
      | Accredited/Base_Rates_NY_047_750031616266.xlsx | PSE/Base_Rates_NY_047_750040856316.xlsx |
      | Accredited/Base_Rates_NY_048_750039752006.xlsx | PSE/Base_Rates_NY_048_750040858066.xlsx |
      | Accredited/Base_Rates_NY_049_750031633816.xlsx | PSE/Base_Rates_NY_049_750040859266.xlsx |
      | Accredited/Base_Rates_NY_050_750031640106.xlsx | PSE/Base_Rates_NY_050_750040863386.xlsx |
      | Accredited/Base_Rates_NY_051_750031638876.xlsx | PSE/Base_Rates_NY_051_750040863476.xlsx |
      | Accredited/Base_Rates_NY_052_750031639596.xlsx | PSE/Base_Rates_NY_052_750040866416.xlsx |
      | Accredited/Base_Rates_NY_053_750031642916.xlsx | PSE/Base_Rates_NY_053_750040862296.xlsx |
      | Accredited/Base_Rates_NY_054_750031644436.xlsx | PSE/Base_Rates_NY_054_750040865266.xlsx |
      | Accredited/Base_Rates_NY_055_750031651116.xlsx | PSE/Base_Rates_NY_055_750040860716.xlsx |
      | Accredited/Base_Rates_NY_056_750031651966.xlsx | PSE/Base_Rates_NY_056_750040867566.xlsx |
      | Accredited/Base_Rates_NY_057_750039748436.xlsx | PSE/Base_Rates_NY_057_750040862026.xlsx |
      | Accredited/Base_Rates_NY_058_750031653626.xlsx | PSE/Base_Rates_NY_058_750040860966.xlsx |
      | Accredited/Base_Rates_NY_059_750031662336.xlsx | PSE/Base_Rates_NY_059_750041096586.xlsx |
      | Accredited/Base_Rates_NY_060_750031666106.xlsx | PSE/Base_Rates_NY_060_750041099806.xlsx |
      | Accredited/Base_Rates_NY_061_750031804046.xlsx | PSE/Base_Rates_NY_061_750041102126.xlsx |
      | Accredited/Base_Rates_NY_062_750031846396.xlsx | PSE/Base_Rates_NY_062_750041102996.xlsx |
      | Accredited/Base_Rates_NY_063_750032324786.xlsx | PSE/Base_Rates_NY_063_750041105326.xlsx |
      | Accredited/Base_Rates_NY_064_750032336466.xlsx | PSE/Base_Rates_NY_064_750041106866.xlsx |
      | Accredited/Base_Rates_NY_065_750032354156.xlsx | PSE/Base_Rates_NY_065_750041108066.xlsx |
      | Accredited/Base_Rates_NY_066_750032359916.xlsx | PSE/Base_Rates_NY_066_750041109716.xlsx |
      | Accredited/Base_Rates_NY_067_750032363176.xlsx | PSE/Base_Rates_NY_067_750041110456.xlsx |
      | Accredited/Base_Rates_NY_068_750032369156.xlsx | PSE/Base_Rates_NY_068_750041112606.xlsx |
      | Accredited/Base_Rates_NY_069_750032373106.xlsx | PSE/Base_Rates_NY_069_750041113906.xlsx |
      | Accredited/Base_Rates_NY_070_750032373806.xlsx | PSE/Base_Rates_NY_070_750041114906.xlsx |
      | Accredited/Base_Rates_NY_071_750032383746.xlsx | PSE/Base_Rates_NY_071_750045482896.xlsx |
      | Accredited/Base_Rates_NY_072_750032390206.xlsx | PSE/Base_Rates_NY_072_750041168046.xlsx |
      | Accredited/Base_Rates_NY_073_750032445706.xlsx | PSE/Base_Rates_NY_073_750041171766.xlsx |
      | Accredited/Base_Rates_NY_074_750037985186.xlsx | PSE/Base_Rates_NY_074_750041315016.xlsx |
      | Accredited/Base_Rates_NY_075_750032452136.xlsx | PSE/Base_Rates_NY_075_750041386566.xlsx |
      | Accredited/Base_Rates_NY_076_750032454276.xlsx | PSE/Base_Rates_NY_076_750045592346.xlsx |
      | Accredited/Base_Rates_NY_077_750039748096.xlsx | PSE/Base_Rates_NY_077_750041392196.xlsx |
      | Accredited/Base_Rates_NY_078_750039750926.xlsx | PSE/Base_Rates_NY_078_750041393156.xlsx |
      | Accredited/Base_Rates_NY_079_750032770876.xlsx | PSE/Base_Rates_NY_079_750041394586.xlsx |
      | Accredited/Base_Rates_NY_080_750032779466.xlsx | PSE/Base_Rates_NY_080_750041396776.xlsx |
      | Accredited/Base_Rates_NY_081_750032986796.xlsx | PSE/Base_Rates_NY_081_750041399066.xlsx |
      | Accredited/Base_Rates_NY_082_750032991036.xlsx | PSE/Base_Rates_NY_082_750041397706.xlsx |
      | Accredited/Base_Rates_NY_083_750033011686.xlsx | PSE/Base_Rates_NY_083_750041398356.xlsx |
      | Accredited/Base_Rates_NY_084_750033018446.xlsx | PSE/Base_Rates_NY_084_750041402666.xlsx |
      | Accredited/Base_Rates_NY_085_750033019106.xlsx | PSE/Base_Rates_NY_085_750041404386.xlsx |
      | Accredited/Base_Rates_NY_086_750033024536.xlsx | PSE/Base_Rates_NY_086_750041405396.xlsx |
      | Accredited/Base_Rates_NY_101_750033037856.xlsx | PSE/Base_Rates_NY_101_750046351776.xlsx |
      | Accredited/Base_Rates_NY_102_750033042516.xlsx | PSE/Base_Rates_NY_102_750046359976.xlsx |
      | Accredited/Base_Rates_NY_103_750033050096.xlsx | PSE/Base_Rates_NY_103_750046349226.xlsx |
      | Accredited/Base_Rates_NY_104_750033058996.xlsx | PSE/Base_Rates_NY_104_750046350566.xlsx |
      | Accredited/Base_Rates_NY_105_750033064226.xlsx | PSE/Base_Rates_NY_105_750046349046.xlsx |
      | Accredited/Base_Rates_NY_106_750033065416.xlsx | PSE/Base_Rates_NY_106_750046354686.xlsx |
      | Accredited/Base_Rates_NY_107_750033075736.xlsx | PSE/Base_Rates_NY_107_750046354956.xlsx |
      | Accredited/Base_Rates_NY_108_750033355116.xlsx | PSE/Base_Rates_NY_108_750046351046.xlsx |
      | Accredited/Base_Rates_NY_109_750033358556.xlsx | PSE/Base_Rates_NY_109_750046349136.xlsx |
      | Accredited/Base_Rates_NY_110_750033572796.xlsx | PSE/Base_Rates_NY_110_750046353346.xlsx |
      | Accredited/Base_Rates_NY_111_750033594576.xlsx | PSE/Base_Rates_NY_111_750046953326.xlsx |
      | Accredited/Base_Rates_NY_112_750033595696.xlsx | PSE/Base_Rates_NY_112_750047650556.xlsx |
      | Accredited/Base_Rates_NY_113_750033606976.xlsx | PSE/Base_Rates_NY_113_750046958186.xlsx |
      | Accredited/Base_Rates_NY_114_750033609036.xlsx | PSE/Base_Rates_NY_114_750046963006.xlsx |
      | Accredited/Base_Rates_NY_115_750033616346.xlsx | PSE/Base_Rates_NY_115_750047649986.xlsx |
      | Accredited/Base_Rates_NY_116_750033617726.xlsx | PSE/Base_Rates_NY_116_750047023916.xlsx |
      | Accredited/Base_Rates_NY_117_750033625616.xlsx | PSE/Base_Rates_NY_117_750047024166.xlsx |
      | Accredited/Base_Rates_NY_118_750033633296.xlsx | PSE/Base_Rates_NY_118_750047025546.xlsx |
      | Accredited/Base_Rates_NY_119_750033634806.xlsx | PSE/Base_Rates_NY_119_750047030756.xlsx |
      | Accredited/Base_Rates_NY_120_750033636916.xlsx | PSE/Base_Rates_NY_120_750047654026.xlsx |
      | Accredited/Base_Rates_NY_121_750033645646.xlsx | PSE/Base_Rates_NY_121_750047035896.xlsx |
      | Accredited/Base_Rates_NY_122_750033646366.xlsx | PSE/Base_Rates_NY_122_750047042246.xlsx |
      | Accredited/Base_Rates_NY_123_750037987076.xlsx | PSE/Base_Rates_NY_123_750047653446.xlsx |
      | Accredited/Base_Rates_NY_124_750033870706.xlsx | PSE/Base_Rates_NY_124_750047649736.xlsx |
      | Accredited/Base_Rates_NY_125_750034007906.xlsx | PSE/Base_Rates_NY_125_750047659786.xlsx |
      | Accredited/Base_Rates_NY_126_750034017886.xlsx | PSE/Base_Rates_NY_126_750047655186.xlsx |
      | Accredited/Base_Rates_NY_127_750034026096.xlsx | PSE/Base_Rates_NY_127_750047659636.xlsx |
      | Accredited/Base_Rates_NY_128_750034031996.xlsx | PSE/Base_Rates_NY_128_750047656306.xlsx |
      | Accredited/Base_Rates_NY_129_750034033436.xlsx | PSE/Base_Rates_NY_129_750051017676.xlsx |
      | Accredited/Base_Rates_NY_130_750034036826.xlsx | PSE/Base_Rates_NY_130_750047647066.xlsx |
      | Accredited/Base_Rates_NY_131_750034043126.xlsx | PSE/Base_Rates_NY_131_750047653576.xlsx |
      | Accredited/Base_Rates_NY_132_750034051356.xlsx | PSE/Base_Rates_NY_132_750047655756.xlsx |
      | Accredited/Base_Rates_NY_133_750034053636.xlsx | PSE/Base_Rates_NY_133_750047646316.xlsx |
      | Accredited/Base_Rates_NY_134_750034057176.xlsx | PSE/Base_Rates_NY_134_750047651836.xlsx |
      | Accredited/Base_Rates_NY_135_750034059336.xlsx | PSE/Base_Rates_NY_135_750047667156.xlsx |
      | Accredited/Base_Rates_NY_136_750034059086.xlsx | PSE/Base_Rates_NY_136_750048324296.xlsx |
      | Accredited/Base_Rates_NY_137_750034065986.xlsx | PSE/Base_Rates_NY_137_750048326206.xlsx |
      | Accredited/Base_Rates_NY_138_750034095526.xlsx | PSE/Base_Rates_NY_138_750048379476.xlsx |
      | Accredited/Base_Rates_NY_139_750034253486.xlsx | PSE/Base_Rates_NY_139_750048383196.xlsx |
      | Accredited/Base_Rates_NY_140_750034377396.xlsx | PSE/Base_Rates_NY_140_750048446976.xlsx |
      | Accredited/Base_Rates_NY_141_750034383186.xlsx | PSE/Base_Rates_NY_141_750048445146.xlsx |
      | Accredited/Base_Rates_NY_142_750034393986.xlsx | PSE/Base_Rates_NY_142_750048450956.xlsx |
      | Accredited/Base_Rates_NY_143_750034399826.xlsx | PSE/Base_Rates_NY_143_750048390186.xlsx |
      | Accredited/Base_Rates_NY_144_750034402046.xlsx | PSE/Base_Rates_NY_144_750048450036.xlsx |
      | Accredited/Base_Rates_NY_145_750034406256.xlsx | PSE/Base_Rates_NY_145_750048443016.xlsx |
      | Accredited/Base_Rates_NY_146_750034408656.xlsx | PSE/Base_Rates_NY_146_750048443416.xlsx |
      | Accredited/Base_Rates_NY_147_750034409976.xlsx | PSE/Base_Rates_NY_147_750048442566.xlsx |
      | Accredited/Base_Rates_NY_148_750034415966.xlsx | PSE/Base_Rates_NY_148_750048458266.xlsx |
      | Accredited/Base_Rates_NY_149_750034421296.xlsx | PSE/Base_Rates_NY_149_750048463436.xlsx |
      | Accredited/Base_Rates_NY_150_750034422856.xlsx | PSE/Base_Rates_NY_150_750048518846.xlsx |
      | Accredited/Base_Rates_NY_151_750034429586.xlsx | PSE/Base_Rates_NY_151_750049091626.xlsx |
      | Accredited/Base_Rates_NY_152_750034432986.xlsx | PSE/Base_Rates_NY_152_750049096836.xlsx |
      | Accredited/Base_Rates_NY_153_750034447876.xlsx | PSE/Base_Rates_NY_153_750049105296.xlsx |
      | Accredited/Base_Rates_NY_154_750034613906.xlsx | PSE/Base_Rates_NY_154_750049104836.xlsx |
      | Accredited/Base_Rates_NY_155_750034723006.xlsx | PSE/Base_Rates_NY_155_750049107606.xlsx |
      | Accredited/Base_Rates_NY_156_750034733026.xlsx | PSE/Base_Rates_NY_156_750049112176.xlsx |
      | Accredited/Base_Rates_NY_157_750039747886.xlsx | PSE/Base_Rates_NY_157_750049112646.xlsx |
      | Accredited/Base_Rates_NY_158_750037984936.xlsx | PSE/Base_Rates_NY_158_750049114386.xlsx |
      | Accredited/Base_Rates_NY_159_750034746446.xlsx | PSE/Base_Rates_NY_159_750049115666.xlsx |
      | Accredited/Base_Rates_NY_160_750034749646.xlsx | PSE/Base_Rates_NY_160_750049122726.xlsx |
      | Accredited/Base_Rates_NY_161_750034751586.xlsx | PSE/Base_Rates_NY_161_750049126436.xlsx |
      | Accredited/Base_Rates_NY_162_750034806276.xlsx | PSE/Base_Rates_NY_162_750049129956.xlsx |
      | Accredited/Base_Rates_NY_163_750034809446.xlsx | PSE/Base_Rates_NY_163_750049131896.xlsx |
      | Accredited/Base_Rates_NY_164_750034816566.xlsx | PSE/Base_Rates_NY_164_750049131026.xlsx |
      | Accredited/Base_Rates_NY_165_750034817376.xlsx | PSE/Base_Rates_NY_165_750049190416.xlsx |
      | Accredited/Base_Rates_NY_166_750037986116.xlsx | PSE/Base_Rates_NY_166_750049809386.xlsx |
      | Accredited/Base_Rates_NY_167_750034859486.xlsx | PSE/Base_Rates_NY_167_750049818226.xlsx |
      | Accredited/Base_Rates_NY_168_750037984846.xlsx | PSE/Base_Rates_NY_168_750049832056.xlsx |
      | Accredited/Base_Rates_NY_169_750035388566.xlsx | PSE/Base_Rates_NY_169_750049839976.xlsx |
      | Accredited/Base_Rates_NY_170_750036096966.xlsx | PSE/Base_Rates_NY_170_750049842256.xlsx |
      | Accredited/Base_Rates_NY_171_750036252396.xlsx | PSE/Base_Rates_NY_171_750049844406.xlsx |
      | Accredited/Base_Rates_NY_172_750036252646.xlsx | PSE/Base_Rates_NY_172_750049847076.xlsx |
      | Accredited/Base_Rates_NY_173_750036255206.xlsx | PSE/Base_Rates_NY_173_750049851096.xlsx |
      | Accredited/Base_Rates_NY_174_750036269806.xlsx | PSE/Base_Rates_NY_174_750049846546.xlsx |
      | Accredited/Base_Rates_NY_175_750036277686.xlsx | PSE/Base_Rates_NY_175_750049860746.xlsx |
      | Accredited/Base_Rates_NY_176_750036281846.xlsx | PSE/Base_Rates_NY_176_750049860836.xlsx |
      | Accredited/Base_Rates_NY_177_750039748916.xlsx | PSE/Base_Rates_NY_177_750049866956.xlsx |
      | Accredited/Base_Rates_NY_178_750039748656.xlsx | PSE/Base_Rates_NY_178_750049867846.xlsx |
      | Accredited/Base_Rates_NY_179_750036289976.xlsx | PSE/Base_Rates_NY_179_750049873296.xlsx |
      | Accredited/Base_Rates_NY_180_750036292226.xlsx | PSE/Base_Rates_NY_180_750049924396.xlsx |
      | Accredited/Base_Rates_NY_181_750036294166.xlsx | PSE/Base_Rates_NY_181_750050463496.xlsx |
      | Accredited/Base_Rates_NY_182_750036301736.xlsx | PSE/Base_Rates_NY_182_750050467536.xlsx |
      | Accredited/Base_Rates_NY_183_750036322056.xlsx | PSE/Base_Rates_NY_183_750050468716.xlsx |
      | Accredited/Base_Rates_NY_184_750036472926.xlsx | PSE/Base_Rates_NY_184_750050472756.xlsx |
      | Accredited/Base_Rates_NY_185_750036479566.xlsx | PSE/Base_Rates_NY_185_750050474876.xlsx |
      | Accredited/Base_Rates_NY_186_750036480626.xlsx | PSE/Base_Rates_NY_186_750050476776.xlsx |

    @E2E_PSECompare
    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_NY_004_766005586139.xlsx | PSE/Base_Rates_NY_004_766005773959.xlsx |
      | Accredited/Base_Rates_NY_070_766005584869.xlsx | PSE/Base_Rates_NY_070_766005775149.xlsx |
      | Accredited/Base_Rates_NY_071_766005584129.xlsx | PSE/Base_Rates_NY_071_766005776229.xlsx |
      | Accredited/Base_Rates_NY_072_766005584619.xlsx | PSE/Base_Rates_NY_072_766005778319.xlsx |
      | Accredited/Base_Rates_NY_074_766005586839.xlsx | PSE/Base_Rates_NY_074_766005854979.xlsx |
      | Accredited/Base_Rates_NY_112_766005583479.xlsx | PSE/Base_Rates_NY_112_766005857579.xlsx |
      | Accredited/Base_Rates_NY_113_766005585719.xlsx | PSE/Base_Rates_NY_113_766005862249.xlsx |
      | Accredited/Base_Rates_NY_139_766005769409.xlsx | PSE/Base_Rates_NY_139_766005864339.xlsx |
      | Accredited/Base_Rates_NY_140_766005770459.xlsx | PSE/Base_Rates_NY_140_766005866979.xlsx |
      | Accredited/Base_Rates_NY_141_766005771679.xlsx | PSE/Base_Rates_NY_141_766005868219.xlsx |