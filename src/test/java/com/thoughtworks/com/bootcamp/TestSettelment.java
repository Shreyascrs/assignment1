package com.thoughtworks.com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSettelment {

    @Test
    void ShouldAddBillWithZeroTotalAmount_WhenSettelmentcalled_thenRetuernZero() {
        Friend friend = new Friend("ram");
        Bill bill = new Bill(0.0, friend, "Auto");
        assertEquals(0.0, bill.settelment());
    }

    @Test
    void ShouldAddBillWithNonZeroTotalAmount_WhenSettelmentCalled_ThenReturnNonZero() {
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto");
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddPaidByFriendToaBillAndTotalAmount_WhenSettelmentcalled_thenReturnTotalAmount() {
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto");
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddTotalPaidInFriendClass_WhenSettelmentCalled_ThenReturnTotalAmount() {
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto");
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddDescriptionToBill_whenSettelment_ThenReturnTotalAmount() {
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto");
    }
}
