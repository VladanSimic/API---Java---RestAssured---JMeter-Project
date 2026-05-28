Feature: LC360

  Background: Login to LC360 through OKTA and navigate to inspections
    * I open OKTA and select LC360 tile
    * I navigate to inspections

  @E2Value
  Scenario Outline: Fill E2Value Form for "<policy>"

    * I search for a policy "<policy>"
    * I select the policy "<policy>"
    * I fill in end to end value "<row>"

    Examples:
      | policy | row |

  @SelfDirected
  Scenario Outline: Fill Underwriter Form Self Directed Interior for "<policy>"

    * I search for a policy "<policy>"
    * I select the policy "<policy>"
    * I change inspection type to self directed interior
    * I fill in underwriter form self directed interior "<row>"

    Examples:
      | policy | row |

  @UWForm
  Scenario Outline: Fill Underwriter Form for "<policy>"

    * I search for a policy "<policy>"
    * I select the policy "<policy>"
    * I fill in underwriter form "<row>"

    Examples:
      | policy | row |