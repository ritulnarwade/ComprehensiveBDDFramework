Feature: ChristmasGifts feature page

Scenario: selecting products through Christmas Gifts section
Given Launching the browser for ChristmasGifts
When hitting the url through config file for ChristmasGifts
Then click on the Christmas Gifts
And select option from featured dropdown
Then select christmas product
And quit the christmasgifts driver
