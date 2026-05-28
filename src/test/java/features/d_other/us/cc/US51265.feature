@US51265 @Iteration5
Feature:As PURE Programs, I need to see the "Water Damage Deductible" as an available option when "Special Water Damage Deductible"
  is overridden on a Course of Construction quote or policy, so that underwriting can offer different coverage options based on
  a risk's characteristics.  If "Water Damage Deductible"
  is selected on a quote or policy, then the Water Damage Deductible form (PPBR-END-GEN-073 (10/2024)) attaches to the policy document package.

  @US51265 @CC
  Scenario Outline: TC_01 "<TC_ID>"| Programs - COC - Water Damage Deductible UI and Form Update NB/EN/PE

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Effective_Date" to "04/18/2025"
    * I set "Optional_Coverages_Exclusions_Special_Water_Damage_Deductible" to "Yes"
    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote
    * I fill out the policy page for CC line of business
    * I fill out the basic location page for CC line of business
    * I navigate to Optional Coverages Page
    * I select "Yes" for "Special Water Damage Deductible" on ""
    Then The user verifies the dropdown values for field
      | Field         | Value                            | YesOrNo |
      | Coverage Type | Water Damage and Water Intrusion | Yes     |
      | Coverage Type | Water Intrusion Deductible       | Yes     |
      | Coverage Type | Water Damage Deductible          | Yes     |
    * I fill out the optional coverages page for CC line of business
    * I fill out the general contractor page for CC line of business
    * I fill out the earthquake details page for CC line of business
    * I fill out the wildfire details page for CC line of business
    * I fill out the previous losses coverages page for CC line of business
    * I fill out the member in formation Page for CC line of business
    * I fill out the mandatory forms page for CC line of business
    * I fill out the subjectivities page for CC line of business
    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I navigate to premium page
    * I click quote proposal
    * I download the file "Proposal" and verify keywords
      | Water Damage Deductible $100,000 |
    * I bind a CC quote

    When I select created policy
    * I navigate to transactions or endorsements
    * I select a transaction "New Business"
    Then I navigate to documents tab
    * I think for 55 to 60 seconds
    * I download the file "Course of Construction" and verify keywords
      | PPBR-END-GEN-073 (10/2024)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
      | Water Damage Deductible                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | This endorsement changes the policy. Please read it carefully.                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | All provisions and conditions of the policy apply unless they are altered by this endorsement.                                                                                                                                                                                                                                                                                                                                                                                                                |
      | It is agreed and understood with respect to the following location:                                                                                                                                                                                                                                                                                                                                                                                                                                           |
      | Coverage and Loss Settlement, 4. Deductible is amended by adding the following:                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | A special deductible, which is the greater of your base All Other Peril Deductible or $100,000, will apply to each covered loss caused by, contributed by or in any way resulting from water.                                                                                                                                                                                                                                                                                                                 |
      | This special deductible applies regardless of any other cause or event contributing concurrently or in any sequence to the loss. This special deductible applies whether or not the loss event results in widespread damage or affects a substantial area.                                                                                                                                                                                                                                                    |
      | Except as it expressly states, it does not (i) modify any of the terms and provisions of the policy, (ii) modify any prior endorsements, (iii) extend the Policy Expiration Date, or (iv) increase the Amount of Insurance. To the extent a provision of the policy or a previous endorsement is inconsistent with an express provision of this endorsement, this endorsement controls. Otherwise, this endorsement is subject to all of the terms and provisions of the policy and of any prior endorsements |

    * I navigate to transactions or endorsements

    * I set "Endorsement_Effective_Date_END" to "04/20/2025"
    * I initiate new endorsement
    * I navigate to Optional Coverages Page
    Then The user verifies the dropdown values for field
      | Field         | Value                            | YesOrNo |
      | Coverage Type | Water Damage and Water Intrusion | Yes     |
      | Coverage Type | Water Intrusion Deductible       | Yes     |
      | Coverage Type | Water Damage Deductible          | Yes     |
    * I review changes
    * I rate a quote

    * I navigate to underwriting alerts tab
    * I accept underwriting referrals

    Then I issue a CC endorsement

    * I navigate to transactions or endorsements
    * I select a transaction "Endorsement"
    Then I navigate to documents tab
    * I think for 55 to 60 seconds
    * I download the file "Course of Construction" and verify keywords
      | PPBR-END-GEN-073 (10/2024)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
      | Water Damage Deductible                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | This endorsement changes the policy. Please read it carefully.                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | All provisions and conditions of the policy apply unless they are altered by this endorsement.                                                                                                                                                                                                                                                                                                                                                                                                                |
      | It is agreed and understood with respect to the following location:                                                                                                                                                                                                                                                                                                                                                                                                                                           |
      | Coverage and Loss Settlement, 4. Deductible is amended by adding the following:                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | A special deductible, which is the greater of your base All Other Peril Deductible or $100,000, will apply to each covered loss caused by, contributed by or in any way resulting from water.                                                                                                                                                                                                                                                                                                                 |
      | This special deductible applies regardless of any other cause or event contributing concurrently or in any sequence to the loss. This special deductible applies whether or not the loss event results in widespread damage or affects a substantial area.                                                                                                                                                                                                                                                    |
      | Except as it expressly states, it does not (i) modify any of the terms and provisions of the policy, (ii) modify any prior endorsements, (iii) extend the Policy Expiration Date, or (iv) increase the Amount of Insurance. To the extent a provision of the policy or a previous endorsement is inconsistent with an express provision of this endorsement, this endorsement controls. Otherwise, this endorsement is subject to all of the terms and provisions of the policy and of any prior endorsements |

    And I navigate to transactions or endorsements
    When I initiate a policy extension
    * I navigate to Optional Coverages Page
    Then The user verifies the dropdown values for field
      | Field         | Value                            | YesOrNo |
      | Coverage Type | Water Damage and Water Intrusion | Yes     |
      | Coverage Type | Water Intrusion Deductible       | Yes     |
      | Coverage Type | Water Damage Deductible          | Yes     |
#    * I review changes
#    * I click renewed premium
#    * I navigate to underwriting alerts tab
#    * I accept underwriting referrals
#    * I click process policy extension
#
#    * I navigate to transactions or endorsements
#    * I select a transaction "Policy Extension"
#    Then I navigate to documents tab
#    * I think for 55 to 60 seconds
#    * I download the file "Course of Construction" and verify keywords
#      | PPBR-END-GEN-073 (10/2024)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
#      | Water Damage Deductible                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
#      | This endorsement changes the policy. Please read it carefully.                                                                                                                                                                                                                                                                                                                                                                                                                                                |
#      | All provisions and conditions of the policy apply unless they are altered by this endorsement.                                                                                                                                                                                                                                                                                                                                                                                                                |
#      | It is agreed and understood with respect to the following location:                                                                                                                                                                                                                                                                                                                                                                                                                                           |
#      | Coverage and Loss Settlement, 4. Deductible is amended by adding the following:                                                                                                                                                                                                                                                                                                                                                                                                                               |
#      | A special deductible, which is the greater of your base All Other Peril Deductible or $100,000, will apply to each covered loss caused by, contributed by or in any way resulting from water.                                                                                                                                                                                                                                                                                                                 |
#      | This special deductible applies regardless of any other cause or event contributing concurrently or in any sequence to the loss. This special deductible applies whether or not the loss event results in widespread damage or affects a substantial area.                                                                                                                                                                                                                                                    |
#      | Except as it expressly states, it does not (i) modify any of the terms and provisions of the policy, (ii) modify any prior endorsements, (iii) extend the Policy Expiration Date, or (iv) increase the Amount of Insurance. To the extent a provision of the policy or a previous endorsement is inconsistent with an express provision of this endorsement, this endorsement controls. Otherwise, this endorsement is subject to all of the terms and provisions of the policy and of any prior endorsements |

    Examples:
      | TC_ID  | user |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KY_001 | P84  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
      | OK_001 | P94  |
      | OR_001 | P95  |
      | PA_001 | P96  |
      | RI_001 | P97  |
      | TN_001 | P99  |
      | VT_001 | P77  |
      | WA_001 | P78  |
      | WI_001 | P79  |
      | WV_001 | P80  |
      | CA_001 | P82  |
      | CT_001 | P83  |
      | DE_001 | P84  |
      | LA_001 | P86  |
      | MA_001 | P87  |
      | MD_001 | P88  |
      | MS_001 | P90  |
      | NC_001 | P91  |
      | NJ_001 | P92  |
      | NY_001 | P93  |
      | SC_001 | P94  |
      | VA_001 | P95  |
      | FL_001 | P96  |
      | TX_001 | P97  |
      | GA_001 | P98  |
      | MI_001 | P99  |
      | ID_001 | P76  |
      | HI_001 | P85  |
      | WY_001 | P81  |
      | UT_001 | P76  |
      | SD_001 | P98  |
      | KS_001 | P83  |
      | MN_001 | P85  |
      | CO_001 | P79  |
      | AL_001 | P82  |
      | ME_001 | P83  |
    @FullRegression_DreamTeam
    Examples:
      | TC_ID  | user |
      | NY_001 | P93  |
      | FL_001 | P96  |


  @US51265 @CC
  Scenario Outline: TC_02 "<TC_ID>"| Programs - COC - Water Damage Deductible UI and Form Update NB RWT

    Given I use "<TC_ID>" smoke test data from "QuoteCreatorCC" sheet
    * I load random user data
    * I set "Effective_Date" to "04/18/2025"
    * I set "Optional_Coverages_Exclusions_Special_Water_Damage_Deductible" to "No"
    When I am logged in to Pure as "<user>"
    * I navigate to quotes page
    * I initiate a new quote
    Then I create a new "CC" quote

    * I rate a quote
    * I think for 10 to 15 seconds
    * I navigate to underwriting referrals page
    * I accept underwriting referrals
    * I bind a CC quote

    When I select created policy


       #Cancellation
    * I navigate to transactions or endorsements
    * I create cancellation transaction
      | by      | date  | notes             | method    | reason         | MEP | reason |
      | Company | Today | Cancellation test | Flat-Rate | Cancel Rewrite |     |        |

    * I create new business rewrite transaction
      | notes | date                  |
      | Notes | DayAfterEffectiveDate |
    * I navigate to Optional Coverages Page
    * I select "Yes" for "Special Water Damage Deductible" on ""

    Then The user verifies the dropdown values for field
      | Field         | Value                            | YesOrNo |
      | Coverage Type | Water Damage and Water Intrusion | Yes     |
      | Coverage Type | Water Intrusion Deductible       | Yes     |
      | Coverage Type | Water Damage Deductible          | Yes     |

    * I set "Optional_Coverages_Exclusions_Special_Water_Damage_Deductible" to "Yes"
    * I set "Optional_Coverages_Exclusions_Special_Water_Damage_Deductible_Deductible" to "50,000"
    * I fill out the optional coverages page for CC line of business

    Then I review changes
    * I rate a quote
    * I complete rewrite transaction

    * I navigate to transactions or endorsements
    * I select a transaction "New Business Rewrite"
    Then I navigate to documents tab
    * I think for 45 to 50 seconds
    * I download the file "Course of Construction" and verify keywords
      | PPBR-END-GEN-073 (10/2024)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
      | Water Damage Deductible                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | This endorsement changes the policy. Please read it carefully.                                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | All provisions and conditions of the policy apply unless they are altered by this endorsement.                                                                                                                                                                                                                                                                                                                                                                                                                |
      | It is agreed and understood with respect to the following location:                                                                                                                                                                                                                                                                                                                                                                                                                                           |
      | Coverage and Loss Settlement, 4. Deductible is amended by adding the following:                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | A special deductible, which is the greater of your base All Other Peril Deductible or $50,000, will apply to each covered loss caused by, contributed by or in any way resulting from water.                                                                                                                                                                                                                                                                                                                  |
      | This special deductible applies regardless of any other cause or event contributing concurrently or in any sequence to the loss. This special deductible applies whether or not the loss event results in widespread damage or affects a substantial area.                                                                                                                                                                                                                                                    |
      | Except as it expressly states, it does not (i) modify any of the terms and provisions of the policy, (ii) modify any prior endorsements, (iii) extend the Policy Expiration Date, or (iv) increase the Amount of Insurance. To the extent a provision of the policy or a previous endorsement is inconsistent with an express provision of this endorsement, this endorsement controls. Otherwise, this endorsement is subject to all of the terms and provisions of the policy and of any prior endorsements |


    Examples:
      | TC_ID  | user |
      | AR_001 | P77  |
      | AZ_001 | P78  |
      | DC_001 | P80  |
      | IA_001 | P81  |
      | IL_001 | P82  |
      | IN_001 | P82  |
      | KY_001 | P84  |
      | MO_001 | P86  |
      | MT_001 | P87  |
      | ND_001 | P88  |
      | NE_001 | P89  |
      | NH_001 | P90  |
      | NM_001 | P91  |
      | NV_001 | P92  |
      | OH_001 | P93  |
      | OK_001 | P94  |
      | OR_001 | P95  |
      | PA_001 | P96  |
      | RI_001 | P97  |
      | TN_001 | P99  |
      | VT_001 | P77  |
      | WA_001 | P78  |
      | WI_001 | P79  |
      | WV_001 | P80  |
      | CA_001 | P82  |
      | CT_001 | P83  |
      | DE_001 | P84  |
      | LA_001 | P86  |
      | MA_001 | P87  |
      | MD_001 | P88  |
      | MS_001 | P90  |
      | NC_001 | P91  |
      | NJ_001 | P92  |
      | NY_001 | P93  |
      | SC_001 | P94  |
      | VA_001 | P95  |
      | FL_001 | P96  |
      | TX_001 | P97  |
      | GA_001 | P98  |
      | MI_001 | P99  |
      | ID_001 | P76  |
      | HI_001 | P85  |
      | WY_001 | P81  |
      | UT_001 | P76  |
      | SD_001 | P98  |
      | KS_001 | P83  |
      | MN_001 | P85  |
      | CO_001 | P79  |
      | AL_001 | P82  |
      | ME_001 | P83  |