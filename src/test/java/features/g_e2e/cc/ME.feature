@CourseOfConstruction
Feature: Home course of construction

  @S1 @ME
  Scenario: E2E - CC - ME_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "ME_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total annualized premium value "$5,328.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$100.00"
    * I verify state mandated assessments value "$173.34"
    * I verify grand total value "$5,951.34"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S Maine Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.793    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.97     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.688    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 2753.908 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 2753.908 |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.97     |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 2754     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 2754     |
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
      | Earthquake Extension                              | EQ Premium                                              | 364      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.91     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 364      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1573.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 100      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 2754     |
      | Location Premium                                  | Premium after Reset                                     | 2754     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 2754     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1574     |
      | Total Location Premium                            | HO Total Premium                                        | 5328     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 5328     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 100      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | PHO Premium                                             | 5328     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 159.84   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 5328     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 100      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 3        |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 100      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 159.84   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 5328     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 3        |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 100      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |


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

    Then I verify total annualized premium value "$5,328.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$100.00"
    * I verify state mandated assessments value "$173.34"
    * I verify grand total value "$5,951.34"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S Maine Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.793    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.97     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.688    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.688    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 2753.908 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 2753.908 |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.97     |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 2754     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 2754     |
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
      | Earthquake Extension                              | EQ Premium                                              | 364      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.91     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 364      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1573.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 100      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 2754     |
      | Location Premium                                  | Premium after Reset                                     | 2754     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 2754     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1574     |
      | Total Location Premium                            | HO Total Premium                                        | 5328     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 5328     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 100      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | PHO Premium                                             | 5328     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 159.84   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 5328     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 100      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 3        |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 100      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 159.84   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 5328     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 3        |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 100      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |


    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total annualized premium value "$6,409.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$202.77"
    * I verify grand total value "$6,961.77"


    Then I verify state mandated assessments "*State Mandated Assessments Include E&S Maine Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.793    |
      | Non-Wind Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.97     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.861    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.861    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.861    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.861    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 3442.385 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 3442.385 |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Policy Extension Factor                                 | 1.25     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.97     |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 3442     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 3442     |
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
      | Earthquake Extension                              | EQ Premium                                              | 455      |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 0.91     |
      | Earthquake Extension                              | Policy Extension Factor                                 | 1.25     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1511.88  |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 455      |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1966.88  |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 3442     |
      | Location Premium                                  | Premium after Reset                                     | 3442     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 3442     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1967     |
      | Total Location Premium                            | HO Total Premium                                        | 6409     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 6409     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Grand Total Premium                               | PHO Premium                                             | 6409     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 192.27   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 6409     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 192.27   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 6409     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |

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