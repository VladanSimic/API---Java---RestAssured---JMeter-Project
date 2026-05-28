package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountsColumnBlock {
    WebDriver driver;

    public AccountsColumnBlock(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String HOMEOWNERS_POLICY = "Homeowners Policy";
    public String OPTIONAL_COVERAGES = "Optional Coverages";
    public String PREVIOUS_CLAIMS_LOSSES = "Previous Claim/Losses";
    public String INSPECTION = "Inspection";
    public String ADDITIONAL_INTERESTS = "Additional Interests";
    public String BINDING_INFORMATION = "Binding Information";
    public String MANUSCRIPT_ENDORSEMENTS = "Manuscript Endorsements";
    public String SUBJECTIVITIES = "Subjectivities";

    public void navigateTo(String item) {
        driver.findElement(By.xpath("//div[contains(@id,'accountsColumn')]//a[contains(text(),'" + item + "')]")).click();
    }

}