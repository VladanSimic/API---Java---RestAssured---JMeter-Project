package steps.dragon.common;

import excel.DataManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.OKTALoginPage;
import pages.utils.CommonComponentsAndActions;
import selenium.DriverManager;
import steps.BaseTest;

import java.util.ArrayList;
import java.util.Map;

public class LoginSteps extends BaseTest {

    WebDriver driver = DriverManager.getInstance().getWebDriver();
    public Map<String, String> data = DataManager.getInstance().getData();

    @Given("I am logged in to Pure as {string}")
    public void iAmLoggedInToPureAs(String subrole) throws Throwable {
        new LoginPage(driver).login(ENV, subrole);
        data.put("User_Role", subrole);
    }

    @Given("I am logged in to Pure as Broker")
    public void iAmLoggedInToPureAsBroker() throws Throwable {
        new LoginPage(driver).login(ENV, "Agent2");
    }

    @Given("I am logged in to Pure as Field")
    public void iAmLoggedInToPureAsField() throws Throwable {
        new LoginPage(driver).login(ENV, "Field");
    }

    @Given("I am logged in to Pure as Zonal")
    public void iAmLoggedInToPureAsZonal() throws Throwable {
        new LoginPage(driver).login(ENV, "Zonal");
    }

    @Given("I am logged in to Pure as RUM")
    public void iAmLoggedInToPureAsRUM() throws Throwable {
        new LoginPage(driver).login(ENV, "RUM");
    }

    @Given("I am logged in to Pure as Specialist1")
    public void iAmLoggedInToPureAsSpecialist1() throws Throwable {
        new LoginPage(driver).login(ENV, "Specialist1");
    }

    @Given("I am logged in to Pure as Specialist2")
    public void iAmLoggedInToPureAsSpecialist2() throws Throwable {
        new LoginPage(driver).login(ENV, "Specialist2");
    }

    @Given("I am logged in to Pure as SeniorUnderwriter")
    public void iAmLoggedInToPureAsSeniorUnderwriter() throws Throwable {
        new LoginPage(driver).login(ENV, "SeniorUnderwriter");
    }

    @Given("I am logged in to Pure as Underwriter1")
    public void iAmLoggedInToPureAsUnderwriter1() throws Throwable {
        new LoginPage(driver).login(ENV, "Underwriter1");
    }

    @Given("I am logged in to Pure as Underwriter2")
    public void iAmLoggedInToPureAsUnderwriter2() throws Throwable {
        new LoginPage(driver).login(ENV, "Underwriter2");
    }

    @Given("I am logged in to Pure as Analyst")
    public void iAmLoggedInToPureAsAnalyst() throws Throwable {
        new LoginPage(driver).login(ENV, "Analyst");
    }

    @Given("I am logged in to Pure as UWSA1")
    public void iAmLoggedInToPureAsUWSA1() throws Throwable {
        new LoginPage(driver).login(ENV, "UWSA1");
    }

    @Given("I am logged in to Pure as UWSA2")
    public void iAmLoggedInToPureAsUWSA2() throws Throwable {
        new LoginPage(driver).login(ENV, "UWSA2");
    }

    @Given("I am logged in to Pure as UWSSA")
    public void iAmLoggedInToPureAsUWSSA() throws Throwable {
        new LoginPage(driver).login(ENV, "UWSSA");
    }

    @Given("I am logged in to Pure as UWSRM")
    public void iAmLoggedInToPureAsUWSRM() throws Throwable {
        new LoginPage(driver).login(ENV, "UWSRM");
    }

    @Given("I am logged in to Pure as SeniorUWManagementRole")
    public void iAmLoggedInToPureAsSeniorUWManagementRole() throws Throwable {
        new LoginPage(driver).login(ENV, "SeniorUWManagementRole");
    }

    @Given("I am logged in to Pure as UWManagerRole")
    public void iAmLoggedInToPureAsUWManagerRole() throws Throwable {
        new LoginPage(driver).login(ENV, "UWManagerRole");
    }

    @Given("I am logged in to Pure as UnderwriterRole")
    public void iAmLoggedInToPureAsUnderwriterRole() throws Throwable {
        new LoginPage(driver).login(ENV, "UnderwriterRole");
    }

    @Given("I am logged in to Pure as UnderwritingTechnicianRole")
    public void iAmLoggedInToPureAsUnderwritingTechnicianRole() throws Throwable {
        new LoginPage(driver).login(ENV, "UnderwritingTechnicianRole");
    }

    @Given("I am logged in to Pure as SeniorUWTechnicianRole")
    public void iAmLoggedInToPureAsSeniorUWTechnicianRole() throws Throwable {
        new LoginPage(driver).login(ENV, "SeniorUWTechnicianRole");
    }

    @And("I login with OKTA user {string}")
    public void iLoginWithOKTAUser(String user) throws Throwable {
        if (ENV.equalsIgnoreCase("QA") || ENV.equalsIgnoreCase("DEV")) {
            new LoginPage(driver).login(ENV, "Field");
        } else {
            OKTALoginPage lp = new OKTALoginPage(driver);
            lp.openOKTA(user);
            lp.selectOKTATile(ENV);
            pause(3);
            //setting the logging level to perf
            if (hasValue(PGActions) && PGActions.equalsIgnoreCase("Yes")) {
                pause(3);
                driver.findElement(By.tagName("body")).sendKeys(Keys.LEFT_CONTROL, Keys.LEFT_SHIFT, "L");
                pause(1);
                driver.findElement(By.xpath("//input[@id='diagnosGridDbLoggingLevels-inputEl']")).clear();
                driver.findElement(By.xpath("//input[@id='diagnosGridDbLoggingLevels-inputEl']")).sendKeys("Performance");
                pause(1);
                driver.findElement(By.xpath("//span[text()='Set Logging Level']")).click();
                pause(1);
                driver.findElement(By.xpath("//span[text()='OK']")).click();
                pause(1);
                driver.findElement(By.xpath("//input[@id='diagnosGridDbLoggingLevels-inputEl']")).sendKeys(Keys.ESCAPE);
                pause(1);
                driver.findElement(By.xpath("//span[text()='home']")).click();
            }
        }
        pause(3);
        data.put("SESSION_ID", new CommonComponentsAndActions(driver).getUserSessionId());
    }

    @And("I {string} OKTA")
    public void iLogoutOKTAOrCloseBrowser(String logoutOrCloseBrowser) throws Throwable {
        if (logoutOrCloseBrowser.equalsIgnoreCase("Close")) {
            driver.quit();
        } else if (logoutOrCloseBrowser.equalsIgnoreCase("Logout")) {
            pause(3);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.close();
            driver.switchTo().window(tabs.get(0));
            driver.findElements(By.xpath("//div[@class='dropdown-menu']")).get(0).click();
            pause(2);
            driver.findElement(By.xpath("//a[@data-se='topbar--sign-out']")).click();
            pause(2);
            driver.quit();
        }
    }

    @And("I logout")
    public void iLogout() throws InterruptedException {
        pause(10);
        driver.findElement(By.xpath("//span[text()='logout']")).click();
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception ignored) {

        }
    }

    @And("I am logged in to Pure as agent {string}")
    public void iAmLoggedInToPureAsAgent(String user) throws Throwable {
        new LoginPage(driver).login(ENV, user);
    }

    @When("I am logged in to Pure as {string} unless is PROD then {string}")
    public void iAmLoggedInToPureAsUnlessIsPRODThen(String subrole, String prodOktaUser) throws Throwable {
        if (ENV.contains("PROD")) {
            iLoginWithOKTAUser(prodOktaUser);
        } else {
            iAmLoggedInToPureAs(subrole);
        }
    }

    @And("I am logged in to Pure as Primary Surplus UW")
    public void iAmLoggedInToPureAsPrimarySurplusUW() throws Throwable {
        new LoginPage(driver).login(ENV, "SurplusUW");
    }

}