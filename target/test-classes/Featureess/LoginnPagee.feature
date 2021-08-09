Feature: Signin with valid credentials



@Login
Scenario: Verify user can signin with valid credentials successfully 
Given open application "<URL>"
Then click on signin button
Then user enter username and password and click on signin
Then verify user can signin and in his own profile page
