package runners.c_performance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Test
@CucumberOptions(
        features = "src/test/java/features/c_performance/",
        glue = "steps/dragon",
        tags = "@USAppendix",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt",
                "json:target/cucumber-report/cucumber.json"
        })

public class United_States_Performance_Appendix extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        Object[][] scenarios = super.scenarios();
        List<Object[]> scenarioList = Arrays.asList(scenarios);
        Collections.shuffle(scenarioList);
        return scenarioList.toArray(new Object[0][]);
    }
}