package runners.p_product_regression.twenty_four.october;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/p_product_regression",
        glue = "steps/dragon",
        tags = "@2024 and @December and @PreProd and not @Forms or @PreProdNew and @2024 and @December and not @Forms",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class IterationOctoberDecember_PreProd extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}