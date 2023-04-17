Feature: Add Product to Cart

  Scenario Outline: Add Product to Cart
    Given User logged in the app using username "<UserName>" and password "<Password>"
    When user sorts by prices high to low
    And user selects Source labs Bike Light
    And user add this element to cart
    And user goes to cart
    Then user validate that all products selected are in the cart

    Examples:
      | UserName      | Password     |
      | standard_user | secret_sauce |

