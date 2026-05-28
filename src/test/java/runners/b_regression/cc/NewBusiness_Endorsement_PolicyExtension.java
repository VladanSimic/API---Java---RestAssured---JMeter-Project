package runners.b_regression.cc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/b_regression",
        glue = "steps/dragon",
        tags = "@CourseOfConstruction and @PolicyExtension and not @Performance or @CourseOfConstruction and @OrderPropertyDetails",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt",
                "json:target/cucumber-report/cucumber.json"
        })
public class NewBusiness_Endorsement_PolicyExtension extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}