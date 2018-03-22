#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Want to check Imanage login functionality
  @ImanageLogin
  Scenario Outline: Title of your scenario
    Given I want to login into imanage with "<companyId>","<employeeId>","<password>"
    When click on the submit button
    Then I will validate the succesful login
    And check more outcomes

    Examples: 
      | companyId | employeeId | password  |
      | Infrasoft | EP3372     | Infra#123 |
