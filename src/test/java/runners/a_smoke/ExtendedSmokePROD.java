package runners.a_smoke;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/a_smoke_extended",
        glue = "steps/dragon",
        tags = "@ExtendedSmoke and not @LowerENV and not @LexisNexis",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt",
                "json:target/cucumber-report/cucumber.json"
        })
public class ExtendedSmokePROD extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}