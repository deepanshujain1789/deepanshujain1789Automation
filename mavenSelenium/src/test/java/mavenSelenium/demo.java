package mavenSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {
 @Test
 @Parameters("url")
 public void demoTest(String url)
 {
	 System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 //driver.get("https://www.facebook.com/");
	 driver.get(url);
	 System.out.println("Maven demo test is running in cmd successfully");
 }
}
