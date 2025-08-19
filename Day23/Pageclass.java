package Testing_package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pageclass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	By addcart=By.id("atcBtn_btn_1");
	By category=By.id("gh-cat");
	By allcategory=By.id("gh-ac");
	By language=By.linkText("India");
	By desc=By.id("desc_ifr");
	By address=By.id("individual_personal_info_address_edit_button");
	public Pageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void email_in()  {
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("raviyasaswini14@gmail.com");
	}
	public void pass_in()  {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("A12345678");
	}
	public void con_in() {
		  driver.findElement(By.id("signin-continue-btn")).click();

	}
	public void submit() {
		  driver.findElement(By.id("sgnBt")).click();

	}
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
    public void addcart() throws InterruptedException {
      Actions act=new Actions(driver);
   	  driver.navigate().to("https://www.ebay.com/itm/146395282867?_trkparms=itmf%3D1%26aid%3D111001%26rkt%3D10%26mech%3D1%26algv%3D%26pmt%3D1%26amclksrc%3DITM%26sid%3DAQAKAAAAELmkV2LxCyLOKiYSPEI%2BGtE%3D%26itm%3D146395282867%26noa%3D1%26plcampt%3D0%3A97709120018%26algo%3DREC.SEED%26brand%3DDisney%26asc%3D20240304162621%26ao%3D1%26rk%3D1%26pid%3D102020%26b%3D1%26mehot%3Dnone%26lsid%3D0%26meid%3D15f3931683574af09263f172330c1772%26pg%3D2332490&_trksid=p2332490.c102020.m5276");
   	  Thread.sleep(2000);
   	  driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
   	  Thread.sleep(2000);
   	  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();   
   	  Thread.sleep(2000);
   	  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
     	
    }
    public void category() throws InterruptedException {
    	driver.navigate().to("https://www.ebay.com/");
  	  driver.findElement(By.id("gh-cat")).click();
  	  Thread.sleep(6000);
  	  driver.findElement(By.cssSelector("select>option[value=\"550\"]")).click();
  	  Thread.sleep(4000);
  	  WebElement search1= driver.findElement(By.id("gh-ac"));
  	  search1.sendKeys("actionfigures");
  	  search1.sendKeys(Keys.ENTER);
  	  Thread.sleep(3000);

	}
    public void allcategory() {
    	WebElement search=driver.findElement(By.id("gh-ac"));
  	  //Thread.sleep(5000);
  	  search.sendKeys(Keys.ENTER);
    }
    public void language() {
    	WebElement country=driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
  	  country.sendKeys(Keys.ENTER);
  	  driver.findElement(By.linkText("India")).click();
    }
   public void desc() {
	   driver.navigate().to("https://www.ebay.com/itm/146395282867?itmmeta=01K2Q0H5E1XB2BP37CH131V93J&hash=item2215d6bdb3:g:0IsAAOSwbmtnse-Z&itmprp=enc%3AAQAKAAAA4MHg7L1Zz0LA5DYYmRTS30lAVF4BLRvdbZPBikwqYnWWGis3bI3l0TSjF%2FXyOKr4MKN%2B2TSPhV8bl2N7wR%2FIhJpxyAHUcWVtxrG5HcweZBEzsNqJYJwcPM5iFtEuFRWjhlzxD7dvvniG%2BMWJUpq%2FoA2UC91GIdr1N0re7gGnLqoBMfkXzQ5sj3BonCdq14XPzArnev3Yzu99O6Uv3mz6xUTKOBaMjsn0afdhuu3lSXrcs6skZHOr8P9E5qvwiB6kmDOEm4lmn3dzQv9w9H1YYTSJZyAhvXrqcAHR7k1ta9uP%7Ctkp%3ABFBMjNfE4JVm");
		  ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(tab.get(0));	
		  //Thread.sleep(5000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,700)");	
		  //Thread.sleep(8000);
		  driver.findElement(By.xpath("//*[@id=\"desc_ifr\"]")).click();
   }
   public void address() {
		  Actions actions=new Actions(driver);
	   driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		  WebElement name=driver.findElement(By.id("userid"));
		  name.sendKeys("raviyasaswini14@gmail.com");
		  driver.findElement(By.id("signin-continue-btn")).click();
		  //Thread.sleep(5000);
		  WebElement pass=driver.findElement(By.id("pass"));
		  pass.sendKeys("A12345678");
		  driver.findElement(By.id("sgnBt")).click();
		  //Thread.sleep(2000);
		  driver.navigate().to("https://accountsettings.ebay.com/profile");
		  //driver.findElement(By.id("account-settings-link-PI")).click();
		  driver.findElement(By.xpath("//*[@id=\"individual_personal_info_address_edit_button\"]")).click();
		  WebElement n1=driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
		  n1.clear();
		  n1.sendKeys("suresh");
		  WebElement n=driver.findElement(By.id("addressLine1"));
		  n.clear();
		  n.sendKeys("Building, colony");
		  WebElement n2=driver.findElement(By.id("city"));
		  n2.clear();
		  n2.sendKeys("Inkollu");
		  driver.findElement(By.id("country")).click();
	      driver.findElement(By.cssSelector("select>option[value=\"IN\"]")).click();
	      
	      driver.findElement(By.id("stateOrProvince")).click();
	      driver.findElement(By.cssSelector("select>option[value=\"AP\"]")).click();
	      //Thread.sleep(2000); 
	      WebElement n3=driver.findElement(By.id("postalCode"));
	      n3.clear();
		  n3.sendKeys("523167");
		  //Thread.sleep(2000);  
		  n3.sendKeys(Keys.ENTER);
   }
}

