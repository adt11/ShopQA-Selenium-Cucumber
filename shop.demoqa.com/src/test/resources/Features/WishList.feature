@myWishList
Feature: Wishlist Funcationality

  Background: MyActivity page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application


  @WishList
  Scenario: User able add/remove item to the wish list
    When User select item and add to wish list
    Then Verify item should added to the wish list
    When User click cross button to remove item from wish list
    Then Verify item should removed from the wish list
