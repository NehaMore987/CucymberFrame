package cucumberoption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue="StepDefinition",
monochrome=true,dryRun=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{	

}
