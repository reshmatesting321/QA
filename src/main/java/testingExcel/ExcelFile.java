package testingExcel;

import java.io.File;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile extends ExcelMultipleRowsReading {

	public static String[][] getData(String sheetName) {
		String[][] data = null;

		try {
			//File fis = new File(sheetName);
			File fis=new File("./data/"+sheetName+".xlsx"); 
			XSSFWorkbook workbook = new XSSFWorkbook(fis);		
			XSSFSheet sheet = workbook.getSheetAt(0);	
			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();			
			data = new String[rowCount][columnCount];
		
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ 
						try {
							String cellValue = "";					
							try{
								
								if(row.getCell(j).getCellTypeEnum()==CellType.STRING){					
									cellValue = row.getCell(j).getStringCellValue();
								}else if(row.getCell(j).getCellTypeEnum()==CellType.NUMERIC){
									cellValue = ""+(int)row.getCell(j).getNumericCellValue();					
								}else if(row.getCell(j).getCellTypeEnum()==CellType.BLANK){ 
									cellValue = "";
								}
							}catch(NullPointerException e){ 

							}

							data[i-1][j]  = cellValue; 
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
