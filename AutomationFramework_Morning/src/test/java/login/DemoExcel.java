package login;

import java.io.IOException;
import java.time.LocalDateTime;

import genericutility.ExcelUtility;

public class DemoExcel
{
	public void test() throws IOException
	{
		ExcelUtility elib=new ExcelUtility();
		LocalDateTime date=elib.getDataFromExcel("Register", 2, 0);
		System.out.println(date);

}


		
	}


