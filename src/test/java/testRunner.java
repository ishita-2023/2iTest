import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//To specify the options for test execution and  reporting
@CucumberOptions(features = "src/test/resources/NumberList.feature",
        glue = "step_definitions",
        plugin = { "pretty", "html:target/cucumber-reports" })

public class testRunner {
}