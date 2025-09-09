package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addingcart {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("Add and delete products in cart")
	public void add_and_delete_products_in_cart() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	    
	}

	@When("add delete cart")
	public void add_delete_cart() {
		pg.adddeletecart();
	   
	}

	@Then("it is working fine")
	public void it_is_working_fine() {
		driver.close();
	    
	}


}
