Feature: CorporateGifts feature page

Scenario: selecting products through Corporate Gifts section
Given Launching the browser for CorporateGifts
When hitting the url through config file for CorporateGifts
Then click on the CorporateGifts Gifts
And Enter email,name,phoneno
Then click on submit
And quit the cgdriver
