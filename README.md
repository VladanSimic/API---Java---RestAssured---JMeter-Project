# API Java RestAssured JMeter Project

This repository represents a QA automation portfolio project built with Java, REST Assured, JMeter, Maven, and TestNG.

The main purpose of this project is to demonstrate practical QA engineering skills through API test automation, performance testing, structured test execution, reusable test design, and clear reporting.

## Project Overview

This project combines two important areas of modern QA work:

API test automation using REST Assured

Performance and load testing using Apache JMeter

The repository is structured to show how automated API checks and performance test assets can be organized inside one Java-based QA project.

It is intended as a portfolio project for demonstrating real-world QA automation knowledge, test organization, technical understanding, and the ability to work with different testing layers.

## Technologies Used

Java

REST Assured

Apache JMeter

TestNG

Maven

XML test suites

Git and GitHub

Basic reporting structure

## What This Project Demonstrates

This project demonstrates the following QA skills:

API test automation using Java and REST Assured

HTTP request and response validation

Status code validation

Response body validation

Test execution through Maven and TestNG

Organizing automated tests into logical suites

Working with XML configuration files

Using JMeter assets for performance and load testing

Structuring a QA automation project in a clean and maintainable way

Preparing a project for version control and public portfolio presentation

## Repository Structure

src

Contains the main Java test code and supporting test classes.

xmls

Contains XML suite files used for organizing and executing different test scenarios.

buildspecs

Contains build-related configuration files.

tools

Contains helper files or supporting utilities used by the project.

pom.xml

Maven configuration file with project dependencies and build setup.

README.md

Project documentation and overview.

.gitignore

Defines files and folders that should not be pushed to GitHub, such as generated reports, build output, logs, and local IDE files.

## Key QA Focus Areas

API Testing

The API testing part of the project focuses on validating backend behavior through automated checks. It demonstrates how REST Assured can be used to send requests, validate responses, and confirm that API behavior matches expected results.

Performance Testing

The JMeter-related part of the project demonstrates how performance test assets can be included and organized inside a QA automation repository. This is useful for load testing, smoke performance checks, and technical validation of system behavior under different execution conditions.

Test Organization

The project uses Maven, TestNG, and XML suite files to keep test execution structured and easier to manage. This makes it easier to run different groups of tests depending on the testing goal.

## How to Run the Project

Clone the repository:

```bash
git clone https://github.com/VladanSimic/API---Java---RestAssured---JMeter-Project.git
```

Open the project folder:

```bash
cd API---Java---RestAssured---JMeter-Project
```

Run tests with Maven:

```bash
mvn clean test
```

If a specific TestNG XML suite is configured, tests can also be executed through the appropriate XML file from the `xmls` folder.

## Why This Project Is Useful

This project shows a practical QA automation approach where API testing and performance testing are not treated as isolated activities, but as complementary parts of the same quality process.

It demonstrates that QA work is not only about finding defects, but also about:

understanding system behavior

validating business and technical requirements

creating repeatable automated checks

analyzing failures

improving test coverage

supporting more reliable releases

## My QA Approach

My approach to QA is structured, analytical, and detail-oriented.

I focus on understanding the full system behavior, asking the right questions, identifying risks early, and creating clear test coverage. I believe that good QA should help prevent issues, not only detect them after development is finished.

This project reflects my interest in technical QA, API testing, automation, performance testing, and continuous improvement of software quality.

## Future Improvements

Possible future improvements for this project include:

adding more API test scenarios

improving reporting

adding clearer test data separation

adding environment-based configuration

adding CI execution through GitHub Actions or another CI/CD tool

expanding JMeter performance test coverage

adding more detailed execution examples

## Author

Vladan Simic

QA Engineer / Software Tester

GitHub: https://github.com/VladanSimic
