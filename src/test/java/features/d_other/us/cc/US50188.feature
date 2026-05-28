@US50188 @Iteration4
Feature:US50188 - PURE Programs - MS Course of Construction - Add required Flood Notice and EQ Notice

  @US50188 @CC
  Scenario: TC_1 CC MS - Homeowner | Verify required Flood Notice attach for Homeowner residence type NB

    Given I use "MS_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P79"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverage_Earthquake_Extension" to "5% of dwelling replacement cost"

    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties. |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                     |


  @US50188 @CC
  Scenario: TC_2 CC MS - Homeowner - Verify required EQ Notice attach if selected No for EQ extension

    Given I use "MS_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P79"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverage_Earthquake_Extension" to "No"

    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |


  @US50188 @CC
  Scenario: TC_3 CC MS - Condo - Verify required Flood Notice attach if residence type Condo

    Given I use "MS_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P80"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverage_Earthquake_Extension" to "5% of dwelling replacement cost"
    * I set "City_Name_Txt" to "Aberdeen"

    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote
    * I navigate to location page
    * I write text to "Residence Type" and value is "Condo/Co-op"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | This policy contains a flood exclusion. Flood coverage may be purchased separately from the National Flood Insurance Program, if available in your area.                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | PPHV-DSC-MS-006 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | IMPORTANT FLOOD INSURANCE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Your policy excludes coverage for damage caused by flooding of all types. This exclusion may exclude any and all damages resulting from storm surge from a hurricane, surface water, flash floods, waves, tidal water, tidal waves, wind driven rain or water, or any other overflow of water, and spray from any of these events. For further details, please see the language of your policy. The language of your policy will control the obligations of the parties.                                                                                                                                 |
      | You are further advised that to be covered for such a loss, you will have to obtain a separate flood insurance policy through the National Flood Insurance Program (NFIP). Your insurance agent or company representative can provide you with information regarding obtaining flood insurance from the NFIP and whether it is available in your location. The NFIP can provide both structure and contents coverage                                                                                                                                                                                     |


  @US50188 @CC
  Scenario: TC_4 CC MS - Condo | Verify required EQ Notice attach if residence type Condo

    Given I use "MS_001" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data

    * I am logged in to Pure as "P80"
    * I set "Underwriter" to "Danijel Radoja"
    * I set "Effective_Date" to "03/08/2025"
    * I set "Endorsement_Effective_Date_END" to "03/09/2025"
    * I set "Optional_Coverage_Earthquake_Extension" to "No"
    * I set "City_Name_Txt" to "Aberdeen"

    * I navigate to quotes page
    * I initiate a new quote
    * I get customer account ID

    And I open quote under customer
    * I navigate to quotes detail page

    Then I create a new "CC" quote
    * I navigate to location page
    * I write text to "Residence Type" and value is "Condo/Co-op"
    * I rate a quote
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy

    Then I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 25 to 35 seconds
    * I download the file "Home Course of Construction" and verify keywords
      | This policy contains an earthquake exclusion. Contact your agent for information concerning the availability of earthquake coverage.                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | PPHV-DSC-MS-005 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | Mississippi Earthquake Exclusion Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | No coverage is provided by this notice nor can it be construed to replace any provision of your policy. You should read your policy and review your Declarations Page for complete information on the coverages you are provided. If there is any conflict between the policy and this Advisory Notice to Policyholders, THE PROVISIONS OF YOUR POLICY SHALL PREVAIL.                                                                                                                                                                                                                                    |
      | YOUR POLICY EXCLUDES COVERAGE FOR YOUR DWELLING AND OTHER STRUCTURES FOR ANY DAMAGES CAUSED OR PRECIPITATED BY AN EARTHQUAKE OR EARTH MOVEMENT. THIS EXCLUSION GENERALLY EXCLUDES ALL DAMAGES CAUSED OR IN ANY WAY RESULTING FROM AN EARTHQUAKE, EARTH MOVEMENTS, TREMORS AND AFTERSHOCKS, AND ALSO EXCLUDES EARTH MOVEMENTS, LAND SHOCK WAVES, AFTERSHOCKS OR TREMORS BEFORE, DURING OR AFTER A VOLCANIC ERUPTION. THIS EXCLUSION DOES NOT APPLY TO YOUR CONTENTS. FOR FURTHER DETAILS, PLEASE SEE THE LANGUAGE OF YOUR POLICY. THE LANGUAGE OF THE POLICY WILL CONTROL THE OBLIGATIONS OF THE PARTIES. |
      | YOU ARE FURTHER ADVISED THAT TO BE COVERED FOR SUCH LOSS, YOU WILL HAVE TO OBTAIN A SEPARATE EARTHQUAKE ENDORSEMENT OR SPECIAL EARTHQUAKE POLICY. NOT ALL INSURANCE COMPANIES PROVIDE EARTHQUAKE COVERAGE. YOUR INSURANCE AGENT OR COMPANY REPRESENTATIVE CAN PROVIDE YOU WITH INFORMATION ON COVERAGE.                                                                                                                                                                                                                                                                                                  |
