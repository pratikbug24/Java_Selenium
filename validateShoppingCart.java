package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		//open chrome
				ChromeDriver  driver=new ChromeDriver();
				//maximize chrome browser
				driver.manage().window().maximize();
				
				//stop execution for 2sec
//				Thread.sleep(2000);
				
			   String excepted_url ="https://demowebshop.tricentis.com/";
			   
			   driver.get(excepted_url);
			   
			   String actual_url = driver.getCurrentUrl();
			   
			   if(excepted_url.equals(actual_url)) {
				   
				   driver.findElement(By.linkText("Log in")).click();
				   
				   driver.findElement(By.cssSelector("#Email")).sendKeys("pratikpawar0243@gmail.com");
				   
				   driver.findElement(By.cssSelector("#Password")).sendKeys("Pratik@123");
				   
				   driver.findElement(By.cssSelector(".button-1.login-button")).click();
				   Thread.sleep(2000);
				   
			        
				// Click on "$25 Virtual Gift Card"
				   driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']")).click();
				   Thread.sleep(2000);

			        // Fill Recipient Name
			        driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Rahul");
			        Thread.sleep(800);

			        // Fill Recipient Email
			        driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("rahul@example.com");
			        Thread.sleep(800);

			        // Fill Sender Name
			        driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Pratik");
			        Thread.sleep(800);

			        // Fill Sender Email
			        driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("pratik@example.com");
			        Thread.sleep(800);

			        // Add Message
			        driver.findElement(By.id("giftcard_2_Message"))
			              .sendKeys("Sending you a $25 virtual gift card. Enjoy!");
			        Thread.sleep(800);

			        // Clear quantity
			        driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
			        Thread.sleep(500);

			        // Enter quantity
			        driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
			        Thread.sleep(800);

			        // Click Add to Cart button
			        driver.findElement(By.id("add-to-cart-button-2")).click();
			        Thread.sleep(2000);

			        // Open Shopping Cart
			        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			        Thread.sleep(2000);

			        // Validation
			        if (driver.getPageSource().contains("$25 Virtual Gift Card")) {
			            System.out.println("$25 Virtual Gift Card Added Successfully!");
					
			   }
	}

	}
}
