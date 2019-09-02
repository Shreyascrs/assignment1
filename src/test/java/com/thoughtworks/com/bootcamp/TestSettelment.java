package com.thoughtworks.com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSettelment {

    @Test
    void ShouldAddBillWithZeroTotalAmount_WhenSettelmentcalled_thenRetuernZero() {
        List<Friend> friendsList=new ArrayList<>();
        Friend friend = new Friend("ram");
        Bill bill = new Bill(0.0, friend, "Auto", friendsList);
        assertEquals(0.0, bill.settelment());
    }

    @Test
    void ShouldAddBillWithNonZeroTotalAmount_WhenSettelmentCalled_ThenReturnNonZero() {
        List<Friend> friendsList=new ArrayList<>();
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto", friendsList);
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddPaidByFriendToaBillAndTotalAmount_WhenSettelmentcalled_thenReturnTotalAmount() {
        List<Friend> friendsList=new ArrayList<>();
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto", friendsList);
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddTotalPaidInFriendClass_WhenSettelmentCalled_ThenReturnTotalAmount() {
        List<Friend> friendsList=new ArrayList<>();
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto", friendsList);
        assertEquals(1.0, bill.settelment());
    }

    @Test
    void ShouldAddDescriptionToBill_whenSettelment_ThenReturnTotalAmount() {
        List<Friend> friendsList=new ArrayList<>();
        Friend friend = new Friend("ram");
        Bill bill = new Bill(1.0, friend, "Auto", friendsList);
    }

    @Test
    void ShouldAddListWithNoFriend_WhenSettelment_ThenReturnTotalAmount() {
        List<Friend> friendsList=new ArrayList<>();
        Friend ram=new Friend("ram");
        Friend lakshman=new Friend("lakshman");
        friendsList.add(ram);
        friendsList.add(lakshman);
        Bill bill=new Bill(1.0,ram,"Hotel",friendsList);

    }
}
