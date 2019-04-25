package testNgProgrammes;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exampleTest4 
{
 @Parameters("browsers")
 @BeforeTest
 @Test(groups= {"smoke"})
 void sampleTest() throws Throwable
 {
	 System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(5000);
	 driver.close();
 }
 @Test(groups= {"regression"},enabled=false)
 void sample2Test() throws Throwable
 {
	 System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
	 Thread.sleep(5000);
	 driver.close();
 }
}
