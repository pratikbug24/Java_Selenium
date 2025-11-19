package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformRegister {
  
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://demowebshop.tricentis.com");
	      
	      driver.findElement(By.className("ico-register")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.cssSelector("#Email")).sendKeys("pratikpawar0243@gmail.com");
	      
	      driver.findElement(By.cssSelector("#Password")).sendKeys("Pratik@123");
	      
	      
	      driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
}
