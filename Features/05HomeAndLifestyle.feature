Feature: HomeAndLifestyle feature page

Scenario: Adding product to cart through HomeAndLifestyle link
Given Launching the browser for hlpage
When hitting the url through config file for hlpage
Then hover to the HomeAndLifestyle and select desired option
And select the HomeAndLifestyle product and add it to the cart
And quit the hldriver
