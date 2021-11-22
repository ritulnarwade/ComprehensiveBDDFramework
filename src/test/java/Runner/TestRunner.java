package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue = {"Stepdefinations"},
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
