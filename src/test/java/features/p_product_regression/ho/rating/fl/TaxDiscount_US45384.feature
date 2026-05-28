@US45384 @US @FL @Homeowners @HO @PCRegression @2024 @December @Rating
Feature: US45384 - FL Home 1.75% Tax Discount

  @NB @END @RN @NewBusiness @Endorsement @Renewal
  Scenario: FL Home - NB/END/RN

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/09/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    And I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate that FL Home 1.75% discount matches for 1 locations on transaction "New Business"
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1        | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3008 Hatteras Point | Oviedo | FL    | 32765 | Condo/Co-op   | 1800000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city   | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 505 Villas Dr | Venice | FL    | 34285 | Homeowner     | 5000000 |           |        |            |

    And I review changes
    * I rate a quote
    And I validate that FL Home 1.75% discount matches for 2 locations on transaction "Endorsement"
    Then I review and accept referrals on renewal if any
    And I issue an endorsement

    Then I navigate to transactions or endorsements
    And I create a renewal
    When I navigate to policy image page
    Then I review changes
    * I click renewed premium
    And I validate that FL Home 1.75% discount matches for 2 locations on transaction "Renewal"

  @RenewalConversion @RC
  Scenario: FL Home - Renewal Conversion

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/08/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 6000000 |           |        |            |

    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I verify if element with message "Legislative Premium Discount" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    When I override subjectivities
    Then I create a renewal
    And I navigate to policy image page

    Then I review changes
    * I click renewed premium
    * I think for 8 to 10 seconds
    Then I validate that FL Home 1.75% discount matches for 1 locations on transaction "Renewal"
    And I review and accept referrals on renewal if any
    * I process a renewal

  @DayPrior @Prior @PreProd
  Scenario: FL Home - One Day Prior no Discount

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/08/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I verify if element with message "Legislative Premium Discount" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

  @DayPrior @Prior @PreProd
  Scenario: FL Home - UI Changes Prior to NB and RB

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "01/07/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1  | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 10 Windsor Dr | Englewood | FL    | 34223 | Homeowner     | 2000000 |           |        |            |

    * I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I verify if element with message "Legislative Premium Discount" is "Not Displayed" on the UI
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    Then I navigate to transactions or endorsements
    And I create a renewal
    Then I navigate to policy image page
    And I review changes
    * I click renewed premium
    Then I verify if element with message "Legislative Premium Discount" is "Not Displayed" on the UI
    * I review and accept referrals on renewal if any
    And I process a renewal

  @NB @END @RN @NewBusiness @Endorsement @PreProdNew
  Scenario: FL Home - PreProd

    Given I use "FL_001" regression test data from "QuoteCreatorHO" sheet
    When I am logged in to Pure as "P81" unless is PROD then "A1"
    Then I load random user data
    * I set "Effective_Date" to "11/09/2024"
    And I navigate to quotes page
    Then I initiate a new quote
    And I create a new "HO" quote

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1       | city  | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 14374 SW 163rd Ter | Miami | FL    | 33177 | Condo/Co-op   | 2000000 |           |        |            |

    Then I navigate to Homeowner Policy Page and add new risk location with basic details
      | addressLine1          | city      | state | zip   | residenceType | covAorC | lossOfUse | aopDed | deductible |
      | 3040 Palermo Rose Way | Kissimmee | FL    | 34746 | Tenants       | 2000000 |           |        |            |

    And I rate a quote
    When I navigate to premium page
    * I think for 5 to 6 seconds
    Then I validate that FL Home 1.75% discount matches for 1 locations on transaction "New Business"
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote
    When I override subjectivities

    And I navigate to transactions or endorsements
    Then I initiate new endorsement
    * I click add additional risk addresses
    And I set risk address 3 address line 1 to "3008 Hatteras Point"
    * I set risk address 3 city to "Oviedo"
    * I set risk address 3 state to "FL"
    * I set risk address 3 zip to "32765"
    * I set risk address 3 residence type to "Condo/Co-op"
    * I set risk address 3 contents to "1800000"
    * I click on the footer
    * I click order property details button
    * I set "City_Name_Txt" to "Oviedo"
    * I set "Zip_Code" to "32765"
    * I set "Residence_Type" to "Condo/Co-op"
    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    Then I fill out HO quote binding information page
    * I fill out HO quote inspection details page
    When I navigate to Homeowner Policy Page
    Then I click add additional risk addresses
    And I set risk address 4 address line 1 to "505 Villas Dr"
    * I set risk address 4 city to "Venice"
    * I set risk address 4 state to "FL"
    * I set risk address 4 zip to "34285"
    * I set risk address 4 residence type to "Homeowner"
    * I set risk address 4 replacement cost to "5000000"
    * I click on the footer
    * I click order property details button
    * I set "City_Name_Txt" to "Venice"
    * I set "Zip_Code" to "34285"
    * I set "Residence_Type" to "Homeowner"
    * I switch to new created node
    Then I fill out HO quote basic location coverage details page
    * I fill out HO quote elevation certificate details page
    * I fill out HO quote previous losses coverages page
    Then I fill out HO quote binding information page
    * I fill out HO quote inspection details page
    * I review changes
    * I rate a quote
    And I validate that FL Home 1.75% discount matches for 2 locations on transaction "Endorsement"
    Then I review and accept referrals on renewal if any
    And I issue an endorsement