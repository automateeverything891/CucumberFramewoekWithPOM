package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class CalendarPage extends TestBase{
	
	//Declaration
	@FindBy (xpath = "//button[text()='New']") WebElement newButton ;
	@FindBy (xpath = "//input[@name='title']") WebElement title ;
	@FindBy (xpath = "//div[@name='calendar']") WebElement calendarDropdown ;
	@FindBy (xpath = "//div[text()='Jakay M <josephkuruvilla891@gmail.com>']") WebElement selectCalendar ;
	@FindBy (xpath = "//button[text()='Save']") WebElement saveButton ;
	
	//Initializing Page Object
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickNewButton() {
		newButton.click();
	}
	public void setTitle(String eTitle) {
		title.sendKeys(eTitle);
	}
	public void clickCalendarDropdown() {
		calendarDropdown.click();
	}
	public void clickSelectCalendar() {
		selectCalendar.click();
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public String validateCalendarPageTitle() {
		return driver.getTitle();
	}
	public String validateCreateNewEventPageTitle() {
		return driver.getTitle();
	}

}
