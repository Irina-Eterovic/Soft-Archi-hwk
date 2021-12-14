package com.hwk.strategy.discount;

import com.hwk.strategy.sales.IOrder;

public interface IContext {
    void setPaymentStrategy(IDiscount discountStrategy);
    float pay(IOrder order);
}
