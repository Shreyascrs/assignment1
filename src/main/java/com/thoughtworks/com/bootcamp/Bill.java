package com.thoughtworks.com.bootcamp;

public class Bill {
    double totalAmount;
    Friend paidBy;


    public Bill(double totalAmount, Friend friend) {
        this.totalAmount = totalAmount;
        this.paidBy = friend;
    }

    public double settelment() {

        paidBy.setpaid(totalAmount);
        return totalAmount;
    }
}
