@CourseOfConstruction
Feature: Home course of construction

  @S1 @CA
  Scenario: E2E - CC - CA_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "CA_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total premium value "$5,922.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$210.58"
    * I verify grand total value "$6,832.58"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S California Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.18% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate CA                                   | 0.508    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.469    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 1875.797 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 1875.797 |
      | Wildfire Premium                                  | Wildfire Base Rate CA only                              | 0.307    |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.255    |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.255    |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 1021.055 |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 2897     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 2897     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 400000   |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 100       | 100      |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Term             | 12       |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 12        | 12       |
      | Optional Coverages Premium                        | Display Only                                            | 0        |
      | Soft Costs Coverage                               | Soft Costs Covergage                                    | 100      |
      | Soft Costs Coverage                               | Optional Coverage Duration Factor                       | 1        |
      | Scaffolding and Other Construction Forms Coverage | Scaffolding and Other Construction Forms                | 80       |
      | Scaffolding and Other Construction Forms Coverage | Optional Coverage Duration Factor                       | 1        |
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 0        |
      | Ensuing Fungi or Bacteria Coverage                | Optional Coverage Duration Factor                       | 1        |
      | Valuable Papers and Records Coverage              | Valuable Papers and Records                             | 37.5     |
      | Valuable Papers and Records Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Property at a Temporary Storage Location Coverage | Property at a Temporary Storage Location                | 0        |
      | Property at a Temporary Storage Location Coverage | Optional Coverage Duration Factor                       | 1        |
      | Property in Transit Coverage                      | Property in Transit                                     | 0        |
      | Property in Transit Coverage                      | Optional Coverage Duration Factor                       | 1        |
      | Sewer or Drain Backup Limit Coverage              | Sewer or Drain Backup                                   | 242      |
      | Sewer or Drain Backup Limit Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Liability Limit                                         | 500      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 959.5    |
      | Earthquake Base Premium                           | Base Earthquake Premium 1                               | 788.124  |
      | Earthquake Base Premium                           | Dwelling Replacement Value                              | 100000   |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Earthquake Rate (Rate per $100)                         | 0.788    |
      | Earthquake Base Premium                           | Earthquake Base Rate                                    | 0.139    |
      | Earthquake Base Premium                           | Territory Factor                                        | 0.711    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment                                 | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Range                    | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Upper                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Lower                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range Actual              | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Upper                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Constant 0.001            | 0.001    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Diff                      | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit                           | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Lower                     | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Ref                      | 1.703    |
      | Earthquake Base Premium                           | MMI                                                     | 1.04     |
      | Earthquake Base Premium                           | Construction Type / Year Built Factor EQ                | 3        |
      | Earthquake Base Premium                           | EQ Deductible Factor                                    | 1        |
      | Earthquake Base Premium                           | Soil Grade Factor                                       | 1.5      |
      | Earthquake Base Premium                           | Grade Under Location Factor                             | 1        |
      | Earthquake Base Premium                           | Number of Stories Factor                                | 1        |
      | Earthquake Base Premium                           | Retrofit Factor                                         | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor                                   | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Range                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Factor Upper                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Lower                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range Actual                     | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Upper                            | 2        |
      | Earthquake Base Premium                           | Partial Limits Percent Lower                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Constant 0.001                   | 0.001    |
      | Earthquake Base Premium                           | Partial Limits Percent Diff                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Percent                                  | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Ref                              | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Ref                               | 1        |
      | Earthquake Base Premium                           | Base Earthquake Premium 2                               | 1        |
      | Earthquake Base Premium                           | Other Structures Adjustment                             | 1        |
      | Earthquake Base Premium                           | Basic Contents Adjustment                               | 1        |
      | Earthquake Base Premium                           | Constant 1000                                           | 1000     |
      | Earthquake Base Premium                           | Basic Loss of Use Adjustment                            | 0        |
      | Earthquake Base Premium                           | EQ Constant 1000                                        | 1000     |
      | Earthquake Base Premium                           | Reset to null                                           | 0        |
      | Earthquake Base Premium                           | Base Earthquake Premium 3                               | 1065     |
      | Earthquake Base Premium                           | Base Earthquake Premium 2 (Calculated)                  | 788.12   |
      | Earthquake Base Premium                           | Base Earthquake Premium 3 (Calculated)                  | 1065     |
      | Earthquake Base Premium                           | Minimum Earthquake ROL                                  | 1        |
      | Earthquake Base Premium                           | Earthquake TIV                                          | 106500   |
      | Earthquake Base Premium                           | Earthquake Replacement Cost                             | 100000   |
      | Earthquake Base Premium                           | Earthquake Other Structures Coverage Amount             | 0        |
      | Earthquake Base Premium                           | Earthquake Contents Coverage Amount                     | 5000     |
      | Earthquake Base Premium                           | Earthquake Loss of Use Coverage Amount                  | 1500     |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Loss Assessment Deductible                              | 0        |
      | Earthquake Base Premium                           | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Base Premium                           | Earthquake Premium - Final                              | 1065     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 959.5    |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 1065     |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 2024.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 350      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 2897     |
      | Location Premium                                  | Premium after Reset                                     | 2897     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 2897     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 2025     |
      | Total Location Premium                            | HO Total Premium                                        | 5922     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 5922     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 350      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.03     |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 5922     |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee                                | 350      |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee - stamping fee %               | 0.002    |
      | Grand Total Premium                               | PHO Premium                                             | 5922     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 177.66   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 5922     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 10.66    |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 5922     |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.002    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.63     |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.002    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 350      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 10.5     |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | Grand Total Premium                               | Stamping Fee - Broker Fee                               | 0.63     |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 177.66   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 5922     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 10.5     |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 10.66    |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 5922     |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.002    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.63     |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.002    |
      | State Mandated Assessments                        | Stamping Fee - Broker Fee                               | 0.63     |

    When I return to premium summary page
    * I navigate to underwriting referrals page

    Then I verify that referral "CCR2" is "triggered"
    * I verify that referral "CCR17" is "triggered"
    * I verify that referral "CCR26" is "triggered"
    * I verify that referral "CCR27" is "triggered"
    * I verify that referral "CCR30" is "triggered"
    * I verify that referral "CCR32" is "triggered"
    * I verify that referral "CCR35" is "triggered"

    When I accept underwriting referrals
    * I bind a CC quote
    * I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "CC" endorsement
    * I review changes
    * I rate a quote

    Then I verify total annualized premium value "$5,922.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$210.58"
    * I verify grand total value "$6,832.58"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S California Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.18% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate CA                                   | 0.508    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.469    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.469    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 1875.797 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 1875.797 |
      | Wildfire Premium                                  | Wildfire Base Rate CA only                              | 0.307    |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.255    |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.255    |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 1021.055 |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 2897     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 2897     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 400000   |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 100       | 100      |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Term             | 12       |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Factor 12        | 12       |
      | Optional Coverages Premium                        | Display Only                                            | 0        |
      | Soft Costs Coverage                               | Soft Costs Covergage                                    | 100      |
      | Soft Costs Coverage                               | Optional Coverage Duration Factor                       | 1        |
      | Scaffolding and Other Construction Forms Coverage | Scaffolding and Other Construction Forms                | 80       |
      | Scaffolding and Other Construction Forms Coverage | Optional Coverage Duration Factor                       | 1        |
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 0        |
      | Ensuing Fungi or Bacteria Coverage                | Optional Coverage Duration Factor                       | 1        |
      | Valuable Papers and Records Coverage              | Valuable Papers and Records                             | 37.5     |
      | Valuable Papers and Records Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Property at a Temporary Storage Location Coverage | Property at a Temporary Storage Location                | 0        |
      | Property at a Temporary Storage Location Coverage | Optional Coverage Duration Factor                       | 1        |
      | Property in Transit Coverage                      | Property in Transit                                     | 0        |
      | Property in Transit Coverage                      | Optional Coverage Duration Factor                       | 1        |
      | Sewer or Drain Backup Limit Coverage              | Sewer or Drain Backup                                   | 242      |
      | Sewer or Drain Backup Limit Coverage              | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Liability Limit                                         | 500      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 959.5    |
      | Earthquake Base Premium                           | Base Earthquake Premium 1                               | 788.124  |
      | Earthquake Base Premium                           | Dwelling Replacement Value                              | 100000   |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Earthquake Rate (Rate per $100)                         | 0.788    |
      | Earthquake Base Premium                           | Earthquake Base Rate                                    | 0.139    |
      | Earthquake Base Premium                           | Territory Factor                                        | 0.711    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment                                 | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Range                    | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Upper                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Lower                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range Actual              | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Upper                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Constant 0.001            | 0.001    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Diff                      | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit                           | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Lower                     | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Ref                      | 1.703    |
      | Earthquake Base Premium                           | MMI                                                     | 1.04     |
      | Earthquake Base Premium                           | Construction Type / Year Built Factor EQ                | 3        |
      | Earthquake Base Premium                           | EQ Deductible Factor                                    | 1        |
      | Earthquake Base Premium                           | Soil Grade Factor                                       | 1.5      |
      | Earthquake Base Premium                           | Grade Under Location Factor                             | 1        |
      | Earthquake Base Premium                           | Number of Stories Factor                                | 1        |
      | Earthquake Base Premium                           | Retrofit Factor                                         | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor                                   | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Range                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Factor Upper                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Lower                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range Actual                     | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Upper                            | 2        |
      | Earthquake Base Premium                           | Partial Limits Percent Lower                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Constant 0.001                   | 0.001    |
      | Earthquake Base Premium                           | Partial Limits Percent Diff                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Percent                                  | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Ref                              | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Ref                               | 1        |
      | Earthquake Base Premium                           | Base Earthquake Premium 2                               | 1        |
      | Earthquake Base Premium                           | Other Structures Adjustment                             | 1        |
      | Earthquake Base Premium                           | Basic Contents Adjustment                               | 1        |
      | Earthquake Base Premium                           | Constant 1000                                           | 1000     |
      | Earthquake Base Premium                           | Basic Loss of Use Adjustment                            | 0        |
      | Earthquake Base Premium                           | EQ Constant 1000                                        | 1000     |
      | Earthquake Base Premium                           | Reset to null                                           | 0        |
      | Earthquake Base Premium                           | Base Earthquake Premium 3                               | 1065     |
      | Earthquake Base Premium                           | Base Earthquake Premium 2 (Calculated)                  | 788.12   |
      | Earthquake Base Premium                           | Base Earthquake Premium 3 (Calculated)                  | 1065     |
      | Earthquake Base Premium                           | Minimum Earthquake ROL                                  | 1        |
      | Earthquake Base Premium                           | Earthquake TIV                                          | 106500   |
      | Earthquake Base Premium                           | Earthquake Replacement Cost                             | 100000   |
      | Earthquake Base Premium                           | Earthquake Other Structures Coverage Amount             | 0        |
      | Earthquake Base Premium                           | Earthquake Contents Coverage Amount                     | 5000     |
      | Earthquake Base Premium                           | Earthquake Loss of Use Coverage Amount                  | 1500     |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Loss Assessment Deductible                              | 0        |
      | Earthquake Base Premium                           | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Base Premium                           | Earthquake Premium - Final                              | 1065     |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 959.5    |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 1065     |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 2024.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 350      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 2897     |
      | Location Premium                                  | Premium after Reset                                     | 2897     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 2897     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 2025     |
      | Total Location Premium                            | HO Total Premium                                        | 5922     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 5922     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 350      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.03     |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 5922     |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee                                | 350      |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee - stamping fee %               | 0.002    |
      | Grand Total Premium                               | PHO Premium                                             | 5922     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 177.66   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 5922     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 10.66    |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 5922     |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.002    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.63     |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.002    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 350      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 10.5     |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | Grand Total Premium                               | Stamping Fee - Broker Fee                               | 0.63     |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 177.66   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 5922     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 10.5     |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.03     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 10.66    |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 5922     |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.002    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.63     |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.002    |
      | State Mandated Assessments                        | Stamping Fee - Broker Fee                               | 0.63     |

    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR30" is "triggered"
    * I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total premium value "$7,152.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$238.56"
    * I verify grand total value "$7,740.56"

    Then I verify state mandated assessments "*State Mandated Assessments Include E&S California Premium Tax 3.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee) and Stamping fee 0.18% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate CA                                   | 0.508    |
      | Non-Wind Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.586    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.586    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.586    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.586    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 2344.746 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 2344.746 |
      | Wildfire Premium                                  | Wildfire Base Rate CA only                              | 0.307    |
      | Wildfire Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Wildfire Premium                                  | Wildfire Deductible Factor                              | 0.93     |
      | Wildfire Premium                                  | Wildfire Threat & Severity Factor                       | 1        |
      | Wildfire Premium                                  | Project Type Factor                                     | 1        |
      | Wildfire Premium                                  | Age of Building Factor                                  | 1        |
      | Wildfire Premium                                  | Total Contractor Factor                                 | 0.893    |
      | Wildfire Premium                                  | PURE Preferred Contractor Credit                        | 0.95     |
      | Wildfire Premium                                  | Contractor's Years in Business                          | 1.1      |
      | Wildfire Premium                                  | Contractor's Loss History                               | 1        |
      | Wildfire Premium                                  | Contractor Carries Adequate Liability Coverage          | 0.95     |
      | Wildfire Premium                                  | Subrogation Against Contractor                          | 0.9      |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL)                             | 0.319    |
      | Wildfire Premium                                  | Wildfire Rate on Line (ROL) Final                       | 0.319    |
      | Wildfire Premium                                  | Wildfire Duration Factor                                | 1        |
      | Wildfire Premium                                  | Total Insured Value (TIV)                               | 400000   |
      | Wildfire Premium                                  | Constant 100                                            | 100      |
      | Wildfire Premium                                  | Final Wildfire Premium                                  | 1276.318 |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 3621     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 3621     |
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
      | Ensuing Fungi or Bacteria Coverage                | Ensuing Fungi or Bacteria                               | 0        |
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
      | Liability Limit Coverage                          | Liability Limit                                         | 500      |
      | Liability Limit Coverage                          | Optional Coverage Duration Factor                       | 1        |
      | Liability Limit Coverage                          | Policy Extension Factor                                 | 1.25     |
      | Additional Optional Coverages                     | Additional Optional Coverages Premium                   | 1199.375 |
      | Earthquake Base Premium                           | Base Earthquake Premium 1                               | 788.124  |
      | Earthquake Base Premium                           | Dwelling Replacement Value                              | 100000   |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Earthquake Rate (Rate per $100)                         | 0.788    |
      | Earthquake Base Premium                           | Earthquake Base Rate                                    | 0.139    |
      | Earthquake Base Premium                           | Territory Factor                                        | 0.711    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment                                 | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Range                    | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Upper                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Lower                    | 1.703    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range Actual              | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Range                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Upper                     | 500000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Constant 0.001            | 0.001    |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Diff                      | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit                           | 100000   |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Limit Lower                     | 0        |
      | Earthquake Base Premium                           | Coverage A/C Adjustment Factor Ref                      | 1.703    |
      | Earthquake Base Premium                           | MMI                                                     | 1.04     |
      | Earthquake Base Premium                           | Construction Type / Year Built Factor EQ                | 3        |
      | Earthquake Base Premium                           | EQ Deductible Factor                                    | 1        |
      | Earthquake Base Premium                           | Soil Grade Factor                                       | 1.5      |
      | Earthquake Base Premium                           | Grade Under Location Factor                             | 1        |
      | Earthquake Base Premium                           | Number of Stories Factor                                | 1        |
      | Earthquake Base Premium                           | Retrofit Factor                                         | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor                                   | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Range                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Factor Upper                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Lower                             | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range Actual                     | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Range                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Upper                            | 2        |
      | Earthquake Base Premium                           | Partial Limits Percent Lower                            | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Constant 0.001                   | 0.001    |
      | Earthquake Base Premium                           | Partial Limits Percent Diff                             | 0        |
      | Earthquake Base Premium                           | Partial Limits Percent                                  | 1        |
      | Earthquake Base Premium                           | Partial Limits Percent Ref                              | 1        |
      | Earthquake Base Premium                           | Partial Limits Factor Ref                               | 1        |
      | Earthquake Base Premium                           | Base Earthquake Premium 2                               | 1        |
      | Earthquake Base Premium                           | Other Structures Adjustment                             | 1        |
      | Earthquake Base Premium                           | Basic Contents Adjustment                               | 1        |
      | Earthquake Base Premium                           | Constant 1000                                           | 1000     |
      | Earthquake Base Premium                           | Basic Loss of Use Adjustment                            | 0        |
      | Earthquake Base Premium                           | EQ Constant 1000                                        | 1000     |
      | Earthquake Base Premium                           | Reset to null                                           | 0        |
      | Earthquake Base Premium                           | Base Earthquake Premium 3                               | 1065     |
      | Earthquake Base Premium                           | Base Earthquake Premium 2 (Calculated)                  | 788.12   |
      | Earthquake Base Premium                           | Base Earthquake Premium 3 (Calculated)                  | 1065     |
      | Earthquake Base Premium                           | Minimum Earthquake ROL                                  | 1        |
      | Earthquake Base Premium                           | Earthquake TIV                                          | 106500   |
      | Earthquake Base Premium                           | Earthquake Replacement Cost                             | 100000   |
      | Earthquake Base Premium                           | Earthquake Other Structures Coverage Amount             | 0        |
      | Earthquake Base Premium                           | Earthquake Contents Coverage Amount                     | 5000     |
      | Earthquake Base Premium                           | Earthquake Loss of Use Coverage Amount                  | 1500     |
      | Earthquake Base Premium                           | Constant 100                                            | 100      |
      | Earthquake Base Premium                           | Loss Assessment Deductible                              | 0        |
      | Earthquake Base Premium                           | Optional Coverage Duration Factor                       | 1        |
      | Earthquake Base Premium                           | Policy Extension Factor                                 | 1.25     |
      | Earthquake Base Premium                           | Earthquake Premium - Final                              | 1331.25  |
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1199.38  |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 1331.25  |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 2530.63  |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 3621     |
      | Location Premium                                  | Premium after Reset                                     | 3621     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 3621     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 2531     |
      | Total Location Premium                            | HO Total Premium                                        | 7152     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 7152     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.03     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 7152     |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.002    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Grand Total Premium                               | PHO Premium                                             | 7152     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 214.56   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 7152     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.03     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.03     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 12.874   |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 7152     |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.002    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.63     |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.002    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 214.56   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 7152     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.03     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 10.5     |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.03     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 12.874   |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 7152     |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.002    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.63     |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.002    |

    When I return to premium summary page

    * I click review referrals

    Then I verify that referral "CCR2" is "triggered"
    * I verify that referral "CCR30" is "triggered"

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