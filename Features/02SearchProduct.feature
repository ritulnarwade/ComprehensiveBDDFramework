Feature: Application search product feature

Scenario Outline: Adding product to cart through BirthdayGifts link
Given Launching the browser for sp
When hitting the url through config file for sp page
Then search product as <Product> through search box
And select the desired product and add it to cart
And quit the driver

Examples:
|Product|
|soft toys|