//HARD ASSERT (USED FOR MANDATORY DETAILS)
package testNgProgrammes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class exampleTest1 
{
 @Test(priority=1)
 public void createcampaginTest()
 {
	System.out.println("Step 1");
	System.out.println("Step 2");
	System.out.println("Step 3");
	Assert.assertEquals("deepanshu", "Jain");
	System.out.println("Step 4");
	System.out.println("Step 5");
 }
 @Test(priority=2)
 public void createcustomerTest()
 {
	 System.out.println("Step 1");
	 System.out.println("Step 2");
	 System.out.println("Step 3");
	 System.out.println("Step 4");
 }
}
