# Morsum
This is a sample web automated test application using Java, Maven, Cucumber, and Playwright. This application provides a framework for writing and executing automated tests for web applications using modern technologies.

## Necessary tools:
To use this application, you will need the following installed on your system:

- Java JDK 8 or higher
- Maven
- Git
- Playwright
- Cucumber;

## Getting Started
1. Clone the repository to your local machine using `git clone`.
2. Navigate to the cloned directory and open a terminal.
3. Install the dependencies using Maven by running `mvn clean install`.

## Folder Structure
```
.
├── src
   └── test
       └── java
       |   ├── pages
       |   │   ├── LoginPage.java
       |    │   └── HomePage.java
       |    ├── runner
       |    │   └── TestRunner.java
       |    └── stepDefinitions
       |        └── LoginSteps.java
       └── resources
            └── features
                └── login.feature


```
- `src/test/java/pages`: Contains the page objects or page classes, which encapsulate the interactions with the web pages.
- `src/test/java/runner`: Contains the Test Runner class,  which serves as the entry point for running Cucumber tests and specifies the
- `src/test/java/stepDefinitions`: Contains the step definition classes, which define the step implementations for the Cucumber tests.
- `src/test/resources/features`: Contains the feature files, which describe the behavior of the application in a human-readable format using Gherkin language.
