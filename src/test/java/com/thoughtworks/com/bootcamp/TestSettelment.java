package com.thoughtworks.com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSettelment {

    @Test
    void ShouldAddBillWithZeroTotalAmount_WhenSettelmentcalled_thenRetuernZero()
    {
        Bill bill=new Bill(0.0f);
        Assertions.assertEquals(0.0f,bill.settelment());
    }
}
