@CourseOfConstruction
Feature: Home course of construction

  @S1 @MS
  Scenario: E2E - CC - MS_001 - New Business - Endorsement - Policy Extension - Cancellation - Reinstatement - Roll Forward

    Given I use "MS_001" smoke test data from "QuoteCreatorCC" sheet

    When I am logged in to Pure as Field
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "CC" quote
    * I rate a quote

    Then I verify total annualized premium value "$9,844.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$764.45"
    * I verify grand total value "$11,308.45"


    Then I verify state mandated assessments "*State Mandated Assessments Include a Mississippi Windstorm Underwriting Association Fee 3.00% of the taxable premium (taxable premium includes inspection fee and surplus lines broker fee), E&S Mississippi Premium Tax 4.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee), and Stamping fee of 0.25% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.634    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.785    |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.528    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 1300000  |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 6869.844 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 6869.844 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.078    |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.785    |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.059    |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.059    |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 1300000  |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 764.179  |
      | Wind Premium                                      | Final Wind Premium                                      | 764.179  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 7634     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 7634     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 1300000  |
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
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1209.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 350      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 7634     |
      | Location Premium                                  | Premium after Reset                                     | 7634     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 7634     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1210     |
      | Total Location Premium                            | HO Total Premium                                        | 9844     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 9844     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 350      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.04     |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 9844     |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee                                | 350      |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee - stamping fee %               | 0.003    |
      | Mississippi Windstorm Underwriting Fee            | PHO Premium                                             | 9844     |
      | Mississippi Windstorm Underwriting Fee            | Surplus Lines Broker Fee                                | 350      |
      | Mississippi Windstorm Underwriting Fee            | Location Inspection Fee                                 | 350      |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Rate             | 0.03     |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Total            | 316.32   |
      | Grand Total Premium                               | PHO Premium                                             | 9844     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 393.76   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 9844     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.04     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 14       |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.04     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 24.61    |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 9844     |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.003    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.875    |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.003    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 350      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 14       |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.04     |
      | Grand Total Premium                               | Stamping Fee - Broker Fee                               | 0.88     |
      | Grand Total Premium                               | Mississippi Windstorm Underwriting Fee Total            | 316.32   |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 393.76   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 9844     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.04     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 14       |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.04     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 14       |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.04     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 24.61    |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 9844     |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.003    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.875    |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.003    |
      | State Mandated Assessments                        | Stamping Fee - Broker Fee                               | 0.88     |
      | State Mandated Assessments                        | Mississippi Windstorm Underwriting Fee Total            | 316.32   |

    When I return to premium summary page
    * I navigate to underwriting referrals page

    Then I verify that referral "CCR2" is "triggered"
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

    Then I verify total annualized premium value "$9,844.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$350.00"
    * I verify state mandated assessments value "$764.45"
    * I verify grand total value "$11,308.45"

    Then I verify state mandated assessments "*State Mandated Assessments Include a Mississippi Windstorm Underwriting Association Fee 3.00% of the taxable premium (taxable premium includes inspection fee and surplus lines broker fee), E&S Mississippi Premium Tax 4.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee), and Stamping fee of 0.25% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.634    |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.785    |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.528    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.528    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 1300000  |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 6869.844 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 6869.844 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.078    |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.785    |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.059    |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.059    |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 1300000  |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 764.179  |
      | Wind Premium                                      | Final Wind Premium                                      | 764.179  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 7634     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 7634     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 1300000  |
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
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1209.5   |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1209.5   |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Surplus Lines Broker Fee                          | Surplus Lines Broker Fee                                | 350      |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 7634     |
      | Location Premium                                  | Premium after Reset                                     | 7634     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 7634     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1210     |
      | Total Location Premium                            | HO Total Premium                                        | 9844     |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 9844     |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Surplus Lines Broker Fee                                | 350      |
      | E&S Premium Tax - Surplus Lines Broker Fee        | Tax Percentage % - E&S Tax                              | 0.04     |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 9844     |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee                                | 350      |
      | Stamping Fee - Broker Fee                         | Surplus Lines Broker Fee - stamping fee %               | 0.003    |
      | Mississippi Windstorm Underwriting Fee            | PHO Premium                                             | 9844     |
      | Mississippi Windstorm Underwriting Fee            | Surplus Lines Broker Fee                                | 350      |
      | Mississippi Windstorm Underwriting Fee            | Location Inspection Fee                                 | 350      |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Rate             | 0.03     |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Total            | 316.32   |
      | Grand Total Premium                               | PHO Premium                                             | 9844     |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 393.76   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 9844     |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.04     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 14       |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.04     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 24.61    |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 9844     |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.003    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.875    |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.003    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Surplus Lines Broker Fee                                | 350      |
      | Grand Total Premium                               | E&S Premium Tax - Broker Fee                            | 14       |
      | Grand Total Premium                               | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | Grand Total Premium                               | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.04     |
      | Grand Total Premium                               | Stamping Fee - Broker Fee                               | 0.88     |
      | Grand Total Premium                               | Mississippi Windstorm Underwriting Fee Total            | 316.32   |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 393.76   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 9844     |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.04     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 14       |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.04     |
      | State Mandated Assessments                        | E&S Premium Tax - Broker Fee                            | 14       |
      | State Mandated Assessments                        | PHO Surplus Lines Broker Fee for Tax                    | 350      |
      | State Mandated Assessments                        | E&S Tax Percentage % - Surplus Lines Broker Fee         | 0.04     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 24.61    |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 9844     |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.003    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.875    |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.003    |
      | State Mandated Assessments                        | Stamping Fee - Broker Fee                               | 0.88     |
      | State Mandated Assessments                        | Mississippi Windstorm Underwriting Fee Total            | 316.32   |

    When I return to premium summary page
    * I navigate to underwriting alerts tab

    Then I verify that referral "CCR33" is "triggered"

    When I accept underwriting referrals

    Then I issue a CC endorsement

    When I initiate a policy extension
    * I add changes on policy extension
    * I review changes
    * I click renewed premium

    Then I verify total annualized premium value "$12,054.00"
    * I verify inspection fee value "$350.00"
    * I verify surplus lines broker fee value "$0.00"
    * I verify state mandated assessments value "$899.30"
    * I verify grand total value "$13,303.30"


    Then I verify state mandated assessments "*State Mandated Assessments Include a Mississippi Windstorm Underwriting Association Fee 3.00% of the taxable premium (taxable premium includes inspection fee and surplus lines broker fee), E&S Mississippi Premium Tax 4.00% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee), and Stamping fee of 0.25% of taxable premium (taxable premium includes inspection fee and surplus lines broker fee)"

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
      | Non-Wind Premium                                  | Non-Wind Base Rate                                      | 0.634    |
      | Non-Wind Premium                                  | Policy Extension Factor                                 | 1.25     |
      | Non-Wind Premium                                  | AOP Deductible Factor                                   | 1.25     |
      | Non-Wind Premium                                  | Financial Responsibility Factor                         | 0.785    |
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
      | Non-Wind Premium                                  | Base Non-Wind Premium 2 Intermediate                    | 0.661    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL)                             | 0.661    |
      | Non-Wind Premium                                  | Non-Wind Rate on Line (ROL) Final                       | 0.661    |
      | Non-Wind Premium                                  | Non-Wind Duration Factor                                | 1        |
      | Non-Wind Premium                                  | Base Non-Wind Premium 3 Intermediate                    | 0.661    |
      | Non-Wind Premium                                  | Total Insured Value (TIV)                               | 1300000  |
      | Non-Wind Premium                                  | Constant 100                                            | 100      |
      | Non-Wind Premium                                  | Final Non-Wind Premium before Adjustment                | 8587.305 |
      | Non-Wind Premium                                  | Final Non-Wind Premium                                  | 8587.305 |
      | Wind Premium                                      | Wind Base Rate                                          | 0.078    |
      | Wind Premium                                      | Policy Extension Factor                                 | 1.25     |
      | Wind Premium                                      | Financial Responsibility Factor                         | 0.785    |
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
      | Wind Premium                                      | Wind Rate on Line (ROL)                                 | 0.073    |
      | Wind Premium                                      | Wind Rate on Line (ROL) Final                           | 0.073    |
      | Wind Premium                                      | Wind Duration Factor                                    | 1        |
      | Wind Premium                                      | Total Insured Value (TIV)                               | 1300000  |
      | Wind Premium                                      | Constant 100                                            | 100      |
      | Wind Premium                                      | Final Wind Premium before Adjustment                    | 955.224  |
      | Wind Premium                                      | Final Wind Premium                                      | 955.224  |
      | Reporting - Location Premium Before Adjustments   | Location Premium                                        | 9542     |
      | Reporting - Location Premium Before               | Reporting - Location Premium Before                     | 0        |
      | Reporting - Location Premium Before               | Reporting - Premium Adjustment Total - Location Premium | 0        |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL Premium          | 9542     |
      | Reporting - Location Premium Final ROL            | Reporting - Location Premium Final ROL TIV              | 1300000  |
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
      | Total Optional Coverages Premium                  | Additional Optional Coverages                           | 1511.88  |
      | Total Optional Coverages Premium                  | Earthquake Extension                                    | 0        |
      | Total Optional Coverages Premium                  | Earthquake Base Premium                                 | 0        |
      | Total Optional Coverages Premium                  | Total Optional Coverages Premium                        | 1511.88  |
      | FAC Premium                                       | FAC Premium Value                                       | 1000     |
      | Commission Factor                                 | Commission Value                                        | 1        |
      | Inspection Fee 0                                  | Location Inspection Fee NB                              | 350      |
      | Inspection Fee                                    | Location Inspection Fee                                 | 0        |
      | Location Premium                                  | Location Premium                                        | 9542     |
      | Location Premium                                  | Premium after Reset                                     | 9542     |
      | Reporting - Total Location Premium Before         | Reporting - Total Location Premium Before               | 9542     |
      | Reporting - Total Location Premium Before         | Total Optional Coverages Premium                        | 1512     |
      | Total Location Premium                            | HO Total Premium                                        | 12054    |
      | E&S Premium Tax - Policy Premium                  | PHO Premium                                             | 12054    |
      | E&S Premium Tax - Policy Premium                  | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee 0                | Location Inspection Fee                                 | 350      |
      | E&S Premium Tax - Inspection Fee 0                | Tax Percentage % - E&S Tax                              | 0.04     |
      | E&S Premium Tax - Inspection Fee                  | E&S Premium Tax - Inspection Fee 0                      | 0        |
      | Stamping Fee - Policy Premium                     | PHO Premium                                             | 12054    |
      | Stamping Fee - Policy Premium                     | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee 0                   | Location Inspection Fee                                 | 350      |
      | Stamping Fee - Inspection Fee 0                   | Stamping Fee %                                          | 0.003    |
      | Stamping Fee - Inspection Fee                     | Stamping Fee - Total Inspection Fee                     | 0        |
      | Mississippi Windstorm Underwriting Fee            | PHO Premium                                             | 12054    |
      | Mississippi Windstorm Underwriting Fee            | Location Inspection Fee                                 | 350      |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Rate             | 0.03     |
      | Mississippi Windstorm Underwriting Fee            | Mississippi Windstorm Underwriting Fee Total            | 372.12   |
      | Grand Total Premium                               | PHO Premium                                             | 12054    |
      | Grand Total Premium                               | E&S Premium Tax - Policy Premium                        | 482.16   |
      | Grand Total Premium                               | PHO Premium for Tax                                     | 12054    |
      | Grand Total Premium                               | Tax Percentage % - E&S Tax                              | 0.04     |
      | Grand Total Premium                               | E&S Premium Tax - Inspection Fee                        | 14       |
      | Grand Total Premium                               | PHO Inspection Fee for Tax                              | 350      |
      | Grand Total Premium                               | Tax Percentage % - Inspection Fee                       | 0.04     |
      | Grand Total Premium                               | Stamping Fee - Policy Premium                           | 30.135   |
      | Grand Total Premium                               | PHO Premium for Stamping Fee                            | 12054    |
      | Grand Total Premium                               | Stamping Fee %                                          | 0.003    |
      | Grand Total Premium                               | Stamping Fee - Inspection Fee                           | 0.875    |
      | Grand Total Premium                               | PHO Inspection Fee for Stamping Fee                     | 350      |
      | Grand Total Premium                               | Stamping Fee % - Inspection Fee                         | 0.003    |
      | Grand Total Premium                               | Total Inspection Fee                                    | 350      |
      | Grand Total Premium                               | Inspection Fee                                          | 350      |
      | Grand Total Premium                               | Number of Risk Locations                                | 1        |
      | Grand Total Premium                               | Mississippi Windstorm Underwriting Fee Total            | 372.12   |
      | State Mandated Assessments                        | E&S Premium Tax - Policy Premium                        | 482.16   |
      | State Mandated Assessments                        | PHO Premium for Tax                                     | 12054    |
      | State Mandated Assessments                        | Tax Percentage % - E&S Tax                              | 0.04     |
      | State Mandated Assessments                        | E&S Premium Tax - Inspection Fee                        | 14       |
      | State Mandated Assessments                        | PHO Inspection Fee for Tax                              | 350      |
      | State Mandated Assessments                        | Tax Percentage % - Inspection Fee                       | 0.04     |
      | State Mandated Assessments                        | Stamping Fee - Policy Premium                           | 30.135   |
      | State Mandated Assessments                        | PHO Premium for Stamping Fee                            | 12054    |
      | State Mandated Assessments                        | Stamping Fee %                                          | 0.003    |
      | State Mandated Assessments                        | Stamping Fee - Inspection Fee                           | 0.875    |
      | State Mandated Assessments                        | PHO Inspection Fee for Stamping Fee                     | 350      |
      | State Mandated Assessments                        | Stamping Fee % - Inspection Fee                         | 0.003    |
      | State Mandated Assessments                        | Mississippi Windstorm Underwriting Fee Total            | 372.12   |

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