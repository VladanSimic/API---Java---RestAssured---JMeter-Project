Feature: Subrole authority limits

  @Temp
  Scenario: Subrole authority limits for - Field

    Given I am logged in to Pure as Field
    When I navigate to SubRoles page
    And I select a subrole by name "Field Test"

    Then I verify the Line Of Authority
      | lineOfAuthority                                                                                     | authority | limit                 |
      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                   |
      | Authority to clear a home score of "F"                                                              | Y         | N/A                   |
      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                   |
      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                   |
      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                   |
      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                   |
      | DUI/DWI                                                                                             | Y         | Yes                   |
      | Exposure Limit Per Vehicle                                                                          | Y         | < = $5,000,000        |
      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $25,000,000           |
      | Liability Limit                                                                                     | Y         | <= $50,000,000        |
      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000        |
      | Max Blanket Limit                                                                                   | Y         | $25,000,000           |
      | Max Per Item (Blanket)                                                                              | Y         | $1,000,000            |
      | Miscellaneous Class                                                                                 | Y         | Yes                   |
      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000 |
      | Prior Home property losses on the member in last 3 years                                            | Y         | N/A                   |
      | Prior non-Auto Liability losses last 5 years                                                        | Y         | N/A                   |
      | Risk Tool Grade                                                                                     | Y         | F                     |
      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $25,000,000       |
      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $75,000,000           |
      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $100,000,000          |
      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | Y         | 1 per account         |
      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | N/A                   |
      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | N/A                   |
      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | N/A                   |
      | Wildfire Score or Severity Threat - California                                                      | Y         | N/A                   |
      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | N/A                   |
      | Wildfire Score or Severity Threat - Washington                                                      | Y         | N/A                   |

#  Scenario: Subrole authority limits for - Zonal
#
#    Given I am logged in to Pure as Zonal
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - RUM
#
#    Given I am logged in to Pure as RUM
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - Specialist1
#
#    Given I am logged in to Pure as Specialist1
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - Specialist2
#
#    Given I am logged in to Pure as Specialist2
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - SeniorUnderwriter
#
#    Given I am logged in to Pure as SeniorUnderwriter
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - Underwriter1
#
#    Given I am logged in to Pure as Underwriter1
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - Underwriter2
#
#    Given I am logged in to Pure as Underwriter2
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - Analyst
#
#    Given I am logged in to Pure as Analyst
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UWSA1
#
#    Given I am logged in to Pure as UWSA1
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UWSA2
#
#    Given I am logged in to Pure as UWSA2
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UWSSA
#
#    Given I am logged in to Pure as UWSSA
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UWSRM
#
#    Given I am logged in to Pure as UWSRM
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - SeniorUWManagementRole
#
#    Given I am logged in to Pure as SeniorUWManagementRole
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UWManagerRole
#
#    Given I am logged in to Pure as UWManagerRole
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UnderwriterRole
#
#    Given I am logged in to Pure as UnderwriterRole
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - UnderwritingTechnicianRole
#
#    Given I am logged in to Pure as UnderwritingTechnicianRole
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#
#  Scenario: Subrole authority limits for - SeniorUWTechnicianRole
#
#    Given I am logged in to Pure as SeniorUWTechnicianRole
#    When I navigate to SubRoles page
#    And I select a subrole by name ""
#
#    Then I verify that for Line Of Authority: "<lineOfAuthority>", Authority is: "<authority>" and Limit is: "<limit>"
#      | lineOfAuthority                                                                                     | authority | limit                                   |
#      | Authority for Compliant Premium Adjustments                                                         | Y         | N/A                                     |
#      | Authority to clear a home score of "F"                                                              | Y         | N/A                                     |
#      | Authority to Use Manuscript Endorsement                                                             | Y         | N/A                                     |
#      | Backdating addition of any Item/Coverage/Exposure(s)                                                | Y         | N/A                                     |
#      | Backdating New Line of Business with No Known Loss Letter (NKLL)                                    | Y         | N/A                                     |
#      | Driver's License Suspension Violation in last 5 years                                               | Y         | Yes                                     |
#      | DUI/DWI                                                                                             | Y         | Yes, 1 in 5 years per household         |
#      | Exposure Limit Per Vehicle                                                                          | Y         | < = $3,000,000                          |
#      | Highest Valued Item for Scheduled Coverage                                                          | Y         | $15,000,000                             |
#      | Liability Limit                                                                                     | Y         | <= $50,000,000                          |
#      | Limits of UM/UIM                                                                                    | Y         | <= $10,000,000                          |
#      | Max Blanket Limit                                                                                   | Y         | <= $10,000,000                          |
#      | Max Per Item (Blanket)                                                                              | Y         | <= $500,000                             |
#      | Miscellaneous Class                                                                                 | Y         | Yes                                     |
#      | Prior Collections property losses on the member in last 3 years                                     | Y         | Yes, up to $1,000,000                   |
#      | Prior Home property losses on the member in last 3 years                                            | Y         | up to $1,000,000 total                  |
#      | Prior non-Auto Liability losses last 5 years                                                        | Y         | up to $250,000                          |
#      | Risk Tool Grade                                                                                     | Y         | F                                       |
#      | Total Exposure Limit - all vehicles                                                                 | Y         | < = $15,000,000                         |
#      | Total Exposure Limit - Blanket and Scheduled. All classes                                           | Y         | $40,000,000                             |
#      | Total Insured Value: A+B+C+20% D; or, D if there is a value                                         | Y         | $75,000,000                             |
#      | Veh. homicide with auto, reckless endangerment, criminal negligence, Hit and run, Leaving the scene | N         | N/A                                     |
#      | Wildfire Score or Severity - Pacific Northwest Territory (OR, MT, ID)                               | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity - South Dakota and Texas                                                 | Y         | < 90                                    |
#      | Wildfire Score or Severity - Southwest Territory (AZ, NV, NM)                                       | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - California                                                      | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Mountain Territory (CO, UT, WY)                                 | Y         | Low, Moderate, High, Very High, Extreme |
#      | Wildfire Score or Severity Threat - Washington                                                      | Y         | Low, Moderate, High, Very High, Extreme |