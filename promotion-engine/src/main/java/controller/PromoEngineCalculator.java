package controller;

import rules.IPrice;

/**
 *
 */
public class PromoEngineCalculator implements IPrice {
    private int productCount;
    private int bundleSize;
    private double productPrice;
    private double bundlePrice;

    public PromoEngineCalculator(double productPrice,double bundlePrice, int bundleSize,int productCount){
        this.productPrice = productPrice;
        this.bundlePrice = bundlePrice;
        this.bundleSize = bundleSize;
        this.productCount = productCount;
    }
    public double getPrice() {
        System.out.printf(this.toString());
        return bundlePrice * (productCount/bundleSize) + productPrice*(productCount % bundleSize);
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "PromoEngineCalculator{" +
                "productCount=" + productCount +
                ", bundleSize=" + bundleSize +
                ", productPrice=" + productPrice +
                ", bundlePrice=" + bundlePrice +
                '}';
    }
}
