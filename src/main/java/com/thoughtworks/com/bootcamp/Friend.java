package com.thoughtworks.com.bootcamp;

public class Friend {
    String name;
    double paid;

    public Friend(String name) {
        this.name = name;
    }
    void setpaid(double amount)
    {
        this.paid+=amount;
    }
}
