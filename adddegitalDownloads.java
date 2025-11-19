package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adddegitalDownloads {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://demowebshop.tricentis.com");

        // Open Digital downloads
        driver.findElement(By.linkText("Digital downloads")).click();

        // Add all products to cart
        List<WebElement> addButtons = driver.findElements(By.cssSelector("input[value='Add to cart']"));
        for (WebElement btn : addButtons) {
            btn.click();
            Thread.sleep(1000);
        }

        // Go to shopping cart
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        Thread.sleep(2000);

        // Fetch all subtotal prices
        List<WebElement> prices = driver.findElements(By.cssSelector("td.subtotal"));

        double highestPrice = 0;
        int highestIndex = 0;

        // Find highest price + its row index
        for (int i = 0; i < prices.size(); i++) {
            String priceText = prices.get(i).getText().replace("$", "").trim();
            double price = Double.parseDouble(priceText);

            if (price > highestPrice) {
                highestPrice = price;
                highestIndex = i;
            }
        }


        // Remove checkbox list
        List<WebElement> removeCheckboxes = driver.findElements(By.name("removefromcart"));

        // Click remove checkbox for the highest priced product
        removeCheckboxes.get(highestIndex).click();
        Thread.sleep(1000);

        // Update cart
        driver.findElement(By.name("updatecart")).click();
        Thread.sleep(2000);

        System.out.println("Highest priced product removed successfully!");

        driver.close();
    }
}
