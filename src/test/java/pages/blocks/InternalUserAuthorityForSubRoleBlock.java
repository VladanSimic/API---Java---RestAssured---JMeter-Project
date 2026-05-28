package pages.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class InternalUserAuthorityForSubRoleBlock extends CommonComponentsAndActions {
    WebDriver driver;

    public InternalUserAuthorityForSubRoleBlock(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyAuthority(String lineOfAuthority, String authority, String limit) {
        assertEquals(
                driver.findElement(By.xpath(generateXpath("//div[text()=$]/../..//td[3]/div", lineOfAuthority))).getText(),
                authority,
                "Authority"
        );

        assertEquals(
                driver.findElement(By.xpath(generateXpath("//div[text()=$]/../..//td[4]/div", lineOfAuthority))).getText(),
                limit,
                "Limit"
        );
    }

}
