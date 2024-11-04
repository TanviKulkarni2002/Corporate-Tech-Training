package com.ncs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingCart {
    HashMap<Item, Integer> Inventory = new HashMap<>();

    public void addItem(Item item, int quantity) {
        if(quantity<=0){ //Quantity=0 case addition to code
            System.out.println("Quantity of item cannot be less than/ equal to 0. Item will not be added.");
        }
        else{
            Inventory.put(item, quantity);
        }
    }

    public void removeItem(Item item) {
        Inventory.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : Inventory.keySet()) {
            totalPrice += item.getPrice() * Inventory.get(item);
        }
        return totalPrice;
    }

    public List<Item> getItems() {
        return new ArrayList<>(Inventory.keySet());
    }

    public int getItemCount() {
        int totalQuantity = 0;
        for (int q : Inventory.values()) {
            totalQuantity += q;
        }
        return totalQuantity;
    }

}