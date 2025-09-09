package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class showallcategory {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("select show all categories")
	public void select_show_all_categories() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	    
	}

	@When("select any category in all categories")
	public void select_any_category_in_all_categories() {
		pg.showallcategory();
	    
	}

	@Then("display category wise products")
	public void display_category_wise_products() {
		driver.close();
	   
	}


}
