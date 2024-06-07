package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromProperty(String sheetname, int row, int column) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestscriptData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();

		// how to fetch boolean data

	}

//how to fetch boolean data

	public boolean getDataFromProperty1(String sheetname, int row, int column) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestscriptData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
        return workbook.getSheet(sheetname).getRow(row).getCell(column).getBooleanCellValue();

	}



//how to fetch numeric data


public double getDataFromProperty2(String sheetname, int row, int column) throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestscriptData.xlsx");

	Workbook workbook = WorkbookFactory.create(fis);
    return workbook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();

}

//date


public Date getDataFromProperty3(String sheetname, int row, int column) throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestscriptData.xlsx");

	Workbook workbook = WorkbookFactory.create(fis);
    return workbook.getSheet(sheetname).getRow(row).getCell(column).getDateCellValue();

}

//localdatetime

public LocalDateTime getDataFromExcel(String sheetname, int row, int column) throws IOException {
FileInputStream fis = new FileInputStream("./src/test/resources/TestscriptData.xlsx");
Workbook workbook = WorkbookFactory.create(fis);
return workbook.getSheet(sheetname).getRow(row).getCell(column).getLocalDateTimeCellValue();





}
}














