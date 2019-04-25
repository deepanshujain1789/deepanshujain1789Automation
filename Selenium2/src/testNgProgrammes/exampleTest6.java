// HOW TO USE DATA PROVIDER ANNOTATION
package testNgProgrammes;

import java.io.File;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exampleTest6 
{
WebDriver driver;
@Test(dataProvider="credentials")
public void sample6Test(String username,String password)
{
	 System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys(username);
	 driver.findElement(By.id("pass")).sendKeys(password,Keys.ENTER);
	 
	 
}
@AfterMethod
void logout() throws Throwable
{
	Thread.sleep(5000);
	driver.close();
}
@DataProvider(name="credentials")
public Object[][] getdata()
{
	Object[][] data = new Object[3][2];
	data[0][0]="dj261995@gmail.com";
	data[0][1]="dj@16172526";
	
	data[1][0]="dj261995@gmail.com";
	data[1][1]="16172526";
	
	data[2][0]="dj261995@gmail.com";
	data[2][1]="mp09mh1789";
	return data;
	 
}
}

