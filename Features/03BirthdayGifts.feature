Feature: BirthdyaGifts feature page

Scenario: Adding product to cart through BirthdayGifts link
Given Launching the browser for bgpage
When hitting the url through config file for bgpage
Then hover to the BirthdayGifts and select desired option
And select product and add it to the cart
And quit the bgdriver
