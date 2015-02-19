package stag.martin.atlassian.trial.Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
//	This method is used to set the file path and to open the Excel file
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
//			Open the Excel file and access the test sheet
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw e;
		}
	}
	
//	This method is to read the test data from Excel cell, in this we are passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch(Exception e) {
			return "";
		}
	}
	
//	This method is to write in the Excel cell, Row num and Col num are the parameters
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);  
				Cell.setCellValue(Result);
			}
			else{
				Cell.setCellValue(Result);
			}
			
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch(Exception e) {
			throw e;
		}
	}
	
//	This method is to get the Row number contains the first parameter
	public static int getRowContains(String sTestCaseName, int colNum) throws Exception {
		int i;
		try {
			int rowCount = ExcelWSheet.getLastRowNum();
			for(i = 0; i < rowCount; i++) {
				if(ExcelUtils.getCellData(i, colNum) == sTestCaseName){
					break;
					}
			}
			return i;
		} catch (Exception e) {
			throw e;
		}
	}
	
//	This method is to delete the first row
	public static void deleteFirstRow() {
		Row = ExcelWSheet.getRow(0);
		ExcelWSheet.removeRow(Row);
	}
}






















