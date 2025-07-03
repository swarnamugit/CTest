package ClassFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	

WebDriver driver;
	

	@Given("Application is open")
	public void application_is_open() {
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	}

	@When("I login with user {string} and pass {string}")
	public void i_login_with_username_and_password(String usern, String passn) {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    driver.findElement(By.name("username")).sendKeys(usern);

	    
	    driver.findElement(By.name("password")).sendKeys(passn);
	}

	@Then("the Application should open")
	public void the_application_should_open() {
		System.out.println("page executed");
	}



}
