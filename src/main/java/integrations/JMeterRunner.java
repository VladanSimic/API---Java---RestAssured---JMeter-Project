package integrations;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import java.io.File;
public class JMeterRunner {
    public static void runTest(String jmxFilePath) throws Exception {
        // Load JMeter properties
        JMeterUtils.loadJMeterProperties("src/test/resources/jmeter/jmeter.properties");
        JMeterUtils.setJMeterHome("src/test/resources/jmeter");
        SaveService.loadProperties();
        JMeterUtils.initLocale();
        // Initialize JMeter
        StandardJMeterEngine jmeter = new StandardJMeterEngine();
        String resultPath = "src/test/resources/jmeter/results/results.jtl";
        JMeterUtils.setProperty("jmeter.save.saveservice.output_file", resultPath);
        JMeterUtils.setProperty("jmeter.save.saveservice.output_format", "xml");
        // Load JMX file
        File jmxFile = new File("src/test/resources/jmeter/JMeterScenario.jmx");
        HashTree testPlanTree = SaveService.loadTree(jmxFile);
        // Configuration and start
        jmeter.configure(testPlanTree);
        jmeter.run();
        while (jmeter.isActive()){
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws Exception {
        runTest("src/test/resources/jmeter/JMeterScenario.jmx");
    }
}



