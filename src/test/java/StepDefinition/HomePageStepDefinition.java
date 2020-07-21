package StepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import Pages.HomePage;
import Utilities.TestBase;
import Utilities.XLUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition extends TestBase {
	
	HomePage homePage;
	
	@Given("^navigate to Home page$")
	public void navigate_to_Home_page(){
		homePage = new HomePage();
		homePage.clickHome();
	    }
	
	@When("^user is in Home page$")
	public void user_is_in_Home_page() throws IOException{
		System.out.println(homePage.validateHomePageTitle());
		String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 2, 2);
		Assert.assertEquals(pageTitle, homePage.validateHomePageTitle());
	    }
	
	@Then("^user validates Home page Elements$") 
	public void user_validates_Home_page_Elements(){
		homePage.verifyCalendar();
		homePage.verifyContacts();
	    }

}
