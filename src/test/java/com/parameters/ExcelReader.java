package com.parameters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	FileInputStream FRead;

	FileOutputStream FWrite;
	
	String usValue;
	
	String pwdValue;
	
	String username;
	
	String password;
	
	int rowcount,rowval;
	
	 private Map<String, String> map = new HashMap<>();
	 private XSSFWorkbook wb;
	 private XSSFSheet sh;

	
	public void beforeTest() throws Exception, Exception {
	/*File*/ FRead=new FileInputStream("src/test/resources/Exceldata/orange_hrm.xlsx");

	/*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);

	/*XSSFSheet*/ sh= wb.getSheet("login_hrm");
	
	}
	
	public void dataMap() {
		
		 String usColumn = sh.getRow(0).getCell(0).getStringCellValue();
	     String pwdColumn = sh.getRow(0).getCell(1).getStringCellValue();

	        int rowcount = sh.getPhysicalNumberOfRows();
	        for (int rowval = 1; rowval < rowcount; rowval++) {
	            String usValue = sh.getRow(rowval).getCell(0).getStringCellValue();
	            String pwdValue = sh.getRow(rowval).getCell(1).getStringCellValue();
	            String exptdMsg= sh.getRow(rowval).getCell(2).getStringCellValue();
	            map.put(usColumn + rowval, usValue);
	            map.put(pwdColumn + rowval, pwdValue);
	        }

	}
	public Map<String, String> getDataMap() {
        return map;
    }
	
	public void writeData() {
	
	}


}