// DATA DRIVEN TESTING 
// READING THE DATA FROM PROPERTY FILE
package Programme;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme5 
{
  public static void main(String[] args) throws Throwable 
  {
	  FileReader fr = new FileReader("C:\\Users\\win 10\\eclipse-workspace\\Selenium2\\src\\propertyfiles\\test.properties");
	  Properties prop = new Properties();
	  prop.load(fr);
	  String URL = prop.getProperty("URL");
	  String Username = prop.getProperty("UNAME");
	  String Password = prop.getProperty("PASS");
	  
	  System.setProperty("webdriver.gecko.driver","./Geckodriver/geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get(URL);
	  driver.findElement(By.id("email")).sendKeys(Username);
	  Thread.sleep(3000);
	  driver.findElement(By.id("pass")).sendKeys(Password,Keys.ENTER);
	  Thread.sleep(3000);
	  driver.close();


  }
	
		  
}
