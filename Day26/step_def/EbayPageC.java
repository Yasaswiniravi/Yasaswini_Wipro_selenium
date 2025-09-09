
package step_def;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EbayPageC {
    WebDriver driver;

    public EbayPageC(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(By.id("userid")).sendKeys(email);
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
    }
    public void search(String product) {
    	WebElement ser=driver.findElement(By.id("gh-ac"));
    	ser.clear();
    	ser.sendKeys(product);
    	ser.sendKeys(Keys.ENTER);
    }
    public void adddeletecart() {
    	Actions act=new Actions(driver);
  	  driver.navigate().to("https://www.ebay.com/itm/146395282867?_trkparms=itmf%3D1%26aid%3D111001%26rkt%3D10%26mech%3D1%26algv%3D%26pmt%3D1%26amclksrc%3DITM%26sid%3DAQAKAAAAELmkV2LxCyLOKiYSPEI%2BGtE%3D%26itm%3D146395282867%26noa%3D1%26plcampt%3D0%3A97709120018%26algo%3DREC.SEED%26brand%3DDisney%26asc%3D20240304162621%26ao%3D1%26rk%3D1%26pid%3D102020%26b%3D1%26mehot%3Dnone%26lsid%3D0%26meid%3D15f3931683574af09263f172330c1772%26pg%3D2332490&_trksid=p2332490.c102020.m5276");
  	  driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
  	  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();   
  	  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
    }
    public void shopbycategory() {
    	driver.navigate().to("https://www.ebay.com/");
  	  driver.findElement(By.id("gh-cat")).click();
  	  driver.findElement(By.cssSelector("select>option[value=\"550\"]")).click();
  	  WebElement search1= driver.findElement(By.id("gh-ac"));
  	  search1.sendKeys("actionfigures");
  	  search1.sendKeys(Keys.ENTER);
    }
    public void showallcategory() {
    	WebElement search=driver.findElement(By.id("gh-ac"));
  	  search.sendKeys(Keys.ENTER);
    }
    public void description() {
    	driver.navigate().to("https://www.ebay.com/itm/146395282867?itmmeta=01K2Q0H5E1XB2BP37CH131V93J&hash=item2215d6bdb3:g:0IsAAOSwbmtnse-Z&itmprp=enc%3AAQAKAAAA4MHg7L1Zz0LA5DYYmRTS30lAVF4BLRvdbZPBikwqYnWWGis3bI3l0TSjF%2FXyOKr4MKN%2B2TSPhV8bl2N7wR%2FIhJpxyAHUcWVtxrG5HcweZBEzsNqJYJwcPM5iFtEuFRWjhlzxD7dvvniG%2BMWJUpq%2FoA2UC91GIdr1N0re7gGnLqoBMfkXzQ5sj3BonCdq14XPzArnev3Yzu99O6Uv3mz6xUTKOBaMjsn0afdhuu3lSXrcs6skZHOr8P9E5qvwiB6kmDOEm4lmn3dzQv9w9H1YYTSJZyAhvXrqcAHR7k1ta9uP%7Ctkp%3ABFBMjNfE4JVm");
  	  ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
  	  driver.switchTo().window(tab.get(0));	
  	  JavascriptExecutor js = (JavascriptExecutor)driver;
  	  js.executeScript("window.scrollBy(0,700)");	
  	  driver.findElement(By.xpath("//*[@id=\"desc_ifr\"]")).click();
    }
    public void language() {
    	 WebElement country=driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
   	     country.sendKeys(Keys.ENTER);
   	     driver.findElement(By.linkText("India")).click();
    }
    public void wishlist() {
    	driver.navigate().to("https://www.ebay.com/itm/297556120051?_trkparms=amclksrc%3DITM%26aid%3D777008%26algo%3DPERSONAL.TOPIC%26ao%3D1%26asc%3D20250324085124%26meid%3D6c2592034aed44da802db97d0d4fae4c%26pid%3D101770%26rk%3D1%26rkt%3D1%26itm%3D297556120051%26pmt%3D1%26noa%3D1%26pg%3D4375194%26algv%3DRecentlyViewedItemsV2WithMLRPboosterAndUpdatedFeatures_BP%26brand%3DElgin&_trksid=p4375194.c101770.m146925&_trkparms=parentrq%3Acbf09cf31980a6bac5b06601ffe0b688%7Cpageci%3A7a7ffb64-7e70-11f0-898f-12f5110e53f4%7Ciid%3A1%7Cvlpname%3Avlp_homepage");
    	WebElement wish=driver.findElement(By.id("watchBtn_btn_1"));
    	wish.click();
    }
    
}



