package runners.d_other.primary_flood.e2e;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC109548 or @TC110128 or @TC107094 or @TC97813 or @TC101295 or @TC105294 or @TC105287 or @TC105919 or @TC97704 or @TC98874 or @TC98995 or @TC104603 or @TC100386 or @TC101419",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS597 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}