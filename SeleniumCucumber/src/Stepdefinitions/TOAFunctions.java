package Stepdefinitions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class TOAFunctions 
{
	WebDriver driver;
	
	@Given("^Open Chrome browser$")
	public void open_Chrome_browser() 
	{
	   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChromedriverexefile\\chromedriver_win32\\chromedriver.exe");	
	   driver=new ChromeDriver(); 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com");
	   System.out.println("Browser launched succesfully");
	    
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password()  
	{
	    String Title=driver.getTitle();
	    System.out.println("The title is "+ Title);
	    Assert.assertEquals(Title,"Facebook – log in or sign up");
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("8008830532");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("sydulubabukadama");
		 
	    
	    
	}

	@Then("^I logined sucessfully$")
	public void i_logined_sucessfully() 
	{
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@type='submit']")).click();
		 System.out.println("Logined succesfully");
		 driver.quit();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
