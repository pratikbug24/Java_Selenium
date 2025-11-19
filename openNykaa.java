package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class openNykaa {
	public static void main(String[] args) {
		//open the browser 
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		//enter into demoshopstore
		driver.get("https://www.nykaa.com/");
		
		//close the driver
		driver.close();
		
	}
}
