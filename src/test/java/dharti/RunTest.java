package dharti;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
            //    features="src/test/resources/dharti",
                plugin = {"pretty", "html:target/cucumber-html-report"},
                tags = {"@swara"}
)
public class RunTest {

}
