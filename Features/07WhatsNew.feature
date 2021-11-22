Feature: WhatsNew feature page

Scenario: looking new product through WhatsNew link
Given Launching the browser for whatsnewpage
When hitting the url through config file for whatsnew page
Then click on the WhatsNew 
And select the product from WhatsNew option
And quit the WhatsNew driver
