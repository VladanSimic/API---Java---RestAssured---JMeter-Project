package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;

public class DriverManager {

    private static final ThreadLocal<DriverManager> instance = ThreadLocal.withInitial(DriverManager::new);
    private WebDriver driver;

    public static DriverManager getInstance() {
        return instance.get();
    }

    public void createWebDriver(String type) throws Exception {
        switch (type) {
            case "CHROME":
                createChromeWebDriver();
                break;
            case "CHROME_H":
                createHeadlessChromeWebDriver();
                break;
            case "FIREFOX":
                createFirefoxWebDriver();
                break;
            case "GRID":
                createRemoteWebDriver();
                break;
            case "GRID_H":
                createRemoteHeadlessWebDriver();
                break;
            case "JENKINS":
                createJENKINSChromeWebDriver();
                break;
            default:
                throw new Exception("Browser: " + type + " not supported! Please check your TestNG browser property!");
        }
    }

    public void quitWebDriver() {
        driver = DriverManager.getInstance().getWebDriver();
        if (null != driver) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void createChromeWebDriver() {
        String paths = Paths.get("results/downloads/" + DriverManager.getInstance() + "/").toAbsolutePath().toString();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();

        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", paths);
        prefs.put("safebrowsing.enabled", false);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }


    public void createHeadlessChromeWebDriver() {
        String paths = Paths.get("results/downloads/" + DriverManager.getInstance() + "/").toAbsolutePath().toString();
        WebDriverManager.chromedriver().clearDriverCache().setup(); //do not remove as this has to executed at least once when mismatch in versions
//        WebDriverManager.chromedriver().driverVersion("120.0.6099.109").setup();
        WebDriverManager.chromedriver().setup();

        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", paths);
        prefs.put("safebrowsing.enabled", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--verbose"); //used to get more chrome logs
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox"); // Disabled because of chrome 124 bug
        options.addArguments("--disable-dev-shm-usage");
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public void createJENKINSChromeWebDriver() {
        String paths = Paths.get("results/downloads/" + DriverManager.getInstance() + "/").toAbsolutePath().toString();
//        WebDriverManager.chromedriver().clearDriverCache().setup(); //do not remove as this has to executed at least once when mismatch in versions
//        WebDriverManager.chromedriver().driverVersion("120.0.6099.109").setup();
        WebDriverManager.chromedriver().setup();

        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", paths);
        prefs.put("safebrowsing.enabled", false);
        prefs.put("profile.password_manager_enabled", false);


        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--verbose"); //used to get more chrome logs
        options.addArguments("--headless");
        // options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox"); // Disabled because of chrome 124 bug
        options.addArguments("--disable-dev-shm-usage");
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public void createFirefoxWebDriver() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");

        driver = new FirefoxDriver(options);
    }

    public void createRemoteWebDriver() throws MalformedURLException {
        String nodeURL = "http://selenium-hub-lb-6f276fc2fb637ec3.elb.us-east-1.amazonaws.com";

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserType", "chrome");

        this.driver = new RemoteWebDriver(new URL(nodeURL), desiredCapabilities);
        this.driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public void createRemoteHeadlessWebDriver() throws MalformedURLException {
        String nodeURL = "http://selenium-hub-lb-407e8245c506dfef.elb.us-east-1.amazonaws.com";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserType", "chrome");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        this.driver = new RemoteWebDriver(new URL(nodeURL), desiredCapabilities);
        this.driver.manage().window().setSize(new Dimension(1920, 1080));
    }

}