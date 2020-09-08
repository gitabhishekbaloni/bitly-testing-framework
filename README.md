#bitly-testing-framework
This is repository for bitly service api's

###Pre-requisites for test framework:

* Git setup and access to repository
* Java 8:  for more info follow https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html
* IntelliJ IDEA
* Maven installed:for more info follow https://maven.apache.org/install.html

Used IntelliJ Plugins
*Lombok
*Cucumber for Java


###Running Tests:

1) Maven:

 a) Build first:

 mvn clean install -DskipTests=true
This will build the project and skip the test run

NOTE: If you want to run all the tests in a single go you can use "mvn clean install"
Once built, below command can be used to run any combination of tags

NOTE: To create new data models for new version of service you can see "open-api-model-generator/pom.xml"
set true/false flag under configuration

NOTE: As for dependency management we are using spring boot framework all properties are made available in
~\bitly-testing-framework\testing\src\test\resources\application.properties
 
b) Running with tags or feature file

`mvn test -Dcucumber.options="--tags '@positive'"`
Please refer https://cucumber.io/docs/cucumber/api/ to understand more on cucumber and tagging

`mvn test -Dcucumber.options="<feature file relative path>"`

2) Running test using Intellij IDEA users:
a) Right click on scenario in feature file and run test. It will create cucumber-java configuration to be used anytime
 in future.
Note: In the new run/debug configuration created , the glue named `cucumber.api.spring` should be replaced with
    `com.foreach.cuke`. Please refer for understanding https://stackoverflow.com/questions/47404113/unable-to-run-cucumber-features-directly-through-intellij-run-configuration

b) Test can also be run from runner ~\testing\src\com\bitly\bdd\runner\CucumberRunner.java

Note: Please define your tags for test runs

3) We can add and modify any model values using. This will create object instance as per our requirement.
modelFmily: Is the version of models from Open Api specifications
modelClassName: Is the model class name

check this for reference: features/bitlinks/positive.feature 
    Given I have model data
      | alias        | modelFamily          | modelClassName             | jsonModelAction | jsonPath   | value               | jsonFieldTYpe |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.domain   | <domain_value>      | STRING        |
      | bitlyPayload | <modelFamilyVersion> | <modelClassNameForVersion> | MODIFY          | $.long_url | <long_required_url> | STRING        |
 

###Reports Tests:

Test report is generated under ~\testing\target\cucumber\index.html

### CI/CD support
Github Action is being utilised to build and generate report with push action triggered from the user on master branch.
Path: .github/workflows/actionFile.yml

Status of different build:
https://github.com/gitabhishekbaloni/bitly-testing-framework/actions

The html report can then be downloaded and seen (under /runs of above links)

### Future planned release
1) Parallel execution of tests
2) Integration with Docker
3) Coverage of more test scenarios



