// HOW TO USE LIBRARY FOR GETTING DATA FROM EXCEL SHEET
package com.excel.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel 
{
	Workbook wb;
	Sheet sh;
  public readExcel(String path)
  {
	  try {
		File f= new File(path);
		  FileInputStream fis = new FileInputStream(f);
		  wb=WorkbookFactory.create(fis);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	
  }
  public String getdata(String sheetname,int row,int col)
  {
	  Sheet sh=wb.getSheet(sheetname);
	  Row r=sh.getRow(row);
	  String data=r.getCell(col).getStringCellValue();
	  return data;
  }
}
