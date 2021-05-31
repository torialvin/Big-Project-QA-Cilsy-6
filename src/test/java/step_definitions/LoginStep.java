package step_definitions;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import pageObject.LoginPage;



@SuppressWarnings("deprecation")
public class LoginStep{
    public static WebDriver driver;
    
    public LoginStep()
    {
    	driver = Hooks.driver;
    }
    
  //Negative Login    
    @Given("xuser on login page")
	public void xVisitLoginPage() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
	}

	@When("user15 input value to login using \"(.*)\" as usernamex & \"(.*)\" as passwordx")
	public void inputXCredential(String Xusername, String Xpassword) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setXUsername(Xusername);
		loginPage.setXPassword(Xpassword);
		
	}
	
	@When("xuser click button Login")
	public void xLoginButtonClick() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();

		Thread.sleep(3000);
	}

	@Then("user failed to login and system will be show error message \"(.*)\"")
	public void UnsuccessfulLogIn() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isErrorMessageAppear());
	
    }
	
//Positif Login    
    @Given("User on OrangeHRM login page")
	public static void visitLoginPage1() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
	}

	@When("user4 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public static void inputCredential(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
	}
	
	@When("User click button Login")
	public static void loginButtonClick() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@Then("User succesfully log in and system will be direct to Dashboard OrangeHRM")
	public static void homePageResult1() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginSuccess());
		
    }
	
}