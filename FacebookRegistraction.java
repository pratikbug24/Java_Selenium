package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//open chrome
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
		//open the dws
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Pratik");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("birthday_day")).sendKeys("24");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("month")).sendKeys("Mar");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("year")).sendKeys("2003");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pp6303631@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pratik@543");
		
//		driver.findElement(By.name("websubmit")).click();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
