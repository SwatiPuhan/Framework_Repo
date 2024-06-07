package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//initialize
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); //initialization
	}
	//declaration
	
	@FindBy(linkText = "Log in") //declaration
	private WebElement loginLink;
	
	//this is private so for that we are using getters 
	
	public WebElement getLoginLink()
	{
		return loginLink;
	}

}