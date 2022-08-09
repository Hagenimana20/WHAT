@NegativeLoginfeatures @regression
Feature: Negative Login Functionality Validation
Background:
Given User launch techfios website
@scenario1 @smoke
Scenario Outline: User Should not be Able to Login to Techfios
When User inserts username"<username>"
When User inserts password"<password>"
When User clicks on login button
Then User should land on Dashboard Page

Examples:
	|username|password|
	|demo2@techfios.com|abc123|
	|demo@techfios.com|abc124|
	|demo2@techfios.com|abc124|


