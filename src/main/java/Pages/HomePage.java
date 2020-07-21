package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class HomePage extends TestBase {
	
	//Declaration
	@FindBy (xpath = "//span[text()='Calendar']") WebElement calendar ;
	@FindBy (xpath = "//span[text()='Contacts']") WebElement contacts ;
	@FindBy (xpath = "//span[text()='Home']") WebElement home ;
	
	//Initializing Page Object 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickCalendar() {
		calendar.click();
	}
	public void clickContacts() {
		contacts.click();
	}
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public void clickHome() {
		home.click();
	}
	public void verifyCalendar() {
		calendar.isDisplayed();
	}
	public void verifyContacts() {
		contacts.isDisplayed();
	}

}
