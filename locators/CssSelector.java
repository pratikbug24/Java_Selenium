package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

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
		//find searchField
        driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		
        //click search
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		//stop execution
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
