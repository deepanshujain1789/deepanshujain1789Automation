package testNgProgrammes;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgProgrammes.listnerExample.class)
public class exampleTest8 
{
   public static WebDriver driver;
   @Test
   public void listnrexmpleTest() throws Throwable
   
  {
	  
	  System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  System.out.println("Successfully fetched the title i.e :"+driver.getTitle());
	  String org= driver.getTitle();
	  String exp = "Deepanshu jain";
	  Assert.assertEquals(org, exp);
	  
	  Thread.sleep(5000);
	 
	  driver.close();
  }
   @Test
   public void listnerexampleTest2()
   {
	   System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.flipkart.com/");
		  System.out.println("Successfully fetched the title i.e :"+driver.getTitle());
		  String org= driver.getTitle();
		  String exp = "Deepanshu jain";
		  Assert.assertEquals(org, exp);
   }
   @AfterMethod
  public void verifyhomepageTest()
  {   
	  driver.close();
  }
}
