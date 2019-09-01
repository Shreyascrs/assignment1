package com.thoughtworks.com.bootcamp;

public class Bill {
    double totalAmount;
    Friend paidBy;
    String description;


    public Bill(double totalAmount, Friend friend,String description) {
        this.totalAmount = totalAmount;
        this.paidBy = friend;
        this.description=description;
    }

    public double settelment() {

        paidBy.setpaid(totalAmount);
        return totalAmount;
    }
}
