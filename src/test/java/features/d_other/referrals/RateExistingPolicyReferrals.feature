Feature: Excess Referrals - ReRate

  Scenario Outline: Verify that rule: "<ruleID>" triggers: "<triggered>" on EX New Business for role/subrole: "<subrole>" and that it can be approved: "<approvable>" with data in workbook: "<workbook>" sheet: "<sheet>" row: "<row>"

    * I am logged in to Pure as "<subrole>"
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I select a transaction "<transaction>"
    * I navigate to policy image page
    * I review changes
    * I rate a quote
    * I navigate to underwriting referrals page
    * I verify that referral "<ruleID>" is "<triggered>"
    * I verify that referral "<ruleID>" "<approvable>"


    Examples:
      | ruleID | subrole | transaction | triggered | approvable | policyID    |
      | R18    | Field   | Renewal     | Yes       | Yes        | EX228315801 |