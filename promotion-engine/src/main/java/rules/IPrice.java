package rules;

import model.ProductType;

public interface IPrice {
    double getPrice();

    default double assignPrice(ProductType type) {
        double price = 0;
        switch (type){
            case A:
                price = 50;
                break;
            case B:
                price = 30;
                break;
            case C:
                price = 20;
                break;
            case D:
                price = 15;
                break;
        }
        return price;
    }
}
