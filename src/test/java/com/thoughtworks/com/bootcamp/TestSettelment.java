package com.thoughtworks.com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSettelment {

    @Test
    void ShouldAddBillWithZeroTotalAmount_WhenSettelmentcalled_thenRetuernZero()
    {
        Bill bill=new Bill(0.0);
        assertEquals(0.0,bill.settelment());
    }
    void ShouldAddBillWithNonZeroTotalAmount_WhenSettelmentCalled_ThenReturnNonZero()
    {
        Bill bill=new Bill(1.0);
        assertEquals(1.0,bill.settelment());
    }
}
