Feature: ShopByCategory feature page

Scenario: Adding product to cart through ShopByCategory link
Given Launching the browser for sbcpage
When hitting the url through config file for sbcpage
Then hover to the ShopByCategory and select desired option
And select the product and add it to the cart
And quit the sbcdriver
