@CourseOfConstruction
Feature: Home course of construction

  @S1 @NJ
  Scenario: E2E - CC - NJ_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "NJ_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total annualized premium value "$3,972.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$50.00"
    * I verify state mandated assessments value "$198.60"
    * I verify grand total value "$4,570.60"


    Then I verify state mandated assessments "*State Mandated Assessments Include E&S New Jersey Premium Tax 5.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                          | factor                                                  | value    |
      | Dwelling                                          | Display Only                                            | 0        |
      | Other Structures                                  | Display Only                                            | 0        |
      | Contents                                          | Display Only                                            | 0        |
      | Loss of Use                                       | Display Only                                            | 0        |
      | All Other Perils Deductible                       | Display Only                                            | 0        |
      | Wildfire Deductible                               | Display Only                                            | 0        |
      | Hail Deductible                                   | Display Only                                            | 0        |
      | Hurricane Deductible                              | Display Only                                            | 0        |
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.357    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1        |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1        |
      | Non-Wind Premium                                  | Project Type Factor                                     | 1        |
      | Non-Wind Premium                                  | Age of Building Factor                                  | 1        |
      | Non-Wind Premium                                  | Total Contractor Factor                                 | 0.794    |
      | Non-Wind Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Non-Wind Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Non-Wind Premium                                  | Contractor's Loss History                               | 1        |
      | Non-Wind Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Non-Wind Premium                                  | Subrogation Against Contractor                          | 0.8      |
      | Non-Wind Premium                                  | Protection Credits                                      | 1        |
      | Non-Wind Premium                                  | Total Protection Credits                                | 1        |
      | Non-Wind Premium                                  | Perimeter Fence                                         | 1        |
      | Non-Wind Premium                                  | Gated Driveway                                          | 1        |
      | Non-Wind Premium                                  | Exterior Lighting                                       | 1        |
      | Non-Wind Premium                                  | Security Camera/Monitored CC Camera                     | 1        |
      | Non-Wind Premium                                  | Watchman/Security Guard                                 | 1        |
      | Non-Wind Premium                                  | Maximum Protection Credits                              | 0.85     |
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.33     |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 1318.182 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 1318.182 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.043    |
      | Wind Premium                                      | Hurricane Deductible Factor                             | 0.88     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1        |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1        |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 0.95     |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.03     |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.03     |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 120.35   |
      | Wind Premium                                      | Final Wind Premium                                      | 120.35   |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 1438     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 1438     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 400000   |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 100       | 100      |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Term             | 12       |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 12        | 12       |
      | Optional Coverages Premium                        | Display Only                                            | 0        |
      | Soft Costs Coverage                               | Soft Costs Covergage                                    | 100      |
      | Soft Costs Coverage                               | Optional Coverage Duration Factor                       | 1        |
      | Scaffolding and Other Construction Forms Coverage | Scaffolding and Other Construction Forms                | 80       |
      | Scaffolding and Other Construction Forms Coverage | Optional Coverage Duration Factor                       | 1        |
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 500      |
      | Ensuing Fungi or Bacteria Coverage                | Optional Coverage Duration Factor                       | 1        |
      | Valuable Papers and Records Coverage              | Valuable Papers and Records                             | 37.5     |
      | Valuable Papers and Records Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Property at a Temporary Storage Location Coverage | Property at a Temporary Storage Location                | 0        |
      | Property at a Temporary Storage Location Coverage | Optional Coverage Duration Factor                       | 1        |
      | Property in Transit Coverage                      | Property in Transit                                     | 0        |
      | Property in Transit Coverage                      | Optional Coverage Duration Factor                       | 1        |
      | Sewer or Drain Backup Limit Coverage              | Sewer or Drain Backup                                   | 242      |
      | Sewer or Drain Backup Limit Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Liability Limit                                         | 250      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 1209.5   |
      | Earthquake Extension                              | EQ Premium                                              | 324      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.81     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 324      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1533.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 50       |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 1438     |
      | Location Premium                                  | Premium after Reset                                     | 1438     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 1438     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1534     |
      | Total Location Premium                            | HO Total Premium                                        | 3972     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 3972     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | PHO Premium                                             | 3972     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 198.6    |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 3972     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 50       |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 198.6    |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 3972     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.05     |

    When I return to premium summary page
    * I navigate to underwriting referrals page

    Then I verify that referral "CCR2" is "triggered"
    * I verify that referral "CCR5" is "triggered"
    * I verify that referral "CCR17" is "triggered"
    * I verify that referral "CCR26" is "triggered"
    * I verify that referral "CCR27" is "triggered"
    * I verify that referral "CCR32" is "triggered"

    When I accept underwriting referrals
    * I bind a CC quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote

    Then I verify total annualized premium value "$3,972.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$50.00"
    * I verify state mandated assessments value "$198.60"
    * I verify grand total value "$4,570.60"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S New Jersey Premium Tax 5.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                          | factor                                                  | value    |
      | Dwelling                                          | Display Only                                            | 0        |
      | Other Structures                                  | Display Only                                            | 0        |
      | Contents                                          | Display Only                                            | 0        |
      | Loss of Use                                       | Display Only                                            | 0        |
      | All Other Perils Deductible                       | Display Only                                            | 0        |
      | Wildfire Deductible                               | Display Only                                            | 0        |
      | Hurricane Deductible                              | Display Only                                            | 0        |
      | Hail Deductible                                   | Display Only                                            | 0        |
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.357    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1        |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1        |
      | Non-Wind Premium                                  | Project Type Factor                                     | 1        |
      | Non-Wind Premium                                  | Age of Building Factor                                  | 1        |
      | Non-Wind Premium                                  | Total Contractor Factor                                 | 0.794    |
      | Non-Wind Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Non-Wind Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Non-Wind Premium                                  | Contractor's Loss History                               | 1        |
      | Non-Wind Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Non-Wind Premium                                  | Subrogation Against Contractor                          | 0.8      |
      | Non-Wind Premium                                  | Protection Credits                                      | 1        |
      | Non-Wind Premium                                  | Total Protection Credits                                | 1        |
      | Non-Wind Premium                                  | Perimeter Fence                                         | 1        |
      | Non-Wind Premium                                  | Gated Driveway                                          | 1        |
      | Non-Wind Premium                                  | Exterior Lighting                                       | 1        |
      | Non-Wind Premium                                  | Security Camera/Monitored CC Camera                     | 1        |
      | Non-Wind Premium                                  | Watchman/Security Guard                                 | 1        |
      | Non-Wind Premium                                  | Maximum Protection Credits                              | 0.85     |
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.33     |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.33     |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 1318.182 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 1318.182 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.043    |
      | Wind Premium                                      | Hurricane Deductible Factor                             | 0.88     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1        |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1        |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 0.95     |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.03     |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.03     |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 120.35   |
      | Wind Premium                                      | Final Wind Premium                                      | 120.35   |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 1438     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 1438     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 400000   |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 100       | 100      |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Term             | 12       |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 12        | 12       |
      | Optional Coverages Premium                        | Display Only                                            | 0        |
      | Soft Costs Coverage                               | Soft Costs Covergage                                    | 100      |
      | Soft Costs Coverage                               | Optional Coverage Duration Factor                       | 1        |
      | Scaffolding and Other Construction Forms Coverage | Scaffolding and Other Construction Forms                | 80       |
      | Scaffolding and Other Construction Forms Coverage | Optional Coverage Duration Factor                       | 1        |
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 500      |
      | Ensuing Fungi or Bacteria Coverage                | Optional Coverage Duration Factor                       | 1        |
      | Valuable Papers and Records Coverage              | Valuable Papers and Records                             | 37.5     |
      | Valuable Papers and Records Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Property at a Temporary Storage Location Coverage | Property at a Temporary Storage Location                | 0        |
      | Property at a Temporary Storage Location Coverage | Optional Coverage Duration Factor                       | 1        |
      | Property in Transit Coverage                      | Property in Transit                                     | 0        |
      | Property in Transit Coverage                      | Optional Coverage Duration Factor                       | 1        |
      | Sewer or Drain Backup Limit Coverage              | Sewer or Drain Backup                                   | 242      |
      | Sewer or Drain Backup Limit Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Liability Limit                                         | 250      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 1209.5   |
      | Earthquake Extension                              | EQ Premium                                              | 324      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.81     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 324      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1533.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 50       |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 1438     |
      | Location Premium                                  | Premium after Reset                                     | 1438     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 1438     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1534     |
      | Total Location Premium                            | HO Total Premium                                        | 3972     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 3972     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | PHO Premium                                             | 3972     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 198.6    |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 3972     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 50       |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 198.6    |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 3972     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.05     |

    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total annualized premium value "$4,715.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$235.75"
    * I verify grand total value "$5,300.75"


    Then I verify state mandated assessments "*State Mandated Assessments Include E&S New Jersey Premium Tax 5.00% of taxable premium (taxable premium DOES NOT include inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                          | factor                                                  | value    |
      | Dwelling                                          | Display Only                                            | 0        |
      | Other Structures                                  | Display Only                                            | 0        |
      | Contents                                          | Display Only                                            | 0        |
      | Loss of Use                                       | Display Only                                            | 0        |
      | All Other Perils Deductible                       | Display Only                                            | 0        |
      | Wildfire Deductible                               | Display Only                                            | 0        |
      | Hail Deductible                                   | Display Only                                            | 0        |
      | Hurricane Deductible                              | Display Only                                            | 0        |
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.357    |
      | Non-Wind Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1        |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1        |
      | Non-Wind Premium                                  | Project Type Factor                                     | 1        |
      | Non-Wind Premium                                  | Age of Building Factor                                  | 1        |
      | Non-Wind Premium                                  | Total Contractor Factor                                 | 0.794    |
      | Non-Wind Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Non-Wind Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Non-Wind Premium                                  | Contractor's Loss History                               | 1        |
      | Non-Wind Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Non-Wind Premium                                  | Subrogation Against Contractor                          | 0.8      |
      | Non-Wind Premium                                  | Protection Credits                                      | 1        |
      | Non-Wind Premium                                  | Total Protection Credits                                | 1        |
      | Non-Wind Premium                                  | Perimeter Fence                                         | 1        |
      | Non-Wind Premium                                  | Gated Driveway                                          | 1        |
      | Non-Wind Premium                                  | Exterior Lighting                                       | 1        |
      | Non-Wind Premium                                  | Security Camera/Monitored CC Camera                     | 1        |
      | Non-Wind Premium                                  | Watchman/Security Guard                                 | 1        |
      | Non-Wind Premium                                  | Maximum Protection Credits                              | 0.85     |
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.412    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.412    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.412    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.412    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 1647.727 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 1647.727 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.043    |
      | Wind Premium                                      | Policy Extension Factor                                 | 1.25     |
      | Wind Premium                                      | Hurricane Deductible Factor                             | 0.88     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1        |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1        |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 0.95     |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.038    |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.038    |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 150.438  |
      | Wind Premium                                      | Final Wind Premium                                      | 150.438  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 1798     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 1798     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 400000   |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 100       | 100      |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Term             | 12       |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 12        | 12       |
      | Optional Coverages Premium                        | Display Only                                            | 0        |
      | Soft Costs Coverage                               | Soft Costs Covergage                                    | 100      |
      | Soft Costs Coverage                               | Optional Coverage Duration Factor                       | 1        |
      | Soft Costs Coverage                               | Policy Extension Factor                                 | 1.25     |
      | Scaffolding and Other Construction Forms Coverage | Scaffolding and Other Construction Forms                | 80       |
      | Scaffolding and Other Construction Forms Coverage | Optional Coverage Duration Factor                       | 1        |
      | Scaffolding and Other Construction Forms Coverage | Policy Extension Factor                                 | 1.25     |
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 500      |
      | Ensuing Fungi or Bacteria Coverage                | Optional Coverage Duration Factor                       | 1        |
      | Ensuing Fungi or Bacteria Coverage                | Policy Extension Factor                                 | 1.25     |
      | Valuable Papers and Records Coverage              | Valuable Papers and Records                             | 37.5     |
      | Valuable Papers and Records Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Valuable Papers and Records Coverage              | Policy Extension Factor                                 | 1.25     |
      | Property at a Temporary Storage Location Coverage | Property at a Temporary Storage Location                | 0        |
      | Property at a Temporary Storage Location Coverage | Optional Coverage Duration Factor                       | 1        |
      | Property at a Temporary Storage Location Coverage | Policy Extension Factor                                 | 1.25     |
      | Property in Transit Coverage                      | Property in Transit                                     | 0        |
      | Property in Transit Coverage                      | Optional Coverage Duration Factor                       | 1        |
      | Property in Transit Coverage                      | Policy Extension Factor                                 | 1.25     |
      | Sewer or Drain Backup Limit Coverage              | Sewer or Drain Backup                                   | 242      |
      | Sewer or Drain Backup Limit Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Sewer or Drain Backup Limit Coverage              | Policy Extension Factor                                 | 1.25     |
      | Liability Limit Coverage                          | Liability Limit                                         | 250      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Policy Extension Factor                                 | 1.25     |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 1511.875 |
      | Earthquake Extension                              | EQ Premium                                              | 405      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.81     |
      | Earthquake Extension                              | Policy Extension Factor                                 | 1.25     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1511.88  |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 405      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1916.88  |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 1798     |
      | Location Premium                                  | Premium after Reset                                     | 1798     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 1798     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1917     |
      | Total Location Premium                            | HO Total Premium                                        | 4715     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 4715     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | PHO Premium                                             | 4715     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 235.75   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 4715     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.05     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 235.75   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 4715     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.05     |

    When I return to premium summary page

    * I click review referrals

    Then I verify that referral "CCR2" is "triggered"

    When I accept underwriting referrals

    Then I click process policy extension

    Then I create cancellation transaction
      | by      | date     | notes             | method   | reason               | MEP | reason |
      | Company | Tomorrow | Cancellation test | Pro-Rate | Underwriting Reasons |     |        |

    * I create reinstatement transaction
      | description        | notes | losses | reason               |
      | Reinstatement test | Notes | No     | Underwriting Reasons |

    * I click roll forward

    * I exit policy
    * I logout