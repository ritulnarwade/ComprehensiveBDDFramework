Feature: OfficialMerchandise feature page

Scenario: Adding product to cart through OfficialMerchandise link
Given Launching the browser for ompage
When hitting the url through config file for ompage
Then hover to the OfficialMerchandise and select desired option
And select the OfficialMerchandise product
And quit the omdriver
