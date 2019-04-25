package Programme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.libraries.readExcel;

public class programme7 
{
 public static void main(String[] args) throws Throwable
 {
	 readExcel excel = new readExcel("D:\\java\\Exl file\\Book1.xlsx");
	String uname=excel.getdata("Sheet1",1,0);
	String pass=excel.getdata("Sheet1",1,1);
	
	System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    
    driver.findElement(By.id("email")).sendKeys(uname);
    driver.findElement(By.id("pass")).sendKeys(pass,Keys.ENTER);
    Thread.sleep(3000);
    driver.close();
 }
}
