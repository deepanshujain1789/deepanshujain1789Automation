package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerClass implements ITestListener
{
	EventFiringWebDriver eDriver; 
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" : test has been started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+": successfully completed");
		/**eDriver = new EventFiringWebDriver(com.wordPress.testcases.verifyLoginPage.driver); 
        File source=eDriver.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("./Screenshots/"+result.getName()+"PASS.png");
        try {
			FileUtils.copyFile(source, destinationfile);
		} catch (IOException e) {
		
			System.out.println("Copying failed"+e.getMessage());
		}
        **/
	
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
        eDriver = new EventFiringWebDriver(com.wordPress.testcases.verifyLoginPage.driver); 
        File source=eDriver.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("./Screenshots/"+result.getName()+"FAILED.png");
        try {
			FileUtils.copyFile(source, destinationfile);
		} catch (IOException e) {
		
			System.out.println("Copying failed"+e.getMessage());
		}
		System.out.println(result.getName()+": Test case got failed & the screenshot is captured");	
		
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
