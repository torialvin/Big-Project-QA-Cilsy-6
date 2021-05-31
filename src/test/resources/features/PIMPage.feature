@PIM
Feature: PIM

	@employeeList 
	Scenario: add and complete data of employee 
		Given user2 input value to login using "Admin" as username & "s3Kol4HQA!*" as password 
		When User9 click Header menu PIM & drag cursor to menu add employee then click
		And User input "trofdd" as firstName & input "broe" as middleName & input "alssstor" as lastName & input "0523" as id_Employee & click checkBox create login details
		And input "torixs14" as employeeUsername & input "s3Kol4HQA!*" as employeePassw & input "s3Kol4HQA!*" as reEmployeePassw & click save btn & click edit btn
		And input "56415434354" as SIMNumb & click radio button gender & select dropdown nationality & input "3272535214454165" as otherID & input "2024-05-21" as SIMExpDate & select marital status & input "1999-05-21" as BirthDate & click save btn
		Then User succesfully add employee and system will be direct to profile detail that employee created
		
	@searchEmployee
	Scenario: search employee 
		Given user3 input value to login using "Admin" as username & "s3Kol4HQA!*" as password 
		When User10 click Header menu PIM & drag cursor to menu employee list then click 
		And User input "trofdd broe alssstor" as fullName & input "0523" as idEmployee & click search btn 
		Then User get employee on the list
		
	
	

