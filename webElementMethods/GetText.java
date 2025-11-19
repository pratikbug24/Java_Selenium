package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

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
				
				WebElement register=driver.findElement(By.className("ico-register"));
				
				System.out.println("text in targeted wrbElement is:"+register.getText());
				
				Thread.sleep(2000);
				
				driver.close();
	}

}
