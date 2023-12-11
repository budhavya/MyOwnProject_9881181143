package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() {
		//System.setProperty("webdriver.chrome.driver","‪D:\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","‪‪‪C:\\chrome-win64\\chrome.exe");
		System.out.println("Inside user is on login page");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside user is on login page");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside user is on login page");
	}

	@Then("user should navigate to dashboard")
	public void user_should_navigate_to_dashboard() {
		System.out.println("Inside user is on login page");
	}




}
