package STEPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	WebDriver driver;
	
	@When("User Enters Usename as {string}")
	public void user_enters_usename_as(String UNAME) throws InterruptedException {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UNAME);
	    Thread.sleep(100);
	}

	@When("User Enters Password as {string}")
	public void user_enters_password_as(String UPWord) throws InterruptedException {
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(UPWord);
	   Thread.sleep(100);
	}
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}
	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
		
		driver.get(URL);
		driver.manage().window().maximize();
		    
	}
	

	@Then("Click on Login Button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//Button[@type='submit']")).click();
		
		
	   
	}
	
	
	

}
