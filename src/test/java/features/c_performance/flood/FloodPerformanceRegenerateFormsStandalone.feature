@Flood @Performance @RegenerateFormsStandalone
Feature: FS Performance

  Scenario Outline: Scenario 1 - HO flood node to FS New Business - Regenerate forms standalone - "<policyID>"

    When I am logged in to Pure as "<user>"
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements

    * I navigate to New Business summary page
    * I navigate to documents tab
    * I click "regenerate forms" button
    * I think for 20 to 30 seconds

    Examples:
      | policyID    | user |
      | FS265262700 | P100 |
      | FS265262800 | P101 |
      | FS265262900 | P102 |
      | FS265263000 | P103 |
      | FS265263100 | P104 |
      | FS265263200 | P105 |
      | FS265263300 | P106 |
      | FS265263400 | P107 |
      | FS265263500 | P108 |
      | FS265265200 | P109 |
      | FS265265300 | P110 |
      | FS265265400 | P111 |
      | FS265265500 | P112 |
      | FS265265600 | P113 |
      | FS265265700 | P114 |
      | FS265265800 | P115 |
      | FS265265900 | P116 |
      | FS265266100 | P117 |
      | FS265266500 | P118 |
      | FS265266600 | P119 |
      | FS265266700 | P120 |
      | FS265266900 | P121 |
      | FS265267000 | P122 |
      | FS265267100 | P123 |
      | FS265267200 | P124 |
      | FS265267300 | P125 |
      | FS265267400 | P126 |
      | FS265268100 | P127 |
      | FS265268200 | P128 |
      | FS265268300 | P129 |

      | FS265268400 | P130 |