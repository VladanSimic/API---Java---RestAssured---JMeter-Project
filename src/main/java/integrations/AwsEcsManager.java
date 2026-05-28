package integrations;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ecs.EcsClient;
import software.amazon.awssdk.services.ecs.model.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
public class AwsEcsManager {
    private static final Logger LOGGER = Logger.getLogger(AwsEcsManager.class.getName());
    private final String clusterName;    private final String serviceName;    private final Region region;
    private final EcsClient ecsClient;
    public AwsEcsManager(String clusterName, String serviceName, Region region) {
        this.clusterName = clusterName;
        this.serviceName = serviceName;
        this.region = region;
        this.ecsClient = EcsClient.builder().region(region).build();}
    public boolean checkHealth() {
        ListTasksResponse tasks = ecsClient.listTasks(ListTasksRequest.builder()
                .cluster(clusterName)
                .serviceName(serviceName)
                .build());
        if (tasks.taskArns().isEmpty()) {
            LOGGER.warning("No running ECS tasks found.");
            return false;}
        DescribeTasksResponse desc = ecsClient.describeTasks(DescribeTasksRequest.builder()
                .cluster(clusterName)
                .tasks(tasks.taskArns())
                .build());
        return desc.tasks().stream().allMatch(t ->
                t.healthStatus() != null && t.healthStatus().toString().equalsIgnoreCase("HEALTHY"));}
    public boolean checkDeploymentStatus() {
        DescribeServicesResponse desc = ecsClient.describeServices(DescribeServicesRequest.builder()
                .cluster(clusterName)
                .services(serviceName)
                .build());
        return desc.services().stream()
                .flatMap(s -> s.deployments().stream())
                .noneMatch(d -> "FAILED".equalsIgnoreCase(d.rolloutStateAsString()));}
    public boolean waitForHealthyTasks(int timeoutSeconds) throws InterruptedException {
        LOGGER.info("Waiting for ECS tasks to become healthy...");
        int attempts = timeoutSeconds / 10;
        for (int i = 0; i < attempts; i++) {
            if (checkHealth()) {
                LOGGER.info("ECS tasks are healthy.");
                return true;}
            TimeUnit.SECONDS.sleep(10);}
        LOGGER.warning("ECS did not reach healthy state within timeout.");
        return false;}
    public void close() {
        ecsClient.close();}}








