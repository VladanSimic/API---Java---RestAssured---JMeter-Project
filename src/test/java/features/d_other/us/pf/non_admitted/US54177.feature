@PrimaryFlood @NonAdmitted @US54177
Feature: FS - NonAdmitted - UI & Function - Construction Type Field
  As a Product Manager I want to make Construction Type field available in the Construction Details block

  @TC103593 @TC103595 @TC103597 @TC103599 @TC103600 @TC103601 @TC103610 @TC103632 @TC103633 @TC103634 @TC103635 @TC103636 @TC103637 @TC103642
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer

    Then I navigate to "Flood Surplus Lines Policy" page

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 7
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Brick                      |
      | Brick - Veneer             |
      | Fire Resistive             |
      | Frame                      |
      | Masonry                    |
      | Reinforced Poured Concrete |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Steel Moment Frame           |
      | Synthetic Stucco             |
      | Log Home                     |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | NY_001 |
      | MA_001 |
      | GA_001 |
      | NJ_001 |
      | VA_001 |
      | IL_001 |
      | FL_001 |
      | LA_001 |
      | NC_001 |
      | MO_001 |
      | AL_001 |
      | KY_001 |
      | MS_001 |
      | AR_001 |

  @TC103598 @TC103608
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer

    Then I navigate to "Flood Surplus Lines Policy" page

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 9
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Brick                      |
      | Brick - Veneer             |
      | Fire Resistive             |
      | Frame                      |
      | Masonry                    |
      | Reinforced Poured Concrete |
      | Log Home                   |
      | Steel Moment Frame         |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Synthetic Stucco             |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | CT_001 |
      | CO_001 |

  @TC103609
  Scenario Outline: US54177 - Verify Construction Type field values - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer

    Then I navigate to "Flood Surplus Lines Policy" page

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Brick                      |
      | Brick - Veneer             |
      | Fire Resistive             |
      | Frame                      |
      | Masonry                    |
      | Reinforced Poured Concrete |
      | Steel Moment Frame         |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Synthetic Stucco             |
      | Log Home                     |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | CA_001 |

  @TC103596
  Scenario Outline: US54177 - Verify Construction Type field and its values - "<state>" - 01/01/2025

    Given I use "<state>" smoke test data from "QuoteCreatorFS" sheet

    * I load random user data
    * I set "Effective_Date" to "01/01/2025"

    When I am logged in to Pure as "Field"
    * I create a new "PF" quote for a new customer

    Then I navigate to "Flood Surplus Lines Policy" page

    When I click on the "Construction Type" dropdown after scrolling "down"

    Then I verify dropdown size is 8
    * I verify dropdown values
      | values                     |
      | - Select -                 |
      | Brick                      |
      | Brick - Veneer             |
      | Fire Resistive             |
      | Frame                      |
      | Masonry                    |
      | Reinforced Poured Concrete |
      | Synthetic Stucco           |

    * I verify following options are not present in the "Construction Type" dropdown
      | values                       |
      | Steel Moment Frame           |
      | Log Home                     |
      | Frame - Stucco/EIFS Covering |

    * I take screenshot "Construction Type dropdown values"

    Examples:
      | state  |
      | TX_001 |