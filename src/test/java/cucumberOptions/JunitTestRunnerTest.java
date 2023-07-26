package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features", 
    glue = "Stepdefinations",
    tags = "@Login or @customer or @ticket or @Reports or @KB or @Settings",
    dryRun= true,
    monochrome = true,
    plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		"rerun:target/failed_scenarios.txt"},
    publish = true
)

public class JunitTestRunnerTest {

}
