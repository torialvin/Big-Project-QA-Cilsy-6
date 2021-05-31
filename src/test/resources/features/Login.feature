@LoginPage
Feature: Login

	@NegativeCase
	Scenario: User failed to Login 
		Given xuser on login page
		When user15 input value to login using "admin" as usernamex and "sekolahqa" as passwordx
    And xuser click button Login
    Then user failed to login and system will be show error message "Invalid credentials"
	
	@PositiveCase
	Scenario: User successfully log in 
		Given User on OrangeHRM login page
		When user4 input value to login using "Admin" as username & "s3Kol4HQA!*" as password 
		And User click button Login
		Then User succesfully log in and system will be direct to Dashboard OrangeHRM
