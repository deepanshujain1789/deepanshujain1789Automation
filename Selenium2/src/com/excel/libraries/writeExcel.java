package com.excel.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class writeExcel 
{
 Workbook wrkbk;
 Sheet sheet1;
 File path;
 FileInputStream inp;
 FileOutputStream opt;
 public writeExcel(String src) throws Throwable 
 {
   path = new File(src);
   inp = new FileInputStream(path);
   wrkbk = WorkbookFactory.create(inp);  
 }
 public void writeInNewRow(String sheetname,int row,int col,String data) throws Throwable
 {
	 sheet1=wrkbk.getSheet(sheetname);
	 Row r=sheet1.createRow(row);
	 r.createCell(col).setCellValue(data);
	 opt= new FileOutputStream(path);
	 wrkbk.write(opt);
	 wrkbk.close();
	 
 }
 public void writeInExistingRow(String sheetname,int row,int col,String data) throws Throwable
 {
	 sheet1 = wrkbk.getSheet(sheetname);
	 Row r=sheet1.getRow(row);
	 r.createCell(col).setCellValue(data);
	 opt= new FileOutputStream(path);
	 wrkbk.write(opt);
	 wrkbk.close();
	 
 }
}
