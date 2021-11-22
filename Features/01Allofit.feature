Feature: Application Allofit feature page

Scenario: Adding product to cart through addtoit link
Given Launching the browser
When hitting the url through config file
Then click on allofit link
And select product 
Then verify the title of product and add it to the cart

