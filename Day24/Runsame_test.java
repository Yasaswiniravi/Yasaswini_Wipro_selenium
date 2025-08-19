package Asserts_demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Runsame_test {
	WebDriver driver;
@BeforeClass
public void beforeClass() {
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
@Test(enabled=false)
public void login() {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("raviyasaswini14@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("A12345678");
	  driver.findElement(By.id("sgnBt")).click();
}
@Test(invocationCount=2)
public void search() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
	  List<String> sr=new ArrayList<>();
	  sr.add("phone");
	  sr.add("watch");
	  sr.add("toys");
	  for(String item: sr) {
		 WebElement search= driver.findElement(By.id("gh-ac"));
		 search.clear();
       search.sendKeys(item);
       search.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
}
}
@AfterClass
public void afterClass() {
	driver.close();
}

}
