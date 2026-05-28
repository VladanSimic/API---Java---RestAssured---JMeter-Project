package runners.c_performance.scenario11;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/c_performance",
        glue = "steps/dragon",
        tags = "@Scenario11 and @1",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "rerun:results/failures.txt"
        })
public class Scenario11 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}