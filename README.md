# Java-Cucumber-Maven
This is a simple skeleton project using cucumber-java-Maven, there is a feature file, with a 
basic test to login and add a product to cart on amazon.

Project uses a page object approach , and a global property file to pass external data needed for tests to run.

Use Maven to run tests:
Open a terminal window and run:

`mvn test`

Override option - Browser type is passed using system parameter:

`mvn test -Dbrowser=chrome`

default browser is chrome , when no parameter is passed. Firefox is also supported. 
Other browsers can easily be added to the framework , using Driver class:
`src/test/java/Helpers/Driver.java`

# Reporting

Extent reports were integrated in this framework, reports are automatically generated at the end of test execution,
location : `test-output`