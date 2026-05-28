@PrimaryFlood @NonAdmitted @US61196
Feature: Change Request: FS NonAdmitted - Update Disclaimer Sentence on Quote Summary, Quote Details and Premium Summary Screens in Internal & Broker View

  Scenario Outline: US61196 - "<state>" - Verify Display and Placement of the Additional language on the UI

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet
    * I load random user data
    * I turn off optional data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Sublimit_Basement_Contents" to "10,000"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO quote earthquake details page
    * I fill out HO quote wildfire details page
    * I fill out HO quote optional coverages page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines
    * I think for 5 to 10 seconds

    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - quote details page"

    When I navigate to "summary" tab

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - summary page"

    When I create a new "PF" quote
    * I rate an FS quote

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - premium summary page"

    * I verify "*Coverage cannot be bound until the following attestation is completed.*" label is "visible" on page
    * I verify "In authorizing binding of this surplus lines flood policy, I confirm and attest that the insured has been informed that:" label is "visible" on page
    * I verify "a) coverage will be issued by a surplus lines or non-admitted insurer;" label is "visible" on page
    * I verify "b) the insurer is not authorized (licensed) by the state insurance department, and the department does not have authority over policy forms used or premiums charged;" label is "visible" on page
    * I verify "c) in the event of insolvency, insurance guaranty fund protection may not exist and there is no guarantee a claim will be fully covered; and " label is "visible" on page
    * I verify "d) any state-specific form or notice required to be delivered to or signed by the insured has been duly signed, is on file in our office, and is available to PURE Programs upon request." label is "visible" on page
    * I verify checkbox "I confirm the above statements." is "visible" on page
    * I scroll to "I confirm the above statements." element
    * I take screenshot "Additional language with a checkbox - premium summary page"

    When I navigate to "underwriting referrals" tab
    * I accept underwriting referrals
    * I click ">>> request bind" button
    * I click "bind" button

    Then I verify validation message "You must complete the attestation below before requesting bind." is displayed
    * I take screenshot "Validation message on bind"

    When I check checkbox "I confirm the above statements."
    * I think for 5 to 10 seconds
    * I click "bind" button
    * I fill policy delivery details "Yes" "PrintByPure"
    * I click ">>> request bind" button

    Then I navigate to FS policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I scroll "up" the page

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - policy image page - END"

    When I navigate to "summary" tab
    * I think for 7 to 13 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - summary page - END"

    When I navigate to "premium summary" tab
    * I think for 7 to 13 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - premium summary page - END"

    * I verify "*Coverage cannot be bound until the following attestation is completed.*" label is "visible" on page
    * I verify "In authorizing binding of this surplus lines flood policy, I confirm and attest that the insured has been informed that:" label is "visible" on page
    * I verify "a) coverage will be issued by a surplus lines or non-admitted insurer;" label is "visible" on page
    * I verify "b) the insurer is not authorized (licensed) by the state insurance department, and the department does not have authority over policy forms used or premiums charged;" label is "visible" on page
    * I verify "c) in the event of insolvency, insurance guaranty fund protection may not exist and there is no guarantee a claim will be fully covered; and " label is "visible" on page
    * I verify "d) any state-specific form or notice required to be delivered to or signed by the insured has been duly signed, is on file in our office, and is available to PURE Programs upon request." label is "visible" on page
    * I verify checkbox "I confirm the above statements." is "visible" on page
    * I take screenshot "Additional language with a checkbox - premium summary page - END"

    @TC116156
    Examples:
      | state  |
      | CA_001 |

    @TC116157
    Examples:
      | state  |
      | MO_001 |

    @TC116158
    Examples:
      | state  |
      | KY_001 |

    @TC116159
    Examples:
      | state  |
      | AR_001 |

  Scenario Outline: US61196 - "<state>" - Verify Display and Placement of the Additional language on the UI

    Given I use "<state>" smoke test data from "QuoteCreatorHSFS" sheet
    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set "Sublimit_Basement_Contents" to "10,000"

    When I am logged in to Pure as "Field"
    * I initiate a new quote for a new customer
    * I fill out HS quote cover page
    * I fill out HS quote basic location coverage details page
    * I fill out HS quote optional coverages page
    * I fill out HS previous claim losses page
    * I fill out HS quote earthquake details page
    * I fill out HS quote wildfire details page
    * I fill out HS quote member information page
    * I navigate to location page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines
    * I think for 5 to 10 seconds

    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - quote details page"

    When I navigate to "summary" tab
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - summary page"

    When I create a new "PF" quote
    * I rate an FS quote

    * I think for 7 to 13 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - premium summary page"

    * I verify "*Coverage cannot be bound until the following attestation is completed.*" label is "visible" on page
    * I verify "In authorizing binding of this surplus lines flood policy, I confirm and attest that the insured has been informed that:" label is "visible" on page
    * I verify "a) coverage will be issued by a surplus lines or non-admitted insurer;" label is "visible" on page
    * I verify "b) the insurer is not authorized (licensed) by the state insurance department, and the department does not have authority over policy forms used or premiums charged;" label is "visible" on page
    * I verify "c) in the event of insolvency, insurance guaranty fund protection may not exist and there is no guarantee a claim will be fully covered; and " label is "visible" on page
    * I verify "d) any state-specific form or notice required to be delivered to or signed by the insured has been duly signed, is on file in our office, and is available to PURE Programs upon request." label is "visible" on page
    * I verify checkbox "I confirm the above statements." is "visible" on page
    * I scroll to "I confirm the above statements." element
    * I take screenshot "Additional language with a checkbox - premium summary page"

    When I navigate to "underwriting referrals" tab
    * I accept underwriting referrals
    * I click ">>> request bind" button if it is visible
    * I click "bind" button

    Then I verify validation message "You must complete the attestation below before requesting bind." is displayed
    * I take screenshot "Validation message on bind"

    When I check checkbox "I confirm the above statements."
    * I think for 5 to 10 seconds
    * I click "bind" button
    * I fill policy delivery details "Yes" "PrintByPure"
    * I click ">>> request bind" button

    Then I navigate to FS policy
    * I navigate to transactions or endorsements
    * I initiate new endorsement

    When I scroll "up" the page

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - policy image page - END"

    When I navigate to "summary" tab
    * I think for 7 to 13 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - summary page - END"

    When I navigate to "premium summary" tab
    * I think for 7 to 13 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - premium summary page - END"

    * I verify "*Coverage cannot be bound until the following attestation is completed.*" label is "visible" on page
    * I verify "In authorizing binding of this surplus lines flood policy, I confirm and attest that the insured has been informed that:" label is "visible" on page
    * I verify "a) coverage will be issued by a surplus lines or non-admitted insurer;" label is "visible" on page
    * I verify "b) the insurer is not authorized (licensed) by the state insurance department, and the department does not have authority over policy forms used or premiums charged;" label is "visible" on page
    * I verify "c) in the event of insolvency, insurance guaranty fund protection may not exist and there is no guarantee a claim will be fully covered; and " label is "visible" on page
    * I verify "d) any state-specific form or notice required to be delivered to or signed by the insured has been duly signed, is on file in our office, and is available to PURE Programs upon request." label is "visible" on page
    * I verify checkbox "I confirm the above statements." is "visible" on page
    * I take screenshot "Additional language with a checkbox - premium summary page - END"

    @TC116160
    Examples:
      | state  |
      | FL_001 |

    @TC116161
    Examples:
      | state  |
      | LA_001 |

    @TC116162
    Examples:
      | state  |
      | NC_001 |

    @TC116163
    Examples:
      | state  |
      | AL_001 |

    @TC116164
    Examples:
      | state  |
      | MS_001 |

  Scenario Outline: US61196 - "<state>" - Verify Display and Placement of the Additional language on the UI

    Given I use "<state>" smoke test data from "QuoteCreatorHOFS" sheet

    * I load random user data
    * I set "Effective_Date" to "09/07/2025"
    * I set "Endorsement_Effective_Date_END" to "09/08/2025"
    * I set all optional coverages to no
    * I set "Licensed_Producer_AWS_QA" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_QA" to "Milan Josifljevic"
    * I set "Licensed_Producer_AWS_STG" to "Milan Josifljevic"
    * I set "Advisor_Servicer_AWS_STG" to "Milan Josifljevic"

    When I am logged in to Pure as "Agent3"
    * I initiate a new quote for a new customer
    * I fill out HO quote cover page
    * I fill out HO quote basic location coverage details page
    * I fill out HO previous claim losses page
    * I fill out HO quote member information page
    * I fill out HO Flood Coverage page
    * I click to create a Non-Admitted Primary Flood quote
    * I click Link to Flood Surplus Lines
    * I think for 5 to 10 seconds

    * I navigate to quotes detail page
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - quote details page"

    When I navigate to "summary" tab
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - summary page"

    When I create a new "PF" quote
    * I rate an FS quote
    * I think for 5 to 10 seconds

    Then I verify "-Coverage in this quotation is offered by Patricia Quina, a PURE Programs licensed surplus lines broker, on behalf of National Fire & Marine Insurance Company, an eligible surplus lines insurer." label is "visible" on page
    * I verify "-Coverage, including premium is subject to change depending on underlying information and requested limits of liability." label is "visible" on page
    * I verify "-Prior to binding coverage, the retail broker must satisfy the Home State's diligent search requirement." label is "visible" on page
    * I verify "-A 7-day waiting period may apply (see coverage terms)." label is "visible" on page
    * I verify "-This is a companion quote to the Homeowners' quote, and may be bound simultaneously with the Home quote or on a future date after Home coverage is in effect." label is "visible" on page
    * I take screenshot "New sentences - premium summary page"

    * I verify "*Coverage cannot be bound until the following attestation is completed.*" label is "visible" on page
    * I verify "In authorizing binding of this surplus lines flood policy, I confirm and attest that the insured has been informed that:" label is "visible" on page
    * I verify "a) coverage will be issued by a surplus lines or non-admitted insurer;" label is "visible" on page
    * I verify "b) the insurer is not authorized (licensed) by the state insurance department, and the department does not have authority over policy forms used or premiums charged;" label is "visible" on page
    * I verify "c) in the event of insolvency, insurance guaranty fund protection may not exist and there is no guarantee a claim will be fully covered; and " label is "visible" on page
    * I verify "d) any state-specific form or notice required to be delivered to or signed by the insured has been duly signed, is on file in our office, and is available to PURE Programs upon request." label is "visible" on page
    * I verify checkbox "I confirm the above statements." is "visible" on page
    * I scroll to "I confirm the above statements." element
    * I take screenshot "Additional language with a checkbox - premium summary page"

    @TC116165
    Examples:
      | state  |
      | MA_001 |

    @TC116167
    Examples:
      | state  |
      | GA_001 |

    @TC116168
    Examples:
      | state  |
      | CT_001 |

    @TC116169
    Examples:
      | state  |
      | NJ_001 |

    @TC116170
    Examples:
      | state  |
      | IL_001 |

    @TC116171
    Examples:
      | state  |
      | CO_001 |