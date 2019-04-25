package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class fileReader 

{
 static Properties pro;
 public fileReader() throws Throwable
 {
 try {
	File file = new File("./configuration/config.properties");
	 FileInputStream fis = new FileInputStream(file);
	 pro = new Properties();
	 pro.load(fis);
     } 
 catch (Throwable e) 
     {
	System.out.println(e.getMessage());
     }
 }
 public String get_username()
 {
	 String username= pro.getProperty("username");
	 return username;
 }
 public String get_password()
 {
	 String password = pro.getProperty("password");
	 return password;
 }
 public String get_URL()
 {
	 String URL= pro.getProperty("URL");
	return URL;
 }

		 
}
