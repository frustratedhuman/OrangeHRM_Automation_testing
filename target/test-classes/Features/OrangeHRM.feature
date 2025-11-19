@OrangeHRM
 Feature: Login Functionality
###################################################
# 1. Successful Login
###################################################
@ValidLogin
Scenario Outline: User logs in with valid credentials
	Given Open the  browser and launch the application
	Given the user is on the OrangeHRM login page
	When the user enters username "<username>" and password "<password>"
	And clicks the login button
	Then the user should be redirected to the dashboard
	And the welcome message should be displayed
Examples:
| username  |  password  |
| username1 |  password1 |
| username2 |  password2 |

###################################################
# 2. Unsuccessful Login
###################################################
@InvalidLogin
Scenario Outline: User logs in with invalid credentials
	Given Open the  browser and launch the application
	Given the user is on the OrangeHRM login page
	When the user enters username "<username>" and password "<password>"
	And clicks the login button
	Then an error message should be displayed
Examples:
| username  |  password  |
| username1 |  password1 |
| username2 |  password2 |

###################################################
# 3. Login result matches expected outcome
###################################################
#@PassedOutcome  
#Scenario: Login result matches expected outcome
#Given the user attempts to login with username "Admin" and password "admin123"
#When the login is processed
#Then the expected outcome "Dashboard is displayed" should match the real 

###################################################
# .4 Login result matches expected outcome
###################################################   
#@FailedOutcome
#Scenario: Login result does not match expected outcome
#Given the user attempts to login with username "Admin" and password "admin123"
#When the login is processed
#Then the expected outcome "Dashboard is displayed" should not match the real outcome "Error message shown"