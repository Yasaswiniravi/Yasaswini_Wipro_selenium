package step_def;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signin {
	WebDriver driver;
	 EbayPageC pg;
	@Given("login page should open in default browser")
	public void login_page_should_open_in_default_browser() {
		 driver=new ChromeDriver();
	     pg=new EbayPageC(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	    
	}  

	@When("^click on eaddress (.*) and passw (.*)$")
	public void click_on_email_and_password(String email,String password) {
		pg.login(email, password);

	}

	@Then("successfully login and return to homepage")
	public void successfully_login_and_return_to_homepage() {
		driver.close();
	    
	}


}
