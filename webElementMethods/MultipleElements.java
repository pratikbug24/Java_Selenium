package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

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
		
		List<WebElement> poll=driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
		
		for (WebElement web: poll) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
