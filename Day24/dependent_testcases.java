package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class dependent_testcases {
	WebDriver driver;

 
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  @Test
  public void login() {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("raviyasaswini14@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("A12345678");
	  driver.findElement(By.id("sgnBt")).click();
  }
  @Test(dependsOnMethods= {"login"})
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
  @Test(dependsOnMethods= {"login","search"})
  public void addtocart() throws InterruptedException {
	  Actions act=new Actions(driver);
	  driver.navigate().to("https://www.ebay.com/itm/146395282867?_trkparms=itmf%3D1%26aid%3D111001%26rkt%3D10%26mech%3D1%26algv%3D%26pmt%3D1%26amclksrc%3DITM%26sid%3DAQAKAAAAELmkV2LxCyLOKiYSPEI%2BGtE%3D%26itm%3D146395282867%26noa%3D1%26plcampt%3D0%3A97709120018%26algo%3DREC.SEED%26brand%3DDisney%26asc%3D20240304162621%26ao%3D1%26rk%3D1%26pid%3D102020%26b%3D1%26mehot%3Dnone%26lsid%3D0%26meid%3D15f3931683574af09263f172330c1772%26pg%3D2332490&_trksid=p2332490.c102020.m5276");
	  driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
	  //driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();   
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
