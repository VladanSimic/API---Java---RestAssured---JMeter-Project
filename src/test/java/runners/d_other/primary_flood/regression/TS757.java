package runners.d_other.primary_flood.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@TC118647 or @TC118398 or @TC118526 or @TC118523 or @TC118527 or @TC118524 or @TC118512 or @TC117445 or @TC117468 or @TC117642 or @TC117447 or @TC117470 or @TC117446 or @TC117469 or @TC117459 or @TC118906 or @TC118912 or @TC118926 or @TC118931 or @TC118303 or @TC118297 or @TC118386 or @TC117449 or @TC117472 or @TC117648 or @TC118389 or @TC118948 or @TC116125 or @TC116126 or @TC116128 or @TC116129 or @TC116154 or @TC116153 or @TC116152 or @TC116151 or @TC116150 or @TC116095 or @TC116096 or @TC116097 or @TC116098 or @TC116099 or @TC116127",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class TS757 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}