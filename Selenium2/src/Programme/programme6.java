// DATA DRIVEN TESTING 
// HOW TO READ THE DATA FROM EXCL FILE
package Programme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme6 
{
  public static void main(String[] args) throws Throwable 
  {
	
	  File f= new File("D:\\java\\Exl file\\Book1.xlsx");
	  FileInputStream fis = new FileInputStream(f);
	  Workbook wb=WorkbookFactory.create(fis);
	  Sheet sh=wb.getSheet("Sheet1");
	  Row r=sh.getRow(1);
	  String usname=r.getCell(0).getStringCellValue();
	  
	System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    
    driver.findElement(By.id("email")).sendKeys(usname);
    //driver.findElement(By.id("pass")).sendKeys(pass,Keys.ENTER);
    Thread.sleep(3000);
    //driver.close();
    
  }
}
