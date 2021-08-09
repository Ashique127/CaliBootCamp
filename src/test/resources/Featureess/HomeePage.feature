Feature: Search functionality of Amazon


@SearchCABT
Scenario: Successfully Amazon product search 
Given open application "<URL>"
Then open amazon home page and customer is on home page
Then Enter a product name Phone
Then Click on search Box
Then Search for Samsung and Click
Then Verify Samsung Galaxy S10 