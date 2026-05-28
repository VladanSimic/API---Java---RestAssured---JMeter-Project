package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.utils.TeamsNotifier;
import steps.BaseTest;

import java.io.PrintWriter;
import java.io.StringWriter;

public class NotificationFailureTestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Throwable throwable = result.getThrowable();
        String errorMessage = "";

        if (throwable != null) {
            String rawMessage = throwable.getMessage();
            if (rawMessage != null) {
                int sessionIndex = rawMessage.indexOf("Session info:");
                if (sessionIndex != -1) {
                    errorMessage = rawMessage.substring(0, sessionIndex).trim();
                } else {
                    errorMessage = rawMessage.trim();
                }
            }
        }

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        String stackTrace = sw.toString();
        String[] lines = stackTrace.split("\\r?\\n");
        String stepText = "";
        String featurePath = "";

        for (String line : lines) {
            if (line.contains(".feature")) {
                int stepStart = line.indexOf("✽.") + 2;
                int stepEnd = line.indexOf('(');
                if (stepStart != -1 && stepEnd != -1 && stepEnd > stepStart) {
                    stepText = line.substring(stepStart, stepEnd).trim();
                }
                int pathStart = line.indexOf("file:///");
                int pathEnd = line.indexOf(')', pathStart);
                if (pathStart != -1 && pathEnd != -1) {
                    featurePath = line.substring(pathStart + 8, pathEnd).replace("\\", "/").trim();
                    int featuresIndex = featurePath.indexOf("features/");
                    if (featuresIndex != -1) {
                        featurePath = featurePath.substring(featuresIndex);
                    }
                }
            }
        }

        String message =
                "Error: " + errorMessage + "\n" +
                        "\n------------------------------\n" +
                        "\nStep Description:\n" + stepText + "\n" +
                        "\nFailed Step:\n" + featurePath;

            TeamsNotifier.sendFailureNotification("Failure - " + BaseTest.getScenarioName(), message);
        }
}

