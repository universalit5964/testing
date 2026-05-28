package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/posts.feature",
        glue = {"stepDefinitions","hooks"},
        plugin ={"pretty", "html:target/HtmlReports/report.html"},tags = "@SmokeTest",
        monochrome = true,
        dryRun = false
)
public class PostRunner {
}
