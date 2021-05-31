package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.menuPage;

public class timeMenu {
	public static WebDriver driver;

	public timeMenu() {
		driver = Hooks.driver;
	}


	@Given("User 9 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage8(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 9 click time button & click attendance button & click punch in button")
	public void goToTimePunchInPage() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.timeBtn();
		Thread.sleep(3000);
		AllPage.attendanTimeBtn();
		AllPage.punchInOutBtn();

	}

	@When("User input \"(.*)\" as punchInNote & click punch in button")
	public void inputNotesToPunchIn(String punchInNote) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.notePunchIn(punchInNote);
		AllPage.punchBtn();
		Thread.sleep(3000);
	}

	@Then("User succesfully punch in")
	public void successfulPunchIn() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		Assert.assertEquals(AllPage.punchInNotesAct(), AllPage.punchInNotesExp());
		}
	
	@Then("User input \"(.*)\" as punchOutNote & click punch out button")
	public void clickPunchOut(String punchOutNote) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.notePunchOut(punchOutNote);
		AllPage.punchBtn();
		Thread.sleep(3000);
	}

	@Then("User succesfully punch out")
	public void successfulPunchOut() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		Assert.assertTrue(AllPage.isPunchOutSuccess());
		Thread.sleep(5000);
	}

}
