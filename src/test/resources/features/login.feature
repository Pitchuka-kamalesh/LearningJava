Feature: Check the Login function

  Background:
    Given I am on the Orange HRM login page

  Scenario: Successfully login with the valid credentials
    Given I have enter valid username and password
    When  I clicked on the login button
    Then  I should be logged in successfully

#  Scenario Outline: Unsuccessfully login with invalid or empty credentials
#    Given  I have enter "<username>" and "<password>"
#    When I click on the login button
#    Then It should show an error message indicating "<error>"
#
#    Examples:
#    |username|password|error|
#    |   admin     |    admin    |Invalid credentials   |
#    |  Admin      |    admin      |  Invalid credentials    |
#    |        |        |  Required   |