package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Language {
	WebDriver driver;
	EbayPageC pg;
	
	@Given("open homepage")
	public void open_homepage() {
		driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://www.ebay.com");
	}

	@When("select language")
	public void select_language() {
	    pg.language();
	}

	@Then("selected laguage page is displayed")
	public void selected_laguage_page_is_displayed() {
		driver.close();
	    
	}


}
