package com.hwk.strategy.discount;

public class SeniorDiscount implements IDiscount {
    @Override
    public float calculateDiscount(float fullPrice) {
        return fullPrice * 0.22f;
    }
}
