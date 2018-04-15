package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 @RunWith(Cucumber.class)
 
 @CucumberOptions(features="feature",glue={"Stepdefinitions"},format={"pretty","html:test-output"})
 
public class TestRunner 

{

}
