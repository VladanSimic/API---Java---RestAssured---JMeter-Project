package pages.utils;

import excel.DataManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.model.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import selenium.DriverManager;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SoftAssertion {
    private static final ThreadLocal<List<String>> exceptions = ThreadLocal.withInitial(ArrayList::new);


    public static void assertAll() {
        String insuredInformation = DataManager.getInstance().getData().get("First_Name") + " " + DataManager.getInstance().getData().get("Last_Name");

        if (!exceptions.get().isEmpty()) {
            StringBuilder errorLog = new StringBuilder("The following exceptions occurred:\n");
            for (String exception : exceptions.get()) {
                errorLog.append(exception).append("\n");
            }
            errorLog.append("\n").append("Customer Information: ").append(insuredInformation);
            errorLog.append("\n").append("Quote ID: ").append(returnQuoteID());
            errorLog.append("\n").append("Policy ID: ").append(returnPolicyID());
            exceptions.remove();
            throw new AssertionError(errorLog);
        }
        exceptions.remove();
    }


    /**
     * Performs a soft assertion comparing the actual and expected values.
     * If the assertion fails, captures a screenshot and reports the failure.
     *
     * @param actual   The actual value to compare.
     * @param expected The expected value to compare against.
     */
    public static <T> void assertEquals(T actual, T expected, String log) {
        try {
            Assert.assertEquals(actual, expected, log);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage());
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            exceptions.get().add(err.getMessage());
        }
    }

    /**
     * Performs a soft assertion comparing the actual and expected values.
     * If the assertion fails, captures a screenshot and reports the failure.
     *
     * @param actual   The actual value to compare.
     * @param expected The expected value to compare against.
     */
    public static <T> void assertEquals(T actual, T expected) {
        try {
            Assert.assertEquals(actual, expected);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage());
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            exceptions.get().add(err.getMessage());
        }
    }

    public static void assertTrue(boolean condition) {
        try {
            Assert.assertTrue(condition);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage() + " expected condition: " + condition);
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            exceptions.get().add(err.getMessage());
        }
    }

    public static void assertTrue(boolean condition, String log) {
        try {
            Assert.assertTrue(condition);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage() + " expected condition: " + condition);
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            System.out.println(log);
            exceptions.get().add(err.getMessage() + "\n" + log);
        }
    }

    public static <T> void assertNull(T object) {
        try {
            Assert.assertNull(object);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage());
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            exceptions.get().add(err.getMessage());
        }
    }

    public static <T> void assertNotEquals(T actual, T expected, String log) {
        try {
            Assert.assertNotEquals(actual, expected, log);
        } catch (AssertionError err) {
            Allure.addAttachment("Error Message: ", err.getMessage());
            reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
            exceptions.get().add(err.getMessage());
        }
    }

    /**
     * Performs a soft assertion hardcoding the failure.
     * Captures a screenshot and reports the failure.
     *
     * @param message Message that will be displayed
     */
    public static void fail(String message) {
        Allure.addAttachment("Error Message: ", message);
        reportScreenshot("SoftAssert_Failure_" + System.currentTimeMillis());
        exceptions.get().add(message);
    }

    private static void takeScreenshot(String fileName) {
        WebDriver driver = DriverManager.getInstance().getWebDriver();

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("results/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void reportScreenshot(String screenshotName) {
        takeScreenshot(screenshotName);
        Path content = Paths.get("results/screenshots/" + screenshotName + ".png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("Screenshot", is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String returnPolicyID() {
        String policyID = DataManager.getInstance().getData().get("Policy_ID");
        if (policyID == null) {
            policyID = "No Policy ID";
        }
        return policyID;
    }

    public static boolean isFailed() {
        return !exceptions.get().isEmpty();
    }

    private static String returnQuoteID() {
        String quoteID = DataManager.getInstance().getData().get("QUOTE_ID");
        if (quoteID == null) {
            quoteID = "No Quote ID";
        }
        return quoteID;
    }

}
