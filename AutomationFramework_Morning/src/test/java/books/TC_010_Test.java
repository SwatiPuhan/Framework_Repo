package books;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.HomePage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import genericutility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_010_Test extends BaseClass {
	@Test
	public void ClickOnBooks() {
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		// Assert.fail();
		Reporter.log("Books page is displayed", true);
	}

}

//	
//	@Test
//	private void clickOnBooks() 
//	{
//		hp=new HomePage(driver);
//		hp.getBooksLink().click();
//		Reporter.log("Books page is displayed",true);
//	}
//}
