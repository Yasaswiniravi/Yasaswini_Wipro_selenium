package automation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demoqa {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("anu");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Raavi");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		WebElement phoneno=driver.findElement(By.id("userNumber"));
		phoneno.sendKeys("9441917492");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select(year);
		//sel.selectByIndex(125);
		//sel.selectByValue("2025");
		sel.selectByVisibleText("2025");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1=new Select(month);
		//sel1.selectByIndex(0);
		//sel1.selectByValue("0");
		sel1.selectByVisibleText("February");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]")).click();
		
		//subject
		String[] subjects= {"Math","phy","eco","Eng"};
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		for(String subject:subjects)
		{
			sub.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
		}
		js.executeScript("window.scrollBy(0,900)");
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("co");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();

		//upload picture
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\raviy\\OneDrive\\Pictures\\Saved Pictures\\nature.jpg");
		
		WebElement State=driver.findElement(By.id("react-select-3-input"));
		State.sendKeys("NCR");
		State.sendKeys(Keys.ENTER);
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		//submit
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);		
	}


}
