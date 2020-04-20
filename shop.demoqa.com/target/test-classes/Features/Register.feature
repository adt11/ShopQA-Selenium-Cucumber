@Register
Feature: Registeration Functionality

  Background: MyActivity Registration page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application

  @JustRegister
  Scenario: User able to Register
    When User should able to go the MyAccount page
    And User Enter "QA16" and "qa16test@gmail.com" and "Qwerty@1234567890"
    And click on the Register button
    Then User should able to Register successfully

  @JustRegister
  Scenario: User already registred
    When User should able to go the MyAccount page
    And User Enter "qaselenium" and "qa07test1957@gmail.com" and "Qwerty@1234567890"
    And click on the Register button
    Then Verify User Already Registered and getting error message

  #data in the form of table like row and coloumn
  @RegistrationTable
  Scenario: Multiple user Register
    When User should able to go the MyAccount page
    And User Enter Following details
      | UserName | EmailId            | Password          |
      | QA02     | qa02test@gmail.com | Qwerty@1234567890 |
    And click on the Register button
    Then User should able to Register successfully

  @RegisterOutline
  Scenario Outline: Multiple users Register
    When User should able to go the MyAccount page
    And User Enter <Sr> Following details 
      | Sr | UserName | EmailId            | Password          |
      |  1 | QA21     | qa21test@gmail.com | Qwerty@1234567890 |
      |  2 | QA22     | qa22test@gmail.com | Qwerty@1234567890 |
      |  3 | QA23     | qa23test@gmail.com | Qwerty@1234567890 |
    And click on the Register button
    Then User should able to Register successfully

    @RegisterData
    Examples: Multiple data
      | Sr |
      |  1 |
      |  2 |
      |  3 |

  # Data in the form of Map like key pair value
  @RegistrationMap
  Scenario: Multiple user Register
    When User should able to go the MyAccount page
    And User Enter Following details
      | Fields   | Values             |
      | UserName | QA04               |
      | EmailId  | qa04test@gmail.com |
      | Password | Qwerty@1234567890  |
    And click on the Register button
    Then User should able to Register successfully
