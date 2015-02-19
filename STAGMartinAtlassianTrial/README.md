This test case is to test trial as a new user scenario on https://www.atlassian.com/
The scenarios will be implemented on firefox webdriver using Data Driven, Page object modular framework and report the test result in testNG:
As for the data, please find at "STAG\STAGMartinAtlassianTrial\src\stag\martin\atlassian\trial\testdata\FormData.xlsx" and change the "site address" and "email" to avoid duplication.

1. Launch firefox and go to URL Atlassian
2. Click "Try"
3. Select "Confluence"
4. Compare all 4 products' price and choose the most expensive one and record the product features like "Confluence", "Confluence Team Calendars", Confluence Questions into Java runtime variables, click "Free Trial" button
5. Verify the price: "$30/mo" should be identical on previous and current page
5. Click "Next" to next page
6. Fill in information required in each field with specified data in database which should be valid for this scenario and click "Next"
8. Check the Confirmation page elements and verify the Siteaddress same as in Database.
