package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.ElevationCertificatePage;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class ElevationCertificateBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public ElevationCertificateBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='What is the building diagram number?']/../../../../../../../../../../../td[2]//input")
    WebElement buildingDiagramNumber;
    @FindBy(xpath = "//div[text()='Base Flood Elevation']/../../../../../../../../../../../td[2]//input")
    WebElement baseFloodElevation;
    @FindBy(xpath = "//div[text()='a) Top of bottom floor (including basement, crawl space, or enclosure floor)?']/../../../../../../../../../../../td[2]//input")
    WebElement topOfBottomFloor;
    @FindBy(xpath = "//div[text()='b) Top of the next floor?']/../../../../../../../../../../../td[2]//input")
    WebElement topOfNextFloor;
    @FindBy(xpath = "//div[text()='d) Bottom of the attached garage (top of slab)?']/../../../../../../../../../../../td[2]//input")
    WebElement bottomOfTheAttachedGarage;
    @FindBy(xpath = "//div[text()='e) Lowest elevation of machinery or equipment servicing the building?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestElevation;
    @FindBy(xpath = "//div[text()='f) What is the total square feet for the attached garage?']/../../../../../../../../../../../td[2]//input")
    WebElement totalSquareFeetOfAttachedGarage;
    @FindBy(xpath = "//table//td[contains(text(),'g) No. of permanent flood openings in the attached garage')]/../../../../../../../../../../../../../../../../td[2]//input | //div[contains(text(),'No. of permanent flood openings in the attached garage or enclosure(s)')]/../../../../../../../../../../../td[2]//input")
    WebElement permanentFloodOpenings;
    @FindBy(xpath = "//table//td[contains(text(),'h) Total area of all permanent openings (flood vents) in square inches?')]/../../../../../../../../../../../../../../../../td[2]//input")
    WebElement totalAreaOfPermanentOpenings;
    @FindBy(xpath = "//div[text()='f) What is the total square feet for the attached garage?']/../../../../../../../../../../../td[2]//input | //div[text()='What is the total square feet for the attached garage?']/../../../../../../../../../../../td[2]//input")
    WebElement whatIsTheTotalSquareFeetForTheAttachedGarage;
    @FindBy(xpath = "//div[contains(text(),'g) No. of permanent flood openings in the attached garage or enclosure(s)')]/../../../../../../../../../../../td[2]//input | //div[contains(text(),'No. of permanent flood openings in the attached garage or enclosure(s)')]/../../../../../../../../../../../td[2]//input")
    WebElement noOfPermanentFloodOpenings;
    @FindBy(xpath = "//td[text()='h) Total area of all permanent openings (flood vents) in square inches?']/../../../../../../../../../../../../../../../..//input | //div[text()='Total area of all permanent openings (flood vents) in square inches?']/../../../../../../../../../../../td[2]//input")
    WebElement totalAreaOfAllPermanentOpenings;
    @FindBy(xpath = "//div[text()='BFE from Risk Meter']/../../../..//input")
    WebElement bfeFromRiskMeter;
    @FindBy(xpath = "//div[text()='RiskMeter Flood Zone']/../../../..//input")
    WebElement riskMeterFloodZone;
    @FindBy(xpath = "//div[text()='Panel Number']/../../../..//input")
    WebElement panelNumber;
    @FindBy(xpath = "//div[text()='Panel Date']/../../../..//input")
    WebElement panelDate;
    @FindBy(xpath = "//div[contains(@class,'x-title-item')]/div[text()='elevation certificate']")
    WebElement elevationCertificate;
    @FindBy(xpath = "//div[text()='What is the Square feet of the enclosure?']/../../../../../../../../../../../td[2]//input")
    WebElement squareFeetEnclosure;
    @FindBy(xpath = "//div[text()='No. of permanent flood openings in the crawls space or enclosure(s) within 1.0 foot above adjacent grade']/../../../../../../../../../../../td[2]//input")
    WebElement noFloodOpeningsCrawlsSpace;
    @FindBy(xpath = "//div[text()='What is the total net area of flood openings in square inches']/../../../../../../../../../../../td[2]//input")
    WebElement totalNetAreaSquareInches;

    //additional fields for Flood coverage
    @FindBy(xpath = "//div[text()='f) Lowest adjacent (finished) grade next to building (LAG)?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestAdjacentFinishedGrade;
    @FindBy(xpath = "//div[text()='g) Highest adjacent (finished) grade next to building (HAG)?']/../../../../../../../../../../../td[2]//input")
    WebElement highestAdjacentFinishedGrade;
    @FindBy(xpath = "//div[text()='h) Lowest adjacent grade at lowest elevation of deck or stairs, including structural support?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestAdjacentLowestElevation;

    public void fillOutElevationCertificateInformationHO(Map<String, String> data) throws Throwable {
        ElevationCertificatePage elevationCertificatePage = new ElevationCertificatePage(driver);

        if (isElementDisplayed(elevationCertificate)) {
            setBaseFloodElevation(data.get("Base_Flood_Elevation"));
            pause(2000);
            elevationCertificatePage.setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage"));
            saveChanges();
            pause(2000);
            elevationCertificatePage.setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings"));
            pause(2000);
            elevationCertificatePage.setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery"));
            pause(2000);
            setSquareFeetEnclosure(data.get("Square_Feet_Enclosure"));
            pause(2000);
            setNoFloodOpeningsCrawlsSpace(data.get("No_Flood_Openings_Crawls_Space"));
            pause(2000);
            setTotalNetAreaSquareInches(data.get("Total_Net_Area_Square_Inches"));
            pause(2000);
            elevationCertificatePage.setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural"));
            saveChanges();
            pause(2000);

            if (isFloodDate1(data.get("Effective_Date"))) {
                if (isFloodState1a(data.get("State"))) {
                    setLowestAdjacentFinishedGrade(data.get("Lowest_Adjacent_Finished_Grade"));
                    setHighestAdjacentFinishedGrade(data.get("Highest_Adjacent_Finished_Grade"));
                    setLowestAdjacentLowestElevation(data.get("Lowest_Adjacent_Lowest_Elevation"));
                    saveChanges();
                    pause(2000);
                }
            }

            if (isFloodDate2(data.get("Effective_Date"))) {
                if (isFloodState2(data.get("State"))) {
                    pause(5000);
                    setLowestAdjacentFinishedGrade(data.get("Lowest_Adjacent_Finished_Grade"));
                    setHighestAdjacentFinishedGrade(data.get("Highest_Adjacent_Finished_Grade"));
                    setLowestAdjacentLowestElevation(data.get("Lowest_Adjacent_Lowest_Elevation"));
                    saveChanges();
                    pause(2000);
                }
            }
        }
    }

    public void fillOutElevationCertificateInformationHONoCondition(Map<String, String> data) throws Throwable {
        ElevationCertificatePage elevationCertificatePage = new ElevationCertificatePage(driver);

        if (isElementDisplayed(elevationCertificate)) {
            setBaseFloodElevation(data.get("Base_Flood_Elevation"));
            pause(2000);
            elevationCertificatePage.setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number"));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor"));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor"));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage"));
            saveChanges();
            pause(2000);
            elevationCertificatePage.setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage"));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings"));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings"));
            pause(2000);
            elevationCertificatePage.setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery"));
            pause(2000);
            setSquareFeetEnclosure(data.get("Square_Feet_Enclosure"));
            pause(2000);
            setNoFloodOpeningsCrawlsSpace(data.get("No_Flood_Openings_Crawls_Space"));
            pause(2000);
            setTotalNetAreaSquareInches(data.get("Total_Net_Area_Square_Inches"));
            pause(2000);
            elevationCertificatePage.setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural"));
            saveChanges();
            pause(2000);
            setLowestAdjacentFinishedGrade(data.get("Lowest_Adjacent_Finished_Grade"));
            setHighestAdjacentFinishedGrade(data.get("Highest_Adjacent_Finished_Grade"));
            setLowestAdjacentLowestElevation(data.get("Lowest_Adjacent_Lowest_Elevation"));
            saveChanges();
            pause(2000);
        }
    }

    public void fillOutElevationCertificateInformationHO(Map<String, String> data, int i) throws Throwable {
        ElevationCertificatePage elevationCertificatePage = new ElevationCertificatePage(driver);

        if (isElementDisplayed(elevationCertificate)) {
            setBaseFloodElevation(data.get("Base_Flood_Elevation_" + i));
            pause(2000);
            elevationCertificatePage.setWhatIsTheBuildingDiagramNumber(data.get("Building_Diagram_Number_" + i));
            pause(2000);
            setTopOfBottomFloor(data.get("Top_Of_Bottom_Floor_" + i));
            pause(2000);
            setTopOfNextFloor(data.get("Top_Of_Next_Floor_" + i));
            pause(2000);
            setBottomOfTheAttachedGarage(data.get("Bottom_Of_The_Attached_Garage_" + i));
            saveChanges();
            pause(2000);
            elevationCertificatePage.setTotalSquareFeetForTheAttachedGarage(data.get("Total_Square_Feet_For_The_Attached_Garage_" + i));
            pause(2000);
            setPermanentFloodOpenings(data.get("Permanent_Flood_Openings_" + i));
            pause(2000);
            setTotalAreaOfAllPermanentOpenings(data.get("Total_Area_Of_All_Permanent_Openings_" + i));
            pause(2000);
            elevationCertificatePage.setLowestElevationOfMachinery(data.get("Lowest_Elevation_Machinery_" + i));
            pause(2000);
            setSquareFeetEnclosure(data.get("Square_Feet_Enclosure_" + i));
            setNoFloodOpeningsCrawlsSpace(data.get("No_Flood_Openings_Crawls_Space_" + i));
            setTotalNetAreaSquareInches(data.get("Total_Net_Area_Square_Inches_" + i));
            elevationCertificatePage.setBottomOfLowestHorizontalStructuralMember(data.get("Elevation_Certificate_Bottom_Lowest_Horizontal_Structural_" + i));
            saveChanges();
            pause(2000);

            if (!isFloodDate1(data.get("Effective_Date"))) {
                if (isFloodState1a(data.get("State"))) {
                    setLowestAdjacentFinishedGrade(data.get("Lowest_Adjacent_Finished_Grade_" + i));
                    setHighestAdjacentFinishedGrade(data.get("Highest_Adjacent_Finished_Grade_" + i));
                    setLowestAdjacentLowestElevation(data.get("Lowest_Adjacent_Lowest_Elevation_" + i));
                    saveChanges();
                    pause(2000);
                }
            }

            if (!isFloodDate2(data.get("Effective_Date"))) {
                if (isFloodState2(data.get("State"))) {
                    setLowestAdjacentFinishedGrade(data.get("Lowest_Adjacent_Finished_Grade_" + i));
                    setHighestAdjacentFinishedGrade(data.get("Highest_Adjacent_Finished_Grade_" + i));
                    setLowestAdjacentLowestElevation(data.get("Lowest_Adjacent_Lowest_Elevation_" + i));
                    saveChanges();
                    pause(2000);
                }
            }
        }
    }

    public void setBuildingDiagramNumber(String diagram) throws Throwable {
        typeText(buildingDiagramNumber, diagram);
    }

    public void setTopOfBottomFloor(String value) throws Throwable {
        if (isElementDisplayed(topOfBottomFloor)) {
            typeText(topOfBottomFloor, value);
        }
    }

    public void setTopOfNextFloor(String value) throws Throwable {
        if (isElementDisplayed(topOfNextFloor)) {
            typeText(topOfNextFloor, value);
        }
    }

    public void setBottomOfTheAttachedGarage(String value) throws Throwable {
        if (isElementDisplayed(bottomOfTheAttachedGarage)) {
            typeText(bottomOfTheAttachedGarage, value);
        }
    }

    public void setLowestElevation(String value) throws Throwable {
        typeText(lowestElevation, value);
    }

    public void setTotalSquareFeetOfAttachedGarage(String value) throws Throwable {
        typeText(totalSquareFeetOfAttachedGarage, value);
    }

    public void setPermanentFloodOpenings(String value) throws Throwable {
        if (isElementDisplayed(permanentFloodOpenings))
            typeText(permanentFloodOpenings, value);
    }

    public void setTotalAreaOfPermanentOpenings(String value) throws Throwable {
        typeText(totalAreaOfPermanentOpenings, value);
    }

    public void setWhatIsTheTotalSquareFeetForTheAttachedGarage(String value) throws Throwable {
        typeText(whatIsTheTotalSquareFeetForTheAttachedGarage, value);
    }

    public void setNoOfPermanentFloodOpenings(String value) throws Throwable {
        typeText(noOfPermanentFloodOpenings, value);
    }

    public void setTotalAreaOfAllPermanentOpenings(String value) throws Throwable {
        if (isElementDisplayed(totalAreaOfAllPermanentOpenings))
            typeText(totalAreaOfAllPermanentOpenings, value);
    }

    public void fillElevationCertificateDetailCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("elevation certificate");
        setBaseFloodElevation("1");
        pause(2000);
        setBuildingDiagramNumber("1,2,3,4");
        pause(2000);
        setTopOfBottomFloor("1");
        pause(2000);
        setTopOfNextFloor("2");
        pause(2000);
        setBottomOfTheAttachedGarage("3");
        pause(2000);
        setLowestElevation("4");
        try {
            pause(2000);
            setWhatIsTheTotalSquareFeetForTheAttachedGarage("10");
            pause(2000);
            setNoOfPermanentFloodOpenings("2");
            pause(2000);
            setTotalAreaOfAllPermanentOpenings("2");
        } catch (Exception e) {

        }
        saveChanges();
        //TODO CC add excel data , add logic for fields
    }

    public void fillElevationCertificateDetailCC_END(Map<String, String> data) throws Throwable {
//        setBaseFloodElevation("1");
//        setBuildingDiagramNumber("1,2,3,4");
//        setTopOfBottomFloor("1");
//        setTopOfNextFloor("2");
//        setBottomOfTheAttachedGarage("3");
//        setLowestElevation("4");
//        try {
//            setWhatIsTheTotalSquareFeetForTheAttachedGarage("10");
//            setNoOfPermanentFloodOpenings("2");
//            setTotalAreaOfAllPermanentOpenings("2");
//        } catch (Exception e){
//
//        }
//        saveChanges();
        //TODO CC add excel data , add logic for fields
    }

    public void setBaseFloodElevation(String value) {
        if (isElementDisplayed(baseFloodElevation)) {
            typeText(baseFloodElevation, value, "Base Flood Elevation");
        }
    }

    public void verifyBFEFromRiskMeter(String value) {
        assertCellValue(bfeFromRiskMeter, value, "BFE From Risk Meter");
    }

    public void verifyRiskMeterFloodZone(String value) {
        assertCellValue(riskMeterFloodZone, value, "RiskMeter Flood Zone");
    }

    public void verifyPanelNumber(String value) {
        assertCellValue(panelNumber, value, "Panel Number");
    }

    public void verifyPanelDate(String value) {
        assertCellValue(panelDate, value, "Panel Date");
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

    public void setSquareFeetEnclosure(String value) {
        if (isElementDisplayed(squareFeetEnclosure))
            typeTextEnter(squareFeetEnclosure, value, "Square feet enclosure");
    }

    public void setNoFloodOpeningsCrawlsSpace(String value) {
        if (isElementDisplayed(noFloodOpeningsCrawlsSpace))
            typeTextEnter(noFloodOpeningsCrawlsSpace, value, "No flood openings crawls space");
    }

    public void setTotalNetAreaSquareInches(String value) {
        if (isElementDisplayed(totalNetAreaSquareInches))
            typeTextEnter(totalNetAreaSquareInches, value, "Square feet enclosure");
    }

}