package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NthChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//open chrome
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
		//open the dws
		driver.get("https://demowebshop.tricentis.com");
	
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".poll-options > li:nth-child(1) input")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".poll-options  > li:nth-child(2) input")).click();
		
		Thread.sleep(1000);
		
		 driver.findElement(By.cssSelector(".poll-options > li:nth-child(3) input")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector(".poll-options > li:nth-child(4) input")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 
	}

}
