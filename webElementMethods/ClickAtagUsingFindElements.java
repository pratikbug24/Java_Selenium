package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAtagUsingFindElements {

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
				
				//find links
				List<WebElement> link=driver.findElements(By.xpath("//div[@class='header-links']/ul/li"));
				
				for (WebElement web : link) {
					web.click();
					driver.navigate().back();
					Thread.sleep(2000);
				}
	}

}
