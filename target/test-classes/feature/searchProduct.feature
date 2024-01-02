Feature: Search and Place order for Product

Scenario: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User search with shortname "Tom" and extracted actual home of product 
Then User searched for "Tom" some shorname is offers page to check is product exist with same name
And validate product name in offeres matches with Landing page