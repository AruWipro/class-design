package controller;

import rules.IPrice;

/**
 *
 */
public class PromoEngineCalculator implements IPrice {
    private int productCount;
    public PromoEngineCalculator(double productPrice,double bundlePrice, int bundleSize){

    }
    public double getPrice() {
        return 0;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
