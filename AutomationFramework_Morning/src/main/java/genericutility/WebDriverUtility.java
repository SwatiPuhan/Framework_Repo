package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element);
	}
	public void scrollByAmout(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollByAmount(90, 89);
		
	}

	public void dragAndDrop(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element);

	}
	public WebDriver switchToFrame(WebDriver driver ,int index) 
	{
		return driver.switchTo().frame(index);
		
	}
	
	public WebDriver switchToFrame(WebDriver driver ,String nameorId ) //frame RT WD
	{
		return driver.switchTo().frame(nameorId);

}
}