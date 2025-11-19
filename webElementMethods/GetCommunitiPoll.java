package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommunitiPoll {
 
	public static void main(String[] args) throws InterruptedException {
		//open chrome
		ChromeDriver  driver=new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
		//open the dws
		driver.get("https://demowebshop.tricentis.com");
	
		Thread.sleep(2000);
		
		WebElement communitiPoll=driver.findElement(By.xpath("//strong['text()='Community poll']"));
		
		System.out.println("text in targeted wrbElement is:"+communitiPoll.getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
