Feature: Cart Funcationality

  Background: MyActivity page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application

  @sanity
  Scenario: User should able to Register
    When User should able to go the MyAccount page
    And User Enter Username and Email and Password
    And click on the Register button
    Then User should able to Register

  @ewish
  Scenario: User should able to login with valid credentials
    When User should able to go the MyAccount page
    And User enter "qaselenium" and "Qwerty@12" in the Login Frame
    And click on the Login button
    Then User should able to login with valid credentials


  @wish
  Scenario: User able add/remove item to the wish list
    When User select item and add to wish list
    Then Verify item should added to the wish list
    When User click cross button to remove item from wish list
    Then Verify item should removed from the wish list
