//HOW TO HANDLE FILE ATTACHEMENT WINDOW WITH THE HELP OF ROBOT CLASS
package Programme;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme3 
{
  public static void main(String[] args) throws Throwable
  {
	  System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://my.indeed.com/resume?from=hp&subfrom=rezprmstd&trk.origin=hp&trk.variant=rezprmstd&trk.tk=1d6rggi0n9d0j800&co=IN&hl=en_IN&obo=https%3A%2F%2Fwww.indeed.co.in");
         driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
         StringSelection path = new StringSelection("E:\\Miscelleneous\\Resumes\\Fresher\\Deepanshu jain.pdf");
         //String path = new String("E:\\Miscelleneous\\Resumes\\Fresher\\Deepanshu jain.pdf");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
         
         Robot robot= new Robot();
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         //Thread.sleep(5000);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
         driver.close();

  
  }
}  
