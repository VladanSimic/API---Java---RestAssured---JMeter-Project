@US50501 @Iteration5 @MarchPostPROD
Feature: Programs - AL - ES - State Specific Application Update

  Scenario: ES AL - Verify that application document has state-specific Application (PPEX-ABE-AL-001 (02/2025))

    * I have entered test data for test case "AL_001" in excel workbook "QuoteCreationES" in sheet "QuoteCreatorES" for "ES" LOB
    * I set "Effective_Date" to "03/08/2025"

    * I load random user data
    * I am logged in to Pure as "P51"
    And I navigate to quotes page
    * I initiate a new quote
    * I create a new "ES" quote
    * I rate a quote
    Then I click create application
    * I download the file "MGU Excess Application" and verify keywords
      | PPEX-ABE-AL-001 (02/2025)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | Any person who knowingly (or willfully) presents a false or fraudulent claim for payment of a loss or benefit or knowingly (or willfully) presents false information in an application for insurance is guilty of a crime and may be subject to fines and confinement in prison.                                                                                                                                                                                                                                                        |
      | Any person who knowingly presents a false or fraudulent claim for payment of a loss or benefit or knowingly presents false information in an application for insurance is guilty of a crime and may be subject to fines and confinement in prison.                                                                                                                                                                                                                                                                                      |
      | I have read the above application and any attachments. I declare that the information in them is true, complete and correct to the best of my knowledge and belief. This information is being offered to the company as an inducement to issue the policy for which I am applying.                                                                                                                                                                                                                                                      |
      | I understand that the insurance I am applying for will be written by an insurer that is not authorized (licensed) by the Alabama Department of Insurance and that the Department of Insurance does not have any authority over the policy forms used or the premiums charged by this insurance company. I further understand that no Alabama insurance guaranty fund protection exists in the event this insurance company becomes insolvent and that, in the event of insolvency, there is no guarantee a claim will be fully covered. |

