Feature: Shopping Basket functionality
  Scenario: Verify shopping basket updates quantities of selected products
    When user opens 'http:demo.nopcommerce.com'
    Then user should see nopcommerce logo
    When user goes in 'Computers' page
    Then user should see 'Computers'
    When user goes in 'Notebooks' page
    Then user should see 'Notebooks'
    When user select 'Apple MacBook Pro 13-inch'
    Then user should see 'Apple MacBook Pro 13-inch'
    When user click Add to cart
    Then shopping cart quantity should be '1'
    When user select 'Books'
    Then user should see 'Books'
    When user select 'First Prize Pies'
    Then user should see 'First Prize Pies'
    When user select Add to cart
    Then shopping cart quantity should be '2'