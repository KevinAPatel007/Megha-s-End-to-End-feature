@login
Feature: Login
  Scenario: Validate login with valid email and password
    Given I am on the home page
  When I click on log in on login page
  And I enter email "test@gmail.com" and password "hello@123"
 And I click on log in on login page
Then I see Login was unsuccessful. so i need to register onthe website
