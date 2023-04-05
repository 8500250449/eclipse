Feature: Verify the login
 
  Scenario: Login to opencart
  
  Given launch the URL
  And Navigate the URL
  And enter the username and password
  When click on login button
  Then login should be successful