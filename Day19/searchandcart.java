package Assignment19;
/*Task 2 – Product Search and Add to Cart
•	Steps:
1.	Search for a product using the search bar (e.g., "dress").
2.	Select the first product from search results.
3.	Add it to the cart.
4.	Verify that the success popup/cart message is displayed.
•	Expected Result: The product is added to the cart and confirmation message appears.
    */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchandcart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Welocme to Login Page");		
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 		
		driver.findElement(By.name("login-button")).click();
		
		WebElement search = driver.findElement(By.linkText("Sauce Labs Backpack"));
		search.sendKeys(Keys.ENTER);
		
		Actions act = new Actions(driver);    
		driver.findElement(By.id("add-to-cart")).click(); 
		System.out.println("added to cart");
		WebElement clk = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		act.click(clk).perform();
		System.out.println("Done");
		driver.close();
		// TODO Auto-generated method stub

	}

}
