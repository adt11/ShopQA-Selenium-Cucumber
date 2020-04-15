@Register
Feature: Registeration Functionality

  Background: MyActivity page Common Steps
    Given User Launch browser and open URL http://shop.demoqa.com/
    And User should able to see home page of the application

  Scenario: User able to Register
    When User should able to go the MyAccount page
    And User Enter Username and Email and Password
    And click on the Register button
    Then User should able to Register successfully

  Scenario: User already registred
    When User should able to go the MyAccount page
    And User Enter Username and Email and Password
    And click on the Register button
    Then Verify User Already Registered and getting error message

  #data in the form of table like row and coloumn
  @RegistrationTable
  Scenario: Multiple user Register
    When User should able to go the MyAccount page
    And User Enter Following details
      | UserName | EmailId            | Password          |
      | QA01     | qa01test@gmail.com | Qwerty@1234567890 |
      | QA02     | qa02test@gmail.com | Qwerty@1234567890 |
      | QA03     | qa03test@gmail.com | Qwerty@1234567890 |
    And click on the Register button
    Then User should able to Register


@RegisterOutline
  Scenario Outline: Multiple users Register
    When User should able to go the MyAccount page
    And User Enter <Sr> Following details
      |Sr| UserName| EmailId            | Password          |
      |0| QA01     | qa01test@gmail.com | Qwerty@1234567890 |
      |1| QA02     | qa02test@gmail.com | Qwerty@1234567890 |
      |2| QA03     | qa03test@gmail.com | Qwerty@1234567890 |
    And click on the Register button
    Then User should able to Register

@RegisterData
Examples: Multiple data
			|Sr|
			|0 |
			|1 |
			|2 |



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
    Then User should able to Register
