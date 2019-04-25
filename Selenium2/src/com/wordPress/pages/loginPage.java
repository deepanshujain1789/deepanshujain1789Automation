/**
 * 
 */
package com.wordPress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.fileReader;

/**
 * @author win 10
 * Created for the log in on the wordpress page
 */
public class loginPage
{
  WebDriver driver;
  
  public loginPage(WebDriver ldriver)
  {
	  this.driver=ldriver;
  }
  
  @FindBy(id="user_login")
  WebElement username;
  
  @FindBy(name="pwd")
  WebElement password;
  
  @FindBy(id="wp-submit")
  WebElement submit_button;
   
  @FindBy(linkText="Lost your password?")
  WebElement forgot_passoword;
  
  @FindBy(id="rememberme")
  WebElement remember_me;
  

public void login() throws Throwable 
{
	System.out.println("login method called");
	//username.sendKeys(uname);
	//password.sendKeys(pass);
	fileReader fi= new fileReader();
    username.sendKeys(fi.get_username());
	password.sendKeys(fi.get_password());
	submit_button.click();
	
}
}