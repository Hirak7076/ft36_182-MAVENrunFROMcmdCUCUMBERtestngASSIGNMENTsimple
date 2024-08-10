package SIMPLEsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	
	   @Given("Open the browser")
	   public void open_the_browser() {
	       
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
	   }

	   @Given("Enter the Simple url")
	   public void enter_the_simple_url() {
	       
		   driver.get("https://v1.training-support.net/selenium/simple-form?");
		   
	   }

	   @When("User enters Mobile Number or Firstname, Lastname, Email, Contact number, Message")
	   public void user_enters_mobile_number_or_firstname_lastname_email_contact_number_message() {
	       
		   driver.findElement(By.id("firstName")).sendKeys("Hirak");
		   driver.findElement(By.id("lastName")).sendKeys("Goswami");
		   driver.findElement(By.id("email")).sendKeys("HIR@GMAIL.COM");
		   driver.findElement(By.id("number")).sendKeys("1234567890");
		   driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("Hello!");
		   
	   }

	   @Then("Click the submit button")
	   public void click_the_submit_button() {
	       
		   driver.findElement(By.cssSelector("[value='submit']")).click();
		   
	   }

	   @Then("Handel the alert")
	   public void handel_the_alert() {
	       
		   driver.switchTo().alert().accept();
		   driver.close();
		   
	   }
	
}
