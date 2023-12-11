package runnerfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:/Users/Shree/eclipse-workspace/MyProject/Features",
glue= {"stepdefinition"},
monochrome=true,
plugin= {"pretty","html:target/CucumberReports/Report.html"},
dryRun=false
)
public class TestRunner {

}
