@US50187 @Iteration4
Feature:PURE Programs - MS Home Surplus - Add required Flood Notice and EQ Notice

  Scenario Outline:TC_1 Home Surplus "<TC_ID>":  Verify required Flood Notice attach if selected No for Excess Flood NB/RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    Examples:
      | TC_ID  | user |
      | MS_001 | P75   |

  Scenario Outline:TC_2 Home Surplus "<TC_ID>":  Verify required EQ Notice attach if selected No for EQ extension NB/RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "Yes"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling" to "10%"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents" to "10%"

    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |


    Examples:
      | TC_ID  | user |
      | MS_001 | P76   |


  Scenario Outline:TC_3 Home Surplus "<TC_ID>":  Verify required flood notice is attached if selected "No" for Excess Flood. NB RWT

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Effective_Date" to "03/08/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements

    #     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    Examples:
      | TC_ID  | user |
      | MS_001 | P79   |

  Scenario Outline:TC_4 Home Surplus "<TC_ID>":  Verify required EQ notice form is attached if selected "No" for EQ Extension. NB RWT

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "Yes"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Dwelling" to "10%"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents" to "10%"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/08/2025"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements

    #     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |

    Examples:
      | TC_ID  | user |
      | MS_001 | P80   |

  Scenario Outline:TC_5 - Condo Home Surplus "<TC_ID>":  Verify required Flood Notice is attached if selected "No" for Excess Flood NB/EN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    Examples:
      | TC_ID  | user |
      | MS_001 | P81   |

  Scenario Outline:TC_6 - Condo Home Surplus "<TC_ID>":  Verify required EQ Notice is attached if selected "No" for EQ Extension NB/RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "Yes"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents" to "10%"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |

    Examples:
      | TC_ID  | user |
      | MS_001 | P82   |

  Scenario Outline:TC_7 - Condo Home Surplus "<TC_ID>":  Verify required Flood Notice is attached if selected "No" for Excess Flood NB RWT

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "Yes"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements

    #     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    Examples:
      | TC_ID  | user |
      | MS_001 | P83   |


  Scenario Outline:TC_8 - Condo Home Surplus "<TC_ID>":  Verify required EQ Notice is attached if selected "No" for EQ Extension NB/RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "Yes"
    * I set "Excess_Flood_What_Excess_Flood_Coverage_Limits_Do_You_Want_To_Purchase?_Contents" to "10%"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Risk_Addresses_Residence_Type" to "Condo/Co-op"
    * I set "Construction_Details_The_Floor_On_Which_The_Risk_Is_Located" to "1"


    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy
    Then I navigate to transactions or endorsements

    #     #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |

    * I review changes
    * I rate a quote
    * I complete rewrite transaction

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |

    Examples:
      | TC_ID  | user |
      | MS_001 | P84   |

  Scenario Outline:TC_9 Home Surplus "<TC_ID>":  Verify required Flood Notice and EQ Notice attach if selected No for Excess Flood and EQ Extension NB/RN

    Given I use "<TC_ID>" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Loss_Claim_History_Any_Prior_Losses" to "No"

    * I am logged in to Pure as "<user>"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    Then I bind a quote

    * I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    And I navigate to transactions or endorsements
    * I create a renewal
    * I navigate to policy image page
    * I navigate to Home Surplus Lines Policy Page
    * I approve uw referrals if visible and navigate back to policy image page

    * I fill out HS quote application page

    When I review changes
    * I think for 10 to 15 seconds
    * I click renewed premium
    * I navigate to underwriting alerts tab
    * I accept underwriting referrals
    * I process renewal or navigate to policy image and review changes and process renewal

    Then I navigate to transactions or endorsements
    * I select a transaction "Renewal"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Surplus Lines" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |

    Examples:
      | TC_ID  | user |
      | MS_001 | P85   |