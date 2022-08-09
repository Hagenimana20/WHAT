Feature: Login Functionality Validation
@Scenario100
Scenario: User Should be Able to Login to Techfios 
Given User launch techfios website
When User inserts "username" from data base
When User inserts "password" from data base
When User clicks on login button
Then User should land on Dashboard Page

