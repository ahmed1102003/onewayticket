Feature: Testing login page

Scenario: Testing valid compnay and rest

Given User at login page
When I enter test1 in the name
And I enter a1 in the recipients
And I enter SF in the location
And I click on Search button



#Scenario: Testing invalid username and valid password

#Then 'Srroy the rest is close right now' message will display at '/html/body/pre'

#Given User at login page
#When I enter xy in the username
#And I enter Admin in the password
#And I click on login button
#Then 'invalid username or password' message will display at '/html/body/h1'

#Scenario: Testing valid username and invalid password

#Given User at login page
#When I enter Admin in the username
#And I enter xy in the password
#And I click on login button
#Then 'invalid username or password' message will display at '/html/body/h1'

#Scenario: Testing invalid username and invalid password

#Given User at login page
#When I enter xy in the username
#And I enter xy in the password
#And I click on login button
#Then 'invalid username or password' message will display at '/html/body/h1'

#Scenario: Testing null username and valid password

#Given User at login page
#When I enter  in the username
#And I enter Admin in the password
#And I click on login button
#Then 'username can not be empty' message will display at '/html/body/h1'

#Scenario: Testing valid username and null password

#Given User at login page
#When I enter Admin in the username
#And I enter  in the password
#And I click on login button
#Then 'password can not be empty' message will display at '/html/body/h1'
