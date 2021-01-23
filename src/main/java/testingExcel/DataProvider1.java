package testingExcel;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

	@DataProvider(name = "excel1") 
	public static Object[][] getData() {
		
		return ExcelFile.getData("TC002");
		
	}

}
