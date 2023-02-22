package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	String path="./Testdata/commondata.property";
	private String key;
	
	public String readDataFromPropertyFile (String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties p  = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	public RichTextString readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/Bank.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		RichTextString value = wb.getSheet(sheetname).getRow(row).getCell(cell).getRichStringCellValue();
		return value;
	}
}
