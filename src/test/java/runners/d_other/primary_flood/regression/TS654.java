package runners.d_other.primary_flood.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC97816NJ or @TC105287NJ or @TC107085NJ or @TC109546NJ or @TC101294NJ or @TC97813MA or @TC105294MA or @TC105919MA or @TC109548MA or @TC110128MA or @TC97816GA or @TC100385GA or @TC101295GA or @TC105297CT or @TC105298CT or @TC104602CT or @TC99210 or @TC99545 or @TC101890 or @TC104383 or @TC104564 or @TC105991 or @TC108423 or @TC108424 or @TC109608 or @TC110136 or @TC97704 or @TC100386 or @TC101419 or @TC104603 or @TC105919 or @TC109548 or @TC110128 or @TC105982 or @TS598 or @TC105288NJ or @TC105310",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS654 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}