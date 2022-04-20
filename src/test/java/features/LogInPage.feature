Feature: LogIn Page


Scenario: Verify SuccessFull Login After entering valid credential

Given User is on Home Page
When I enter UserNAme
When I enter Password
And I click on Log In button
Then I verify Pin validation screen is Opened
Then I enter Pin
Then I click on continue button
Then I verify LogIn successful
Then I close The application