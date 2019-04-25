package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser 
{
	static configReaders config = new configReaders();
	static WebDriver driver;
 public static void Chrome(WebDriver driver)
 {
	System.setProperty(config.getchromepathS1(),config.getchromepathS2());
	driver = new ChromeDriver();
	driver.get(config.getURl());
	driver.manage().window().maximize();
	System.out.println("Browser launched successfully");
 }
 public static void Firefox(WebDriver driver)
 {
	 System.setProperty(config.getfirefoxpathS1(), config.getfirefoxpathS2());
	 driver= new FirefoxDriver();
	 driver.get(config.getURl());
 } 
 public static void close(WebDriver driver)
 {
	 driver.close();
 }
 }

