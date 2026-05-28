package runners.h_regression_full.carrier_partners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@ExcessLiabilitySurplus and @GeneralRegression and @Test and @Jenkins",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class CarrierPartners extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        Object[][] scenarios = super.scenarios();
//        List<Object[]> scenarioList = Arrays.asList(scenarios);
//        Collections.shuffle(scenarioList);
//        return scenarioList.toArray(new Object[0][]);
//    }

}