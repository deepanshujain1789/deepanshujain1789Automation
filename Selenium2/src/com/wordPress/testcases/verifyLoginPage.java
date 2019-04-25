package com.wordPress.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.configReaders;
import com.utility.startBrowser;
import com.wordPress.pages.homepage;
import com.wordPress.pages.loginPage;
import com.wordPress.pages.postPage;
import com.wordPress.pages.postVerification;
@Listeners(com.actitime.genericlib.listenerClass.class)
public class verifyLoginPage 
{
 //static PageFactory page;
 public static WebDriver driver;

 configReaders confi= new configReaders();
 @BeforeClass	
 public void launchBrowserTest() throws Throwable
 {
	
	driver=startBrowser.startBrowser("firefox");
 }
 
 
 @Test(priority=1)
 public void loginWordPressTest() throws Throwable
 {	
	loginPage log=PageFactory.initElements(driver, loginPage.class);
	log.login();
 }
 
 
 @Test(priority=2)
 public void addNewPostTest() throws Throwable
 {	
    homepage home=PageFactory.initElements(driver, homepage.class);
	home.clickOn_Post();
	postPage post=PageFactory.initElements(driver, postPage.class);
	post.add_new();
 }
 
 
 @Test(priority=3)
 public void write_postTest() throws Throwable
 {
	postPage post=PageFactory.initElements(driver, postPage.class);
	post.write_title("Hurrey i got a new concept", "deepanshu jain");
 }
 
 
 @Test(priority=4)
 public void publish_postTest() throws Throwable
 {
    postPage post=PageFactory.initElements(driver, postPage.class);
	post.clickOn_publish();
 }
 
 
 @Test(priority=5)
 public void postVerificationTest() throws Throwable
 {
    postVerification vefify=PageFactory.initElements(driver, postVerification.class);
	String final_text=vefify.verifypost();
	String expected_text="Post published. View post";
	Assert.assertEquals(final_text, expected_text);
	
 }
 
 
 @AfterClass
 public void close_browserTest() throws Throwable
 {
    
	driver.close();
 }
}
