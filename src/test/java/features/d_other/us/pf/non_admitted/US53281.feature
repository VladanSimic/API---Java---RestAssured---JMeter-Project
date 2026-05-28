@PrimaryFlood @NonAdmitted @US53281
Feature: [Continued] FS - NonAdmitted Flood - State Stamping Fee Rate

  Scenario Outline: US53281 - Verify that the correct stamping fee factor is applied to the PF "<state>" quotes

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I click "rate" button
    * I navigate to premium details page

    Then I verify coverage factor and factor value
      | coverage                      | factor         | value |
      | Stamping Fee - Policy Premium | PHO Premium    | 0     |
      | Stamping Fee - Policy Premium | Stamping Fee % | <fee> |

    Then I take screenshot "Premium Details"

    @TC104431
    Examples:
      | state  | fee   |
      | CA_001 | 0.002 |

    @TC104459
    Examples:
      | state  | fee |
      | TX_001 | 0   |

    @TC104460
    Examples:
      | state  | fee   |
      | NC_001 | 0.003 |

    @TC104461
    Examples:
      | state  | fee   |
      | NY_001 | 0.002 |

    @TC104462
    Examples:
      | state  | fee   |
      | MS_001 | 0.003 |

    @TC104463
    Examples:
      | state  | fee   |
      | KY_001 | 0.018 |

    @TC104464
    Examples:
      | state  | fee |
      | IL_001 | 0   |

    @TC104467
    Examples:
      | state  | fee   |
      | FL_001 | 0.001 |

    @TC104468
    Examples:
      | state  | fee   |
      | CO_001 | 0.002 |

  Scenario Outline: US53281 - Verify that the Stamping Fee is not applied in "<state>" where it is not applicable

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I click "rate" button
    * I navigate to premium details page

    Then I verify coverage "Stamping Fee - Policy Premium" factor "PHO Premium" is not present
    * I verify coverage "Stamping Fee - Policy Premium" factor "Stamping Fee %" is not present
    * I take screenshot "Premium Details"

    @TC104482
    Examples:
      | state  |
      | GA_001 |

    @TC104483
    Examples:
      | state  |
      | CT_001 |

    @TC104484
    Examples:
      | state  |
      | MA_001 |

    @TC104485
    Examples:
      | state  |
      | NJ_001 |

    @TC104486
    Examples:
      | state  |
      | VA_001 |

    @TC104487
    Examples:
      | state  |
      | LA_001 |

    @TC104488
    Examples:
      | state  |
      | MO_001 |

    @TC104489
    Examples:
      | state  |
      | AL_001 |

    @TC104490
    Examples:
      | state  |
      | AR_001 |