package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.menuPage;

public class AdminStep {
	public static WebDriver driver;

	public AdminStep() {
		driver = Hooks.driver;
	}

	// addData
	@Given("user54 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage2(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("2User click Admin button and click add button")
	public void goToAdminPageToAddUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuAdmin();
		Thread.sleep(3000);
		AllPage.objBtnAddUser();
		Thread.sleep(5000);

	}

	@When("User select Admin as role & input \"(.*)\" as employeeUserName & input \"(.*)\" as userName & input \"(.*)\" as userPassword & input \"(.*)\" as userRePass & click save button")
	public void inputCredentialToAddUser(String employeeUserName, String userName, String userPassword,
			String userRePass) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldAddUserEmployeeName(employeeUserName);
		Thread.sleep(5000);
		AllPage.txtfieldUser_Name(userName);
		Thread.sleep(5000);
		AllPage.txtfieldUserPassword(userPassword);
		AllPage.txtfieldUserConfPassword(userRePass);
		AllPage.objBtnSaveUser();
		Thread.sleep(5000);

	}

	@Then("User succesfully add new user data")
	public void userSuccessfullAddNewUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		if (AllPage.isUserNameAlreadyExist()) {
			System.out.println("Username Already Exist");
		} else {
			System.out.println("successfull");
		}

	}

	// searchData
	@Given("user356 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage8(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 2 click button admin")
	public void goToAdminPageSearchToUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuAdmin();
		Thread.sleep(5000);
	}

	@When("User input \"(.*)\" as userName & click search button")
	public void inputCredentialToSearchUser(String userName) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.searchUserName(userName);
		AllPage.searchBtn();
		Thread.sleep(5000);
	}

	@Then("User get user data on the list")
	public void GetUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		// Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Assert.assertTrue(AllPage.isNameAppear());

	}

	// search random data
	@Given("user554 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage4(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("Users 3 click button admin")
	public void goToAdminPageSearchToXUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuAdmin();
		Thread.sleep(5000);
	}

	@When("User input \"(.*)\" as xUserNamee & click search button")
	public void inputCredentialToSearchXUser(String xUserNamee) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.searchUserName(xUserNamee);
		AllPage.searchBtn();
		Thread.sleep(5000);
	}

	@Then("User get notFoundMessage on the list")
	public void xGetUser() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		//Assert.assertTrue(AllPage.isNotFoundMessageAppear());

	}

	// regOAuthClient
	@Given("user564 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage5(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 4 click button admin & click button configuration & click button register OAuth client")
	public void userGoToRegOAuthClient() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuAdmin();
		Thread.sleep(3000);
		AllPage.configAdminBtn();
		Thread.sleep(5000);
		AllPage.OAuthClientAdminBtn();
	}

	@When("User input \"(.*)\" as oAuthId & input \"(.*)\" as oAuthSecret & input \"(.*)\" as oAuthUrl & click button save")
	public void inputCredentialToRegOAuthClient(String oAuthId, String oAuthSecret, String oAuthUrl) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.OAuthID(oAuthId);
		;
		AllPage.OAuthSecret(oAuthSecret);
		AllPage.OAuthURl(oAuthUrl);
		AllPage.OAuthSaveBtn();
		Thread.sleep(5000);
	}

	@Then("User successfully register OAuth client")
	public void successfullyRegisterOAuthClient() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		Assert.assertTrue(AllPage.isOAuthSaved());

	}

	// deleteAOuthClient
	@Given("user549 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage6(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 5 click button admin & click button configuration & click button register OAuth client")
	public void goToConfigAdminPageToDeleteOAuthClient() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuAdmin();
		Thread.sleep(5000);
		AllPage.configAdminBtn();
		Thread.sleep(5000);
		AllPage.OAuthClientAdminBtn();
		Thread.sleep(5000);
	}

	@When("User click one of data to be delete & click button ok")
	public void selectOAuthClientToBeDelete() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.OAuthToBeDelete();
		AllPage.OAuthDeleteBtn();
		Thread.sleep(5000);
		AllPage.OAuthDeleteOkBtn();
		Thread.sleep(5000);
	}

	@Then("User successfully delete OAuth client data")
	public void successfullyDeleteOAuthClient() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		Assert.assertTrue(AllPage.isOAuthDeleted());

	}

}
