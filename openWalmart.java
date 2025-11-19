package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class openWalmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open the browser 
		ChromeDriver driver=new ChromeDriver();
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				//enter into demoshopstore
				driver.get("https://www.walmart.com/");
				
				//close the driver
				driver.close();
				
	}

}
