package model;

import controller.CouponFactory;
import controller.PromoEngineCalculator;
import lombok.Getter;
import lombok.Setter;
import rules.IPrice;

/**
 * Product Class with all the attributes
 */

@Setter
@Getter
public class Product implements IPrice {

    private PromoEngineCalculator calculator;

    private String productId;
    private String skuId;
    private int quantity;
    private ProductType type;
    private double price;

    public Product(ProductType type){
        this.price = assignPrice(type);
        this.type = type;
    }

    public Product(ProductType type,int quantity){
        this.price = assignPrice(type);
        this.quantity = quantity;
        this.type = type;
    }


    public double getPrice() {
        Copuon c = new CouponFactory().getCoupon(type.name());
        return new PromoEngineCalculator(price,c.getBundlePrice(),c.getBundleQuantity(),quantity).getPrice();
    }


}
