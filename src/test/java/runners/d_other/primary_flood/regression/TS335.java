package runners.d_other.primary_flood.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC97818 or @TC97817 or @TC97705 or @TC97706",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS335 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}