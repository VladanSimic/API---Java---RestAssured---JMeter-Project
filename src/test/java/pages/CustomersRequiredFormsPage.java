package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.utils.CommonComponentsAndActions;

public class CustomersRequiredFormsPage extends CommonComponentsAndActions {
    WebDriver driver;

    public CustomersRequiredFormsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToCustomer() throws Throwable {
        CommonComponentsAndActions commonComponentsAndActions = new CommonComponentsAndActions(driver);
        clickElement(commonComponentsAndActions.customer);
    }
}