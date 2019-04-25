package testNgProgrammes;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.configReaders;
import com.actitime.genericlib.launchBrowser;
//@Listeners(com.actitime.genericlib.listenerClass.class)
public class sampleTest
{
	public configReaders config;
	WebDriver driver;
	@Test
    public void launchTest() 
    {
	  launchBrowser launch = new launchBrowser();
	  //launch.Chrome(driver);
	  launch.Firefox(driver);
	  launch.close(driver);
	  System.out.println("yahi hai problm");
	}
	@Test(dependsOnMethods="launchTest")
	public void loginTest()
	{
		config.login(driver);
	}
 
 }
