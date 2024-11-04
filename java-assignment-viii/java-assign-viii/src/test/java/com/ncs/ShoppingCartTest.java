package com.ncs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import com.ncs.ShoppingCart;
// import com.ncs.Item;

import java.util.List;

public class ShoppingCartTest {
    private ShoppingCart cart;
    private Item apple;
    private Item banana;
    private Item orange;
    private Item pineapple; //Quantity<=0 case addition to code


    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        apple = new Item("Apple", 3, 60);
        banana = new Item("Banana", 2, 34.33);
        orange = new Item("Orange", 5, 45.67);
        pineapple = new Item("Pineapple", 0, 89.49); //Quantity<=0 case addition to code

    }

    @Test
    public void testAddItem() {
        cart.addItem(apple, 3);
        assertEquals(3, cart.getItemCount());
        assertEquals(180, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testRemoveItem() {
        cart.addItem(banana, 2);
        cart.removeItem(banana);
        assertEquals(0, cart.getItemCount());
        assertEquals(0, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testGetItems() {
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code

        List<Item> items = cart.getItems();
        assertEquals(3, items.size());
        assertTrue(items.contains(apple));
        assertTrue(items.contains(banana));
        assertTrue(items.contains(orange));
        assertFalse(items.contains(pineapple)); //Quantity<=0 case addition to code

    }

    @Test
    public void testTotalPrice() {
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code
        assertEquals(180 + 68.66 + 228.35, cart.getTotalPrice(), 0.01); 
    }

    @Test
    public void testTotalItemCount() {
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code
        assertEquals(10, cart.getItemCount());
    }

    @Test
    public void testTotalPriceAfterRemoval() {
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code
        cart.removeItem(banana);
        assertEquals(180 + 228.35, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testTotalItemCountAfterRemoval() {
        cart.addItem(apple, 3);
        cart.addItem(banana, 2);
        cart.addItem(orange, 5);
        cart.addItem(pineapple, 0); //Quantity<=0 case addition to code
        cart.removeItem(banana);
        assertEquals(8, cart.getItemCount());
    }
}
