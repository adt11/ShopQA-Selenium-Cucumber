@Checkout
Feature: Checkout Functionality

  Background: Navigation to the Home page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application
    When User select item and add to cart
    Then Verify item should added to the cart

  #data in the form of table like row and coloumn
  @BillingAddress
  Scenario: Fill address field and place order
    When User go to the checkout page
    And User billing address as follows
      | First_Name | Last_Name | Company_Name | Country | Address1 | Address2  | City  | State         | PinCode | Phone      | Email       | comment             |
      | Rajesh     | Shah      | BirlaSoft    | India   | J-61     | Sector-21 | Noida | Uttar Pradesh |  201301 | 9323223424 | ajj@tak.com | call before reached |
    And click terms and click place order
    Then User should able to place order successfully
