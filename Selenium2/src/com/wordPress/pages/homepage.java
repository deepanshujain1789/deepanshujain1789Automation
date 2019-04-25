package com.wordPress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage 
{
 public homepage(WebDriver driver)
 {
	 
 }
 //change
 @FindBy(xpath="//div[contains(text(),'Posts')]") 
 WebElement post;
 @FindBy(xpath="//div[contains(text(),'Media')]") 
 WebElement media;
 @FindBy(xpath="//div[contains(text(),'YouTube Embed')]") 
 WebElement youtube_embed;
 @FindBy(xpath="//div[contains(text(),'Pages')]") 
 WebElement pages;
 
 
 public void clickOn_Post()
 {
	 post.click();
 }
 public void clickOn_Media()
 {
	 media.click();
 }
 public void clickOn_YoutubeEmbed()
 {
	 youtube_embed.click();
 }public void clickOn_Pages()
 {
	 pages.click();
 }
  
 
 
}
