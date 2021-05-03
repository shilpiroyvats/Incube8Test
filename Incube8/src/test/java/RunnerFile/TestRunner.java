package RunnerFile;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions
	(plugin = {"pretty", "html:target/cucumber-reports"} ,
	features={"src/test/java/FeatureFiles"},
	glue={"com.stepDefinitions"},
	monochrome = true)						
public class TestRunner 				
{		

}