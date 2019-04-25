// HOW TO WRITE DATA TO EXCEL FILE
package Programme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class programme8 
{
  public static void main(String[] args) throws Throwable 
  {
	File src = new File("D:\\java\\Exl file\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(src);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh= wb.getSheet("Sheet1");
	Row r= sh.createRow(2);
	r.createCell(1).setCellValue("deepanshujain2604@gmail.com");
	
	FileOutputStream fio = new FileOutputStream(src);
	wb.write(fio);
	wb.close();
	System.out.println("Done");
  }
}
