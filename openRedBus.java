package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class openRedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open chrome
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		for (int i = 0; i <= 2; i++) {
			
		driver.get("https://www.abhibus.com");
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(1000);
		driver.navigate().back();
		
		}
		
		driver.close();

	}

}
