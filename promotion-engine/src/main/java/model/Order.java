package model;

import rules.IPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Order Class.This class helps to
 *  claculate the total o orders and
 *  you can also add products to this
 *  Class
 */
public class Order implements IPrice {
    List<Product> products;

    private List<Product> getProducts() {
        return products;
    }

    public Order addProduct(Product p){
        if(getProducts() == null){
            this.products = new ArrayList<Product>();
        }
        if(p!= null){
            this.products.add(p);
        }
        return this;
    }

    public double getPrice() {
       Double totalPrice = products.stream().map(product -> product.getPrice()).collect(Collectors.summingDouble(Double::doubleValue));
       System.out.println("Total Price is"+totalPrice);
       return totalPrice;
    }
}
