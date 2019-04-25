//HOW TO USE PARAMETER ANNOTATIONS
package testNgProgrammes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exampleTest5 
{
WebDriver driver;

@BeforeTest
@Parameters("browser")
void configBTtest(String browsername)
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	driver = new FirefoxDriver();
	
	}

	
}

@Test
void sample3test() throws Throwable
{
	driver.get("https://www.amazon.in/");
   
}
@Test
void sample4test() throws Throwable
{
	driver.get("https://www.facebook.com/");
}
@AfterTest
void configAttest()
{
	driver.close();
}
}
