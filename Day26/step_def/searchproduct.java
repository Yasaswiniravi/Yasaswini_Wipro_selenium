package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchproduct {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("search button in browser")
	public void search_button_in_browser() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	   
	}

	@When("^enter (.*)$")
	public void enter_product(String product) {
	   pg.search(product); 
	}

	@Then("list of products available")
	public void list_of_products_available() {
		driver.close();
	   
	}


}
