package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Login.feature",
				//features=".//features/Login.feature",
		glue="stepDefinations",
		dryRun=false,
		monochrome =true)

public class TestRunner {

}
