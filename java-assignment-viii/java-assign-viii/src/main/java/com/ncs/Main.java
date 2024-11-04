package com.ncs;
import java.util.List;

// import ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Create some items
        Item apple = new Item("Apple", 3, 60);
        Item banana = new Item("Banana", 2, 34.33);
        Item orange = new Item("Orange", 5, 45.67);
        Item pineapple = new Item("Pineapple", 0, 89.49); //Quantity<=0 case addition to code

        // Add items to the cart
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code

        // Print total price
        System.out.println("Total Price: Rs. " + cart.getTotalPrice());

        // Print total item count
        System.out.println("Total Item Count: " + cart.getItemCount());

        // Get and print all items in the cart
        List<Item> items = cart.getItems();
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Price: Rs. " + item.getPrice());
        }

        // Remove an item
        cart.removeItem(banana);

        // Print total price after removal
        System.out.println("Total Price after removal: Rs. " + cart.getTotalPrice());

        // Print total item count after removal
        System.out.println("Total Item Count after removal: " + cart.getItemCount());
    }
}
