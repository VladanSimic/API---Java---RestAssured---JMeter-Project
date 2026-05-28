package runners.d_other.primary_flood.smoke;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC105281 or @TC106255 or @TC105565 or @TC106077 or @TC106108 or @TC105508 or @TC106238 or @TC105581 or @TC105582 or @TC105520 or @TC105583 or @TC105584 or @TC105585 or @TC105586 or @TC105587 or @TC105588 or @TC105589 or @TC106109 or @TC105573 or @TC106084 or @TC105574 or @TC106110 or @TC105575 or @TC106111 or @TC105576 or @TC106112 or @TC105512 or @TC105577 or @TC106113 or @TC105578 or @TC105579 or @TC105517 or @TC105580 or @TC105518",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS481 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}