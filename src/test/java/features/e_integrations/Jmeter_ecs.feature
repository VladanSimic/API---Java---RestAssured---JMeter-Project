@Vladan123
Feature: JMeter performance testing with ECS health validation

  Scenario Outline: Run JMeter test and validate ECS health
    When I run JMeter load test "Predictive Analytics QA"
    # Then I expect "container-us-1" status to be "healthy"

#    And AWS ECS is configured with cluster "<clusterName>", service "<serviceName>", and region "<region>"
#
#    When I run the JMeter test with <threads> threads, ramp-up <rampUp> seconds, and duration <duration> seconds
#    Then ECS tasks should be healthy within <timeout> seconds
#    And ECS deployment should be successful

    Examples:
      | jmeterPath                                    | jmxPath                                           | resultPath                                      | clusterName                   | serviceName                                | region     | threads  | rampUp  | duration  | timeout  |
      | src/test/resources/jmeter/jmeter.properties   | src/test/resources/jmeter/JMeterScenario.jmx      | src/test/resources/jmeter/results/results.jtl   | pure-dragon-policy-cluster-1  | ecs-service-drg-analytics-api-app-ct-1     | us-east-1  | 500      | 10      | 60        | 120      |





# REST ASSURED
#
#Feature: JMeter and AWS ECS integration
#
#  Scenario: Validate ECS health and JMeter error rate
#    Given AWS ECS service "myService" in cluster "myCluster" is checked
#    Then service should be healthy
#    When check deployments for errors in service "myService" in cluster "myCluster"
#    Then there should be no deployment errors
#    Then summary report error rate should be between 5 and 10 percent
#









