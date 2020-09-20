package model;

import lombok.*;

import java.util.Date;
@Getter
@Setter

public class Copuon {
    public Copuon(int quantity,double price){
        this.bundlePrice = price;
        this.bundleQuantity = quantity;
    }
    private Date createdOn;
    private Date expiresOn;
    private int bundleQuantity;
    private double bundlePrice;
 }

