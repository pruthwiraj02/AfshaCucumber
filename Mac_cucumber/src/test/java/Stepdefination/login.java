package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
		driver.findElement(By.id("email")).sendKeys("er.pruthwirajbarik.com");
		driver.findElement(By.id("pass")).sendKeys("Jiku@9861");

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {

	}

}
