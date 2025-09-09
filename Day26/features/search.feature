Feature: check search
Scenario: check search button working 
Given search button in browser 
When enter <product>
Then list of products available 
Examples:
|product|
|phone|
|Bag|
|book|