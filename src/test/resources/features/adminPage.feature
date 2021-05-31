@Admin
Feature: Search add, delete, and register Oauth data on Admin Page

	
		@AddData 
		Scenario: Adding new user data and verify data exist
			Given user54 input value to login using "Admin" as username & "s3Kol4HQA!*" as password 
			When 2User click Admin button and click add button to go to add user page
			And User select Admin as role & input "Dity Alf Nia" as employeeUserName & input "fsdssgfdixs85" as userName & input "s3Kol4HQA!*" as userPassword & input "s3Kol4HQA!*" as userRePass & click save button 
			Then User succesfully add new user data
			
			@SearchData
		Scenario: User verify user data entered exist
			Given user356 input value to login using "Admin" as username & "s3Kol4HQA!*" as password
			When User 2 click button admin
			And User input "alvintori" as userName & click search button
			Then User get user data on the list
			
		@SearchRandomData
		Scenario: User searching for random data
			Given user554 input value to login using "Admin" as username & "s3Kol4HQA!*" as password
			When Users 3 click button admin
			And User input "torisd" as xUserNamee & click search button
			Then User get notFoundMessage on the list
		
			
		@regOAuthClient
		Scenario: User register OAuth client
			Given user564 input value to login using "Admin" as username & "s3Kol4HQA!*" as password
			When User 4 click button admin & click button configuration & click button register OAuth client
			And User input "toritori" as oAuthId & input "toritori" as oAuthSecret & input "[ https://orangehrm.github.io/orangehrm-api-doc ]." as oAuthUrl & click button save
			Then User successfully register OAuth client
			
		@deleteOAuthClient
		Scenario: User delete OAuth client data
			Given user549 input value to login using "Admin" as username & "s3Kol4HQA!*" as password
			When User 5 click button admin & click button configuration & click button register OAuth client
			And User click one of data to be delete & click button ok
			Then User successfully delete OAuth client data