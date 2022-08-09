@Loginfeatures @regression
Feature: Login Functionality Validation

Scenario: User Should be Able to Login to Techfios 
Given User launch techfios website
When User inserts username"demo@techfios.com"
When User inserts password"abc123"
When User clicks on login button
Then User should land on Dashboard Page