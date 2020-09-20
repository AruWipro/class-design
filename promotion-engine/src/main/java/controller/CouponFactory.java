package controller;

import model.Copuon;


public class CouponFactory {

    private Copuon coupon;

    public Copuon getCoupon(String promoCode){
        switch (promoCode){
            case "A":
                coupon = new Copuon(3,130);
                break;
            case "B":
                coupon = new Copuon(2,45);
                break;
        }
        return coupon;
    }


}


