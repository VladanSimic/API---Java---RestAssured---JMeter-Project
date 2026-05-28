@PersonalAuto @US42289
Feature: Carfax Call Logic - Mileage and value

  As an Underwriter I want us to trigger the call logic
  with the below mentioned details for the following vehicle type
  (Private & High Value Passenger Vehicles, Exotic, Antique and Collectors Cars)

  @NewBusiness
  Scenario Outline: Carfax Call Logic - US42289 - New Business - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42289" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote
    * I navigate to "Operators & Vehicles" page
    * I click the next page button
    * I click the next page button

    Then I verify private passenger carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueCurrentTerm | MarketValueCurrentTerm |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty               | NotEmpty               |

    When I click the next page button

    Then I verify classic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify antique collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify exotic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    @S1
    Examples:
      | TC_ID  | user | effectiveDate |
      | ND_001 | P126 | 10/01/2024    |
      | IL_001 | P127 | 10/01/2024    |
      | MN_001 | P128 | 10/01/2024    |
      | KY_001 | P129 | 10/01/2024    |
      | DC_001 | P130 | 10/01/2024    |
      | TX_001 | P131 | 10/01/2024    |
      | NC_001 | P132 | 11/15/2024    |
      | CA_001 | P133 | 12/16/2024    |

  @NewBusiness @Endorsement
  Scenario Outline: Carfax Call Logic - US42289 - New Business - Endorsement - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42289" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities

    When I select created policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement
    * I add changes on "PA" endorsement
    * I navigate to "Operators & Vehicles" page
    * I click the next page button
    * I click the next page button
    * I click the next page button

    Then I verify private passenger carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueCurrentTerm | MarketValueCurrentTerm |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty               | NotEmpty               |

    When I click the next page button

    Then I verify classic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify antique collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify exotic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    @S1
    Examples:
      | TC_ID  | user | effectiveDate |
      | AK_004 | P126 | 10/01/2024    |
      | IL_004 | P127 | 10/01/2024    |
      | MN_004 | P128 | 10/01/2024    |
      | KY_004 | P129 | 10/01/2024    |
      | DC_004 | P130 | 10/01/2024    |
      | TX_004 | P131 | 10/01/2024    |
      | NC_004 | P132 | 11/15/2024    |
      | CA_004 | P133 | 12/16/2024    |

  @NewBusiness @Renewal
  Scenario Outline: Carfax Call Logic - US42289 - New Business - Renewal - "<TC_ID>"

    Given I have entered test data for test case "<TC_ID>" in excel workbook "us/US42289" in sheet "QuoteCreatorPA" for "PA" LOB
    * I set "Effective_Date" to "<effectiveDate>"

    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote

    Then I get customer account ID

    When I open quote under customer
    * I navigate to quotes detail page
    * I create a new "PA" quote

    When I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals

    Then I bind a quote
    * I override subjectivities
    * I select created policy
    * I navigate to transactions or endorsements

    When I create a renewal
    * I navigate to policy image page
    * I add changes on "PA" renewal
    * I navigate to "Operators & Vehicles" page
    * I click the next page button
    * I click the next page button
    * I click the next page button

    Then I verify private passenger carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueCurrentTerm | MarketValueCurrentTerm |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty               | NotEmpty               |

    When I click the next page button

    Then I verify classic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify antique collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    When I click the next page button

    Then I verify exotic collectors carfax fields
      | EstimatedAnnualMileage | PrefillAnnualMileage | PrefillVersion | AgreedValueOfVehicle | OriginalAgreedValue |
      | NotEmpty               | NotEmpty             | NotEmpty       | NotEmpty             | NotEmpty            |

    @S1
    Examples:
      | TC_ID  | user | effectiveDate |
      | FL_007 | P126 | 10/01/2024    |
      | IL_007 | P127 | 10/01/2024    |
      | MN_007 | P128 | 10/01/2024    |
      | KY_007 | P129 | 10/01/2024    |
      | DC_007 | P130 | 10/01/2024    |
      | TX_007 | P131 | 10/01/2024    |
      | NC_007 | P132 | 11/15/2024    |
      | CA_007 | P133 | 12/16/2024    |