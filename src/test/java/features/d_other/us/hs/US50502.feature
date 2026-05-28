@US50502 @Iteration5 @MarchPostPROD
Feature:Programs - AL - HS - State Specific Application Update

  Scenario:HS AL - Verify that application document has state-specific Application (PPHV-ABE-AL-001 (02/2025))

    Given I use "AL_001" regression test data from "QuoteCreatorHS" sheet

    * I load random user data
    * I set "Excess_Flood_Include_Excess_Flood" to "No"
    * I set "Optional_Coverages_Earthquake_Extension" to "No"
    * I set "Effective_Date" to "03/22/2025"


    When I am logged in to Pure as "P77"

    * I navigate to quotes page
    * I initiate a new quote

    * I create a new "HS" quote
    * I rate a quote
    * I think for 10 to 15 seconds
    Then I click create application
    * I think for 15 to 20 seconds
    * I download the file "MGU Home Application" and verify keywords
      | PPHV-ABE-AL-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | Any person who knowingly (or willfully) presents a false or fraudulent claim for payment of a loss or benefit or knowingly (or willfully) presents false information in an application for insurance is guilty of a crime and may be subject to fines and confinement in prison.                                                                                                                                                                                                                                                        |
      | Any person who knowingly presents a false or fraudulent claim for payment of a loss or benefit or knowingly presents false information in an application for insurance is guilty of a crime and may be subject to fines and confinement in prison.                                                                                                                                                                                                                                                                                      |
      | I have read the above application and any attachments. I declare that the information in them is true, complete and correct to the best of my knowledge and belief. This information is being offered to the company as an inducement to issue the policy for which I am applying.                                                                                                                                                                                                                                                      |
      | I understand that the insurance I am applying for will be written by an insurer that is not authorized (licensed) by the Alabama Department of Insurance and that the Department of Insurance does not have any authority over the policy forms used or the premiums charged by this insurance company. I further understand that no Alabama insurance guaranty fund protection exists in the event this insurance company becomes insolvent and that, in the event of insolvency, there is no guarantee a claim will be fully covered. |
