package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class description {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("go to any products")
	public void go_to_any_products() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	    
	}

	@When("select that product to see description")
	public void select_that_product_to_see_description() {
		pg.description();
	    
	}

	@Then("it display the description")
	public void it_display_the_description() {
	    driver.close();
	}


}
