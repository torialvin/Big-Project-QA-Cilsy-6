package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.menuPage;

public class leaveMenu {

	public static WebDriver driver;

	public leaveMenu() {
		driver = Hooks.driver;
	}

	// Negative
	@Given("6user input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage4(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("1User click button leave & button assign leave")
	public void goToAssignLeave1() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objBtnLeave();
		Thread.sleep(3000);
		AllPage.objBtnLeaveAssign();

	}

	@When("User input \"(.*)\" as xEmployeeNameToLeave & select leave type & input \"(.*)\" as leaveFromDate & select partialDays & input \"(.*)\" as leaveToDate & input \"(.*)\" as commentLeave & click assign button")
	public void inputFailedAssign(String xEmployeeNameToLeave, String leaveFromDate, String leaveToDate,
			String commentLeave) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldxLeaveAssignName(xEmployeeNameToLeave);
		AllPage.leaveType();
		AllPage.leaveAssignFromDate(leaveFromDate);
		AllPage.leaveAssignToDate(leaveToDate);
		AllPage.txtfieldCommentLeave(commentLeave);
		AllPage.assignBtn();

		Thread.sleep(3000);
	}

	@Then("User cant assign leave and get error Message bellow employee name")
	public void UnsuccessfulAssignLeave() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		Assert.assertEquals(AllPage.assignErrorExp(), AllPage.assignErrorAct());

	}

	// Positif
	@Given("7user input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage5(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("2User click button leave & button assign leave")
	public void goToAssignLeave2() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objBtnLeave();
		Thread.sleep(3000);
		AllPage.objBtnLeaveAssign();
		Thread.sleep(5000);

	}

	@When("User input \"(.*)\" as employeeNameToLeave & select leave type & input \"(.*)\" as leaveFromDate & input \"(.*)\" as leaveToDate & select partial days")
	public void inputAssignLeave(String employeeNameToLeave, String leaveFromDate, String leaveToDate) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldLeaveAssignName(employeeNameToLeave);
		AllPage.leaveType();
		Thread.sleep(5000);
		AllPage.leaveAssignFromDate(leaveFromDate);
		Thread.sleep(5000);
		AllPage.leaveAssignToDate(leaveToDate);
		Thread.sleep(5000);

	}

	@When("User User select duration days & select time from & select time to & input \"(.*)\" as commentLeave & click assign button")
	public void InputAssignLeaveSpecified(String commentLeave) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldCommentLeave(commentLeave);
		Thread.sleep(5000);
		AllPage.assignBtn();
				
	}

	@Then("User successfully assign leave")
	public void successfulAssignLeave() throws Throwable {

	}
	
	
//Search	
	@Given("8user input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage6(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("3User click button leave")
	public void goToLeaveList() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objBtnLeave();
		Thread.sleep(3000);
		
	}

	@When("User click chek all status leave & input \"(.*)\" as fullNameLeave & click search button")
	public void inputCredentialToFindDataLeave(String fullNameLeave) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.allCheckBtn();
		AllPage.searchNameLeave(fullNameLeave);
		AllPage.searchLeaveBtn();

		Thread.sleep(3000);
	}

	@Then("User get the result on leave list")
	public void getSuitableResultLeave() throws Throwable {
		Thread.sleep(5000);
		menuPage AllPage = new menuPage(driver);
		Thread.sleep(5000);
		//Assert.assertEquals(AllPage.actResultLeaveName(), AllPage.expResultLeaveName());

	}
	
}
