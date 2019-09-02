package com.thoughtworks.com.bootcamp;

import java.util.List;

public class Bill {
    double totalAmount;
    Friend paidBy;
    String description;

    List<Friend> friendsList;

    public Bill(double totalAmount, Friend friend, String description, List<Friend> friendsList) {
        this.totalAmount = totalAmount;
        this.paidBy = friend;
        this.description = description;
        this.friendsList=friendsList;
    }

    public double settelment() {

        paidBy.setpaid(totalAmount);
        return totalAmount;
    }
}
