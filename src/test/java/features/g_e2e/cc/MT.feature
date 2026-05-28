@CourseOfConstruction
Feature: Home course of construction

  @S1 @MT
  Scenario: E2E - CC - MT_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "MT_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total annualized premium value "$9,102.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$50.00"
    * I verify state mandated assessments value "$396.47"
    * I verify grand total value "$9,898.47"


    Then I verify state mandated assessments "*State Mandated Assessments Include a Montana Fire Tax 2.50% of the fire premium (fire premium is 60% of the premium, not including the inspection fee or surplus lines broker fee) and E&S Montana Premium Tax 2.75% of taxable premium (taxable premium includes inspection fee but DOES NOT include surplus lines broker fee)."

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.769    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1.15     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.993    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 3973.336 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 3973.336 |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1.255    |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1.15     |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 1        |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Wildfire Premium                                  | Wildfire Base Rate Non-CA                               | 0.22     |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.23     |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.23     |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 918.703  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 4892     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 4892     |
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
      | Earthquake Extension                              | EQ Premium                                              | 2000     |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 5        |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 2000     |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 3209.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 50       |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 4892     |
      | Location Premium                                  | Premium after Reset                                     | 4892     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 4892     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 3210     |
      | Total Location Premium                            | HO Total Premium                                        | 9102     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 9102     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Fire Tax                                          | PHO Premium                                             | 9102     |
      | Fire Tax                                          | Fire Marshal Tax Rate                                   | 0.015    |
      | Fire Tax                                          | Total Fire Marshal Tax                                  | 136.53   |
      | Grand Total Premium                               | PHO Premium                                             | 9102     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 250.305  |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 9102     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.028    |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.028    |
      | Grand Total Premium                               | Total Fire Marshal Tax                                  | 136.53   |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 50       |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 250.305  |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 9102     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.028    |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.028    |
      | State Mandated Assessments                        | Total Fire Marshal Tax                                  | 136.53   |

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

    Then I verify total annualized premium value "$9,102.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$50.00"
    * I verify state mandated assessments value "$396.47"
    * I verify grand total value "$9,898.47"

    Then I verify state mandated assessments "*State Mandated Assessments Include a Montana Fire Tax 2.50% of the fire premium (fire premium is 60% of the premium, not including the inspection fee or surplus lines broker fee) and E&S Montana Premium Tax 2.75% of taxable premium (taxable premium includes inspection fee but DOES NOT include surplus lines broker fee)."

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.769    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1.15     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.993    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.993    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 3973.336 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 3973.336 |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1.255    |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1.15     |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 1        |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Wildfire Premium                                  | Wildfire Base Rate Non-CA                               | 0.22     |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.23     |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.23     |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 918.703  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 4892     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 4892     |
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
      | Earthquake Extension                              | EQ Premium                                              | 2000     |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 5        |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 2000     |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 3209.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 50       |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 4892     |
      | Location Premium                                  | Premium after Reset                                     | 4892     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 4892     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 3210     |
      | Total Location Premium                            | HO Total Premium                                        | 9102     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 9102     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Fire Tax                                          | PHO Premium                                             | 9102     |
      | Fire Tax                                          | Fire Marshal Tax Rate                                   | 0.015    |
      | Fire Tax                                          | Total Fire Marshal Tax                                  | 136.53   |
      | Grand Total Premium                               | PHO Premium                                             | 9102     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 250.305  |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 9102     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.028    |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.028    |
      | Grand Total Premium                               | Total Fire Marshal Tax                                  | 136.53   |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 50       |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 250.305  |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 9102     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.028    |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.028    |
      | State Mandated Assessments                        | Total Fire Marshal Tax                                  | 136.53   |

    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total annualized premium value "$11,127.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$482.53"
    * I verify grand total value "$11,959.53"


    Then I verify state mandated assessments "*State Mandated Assessments Include a Montana Fire Tax 2.50% of the fire premium (fire premium is 60% of the premium, not including the inspection fee or surplus lines broker fee) and E&S Montana Premium Tax 2.75% of taxable premium (taxable premium includes inspection fee but DOES NOT include surplus lines broker fee)."

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.769    |
      | Non-Wind Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Windstorm or Hail Deductible                            | 0.97     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Non-Wind Premium                                  | Planned Construction Type Factor                        | 0.93     |
      | Non-Wind Premium                                  | Protection Class Factor                                 | 1        |
      | Non-Wind Premium                                  | Flood Zone Adjustment                                   | 1.15     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 1.242    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 1.242    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 1.242    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 1.242    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 4966.67  |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 4966.67  |
      | Wind Premium                                      | Wind Base Rate                                          | 0        |
      | Wind Premium                                      | Policy Extension Factor                                 | 1.25     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 1.255    |
      | Wind Premium                                      | Planned Construction Type Factor                        | 0.93     |
      | Wind Premium                                      | Protection Class Factor                                 | 1        |
      | Wind Premium                                      | Flood Zone Adjustment                                   | 1.15     |
      | Wind Premium                                      | Project Type Factor                                     | 1        |
      | Wind Premium                                      | Age of Building Factor                                  | 1        |
      | Wind Premium                                      | Total Contractor Factor                                 | 0.893    |
      | Wind Premium                                      | PURE Preferred Contractor Credit                        | 0.95     |
      | Wind Premium                                      | Contractor's Years in Business                          | 1.1      |
      | Wind Premium                                      | Contractor's Loss History                               | 1        |
      | Wind Premium                                      | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wind Premium                                      | Subrogation Against Contractor                          | 0.9      |
      | Wind Premium                                      | Opening Protection Factor                               | 1        |
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0        |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0        |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 400000   |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 0        |
      | Wind Premium                                      | Final Wind Premium                                      | 0        |
      | Wildfire Premium                                  | Wildfire Base Rate Non-CA                               | 0.22     |
      | Wildfire Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Financial Responsibility Factor                         | 1.255    |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.287    |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.287    |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 1148.378 |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 6115     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 6115     |
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
      | Earthquake Extension                              | EQ Premium                                              | 2500     |
      | Earthquake Extension                              | Earthquake Ext. Dwelling                                | 400000   |
      | Earthquake Extension                              | Thousand Constant                                       | 1000     |
      | Earthquake Extension                              | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Extension                              | EQ Rate Per 1000                                        | 5        |
      | Earthquake Extension                              | Policy Extension Factor                                 | 1.25     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1511.88  |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 2500     |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 4011.88  |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 6115     |
      | Location Premium                                  | Premium after Reset                                     | 6115     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 6115     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 4012     |
      | Total Location Premium                            | HO Total Premium                                        | 11127    |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 11127    |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.028    |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Fire Tax                                          | PHO Premium                                             | 11127    |
      | Fire Tax                                          | Fire Marshal Tax Rate                                   | 0.015    |
      | Fire Tax                                          | Total Fire Marshal Tax                                  | 166.905  |
      | Grand Total Premium                               | PHO Premium                                             | 11127    |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 305.993  |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 11127    |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.028    |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.028    |
      | Grand Total Premium                               | Total Fire Marshal Tax                                  | 166.91   |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 305.993  |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 11127    |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.028    |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 9.625    |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.028    |
      | State Mandated Assessments                        | Total Fire Marshal Tax                                  | 166.91   |

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