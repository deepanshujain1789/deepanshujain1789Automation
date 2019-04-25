//SOFT ASSERT USING (USED FOR NON MANDATORY DETAILS)
package testNgProgrammes;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class exampleTest2 
{
 @Test(priority=1)
 void createcampaginTest()
 {
	 System.out.println("Step 1");
	 SoftAssert s = new SoftAssert();
	 s.assertEquals("Deepanshu", "Jain");
	 System.out.println("Step 2");
	 System.out.println("Step 3");
	 System.out.println("Step 4");
	 s.assertAll();
 }
 @Test(priority=2)
 void createcustomerTest()
 {
	 System.out.println("Step 1");
	 System.out.println("Step 2");
	 System.out.println("Step 3");
 }
}
