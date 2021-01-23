/*
 Daily Questions:
 ----------------
 1. Explain how page object framework works?
 Page Object Model Framework is used for easy maintenance and reusability of code.
In POM we have sepearte class for every page and in each test case we just need to call the 
class and it functions.

 2. Write a program to read the content of the cell from 2nd row of 3rd column in Sheet1?
 File fis = new File(sheetName);
			
			// Open the WorkBook 
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			// enter the Sheet
			XSSFSheet sheet = workbook.getSheetAt(0);	

			XSSFRow row = sheet.getRow(1);

			XSSFCell cell = row.getCell(2);
			String data = cell.getStringCellValue();
			
 Coding Challenge #24
 ---------------------
 Write a java program to print the longest positive sequence from the given input of number 
 and find the length of the sequence.
 EX: input= -1,2,-3,-4,5,6,7,-8,9,10
 Output :567
 Length is 3
 
 */
package week5DailyQuestions;

public class LongestPosiveDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={10,9,8,-7,6,5,4,2,-3,-2,1};
		int maxSequenceStartIndex = 0;
        int maxSequenceLength = 0;
        int currentSequenceStartIndex = 0;
        int currentSequenceLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if(currentSequenceLength > maxSequenceLength) {
                    maxSequenceLength = currentSequenceLength;
                    maxSequenceStartIndex = currentSequenceStartIndex;
                }
                currentSequenceStartIndex = i + 1;
                currentSequenceLength = 0;
            }
            else {
                currentSequenceLength++;
            }
        }

        if(currentSequenceLength > maxSequenceLength) {
            maxSequenceStartIndex = currentSequenceStartIndex;
            maxSequenceLength = currentSequenceLength;
        }
		for(int i=maxSequenceStartIndex;i<maxSequenceStartIndex+maxSequenceLength;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Length is "+maxSequenceLength);
	}

}
