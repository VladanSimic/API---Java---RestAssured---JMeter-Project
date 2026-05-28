package runners.d_other.primary_flood.e2e;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC109608 or @TC110136 or @TC105311 or @TC104383 or @TC105991 or @TC99210 or @TC104564 or @TC101890 or @TC108424 or @TC101468 or @TC108423 or @TC99545 or @TC100770 or @TC105310",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS596 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}