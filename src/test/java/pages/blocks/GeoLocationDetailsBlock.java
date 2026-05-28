package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.Map;

public class GeoLocationDetailsBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public GeoLocationDetailsBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Standardized Address']/../../../../div//input")
    WebElement standardizedAddress;
    @FindBy(xpath = "//div[text()='Geocoded location']/../../../../div//input")
    WebElement geocodedLocation;
    @FindBy(xpath = "//div[text()='Geocoded Location']/../../../../div//input")
    WebElement geocodedLocation2;
    @FindBy(xpath = "//div[text()='Use User Entered Address for Geocoding']/../../../../div//input")
    WebElement useUserEnteredAddressForGeocoding;
    @FindBy(xpath = "//div[text()='Longitude']/../../../..//input")
    WebElement longitude;
    @FindBy(xpath = "//div[text()='Latitude']/../../../..//input")
    WebElement latitude;
    @FindBy(xpath = "//a[text()='View location using Google Maps']")
    WebElement verifyWithGoogleMaps;
    @FindBy(xpath = "//a[text()='View location using Bing Maps']")
    WebElement verifyWithBingMaps;
    @FindBy(xpath = "//div[text()='Longitude and Latitude Coordinates Override']/../../../..//input")
    WebElement longitudeAndLatitudeOverride;
    @FindBy(xpath = "//div[text()='Longitude Override']/../../../..//input")
    WebElement longitudeOverride;
    @FindBy(xpath = "//div[text()='Latitude Override']/../../../..//input")
    WebElement latitudeOverride;
    @FindBy(xpath = "//div[text()='Risk Address 1']/../../../..//input | //div[text()='Primary Address 1']/../../../..//input")
    WebElement riskAddress1;
    @FindBy(xpath = "//div[text()='City']/../../../..//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='ZIP']/../../../..//input")
    WebElement zip;


    public void fillGeoLocationDetailsPW(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        //TODO
    }

    public void fillGeoLocationDetailsCC(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding"));
        pause(3000);
        verifyLongitude(data.get("Geo_Location_Longitude"));
        verifyLatitude(data.get("Geo_Location_Latitude"));
        verifyGeoCodedLocation(data.get("Geo_Location_Geocoded_Location"));
        verifyLocationUsingGoogleMaps(data);
        verifyLocationUsingBingMaps(data);
        saveChanges();
    }

    public void fillGeoLocationDetailsCC_END(Map<String, String> data) throws Throwable {
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding_END"));
        pause(3000);
        verifyLongitude(data.get("Geo_Location_Longitude_END"));
        verifyLatitude(data.get("Geo_Location_Latitude_END"));
        verifyGeoCodedLocation(data.get("Geo_Location_Geocoded_Location_END"));
        verifyLocationUsingGoogleMaps_END(data);
        verifyLocationUsingBingMaps_END(data);
        saveChanges();
    }

    public void useUserEnteredAddressForGeocoding(String value) throws Throwable {
        checkCheckbox(useUserEnteredAddressForGeocoding, value, "Use user entered address");
        pause(5000);
    }

    public void setStandardizedAddress(String value) {
        if (hasValue(value)) {
            typeText(standardizedAddress, value, "Standardized address");
        } else {
            setStandardizedAddress();
        }
    }

    public void setStandardizedAddress() {
        try {
            if (standardizedAddress.getAttribute("value").equalsIgnoreCase("- Select -")) {
                clickElement(standardizedAddress, "Standardized Address");
                driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
                driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            }
        } catch (Exception e) {

        }
    }

    public void verifyGeoCodedLocation(String value) {
        try {
            assertCellValue(geocodedLocation, value, "Geocoded location");
        } catch (Exception e) {
            assertCellValue(geocodedLocation2, value, "Geocoded Location");
        }
    }

    public void checkUserEnteredAddressForGeocoding(String value) throws Throwable {
        checkCheckbox(useUserEnteredAddressForGeocoding, value, "User entered address for geo coding");
    }

    public void verifyLongitude(String value) {
        assertCellValue(longitude, value, "Longitude");
    }

    public void verifyLatitude(String value) {
        assertCellValue(latitude, value, "Latitude");
    }

    public void verifyLocationUsingGoogleMaps(Map<String, String> data) {
//        if(hasValue(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding")) && data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding").equalsIgnoreCase("Yes")) {
//            String href = "?lat=" + data.get("Geo_Location_Latitude") + "&lng=" + data.get("Geo_Location_Longitude");
//            assertContains(verifyWithGoogleMaps.getAttribute("href"), href, "Google Maps Location URL");
//        } else {
//            if (hasValue(data.get("Geo_Location_Verify_With_Google_Maps")) && data.get("Geo_Location_Verify_With_Google_Maps").equalsIgnoreCase("Yes")) {
//                String href = data.get("Address_Line_1_Txt").replace(" ", "+") + "," + data.get("City_Name_Txt").replace(" ", "+") + "," + data.get("State") + "," + data.get("Zip_Code");
//                assertContains(verifyWithGoogleMaps.getAttribute("href"), href, "Google Maps Location URL");
//            }
//        }
//        TODO CC TEMP SKIP
    }

    public void verifyLocationUsingGoogleMaps_END(Map<String, String> data) {
        //        if(hasValue(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding_END")) && data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding_END").equalsIgnoreCase("Yes")) {
//            String href = "?lat=" + data.get("Geo_Location_Latitude_END") + "&lng=" + data.get("Geo_Location_Longitude_END");
//            assertContains(verifyWithGoogleMaps.getAttribute("href"), href, "Google Maps Location URL");
//        } else {
//            if (hasValue(data.get("Geo_Location_Verify_With_Google_Maps_END")) && data.get("Geo_Location_Verify_With_Google_Maps_END").equalsIgnoreCase("Yes")) {
//                String href = data.get("Address_Line_1_Txt_END").replace(" ", "+") + "," + data.get("City_Name_Txt_END").replace(" ", "+") + "," + data.get("State_END") + "," + data.get("Zip_Code_END");
//                assertContains(verifyWithGoogleMaps.getAttribute("href"), href, "Google Maps Location URL");
//            }
//        }
//        TODO CC TEMP SKIP
    }

    public void verifyLocationUsingBingMaps(Map<String, String> data) {
//        if(hasValue(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding")) && data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding").equalsIgnoreCase("Yes")) {
//            String href = "=pos." + data.get("Geo_Location_Latitude") + "_" + data.get("Geo_Location_Longitude");
//            assertContains(verifyWithBingMaps.getAttribute("href"), href, "Bing Maps Location URL");
//        } else {
//            if (hasValue(data.get("Geo_Location_Verify_With_Bing_Maps")) && data.get("Geo_Location_Verify_With_Bing_Maps").equalsIgnoreCase("Yes")) {
//                String href = data.get("Address_Line_1_Txt").replace(" ", "+") + "%2c+" + data.get("City_Name_Txt").replace(" ", "%") + "%2c+" + data.get("State") + "%2c+" + data.get("Zip_Code");
//                assertContains(verifyWithBingMaps.getAttribute("href"), href, "Bing Maps Location URL");
//            }
//        }
        //        TODO CC TEMP SKIP
    }

    private void verifyLocationUsingBingMaps_END(Map<String, String> data) {
        //        if(hasValue(data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding_END")) && data.get("Geo_Location_Use_User_Entered_Address_For_Geocoding_END").equalsIgnoreCase("Yes")) {
//            String href = "=pos." + data.get("Geo_Location_Latitude_END") + "_" + data.get("Geo_Location_Longitude_END");
//            assertContains(verifyWithBingMaps.getAttribute("href"), href, "Bing Maps Location URL");
//        } else {
//            if (hasValue(data.get("Geo_Location_Verify_With_Bing_Maps_END")) && data.get("Geo_Location_Verify_With_Bing_Maps_END").equalsIgnoreCase("Yes")) {
//                String href = data.get("Address_Line_1_Txt").replace(" ", "+") + "%2c+" + data.get("City_Name_Txt_END").replace(" ", "%") + "%2c+" + data.get("State_END") + "%2c+" + data.get("Zip_Code_END");
//                assertContains(verifyWithBingMaps.getAttribute("href"), href, "Bing Maps Location URL");
//            }
//        }
        //        TODO CC TEMP SKIP
    }

    public void fillGeoLocationDetailsHS(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Details_Use_User_Entered_Address_For_Geocoding"));
        pause(3000);
       verifyLongitude(data.get("Geo_Location_Details_Longitude"));
       verifyLatitude(data.get("Geo_Location_Details_Longitude"));
       verifyGeoCodedLocation(data.get("Geo_Location_Details_Geocoded_Location"));
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address"));
        if (hasValue(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override")) && data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override").equalsIgnoreCase("Yes")) {
            pause(5000);
            chackLongitudeAndLatitudeOverride(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override"));
            setLongitudeOverride(data.get("Geo_Location_Details_Longitude_Override"));
            setLatitudeOverride(data.get("Geo_Location_Details_Latitude_Override"));
            clickOrderPropertyDetails();
        }
        saveChanges();
    }

    public void fillGeoLocationDetailsHS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Details_Use_User_Entered_Address_For_Geocoding_END"));
        pause(3000);
        verifyLongitude(data.get("Geo_Location_Details_Longitude_END"));
        verifyLatitude(data.get("Geo_Location_Details_Longitude_END"));
        verifyGeoCodedLocation(data.get("Geo_Location_Details_Geocoded_Location_END"));
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_END"));
        if (hasValue(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_END")) && data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_END").equalsIgnoreCase("Yes")) {
            chackLongitudeAndLatitudeOverride(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_END"));
            setLongitudeOverride(data.get("Geo_Location_Details_Longitude_Override_END"));
            setLatitudeOverride(data.get("Geo_Location_Details_Latitude_Override_END"));
            clickOrderPropertyDetails();
        }
        saveChanges();
    }

    public void fillGeoLocationDetailsHS_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Details_Use_User_Entered_Address_For_Geocoding_OOS_END"));
        pause(3000);
        verifyLongitude(data.get("Geo_Location_Details_Longitude_OOS_END"));
        verifyLatitude(data.get("Geo_Location_Details_Longitude_OOS_END"));
        verifyGeoCodedLocation(data.get("Geo_Location_Details_Geocoded_Location_OOS_END"));
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_OOS_END"));
        if (hasValue(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_OOS_END")) && data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_OOS_END").equalsIgnoreCase("Yes")) {
            chackLongitudeAndLatitudeOverride(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_OOS_END"));
            setLongitudeOverride(data.get("Geo_Location_Details_Longitude_Override_OOS_END"));
            setLatitudeOverride(data.get("Geo_Location_Details_Latitude_Override_OOS_END"));
            clickOrderPropertyDetails();
        }
        saveChanges();
    }

    public void fillGeoLocationDetailsHS_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        useUserEnteredAddressForGeocoding(data.get("Geo_Location_Details_Use_User_Entered_Address_For_Geocoding_OOS_END"));
        pause(3000);
        verifyLongitude(data.get("Geo_Location_Details_Longitude_RNW"));
        verifyLatitude(data.get("Geo_Location_Details_Longitude_RNW"));
        verifyGeoCodedLocation(data.get("Geo_Location_Details_Geocoded_Location_RNW"));
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_RNW"));
        if (hasValue(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_RNW")) && data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_RNW").equalsIgnoreCase("Yes")) {
            chackLongitudeAndLatitudeOverride(data.get("Geo_Location_Details_Longitude_And_Latitude_Coordinates_Override_RNW"));
            setLongitudeOverride(data.get("Geo_Location_Details_Longitude_Override_RNW"));
            setLatitudeOverride(data.get("Geo_Location_Details_Latitude_Override_RNW"));
            clickOrderPropertyDetails();
        }
        saveChanges();
    }

    public void chackLongitudeAndLatitudeOverride(String checkOverride) throws Throwable {
        checkCheckbox(longitudeAndLatitudeOverride, checkOverride, "LongitudeAndLatitudeOverride");
        pause(3000);
    }

    public void clickOrderPropertyDetails() throws InterruptedException {
        clickElement(orderPropertyDetails, "Order property details");
        pause(5000);
    }

    public void setLongitudeOverride(String value) {
        typeText(longitudeOverride, value, "Longitude Override");
    }

    public void setLatitudeOverride(String value) {
        typeText(latitudeOverride, value, "Latitude Override");
    }

    public void verifyStandardizedAddress(String value) {
        if (value.equalsIgnoreCase("pulled")) {
            if (standardizedAddress.getAttribute("value").equalsIgnoreCase("- Select -"))
                failAssertion("Standardized Address is not pulled");
        } else {
            assertCellValue(standardizedAddress, value, "Standardized Address");
        }
    }

    public void fillGeoLocationDetailsFS(Map<String, String> data) {

    }

    public void fillGeoLocationDetailsHO(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address"));
    }

    public void fillGeoLocationDetailsHO(Map<String, String> data, int i) throws Throwable {
        verifyBlockExists("geo location details");
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_" + i));
    }

    public void fillGeoLocationDetailsHO_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_END"));
    }

    public void fillGeoLocationDetailsHO_OOS_END(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_OOS_END"));
    }

    public void fillGeoLocationDetailsHO_RNW(Map<String, String> data) throws Throwable {
        verifyBlockExists("geo location details");
        setStandardizedAddress(data.get("Geo_Location_Details_Standardized_Address_RNW"));
    }
    public String getLatLngFromUI() throws InterruptedException {
        if (!isElementPresentByXPath("//div[text()='Latitude']/../../../..//input") ||
                !isElementPresentByXPath("//div[text()='Longitude']/../../../..//input")) {
            infoLog("Latitude/Longitude fields not found. Navigating to the required page...");
            switchToNewCreatedNode();
        }
        WebElement latElement = driver.findElement(By.xpath("//div[text()='Latitude']/../../../..//input"));
        WebElement lngElement = driver.findElement(By.xpath("//div[text()='Longitude']/../../../..//input"));

        String latitude = latElement.getAttribute("value");
        String longitude = lngElement.getAttribute("value");

        return latitude + "," + longitude;
    }

    public String getAddressFromUI() {
        if (riskAddress1 == null) {
            throw new RuntimeException("Address field not found in UI!");
        }

        String address = riskAddress1.getAttribute("value");
        String city1 = city.getAttribute("value");
        String state1 = state.getAttribute("value");
        String zip1 = zip.getAttribute("value");

        if (address == null || address.isEmpty() ||
                city1 == null || city1.isEmpty()
                || state1 == null || state1.isEmpty()
                || zip1 == null || zip1.isEmpty()) {
            throw new RuntimeException("Some of the address fields are empty!");
        }
        return String.format("%s, %s, %s %s",address, city1, state1, zip1);
    }

    public String getStateFromUI() {
        if (state == null) {
            throw new RuntimeException("State field not found in UI!");
        }

        String state1 = state.getAttribute("value");

        if (state1 == null || state1.isEmpty()               ) {
            throw new RuntimeException("State fields is empty!");
        }
        return state1;
    }

}