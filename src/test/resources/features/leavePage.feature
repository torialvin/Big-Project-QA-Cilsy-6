@Leave
Feature: User can Assign & search Leave

	@assignLeave @negativeLeave
	Scenario: User  failed to assign leave
		Given 6user input value to login using "Admin" as username & "s3Kol4HQA!*" as password
		When 1User click button leave & button assign leave
		And User input "tori" as xEmployeeNameToLeave & select leave type & input "2021-05-28" as leaveFromDate & select partialDays & input "2021-05-28" as leaveToDate & input "mudik" as commentLeave & click assign button
		Then User cant assign leave and get error Message bellow employee name 
	
	@assignLeave @positiveLeave
	Scenario: User successfully assign leave 
		Given 7user input value to login using "Admin" as username & "s3Kol4HQA!*" as password
		When 2User click button leave & button assign leave
		And User input "Alvin Dua Tori" as employeeNameToLeave & select leave type & input "2021-05-31" as leaveFromDate & input "2021-06-01" as leaveToDate & select partial days 
		And User User select duration days & select time from & select time to & input "mudik" as commentLeave & click assign button 
		Then User successfully assign leave 
		
	@searchLeave
	Scenario: User search assign on the list 
		Given 8user input value to login using "Admin" as username & "s3Kol4HQA!*" as password
		When 3User click button leave
		And User click chek all status leave & input "Alvin Dua Tori" as fullNameLeave & click search button 
		Then User get the result on leave list 