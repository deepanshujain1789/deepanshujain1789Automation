//FILE ATTACHEMENT BY THE HELP OF AUTO IT
package Programme;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme2 
{
  public static void main(String[] args) throws Throwable
  {
	 System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://my.indeed.com/resume?from=hp&subfrom=rezprmstd&trk.origin=hp&trk.variant=rezprmstd&trk.tk=1d6rggi0n9d0j800&co=IN&hl=en_IN&obo=https%3A%2F%2Fwww.indeed.co.in");

	 
	 driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	 Runtime.getRuntime().exec("E:\\Miscelleneous\\Resumes\\Fresher\\work.exe");
	 Thread.sleep(5000);
	 driver.close();
  }
}
