@US47210 @US @FL @PersonalWatercraft @Watercraft @PW @PCRegression @2025 @January @Rating @FIGA
Feature: US47210 - FL FIGA 1% Personal Watercraft

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: FL Personal Watercraft FIGA 1% - NB/END/RN
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    And I navigate to Watercraft Policy Page
    * I navigate via action button next
    * I set AOP Deductible to "75,000" on Vessel Detail page
    * I set Hurricane Deductible to "75,000" on Vessel Detail page
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @RC @NewBusiness @RenewalConversion
  Scenario: FL Personal Watercraft FIGA 1% - Renewal Conversion
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I create a renewal
    * I navigate to policy image page
    And I review changes
    * I click renewed premium
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @NewBusiness @DayPrior @PreProd @DayPriorPD
  Scenario: FL Personal Watercraft FIGA 1% - Day Prior PD Filling
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/17/2025"
    * I set "Endorsement_Effective_Date_END" to "01/18/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    * I verify state mandated assessments value "$0.00"
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                     | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| !Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor   | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2 | 0          | +      |
    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify state mandated assessments value "$0.00"
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                     | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| !Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor   | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2 | 0          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @NewBusiness @Rewrite @PreProd
  Scenario: FL Personal Watercraft FIGA 1% - Rewrite
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/17/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I verify state mandated assessments value "$0.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                     | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| !Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor   | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2 | 0          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 01/17/2025 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date          |
      | Notes | 01/18/2025    |
    Then I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @NB @NewBusiness @DayPrior @DayPriorRB
  Scenario: FL Personal Watercraft FIGA 1% - Day Prior RB
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/31/2024"
    * I set "Endorsement_Effective_Date_END" to "04/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I create a renewal
    And I navigate to policy image page
    * I review changes
    * I click renewed premium
    * I think for 5 to 10 seconds
    Then I verify state mandated assessments value "$0.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                     | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| !Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor   | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2 | 0          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

    Then I initiate new endorsement
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    Then I verify state mandated assessments value "$0.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                     | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| !Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor   | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2 | 0          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @PreProdNew @NB @END @NewBusiness @Endorsement
  Scenario: FL Personal Watercraft FIGA 1% - PreProd
    Given I use "FL_001" regression test data from "QuoteCreatorPW" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "PW" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    And I navigate to Watercraft Policy Page
    * I navigate via action button next
    * I set AOP Deductible to "75,000" on Vessel Detail page
    * I set Hurricane Deductible to "75,000" on Vessel Detail page
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject| coverage                                             | factor                                                    | factorValue| method |
      |              | Florida Insurance Guaranty Association Assessment 2.1| Florida Insurance Guaranty Association Assessment Factor 2| 0.01       | *      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor  | 0          | +      |
      |              | Grand Total Premium                                  | Florida Insurance Guaranty Association Assessment Factor 2| /          | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement
