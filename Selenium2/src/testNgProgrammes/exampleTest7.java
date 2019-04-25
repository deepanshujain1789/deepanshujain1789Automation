package testNgProgrammes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class exampleTest7 
{
@Test
public void screenshotTest() throws Throwable
{
 System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 driver.get("https://www.facebook.com/");
 driver.findElement(By.id("email")).sendKeys("deepanshu jain");
 TakesScreenshot ts=(TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File destfl= new File("./Screenshots/facebook.png");
 FileUtils.copyFile(src, destfl );
 System.out.println("Screenshot Captured");
 Thread.sleep(5000);
 driver.close();
 
}
}
