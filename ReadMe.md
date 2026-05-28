# PURE Automation Tool
PAT is a Test Automation Framework based on Java programming language. It is a Maven project following a Page/Component Object Model. PAT utilizes Selenium, Cucumber, TestNG and Allure libraries to achieve test automation and reporting using both BDD and TDD approaches.

### Prerequisites
- Java JDK 8 - [Download](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)
- Maven binaries - [Download](https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.zip)
- Allure binaries - [Download](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.13.8/allure-commandline-2.13.8.zip)
  
The project can be opened in IntelliJ IDEA or any other Java IDE
- IntelliJ IDEA - [Download](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)

### Executing Tests
The tests can be either executed by selecting one of the existing TestNG configurations from "Select Run/Debug Configuration" dropdown in IntelliJ IDEA

Example Configurations
- Smoke
    - Smoke DEV
    - Smoke DEV AWS
    - Smoke QA
    - Smoke STG
    - Smoke PROD
- Base Regression
    - Regression QA
    - Regression STG
    
Or by running maven commands from the terminal
- To run existing xml configuration
  
    ```mvn clean test -Dsurefire.suiteXmlFiles=XMLPathHere```
  
    ```Example command: mvn clean test -Dsurefire.suiteXmlFiles=.\xmls\jenkins\NB_EX.xml```


- To run existing xml cofiguration with parameters
    ```mvn clean test -Dsurefire.suiteXmlFiles=.\xmls\jenkins\NB_EX.xml -DthreadCount=${THREADS} -Denv="$ENV" -DwaitTime="$WAIT_TIME" -Dbrowser="$BROWSER" -Dquit="$QUIT" -Dscreenshots="$SCREENSHOTS" -DpageActions="$PAGE_ACTIONS_LOGGING"```
  
### Results Test

Tests results are generated inside the results folder and can be opened in allure using the ```allure serve``` command from environments/prod/results path. 
The url for accessing the reports will be printed to the terminal.

### Performance version
Selenium 4.8.0
Webdriver 5.5.3
https://dl.google.com/linux/chrome/rpm/stable/x86_64/google-chrome-stable-126.0.6478.182-1.x86_64.rpm