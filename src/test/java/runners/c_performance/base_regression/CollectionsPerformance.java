package runners.c_performance.base_regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/c_performance",
        glue = "steps/dragon",
        tags = "@BaseRegressionPerformance and @CO",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class CollectionsPerformance extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}