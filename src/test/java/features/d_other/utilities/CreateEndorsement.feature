Feature: Create endorsement without processing it
  As a user i want to create an endorsement but I do not want to process it so I can add some changes later on.

  Scenario Outline: Create an endorsement for policy "<policyID>" without processing it

    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I create an endorsement on "<date>" without processing

    Examples:
      | policyID | state |