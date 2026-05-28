Feature: Process Transactions
  As a user i want to process large number of transactions on a policy

  Scenario Outline: Create large number of endorsements "<policyID>"

    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I process "<endorsementNum>" endorsements on "<date>"

    Examples:
      | policyID | endorsementNum | date |

  @ProcessRenewal
  Scenario Outline: Create renewal for "<policyID>"

    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I auto process "1" renewal

    Examples:
      | policyID    |