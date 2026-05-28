@Batches @RenewalBatch
Feature: Renewal Processing Batch

  @Collections @Collection
  Scenario Outline: Collections - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I set "SJC_Has_Appraised_2_Years" to "No"
    * I set "SJBVC_Has_Appraised_2_Years" to "No"
    * I set "FACC_Has_Appraised_2_Years" to "No"
    * I set "CC_Has_Appraised_2_Years" to "No"
    * I set "CSSF_Has_Appraised_2_Years" to "No"
    * I set "Wine_Has_Appraised_2_Years" to "No"
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | AK_001 | P1   |
      | AR_001 | P2   |
      | AZ_001 | P3   |
      | CO_001 | P4   |
      | DC_001 | P5   |
      | IA_001 | P6   |

  @COC @CourseOfConstruction
  Scenario Outline: Course of Construction - "<TC_ID>"
    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    When I am logged in to Pure as "P1"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    And I override subjectivities

    Examples:
      | TC_ID  |
      | FL_001 |
      | AZ_001 |
      | CA_001 |
      | CO_001 |
      | CT_001 |
      | DE_001 |
      | HI_001 |

  @ExcessLiability @EX
  Scenario Outline: Excess Liability - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I set "Household_Own_Recreational_Vehicle" to ""
    * I set "Household_Own_Motorcycle_Moped_Scooter" to ""
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | MN_001 | P36  |
      | MO_001 | P37  |
      | MT_001 | P38  |
      | ND_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |

  @ExcessLiabilitySurplus @ES
  Scenario Outline: Excess Liability Surplus - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NY_001 | P82  |
      | CA_001 | P83  |
      | CT_001 | P84  |
      | MA_001 | P85  |
      | TX_001 | P86  |
      | FL_001 | P87  |

  @Homeowners @HO
  Scenario Outline: Homeowners - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | CA_001 | P36  |
      | MO_001 | P37  |
      | NY_001 | P38  |
      | ND_001 | P39  |
      | TX_001 | P40  |
      | FL_001 | P41  |

  @HomeownersSurplus @HS
  Scenario Outline: Homeowners Surplus - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I set "Optional_Coverages_Primary_Flood_Dec_Page_Received" to ""
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NJ_001 | P108 |
      | NC_001 | P109 |
      | TX_001 | P110 |
      | FL_001 | P111 |

  @Auto @Automobile
  Scenario Outline: Auto - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPA" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | FL_001 | P36  |
      | CA_001 | P37  |
      | TX_001 | P38  |
      | NY_001 | P39  |
      | NE_001 | P40  |
      | NH_001 | P41  |
      | NM_001 | P42  |

  @Watercraft
  Scenario Outline: Watercraft - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | FL_001 | P36  |
      | CA_001 | P37  |
      | TX_001 | P38  |
      | NY_001 | P39  |
      | UT_001 | P40  |
      | GA_001 | P41  |
      | NJ_001 | P42  |


  @Collections @Collection @Referred
  Scenario Outline: Collections Referred - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationCO" in sheet "QuoteCreatorCO" for "CO" LOB
    * I set "First_Name" to "Marko"
    * I set "Last_Name" to "Milosevic"
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "CO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NY_001 | P1   |
      | FL_001 | P2   |
      | CA_001 | P3   |

  @Homeowners @HO @Referred
  Scenario Outline: Homeowners Referred - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHO" in sheet "QuoteCreatorHO" for "HO" LOB
    * I set "First_Name" to "Marko"
    * I set "Last_Name" to "Milosevic"
    * I set "Manuscript_Endorsements" to "001"
    * I set "Manuscript_Endorsements_Type_1" to "Premium Adjustment"
    * I set "Manuscript_Endorsements_Title_1" to "title"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "22000"
    * I set "Manuscript_Endorsements_Premium_Rationale_1" to "test"
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HO" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | NY_001 | P36  |
      | CA_001 | P37  |
      | TX_001 | P38  |

  @Auto @Automobile @Referred
  Scenario Outline: Auto Referred - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPA" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "First_Name" to "Marko"
    * I set "Last_Name" to "Milosevic"
    * I set "Manuscript_Endorsements" to "001"
    * I set "Manuscript_Endorsements_Type_1" to "Premium Adjustment"
    * I set "Manuscript_Endorsements_Title_1" to "title"
    * I set "Manuscript_Endorsements_Annual_Manual_Premium_1" to "22000"
    * I set "Manuscript_Endorsements_Manuscript_Endorsements_Edit_Vehicle_1" to "2019 Acura RDX - 5J8TC2H37KL011921/"
    * I set "Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_1" to "22000"
    * I set "Manuscript_Endorsements_Manuscript_Endorsements_Edit_Premium_Adjustment_Rationale_1" to "Test"
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | FL_001 | P36  |
      | CA_001 | P37  |
      | TX_001 | P38  |

  @Watercraft @Referred
  Scenario Outline: Watercraft Referred - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationPW" in sheet "QuoteCreatorPW" for "PW" LOB
    * I set "First_Name" to "Marko"
    * I set "Last_Name" to "Milosevic"
    * I set "Hull_And_Machinery_Limit_Agreed_Value" to "1000001"
    * I set "AOP_Deductible" to "5%"
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PW" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | FL_001 | P36  |
      | CA_001 | P37  |
      | TX_001 | P38  |

  @HomeownersSurplus @HS @Referred
  Scenario Outline: Homeowners Surplus Referred - "<TC_ID>"
    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationHS" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set Effective Date to Today
    * I set Effective Date 340 days in the past
    * I set "Optional_Coverages_Primary_Flood_Dec_Page_Received" to ""
    * I am logged in to Pure as "<user>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I override subjectivities

    Examples:
      | TC_ID  | user |
      | TX_101 | P110 |
      | MS_001 | P112 |
      | AL_001 | P113 |