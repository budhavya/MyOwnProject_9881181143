package stepdefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.BasePage;
import pageobject.FirstScenarioPageObject;

public class FirstScenarioStepDefination{
	
	public FirstScenarioPageObject fb;
	public WebDriver driver;

	@Given("user is on practice home page")
	public void user_is_on_practice_home_page() {
		System.setProperty("webdriver.chrome.driver","D:\\CD Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    fb= new FirstScenarioPageObject(driver);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	}
	
	@When("user is on home page verify title of the page")
	public void user_is_on_home_page_verify_title_of_the_page() {
		String actual="Practice Page";
		Assert.assertEquals("Practice Page", actual);
	    System.out.println("Page title is "+driver.getTitle());
	   
	}

	@When("user is on practice home page select radio2 button")
	public void user_is_on_practice_home_page_select_radio2_button() {
		
		System.out.println("Clicked on Radio Button two");
		fb.selectRadioTwo(); 
	}
	
	@When("select dropdown value as India on home page")
	public void select_dropdown_value_as_india_on_home_page(String countryName) throws InterruptedException {
	    fb.selectCountry(countryName);
	}
	
	///
	@When("select dropdown value as {string} on home page")
	public void select_dropdown_value_as_on_home_page(String countryName) throws InterruptedException {
		fb.selectCountry(countryName);
	}
	@When("select dropdown example value as {string} home page")
	public void select_dropdown_example_value_as_home_page(String optionName)  {
		fb.dropDownExmaplemethod(optionName);
	}
	
	@Then("select two check boxes")
	public void select_two_check_boxes() {
	    
		fb.selectCheckTwoBoxes();
	}	
	
	
	

}
