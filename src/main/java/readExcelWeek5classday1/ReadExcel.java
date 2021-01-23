package readExcelWeek5classday1;
import java.io.File;

import java.io.IOException;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import wrappers.LeafTapsWrapperWeek5classday1;
//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
public class ReadExcel extends LeafTapsWrapperWeek5classday1{
public String[][] readExcel(String dataSheet) throws InvalidFormatException, IOException{
//Open the file
	File fis=new File("./data/"+dataSheet+".xlsx");
	//Open the WorkBook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//GetSheet
	XSSFSheet sheet=wb.getSheetAt(0);
	//RowCount and Column Count
	int rowCount=sheet.getLastRowNum();
	int columnCount=sheet.getRow(0).getLastCellNum();
	//Build array of row and col count
	String[][] data = new String[rowCount][columnCount];
	System.out.println(rowCount);
	System.out.println(columnCount);
	//for Row
	for (int i = 1; i <= rowCount ; i++) {
		XSSFRow row=sheet.getRow(i);
		//for Column
		for (int j = 0; j < columnCount; j++) {
			XSSFCell cell=row.getCell(j);
			//Print the string value
			data[i-1][j]=cell.getStringCellValue();
		}
	}
	return data;
}
	public static void main(String[] args) {
	}
}
