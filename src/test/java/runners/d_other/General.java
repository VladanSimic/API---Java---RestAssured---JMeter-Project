package runners.d_other;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps/dragon",
        tags = "@RUNRUN",
//        tags = "@US60796 and @HO",
//        tags = "@US60796 and @FS",
//        tags = "@US60803 and @HO",
//        tags = "@US60803 and @FS",
//        tags = "@US60786 and @HO",
//        tags = "@US60786 and @FS",
//        tags = "@US60806",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "rerun:results/failures.txt"
        })
public class General extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}