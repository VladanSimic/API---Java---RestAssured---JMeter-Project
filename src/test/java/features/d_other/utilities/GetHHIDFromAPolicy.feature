Feature: Get HHID for Policy

  Scenario Outline: Get HHID for Policy "<policyID>"

    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I get customer account ID

    Examples:
      | policyID    |
      | CO511432400 |
