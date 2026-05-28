@US46036 @US @AL @CourseOfConstruction @CC @COC @PCRegression @2024 @December @UI @Rating @PostProd
Feature: US46036 - AL CC - (Palomar) Update the AL broker fee from $0 to $350

  @NewBusiness @Endorsement @Renewal @PolicyExtension @NB @END @RN @OOS
  Scenario: AL CC (Palomar) Update Broker Fee to $350 - NB/END/RN/OOS
    Given I use "AL_001" regression test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/21/2024"
    * I set "Endorsement_Effective_Date_END" to "12/22/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |    | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |    | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |    | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |    | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |    | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |    | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |    | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |    | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |    | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    Then I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I issue an endorsement

    Then I initiate a policy extension
    * I review changes
    * I click renewed premium
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$0.00"
    Then I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | !Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | !Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| !PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    * I click process policy extension

    Then I initiate new oos endorsement 4 months ahead
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    Then I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    And I issue an endorsement

  @Rewrite @PreProd
  Scenario: AL CC (Palomar) Update Broker Fee to $350 - Rewrite
    Given I use "AL_001" regression test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/20/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "not displayed" on the UI
    * I verify if element with message "Surplus Lines Broker Fee" is "not displayed" on the UI
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | !Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | !Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| !PHO Surplus Lines Broker Fee for Tax    | 350          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    Then I create cancellation transaction
      | by      | date       | notes             | method    | reason         | MEP | reason |
      | Company | 12/20/2024 | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |
    * I create new business rewrite transaction
      | notes | date                |
      | Notes | 12/21/2024 |
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    Then I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    And I complete rewrite transaction

  @NewBusiness @Endorsement @DayBefore @DayBeforePD
  Scenario: AL CC (Palomar) Update Broker Fee to $350 - Day Before PD
    Given I use "AL_001" regression test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/20/2024"
    * I set "Endorsement_Effective_Date_END" to "12/21/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes inspection fee)" is "displayed" on the UI
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "not displayed" on the UI
    * I verify if element with message "Surplus Lines Broker Fee" is "not displayed" on the UI
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | !Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | !Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| !PHO Surplus Lines Broker Fee for Tax    | 350          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes inspection fee)" is "displayed" on the UI
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "not displayed" on the UI
    * I verify if element with message "Surplus Lines Broker Fee" is "not displayed" on the UI
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | !Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | !Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | !Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| !E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| !E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| !PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    And I issue an endorsement

  @NewBusiness @Endorsement @NB @END @PreProdNew
  Scenario: AL CC (Palomar) Update Broker Fee to $350 - PreProd
    Given I use "AL_001" regression test data from "QuoteCreatorCC" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "12/21/2024"
    * I set "Endorsement_Effective_Date_END" to "12/22/2024"
    * I navigate to quotes page
    * I initiate a new quote
    * I create a new "CC" quote
    * I rate a quote
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    When I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350          | +      |

    And I return to premium summary page
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I initiate new endorsement
    * I review changes
    * I rate an endorsement
    * I think for 5 to 10 seconds
    * I verify if element with message "*State Mandated Assessments Include E&S Alabama Premium Tax 6.00% of taxable premium (taxable premium includes surplus lines broker fee and inspection fee)" is "displayed" on the UI
    * I verify surplus lines broker fee value "$350.00"
    Then I navigate to premium details page
    Then I validate premium details page table
      | relatedObject       | coverage                 | factor                          | factorValue | method |
      |   | Surplus Lines Broker Fee | Surplus Lines Broker Fee        | 350         | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Surplus Lines Broker Fee    | 350    | +      |
      |   | E&S Premium Tax - Surplus Lines Broker Fee | Tax Percentage % - E&S Tax  | 0.06   | *      |
      |   | Grand Total Premium      | Surplus Lines Broker Fee        | 350         | +      |
      |   | Grand Total Premium      | E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | Grand Total Premium      | E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *|
      |   | State Mandated Assessments| E&S Premium Tax - Broker Fee    | 21          | +      |
      |   | State Mandated Assessments| E&S Tax Percentage % - Surplus Lines Broker Fee    | 0.06          | *      |
      |   | State Mandated Assessments| PHO Surplus Lines Broker Fee for Tax    | 350                      | +      |
    * I click exit button
    * I review and accept referrals on renewal if any
    And I issue an endorsement