package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json" },
		features = {".//Feature/"},
		glue = {"smarttech.ny.stepdefinations", "smarttech.ny.hooks"}
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests {


	
}
