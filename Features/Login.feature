Feature: Test login scenario
Scenario: Check login is successfull with valid credentials

Given user is on login page
When user enter username and password
And clicks on login button
Then user should navigate to dashboard


