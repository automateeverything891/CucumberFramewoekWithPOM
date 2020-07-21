package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CalendarPage;
import Pages.ContactsPage;
import Pages.HomePage;
import Utilities.TestBase;
import Utilities.XLUtils;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarStepDefinition extends TestBase {

	HomePage homePage;
	CalendarPage calendarPage;
	
//	Defined in "Validate Home page"
//	@Given("^navigate to Home page$")
//	public void navigate_to_Home_page(){
//		homePage = new HomePage();
//		homePage.clickHome();
//	    }
	
//	Defined in "Validate Home page"
//	@When("^user is in Home page$")
//	public void user_is_in_Home_page(){
//		System.out.println(homePage.validateHomePageTitle());
//	String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 2, 2);
//	Assert.assertEquals(pageTitle, homePage.validateHomePageTitle());
//	    }
	
	@Then("^navigate to Calendar page$")
	public void navigate_to_Calendar_page(){
		homePage = new HomePage();
		homePage.clickCalendar();
	    }
	
	@Then("^validate Calendar page$") 
	public void validate_Calendar_page() throws IOException {
		calendarPage = new CalendarPage();
	    System.out.println(calendarPage.validateCalendarPageTitle());
		String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 3, 2);
		Assert.assertEquals(pageTitle, calendarPage.validateCalendarPageTitle());
	    
	    }

}
