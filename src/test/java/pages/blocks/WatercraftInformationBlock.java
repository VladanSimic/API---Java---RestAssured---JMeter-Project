package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WatercraftInformationBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public WatercraftInformationBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../../../..//*[text()='add']")
    WebElement add;
    @FindBy(xpath = "//div[text()='watercraft information']")
    WebElement watercraftInformationBlock;
    @FindBy(xpath = "//div[text()='policy information']")
    WebElement policyInformationBlock;
    @FindBy(xpath = "//div[text()='insurance information']")
    WebElement insuranceInformationBlock;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[4]/div")
    List<WebElement> hullLimitInputCA;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[1]/div")
    List<WebElement> yearInputCA;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[2]/div")
    List<WebElement> manufacturerInputCA;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[3]/div")
    List<WebElement> modelInputCA;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[5]/div")
    List<WebElement> lengthInputCA;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[1]/div")
    List<WebElement> makeInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[2]/div")
    List<WebElement> modelInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[3]/div")
    List<WebElement> hullValueInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[4]/div")
    List<WebElement> lengthInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[5]/div")
    List<WebElement> horsePowerInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//tr/td[6]/div")
    List<WebElement> maxDesignSpeedInputEX;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//div[text()='Make']/../../../..//input")
    List<WebElement> makeES;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//div[text()='Model']/../../../..//input")
    List<WebElement> modelES;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//div[text()='Hull Value ($)']/../../../..//input")
    List<WebElement> hullValueES;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//div[text()='Length (feet)']/../../../..//input")
    List<WebElement> lengthES;
    @FindBy(xpath = "//div[text()='watercraft information']/../../../../../..//div[text()='Horsepower']/../../../..//input")
    List<WebElement> horsepowerES;

    String hullAndMachineryLimit = "//div[text()='watercraft information']/../../../../../..//tr/td[$$]/div";
    String year = "//div[text()='watercraft information']/../../../../../..//tr/td[$$]/div";
    String manufacturer = "//div[text()='watercraft information']/../../../../../..//tr/td[$$]/div";
    String model = "//div[text()='watercraft information']/../../../../../..//tr/td[$$]/div";
    String length = "//div[text()='watercraft information']/../../../../../..//tr/td[$$]/div";

    public void fillWatercraftInformationDetailsPW(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft information");
        setHullAndMachineryLimit(data.get("Hull_And_Machinery_Limit"), data.get("State"), 0);
        setYearPW(data.get("Year"), data.get("State"), 0);
        setManufacturerPW(data.get("Manufacturer"), data.get("State"), 0);
        setModelPW(data.get("Model"), data.get("State"), 0);
        setLengthPW(data.get("Length"), data.get("State"), 0);
    }

    public void setHullAndMachineryLimit(String limit, String state, int index) throws Throwable {
        List<WebElement> elements;
        clickFooter();

        if (state.equalsIgnoreCase("CA")) {
            elements = driver.findElements(By.xpath(hullAndMachineryLimit.replace("$$", "4")));
            clickElement(watercraftInformationBlock, "block");
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), limit, "Hull And Machinery Limit");
        } else if (state.equalsIgnoreCase("WA")) {
            elements = driver.findElements(By.xpath(hullAndMachineryLimit.replace("$$", "5")));
            clickElement(watercraftInformationBlock, "block");
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), limit, "Hull And Machinery Limit");
        }
        clickFooter();
    }

    public void setYearPW(String yearTxt, String state, int index) throws Throwable {
        List<WebElement> elements;
        clickFooter();

        if (state.equalsIgnoreCase("CA")) {
            elements = driver.findElements(By.xpath(year.replace("$$", "1")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), yearTxt, "Year");
        } else if (state.equalsIgnoreCase("WA")) {
            elements = driver.findElements(By.xpath(year.replace("$$", "2")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), yearTxt, "Year");
        }
        clickFooter();
    }

    public void setManufacturerPW(String manufacturerTxt, String state, int index) throws Throwable {
        List<WebElement> elements;
        clickFooter();

        if (state.equalsIgnoreCase("CA")) {
            elements = driver.findElements(By.xpath(manufacturer.replace("$$", "2")));
            clickElement(watercraftInformationBlock, "block");
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), manufacturerTxt, "Manufacturer");
        } else if (state.equalsIgnoreCase("WA")) {
            elements = driver.findElements(By.xpath(manufacturer.replace("$$", "3")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), manufacturerTxt, "Manufacturer");
        }
        clickFooter();
    }

    public void setModelPW(String modelTxt, String state, int index) throws Throwable {
        List<WebElement> elements;
        clickFooter();

        if (state.equalsIgnoreCase("CA")) {
            elements = driver.findElements(By.xpath(model.replace("$$", "3")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), modelTxt, "Model");
        } else if (state.equalsIgnoreCase("WA")) {
            elements = driver.findElements(By.xpath(model.replace("$$", "4")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), modelTxt, "Model");
        }
        clickFooter();
    }

    public void setLengthPW(String lengthTxt, String state, int index) throws Throwable {
        List<WebElement> elements;
        clickFooter();

        if (state.equalsIgnoreCase("CA")) {
            elements = driver.findElements(By.xpath(length.replace("$$", "5")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), lengthTxt, "Length");
        } else if (state.equalsIgnoreCase("WA")) {
            elements = driver.findElements(By.xpath(length.replace("$$", "6")));
            clickElement(elements.get(index));
            pause(700);
            typeText(driver.switchTo().activeElement(), lengthTxt, "Length");
        }
        clickFooter();
    }

    //New method using Additional_Watercraft column in Excel
    public void addWatercraftEX(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft information");
        String additionalWatercraft = data.get("Additional_Watercraft");

        if (hasValue(additionalWatercraft) && !additionalWatercraft.equalsIgnoreCase(",")) {
            int count = additionalWatercraft.split(",").length;
            int index = returnIndexOfLastWatercraftEX() + 1;

            for (int i = 1; i <= count; i++) {
                clickAdd();
                index++;

                setMake(data.get("Watercraft_Make_" + i), index);
                setModel(data.get("Watercraft_Model_" + i) , index);
                setHullValue(data.get("Watercraft_HullValue_" + i), index);
                setLength(data.get("Watercraft_Length_" + i), index);
                setHorsepower(data.get("Watercraft_HorsePower_" + i), index);
                setMaxDesignSpeed(data.get("Watercraft_MaxSpeed_" + i), index);
            }
            saveChanges();
        }
    }

    public void addWatercraftsDetails(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft information");
        if (hasValue(data.get("Watercraft_Num"))) {
            for (int i = 1; i <= Integer.parseInt(data.get("Watercraft_Num")); i++) {
                clickElement(add);
                clickElement(watercraftInformationBlock);
                setMake(data.get("Watercraft_Make").split(",")[i - 1], i);
                setModel(data.get("Watercraft_Model").split(",")[i - 1], i);
                setHullValue(data.get("Watercraft_Hull_Value").split(",")[i - 1], i);
                setLength(data.get("Watercraft_Length").split(",")[i - 1], i);
                setHorsepower(data.get("Watercraft_Horsepower").split(",")[i - 1], i);

                if (isVisibleOnly(By.xpath("//span[text()='Max Design Speed']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[6]/div")))
                    setMaxDesignSpeed(data.get("Watercraft_Max_Design_Speed").split(",")[i - 1], i);

                saveChanges();
            }
        }
    }

    public void addWatercraftsDetails_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Watercraft_Num_END"))) {
            int num = Integer.parseInt(data.get("Watercraft_Num_END"));
            for (int i = 1; i <= num; i++) {
                int totalInsured = i + Integer.parseInt(data.get("Watercraft_Num"));
                clickElement(add);
                pause(2000);
                clickElement(watercraftInformationBlock);
                setMake(data.get("Watercraft_Make_END").split(",")[i - 1], totalInsured);
                setModel(data.get("Watercraft_Model_END").split(",")[i - 1], totalInsured);
                setHullValue(data.get("Watercraft_Hull_Value_END").split(",")[i - 1], totalInsured);
                setLength(data.get("Watercraft_Length_END").split(",")[i - 1], totalInsured);
                setHorsepower(data.get("Watercraft_Horsepower_END").split(",")[i - 1], totalInsured);

                if (isVisibleOnly(By.xpath("//span[text()='Max Design Speed']/../../../../../../../../../div[3]//table[" + totalInsured + "]//tr/td[6]/div")))
                    setMaxDesignSpeed(data.get("Watercraft_Max_Design_Speed_END").split(",")[i - 1], totalInsured);

                saveChanges();
            }
        }
    }

    public void addWatercraftsDetails_OOS_END(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Watercraft_Num_OOS_END"))) {
            int num = Integer.parseInt(data.get("Watercraft_Num_OOS_END"));
            for (int i = 1; i <= num; i++) {
                int totalInsured = i + Integer.parseInt(data.get("Watercraft_Num"));
                clickElement(add);
                pause(2000);
                clickElement(watercraftInformationBlock);
                setMake(data.get("Watercraft_Make_OOS_END").split(",")[i - 1], totalInsured);
                setModel(data.get("Watercraft_Model_OOS_END").split(",")[i - 1], totalInsured);
                setHullValue(data.get("Watercraft_Hull_Value_OOS_END").split(",")[i - 1], totalInsured);
                setLength(data.get("Watercraft_Length_OOS_END").split(",")[i - 1], totalInsured);
                setHorsepower(data.get("Watercraft_Horsepower_OOS_END").split(",")[i - 1], totalInsured);

                if (isVisibleOnly(By.xpath("//span[text()='Max Design Speed']/../../../../../../../../../div[3]//table[" + totalInsured + "]//tr/td[6]/div")))
                    setMaxDesignSpeed(data.get("Watercraft_Max_Design_Speed_OOS_END").split(",")[i - 1], totalInsured);

                saveChanges();
            }
        }
    }

    public void addWatercraftsDetails_RNW(Map<String, String> data) throws Throwable {
        if (hasValue(data.get("Watercraft_Num_RNW"))) {
            int totalInsured = 0;
            int endorsementTotalInsured = Integer.parseInt(data.get("Watercraft_Num_END"));
            int num = Integer.parseInt(data.get("Watercraft_Num_RNW"));
            for (int i = 1; i <= num; i++) {
                if (data.containsKey("Renewal_After_Endorsement") && data.get("Renewal_After_Endorsement").equals("Yes")) {
                    totalInsured = i + Integer.parseInt(data.get("Watercraft_Num")) + endorsementTotalInsured;
                } else {
                    totalInsured = i + Integer.parseInt(data.get("Watercraft_Num"));
                }
                clickElement(add);
                pause(2000);
                clickElement(watercraftInformationBlock);
                setMake(data.get("Watercraft_Make_RNW").split(",")[i - 1], totalInsured);
                setModel(data.get("Watercraft_Model_RNW").split(",")[i - 1], totalInsured);
                setHullValue(data.get("Watercraft_Hull_Value_RNW").split(",")[i - 1], totalInsured);
                setLength(data.get("Watercraft_Length_RNW").split(",")[i - 1], totalInsured);
                setHorsepower(data.get("Watercraft_Horsepower_RNW").split(",")[i - 1], totalInsured);

                if (isVisibleOnly(By.xpath("//span[text()='Max Design Speed']/../../../../../../../../../div[3]//table[" + totalInsured + "]//tr/td[6]/div")))
                    setMaxDesignSpeed(data.get("Watercraft_Max_Design_Speed_RNW").split(",")[i - 1], totalInsured);

                saveChanges();
            }
        }
    }

    public void addWatercraftDetailsES(Map<String, String> data) throws Throwable {
        verifyBlockExists("watercraft information");
        if (hasValue(data.get("Watercraft_Num"))) {
            int num = Integer.parseInt(data.get("Watercraft_Num"));
            for (int i = 0; i < num; i++) {
                clickElement(add);
                clickElement(watercraftInformationBlock);
                setMakeES(data.get("Watercraft_Make").split(",")[i], i);
                setModelES(data.get("Watercraft_Model").split(",")[i], i);
                setHullValueES(data.get("Watercraft_Hull_Value").split(",")[i], i);
                setLengthES(data.get("Watercraft_Length").split(",")[i], i);
                setHorsepowerES(data.get("Watercraft_Horsepower").split(",")[i], i);
                saveChanges();
            }
        }
    }

    public void setMake(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Make']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[1]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setModel(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Model']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[2]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setHullValue(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Hull Value ($)']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[3]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setLength(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Length (feet)']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[4]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setHorsepower(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Horsepower']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[5]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public void setMaxDesignSpeed(String value, int i) throws Throwable {
        if (hasValue(value)) {
            clickElement(driver.findElement(By.xpath("//span[text()='Max Design Speed']/../../../../../../../../../div[3]//table[" + i + "]//tr/td[6]/div")));
            pause(1000);
            driver.switchTo().activeElement().sendKeys(value);
        }
    }

    public int returnIndexOfLastWatercraftEX() {
        return makeInputEX.size() - 1;
    }

    public int returnIndexOfLastWatercraftES() {
        return makeES.size() - 1;
    }

    public void clickAdd() throws Throwable {
        clickElement(add, "add");
        pause(1500);
        clickFooter();
    }

    public void setMakeES(String value, int i) throws Throwable {
        typeText(makeES.get(i), value, "Make");
    }

    public void setModelES(String value, int i) throws Throwable {
        typeText(modelES.get(i), value, "Model");
    }

    public void setHullValueES(String value, int i) throws Throwable {
        typeText(hullValueES.get(i), value, "Hull Value");
    }

    public void setLengthES(String value, int i) throws Throwable {
        typeText(lengthES.get(i), value, "Length");
    }

    public void setHorsePowerES(String value, int i) throws Throwable {
        typeText(horsepowerES.get(i), value, "Horsepower");
    }

    public int returnIndexOfLastWatercraft() {
        return yearInputCA.size() -1;
    }

    public void setHorsepowerES(String value, int i) {
        typeText(horsepowerES.get(i), value, "Watercraft Horsepower");
    }
}