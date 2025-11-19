package verification_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
	   String excepted_url ="https://demowebshop.tricentis.com/";
	   
	   driver.get(excepted_url);
	   
	   try {
		   driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
		   System.out.println("Test case Pass");
		   driver.close();
	   }
	   catch (Exception e) {
		// TODO: handle exception
		   driver.close();
		   throw new Exception("test case is faild");
	}
	}

}
