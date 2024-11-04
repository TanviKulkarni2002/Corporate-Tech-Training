## Problem Statement: Testing a Shopping Cart System using JUnit 5 ##

This exercise should be completed using Test Driven Development Technique

  - Write Test classes in the TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below

## Objective:
Implement a basic shopping cart system that allows allows end-users to add, remove and view items.
Write JUnit 5 tests to verify the functionality of the system.

**Note**: (-) indicates private and (+) indicates public

## Requirements:

## ShoppingCart Class:

 - Implement a ShoppingCart class with the following methods:
      +addItem(Item item, int quantity):void - Adds the specified quantity of an item to the cart.
      +removeItem(Item item):void - Removes all quantities of the specified item from the cart.
      +getTotalPrice():double -  Returns the total price of all items in the cart.
      +getItems():List<Item> - Returns a list of all items in the cart.
      +getItemCount():int - Returns the total number of items in the cart.

**Note**: (-) indicates private and (+) indicates public
## Item Class:

- Implement an Item class with the following attributes:
    -name: String.
    -price: double
    + Implement equals() and hashCode() methods to ensure items are compared based on their name and price.

## JUnit 5 Tests:

- Create a test class ShoppingCartTest to test the methods in the ShoppingCart class.
- Write test cases to cover the following scenarios:
    - Adding items increases the item count and total price.
    - Removing items decreases the item count and total price.
    - Adding a duplicate item should update the quantity and total price accordingly.
    - Ensuring that items with the same name and price are treated as the same item.
    - Attempting to add items with negative quantity and Price should throw 
      an IllegalArgumentException with message "Quantity should be a Possitive Integer" and "Price shouble be a Possitive value"

- Use Appropriate Annotations.
- Implement assertions to validate the behavior.

## Deliverables:
- A Java class ShoppingCart.java implementing the required methods.
- A Java class Item.java representing individual items.
- A JUnit 5 test class ShoppingCartTest.java with all the necessary test cases.
- Ensure all test cases pass successfully


## Instructions
- Avoid printing unnecessary values other than expected output as given in the sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding  