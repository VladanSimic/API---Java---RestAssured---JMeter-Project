package integrations;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;
import java.io.File;
import java.util.logging.Logger;
public class JMeter {
    private static final Logger LOGGER = Logger.getLogger(JMeter.class.getName());

    public void run(String jmxPath) {
        try {
            StandardJMeterEngine jmeter = new StandardJMeterEngine();

            // Initialize JMeter environment (use your resource path)
            String jmeterHome = "src/test/resources/jmeter";
            JMeterUtils.setJMeterHome(jmeterHome);
            JMeterUtils.loadJMeterProperties(jmeterHome + "/jmeter.properties");
            JMeterUtils.initLocale();

            // Load JMX test file
            File testFile = new File(jmxPath);
            HashTree testPlanTree = SaveService.loadTree(testFile);

            // Configure and run test
            jmeter.configure(testPlanTree);
            jmeter.run();

            System.out.println("JMeter test finished: " + jmxPath);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to run JMeter embedded test: " + e.getMessage());
        }
    }
}



















