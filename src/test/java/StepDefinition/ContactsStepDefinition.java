package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.CalendarPage;
import Pages.ContactsPage;
import Pages.HomePage;
import Utilities.TestBase;
import Utilities.XLUtils;
import cucumber.api.java.en.Then;

public class ContactsStepDefinition extends TestBase {
	
	HomePage homePage;
	ContactsPage contactsPage;
	
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
	
	@Then("^navigate to Contacts page$")
	public void navigate_to_Contacts_page(){
		homePage = new HomePage();
		homePage.clickContacts();
	    }
	
	@Then("^validate Contacts page$")
	public void validate_Contacts_page() throws IOException {
		contactsPage = new ContactsPage();
	    System.out.println(contactsPage.validateContactsPageTitle());
		String pageTitle = XLUtils.getCellData(testDataFilePath, "Sheet1", 3, 2);
		Assert.assertEquals(pageTitle, contactsPage.validateContactsPageTitle());
		driver.close();
		
	    }

}
