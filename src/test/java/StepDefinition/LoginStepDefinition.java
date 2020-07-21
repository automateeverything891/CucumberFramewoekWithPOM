package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import Constants.VariableConstants;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.TestBase;
import Utilities.XLUtils;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^navigate to Login page$")
	public void navigate_to_Login_page(){
		TestBase.initialization();
	    }
		
		@When("^user is in login page$")
		public void user_is_in_login_page() throws IOException {
			loginPage = new LoginPage();
			System.out.println(loginPage.validateLoginPageTitle());
			String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 1, 2);
			Assert.assertEquals(pageTitle, loginPage.validateLoginPageTitle());
		}
		
		@Then("^user logins using valid credentials$")
		public void user_logins_using_valid_credentials() {
			loginPage.setUserName(userName);
			loginPage.setPassword(password);
			loginPage.clickLoginButton();
		}
		
		@And ("^home page should be displayed$") 
		public void home_page_should_be_displayed() throws IOException {
			homePage = new HomePage();
			System.out.println(homePage.validateHomePageTitle());
			String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 2, 2);
			Assert.assertEquals(pageTitle, homePage.validateHomePageTitle());
		}
}
