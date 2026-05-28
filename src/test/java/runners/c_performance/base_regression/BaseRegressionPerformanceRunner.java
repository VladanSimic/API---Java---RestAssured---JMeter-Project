package runners.c_performance.base_regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Test
@CucumberOptions(
        features = "src/test/java/features/b_regression",
        glue = "steps/dragon",
        tags = "(@GeneralRegression and not @Performance and not @FloodSurplus and not @OrderPropertyDetails) or (@FloodSurplus and @PerformanceNEW)",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt",
                "json:target/cucumber-report/cucumber.json"
        })
public class BaseRegressionPerformanceRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        Object[][] scenarios = super.scenarios();
        List<Object[]> scenarioList = Arrays.asList(scenarios);
        Collections.shuffle(scenarioList);
        return scenarioList.toArray(new Object[0][]);
    }
}