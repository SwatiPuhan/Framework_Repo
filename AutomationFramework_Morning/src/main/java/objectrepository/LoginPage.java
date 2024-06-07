package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//initialization inside the constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement pwdTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	//getters

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	

}
