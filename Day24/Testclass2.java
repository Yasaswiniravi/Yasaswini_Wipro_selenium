package Testing_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass2 {
	
  @Test
  public void flipkart() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle,expectedtitle,"title accepted" );
	  Thread.sleep(3000);
	  System.out.println("flipkart-ThreadID:"+Thread.currentThread().getId());
	  driver.quit();
  }
}
