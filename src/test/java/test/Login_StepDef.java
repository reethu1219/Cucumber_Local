package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.en.And;import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login_StepDef {
	
	WebDriver driver;
	
	@Before		//hooks
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/home/reethacmtecnotr/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver","/home/reethacmtecnotr/Downloads/geckodriver");
		
		driver = new ChromeDriver();
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
		
	}
	
	
	@Given("^User has opened amazon website on Chrome Browser$")
    public void user_has_opened_amazon_website_on_chrome_browser() throws Throwable {
		
		        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
       // driver.quit();
    }

    @When("^User enters correct username and password$")
    public void user_enters_correct_username_and_password() throws Throwable {
WebElement SignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        
        SignIn.click();
        
        WebElement Email = driver.findElement(By.id("ap_email"));
        Email.sendKeys("abc@xyz.com");
        
        WebElement Coninue = driver.findElement(By.id("continue"));
        Coninue.click();
        
    }
    
    @When("^User enters correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_correct_something_and_something(String username, String password) throws Throwable {
    	WebElement linkLogin= driver.findElement(By.linkText("Log in"));
		linkLogin.click();
		
		
		WebElement editUsername=driver.findElement(By.name("user_login"));
		editUsername.sendKeys(username);
		
		
		WebElement editPwd=driver.findElement(By.name("user_pwd"));
		editPwd.sendKeys(password);
		
		
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		chkBox.click();
		
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		btnPwd.click();
    }


    @When("^User enters incorrect username and password$")
    public void user_enters_incorrect_username_and_password() throws Throwable {
    
    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        
    }

    @Then("^User should not be able to login successfully$")
    public void user_should_not_be_able_to_login_successfully() throws Throwable {
       
    }


}
