package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.menuPage;

public class PIMMenu {
	public static WebDriver driver;

	public PIMMenu() {
		driver = Hooks.driver;
	}

	@Given("user2 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPagee(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User9 click Header menu PIM & drag cursor to menu add employee then click")
	public void goToAddEmployee() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuPIM();
		Thread.sleep(5000);
		AllPage.objAddEmployee();
		Thread.sleep(5000);

	}

	@When("User input \"(.*)\" as firstName & input \"(.*)\" as middleName & input \"(.*)\" as lastName & input \"(.*)\" as id_Employee & click checkBox create login details")
	public void inputEmployeeData1(String firstName, String middleName, String lastname, String id_Employee)
			throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldFirstNameEmployee(firstName);
		AllPage.txtfieldMiddleNameEmployee(middleName);
		AllPage.txtfieldLastNameEmployee(lastname);
		AllPage.txtfieldEmployeeID(id_Employee);
		AllPage.checkBoxEmployee();
		Thread.sleep(3000);

	}

	@When("^input \"(.*)\" as employeeUsername & input \"(.*)\" as employeePassw & input \"(.*)\" as reEmployeePassw & click save btn & click edit btn")
	public void inputEmployeeData2(String unameEmploy, String passEmploy, String rePassEmploy) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.employeeUsername(unameEmploy);
		AllPage.employeePassw(passEmploy);
		AllPage.reEmployeePassw(rePassEmploy);
		AllPage.save1Btn();
		Thread.sleep(5000);
		AllPage.editBtn();

	}

	@When("input \"(.*)\" as SIMNumb & click radio button gender & select dropdown nationality & input \"(.*)\" as otherID & input \"(.*)\" as SIMExpDate & select marital status & input \"(.*)\" as BirthDate & click save btn")
	public void inputEmployeeData3(String SIMNumb, String otherID, String SIMExpDate, String BirthDate)
			throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.txtfieldSIMNumber(SIMNumb);
		AllPage.radiobtnGender();
		AllPage.dropdownNationality();
		AllPage.txtfieldOtherId(otherID);
		AllPage.txtfieldSIMExpDate(SIMExpDate);
		AllPage.dropdownMaritalStatus();
		AllPage.datePicker(BirthDate);
		AllPage.save2Btn();

	}

	@Then("User succesfully add employee and system will be direct to profile detail that employee created")
	public void successfulAddEmployee() throws Throwable {
		
	}

//search
	@Given("user3 input value to login using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage3(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User10 click Header menu PIM & drag cursor to menu employee list then click")
	public void goToSearchEmployee() throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.objMenuPIM();
		Thread.sleep(5000);
	}

	@When("User input \"(.*)\" as fullName & input \"(.*)\" as idEmployee & click search btn")
	public void inputSearchData(String fullName, String idEmployee) throws Throwable {
		menuPage AllPage = new menuPage(driver);
		AllPage.searchFullName(fullName);;
		AllPage.searchID(idEmployee);
		AllPage.searchBtn();;
		Thread.sleep(3000);

	}

	@Then("User get employee on the list")
	public void successfulGetEmployee() throws Throwable {
		
	
//		  menuPage AllPage = new menuPage(driver);
//		  Assert.assertEquals(AllPage.assignErrorAct(), AllPage.assignErrorExp());
//		  Assert.assertEquals(AllPage.getResultIDAct(), AllPage.getResultIDExp());
		 
	}
}
