package runners.api;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        tags = "@smoke",
        features = {"src/test/java/features"},
        glue = {"steps.api_integrations"},
        plugin = {
                "pretty",
                // Allure adapter for Cucumber 7 – generates files in the `allure-results` folder
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                // Existing HTML and JSON Cucumber reports
                "html:target/cucumber-reports/ecs-jmeter-report.html",
                "json:target/cucumber-reports/ecs-jmeter-report.json"
        },
        monochrome = true,
        publish = false
)
public class EcsRunner extends AbstractTestNGCucumberTests {

    // Allure result files location
    static {
        System.setProperty("allure.results.directory", "results/allure-results");
        System.out.println("DEBUG: Allure results directory = results/allure-results");
    }

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}



























