@PrimaryFlood @NonAdmitted @DE45975
Feature: [In Sprint] Elevation of Residence field is empty

  Scenario Outline: DE45975 - Verify that Elevation of Residence is doing calculation of the related fields for "<state>" quotes

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet
    * I load random user data
    * I set "Effective_Date" to "01/01/2025"
    * I set "Elevation_Certificate_Base_Flood_Elevation" to "1000"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer
    * I click save changes button
    * I navigate to "Elevation Certificate" page

    Then I verify input field "Elevation of Residence" is read only and has value
    * I take screenshot "Elevation of Residence"

    @TC105565
    Examples:
      | state  |
      | NY_001 |

    @TC105573
    Examples:
      | state  |
      | MA_001 |

    @TC105574
    Examples:
      | state  |
      | TX_001 |

    @TC105575
    Examples:
      | state  |
      | GA_001 |

    @TC105576
    Examples:
      | state  |
      | CT_001 |

    @TC105577
    Examples:
      | state  |
      | NJ_001 |

    @TC105578
    Examples:
      | state  |
      | VA_001 |

    @TC105579
    Examples:
      | state  |
      | IL_001 |

    @TC105580
    Examples:
      | state  |
      | CO_001 |

    @TC105581
    Examples:
      | state  |
      | CA_001 |

    @TC105582
    Examples:
      | state  |
      | FL_001 |

    @TC105583
    Examples:
      | state  |
      | LA_001 |

    @TC105584
    Examples:
      | state  |
      | NC_001 |

    @TC105585
    Examples:
      | state  |
      | MO_001 |

    @TC105586
    Examples:
      | state  |
      | AL_001 |

    @TC105587
    Examples:
      | state  |
      | KY_001 |

    @TC105588
    Examples:
      | state  |
      | MS_001 |

    @TC105589
    Examples:
      | state  |
      | AR_001 |