package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.blocks.ElevationCertificateBlock;
import pages.utils.CommonComponentsAndActions;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

public class ElevationCertificatePage extends CommonComponentsAndActions {
    WebDriver driver;
    ElevationCertificateBlock elevationCertificateBlock;

    public ElevationCertificatePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        elevationCertificateBlock = new ElevationCertificateBlock(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Base Flood Elevation']/../../../../../../../../../../../td[2]//input")
    WebElement baseFloodElevation;
    @FindBy(xpath = "//div[text()='What is the building diagram number?']/../../../../../../../../../../../td[2]//input")
    WebElement whatIsTheBuildingDiagramNumber;
    @FindBy(xpath = "//div[contains(text(),'Top of bottom floor')]/../../../../../../../../../../../td[2]//input")
    WebElement topOfBottomFloor;
    @FindBy(xpath = "//div[contains(text(),'Top of the next floor')]/../../../../../../../../../../../td[2]//input")
    WebElement topOfNextFloor;
    @FindBy(xpath = "//div[contains(text(),'Bottom of the attached garage')]/../../../../../../../../../../../td[2]//input")
    WebElement bottomOfTheAttachedGarage;
    @FindBy(xpath = "//div[contains(text(),'total square feet for the attached garage')]/../../../../../../../../../../../td[2]//input")
    WebElement totalSquareFeetForTheAttachedGarage;
    @FindBy(xpath = "//div[contains(text(),'permanent flood openings')]/../../../../../../../../../../../td[2]//input")
    WebElement permanentFloodOpenings;
    @FindBy(xpath = "//div[contains(text(),'Total area of all permanent openings ')]/../../../../../../../../../../../td[2]//input")
    WebElement totalAreaOfAllPermanentOpenings;
    @FindBy(xpath = "//div[contains(text(),'Lowest elevation of machinery')]/../../../../../../../../../../../td[2]//input")
    List<WebElement> lowestElevationOfMachinery;
    @FindBy(xpath = "//div[contains(text(),'Bottom of the lowest horizontal structural member')]/../../../../../../../../../../../td[2]//input")
    List<WebElement> bottomOfLowestHorizontalStructuralMember;
    @FindBy(xpath = "//div[text()='f) Lowest adjacent (finished) grade next to building (LAG)?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestAdjacentFinishedGrade;
    @FindBy(xpath = "//div[text()='g) Highest adjacent (finished) grade next to building (HAG)?']/../../../../../../../../../../../td[2]//input")
    WebElement highestAdjacentFinishedGrade;
    @FindBy(xpath = "//div[text()='h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestAdjacentLowestElevation;
    @FindBy(xpath = "//div[text()='What is the Square feet of the enclosure?']/../../../../../../../../../../../td[2]//input")
    WebElement squareFeetEnclosure;
    @FindBy(xpath = "//div[text()='What is the total net area of flood openings in square inches']/../../../../../../../../../../../td[2]//input")
    WebElement totalNetAreaSquareInches;

    public void fillElevationCertificateDetailsPage(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Base_Flood_Elevation"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural"));
        }
    }

    public void fillElevationCertificateDetailsPage_END(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Base_Flood_Elevation_END"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number_END"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor_END"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor_END"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage_END"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage_END"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings_END"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings_END"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery_END"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural_END"));
        }
    }

    public void fillElevationCertificateDetailsPage_OOS_END(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Base_Flood_Elevation_OOS_END"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number_OOS_END"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor_OOS_END"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor_OOS_END"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage_OOS_END"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage_OOS_END"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings_OOS_END"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings_OOS_END"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery_OOS_END"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural_OOS_END"));
        }
    }

    public void fillElevationCertificateDetailsPage_RNW(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Base_Flood_Elevation_RNW"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number_RNW"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor_RNW"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor_RNW"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage_RNW"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage_RNW"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings_RNW"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings_RNW"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery_RNW"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural_RNW"));
        }
    }

    public void fillElevationCertificateDetailsPageHS(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Elevation_Certificate_Base_Flood_Elevation"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Elevation_Certificate_Building_Diagram_Number"));
            pause(2000);
            setTopOfBottomFloor(data.get("Elevation_Certificate_Top_Of_Bottom_Floor"));
            pause(2000);
            setTopOfNextFloor(data.get("Elevation_Certificate_Top_Of_Next_Floor"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Elevation_Certificate_Bottom_Of_The_Attached_Garage"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Elevation_Certificate_Total_Square_Feet_For_The_Attached_Garage"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Elevation_Certificate_Permanent_Flood_Openings"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Elevation_Certificate_Total_Area_Of_All_Permanent_Openings"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Elevation_Certificate_Lowest_Elevation_Machinery"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural"));
            setSquareFeetEnclosure(data.get("Elevation_Certificate_Square_Feet_Enclosure"));
            pause(2000);
            setTotalNetAreaSquareInches(data.get("Elevation_Certificate_Total_Net_Area_Square_Inches"));
            pause(2000);

            if (isFloodDate1(data.get("Effective_Date"))) {
                if (isFloodState1(data.get("State"))) {
                    setLowestAdjacentFinishedGrade(data.get("Elevation_Certificate_Lowest_Adjacent_Finished_Grade"));
                    setHighestAdjacentFinishedGrade(data.get("Elevation_Certificate_Highest_Adjacent_Finished_Grade"));
                    setLowestAdjacentLowestElevation(data.get("Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation"));
                }
            }

            if (isFloodDate2(data.get("Effective_Date"))) {
                if (isFloodState2(data.get("State"))) {
                    setLowestAdjacentFinishedGrade(data.get("Elevation_Certificate_Lowest_Adjacent_Finished_Grade"));
                    setHighestAdjacentFinishedGrade(data.get("Elevation_Certificate_Highest_Adjacent_Finished_Grade"));
                    setLowestAdjacentLowestElevation(data.get("Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation"));
                }
            }

        }
        saveChanges();
        pause(2000);
    }

    public void fillElevationCertificateDetailsPage(Map<String, String> data, int i) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            setBaseFloodElevation(data.get("Base_Flood_Elevation_" + i));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number_" + i));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor_" + i));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor_" + i));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage_" + i));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage_" + i));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings_" + i));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings_" + i));
        }
    }

    public void setBaseFloodElevation(String value) throws Throwable {
        typeText(baseFloodElevation, value);
    }

    public void setWhatIsTheBuildingDiagramNumber(String value) throws Throwable {
        //setAttributeValue(whatIsTheBuildingDiagramNumber,"value",value);
        typeText(whatIsTheBuildingDiagramNumber, value);
    }

    public void setTopOfBottomFloor(String value) throws Throwable {
        typeText(topOfBottomFloor, value);
    }

    public void setTopOfNextFloor(String value) throws Throwable {
        typeText(topOfNextFloor, value);
    }

    public void setBottomOfTheAttachedGarage(String value) throws Throwable {
        typeText(bottomOfTheAttachedGarage, value);
    }

    public void setTotalSquareFeetForTheAttachedGarage(String value) throws Throwable {
        if (isElementDisplayed(totalSquareFeetForTheAttachedGarage))
            typeText(totalSquareFeetForTheAttachedGarage, value);
    }

    public void setPermanentFloodOpenings(String value) throws Throwable {
        if (isElementDisplayed(permanentFloodOpenings))
            typeText(permanentFloodOpenings, value);
    }

    public void setTotalAreaOfAllPermanentOpenings(String value) throws Throwable {
        if (isElementDisplayed(totalAreaOfAllPermanentOpenings))
            typeText(totalAreaOfAllPermanentOpenings, value);
    }

    public void fillElevationCertificatePageCC(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            elevationCertificateBlock.fillElevationCertificateDetailCC(data);
        }
    }

    public void setLowestElevationOfMachinery(String value) throws Throwable {
        if (lowestElevationOfMachinery.size() > 0) {
            typeText(lowestElevationOfMachinery.get(0), value);
            clickFooter();
            pause(2000);
        }
    }

    public void setSquareFeetEnclosure(String value) {
        if (isElementDisplayed(squareFeetEnclosure))
            typeTextEnter(squareFeetEnclosure, value, "Square feet enclosure");
    }

    public void setTotalNetAreaSquareInches(String value) {
        if (isElementDisplayed(totalNetAreaSquareInches))
            typeTextEnter(totalNetAreaSquareInches, value, "Square feet enclosure");
    }

    public void fillElevationCertificateDetailsPageCC(Map<String, String> data) throws Throwable {
        elevationCertificateBlock.fillElevationCertificateDetailCC(data);
    }

    public void fillElevationCertificatePageCC_END(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            elevationCertificateBlock.fillElevationCertificateDetailCC_END(data);
        }
    }

    public void fillElevationCertificatePageCC_EXT(Map<String, String> data) {
        //TODO CC
    }

    public void setBottomOfLowestHorizontalStructuralMember(String value) throws Throwable {
        if (bottomOfLowestHorizontalStructuralMember.size() > 0) {
            try {
                typeText(bottomOfLowestHorizontalStructuralMember.get(0), value);
            } catch (Exception e) {
                System.out.println("Element is not clickable (readonly)");
            }
        }
    }

    public void fillElevationCertificateDetailsPageFS(Map<String, String> data) throws Throwable {
        if (goToPage("Elevation Certificate")) {
            verifyBlockExists("elevation certificate");
            setBaseFloodElevation(data.get("Elevation_Certificate_Base_Flood_Elevation"));
            pause(2000);
            setWhatIsTheBuildingDiagramNumber(data.get("Elevation_Certificate_Building_Diagram_Number"));
            pause(2000);
            setTopOfBottomFloor(data.get("Elevation_Certificate_Top_Of_Bottom_Floor"));
            pause(2000);
            setTopOfNextFloor(data.get("Elevation_Certificate_Top_Of_Next_Floor"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Elevation_Certificate_Bottom_Of_The_Attached_Garage"));
            saveChanges();
            pause(2000);
            setTotalSquareFeetForTheAttachedGarage(data.get("Elevation_Certificate_Total_Square_Feet_For_The_Attached_Garage"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Elevation_Certificate_Permanent_Flood_Openings"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Elevation_Certificate_Total_Area_Of_All_Permanent_Openings"));
            pause(2000);
            setLowestElevationOfMachinery(data.get("Elevation_Certificate_Lowest_Elevation_Machinery"));
            pause(2000);
            setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural"));
            setLowestAdjacentFinishedGrade(data.get("Elevation_Certificate_Lowest_Adjacent_Finished_Grade"));
            setHighestAdjacentFinishedGrade(data.get("Elevation_Certificate_Highest_Adjacent_Finished_Grade"));
            setLowestAdjacentLowestElevation(data.get("Elevation_Certificate_Lowest_Adjacent_Lowest_Elevation"));
            saveChanges();
            pause(2000);
        }
    }

    public void setLowestAdjacentFinishedGrade(String value) {
        if (isElementDisplayed(lowestAdjacentFinishedGrade))
            typeTextEnter(lowestAdjacentFinishedGrade, value, "Lowest adjacent finished grade");
    }

    public void setHighestAdjacentFinishedGrade(String value) {
        if (isElementDisplayed(highestAdjacentFinishedGrade))
            typeTextEnter(highestAdjacentFinishedGrade, value, "Highest adjacent finished grade");
    }

    public void setLowestAdjacentLowestElevation(String value) {
        if (isElementDisplayed(lowestAdjacentLowestElevation))
            typeTextEnter(lowestAdjacentLowestElevation, value, "Lowest adjacent lowest elevation");
    }


}
