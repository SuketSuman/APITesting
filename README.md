Instructions:
1. Clone the GitHub repository in your local
2. Open the project in Eclipse
3. Go to the test runner file in path Employee\src\test\java\cucumber\Options\TestRunner.java
4. Right click TestRunner.java and then click runAs and then click 1 JUnit Test
4. Test results will be filed in .txt files under Employee folder
 
 Following are the result text file for corresponding Scenario
 loggingADD.txt:- Verify status code and message in response when employee is created
 loggingDeleteAemployee.txt:- Verify status code and message in response when a employee is deleted
 loggingGetAemployee.txt:- Verify status code and message in response when user get a employee
 loggingGetAllemployee.txt:- Verify status code and message in response when user get all employees
 loggingUpdate.txt:- Verify status code and message in response when employee is updated
 
 
 
 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Warning : Status code is 429 when some frequent API call are made. This need to be fixed for good results.
 
 Bugs:
 1) End to End functionality of Update API is not working
 2) End to End functionality of Create API is not working
 3) End to End functionality of Delete API is not working
 4) Suc