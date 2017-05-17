Feature: Testing login page

Scenario: Testing valid username and password

Given User at login page
When I enter Admin  in the username
And I enter Admin  in the password
And I click on login button
Then 'Welcome Admin' message will display at '/html/body/h1'

Scenario: Testing invalid username and valid password

Given User at login page
When I enter xy in the username
And I enter Admin in the password
And I click on login button
Then 'invalid username or password' message will display at '/html/body/h1'

Scenario: Testing valid username and invalid password

Given User at login page
When I enter Admin in the username
And I enter xy in the password
And I click on login button
Then 'invalid username or password' message will display at '/html/body/h1'

Scenario: Testing invalid username and invalid password

Given User at login page
When I enter xy in the username
And I enter xy in the password
And I click on login button
Then 'invalid username or password' message will display at '/html/body/h1'

Scenario: Testing null username and valid password

Given User at login page
When I enter  in the username
And I enter Admin in the password
And I click on login button
Then 'username can not be empty' message will display at '/html/body/h1'

Scenario: Testing valid username and null password

Given User at login page
When I enter Admin in the username
And I enter  in the password
And I click on login button
Then 'password can not be empty' message will display at '/html/body/h1'
