@CourseOfConstruction @US34998 @RegressionUS
Feature: US34998 - Foundation Phase Factor Logic

  As a Product Owner I want to take rate for foundation phase factors
  when the foundation stage has not been completed prior to the effective date
  of the policy so that we are able to charge for the risk

  Scenario Outline: Foundation phase factors for - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Project_Type_Has_The_Foundation_Stage_Been_Completed" to "No"

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote
    * I navigate to premium details page

    Then I verify base rate "<foundationFactor>"

    Examples:
      | TC_ID  | foundationFactor                       |
      | AZ_001 | Final Foundation Stage Premium/100     |
      | CA_001 | Final Foundation Stage Premium/100     |
      | CO_001 | Final Foundation Stage Premium/100     |
      | CT_001 | Final Foundation Stage Premium/100     |
      | DE_001 | Final Foundation Stage Premium/100     |
      | HI_001 | Final Foundation Stage Premium/133.333 |
      | ID_001 | Final Foundation Stage Premium/100     |
      | IL_001 | Final Foundation Stage Premium/100     |
      | ME_001 | Final Foundation Stage Premium/100     |
      | MD_001 | Final Foundation Stage Premium/133.333 |
      | MT_001 | Final Foundation Stage Premium/100     |
      | NC_001 | Final Foundation Stage Premium/100     |
      | NJ_001 | Final Foundation Stage Premium/100     |
      | NM_001 | Final Foundation Stage Premium/100     |
      | NV_001 | Final Foundation Stage Premium/100     |
      | RI_001 | Final Foundation Stage Premium/133.333 |
      | SC_001 | Final Foundation Stage Premium/100     |
      | OR_001 | Final Foundation Stage Premium/100     |
      | UT_001 | Final Foundation Stage Premium/100     |
      | VA_001 | Final Foundation Stage Premium/100     |
      | WA_001 | Final Foundation Stage Premium/100     |
      | WY_001 | Final Foundation Stage Premium/100     |
      | FL_001 | Final Foundation Stage Premium/100     |
      | MA_001 | Final Foundation Stage Premium/133.333 |
      | NY_001 | Final Foundation Stage Premium/100     |