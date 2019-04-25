package com.actitime.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class configReaders 
{
	public Properties prop;
	public configReaders()
  {
    try {
		File src = new File("./configuration/config.properties");
		FileInputStream fis= new FileInputStream(src);
		prop= new Properties();
		prop.load(fis);
	} catch (Exception e) 
     {
		System.out.println(e.getMessage());
	 }
  }
	
	public String getchromepathS1()
	{
		String chromepathS1 = prop.getProperty("chromepathS1");
	
		return chromepathS1;		
	}
	public String getchromepathS2()
	{
		String chromepathS2 = prop.getProperty("chromepathS2");
	
		return chromepathS2;		
	}
	public String getURl() 
	{
		String URL= prop.getProperty("URL");
		return URL;
	}
	public String getfirefoxpathS1()
	{
		String firefoxpathS1= prop.getProperty("firefoxpathS1");
		return firefoxpathS1;
	}
	public String getfirefoxpathS2()
	{
		String firefoxpathS2= prop.getProperty("firefoxpathS2");
		return firefoxpathS2;
	}
	public void login(WebDriver draver)
	{
		System.out.println("Login Method called");
		draver.findElement(By.id("email")).sendKeys(prop.getProperty("emailId"));
		draver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"),Keys.ENTER);
		System.out.println("Logged in successfully");
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	public  String get_username()
	{
		String un= prop.getProperty("username");
		return un;
	}
	public  String get_password()
	{
		String password= prop.getProperty("emailId");
		return password;
	}
}
