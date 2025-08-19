package Testing_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Testclass1 {
  @Test
  public void amazon() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  String expectedurl="https://www.amazon.in/";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl,expectedurl, "url validation fail");
	  Thread.sleep(3000);
	  System.out.println("amazon-ThreadID:"+Thread.currentThread().getId());
	  driver.quit();
  }
  

}
