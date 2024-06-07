package login;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericutility.ExcelUtility;
import genericutility.FileUtility;

public class DemoFile 
{
	@Test
	public void test() throws IOException {
//		FileUtility flibrary=new FileUtility();
//		String Url=flibrary.getDataFromProperty("url");
//		
//		System.out.println(Url);
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get(Url);
//		WebElement element=driver.findElement(By.id(""));
//	}
		
		ExcelUtility elib=new ExcelUtility();
		LocalDateTime date=elib.getDataFromExcel("Register", 2, 0);
		System.out.println(date);

}
}
