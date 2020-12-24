package trendyol.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/html_reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue="src/trendyol/stepdefinitions",
        dryRun = true,
        tags = "@Wip"

)
public class CukesRunner {

}
