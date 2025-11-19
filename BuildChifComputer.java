package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuildChifComputer {

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
				
				//Click on "Build your own cheap computer"
		        driver.findElement(By.xpath("//a[text()='Build your own cheap computer']")).click();
		        Thread.sleep(2000);

		        // Select "Fast" processor
		        driver.findElement(By.id("product_attribute_72_5_18_65")).click();
		        Thread.sleep(500);

		        //Select "8GB" RAM
		        driver.findElement(By.id("product_attribute_72_6_19_91")).click();
		        Thread.sleep(500);

		        //Select "400 GB" HDD
		        driver.findElement(By.id("product_attribute_72_3_20_58")).click();
		        Thread.sleep(500);

		        //Click Add to Cart button
		        driver.findElement(By.id("add-to-cart-button-72")).click();
		        Thread.sleep(2000);

		        // Go to Shopping Cart
		        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		        Thread.sleep(2000);
		        
		        driver.close();

	}

}
