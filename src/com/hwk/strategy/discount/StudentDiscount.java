package com.hwk.strategy.discount;

public class StudentDiscount implements IDiscount {
    @Override
    public float calculateDiscount(float fullPrice) {
        return fullPrice * 0.15f;
    }
}
