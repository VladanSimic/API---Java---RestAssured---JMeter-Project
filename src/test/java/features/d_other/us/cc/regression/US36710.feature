@CourseOfConstruction @US36710 @RegressionUS
Feature: US36710 - State Mandated Assessments Verbiage

  As a Compliance Officer I want CC policies to have state mandated assessments
  displayed on the premium summary tab so that internal users and brokers
  are informed as to what fees are included in the policy

  Scenario Outline: State Mandated Assessments Verbiage - "<TC_ID>"

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    When I am logged in to Pure as Field

    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify state mandated assessments "<verbiage>"

    When I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements

    * I select a transaction "New Business"
    * I navigate to premium summary page

    Then I verify state mandated assessments "<verbiage>"

    When I exit transaction
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote

    Then I verify state mandated assessments "<verbiage>"

    When I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement
    * I select a transaction "Endorsement"
    * I navigate to premium summary page

    Then I verify state mandated assessments "<verbiage>"

    Examples:
      | TC_ID  | verbiage                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | FL_001 | *State Mandated Assessments Include EMPA surcharge of $2, Stamping fee of 0.06% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee), and E&S Florida Premium Tax 4.94% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                  |
      | NY_001 | *State Mandated Assessments Include E&S New York Premium Tax 3.60% of taxable premium (taxable premium DOES NOT include surplus lines broker fee) and Stamping fee 0.15% of taxable premium (taxable premium DOES NOT include surplus lines broker fee)                                                                                                                                                                                 |
      | MA_001 | *State Mandated Assessments Include E&S Massachusetts Premium Tax 4.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                               |
      | AZ_001 | *State Mandated Assessments Include E&S Arizona Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.20% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                            |
      | CA_001 | *State Mandated Assessments Include E&S California Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.18% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                         |
      | CO_001 | *State Mandated Assessments Include E&S Colorado Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                            |
      | CT_001 | *State Mandated Assessments Includes the $12 CT Healthy Home Surcharge and the E&S Connecticut Premium Tax 4.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                                                                                                      |
      | DE_001 | *State Mandated Assessments Include E&S Delaware Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                            |
      | HI_001 | *State Mandated Assessments Include E&S Hawaii Premium Tax 4.68% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                      |
      | ID_001 | *State Mandated Assessments Include E&S Idaho Premium Tax 1.50% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.50% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee).                                                                                                                                                             |
      | IL_001 | *State Mandated Assessments Include an Illinois Fire Marshal Tax 1.00% of 40% of the premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee), E&S Illinois Premium Tax 3.50% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee), and Stamping fee 0.04% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee) |
      | ME_001 | *State Mandated Assessments Include E&S Maine Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                               |
      | MD_001 | *State Mandated Assessments Include E&S Maryland Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee but DOES NOT include surplus lines broker fee)                                                                                                                                                                                                                                                           |
      | MT_001 | *State Mandated Assessments Include a Montana Fire Tax 2.50% of the fire premium (fire premium is 60% of the premium, not including the inspection fee or surplus lines broker fee) and E&S Montana Premium Tax 2.75% of taxable premium (taxable premium includes inspection fee but DOES NOT include surplus lines broker fee).                                                                                                       |
      | NC_001 | *State Mandated Assessments Include E&S North Carolina Premium Tax 5.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee) and Stamping fee 0.30% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                     |
      | NJ_001 | *State Mandated Assessments Include E&S New Jersey Premium Tax 5.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                  |
      | NM_001 | *State Mandated Assessments Include E&S New Mexico Premium Tax 3.003% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                         |
      | RI_001 | *State Mandated Assessments Include E&S Rhode Island Premium Tax 4.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                |
      | SC_001 | *State Mandated Assessments Include E&S South Carolina Premium Tax 6.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                      |
      | OR_001 | *State Mandated Assessments Include an Oregon Fire Marshal Tax 0.30% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee), a Surplus Lines Service Charge of $10, and E&S Oregon Premium Tax 2.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee).                                                                                                      |
      | UT_001 | *State Mandated Assessments Include E&S Utah Premium Tax 4.25% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee of 0.18% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                            |
      | VA_001 | *State Mandated Assessments Include E&S Virginia Premium Tax 2.25% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                                                                                                                                            |
      | WA_001 | *State Mandated Assessments Include E&S Washington Premium Tax 2.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee of 0.10% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                                      |
      | WY_001 | *State Mandated Assessments Include E&S Wyoming Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Clearinghouse Transaction Fee of 0.175% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)                                                                                                                                       |