Feature: Quote Creation EX

  @EX @NewBusiness @US24294
  Scenario Outline: Quote Creation EX - NB - "<TC_ID>" - "<effectiveDate>" , "<rejectUIM>"

    * I have entered test data for test case "<TC_ID>" in excel workbook "QuoteCreationEX" in sheet "QuoteCreatorEX" for "EX" LOB
    * I set "Effective_Date" to "<effectiveDate>"
    * I set "Reject_UIM_Coverage" to "<rejectUIM>"
    * I have created a new "EX" NB policy

    Examples:
      | TC_ID  | effectiveDate | rejectUIM |
      | NH_001 | 03/21/2022    | No        |
      | NH_001 | 03/21/2022    | No        |
      | NH_001 | 03/26/2022    | Yes       |
      | NH_001 | 03/26/2022    | Yes       |
      | NH_001 | 03/26/2022    | Yes       |
      | NH_001 | 03/26/2022    | Yes       |
      | NH_001 | 03/26/2022    | Yes       |
      | NH_001 | 03/26/2022    | No        |
      | NH_001 | 03/26/2022    | No        |
      | NH_001 | 03/26/2022    | No        |
      # Run endorsement on these ^^^
      | NH_001 | 03/21/2022    | No        |
      | NH_001 | 03/21/2022    | No        |
      | NH_001 | 05/24/2022    | Yes       |
      | NH_001 | 05/24/2022    | Yes       |
      | NH_001 | 05/25/2022    | Yes       |
      | NH_001 | 05/25/2022    | Yes       |
      | NH_001 | 05/25/2022    | Yes       |
      | NH_001 | 05/25/2022    | No        |
      | NH_001 | 05/25/2022    | No        |
      | NH_001 | 05/25/2022    | No        |
      # Run renewal on these ^^^

  @EX @Endorsement @US24294
  Scenario Outline: Process an endorsement on EX policy "<policyID>"
    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I process "1" endorsements on "<endorsementDate>"

    Examples:
      | policyID | endorsementDate |
#      | EX503362300 | 03/30/2022      |

  @EX @Renewal @US24294
  Scenario Outline: Process an endorsement on EX policy "<policyID>"
    * I am logged in to Pure as Field
    * I navigate to policies
    * I select a policy by ID "<policyID>"
    * I navigate to transactions or endorsements
    * I auto process "1" renewal
    * I exit policy

    Examples:
      | policyID |
#      | EX503343300 |