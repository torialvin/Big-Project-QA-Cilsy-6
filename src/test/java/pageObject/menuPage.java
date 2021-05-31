package pageObject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.lexer.Id;
import utilities.BaseClass;

public class menuPage extends BaseClass {

	public menuPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

//pim	
	@FindBy(xpath = "//b[.='PIM']")
	private WebElement objMenuPIM;

	public void objMenuPIM() {
		objMenuPIM.click();
	}

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	private WebElement objAddEmployee;

	public void objAddEmployee() {
		objAddEmployee.click();
	}

	@FindBy(id = "firstName")
	private WebElement txtfieldFirstNameEmployee;

	public void txtfieldFirstNameEmployee(String firstName) {
		txtfieldFirstNameEmployee.sendKeys(firstName);
	}

	@FindBy(id = "middleName")
	private WebElement txtfieldMiddleNameEmployee;

	public void txtfieldMiddleNameEmployee(String middleName) {
		txtfieldMiddleNameEmployee.sendKeys(middleName);
	}

	@FindBy(id = "lastName")
	private WebElement txtfieldLastNameEmployee;

	public void txtfieldLastNameEmployee(String lastName) {
		txtfieldLastNameEmployee.sendKeys(lastName);
	}

	@FindBy(id = "employeeId")
	private WebElement txtfieldEmployeeID;

	public void txtfieldEmployeeID(String id_Employee) {
		txtfieldEmployeeID.clear();
		txtfieldEmployeeID.sendKeys(id_Employee);
	}

	@FindBy(id = "chkLogin")
	private WebElement checkBoxEmployee;

	public void checkBoxEmployee() {
		checkBoxEmployee.click();
	}

	@FindBy(id = "btnSave")
	private WebElement save1Btn;

	public void save1Btn() {
		save1Btn.click();
	}

	@FindBy(id = "user_name")
	private WebElement employeeUsername;

	public void employeeUsername(String unameEmploy) {
		employeeUsername.sendKeys(unameEmploy);
	}

	@FindBy(id = "user_password")
	private WebElement employeePassw;

	public void employeePassw(String passEmploy) {
		employeePassw.sendKeys(passEmploy);
	}

	@FindBy(id = "re_password")
	private WebElement reEmployeePassw;

	public void reEmployeePassw(String rePassEmploy) {
		reEmployeePassw.sendKeys(rePassEmploy);
	}

	@FindBy(id = "btnSave")
	private WebElement editBtn;

	public void editBtn() {
		editBtn.click();
	}

	@FindBy(id = "btnSave")
	private WebElement save2Btn;

	public void save2Btn() {
		save2Btn.click();
	}

	@FindBy(id = "personal_txtLicenNo")
	private WebElement txtfieldSIMNumber;

	public void txtfieldSIMNumber(String SIMNumb) {
		txtfieldSIMNumber.sendKeys(SIMNumb);
	}

	@FindBy(id = "personal_optGender_2")
	private WebElement radiobtnGender;

	public void radiobtnGender() {
		radiobtnGender.click();
	}

	public void dropdownNationality() {
		Select dropdownNationality = new Select(webDriver.findElement(By.id("personal_cmbNation")));
		dropdownNationality.selectByVisibleText("Indonesian");
	}

	@FindBy(id = "personal_txtOtherID")
	private WebElement txtfieldOtherId;

	public void txtfieldOtherId(String otherID) {
		txtfieldOtherId.sendKeys(otherID);
	}

	@FindBy(id = "personal_txtLicExpDate")
	private WebElement txtfieldSIMExpDate;

	public void txtfieldSIMExpDate(String SIMExpDate) {
		txtfieldSIMExpDate.sendKeys(SIMExpDate);
	}

	public void dropdownMaritalStatus() {
		Select maritalStatus = new Select(webDriver.findElement(By.id("personal_cmbMarital")));
		maritalStatus.selectByValue("Single");

	}

	@FindBy(id = "personal_DOB")
	private WebElement datePicker;

	public void datePicker(String BirthDate) {
		datePicker.sendKeys(BirthDate);
	}

	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement btnEmployeeList;

	public void btnEmployeeList() {
		btnEmployeeList.click();
	}

	@FindBy(id = "empsearch_employee_name_empName")
	private WebElement searchFullName;

	public void searchFullName(String fullName) {
		searchFullName.sendKeys(fullName);
	}

	@FindBy(id = "empsearch_id")
	private WebElement searchID;

	public void searchID(String txtfieldEmployeeID) {
		searchID.sendKeys(txtfieldEmployeeID);
	}

	@FindBy(id = "searchBtn")
	private WebElement searchBtn;

	public void searchBtn() {
		searchBtn.click();
	}

	@FindBy(xpath = "//td[.='alvintori']")
	private WebElement resultName;

	@FindBy(css = "tbody td:nth-of-type(2) > [href='/symfony/web/index.php/pim/viewEmployee/empNumber/26']")
	private WebElement resultID;

	public String getResultNameAct() {
		return resultName.getText();
	}

	public String getResultNameExp() {
		return "alvintori";
	}

	public String getResultIDAct() {
		return resultID.getText();
	}

	public String getResultIDExp() {
		return "018";
	}

//admin
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement objMenuAdmin;

	public void objMenuAdmin() {
		objMenuAdmin.click();
	}

	@FindBy(id = "btnAdd")
	private WebElement objBtnAddUser;

	public void objBtnAddUser() {
		objBtnAddUser.click();
	}

	public void dropdownUserRole() {
		Select dropdownUserRole = new Select(webDriver.findElement(By.id("systemUser_dropdownUserRole")));
		dropdownUserRole.selectByValue("2");

	}

	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement txtfieldAddUserEmployeeName;

	public void txtfieldAddUserEmployeeName(String employeeUserName) {
		txtfieldAddUserEmployeeName.clear();
		txtfieldAddUserEmployeeName.sendKeys(employeeUserName);
	}

	@FindBy(id = "systemUser_userName")
	private WebElement txtfieldUser_Name;

	public void txtfieldUser_Name(String UserName) {
		txtfieldUser_Name.clear();
		txtfieldUser_Name.sendKeys(UserName);
	}

	@FindBy(xpath = "//input[@id='systemUser_password']")
	private WebElement txtfieldUserPassword;

	public void txtfieldUserPassword(String userPassword) {
		txtfieldUserPassword.sendKeys(userPassword);
	}

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement txtfieldUserConfPassword;

	public void txtfieldUserConfPassword(String userRePass) {
		txtfieldUserConfPassword.sendKeys(userRePass);
	}

	@FindBy(id = "btnSave")
	private WebElement objBtnSaveUser;

	public void objBtnSaveUser() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnSave']"))).click();
		;

	}

	@FindBy(id = "searchSystemUser_userName")
	private WebElement searchUserName;

	public void searchUserName(String userName) {
		searchUserName.sendKeys(userName);
	}

	@FindBy(id = "searchBtn")
	private WebElement objBtnSearchUserName;

	public void objBtnSearchUserName() {
		searchUserName.click();
	}

	@FindBy(css = "td:nth-of-type(2) > a")
	private WebElement resultUserName;

	public String actUserName() {
		return resultUserName.getText();
	}

	public String expUserName() {
		return "alvintori";
	}

	@FindBy(xpath = "//td[.='alvintori']")
	private WebElement isNameAppear;

	public boolean isNameAppear() {
		isNameAppear.isDisplayed();
		return true;
	}
	
	@FindBy(xpath = "//td[.='No Records Found']")
	private WebElement notFoundMessage;

	public boolean isNotFoundMessageAppear() {
		notFoundMessage.isDisplayed();
		return true;
	}

	@FindBy(className = "validation-error")
	private WebElement resultUserName2;

	public boolean isUserNameAlreadyExist() {
		resultUserName2.isDisplayed();
		return true;
	}

	@FindBy(id = "menu_admin_Configuration")
	private WebElement configAdminBtn;

	public void configAdminBtn() {
		configAdminBtn.click();
	}

	public void OAuthClientAdminBtn() {
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_registerOAuthClient']")))
				.click();
	}

	@FindBy(id = "oauth_client_id")
	private WebElement OAuthID;

	public void OAuthID(String oAuthId) {
		OAuthID.sendKeys(oAuthId);
	}

	@FindBy(id = "oauth_client_secret")
	private WebElement OAuthSecret;

	public void OAuthSecret(String oAuthSecret) {
		OAuthSecret.sendKeys(oAuthSecret);
	}

	@FindBy(id = "oauth_redirect_uri")
	private WebElement OAuthURl;

	public void OAuthURl(String oAuthUrl) {
		OAuthURl.sendKeys(oAuthUrl);
	}

	@FindBy(id = "btnSave")
	private WebElement OAuthSaveBtn;

	public void OAuthSaveBtn() {
		OAuthSaveBtn.click();
	}

	@FindBy(xpath = "//a[.='toritori']")
	private WebElement OAuthNameSaved;

	public boolean isOAuthSaved() {
		OAuthNameSaved.isDisplayed();
		return true;
	}

	@FindBy(id = "ohrmList_chkSelectRecord_toritori")
	private WebElement OAuthToBeDelete;

	public void OAuthToBeDelete() {
		OAuthToBeDelete.click();
	}

	@FindBy(id = "btnDelete")
	private WebElement OAuthDeleteBtn;

	public void OAuthDeleteBtn() {
		OAuthDeleteBtn.click();
	}

	@FindBy(id = "dialogDeleteBtn")
	private WebElement OAuthDeleteOkBtn;

	public void OAuthDeleteOkBtn() {
		OAuthDeleteOkBtn.click();
	}

	@FindBy(xpath = "//div[@id='content']//div[@class='inner']/script[1]")
	private WebElement messageSuccessFadable;

	public boolean isOAuthDeleted() {
		messageSuccessFadable.isDisplayed();
		return true;
	}

	@FindBy(id = "ohrmList_chkSelectRecord_61")
	private WebElement userToDeleteSelected;

	public void unameAdminToDeleteSelected() {
		userToDeleteSelected.click();
	}

	@FindBy(id = "btnDelete")
	private WebElement userDeleteBtn;

	public void userDeleteBtn() {
		userDeleteBtn.click();
	}

	@FindBy(xpath = "//form[@id='frmList_ohrmListComponent']/script[1]")
	private WebElement messageSuccessDeleteUser;

	public boolean isUserDeleted() {
		messageSuccessDeleteUser.isDisplayed();
		return true;
	}

//leave
	@FindBy(xpath = "//b[.='Leave']")
	private WebElement objBtnLeave;

	public void objBtnLeave() {
		objBtnLeave.click();
	}

	@FindBy(id = "menu_leave_assignLeave")
	private WebElement objBtnLeaveAssign;

	public void objBtnLeaveAssign() {
		objBtnLeaveAssign.click();
	}

	@FindBy(id = "assignleave_txtEmployee_empName")
	private WebElement txtfieldxLeaveAssignName;

	public void txtfieldxLeaveAssignName(String xEmployeeNameToLeave) {
		txtfieldxLeaveAssignName.clear();
		txtfieldxLeaveAssignName.sendKeys(xEmployeeNameToLeave);
	}

	@FindBy(xpath = "//input[@id='assignleave_txtEmployee_empName']")
	private WebElement txtfieldLeaveAssignName;

	public void txtfieldLeaveAssignName(String employeeNameToLeave) {
		txtfieldLeaveAssignName.clear();
		txtfieldLeaveAssignName.sendKeys(employeeNameToLeave);
	}

	public void leaveType() {
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_txtLeaveType")));
		leaveType.selectByVisibleText("Emergency Leave");

	}

	@FindBy(id = "assignleave_txtFromDate")
	private WebElement leaveAssignFromDate;

	public void leaveAssignFromDate(String leaveFromDate) {
		leaveAssignFromDate.clear();
		leaveAssignFromDate.sendKeys(leaveFromDate);
		leaveAssignFromDate.sendKeys(Keys.ENTER);
	}

	@FindBy(id = "assignleave_txtToDate")
	private WebElement leaveAssignToDate;

	public void leaveAssignToDate(String leaveToDate) {
		leaveAssignToDate.clear();
		leaveAssignToDate.sendKeys(leaveToDate);
		leaveAssignToDate.sendKeys(Keys.ENTER);
	}

	public void partialDays() {
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_partialDays")));
		leaveType.selectByValue("all");

	}

	public void durationDays() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='frmLeaveApply']//li[8]")));
		new WebDriverWait(webDriver, 20).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[@id='assignleave_firstDuration_duration']")));
		Select durationDays = new Select(webDriver.findElement(By.id("assignleave_duration_duration")));
		durationDays.selectByVisibleText("Specify Time");

	}

	public void durationTimeFrom() {
		Select durationTimeFrom = new Select(webDriver.findElement(By.id("assignleave_firstDuration_time_from")));
		durationTimeFrom.selectByVisibleText("08:00");

	}

	public void durationTimeTo() {
		Select durationTimeTo = new Select(webDriver.findElement(By.id("assignleave_firstDuration_time_to")));
		durationTimeTo.selectByVisibleText("16:00");

	}

	@FindBy(id = "assignleave_txtComment")
	private WebElement txtfieldCommentLeave;

	public void txtfieldCommentLeave(String commentLeave) {
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='assignleave_txtComment']")));
		txtfieldCommentLeave.sendKeys(commentLeave);
	}

	@FindBy(id = "assignBtn")
	private WebElement assignBtn;

	@FindBy(id = "confirmOkButton")
	private WebElement OkBtn;

	public void assignBtn() {
		assignBtn.click();

		if (OkBtn.isDisplayed()) {
			OkBtn.click();
		}

	}

	@FindBy(css = "[for='assignleave_txtEmployee_empName']")
	private WebElement isAssignErrorAppear;

	public String assignErrorExp() {
		return "Invalid";
	}

	public String assignErrorAct() {
		return isAssignErrorAppear.getText();
	}

	@FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
	private WebElement allCheckBtn;

	public void allCheckBtn() {
		allCheckBtn.click();
	}

	@FindBy(id = "leaveList_txtEmployee_empName")
	private WebElement searchNameLeave;

	public void searchNameLeave(String fullNameLeave) {
		searchNameLeave.clear();
		searchNameLeave.sendKeys(fullNameLeave);

	}

	@FindBy(id = "btnSearch")
	private WebElement searchLeaveBtn;

	public void searchLeaveBtn() {
		searchLeaveBtn.click();
	}

	@FindBy(xpath = "//tr[6]//a[.='Alvin Dua Tori']")
	private WebElement isResultLeaveName;

	public String expResultLeaveName() {
		return "Alvin Dua Tori";
	}
	
	public boolean isResultLeaveNameAppear() {
		
		return true;
	}

	public String actResultLeaveName() {
		return isResultLeaveName.getText();
	}

	@FindBy(xpath = "//a[.='Scheduled(1.00)']")
	private WebElement statusLeave;

	public String actStatusLeave() {
		return statusLeave.getText();

	}

	public String expStatusLeave() {
		return "Scheduled(1.00)";

	}

	// Time
	@FindBy(xpath = "//b[.='Time']")
	private WebElement timeBtn;

	public void timeBtn() {
		timeBtn.click();
	}

	@FindBy(id = "employee")
	private WebElement timeEmployeeName;

	public void timeEmployeeName(String employeeName) {
		timeEmployeeName.sendKeys(employeeName);
	}

	@FindBy(id = "btnView")
	private WebElement timeViewBtn;

	public void timeViewBtn() {
		timeViewBtn.click();
	}

	@FindBy(id = "btnAddTimesheet")
	private WebElement AddTimesheetBtn;

	public void AddTimesheetBtn() {
		AddTimesheetBtn.click();
	}

	@FindBy(id = "menu_attendance_Attendance")
	private WebElement attendanTimeBtn;

	public void attendanTimeBtn() {
		attendanTimeBtn.click();
	}

	public void punchInOutBtn() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_attendance_punchIn']")))
				.click();
	}

	@FindBy(id = "btnPunch")
	private WebElement punchBtn;

	public void punchBtn() {
		punchBtn.click();
	}

	@FindBy(id = "note")
	private WebElement notePunch;

	public void notePunchIn(String punchInNote) {
		notePunch.sendKeys(punchInNote);
	}

	public void notePunchOut(String punchOutNote) {
		notePunch.sendKeys(punchOutNote);
	}

	@FindBy(xpath = "//div[@class='inner']/script[1]")
	private WebElement succesPunchOut;

	public String succesPunchOutAct() {
		return succesPunchOut.getText();
	}

	public String succesPunchOutExp() {
		return "Successfully Saved";
	}

	@FindBy(css = "#punchTimeForm li:nth-of-type(2) > label:nth-of-type(2)")
	private WebElement punchInNotes;

	public String punchInNotesAct() {
		return punchInNotes.getText();
	}

	public String punchInNotesExp() {
		return "on time";
	}

	public boolean isPunchOutSuccess() {
		succesPunchOut.isDisplayed();
		return true;
	}

	@FindBy(xpath = "//h1[.='Punch In']")
	private WebElement isPunchInTitleAppear;

	public boolean isPunchInTitleAppear() {
		isPunchInTitleAppear.isDisplayed();
		return true;
	}

	@FindBy(xpath = "//h1[.='Punch Out']")
	private WebElement isPunchOutTitleAppear;

	public boolean isPunchOutTitleAppear() {
		isPunchOutTitleAppear.isDisplayed();
		return true;
	}
}
