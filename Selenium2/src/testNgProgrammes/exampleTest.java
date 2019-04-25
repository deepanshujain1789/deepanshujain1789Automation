package testNgProgrammes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exampleTest
{

	@BeforeClass
	void cofigBCTest()
	{
		System.out.println("TO turn on the browser");
	}
	@BeforeMethod
	void loginTest()
	{
		System.out.println("logged in successfully ");
	}
	@Test(priority=1,groups= {"smoke"})
	void addtocartTest()
	{
		System.out.println("Item added in cart successfully");
	}
	@Test(priority=2,groups= {"regression"})
	void checkoutTest()
	{
		System.out.println("Proceed to payment");
	}
	@AfterMethod
	void logoutTest()
	{
		System.out.println("loged out successfully");
	}
	@AfterClass
	void configACTest()
	{
		System.out.println("logged out successfully");
	}

	
}
 