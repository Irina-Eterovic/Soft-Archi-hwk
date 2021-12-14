package com.hwk.strategy.discount;

import com.hwk.strategy.sales.IOrder;

public class Context implements IContext {
    private IDiscount strategy;
    @Override
    public void setDiscountStrategy(IDiscount discountStrategy) {
        this.strategy =  discountStrategy;
    }

    @Override
    public float calculateDiscount(IOrder order) {
        return strategy.calculateDiscount(order.calculateTotal());
    }
}
