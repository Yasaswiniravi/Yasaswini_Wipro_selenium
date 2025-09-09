package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wishlist {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("go to homepage")
	public void go_to_homepage() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	    
	}

	@When("open product and add wishlist")
	public void open_product_and_add_wishlist() {
		pg.wishlist();
	    
	}

	@Then("see product added to wishlist")
	public void see_product_added_to_wishlist() {
		driver.close();
	    
	}


}
