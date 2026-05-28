package runners.d_other.primary_flood.smoke;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC101890 or @TC101900 or @TC100385 or @TC100387 or @TC100392 or @TC100175 or @TC100177 or @TC100182 or @TC99925 or @TC99927 or @TC100724 or @TC100755 or @TC100761 or @TC100763 or @TC98971 or @TC99056",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS407 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}