
Feature: Login Page

 Background: 
 
 Given OpenBrowser and launchURL
 
 @smoke
  Scenario: Validate the correct username and password
    When Enter the username "aiite"
    And Enter the password "12324"
    And Click the login button
    Then Validate the Home page

  @smoke
  Scenario: Validate the incorrect username and password
    When Enter the username "aiite23324"
    And Enter the password "1232442434"
    And Click the login button
    Then Validate the Home page