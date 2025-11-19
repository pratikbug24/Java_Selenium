package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiallinkText {

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

				driver.findElement(By.partialLinkText("Shopping")).click();
				
				//stop execution
				Thread.sleep(2000);
				
				//close the browser
				driver.close();
	}

}
