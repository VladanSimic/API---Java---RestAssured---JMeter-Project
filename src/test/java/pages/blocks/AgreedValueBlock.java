package pages.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class AgreedValueBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public AgreedValueBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Worldwide Jewelry']/../../../../div//label[text()='Yes']")
    WebElement agreedValueWorldwideJewelryYes;
    @FindBy(xpath = "//div[text()='Bank Vaulted Jewelry']/../../../../div//label[text()='Yes']")
    WebElement agreedValueBankVaultedJewelryYes;
    @FindBy(xpath = "//div[text()='Fine Art/Collectibles']/../../../../div//label[text()='Yes']")
    WebElement agreedValueFineArtCollectiblesYes;
    @FindBy(xpath = "//div[text()='Coins, Silver, Stamps. Furs. Musical Instruments']/../../../../div//label[text()='Yes']")
    WebElement agreedValueCoinsSilverStampsFursMusicalInstrumentsYes;
    @FindBy(xpath = "//div[text()='Wine']/../../../../div//label[text()='Yes']")
    WebElement agreedValueWineYes;
    @FindBy(xpath = "//div[text()='Miscellaneous']/../../../../div//label[text()='Yes']")
    WebElement agreedValueMiscellaneousYes;
    @FindBy(xpath = "//div[text()='agreed value for specific classes (underwriting only)']")
    WebElement agreedValueBlock;


    //CO
    public void fillAgreedValueBlock(Map<String, String> data) throws Throwable {
        if (isElementDisplayed(agreedValueBlock)) {

            if (hasValue(data.get("Agreed_Value_Worldwide_Jewelry")) && (data.get("Agreed_Value_Worldwide_Jewelry").equalsIgnoreCase("Yes"))) {
                setAgreedValueWorldwideJewelryYes();
            }
            if (hasValue(data.get("Agreed_Value_Bank_Vaulted_Jewelry")) && (data.get("Agreed_Value_Bank_Vaulted_Jewelry").equalsIgnoreCase("Yes"))) {
                setAgreedValueBankVaultedJewelryYes();
            }
            if (hasValue(data.get("Agreed_Value_Fine_Art_Collectibles")) && (data.get("Agreed_Value_Fine_Art_Collectibles").equalsIgnoreCase("Yes"))) {
                setAgreedValueFineArtCollectiblesYes();
            }
            if (hasValue(data.get("Agreed_Value_Coins_Silver_Stamps_Furs_Musical_Instruments")) && (data.get("Agreed_Value_Coins_Silver_Stamps_Furs_Musical_Instruments").equalsIgnoreCase("Yes"))) {
                setAgreedValueCoinsSilverStampsFursMusicalInstrumentsYes();
            }
            if (hasValue(data.get("Agreed_Value_Wine")) && (data.get("Agreed_Value_Wine").equalsIgnoreCase("Yes"))) {
                setAgreedValueWineYes();
            }
            if (hasValue(data.get("Agreed_Value_Miscellaneous")) && (data.get("Agreed_Value_Miscellaneous").equalsIgnoreCase("Yes"))) {
                setAgreedValueMiscellaneousYes();
            }
        }
    }


    public void setAgreedValueMiscellaneousYes() throws Throwable {
        clickElement(agreedValueMiscellaneousYes);
    }

    public void setAgreedValueWineYes() throws Throwable {
        clickElement(agreedValueWineYes);
    }

    public void setAgreedValueCoinsSilverStampsFursMusicalInstrumentsYes() throws Throwable {
        clickElement(agreedValueCoinsSilverStampsFursMusicalInstrumentsYes);
    }

    public void setAgreedValueWorldwideJewelryYes() throws Throwable {
        clickElement(agreedValueWorldwideJewelryYes);
    }

    public void setAgreedValueFineArtCollectiblesYes() throws Throwable {
        clickElement(agreedValueFineArtCollectiblesYes);
    }

    public void setAgreedValueBankVaultedJewelryYes() throws Throwable {
        clickElement(agreedValueBankVaultedJewelryYes);
    }

}

