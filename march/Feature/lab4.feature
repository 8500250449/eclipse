Feature: Verify the the product is added to the cart
 
  Scenario: Add product to cart in opencart
  
  Given launch the URL
  And Navigate the URL
  And click on the mac
  And click on the sortlist1
  When click on add to cart button
  Then product should be add to cart successfully