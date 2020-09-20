Feature: Validating Employee API

Scenario: Verify status code and message in response when employee is created
	Given Add Employee payload
	When user calls "createAPI" with Post request
	Then the status code is 200
	And "message" in response body is "Successfully! Record has been added."
	
Scenario: Verify status code and message in response when employee is updated
	Given Update Employee payload
	When user calls updateAPI with Put request
	Then the status code is 200
	And "message" in response body is "Successfully! Record has been updated."

Scenario: Verify status code and message in response when user get a employee
	Given get a employee
	When user calls getPI with GET request
	Then the status code is 200
	And "message" in response body is "Successfully! Record has been fetched."
	
Scenario: Verify status code and message in response when a employee is deleted
	Given delete a employee
	When user calls deleteAPI with delete request
	Then the status code is 200
	And "message" in response body is "Successfully! Record has been deleted"
	
Scenario: Verify status code and message in response when user get all employees
	Given get all employees
	When user calls getAllAPI with GET request
	Then the status code is 200
	And "message" in response body is "Successfully! All records has been fetched."
	