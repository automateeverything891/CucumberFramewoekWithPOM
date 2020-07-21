package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class ContactsPage extends TestBase{
	
	//Declaration
	@FindBy (xpath = "//button[text()='New']") WebElement newButton ;
	@FindBy (xpath = "//input[@name='first_name']") WebElement firstName ;
	@FindBy (xpath = "//input[@name='last_name']") WebElement lastName ;
	@FindBy (xpath = "//button[text()='Save']") WebElement saveButton ;
	
	//Initializing Page Object
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickNewButton() {
		newButton.click();
	}
	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public String validateContactsPageTitle() {
		return driver.getTitle();
	}
	public String validateCreateNewContactPageTitle() {
		return driver.getTitle();
	}

}
