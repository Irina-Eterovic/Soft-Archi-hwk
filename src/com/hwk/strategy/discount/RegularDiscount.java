package com.hwk.strategy.discount;

public class RegularDiscount implements IDiscount {
    @Override
    public float calculateDiscount(float fullPrice) {
        return 0;
    }
}
