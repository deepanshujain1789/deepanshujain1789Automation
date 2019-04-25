package com.wordPress.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class postPage 
{
 @FindBy(linkText="Add New") 
 WebElement add_new;
 
 @FindBy(xpath="//input[@id='title']")
 WebElement write_title;
 
 @FindBy(id="publish")
 WebElement publish;
public void add_new()
{
 add_new.click();	
}
public void write_title(String title,String content)
{
	write_title.sendKeys(title,Keys.TAB,content,Keys.TAB);
}
public void clickOn_publish()
{
	publish.click();
	//publish.click();
}
}

