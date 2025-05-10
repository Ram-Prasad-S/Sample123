Feature: Testing Login Functionality using  Automation in orange hrm

Scenario: TC01- Login Functionality

		Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User Enters Usename as "Admin"
    And User Enters Password as "admin123"
    Then Click on Login Button