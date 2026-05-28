Feature: Claims scenario 2 - NB Surplus Policies for each Programs carrier

  @ClaimsScenario2
  Scenario Outline: Claims scenario - <TC_ID>
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorHS" for "HS" LOB
    * I set "System Validation Only LLC" as Agency Name and "14673900" as Agency ID
#    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "A1"
#    * I am logged in to Pure as Field
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "HS" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I logout


    @ClaimsScenario2.1
    Examples:
      | TC_ID      |
      | 2_1_NY_001 |
      | 2_1_MS_001 |
      | 2_1_AL_001 |
      | 2_1_CA_001 |
      | 2_1_GA_001 |
      | 2_1_LA_001 |
      | 2_1_MA_001 |
      | 2_1_SC_001 |
      | 2_1_NJ_001 |
      | 2_1_NC_001 |
      | 2_1_TX_001 |
      | 2_1_FL_001 |
      | 2_1_NJ_001 |
      | 2_1_NC_001 |
      | 2_1_TX_001 |
      | 2_1_FL_001 |

    @ClaimsScenario2.2
    Examples:
      | TC_ID      |
      | 2_2_NY_001 |
      | 2_2_MS_001 |
      | 2_2_AL_001 |
      | 2_2_CA_001 |
      | 2_2_GA_001 |
      | 2_2_LA_001 |
      | 2_2_MA_001 |
      | 2_2_SC_001 |
      | 2_2_NJ_001 |
      | 2_2_NC_001 |
      | 2_2_TX_001 |
      | 2_2_FL_001 |
      | 2_2_NJ_001 |
      | 2_2_NC_001 |
      | 2_2_TX_001 |
      | 2_2_FL_001 |

    @ClaimsScenario2.3
    Examples:
      | TC_ID      |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |
      | 2_3_CA_001 |

    @ClaimsScenario2.4
    Examples:
      | TC_ID      |
      | 2_4_NY_001 |
      | 2_4_MS_001 |
      | 2_4_AL_001 |
      | 2_4_CA_001 |
      | 2_4_GA_001 |
      | 2_4_LA_001 |
      | 2_4_MA_001 |
      | 2_4_SC_001 |
      | 2_4_NJ_001 |
      | 2_4_NC_001 |
      | 2_4_TX_001 |
      | 2_4_FL_001 |
      | 2_4_NC_001 |
      | 2_4_TX_001 |
      | 2_4_FL_001 |


    @ClaimsScenario2.5
    Examples:
      | TC_ID      |
      | 2_5_MS_001 |
      | 2_5_AL_001 |
      | 2_5_GA_001 |
      | 2_5_LA_001 |
      | 2_5_MA_001 |
      | 2_5_SC_001 |
      | 2_5_NJ_001 |
      | 2_5_NC_001 |
      | 2_5_MS_001 |
      | 2_5_AL_001 |
      | 2_5_GA_001 |
      | 2_5_LA_001 |
      | 2_5_MA_001 |
      | 2_5_SC_001 |
      | 2_5_NJ_001 |
      | 2_5_NC_001 |

    @ClaimsScenario2.6
    Examples:
      | TC_ID      |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |
      | 2_6_FL_001 |

    @ClaimsScenario2.7
    Examples:
      | TC_ID      |
      | 2_7_NY_001 |
      | 2_7_TX_001 |
      | 2_7_FL_001 |
      | 2_7_NY_001 |
      | 2_7_TX_001 |
      | 2_7_FL_001 |
      | 2_7_NY_001 |
      | 2_7_TX_001 |
      | 2_7_FL_001 |
      | 2_7_NY_001 |
      | 2_7_TX_001 |
      | 2_7_FL_001 |
      | 2_7_NY_001 |
      | 2_7_TX_001 |
      | 2_7_FL_001 |


    @ClaimsScenario2.8
    Examples:
      | TC_ID      |
      | 2_8_MS_001 |
      | 2_8_AL_001 |
      | 2_8_CA_001 |
      | 2_8_GA_001 |
      | 2_8_LA_001 |
      | 2_8_MA_001 |
      | 2_8_SC_001 |
      | 2_8_NJ_001 |
      | 2_8_NC_001 |
      | 2_8_MS_001 |
      | 2_8_AL_001 |
      | 2_8_CA_001 |
      | 2_8_GA_001 |
      | 2_8_LA_001 |
      | 2_8_MA_001 |
      | 2_8_SC_001 |
      | 2_8_NJ_001 |
      | 2_8_NC_001 |


  @ClaimsScenario2_9
  Scenario Outline: Claims scenario - <TC_ID>
    * I have entered test data for test case "<TC_ID>" in excel workbook "ClaimsQuoteCreation" in sheet "QuoteCreatorES" for "ES" LOB
    * I set "System Validation Only LLC" as Agency Name and "14673900" as Agency ID
#    * I set "Effective_Date" to "10/10/2022"
    When I login with OKTA user "A1"
#    * I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a quote
    * I logout


    @ClaimsScenario2.9
    Examples:
      | TC_ID      |
      | 2_9_NY_001 |
      | 2_9_CA_001 |
      | 2_9_CT_001 |
      | 2_9_MA_001 |
      | 2_9_TX_001 |
      | 2_9_FL_001 |
      | 2_9_NY_001 |
      | 2_9_CA_001 |
      | 2_9_CT_001 |
      | 2_9_MA_001 |
      | 2_9_TX_001 |
      | 2_9_FL_001 |
      | 2_9_NY_001 |
      | 2_9_CA_001 |
      | 2_9_CT_001 |
      | 2_9_MA_001 |
      | 2_9_TX_001 |
      | 2_9_FL_001 |
      | 2_9_CT_001 |
      | 2_9_MA_001 |
      | 2_9_TX_001 |
      | 2_9_FL_001 |




