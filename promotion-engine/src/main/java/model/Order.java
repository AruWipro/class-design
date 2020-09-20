package model;

import rules.IPrice;

import java.util.ArrayList;
import java.util.List;

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

    public List<Product> addProduct(Product p){
        if(getProducts() == null){
            this.products = new ArrayList<Product>();
        }
        if(p!= null){
            this.products.add(p);
        }
        return this.products;
    }

    public double getPrice() {
        return 0;
    }
}
