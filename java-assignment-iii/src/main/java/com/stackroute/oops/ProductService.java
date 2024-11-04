package com.stackroute.oops;

import java.util.ArrayList;
import java.util.List;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

    private Product[] products;
    public ProductService(){
        this.products = ProductRepository.getProducts();
    }
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        for(Product p: products){
            if(p.getProductCode()==productCode){
                return p.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        Product maxPriceProduct=null;
        for(Product p: products){
            if (p.getCategory().equalsIgnoreCase(category)) {
                if (maxPriceProduct == null || p.getPrice() > maxPriceProduct.getPrice()){
                    maxPriceProduct=p;
                }
            }
        }
        return maxPriceProduct;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        List<Product> productList = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                productList.add(p);
            }
        }
        return productList.toArray(new Product[0]);
    }
}
