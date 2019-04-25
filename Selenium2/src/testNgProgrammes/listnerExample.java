package testNgProgrammes;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnerExample implements ITestListener
{
	EventFiringWebDriver eDriver; 
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Successfully start the test:"+result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully completed the test:"+result.getName());
		eDriver = new EventFiringWebDriver(testNgProgrammes.exampleTest8.driver); 
        File source=eDriver.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("./Screenshots/"+result.getName()+".png");
        try {
			FileUtils.copyFile(source, destinationfile);
		} catch (IOException e) {
		
			System.out.println("Copying failed"+e.getMessage());
		}

		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
        eDriver = new EventFiringWebDriver(testNgProgrammes.exampleTest8.driver); 
        File source=eDriver.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("./Screenshots/"+result.getName()+".png");
        try {
			FileUtils.copyFile(source, destinationfile);
		} catch (IOException e) {
		
			System.out.println("Copying failed"+e.getMessage());
		}
		System.out.println("Test case failed and the details are "+result.getName());	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
