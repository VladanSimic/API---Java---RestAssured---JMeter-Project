package steps.api_integrations;
import integrations.AwsEcsManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import software.amazon.awssdk.services.ecs.EcsClient;
import software.amazon.awssdk.services.ecs.model.*;
import static org.mockito.Mockito.*;
public class AwsEcsManagerTest {
    @Test
    void testCheckHealthReturnsTrueWhenTasksHealthy() {
        EcsClient ecsClient = mock(EcsClient.class);
        // Mock listTasks response
        ListTasksResponse listTasksResponse = ListTasksResponse.builder()
                .taskArns("task-1")
                .build();
        when(ecsClient.listTasks(any(ListTasksRequest.class))).thenReturn(listTasksResponse);
        // Mock describeTasks response
        Task healthyTask = Task.builder()
                .taskArn("task-1")
                .healthStatus(HealthStatus.HEALTHY)
                .build();
        DescribeTasksResponse describeTasksResponse = DescribeTasksResponse.builder()
                .tasks(healthyTask)
                .build();
        when(ecsClient.describeTasks(any(DescribeTasksRequest.class))).thenReturn(describeTasksResponse);
        // Test logic
        AwsEcsManager manager = new AwsEcsManager("cluster", "service", software.amazon.awssdk.regions.Region.US_EAST_1) {
            @Override
            public boolean checkHealth() {
                return describeTasksResponse.tasks().stream()
                        .allMatch(t -> t.healthStatus() == HealthStatus.HEALTHY);
            }
        };
        //manager.checkHealth()
        boolean actual = manager.checkHealth();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }
}























