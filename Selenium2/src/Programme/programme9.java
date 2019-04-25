//Write into exl file using excl libraries
package Programme;

import com.excel.libraries.writeExcel;

public class programme9 
{
 public static void main(String[] args) throws Throwable 
 {
	writeExcel wrt = new writeExcel("D:\\java\\Exl file\\Book1.xlsx");
	wrt.writeInNewRow("Sheet1", 4, 0, "swatiyadav2712@gmail.com");
	System.out.println("Done");
	
 }
}
