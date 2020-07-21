package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class LoginPage extends TestBase {
	
	//Declaration
	@FindBy (xpath = "//input[@name='email']") WebElement username ;
	@FindBy (xpath = "//input[@name='password']") WebElement password ;
	@FindBy (xpath = "//div[text()='Login']") WebElement loginButton ;
	
	//Initializing Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUserName(String un) {
		username.sendKeys(un);
	}
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
}
