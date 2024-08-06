
Feature: Login Page scenarios

  @tags
  Scenario Outline: Verify login with Username and  password
    Given Open browser
    And Launch Adactin URL "https://adactinhotelapp.com/"
    When Enter Usename "<username>"
    And Enter password "<password>"
    Then Click login button
    
    Examples:
    | username   | password |
    | JothiRavi  | Test@1823|
    | Jothi      | Test     |
    | Ravi       | 1823     |
    
    
   
    
   

  
  

   