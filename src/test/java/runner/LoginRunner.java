package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/loginwithexample.feature",
        glue = {"stepDefinitions","hooks"},
      // plugin = {"summary","html:target/cucumber-report.html"},
        plugin ={"pretty", "html:target/HtmlReports/report.html"},
       // plugin ={"pretty", "json:target/HtmlReports/report.json"},
       // plugin ={"pretty", "junit:target/report.xml"},
        dryRun = false
)

public class LoginRunner {
}
