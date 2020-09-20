package model;

import controller.PromoEngineCalculator;
import rules.IPrice;

/**
 * Product Class with all the attributes
 */
public class Product implements IPrice {

    private String productId;
    private String skuId;
    private int quantity;
    private ProductType type;
    private double price;
    public Product(ProductType type){
        switch (type){
            case A:
                this.price = 50;
                break;
            case B:
                this.price = 30;
                break;
            case C:
                this.price = 20;
                break;
            case D:
                this.price = 15;
                break;
        }
    }
    public double getPrice() {
        return new PromoEngineCalculator(price,150,3).getPrice();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
