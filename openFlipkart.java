package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class openFlipkart {
    public static void main(String[] args) {
		//open the browser 
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		//enter into demoshopstore
		driver.get("https://www.flipkart.com/");
		
		//close the driver
		driver.close();
	}
	
	
	
}
