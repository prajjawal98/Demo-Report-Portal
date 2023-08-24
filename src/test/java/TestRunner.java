
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"},
        features = {"/home/knoldus/Documents/Demo-Report-Portal/src/test/resources/test.feature"}
)
public class TestRunner {




}
