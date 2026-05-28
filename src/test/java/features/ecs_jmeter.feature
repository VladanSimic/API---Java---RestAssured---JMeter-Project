Feature: ECS + JMeter basic smoke

  @smoke
  Scenario Outline: Run JMeter test with given test names, environments, and threads
    When I run JMeter test "<testName>" on "<env>" with <threads> threads, ramp-up <rampUp> seconds with duration <duration> seconds and same user <sameUser> and on error "<onErrorAction>"
    Then ECS health status should be healthy

    Examples:
      | testName    | env | threads | rampUp | duration | sameUser | onErrorAction |
      | SmokeTest   | QA  | 2       | 10     | 15       | true     | continue      |
      | Regression01| STG | 4       | 20     | 5        | false    | stoptest      |
      | LoadTest10  | QA  | 6       | 30     | 25       | true     | continue      |






































