@HomeownersSurplus @US45592 @TF107 @TF1154 @TC89392 @TC89393 @TC89394
Feature: PSE

  @Accredited @STG
  Scenario Outline: US45592 - Get Base Rates for Accredited TX - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for Accredited TX condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45592" in sheet "QuoteCreatorHS" for "HS" LOB
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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/Accredited" in "Base_Rates" excel file for "New Business"

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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/Accredited" in "Base_Rates" excel file for "Endorsement"

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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/Accredited" in "Base_Rates" excel file for "Renewal"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_001 | Homeowner     | Anderson      |
      | TX_002 | Homeowner     | Andrews       |
      | TX_003 | Homeowner     | Angelina      |
      | TX_004 | Homeowner     | Aransas       |
      | TX_005 | Homeowner     | Aransas       |
      | TX_006 | Homeowner     | Aransas       |
      | TX_007 | Homeowner     | Aransas       |
      | TX_008 | Homeowner     | Aransas       |
      | TX_009 | Homeowner     | Archer        |
      | TX_010 | Homeowner     | Armstrong     |
      | TX_011 | Homeowner     | Atascosa      |
      | TX_012 | Homeowner     | Austin        |
      | TX_013 | Homeowner     | Bailey        |
      | TX_014 | Homeowner     | Bandera       |
      | TX_015 | Homeowner     | Bastrop       |
      | TX_016 | Homeowner     | Baylor        |
      | TX_017 | Homeowner     | Bee           |
      | TX_018 | Homeowner     | Bell          |
      | TX_019 | Homeowner     | Bexar         |
      | TX_020 | Homeowner     | Blanco        |
      | TX_021 | Homeowner     | Borden        |
      | TX_022 | Homeowner     | Bosque        |
      | TX_023 | Homeowner     | Bowie         |
      | TX_024 | Homeowner     | Brazoria      |
      | TX_025 | Homeowner     | Brazoria      |
      | TX_026 | Homeowner     | Brazoria      |
      | TX_027 | Homeowner     | Brazoria      |
      | TX_028 | Homeowner     | Brazoria      |
      | TX_029 | Homeowner     | Brazoria      |
      | TX_030 | Homeowner     | Brazos        |
      | TX_031 | Homeowner     | Brewster      |
      | TX_032 | Homeowner     | Briscoe       |
      | TX_033 | Homeowner     | Brooks        |
      | TX_034 | Homeowner     | Brown         |
      | TX_035 | Homeowner     | Burleson      |
      | TX_036 | Homeowner     | Burnet        |
      | TX_037 | Homeowner     | Caldwell      |
      | TX_038 | Homeowner     | Calhoun       |
      | TX_039 | Homeowner     | Calhoun       |
      | TX_040 | Homeowner     | Calhoun       |
      | TX_041 | Homeowner     | Calhoun       |
      | TX_042 | Homeowner     | Calhoun       |
      | TX_043 | Homeowner     | Callahan      |
      | TX_044 | Homeowner     | Cameron       |
      | TX_045 | Homeowner     | Cameron       |
      | TX_046 | Homeowner     | Cameron       |
      | TX_047 | Homeowner     | Cameron       |
      | TX_048 | Homeowner     | Cameron       |
      | TX_049 | Homeowner     | Camp          |
      | TX_050 | Homeowner     | Carson        |
      | TX_051 | Homeowner     | Cass          |
      | TX_052 | Homeowner     | Castro        |
      | TX_053 | Homeowner     | Chambers      |
      | TX_054 | Homeowner     | Chambers      |
      | TX_055 | Homeowner     | Chambers      |
      | TX_056 | Homeowner     | Chambers      |
      | TX_057 | Homeowner     | Chambers      |
      | TX_058 | Homeowner     | Cherokee      |
      | TX_059 | Homeowner     | Childress     |
      | TX_060 | Homeowner     | Clay          |
      | TX_061 | Homeowner     | Cochran       |
      | TX_062 | Homeowner     | Coke          |
      | TX_063 | Homeowner     | Coleman       |
      | TX_064 | Homeowner     | Collin        |
      | TX_065 | Homeowner     | Collingsworth |
      | TX_066 | Homeowner     | Colorado      |
      | TX_067 | Homeowner     | Comal         |
      | TX_068 | Homeowner     | Comanche      |
      | TX_069 | Homeowner     | Concho        |
      | TX_070 | Homeowner     | Cooke         |
      | TX_071 | Homeowner     | Coryell       |
      | TX_072 | Homeowner     | Cottle        |
      | TX_073 | Homeowner     | Crane         |
      | TX_074 | Homeowner     | Crockett      |
      | TX_075 | Homeowner     | Crosby        |
      | TX_076 | Homeowner     | Culberson     |
      | TX_077 | Homeowner     | Dallam        |
      | TX_078 | Homeowner     | Dallas        |
      | TX_079 | Homeowner     | Dawson        |
      | TX_080 | Homeowner     | De Witt       |
      | TX_081 | Homeowner     | Deaf Smith    |
      | TX_082 | Homeowner     | Delta         |
      | TX_083 | Homeowner     | Denton        |
      | TX_084 | Homeowner     | Dickens       |
      | TX_085 | Homeowner     | Dimmit        |
      | TX_086 | Homeowner     | Donley        |
      | TX_087 | Homeowner     | Duval         |
      | TX_088 | Homeowner     | Eastland      |
      | TX_089 | Homeowner     | Ector         |
      | TX_090 | Homeowner     | Edwards       |
      | TX_091 | Homeowner     | El Paso       |
      | TX_092 | Homeowner     | Ellis         |
      | TX_093 | Homeowner     | Erath         |
      | TX_094 | Homeowner     | Falls         |
      | TX_095 | Homeowner     | Fannin        |
      | TX_096 | Homeowner     | Fayette       |
      | TX_097 | Homeowner     | Fisher        |
      | TX_098 | Homeowner     | Floyd         |
      | TX_099 | Homeowner     | Foard         |
      | TX_100 | Homeowner     | Fort Bend     |
      | TX_101 | Homeowner     | Franklin      |
      | TX_102 | Homeowner     | Freestone     |
      | TX_103 | Homeowner     | Frio          |
      | TX_104 | Homeowner     | Gaines        |
      | TX_105 | Homeowner     | Galveston     |
      | TX_106 | Homeowner     | Galveston     |
      | TX_107 | Homeowner     | Galveston     |
      | TX_108 | Homeowner     | Galveston     |
      | TX_109 | Homeowner     | Galveston     |
      | TX_110 | Homeowner     | Garza         |
      | TX_111 | Homeowner     | Gillespie     |
      | TX_112 | Homeowner     | Glasscock     |
      | TX_113 | Homeowner     | Goliad        |
      | TX_114 | Homeowner     | Gonzales      |
      | TX_115 | Homeowner     | Gray          |
      | TX_116 | Homeowner     | Grayson       |
      | TX_117 | Homeowner     | Gregg         |
      | TX_118 | Homeowner     | Grimes        |
      | TX_119 | Homeowner     | Guadalupe     |
      | TX_120 | Homeowner     | Hale          |
      | TX_121 | Homeowner     | Hall          |
      | TX_122 | Homeowner     | Hamilton      |
      | TX_123 | Homeowner     | Hansford      |
      | TX_124 | Homeowner     | Hardeman      |
      | TX_125 | Homeowner     | Hardin        |
      | TX_126 | Homeowner     | Harris        |
      | TX_127 | Homeowner     | Harris        |
      | TX_128 | Homeowner     | Harris        |
      | TX_129 | Homeowner     | Harris        |
      | TX_130 | Homeowner     | Harrison      |
      | TX_131 | Homeowner     | Hartley       |
      | TX_132 | Homeowner     | Haskell       |
      | TX_133 | Homeowner     | Hays          |
      | TX_134 | Homeowner     | Hemphill      |
      | TX_135 | Homeowner     | Henderson     |
      | TX_136 | Homeowner     | Hidalgo       |
      | TX_137 | Homeowner     | Hill          |
      | TX_138 | Homeowner     | Hockley       |
      | TX_139 | Homeowner     | Hood          |
      | TX_140 | Homeowner     | Hopkins       |
      | TX_141 | Homeowner     | Houston       |
      | TX_142 | Homeowner     | Howard        |
      | TX_143 | Homeowner     | Hudspeth      |
      | TX_144 | Homeowner     | Hunt          |
      | TX_145 | Homeowner     | Hutchinson    |
      | TX_146 | Homeowner     | Irion         |
      | TX_147 | Homeowner     | Jack          |
      | TX_148 | Homeowner     | Jackson       |
      | TX_149 | Homeowner     | Jackson       |
      | TX_150 | Homeowner     | Jackson       |
      | TX_151 | Homeowner     | Jackson       |
      | TX_152 | Homeowner     | Jasper        |
      | TX_153 | Homeowner     | Jeff Davis    |
      | TX_154 | Homeowner     | Jefferson     |
      | TX_155 | Homeowner     | Jefferson     |
      | TX_156 | Homeowner     | Jefferson     |
      | TX_157 | Homeowner     | Jefferson     |
      | TX_158 | Homeowner     | Jefferson     |
      | TX_159 | Homeowner     | Jim Hogg      |
      | TX_160 | Homeowner     | Jim Wells     |
      | TX_161 | Homeowner     | Johnson       |
      | TX_162 | Homeowner     | Jones         |
      | TX_163 | Homeowner     | Karnes        |
      | TX_164 | Homeowner     | Kaufman       |
      | TX_165 | Homeowner     | Kendall       |
      | TX_166 | Homeowner     | Kenedy        |
      | TX_167 | Homeowner     | Kenedy        |
      | TX_168 | Homeowner     | Kenedy        |
      | TX_169 | Homeowner     | Kenedy        |
      | TX_170 | Homeowner     | Kenedy        |
      | TX_171 | Homeowner     | Kent          |
      | TX_172 | Homeowner     | Kerr          |
      | TX_173 | Homeowner     | Kimble        |
      | TX_174 | Homeowner     | King          |
      | TX_175 | Homeowner     | Kinney        |
      | TX_176 | Homeowner     | Kleberg       |
      | TX_177 | Homeowner     | Kleberg       |
      | TX_178 | Homeowner     | Kleberg       |
      | TX_179 | Homeowner     | Kleberg       |
      | TX_180 | Homeowner     | Kleberg       |
      | TX_181 | Homeowner     | Knox          |
      | TX_182 | Homeowner     | La Salle      |
      | TX_183 | Homeowner     | Lamar         |
      | TX_184 | Homeowner     | Lamb          |
      | TX_185 | Homeowner     | Lampasas      |
      | TX_186 | Homeowner     | Lavaca        |
      | TX_187 | Homeowner     | Lee           |
      | TX_188 | Homeowner     | Leon          |
      | TX_189 | Homeowner     | Liberty       |
      | TX_190 | Homeowner     | Limestone     |
      | TX_191 | Homeowner     | Lipscomb      |
      | TX_192 | Homeowner     | Live Oak      |
      | TX_193 | Homeowner     | Llano         |
      | TX_194 | Homeowner     | Loving        |
      | TX_195 | Homeowner     | Lubbock       |
      | TX_196 | Homeowner     | Lynn          |
      | TX_197 | Homeowner     | Madison       |
      | TX_198 | Homeowner     | Marion        |
      | TX_199 | Homeowner     | Martin        |
      | TX_200 | Homeowner     | Mason         |
      | TX_201 | Homeowner     | Matagorda     |
      | TX_202 | Homeowner     | Matagorda     |
      | TX_203 | Homeowner     | Matagorda     |
      | TX_204 | Homeowner     | Matagorda     |
      | TX_205 | Homeowner     | Matagorda     |
      | TX_206 | Homeowner     | Maverick      |
      | TX_207 | Homeowner     | McCulloch     |
      | TX_208 | Homeowner     | McLennan      |
      | TX_209 | Homeowner     | McMullen      |
      | TX_210 | Homeowner     | Medina        |
      | TX_211 | Homeowner     | Menard        |
      | TX_212 | Homeowner     | Midland       |
      | TX_213 | Homeowner     | Milam         |
      | TX_214 | Homeowner     | Mills         |
      | TX_215 | Homeowner     | Mitchell      |
      | TX_216 | Homeowner     | Montague      |
      | TX_217 | Homeowner     | Montgomery    |
      | TX_218 | Homeowner     | Moore         |
      | TX_219 | Homeowner     | Morris        |
      | TX_220 | Homeowner     | Motley        |
      | TX_221 | Homeowner     | Nacogdoches   |
      | TX_222 | Homeowner     | Navarro       |
      | TX_223 | Homeowner     | Newton        |
      | TX_224 | Homeowner     | Nolan         |
      | TX_225 | Homeowner     | Nueces        |
      | TX_226 | Homeowner     | Nueces        |
      | TX_227 | Homeowner     | Nueces        |
      | TX_228 | Homeowner     | Nueces        |
      | TX_229 | Homeowner     | Nueces        |
      | TX_230 | Homeowner     | Ochiltree     |
      | TX_231 | Homeowner     | Oldham        |
      | TX_232 | Homeowner     | Orange        |
      | TX_233 | Homeowner     | Palo Pinto    |
      | TX_234 | Homeowner     | Panola        |
      | TX_235 | Homeowner     | Parker        |
      | TX_236 | Homeowner     | Parmer        |
      | TX_237 | Homeowner     | Pecos         |
      | TX_238 | Homeowner     | Polk          |
      | TX_239 | Homeowner     | Potter        |
      | TX_240 | Homeowner     | Presidio      |
      | TX_241 | Homeowner     | Rains         |
      | TX_242 | Homeowner     | Randall       |
      | TX_243 | Homeowner     | Reagan        |
      | TX_244 | Homeowner     | Real          |
      | TX_245 | Homeowner     | Red River     |
      | TX_246 | Homeowner     | Reeves        |
      | TX_247 | Homeowner     | Refugio       |
      | TX_248 | Homeowner     | Refugio       |
      | TX_249 | Homeowner     | Refugio       |
      | TX_250 | Homeowner     | Refugio       |
      | TX_251 | Homeowner     | Refugio       |
      | TX_252 | Homeowner     | Roberts       |
      | TX_253 | Homeowner     | Robertson     |
      | TX_254 | Homeowner     | Rockwall      |
      | TX_255 | Homeowner     | Runnels       |
      | TX_256 | Homeowner     | Rusk          |
      | TX_257 | Homeowner     | Sabine        |
      | TX_258 | Homeowner     | San Augustine |
      | TX_259 | Homeowner     | San Jacinto   |
      | TX_260 | Homeowner     | San Patricio  |
      | TX_261 | Homeowner     | San Patricio  |
      | TX_262 | Homeowner     | San Patricio  |
      | TX_263 | Homeowner     | San Patricio  |
      | TX_264 | Homeowner     | San Patricio  |
      | TX_265 | Homeowner     | San Saba      |
      | TX_266 | Homeowner     | Schleicher    |
      | TX_267 | Homeowner     | Scurry        |
      | TX_268 | Homeowner     | Shackelford   |
      | TX_269 | Homeowner     | Shelby        |
      | TX_270 | Homeowner     | Sherman       |
      | TX_271 | Homeowner     | Smith         |
      | TX_272 | Homeowner     | Somervell     |
      | TX_273 | Homeowner     | Starr         |
      | TX_274 | Homeowner     | Stephens      |
      | TX_275 | Homeowner     | Sterling      |
      | TX_276 | Homeowner     | Stonewall     |
      | TX_277 | Homeowner     | Sutton        |
      | TX_278 | Homeowner     | Swisher       |
      | TX_279 | Homeowner     | Tarrant       |
      | TX_280 | Homeowner     | Taylor        |
      | TX_281 | Homeowner     | Terrell       |
      | TX_282 | Homeowner     | Terry         |
      | TX_283 | Homeowner     | Throckmorton  |
      | TX_284 | Homeowner     | Titus         |
      | TX_285 | Homeowner     | Tom Green     |
      | TX_286 | Homeowner     | Travis        |
      | TX_287 | Homeowner     | Trinity       |
      | TX_288 | Homeowner     | Tyler         |
      | TX_289 | Homeowner     | Upshur        |
      | TX_290 | Homeowner     | Upton         |
      | TX_291 | Homeowner     | Uvalde        |
      | TX_292 | Homeowner     | Val Verde     |
      | TX_293 | Homeowner     | Van Zandt     |
      | TX_294 | Homeowner     | Victoria      |
      | TX_295 | Homeowner     | Victoria      |
      | TX_296 | Homeowner     | Victoria      |
      | TX_297 | Homeowner     | Victoria      |
      | TX_298 | Homeowner     | Walker        |
      | TX_299 | Homeowner     | Waller        |
      | TX_300 | Homeowner     | Ward          |
      | TX_301 | Homeowner     | Washington    |
      | TX_302 | Homeowner     | Webb          |
      | TX_303 | Homeowner     | Wharton       |
      | TX_304 | Homeowner     | Wheeler       |
      | TX_305 | Homeowner     | Wichita       |
      | TX_306 | Homeowner     | Wilbarger     |
      | TX_307 | Homeowner     | Willacy       |
      | TX_308 | Homeowner     | Willacy       |
      | TX_309 | Homeowner     | Willacy       |
      | TX_310 | Homeowner     | Willacy       |
      | TX_311 | Homeowner     | Willacy       |
      | TX_312 | Homeowner     | Williamson    |
      | TX_313 | Homeowner     | Wilson        |
      | TX_314 | Homeowner     | Winkler       |
      | TX_315 | Homeowner     | Wise          |
      | TX_316 | Homeowner     | Wood          |
      | TX_317 | Homeowner     | Yoakum        |
      | TX_318 | Homeowner     | Young         |
      | TX_319 | Homeowner     | Zapata        |
      | TX_320 | Homeowner     | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
#      | TX_120 | Homeowner     | Hale      |
#      | TX_002 | Homeowner     | Andrews   |
      | TX_003 | Homeowner     | Angelina  |
#      | TX_075 | Homeowner     | Crosby    |
#      | TX_010 | Homeowner     | Armstrong |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_501 | Condo/Co-op   | Anderson      |
      | TX_502 | Condo/Co-op   | Andrews       |
      | TX_503 | Condo/Co-op   | Angelina      |
      | TX_504 | Condo/Co-op   | Aransas       |
      | TX_505 | Condo/Co-op   | Aransas       |
      | TX_506 | Condo/Co-op   | Aransas       |
      | TX_507 | Condo/Co-op   | Aransas       |
      | TX_508 | Condo/Co-op   | Aransas       |
      | TX_509 | Condo/Co-op   | Archer        |
      | TX_510 | Condo/Co-op   | Armstrong     |
      | TX_511 | Condo/Co-op   | Atascosa      |
      | TX_512 | Condo/Co-op   | Austin        |
      | TX_513 | Condo/Co-op   | Bailey        |
      | TX_514 | Condo/Co-op   | Bandera       |
      | TX_515 | Condo/Co-op   | Bastrop       |
      | TX_516 | Condo/Co-op   | Baylor        |
      | TX_517 | Condo/Co-op   | Bee           |
      | TX_518 | Condo/Co-op   | Bell          |
      | TX_519 | Condo/Co-op   | Bexar         |
      | TX_520 | Condo/Co-op   | Blanco        |
      | TX_521 | Condo/Co-op   | Borden        |
      | TX_522 | Condo/Co-op   | Bosque        |
      | TX_523 | Condo/Co-op   | Bowie         |
      | TX_524 | Condo/Co-op   | Brazoria      |
      | TX_525 | Condo/Co-op   | Brazoria      |
      | TX_526 | Condo/Co-op   | Brazoria      |
      | TX_527 | Condo/Co-op   | Brazoria      |
      | TX_528 | Condo/Co-op   | Brazoria      |
      | TX_529 | Condo/Co-op   | Brazoria      |
      | TX_530 | Condo/Co-op   | Brazos        |
      | TX_531 | Condo/Co-op   | Brewster      |
      | TX_532 | Condo/Co-op   | Briscoe       |
      | TX_533 | Condo/Co-op   | Brooks        |
      | TX_534 | Condo/Co-op   | Brown         |
      | TX_535 | Condo/Co-op   | Burleson      |
      | TX_536 | Condo/Co-op   | Burnet        |
      | TX_537 | Condo/Co-op   | Caldwell      |
      | TX_538 | Condo/Co-op   | Calhoun       |
      | TX_539 | Condo/Co-op   | Calhoun       |
      | TX_540 | Condo/Co-op   | Calhoun       |
      | TX_541 | Condo/Co-op   | Calhoun       |
      | TX_542 | Condo/Co-op   | Calhoun       |
      | TX_543 | Condo/Co-op   | Callahan      |
      | TX_544 | Condo/Co-op   | Cameron       |
      | TX_545 | Condo/Co-op   | Cameron       |
      | TX_546 | Condo/Co-op   | Cameron       |
      | TX_547 | Condo/Co-op   | Cameron       |
      | TX_548 | Condo/Co-op   | Cameron       |
      | TX_549 | Condo/Co-op   | Camp          |
      | TX_550 | Condo/Co-op   | Carson        |
      | TX_551 | Condo/Co-op   | Cass          |
      | TX_552 | Condo/Co-op   | Castro        |
      | TX_553 | Condo/Co-op   | Chambers      |
      | TX_554 | Condo/Co-op   | Chambers      |
      | TX_555 | Condo/Co-op   | Chambers      |
      | TX_556 | Condo/Co-op   | Chambers      |
      | TX_557 | Condo/Co-op   | Chambers      |
      | TX_558 | Condo/Co-op   | Cherokee      |
      | TX_559 | Condo/Co-op   | Childress     |
      | TX_560 | Condo/Co-op   | Clay          |
      | TX_561 | Condo/Co-op   | Cochran       |
      | TX_562 | Condo/Co-op   | Coke          |
      | TX_563 | Condo/Co-op   | Coleman       |
      | TX_564 | Condo/Co-op   | Collin        |
      | TX_565 | Condo/Co-op   | Collingsworth |
      | TX_566 | Condo/Co-op   | Colorado      |
      | TX_567 | Condo/Co-op   | Comal         |
      | TX_568 | Condo/Co-op   | Comanche      |
      | TX_569 | Condo/Co-op   | Concho        |
      | TX_570 | Condo/Co-op   | Cooke         |
      | TX_571 | Condo/Co-op   | Coryell       |
      | TX_572 | Condo/Co-op   | Cottle        |
      | TX_573 | Condo/Co-op   | Crane         |
      | TX_574 | Condo/Co-op   | Crockett      |
      | TX_575 | Condo/Co-op   | Crosby        |
      | TX_576 | Condo/Co-op   | Culberson     |
      | TX_577 | Condo/Co-op   | Dallam        |
      | TX_578 | Condo/Co-op   | Dallas        |
      | TX_579 | Condo/Co-op   | Dawson        |
      | TX_580 | Condo/Co-op   | De Witt       |
      | TX_581 | Condo/Co-op   | Deaf Smith    |
      | TX_582 | Condo/Co-op   | Delta         |
      | TX_583 | Condo/Co-op   | Denton        |
      | TX_584 | Condo/Co-op   | Dickens       |
      | TX_585 | Condo/Co-op   | Dimmit        |
      | TX_586 | Condo/Co-op   | Donley        |
      | TX_587 | Condo/Co-op   | Duval         |
      | TX_588 | Condo/Co-op   | Eastland      |
      | TX_589 | Condo/Co-op   | Ector         |
      | TX_590 | Condo/Co-op   | Edwards       |
      | TX_591 | Condo/Co-op   | El Paso       |
      | TX_592 | Condo/Co-op   | Ellis         |
      | TX_593 | Condo/Co-op   | Erath         |
      | TX_594 | Condo/Co-op   | Falls         |
      | TX_595 | Condo/Co-op   | Fannin        |
      | TX_596 | Condo/Co-op   | Fayette       |
      | TX_597 | Condo/Co-op   | Fisher        |
      | TX_598 | Condo/Co-op   | Floyd         |
      | TX_599 | Condo/Co-op   | Foard         |
      | TX_600 | Condo/Co-op   | Fort Bend     |
      | TX_601 | Condo/Co-op   | Franklin      |
      | TX_602 | Condo/Co-op   | Freestone     |
      | TX_603 | Condo/Co-op   | Frio          |
      | TX_604 | Condo/Co-op   | Gaines        |
      | TX_605 | Condo/Co-op   | Galveston     |
      | TX_606 | Condo/Co-op   | Galveston     |
      | TX_607 | Condo/Co-op   | Galveston     |
      | TX_608 | Condo/Co-op   | Galveston     |
      | TX_609 | Condo/Co-op   | Galveston     |
      | TX_610 | Condo/Co-op   | Garza         |
      | TX_611 | Condo/Co-op   | Gillespie     |
      | TX_612 | Condo/Co-op   | Glasscock     |
      | TX_613 | Condo/Co-op   | Goliad        |
      | TX_614 | Condo/Co-op   | Gonzales      |
      | TX_615 | Condo/Co-op   | Gray          |
      | TX_616 | Condo/Co-op   | Grayson       |
      | TX_617 | Condo/Co-op   | Gregg         |
      | TX_618 | Condo/Co-op   | Grimes        |
      | TX_619 | Condo/Co-op   | Guadalupe     |
      | TX_620 | Condo/Co-op   | Hale          |
      | TX_621 | Condo/Co-op   | Hall          |
      | TX_622 | Condo/Co-op   | Hamilton      |
      | TX_623 | Condo/Co-op   | Hansford      |
      | TX_624 | Condo/Co-op   | Hardeman      |
      | TX_625 | Condo/Co-op   | Hardin        |
      | TX_626 | Condo/Co-op   | Harris        |
      | TX_627 | Condo/Co-op   | Harris        |
      | TX_628 | Condo/Co-op   | Harris        |
      | TX_629 | Condo/Co-op   | Harris        |
      | TX_630 | Condo/Co-op   | Harrison      |
      | TX_631 | Condo/Co-op   | Hartley       |
      | TX_632 | Condo/Co-op   | Haskell       |
      | TX_633 | Condo/Co-op   | Hays          |
      | TX_634 | Condo/Co-op   | Hemphill      |
      | TX_635 | Condo/Co-op   | Henderson     |
      | TX_636 | Condo/Co-op   | Hidalgo       |
      | TX_637 | Condo/Co-op   | Hill          |
      | TX_638 | Condo/Co-op   | Hockley       |
      | TX_639 | Condo/Co-op   | Hood          |
      | TX_640 | Condo/Co-op   | Hopkins       |
      | TX_641 | Condo/Co-op   | Houston       |
      | TX_642 | Condo/Co-op   | Howard        |
      | TX_643 | Condo/Co-op   | Hudspeth      |
      | TX_644 | Condo/Co-op   | Hunt          |
      | TX_645 | Condo/Co-op   | Hutchinson    |
      | TX_646 | Condo/Co-op   | Irion         |
      | TX_647 | Condo/Co-op   | Jack          |
      | TX_648 | Condo/Co-op   | Jackson       |
      | TX_649 | Condo/Co-op   | Jackson       |
      | TX_650 | Condo/Co-op   | Jackson       |
      | TX_651 | Condo/Co-op   | Jackson       |
      | TX_652 | Condo/Co-op   | Jasper        |
      | TX_653 | Condo/Co-op   | Jeff Davis    |
      | TX_654 | Condo/Co-op   | Jefferson     |
      | TX_655 | Condo/Co-op   | Jefferson     |
      | TX_656 | Condo/Co-op   | Jefferson     |
      | TX_657 | Condo/Co-op   | Jefferson     |
      | TX_658 | Condo/Co-op   | Jefferson     |
      | TX_659 | Condo/Co-op   | Jim Hogg      |
      | TX_660 | Condo/Co-op   | Jim Wells     |
      | TX_661 | Condo/Co-op   | Johnson       |
      | TX_662 | Condo/Co-op   | Jones         |
      | TX_663 | Condo/Co-op   | Karnes        |
      | TX_664 | Condo/Co-op   | Kaufman       |
      | TX_665 | Condo/Co-op   | Kendall       |
      | TX_666 | Condo/Co-op   | Kenedy        |
      | TX_667 | Condo/Co-op   | Kenedy        |
      | TX_668 | Condo/Co-op   | Kenedy        |
      | TX_669 | Condo/Co-op   | Kenedy        |
      | TX_670 | Condo/Co-op   | Kenedy        |
      | TX_671 | Condo/Co-op   | Kent          |
      | TX_672 | Condo/Co-op   | Kerr          |
      | TX_673 | Condo/Co-op   | Kimble        |
      | TX_674 | Condo/Co-op   | King          |
      | TX_675 | Condo/Co-op   | Kinney        |
      | TX_676 | Condo/Co-op   | Kleberg       |
      | TX_677 | Condo/Co-op   | Kleberg       |
      | TX_678 | Condo/Co-op   | Kleberg       |
      | TX_679 | Condo/Co-op   | Kleberg       |
      | TX_680 | Condo/Co-op   | Kleberg       |
      | TX_681 | Condo/Co-op   | Knox          |
      | TX_682 | Condo/Co-op   | La Salle      |
      | TX_683 | Condo/Co-op   | Lamar         |
      | TX_684 | Condo/Co-op   | Lamb          |
      | TX_685 | Condo/Co-op   | Lampasas      |
      | TX_686 | Condo/Co-op   | Lavaca        |
      | TX_687 | Condo/Co-op   | Lee           |
      | TX_688 | Condo/Co-op   | Leon          |
      | TX_689 | Condo/Co-op   | Liberty       |
      | TX_690 | Condo/Co-op   | Limestone     |
      | TX_691 | Condo/Co-op   | Lipscomb      |
      | TX_692 | Condo/Co-op   | Live Oak      |
      | TX_693 | Condo/Co-op   | Llano         |
      | TX_694 | Condo/Co-op   | Loving        |
      | TX_695 | Condo/Co-op   | Lubbock       |
      | TX_696 | Condo/Co-op   | Lynn          |
      | TX_697 | Condo/Co-op   | Madison       |
      | TX_698 | Condo/Co-op   | Marion        |
      | TX_699 | Condo/Co-op   | Martin        |
      | TX_700 | Condo/Co-op   | Mason         |
      | TX_701 | Condo/Co-op   | Matagorda     |
      | TX_702 | Condo/Co-op   | Matagorda     |
      | TX_703 | Condo/Co-op   | Matagorda     |
      | TX_704 | Condo/Co-op   | Matagorda     |
      | TX_705 | Condo/Co-op   | Matagorda     |
      | TX_706 | Condo/Co-op   | Maverick      |
      | TX_707 | Condo/Co-op   | McCulloch     |
      | TX_708 | Condo/Co-op   | McLennan      |
      | TX_709 | Condo/Co-op   | McMullen      |
      | TX_710 | Condo/Co-op   | Medina        |
      | TX_711 | Condo/Co-op   | Menard        |
      | TX_712 | Condo/Co-op   | Midland       |
      | TX_713 | Condo/Co-op   | Milam         |
      | TX_714 | Condo/Co-op   | Mills         |
      | TX_715 | Condo/Co-op   | Mitchell      |
      | TX_716 | Condo/Co-op   | Montague      |
      | TX_717 | Condo/Co-op   | Montgomery    |
      | TX_718 | Condo/Co-op   | Moore         |
      | TX_719 | Condo/Co-op   | Morris        |
      | TX_720 | Condo/Co-op   | Motley        |
      | TX_721 | Condo/Co-op   | Nacogdoches   |
      | TX_722 | Condo/Co-op   | Navarro       |
      | TX_723 | Condo/Co-op   | Newton        |
      | TX_724 | Condo/Co-op   | Nolan         |
      | TX_725 | Condo/Co-op   | Nueces        |
      | TX_726 | Condo/Co-op   | Nueces        |
      | TX_727 | Condo/Co-op   | Nueces        |
      | TX_728 | Condo/Co-op   | Nueces        |
      | TX_729 | Condo/Co-op   | Nueces        |
      | TX_730 | Condo/Co-op   | Ochiltree     |
      | TX_731 | Condo/Co-op   | Oldham        |
      | TX_732 | Condo/Co-op   | Orange        |
      | TX_733 | Condo/Co-op   | Palo Pinto    |
      | TX_734 | Condo/Co-op   | Panola        |
      | TX_735 | Condo/Co-op   | Parker        |
      | TX_736 | Condo/Co-op   | Parmer        |
      | TX_737 | Condo/Co-op   | Pecos         |
      | TX_738 | Condo/Co-op   | Polk          |
      | TX_739 | Condo/Co-op   | Potter        |
      | TX_740 | Condo/Co-op   | Presidio      |
      | TX_741 | Condo/Co-op   | Rains         |
      | TX_742 | Condo/Co-op   | Randall       |
      | TX_743 | Condo/Co-op   | Reagan        |
      | TX_744 | Condo/Co-op   | Real          |
      | TX_745 | Condo/Co-op   | Red River     |
      | TX_746 | Condo/Co-op   | Reeves        |
      | TX_747 | Condo/Co-op   | Refugio       |
      | TX_748 | Condo/Co-op   | Refugio       |
      | TX_749 | Condo/Co-op   | Refugio       |
      | TX_750 | Condo/Co-op   | Refugio       |
      | TX_751 | Condo/Co-op   | Refugio       |
      | TX_752 | Condo/Co-op   | Roberts       |
      | TX_753 | Condo/Co-op   | Robertson     |
      | TX_754 | Condo/Co-op   | Rockwall      |
      | TX_755 | Condo/Co-op   | Runnels       |
      | TX_756 | Condo/Co-op   | Rusk          |
      | TX_757 | Condo/Co-op   | Sabine        |
      | TX_758 | Condo/Co-op   | San Augustine |
      | TX_759 | Condo/Co-op   | San Jacinto   |
      | TX_760 | Condo/Co-op   | San Patricio  |
      | TX_761 | Condo/Co-op   | San Patricio  |
      | TX_762 | Condo/Co-op   | San Patricio  |
      | TX_763 | Condo/Co-op   | San Patricio  |
      | TX_764 | Condo/Co-op   | San Patricio  |
      | TX_765 | Condo/Co-op   | San Saba      |
      | TX_766 | Condo/Co-op   | Schleicher    |
      | TX_767 | Condo/Co-op   | Scurry        |
      | TX_768 | Condo/Co-op   | Shackelford   |
      | TX_769 | Condo/Co-op   | Shelby        |
      | TX_770 | Condo/Co-op   | Sherman       |
      | TX_771 | Condo/Co-op   | Smith         |
      | TX_772 | Condo/Co-op   | Somervell     |
      | TX_773 | Condo/Co-op   | Starr         |
      | TX_774 | Condo/Co-op   | Stephens      |
      | TX_775 | Condo/Co-op   | Sterling      |
      | TX_776 | Condo/Co-op   | Stonewall     |
      | TX_777 | Condo/Co-op   | Sutton        |
      | TX_778 | Condo/Co-op   | Swisher       |
      | TX_779 | Condo/Co-op   | Tarrant       |
      | TX_780 | Condo/Co-op   | Taylor        |
      | TX_781 | Condo/Co-op   | Terrell       |
      | TX_782 | Condo/Co-op   | Terry         |
      | TX_783 | Condo/Co-op   | Throckmorton  |
      | TX_784 | Condo/Co-op   | Titus         |
      | TX_785 | Condo/Co-op   | Tom Green     |
      | TX_786 | Condo/Co-op   | Travis        |
      | TX_787 | Condo/Co-op   | Trinity       |
      | TX_788 | Condo/Co-op   | Tyler         |
      | TX_789 | Condo/Co-op   | Upshur        |
      | TX_790 | Condo/Co-op   | Upton         |
      | TX_791 | Condo/Co-op   | Uvalde        |
      | TX_792 | Condo/Co-op   | Val Verde     |
      | TX_793 | Condo/Co-op   | Van Zandt     |
      | TX_794 | Condo/Co-op   | Victoria      |
      | TX_795 | Condo/Co-op   | Victoria      |
      | TX_796 | Condo/Co-op   | Victoria      |
      | TX_797 | Condo/Co-op   | Victoria      |
      | TX_798 | Condo/Co-op   | Walker        |
      | TX_799 | Condo/Co-op   | Waller        |
      | TX_800 | Condo/Co-op   | Ward          |
      | TX_801 | Condo/Co-op   | Washington    |
      | TX_802 | Condo/Co-op   | Webb          |
      | TX_803 | Condo/Co-op   | Wharton       |
      | TX_804 | Condo/Co-op   | Wheeler       |
      | TX_805 | Condo/Co-op   | Wichita       |
      | TX_806 | Condo/Co-op   | Wilbarger     |
      | TX_807 | Condo/Co-op   | Willacy       |
      | TX_808 | Condo/Co-op   | Willacy       |
      | TX_809 | Condo/Co-op   | Willacy       |
      | TX_810 | Condo/Co-op   | Willacy       |
      | TX_811 | Condo/Co-op   | Willacy       |
      | TX_812 | Condo/Co-op   | Williamson    |
      | TX_813 | Condo/Co-op   | Wilson        |
      | TX_814 | Condo/Co-op   | Winkler       |
      | TX_815 | Condo/Co-op   | Wise          |
      | TX_816 | Condo/Co-op   | Wood          |
      | TX_817 | Condo/Co-op   | Yoakum        |
      | TX_818 | Condo/Co-op   | Young         |
      | TX_819 | Condo/Co-op   | Zapata        |
      | TX_820 | Condo/Co-op   | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_545 | Condo/Co-op   | Cameron   |
      | TX_620 | Condo/Co-op   | Hale      |
#      | TX_739 | Condo/Co-op   | Potter    |
#      | TX_685 | Condo/Co-op   | Lampasas  |
      | TX_701 | Condo/Co-op   | Matagorda |

  @PSE @STG
  Scenario Outline: US45592 - Get Base Rates for PSE TX - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE TX condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45592" in sheet "QuoteCreatorHS" for "HS" LOB
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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/PSE" in "Base_Rates" excel file for "New Business"

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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/PSE" in "Base_Rates" excel file for "Endorsement"

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

    Then I save coverage factor and value for "<TC_ID>" in "STG/US45592/PSE" in "Base_Rates" excel file for "Renewal"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_001 | Homeowner     | Anderson      |
      | TX_002 | Homeowner     | Andrews       |
      | TX_003 | Homeowner     | Angelina      |
      | TX_004 | Homeowner     | Aransas       |
      | TX_005 | Homeowner     | Aransas       |
      | TX_006 | Homeowner     | Aransas       |
      | TX_007 | Homeowner     | Aransas       |
      | TX_008 | Homeowner     | Aransas       |
      | TX_009 | Homeowner     | Archer        |
      | TX_010 | Homeowner     | Armstrong     |
      | TX_011 | Homeowner     | Atascosa      |
      | TX_012 | Homeowner     | Austin        |
      | TX_013 | Homeowner     | Bailey        |
      | TX_014 | Homeowner     | Bandera       |
      | TX_015 | Homeowner     | Bastrop       |
      | TX_016 | Homeowner     | Baylor        |
      | TX_017 | Homeowner     | Bee           |
      | TX_018 | Homeowner     | Bell          |
      | TX_019 | Homeowner     | Bexar         |
      | TX_020 | Homeowner     | Blanco        |
      | TX_021 | Homeowner     | Borden        |
      | TX_022 | Homeowner     | Bosque        |
      | TX_023 | Homeowner     | Bowie         |
      | TX_024 | Homeowner     | Brazoria      |
      | TX_025 | Homeowner     | Brazoria      |
      | TX_026 | Homeowner     | Brazoria      |
      | TX_027 | Homeowner     | Brazoria      |
      | TX_028 | Homeowner     | Brazoria      |
      | TX_029 | Homeowner     | Brazoria      |
      | TX_030 | Homeowner     | Brazos        |
      | TX_031 | Homeowner     | Brewster      |
      | TX_032 | Homeowner     | Briscoe       |
      | TX_033 | Homeowner     | Brooks        |
      | TX_034 | Homeowner     | Brown         |
      | TX_035 | Homeowner     | Burleson      |
      | TX_036 | Homeowner     | Burnet        |
      | TX_037 | Homeowner     | Caldwell      |
      | TX_038 | Homeowner     | Calhoun       |
      | TX_039 | Homeowner     | Calhoun       |
      | TX_040 | Homeowner     | Calhoun       |
      | TX_041 | Homeowner     | Calhoun       |
      | TX_042 | Homeowner     | Calhoun       |
      | TX_043 | Homeowner     | Callahan      |
      | TX_044 | Homeowner     | Cameron       |
      | TX_045 | Homeowner     | Cameron       |
      | TX_046 | Homeowner     | Cameron       |
      | TX_047 | Homeowner     | Cameron       |
      | TX_048 | Homeowner     | Cameron       |
      | TX_049 | Homeowner     | Camp          |
      | TX_050 | Homeowner     | Carson        |
      | TX_051 | Homeowner     | Cass          |
      | TX_052 | Homeowner     | Castro        |
      | TX_053 | Homeowner     | Chambers      |
      | TX_054 | Homeowner     | Chambers      |
      | TX_055 | Homeowner     | Chambers      |
      | TX_056 | Homeowner     | Chambers      |
      | TX_057 | Homeowner     | Chambers      |
      | TX_058 | Homeowner     | Cherokee      |
      | TX_059 | Homeowner     | Childress     |
      | TX_060 | Homeowner     | Clay          |
      | TX_061 | Homeowner     | Cochran       |
      | TX_062 | Homeowner     | Coke          |
      | TX_063 | Homeowner     | Coleman       |
      | TX_064 | Homeowner     | Collin        |
      | TX_065 | Homeowner     | Collingsworth |
      | TX_066 | Homeowner     | Colorado      |
      | TX_067 | Homeowner     | Comal         |
      | TX_068 | Homeowner     | Comanche      |
      | TX_069 | Homeowner     | Concho        |
      | TX_070 | Homeowner     | Cooke         |
      | TX_071 | Homeowner     | Coryell       |
      | TX_072 | Homeowner     | Cottle        |
      | TX_073 | Homeowner     | Crane         |
      | TX_074 | Homeowner     | Crockett      |
      | TX_075 | Homeowner     | Crosby        |
      | TX_076 | Homeowner     | Culberson     |
      | TX_077 | Homeowner     | Dallam        |
      | TX_078 | Homeowner     | Dallas        |
      | TX_079 | Homeowner     | Dawson        |
      | TX_080 | Homeowner     | De Witt       |
      | TX_081 | Homeowner     | Deaf Smith    |
      | TX_082 | Homeowner     | Delta         |
      | TX_083 | Homeowner     | Denton        |
      | TX_084 | Homeowner     | Dickens       |
      | TX_085 | Homeowner     | Dimmit        |
      | TX_086 | Homeowner     | Donley        |
      | TX_087 | Homeowner     | Duval         |
      | TX_088 | Homeowner     | Eastland      |
      | TX_089 | Homeowner     | Ector         |
      | TX_090 | Homeowner     | Edwards       |
      | TX_091 | Homeowner     | El Paso       |
      | TX_092 | Homeowner     | Ellis         |
      | TX_093 | Homeowner     | Erath         |
      | TX_094 | Homeowner     | Falls         |
      | TX_095 | Homeowner     | Fannin        |
      | TX_096 | Homeowner     | Fayette       |
      | TX_097 | Homeowner     | Fisher        |
      | TX_098 | Homeowner     | Floyd         |
      | TX_099 | Homeowner     | Foard         |
      | TX_100 | Homeowner     | Fort Bend     |
      | TX_101 | Homeowner     | Franklin      |
      | TX_102 | Homeowner     | Freestone     |
      | TX_103 | Homeowner     | Frio          |
      | TX_104 | Homeowner     | Gaines        |
      | TX_105 | Homeowner     | Galveston     |
      | TX_106 | Homeowner     | Galveston     |
      | TX_107 | Homeowner     | Galveston     |
      | TX_108 | Homeowner     | Galveston     |
      | TX_109 | Homeowner     | Galveston     |
      | TX_110 | Homeowner     | Garza         |
      | TX_111 | Homeowner     | Gillespie     |
      | TX_112 | Homeowner     | Glasscock     |
      | TX_113 | Homeowner     | Goliad        |
      | TX_114 | Homeowner     | Gonzales      |
      | TX_115 | Homeowner     | Gray          |
      | TX_116 | Homeowner     | Grayson       |
      | TX_117 | Homeowner     | Gregg         |
      | TX_118 | Homeowner     | Grimes        |
      | TX_119 | Homeowner     | Guadalupe     |
      | TX_120 | Homeowner     | Hale          |
      | TX_121 | Homeowner     | Hall          |
      | TX_122 | Homeowner     | Hamilton      |
      | TX_123 | Homeowner     | Hansford      |
      | TX_124 | Homeowner     | Hardeman      |
      | TX_125 | Homeowner     | Hardin        |
      | TX_126 | Homeowner     | Harris        |
      | TX_127 | Homeowner     | Harris        |
      | TX_128 | Homeowner     | Harris        |
      | TX_129 | Homeowner     | Harris        |
      | TX_130 | Homeowner     | Harrison      |
      | TX_131 | Homeowner     | Hartley       |
      | TX_132 | Homeowner     | Haskell       |
      | TX_133 | Homeowner     | Hays          |
      | TX_134 | Homeowner     | Hemphill      |
      | TX_135 | Homeowner     | Henderson     |
      | TX_136 | Homeowner     | Hidalgo       |
      | TX_137 | Homeowner     | Hill          |
      | TX_138 | Homeowner     | Hockley       |
      | TX_139 | Homeowner     | Hood          |
      | TX_140 | Homeowner     | Hopkins       |
      | TX_141 | Homeowner     | Houston       |
      | TX_142 | Homeowner     | Howard        |
      | TX_143 | Homeowner     | Hudspeth      |
      | TX_144 | Homeowner     | Hunt          |
      | TX_145 | Homeowner     | Hutchinson    |
      | TX_146 | Homeowner     | Irion         |
      | TX_147 | Homeowner     | Jack          |
      | TX_148 | Homeowner     | Jackson       |
      | TX_149 | Homeowner     | Jackson       |
      | TX_150 | Homeowner     | Jackson       |
      | TX_151 | Homeowner     | Jackson       |
      | TX_152 | Homeowner     | Jasper        |
      | TX_153 | Homeowner     | Jeff Davis    |
      | TX_154 | Homeowner     | Jefferson     |
      | TX_155 | Homeowner     | Jefferson     |
      | TX_156 | Homeowner     | Jefferson     |
      | TX_157 | Homeowner     | Jefferson     |
      | TX_158 | Homeowner     | Jefferson     |
      | TX_159 | Homeowner     | Jim Hogg      |
      | TX_160 | Homeowner     | Jim Wells     |
      | TX_161 | Homeowner     | Johnson       |
      | TX_162 | Homeowner     | Jones         |
      | TX_163 | Homeowner     | Karnes        |
      | TX_164 | Homeowner     | Kaufman       |
      | TX_165 | Homeowner     | Kendall       |
      | TX_166 | Homeowner     | Kenedy        |
      | TX_167 | Homeowner     | Kenedy        |
      | TX_168 | Homeowner     | Kenedy        |
      | TX_169 | Homeowner     | Kenedy        |
      | TX_170 | Homeowner     | Kenedy        |
      | TX_171 | Homeowner     | Kent          |
      | TX_172 | Homeowner     | Kerr          |
      | TX_173 | Homeowner     | Kimble        |
      | TX_174 | Homeowner     | King          |
      | TX_175 | Homeowner     | Kinney        |
      | TX_176 | Homeowner     | Kleberg       |
      | TX_177 | Homeowner     | Kleberg       |
      | TX_178 | Homeowner     | Kleberg       |
      | TX_179 | Homeowner     | Kleberg       |
      | TX_180 | Homeowner     | Kleberg       |
      | TX_181 | Homeowner     | Knox          |
      | TX_182 | Homeowner     | La Salle      |
      | TX_183 | Homeowner     | Lamar         |
      | TX_184 | Homeowner     | Lamb          |
      | TX_185 | Homeowner     | Lampasas      |
      | TX_186 | Homeowner     | Lavaca        |
      | TX_187 | Homeowner     | Lee           |
      | TX_188 | Homeowner     | Leon          |
      | TX_189 | Homeowner     | Liberty       |
      | TX_190 | Homeowner     | Limestone     |
      | TX_191 | Homeowner     | Lipscomb      |
      | TX_192 | Homeowner     | Live Oak      |
      | TX_193 | Homeowner     | Llano         |
      | TX_194 | Homeowner     | Loving        |
      | TX_195 | Homeowner     | Lubbock       |
      | TX_196 | Homeowner     | Lynn          |
      | TX_197 | Homeowner     | Madison       |
      | TX_198 | Homeowner     | Marion        |
      | TX_199 | Homeowner     | Martin        |
      | TX_200 | Homeowner     | Mason         |
      | TX_201 | Homeowner     | Matagorda     |
      | TX_202 | Homeowner     | Matagorda     |
      | TX_203 | Homeowner     | Matagorda     |
      | TX_204 | Homeowner     | Matagorda     |
      | TX_205 | Homeowner     | Matagorda     |
      | TX_206 | Homeowner     | Maverick      |
      | TX_207 | Homeowner     | McCulloch     |
      | TX_208 | Homeowner     | McLennan      |
      | TX_209 | Homeowner     | McMullen      |
      | TX_210 | Homeowner     | Medina        |
      | TX_211 | Homeowner     | Menard        |
      | TX_212 | Homeowner     | Midland       |
      | TX_213 | Homeowner     | Milam         |
      | TX_214 | Homeowner     | Mills         |
      | TX_215 | Homeowner     | Mitchell      |
      | TX_216 | Homeowner     | Montague      |
      | TX_217 | Homeowner     | Montgomery    |
      | TX_218 | Homeowner     | Moore         |
      | TX_219 | Homeowner     | Morris        |
      | TX_220 | Homeowner     | Motley        |
      | TX_221 | Homeowner     | Nacogdoches   |
      | TX_222 | Homeowner     | Navarro       |
      | TX_223 | Homeowner     | Newton        |
      | TX_224 | Homeowner     | Nolan         |
      | TX_225 | Homeowner     | Nueces        |
      | TX_226 | Homeowner     | Nueces        |
      | TX_227 | Homeowner     | Nueces        |
      | TX_228 | Homeowner     | Nueces        |
      | TX_229 | Homeowner     | Nueces        |
      | TX_230 | Homeowner     | Ochiltree     |
      | TX_231 | Homeowner     | Oldham        |
      | TX_232 | Homeowner     | Orange        |
      | TX_233 | Homeowner     | Palo Pinto    |
      | TX_234 | Homeowner     | Panola        |
      | TX_235 | Homeowner     | Parker        |
      | TX_236 | Homeowner     | Parmer        |
      | TX_237 | Homeowner     | Pecos         |
      | TX_238 | Homeowner     | Polk          |
      | TX_239 | Homeowner     | Potter        |
      | TX_240 | Homeowner     | Presidio      |
      | TX_241 | Homeowner     | Rains         |
      | TX_242 | Homeowner     | Randall       |
      | TX_243 | Homeowner     | Reagan        |
      | TX_244 | Homeowner     | Real          |
      | TX_245 | Homeowner     | Red River     |
      | TX_246 | Homeowner     | Reeves        |
      | TX_247 | Homeowner     | Refugio       |
      | TX_248 | Homeowner     | Refugio       |
      | TX_249 | Homeowner     | Refugio       |
      | TX_250 | Homeowner     | Refugio       |
      | TX_251 | Homeowner     | Refugio       |
      | TX_252 | Homeowner     | Roberts       |
      | TX_253 | Homeowner     | Robertson     |
      | TX_254 | Homeowner     | Rockwall      |
      | TX_255 | Homeowner     | Runnels       |
      | TX_256 | Homeowner     | Rusk          |
      | TX_257 | Homeowner     | Sabine        |
      | TX_258 | Homeowner     | San Augustine |
      | TX_259 | Homeowner     | San Jacinto   |
      | TX_260 | Homeowner     | San Patricio  |
      | TX_261 | Homeowner     | San Patricio  |
      | TX_262 | Homeowner     | San Patricio  |
      | TX_263 | Homeowner     | San Patricio  |
      | TX_264 | Homeowner     | San Patricio  |
      | TX_265 | Homeowner     | San Saba      |
      | TX_266 | Homeowner     | Schleicher    |
      | TX_267 | Homeowner     | Scurry        |
      | TX_268 | Homeowner     | Shackelford   |
      | TX_269 | Homeowner     | Shelby        |
      | TX_270 | Homeowner     | Sherman       |
      | TX_271 | Homeowner     | Smith         |
      | TX_272 | Homeowner     | Somervell     |
      | TX_273 | Homeowner     | Starr         |
      | TX_274 | Homeowner     | Stephens      |
      | TX_275 | Homeowner     | Sterling      |
      | TX_276 | Homeowner     | Stonewall     |
      | TX_277 | Homeowner     | Sutton        |
      | TX_278 | Homeowner     | Swisher       |
      | TX_279 | Homeowner     | Tarrant       |
      | TX_280 | Homeowner     | Taylor        |
      | TX_281 | Homeowner     | Terrell       |
      | TX_282 | Homeowner     | Terry         |
      | TX_283 | Homeowner     | Throckmorton  |
      | TX_284 | Homeowner     | Titus         |
      | TX_285 | Homeowner     | Tom Green     |
      | TX_286 | Homeowner     | Travis        |
      | TX_287 | Homeowner     | Trinity       |
      | TX_288 | Homeowner     | Tyler         |
      | TX_289 | Homeowner     | Upshur        |
      | TX_290 | Homeowner     | Upton         |
      | TX_291 | Homeowner     | Uvalde        |
      | TX_292 | Homeowner     | Val Verde     |
      | TX_293 | Homeowner     | Van Zandt     |
      | TX_294 | Homeowner     | Victoria      |
      | TX_295 | Homeowner     | Victoria      |
      | TX_296 | Homeowner     | Victoria      |
      | TX_297 | Homeowner     | Victoria      |
      | TX_298 | Homeowner     | Walker        |
      | TX_299 | Homeowner     | Waller        |
      | TX_300 | Homeowner     | Ward          |
      | TX_301 | Homeowner     | Washington    |
      | TX_302 | Homeowner     | Webb          |
      | TX_303 | Homeowner     | Wharton       |
      | TX_304 | Homeowner     | Wheeler       |
      | TX_305 | Homeowner     | Wichita       |
      | TX_306 | Homeowner     | Wilbarger     |
      | TX_307 | Homeowner     | Willacy       |
      | TX_308 | Homeowner     | Willacy       |
      | TX_309 | Homeowner     | Willacy       |
      | TX_310 | Homeowner     | Willacy       |
      | TX_311 | Homeowner     | Willacy       |
      | TX_312 | Homeowner     | Williamson    |
      | TX_313 | Homeowner     | Wilson        |
      | TX_314 | Homeowner     | Winkler       |
      | TX_315 | Homeowner     | Wise          |
      | TX_316 | Homeowner     | Wood          |
      | TX_317 | Homeowner     | Yoakum        |
      | TX_318 | Homeowner     | Young         |
      | TX_319 | Homeowner     | Zapata        |
      | TX_320 | Homeowner     | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
#      | TX_120 | Homeowner     | Hale      |
#      | TX_002 | Homeowner     | Andrews   |
#      | TX_003 | Homeowner     | Angelina  |
#      | TX_010 | Homeowner     | Armstrong |
      | TX_075 | Homeowner     | Crosby    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_501 | Condo/Co-op   | Anderson      |
      | TX_502 | Condo/Co-op   | Andrews       |
      | TX_503 | Condo/Co-op   | Angelina      |
      | TX_504 | Condo/Co-op   | Aransas       |
      | TX_505 | Condo/Co-op   | Aransas       |
      | TX_506 | Condo/Co-op   | Aransas       |
      | TX_507 | Condo/Co-op   | Aransas       |
      | TX_508 | Condo/Co-op   | Aransas       |
      | TX_509 | Condo/Co-op   | Archer        |
      | TX_510 | Condo/Co-op   | Armstrong     |
      | TX_511 | Condo/Co-op   | Atascosa      |
      | TX_512 | Condo/Co-op   | Austin        |
      | TX_513 | Condo/Co-op   | Bailey        |
      | TX_514 | Condo/Co-op   | Bandera       |
      | TX_515 | Condo/Co-op   | Bastrop       |
      | TX_516 | Condo/Co-op   | Baylor        |
      | TX_517 | Condo/Co-op   | Bee           |
      | TX_518 | Condo/Co-op   | Bell          |
      | TX_519 | Condo/Co-op   | Bexar         |
      | TX_520 | Condo/Co-op   | Blanco        |
      | TX_521 | Condo/Co-op   | Borden        |
      | TX_522 | Condo/Co-op   | Bosque        |
      | TX_523 | Condo/Co-op   | Bowie         |
      | TX_524 | Condo/Co-op   | Brazoria      |
      | TX_525 | Condo/Co-op   | Brazoria      |
      | TX_526 | Condo/Co-op   | Brazoria      |
      | TX_527 | Condo/Co-op   | Brazoria      |
      | TX_528 | Condo/Co-op   | Brazoria      |
      | TX_529 | Condo/Co-op   | Brazoria      |
      | TX_530 | Condo/Co-op   | Brazos        |
      | TX_531 | Condo/Co-op   | Brewster      |
      | TX_532 | Condo/Co-op   | Briscoe       |
      | TX_533 | Condo/Co-op   | Brooks        |
      | TX_534 | Condo/Co-op   | Brown         |
      | TX_535 | Condo/Co-op   | Burleson      |
      | TX_536 | Condo/Co-op   | Burnet        |
      | TX_537 | Condo/Co-op   | Caldwell      |
      | TX_538 | Condo/Co-op   | Calhoun       |
      | TX_539 | Condo/Co-op   | Calhoun       |
      | TX_540 | Condo/Co-op   | Calhoun       |
      | TX_541 | Condo/Co-op   | Calhoun       |
      | TX_542 | Condo/Co-op   | Calhoun       |
      | TX_543 | Condo/Co-op   | Callahan      |
      | TX_544 | Condo/Co-op   | Cameron       |
      | TX_545 | Condo/Co-op   | Cameron       |
      | TX_546 | Condo/Co-op   | Cameron       |
      | TX_547 | Condo/Co-op   | Cameron       |
      | TX_548 | Condo/Co-op   | Cameron       |
      | TX_549 | Condo/Co-op   | Camp          |
      | TX_550 | Condo/Co-op   | Carson        |
      | TX_551 | Condo/Co-op   | Cass          |
      | TX_552 | Condo/Co-op   | Castro        |
      | TX_553 | Condo/Co-op   | Chambers      |
      | TX_554 | Condo/Co-op   | Chambers      |
      | TX_555 | Condo/Co-op   | Chambers      |
      | TX_556 | Condo/Co-op   | Chambers      |
      | TX_557 | Condo/Co-op   | Chambers      |
      | TX_558 | Condo/Co-op   | Cherokee      |
      | TX_559 | Condo/Co-op   | Childress     |
      | TX_560 | Condo/Co-op   | Clay          |
      | TX_561 | Condo/Co-op   | Cochran       |
      | TX_562 | Condo/Co-op   | Coke          |
      | TX_563 | Condo/Co-op   | Coleman       |
      | TX_564 | Condo/Co-op   | Collin        |
      | TX_565 | Condo/Co-op   | Collingsworth |
      | TX_566 | Condo/Co-op   | Colorado      |
      | TX_567 | Condo/Co-op   | Comal         |
      | TX_568 | Condo/Co-op   | Comanche      |
      | TX_569 | Condo/Co-op   | Concho        |
      | TX_570 | Condo/Co-op   | Cooke         |
      | TX_571 | Condo/Co-op   | Coryell       |
      | TX_572 | Condo/Co-op   | Cottle        |
      | TX_573 | Condo/Co-op   | Crane         |
      | TX_574 | Condo/Co-op   | Crockett      |
      | TX_575 | Condo/Co-op   | Crosby        |
      | TX_576 | Condo/Co-op   | Culberson     |
      | TX_577 | Condo/Co-op   | Dallam        |
      | TX_578 | Condo/Co-op   | Dallas        |
      | TX_579 | Condo/Co-op   | Dawson        |
      | TX_580 | Condo/Co-op   | De Witt       |
      | TX_581 | Condo/Co-op   | Deaf Smith    |
      | TX_582 | Condo/Co-op   | Delta         |
      | TX_583 | Condo/Co-op   | Denton        |
      | TX_584 | Condo/Co-op   | Dickens       |
      | TX_585 | Condo/Co-op   | Dimmit        |
      | TX_586 | Condo/Co-op   | Donley        |
      | TX_587 | Condo/Co-op   | Duval         |
      | TX_588 | Condo/Co-op   | Eastland      |
      | TX_589 | Condo/Co-op   | Ector         |
      | TX_590 | Condo/Co-op   | Edwards       |
      | TX_591 | Condo/Co-op   | El Paso       |
      | TX_592 | Condo/Co-op   | Ellis         |
      | TX_593 | Condo/Co-op   | Erath         |
      | TX_594 | Condo/Co-op   | Falls         |
      | TX_595 | Condo/Co-op   | Fannin        |
      | TX_596 | Condo/Co-op   | Fayette       |
      | TX_597 | Condo/Co-op   | Fisher        |
      | TX_598 | Condo/Co-op   | Floyd         |
      | TX_599 | Condo/Co-op   | Foard         |
      | TX_600 | Condo/Co-op   | Fort Bend     |
      | TX_601 | Condo/Co-op   | Franklin      |
      | TX_602 | Condo/Co-op   | Freestone     |
      | TX_603 | Condo/Co-op   | Frio          |
      | TX_604 | Condo/Co-op   | Gaines        |
      | TX_605 | Condo/Co-op   | Galveston     |
      | TX_606 | Condo/Co-op   | Galveston     |
      | TX_607 | Condo/Co-op   | Galveston     |
      | TX_608 | Condo/Co-op   | Galveston     |
      | TX_609 | Condo/Co-op   | Galveston     |
      | TX_610 | Condo/Co-op   | Garza         |
      | TX_611 | Condo/Co-op   | Gillespie     |
      | TX_612 | Condo/Co-op   | Glasscock     |
      | TX_613 | Condo/Co-op   | Goliad        |
      | TX_614 | Condo/Co-op   | Gonzales      |
      | TX_615 | Condo/Co-op   | Gray          |
      | TX_616 | Condo/Co-op   | Grayson       |
      | TX_617 | Condo/Co-op   | Gregg         |
      | TX_618 | Condo/Co-op   | Grimes        |
      | TX_619 | Condo/Co-op   | Guadalupe     |
      | TX_620 | Condo/Co-op   | Hale          |
      | TX_621 | Condo/Co-op   | Hall          |
      | TX_622 | Condo/Co-op   | Hamilton      |
      | TX_623 | Condo/Co-op   | Hansford      |
      | TX_624 | Condo/Co-op   | Hardeman      |
      | TX_625 | Condo/Co-op   | Hardin        |
      | TX_626 | Condo/Co-op   | Harris        |
      | TX_627 | Condo/Co-op   | Harris        |
      | TX_628 | Condo/Co-op   | Harris        |
      | TX_629 | Condo/Co-op   | Harris        |
      | TX_630 | Condo/Co-op   | Harrison      |
      | TX_631 | Condo/Co-op   | Hartley       |
      | TX_632 | Condo/Co-op   | Haskell       |
      | TX_633 | Condo/Co-op   | Hays          |
      | TX_634 | Condo/Co-op   | Hemphill      |
      | TX_635 | Condo/Co-op   | Henderson     |
      | TX_636 | Condo/Co-op   | Hidalgo       |
      | TX_637 | Condo/Co-op   | Hill          |
      | TX_638 | Condo/Co-op   | Hockley       |
      | TX_639 | Condo/Co-op   | Hood          |
      | TX_640 | Condo/Co-op   | Hopkins       |
      | TX_641 | Condo/Co-op   | Houston       |
      | TX_642 | Condo/Co-op   | Howard        |
      | TX_643 | Condo/Co-op   | Hudspeth      |
      | TX_644 | Condo/Co-op   | Hunt          |
      | TX_645 | Condo/Co-op   | Hutchinson    |
      | TX_646 | Condo/Co-op   | Irion         |
      | TX_647 | Condo/Co-op   | Jack          |
      | TX_648 | Condo/Co-op   | Jackson       |
      | TX_649 | Condo/Co-op   | Jackson       |
      | TX_650 | Condo/Co-op   | Jackson       |
      | TX_651 | Condo/Co-op   | Jackson       |
      | TX_652 | Condo/Co-op   | Jasper        |
      | TX_653 | Condo/Co-op   | Jeff Davis    |
      | TX_654 | Condo/Co-op   | Jefferson     |
      | TX_655 | Condo/Co-op   | Jefferson     |
      | TX_656 | Condo/Co-op   | Jefferson     |
      | TX_657 | Condo/Co-op   | Jefferson     |
      | TX_658 | Condo/Co-op   | Jefferson     |
      | TX_659 | Condo/Co-op   | Jim Hogg      |
      | TX_660 | Condo/Co-op   | Jim Wells     |
      | TX_661 | Condo/Co-op   | Johnson       |
      | TX_662 | Condo/Co-op   | Jones         |
      | TX_663 | Condo/Co-op   | Karnes        |
      | TX_664 | Condo/Co-op   | Kaufman       |
      | TX_665 | Condo/Co-op   | Kendall       |
      | TX_666 | Condo/Co-op   | Kenedy        |
      | TX_667 | Condo/Co-op   | Kenedy        |
      | TX_668 | Condo/Co-op   | Kenedy        |
      | TX_669 | Condo/Co-op   | Kenedy        |
      | TX_670 | Condo/Co-op   | Kenedy        |
      | TX_671 | Condo/Co-op   | Kent          |
      | TX_672 | Condo/Co-op   | Kerr          |
      | TX_673 | Condo/Co-op   | Kimble        |
      | TX_674 | Condo/Co-op   | King          |
      | TX_675 | Condo/Co-op   | Kinney        |
      | TX_676 | Condo/Co-op   | Kleberg       |
      | TX_677 | Condo/Co-op   | Kleberg       |
      | TX_678 | Condo/Co-op   | Kleberg       |
      | TX_679 | Condo/Co-op   | Kleberg       |
      | TX_680 | Condo/Co-op   | Kleberg       |
      | TX_681 | Condo/Co-op   | Knox          |
      | TX_682 | Condo/Co-op   | La Salle      |
      | TX_683 | Condo/Co-op   | Lamar         |
      | TX_684 | Condo/Co-op   | Lamb          |
      | TX_685 | Condo/Co-op   | Lampasas      |
      | TX_686 | Condo/Co-op   | Lavaca        |
      | TX_687 | Condo/Co-op   | Lee           |
      | TX_688 | Condo/Co-op   | Leon          |
      | TX_689 | Condo/Co-op   | Liberty       |
      | TX_690 | Condo/Co-op   | Limestone     |
      | TX_691 | Condo/Co-op   | Lipscomb      |
      | TX_692 | Condo/Co-op   | Live Oak      |
      | TX_693 | Condo/Co-op   | Llano         |
      | TX_694 | Condo/Co-op   | Loving        |
      | TX_695 | Condo/Co-op   | Lubbock       |
      | TX_696 | Condo/Co-op   | Lynn          |
      | TX_697 | Condo/Co-op   | Madison       |
      | TX_698 | Condo/Co-op   | Marion        |
      | TX_699 | Condo/Co-op   | Martin        |
      | TX_700 | Condo/Co-op   | Mason         |
      | TX_701 | Condo/Co-op   | Matagorda     |
      | TX_702 | Condo/Co-op   | Matagorda     |
      | TX_703 | Condo/Co-op   | Matagorda     |
      | TX_704 | Condo/Co-op   | Matagorda     |
      | TX_705 | Condo/Co-op   | Matagorda     |
      | TX_706 | Condo/Co-op   | Maverick      |
      | TX_707 | Condo/Co-op   | McCulloch     |
      | TX_708 | Condo/Co-op   | McLennan      |
      | TX_709 | Condo/Co-op   | McMullen      |
      | TX_710 | Condo/Co-op   | Medina        |
      | TX_711 | Condo/Co-op   | Menard        |
      | TX_712 | Condo/Co-op   | Midland       |
      | TX_713 | Condo/Co-op   | Milam         |
      | TX_714 | Condo/Co-op   | Mills         |
      | TX_715 | Condo/Co-op   | Mitchell      |
      | TX_716 | Condo/Co-op   | Montague      |
      | TX_717 | Condo/Co-op   | Montgomery    |
      | TX_718 | Condo/Co-op   | Moore         |
      | TX_719 | Condo/Co-op   | Morris        |
      | TX_720 | Condo/Co-op   | Motley        |
      | TX_721 | Condo/Co-op   | Nacogdoches   |
      | TX_722 | Condo/Co-op   | Navarro       |
      | TX_723 | Condo/Co-op   | Newton        |
      | TX_724 | Condo/Co-op   | Nolan         |
      | TX_725 | Condo/Co-op   | Nueces        |
      | TX_726 | Condo/Co-op   | Nueces        |
      | TX_727 | Condo/Co-op   | Nueces        |
      | TX_728 | Condo/Co-op   | Nueces        |
      | TX_729 | Condo/Co-op   | Nueces        |
      | TX_730 | Condo/Co-op   | Ochiltree     |
      | TX_731 | Condo/Co-op   | Oldham        |
      | TX_732 | Condo/Co-op   | Orange        |
      | TX_733 | Condo/Co-op   | Palo Pinto    |
      | TX_734 | Condo/Co-op   | Panola        |
      | TX_735 | Condo/Co-op   | Parker        |
      | TX_736 | Condo/Co-op   | Parmer        |
      | TX_737 | Condo/Co-op   | Pecos         |
      | TX_738 | Condo/Co-op   | Polk          |
      | TX_739 | Condo/Co-op   | Potter        |
      | TX_740 | Condo/Co-op   | Presidio      |
      | TX_741 | Condo/Co-op   | Rains         |
      | TX_742 | Condo/Co-op   | Randall       |
      | TX_743 | Condo/Co-op   | Reagan        |
      | TX_744 | Condo/Co-op   | Real          |
      | TX_745 | Condo/Co-op   | Red River     |
      | TX_746 | Condo/Co-op   | Reeves        |
      | TX_747 | Condo/Co-op   | Refugio       |
      | TX_748 | Condo/Co-op   | Refugio       |
      | TX_749 | Condo/Co-op   | Refugio       |
      | TX_750 | Condo/Co-op   | Refugio       |
      | TX_751 | Condo/Co-op   | Refugio       |
      | TX_752 | Condo/Co-op   | Roberts       |
      | TX_753 | Condo/Co-op   | Robertson     |
      | TX_754 | Condo/Co-op   | Rockwall      |
      | TX_755 | Condo/Co-op   | Runnels       |
      | TX_756 | Condo/Co-op   | Rusk          |
      | TX_757 | Condo/Co-op   | Sabine        |
      | TX_758 | Condo/Co-op   | San Augustine |
      | TX_759 | Condo/Co-op   | San Jacinto   |
      | TX_760 | Condo/Co-op   | San Patricio  |
      | TX_761 | Condo/Co-op   | San Patricio  |
      | TX_762 | Condo/Co-op   | San Patricio  |
      | TX_763 | Condo/Co-op   | San Patricio  |
      | TX_764 | Condo/Co-op   | San Patricio  |
      | TX_765 | Condo/Co-op   | San Saba      |
      | TX_766 | Condo/Co-op   | Schleicher    |
      | TX_767 | Condo/Co-op   | Scurry        |
      | TX_768 | Condo/Co-op   | Shackelford   |
      | TX_769 | Condo/Co-op   | Shelby        |
      | TX_770 | Condo/Co-op   | Sherman       |
      | TX_771 | Condo/Co-op   | Smith         |
      | TX_772 | Condo/Co-op   | Somervell     |
      | TX_773 | Condo/Co-op   | Starr         |
      | TX_774 | Condo/Co-op   | Stephens      |
      | TX_775 | Condo/Co-op   | Sterling      |
      | TX_776 | Condo/Co-op   | Stonewall     |
      | TX_777 | Condo/Co-op   | Sutton        |
      | TX_778 | Condo/Co-op   | Swisher       |
      | TX_779 | Condo/Co-op   | Tarrant       |
      | TX_780 | Condo/Co-op   | Taylor        |
      | TX_781 | Condo/Co-op   | Terrell       |
      | TX_782 | Condo/Co-op   | Terry         |
      | TX_783 | Condo/Co-op   | Throckmorton  |
      | TX_784 | Condo/Co-op   | Titus         |
      | TX_785 | Condo/Co-op   | Tom Green     |
      | TX_786 | Condo/Co-op   | Travis        |
      | TX_787 | Condo/Co-op   | Trinity       |
      | TX_788 | Condo/Co-op   | Tyler         |
      | TX_789 | Condo/Co-op   | Upshur        |
      | TX_790 | Condo/Co-op   | Upton         |
      | TX_791 | Condo/Co-op   | Uvalde        |
      | TX_792 | Condo/Co-op   | Val Verde     |
      | TX_793 | Condo/Co-op   | Van Zandt     |
      | TX_794 | Condo/Co-op   | Victoria      |
      | TX_795 | Condo/Co-op   | Victoria      |
      | TX_796 | Condo/Co-op   | Victoria      |
      | TX_797 | Condo/Co-op   | Victoria      |
      | TX_798 | Condo/Co-op   | Walker        |
      | TX_799 | Condo/Co-op   | Waller        |
      | TX_800 | Condo/Co-op   | Ward          |
      | TX_801 | Condo/Co-op   | Washington    |
      | TX_802 | Condo/Co-op   | Webb          |
      | TX_803 | Condo/Co-op   | Wharton       |
      | TX_804 | Condo/Co-op   | Wheeler       |
      | TX_805 | Condo/Co-op   | Wichita       |
      | TX_806 | Condo/Co-op   | Wilbarger     |
      | TX_807 | Condo/Co-op   | Willacy       |
      | TX_808 | Condo/Co-op   | Willacy       |
      | TX_809 | Condo/Co-op   | Willacy       |
      | TX_810 | Condo/Co-op   | Willacy       |
      | TX_811 | Condo/Co-op   | Willacy       |
      | TX_812 | Condo/Co-op   | Williamson    |
      | TX_813 | Condo/Co-op   | Wilson        |
      | TX_814 | Condo/Co-op   | Winkler       |
      | TX_815 | Condo/Co-op   | Wise          |
      | TX_816 | Condo/Co-op   | Wood          |
      | TX_817 | Condo/Co-op   | Yoakum        |
      | TX_818 | Condo/Co-op   | Young         |
      | TX_819 | Condo/Co-op   | Zapata        |
      | TX_820 | Condo/Co-op   | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_545 | Condo/Co-op   | Cameron   |
      | TX_620 | Condo/Co-op   | Hale      |
      | TX_739 | Condo/Co-op   | Potter    |
      | TX_685 | Condo/Co-op   | Lampasas  |
      | TX_701 | Condo/Co-op   | Matagorda |

  @CompareBaseRates @STG
  Scenario Outline: US45592 - I compare Accredited "<file1>" and PSE "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "PRE_PROD/US45592/"

    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_TX_001_750059157986.xlsx| PSE/Base_Rates_TX_001_750111866646.xlsx |
      | Accredited/Base_Rates_TX_002_750059155256.xlsx| PSE/Base_Rates_TX_002_750106237196.xlsx |
      | Accredited/Base_Rates_TX_003_750067237326.xlsx| PSE/Base_Rates_TX_003_750106240786.xlsx |
      | Accredited/Base_Rates_TX_009_750059160056.xlsx| PSE/Base_Rates_TX_009_750111870386.xlsx |
      | Accredited/Base_Rates_TX_010_750059156086.xlsx| PSE/Base_Rates_TX_010_750106235606.xlsx |
      | Accredited/Base_Rates_TX_011_750059158316.xlsx| PSE/Base_Rates_TX_011_750111866986.xlsx |
      | Accredited/Base_Rates_TX_012_750059159026.xlsx| PSE/Base_Rates_TX_012_750106240036.xlsx |
      | Accredited/Base_Rates_TX_013_750077395546.xlsx| PSE/Base_Rates_TX_013_750106264566.xlsx |
      | Accredited/Base_Rates_TX_014_750059155566.xlsx| PSE/Base_Rates_TX_014_750106332446.xlsx |
      | Accredited/Base_Rates_TX_015_750059192876.xlsx| PSE/Base_Rates_TX_015_750111868626.xlsx |
      | Accredited/Base_Rates_TX_016_750059217776.xlsx| PSE/Base_Rates_TX_016_750111867716.xlsx |
      | Accredited/Base_Rates_TX_017_750059217026.xlsx| PSE/Base_Rates_TX_017_750111864966.xlsx |
      | Accredited/Base_Rates_TX_018_750059378366.xlsx| PSE/Base_Rates_TX_018_750106534096.xlsx |
      | Accredited/Base_Rates_TX_019_750059379996.xlsx| PSE/Base_Rates_TX_019_750111865216.xlsx |
      | Accredited/Base_Rates_TX_020_750059382286.xlsx| PSE/Base_Rates_TX_020_750107698446.xlsx |
      | Accredited/Base_Rates_TX_021_750059384536.xlsx| PSE/Base_Rates_TX_021_750111864446.xlsx |
      | Accredited/Base_Rates_TX_022_750059385506.xlsx| PSE/Base_Rates_TX_022_750107723926.xlsx |
      | Accredited/Base_Rates_TX_023_750059387216.xlsx| PSE/Base_Rates_TX_023_750112066996.xlsx |
      | Accredited/Base_Rates_TX_025_750067238066.xlsx| PSE/Base_Rates_TX_025_750107727496.xlsx |
      | Accredited/Base_Rates_TX_030_750059457856.xlsx| PSE/Base_Rates_TX_030_750107725726.xlsx |
      | Accredited/Base_Rates_TX_031_750059498716.xlsx| PSE/Base_Rates_TX_031_750112069726.xlsx |
      | Accredited/Base_Rates_TX_032_750059501126.xlsx| PSE/Base_Rates_TX_032_750107732126.xlsx |
      | Accredited/Base_Rates_TX_033_750059504096.xlsx| PSE/Base_Rates_TX_033_750112068976.xlsx |
      | Accredited/Base_Rates_TX_034_750059942486.xlsx| PSE/Base_Rates_TX_034_750107792096.xlsx |
      | Accredited/Base_Rates_TX_035_750059980356.xlsx| PSE/Base_Rates_TX_035_750112067516.xlsx |
      | Accredited/Base_Rates_TX_036_750059989196.xlsx| PSE/Base_Rates_TX_036_750112068216.xlsx |
      | Accredited/Base_Rates_TX_037_750067236746.xlsx| PSE/Base_Rates_TX_037_750107906346.xlsx |
      | Accredited/Base_Rates_TX_043_750060003666.xlsx| PSE/Base_Rates_TX_043_750112070406.xlsx |
      | Accredited/Base_Rates_TX_050_750060131446.xlsx| PSE/Base_Rates_TX_050_750108005326.xlsx |
      | Accredited/Base_Rates_TX_052_750060160766.xlsx| PSE/Base_Rates_TX_052_750108011766.xlsx |
      | Accredited/Base_Rates_TX_058_750060165626.xlsx| PSE/Base_Rates_TX_058_750108028016.xlsx |
      | Accredited/Base_Rates_TX_059_750060175156.xlsx| PSE/Base_Rates_TX_059_750112065696.xlsx |
      | Accredited/Base_Rates_TX_060_750060203926.xlsx| PSE/Base_Rates_TX_060_750108057456.xlsx |
      | Accredited/Base_Rates_TX_061_750060205246.xlsx| PSE/Base_Rates_TX_061_750112070106.xlsx |
      | Accredited/Base_Rates_TX_062_750060376506.xlsx| PSE/Base_Rates_TX_062_750108060586.xlsx |
      | Accredited/Base_Rates_TX_063_750067257326.xlsx| PSE/Base_Rates_TX_063_750108077766.xlsx |
      | Accredited/Base_Rates_TX_064_750060388116.xlsx| PSE/Base_Rates_TX_064_750108103536.xlsx |
      | Accredited/Base_Rates_TX_065_750060391146.xlsx| PSE/Base_Rates_TX_065_750112526056.xlsx |
      | Accredited/Base_Rates_TX_067_750060654966.xlsx| PSE/Base_Rates_TX_067_750112525806.xlsx |
      | Accredited/Base_Rates_TX_068_750060655546.xlsx| PSE/Base_Rates_TX_068_750108159866.xlsx |
      | Accredited/Base_Rates_TX_070_750060729406.xlsx| PSE/Base_Rates_TX_070_750108195196.xlsx |
      | Accredited/Base_Rates_TX_071_750060760896.xlsx| PSE/Base_Rates_TX_071_750112526306.xlsx |
      | Accredited/Base_Rates_TX_072_750060763696.xlsx| PSE/Base_Rates_TX_072_750107359116.xlsx |
      | Accredited/Base_Rates_TX_073_750067281846.xlsx| PSE/Base_Rates_TX_073_750107358706.xlsx |
      | Accredited/Base_Rates_TX_074_750060857236.xlsx| PSE/Base_Rates_TX_074_750107357506.xlsx |
      | Accredited/Base_Rates_TX_075_750067338376.xlsx| PSE/Base_Rates_TX_075_750107359726.xlsx |
      | Accredited/Base_Rates_TX_076_750060897756.xlsx| PSE/Base_Rates_TX_076_750112527606.xlsx |
      | Accredited/Base_Rates_TX_077_750060904416.xlsx| PSE/Base_Rates_TX_077_750112528606.xlsx |
      | Accredited/Base_Rates_TX_078_750060989906.xlsx| PSE/Base_Rates_TX_078_750107357756.xlsx |
      | Accredited/Base_Rates_TX_079_750061017086.xlsx| PSE/Base_Rates_TX_079_750112528696.xlsx |
      | Accredited/Base_Rates_TX_080_750061016776.xlsx| PSE/Base_Rates_TX_080_750108221506.xlsx |
      | Accredited/Base_Rates_TX_082_750061075696.xlsx| PSE/Base_Rates_TX_082_750108236966.xlsx |
      | Accredited/Base_Rates_TX_083_750061138856.xlsx| PSE/Base_Rates_TX_083_750112525556.xlsx |
      | Accredited/Base_Rates_TX_084_750061147306.xlsx| PSE/Base_Rates_TX_084_750108240046.xlsx |
      | Accredited/Base_Rates_TX_085_750068049816.xlsx| PSE/Base_Rates_TX_085_750108248116.xlsx |
      | Accredited/Base_Rates_TX_087_750068066636.xlsx| PSE/Base_Rates_TX_087_750108275926.xlsx |
      | Accredited/Base_Rates_TX_088_750068156226.xlsx| PSE/Base_Rates_TX_088_750108288876.xlsx |
      | Accredited/Base_Rates_TX_089_750068126236.xlsx| PSE/Base_Rates_TX_089_750108315966.xlsx |
      | Accredited/Base_Rates_TX_090_750068161526.xlsx| PSE/Base_Rates_TX_090_750108320196.xlsx |
      | Accredited/Base_Rates_TX_092_750069112846.xlsx| PSE/Base_Rates_TX_092_750108367386.xlsx |
      | Accredited/Base_Rates_TX_093_750069573806.xlsx| PSE/Base_Rates_TX_093_750108369196.xlsx |
      | Accredited/Base_Rates_TX_094_750069586576.xlsx| PSE/Base_Rates_TX_094_750108386096.xlsx |
      | Accredited/Base_Rates_TX_095_750070843416.xlsx| PSE/Base_Rates_TX_095_750108389526.xlsx |
      | Accredited/Base_Rates_TX_097_750070997706.xlsx| PSE/Base_Rates_TX_097_750108427146.xlsx |
      | Accredited/Base_Rates_TX_098_750071010646.xlsx| PSE/Base_Rates_TX_098_750108447746.xlsx |
      | Accredited/Base_Rates_TX_099_750071018506.xlsx| PSE/Base_Rates_TX_099_750108450706.xlsx |
      | Accredited/Base_Rates_TX_100_750071778786.xlsx| PSE/Base_Rates_TX_100_750108506946.xlsx |
      | Accredited/Base_Rates_TX_102_750072134936.xlsx| PSE/Base_Rates_TX_102_750108557186.xlsx |
      | Accredited/Base_Rates_TX_103_750072159326.xlsx| PSE/Base_Rates_TX_103_750108574806.xlsx |
      | Accredited/Base_Rates_TX_104_750072580756.xlsx| PSE/Base_Rates_TX_104_750108580876.xlsx |
      | Accredited/Base_Rates_TX_105_750105606546.xlsx| PSE/Base_Rates_TX_105_750108596806.xlsx |
      | Accredited/Base_Rates_TX_110_750073206676.xlsx| PSE/Base_Rates_TX_110_750108619536.xlsx |
      | Accredited/Base_Rates_TX_112_750078384376.xlsx| PSE/Base_Rates_TX_112_750108640096.xlsx |
      | Accredited/Base_Rates_TX_113_750073409546.xlsx| PSE/Base_Rates_TX_113_750108644626.xlsx |
      | Accredited/Base_Rates_TX_114_750073516926.xlsx| PSE/Base_Rates_TX_114_750108679716.xlsx |
      | Accredited/Base_Rates_TX_115_750073531006.xlsx| PSE/Base_Rates_TX_115_750108686246.xlsx |
      | Accredited/Base_Rates_TX_117_750073637486.xlsx| PSE/Base_Rates_TX_117_750108701596.xlsx |
      | Accredited/Base_Rates_TX_118_750073640786.xlsx| PSE/Base_Rates_TX_118_750108706526.xlsx |
      | Accredited/Base_Rates_TX_119_750073768126.xlsx| PSE/Base_Rates_TX_119_750108723556.xlsx |
      | Accredited/Base_Rates_TX_120_750073788046.xlsx| PSE/Base_Rates_TX_120_750108745576.xlsx |
      | Accredited/Base_Rates_TX_122_750074106036.xlsx| PSE/Base_Rates_TX_122_750108818246.xlsx |
      | Accredited/Base_Rates_TX_123_750074167036.xlsx| PSE/Base_Rates_TX_123_750108863166.xlsx |
      | Accredited/Base_Rates_TX_124_750074212656.xlsx| PSE/Base_Rates_TX_124_750108867586.xlsx |
      | Accredited/Base_Rates_TX_125_750074215406.xlsx| PSE/Base_Rates_TX_125_750108874576.xlsx |
      | Accredited/Base_Rates_TX_130_750074280656.xlsx| PSE/Base_Rates_TX_130_750108893936.xlsx |
      | Accredited/Base_Rates_TX_132_750074376446.xlsx| PSE/Base_Rates_TX_132_750108912746.xlsx |
      | Accredited/Base_Rates_TX_133_750074403366.xlsx| PSE/Base_Rates_TX_133_750108931366.xlsx |
      | Accredited/Base_Rates_TX_134_750078572086.xlsx| PSE/Base_Rates_TX_134_750108942696.xlsx |
      | Accredited/Base_Rates_TX_135_750078577146.xlsx| PSE/Base_Rates_TX_135_750108950086.xlsx |
      | Accredited/Base_Rates_TX_137_750078688276.xlsx| PSE/Base_Rates_TX_137_750109009536.xlsx |
      | Accredited/Base_Rates_TX_138_750078733286.xlsx| PSE/Base_Rates_TX_138_750109025336.xlsx |
      | Accredited/Base_Rates_TX_139_750078777186.xlsx| PSE/Base_Rates_TX_139_750109047626.xlsx |
      | Accredited/Base_Rates_TX_140_750078866516.xlsx| PSE/Base_Rates_TX_140_750109058516.xlsx |
      | Accredited/Base_Rates_TX_142_750080443126.xlsx| PSE/Base_Rates_TX_142_750109773516.xlsx |
      | Accredited/Base_Rates_TX_143_750080445086.xlsx| PSE/Base_Rates_TX_143_750110282746.xlsx |
      | Accredited/Base_Rates_TX_144_750080446396.xlsx| PSE/Base_Rates_TX_144_750110295746.xlsx |
      | Accredited/Base_Rates_TX_145_750080444836.xlsx| PSE/Base_Rates_TX_145_750110302036.xlsx |
      | Accredited/Base_Rates_TX_147_750080441826.xlsx| PSE/Base_Rates_TX_147_750110365446.xlsx |
      | Accredited/Base_Rates_TX_152_750080657886.xlsx| PSE/Base_Rates_TX_152_750110400726.xlsx |
      | Accredited/Base_Rates_TX_153_750080657576.xlsx| PSE/Base_Rates_TX_153_750110407696.xlsx |
      | Accredited/Base_Rates_TX_157_750080742256.xlsx| PSE/Base_Rates_TX_157_750110419616.xlsx |
      | Accredited/Base_Rates_TX_159_750081167136.xlsx| PSE/Base_Rates_TX_159_750110535766.xlsx |
      | Accredited/Base_Rates_TX_160_750081173536.xlsx| PSE/Base_Rates_TX_160_750110576506.xlsx |
      | Accredited/Base_Rates_TX_162_750081177456.xlsx| PSE/Base_Rates_TX_162_750110586576.xlsx |
      | Accredited/Base_Rates_TX_663_750081906786.xlsx| PSE/Base_Rates_TX_663_750097694456.xlsx |
      | Accredited/Base_Rates_TX_664_750081903866.xlsx| PSE/Base_Rates_TX_664_750097690076.xlsx |
      | Accredited/Base_Rates_TX_665_750081904316.xlsx| PSE/Base_Rates_TX_665_750097691306.xlsx |
      | Accredited/Base_Rates_TX_670_750097387716.xlsx| PSE/Base_Rates_TX_670_750097692126.xlsx |
      | Accredited/Base_Rates_TX_671_750090670436.xlsx| PSE/Base_Rates_TX_671_750097691556.xlsx |
      | Accredited/Base_Rates_TX_672_750081908236.xlsx| PSE/Base_Rates_TX_672_750097689826.xlsx |
      | Accredited/Base_Rates_TX_673_750081903496.xlsx| PSE/Base_Rates_TX_673_750097689576.xlsx |
      | Accredited/Base_Rates_TX_674_750081906126.xlsx| PSE/Base_Rates_TX_674_750097691896.xlsx |
      | Accredited/Base_Rates_TX_675_750082157546.xlsx| PSE/Base_Rates_TX_675_750098006756.xlsx |
      | Accredited/Base_Rates_TX_676_750097392946.xlsx| PSE/Base_Rates_TX_676_750098006196.xlsx |
      | Accredited/Base_Rates_TX_681_750090675216.xlsx| PSE/Base_Rates_TX_681_750098010456.xlsx |
      | Accredited/Base_Rates_TX_682_750082677456.xlsx| PSE/Base_Rates_TX_682_750098010786.xlsx |
      | Accredited/Base_Rates_TX_683_750082682436.xlsx| PSE/Base_Rates_TX_683_750098009576.xlsx |
      | Accredited/Base_Rates_TX_684_750082684846.xlsx| PSE/Base_Rates_TX_684_750098015246.xlsx |
      | Accredited/Base_Rates_TX_685_750082683536.xlsx| PSE/Base_Rates_TX_685_750098013726.xlsx |
      | Accredited/Base_Rates_TX_686_750090676656.xlsx| PSE/Base_Rates_TX_686_750098017616.xlsx |
      | Accredited/Base_Rates_TX_687_750082686906.xlsx| PSE/Base_Rates_TX_687_750098171726.xlsx |
      | Accredited/Base_Rates_TX_688_750082691156.xlsx| PSE/Base_Rates_TX_688_750098176726.xlsx |
      | Accredited/Base_Rates_TX_689_750091608266.xlsx| PSE/Base_Rates_TX_689_750098177656.xlsx |
      | Accredited/Base_Rates_TX_690_750082883416.xlsx| PSE/Base_Rates_TX_690_750098181096.xlsx |
      | Accredited/Base_Rates_TX_691_750090671006.xlsx| PSE/Base_Rates_TX_691_750098179836.xlsx |
      | Accredited/Base_Rates_TX_692_750083044766.xlsx| PSE/Base_Rates_TX_692_750098180386.xlsx |
      | Accredited/Base_Rates_TX_693_750083219746.xlsx| PSE/Base_Rates_TX_693_750098179096.xlsx |
      | Accredited/Base_Rates_TX_694_750083219226.xlsx| PSE/Base_Rates_TX_694_750104471786.xlsx |
      | Accredited/Base_Rates_TX_695_750083220706.xlsx| PSE/Base_Rates_TX_695_750098212636.xlsx |
      | Accredited/Base_Rates_TX_696_750090677776.xlsx| PSE/Base_Rates_TX_696_750098325966.xlsx |
      | Accredited/Base_Rates_TX_697_750083227096.xlsx| PSE/Base_Rates_TX_697_750098328276.xlsx |
      | Accredited/Base_Rates_TX_698_750083230266.xlsx| PSE/Base_Rates_TX_698_750098330246.xlsx |
      | Accredited/Base_Rates_TX_699_750083379956.xlsx| PSE/Base_Rates_TX_699_750098332356.xlsx |
      | Accredited/Base_Rates_TX_700_750083400926.xlsx| PSE/Base_Rates_TX_700_750098333116.xlsx |
      | Accredited/Base_Rates_TX_702_750097388176.xlsx| PSE/Base_Rates_TX_702_750098334006.xlsx |
      | Accredited/Base_Rates_TX_706_750090768606.xlsx| PSE/Base_Rates_TX_706_750098336086.xlsx |
      | Accredited/Base_Rates_TX_707_750090770146.xlsx| PSE/Base_Rates_TX_707_750098350136.xlsx |
      | Accredited/Base_Rates_TX_708_750083756896.xlsx| PSE/Base_Rates_TX_708_750098469686.xlsx |
      | Accredited/Base_Rates_TX_709_750083758746.xlsx| PSE/Base_Rates_TX_709_750098470806.xlsx |
      | Accredited/Base_Rates_TX_710_750083758226.xlsx| PSE/Base_Rates_TX_710_750098472346.xlsx |
      | Accredited/Base_Rates_TX_711_750090816156.xlsx| PSE/Base_Rates_TX_711_750098474086.xlsx |
      | Accredited/Base_Rates_TX_712_750083851816.xlsx| PSE/Base_Rates_TX_712_750098475496.xlsx |
      | Accredited/Base_Rates_TX_713_750083914326.xlsx| PSE/Base_Rates_TX_713_750098477176.xlsx |
      | Accredited/Base_Rates_TX_714_750083914076.xlsx| PSE/Base_Rates_TX_714_750098478496.xlsx |
      | Accredited/Base_Rates_TX_715_750083922986.xlsx| PSE/Base_Rates_TX_715_750098488276.xlsx |
      | Accredited/Base_Rates_TX_716_750091344136.xlsx| PSE/Base_Rates_TX_716_750098618676.xlsx |
      | Accredited/Base_Rates_TX_717_750084200386.xlsx| PSE/Base_Rates_TX_717_750098620016.xlsx |
      | Accredited/Base_Rates_TX_718_750084418036.xlsx| PSE/Base_Rates_TX_718_750098621546.xlsx |
      | Accredited/Base_Rates_TX_719_750084420976.xlsx| PSE/Base_Rates_TX_719_750098622616.xlsx |
      | Accredited/Base_Rates_TX_720_750084492816.xlsx| PSE/Base_Rates_TX_720_750098624026.xlsx |
      | Accredited/Base_Rates_TX_721_750091610396.xlsx| PSE/Base_Rates_TX_721_750098625586.xlsx |
      | Accredited/Base_Rates_TX_722_750084796146.xlsx| PSE/Base_Rates_TX_722_750103675116.xlsx |
      | Accredited/Base_Rates_TX_723_750084799006.xlsx| PSE/Base_Rates_TX_723_750098638516.xlsx |
      | Accredited/Base_Rates_TX_724_750084797476.xlsx| PSE/Base_Rates_TX_724_750098653966.xlsx |
      | Accredited/Base_Rates_TX_727_750097386616.xlsx| PSE/Base_Rates_TX_727_750098818926.xlsx |
      | Accredited/Base_Rates_TX_730_750091606166.xlsx| PSE/Base_Rates_TX_730_750098820726.xlsx |
      | Accredited/Base_Rates_TX_731_750091606886.xlsx| PSE/Base_Rates_TX_731_750098822316.xlsx |
      | Accredited/Base_Rates_TX_732_750091652276.xlsx| PSE/Base_Rates_TX_732_750098823266.xlsx |
      | Accredited/Base_Rates_TX_733_750091650796.xlsx| PSE/Base_Rates_TX_733_750098826276.xlsx |
      | Accredited/Base_Rates_TX_734_750091651516.xlsx| PSE/Base_Rates_TX_734_750098827906.xlsx |
      | Accredited/Base_Rates_TX_735_750091656976.xlsx| PSE/Base_Rates_TX_735_750098861366.xlsx |
      | Accredited/Base_Rates_TX_736_750091905476.xlsx| PSE/Base_Rates_TX_736_750098879616.xlsx |
      | Accredited/Base_Rates_TX_737_750091959636.xlsx| PSE/Base_Rates_TX_737_750100163846.xlsx |
      | Accredited/Base_Rates_TX_738_750091965926.xlsx| PSE/Base_Rates_TX_738_750100165946.xlsx |
      | Accredited/Base_Rates_TX_739_750091966946.xlsx| PSE/Base_Rates_TX_739_750100168576.xlsx |
      | Accredited/Base_Rates_TX_740_750096059736.xlsx| PSE/Base_Rates_TX_740_750100172906.xlsx |
      | Accredited/Base_Rates_TX_741_750093244036.xlsx| PSE/Base_Rates_TX_741_750100176306.xlsx |
      | Accredited/Base_Rates_TX_742_750093242336.xlsx| PSE/Base_Rates_TX_742_750100177756.xlsx |
      | Accredited/Base_Rates_TX_743_750093240196.xlsx| PSE/Base_Rates_TX_743_750100201056.xlsx |
      | Accredited/Base_Rates_TX_744_750093249146.xlsx| PSE/Base_Rates_TX_744_750100222366.xlsx |
      | Accredited/Base_Rates_TX_745_750093248316.xlsx| PSE/Base_Rates_TX_745_750100455316.xlsx |
      | Accredited/Base_Rates_TX_746_750093338096.xlsx| PSE/Base_Rates_TX_746_750100456566.xlsx |
      | Accredited/Base_Rates_TX_750_750097385896.xlsx| PSE/Base_Rates_TX_750_750100459186.xlsx |
      | Accredited/Base_Rates_TX_752_750093341126.xlsx| PSE/Base_Rates_TX_752_750100460566.xlsx |
      | Accredited/Base_Rates_TX_753_750093625486.xlsx| PSE/Base_Rates_TX_753_750100462706.xlsx |
      | Accredited/Base_Rates_TX_754_750092391626.xlsx| PSE/Base_Rates_TX_754_750100464076.xlsx |
      | Accredited/Base_Rates_TX_755_750092391826.xlsx| PSE/Base_Rates_TX_755_750100614036.xlsx |
      | Accredited/Base_Rates_TX_756_750093809326.xlsx| PSE/Base_Rates_TX_756_750100630066.xlsx |
      | Accredited/Base_Rates_TX_757_750092391076.xlsx| PSE/Base_Rates_TX_757_750100819416.xlsx |
      | Accredited/Base_Rates_TX_758_750092391376.xlsx| PSE/Base_Rates_TX_758_750103672956.xlsx |
      | Accredited/Base_Rates_TX_759_750092394816.xlsx| PSE/Base_Rates_TX_759_750103673046.xlsx |
      | Accredited/Base_Rates_TX_764_750092395436.xlsx| PSE/Base_Rates_TX_764_750100823696.xlsx |
      | Accredited/Base_Rates_TX_765_750092413826.xlsx| PSE/Base_Rates_TX_765_750100825536.xlsx |
      | Accredited/Base_Rates_TX_766_750092497046.xlsx| PSE/Base_Rates_TX_766_750100826516.xlsx |
      | Accredited/Base_Rates_TX_767_750096056746.xlsx| PSE/Base_Rates_TX_767_750100827456.xlsx |
      | Accredited/Base_Rates_TX_768_750092546286.xlsx| PSE/Base_Rates_TX_768_750100830606.xlsx |
      | Accredited/Base_Rates_TX_769_750092545206.xlsx| PSE/Base_Rates_TX_769_750100841946.xlsx |
      | Accredited/Base_Rates_TX_770_750093812136.xlsx| PSE/Base_Rates_TX_770_750103674686.xlsx |
      | Accredited/Base_Rates_TX_771_750093813296.xlsx| PSE/Base_Rates_TX_771_750101592096.xlsx |
      | Accredited/Base_Rates_TX_772_750092550056.xlsx| PSE/Base_Rates_TX_772_750101696586.xlsx |
      | Accredited/Base_Rates_TX_773_750092561306.xlsx| PSE/Base_Rates_TX_773_750101701516.xlsx |
      | Accredited/Base_Rates_TX_774_750092563636.xlsx| PSE/Base_Rates_TX_774_750101704836.xlsx |
      | Accredited/Base_Rates_TX_775_750092594496.xlsx| PSE/Base_Rates_TX_775_750101705596.xlsx |
      | Accredited/Base_Rates_TX_776_750092603046.xlsx| PSE/Base_Rates_TX_776_750101708626.xlsx |
      | Accredited/Base_Rates_TX_777_750093814856.xlsx| PSE/Base_Rates_TX_777_750101709946.xlsx |
      | Accredited/Base_Rates_TX_778_750093933966.xlsx| PSE/Base_Rates_TX_778_750101724406.xlsx |
      | Accredited/Base_Rates_TX_779_750093935526.xlsx| PSE/Base_Rates_TX_779_750102662426.xlsx |
      | Accredited/Base_Rates_TX_780_750093938056.xlsx| PSE/Base_Rates_TX_780_750102831776.xlsx |
      | Accredited/Base_Rates_TX_781_750094106596.xlsx| PSE/Base_Rates_TX_781_750102837056.xlsx |
      | Accredited/Base_Rates_TX_782_750094191956.xlsx| PSE/Base_Rates_TX_782_750102839106.xlsx |
      | Accredited/Base_Rates_TX_783_750094197686.xlsx| PSE/Base_Rates_TX_783_750102841576.xlsx |
      | Accredited/Base_Rates_TX_784_750094201806.xlsx| PSE/Base_Rates_TX_784_750102843176.xlsx |
      | Accredited/Base_Rates_TX_785_750094203006.xlsx| PSE/Base_Rates_TX_785_750102844006.xlsx |
      | Accredited/Base_Rates_TX_786_750094467806.xlsx| PSE/Base_Rates_TX_786_750102858096.xlsx |
      | Accredited/Base_Rates_TX_787_750094468326.xlsx| PSE/Base_Rates_TX_787_750102967146.xlsx |
      | Accredited/Base_Rates_TX_788_750094470616.xlsx| PSE/Base_Rates_TX_788_750103047876.xlsx |
      | Accredited/Base_Rates_TX_789_750094681756.xlsx| PSE/Base_Rates_TX_789_750103058996.xlsx |
      | Accredited/Base_Rates_TX_790_750094869256.xlsx| PSE/Base_Rates_TX_790_750103060736.xlsx |
      | Accredited/Base_Rates_TX_791_750094871816.xlsx| PSE/Base_Rates_TX_791_750103065126.xlsx |
      | Accredited/Base_Rates_TX_792_750094879146.xlsx| PSE/Base_Rates_TX_792_750103069396.xlsx |
      | Accredited/Base_Rates_TX_793_750094876446.xlsx| PSE/Base_Rates_TX_793_750103068466.xlsx |
      | Accredited/Base_Rates_TX_794_750097387376.xlsx| PSE/Base_Rates_TX_794_750103133256.xlsx |
      | Accredited/Base_Rates_TX_799_750094973016.xlsx| PSE/Base_Rates_TX_799_750103221436.xlsx |
      | Accredited/Base_Rates_TX_800_750094975266.xlsx| PSE/Base_Rates_TX_800_750103676666.xlsx |
      | Accredited/Base_Rates_TX_801_750095019656.xlsx| PSE/Base_Rates_TX_801_750103673356.xlsx |
      | Accredited/Base_Rates_TX_802_750095065896.xlsx| PSE/Base_Rates_TX_802_750103674176.xlsx |
      | Accredited/Base_Rates_TX_803_750096107246.xlsx| PSE/Base_Rates_TX_803_750104472706.xlsx |
      | Accredited/Base_Rates_TX_804_750096343196.xlsx| PSE/Base_Rates_TX_804_750104474636.xlsx |
      | Accredited/Base_Rates_TX_805_750096341926.xlsx| PSE/Base_Rates_TX_805_750104471086.xlsx |
      | Accredited/Base_Rates_TX_806_750096345516.xlsx| PSE/Base_Rates_TX_806_750104469556.xlsx |
      | Accredited/Base_Rates_TX_809_750096346226.xlsx| PSE/Base_Rates_TX_809_750104476886.xlsx |
      | Accredited/Base_Rates_TX_812_750096346496.xlsx| PSE/Base_Rates_TX_812_750104477586.xlsx |
      | Accredited/Base_Rates_TX_813_750097388896.xlsx| PSE/Base_Rates_TX_813_750104470086.xlsx |
      | Accredited/Base_Rates_TX_814_750092941656.xlsx| PSE/Base_Rates_TX_814_750104850766.xlsx |
      | Accredited/Base_Rates_TX_815_750092942476.xlsx| PSE/Base_Rates_TX_815_750104855276.xlsx |
      | Accredited/Base_Rates_TX_816_750092943116.xlsx| PSE/Base_Rates_TX_816_750104851866.xlsx |
      | Accredited/Base_Rates_TX_817_750092941906.xlsx| PSE/Base_Rates_TX_817_750104853656.xlsx |
      | Accredited/Base_Rates_TX_818_750092941566.xlsx| PSE/Base_Rates_TX_818_750104853906.xlsx |
      | Accredited/Base_Rates_TX_819_750092943296.xlsx| PSE/Base_Rates_TX_819_750104858036.xlsx |
      | Accredited/Base_Rates_TX_820_750092942156.xlsx| PSE/Base_Rates_TX_820_750104859266.xlsx |

    @E2E_PSECompare
    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_TX_002_750593021416.xlsx | PSE/Base_Rates_TX_002_750593022076.xlsx |
      | Accredited/Base_Rates_TX_003_750593019796.xlsx | PSE/Base_Rates_TX_003_750593068486.xlsx |
      | Accredited/Base_Rates_TX_010_750599421336.xlsx | PSE/Base_Rates_TX_010_750599848316.xlsx |
      | Accredited/Base_Rates_TX_075_750598926336.xlsx | PSE/Base_Rates_TX_075_750598811236.xlsx |
      | Accredited/Base_Rates_TX_120_750593019036.xlsx | PSE/Base_Rates_TX_120_750592433646.xlsx |
      | Accredited/Base_Rates_TX_545_750592247876.xlsx | PSE/Base_Rates_TX_545_750593084976.xlsx |
      | Accredited/Base_Rates_TX_620_750592247146.xlsx | PSE/Base_Rates_TX_620_750593085936.xlsx |
      | Accredited/Base_Rates_TX_685_750592279476.xlsx | PSE/Base_Rates_TX_685_750593319596.xlsx |
      | Accredited/Base_Rates_TX_701_750592246426.xlsx | PSE/Base_Rates_TX_701_750593320996.xlsx |
      | Accredited/Base_Rates_TX_739_750592250176.xlsx | PSE/Base_Rates_TX_739_750593087716.xlsx |

  @Accredited @PreProd
  Scenario Outline: US45592 - Get Base Rates for Accredited TX - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for Accredited TX condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45592" in sheet "QuoteCreatorHS" for "HS" LOB
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

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45592/Accredited" in "Base_Rates" excel file for "New Business"

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

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45592/Accredited" in "Base_Rates" excel file for "Endorsement"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_001 | Homeowner     | Anderson      |
      | TX_002 | Homeowner     | Andrews       |
      | TX_003 | Homeowner     | Angelina      |
      | TX_004 | Homeowner     | Aransas       |
      | TX_005 | Homeowner     | Aransas       |
      | TX_006 | Homeowner     | Aransas       |
      | TX_007 | Homeowner     | Aransas       |
      | TX_008 | Homeowner     | Aransas       |
      | TX_009 | Homeowner     | Archer        |
      | TX_010 | Homeowner     | Armstrong     |
      | TX_011 | Homeowner     | Atascosa      |
      | TX_012 | Homeowner     | Austin        |
      | TX_013 | Homeowner     | Bailey        |
      | TX_014 | Homeowner     | Bandera       |
      | TX_015 | Homeowner     | Bastrop       |
      | TX_016 | Homeowner     | Baylor        |
      | TX_017 | Homeowner     | Bee           |
      | TX_018 | Homeowner     | Bell          |
      | TX_019 | Homeowner     | Bexar         |
      | TX_020 | Homeowner     | Blanco        |
      | TX_021 | Homeowner     | Borden        |
      | TX_022 | Homeowner     | Bosque        |
      | TX_023 | Homeowner     | Bowie         |
      | TX_024 | Homeowner     | Brazoria      |
      | TX_025 | Homeowner     | Brazoria      |
      | TX_026 | Homeowner     | Brazoria      |
      | TX_027 | Homeowner     | Brazoria      |
      | TX_028 | Homeowner     | Brazoria      |
      | TX_029 | Homeowner     | Brazoria      |
      | TX_030 | Homeowner     | Brazos        |
      | TX_031 | Homeowner     | Brewster      |
      | TX_032 | Homeowner     | Briscoe       |
      | TX_033 | Homeowner     | Brooks        |
      | TX_034 | Homeowner     | Brown         |
      | TX_035 | Homeowner     | Burleson      |
      | TX_036 | Homeowner     | Burnet        |
      | TX_037 | Homeowner     | Caldwell      |
      | TX_038 | Homeowner     | Calhoun       |
      | TX_039 | Homeowner     | Calhoun       |
      | TX_040 | Homeowner     | Calhoun       |
      | TX_041 | Homeowner     | Calhoun       |
      | TX_042 | Homeowner     | Calhoun       |
      | TX_043 | Homeowner     | Callahan      |
      | TX_044 | Homeowner     | Cameron       |
      | TX_045 | Homeowner     | Cameron       |
      | TX_046 | Homeowner     | Cameron       |
      | TX_047 | Homeowner     | Cameron       |
      | TX_048 | Homeowner     | Cameron       |
      | TX_049 | Homeowner     | Camp          |
      | TX_050 | Homeowner     | Carson        |
      | TX_051 | Homeowner     | Cass          |
      | TX_052 | Homeowner     | Castro        |
      | TX_053 | Homeowner     | Chambers      |
      | TX_054 | Homeowner     | Chambers      |
      | TX_055 | Homeowner     | Chambers      |
      | TX_056 | Homeowner     | Chambers      |
      | TX_057 | Homeowner     | Chambers      |
      | TX_058 | Homeowner     | Cherokee      |
      | TX_059 | Homeowner     | Childress     |
      | TX_060 | Homeowner     | Clay          |
      | TX_061 | Homeowner     | Cochran       |
      | TX_062 | Homeowner     | Coke          |
      | TX_063 | Homeowner     | Coleman       |
      | TX_064 | Homeowner     | Collin        |
      | TX_065 | Homeowner     | Collingsworth |
      | TX_066 | Homeowner     | Colorado      |
      | TX_067 | Homeowner     | Comal         |
      | TX_068 | Homeowner     | Comanche      |
      | TX_069 | Homeowner     | Concho        |
      | TX_070 | Homeowner     | Cooke         |
      | TX_071 | Homeowner     | Coryell       |
      | TX_072 | Homeowner     | Cottle        |
      | TX_073 | Homeowner     | Crane         |
      | TX_074 | Homeowner     | Crockett      |
      | TX_075 | Homeowner     | Crosby        |
      | TX_076 | Homeowner     | Culberson     |
      | TX_077 | Homeowner     | Dallam        |
      | TX_078 | Homeowner     | Dallas        |
      | TX_079 | Homeowner     | Dawson        |
      | TX_080 | Homeowner     | De Witt       |
      | TX_081 | Homeowner     | Deaf Smith    |
      | TX_082 | Homeowner     | Delta         |
      | TX_083 | Homeowner     | Denton        |
      | TX_084 | Homeowner     | Dickens       |
      | TX_085 | Homeowner     | Dimmit        |
      | TX_086 | Homeowner     | Donley        |
      | TX_087 | Homeowner     | Duval         |
      | TX_088 | Homeowner     | Eastland      |
      | TX_089 | Homeowner     | Ector         |
      | TX_090 | Homeowner     | Edwards       |
      | TX_091 | Homeowner     | El Paso       |
      | TX_092 | Homeowner     | Ellis         |
      | TX_093 | Homeowner     | Erath         |
      | TX_094 | Homeowner     | Falls         |
      | TX_095 | Homeowner     | Fannin        |
      | TX_096 | Homeowner     | Fayette       |
      | TX_097 | Homeowner     | Fisher        |
      | TX_098 | Homeowner     | Floyd         |
      | TX_099 | Homeowner     | Foard         |
      | TX_100 | Homeowner     | Fort Bend     |
      | TX_101 | Homeowner     | Franklin      |
      | TX_102 | Homeowner     | Freestone     |
      | TX_103 | Homeowner     | Frio          |
      | TX_104 | Homeowner     | Gaines        |
      | TX_105 | Homeowner     | Galveston     |
      | TX_106 | Homeowner     | Galveston     |
      | TX_107 | Homeowner     | Galveston     |
      | TX_108 | Homeowner     | Galveston     |
      | TX_109 | Homeowner     | Galveston     |
      | TX_110 | Homeowner     | Garza         |
      | TX_111 | Homeowner     | Gillespie     |
      | TX_112 | Homeowner     | Glasscock     |
      | TX_113 | Homeowner     | Goliad        |
      | TX_114 | Homeowner     | Gonzales      |
      | TX_115 | Homeowner     | Gray          |
      | TX_116 | Homeowner     | Grayson       |
      | TX_117 | Homeowner     | Gregg         |
      | TX_118 | Homeowner     | Grimes        |
      | TX_119 | Homeowner     | Guadalupe     |
      | TX_120 | Homeowner     | Hale          |
      | TX_121 | Homeowner     | Hall          |
      | TX_122 | Homeowner     | Hamilton      |
      | TX_123 | Homeowner     | Hansford      |
      | TX_124 | Homeowner     | Hardeman      |
      | TX_125 | Homeowner     | Hardin        |
      | TX_126 | Homeowner     | Harris        |
      | TX_127 | Homeowner     | Harris        |
      | TX_128 | Homeowner     | Harris        |
      | TX_129 | Homeowner     | Harris        |
      | TX_130 | Homeowner     | Harrison      |
      | TX_131 | Homeowner     | Hartley       |
      | TX_132 | Homeowner     | Haskell       |
      | TX_133 | Homeowner     | Hays          |
      | TX_134 | Homeowner     | Hemphill      |
      | TX_135 | Homeowner     | Henderson     |
      | TX_136 | Homeowner     | Hidalgo       |
      | TX_137 | Homeowner     | Hill          |
      | TX_138 | Homeowner     | Hockley       |
      | TX_139 | Homeowner     | Hood          |
      | TX_140 | Homeowner     | Hopkins       |
      | TX_141 | Homeowner     | Houston       |
      | TX_142 | Homeowner     | Howard        |
      | TX_143 | Homeowner     | Hudspeth      |
      | TX_144 | Homeowner     | Hunt          |
      | TX_145 | Homeowner     | Hutchinson    |
      | TX_146 | Homeowner     | Irion         |
      | TX_147 | Homeowner     | Jack          |
      | TX_148 | Homeowner     | Jackson       |
      | TX_149 | Homeowner     | Jackson       |
      | TX_150 | Homeowner     | Jackson       |
      | TX_151 | Homeowner     | Jackson       |
      | TX_152 | Homeowner     | Jasper        |
      | TX_153 | Homeowner     | Jeff Davis    |
      | TX_154 | Homeowner     | Jefferson     |
      | TX_155 | Homeowner     | Jefferson     |
      | TX_156 | Homeowner     | Jefferson     |
      | TX_157 | Homeowner     | Jefferson     |
      | TX_158 | Homeowner     | Jefferson     |
      | TX_159 | Homeowner     | Jim Hogg      |
      | TX_160 | Homeowner     | Jim Wells     |
      | TX_161 | Homeowner     | Johnson       |
      | TX_162 | Homeowner     | Jones         |
      | TX_163 | Homeowner     | Karnes        |
      | TX_164 | Homeowner     | Kaufman       |
      | TX_165 | Homeowner     | Kendall       |
      | TX_166 | Homeowner     | Kenedy        |
      | TX_167 | Homeowner     | Kenedy        |
      | TX_168 | Homeowner     | Kenedy        |
      | TX_169 | Homeowner     | Kenedy        |
      | TX_170 | Homeowner     | Kenedy        |
      | TX_171 | Homeowner     | Kent          |
      | TX_172 | Homeowner     | Kerr          |
      | TX_173 | Homeowner     | Kimble        |
      | TX_174 | Homeowner     | King          |
      | TX_175 | Homeowner     | Kinney        |
      | TX_176 | Homeowner     | Kleberg       |
      | TX_177 | Homeowner     | Kleberg       |
      | TX_178 | Homeowner     | Kleberg       |
      | TX_179 | Homeowner     | Kleberg       |
      | TX_180 | Homeowner     | Kleberg       |
      | TX_181 | Homeowner     | Knox          |
      | TX_182 | Homeowner     | La Salle      |
      | TX_183 | Homeowner     | Lamar         |
      | TX_184 | Homeowner     | Lamb          |
      | TX_185 | Homeowner     | Lampasas      |
      | TX_186 | Homeowner     | Lavaca        |
      | TX_187 | Homeowner     | Lee           |
      | TX_188 | Homeowner     | Leon          |
      | TX_189 | Homeowner     | Liberty       |
      | TX_190 | Homeowner     | Limestone     |
      | TX_191 | Homeowner     | Lipscomb      |
      | TX_192 | Homeowner     | Live Oak      |
      | TX_193 | Homeowner     | Llano         |
      | TX_194 | Homeowner     | Loving        |
      | TX_195 | Homeowner     | Lubbock       |
      | TX_196 | Homeowner     | Lynn          |
      | TX_197 | Homeowner     | Madison       |
      | TX_198 | Homeowner     | Marion        |
      | TX_199 | Homeowner     | Martin        |
      | TX_200 | Homeowner     | Mason         |
      | TX_201 | Homeowner     | Matagorda     |
      | TX_202 | Homeowner     | Matagorda     |
      | TX_203 | Homeowner     | Matagorda     |
      | TX_204 | Homeowner     | Matagorda     |
      | TX_205 | Homeowner     | Matagorda     |
      | TX_206 | Homeowner     | Maverick      |
      | TX_207 | Homeowner     | McCulloch     |
      | TX_208 | Homeowner     | McLennan      |
      | TX_209 | Homeowner     | McMullen      |
      | TX_210 | Homeowner     | Medina        |
      | TX_211 | Homeowner     | Menard        |
      | TX_212 | Homeowner     | Midland       |
      | TX_213 | Homeowner     | Milam         |
      | TX_214 | Homeowner     | Mills         |
      | TX_215 | Homeowner     | Mitchell      |
      | TX_216 | Homeowner     | Montague      |
      | TX_217 | Homeowner     | Montgomery    |
      | TX_218 | Homeowner     | Moore         |
      | TX_219 | Homeowner     | Morris        |
      | TX_220 | Homeowner     | Motley        |
      | TX_221 | Homeowner     | Nacogdoches   |
      | TX_222 | Homeowner     | Navarro       |
      | TX_223 | Homeowner     | Newton        |
      | TX_224 | Homeowner     | Nolan         |
      | TX_225 | Homeowner     | Nueces        |
      | TX_226 | Homeowner     | Nueces        |
      | TX_227 | Homeowner     | Nueces        |
      | TX_228 | Homeowner     | Nueces        |
      | TX_229 | Homeowner     | Nueces        |
      | TX_230 | Homeowner     | Ochiltree     |
      | TX_231 | Homeowner     | Oldham        |
      | TX_232 | Homeowner     | Orange        |
      | TX_233 | Homeowner     | Palo Pinto    |
      | TX_234 | Homeowner     | Panola        |
      | TX_235 | Homeowner     | Parker        |
      | TX_236 | Homeowner     | Parmer        |
      | TX_237 | Homeowner     | Pecos         |
      | TX_238 | Homeowner     | Polk          |
      | TX_239 | Homeowner     | Potter        |
      | TX_240 | Homeowner     | Presidio      |
      | TX_241 | Homeowner     | Rains         |
      | TX_242 | Homeowner     | Randall       |
      | TX_243 | Homeowner     | Reagan        |
      | TX_244 | Homeowner     | Real          |
      | TX_245 | Homeowner     | Red River     |
      | TX_246 | Homeowner     | Reeves        |
      | TX_247 | Homeowner     | Refugio       |
      | TX_248 | Homeowner     | Refugio       |
      | TX_249 | Homeowner     | Refugio       |
      | TX_250 | Homeowner     | Refugio       |
      | TX_251 | Homeowner     | Refugio       |
      | TX_252 | Homeowner     | Roberts       |
      | TX_253 | Homeowner     | Robertson     |
      | TX_254 | Homeowner     | Rockwall      |
      | TX_255 | Homeowner     | Runnels       |
      | TX_256 | Homeowner     | Rusk          |
      | TX_257 | Homeowner     | Sabine        |
      | TX_258 | Homeowner     | San Augustine |
      | TX_259 | Homeowner     | San Jacinto   |
      | TX_260 | Homeowner     | San Patricio  |
      | TX_261 | Homeowner     | San Patricio  |
      | TX_262 | Homeowner     | San Patricio  |
      | TX_263 | Homeowner     | San Patricio  |
      | TX_264 | Homeowner     | San Patricio  |
      | TX_265 | Homeowner     | San Saba      |
      | TX_266 | Homeowner     | Schleicher    |
      | TX_267 | Homeowner     | Scurry        |
      | TX_268 | Homeowner     | Shackelford   |
      | TX_269 | Homeowner     | Shelby        |
      | TX_270 | Homeowner     | Sherman       |
      | TX_271 | Homeowner     | Smith         |
      | TX_272 | Homeowner     | Somervell     |
      | TX_273 | Homeowner     | Starr         |
      | TX_274 | Homeowner     | Stephens      |
      | TX_275 | Homeowner     | Sterling      |
      | TX_276 | Homeowner     | Stonewall     |
      | TX_277 | Homeowner     | Sutton        |
      | TX_278 | Homeowner     | Swisher       |
      | TX_279 | Homeowner     | Tarrant       |
      | TX_280 | Homeowner     | Taylor        |
      | TX_281 | Homeowner     | Terrell       |
      | TX_282 | Homeowner     | Terry         |
      | TX_283 | Homeowner     | Throckmorton  |
      | TX_284 | Homeowner     | Titus         |
      | TX_285 | Homeowner     | Tom Green     |
      | TX_286 | Homeowner     | Travis        |
      | TX_287 | Homeowner     | Trinity       |
      | TX_288 | Homeowner     | Tyler         |
      | TX_289 | Homeowner     | Upshur        |
      | TX_290 | Homeowner     | Upton         |
      | TX_291 | Homeowner     | Uvalde        |
      | TX_292 | Homeowner     | Val Verde     |
      | TX_293 | Homeowner     | Van Zandt     |
      | TX_294 | Homeowner     | Victoria      |
      | TX_295 | Homeowner     | Victoria      |
      | TX_296 | Homeowner     | Victoria      |
      | TX_297 | Homeowner     | Victoria      |
      | TX_298 | Homeowner     | Walker        |
      | TX_299 | Homeowner     | Waller        |
      | TX_300 | Homeowner     | Ward          |
      | TX_301 | Homeowner     | Washington    |
      | TX_302 | Homeowner     | Webb          |
      | TX_303 | Homeowner     | Wharton       |
      | TX_304 | Homeowner     | Wheeler       |
      | TX_305 | Homeowner     | Wichita       |
      | TX_306 | Homeowner     | Wilbarger     |
      | TX_307 | Homeowner     | Willacy       |
      | TX_308 | Homeowner     | Willacy       |
      | TX_309 | Homeowner     | Willacy       |
      | TX_310 | Homeowner     | Willacy       |
      | TX_311 | Homeowner     | Willacy       |
      | TX_312 | Homeowner     | Williamson    |
      | TX_313 | Homeowner     | Wilson        |
      | TX_314 | Homeowner     | Winkler       |
      | TX_315 | Homeowner     | Wise          |
      | TX_316 | Homeowner     | Wood          |
      | TX_317 | Homeowner     | Yoakum        |
      | TX_318 | Homeowner     | Young         |
      | TX_319 | Homeowner     | Zapata        |
      | TX_320 | Homeowner     | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_120 | Homeowner     | Hale      |
      | TX_002 | Homeowner     | Andrews   |
      | TX_003 | Homeowner     | Angelina  |
      | TX_075 | Homeowner     | Crosby    |
      | TX_010 | Homeowner     | Armstrong |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_501 | Condo/Co-op   | Anderson      |
      | TX_502 | Condo/Co-op   | Andrews       |
      | TX_503 | Condo/Co-op   | Angelina      |
      | TX_504 | Condo/Co-op   | Aransas       |
      | TX_505 | Condo/Co-op   | Aransas       |
      | TX_506 | Condo/Co-op   | Aransas       |
      | TX_507 | Condo/Co-op   | Aransas       |
      | TX_508 | Condo/Co-op   | Aransas       |
      | TX_509 | Condo/Co-op   | Archer        |
      | TX_510 | Condo/Co-op   | Armstrong     |
      | TX_511 | Condo/Co-op   | Atascosa      |
      | TX_512 | Condo/Co-op   | Austin        |
      | TX_513 | Condo/Co-op   | Bailey        |
      | TX_514 | Condo/Co-op   | Bandera       |
      | TX_515 | Condo/Co-op   | Bastrop       |
      | TX_516 | Condo/Co-op   | Baylor        |
      | TX_517 | Condo/Co-op   | Bee           |
      | TX_518 | Condo/Co-op   | Bell          |
      | TX_519 | Condo/Co-op   | Bexar         |
      | TX_520 | Condo/Co-op   | Blanco        |
      | TX_521 | Condo/Co-op   | Borden        |
      | TX_522 | Condo/Co-op   | Bosque        |
      | TX_523 | Condo/Co-op   | Bowie         |
      | TX_524 | Condo/Co-op   | Brazoria      |
      | TX_525 | Condo/Co-op   | Brazoria      |
      | TX_526 | Condo/Co-op   | Brazoria      |
      | TX_527 | Condo/Co-op   | Brazoria      |
      | TX_528 | Condo/Co-op   | Brazoria      |
      | TX_529 | Condo/Co-op   | Brazoria      |
      | TX_530 | Condo/Co-op   | Brazos        |
      | TX_531 | Condo/Co-op   | Brewster      |
      | TX_532 | Condo/Co-op   | Briscoe       |
      | TX_533 | Condo/Co-op   | Brooks        |
      | TX_534 | Condo/Co-op   | Brown         |
      | TX_535 | Condo/Co-op   | Burleson      |
      | TX_536 | Condo/Co-op   | Burnet        |
      | TX_537 | Condo/Co-op   | Caldwell      |
      | TX_538 | Condo/Co-op   | Calhoun       |
      | TX_539 | Condo/Co-op   | Calhoun       |
      | TX_540 | Condo/Co-op   | Calhoun       |
      | TX_541 | Condo/Co-op   | Calhoun       |
      | TX_542 | Condo/Co-op   | Calhoun       |
      | TX_543 | Condo/Co-op   | Callahan      |
      | TX_544 | Condo/Co-op   | Cameron       |
      | TX_545 | Condo/Co-op   | Cameron       |
      | TX_546 | Condo/Co-op   | Cameron       |
      | TX_547 | Condo/Co-op   | Cameron       |
      | TX_548 | Condo/Co-op   | Cameron       |
      | TX_549 | Condo/Co-op   | Camp          |
      | TX_550 | Condo/Co-op   | Carson        |
      | TX_551 | Condo/Co-op   | Cass          |
      | TX_552 | Condo/Co-op   | Castro        |
      | TX_553 | Condo/Co-op   | Chambers      |
      | TX_554 | Condo/Co-op   | Chambers      |
      | TX_555 | Condo/Co-op   | Chambers      |
      | TX_556 | Condo/Co-op   | Chambers      |
      | TX_557 | Condo/Co-op   | Chambers      |
      | TX_558 | Condo/Co-op   | Cherokee      |
      | TX_559 | Condo/Co-op   | Childress     |
      | TX_560 | Condo/Co-op   | Clay          |
      | TX_561 | Condo/Co-op   | Cochran       |
      | TX_562 | Condo/Co-op   | Coke          |
      | TX_563 | Condo/Co-op   | Coleman       |
      | TX_564 | Condo/Co-op   | Collin        |
      | TX_565 | Condo/Co-op   | Collingsworth |
      | TX_566 | Condo/Co-op   | Colorado      |
      | TX_567 | Condo/Co-op   | Comal         |
      | TX_568 | Condo/Co-op   | Comanche      |
      | TX_569 | Condo/Co-op   | Concho        |
      | TX_570 | Condo/Co-op   | Cooke         |
      | TX_571 | Condo/Co-op   | Coryell       |
      | TX_572 | Condo/Co-op   | Cottle        |
      | TX_573 | Condo/Co-op   | Crane         |
      | TX_574 | Condo/Co-op   | Crockett      |
      | TX_575 | Condo/Co-op   | Crosby        |
      | TX_576 | Condo/Co-op   | Culberson     |
      | TX_577 | Condo/Co-op   | Dallam        |
      | TX_578 | Condo/Co-op   | Dallas        |
      | TX_579 | Condo/Co-op   | Dawson        |
      | TX_580 | Condo/Co-op   | De Witt       |
      | TX_581 | Condo/Co-op   | Deaf Smith    |
      | TX_582 | Condo/Co-op   | Delta         |
      | TX_583 | Condo/Co-op   | Denton        |
      | TX_584 | Condo/Co-op   | Dickens       |
      | TX_585 | Condo/Co-op   | Dimmit        |
      | TX_586 | Condo/Co-op   | Donley        |
      | TX_587 | Condo/Co-op   | Duval         |
      | TX_588 | Condo/Co-op   | Eastland      |
      | TX_589 | Condo/Co-op   | Ector         |
      | TX_590 | Condo/Co-op   | Edwards       |
      | TX_591 | Condo/Co-op   | El Paso       |
      | TX_592 | Condo/Co-op   | Ellis         |
      | TX_593 | Condo/Co-op   | Erath         |
      | TX_594 | Condo/Co-op   | Falls         |
      | TX_595 | Condo/Co-op   | Fannin        |
      | TX_596 | Condo/Co-op   | Fayette       |
      | TX_597 | Condo/Co-op   | Fisher        |
      | TX_598 | Condo/Co-op   | Floyd         |
      | TX_599 | Condo/Co-op   | Foard         |
      | TX_600 | Condo/Co-op   | Fort Bend     |
      | TX_601 | Condo/Co-op   | Franklin      |
      | TX_602 | Condo/Co-op   | Freestone     |
      | TX_603 | Condo/Co-op   | Frio          |
      | TX_604 | Condo/Co-op   | Gaines        |
      | TX_605 | Condo/Co-op   | Galveston     |
      | TX_606 | Condo/Co-op   | Galveston     |
      | TX_607 | Condo/Co-op   | Galveston     |
      | TX_608 | Condo/Co-op   | Galveston     |
      | TX_609 | Condo/Co-op   | Galveston     |
      | TX_610 | Condo/Co-op   | Garza         |
      | TX_611 | Condo/Co-op   | Gillespie     |
      | TX_612 | Condo/Co-op   | Glasscock     |
      | TX_613 | Condo/Co-op   | Goliad        |
      | TX_614 | Condo/Co-op   | Gonzales      |
      | TX_615 | Condo/Co-op   | Gray          |
      | TX_616 | Condo/Co-op   | Grayson       |
      | TX_617 | Condo/Co-op   | Gregg         |
      | TX_618 | Condo/Co-op   | Grimes        |
      | TX_619 | Condo/Co-op   | Guadalupe     |
      | TX_620 | Condo/Co-op   | Hale          |
      | TX_621 | Condo/Co-op   | Hall          |
      | TX_622 | Condo/Co-op   | Hamilton      |
      | TX_623 | Condo/Co-op   | Hansford      |
      | TX_624 | Condo/Co-op   | Hardeman      |
      | TX_625 | Condo/Co-op   | Hardin        |
      | TX_626 | Condo/Co-op   | Harris        |
      | TX_627 | Condo/Co-op   | Harris        |
      | TX_628 | Condo/Co-op   | Harris        |
      | TX_629 | Condo/Co-op   | Harris        |
      | TX_630 | Condo/Co-op   | Harrison      |
      | TX_631 | Condo/Co-op   | Hartley       |
      | TX_632 | Condo/Co-op   | Haskell       |
      | TX_633 | Condo/Co-op   | Hays          |
      | TX_634 | Condo/Co-op   | Hemphill      |
      | TX_635 | Condo/Co-op   | Henderson     |
      | TX_636 | Condo/Co-op   | Hidalgo       |
      | TX_637 | Condo/Co-op   | Hill          |
      | TX_638 | Condo/Co-op   | Hockley       |
      | TX_639 | Condo/Co-op   | Hood          |
      | TX_640 | Condo/Co-op   | Hopkins       |
      | TX_641 | Condo/Co-op   | Houston       |
      | TX_642 | Condo/Co-op   | Howard        |
      | TX_643 | Condo/Co-op   | Hudspeth      |
      | TX_644 | Condo/Co-op   | Hunt          |
      | TX_645 | Condo/Co-op   | Hutchinson    |
      | TX_646 | Condo/Co-op   | Irion         |
      | TX_647 | Condo/Co-op   | Jack          |
      | TX_648 | Condo/Co-op   | Jackson       |
      | TX_649 | Condo/Co-op   | Jackson       |
      | TX_650 | Condo/Co-op   | Jackson       |
      | TX_651 | Condo/Co-op   | Jackson       |
      | TX_652 | Condo/Co-op   | Jasper        |
      | TX_653 | Condo/Co-op   | Jeff Davis    |
      | TX_654 | Condo/Co-op   | Jefferson     |
      | TX_655 | Condo/Co-op   | Jefferson     |
      | TX_656 | Condo/Co-op   | Jefferson     |
      | TX_657 | Condo/Co-op   | Jefferson     |
      | TX_658 | Condo/Co-op   | Jefferson     |
      | TX_659 | Condo/Co-op   | Jim Hogg      |
      | TX_660 | Condo/Co-op   | Jim Wells     |
      | TX_661 | Condo/Co-op   | Johnson       |
      | TX_662 | Condo/Co-op   | Jones         |
      | TX_663 | Condo/Co-op   | Karnes        |
      | TX_664 | Condo/Co-op   | Kaufman       |
      | TX_665 | Condo/Co-op   | Kendall       |
      | TX_666 | Condo/Co-op   | Kenedy        |
      | TX_667 | Condo/Co-op   | Kenedy        |
      | TX_668 | Condo/Co-op   | Kenedy        |
      | TX_669 | Condo/Co-op   | Kenedy        |
      | TX_670 | Condo/Co-op   | Kenedy        |
      | TX_671 | Condo/Co-op   | Kent          |
      | TX_672 | Condo/Co-op   | Kerr          |
      | TX_673 | Condo/Co-op   | Kimble        |
      | TX_674 | Condo/Co-op   | King          |
      | TX_675 | Condo/Co-op   | Kinney        |
      | TX_676 | Condo/Co-op   | Kleberg       |
      | TX_677 | Condo/Co-op   | Kleberg       |
      | TX_678 | Condo/Co-op   | Kleberg       |
      | TX_679 | Condo/Co-op   | Kleberg       |
      | TX_680 | Condo/Co-op   | Kleberg       |
      | TX_681 | Condo/Co-op   | Knox          |
      | TX_682 | Condo/Co-op   | La Salle      |
      | TX_683 | Condo/Co-op   | Lamar         |
      | TX_684 | Condo/Co-op   | Lamb          |
      | TX_685 | Condo/Co-op   | Lampasas      |
      | TX_686 | Condo/Co-op   | Lavaca        |
      | TX_687 | Condo/Co-op   | Lee           |
      | TX_688 | Condo/Co-op   | Leon          |
      | TX_689 | Condo/Co-op   | Liberty       |
      | TX_690 | Condo/Co-op   | Limestone     |
      | TX_691 | Condo/Co-op   | Lipscomb      |
      | TX_692 | Condo/Co-op   | Live Oak      |
      | TX_693 | Condo/Co-op   | Llano         |
      | TX_694 | Condo/Co-op   | Loving        |
      | TX_695 | Condo/Co-op   | Lubbock       |
      | TX_696 | Condo/Co-op   | Lynn          |
      | TX_697 | Condo/Co-op   | Madison       |
      | TX_698 | Condo/Co-op   | Marion        |
      | TX_699 | Condo/Co-op   | Martin        |
      | TX_700 | Condo/Co-op   | Mason         |
      | TX_701 | Condo/Co-op   | Matagorda     |
      | TX_702 | Condo/Co-op   | Matagorda     |
      | TX_703 | Condo/Co-op   | Matagorda     |
      | TX_704 | Condo/Co-op   | Matagorda     |
      | TX_705 | Condo/Co-op   | Matagorda     |
      | TX_706 | Condo/Co-op   | Maverick      |
      | TX_707 | Condo/Co-op   | McCulloch     |
      | TX_708 | Condo/Co-op   | McLennan      |
      | TX_709 | Condo/Co-op   | McMullen      |
      | TX_710 | Condo/Co-op   | Medina        |
      | TX_711 | Condo/Co-op   | Menard        |
      | TX_712 | Condo/Co-op   | Midland       |
      | TX_713 | Condo/Co-op   | Milam         |
      | TX_714 | Condo/Co-op   | Mills         |
      | TX_715 | Condo/Co-op   | Mitchell      |
      | TX_716 | Condo/Co-op   | Montague      |
      | TX_717 | Condo/Co-op   | Montgomery    |
      | TX_718 | Condo/Co-op   | Moore         |
      | TX_719 | Condo/Co-op   | Morris        |
      | TX_720 | Condo/Co-op   | Motley        |
      | TX_721 | Condo/Co-op   | Nacogdoches   |
      | TX_722 | Condo/Co-op   | Navarro       |
      | TX_723 | Condo/Co-op   | Newton        |
      | TX_724 | Condo/Co-op   | Nolan         |
      | TX_725 | Condo/Co-op   | Nueces        |
      | TX_726 | Condo/Co-op   | Nueces        |
      | TX_727 | Condo/Co-op   | Nueces        |
      | TX_728 | Condo/Co-op   | Nueces        |
      | TX_729 | Condo/Co-op   | Nueces        |
      | TX_730 | Condo/Co-op   | Ochiltree     |
      | TX_731 | Condo/Co-op   | Oldham        |
      | TX_732 | Condo/Co-op   | Orange        |
      | TX_733 | Condo/Co-op   | Palo Pinto    |
      | TX_734 | Condo/Co-op   | Panola        |
      | TX_735 | Condo/Co-op   | Parker        |
      | TX_736 | Condo/Co-op   | Parmer        |
      | TX_737 | Condo/Co-op   | Pecos         |
      | TX_738 | Condo/Co-op   | Polk          |
      | TX_739 | Condo/Co-op   | Potter        |
      | TX_740 | Condo/Co-op   | Presidio      |
      | TX_741 | Condo/Co-op   | Rains         |
      | TX_742 | Condo/Co-op   | Randall       |
      | TX_743 | Condo/Co-op   | Reagan        |
      | TX_744 | Condo/Co-op   | Real          |
      | TX_745 | Condo/Co-op   | Red River     |
      | TX_746 | Condo/Co-op   | Reeves        |
      | TX_747 | Condo/Co-op   | Refugio       |
      | TX_748 | Condo/Co-op   | Refugio       |
      | TX_749 | Condo/Co-op   | Refugio       |
      | TX_750 | Condo/Co-op   | Refugio       |
      | TX_751 | Condo/Co-op   | Refugio       |
      | TX_752 | Condo/Co-op   | Roberts       |
      | TX_753 | Condo/Co-op   | Robertson     |
      | TX_754 | Condo/Co-op   | Rockwall      |
      | TX_755 | Condo/Co-op   | Runnels       |
      | TX_756 | Condo/Co-op   | Rusk          |
      | TX_757 | Condo/Co-op   | Sabine        |
      | TX_758 | Condo/Co-op   | San Augustine |
      | TX_759 | Condo/Co-op   | San Jacinto   |
      | TX_760 | Condo/Co-op   | San Patricio  |
      | TX_761 | Condo/Co-op   | San Patricio  |
      | TX_762 | Condo/Co-op   | San Patricio  |
      | TX_763 | Condo/Co-op   | San Patricio  |
      | TX_764 | Condo/Co-op   | San Patricio  |
      | TX_765 | Condo/Co-op   | San Saba      |
      | TX_766 | Condo/Co-op   | Schleicher    |
      | TX_767 | Condo/Co-op   | Scurry        |
      | TX_768 | Condo/Co-op   | Shackelford   |
      | TX_769 | Condo/Co-op   | Shelby        |
      | TX_770 | Condo/Co-op   | Sherman       |
      | TX_771 | Condo/Co-op   | Smith         |
      | TX_772 | Condo/Co-op   | Somervell     |
      | TX_773 | Condo/Co-op   | Starr         |
      | TX_774 | Condo/Co-op   | Stephens      |
      | TX_775 | Condo/Co-op   | Sterling      |
      | TX_776 | Condo/Co-op   | Stonewall     |
      | TX_777 | Condo/Co-op   | Sutton        |
      | TX_778 | Condo/Co-op   | Swisher       |
      | TX_779 | Condo/Co-op   | Tarrant       |
      | TX_780 | Condo/Co-op   | Taylor        |
      | TX_781 | Condo/Co-op   | Terrell       |
      | TX_782 | Condo/Co-op   | Terry         |
      | TX_783 | Condo/Co-op   | Throckmorton  |
      | TX_784 | Condo/Co-op   | Titus         |
      | TX_785 | Condo/Co-op   | Tom Green     |
      | TX_786 | Condo/Co-op   | Travis        |
      | TX_787 | Condo/Co-op   | Trinity       |
      | TX_788 | Condo/Co-op   | Tyler         |
      | TX_789 | Condo/Co-op   | Upshur        |
      | TX_790 | Condo/Co-op   | Upton         |
      | TX_791 | Condo/Co-op   | Uvalde        |
      | TX_792 | Condo/Co-op   | Val Verde     |
      | TX_793 | Condo/Co-op   | Van Zandt     |
      | TX_794 | Condo/Co-op   | Victoria      |
      | TX_795 | Condo/Co-op   | Victoria      |
      | TX_796 | Condo/Co-op   | Victoria      |
      | TX_797 | Condo/Co-op   | Victoria      |
      | TX_798 | Condo/Co-op   | Walker        |
      | TX_799 | Condo/Co-op   | Waller        |
      | TX_800 | Condo/Co-op   | Ward          |
      | TX_801 | Condo/Co-op   | Washington    |
      | TX_802 | Condo/Co-op   | Webb          |
      | TX_803 | Condo/Co-op   | Wharton       |
      | TX_804 | Condo/Co-op   | Wheeler       |
      | TX_805 | Condo/Co-op   | Wichita       |
      | TX_806 | Condo/Co-op   | Wilbarger     |
      | TX_807 | Condo/Co-op   | Willacy       |
      | TX_808 | Condo/Co-op   | Willacy       |
      | TX_809 | Condo/Co-op   | Willacy       |
      | TX_810 | Condo/Co-op   | Willacy       |
      | TX_811 | Condo/Co-op   | Willacy       |
      | TX_812 | Condo/Co-op   | Williamson    |
      | TX_813 | Condo/Co-op   | Wilson        |
      | TX_814 | Condo/Co-op   | Winkler       |
      | TX_815 | Condo/Co-op   | Wise          |
      | TX_816 | Condo/Co-op   | Wood          |
      | TX_817 | Condo/Co-op   | Yoakum        |
      | TX_818 | Condo/Co-op   | Young         |
      | TX_819 | Condo/Co-op   | Zapata        |
      | TX_820 | Condo/Co-op   | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_545 | Condo/Co-op   | Cameron   |
      | TX_620 | Condo/Co-op   | Hale      |
      | TX_739 | Condo/Co-op   | Potter    |
      | TX_685 | Condo/Co-op   | Lampasas  |
      | TX_701 | Condo/Co-op   | Matagorda |

  @PSE @PreProd
  Scenario Outline: US45592 - Get Base Rates for PSE TX - "<ResidenceType>" - "<County>" - "<TC_ID>"
  As a company I want to set rates for PSE TX condos and homeowners
  policies so that we can match specific rates to the carrier partners

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US45592" in sheet "QuoteCreatorHS" for "HS" LOB
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

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45592/PSE" in "Base_Rates" excel file for "New Business"

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

    Then I save coverage factor and value for "<TC_ID>" in "PRE_PROD/US45592/PSE" in "Base_Rates" excel file for "Endorsement"

    @Homeowner
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_001 | Homeowner     | Anderson      |
      | TX_002 | Homeowner     | Andrews       |
      | TX_003 | Homeowner     | Angelina      |
      | TX_004 | Homeowner     | Aransas       |
      | TX_005 | Homeowner     | Aransas       |
      | TX_006 | Homeowner     | Aransas       |
      | TX_007 | Homeowner     | Aransas       |
      | TX_008 | Homeowner     | Aransas       |
      | TX_009 | Homeowner     | Archer        |
      | TX_010 | Homeowner     | Armstrong     |
      | TX_011 | Homeowner     | Atascosa      |
      | TX_012 | Homeowner     | Austin        |
      | TX_013 | Homeowner     | Bailey        |
      | TX_014 | Homeowner     | Bandera       |
      | TX_015 | Homeowner     | Bastrop       |
      | TX_016 | Homeowner     | Baylor        |
      | TX_017 | Homeowner     | Bee           |
      | TX_018 | Homeowner     | Bell          |
      | TX_019 | Homeowner     | Bexar         |
      | TX_020 | Homeowner     | Blanco        |
      | TX_021 | Homeowner     | Borden        |
      | TX_022 | Homeowner     | Bosque        |
      | TX_023 | Homeowner     | Bowie         |
      | TX_024 | Homeowner     | Brazoria      |
      | TX_025 | Homeowner     | Brazoria      |
      | TX_026 | Homeowner     | Brazoria      |
      | TX_027 | Homeowner     | Brazoria      |
      | TX_028 | Homeowner     | Brazoria      |
      | TX_029 | Homeowner     | Brazoria      |
      | TX_030 | Homeowner     | Brazos        |
      | TX_031 | Homeowner     | Brewster      |
      | TX_032 | Homeowner     | Briscoe       |
      | TX_033 | Homeowner     | Brooks        |
      | TX_034 | Homeowner     | Brown         |
      | TX_035 | Homeowner     | Burleson      |
      | TX_036 | Homeowner     | Burnet        |
      | TX_037 | Homeowner     | Caldwell      |
      | TX_038 | Homeowner     | Calhoun       |
      | TX_039 | Homeowner     | Calhoun       |
      | TX_040 | Homeowner     | Calhoun       |
      | TX_041 | Homeowner     | Calhoun       |
      | TX_042 | Homeowner     | Calhoun       |
      | TX_043 | Homeowner     | Callahan      |
      | TX_044 | Homeowner     | Cameron       |
      | TX_045 | Homeowner     | Cameron       |
      | TX_046 | Homeowner     | Cameron       |
      | TX_047 | Homeowner     | Cameron       |
      | TX_048 | Homeowner     | Cameron       |
      | TX_049 | Homeowner     | Camp          |
      | TX_050 | Homeowner     | Carson        |
      | TX_051 | Homeowner     | Cass          |
      | TX_052 | Homeowner     | Castro        |
      | TX_053 | Homeowner     | Chambers      |
      | TX_054 | Homeowner     | Chambers      |
      | TX_055 | Homeowner     | Chambers      |
      | TX_056 | Homeowner     | Chambers      |
      | TX_057 | Homeowner     | Chambers      |
      | TX_058 | Homeowner     | Cherokee      |
      | TX_059 | Homeowner     | Childress     |
      | TX_060 | Homeowner     | Clay          |
      | TX_061 | Homeowner     | Cochran       |
      | TX_062 | Homeowner     | Coke          |
      | TX_063 | Homeowner     | Coleman       |
      | TX_064 | Homeowner     | Collin        |
      | TX_065 | Homeowner     | Collingsworth |
      | TX_066 | Homeowner     | Colorado      |
      | TX_067 | Homeowner     | Comal         |
      | TX_068 | Homeowner     | Comanche      |
      | TX_069 | Homeowner     | Concho        |
      | TX_070 | Homeowner     | Cooke         |
      | TX_071 | Homeowner     | Coryell       |
      | TX_072 | Homeowner     | Cottle        |
      | TX_073 | Homeowner     | Crane         |
      | TX_074 | Homeowner     | Crockett      |
      | TX_075 | Homeowner     | Crosby        |
      | TX_076 | Homeowner     | Culberson     |
      | TX_077 | Homeowner     | Dallam        |
      | TX_078 | Homeowner     | Dallas        |
      | TX_079 | Homeowner     | Dawson        |
      | TX_080 | Homeowner     | De Witt       |
      | TX_081 | Homeowner     | Deaf Smith    |
      | TX_082 | Homeowner     | Delta         |
      | TX_083 | Homeowner     | Denton        |
      | TX_084 | Homeowner     | Dickens       |
      | TX_085 | Homeowner     | Dimmit        |
      | TX_086 | Homeowner     | Donley        |
      | TX_087 | Homeowner     | Duval         |
      | TX_088 | Homeowner     | Eastland      |
      | TX_089 | Homeowner     | Ector         |
      | TX_090 | Homeowner     | Edwards       |
      | TX_091 | Homeowner     | El Paso       |
      | TX_092 | Homeowner     | Ellis         |
      | TX_093 | Homeowner     | Erath         |
      | TX_094 | Homeowner     | Falls         |
      | TX_095 | Homeowner     | Fannin        |
      | TX_096 | Homeowner     | Fayette       |
      | TX_097 | Homeowner     | Fisher        |
      | TX_098 | Homeowner     | Floyd         |
      | TX_099 | Homeowner     | Foard         |
      | TX_100 | Homeowner     | Fort Bend     |
      | TX_101 | Homeowner     | Franklin      |
      | TX_102 | Homeowner     | Freestone     |
      | TX_103 | Homeowner     | Frio          |
      | TX_104 | Homeowner     | Gaines        |
      | TX_105 | Homeowner     | Galveston     |
      | TX_106 | Homeowner     | Galveston     |
      | TX_107 | Homeowner     | Galveston     |
      | TX_108 | Homeowner     | Galveston     |
      | TX_109 | Homeowner     | Galveston     |
      | TX_110 | Homeowner     | Garza         |
      | TX_111 | Homeowner     | Gillespie     |
      | TX_112 | Homeowner     | Glasscock     |
      | TX_113 | Homeowner     | Goliad        |
      | TX_114 | Homeowner     | Gonzales      |
      | TX_115 | Homeowner     | Gray          |
      | TX_116 | Homeowner     | Grayson       |
      | TX_117 | Homeowner     | Gregg         |
      | TX_118 | Homeowner     | Grimes        |
      | TX_119 | Homeowner     | Guadalupe     |
      | TX_120 | Homeowner     | Hale          |
      | TX_121 | Homeowner     | Hall          |
      | TX_122 | Homeowner     | Hamilton      |
      | TX_123 | Homeowner     | Hansford      |
      | TX_124 | Homeowner     | Hardeman      |
      | TX_125 | Homeowner     | Hardin        |
      | TX_126 | Homeowner     | Harris        |
      | TX_127 | Homeowner     | Harris        |
      | TX_128 | Homeowner     | Harris        |
      | TX_129 | Homeowner     | Harris        |
      | TX_130 | Homeowner     | Harrison      |
      | TX_131 | Homeowner     | Hartley       |
      | TX_132 | Homeowner     | Haskell       |
      | TX_133 | Homeowner     | Hays          |
      | TX_134 | Homeowner     | Hemphill      |
      | TX_135 | Homeowner     | Henderson     |
      | TX_136 | Homeowner     | Hidalgo       |
      | TX_137 | Homeowner     | Hill          |
      | TX_138 | Homeowner     | Hockley       |
      | TX_139 | Homeowner     | Hood          |
      | TX_140 | Homeowner     | Hopkins       |
      | TX_141 | Homeowner     | Houston       |
      | TX_142 | Homeowner     | Howard        |
      | TX_143 | Homeowner     | Hudspeth      |
      | TX_144 | Homeowner     | Hunt          |
      | TX_145 | Homeowner     | Hutchinson    |
      | TX_146 | Homeowner     | Irion         |
      | TX_147 | Homeowner     | Jack          |
      | TX_148 | Homeowner     | Jackson       |
      | TX_149 | Homeowner     | Jackson       |
      | TX_150 | Homeowner     | Jackson       |
      | TX_151 | Homeowner     | Jackson       |
      | TX_152 | Homeowner     | Jasper        |
      | TX_153 | Homeowner     | Jeff Davis    |
      | TX_154 | Homeowner     | Jefferson     |
      | TX_155 | Homeowner     | Jefferson     |
      | TX_156 | Homeowner     | Jefferson     |
      | TX_157 | Homeowner     | Jefferson     |
      | TX_158 | Homeowner     | Jefferson     |
      | TX_159 | Homeowner     | Jim Hogg      |
      | TX_160 | Homeowner     | Jim Wells     |
      | TX_161 | Homeowner     | Johnson       |
      | TX_162 | Homeowner     | Jones         |
      | TX_163 | Homeowner     | Karnes        |
      | TX_164 | Homeowner     | Kaufman       |
      | TX_165 | Homeowner     | Kendall       |
      | TX_166 | Homeowner     | Kenedy        |
      | TX_167 | Homeowner     | Kenedy        |
      | TX_168 | Homeowner     | Kenedy        |
      | TX_169 | Homeowner     | Kenedy        |
      | TX_170 | Homeowner     | Kenedy        |
      | TX_171 | Homeowner     | Kent          |
      | TX_172 | Homeowner     | Kerr          |
      | TX_173 | Homeowner     | Kimble        |
      | TX_174 | Homeowner     | King          |
      | TX_175 | Homeowner     | Kinney        |
      | TX_176 | Homeowner     | Kleberg       |
      | TX_177 | Homeowner     | Kleberg       |
      | TX_178 | Homeowner     | Kleberg       |
      | TX_179 | Homeowner     | Kleberg       |
      | TX_180 | Homeowner     | Kleberg       |
      | TX_181 | Homeowner     | Knox          |
      | TX_182 | Homeowner     | La Salle      |
      | TX_183 | Homeowner     | Lamar         |
      | TX_184 | Homeowner     | Lamb          |
      | TX_185 | Homeowner     | Lampasas      |
      | TX_186 | Homeowner     | Lavaca        |
      | TX_187 | Homeowner     | Lee           |
      | TX_188 | Homeowner     | Leon          |
      | TX_189 | Homeowner     | Liberty       |
      | TX_190 | Homeowner     | Limestone     |
      | TX_191 | Homeowner     | Lipscomb      |
      | TX_192 | Homeowner     | Live Oak      |
      | TX_193 | Homeowner     | Llano         |
      | TX_194 | Homeowner     | Loving        |
      | TX_195 | Homeowner     | Lubbock       |
      | TX_196 | Homeowner     | Lynn          |
      | TX_197 | Homeowner     | Madison       |
      | TX_198 | Homeowner     | Marion        |
      | TX_199 | Homeowner     | Martin        |
      | TX_200 | Homeowner     | Mason         |
      | TX_201 | Homeowner     | Matagorda     |
      | TX_202 | Homeowner     | Matagorda     |
      | TX_203 | Homeowner     | Matagorda     |
      | TX_204 | Homeowner     | Matagorda     |
      | TX_205 | Homeowner     | Matagorda     |
      | TX_206 | Homeowner     | Maverick      |
      | TX_207 | Homeowner     | McCulloch     |
      | TX_208 | Homeowner     | McLennan      |
      | TX_209 | Homeowner     | McMullen      |
      | TX_210 | Homeowner     | Medina        |
      | TX_211 | Homeowner     | Menard        |
      | TX_212 | Homeowner     | Midland       |
      | TX_213 | Homeowner     | Milam         |
      | TX_214 | Homeowner     | Mills         |
      | TX_215 | Homeowner     | Mitchell      |
      | TX_216 | Homeowner     | Montague      |
      | TX_217 | Homeowner     | Montgomery    |
      | TX_218 | Homeowner     | Moore         |
      | TX_219 | Homeowner     | Morris        |
      | TX_220 | Homeowner     | Motley        |
      | TX_221 | Homeowner     | Nacogdoches   |
      | TX_222 | Homeowner     | Navarro       |
      | TX_223 | Homeowner     | Newton        |
      | TX_224 | Homeowner     | Nolan         |
      | TX_225 | Homeowner     | Nueces        |
      | TX_226 | Homeowner     | Nueces        |
      | TX_227 | Homeowner     | Nueces        |
      | TX_228 | Homeowner     | Nueces        |
      | TX_229 | Homeowner     | Nueces        |
      | TX_230 | Homeowner     | Ochiltree     |
      | TX_231 | Homeowner     | Oldham        |
      | TX_232 | Homeowner     | Orange        |
      | TX_233 | Homeowner     | Palo Pinto    |
      | TX_234 | Homeowner     | Panola        |
      | TX_235 | Homeowner     | Parker        |
      | TX_236 | Homeowner     | Parmer        |
      | TX_237 | Homeowner     | Pecos         |
      | TX_238 | Homeowner     | Polk          |
      | TX_239 | Homeowner     | Potter        |
      | TX_240 | Homeowner     | Presidio      |
      | TX_241 | Homeowner     | Rains         |
      | TX_242 | Homeowner     | Randall       |
      | TX_243 | Homeowner     | Reagan        |
      | TX_244 | Homeowner     | Real          |
      | TX_245 | Homeowner     | Red River     |
      | TX_246 | Homeowner     | Reeves        |
      | TX_247 | Homeowner     | Refugio       |
      | TX_248 | Homeowner     | Refugio       |
      | TX_249 | Homeowner     | Refugio       |
      | TX_250 | Homeowner     | Refugio       |
      | TX_251 | Homeowner     | Refugio       |
      | TX_252 | Homeowner     | Roberts       |
      | TX_253 | Homeowner     | Robertson     |
      | TX_254 | Homeowner     | Rockwall      |
      | TX_255 | Homeowner     | Runnels       |
      | TX_256 | Homeowner     | Rusk          |
      | TX_257 | Homeowner     | Sabine        |
      | TX_258 | Homeowner     | San Augustine |
      | TX_259 | Homeowner     | San Jacinto   |
      | TX_260 | Homeowner     | San Patricio  |
      | TX_261 | Homeowner     | San Patricio  |
      | TX_262 | Homeowner     | San Patricio  |
      | TX_263 | Homeowner     | San Patricio  |
      | TX_264 | Homeowner     | San Patricio  |
      | TX_265 | Homeowner     | San Saba      |
      | TX_266 | Homeowner     | Schleicher    |
      | TX_267 | Homeowner     | Scurry        |
      | TX_268 | Homeowner     | Shackelford   |
      | TX_269 | Homeowner     | Shelby        |
      | TX_270 | Homeowner     | Sherman       |
      | TX_271 | Homeowner     | Smith         |
      | TX_272 | Homeowner     | Somervell     |
      | TX_273 | Homeowner     | Starr         |
      | TX_274 | Homeowner     | Stephens      |
      | TX_275 | Homeowner     | Sterling      |
      | TX_276 | Homeowner     | Stonewall     |
      | TX_277 | Homeowner     | Sutton        |
      | TX_278 | Homeowner     | Swisher       |
      | TX_279 | Homeowner     | Tarrant       |
      | TX_280 | Homeowner     | Taylor        |
      | TX_281 | Homeowner     | Terrell       |
      | TX_282 | Homeowner     | Terry         |
      | TX_283 | Homeowner     | Throckmorton  |
      | TX_284 | Homeowner     | Titus         |
      | TX_285 | Homeowner     | Tom Green     |
      | TX_286 | Homeowner     | Travis        |
      | TX_287 | Homeowner     | Trinity       |
      | TX_288 | Homeowner     | Tyler         |
      | TX_289 | Homeowner     | Upshur        |
      | TX_290 | Homeowner     | Upton         |
      | TX_291 | Homeowner     | Uvalde        |
      | TX_292 | Homeowner     | Val Verde     |
      | TX_293 | Homeowner     | Van Zandt     |
      | TX_294 | Homeowner     | Victoria      |
      | TX_295 | Homeowner     | Victoria      |
      | TX_296 | Homeowner     | Victoria      |
      | TX_297 | Homeowner     | Victoria      |
      | TX_298 | Homeowner     | Walker        |
      | TX_299 | Homeowner     | Waller        |
      | TX_300 | Homeowner     | Ward          |
      | TX_301 | Homeowner     | Washington    |
      | TX_302 | Homeowner     | Webb          |
      | TX_303 | Homeowner     | Wharton       |
      | TX_304 | Homeowner     | Wheeler       |
      | TX_305 | Homeowner     | Wichita       |
      | TX_306 | Homeowner     | Wilbarger     |
      | TX_307 | Homeowner     | Willacy       |
      | TX_308 | Homeowner     | Willacy       |
      | TX_309 | Homeowner     | Willacy       |
      | TX_310 | Homeowner     | Willacy       |
      | TX_311 | Homeowner     | Willacy       |
      | TX_312 | Homeowner     | Williamson    |
      | TX_313 | Homeowner     | Wilson        |
      | TX_314 | Homeowner     | Winkler       |
      | TX_315 | Homeowner     | Wise          |
      | TX_316 | Homeowner     | Wood          |
      | TX_317 | Homeowner     | Yoakum        |
      | TX_318 | Homeowner     | Young         |
      | TX_319 | Homeowner     | Zapata        |
      | TX_320 | Homeowner     | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_120 | Homeowner     | Hale      |
      | TX_002 | Homeowner     | Andrews   |
      | TX_003 | Homeowner     | Angelina  |
      | TX_010 | Homeowner     | Armstrong |
      | TX_075 | Homeowner     | Crosby    |

    @Condo
    Examples:
      | TC_ID  | ResidenceType | County        |
      | TX_501 | Condo/Co-op   | Anderson      |
      | TX_502 | Condo/Co-op   | Andrews       |
      | TX_503 | Condo/Co-op   | Angelina      |
      | TX_504 | Condo/Co-op   | Aransas       |
      | TX_505 | Condo/Co-op   | Aransas       |
      | TX_506 | Condo/Co-op   | Aransas       |
      | TX_507 | Condo/Co-op   | Aransas       |
      | TX_508 | Condo/Co-op   | Aransas       |
      | TX_509 | Condo/Co-op   | Archer        |
      | TX_510 | Condo/Co-op   | Armstrong     |
      | TX_511 | Condo/Co-op   | Atascosa      |
      | TX_512 | Condo/Co-op   | Austin        |
      | TX_513 | Condo/Co-op   | Bailey        |
      | TX_514 | Condo/Co-op   | Bandera       |
      | TX_515 | Condo/Co-op   | Bastrop       |
      | TX_516 | Condo/Co-op   | Baylor        |
      | TX_517 | Condo/Co-op   | Bee           |
      | TX_518 | Condo/Co-op   | Bell          |
      | TX_519 | Condo/Co-op   | Bexar         |
      | TX_520 | Condo/Co-op   | Blanco        |
      | TX_521 | Condo/Co-op   | Borden        |
      | TX_522 | Condo/Co-op   | Bosque        |
      | TX_523 | Condo/Co-op   | Bowie         |
      | TX_524 | Condo/Co-op   | Brazoria      |
      | TX_525 | Condo/Co-op   | Brazoria      |
      | TX_526 | Condo/Co-op   | Brazoria      |
      | TX_527 | Condo/Co-op   | Brazoria      |
      | TX_528 | Condo/Co-op   | Brazoria      |
      | TX_529 | Condo/Co-op   | Brazoria      |
      | TX_530 | Condo/Co-op   | Brazos        |
      | TX_531 | Condo/Co-op   | Brewster      |
      | TX_532 | Condo/Co-op   | Briscoe       |
      | TX_533 | Condo/Co-op   | Brooks        |
      | TX_534 | Condo/Co-op   | Brown         |
      | TX_535 | Condo/Co-op   | Burleson      |
      | TX_536 | Condo/Co-op   | Burnet        |
      | TX_537 | Condo/Co-op   | Caldwell      |
      | TX_538 | Condo/Co-op   | Calhoun       |
      | TX_539 | Condo/Co-op   | Calhoun       |
      | TX_540 | Condo/Co-op   | Calhoun       |
      | TX_541 | Condo/Co-op   | Calhoun       |
      | TX_542 | Condo/Co-op   | Calhoun       |
      | TX_543 | Condo/Co-op   | Callahan      |
      | TX_544 | Condo/Co-op   | Cameron       |
      | TX_545 | Condo/Co-op   | Cameron       |
      | TX_546 | Condo/Co-op   | Cameron       |
      | TX_547 | Condo/Co-op   | Cameron       |
      | TX_548 | Condo/Co-op   | Cameron       |
      | TX_549 | Condo/Co-op   | Camp          |
      | TX_550 | Condo/Co-op   | Carson        |
      | TX_551 | Condo/Co-op   | Cass          |
      | TX_552 | Condo/Co-op   | Castro        |
      | TX_553 | Condo/Co-op   | Chambers      |
      | TX_554 | Condo/Co-op   | Chambers      |
      | TX_555 | Condo/Co-op   | Chambers      |
      | TX_556 | Condo/Co-op   | Chambers      |
      | TX_557 | Condo/Co-op   | Chambers      |
      | TX_558 | Condo/Co-op   | Cherokee      |
      | TX_559 | Condo/Co-op   | Childress     |
      | TX_560 | Condo/Co-op   | Clay          |
      | TX_561 | Condo/Co-op   | Cochran       |
      | TX_562 | Condo/Co-op   | Coke          |
      | TX_563 | Condo/Co-op   | Coleman       |
      | TX_564 | Condo/Co-op   | Collin        |
      | TX_565 | Condo/Co-op   | Collingsworth |
      | TX_566 | Condo/Co-op   | Colorado      |
      | TX_567 | Condo/Co-op   | Comal         |
      | TX_568 | Condo/Co-op   | Comanche      |
      | TX_569 | Condo/Co-op   | Concho        |
      | TX_570 | Condo/Co-op   | Cooke         |
      | TX_571 | Condo/Co-op   | Coryell       |
      | TX_572 | Condo/Co-op   | Cottle        |
      | TX_573 | Condo/Co-op   | Crane         |
      | TX_574 | Condo/Co-op   | Crockett      |
      | TX_575 | Condo/Co-op   | Crosby        |
      | TX_576 | Condo/Co-op   | Culberson     |
      | TX_577 | Condo/Co-op   | Dallam        |
      | TX_578 | Condo/Co-op   | Dallas        |
      | TX_579 | Condo/Co-op   | Dawson        |
      | TX_580 | Condo/Co-op   | De Witt       |
      | TX_581 | Condo/Co-op   | Deaf Smith    |
      | TX_582 | Condo/Co-op   | Delta         |
      | TX_583 | Condo/Co-op   | Denton        |
      | TX_584 | Condo/Co-op   | Dickens       |
      | TX_585 | Condo/Co-op   | Dimmit        |
      | TX_586 | Condo/Co-op   | Donley        |
      | TX_587 | Condo/Co-op   | Duval         |
      | TX_588 | Condo/Co-op   | Eastland      |
      | TX_589 | Condo/Co-op   | Ector         |
      | TX_590 | Condo/Co-op   | Edwards       |
      | TX_591 | Condo/Co-op   | El Paso       |
      | TX_592 | Condo/Co-op   | Ellis         |
      | TX_593 | Condo/Co-op   | Erath         |
      | TX_594 | Condo/Co-op   | Falls         |
      | TX_595 | Condo/Co-op   | Fannin        |
      | TX_596 | Condo/Co-op   | Fayette       |
      | TX_597 | Condo/Co-op   | Fisher        |
      | TX_598 | Condo/Co-op   | Floyd         |
      | TX_599 | Condo/Co-op   | Foard         |
      | TX_600 | Condo/Co-op   | Fort Bend     |
      | TX_601 | Condo/Co-op   | Franklin      |
      | TX_602 | Condo/Co-op   | Freestone     |
      | TX_603 | Condo/Co-op   | Frio          |
      | TX_604 | Condo/Co-op   | Gaines        |
      | TX_605 | Condo/Co-op   | Galveston     |
      | TX_606 | Condo/Co-op   | Galveston     |
      | TX_607 | Condo/Co-op   | Galveston     |
      | TX_608 | Condo/Co-op   | Galveston     |
      | TX_609 | Condo/Co-op   | Galveston     |
      | TX_610 | Condo/Co-op   | Garza         |
      | TX_611 | Condo/Co-op   | Gillespie     |
      | TX_612 | Condo/Co-op   | Glasscock     |
      | TX_613 | Condo/Co-op   | Goliad        |
      | TX_614 | Condo/Co-op   | Gonzales      |
      | TX_615 | Condo/Co-op   | Gray          |
      | TX_616 | Condo/Co-op   | Grayson       |
      | TX_617 | Condo/Co-op   | Gregg         |
      | TX_618 | Condo/Co-op   | Grimes        |
      | TX_619 | Condo/Co-op   | Guadalupe     |
      | TX_620 | Condo/Co-op   | Hale          |
      | TX_621 | Condo/Co-op   | Hall          |
      | TX_622 | Condo/Co-op   | Hamilton      |
      | TX_623 | Condo/Co-op   | Hansford      |
      | TX_624 | Condo/Co-op   | Hardeman      |
      | TX_625 | Condo/Co-op   | Hardin        |
      | TX_626 | Condo/Co-op   | Harris        |
      | TX_627 | Condo/Co-op   | Harris        |
      | TX_628 | Condo/Co-op   | Harris        |
      | TX_629 | Condo/Co-op   | Harris        |
      | TX_630 | Condo/Co-op   | Harrison      |
      | TX_631 | Condo/Co-op   | Hartley       |
      | TX_632 | Condo/Co-op   | Haskell       |
      | TX_633 | Condo/Co-op   | Hays          |
      | TX_634 | Condo/Co-op   | Hemphill      |
      | TX_635 | Condo/Co-op   | Henderson     |
      | TX_636 | Condo/Co-op   | Hidalgo       |
      | TX_637 | Condo/Co-op   | Hill          |
      | TX_638 | Condo/Co-op   | Hockley       |
      | TX_639 | Condo/Co-op   | Hood          |
      | TX_640 | Condo/Co-op   | Hopkins       |
      | TX_641 | Condo/Co-op   | Houston       |
      | TX_642 | Condo/Co-op   | Howard        |
      | TX_643 | Condo/Co-op   | Hudspeth      |
      | TX_644 | Condo/Co-op   | Hunt          |
      | TX_645 | Condo/Co-op   | Hutchinson    |
      | TX_646 | Condo/Co-op   | Irion         |
      | TX_647 | Condo/Co-op   | Jack          |
      | TX_648 | Condo/Co-op   | Jackson       |
      | TX_649 | Condo/Co-op   | Jackson       |
      | TX_650 | Condo/Co-op   | Jackson       |
      | TX_651 | Condo/Co-op   | Jackson       |
      | TX_652 | Condo/Co-op   | Jasper        |
      | TX_653 | Condo/Co-op   | Jeff Davis    |
      | TX_654 | Condo/Co-op   | Jefferson     |
      | TX_655 | Condo/Co-op   | Jefferson     |
      | TX_656 | Condo/Co-op   | Jefferson     |
      | TX_657 | Condo/Co-op   | Jefferson     |
      | TX_658 | Condo/Co-op   | Jefferson     |
      | TX_659 | Condo/Co-op   | Jim Hogg      |
      | TX_660 | Condo/Co-op   | Jim Wells     |
      | TX_661 | Condo/Co-op   | Johnson       |
      | TX_662 | Condo/Co-op   | Jones         |
      | TX_663 | Condo/Co-op   | Karnes        |
      | TX_664 | Condo/Co-op   | Kaufman       |
      | TX_665 | Condo/Co-op   | Kendall       |
      | TX_666 | Condo/Co-op   | Kenedy        |
      | TX_667 | Condo/Co-op   | Kenedy        |
      | TX_668 | Condo/Co-op   | Kenedy        |
      | TX_669 | Condo/Co-op   | Kenedy        |
      | TX_670 | Condo/Co-op   | Kenedy        |
      | TX_671 | Condo/Co-op   | Kent          |
      | TX_672 | Condo/Co-op   | Kerr          |
      | TX_673 | Condo/Co-op   | Kimble        |
      | TX_674 | Condo/Co-op   | King          |
      | TX_675 | Condo/Co-op   | Kinney        |
      | TX_676 | Condo/Co-op   | Kleberg       |
      | TX_677 | Condo/Co-op   | Kleberg       |
      | TX_678 | Condo/Co-op   | Kleberg       |
      | TX_679 | Condo/Co-op   | Kleberg       |
      | TX_680 | Condo/Co-op   | Kleberg       |
      | TX_681 | Condo/Co-op   | Knox          |
      | TX_682 | Condo/Co-op   | La Salle      |
      | TX_683 | Condo/Co-op   | Lamar         |
      | TX_684 | Condo/Co-op   | Lamb          |
      | TX_685 | Condo/Co-op   | Lampasas      |
      | TX_686 | Condo/Co-op   | Lavaca        |
      | TX_687 | Condo/Co-op   | Lee           |
      | TX_688 | Condo/Co-op   | Leon          |
      | TX_689 | Condo/Co-op   | Liberty       |
      | TX_690 | Condo/Co-op   | Limestone     |
      | TX_691 | Condo/Co-op   | Lipscomb      |
      | TX_692 | Condo/Co-op   | Live Oak      |
      | TX_693 | Condo/Co-op   | Llano         |
      | TX_694 | Condo/Co-op   | Loving        |
      | TX_695 | Condo/Co-op   | Lubbock       |
      | TX_696 | Condo/Co-op   | Lynn          |
      | TX_697 | Condo/Co-op   | Madison       |
      | TX_698 | Condo/Co-op   | Marion        |
      | TX_699 | Condo/Co-op   | Martin        |
      | TX_700 | Condo/Co-op   | Mason         |
      | TX_701 | Condo/Co-op   | Matagorda     |
      | TX_702 | Condo/Co-op   | Matagorda     |
      | TX_703 | Condo/Co-op   | Matagorda     |
      | TX_704 | Condo/Co-op   | Matagorda     |
      | TX_705 | Condo/Co-op   | Matagorda     |
      | TX_706 | Condo/Co-op   | Maverick      |
      | TX_707 | Condo/Co-op   | McCulloch     |
      | TX_708 | Condo/Co-op   | McLennan      |
      | TX_709 | Condo/Co-op   | McMullen      |
      | TX_710 | Condo/Co-op   | Medina        |
      | TX_711 | Condo/Co-op   | Menard        |
      | TX_712 | Condo/Co-op   | Midland       |
      | TX_713 | Condo/Co-op   | Milam         |
      | TX_714 | Condo/Co-op   | Mills         |
      | TX_715 | Condo/Co-op   | Mitchell      |
      | TX_716 | Condo/Co-op   | Montague      |
      | TX_717 | Condo/Co-op   | Montgomery    |
      | TX_718 | Condo/Co-op   | Moore         |
      | TX_719 | Condo/Co-op   | Morris        |
      | TX_720 | Condo/Co-op   | Motley        |
      | TX_721 | Condo/Co-op   | Nacogdoches   |
      | TX_722 | Condo/Co-op   | Navarro       |
      | TX_723 | Condo/Co-op   | Newton        |
      | TX_724 | Condo/Co-op   | Nolan         |
      | TX_725 | Condo/Co-op   | Nueces        |
      | TX_726 | Condo/Co-op   | Nueces        |
      | TX_727 | Condo/Co-op   | Nueces        |
      | TX_728 | Condo/Co-op   | Nueces        |
      | TX_729 | Condo/Co-op   | Nueces        |
      | TX_730 | Condo/Co-op   | Ochiltree     |
      | TX_731 | Condo/Co-op   | Oldham        |
      | TX_732 | Condo/Co-op   | Orange        |
      | TX_733 | Condo/Co-op   | Palo Pinto    |
      | TX_734 | Condo/Co-op   | Panola        |
      | TX_735 | Condo/Co-op   | Parker        |
      | TX_736 | Condo/Co-op   | Parmer        |
      | TX_737 | Condo/Co-op   | Pecos         |
      | TX_738 | Condo/Co-op   | Polk          |
      | TX_739 | Condo/Co-op   | Potter        |
      | TX_740 | Condo/Co-op   | Presidio      |
      | TX_741 | Condo/Co-op   | Rains         |
      | TX_742 | Condo/Co-op   | Randall       |
      | TX_743 | Condo/Co-op   | Reagan        |
      | TX_744 | Condo/Co-op   | Real          |
      | TX_745 | Condo/Co-op   | Red River     |
      | TX_746 | Condo/Co-op   | Reeves        |
      | TX_747 | Condo/Co-op   | Refugio       |
      | TX_748 | Condo/Co-op   | Refugio       |
      | TX_749 | Condo/Co-op   | Refugio       |
      | TX_750 | Condo/Co-op   | Refugio       |
      | TX_751 | Condo/Co-op   | Refugio       |
      | TX_752 | Condo/Co-op   | Roberts       |
      | TX_753 | Condo/Co-op   | Robertson     |
      | TX_754 | Condo/Co-op   | Rockwall      |
      | TX_755 | Condo/Co-op   | Runnels       |
      | TX_756 | Condo/Co-op   | Rusk          |
      | TX_757 | Condo/Co-op   | Sabine        |
      | TX_758 | Condo/Co-op   | San Augustine |
      | TX_759 | Condo/Co-op   | San Jacinto   |
      | TX_760 | Condo/Co-op   | San Patricio  |
      | TX_761 | Condo/Co-op   | San Patricio  |
      | TX_762 | Condo/Co-op   | San Patricio  |
      | TX_763 | Condo/Co-op   | San Patricio  |
      | TX_764 | Condo/Co-op   | San Patricio  |
      | TX_765 | Condo/Co-op   | San Saba      |
      | TX_766 | Condo/Co-op   | Schleicher    |
      | TX_767 | Condo/Co-op   | Scurry        |
      | TX_768 | Condo/Co-op   | Shackelford   |
      | TX_769 | Condo/Co-op   | Shelby        |
      | TX_770 | Condo/Co-op   | Sherman       |
      | TX_771 | Condo/Co-op   | Smith         |
      | TX_772 | Condo/Co-op   | Somervell     |
      | TX_773 | Condo/Co-op   | Starr         |
      | TX_774 | Condo/Co-op   | Stephens      |
      | TX_775 | Condo/Co-op   | Sterling      |
      | TX_776 | Condo/Co-op   | Stonewall     |
      | TX_777 | Condo/Co-op   | Sutton        |
      | TX_778 | Condo/Co-op   | Swisher       |
      | TX_779 | Condo/Co-op   | Tarrant       |
      | TX_780 | Condo/Co-op   | Taylor        |
      | TX_781 | Condo/Co-op   | Terrell       |
      | TX_782 | Condo/Co-op   | Terry         |
      | TX_783 | Condo/Co-op   | Throckmorton  |
      | TX_784 | Condo/Co-op   | Titus         |
      | TX_785 | Condo/Co-op   | Tom Green     |
      | TX_786 | Condo/Co-op   | Travis        |
      | TX_787 | Condo/Co-op   | Trinity       |
      | TX_788 | Condo/Co-op   | Tyler         |
      | TX_789 | Condo/Co-op   | Upshur        |
      | TX_790 | Condo/Co-op   | Upton         |
      | TX_791 | Condo/Co-op   | Uvalde        |
      | TX_792 | Condo/Co-op   | Val Verde     |
      | TX_793 | Condo/Co-op   | Van Zandt     |
      | TX_794 | Condo/Co-op   | Victoria      |
      | TX_795 | Condo/Co-op   | Victoria      |
      | TX_796 | Condo/Co-op   | Victoria      |
      | TX_797 | Condo/Co-op   | Victoria      |
      | TX_798 | Condo/Co-op   | Walker        |
      | TX_799 | Condo/Co-op   | Waller        |
      | TX_800 | Condo/Co-op   | Ward          |
      | TX_801 | Condo/Co-op   | Washington    |
      | TX_802 | Condo/Co-op   | Webb          |
      | TX_803 | Condo/Co-op   | Wharton       |
      | TX_804 | Condo/Co-op   | Wheeler       |
      | TX_805 | Condo/Co-op   | Wichita       |
      | TX_806 | Condo/Co-op   | Wilbarger     |
      | TX_807 | Condo/Co-op   | Willacy       |
      | TX_808 | Condo/Co-op   | Willacy       |
      | TX_809 | Condo/Co-op   | Willacy       |
      | TX_810 | Condo/Co-op   | Willacy       |
      | TX_811 | Condo/Co-op   | Willacy       |
      | TX_812 | Condo/Co-op   | Williamson    |
      | TX_813 | Condo/Co-op   | Wilson        |
      | TX_814 | Condo/Co-op   | Winkler       |
      | TX_815 | Condo/Co-op   | Wise          |
      | TX_816 | Condo/Co-op   | Wood          |
      | TX_817 | Condo/Co-op   | Yoakum        |
      | TX_818 | Condo/Co-op   | Young         |
      | TX_819 | Condo/Co-op   | Zapata        |
      | TX_820 | Condo/Co-op   | Zavala        |

    @E2E_PSE
    Examples:
      | TC_ID  | ResidenceType | County    |
      | TX_545 | Condo/Co-op   | Cameron   |
      | TX_620 | Condo/Co-op   | Hale      |
      | TX_739 | Condo/Co-op   | Potter    |
      | TX_685 | Condo/Co-op   | Lampasas  |
      | TX_701 | Condo/Co-op   | Matagorda |

  @CompareBaseRates @PreProd
  Scenario Outline: US45592 - I compare Accredited "<file1>" and PSE "<file2>" base rates

    Then I compare "<file1>" with "<file2>" base rates in "PRE_PROD/US45592/"

    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_TX_001_750059157986.xlsx| PSE/Base_Rates_TX_001_750111866646.xlsx |
      | Accredited/Base_Rates_TX_002_750059155256.xlsx| PSE/Base_Rates_TX_002_750106237196.xlsx |
      | Accredited/Base_Rates_TX_003_750067237326.xlsx| PSE/Base_Rates_TX_003_750106240786.xlsx |
      | Accredited/Base_Rates_TX_009_750059160056.xlsx| PSE/Base_Rates_TX_009_750111870386.xlsx |
      | Accredited/Base_Rates_TX_010_750059156086.xlsx| PSE/Base_Rates_TX_010_750106235606.xlsx |
      | Accredited/Base_Rates_TX_011_750059158316.xlsx| PSE/Base_Rates_TX_011_750111866986.xlsx |
      | Accredited/Base_Rates_TX_012_750059159026.xlsx| PSE/Base_Rates_TX_012_750106240036.xlsx |
      | Accredited/Base_Rates_TX_013_750077395546.xlsx| PSE/Base_Rates_TX_013_750106264566.xlsx |
      | Accredited/Base_Rates_TX_014_750059155566.xlsx| PSE/Base_Rates_TX_014_750106332446.xlsx |
      | Accredited/Base_Rates_TX_015_750059192876.xlsx| PSE/Base_Rates_TX_015_750111868626.xlsx |
      | Accredited/Base_Rates_TX_016_750059217776.xlsx| PSE/Base_Rates_TX_016_750111867716.xlsx |
      | Accredited/Base_Rates_TX_017_750059217026.xlsx| PSE/Base_Rates_TX_017_750111864966.xlsx |
      | Accredited/Base_Rates_TX_018_750059378366.xlsx| PSE/Base_Rates_TX_018_750106534096.xlsx |
      | Accredited/Base_Rates_TX_019_750059379996.xlsx| PSE/Base_Rates_TX_019_750111865216.xlsx |
      | Accredited/Base_Rates_TX_020_750059382286.xlsx| PSE/Base_Rates_TX_020_750107698446.xlsx |
      | Accredited/Base_Rates_TX_021_750059384536.xlsx| PSE/Base_Rates_TX_021_750111864446.xlsx |
      | Accredited/Base_Rates_TX_022_750059385506.xlsx| PSE/Base_Rates_TX_022_750107723926.xlsx |
      | Accredited/Base_Rates_TX_023_750059387216.xlsx| PSE/Base_Rates_TX_023_750112066996.xlsx |
      | Accredited/Base_Rates_TX_025_750067238066.xlsx| PSE/Base_Rates_TX_025_750107727496.xlsx |
      | Accredited/Base_Rates_TX_030_750059457856.xlsx| PSE/Base_Rates_TX_030_750107725726.xlsx |
      | Accredited/Base_Rates_TX_031_750059498716.xlsx| PSE/Base_Rates_TX_031_750112069726.xlsx |
      | Accredited/Base_Rates_TX_032_750059501126.xlsx| PSE/Base_Rates_TX_032_750107732126.xlsx |
      | Accredited/Base_Rates_TX_033_750059504096.xlsx| PSE/Base_Rates_TX_033_750112068976.xlsx |
      | Accredited/Base_Rates_TX_034_750059942486.xlsx| PSE/Base_Rates_TX_034_750107792096.xlsx |
      | Accredited/Base_Rates_TX_035_750059980356.xlsx| PSE/Base_Rates_TX_035_750112067516.xlsx |
      | Accredited/Base_Rates_TX_036_750059989196.xlsx| PSE/Base_Rates_TX_036_750112068216.xlsx |
      | Accredited/Base_Rates_TX_037_750067236746.xlsx| PSE/Base_Rates_TX_037_750107906346.xlsx |
      | Accredited/Base_Rates_TX_043_750060003666.xlsx| PSE/Base_Rates_TX_043_750112070406.xlsx |
      | Accredited/Base_Rates_TX_050_750060131446.xlsx| PSE/Base_Rates_TX_050_750108005326.xlsx |
      | Accredited/Base_Rates_TX_052_750060160766.xlsx| PSE/Base_Rates_TX_052_750108011766.xlsx |
      | Accredited/Base_Rates_TX_058_750060165626.xlsx| PSE/Base_Rates_TX_058_750108028016.xlsx |
      | Accredited/Base_Rates_TX_059_750060175156.xlsx| PSE/Base_Rates_TX_059_750112065696.xlsx |
      | Accredited/Base_Rates_TX_060_750060203926.xlsx| PSE/Base_Rates_TX_060_750108057456.xlsx |
      | Accredited/Base_Rates_TX_061_750060205246.xlsx| PSE/Base_Rates_TX_061_750112070106.xlsx |
      | Accredited/Base_Rates_TX_062_750060376506.xlsx| PSE/Base_Rates_TX_062_750108060586.xlsx |
      | Accredited/Base_Rates_TX_063_750067257326.xlsx| PSE/Base_Rates_TX_063_750108077766.xlsx |
      | Accredited/Base_Rates_TX_064_750060388116.xlsx| PSE/Base_Rates_TX_064_750108103536.xlsx |
      | Accredited/Base_Rates_TX_065_750060391146.xlsx| PSE/Base_Rates_TX_065_750112526056.xlsx |
      | Accredited/Base_Rates_TX_067_750060654966.xlsx| PSE/Base_Rates_TX_067_750112525806.xlsx |
      | Accredited/Base_Rates_TX_068_750060655546.xlsx| PSE/Base_Rates_TX_068_750108159866.xlsx |
      | Accredited/Base_Rates_TX_070_750060729406.xlsx| PSE/Base_Rates_TX_070_750108195196.xlsx |
      | Accredited/Base_Rates_TX_071_750060760896.xlsx| PSE/Base_Rates_TX_071_750112526306.xlsx |
      | Accredited/Base_Rates_TX_072_750060763696.xlsx| PSE/Base_Rates_TX_072_750107359116.xlsx |
      | Accredited/Base_Rates_TX_073_750067281846.xlsx| PSE/Base_Rates_TX_073_750107358706.xlsx |
      | Accredited/Base_Rates_TX_074_750060857236.xlsx| PSE/Base_Rates_TX_074_750107357506.xlsx |
      | Accredited/Base_Rates_TX_075_750067338376.xlsx| PSE/Base_Rates_TX_075_750107359726.xlsx |
      | Accredited/Base_Rates_TX_076_750060897756.xlsx| PSE/Base_Rates_TX_076_750112527606.xlsx |
      | Accredited/Base_Rates_TX_077_750060904416.xlsx| PSE/Base_Rates_TX_077_750112528606.xlsx |
      | Accredited/Base_Rates_TX_078_750060989906.xlsx| PSE/Base_Rates_TX_078_750107357756.xlsx |
      | Accredited/Base_Rates_TX_079_750061017086.xlsx| PSE/Base_Rates_TX_079_750112528696.xlsx |
      | Accredited/Base_Rates_TX_080_750061016776.xlsx| PSE/Base_Rates_TX_080_750108221506.xlsx |
      | Accredited/Base_Rates_TX_082_750061075696.xlsx| PSE/Base_Rates_TX_082_750108236966.xlsx |
      | Accredited/Base_Rates_TX_083_750061138856.xlsx| PSE/Base_Rates_TX_083_750112525556.xlsx |
      | Accredited/Base_Rates_TX_084_750061147306.xlsx| PSE/Base_Rates_TX_084_750108240046.xlsx |
      | Accredited/Base_Rates_TX_085_750068049816.xlsx| PSE/Base_Rates_TX_085_750108248116.xlsx |
      | Accredited/Base_Rates_TX_087_750068066636.xlsx| PSE/Base_Rates_TX_087_750108275926.xlsx |
      | Accredited/Base_Rates_TX_088_750068156226.xlsx| PSE/Base_Rates_TX_088_750108288876.xlsx |
      | Accredited/Base_Rates_TX_089_750068126236.xlsx| PSE/Base_Rates_TX_089_750108315966.xlsx |
      | Accredited/Base_Rates_TX_090_750068161526.xlsx| PSE/Base_Rates_TX_090_750108320196.xlsx |
      | Accredited/Base_Rates_TX_092_750069112846.xlsx| PSE/Base_Rates_TX_092_750108367386.xlsx |
      | Accredited/Base_Rates_TX_093_750069573806.xlsx| PSE/Base_Rates_TX_093_750108369196.xlsx |
      | Accredited/Base_Rates_TX_094_750069586576.xlsx| PSE/Base_Rates_TX_094_750108386096.xlsx |
      | Accredited/Base_Rates_TX_095_750070843416.xlsx| PSE/Base_Rates_TX_095_750108389526.xlsx |
      | Accredited/Base_Rates_TX_097_750070997706.xlsx| PSE/Base_Rates_TX_097_750108427146.xlsx |
      | Accredited/Base_Rates_TX_098_750071010646.xlsx| PSE/Base_Rates_TX_098_750108447746.xlsx |
      | Accredited/Base_Rates_TX_099_750071018506.xlsx| PSE/Base_Rates_TX_099_750108450706.xlsx |
      | Accredited/Base_Rates_TX_100_750071778786.xlsx| PSE/Base_Rates_TX_100_750108506946.xlsx |
      | Accredited/Base_Rates_TX_102_750072134936.xlsx| PSE/Base_Rates_TX_102_750108557186.xlsx |
      | Accredited/Base_Rates_TX_103_750072159326.xlsx| PSE/Base_Rates_TX_103_750108574806.xlsx |
      | Accredited/Base_Rates_TX_104_750072580756.xlsx| PSE/Base_Rates_TX_104_750108580876.xlsx |
      | Accredited/Base_Rates_TX_105_750105606546.xlsx| PSE/Base_Rates_TX_105_750108596806.xlsx |
      | Accredited/Base_Rates_TX_110_750073206676.xlsx| PSE/Base_Rates_TX_110_750108619536.xlsx |
      | Accredited/Base_Rates_TX_112_750078384376.xlsx| PSE/Base_Rates_TX_112_750108640096.xlsx |
      | Accredited/Base_Rates_TX_113_750073409546.xlsx| PSE/Base_Rates_TX_113_750108644626.xlsx |
      | Accredited/Base_Rates_TX_114_750073516926.xlsx| PSE/Base_Rates_TX_114_750108679716.xlsx |
      | Accredited/Base_Rates_TX_115_750073531006.xlsx| PSE/Base_Rates_TX_115_750108686246.xlsx |
      | Accredited/Base_Rates_TX_117_750073637486.xlsx| PSE/Base_Rates_TX_117_750108701596.xlsx |
      | Accredited/Base_Rates_TX_118_750073640786.xlsx| PSE/Base_Rates_TX_118_750108706526.xlsx |
      | Accredited/Base_Rates_TX_119_750073768126.xlsx| PSE/Base_Rates_TX_119_750108723556.xlsx |
      | Accredited/Base_Rates_TX_120_750073788046.xlsx| PSE/Base_Rates_TX_120_750108745576.xlsx |
      | Accredited/Base_Rates_TX_122_750074106036.xlsx| PSE/Base_Rates_TX_122_750108818246.xlsx |
      | Accredited/Base_Rates_TX_123_750074167036.xlsx| PSE/Base_Rates_TX_123_750108863166.xlsx |
      | Accredited/Base_Rates_TX_124_750074212656.xlsx| PSE/Base_Rates_TX_124_750108867586.xlsx |
      | Accredited/Base_Rates_TX_125_750074215406.xlsx| PSE/Base_Rates_TX_125_750108874576.xlsx |
      | Accredited/Base_Rates_TX_130_750074280656.xlsx| PSE/Base_Rates_TX_130_750108893936.xlsx |
      | Accredited/Base_Rates_TX_132_750074376446.xlsx| PSE/Base_Rates_TX_132_750108912746.xlsx |
      | Accredited/Base_Rates_TX_133_750074403366.xlsx| PSE/Base_Rates_TX_133_750108931366.xlsx |
      | Accredited/Base_Rates_TX_134_750078572086.xlsx| PSE/Base_Rates_TX_134_750108942696.xlsx |
      | Accredited/Base_Rates_TX_135_750078577146.xlsx| PSE/Base_Rates_TX_135_750108950086.xlsx |
      | Accredited/Base_Rates_TX_137_750078688276.xlsx| PSE/Base_Rates_TX_137_750109009536.xlsx |
      | Accredited/Base_Rates_TX_138_750078733286.xlsx| PSE/Base_Rates_TX_138_750109025336.xlsx |
      | Accredited/Base_Rates_TX_139_750078777186.xlsx| PSE/Base_Rates_TX_139_750109047626.xlsx |
      | Accredited/Base_Rates_TX_140_750078866516.xlsx| PSE/Base_Rates_TX_140_750109058516.xlsx |
      | Accredited/Base_Rates_TX_142_750080443126.xlsx| PSE/Base_Rates_TX_142_750109773516.xlsx |
      | Accredited/Base_Rates_TX_143_750080445086.xlsx| PSE/Base_Rates_TX_143_750110282746.xlsx |
      | Accredited/Base_Rates_TX_144_750080446396.xlsx| PSE/Base_Rates_TX_144_750110295746.xlsx |
      | Accredited/Base_Rates_TX_145_750080444836.xlsx| PSE/Base_Rates_TX_145_750110302036.xlsx |
      | Accredited/Base_Rates_TX_147_750080441826.xlsx| PSE/Base_Rates_TX_147_750110365446.xlsx |
      | Accredited/Base_Rates_TX_152_750080657886.xlsx| PSE/Base_Rates_TX_152_750110400726.xlsx |
      | Accredited/Base_Rates_TX_153_750080657576.xlsx| PSE/Base_Rates_TX_153_750110407696.xlsx |
      | Accredited/Base_Rates_TX_157_750080742256.xlsx| PSE/Base_Rates_TX_157_750110419616.xlsx |
      | Accredited/Base_Rates_TX_159_750081167136.xlsx| PSE/Base_Rates_TX_159_750110535766.xlsx |
      | Accredited/Base_Rates_TX_160_750081173536.xlsx| PSE/Base_Rates_TX_160_750110576506.xlsx |
      | Accredited/Base_Rates_TX_162_750081177456.xlsx| PSE/Base_Rates_TX_162_750110586576.xlsx |
      | Accredited/Base_Rates_TX_663_750081906786.xlsx| PSE/Base_Rates_TX_663_750097694456.xlsx |
      | Accredited/Base_Rates_TX_664_750081903866.xlsx| PSE/Base_Rates_TX_664_750097690076.xlsx |
      | Accredited/Base_Rates_TX_665_750081904316.xlsx| PSE/Base_Rates_TX_665_750097691306.xlsx |
      | Accredited/Base_Rates_TX_670_750097387716.xlsx| PSE/Base_Rates_TX_670_750097692126.xlsx |
      | Accredited/Base_Rates_TX_671_750090670436.xlsx| PSE/Base_Rates_TX_671_750097691556.xlsx |
      | Accredited/Base_Rates_TX_672_750081908236.xlsx| PSE/Base_Rates_TX_672_750097689826.xlsx |
      | Accredited/Base_Rates_TX_673_750081903496.xlsx| PSE/Base_Rates_TX_673_750097689576.xlsx |
      | Accredited/Base_Rates_TX_674_750081906126.xlsx| PSE/Base_Rates_TX_674_750097691896.xlsx |
      | Accredited/Base_Rates_TX_675_750082157546.xlsx| PSE/Base_Rates_TX_675_750098006756.xlsx |
      | Accredited/Base_Rates_TX_676_750097392946.xlsx| PSE/Base_Rates_TX_676_750098006196.xlsx |
      | Accredited/Base_Rates_TX_681_750090675216.xlsx| PSE/Base_Rates_TX_681_750098010456.xlsx |
      | Accredited/Base_Rates_TX_682_750082677456.xlsx| PSE/Base_Rates_TX_682_750098010786.xlsx |
      | Accredited/Base_Rates_TX_683_750082682436.xlsx| PSE/Base_Rates_TX_683_750098009576.xlsx |
      | Accredited/Base_Rates_TX_684_750082684846.xlsx| PSE/Base_Rates_TX_684_750098015246.xlsx |
      | Accredited/Base_Rates_TX_685_750082683536.xlsx| PSE/Base_Rates_TX_685_750098013726.xlsx |
      | Accredited/Base_Rates_TX_686_750090676656.xlsx| PSE/Base_Rates_TX_686_750098017616.xlsx |
      | Accredited/Base_Rates_TX_687_750082686906.xlsx| PSE/Base_Rates_TX_687_750098171726.xlsx |
      | Accredited/Base_Rates_TX_688_750082691156.xlsx| PSE/Base_Rates_TX_688_750098176726.xlsx |
      | Accredited/Base_Rates_TX_689_750091608266.xlsx| PSE/Base_Rates_TX_689_750098177656.xlsx |
      | Accredited/Base_Rates_TX_690_750082883416.xlsx| PSE/Base_Rates_TX_690_750098181096.xlsx |
      | Accredited/Base_Rates_TX_691_750090671006.xlsx| PSE/Base_Rates_TX_691_750098179836.xlsx |
      | Accredited/Base_Rates_TX_692_750083044766.xlsx| PSE/Base_Rates_TX_692_750098180386.xlsx |
      | Accredited/Base_Rates_TX_693_750083219746.xlsx| PSE/Base_Rates_TX_693_750098179096.xlsx |
      | Accredited/Base_Rates_TX_694_750083219226.xlsx| PSE/Base_Rates_TX_694_750104471786.xlsx |
      | Accredited/Base_Rates_TX_695_750083220706.xlsx| PSE/Base_Rates_TX_695_750098212636.xlsx |
      | Accredited/Base_Rates_TX_696_750090677776.xlsx| PSE/Base_Rates_TX_696_750098325966.xlsx |
      | Accredited/Base_Rates_TX_697_750083227096.xlsx| PSE/Base_Rates_TX_697_750098328276.xlsx |
      | Accredited/Base_Rates_TX_698_750083230266.xlsx| PSE/Base_Rates_TX_698_750098330246.xlsx |
      | Accredited/Base_Rates_TX_699_750083379956.xlsx| PSE/Base_Rates_TX_699_750098332356.xlsx |
      | Accredited/Base_Rates_TX_700_750083400926.xlsx| PSE/Base_Rates_TX_700_750098333116.xlsx |
      | Accredited/Base_Rates_TX_702_750097388176.xlsx| PSE/Base_Rates_TX_702_750098334006.xlsx |
      | Accredited/Base_Rates_TX_706_750090768606.xlsx| PSE/Base_Rates_TX_706_750098336086.xlsx |
      | Accredited/Base_Rates_TX_707_750090770146.xlsx| PSE/Base_Rates_TX_707_750098350136.xlsx |
      | Accredited/Base_Rates_TX_708_750083756896.xlsx| PSE/Base_Rates_TX_708_750098469686.xlsx |
      | Accredited/Base_Rates_TX_709_750083758746.xlsx| PSE/Base_Rates_TX_709_750098470806.xlsx |
      | Accredited/Base_Rates_TX_710_750083758226.xlsx| PSE/Base_Rates_TX_710_750098472346.xlsx |
      | Accredited/Base_Rates_TX_711_750090816156.xlsx| PSE/Base_Rates_TX_711_750098474086.xlsx |
      | Accredited/Base_Rates_TX_712_750083851816.xlsx| PSE/Base_Rates_TX_712_750098475496.xlsx |
      | Accredited/Base_Rates_TX_713_750083914326.xlsx| PSE/Base_Rates_TX_713_750098477176.xlsx |
      | Accredited/Base_Rates_TX_714_750083914076.xlsx| PSE/Base_Rates_TX_714_750098478496.xlsx |
      | Accredited/Base_Rates_TX_715_750083922986.xlsx| PSE/Base_Rates_TX_715_750098488276.xlsx |
      | Accredited/Base_Rates_TX_716_750091344136.xlsx| PSE/Base_Rates_TX_716_750098618676.xlsx |
      | Accredited/Base_Rates_TX_717_750084200386.xlsx| PSE/Base_Rates_TX_717_750098620016.xlsx |
      | Accredited/Base_Rates_TX_718_750084418036.xlsx| PSE/Base_Rates_TX_718_750098621546.xlsx |
      | Accredited/Base_Rates_TX_719_750084420976.xlsx| PSE/Base_Rates_TX_719_750098622616.xlsx |
      | Accredited/Base_Rates_TX_720_750084492816.xlsx| PSE/Base_Rates_TX_720_750098624026.xlsx |
      | Accredited/Base_Rates_TX_721_750091610396.xlsx| PSE/Base_Rates_TX_721_750098625586.xlsx |
      | Accredited/Base_Rates_TX_722_750084796146.xlsx| PSE/Base_Rates_TX_722_750103675116.xlsx |
      | Accredited/Base_Rates_TX_723_750084799006.xlsx| PSE/Base_Rates_TX_723_750098638516.xlsx |
      | Accredited/Base_Rates_TX_724_750084797476.xlsx| PSE/Base_Rates_TX_724_750098653966.xlsx |
      | Accredited/Base_Rates_TX_727_750097386616.xlsx| PSE/Base_Rates_TX_727_750098818926.xlsx |
      | Accredited/Base_Rates_TX_730_750091606166.xlsx| PSE/Base_Rates_TX_730_750098820726.xlsx |
      | Accredited/Base_Rates_TX_731_750091606886.xlsx| PSE/Base_Rates_TX_731_750098822316.xlsx |
      | Accredited/Base_Rates_TX_732_750091652276.xlsx| PSE/Base_Rates_TX_732_750098823266.xlsx |
      | Accredited/Base_Rates_TX_733_750091650796.xlsx| PSE/Base_Rates_TX_733_750098826276.xlsx |
      | Accredited/Base_Rates_TX_734_750091651516.xlsx| PSE/Base_Rates_TX_734_750098827906.xlsx |
      | Accredited/Base_Rates_TX_735_750091656976.xlsx| PSE/Base_Rates_TX_735_750098861366.xlsx |
      | Accredited/Base_Rates_TX_736_750091905476.xlsx| PSE/Base_Rates_TX_736_750098879616.xlsx |
      | Accredited/Base_Rates_TX_737_750091959636.xlsx| PSE/Base_Rates_TX_737_750100163846.xlsx |
      | Accredited/Base_Rates_TX_738_750091965926.xlsx| PSE/Base_Rates_TX_738_750100165946.xlsx |
      | Accredited/Base_Rates_TX_739_750091966946.xlsx| PSE/Base_Rates_TX_739_750100168576.xlsx |
      | Accredited/Base_Rates_TX_740_750096059736.xlsx| PSE/Base_Rates_TX_740_750100172906.xlsx |
      | Accredited/Base_Rates_TX_741_750093244036.xlsx| PSE/Base_Rates_TX_741_750100176306.xlsx |
      | Accredited/Base_Rates_TX_742_750093242336.xlsx| PSE/Base_Rates_TX_742_750100177756.xlsx |
      | Accredited/Base_Rates_TX_743_750093240196.xlsx| PSE/Base_Rates_TX_743_750100201056.xlsx |
      | Accredited/Base_Rates_TX_744_750093249146.xlsx| PSE/Base_Rates_TX_744_750100222366.xlsx |
      | Accredited/Base_Rates_TX_745_750093248316.xlsx| PSE/Base_Rates_TX_745_750100455316.xlsx |
      | Accredited/Base_Rates_TX_746_750093338096.xlsx| PSE/Base_Rates_TX_746_750100456566.xlsx |
      | Accredited/Base_Rates_TX_750_750097385896.xlsx| PSE/Base_Rates_TX_750_750100459186.xlsx |
      | Accredited/Base_Rates_TX_752_750093341126.xlsx| PSE/Base_Rates_TX_752_750100460566.xlsx |
      | Accredited/Base_Rates_TX_753_750093625486.xlsx| PSE/Base_Rates_TX_753_750100462706.xlsx |
      | Accredited/Base_Rates_TX_754_750092391626.xlsx| PSE/Base_Rates_TX_754_750100464076.xlsx |
      | Accredited/Base_Rates_TX_755_750092391826.xlsx| PSE/Base_Rates_TX_755_750100614036.xlsx |
      | Accredited/Base_Rates_TX_756_750093809326.xlsx| PSE/Base_Rates_TX_756_750100630066.xlsx |
      | Accredited/Base_Rates_TX_757_750092391076.xlsx| PSE/Base_Rates_TX_757_750100819416.xlsx |
      | Accredited/Base_Rates_TX_758_750092391376.xlsx| PSE/Base_Rates_TX_758_750103672956.xlsx |
      | Accredited/Base_Rates_TX_759_750092394816.xlsx| PSE/Base_Rates_TX_759_750103673046.xlsx |
      | Accredited/Base_Rates_TX_764_750092395436.xlsx| PSE/Base_Rates_TX_764_750100823696.xlsx |
      | Accredited/Base_Rates_TX_765_750092413826.xlsx| PSE/Base_Rates_TX_765_750100825536.xlsx |
      | Accredited/Base_Rates_TX_766_750092497046.xlsx| PSE/Base_Rates_TX_766_750100826516.xlsx |
      | Accredited/Base_Rates_TX_767_750096056746.xlsx| PSE/Base_Rates_TX_767_750100827456.xlsx |
      | Accredited/Base_Rates_TX_768_750092546286.xlsx| PSE/Base_Rates_TX_768_750100830606.xlsx |
      | Accredited/Base_Rates_TX_769_750092545206.xlsx| PSE/Base_Rates_TX_769_750100841946.xlsx |
      | Accredited/Base_Rates_TX_770_750093812136.xlsx| PSE/Base_Rates_TX_770_750103674686.xlsx |
      | Accredited/Base_Rates_TX_771_750093813296.xlsx| PSE/Base_Rates_TX_771_750101592096.xlsx |
      | Accredited/Base_Rates_TX_772_750092550056.xlsx| PSE/Base_Rates_TX_772_750101696586.xlsx |
      | Accredited/Base_Rates_TX_773_750092561306.xlsx| PSE/Base_Rates_TX_773_750101701516.xlsx |
      | Accredited/Base_Rates_TX_774_750092563636.xlsx| PSE/Base_Rates_TX_774_750101704836.xlsx |
      | Accredited/Base_Rates_TX_775_750092594496.xlsx| PSE/Base_Rates_TX_775_750101705596.xlsx |
      | Accredited/Base_Rates_TX_776_750092603046.xlsx| PSE/Base_Rates_TX_776_750101708626.xlsx |
      | Accredited/Base_Rates_TX_777_750093814856.xlsx| PSE/Base_Rates_TX_777_750101709946.xlsx |
      | Accredited/Base_Rates_TX_778_750093933966.xlsx| PSE/Base_Rates_TX_778_750101724406.xlsx |
      | Accredited/Base_Rates_TX_779_750093935526.xlsx| PSE/Base_Rates_TX_779_750102662426.xlsx |
      | Accredited/Base_Rates_TX_780_750093938056.xlsx| PSE/Base_Rates_TX_780_750102831776.xlsx |
      | Accredited/Base_Rates_TX_781_750094106596.xlsx| PSE/Base_Rates_TX_781_750102837056.xlsx |
      | Accredited/Base_Rates_TX_782_750094191956.xlsx| PSE/Base_Rates_TX_782_750102839106.xlsx |
      | Accredited/Base_Rates_TX_783_750094197686.xlsx| PSE/Base_Rates_TX_783_750102841576.xlsx |
      | Accredited/Base_Rates_TX_784_750094201806.xlsx| PSE/Base_Rates_TX_784_750102843176.xlsx |
      | Accredited/Base_Rates_TX_785_750094203006.xlsx| PSE/Base_Rates_TX_785_750102844006.xlsx |
      | Accredited/Base_Rates_TX_786_750094467806.xlsx| PSE/Base_Rates_TX_786_750102858096.xlsx |
      | Accredited/Base_Rates_TX_787_750094468326.xlsx| PSE/Base_Rates_TX_787_750102967146.xlsx |
      | Accredited/Base_Rates_TX_788_750094470616.xlsx| PSE/Base_Rates_TX_788_750103047876.xlsx |
      | Accredited/Base_Rates_TX_789_750094681756.xlsx| PSE/Base_Rates_TX_789_750103058996.xlsx |
      | Accredited/Base_Rates_TX_790_750094869256.xlsx| PSE/Base_Rates_TX_790_750103060736.xlsx |
      | Accredited/Base_Rates_TX_791_750094871816.xlsx| PSE/Base_Rates_TX_791_750103065126.xlsx |
      | Accredited/Base_Rates_TX_792_750094879146.xlsx| PSE/Base_Rates_TX_792_750103069396.xlsx |
      | Accredited/Base_Rates_TX_793_750094876446.xlsx| PSE/Base_Rates_TX_793_750103068466.xlsx |
      | Accredited/Base_Rates_TX_794_750097387376.xlsx| PSE/Base_Rates_TX_794_750103133256.xlsx |
      | Accredited/Base_Rates_TX_799_750094973016.xlsx| PSE/Base_Rates_TX_799_750103221436.xlsx |
      | Accredited/Base_Rates_TX_800_750094975266.xlsx| PSE/Base_Rates_TX_800_750103676666.xlsx |
      | Accredited/Base_Rates_TX_801_750095019656.xlsx| PSE/Base_Rates_TX_801_750103673356.xlsx |
      | Accredited/Base_Rates_TX_802_750095065896.xlsx| PSE/Base_Rates_TX_802_750103674176.xlsx |
      | Accredited/Base_Rates_TX_803_750096107246.xlsx| PSE/Base_Rates_TX_803_750104472706.xlsx |
      | Accredited/Base_Rates_TX_804_750096343196.xlsx| PSE/Base_Rates_TX_804_750104474636.xlsx |
      | Accredited/Base_Rates_TX_805_750096341926.xlsx| PSE/Base_Rates_TX_805_750104471086.xlsx |
      | Accredited/Base_Rates_TX_806_750096345516.xlsx| PSE/Base_Rates_TX_806_750104469556.xlsx |
      | Accredited/Base_Rates_TX_809_750096346226.xlsx| PSE/Base_Rates_TX_809_750104476886.xlsx |
      | Accredited/Base_Rates_TX_812_750096346496.xlsx| PSE/Base_Rates_TX_812_750104477586.xlsx |
      | Accredited/Base_Rates_TX_813_750097388896.xlsx| PSE/Base_Rates_TX_813_750104470086.xlsx |
      | Accredited/Base_Rates_TX_814_750092941656.xlsx| PSE/Base_Rates_TX_814_750104850766.xlsx |
      | Accredited/Base_Rates_TX_815_750092942476.xlsx| PSE/Base_Rates_TX_815_750104855276.xlsx |
      | Accredited/Base_Rates_TX_816_750092943116.xlsx| PSE/Base_Rates_TX_816_750104851866.xlsx |
      | Accredited/Base_Rates_TX_817_750092941906.xlsx| PSE/Base_Rates_TX_817_750104853656.xlsx |
      | Accredited/Base_Rates_TX_818_750092941566.xlsx| PSE/Base_Rates_TX_818_750104853906.xlsx |
      | Accredited/Base_Rates_TX_819_750092943296.xlsx| PSE/Base_Rates_TX_819_750104858036.xlsx |
      | Accredited/Base_Rates_TX_820_750092942156.xlsx| PSE/Base_Rates_TX_820_750104859266.xlsx |

    @E2E_PSECompare
    Examples:
      | file1                                          | file2                                   |
      | Accredited/Base_Rates_TX_002_766005242229.xlsx | PSE/Base_Rates_TX_002_766005369509.xlsx |
      | Accredited/Base_Rates_TX_003_766005240719.xlsx | PSE/Base_Rates_TX_003_766005368129.xlsx |
      | Accredited/Base_Rates_TX_010_766005240809.xlsx | PSE/Base_Rates_TX_010_766005373649.xlsx |
      | Accredited/Base_Rates_TX_075_766005241959.xlsx | PSE/Base_Rates_TX_075_766005506479.xlsx |
      | Accredited/Base_Rates_TX_120_766005242519.xlsx | PSE/Base_Rates_TX_120_766005370599.xlsx |
      | Accredited/Base_Rates_TX_545_766005243349.xlsx | PSE/Base_Rates_TX_545_766005510719.xlsx |
      | Accredited/Base_Rates_TX_620_766005245379.xlsx | PSE/Base_Rates_TX_620_766005512759.xlsx |
      | Accredited/Base_Rates_TX_685_766005366009.xlsx | PSE/Base_Rates_TX_685_766005518309.xlsx |
      | Accredited/Base_Rates_TX_701_766005371339.xlsx | PSE/Base_Rates_TX_701_766005519609.xlsx |
      | Accredited/Base_Rates_TX_739_766005364909.xlsx | PSE/Base_Rates_TX_739_766005516969.xlsx |