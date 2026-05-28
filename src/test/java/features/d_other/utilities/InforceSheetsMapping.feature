Feature: Import Inforce Sheet data to New Automation Test Data File
  Creates new file based on test_data/dragon/inforceSheet.xlsx

  @InforceSheetData
  Scenario: Import data

    * Import inforce sheet data
      | inforceSheetWorkbookName | inforceSheetSheetName | templateWorkbookName | targetWorkbookName | targetSheetName | propertiesFilePath    | row |
      | inforceSheet             | Sample                | inforceSheetTemplate | newWorkbook        | QuoteCreatorHO  | inforceSheetMappingCC | 1   |