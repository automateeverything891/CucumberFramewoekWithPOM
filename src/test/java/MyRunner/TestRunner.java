package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\Selenium\\CucumberFramework\\src\\main\\java\\Feature"}
		,glue= {"StepDefinition"},
				monochrome = true,
				plugin = {"pretty", "html:test-output","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber", "json:test-output/cucumber.json", "junit: test-output/junit_xml/cucumber.xml"}, 
				strict = true,
				dryRun = false
//				,tags = {"@First , @Second , @Third"}
				)
      
public class TestRunner {

}














//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = {"D:\\Selenium\\CucumberBDD\\src\\main\\java\\Feature"}// path of the feature file
//		,glue= {"StepDefinition"},// path of the step definition file
//				monochrome = true, // to display the console output in a proper readable format
//				plugin = {"pretty", "html:test-output", "json:target/cucumber.json", "junit: junit_xml/cucumber.xml"}, 
//				          // to generate different type of reports
//				strict = true, // it will check if any step is not defined in step definition file
//				dryRun = false, //to check the mapping is proper between feature file and step definition file
//				tags = {"@SmokeTest , @End2End , @RegressionTest"}
//		// OR: tags = {"@SmokeTest , @RegressionTest"} execute all Test tags as @SmokeTest OR @RegressionTest
//		// AND: tags = {"@SmokeTest" , "@RegressionTest"} execute all Test tags as @SmokeTest AND @RegressionTest
//		//if you don't want to execute SmokeTest test cases --- tags = {"~@SmokeTest", "@RegressionTest", "End2End"}
//		)
//      
//public class TestRunner {
//
//}