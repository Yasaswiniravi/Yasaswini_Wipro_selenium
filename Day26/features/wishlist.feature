Feature:check wishlist
Scenario: show wishlist
Given go to homepage
When open product and add wishlist
Then see product added to wishlist 
