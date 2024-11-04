package com.ncs;

public class Item {
    private String itemName;
    private int quantity;
    private double price;

    public Item(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return itemName;
    }

    public int getQuantity(){
        if(quantity<=0){ //Quantity<=0 case addition to code
            System.out.println("Quantity cannot be less than/ equal to 0");
        }
        return quantity;
    }
}