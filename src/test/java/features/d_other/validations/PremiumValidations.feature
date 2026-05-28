Feature: Premium Validations

  @PremiumValidations @PA @NewBusiness
  Scenario Outline: Premium Validations PA - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "PA" LOB
    * I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I edit customer insurance score
    * I create a new "PA" quote
    * I rate a quote
    * I take screenshot "Premium summary"
    * I get the premiums
    * I get customer account ID
#    * I validate PA premiums

    @ID
    Examples:
      | workbook           | sheet | TC_ID  |
      | PremiumValidations | ID_PA | TC_001 |

  @PremiumValidations @EX @NewBusiness
  Scenario Outline: Premium Validations PA - "<TC_ID>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "<workbook>" in sheet "<sheet>" for "EX" LOB
    * I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "EX" quote
    * I rate a quote
    * I take screenshot "Premium summary"
    * I get the premiums
    * I get customer account ID
#    * I validate EX premiums

    @ID
    Examples:
      | workbook           | sheet | row    |
      | PremiumValidations | ID_EX | TC_002 |