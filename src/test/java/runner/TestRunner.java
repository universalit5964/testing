package runner;

import io.cucumber.java.es.Cuando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/bbc.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/cucumber-report.html"},
        monochrome = true,
       dryRun = true
)


public class TestRunner {
}
