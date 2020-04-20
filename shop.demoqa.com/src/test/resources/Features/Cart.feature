@cart
Feature: Cart Funcationality

  Background: MyActivity page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application


  @mycart
  Scenario: User able add/remove item to the cart
    When User select item and add to cart
    Then Verify item should added to the cart
    When User click cross button to remove item from cart
    Then Verify item should removed from the cart
