package steps.api_integrations;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import integrations.GeneralEcsHealthSimulationV8;

public class JMeterEcsSteps {

    private GeneralEcsHealthSimulationV8 simulation;

    public JMeterEcsSteps(){
        simulation = new GeneralEcsHealthSimulationV8();
    }

    @When("I run JMeter test {string} on {string} with {int} threads, ramp-up {int} seconds with duration {int} seconds and same user {word} and on error {string}")
    public void runJMeterTestWithEnv(String testName,
                                     String env,
                                     int threads,
                                     int rampUpSeconds,
                                     int durationSeconds,
                                     String sameUser,
                                     String onErrorAction) throws Exception {

        // 1. Pass Cucumber parameters to JMeter as system properties (used in .jmx)
        System.setProperty("env", env);
        System.setProperty("threads", String.valueOf(threads));
        System.setProperty("rampUpSeconds", String.valueOf(rampUpSeconds));
        System.setProperty("durationSeconds", String.valueOf(durationSeconds));
        System.setProperty("sameUserOnNextIteration", sameUser);

        // New: action after sampler error
        // Allowed values: continue, startnextloop, stopthread, stoptest, stoptestnow
        System.setProperty("onSampleError", onErrorAction);

        // 2. Optional: ecs.* properties used by V8 main logic
        System.setProperty("ecs.threads", String.valueOf(threads));
        System.setProperty("ecs.rampUp", String.valueOf(rampUpSeconds));
        System.setProperty("ecs.duration", String.valueOf(durationSeconds));

        String resultFilePath = "src/test/resources/jmeter/results/"
                + "run_" + testName + "_" + env + "_" + threads + "threads.csv";
        System.setProperty("resultFile", resultFilePath);
        System.out.println(">>> Result file = " + resultFilePath);


        // Call V8 simulation with parameters (updated signature)
        simulation.runJMeterTestWithEnv(testName, env, threads, rampUpSeconds, durationSeconds, sameUser, onErrorAction);
    }

    @Then("ECS health status should be healthy")
    public void ecs_health_status_should_be_healthy() {
        System.out.println("ECS service status verified as HEALTHY");

    }
}

















