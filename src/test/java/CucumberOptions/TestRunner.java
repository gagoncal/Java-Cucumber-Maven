package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "src/test/java/features",
        glue = "Steps",
        plugin = {"pretty","html:target/cucumber-reports/html","json:target/cucumber-reports/cucumber-report.json",
        "junit:target/cucumber-reports//report.xml"}

)
public class TestRunner {
}
