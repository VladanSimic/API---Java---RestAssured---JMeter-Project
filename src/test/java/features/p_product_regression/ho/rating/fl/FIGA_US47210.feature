@US47210 @US @FL @Homeowners @HO @PCRegression @2025 @January @Rating @FIGA
Feature: US47210 - FL FIGA 1% Homeowners

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: FL Homeowners FIGA 1% - NB/END/RN
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements

    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I set personal liability limit to "1,000,000"
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |
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
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @END @RN @NewBusiness @Endorsement @Renewal @1
  Scenario: FL Homeowners FIGA 1% - Multiple Locations NB/END/RN
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    And I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    * I navigate to transactions or endorsements

    Then I initiate new endorsement

    And I navigate to Homeowner Policy Page
    * I set personal liability limit to "1,000,000"

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I create a renewal
    And I navigate to policy image page
    * I navigate to Homeowner Policy Page
    * I click delete 1 additional risk address
    * I review changes
    * I click renewed premium
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I click more changes button

    And I set "Is_There_Mortgage" to ""
    * I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Homeowner     | 12000000 |           |        |            |

    * I review changes
    * I click renewed premium
    * I validate FIGA on Premium Summary Page
    * I review and accept referrals on renewal if any
    * I process a renewal

  @NB @RC @NewBusiness @RenewalConversion
  Scenario: FL Homeowners FIGA 1% - Renewal Conversion
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "04/01/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
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
    * I validate FIGA on Premium Summary Page
    * I click more changes button

    And I set "Appraisal_Comment" to ""
    * I set "Appraisal_Contact_Name" to ""
    * I set "Appraisal_Contact_Email" to ""
    * I set "Appraisal_Contact_Phone" to ""

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC  | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op     | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    And I review changes
    * I click renewed premium
    * I validate FIGA on Premium Summary Page
    * I review and accept referrals on renewal if any
    Then I process a renewal

  @NB @NewBusiness @DayPrior @PreProd @DayPriorPD
  Scenario: FL Homeowners FIGA 1% - Day Prior PD Filling
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/17/2025"
    * I set "Endorsement_Effective_Date_END" to "01/18/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    * I verify state mandated assessments value "$2.00"
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                      | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | !Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor    | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2  | 0           | +      |
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
    * I verify state mandated assessments value "$2.00"
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                      | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | !Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor    | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2  | 0           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @NewBusiness @Rewrite @PreProd
  Scenario: FL Homeowners FIGA 1% - Rewrite
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/17/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I verify state mandated assessments value "$2.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                      | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | !Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor    | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2  | 0           | +      |

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
      | notes | date       |
      | Notes | 01/18/2025 |
    Then I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I complete rewrite transaction

  @NB @NewBusiness @DayPrior @DayPriorRB
  Scenario: FL Homeowners FIGA 1% - Day Prior RB
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "03/31/2024"
    * I set "Endorsement_Effective_Date_END" to "04/01/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote
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
    Then I verify state mandated assessments value "$2.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                      | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | !Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor    | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2  | 0           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I process a renewal

    Then I initiate new endorsement
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    Then I verify state mandated assessments value "$2.00"
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                      | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | !Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor    | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2  | 0           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @PreProdNew @NB @END @NewBusiness @Endorsement
  Scenario: FL Homeowners FIGA 1% - PreProd
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants   | 2000000 |           |        |            |

    And I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    And I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I initiate new endorsement
    And I navigate to Homeowner Policy Page
    * I set personal liability limit to "1,000,000"
    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I navigate to premium details page
    Then I validate premium details page table
      | relatedObject | coverage                                              | factor                                                     | factorValue | method |
      |               | Florida Insurance Guaranty Association Assessment 2.1 | Florida Insurance Guaranty Association Assessment Factor 2 | 0.01        | *      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor   | 0           | +      |
      |               | Grand Total Premium                                   | Florida Insurance Guaranty Association Assessment Factor 2 | /           | +      |
    And I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

  @NB @END @NewBusiness @Endorsement @PreProdNew
  Scenario: FL Homeowners FIGA 1% - Multiple Locations PreProd
    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/18/2025"
    * I set "Endorsement_Effective_Date_END" to "01/19/2025"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    And I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate FIGA on Premium Summary Page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities
    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants   | 2000000 |           |        |            |

    And I navigate to Homeowner Policy Page
    * I set personal liability limit to "1,000,000"

    And I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I validate FIGA on Premium Summary Page
    * I review and accept referrals on renewal if any
    Then I issue an endorsement