package pages.utils;

import config.ConfigManager;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TeamsNotifier {
    private static final String resourcePath = "src/test/resources/hooks.properties";
    private static String cachedWebHookUrl = null;

    public static void sendFailureNotification(String testName, String testMessage) {
        try {
            String message = formatMessage(testName, testMessage);
            sendToTeams(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String formatMessage(String testName, String message) {
        return String.format(
                "{\n" +
                        "  \"@type\": \"MessageCard\",\n" +
                        "  \"@context\": \"http://schema.org/extensions\",\n" +
                        "  \"summary\": \"Automation Notification\",\n" +
                        "  \"themeColor\": \"FF0000\",\n" +
                        "  \"title\": \"%s\",\n" +
                        "  \"text\": \"%s\",\n" +
                        "  \"markdown\": true\n" +
                        "}",
                escapeJson(testName),
                escapeJson(message));
    }

    private static String escapeJson(String input) {
        return input.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private static void sendToTeams(String payload) throws Exception {
        URL url = new URL(getWebHook());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(payload.getBytes());
        }

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Teams Webhook failed with HTTP code: " + responseCode);
        }
    }

    private static String getWebHook() {
        if (cachedWebHookUrl == null) {
            String webhookUrl = System.getenv("TEAMS_WEBHOOK_KEY");

            if (webhookUrl != null && !webhookUrl.trim().isEmpty()) {
                cachedWebHookUrl = webhookUrl.trim();
            }

            if (cachedWebHookUrl == null) {
                try {
                    ITestResult result = Reporter.getCurrentTestResult();
                    String param = result.getTestContext().getCurrentXmlTest().getParameter("TEAMS_NOTIFIER");

                    if (param != null && !param.equalsIgnoreCase("No")) {
                        cachedWebHookUrl = ConfigManager.getConnectionsProperty(param, resourcePath);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return cachedWebHookUrl;
    }

}

