package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopbycategory {
	WebDriver driver;
	EbayPageC pg;
	@Given("check products display in category wise")
	public void check_products_display_in_category_wise() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	}

	@When("select one category")
	public void select_one_category() {
		pg.shopbycategory();
	    
	}

	@Then("display selected category wise product")
	public void display_selected_category_wise_product() {
	    driver.close();
	}
	

}
