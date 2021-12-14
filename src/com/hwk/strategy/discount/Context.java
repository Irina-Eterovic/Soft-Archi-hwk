package com.hwk.strategy.discount;

import com.hwk.strategy.sales.IOrder;

public class Context implements IContext {
    private IDiscount strategy;
    @Override
    public void setPaymentStrategy(IDiscount discountStrategy) {
        this.strategy =  discountStrategy;
    }

    @Override
    public float pay(IOrder order) {
        return strategy.calculateDiscount(order.calculateTotal());
    }
}
