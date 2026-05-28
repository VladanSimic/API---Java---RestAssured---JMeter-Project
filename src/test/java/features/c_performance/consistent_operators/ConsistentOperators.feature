@Appendix @Performance @Operators
Feature: Consistent Operators

  @Auto @PA @Automobile
  Scenario Outline: Consistent Operators - Automobile - HH ID - <HH_ID>
    Given I use "TX_001" smoke test data from "QuoteCreatorPA" sheet
    When I set "Quote_Line_And_Name_Block_Insurance_Line" to "Personal Auto"
    * I set "Quote_Line_And_Name_Block_Name" to "PA Quote"
    * I set "Licensed_Producer_AWS_STG" to ""
    * I set "Advisor_Servicer_AWS_STG" to ""
    * I set "Customer_ID" to "<HH_ID>"
    And I am logged in to Pure as "<USER>" unless is PROD then "A17"
    When I navigate to customers page
    * I select a customer
    * I get customer primary state on customer details page
    * I navigate to customer page
    * I click new quote button on customer summary page
    * I create a new quote on new quote information page

    Then I think for 10 to 15 seconds
    And I click on obtain operators and vehicles
    Then I navigate to Operators and Vehicles Page

    @BaseLine @Appendix @Performance
    Examples:
      | HH_ID        | USER |
      | 429271371419 | P111 |
      | 105217945619 | P112 |
      | 708967142639 | P113 |
      | 34859432319  | P114 |
      | 44496463619  | P115 |
      | 434501690019 | P116 |
      | 726269968209 | P117 |
      | 285502209819 | P118 |
      | 698457671879 | P119 |
      | 179638514119 | P126 |
      | 172746726419 | P127 |
      | 9037623519   | P121 |
      | 481718765219 | P122 |
      | 714436633689 | P123 |
      | 80469662519  | P124 |

    @Appendix @Performance @Operators @PA @USAppendix
    Examples:
      | HH_ID        | USER |
      | 708967142639 | P112 |
      | 111844316819 | P113 |
      | 28810316719  | P114 |
      | 281214573819 | P115 |
      | 261014739319 | P116 |
      | 693204810449 | P117 |
      | 704474310539 | P118 |
      | 100236049419 | P119 |


  @ExcessLiability @EX
  Scenario Outline: Consistent Operators - Excess Liability - HH ID - <HH_ID>
    Given I use "TX_001" smoke test data from "QuoteCreatorEX" sheet
    When I set "Quote_Line_And_Name_Block_Insurance_Line" to "Excess Liability"
    * I set "Quote_Line_And_Name_Block_Name" to "EX Quote"
    * I set "Licensed_Producer_AWS_STG" to ""
    * I set "Advisor_Servicer_AWS_STG" to ""
    * I set "Customer_ID" to "<HH_ID>"
    And I am logged in to Pure as "<USER>" unless is PROD then "A17"

    When I navigate to customers page
    * I select a customer
    * I get customer primary state on customer details page
    * I navigate to customer page
    * I click new quote button on customer summary page
    * I create a new quote on new quote information page

    Then I think for 10 to 15 seconds
    And I navigate to operator information page

    @BaseLine @Appendix @Performance
    Examples:
      | HH_ID        | USER |
      | 28810316719  | P136 |
      | 598742825519 | P137 |
      | 578176128419 | P138 |
      | 281214573819 | P139 |
      | 261014739319 | P140 |
      | 693204810449 | P147 |
      | 704474310539 | P141 |
      | 100236049419 | P142 |
      | 164894119119 | P143 |
      | 347162587719 | P144 |

    @Appendix @Performance @EX @Operators @USAppendix
    Examples:
      | HH_ID        | USER |
      | 164894119119 | P120 |
      | 347162587719 | P121 |
      | 194360205319 | P122 |
      | 96919080719  | P123 |

  @PersonalWatercraft @Watercraft @PW
  Scenario Outline: Consistent Operators - Personal Watercraft - HH ID - <HH_ID>
    Given I use "TX_001" smoke test data from "QuoteCreatorPW" sheet
    When I set "Quote_Line_And_Name_Block_Insurance_Line" to "Personal Watercraft"
    * I set "Quote_Line_And_Name_Block_Name" to "PW Quote"
    * I set "Licensed_Producer_AWS_STG" to ""
    * I set "Advisor_Servicer_AWS_STG" to ""
    * I set "Customer_ID" to "<HH_ID>"
    And I am logged in to Pure as "<USER>" unless is PROD then "A17"

    When I navigate to customers page
    * I select a customer
    * I get customer primary state on customer details page
    * I navigate to customer page
    * I get customer account ID
    * I click new quote button on customer summary page
    * I create a new quote on new quote information page

    Then I think for 10 to 15 seconds
    And I navigate to Watercraft Policy Page

    @BaseLine @Appendix @Performance
    Examples:
      | HH_ID        | USER |
      | 194360205319 | P155 |
      | 96919080719  | P156 |
      | 24794738219  | P157 |
      | 195138035219 | P158 |
      | 699785619489 | P159 |

    @Appendix @Performance @PW @Operators @USAppendix
    Examples:
      | HH_ID        | USER |
      | 24794738219  | P124 |
      | 195138035219 | P125 |
      | 699785619489 | P126 |
