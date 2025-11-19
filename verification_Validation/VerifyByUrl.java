package verification_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//open chrome
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
	   String excepted_url ="https://demowebshop.tricentis.com/";
	   
	   driver.get(excepted_url);
	   
	   String actual_url = driver.getCurrentUrl();
	   
	   if(excepted_url.equals(actual_url)) {
		   System.out.println("I am in targeted_Url");
		   driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		   System.out.println("Tsest case is passed");
	   }
	   else {
		System.out.println("I am not in targeted_url");
		driver.close();
		throw new Exception("test case is faild");
	}
	   
	   driver.close();
	}

}