@PA @Referrals
Feature: Personal Auto Referrals

  @NewBusiness
  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX New Business for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data for "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "PA" LOB
    * I am logged in to Pure as "<subrole>"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "PA" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify that referral "<ruleID>" is "<triggered>"
    * I verify that referral "<ruleID>" "<approvable>"
    * I accept underwriting referrals
    * I get customer account ID

    @ID
    Examples:
      | ruleID    | subrole | triggered | approvable | TC_ID  | workbook    | sheet |
      | R11022532 | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R11009932 | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R10998932 | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R6231414  | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R10289335 | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R11014732 | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R6232614  | Field   | Yes       | Yes        | TC_001 | ReferralsPA | ID    |
      | R6232914  | Field   | Yes       | Yes        | TC_002 | ReferralsPA | ID    |
      | R11020032 | Field   | Yes       | Yes        | TC_003 | ReferralsPA | ID    |
      | R1989707  | Field   | Yes       | Yes        | TC_003 | ReferralsPA | ID    |
      | R5417714  | Field   | Yes       | Yes        | TC_003 | ReferralsPA | ID    |
      | R10287635 | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R11012132 | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R7887814  | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R5297514  | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R5443514  | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R5091014  | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R5091114  | Field   | Yes       | Yes        | TC_005 | ReferralsPA | ID    |
      | R6231514  | Field   | Yes       | Yes        | TC_006 | ReferralsPA | ID    |
      | R5442914  | Field   | Yes       | Yes        | TC_006 | ReferralsPA | ID    |
      | R6231314  | Field   | Yes       | Yes        | TC_006 | ReferralsPA | ID    |
      | R9598433  | Field   | Yes       | Yes        | TC_006 | ReferralsPA | ID    |
      | R11009332 | Field   | Yes       | Yes        | TC_006 | ReferralsPA | ID    |
      | R11012032 | Field   | Yes       | Yes        | TC_004 | ReferralsPA | ID    |
      | R7475514  | Field   | Yes       | Yes        | TC_004 | ReferralsPA | ID    |
      | R6236514  | Field   | Yes       | Yes        | TC_004 | ReferralsPA | ID    |
      | R4304514  | Field   | Yes       | Yes        | TC_007 | ReferralsPA | ID    |
      | R4299614  | Field   | Yes       | Yes        | TC_007 | ReferralsPA | ID    |
      | R10289435 | Field   | Yes       | Yes        | TC_007 | ReferralsPA | ID    |
      | R11010032 | Field   | Yes       | Yes        | TC_008 | ReferralsPA | ID    |
      | R6233214  | Field   | Yes       | Yes        | TC_010 | ReferralsPA | ID    |
      | R5090314  | Field   | Yes       | Yes        | TC_011 | ReferralsPA | ID    |
      | R5090314  | Field   | Yes       | Yes        | TC_011 | ReferralsPA | ID    |
      | R10994432 | Field   | Yes       | Yes        | TC_012 | ReferralsPA | ID    |