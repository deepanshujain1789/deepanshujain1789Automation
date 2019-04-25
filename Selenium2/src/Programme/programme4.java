package Programme;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class programme4 
{
  public static void main(String[] args) throws Throwable
  {
	System.setProperty("webdriver.gecko.driver", "./Geckodriver/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement wb= driver.findElement(By.id("month"));
	Select sel = new Select(wb);
    sel.selectByVisibleText("Apr");
    Select sel1=new Select(driver.findElement(By.id("year")));
    sel1.selectByVisibleText("1995");
	Thread.sleep(6000);
	driver.close();
  }
}
