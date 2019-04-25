package com.wordPress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class postVerification 
{
 @FindBy(xpath="//p[contains(text(),'Post published.')]") 
 WebElement published_text;

 public String verifypost()
{
 String captured_text=published_text.getText();
 return captured_text;
	
}
}