package com.stackroute.oops;

public class Main {
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        System.out.println("Product name for mentioned code: "+ps.findProductNameByCode(103));
        System.out.println("Maximum priced product in mentioned category is: "+ps.findMaxPriceProductInCategory("COMPUTERS"));
        Product[] products = ps.getProductsByCategory("CLOTHING");
        System.out.println("Products by category:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
