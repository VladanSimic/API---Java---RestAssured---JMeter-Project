package pages.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.request.UpdateRequest;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.response.UpdateResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;

public class RallyComponent {
    public static void main(String[] args) throws Exception {

        String host = "https://rally1.rallydev.com";
        //TODO - have API key to read from settings local file
        String apiKey = "xxxxxxx"; // Use your API key
        String applicationName = "Find & Deactivate TestCases by Filter";
        String workspaceRef = "/workspace/187810129592"; // PUI workspace
        Project[] projects = {new Project("Platform-QA", "/project/a2f39b71-d672-42b5-8530-e8d362860def"),
                new Project("Dragon Tamers", "/project/ebf7926c-2332-4d9d-91bf-44f1a684c85c"),
                new Project("ENForcers   Enhancement and Friction Kanban", "/project/fb3a90ff-c728-40fd-8070-58bdb7496731"),
                new Project("Guardian Elite Forces", "/project/29f303ae-8ffa-4162-8ad7-e70465aebb91"),
                new Project("Guardians of the Policy", "/project/0803ef3a-d0ac-489a-a6bd-62947f2a1061"),
                new Project("Integration Wizards", "/project/4df5db96-a0a5-42dd-ac33-1d2dd865f1c3"),
                new Project("Leon’s Lions", "/project/b444dd6a-4fde-46de-89ad-76d43b933927"),
                new Project("Product Changes Team (The Rate Magicians)", "/project/6cca5f24-1051-4e6e-9350-c1151bc2e0f6"),
                new Project("Dragon - Enhancement and Friction", "/project/91c59f56-1a48-4a87-9107-5b797ca04234")};
//        Project[] projectsTest = {new Project("Platform-QA", "/project/a2f39b71-d672-42b5-8530-e8d362860def"),
//                                new Project("Product Changes Team (The Rate Magicians)", "/project/6cca5f24-1051-4e6e-9350-c1151bc2e0f6")};

        RallyRestApi restApi = null;
        try {
            restApi = new RallyRestApi(new URI(host), apiKey);
            restApi.setApplicationName(applicationName);

            QueryRequest request = new QueryRequest("TestCase");
            request.setWorkspace(workspaceRef);
//            request.setProject(dragonTamers);
            request.setFetch(new Fetch("ID", "CreationDate", "Name", "FormattedID", "Description", "Type", "Method", "WorkProduct"));
            request.setLimit(50000);
            request.setScopedDown(true);
            request.setScopedUp(true);

            // Apply Filters Phase I
//            request.setQueryFilter(new QueryFilter("Name", "contains", "TC-"));

            // Apply Filters Phase II: (Creation Date < 01/01/2024) AND (c_DeactivateTest = true)
            QueryFilter dateFilter = new QueryFilter("CreationDate", "<", "2024-01-01T00:00:00.000Z");
            QueryFilter deactivateFilter = new QueryFilter("c_DeactivateTest", "=", "false");
            QueryFilter lastRunFilter = new QueryFilter("LastRun", "=", "null");



            request.setQueryFilter(dateFilter.and(deactivateFilter).and(lastRunFilter));


            try (FileWriter fw = new FileWriter("results/RallyBackup.txt", true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter pw = new PrintWriter(bw)) {
                pw.println("Project~FormattedID~Name~Steps");
                pw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Project project : projects) {
                request.setProject(project.ref);

                QueryResponse response = restApi.query(request);
                System.out.println("Successful: " + response.wasSuccessful());
                System.out.println("Results Size: " + response.getResults().size());

//                try (FileWriter fw = new FileWriter("results/RallyBackup.txt", true);
//                     BufferedWriter bw = new BufferedWriter(fw);
//                     PrintWriter pw = new PrintWriter(bw)) {
//                    pw.println("\n" + "------------------------------------------------------------------\n" + project.name + "\n------------------------------------------------------------------");
//                    pw.flush();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }

                for (int i = 0; i < response.getResults().size(); i++) {
                    JsonObject tcJsonObject = response.getResults().get(i).getAsJsonObject();
                    String testCaseRef = tcJsonObject.get("_ref").getAsString();
                    String testCaseName = tcJsonObject.get("Name").getAsString();
                    String formattedID = tcJsonObject.get("FormattedID").getAsString();
                    String creationDate = tcJsonObject.get("CreationDate").getAsString();
                    String description = tcJsonObject.has("Description") ? tcJsonObject.get("Description").getAsString() : "N/A";
                    String type = tcJsonObject.has("Type") ? tcJsonObject.get("Type").getAsString() : "N/A";
                    String method = tcJsonObject.has("Method") ? tcJsonObject.get("Method").getAsString() : "N/A";
                    String workProductRef = "N/A";
                    String workProductUUID = "N/A";

                    if (tcJsonObject.has("WorkProduct") && !tcJsonObject.get("WorkProduct").isJsonNull()) {
                        JsonObject workProduct = tcJsonObject.get("WorkProduct").getAsJsonObject();
                        if (workProduct.has("_ref")) {
                            workProductRef = workProduct.get("_ref").getAsString();
                        }
                        if (workProduct.has("_refObjectUUID")) {
                            workProductUUID = workProduct.get("_refObjectUUID").getAsString();
                        }
                    }

                    // Fetch the number of steps for the test case
                    int stepCount = getTestStepCount(restApi, testCaseRef);

                    System.out.println("CreationDate: " + creationDate + "Name: " + testCaseName + " | FormattedID: " + formattedID + " | Steps: " + stepCount);

                    // Save results to file
                    String file = "results/RallyBackup.txt";
                    String text = project.name + "~" + formattedID + "~" + testCaseName + "~" + stepCount;
//                    String text = "FormattedID: " + formattedID + " | Name: " + testCaseName  + " | Steps: " + stepCount;
//                        " | Description: " + description + " | Type: " + type + " | Method: " + method +
//                        " | WorkProductRef: " + workProductRef + " | WorkProductRefUUID: " + workProductUUID;

                    // ✅ UPDATE TEST CASE ONLY IF STEP COUNT IS < 1 -- temp ignoring stepCounts
                    if (stepCount > -1) {
                        try (FileWriter fw = new FileWriter(file, true);
                             BufferedWriter bw = new BufferedWriter(fw);
                             PrintWriter pw = new PrintWriter(bw)) {
                            pw.println(text.replaceAll("[\\r\\n]+", " "));
                            pw.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        // ✅ Now update the test case
                        deactivateTestCase(restApi, testCaseRef);
                    }
                }
            }


        } finally {
            if (restApi != null) {
                restApi.close();
            }
        }
    }

    /**
     * Fetches the number of steps for a given Test Case.
     */
    private static int getTestStepCount(RallyRestApi restApi, String testCaseRef) {
        try {
            QueryRequest testStepRequest = new QueryRequest("TestCaseStep");
            testStepRequest.setFetch(new Fetch("StepIndex"));
            testStepRequest.setQueryFilter(new QueryFilter("TestCase", "=", testCaseRef));

            QueryResponse stepResponse = restApi.query(testStepRequest);
            return stepResponse.getTotalResultCount(); // This returns the count of steps
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Return 0 if an error occurs
        }
    }

    /**
     * Updates the test case by setting `c_DeactivateTest = false`
     */
    private static void deactivateTestCase(RallyRestApi restApi, String testCaseRef) {
        try {
            JsonObject updateTestCase = new JsonObject();
            updateTestCase.addProperty("c_DeactivateTest", true); // Deactivate Test Case

            UpdateRequest updateRequest = new UpdateRequest(testCaseRef, updateTestCase);
            UpdateResponse updateResponse = restApi.update(updateRequest);

            if (updateResponse.wasSuccessful()) {
                System.out.println("✅ Successfully Deactivated: " + testCaseRef);
            } else {
                System.out.println("❌ Failed to deactivate test case: " + updateResponse.getErrors());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Project {
    String name;
    String ref;

    Project(String name, String ref) {
        this.name = name;
        this.ref = ref;
    }
}
