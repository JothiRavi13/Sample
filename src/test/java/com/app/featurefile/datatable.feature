
Feature: Login page

 @asList
  Scenario: Valid ate username and password
    When Enter the values present in the form
      | Yuvaraj               |
      | Sekar                 |
      | yuvi.sekar3@gmail.com |
      | Subject               |
   @asLists
  Scenario: Validate username and password
    When Enter the values present in the form asLists
      | Yuvaraj               | Aiite1 | test1 |
      | Sekar                 | Aiite2 | test2 |
      | yuvi.sekar3@gmail.com | Aiite3 | test3 |
      | Subject               | Aiite4 | test4 |
  @asMap
  Scenario: Validate username and password
    When Enter the values present in the form asmap
      | firstname | Yuvaraj               |
      | lastname  | Sekar                 |
      | email     | yuvi.sekar3@gmail.com |
      | subject   | Subject               |
      
      
   
    
   
