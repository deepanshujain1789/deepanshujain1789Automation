package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericlib.configReaders;

public class startBrowser 
{
  static WebDriver driver;
  public static WebDriver startBrowser(String browser_name) throws Throwable
  {
	  if(browser_name.equalsIgnoreCase("chrome"))
  {
	  System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
	  driver= new ChromeDriver();
	  
  }
  else if (browser_name.equalsIgnoreCase("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
  }
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  fileReader fi= new fileReader();
  driver.get(fi.get_URL());
  
  return driver;
  }
  public static void close_browser()
  {
	  driver.close();
  }
}
