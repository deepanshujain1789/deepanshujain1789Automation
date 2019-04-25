//HOW TO HANDLE FILE DOWNLOAD POP UP IN UPGRADED SELENIUM
// FIREFOX OPTION WILL BE USED IN PLACE OF THE FIREFOX PROFILE 
package Programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class programme1 
{
  public static void main(String[] args) throws Throwable
  {
	   System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");	
	    FirefoxOptions fo = new FirefoxOptions();
	    fo.addPreference("browser.download.folderList", 2);
		//profile.setPreference("browser.download.folderList", 2);
		//To PROVIDE THE INSTRUCTIONS REGARDING WHERE TO SAVE IT
		fo.addPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		//TO AVOIDE THE POPUP AND DIRECTLY SAVE IT
		fo.addPreference("browser.download.dir","D:\\java");
		//profile.setPreference("browser.download.dir","D:\\java" );
		//TO PROVIDE THE LOCATION WHERE TO SAVE IT
		
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.get("https://maven.apache.org/download.cgi");
		driver.findElement(By.linkText("apache-maven-3.6.0-bin.zip")).click();
  }
}
		//Thread.sleep(5000);
		//driver.close();
		
		