@Login
Feature: Login Functionality

  Background: MyActivity page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application

  @JustLogin
  Scenario: User should able to login with valid credentials
    When User should able to go the MyAccount page
    And User enter "qaselenium" and "Qwerty@12" in the Login Frame
    And click on the Login button
    Then User should able to login with valid credentials
    When User click on Logout button
    Then User should able to logout successfully
    
      
   @SingleLogin
   Scenario Outline: After login user should able to click on menu items and logout
    When User should able to go the MyAccount page
    And User enter Single <User> and Single <Pass> in the Login Frame
    And click on the Login button
    Then User should able to login with valid credentials
    And User should able to click on Dashboard menu
    And User should able to click on Order menu
    And User should able to click on Addresses menu
    And User should able to click on Account details menu
    And User should able to click on Downloads menu
    When User click on Logout button
    Then User should able to logout successfully
    
    @SingleData
    Examples: 
      | User   | Pass  |
      | qaselenium | Qwerty@12 |

  
  @MultipleLogin
  Scenario Outline: User should not able to login with invalid credentials
    When User should able to go the MyAccount page
    And User enter Multiple <UserName> and Multiple <PassWord>
    And click on the Login button
    Then User should not able to login and getting error message

    @MutipleData
    Examples: 
      | UserName | PassWord  |
      | User1    | Password1 |
      | User2    | Password2 |
      | User3    | Password3 |
      | User4    | Password4 |

    
