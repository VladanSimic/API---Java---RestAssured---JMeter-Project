Feature: Manual Bind a Policy by ID

  Scenario Outline: Manual Bind a Policy by ID "<policyID>"

    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    * I navigate to subjectivities
    * I override subjectivities on subjectivities page
    * I click manual bind

    Examples:
      | policyID |