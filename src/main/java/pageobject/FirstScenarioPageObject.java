package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioPageObject {
	
	WebDriver driver;


	
	public FirstScenarioPageObject(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@value='radio2']")
	WebElement radiobuttonTwo;
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement selectCountryDropdown;
	
	@FindBy(id="dropdown-class-example")
	WebElement dropDownExample;
	
	@FindBy(id="checkBoxOption1")
	WebElement checkboxes1;
	
	@FindBy(id="checkBoxOption2")
	WebElement checkboxes2;
		
	public void selectRadioTwo()
	{
		radiobuttonTwo.click();
	}
	
	public void selectCountry(String countryName) throws InterruptedException
	{
		selectCountryDropdown.sendKeys(countryName);
		List<WebElement>liselement =driver.findElements(By.xpath("//div[contains(@class,'ui-menu-item-wrapper')]"));
		Thread.sleep(2000);
		for(WebElement listsofcountries:liselement)
		{
			System.out.println("List of matching countries -"+listsofcountries.getText());
			if(listsofcountries.getText().equals(countryName))
			{
			  listsofcountries.click();
			}
		}
	}
	
	public void dropDownExmaplemethod(String optionName)
	{
		Select s= new Select(dropDownExample);
		List<WebElement>ddlist=s.getOptions();
		System.out.println("Select Option1 as value");
		for(WebElement ddlist2:ddlist)
		{
			System.out.println("List of values--- "+ddlist2.getText());
			if(ddlist2.getText().equals(optionName))
			{
				ddlist2.click();
			}
		}
	}
	
	public void selectCheckTwoBoxes()
	{
//		List<WebElement>checklists=driver.findElements(By.xpath("//input[@type='checkbox" + index + "']"));
//		System.out.println("In check list method");
//		for(WebElement chcklistnew:checklists)
//		{
//				chcklistnew.click();
//			
//		}
//		
		for(int i = 1; i < 3; i++) {
			WebElement a = driver.findElement(By.xpath("//input[@value='option" + i + "']"));
			a.click();	
		}
	
	}
	

	
	
}
