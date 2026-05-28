package runners.d_other.primary_flood.smoke;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC115021 or @TC115045 or @TC115044 or @TC115047 or @TC116159 or @TC116160 or @TC115039 or @TC115028 or @TC116163 or @TC115134 or @TC115135 or @TC115136 or @TC115137 or @TC115138 or @TC115139 or @TC115297 or @TC115298 or @TC115299 or @TC115300 or @TC115301 or @TC115302 or @TC115334 or @TC115335 or @TC115336 or @TC115337 or @TC115338 or @TC115339 or @TC115328 or @TC115329 or @TC115330 or @TC115331 or @TC115332 or @TC115333",
//        broker
//        tags = "@TC116165 or @TC116167 or @TC116168",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS673 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}