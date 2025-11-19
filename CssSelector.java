package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
  public static void main(String[] args) throws InterruptedException {
	  
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("https://demowebshop.tricentis.com");
	
	driver.findElement(By.cssSelector(".poll-options>li:nth-child(1) input")).click();
	
	driver.findElement(By.cssSelector(".poll-options>li:nth-child(2) input")).click();
	
	driver.findElement(By.cssSelector(".poll-options>li:nth-child(3) input")).click();
	
	driver.findElement(By.cssSelector(".poll-options>li:nth-child(4) input")).click();
	
	driver.close();
	
}
}
