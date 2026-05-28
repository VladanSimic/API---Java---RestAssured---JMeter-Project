@CourseOfConstruction
Feature: Home course of construction

  @S1 @KY
  Scenario: E2E - CC - KY_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "KY_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total annualized premium value "$13,940.00"
    * I verify municipallity tax total for all locations "$0.00"
    * I verify municipallity tax total service fee "$0.00"
    * I verify kentucky state surcharge "$250.92"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$953.64"
    * I verify grand total value "$15,593.64"

    Then I verify state mandated assessments "*State Mandated Assessments Include a Kentucky Municipal Tax on the premium, E&S Kentucky Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee of 1.80% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                             | factor                                                  | value     |
      | Dwelling                                             | Display Only                                            | 0         |
      | Other Structures                                     | Display Only                                            | 0         |
      | Contents                                             | Display Only                                            | 0         |
      | Loss of Use                                          | Display Only                                            | 0         |
      | All Other Perils Deductible                          | Display Only                                            | 0         |
      | Wildfire Deductible                                  | Display Only                                            | 0         |
      | Hail Deductible                                      | Display Only                                            | 0         |
      | Hurricane Deductible                                 | Display Only                                            | 0         |
      | Non-Wind Premium                                     | Non-Wind Base Rate                                      | 0.799     |
      | Non-Wind Premium                                     | AOP Deductible Factor                                   | 1.25      |
      | Non-Wind Premium                                     | Windstorm or Hail Deductible                            | 0.98      |
      | Non-Wind Premium                                     | Financial Responsibility Factor                         | 1.085     |
      | Non-Wind Premium                                     | Planned Construction Type Factor                        | 0.93      |
      | Non-Wind Premium                                     | Protection Class Factor                                 | 1         |
      | Non-Wind Premium                                     | Flood Zone Adjustment                                   | 1.15      |
      | Non-Wind Premium                                     | Project Type Factor                                     | 1         |
      | Non-Wind Premium                                     | Age of Building Factor                                  | 1         |
      | Non-Wind Premium                                     | Total Contractor Factor                                 | 0.794     |
      | Non-Wind Premium                                     | PURE Preferred Contractor Credit                        | 0.95      |
      | Non-Wind Premium                                     | Contractor's Years in Business                          | 1.1       |
      | Non-Wind Premium                                     | Contractor's Loss History                               | 1         |
      | Non-Wind Premium                                     | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Non-Wind Premium                                     | Subrogation Against Contractor                          | 0.8       |
      | Non-Wind Premium                                     | Protection Credits                                      | 1         |
      | Non-Wind Premium                                     | Total Protection Credits                                | 1         |
      | Non-Wind Premium                                     | Perimeter Fence                                         | 1         |
      | Non-Wind Premium                                     | Gated Driveway                                          | 1         |
      | Non-Wind Premium                                     | Exterior Lighting                                       | 1         |
      | Non-Wind Premium                                     | Security Camera/Monitored CC Camera                     | 1         |
      | Non-Wind Premium                                     | Watchman/Security Guard                                 | 1         |
      | Non-Wind Premium                                     | Maximum Protection Credits                              | 0.85      |
      | Non-Wind Premium                                     | Base Non-Wind Premium 2 Intermediate                    | 0.902     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL)                             | 0.902     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL) Final                       | 0.902     |
      | Non-Wind Premium                                     | Non-Wind Duration Factor                                | 1         |
      | Non-Wind Premium                                     | Base Non-Wind Premium 3 Intermediate                    | 0.902     |
      | Non-Wind Premium                                     | Total Insured Value (TIV)                               | 1300000   |
      | Non-Wind Premium                                     | Constant 100                                            | 100       |
      | Non-Wind Premium                                     | Final Non-Wind Premium before Adjustment                | 11730.268 |
      | Non-Wind Premium                                     | Final Non-Wind Premium                                  | 11730.268 |
      | Wind Premium                                         | Wind Base Rate                                          | 0         |
      | Wind Premium                                         | Financial Responsibility Factor                         | 1.085     |
      | Wind Premium                                         | Planned Construction Type Factor                        | 0.93      |
      | Wind Premium                                         | Protection Class Factor                                 | 1         |
      | Wind Premium                                         | Flood Zone Adjustment                                   | 1.15      |
      | Wind Premium                                         | Project Type Factor                                     | 1         |
      | Wind Premium                                         | Age of Building Factor                                  | 1         |
      | Wind Premium                                         | Total Contractor Factor                                 | 0.893     |
      | Wind Premium                                         | PURE Preferred Contractor Credit                        | 0.95      |
      | Wind Premium                                         | Contractor's Years in Business                          | 1.1       |
      | Wind Premium                                         | Contractor's Loss History                               | 1         |
      | Wind Premium                                         | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Wind Premium                                         | Subrogation Against Contractor                          | 0.9       |
      | Wind Premium                                         | Opening Protection Factor                               | 1         |
      | Wind Premium                                         | Wind Rate on Line (ROL)                                 | 0         |
      | Wind Premium                                         | Wind Rate on Line (ROL) Final                           | 0         |
      | Wind Premium                                         | Wind Duration Factor                                    | 1         |
      | Wind Premium                                         | Total Insured Value (TIV)                               | 1300000   |
      | Wind Premium                                         | Constant 100                                            | 100       |
      | Wind Premium                                         | Final Wind Premium before Adjustment                    | 0         |
      | Wind Premium                                         | Final Wind Premium                                      | 0         |
      | Reporting - Location Premium Before Adjustments      | Location Premium                                        | 11730     |
      | Reporting - Location Premium Before                  | Reporting - Location Premium Before                     | 0         |
      | Reporting - Location Premium Before                  | Reporting - Premium Adjustment Total - Location Premium | 0         |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Premium          | 11730     |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL TIV              | 1300000   |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 100       | 100       |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Term             | 12        |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 12        | 12        |
      | Optional Coverages Premium                           | Display Only                                            | 0         |
      | Soft Costs Coverage                                  | Soft Costs Covergage                                    | 100       |
      | Soft Costs Coverage                                  | Optional Coverage Duration Factor                       | 1         |
      | Scaffolding and Other Construction Forms Coverage    | Scaffolding and Other Construction Forms                | 80        |
      | Scaffolding and Other Construction Forms Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Ensuing Fungi or Bacteria Coverage                   | Ensuing Fungi or Bacteria                               | 500       |
      | Ensuing Fungi or Bacteria Coverage                   | Optional Coverage Duration Factor                       | 1         |
      | Valuable Papers and Records Coverage                 | Valuable Papers and Records                             | 37.5      |
      | Valuable Papers and Records Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Property at a Temporary Storage Location Coverage    | Property at a Temporary Storage Location                | 0         |
      | Property at a Temporary Storage Location Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Property in Transit Coverage                         | Property in Transit                                     | 0         |
      | Property in Transit Coverage                         | Optional Coverage Duration Factor                       | 1         |
      | Sewer or Drain Backup Limit Coverage                 | Sewer or Drain Backup                                   | 242       |
      | Sewer or Drain Backup Limit Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Liability Limit Coverage                             | Liability Limit                                         | 250       |
      | Liability Limit Coverage                             | Optional Coverage Duration Factor                       | 1         |
      | Additional Optional Coverages                        | Additional Optional Coverages Premium                   | 1209.5    |
      | Total Optional Coverages Premium                     | Additional Optional Coverages                           | 1209.5    |
      | Total Optional Coverages Premium                     | Earthquake Extension                                    | 0         |
      | Total Optional Coverages Premium                     | Earthquake Base Premium                                 | 0         |
      | Total Optional Coverages Premium                     | Total Optional Coverages Premium                        | 1209.5    |
      | FAC Premium                                          | FAC Premium Value                                       | 1000      |
      | Commission Factor                                    | Commission Value                                        | 1         |
      | Surplus Lines Broker Fee                             | Surplus Lines Broker Fee                                | 350       |
      | Inspection Fee 0                                     | Location Inspection Fee NB                              | 350       |
      | Inspection Fee                                       | Location Inspection Fee                                 | 0         |
      | Location Premium                                     | Location Premium                                        | 11730     |
      | Location Premium                                     | Premium after Reset                                     | 11730     |
      | Reporting - Total Location Premium Before            | Reporting - Total Location Premium Before               | 11730     |
      | Reporting - Total Location Premium Before            | Total Optional Coverages Premium                        | 1210      |
      | Total Location Premium                               | HO Total Premium                                        | 13940     |
      | City Tax - ASHLAND                                   | Fire and Allied Perils City Min Tax                     | 0         |
      | County Tax - Boyd County                             | County Tax                                              | 0         |
      | City Tax - ASHLAND                                   | City Tax                                                | 0         |
      | Reporting - Municipality Tax total for the location  | Municipality Tax total for the location                 | 0         |
      | Reporting - Municipality Tax total for all locations | Municipality Tax total for all locations                | 0         |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Total Premium                  | 13940     |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge 100                            | 100       |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Factor                         | 1.8       |
      | E&S Premium Tax - Policy Premium                     | PHO Premium                                             | 13940     |
      | E&S Premium Tax - Policy Premium                     | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee 0                   | Location Inspection Fee                                 | 350       |
      | E&S Premium Tax - Inspection Fee 0                   | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee                     | E&S Premium Tax - Inspection Fee 0                      | 0         |
      | E&S Premium Tax - Surplus Lines Broker Fee           | Surplus Lines Broker Fee                                | 350       |
      | E&S Premium Tax - Surplus Lines Broker Fee           | Tax Percentage % - E&S Tax                              | 0.03      |
      | Stamping Fee - Policy Premium                        | PHO Premium                                             | 13940     |
      | Stamping Fee - Policy Premium                        | Stamping Fee %                                          | 0.018     |
      | Municipality Tax and State Surcharge                 | Municipality Tax and State Surcharge                    | 250.92    |
      | Stamping Fee - Inspection Fee 0                      | Location Inspection Fee                                 | 350       |
      | Stamping Fee - Inspection Fee 0                      | Stamping Fee %                                          | 0.018     |
      | Stamping Fee - Inspection Fee                        | Stamping Fee - Total Inspection Fee                     | 0         |
      | Stamping Fee - Broker Fee                            | Surplus Lines Broker Fee                                | 350       |
      | Stamping Fee - Broker Fee                            | Surplus Lines Broker Fee - stamping fee %               | 0.018     |
      | Grand Total Premium                                  | PHO Premium                                             | 13940     |
      | Grand Total Premium                                  | E&S Premium Tax - Policy Premium                        | 418.2     |
      | Grand Total Premium                                  | PHO Premium for Tax                                     | 13940     |
      | Grand Total Premium                                  | Tax Percentage % - E&S Tax                              | 0.03      |
      | Grand Total Premium                                  | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | Grand Total Premium                                  | PHO Inspection Fee for Tax                              | 350       |
      | Grand Total Premium                                  | Tax Percentage % - Inspection Fee                       | 0.03      |
      | Grand Total Premium                                  | Stamping Fee - Policy Premium                           | 250.92    |
      | Grand Total Premium                                  | PHO Premium for Stamping Fee                            | 13940     |
      | Grand Total Premium                                  | Stamping Fee %                                          | 0.018     |
      | Grand Total Premium                                  | Stamping Fee - Inspection Fee                           | 6.3       |
      | Grand Total Premium                                  | PHO Inspection Fee for Stamping Fee                     | 350       |
      | Grand Total Premium                                  | Stamping Fee % - Inspection Fee                         | 0.018     |
      | Grand Total Premium                                  | Total Inspection Fee                                    | 350       |
      | Grand Total Premium                                  | Inspection Fee                                          | 350       |
      | Grand Total Premium                                  | Number of Risk Locations                                | 1         |
      | Grand Total Premium                                  | Surplus Lines Broker Fee                                | 350       |
      | Grand Total Premium                                  | E&S Premium Tax - Broker Fee                            | 10.5      |
      | Grand Total Premium                                  | PHO Surplus Lines Broker Fee for Tax                    | 350       |
      | Grand Total Premium                                  | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03      |
      | Grand Total Premium                                  | Stamping Fee - Broker Fee                               | 6.3       |
      | Grand Total Premium                                  | Municipality Tax and State Surcharge                    | 250.92    |
      | State Mandated Assessments                           | E&S Premium Tax - Policy Premium                        | 418.2     |
      | State Mandated Assessments                           | PHO Premium for Tax                                     | 13940     |
      | State Mandated Assessments                           | Tax Percentage % - E&S Tax                              | 0.03      |
      | State Mandated Assessments                           | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | State Mandated Assessments                           | PHO Inspection Fee for Tax                              | 350       |
      | State Mandated Assessments                           | Tax Percentage % - Inspection Fee                       | 0.03      |
      | State Mandated Assessments                           | E&S Premium Tax - Broker Fee                            | 10.5      |
      | State Mandated Assessments                           | PHO Surplus Lines Broker Fee for Tax                    | 350       |
      | State Mandated Assessments                           | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03      |
      | State Mandated Assessments                           | Stamping Fee - Policy Premium                           | 250.92    |
      | State Mandated Assessments                           | PHO Premium for Stamping Fee                            | 13940     |
      | State Mandated Assessments                           | Stamping Fee %                                          | 0.018     |
      | State Mandated Assessments                           | Stamping Fee - Inspection Fee                           | 6.3       |
      | State Mandated Assessments                           | PHO Inspection Fee for Stamping Fee                     | 350       |
      | State Mandated Assessments                           | Stamping Fee % - Inspection Fee                         | 0.018     |
      | State Mandated Assessments                           | Stamping Fee - Broker Fee                               | 6.3       |
      | State Mandated Assessments                           | Municipality Tax and State Surcharge                    | 250.92    |

    When I return to premium summary page
    * I navigate to underwriting referrals page

    Then I verify that referral "CCR2" is "triggered"
    * I verify that referral "CCR5" is "triggered"
    * I verify that referral "CCR17" is "triggered"
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

    Then I verify total annualized premium value "$14,180.00"
    * I verify municipallity tax total for all locations "$0.00"
    * I verify municipallity tax total service fee "$0.00"
    * I verify kentucky state surcharge "$255.24"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$969.48"
    * I verify grand total value "$15,849.48"

    Then I verify state mandated assessments "*State Mandated Assessments Include a Kentucky Municipal Tax on the premium, E&S Kentucky Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee of 1.80% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                             | factor                                                  | value     |
      | Dwelling                                             | Display Only                                            | 0         |
      | Other Structures                                     | Display Only                                            | 0         |
      | Contents                                             | Display Only                                            | 0         |
      | Loss of Use                                          | Display Only                                            | 0         |
      | All Other Perils Deductible                          | Display Only                                            | 0         |
      | Wildfire Deductible                                  | Display Only                                            | 0         |
      | Hurricane Deductible                                 | Display Only                                            | 0         |
      | Hail Deductible                                      | Display Only                                            | 0         |
      | Non-Wind Premium                                     | Non-Wind Base Rate                                      | 0.799     |
      | Non-Wind Premium                                     | AOP Deductible Factor                                   | 1.25      |
      | Non-Wind Premium                                     | Windstorm or Hail Deductible                            | 1         |
      | Non-Wind Premium                                     | Financial Responsibility Factor                         | 1.085     |
      | Non-Wind Premium                                     | Planned Construction Type Factor                        | 0.93      |
      | Non-Wind Premium                                     | Protection Class Factor                                 | 1         |
      | Non-Wind Premium                                     | Flood Zone Adjustment                                   | 1.15      |
      | Non-Wind Premium                                     | Project Type Factor                                     | 1         |
      | Non-Wind Premium                                     | Age of Building Factor                                  | 1         |
      | Non-Wind Premium                                     | Total Contractor Factor                                 | 0.794     |
      | Non-Wind Premium                                     | PURE Preferred Contractor Credit                        | 0.95      |
      | Non-Wind Premium                                     | Contractor's Years in Business                          | 1.1       |
      | Non-Wind Premium                                     | Contractor's Loss History                               | 1         |
      | Non-Wind Premium                                     | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Non-Wind Premium                                     | Subrogation Against Contractor                          | 0.8       |
      | Non-Wind Premium                                     | Protection Credits                                      | 1         |
      | Non-Wind Premium                                     | Total Protection Credits                                | 1         |
      | Non-Wind Premium                                     | Perimeter Fence                                         | 1         |
      | Non-Wind Premium                                     | Gated Driveway                                          | 1         |
      | Non-Wind Premium                                     | Exterior Lighting                                       | 1         |
      | Non-Wind Premium                                     | Security Camera/Monitored CC Camera                     | 1         |
      | Non-Wind Premium                                     | Watchman/Security Guard                                 | 1         |
      | Non-Wind Premium                                     | Maximum Protection Credits                              | 0.85      |
      | Non-Wind Premium                                     | Base Non-Wind Premium 2 Intermediate                    | 0.921     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL)                             | 0.921     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL) Final                       | 0.921     |
      | Non-Wind Premium                                     | Non-Wind Duration Factor                                | 1         |
      | Non-Wind Premium                                     | Base Non-Wind Premium 3 Intermediate                    | 0.921     |
      | Non-Wind Premium                                     | Total Insured Value (TIV)                               | 1300000   |
      | Non-Wind Premium                                     | Constant 100                                            | 100       |
      | Non-Wind Premium                                     | Final Non-Wind Premium before Adjustment                | 11969.661 |
      | Non-Wind Premium                                     | Final Non-Wind Premium                                  | 11969.661 |
      | Wind Premium                                         | Wind Base Rate                                          | 0         |
      | Wind Premium                                         | Financial Responsibility Factor                         | 1.085     |
      | Wind Premium                                         | Planned Construction Type Factor                        | 0.93      |
      | Wind Premium                                         | Protection Class Factor                                 | 1         |
      | Wind Premium                                         | Flood Zone Adjustment                                   | 1.15      |
      | Wind Premium                                         | Project Type Factor                                     | 1         |
      | Wind Premium                                         | Age of Building Factor                                  | 1         |
      | Wind Premium                                         | Total Contractor Factor                                 | 0.893     |
      | Wind Premium                                         | PURE Preferred Contractor Credit                        | 0.95      |
      | Wind Premium                                         | Contractor's Years in Business                          | 1.1       |
      | Wind Premium                                         | Contractor's Loss History                               | 1         |
      | Wind Premium                                         | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Wind Premium                                         | Subrogation Against Contractor                          | 0.9       |
      | Wind Premium                                         | Opening Protection Factor                               | 1         |
      | Wind Premium                                         | Wind Rate on Line (ROL)                                 | 0         |
      | Wind Premium                                         | Wind Rate on Line (ROL) Final                           | 0         |
      | Wind Premium                                         | Wind Duration Factor                                    | 1         |
      | Wind Premium                                         | Total Insured Value (TIV)                               | 1300000   |
      | Wind Premium                                         | Constant 100                                            | 100       |
      | Wind Premium                                         | Final Wind Premium before Adjustment                    | 0         |
      | Wind Premium                                         | Final Wind Premium                                      | 0         |
      | Reporting - Location Premium Before Adjustments      | Location Premium                                        | 11970     |
      | Reporting - Location Premium Before                  | Reporting - Location Premium Before                     | 0         |
      | Reporting - Location Premium Before                  | Reporting - Premium Adjustment Total - Location Premium | 0         |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Premium          | 11970     |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL TIV              | 1300000   |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 100       | 100       |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Term             | 12        |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 12        | 12        |
      | Optional Coverages Premium                           | Display Only                                            | 0         |
      | Soft Costs Coverage                                  | Soft Costs Covergage                                    | 100       |
      | Soft Costs Coverage                                  | Optional Coverage Duration Factor                       | 1         |
      | Scaffolding and Other Construction Forms Coverage    | Scaffolding and Other Construction Forms                | 80        |
      | Scaffolding and Other Construction Forms Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Ensuing Fungi or Bacteria Coverage                   | Ensuing Fungi or Bacteria                               | 500       |
      | Ensuing Fungi or Bacteria Coverage                   | Optional Coverage Duration Factor                       | 1         |
      | Valuable Papers and Records Coverage                 | Valuable Papers and Records                             | 37.5      |
      | Valuable Papers and Records Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Property at a Temporary Storage Location Coverage    | Property at a Temporary Storage Location                | 0         |
      | Property at a Temporary Storage Location Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Property in Transit Coverage                         | Property in Transit                                     | 0         |
      | Property in Transit Coverage                         | Optional Coverage Duration Factor                       | 1         |
      | Sewer or Drain Backup Limit Coverage                 | Sewer or Drain Backup                                   | 242       |
      | Sewer or Drain Backup Limit Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Liability Limit Coverage                             | Liability Limit                                         | 250       |
      | Liability Limit Coverage                             | Optional Coverage Duration Factor                       | 1         |
      | Additional Optional Coverages                        | Additional Optional Coverages Premium                   | 1209.5    |
      | Total Optional Coverages Premium                     | Additional Optional Coverages                           | 1209.5    |
      | Total Optional Coverages Premium                     | Earthquake Extension                                    | 0         |
      | Total Optional Coverages Premium                     | Earthquake Base Premium                                 | 0         |
      | Total Optional Coverages Premium                     | Total Optional Coverages Premium                        | 1209.5    |
      | FAC Premium                                          | FAC Premium Value                                       | 1000      |
      | Commission Factor                                    | Commission Value                                        | 1         |
      | Surplus Lines Broker Fee                             | Surplus Lines Broker Fee                                | 350       |
      | Inspection Fee 0                                     | Location Inspection Fee NB                              | 350       |
      | Inspection Fee                                       | Location Inspection Fee                                 | 0         |
      | Location Premium                                     | Location Premium                                        | 11970     |
      | Location Premium                                     | Premium after Reset                                     | 11970     |
      | Reporting - Total Location Premium Before            | Reporting - Total Location Premium Before               | 11970     |
      | Reporting - Total Location Premium Before            | Total Optional Coverages Premium                        | 1210      |
      | Total Location Premium                               | HO Total Premium                                        | 14180     |
      | City Tax - ASHLAND                                   | Fire and Allied Perils City Min Tax                     | 0         |
      | County Tax - Boyd County                             | County Tax                                              | 0         |
      | City Tax - ASHLAND                                   | City Tax                                                | 0         |
      | Reporting - Municipality Tax total for the location  | Municipality Tax total for the location                 | 0         |
      | Reporting - Municipality Tax total for all locations | Municipality Tax total for all locations                | 0         |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Total Premium                  | 14180     |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge 100                            | 100       |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Factor                         | 1.8       |
      | E&S Premium Tax - Policy Premium                     | PHO Premium                                             | 14180     |
      | E&S Premium Tax - Policy Premium                     | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee 0                   | Location Inspection Fee                                 | 350       |
      | E&S Premium Tax - Inspection Fee 0                   | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee                     | E&S Premium Tax - Inspection Fee 0                      | 0         |
      | E&S Premium Tax - Surplus Lines Broker Fee           | Surplus Lines Broker Fee                                | 350       |
      | E&S Premium Tax - Surplus Lines Broker Fee           | Tax Percentage % - E&S Tax                              | 0.03      |
      | Stamping Fee - Policy Premium                        | PHO Premium                                             | 14180     |
      | Stamping Fee - Policy Premium                        | Stamping Fee %                                          | 0.018     |
      | Municipality Tax and State Surcharge                 | Municipality Tax and State Surcharge                    | 255.24    |
      | Stamping Fee - Inspection Fee 0                      | Location Inspection Fee                                 | 350       |
      | Stamping Fee - Inspection Fee 0                      | Stamping Fee %                                          | 0.018     |
      | Stamping Fee - Inspection Fee                        | Stamping Fee - Total Inspection Fee                     | 0         |
      | Stamping Fee - Broker Fee                            | Surplus Lines Broker Fee                                | 350       |
      | Stamping Fee - Broker Fee                            | Surplus Lines Broker Fee - stamping fee %               | 0.018     |
      | Grand Total Premium                                  | PHO Premium                                             | 14180     |
      | Grand Total Premium                                  | E&S Premium Tax - Policy Premium                        | 425.4     |
      | Grand Total Premium                                  | PHO Premium for Tax                                     | 14180     |
      | Grand Total Premium                                  | Tax Percentage % - E&S Tax                              | 0.03      |
      | Grand Total Premium                                  | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | Grand Total Premium                                  | PHO Inspection Fee for Tax                              | 350       |
      | Grand Total Premium                                  | Tax Percentage % - Inspection Fee                       | 0.03      |
      | Grand Total Premium                                  | Stamping Fee - Policy Premium                           | 255.24    |
      | Grand Total Premium                                  | PHO Premium for Stamping Fee                            | 14180     |
      | Grand Total Premium                                  | Stamping Fee %                                          | 0.018     |
      | Grand Total Premium                                  | Stamping Fee - Inspection Fee                           | 6.3       |
      | Grand Total Premium                                  | PHO Inspection Fee for Stamping Fee                     | 350       |
      | Grand Total Premium                                  | Stamping Fee % - Inspection Fee                         | 0.018     |
      | Grand Total Premium                                  | Total Inspection Fee                                    | 350       |
      | Grand Total Premium                                  | Inspection Fee                                          | 350       |
      | Grand Total Premium                                  | Number of Risk Locations                                | 1         |
      | Grand Total Premium                                  | Surplus Lines Broker Fee                                | 350       |
      | Grand Total Premium                                  | E&S Premium Tax - Broker Fee                            | 10.5      |
      | Grand Total Premium                                  | PHO Surplus Lines Broker Fee for Tax                    | 350       |
      | Grand Total Premium                                  | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03      |
      | Grand Total Premium                                  | Stamping Fee - Broker Fee                               | 6.3       |
      | Grand Total Premium                                  | Municipality Tax and State Surcharge                    | 255.24    |
      | State Mandated Assessments                           | E&S Premium Tax - Policy Premium                        | 425.4     |
      | State Mandated Assessments                           | PHO Premium for Tax                                     | 14180     |
      | State Mandated Assessments                           | Tax Percentage % - E&S Tax                              | 0.03      |
      | State Mandated Assessments                           | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | State Mandated Assessments                           | PHO Inspection Fee for Tax                              | 350       |
      | State Mandated Assessments                           | Tax Percentage % - Inspection Fee                       | 0.03      |
      | State Mandated Assessments                           | E&S Premium Tax - Broker Fee                            | 10.5      |
      | State Mandated Assessments                           | PHO Surplus Lines Broker Fee for Tax                    | 350       |
      | State Mandated Assessments                           | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03      |
      | State Mandated Assessments                           | Stamping Fee - Policy Premium                           | 255.24    |
      | State Mandated Assessments                           | PHO Premium for Stamping Fee                            | 14180     |
      | State Mandated Assessments                           | Stamping Fee %                                          | 0.018     |
      | State Mandated Assessments                           | Stamping Fee - Inspection Fee                           | 6.3       |
      | State Mandated Assessments                           | PHO Inspection Fee for Stamping Fee                     | 350       |
      | State Mandated Assessments                           | Stamping Fee % - Inspection Fee                         | 0.018     |
      | State Mandated Assessments                           | Stamping Fee - Broker Fee                               | 6.3       |
      | State Mandated Assessments                           | Municipality Tax and State Surcharge                    | 255.24    |

    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total annualized premium value "$17,474.00"
    * I verify municipality tax total for all locations "$0.00"
    * I verify municipality tax total service fee "$0.00"
    * I verify kentucky state surcharge "$314.53"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$1,170.08"
    * I verify grand total value "$18,994.08"

    Then I verify state mandated assessments "*State Mandated Assessments Include a Kentucky Municipal Tax on the premium, E&S Kentucky Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee of 1.80% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

    When I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                                             | factor                                                  | value     |
      | Dwelling                                             | Display Only                                            | 0         |
      | Other Structures                                     | Display Only                                            | 0         |
      | Contents                                             | Display Only                                            | 0         |
      | Loss of Use                                          | Display Only                                            | 0         |
      | All Other Perils Deductible                          | Display Only                                            | 0         |
      | Wildfire Deductible                                  | Display Only                                            | 0         |
      | Hurricane Deductible                                 | Display Only                                            | 0         |
      | Hail Deductible                                      | Display Only                                            | 0         |
      | Non-Wind Premium                                     | Non-Wind Base Rate                                      | 0.799     |
      | Non-Wind Premium                                     | Policy Extension Factor                                 | 1.25      |
      | Non-Wind Premium                                     | AOP Deductible Factor                                   | 1.25      |
      | Non-Wind Premium                                     | Windstorm or Hail Deductible                            | 1         |
      | Non-Wind Premium                                     | Financial Responsibility Factor                         | 1.085     |
      | Non-Wind Premium                                     | Planned Construction Type Factor                        | 0.93      |
      | Non-Wind Premium                                     | Protection Class Factor                                 | 1         |
      | Non-Wind Premium                                     | Flood Zone Adjustment                                   | 1.15      |
      | Non-Wind Premium                                     | Project Type Factor                                     | 1         |
      | Non-Wind Premium                                     | Age of Building Factor                                  | 1         |
      | Non-Wind Premium                                     | Total Contractor Factor                                 | 0.794     |
      | Non-Wind Premium                                     | PURE Preferred Contractor Credit                        | 0.95      |
      | Non-Wind Premium                                     | Contractor's Years in Business                          | 1.1       |
      | Non-Wind Premium                                     | Contractor's Loss History                               | 1         |
      | Non-Wind Premium                                     | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Non-Wind Premium                                     | Subrogation Against Contractor                          | 0.8       |
      | Non-Wind Premium                                     | Protection Credits                                      | 1         |
      | Non-Wind Premium                                     | Total Protection Credits                                | 1         |
      | Non-Wind Premium                                     | Perimeter Fence                                         | 1         |
      | Non-Wind Premium                                     | Gated Driveway                                          | 1         |
      | Non-Wind Premium                                     | Exterior Lighting                                       | 1         |
      | Non-Wind Premium                                     | Security Camera/Monitored CC Camera                     | 1         |
      | Non-Wind Premium                                     | Watchman/Security Guard                                 | 1         |
      | Non-Wind Premium                                     | Maximum Protection Credits                              | 0.85      |
      | Non-Wind Premium                                     | Base Non-Wind Premium 2 Intermediate                    | 1.151     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL)                             | 1.151     |
      | Non-Wind Premium                                     | Non-Wind Rate on Line (ROL) Final                       | 1.151     |
      | Non-Wind Premium                                     | Non-Wind Duration Factor                                | 1         |
      | Non-Wind Premium                                     | Base Non-Wind Premium 3 Intermediate                    | 1.151     |
      | Non-Wind Premium                                     | Total Insured Value (TIV)                               | 1300000   |
      | Non-Wind Premium                                     | Constant 100                                            | 100       |
      | Non-Wind Premium                                     | Final Non-Wind Premium before Adjustment                | 14962.076 |
      | Non-Wind Premium                                     | Final Non-Wind Premium                                  | 14962.076 |
      | Wind Premium                                         | Wind Base Rate                                          | 0         |
      | Wind Premium                                         | Policy Extension Factor                                 | 1.25      |
      | Wind Premium                                         | Financial Responsibility Factor                         | 1.085     |
      | Wind Premium                                         | Planned Construction Type Factor                        | 0.93      |
      | Wind Premium                                         | Protection Class Factor                                 | 1         |
      | Wind Premium                                         | Flood Zone Adjustment                                   | 1.15      |
      | Wind Premium                                         | Project Type Factor                                     | 1         |
      | Wind Premium                                         | Age of Building Factor                                  | 1         |
      | Wind Premium                                         | Total Contractor Factor                                 | 0.893     |
      | Wind Premium                                         | PURE Preferred Contractor Credit                        | 0.95      |
      | Wind Premium                                         | Contractor's Years in Business                          | 1.1       |
      | Wind Premium                                         | Contractor's Loss History                               | 1         |
      | Wind Premium                                         | Contractor Carries Adequate Liability Coverage          | 0.95      |
      | Wind Premium                                         | Subrogation Against Contractor                          | 0.9       |
      | Wind Premium                                         | Opening Protection Factor                               | 1         |
      | Wind Premium                                         | Wind Rate on Line (ROL)                                 | 0         |
      | Wind Premium                                         | Wind Rate on Line (ROL) Final                           | 0         |
      | Wind Premium                                         | Wind Duration Factor                                    | 1         |
      | Wind Premium                                         | Total Insured Value (TIV)                               | 1300000   |
      | Wind Premium                                         | Constant 100                                            | 100       |
      | Wind Premium                                         | Final Wind Premium before Adjustment                    | 0         |
      | Wind Premium                                         | Final Wind Premium                                      | 0         |
      | Reporting - Location Premium Before Adjustments      | Location Premium                                        | 14962     |
      | Reporting - Location Premium Before                  | Reporting - Location Premium Before                     | 0         |
      | Reporting - Location Premium Before                  | Reporting - Premium Adjustment Total - Location Premium | 0         |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Premium          | 14962     |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL TIV              | 1300000   |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 100       | 100       |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Term             | 12        |
      | Reporting - Location Premium Final ROL               | Reporting - Location Premium Final ROL Factor 12        | 12        |
      | Optional Coverages Premium                           | Display Only                                            | 0         |
      | Soft Costs Coverage                                  | Soft Costs Covergage                                    | 100       |
      | Soft Costs Coverage                                  | Optional Coverage Duration Factor                       | 1         |
      | Soft Costs Coverage                                  | Policy Extension Factor                                 | 1.25      |
      | Scaffolding and Other Construction Forms Coverage    | Scaffolding and Other Construction Forms                | 80        |
      | Scaffolding and Other Construction Forms Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Scaffolding and Other Construction Forms Coverage    | Policy Extension Factor                                 | 1.25      |
      | Ensuing Fungi or Bacteria Coverage                   | Ensuing Fungi or Bacteria                               | 500       |
      | Ensuing Fungi or Bacteria Coverage                   | Optional Coverage Duration Factor                       | 1         |
      | Ensuing Fungi or Bacteria Coverage                   | Policy Extension Factor                                 | 1.25      |
      | Valuable Papers and Records Coverage                 | Valuable Papers and Records                             | 37.5      |
      | Valuable Papers and Records Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Valuable Papers and Records Coverage                 | Policy Extension Factor                                 | 1.25      |
      | Property at a Temporary Storage Location Coverage    | Property at a Temporary Storage Location                | 0         |
      | Property at a Temporary Storage Location Coverage    | Optional Coverage Duration Factor                       | 1         |
      | Property at a Temporary Storage Location Coverage    | Policy Extension Factor                                 | 1.25      |
      | Property in Transit Coverage                         | Property in Transit                                     | 0         |
      | Property in Transit Coverage                         | Optional Coverage Duration Factor                       | 1         |
      | Property in Transit Coverage                         | Policy Extension Factor                                 | 1.25      |
      | Sewer or Drain Backup Limit Coverage                 | Sewer or Drain Backup                                   | 242       |
      | Sewer or Drain Backup Limit Coverage                 | Optional Coverage Duration Factor                       | 1         |
      | Sewer or Drain Backup Limit Coverage                 | Policy Extension Factor                                 | 1.25      |
      | Liability Limit Coverage                             | Liability Limit                                         | 250       |
      | Liability Limit Coverage                             | Optional Coverage Duration Factor                       | 1         |
      | Liability Limit Coverage                             | Policy Extension Factor                                 | 1.25      |
      | Additional Optional Coverages                        | Additional Optional Coverages Premium                   | 1511.875  |
      | Total Optional Coverages Premium                     | Additional Optional Coverages                           | 1511.88   |
      | Total Optional Coverages Premium                     | Earthquake Extension                                    | 0         |
      | Total Optional Coverages Premium                     | Earthquake Base Premium                                 | 0         |
      | Total Optional Coverages Premium                     | Total Optional Coverages Premium                        | 1511.88   |
      | FAC Premium                                          | FAC Premium Value                                       | 1000      |
      | Commission Factor                                    | Commission Value                                        | 1         |
      | Inspection Fee 0                                     | Location Inspection Fee NB                              | 350       |
      | Inspection Fee                                       | Location Inspection Fee                                 | 0         |
      | Location Premium                                     | Location Premium                                        | 14962     |
      | Location Premium                                     | Premium after Reset                                     | 14962     |
      | Reporting - Total Location Premium Before            | Reporting - Total Location Premium Before               | 14962     |
      | Reporting - Total Location Premium Before            | Total Optional Coverages Premium                        | 1512      |
      | Total Location Premium                               | HO Total Premium                                        | 17474     |
      | City Tax - ASHLAND                                   | Fire and Allied Perils City Min Tax                     | 0         |
      | County Tax - Boyd County                             | County Tax                                              | 0         |
      | City Tax - ASHLAND                                   | City Tax                                                | 0         |
      | Reporting - Municipality Tax total for the location  | Municipality Tax total for the location                 | 0         |
      | Reporting - Municipality Tax total for all locations | Municipality Tax total for all locations                | 0         |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Total Premium                  | 17474     |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge 100                            | 100       |
      | Reporting - Kentucky State Surcharge                 | Kentucky State Surcharge Factor                         | 1.8       |
      | E&S Premium Tax - Policy Premium                     | PHO Premium                                             | 17474     |
      | E&S Premium Tax - Policy Premium                     | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee 0                   | Location Inspection Fee                                 | 350       |
      | E&S Premium Tax - Inspection Fee 0                   | Tax Percentage % - E&S Tax                              | 0.03      |
      | E&S Premium Tax - Inspection Fee                     | E&S Premium Tax - Inspection Fee 0                      | 0         |
      | Stamping Fee - Policy Premium                        | PHO Premium                                             | 17474     |
      | Stamping Fee - Policy Premium                        | Stamping Fee %                                          | 0.018     |
      | Municipality Tax and State Surcharge                 | Municipality Tax and State Surcharge                    | 314.53    |
      | Stamping Fee - Inspection Fee 0                      | Location Inspection Fee                                 | 350       |
      | Stamping Fee - Inspection Fee 0                      | Stamping Fee %                                          | 0.018     |
      | Stamping Fee - Inspection Fee                        | Stamping Fee - Total Inspection Fee                     | 0         |
      | Grand Total Premium                                  | PHO Premium                                             | 17474     |
      | Grand Total Premium                                  | E&S Premium Tax - Policy Premium                        | 524.22    |
      | Grand Total Premium                                  | PHO Premium for Tax                                     | 17474     |
      | Grand Total Premium                                  | Tax Percentage % - E&S Tax                              | 0.03      |
      | Grand Total Premium                                  | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | Grand Total Premium                                  | PHO Inspection Fee for Tax                              | 350       |
      | Grand Total Premium                                  | Tax Percentage % - Inspection Fee                       | 0.03      |
      | Grand Total Premium                                  | Stamping Fee - Policy Premium                           | 314.532   |
      | Grand Total Premium                                  | PHO Premium for Stamping Fee                            | 17474     |
      | Grand Total Premium                                  | Stamping Fee %                                          | 0.018     |
      | Grand Total Premium                                  | Stamping Fee - Inspection Fee                           | 6.3       |
      | Grand Total Premium                                  | PHO Inspection Fee for Stamping Fee                     | 350       |
      | Grand Total Premium                                  | Stamping Fee % - Inspection Fee                         | 0.018     |
      | Grand Total Premium                                  | Total Inspection Fee                                    | 350       |
      | Grand Total Premium                                  | Inspection Fee                                          | 350       |
      | Grand Total Premium                                  | Number of Risk Locations                                | 1         |
      | Grand Total Premium                                  | Municipality Tax and State Surcharge                    | 314.53    |
      | State Mandated Assessments                           | E&S Premium Tax - Policy Premium                        | 524.22    |
      | State Mandated Assessments                           | PHO Premium for Tax                                     | 17474     |
      | State Mandated Assessments                           | Tax Percentage % - E&S Tax                              | 0.03      |
      | State Mandated Assessments                           | E&S Premium Tax - Inspection Fee                        | 10.5      |
      | State Mandated Assessments                           | PHO Inspection Fee for Tax                              | 350       |
      | State Mandated Assessments                           | Tax Percentage % - Inspection Fee                       | 0.03      |
      | State Mandated Assessments                           | Stamping Fee - Policy Premium                           | 314.532   |
      | State Mandated Assessments                           | PHO Premium for Stamping Fee                            | 17474     |
      | State Mandated Assessments                           | Stamping Fee %                                          | 0.018     |
      | State Mandated Assessments                           | Stamping Fee - Inspection Fee                           | 6.3       |
      | State Mandated Assessments                           | PHO Inspection Fee for Stamping Fee                     | 350       |
      | State Mandated Assessments                           | Stamping Fee % - Inspection Fee                         | 0.018     |
      | State Mandated Assessments                           | Municipality Tax and State Surcharge                    | 314.53    |

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