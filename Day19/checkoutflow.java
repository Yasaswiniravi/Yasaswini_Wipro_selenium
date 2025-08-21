package Assignment19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Task 3 – Checkout Flow
•	Steps:
1.	Open the shopping cart.
2.	Proceed to checkout.
3.	Fill in address details (if required).
4.	Select payment method.
5.	Complete the purchase.
6.	Verify the order confirmation page.
•	Expected Result: Order confirmation page should display with order details.
   */
public class checkoutflow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Welocme to Login Page");		
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);		
		Actions act = new Actions(driver);    
		WebElement search = driver.findElement(By.linkText("Sauce Labs Backpack"));
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); 
		System.out.println("Product added to cart.");
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("a[data-test=\\\"shopping-cart-link\\\"]"));
		act.click(clk).perform();
		System.out.println("Item Added and Displayed Sucessfully");    
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("Anu");
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("Sha");	
		WebElement code = driver.findElement(By.id("postal-code"));
		lname.sendKeys("416416");	
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

		System.out.println("Your order has been dispatched,");
		
		driver.close();
		// TODO Auto-generated method stub

	}

}
